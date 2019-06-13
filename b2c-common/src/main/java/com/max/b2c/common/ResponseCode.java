package com.max.b2c.common;

public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desciption;

    ResponseCode(int code, String desciption) {
        this.code = code;
        this.desciption = desciption;
    }

    public String getDesciption() {
        return desciption;
    }

    public int getCode() {
        return code;
    }
}
