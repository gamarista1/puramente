package com.facebook.imagepipeline.producers;

import M5.d;
import T5.g;
import V6.k;
import V6.x;
import com.amazon.a.a.o.b;
import i7.C3593b;
import i7.C3595d;
import java.util.Map;

public class a0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final x f39919a;

    /* renamed from: b  reason: collision with root package name */
    private final k f39920b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39921c;

    public static class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final d f39922c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f39923d;

        /* renamed from: e  reason: collision with root package name */
        private final x f39924e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f39925f;

        public a(C3308n nVar, d dVar, boolean z10, x xVar, boolean z11) {
            super(nVar);
            this.f39922c = dVar;
            this.f39923d = z10;
            this.f39924e = xVar;
            this.f39925f = z11;
        }

        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void i(X5.a aVar, int i10) {
            X5.a aVar2 = null;
            if (aVar == null) {
                if (C3297c.e(i10)) {
                    p().c(aVar2, i10);
                }
            } else if (!C3297c.f(i10) || this.f39923d) {
                if (this.f39925f) {
                    aVar2 = this.f39924e.b(this.f39922c, aVar);
                }
                try {
                    p().d(1.0f);
                    C3308n p10 = p();
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    p10.c(aVar, i10);
                } finally {
                    X5.a.E(aVar2);
                }
            }
        }
    }

    public a0(x xVar, k kVar, d0 d0Var) {
        this.f39919a = xVar;
        this.f39920b = kVar;
        this.f39921c = d0Var;
    }

    public void b(C3308n nVar, e0 e0Var) {
        X5.a aVar;
        g0 y10 = e0Var.y();
        C3593b F10 = e0Var.F();
        Object a10 = e0Var.a();
        C3595d l10 = F10.l();
        if (l10 == null || l10.a() == null) {
            this.f39921c.b(nVar, e0Var);
            return;
        }
        y10.d(e0Var, c());
        d b10 = this.f39920b.b(F10, a10);
        Map map = null;
        if (e0Var.F().y(1)) {
            aVar = this.f39919a.get(b10);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            String c10 = c();
            if (y10.f(e0Var, c())) {
                map = g.of("cached_value_found", b.f37475af);
            }
            y10.j(e0Var, c10, map);
            y10.b(e0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            e0Var.n("memory_bitmap", "postprocessed");
            nVar.d(1.0f);
            nVar.c(aVar, 1);
            aVar.close();
            return;
        }
        a aVar2 = new a(nVar, b10, false, this.f39919a, e0Var.F().y(2));
        String c11 = c();
        if (y10.f(e0Var, c())) {
            map = g.of("cached_value_found", b.f37476ag);
        }
        y10.j(e0Var, c11, map);
        this.f39921c.b(aVar2, e0Var);
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
