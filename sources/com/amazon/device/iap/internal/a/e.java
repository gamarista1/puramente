package com.amazon.device.iap.internal.a;

public class e extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37853a = 7955687159702952249L;

    /* renamed from: b  reason: collision with root package name */
    private final String f37854b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37855c;

    public e(String str, String str2) {
        this.f37854b = str;
        this.f37855c = str2;
    }

    public String a() {
        return this.f37854b;
    }

    public String b() {
        return this.f37855c;
    }

    public e(String str, String str2, Throwable th2) {
        super(th2);
        this.f37854b = str;
        this.f37855c = str2;
    }
}
