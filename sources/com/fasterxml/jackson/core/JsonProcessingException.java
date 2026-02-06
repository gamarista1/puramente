package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
    static final long serialVersionUID = 123;
    protected JsonLocation _location;

    protected JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th2) {
        super(str);
        if (th2 != null) {
            initCause(th2);
        }
        this._location = jsonLocation;
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (messageSuffix != null) {
            sb2.append(messageSuffix);
        }
        if (location != null) {
            sb2.append(10);
            sb2.append(" at ");
            sb2.append(location.toString());
        }
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public String getMessageSuffix() {
        return null;
    }

    public String getOriginalMessage() {
        return super.getMessage();
    }

    public Object getProcessor() {
        return null;
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected JsonProcessingException(String str) {
        super(str);
    }

    protected JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, (Throwable) null);
    }

    protected JsonProcessingException(String str, Throwable th2) {
        this(str, (JsonLocation) null, th2);
    }

    protected JsonProcessingException(Throwable th2) {
        this((String) null, (JsonLocation) null, th2);
    }
}
