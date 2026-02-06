package com.bugsnag.android;

import android.content.Context;
import android.net.ConnectivityManager;
import lf.C6514M;
import lf.v;
import lf.w;
import yf.p;

public final class J implements H {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f38502a;

    /* renamed from: b  reason: collision with root package name */
    private final H f38503b;

    public J(Context context, p pVar) {
        H h10;
        ConnectivityManager b10 = K.b(context);
        this.f38502a = b10;
        if (b10 == null) {
            h10 = K1.f38514a;
        } else {
            h10 = new I(b10, pVar);
        }
        this.f38503b = h10;
    }

    public void a() {
        try {
            v.a aVar = v.f71841b;
            this.f38503b.a();
            v.b(C6514M.f71813a);
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            v.b(w.a(th2));
        }
    }

    public boolean b() {
        Object obj;
        try {
            v.a aVar = v.f71841b;
            obj = v.b(Boolean.valueOf(this.f38503b.b()));
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (v.e(obj) != null) {
            obj = Boolean.TRUE;
        }
        return ((Boolean) obj).booleanValue();
    }

    public String c() {
        Object obj;
        try {
            v.a aVar = v.f71841b;
            obj = v.b(this.f38503b.c());
        } catch (Throwable th2) {
            v.a aVar2 = v.f71841b;
            obj = v.b(w.a(th2));
        }
        if (v.e(obj) != null) {
            obj = "unknown";
        }
        return (String) obj;
    }
}
