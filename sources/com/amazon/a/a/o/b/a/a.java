package com.amazon.a.a.o.b.a;

import com.amazon.a.a.d.b;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f37511a = "DATA_AUTH_KEY_LOAD_FAILURE";

    /* renamed from: b  reason: collision with root package name */
    private static final long f37512b = 1;

    private a(String str, Throwable th2) {
        super(f37511a, str, th2);
    }

    public static a a(Throwable th2) {
        return new a("CERT_FAILED_TO_LOAD", th2);
    }

    public static a b(Throwable th2) {
        return new a("FAILED_TO_ESTABLISH_TRUST", th2);
    }

    public static a d() {
        return new a("CERT_NOT_FOUND", (Throwable) null);
    }

    public static a e() {
        return new a("CERT_INVALID", (Throwable) null);
    }

    public static a f() {
        return new a("VERIFICATION_FAILED", (Throwable) null);
    }
}
