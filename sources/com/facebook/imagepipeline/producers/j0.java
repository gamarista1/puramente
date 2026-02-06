package com.facebook.imagepipeline.producers;

import c7.C3189i;
import kotlin.jvm.internal.C6496s;

public final class j0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f39974a;

    private final class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j0 f39975c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, C3308n nVar) {
            super(nVar);
            C6496s.h(nVar, "consumer");
            this.f39975c = j0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void i(C3189i iVar, int i10) {
            X5.a aVar = null;
            try {
                if (C3189i.h0(iVar) && iVar != null) {
                    aVar = iVar.o();
                }
                p().c(aVar, i10);
                X5.a.E(aVar);
            } catch (Throwable th2) {
                X5.a.E((X5.a) null);
                throw th2;
            }
        }
    }

    public j0(d0 d0Var) {
        C6496s.h(d0Var, "inputProducer");
        this.f39974a = d0Var;
    }

    public void b(C3308n nVar, e0 e0Var) {
        C6496s.h(nVar, "consumer");
        C6496s.h(e0Var, "context");
        this.f39974a.b(new a(this, nVar), e0Var);
    }
}
