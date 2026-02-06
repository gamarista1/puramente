package com.amazon.device.simplesignin.model;

public enum FailureReason {
    UNAUTHORIZED("The user isn’t authorized to do log in."),
    BAD_REQUEST("The request is corrupted."),
    NOT_FOUND("The login page the user is looking for cannot be found."),
    FORBIDDEN("No login opportunity is available."),
    INTERNAL_SERVER_ERROR("Something is wrong with the login.");
    
    private final String description;

    private FailureReason(String str) {
        this.description = str;
    }

    public String toString() {
        return this.description;
    }
}
