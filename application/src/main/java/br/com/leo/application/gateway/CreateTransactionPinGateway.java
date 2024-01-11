package br.com.leo.application.gateway;

import br.com.leo.core.domain.TransactionPin;

public interface CreateTransactionPinGateway {

    void create(TransactionPin transactionPin);

}
