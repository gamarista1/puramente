package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class R2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f54848a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54849b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54850c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ I2 f54851d;

    R2(I2 i22, String str, String str2, String str3) {
        this.f54848a = str;
        this.f54849b = str2;
        this.f54850c = str3;
        this.f54851d = i22;
    }

    public final /* synthetic */ Object call() {
        this.f54851d.f54718a.p0();
        return this.f54851d.f54718a.c0().M(this.f54848a, this.f54849b, this.f54850c);
    }
}
