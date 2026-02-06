package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.c3  reason: case insensitive filesystem */
final class C4587c3 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f55024a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ I2 f55025b;

    C4587c3(I2 i22, String str) {
        this.f55024a = str;
        this.f55025b = i22;
    }

    public final /* synthetic */ Object call() {
        this.f55025b.f54718a.p0();
        return this.f55025b.f54718a.c0().N0(this.f55024a);
    }
}
