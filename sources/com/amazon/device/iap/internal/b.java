package com.amazon.device.iap.internal;

import android.app.Application;
import android.content.Context;
import com.amazon.a.a;
import com.amazon.device.iap.internal.a.d;
import com.amazon.device.iap.internal.c.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f37874a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f37875b = b.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static volatile e f37876c;

    private b() {
    }

    public static b a() {
        return f37874a;
    }

    public e a(Context context) {
        if (f37876c == null) {
            synchronized (b.class) {
                try {
                    if (f37876c == null) {
                        if (a.a((Application) context.getApplicationContext())) {
                            f37876c = new e();
                        } else {
                            f37876c = new d();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f37876c;
    }
}
