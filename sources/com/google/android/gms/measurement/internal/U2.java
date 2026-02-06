package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class U2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54877a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54878b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54879c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ I2 f54880d;

    U2(I2 i22, String str, String str2, String str3) {
        this.f54877a = str;
        this.f54878b = str2;
        this.f54879c = str3;
        this.f54880d = i22;
    }

    public final /* synthetic */ Object call() {
        this.f54880d.f54718a.p0();
        return this.f54880d.f54718a.c0().M(this.f54877a, this.f54878b, this.f54879c);
    }
}
