package com.bugsnag.android;

import android.os.StrictMode;
import java.lang.Thread;

/* renamed from: com.bugsnag.android.z0  reason: case insensitive filesystem */
class C3285z0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f39000a;

    /* renamed from: b  reason: collision with root package name */
    private final x1 f39001b = new x1();

    /* renamed from: c  reason: collision with root package name */
    private final A f39002c;

    /* renamed from: d  reason: collision with root package name */
    private final S0 f39003d;

    C3285z0(A a10, S0 s02) {
        this.f39002c = a10;
        this.f39003d = s02;
        this.f39000a = Thread.getDefaultUncaughtExceptionHandler();
    }

    private void a(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f39000a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            return;
        }
        System.err.printf("Exception in thread \"%s\" ", new Object[]{thread.getName()});
        this.f39003d.b("Exception", th2);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Thread.setDefaultUncaughtExceptionHandler(this.f39000a);
    }

    public void uncaughtException(Thread thread, Throwable th2) {
        String str;
        String str2;
        try {
            if (this.f39002c.m().O(th2)) {
                a(thread, th2);
                return;
            }
            boolean c10 = this.f39001b.c(th2);
            Y0 y02 = new Y0();
            if (c10) {
                String b10 = this.f39001b.b(th2.getMessage());
                Y0 y03 = new Y0();
                y03.a("StrictMode", "Violation", b10);
                Y0 y04 = y03;
                str = b10;
                y02 = y04;
            } else {
                str = null;
            }
            if (c10) {
                str2 = "strictMode";
            } else {
                str2 = "unhandledException";
            }
            if (c10) {
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                this.f39002c.H(th2, y02, str2, str);
                StrictMode.setThreadPolicy(threadPolicy);
            } else {
                this.f39002c.H(th2, y02, str2, (String) null);
            }
            a(thread, th2);
        } catch (Throwable unused) {
        }
    }
}
