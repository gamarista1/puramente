package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.j  reason: case insensitive filesystem */
public final class C4528j {

    /* renamed from: a  reason: collision with root package name */
    private final String f54195a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54196b;

    public C4528j(String str) {
        this(str, (String) null);
    }

    private final String f(String str) {
        String str2 = this.f54196b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f54195a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, f(str2));
        }
    }

    public void c(String str, String str2, Throwable th2) {
        if (a(6)) {
            Log.e(str, f(str2), th2);
        }
    }

    public void d(String str, String str2) {
        if (a(2)) {
            Log.v(str, f(str2));
        }
    }

    public void e(String str, String str2) {
        if (a(5)) {
            Log.w(str, f(str2));
        }
    }

    public C4528j(String str, String str2) {
        C4536s.m(str, "log tag cannot be null");
        C4536s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f54195a = str;
        this.f54196b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
