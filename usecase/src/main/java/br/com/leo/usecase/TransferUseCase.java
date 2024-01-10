package br.com.leo.usecase;

import br.com.leo.core.domain.Transaction;

public interface TransferUseCase {

    Boolean transfer(Transaction transaction);

}
