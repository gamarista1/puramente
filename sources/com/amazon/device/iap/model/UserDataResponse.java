package com.amazon.device.iap.model;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import org.json.JSONObject;

public final class UserDataResponse {
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")";
    private static final String USER_DATA = "USER_DATA";
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public UserDataResponse(UserDataResponseBuilder userDataResponseBuilder) {
        f.a((Object) userDataResponseBuilder.getRequestId(), b.f37444B);
        f.a((Object) userDataResponseBuilder.getRequestStatus(), b.f37445C);
        this.requestId = userDataResponseBuilder.getRequestId();
        this.requestStatus = userDataResponseBuilder.getRequestStatus();
        this.userData = userDataResponseBuilder.getUserData();
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public UserData getUserData() {
        return this.userData;
    }

    public JSONObject toJSON() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(REQUEST_ID, this.requestId);
        jSONObject.put(REQUEST_STATUS, this.requestStatus);
        UserData userData2 = this.userData;
        if (userData2 != null) {
            obj = userData2.toJSON();
        } else {
            obj = "";
        }
        jSONObject.put(USER_DATA, obj);
        return jSONObject;
    }

    public String toString() {
        String str;
        String obj = super.toString();
        RequestId requestId2 = this.requestId;
        RequestStatus requestStatus2 = this.requestStatus;
        String str2 = "null";
        if (requestStatus2 != null) {
            str = requestStatus2.toString();
        } else {
            str = str2;
        }
        UserData userData2 = this.userData;
        if (userData2 != null) {
            str2 = userData2.toString();
        }
        return String.format(TO_STRING_FORMAT, new Object[]{obj, requestId2, str, str2});
    }
}
