package br.com.leo.core.exceptions.enums;

public enum ErrorCodeEnum {

    ON0001("Tax Number invalid!", "ON-0001"),

    TR0001("Transfer error!", "TR-0001"),

    BL0001("Balance error!", "BL-0001"),

    PN0001("Pin is not valid!", "PN-0001"),

    EM0001("Email is not valid!", "EM-0001"),

    TX0001("Tax Number is not valid!", "TX-0001")

    ;

    private String msg;
    private String code;

    ErrorCodeEnum(String msg, String code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
