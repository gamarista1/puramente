package com.google.android.gms.measurement.internal;

final class T3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Boolean f54867a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54868b;

    T3(C4643k3 k3Var, Boolean bool) {
        this.f54867a = bool;
        this.f54868b = k3Var;
    }

    public final void run() {
        this.f54868b.W(this.f54867a, true);
    }
}
