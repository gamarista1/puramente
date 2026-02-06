package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class J3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54730a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54731b = null;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54732c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f54733d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54734e;

    J3(C4643k3 k3Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f54730a = atomicReference;
        this.f54732c = str2;
        this.f54733d = str3;
        this.f54734e = k3Var;
    }

    public final void run() {
        this.f54734e.f55074a.E().N(this.f54730a, (String) null, this.f54732c, this.f54733d);
    }
}
