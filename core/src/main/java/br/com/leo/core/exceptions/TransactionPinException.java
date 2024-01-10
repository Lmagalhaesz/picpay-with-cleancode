package br.com.leo.core.exceptions;

public class TransactionPinException extends Exception {

    private String code;

    public TransactionPinException(String msg, String code) {
        super(msg);
        this.code = code;
    }
}
