package com.amazon.device.drm.a.b;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.j.a;
import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.drm.LicensingListener;
import com.amazon.device.drm.a.d;
import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

public class b extends a {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f37787c = "b";

    /* renamed from: d  reason: collision with root package name */
    private final RequestId f37788d;

    public b(RequestId requestId) {
        this.f37788d = requestId;
    }

    /* access modifiers changed from: protected */
    public void a(h hVar) {
        this.f37259b = hVar;
    }

    public void b() {
    }

    public void c() {
    }

    public RequestId d() {
        return this.f37788d;
    }

    public void e() {
        h hVar = this.f37259b;
        if (hVar != null) {
            hVar.l();
        } else {
            b();
        }
    }

    /* access modifiers changed from: protected */
    public void a(final Object obj) {
        f.a(obj, "response");
        Context c10 = d.d().c();
        final LicensingListener b10 = d.d().b();
        if (c10 == null || b10 == null) {
            String str = f37787c;
            com.amazon.device.drm.a.e.b.a(str, "LicensingListener is not set. Dropping response: " + obj);
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
                    String f10 = b.f37787c;
                    com.amazon.device.drm.a.e.b.b(f10, "Unknown response type:" + obj.getClass().getName());
                } catch (Throwable th2) {
                    String f11 = b.f37787c;
                    com.amazon.device.drm.a.e.b.b(f11, "Error in sendResponse: " + th2);
                }
            }
        });
    }

    public com.amazon.a.a.j.b a() {
        return this.f37258a;
    }
}
