package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.a2  reason: case insensitive filesystem */
public final class C4572a2 {

    /* renamed from: a  reason: collision with root package name */
    public String f55000a;

    /* renamed from: b  reason: collision with root package name */
    private String f55001b;

    /* renamed from: c  reason: collision with root package name */
    private long f55002c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f55003d;

    private C4572a2(String str, String str2, Bundle bundle, long j10) {
        this.f55000a = str;
        this.f55001b = str2;
        this.f55003d = bundle == null ? new Bundle() : bundle;
        this.f55002c = j10;
    }

    public static C4572a2 b(D d10) {
        return new C4572a2(d10.f54497a, d10.f54499c, d10.f54498b.r0(), d10.f54500d);
    }

    public final D a() {
        return new D(this.f55000a, new C(new Bundle(this.f55003d)), this.f55001b, this.f55002c);
    }

    public final String toString() {
        String str = this.f55001b;
        String str2 = this.f55000a;
        String valueOf = String.valueOf(this.f55003d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}
