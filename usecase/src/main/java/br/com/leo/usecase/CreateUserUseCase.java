package br.com.leo.usecase;

import br.com.leo.core.domain.User;
import br.com.leo.core.exceptions.EmailException;
import br.com.leo.core.exceptions.TaxNumberException;
import br.com.leo.core.exceptions.TransactionPinException;

public interface CreateUserUseCase {

    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException;

}
