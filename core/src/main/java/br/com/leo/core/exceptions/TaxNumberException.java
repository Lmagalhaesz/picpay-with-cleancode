package br.com.leo.core.exceptions;

public class TaxNumberException extends Exception{

    private String code;

    public TaxNumberException( String msg, String code) {
        super(msg);
        this.code = code;
    }
}
