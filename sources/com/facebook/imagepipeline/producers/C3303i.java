package com.facebook.imagepipeline.producers;

import M5.d;
import T5.g;
import V6.k;
import V6.x;
import c7.C3185e;
import c7.C3190j;
import c7.n;
import i7.C3593b;
import j7.b;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.i  reason: case insensitive filesystem */
public class C3303i implements d0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f39960a;

    /* renamed from: b  reason: collision with root package name */
    private final k f39961b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39962c;

    /* renamed from: com.facebook.imagepipeline.producers.i$a */
    class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f39963c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f39964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C3308n nVar, d dVar, boolean z10) {
            super(nVar);
            this.f39963c = dVar;
            this.f39964d = z10;
        }

        /* renamed from: q */
        public void i(X5.a aVar, int i10) {
            X5.a aVar2;
            X5.a aVar3;
            try {
                if (b.d()) {
                    b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean e10 = C3297c.e(i10);
                aVar2 = null;
                if (aVar == null) {
                    if (e10) {
                        p().c((Object) null, i10);
                    }
                    if (b.d()) {
                        b.b();
                        return;
                    }
                    return;
                }
                if (!((C3185e) aVar.I()).u1()) {
                    if (!C3297c.n(i10, 8)) {
                        if (!e10 && (aVar3 = C3303i.this.f39960a.get(this.f39963c)) != null) {
                            n d12 = ((C3185e) aVar.I()).d1();
                            n d13 = ((C3185e) aVar3.I()).d1();
                            if (d13.a() || d13.c() >= d12.c()) {
                                p().c(aVar3, i10);
                                X5.a.E(aVar3);
                                if (b.d()) {
                                    b.b();
                                    return;
                                }
                                return;
                            }
                            X5.a.E(aVar3);
                        }
                        if (this.f39964d) {
                            aVar2 = C3303i.this.f39960a.b(this.f39963c, aVar);
                        }
                        if (e10) {
                            p().d(1.0f);
                        }
                        C3308n p10 = p();
                        if (aVar2 != null) {
                            aVar = aVar2;
                        }
                        p10.c(aVar, i10);
                        X5.a.E(aVar2);
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

    public C3303i(x xVar, k kVar, d0 d0Var) {
        this.f39960a = xVar;
        this.f39961b = kVar;
        this.f39962c = d0Var;
    }

    private static void f(C3190j jVar, e0 e0Var) {
        e0Var.I(jVar.getExtras());
    }

    public void b(C3308n nVar, e0 e0Var) {
        X5.a aVar;
        Map map;
        Map map2;
        try {
            if (b.d()) {
                b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 y10 = e0Var.y();
            y10.d(e0Var, e());
            d a10 = this.f39961b.a(e0Var.F(), e0Var.a());
            Map map3 = null;
            if (e0Var.F().y(1)) {
                aVar = this.f39960a.get(a10);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                f((C3190j) aVar.I(), e0Var);
                boolean a11 = ((C3185e) aVar.I()).d1().a();
                if (a11) {
                    String e10 = e();
                    if (y10.f(e0Var, e())) {
                        map2 = g.of("cached_value_found", com.amazon.a.a.o.b.f37475af);
                    } else {
                        map2 = null;
                    }
                    y10.j(e0Var, e10, map2);
                    y10.b(e0Var, e(), true);
                    e0Var.n("memory_bitmap", d());
                    nVar.d(1.0f);
                }
                nVar.c(aVar, C3297c.l(a11));
                aVar.close();
                if (a11) {
                    if (b.d()) {
                        b.b();
                        return;
                    }
                    return;
                }
            }
            if (e0Var.T().b() >= C3593b.c.BITMAP_MEMORY_CACHE.b()) {
                String e11 = e();
                if (y10.f(e0Var, e())) {
                    map = g.of("cached_value_found", com.amazon.a.a.o.b.f37476ag);
                } else {
                    map = null;
                }
                y10.j(e0Var, e11, map);
                y10.b(e0Var, e(), false);
                e0Var.n("memory_bitmap", d());
                nVar.c((Object) null, 1);
                if (b.d()) {
                    b.b();
                    return;
                }
                return;
            }
            C3308n g10 = g(nVar, a10, e0Var.F().y(2));
            String e12 = e();
            if (y10.f(e0Var, e())) {
                map3 = g.of("cached_value_found", com.amazon.a.a.o.b.f37476ag);
            }
            y10.j(e0Var, e12, map3);
            if (b.d()) {
                b.a("mInputProducer.produceResult");
            }
            this.f39962c.b(g10, e0Var);
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
    public String d() {
        return "pipe_bg";
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "BitmapMemoryCacheProducer";
    }

    /* access modifiers changed from: protected */
    public C3308n g(C3308n nVar, d dVar, boolean z10) {
        return new a(nVar, dVar, z10);
    }
}
