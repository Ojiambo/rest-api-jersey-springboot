package com.example.exception;

public class ApiException extends Exception {
    protected String rootMessage;

    public ApiException(){

    }

    public ApiException(String message){
        this.rootMessage = message;
    }

    @Override
    public String getMessage() {
        return "ApiError-" + this.rootMessage;
    }
}
