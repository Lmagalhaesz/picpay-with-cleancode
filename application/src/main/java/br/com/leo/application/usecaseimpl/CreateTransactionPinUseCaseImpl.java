package br.com.leo.application.usecaseimpl;

import br.com.leo.application.gateway.CreateTransactionPinGateway;
import br.com.leo.core.domain.TransactionPin;
import br.com.leo.usecase.CreateTransactionPinUseCase;

public class CreateTransactionPinUseCaseImpl implements CreateTransactionPinUseCase {

    private final CreateTransactionPinGateway createTransactionPinGateway;

    public CreateTransactionPinUseCaseImpl(CreateTransactionPinGateway createTransactionPinGateway) {
        this.createTransactionPinGateway = createTransactionPinGateway;
    }

    @Override
    public void create(TransactionPin transactionPin) {

        createTransactionPinGateway.create(transactionPin);

    }
}
