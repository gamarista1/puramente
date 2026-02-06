package com.amazon.device.iap.internal.a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.internal.a.c.a;
import com.amazon.device.iap.internal.e;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Set;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37844a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static final String f37845b = "response_type";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37846c = "requestId";

    /* renamed from: d  reason: collision with root package name */
    private static final String f37847d = "purchase_response";

    public void a(RequestId requestId, UserDataRequest userDataRequest) {
        b.a(f37844a, "sendGetUserData");
        new a(requestId, userDataRequest).e();
    }

    public void a(RequestId requestId, String str) {
        b.a(f37844a, "sendPurchaseRequest");
        new com.amazon.device.iap.internal.a.e.d(requestId, str).e();
    }

    public void a(RequestId requestId, Set<String> set) {
        b.a(f37844a, "sendGetProductDataRequest");
        new com.amazon.device.iap.internal.a.a.d(requestId, set).e();
    }

    public void a(RequestId requestId, boolean z10) {
        b.a(f37844a, "sendGetPurchaseUpdates");
        new com.amazon.device.iap.internal.a.b.a(requestId, z10).e();
    }

    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        b.a(f37844a, "sendNotifyFulfillment");
        new com.amazon.device.iap.internal.a.d.a(requestId, str, fulfillmentResult).e();
    }

    public void a(Context context, Intent intent) {
        String str = f37844a;
        b.a(str, "handleResponse");
        String stringExtra = intent.getStringExtra(f37845b);
        if (stringExtra == null) {
            b.a(str, "Invalid response type: null");
            return;
        }
        b.a(str, "Found response type: " + stringExtra);
        if (f37847d.equals(stringExtra)) {
            new com.amazon.device.iap.internal.a.f.d(RequestId.fromString(intent.getStringExtra("requestId"))).e();
        }
    }
}
