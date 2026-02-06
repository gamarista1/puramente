package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class P2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54812a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54813b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54814c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ I2 f54815d;

    P2(I2 i22, String str, String str2, String str3) {
        this.f54812a = str;
        this.f54813b = str2;
        this.f54814c = str3;
        this.f54815d = i22;
    }

    public final /* synthetic */ Object call() {
        this.f54815d.f54718a.p0();
        return this.f54815d.f54718a.c0().u0(this.f54812a, this.f54813b, this.f54814c);
    }
}
