package com.facebook.imagepipeline.producers;

import M5.d;
import T5.n;
import V6.C3077d;
import V6.j;
import V6.k;
import V6.x;
import X6.C3080c;
import i7.C3593b;
import j7.b;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.k  reason: case insensitive filesystem */
public class C3305k implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f39976a;

    /* renamed from: b  reason: collision with root package name */
    private final n f39977b;

    /* renamed from: c  reason: collision with root package name */
    private final k f39978c;

    /* renamed from: d  reason: collision with root package name */
    private final d0 f39979d;

    /* renamed from: e  reason: collision with root package name */
    private final C3077d f39980e;

    /* renamed from: f  reason: collision with root package name */
    private final C3077d f39981f;

    /* renamed from: com.facebook.imagepipeline.producers.k$a */
    private static class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final e0 f39982c;

        /* renamed from: d  reason: collision with root package name */
        private final x f39983d;

        /* renamed from: e  reason: collision with root package name */
        private final n f39984e;

        /* renamed from: f  reason: collision with root package name */
        private final k f39985f;

        /* renamed from: g  reason: collision with root package name */
        private final C3077d f39986g;

        /* renamed from: h  reason: collision with root package name */
        private final C3077d f39987h;

        public a(C3308n nVar, e0 e0Var, x xVar, n nVar2, k kVar, C3077d dVar, C3077d dVar2) {
            super(nVar);
            this.f39982c = e0Var;
            this.f39983d = xVar;
            this.f39984e = nVar2;
            this.f39985f = kVar;
            this.f39986g = dVar;
            this.f39987h = dVar2;
        }

        /* renamed from: q */
        public void i(X5.a aVar, int i10) {
            boolean z10;
            j jVar;
            try {
                if (b.d()) {
                    b.a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!C3297c.f(i10) && aVar != null) {
                    if (!C3297c.m(i10, 8)) {
                        C3593b F10 = this.f39982c.F();
                        d d10 = this.f39985f.d(F10, this.f39982c.a());
                        String str = (String) this.f39982c.Q("origin");
                        if (str != null && str.equals("memory_bitmap")) {
                            if (this.f39982c.f().G().D() && !this.f39986g.b(d10)) {
                                this.f39983d.c(d10);
                                this.f39986g.a(d10);
                            }
                            if (this.f39982c.f().G().B() && !this.f39987h.b(d10)) {
                                if (F10.c() == C3593b.C0681b.SMALL) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                C3080c cVar = (C3080c) this.f39984e.get();
                                if (z10) {
                                    jVar = cVar.a();
                                } else {
                                    jVar = cVar.b();
                                }
                                jVar.f(d10);
                                this.f39987h.a(d10);
                            }
                        }
                        p().c(aVar, i10);
                        if (b.d()) {
                            b.b();
                            return;
                        }
                        return;
                    }
                }
                p().c(aVar, i10);
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

    public C3305k(x xVar, n nVar, k kVar, C3077d dVar, C3077d dVar2, d0 d0Var) {
        this.f39976a = xVar;
        this.f39977b = nVar;
        this.f39978c = kVar;
        this.f39980e = dVar;
        this.f39981f = dVar2;
        this.f39979d = d0Var;
    }

    public void b(C3308n nVar, e0 e0Var) {
        try {
            if (b.d()) {
                b.a("BitmapProbeProducer#produceResults");
            }
            g0 y10 = e0Var.y();
            y10.d(e0Var, c());
            a aVar = new a(nVar, e0Var, this.f39976a, this.f39977b, this.f39978c, this.f39980e, this.f39981f);
            y10.j(e0Var, "BitmapProbeProducer", (Map) null);
            if (b.d()) {
                b.a("mInputProducer.produceResult");
            }
            this.f39979d.b(aVar, e0Var);
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
        return "BitmapProbeProducer";
    }
}
