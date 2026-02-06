package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.b3  reason: case insensitive filesystem */
final class C4580b3 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ D f55020a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f55021b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ I2 f55022c;

    C4580b3(I2 i22, D d10, String str) {
        this.f55020a = d10;
        this.f55021b = str;
        this.f55022c = i22;
    }

    public final /* synthetic */ Object call() {
        this.f55022c.f54718a.p0();
        return this.f55022c.f54718a.k0().t(this.f55020a, this.f55021b);
    }
}
