package com.flexops.common.exception;

public enum FoundationServiceErrorCode {

	UNKNOWN_EXCEPTION(10000,"Unknown Error"),
	PARSE_EXCEPTION(10401,"Type parse failed"),
	NULL_POINTER_ERROR(10402,"Null-Pointer error."),
	DATA_ACCESS_RESOURCE_FAILURE_EXCEPTION(10403,"Unable to conntect to database."),
	HTTP_MEDIA_TYPE_NOT_SUPPORTED(10406,"Content-Type not supported."),
	HTTP_MESSAGE_NOT_READABLE_EXCEPTION(10407,"Invalid Json payload request."),
	REQUEST_METHOD_NOT_SUPPORTED(10501,"Request method not supported."),
	REQUEST_CRITERIA_NOT_SUPPORTED(10502,"Request criteria not supported."),
	VALIDATION_FAILED(10503,"Validation failed. Please see below for error details."),
	JSON_ELEMENT_NOT_FOUND(10504,"Json element '%s' not found."),
	QUERY_RECORD_NOT_FOUND(10505,"Record %s not found."),
    QUERY_RECORD_ALREADY_EXIST(10506,"Record %s already exists in system."),
    QUERY_NON_UNIQUE_RESULT(10507,"Non-unique result: more than one record for given criteria."),
	JSON_REQUEST_CRITERIA_NOT_SUPPORTED(10604, "Request criteira not supported.");

    private int code;
    private String content;

    private FoundationServiceErrorCode(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "ErrorCode[" + code + "]: " + content;
    }

}
