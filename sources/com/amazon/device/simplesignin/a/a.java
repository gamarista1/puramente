package com.amazon.device.simplesignin.a;

import android.app.Application;
import android.content.Context;
import com.amazon.device.simplesignin.a.c.b;

class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37987a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static final a f37988b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f37989c;

    private a() {
    }

    static a a() {
        return f37988b;
    }

    /* access modifiers changed from: package-private */
    public boolean b(Context context) {
        return com.amazon.a.a.a((Application) context.getApplicationContext());
    }

    /* access modifiers changed from: package-private */
    public b a(Context context) {
        if (f37989c == null) {
            synchronized (a.class) {
                try {
                    if (f37989c == null) {
                        if (b(context)) {
                            f37989c = new b();
                            com.amazon.device.simplesignin.a.d.a.a(f37987a, "SDK initialized in Sandbox mode.");
                        } else {
                            f37989c = new com.amazon.device.simplesignin.a.a.b();
                            com.amazon.device.simplesignin.a.d.a.a(f37987a, "SDK initialized in Production mode.");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f37989c;
    }
}
