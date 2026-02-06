package com.amazon.device.simplesignin.model.request;

import com.amazon.device.simplesignin.model.FailureReason;
import com.amazon.device.simplesignin.model.SSIEvent;

public class SSIEventRequest {
    private String epochTimestamp = String.valueOf(System.currentTimeMillis());
    private SSIEvent event;
    private FailureReason failureReason;

    public SSIEventRequest(SSIEvent sSIEvent, FailureReason failureReason2) {
        this.event = sSIEvent;
        this.failureReason = failureReason2;
    }

    public String getEpochTimestamp() {
        return this.epochTimestamp;
    }

    public SSIEvent getEvent() {
        return this.event;
    }

    public FailureReason getFailureReason() {
        return this.failureReason;
    }

    public SSIEventRequest(SSIEvent sSIEvent) {
        this.event = sSIEvent;
        this.failureReason = null;
    }
}
