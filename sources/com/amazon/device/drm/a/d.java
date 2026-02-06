package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.a.e.b;
import com.amazon.device.drm.model.AppstoreSDKModes;
import com.amazon.device.drm.model.RequestId;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f37795a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static d f37796b = new d();

    /* renamed from: c  reason: collision with root package name */
    private c f37797c;

    /* renamed from: d  reason: collision with root package name */
    private Context f37798d;

    /* renamed from: e  reason: collision with root package name */
    private LicensingListener f37799e;

    private d() {
    }

    public static d d() {
        return f37796b;
    }

    private void f() {
        if (this.f37799e == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    private void g() {
        if (this.f37798d == null) {
            throw new IllegalStateException("You must register a ApplicationContext before invoking this operation");
        }
    }

    public void a(Context context, LicensingListener licensingListener) {
        if (licensingListener == null || context == null) {
            throw new IllegalArgumentException("LicensingManager/Context cannot be null");
        }
        String str = f37795a;
        b.a(str, "LicensingListener registered: " + licensingListener);
        String str2 = f37795a;
        b.a(str2, "LicensingListener Context: " + context);
        this.f37798d = context.getApplicationContext();
        this.f37799e = licensingListener;
        c a10 = a.a().a(this.f37798d);
        this.f37797c = a10;
        if (a10 == null) {
            b.a(f37795a, "requestHandler is null");
        }
    }

    public LicensingListener b() {
        return this.f37799e;
    }

    public Context c() {
        return this.f37798d;
    }

    public RequestId e() {
        f();
        RequestId requestId = new RequestId();
        this.f37797c.a(requestId);
        return requestId;
    }

    public String a() {
        try {
            g();
            if (a.a((Application) this.f37798d.getApplicationContext())) {
                return AppstoreSDKModes.SANDBOX.name();
            }
            return AppstoreSDKModes.PRODUCTION.name();
        } catch (IllegalStateException unused) {
            return AppstoreSDKModes.UNKNOWN.name();
        }
    }

    public void a(Context context, Intent intent) {
        try {
            this.f37797c.a(context, intent);
        } catch (Exception e10) {
            String str = f37795a;
            b.b(str, "Error in onReceive: " + e10);
        }
    }
}
