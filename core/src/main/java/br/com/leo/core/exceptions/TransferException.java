package br.com.leo.core.exceptions;

public class TransferException extends Exception {

    private String code;

    public TransferException(String msg, String code) {
        super(msg);
        this.code = code;
    }
}
