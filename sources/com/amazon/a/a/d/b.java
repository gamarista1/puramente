package com.amazon.a.a.d;

import com.revenuecat.purchases.common.Constants;

public abstract class b extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private static final long f37155a = 1;

    /* renamed from: b  reason: collision with root package name */
    private final String f37156b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37157c;

    /* renamed from: d  reason: collision with root package name */
    private final String f37158d;

    protected b(String str) {
        this(str, (String) null);
    }

    public final String a() {
        return this.f37156b;
    }

    public final String b() {
        return this.f37157c;
    }

    public final String c() {
        return this.f37158d;
    }

    protected b(String str, String str2) {
        this(str, str2, (String) null);
    }

    private static String a(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        Throwable c10 = c(th2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b(th2));
        sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb2.append(th2.getMessage());
        if (th2 != c10) {
            sb2.append("/");
            sb2.append(b(c10));
            sb2.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
            sb2.append(c10.getMessage());
        }
        return sb2.toString();
    }

    private static String b(Throwable th2) {
        return th2.getClass().getName();
    }

    private static Throwable c(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    protected b(String str, String str2, String str3) {
        super(str + ": " + str2 + ": " + str3);
        this.f37156b = str;
        this.f37157c = str2;
        this.f37158d = str3;
    }

    protected b(String str, Throwable th2) {
        this(str, b(th2), th2);
    }

    protected b(String str, String str2, Throwable th2) {
        this(str, str2, a(th2));
    }
}
