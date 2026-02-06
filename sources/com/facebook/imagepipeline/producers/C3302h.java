package com.facebook.imagepipeline.producers;

import V6.k;
import X5.a;
import android.util.Pair;

/* renamed from: com.facebook.imagepipeline.producers.h  reason: case insensitive filesystem */
public class C3302h extends U {

    /* renamed from: f  reason: collision with root package name */
    private final k f39959f;

    public C3302h(k kVar, d0 d0Var) {
        super(d0Var, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f39959f = kVar;
    }

    /* renamed from: l */
    public a g(a aVar) {
        return a.t(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f39959f.a(e0Var.F(), e0Var.a()), e0Var.T());
    }
}
