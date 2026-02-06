package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class M3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f54776a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54777b = null;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54778c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f54779d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f54780e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C4643k3 f54781f;

    M3(C4643k3 k3Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f54776a = atomicReference;
        this.f54778c = str2;
        this.f54779d = str3;
        this.f54780e = z10;
        this.f54781f = k3Var;
    }

    public final void run() {
        this.f54781f.f55074a.E().O(this.f54776a, (String) null, this.f54778c, this.f54779d, this.f54780e);
    }
}
