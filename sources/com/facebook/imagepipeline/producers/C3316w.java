package com.facebook.imagepipeline.producers;

import M5.d;
import O6.c;
import T5.n;
import V6.j;
import V6.k;
import X6.C3080c;
import c7.C3189i;
import com.facebook.imagepipeline.producers.C3314u;
import i7.C3593b;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.w  reason: case insensitive filesystem */
public class C3316w implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final n f40086a;

    /* renamed from: b  reason: collision with root package name */
    private final k f40087b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f40088c;

    /* renamed from: com.facebook.imagepipeline.producers.w$a */
    private static class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final e0 f40089c;

        /* renamed from: d  reason: collision with root package name */
        private final n f40090d;

        /* renamed from: e  reason: collision with root package name */
        private final k f40091e;

        /* renamed from: q */
        public void i(C3189i iVar, int i10) {
            this.f40089c.y().d(this.f40089c, "DiskCacheWriteProducer");
            if (C3297c.f(i10) || iVar == null || C3297c.m(i10, 10) || iVar.y() == c.f33387d) {
                this.f40089c.y().j(this.f40089c, "DiskCacheWriteProducer", (Map) null);
                p().c(iVar, i10);
                return;
            }
            C3593b F10 = this.f40089c.F();
            d d10 = this.f40091e.d(F10, this.f40089c.a());
            C3080c cVar = (C3080c) this.f40090d.get();
            j a10 = C3314u.a(F10, cVar.a(), cVar.b(), cVar.c());
            if (a10 == null) {
                g0 y10 = this.f40089c.y();
                e0 e0Var = this.f40089c;
                y10.k(e0Var, "DiskCacheWriteProducer", new C3314u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(F10.c().ordinal()).toString()), (Map) null);
                p().c(iVar, i10);
                return;
            }
            a10.p(d10, iVar);
            this.f40089c.y().j(this.f40089c, "DiskCacheWriteProducer", (Map) null);
            p().c(iVar, i10);
        }

        private a(C3308n nVar, e0 e0Var, n nVar2, k kVar) {
            super(nVar);
            this.f40089c = e0Var;
            this.f40090d = nVar2;
            this.f40091e = kVar;
        }
    }

    public C3316w(n nVar, k kVar, d0 d0Var) {
        this.f40086a = nVar;
        this.f40087b = kVar;
        this.f40088c = d0Var;
    }

    private void c(C3308n nVar, e0 e0Var) {
        if (e0Var.T().b() >= C3593b.c.DISK_CACHE.b()) {
            e0Var.n("disk", "nil-result_write");
            nVar.c((Object) null, 1);
            return;
        }
        if (e0Var.F().y(32)) {
            nVar = new a(nVar, e0Var, this.f40086a, this.f40087b);
        }
        this.f40088c.b(nVar, e0Var);
    }

    public void b(C3308n nVar, e0 e0Var) {
        c(nVar, e0Var);
    }
}
