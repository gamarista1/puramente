package com.facebook.imagepipeline.producers;

import T5.g;
import T5.k;
import U6.d;
import c7.C3185e;
import c7.C3186f;
import i7.C3595d;
import java.util.Map;
import java.util.concurrent.Executor;

public class b0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f39926a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d f39927b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Executor f39928c;

    private class a extends C3313t {

        /* renamed from: c  reason: collision with root package name */
        private final g0 f39929c;

        /* renamed from: d  reason: collision with root package name */
        private final e0 f39930d;

        /* renamed from: e  reason: collision with root package name */
        private final C3595d f39931e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f39932f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public X5.a f39933g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f39934h = 0;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public boolean f39935i = false;

        /* renamed from: j  reason: collision with root package name */
        private boolean f39936j = false;

        /* renamed from: com.facebook.imagepipeline.producers.b0$a$a  reason: collision with other inner class name */
        class C0631a extends C3300f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b0 f39938a;

            C0631a(b0 b0Var) {
                this.f39938a = b0Var;
            }

            public void b() {
                a.this.C();
            }
        }

        class b implements Runnable {
            b() {
            }

            public void run() {
                X5.a q10;
                int r10;
                synchronized (a.this) {
                    q10 = a.this.f39933g;
                    r10 = a.this.f39934h;
                    a.this.f39933g = null;
                    a.this.f39935i = false;
                }
                if (X5.a.T(q10)) {
                    try {
                        a.this.z(q10, r10);
                    } finally {
                        X5.a.E(q10);
                    }
                }
                a.this.x();
            }
        }

        public a(C3308n nVar, g0 g0Var, C3595d dVar, e0 e0Var) {
            super(nVar);
            this.f39929c = g0Var;
            this.f39931e = dVar;
            this.f39930d = e0Var;
            e0Var.b(new C0631a(b0.this));
        }

        private Map A(g0 g0Var, e0 e0Var, C3595d dVar) {
            if (!g0Var.f(e0Var, "PostprocessorProducer")) {
                return null;
            }
            return g.of("Postprocessor", dVar.getName());
        }

        private synchronized boolean B() {
            return this.f39932f;
        }

        /* access modifiers changed from: private */
        public void C() {
            if (y()) {
                p().b();
            }
        }

        private void D(Throwable th2) {
            if (y()) {
                p().a(th2);
            }
        }

        private void E(X5.a aVar, int i10) {
            boolean e10 = C3297c.e(i10);
            if ((!e10 && !B()) || (e10 && y())) {
                p().c(aVar, i10);
            }
        }

        private X5.a G(C3185e eVar) {
            C3186f fVar = (C3186f) eVar;
            X5.a b10 = this.f39931e.b(fVar.h1(), b0.this.f39927b);
            try {
                C3186f l12 = C3186f.l1(b10, eVar.d1(), fVar.M0(), fVar.y0());
                l12.I(fVar.getExtras());
                return X5.a.U(l12);
            } finally {
                X5.a.E(b10);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized boolean H() {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f39932f     // Catch:{ all -> 0x001a }
                if (r0 != 0) goto L_0x001c
                boolean r0 = r1.f39935i     // Catch:{ all -> 0x001a }
                if (r0 == 0) goto L_0x001c
                boolean r0 = r1.f39936j     // Catch:{ all -> 0x001a }
                if (r0 != 0) goto L_0x001c
                X5.a r0 = r1.f39933g     // Catch:{ all -> 0x001a }
                boolean r0 = X5.a.T(r0)     // Catch:{ all -> 0x001a }
                if (r0 == 0) goto L_0x001c
                r0 = 1
                r1.f39936j = r0     // Catch:{ all -> 0x001a }
                monitor-exit(r1)
                return r0
            L_0x001a:
                r0 = move-exception
                goto L_0x001f
            L_0x001c:
                monitor-exit(r1)
                r0 = 0
                return r0
            L_0x001f:
                monitor-exit(r1)     // Catch:{ all -> 0x001a }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.b0.a.H():boolean");
        }

        private boolean I(C3185e eVar) {
            return eVar instanceof C3186f;
        }

        private void J() {
            b0.this.f39928c.execute(new b());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            X5.a.E(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r2 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            J();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void K(X5.a r2, int r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f39932f     // Catch:{ all -> 0x0007 }
                if (r0 == 0) goto L_0x0009
                monitor-exit(r1)     // Catch:{ all -> 0x0007 }
                return
            L_0x0007:
                r2 = move-exception
                goto L_0x0024
            L_0x0009:
                X5.a r0 = r1.f39933g     // Catch:{ all -> 0x0007 }
                X5.a r2 = X5.a.t(r2)     // Catch:{ all -> 0x0007 }
                r1.f39933g = r2     // Catch:{ all -> 0x0007 }
                r1.f39934h = r3     // Catch:{ all -> 0x0007 }
                r2 = 1
                r1.f39935i = r2     // Catch:{ all -> 0x0007 }
                boolean r2 = r1.H()     // Catch:{ all -> 0x0007 }
                monitor-exit(r1)     // Catch:{ all -> 0x0007 }
                X5.a.E(r0)
                if (r2 == 0) goto L_0x0023
                r1.J()
            L_0x0023:
                return
            L_0x0024:
                monitor-exit(r1)     // Catch:{ all -> 0x0007 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.b0.a.K(X5.a, int):void");
        }

        /* access modifiers changed from: private */
        public void x() {
            boolean H10;
            synchronized (this) {
                this.f39936j = false;
                H10 = H();
            }
            if (H10) {
                J();
            }
        }

        private boolean y() {
            synchronized (this) {
                try {
                    if (this.f39932f) {
                        return false;
                    }
                    X5.a aVar = this.f39933g;
                    this.f39933g = null;
                    this.f39932f = true;
                    X5.a.E(aVar);
                    return true;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public void z(X5.a aVar, int i10) {
            k.b(Boolean.valueOf(X5.a.T(aVar)));
            if (!I((C3185e) aVar.I())) {
                E(aVar, i10);
                return;
            }
            this.f39929c.d(this.f39930d, "PostprocessorProducer");
            X5.a aVar2 = null;
            try {
                aVar2 = G((C3185e) aVar.I());
                g0 g0Var = this.f39929c;
                e0 e0Var = this.f39930d;
                g0Var.j(e0Var, "PostprocessorProducer", A(g0Var, e0Var, this.f39931e));
                E(aVar2, i10);
            } catch (Exception e10) {
                g0 g0Var2 = this.f39929c;
                e0 e0Var2 = this.f39930d;
                g0Var2.k(e0Var2, "PostprocessorProducer", e10, A(g0Var2, e0Var2, this.f39931e));
                D(e10);
            } finally {
                X5.a.E(aVar2);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public void i(X5.a aVar, int i10) {
            if (X5.a.T(aVar)) {
                K(aVar, i10);
            } else if (C3297c.e(i10)) {
                E((X5.a) null, i10);
            }
        }

        /* access modifiers changed from: protected */
        public void g() {
            C();
        }

        /* access modifiers changed from: protected */
        public void h(Throwable th2) {
            D(th2);
        }
    }

    class b extends C3313t {
        /* access modifiers changed from: protected */
        /* renamed from: q */
        public void i(X5.a aVar, int i10) {
            if (!C3297c.f(i10)) {
                p().c(aVar, i10);
            }
        }

        private b(a aVar) {
            super(aVar);
        }
    }

    public b0(d0 d0Var, d dVar, Executor executor) {
        this.f39926a = (d0) k.g(d0Var);
        this.f39927b = dVar;
        this.f39928c = (Executor) k.g(executor);
    }

    public void b(C3308n nVar, e0 e0Var) {
        g0 y10 = e0Var.y();
        C3595d l10 = e0Var.F().l();
        k.g(l10);
        this.f39926a.b(new b(new a(nVar, y10, l10, e0Var)), e0Var);
    }
}
