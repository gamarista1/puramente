package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.e4  reason: case insensitive filesystem */
final class C4602e4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f55053a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4595d4 f55054b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4595d4 f55055c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f55056d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4609f4 f55057e;

    C4602e4(C4609f4 f4Var, Bundle bundle, C4595d4 d4Var, C4595d4 d4Var2, long j10) {
        this.f55053a = bundle;
        this.f55054b = d4Var;
        this.f55055c = d4Var2;
        this.f55056d = j10;
        this.f55057e = f4Var;
    }

    public final void run() {
        C4609f4.G(this.f55057e, this.f55053a, this.f55054b, this.f55055c, this.f55056d);
    }
}
