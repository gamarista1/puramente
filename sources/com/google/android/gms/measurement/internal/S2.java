package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class S2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54858a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54859b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54860c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ I2 f54861d;

    S2(I2 i22, String str, String str2, String str3) {
        this.f54858a = str;
        this.f54859b = str2;
        this.f54860c = str3;
        this.f54861d = i22;
    }

    public final /* synthetic */ Object call() {
        this.f54861d.f54718a.p0();
        return this.f54861d.f54718a.c0().u0(this.f54858a, this.f54859b, this.f54860c);
    }
}
