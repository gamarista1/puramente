package com.facebook.imagepipeline.producers;

import c7.C3189i;
import i7.C3593b;

/* renamed from: com.facebook.imagepipeline.producers.l  reason: case insensitive filesystem */
public class C3306l implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f40004a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d0 f40005b;

    /* renamed from: com.facebook.imagepipeline.producers.l$a */
    private class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private e0 f40006c;

        /* access modifiers changed from: protected */
        public void h(Throwable th2) {
            C3306l.this.f40005b.b(p(), this.f40006c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void i(C3189i iVar, int i10) {
            C3593b F10 = this.f40006c.F();
            boolean e10 = C3297c.e(i10);
            boolean c10 = v0.c(iVar, F10.r());
            if (iVar != null && (c10 || F10.j())) {
                if (!e10 || !c10) {
                    p().c(iVar, C3297c.o(i10, 1));
                } else {
                    p().c(iVar, i10);
                }
            }
            if (e10 && !c10 && !F10.i()) {
                C3189i.f(iVar);
                C3306l.this.f40005b.b(p(), this.f40006c);
            }
        }

        private a(C3308n nVar, e0 e0Var) {
            super(nVar);
            this.f40006c = e0Var;
        }
    }

    public C3306l(d0 d0Var, d0 d0Var2) {
        this.f40004a = d0Var;
        this.f40005b = d0Var2;
    }

    public void b(C3308n nVar, e0 e0Var) {
        this.f40004a.b(new a(nVar, e0Var), e0Var);
    }
}
