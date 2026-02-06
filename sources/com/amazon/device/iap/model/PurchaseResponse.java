package com.amazon.device.iap.model;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import org.json.JSONObject;

public final class PurchaseResponse {
    private static final String RECEIPT = "receipt";
    private static final String REQUEST_ID = "requestId";
    private static final String REQUEST_STATUS = "requestStatus";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)";
    private static final String USER_DATA = "userData";
    private final Receipt receipt;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        INVALID_SKU,
        ALREADY_PURCHASED,
        PENDING,
        NOT_SUPPORTED;

        public static RequestStatus safeValueOf(String str) {
            if (f.a(str)) {
                return null;
            }
            if ("ALREADY_ENTITLED".equalsIgnoreCase(str)) {
                return ALREADY_PURCHASED;
            }
            return valueOf(str.toUpperCase());
        }
    }

    public PurchaseResponse(PurchaseResponseBuilder purchaseResponseBuilder) {
        f.a((Object) purchaseResponseBuilder.getRequestId(), "requestId");
        f.a((Object) purchaseResponseBuilder.getRequestStatus(), "requestStatus");
        if (purchaseResponseBuilder.getRequestStatus() == RequestStatus.SUCCESSFUL) {
            f.a((Object) purchaseResponseBuilder.getReceipt(), "receipt");
            f.a((Object) purchaseResponseBuilder.getUserData(), USER_DATA);
        }
        this.requestId = purchaseResponseBuilder.getRequestId();
        this.userData = purchaseResponseBuilder.getUserData();
        this.receipt = purchaseResponseBuilder.getReceipt();
        this.requestStatus = purchaseResponseBuilder.getRequestStatus();
    }

    public Receipt getReceipt() {
        return this.receipt;
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
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("requestStatus", this.requestStatus);
        UserData userData2 = this.userData;
        Object obj2 = "";
        if (userData2 != null) {
            obj = userData2.toJSON();
        } else {
            obj = obj2;
        }
        jSONObject.put(USER_DATA, obj);
        if (getReceipt() != null) {
            obj2 = getReceipt().toJSON();
        }
        jSONObject.put("receipt", obj2);
        return jSONObject;
    }

    public String toString() {
        String str;
        String obj = super.toString();
        RequestId requestId2 = this.requestId;
        RequestStatus requestStatus2 = this.requestStatus;
        if (requestStatus2 != null) {
            str = requestStatus2.toString();
        } else {
            str = "null";
        }
        return String.format(TO_STRING_FORMAT, new Object[]{obj, requestId2, str, this.userData, this.receipt});
    }
}
