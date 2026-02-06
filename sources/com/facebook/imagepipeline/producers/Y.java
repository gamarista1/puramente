package com.facebook.imagepipeline.producers;

import T5.g;
import T5.n;
import U3.d;
import U3.f;
import V6.k;
import W5.i;
import X6.C3080c;
import android.net.Uri;
import c7.C3189i;
import i7.C3593b;
import i7.C3594c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class Y implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final n f39900a;

    /* renamed from: b  reason: collision with root package name */
    private final k f39901b;

    /* renamed from: c  reason: collision with root package name */
    private final i f39902c;

    /* renamed from: d  reason: collision with root package name */
    private final W5.a f39903d;

    /* renamed from: e  reason: collision with root package name */
    private final d0 f39904e;

    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g0 f39905a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e0 f39906b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C3308n f39907c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ M5.d f39908d;

        a(g0 g0Var, e0 e0Var, C3308n nVar, M5.d dVar) {
            this.f39905a = g0Var;
            this.f39906b = e0Var;
            this.f39907c = nVar;
            this.f39908d = dVar;
        }

        /* renamed from: b */
        public Void a(f fVar) {
            if (Y.g(fVar)) {
                this.f39905a.c(this.f39906b, "PartialDiskCacheProducer", (Map) null);
                this.f39907c.b();
            } else if (fVar.n()) {
                this.f39905a.k(this.f39906b, "PartialDiskCacheProducer", fVar.i(), (Map) null);
                Y.this.i(this.f39907c, this.f39906b, this.f39908d, (C3189i) null);
            } else {
                C3189i iVar = (C3189i) fVar.j();
                if (iVar != null) {
                    g0 g0Var = this.f39905a;
                    e0 e0Var = this.f39906b;
                    g0Var.j(e0Var, "PartialDiskCacheProducer", Y.f(g0Var, e0Var, true, iVar.M()));
                    W6.b g10 = W6.b.g(iVar.M() - 1);
                    iVar.B0(g10);
                    int M10 = iVar.M();
                    C3593b F10 = this.f39906b.F();
                    if (g10.c(F10.b())) {
                        this.f39906b.n("disk", "partial");
                        this.f39905a.b(this.f39906b, "PartialDiskCacheProducer", true);
                        this.f39907c.c(iVar, 9);
                    } else {
                        this.f39907c.c(iVar, 8);
                        Y.this.i(this.f39907c, new l0(C3594c.b(F10).z(W6.b.d(M10 - 1)).a(), this.f39906b), this.f39908d, iVar);
                    }
                } else {
                    g0 g0Var2 = this.f39905a;
                    e0 e0Var2 = this.f39906b;
                    g0Var2.j(e0Var2, "PartialDiskCacheProducer", Y.f(g0Var2, e0Var2, false, 0));
                    Y.this.i(this.f39907c, this.f39906b, this.f39908d, iVar);
                }
            }
            return null;
        }
    }

    class b extends C3300f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f39910a;

        b(AtomicBoolean atomicBoolean) {
            this.f39910a = atomicBoolean;
        }

        public void b() {
            this.f39910a.set(true);
        }
    }

    private static class c extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final n f39912c;

        /* renamed from: d  reason: collision with root package name */
        private final M5.d f39913d;

        /* renamed from: e  reason: collision with root package name */
        private final i f39914e;

        /* renamed from: f  reason: collision with root package name */
        private final W5.a f39915f;

        /* renamed from: g  reason: collision with root package name */
        private final C3189i f39916g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f39917h;

        private void q(InputStream inputStream, OutputStream outputStream, int i10) {
            byte[] bArr = (byte[]) this.f39915f.get(16384);
            int i11 = i10;
            while (i11 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(16384, i11));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i11 -= read;
                    }
                } catch (Throwable th2) {
                    this.f39915f.a(bArr);
                    throw th2;
                }
            }
            this.f39915f.a(bArr);
            if (i11 > 0) {
                throw new IOException(String.format((Locale) null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}));
            }
        }

        private W5.k r(C3189i iVar, C3189i iVar2) {
            int i10 = ((W6.b) T5.k.g(iVar2.q())).f34869a;
            W5.k e10 = this.f39914e.e(iVar2.M() + i10);
            q(iVar.F(), e10, i10);
            q(iVar2.F(), e10, iVar2.M());
            return e10;
        }

        private void t(W5.k kVar) {
            C3189i iVar;
            Throwable th2;
            X5.a U10 = X5.a.U(kVar.a());
            try {
                iVar = new C3189i(U10);
                try {
                    iVar.j0();
                    p().c(iVar, 1);
                    C3189i.f(iVar);
                    X5.a.E(U10);
                } catch (Throwable th3) {
                    th2 = th3;
                    C3189i.f(iVar);
                    X5.a.E(U10);
                    throw th2;
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                iVar = null;
                th2 = th5;
                C3189i.f(iVar);
                X5.a.E(U10);
                throw th2;
            }
        }

        /* renamed from: s */
        public void i(C3189i iVar, int i10) {
            if (!C3297c.f(i10)) {
                if (this.f39916g != null && iVar != null && iVar.q() != null) {
                    try {
                        t(r(this.f39916g, iVar));
                    } catch (IOException e10) {
                        U5.a.n("PartialDiskCacheProducer", "Error while merging image data", e10);
                        p().a(e10);
                    } catch (Throwable th2) {
                        iVar.close();
                        this.f39916g.close();
                        throw th2;
                    }
                    iVar.close();
                    this.f39916g.close();
                    ((C3080c) this.f39912c.get()).b().s(this.f39913d);
                } else if (!this.f39917h || !C3297c.n(i10, 8) || !C3297c.e(i10) || iVar == null || iVar.y() == O6.c.f33387d) {
                    p().c(iVar, i10);
                } else {
                    ((C3080c) this.f39912c.get()).b().p(this.f39913d, iVar);
                    p().c(iVar, i10);
                }
            }
        }

        private c(C3308n nVar, n nVar2, M5.d dVar, i iVar, W5.a aVar, C3189i iVar2, boolean z10) {
            super(nVar);
            this.f39912c = nVar2;
            this.f39913d = dVar;
            this.f39914e = iVar;
            this.f39915f = aVar;
            this.f39916g = iVar2;
            this.f39917h = z10;
        }
    }

    public Y(n nVar, k kVar, i iVar, W5.a aVar, d0 d0Var) {
        this.f39900a = nVar;
        this.f39901b = kVar;
        this.f39902c = iVar;
        this.f39903d = aVar;
        this.f39904e = d0Var;
    }

    private static Uri e(C3593b bVar) {
        return bVar.v().buildUpon().appendQueryParameter("fresco_partial", com.amazon.a.a.o.b.f37475af).build();
    }

    static Map f(g0 g0Var, e0 e0Var, boolean z10, int i10) {
        if (!g0Var.f(e0Var, "PartialDiskCacheProducer")) {
            return null;
        }
        if (z10) {
            return g.of("cached_value_found", String.valueOf(z10), "encodedImageSize", String.valueOf(i10));
        }
        return g.of("cached_value_found", String.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static boolean g(f fVar) {
        if (fVar.l() || (fVar.n() && (fVar.i() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    private d h(C3308n nVar, e0 e0Var, M5.d dVar) {
        return new a(e0Var.y(), e0Var, nVar, dVar);
    }

    /* access modifiers changed from: private */
    public void i(C3308n nVar, e0 e0Var, M5.d dVar, C3189i iVar) {
        this.f39904e.b(new c(nVar, this.f39900a, dVar, this.f39902c, this.f39903d, iVar, e0Var.F().y(32)), e0Var);
    }

    private void j(AtomicBoolean atomicBoolean, e0 e0Var) {
        e0Var.b(new b(atomicBoolean));
    }

    public void b(C3308n nVar, e0 e0Var) {
        C3593b F10 = e0Var.F();
        boolean y10 = e0Var.F().y(16);
        boolean y11 = e0Var.F().y(32);
        if (y10 || y11) {
            g0 y12 = e0Var.y();
            y12.d(e0Var, "PartialDiskCacheProducer");
            M5.d c10 = this.f39901b.c(F10, e(F10), e0Var.a());
            if (!y10) {
                y12.j(e0Var, "PartialDiskCacheProducer", f(y12, e0Var, false, 0));
                i(nVar, e0Var, c10, (C3189i) null);
                return;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ((C3080c) this.f39900a.get()).b().m(c10, atomicBoolean).e(h(nVar, e0Var, c10));
            j(atomicBoolean, e0Var);
            return;
        }
        this.f39904e.b(nVar, e0Var);
    }
}
