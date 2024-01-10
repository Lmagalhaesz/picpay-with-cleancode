package br.com.leo.usecase;

import br.com.leo.core.domain.Transaction;

public interface UserNotificationUseCase {

    Boolean notificate(Transaction transaction, String email);

}
