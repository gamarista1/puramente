package com.facebook.imagepipeline.producers;

import T5.g;
import T5.n;
import U3.d;
import U3.f;
import V6.j;
import V6.k;
import X6.C3080c;
import c7.C3189i;
import com.facebook.imagepipeline.producers.C3314u;
import i7.C3593b;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.producers.v  reason: case insensitive filesystem */
public class C3315v implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final n f40076a;

    /* renamed from: b  reason: collision with root package name */
    private final k f40077b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d0 f40078c;

    /* renamed from: com.facebook.imagepipeline.producers.v$a */
    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0 f40079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f40080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3308n f40081c;

        a(g0 g0Var, e0 e0Var, C3308n nVar) {
            this.f40079a = g0Var;
            this.f40080b = e0Var;
            this.f40081c = nVar;
        }

        /* renamed from: b */
        public Void a(f fVar) {
            if (C3315v.f(fVar)) {
                this.f40079a.c(this.f40080b, "DiskCacheProducer", (Map) null);
                this.f40081c.b();
            } else if (fVar.n()) {
                this.f40079a.k(this.f40080b, "DiskCacheProducer", fVar.i(), (Map) null);
                C3315v.this.f40078c.b(this.f40081c, this.f40080b);
            } else {
                C3189i iVar = (C3189i) fVar.j();
                if (iVar != null) {
                    g0 g0Var = this.f40079a;
                    e0 e0Var = this.f40080b;
                    g0Var.j(e0Var, "DiskCacheProducer", C3315v.e(g0Var, e0Var, true, iVar.M()));
                    this.f40079a.b(this.f40080b, "DiskCacheProducer", true);
                    this.f40080b.v("disk");
                    this.f40081c.d(1.0f);
                    this.f40081c.c(iVar, 1);
                    iVar.close();
                } else {
                    g0 g0Var2 = this.f40079a;
                    e0 e0Var2 = this.f40080b;
                    g0Var2.j(e0Var2, "DiskCacheProducer", C3315v.e(g0Var2, e0Var2, false, 0));
                    C3315v.this.f40078c.b(this.f40081c, this.f40080b);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.v$b */
    class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f40083a;

        b(AtomicBoolean atomicBoolean) {
            this.f40083a = atomicBoolean;
        }

        public void b() {
            this.f40083a.set(true);
        }
    }

    public C3315v(n nVar, k kVar, d0 d0Var) {
        this.f40076a = nVar;
        this.f40077b = kVar;
        this.f40078c = d0Var;
    }

    static Map e(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (!g0Var.f(e0Var, "DiskCacheProducer")) {
            return null;
        }
        if (z10) {
            return g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10));
        }
        return g.of("cached_value_found", String.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static boolean f(f fVar) {
        if (fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    private void g(C3308n nVar, e0 e0Var) {
        if (e0Var.T().b() >= C3593b.c.DISK_CACHE.b()) {
            e0Var.n("disk", "nil-result_read");
            nVar.c((Object) null, 1);
            return;
        }
        this.f40078c.b(nVar, e0Var);
    }

    private d h(C3308n nVar, e0 e0Var) {
        return new a(e0Var.y(), e0Var, nVar);
    }

    private void i(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.b(new b(atomicBoolean));
    }

    public void b(C3308n nVar, e0 e0Var) {
        C3593b F10 = e0Var.F();
        if (!e0Var.F().y(16)) {
            g(nVar, e0Var);
            return;
        }
        e0Var.y().d(e0Var, "DiskCacheProducer");
        M5.d d10 = this.f40077b.d(F10, e0Var.a());
        C3080c cVar = (C3080c) this.f40076a.get();
        j a10 = C3314u.a(F10, cVar.a(), cVar.b(), cVar.c());
        if (a10 == null) {
            g0 y10 = e0Var.y();
            y10.k(e0Var, "DiskCacheProducer", new C3314u.a("Got no disk cache for CacheChoice: " + Integer.valueOf(F10.c().ordinal()).toString()), (Map) null);
            g(nVar, e0Var);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        a10.m(d10, atomicBoolean).e(h(nVar, e0Var));
        i(atomicBoolean, e0Var);
    }
}
