package br.com.leo.usecase;

import br.com.leo.core.domain.TaxNumber;
import br.com.leo.core.domain.User;

public interface FindUserByTaxNumberUseCase {

    User findByTaxNumber(TaxNumber taxNumber);

}

