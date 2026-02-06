package com.bugsnag.android;

import android.content.Context;

/* renamed from: com.bugsnag.android.s  reason: case insensitive filesystem */
public abstract class C3270s {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f38861a = new Object();

    /* renamed from: b  reason: collision with root package name */
    static A f38862b;

    public static A a() {
        if (f38862b == null) {
            synchronized (f38861a) {
                try {
                    if (f38862b == null) {
                        throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f38862b;
    }

    private static void b() {
        a().f38381q.e("Multiple Bugsnag.start calls detected. Ignoring.");
    }

    public static A c(Context context) {
        return d(context, G.I(context));
    }

    public static A d(Context context, G g10) {
        synchronized (f38861a) {
            try {
                if (f38862b == null) {
                    f38862b = new A(context, g10);
                } else {
                    b();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f38862b;
    }
}
