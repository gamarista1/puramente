package com.amazon.device.drm.a.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.LicensingService;
import com.amazon.device.drm.a.c.a;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.a.e.b;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements com.amazon.device.drm.a.c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f37809a = "c";

    /* renamed from: b  reason: collision with root package name */
    private static final String f37810b = "com.amazon.sdktestclient";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37811c = "com.amazon.sdktestclient.command.CommandBroker";

    public void a(RequestId requestId) {
        b.a(f37809a, "sendGetLicenseRequest");
        try {
            Context c10 = d.d().c();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f37444B, requestId);
            jSONObject.put("packageName", c10.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f37451I, LicensingService.SDK_VERSION);
            bundle.putString("getLicenseInput", jSONObject.toString());
            Intent a10 = a("com.amazon.testclient.drm.getLicense");
            a10.addFlags(268435456);
            a10.putExtras(bundle);
            c10.startService(a10);
        } catch (JSONException unused) {
            b.b(f37809a, "Error in sendGetUserDataRequest.");
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f37810b, f37811c));
        return intent;
    }

    public void a(Context context, Intent intent) {
        b.a(f37809a, "handleResponse");
        intent.setComponent(new ComponentName(f37810b, f37811c));
        try {
            if (intent.getExtras().getString("responseType").equalsIgnoreCase("com.amazon.testclient.drm.getLicense")) {
                a((Object) a(intent));
            }
        } catch (Exception e10) {
            Log.e(f37809a, "Error handling response.", e10);
        }
    }

    private LicenseResponse a(Intent intent) {
        RequestId requestId;
        LicenseResponse.RequestStatus requestStatus = LicenseResponse.RequestStatus.UNKNOWN_ERROR;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getLicenseOutput"));
            requestStatus = LicenseResponse.RequestStatus.valueOf(jSONObject.optString("status"));
            requestId = RequestId.fromString(jSONObject.optString(com.amazon.a.a.o.b.f37444B));
        } catch (Exception e10) {
            Log.e(f37809a, "Error parsing getLicense response", e10);
            requestId = null;
        }
        return new a().a(requestId).a(requestStatus).a();
    }

    /* access modifiers changed from: protected */
    public void a(final Object obj) {
        f.a(obj, "response");
        Context c10 = d.d().c();
        final LicensingListener b10 = d.d().b();
        if (c10 == null || b10 == null) {
            String str = f37809a;
            b.a(str, "LicensingListener is not set. Dropping response: " + obj);
            return;
        }
        new Handler(c10.getMainLooper()).post(new Runnable() {
            public void run() {
                try {
                    Object obj = obj;
                    if (obj instanceof LicenseResponse) {
                        b10.onLicenseCommandResponse((LicenseResponse) obj);
                        return;
                    }
                    String a10 = c.f37809a;
                    b.b(a10, "Unknown response type:" + obj.getClass().getName());
                } catch (Exception e10) {
                    String a11 = c.f37809a;
                    b.b(a11, "Error in sendResponse: " + e10);
                }
            }
        });
    }
}
