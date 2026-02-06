package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;

final class w5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f55392a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f55393b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f55394c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ t5 f55395d;

    w5(t5 t5Var, String str, String str2, Bundle bundle) {
        this.f55392a = str;
        this.f55393b = str2;
        this.f55394c = bundle;
        this.f55395d = t5Var;
    }

    public final void run() {
        this.f55395d.f55355a.r((D) C4536s.l(this.f55395d.f55355a.o0().C(this.f55392a, this.f55393b, this.f55394c, "auto", this.f55395d.f55355a.zzb().currentTimeMillis(), false, true)), this.f55392a);
    }
}
