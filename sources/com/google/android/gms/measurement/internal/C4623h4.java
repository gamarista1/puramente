package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.h4  reason: case insensitive filesystem */
final class C4623h4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4595d4 f55128a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4595d4 f55129b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f55130c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f55131d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4609f4 f55132e;

    C4623h4(C4609f4 f4Var, C4595d4 d4Var, C4595d4 d4Var2, long j10, boolean z10) {
        this.f55128a = d4Var;
        this.f55129b = d4Var2;
        this.f55130c = j10;
        this.f55131d = z10;
        this.f55132e = f4Var;
    }

    public final void run() {
        this.f55132e.E(this.f55128a, this.f55129b, this.f55130c, this.f55131d, (Bundle) null);
    }
}
