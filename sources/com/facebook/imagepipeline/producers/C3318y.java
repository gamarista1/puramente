package com.facebook.imagepipeline.producers;

import V6.k;
import android.util.Pair;
import c7.C3189i;

/* renamed from: com.facebook.imagepipeline.producers.y  reason: case insensitive filesystem */
public class C3318y extends U {

    /* renamed from: f  reason: collision with root package name */
    private final k f40092f;

    public C3318y(k kVar, boolean z10, d0 d0Var) {
        super(d0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z10);
        this.f40092f = kVar;
    }

    /* renamed from: l */
    public C3189i g(C3189i iVar) {
        return C3189i.b(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f40092f.d(e0Var.F(), e0Var.a()), e0Var.T());
    }
}
