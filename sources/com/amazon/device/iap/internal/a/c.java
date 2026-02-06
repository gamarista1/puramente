package com.amazon.device.iap.internal.a;

import android.content.Context;
import android.os.Handler;
import com.amazon.a.a.j.a;
import com.amazon.a.a.n.a.h;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

public class c extends a {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final String f37834c = "c";

    /* renamed from: d  reason: collision with root package name */
    private RequestId f37835d;

    public c(RequestId requestId) {
        this.f37835d = requestId;
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
        return this.f37835d;
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
    public void a(Object obj) {
        a(obj, (h) null);
    }

    /* access modifiers changed from: protected */
    public void a(final Object obj, final h hVar) {
        f.a(obj, "response");
        Context b10 = d.f().b();
        final PurchasingListener a10 = d.f().a();
        if (b10 == null || a10 == null) {
            String str = f37834c;
            b.a(str, "PurchasingListener is not set. Dropping response: " + obj);
            return;
        }
        new Handler(b10.getMainLooper()).post(new Runnable() {
            public void run() {
                c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.FALSE);
                try {
                    Object obj = obj;
                    if (obj instanceof ProductDataResponse) {
                        a10.onProductDataResponse((ProductDataResponse) obj);
                    } else if (obj instanceof UserDataResponse) {
                        a10.onUserDataResponse((UserDataResponse) obj);
                    } else if (obj instanceof PurchaseUpdatesResponse) {
                        PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj;
                        a10.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                        Object a10 = c.this.a().a(com.amazon.a.a.o.b.ap);
                        if (a10 != null && (a10 instanceof String)) {
                            com.amazon.device.iap.internal.util.a.a(purchaseUpdatesResponse.getUserData().getUserId(), a10.toString());
                        }
                    } else if (obj instanceof PurchaseResponse) {
                        a10.onPurchaseResponse((PurchaseResponse) obj);
                    } else {
                        String f10 = c.f37834c;
                        b.b(f10, "Unknown response type:" + obj.getClass().getName());
                    }
                    c.this.a().a(com.amazon.a.a.o.b.ao, Boolean.TRUE);
                } catch (Throwable th2) {
                    String f11 = c.f37834c;
                    b.b(f11, "Error in sendResponse: " + th2);
                }
                h hVar = hVar;
                if (hVar != null) {
                    hVar.a(true);
                    hVar.l();
                }
            }
        });
    }

    public com.amazon.a.a.j.b a() {
        return this.f37258a;
    }
}
