package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.amazon.a.a;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.util.b;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f37968a = "d";

    /* renamed from: b  reason: collision with root package name */
    private static String f37969b = "sku";

    /* renamed from: c  reason: collision with root package name */
    private static d f37970c = new d();

    /* renamed from: d  reason: collision with root package name */
    private e f37971d;

    /* renamed from: e  reason: collision with root package name */
    private Context f37972e;

    /* renamed from: f  reason: collision with root package name */
    private PurchasingListener f37973f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37974g = false;

    private d() {
    }

    public static d f() {
        return f37970c;
    }

    private void g() {
        if (this.f37973f == null) {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public PurchasingListener a() {
        return this.f37973f;
    }

    public Context b() {
        return this.f37972e;
    }

    public void c() {
        this.f37974g = true;
    }

    public boolean d() {
        return this.f37974g;
    }

    public boolean e() {
        g();
        return a.a((Application) this.f37972e.getApplicationContext());
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        String str = f37968a;
        b.a(str, "PurchasingListener registered: " + purchasingListener);
        String str2 = f37968a;
        b.a(str2, "PurchasingListener Context: " + context);
        if (purchasingListener == null || context == null) {
            throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
        }
        this.f37972e = context.getApplicationContext();
        e a10 = b.a().a(this.f37972e);
        this.f37971d = a10;
        if (a10 == null) {
            b.a(f37968a, "requestHandler is null");
        }
        this.f37973f = purchasingListener;
    }

    public RequestId a(UserDataRequest userDataRequest) {
        g();
        RequestId requestId = new RequestId();
        this.f37971d.a(requestId, userDataRequest);
        return requestId;
    }

    public RequestId a(String str) {
        f.a((Object) str, f37969b);
        g();
        RequestId requestId = new RequestId();
        this.f37971d.a(requestId, str);
        return requestId;
    }

    public RequestId a(Set<String> set) {
        f.a((Object) set, com.amazon.a.a.o.b.f37457O);
        f.a((Collection<? extends Object>) set, com.amazon.a.a.o.b.f37457O);
        for (String trim : set) {
            if (trim.trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            g();
            RequestId requestId = new RequestId();
            this.f37971d.a(requestId, (Set<String>) new LinkedHashSet(set));
            return requestId;
        }
        throw new IllegalArgumentException(set.size() + " SKUs were provided, but no more than " + 100 + " SKUs are allowed");
    }

    public RequestId a(boolean z10) {
        g();
        RequestId requestId = new RequestId();
        this.f37971d.a(requestId, z10);
        return requestId;
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (!f.a(str)) {
            f.a((Object) fulfillmentResult, "fulfillmentResult");
            g();
            this.f37971d.a(new RequestId(), str, fulfillmentResult);
            return;
        }
        throw new IllegalArgumentException("Empty receiptId is not allowed");
    }

    public void a(Context context, Intent intent) {
        try {
            this.f37971d.a(context, intent);
        } catch (Exception e10) {
            String str = f37968a;
            b.b(str, "Error in onReceive: " + e10);
        }
    }
}
