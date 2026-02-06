package com.facebook.imagepipeline.producers;

import M5.d;
import O6.c;
import T5.g;
import V6.k;
import V6.x;
import c7.C3189i;
import i7.C3593b;
import j7.b;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.z  reason: case insensitive filesystem */
public class C3319z implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f40093a;

    /* renamed from: b  reason: collision with root package name */
    private final k f40094b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f40095c;

    /* renamed from: com.facebook.imagepipeline.producers.z$a */
    private static class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final x f40096c;

        /* renamed from: d  reason: collision with root package name */
        private final d f40097d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f40098e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f40099f;

        public a(C3308n nVar, x xVar, d dVar, boolean z10, boolean z11) {
            super(nVar);
            this.f40096c = xVar;
            this.f40097d = dVar;
            this.f40098e = z10;
            this.f40099f = z11;
        }

        /* renamed from: q */
        public void i(C3189i iVar, int i10) {
            X5.a o10;
            X5.a aVar;
            C3189i iVar2;
            try {
                if (b.d()) {
                    b.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!C3297c.f(i10) && iVar != null && !C3297c.m(i10, 10)) {
                    if (iVar.y() != c.f33387d) {
                        o10 = iVar.o();
                        if (o10 != null) {
                            if (!this.f40099f || !this.f40098e) {
                                aVar = null;
                            } else {
                                aVar = this.f40096c.b(this.f40097d, o10);
                            }
                            X5.a.E(o10);
                            if (aVar != null) {
                                iVar2 = new C3189i(aVar);
                                iVar2.n(iVar);
                                X5.a.E(aVar);
                                p().d(1.0f);
                                p().c(iVar2, i10);
                                C3189i.f(iVar2);
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

    public C3319z(x xVar, k kVar, d0 d0Var) {
        this.f40093a = xVar;
        this.f40094b = kVar;
        this.f40095c = d0Var;
    }

    public void b(C3308n nVar, e0 e0Var) {
        X5.a aVar;
        Map map;
        C3189i iVar;
        try {
            if (b.d()) {
                b.a("EncodedMemoryCacheProducer#produceResults");
            }
            g0 y10 = e0Var.y();
            y10.d(e0Var, "EncodedMemoryCacheProducer");
            d d10 = this.f40094b.d(e0Var.F(), e0Var.a());
            Map map2 = null;
            if (e0Var.F().y(4)) {
                aVar = this.f40093a.get(d10);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                try {
                    iVar = new C3189i(aVar);
                    if (y10.f(e0Var, "EncodedMemoryCacheProducer")) {
                        map2 = g.of("cached_value_found", com.amazon.a.a.o.b.f37475af);
                    }
                    y10.j(e0Var, "EncodedMemoryCacheProducer", map2);
                    y10.b(e0Var, "EncodedMemoryCacheProducer", true);
                    e0Var.v("memory_encoded");
                    nVar.d(1.0f);
                    nVar.c(iVar, 1);
                    C3189i.f(iVar);
                    X5.a.E(aVar);
                    if (b.d()) {
                        b.b();
                    }
                } catch (Throwable th2) {
                    X5.a.E(aVar);
                    throw th2;
                }
            } else if (e0Var.T().b() >= C3593b.c.ENCODED_MEMORY_CACHE.b()) {
                if (y10.f(e0Var, "EncodedMemoryCacheProducer")) {
                    map = g.of("cached_value_found", com.amazon.a.a.o.b.f37476ag);
                } else {
                    map = null;
                }
                y10.j(e0Var, "EncodedMemoryCacheProducer", map);
                y10.b(e0Var, "EncodedMemoryCacheProducer", false);
                e0Var.n("memory_encoded", "nil-result");
                nVar.c((Object) null, 1);
                X5.a.E(aVar);
                if (b.d()) {
                    b.b();
                }
            } else {
                a aVar2 = new a(nVar, this.f40093a, d10, e0Var.F().y(8), e0Var.f().G().C());
                if (y10.f(e0Var, "EncodedMemoryCacheProducer")) {
                    map2 = g.of("cached_value_found", com.amazon.a.a.o.b.f37476ag);
                }
                y10.j(e0Var, "EncodedMemoryCacheProducer", map2);
                this.f40095c.b(aVar2, e0Var);
                X5.a.E(aVar);
                if (b.d()) {
                    b.b();
                }
            }
        } catch (Throwable th3) {
            if (b.d()) {
                b.b();
            }
            throw th3;
        }
    }
}
