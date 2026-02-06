package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.C6496s;

/* renamed from: com.facebook.imagepipeline.producers.t  reason: case insensitive filesystem */
public abstract class C3313t extends C3297c {

    /* renamed from: b  reason: collision with root package name */
    private final C3308n f40069b;

    public C3313t(C3308n nVar) {
        C6496s.h(nVar, "consumer");
        this.f40069b = nVar;
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.f40069b.b();
    }

    /* access modifiers changed from: protected */
    public void h(Throwable th2) {
        C6496s.h(th2, "t");
        this.f40069b.a(th2);
    }

    /* access modifiers changed from: protected */
    public void j(float f10) {
        this.f40069b.d(f10);
    }

    public final C3308n p() {
        return this.f40069b;
    }
}
