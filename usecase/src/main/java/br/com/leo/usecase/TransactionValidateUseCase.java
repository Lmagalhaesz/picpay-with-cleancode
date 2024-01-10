package br.com.leo.usecase;

import br.com.leo.core.domain.Transaction;

public interface TransactionValidateUseCase {

    Boolean validate(Transaction transaction);

}
