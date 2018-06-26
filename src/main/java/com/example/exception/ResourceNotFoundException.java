package com.example.exception;

public class ResourceNotFoundException extends Exception {
    protected String rootMessage;

    public ResourceNotFoundException(){

    }

    public ResourceNotFoundException(String message){
        this.rootMessage = message;
    }

    @Override
    public String getMessage() {
        return "Resource Not Found: " + this.rootMessage;
    }
}
