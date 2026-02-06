package com.amazon.device.iap.model;

import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class PurchaseUpdatesResponse {
    private static final String HAS_MORE = "HAS_MORE";
    private static final String RECEIPTS = "RECEIPTS";
    private static final String REQUEST_ID = "REQUEST_ID";
    private static final String REQUEST_STATUS = "REQUEST_STATUS";
    private static final String TO_STRING_FORMAT = "(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")";
    private static final String USER_DATA = "USER_DATA";
    private final boolean hasMore;
    private final List<Receipt> receipts;
    private final RequestId requestId;
    private final RequestStatus requestStatus;
    private final UserData userData;

    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED
    }

    public PurchaseUpdatesResponse(PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder) {
        List<Receipt> list;
        f.a((Object) purchaseUpdatesResponseBuilder.getRequestId(), b.f37444B);
        f.a((Object) purchaseUpdatesResponseBuilder.getRequestStatus(), b.f37445C);
        if (RequestStatus.SUCCESSFUL == purchaseUpdatesResponseBuilder.getRequestStatus()) {
            f.a((Object) purchaseUpdatesResponseBuilder.getUserData(), "userData");
            f.a((Object) purchaseUpdatesResponseBuilder.getReceipts(), b.f37449G);
        }
        this.requestId = purchaseUpdatesResponseBuilder.getRequestId();
        this.requestStatus = purchaseUpdatesResponseBuilder.getRequestStatus();
        this.userData = purchaseUpdatesResponseBuilder.getUserData();
        if (purchaseUpdatesResponseBuilder.getReceipts() == null) {
            list = new ArrayList<>();
        } else {
            list = purchaseUpdatesResponseBuilder.getReceipts();
        }
        this.receipts = list;
        this.hasMore = purchaseUpdatesResponseBuilder.hasMore();
    }

    public List<Receipt> getReceipts() {
        return this.receipts;
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

    public boolean hasMore() {
        return this.hasMore;
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
        JSONArray jSONArray = new JSONArray();
        List<Receipt> list = this.receipts;
        if (list != null) {
            for (Receipt json : list) {
                jSONArray.put(json.toJSON());
            }
        }
        jSONObject.put(RECEIPTS, jSONArray);
        jSONObject.put(HAS_MORE, this.hasMore);
        return jSONObject;
    }

    public String toString() {
        String str;
        String obj = super.toString();
        RequestId requestId2 = this.requestId;
        RequestStatus requestStatus2 = this.requestStatus;
        UserData userData2 = this.userData;
        List<Receipt> list = this.receipts;
        if (list != null) {
            str = Arrays.toString(list.toArray());
        } else {
            str = "null";
        }
        return String.format(TO_STRING_FORMAT, new Object[]{obj, requestId2, requestStatus2, userData2, str, Boolean.valueOf(this.hasMore)});
    }
}
