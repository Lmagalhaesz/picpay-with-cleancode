package br.com.leo.usecase;

import br.com.leo.core.domain.TaxNumber;

public interface TaxNumberAvailableUseCase {

    Boolean taxNumberAvailable(String taxNumber);

}

