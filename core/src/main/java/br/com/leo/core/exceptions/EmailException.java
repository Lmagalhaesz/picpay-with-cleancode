package br.com.leo.core.exceptions;

public class EmailException extends Exception{

    private String code;

    public EmailException(String msg, String code) {
        super(msg);
        this.code = code;
    }
}
