package com.flexops.common.exception;

public class FoundationServiceException extends RuntimeException {

    private static final long serialVersionUID = 6624202550151492022L;

    private FoundationServiceErrorCode errorCode = null;

    public FoundationServiceException(String message, FoundationServiceErrorCode errorCode) {
        super("ErrorCode[" + errorCode.getCode() + "]: " + message);
        this.errorCode = errorCode;
    }

    public FoundationServiceException(FoundationServiceErrorCode errorCode, Object... fields) {
        super("ErrorCode[" + errorCode.getCode() + "]: "
            + String.format(errorCode.getContent(), fields));
    }

    public FoundationServiceErrorCode getErrorCode() {
        return errorCode;
    }

}
