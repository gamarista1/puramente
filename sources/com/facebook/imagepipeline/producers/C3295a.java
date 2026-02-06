package com.facebook.imagepipeline.producers;

import c7.C3189i;

/* renamed from: com.facebook.imagepipeline.producers.a  reason: case insensitive filesystem */
public class C3295a implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f39918a;

    /* renamed from: com.facebook.imagepipeline.producers.a$a  reason: collision with other inner class name */
    private static class C0630a extends C3313t {
        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void i(C3189i iVar, int i10) {
            if (iVar == null) {
                p().c((Object) null, i10);
                return;
            }
            if (!C3189i.f0(iVar)) {
                iVar.j0();
            }
            p().c(iVar, i10);
        }

        private C0630a(C3308n nVar) {
            super(nVar);
        }
    }

    public C3295a(d0 d0Var) {
        this.f39918a = d0Var;
    }

    public void b(C3308n nVar, e0 e0Var) {
        this.f39918a.b(new C0630a(nVar), e0Var);
    }
}
