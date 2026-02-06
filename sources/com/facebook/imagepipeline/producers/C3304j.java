package com.facebook.imagepipeline.producers;

import T5.k;
import android.graphics.Bitmap;
import c7.C3185e;
import c7.C3186f;

/* renamed from: com.facebook.imagepipeline.producers.j  reason: case insensitive filesystem */
public class C3304j implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f39968a;

    /* renamed from: b  reason: collision with root package name */
    private final int f39969b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39970c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f39971d;

    /* renamed from: com.facebook.imagepipeline.producers.j$a */
    private static class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final int f39972c;

        /* renamed from: d  reason: collision with root package name */
        private final int f39973d;

        a(C3308n nVar, int i10, int i11) {
            super(nVar);
            this.f39972c = i10;
            this.f39973d = i11;
        }

        private void q(X5.a aVar) {
            C3185e eVar;
            Bitmap h12;
            int rowBytes;
            if (aVar != null && aVar.Q() && (eVar = (C3185e) aVar.I()) != null && !eVar.isClosed() && (eVar instanceof C3186f) && (h12 = ((C3186f) eVar).h1()) != null && (rowBytes = h12.getRowBytes() * h12.getHeight()) >= this.f39972c && rowBytes <= this.f39973d) {
                h12.prepareToDraw();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void i(X5.a aVar, int i10) {
            q(aVar);
            p().c(aVar, i10);
        }
    }

    public C3304j(d0 d0Var, int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 <= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        this.f39968a = (d0) k.g(d0Var);
        this.f39969b = i10;
        this.f39970c = i11;
        this.f39971d = z10;
    }

    public void b(C3308n nVar, e0 e0Var) {
        if (!e0Var.M() || this.f39971d) {
            this.f39968a.b(new a(nVar, this.f39969b, this.f39970c), e0Var);
        } else {
            this.f39968a.b(nVar, e0Var);
        }
    }
}
