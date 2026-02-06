package com.amazon.device.iap.internal.a;

public class f extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37863a = 3715222306172636179L;

    /* renamed from: b  reason: collision with root package name */
    private final String f37864b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37865c;

    /* renamed from: d  reason: collision with root package name */
    private final String f37866d;

    public f(String str, String str2, String str3) {
        this.f37864b = str;
        this.f37865c = str2;
        this.f37866d = str3;
    }

    public String a() {
        return this.f37864b;
    }

    public String b() {
        return this.f37865c;
    }

    public String c() {
        return this.f37866d;
    }

    public f(String str, String str2, String str3, Throwable th2) {
        super(th2);
        this.f37864b = str;
        this.f37865c = str2;
        this.f37866d = str3;
    }
}
