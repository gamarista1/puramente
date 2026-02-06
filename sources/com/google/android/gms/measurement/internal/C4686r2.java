package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r2  reason: case insensitive filesystem */
public final /* synthetic */ class C4686r2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4681q2 f55327a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f55328b;

    public /* synthetic */ C4686r2(C4681q2 q2Var, String str) {
        this.f55327a = q2Var;
        this.f55328b = str;
    }

    public final Object call() {
        return new zzm("internal.remoteConfig", new C4728y2(this.f55327a, this.f55328b));
    }
}
