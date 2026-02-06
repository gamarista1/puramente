package com.amazon.device.simplesignin.model.response;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;

public class ShowLoginSelectionResponse {
    private String linkId;
    private RequestId requestId;
    private RequestStatus requestStatus;
    private UserSelection userSelection;

    public enum UserSelection {
        ManualSignIn,
        LoginSelected
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof ShowLoginSelectionResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShowLoginSelectionResponse)) {
            return false;
        }
        ShowLoginSelectionResponse showLoginSelectionResponse = (ShowLoginSelectionResponse) obj;
        if (!showLoginSelectionResponse.canEqual(this)) {
            return false;
        }
        RequestId requestId2 = getRequestId();
        RequestId requestId3 = showLoginSelectionResponse.getRequestId();
        if (requestId2 != null ? !requestId2.equals(requestId3) : requestId3 != null) {
            return false;
        }
        RequestStatus requestStatus2 = getRequestStatus();
        RequestStatus requestStatus3 = showLoginSelectionResponse.getRequestStatus();
        if (requestStatus2 != null ? !requestStatus2.equals(requestStatus3) : requestStatus3 != null) {
            return false;
        }
        UserSelection userSelection2 = getUserSelection();
        UserSelection userSelection3 = showLoginSelectionResponse.getUserSelection();
        if (userSelection2 != null ? !userSelection2.equals(userSelection3) : userSelection3 != null) {
            return false;
        }
        String linkId2 = getLinkId();
        String linkId3 = showLoginSelectionResponse.getLinkId();
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

    public UserSelection getUserSelection() {
        return this.userSelection;
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
        UserSelection userSelection2 = getUserSelection();
        int i16 = i15 * 59;
        if (userSelection2 == null) {
            i12 = 43;
        } else {
            i12 = userSelection2.hashCode();
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

    public void setUserSelection(UserSelection userSelection2) {
        this.userSelection = userSelection2;
    }
}
