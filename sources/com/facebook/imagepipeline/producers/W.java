package com.facebook.imagepipeline.producers;

import W5.i;
import W5.k;
import a7.f;
import android.os.SystemClock;
import c7.C3189i;
import com.facebook.imagepipeline.producers.X;
import j7.b;
import java.io.InputStream;
import java.util.Map;

public class W implements d0 {

    /* renamed from: a  reason: collision with root package name */
    protected final i f39895a;

    /* renamed from: b  reason: collision with root package name */
    private final W5.a f39896b;

    /* renamed from: c  reason: collision with root package name */
    private final X f39897c;

    class a implements X.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f39898a;

        a(C c10) {
            this.f39898a = c10;
        }

        public void a(Throwable th2) {
            W.this.l(this.f39898a, th2);
        }

        public void b() {
            W.this.k(this.f39898a);
        }

        public void c(InputStream inputStream, int i10) {
            if (b.d()) {
                b.a("NetworkFetcher->onResponse");
            }
            W.this.m(this.f39898a, inputStream, i10);
            if (b.d()) {
                b.b();
            }
        }
    }

    public W(i iVar, W5.a aVar, X x10) {
        this.f39895a = iVar;
        this.f39896b = aVar;
        this.f39897c = x10;
    }

    protected static float e(int i10, int i11) {
        if (i11 > 0) {
            return ((float) i10) / ((float) i11);
        }
        return 1.0f - ((float) Math.exp(((double) (-i10)) / 50000.0d));
    }

    private Map f(C c10, int i10) {
        if (!c10.d().f(c10.b(), "NetworkFetchProducer")) {
            return null;
        }
        return this.f39897c.d(c10, i10);
    }

    protected static void j(k kVar, int i10, W6.b bVar, C3308n nVar, e0 e0Var) {
        X5.a U10 = X5.a.U(kVar.a());
        C3189i iVar = null;
        try {
            C3189i iVar2 = new C3189i(U10);
            try {
                iVar2.B0(bVar);
                iVar2.j0();
                nVar.c(iVar2, i10);
                C3189i.f(iVar2);
                X5.a.E(U10);
            } catch (Throwable th2) {
                th = th2;
                iVar = iVar2;
                C3189i.f(iVar);
                X5.a.E(U10);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C3189i.f(iVar);
            X5.a.E(U10);
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void k(C c10) {
        c10.d().c(c10.b(), "NetworkFetchProducer", (Map) null);
        c10.a().b();
    }

    /* access modifiers changed from: private */
    public void l(C c10, Throwable th2) {
        c10.d().k(c10.b(), "NetworkFetchProducer", th2, (Map) null);
        c10.d().b(c10.b(), "NetworkFetchProducer", false);
        c10.b().v("network");
        c10.a().a(th2);
    }

    private boolean n(C c10, e0 e0Var) {
        f h10 = e0Var.f().h();
        if (h10 == null || !h10.c() || !c10.b().E()) {
            return false;
        }
        return this.f39897c.c(c10);
    }

    public void b(C3308n nVar, e0 e0Var) {
        e0Var.y().d(e0Var, "NetworkFetchProducer");
        C e10 = this.f39897c.e(nVar, e0Var);
        this.f39897c.a(e10, new a(e10));
    }

    /* access modifiers changed from: protected */
    public long g() {
        return SystemClock.uptimeMillis();
    }

    /* access modifiers changed from: protected */
    public void h(k kVar, C c10) {
        Map f10 = f(c10, kVar.size());
        g0 d10 = c10.d();
        d10.j(c10.b(), "NetworkFetchProducer", f10);
        d10.b(c10.b(), "NetworkFetchProducer", true);
        c10.b().v("network");
        j(kVar, c10.e() | 1, c10.f(), c10.a(), c10.b());
    }

    /* access modifiers changed from: protected */
    public void i(k kVar, C c10) {
        if (n(c10, c10.b())) {
            long g10 = g();
            if (g10 - c10.c() >= 100) {
                c10.h(g10);
                c10.d().h(c10.b(), "NetworkFetchProducer", "intermediate_result");
                j(kVar, c10.e(), c10.f(), c10.a(), c10.b());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void m(C c10, InputStream inputStream, int i10) {
        k kVar;
        if (i10 > 0) {
            kVar = this.f39895a.e(i10);
        } else {
            kVar = this.f39895a.c();
        }
        byte[] bArr = (byte[]) this.f39896b.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f39897c.b(c10, kVar.size());
                    h(kVar, c10);
                    this.f39896b.a(bArr);
                    kVar.close();
                    return;
                } else if (read > 0) {
                    kVar.write(bArr, 0, read);
                    i(kVar, c10);
                    c10.a().d(e(kVar.size(), i10));
                }
            } catch (Throwable th2) {
                this.f39896b.a(bArr);
                kVar.close();
                throw th2;
            }
        }
    }
}
