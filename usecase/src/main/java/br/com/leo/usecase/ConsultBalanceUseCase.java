package br.com.leo.usecase;

import br.com.leo.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsultBalanceUseCase {

    BigDecimal consultBalance(Wallet wallet);

}
