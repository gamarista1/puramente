package com.amazon.device.drm.a.b;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.a.e.b;
import com.amazon.device.drm.model.RequestId;

public class c implements com.amazon.device.drm.a.c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37792a = "c";

    public void a(Context context, Intent intent) {
    }

    public void a(RequestId requestId) {
        b.a(f37792a, "sendGetLicense");
        new com.amazon.device.drm.a.a.b(requestId).e();
    }
}
