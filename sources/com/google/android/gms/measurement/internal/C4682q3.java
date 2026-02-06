package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q3  reason: case insensitive filesystem */
public final /* synthetic */ class C4682q3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4643k3 f55283a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ AtomicReference f55284b;

    public /* synthetic */ C4682q3(C4643k3 k3Var, AtomicReference atomicReference) {
        this.f55283a = k3Var;
        this.f55284b = atomicReference;
    }

    public final void run() {
        this.f55283a.i0(this.f55284b);
    }
}
