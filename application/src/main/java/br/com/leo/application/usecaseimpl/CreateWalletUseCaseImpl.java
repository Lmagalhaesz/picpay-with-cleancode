package br.com.leo.application.usecaseimpl;

import br.com.leo.application.gateway.CreateWalletGateway;
import br.com.leo.core.domain.Wallet;
import br.com.leo.usecase.CreateWalletUseCase;

public class CreateWalletUseCaseImpl implements CreateWalletUseCase {

    private final CreateWalletGateway createWalletGateway;

    public CreateWalletUseCaseImpl(CreateWalletGateway createWalletGateway) {
        this.createWalletGateway = createWalletGateway;
    }

    @Override
    public void create(Wallet wallet) {
        createWalletGateway.create(wallet);
    }
}
