package org.sid.commonapi.exceptions;

public class NegativeInitialBalanceException extends RuntimeException {
    public NegativeInitialBalanceException(String message) {
        super(message);
    }
}
