package br.com.leo.core.domain;

import br.com.leo.core.exceptions.TransactionPinException;
import br.com.leo.core.exceptions.enums.ErrorCodeEnum;

import java.time.LocalDateTime;

public class TransactionPin {

    private Long id;
    private User user;
    private String pin;
    private int attempt;
    private Boolean blocked;
    private LocalDateTime criatedAt;
    private LocalDateTime updateAt;

    public TransactionPin(Long id, User user, String pin, int attempt, Boolean blocked, LocalDateTime criatedAt, LocalDateTime updateAt) {
        this.id = id;
        this.user = user;
        this.pin = pin;
        this.attempt = attempt;
        this.blocked = blocked;
        this.criatedAt = criatedAt;
        this.updateAt = updateAt;
    }

    public TransactionPin(User user, String pin) throws TransactionPinException {
        this.user = user;
        setPin(pin);
        this.attempt = 3;
        this.blocked = false;
        this.updateAt = LocalDateTime.now();
    }

    public TransactionPin() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) throws TransactionPinException {
        pinIsValid(pin);
        this.pin = pin;
    }

    public void pinIsValid(String pin) throws TransactionPinException {
        if(pin.length() > 8){
            throw new TransactionPinException(ErrorCodeEnum.PN0001.getMsg(), ErrorCodeEnum.PN0001.getCode());
        }
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public LocalDateTime getCriatedAt() {
        return criatedAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
