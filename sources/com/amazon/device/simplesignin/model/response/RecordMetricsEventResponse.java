package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;

public class RecordMetricsEventResponse {
    private RequestId requestId;
    private RequestStatus requestStatus;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof RecordMetricsEventResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordMetricsEventResponse)) {
            return false;
        }
        RecordMetricsEventResponse recordMetricsEventResponse = (RecordMetricsEventResponse) obj;
        if (!recordMetricsEventResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId2 = getRequestId();
        RequestId requestId3 = recordMetricsEventResponse.getRequestId();
        if (requestId2 != null ? !requestId2.equals(requestId3) : requestId3 != null) {
            return false;
        }
        RequestStatus requestStatus2 = getRequestStatus();
        RequestStatus requestStatus3 = recordMetricsEventResponse.getRequestStatus();
        if (requestStatus2 != null ? requestStatus2.equals(requestStatus3) : requestStatus3 == null) {
            return true;
        }
        return false;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public int hashCode() {
        int i10;
        RequestId requestId2 = getRequestId();
        int i11 = 43;
        if (requestId2 == null) {
            i10 = 43;
        } else {
            i10 = requestId2.hashCode();
        }
        RequestStatus requestStatus2 = getRequestStatus();
        int i12 = (i10 + 59) * 59;
        if (requestStatus2 != null) {
            i11 = requestStatus2.hashCode();
        }
        return i12 + i11;
    }

    public void setRequestId(RequestId requestId2) {
        this.requestId = requestId2;
    }

    public void setRequestStatus(RequestStatus requestStatus2) {
        this.requestStatus = requestStatus2;
    }
}
