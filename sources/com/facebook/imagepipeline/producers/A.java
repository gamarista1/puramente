package com.facebook.imagepipeline.producers;

import M5.d;
import O6.c;
import T5.n;
import V6.C3077d;
import V6.j;
import V6.k;
import X6.C3080c;
import c7.C3189i;
import i7.C3593b;
import j7.b;
import java.util.Map;

public class A implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final n f39779a;

    /* renamed from: b  reason: collision with root package name */
    private final k f39780b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39781c;

    /* renamed from: d  reason: collision with root package name */
    private final C3077d f39782d;

    /* renamed from: e  reason: collision with root package name */
    private final C3077d f39783e;

    private static class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final e0 f39784c;

        /* renamed from: d  reason: collision with root package name */
        private final n f39785d;

        /* renamed from: e  reason: collision with root package name */
        private final k f39786e;

        /* renamed from: f  reason: collision with root package name */
        private final C3077d f39787f;

        /* renamed from: g  reason: collision with root package name */
        private final C3077d f39788g;

        public a(C3308n nVar, e0 e0Var, n nVar2, k kVar, C3077d dVar, C3077d dVar2) {
            super(nVar);
            this.f39784c = e0Var;
            this.f39785d = nVar2;
            this.f39786e = kVar;
            this.f39787f = dVar;
            this.f39788g = dVar2;
        }

        /* renamed from: q */
        public void i(C3189i iVar, int i10) {
            boolean z10;
            j jVar;
            try {
                if (b.d()) {
                    b.a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!C3297c.f(i10) && iVar != null && !C3297c.m(i10, 10)) {
                    if (iVar.y() != c.f33387d) {
                        C3593b F10 = this.f39784c.F();
                        d d10 = this.f39786e.d(F10, this.f39784c.a());
                        this.f39787f.a(d10);
                        if ("memory_encoded".equals(this.f39784c.Q("origin"))) {
                            if (!this.f39788g.b(d10)) {
                                if (F10.c() == C3593b.C0681b.SMALL) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                C3080c cVar = (C3080c) this.f39785d.get();
                                if (z10) {
                                    jVar = cVar.a();
                                } else {
                                    jVar = cVar.b();
                                }
                                jVar.f(d10);
                                this.f39788g.a(d10);
                            }
                        } else if ("disk".equals(this.f39784c.Q("origin"))) {
                            this.f39788g.a(d10);
                        }
                        p().c(iVar, i10);
                        if (b.d()) {
                            b.b();
                            return;
                        }
                        return;
                    }
                }
                p().c(iVar, i10);
                if (b.d()) {
                    b.b();
                }
            } catch (Throwable th2) {
                if (b.d()) {
                    b.b();
                }
                throw th2;
            }
        }
    }

    public A(n nVar, k kVar, C3077d dVar, C3077d dVar2, d0 d0Var) {
        this.f39779a = nVar;
        this.f39780b = kVar;
        this.f39782d = dVar;
        this.f39783e = dVar2;
        this.f39781c = d0Var;
    }

    public void b(C3308n nVar, e0 e0Var) {
        try {
            if (b.d()) {
                b.a("EncodedProbeProducer#produceResults");
            }
            g0 y10 = e0Var.y();
            y10.d(e0Var, c());
            a aVar = new a(nVar, e0Var, this.f39779a, this.f39780b, this.f39782d, this.f39783e);
            y10.j(e0Var, "EncodedProbeProducer", (Map) null);
            if (b.d()) {
                b.a("mInputProducer.produceResult");
            }
            this.f39781c.b(aVar, e0Var);
            if (b.d()) {
                b.b();
            }
            if (b.d()) {
                b.b();
            }
        } catch (Throwable th2) {
            if (b.d()) {
                b.b();
            }
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "EncodedProbeProducer";
    }
}
