package br.com.leo.application.usecaseimpl;

import br.com.leo.application.gateway.EmailAvailableGateway;
import br.com.leo.usecase.EmailAvailableUseCase;

public class EmailAvailableUseCaseImpl implements EmailAvailableUseCase {

    private final EmailAvailableGateway emailAvailableGateway;

    public EmailAvailableUseCaseImpl(EmailAvailableGateway emailAvailableGateway) {
        this.emailAvailableGateway = emailAvailableGateway;
    }

    @Override
    public boolean emailAvailable(String email) {
        return emailAvailableGateway.emailAvailable(email);
    }

}
