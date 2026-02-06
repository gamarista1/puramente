package com.amazon.device.drm.a;

import android.app.Application;
import android.content.Context;
import com.amazon.device.drm.a.d.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f37776a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f37777b;

    private a() {
    }

    public static a a() {
        return f37776a;
    }

    public c a(Context context) {
        if (f37777b == null) {
            synchronized (a.class) {
                try {
                    if (f37777b == null) {
                        if (com.amazon.a.a.a((Application) context.getApplicationContext())) {
                            f37777b = new c();
                        } else {
                            f37777b = new com.amazon.device.drm.a.b.c();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f37777b;
    }
}
