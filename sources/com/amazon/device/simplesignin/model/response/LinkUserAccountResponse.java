package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;

public class LinkUserAccountResponse {
    private String linkId;
    private RequestId requestId;
    private RequestStatus requestStatus;
    private SuccessCode successCode;

    public enum SuccessCode {
        LinkAlreadyExists,
        LinkEstablished,
        ConsentDenied
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof LinkUserAccountResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkUserAccountResponse)) {
            return false;
        }
        LinkUserAccountResponse linkUserAccountResponse = (LinkUserAccountResponse) obj;
        if (!linkUserAccountResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId2 = getRequestId();
        RequestId requestId3 = linkUserAccountResponse.getRequestId();
        if (requestId2 != null ? !requestId2.equals(requestId3) : requestId3 != null) {
            return false;
        }
        RequestStatus requestStatus2 = getRequestStatus();
        RequestStatus requestStatus3 = linkUserAccountResponse.getRequestStatus();
        if (requestStatus2 != null ? !requestStatus2.equals(requestStatus3) : requestStatus3 != null) {
            return false;
        }
        SuccessCode successCode2 = getSuccessCode();
        SuccessCode successCode3 = linkUserAccountResponse.getSuccessCode();
        if (successCode2 != null ? !successCode2.equals(successCode3) : successCode3 != null) {
            return false;
        }
        String linkId2 = getLinkId();
        String linkId3 = linkUserAccountResponse.getLinkId();
        if (linkId2 != null ? linkId2.equals(linkId3) : linkId3 == null) {
            return true;
        }
        return false;
    }

    public String getLinkId() {
        return this.linkId;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public SuccessCode getSuccessCode() {
        return this.successCode;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        RequestId requestId2 = getRequestId();
        int i13 = 43;
        if (requestId2 == null) {
            i10 = 43;
        } else {
            i10 = requestId2.hashCode();
        }
        RequestStatus requestStatus2 = getRequestStatus();
        int i14 = (i10 + 59) * 59;
        if (requestStatus2 == null) {
            i11 = 43;
        } else {
            i11 = requestStatus2.hashCode();
        }
        int i15 = i14 + i11;
        SuccessCode successCode2 = getSuccessCode();
        int i16 = i15 * 59;
        if (successCode2 == null) {
            i12 = 43;
        } else {
            i12 = successCode2.hashCode();
        }
        int i17 = i16 + i12;
        String linkId2 = getLinkId();
        int i18 = i17 * 59;
        if (linkId2 != null) {
            i13 = linkId2.hashCode();
        }
        return i18 + i13;
    }

    public void setLinkId(String str) {
        this.linkId = str;
    }

    public void setRequestId(RequestId requestId2) {
        this.requestId = requestId2;
    }

    public void setRequestStatus(RequestStatus requestStatus2) {
        this.requestStatus = requestStatus2;
    }

    public void setSuccessCode(SuccessCode successCode2) {
        this.successCode = successCode2;
    }
}
