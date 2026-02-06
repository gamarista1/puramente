package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.measurement.internal.x3  reason: case insensitive filesystem */
final class C4723x3 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f55400a;

    C4723x3(C4643k3 k3Var) {
        this.f55400a = k3Var;
    }

    public final void execute(Runnable runnable) {
        this.f55400a.zzl().y(runnable);
    }
}
