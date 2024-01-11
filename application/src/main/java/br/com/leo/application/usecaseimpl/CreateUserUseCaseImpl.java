package br.com.leo.application.usecaseimpl;

import br.com.leo.application.gateway.CreateUserGateway;
import br.com.leo.core.domain.TransactionPin;
import br.com.leo.core.domain.User;
import br.com.leo.core.domain.Wallet;
import br.com.leo.core.exceptions.EmailException;
import br.com.leo.core.exceptions.TaxNumberException;
import br.com.leo.core.exceptions.TransactionPinException;
import br.com.leo.core.exceptions.enums.ErrorCodeEnum;
import br.com.leo.usecase.*;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final TaxNumberAvailableUseCase taxNumberAvailableUseCase;
    private final EmailAvailableUseCase emailAvailableUseCase;
    private final CreateUserGateway createUserGateway;
    private final CreateWalletUseCase createWalletUseCase;
    private final CreateTransactionPinUseCase createTransactionPinUseCase;

    public CreateUserUseCaseImpl(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway, CreateWalletUseCase createWalletUseCase, CreateTransactionPinUseCase createTransactionPinUseCase) {
        this.taxNumberAvailableUseCase = taxNumberAvailableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
        this.createWalletUseCase = createWalletUseCase;
        this.createTransactionPinUseCase = createTransactionPinUseCase;
    }

    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException {
        if(!taxNumberAvailableUseCase.taxNumberAvailable(user.getTaxNumber().getValue())){
            throw new TaxNumberException(ErrorCodeEnum.TX0001.getMsg(), ErrorCodeEnum.TX0001.getCode());
        }
        if(!emailAvailableUseCase.emailAvailable(user.getEmail())){
            throw new EmailException(ErrorCodeEnum.EM0001.getMsg(), ErrorCodeEnum.EM0001.getCode());
        }

        var userSaved = createUserGateway.create(user);

        createWalletUseCase.create(new Wallet(BigDecimal.ZERO, userSaved));
        createTransactionPinUseCase.create(new TransactionPin(userSaved, pin));
    }

}
