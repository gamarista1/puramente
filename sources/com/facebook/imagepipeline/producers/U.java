package com.facebook.imagepipeline.producers;

import T5.k;
import T5.m;
import W6.f;
import android.util.Pair;
import b6.e;
import j7.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class U implements d0 {

    /* renamed from: a  reason: collision with root package name */
    final Map f39879a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final d0 f39880b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final boolean f39881c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f39882d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final String f39883e;

    class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f39884a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final CopyOnWriteArraySet f39885b = m.a();

        /* renamed from: c  reason: collision with root package name */
        private Closeable f39886c;

        /* renamed from: d  reason: collision with root package name */
        private float f39887d;

        /* renamed from: e  reason: collision with root package name */
        private int f39888e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C3299e f39889f;

        /* renamed from: g  reason: collision with root package name */
        private b f39890g;

        /* renamed from: com.facebook.imagepipeline.producers.U$a$a  reason: collision with other inner class name */
        class C0629a extends C3300f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Pair f39892a;

            C0629a(Pair pair) {
                this.f39892a = pair;
            }

            public void a() {
                C3299e.g(a.this.r());
            }

            public void b() {
                boolean remove;
                List list;
                List list2;
                List list3;
                C3299e eVar;
                synchronized (a.this) {
                    try {
                        remove = a.this.f39885b.remove(this.f39892a);
                        list = null;
                        if (!remove) {
                            eVar = null;
                            list3 = null;
                        } else if (a.this.f39885b.isEmpty()) {
                            eVar = a.this.f39889f;
                            list3 = null;
                        } else {
                            List e10 = a.this.s();
                            list3 = a.this.t();
                            list2 = a.this.r();
                            List list4 = e10;
                            eVar = null;
                            list = list4;
                        }
                        list2 = list3;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
                C3299e.h(list);
                C3299e.i(list3);
                C3299e.g(list2);
                if (eVar != null) {
                    if (!U.this.f39881c || eVar.M()) {
                        eVar.j();
                    } else {
                        C3299e.i(eVar.r(f.LOW));
                    }
                }
                if (remove) {
                    ((C3308n) this.f39892a.first).b();
                }
            }

            public void c() {
                C3299e.i(a.this.t());
            }

            public void d() {
                C3299e.h(a.this.s());
            }
        }

        private class b extends C3297c {
            /* access modifiers changed from: protected */
            public void g() {
                try {
                    if (j7.b.d()) {
                        j7.b.a("MultiplexProducer#onCancellation");
                    }
                    a.this.m(this);
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                } catch (Throwable th2) {
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                    throw th2;
                }
            }

            /* access modifiers changed from: protected */
            public void h(Throwable th2) {
                try {
                    if (j7.b.d()) {
                        j7.b.a("MultiplexProducer#onFailure");
                    }
                    a.this.n(this, th2);
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                } catch (Throwable th3) {
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                    throw th3;
                }
            }

            /* access modifiers changed from: protected */
            public void j(float f10) {
                try {
                    if (j7.b.d()) {
                        j7.b.a("MultiplexProducer#onProgressUpdate");
                    }
                    a.this.p(this, f10);
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                } catch (Throwable th2) {
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                    throw th2;
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: p */
            public void i(Closeable closeable, int i10) {
                try {
                    if (j7.b.d()) {
                        j7.b.a("MultiplexProducer#onNewResult");
                    }
                    a.this.o(this, closeable, i10);
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                } catch (Throwable th2) {
                    if (j7.b.d()) {
                        j7.b.b();
                    }
                    throw th2;
                }
            }

            private b() {
            }
        }

        public a(Object obj) {
            this.f39884a = obj;
        }

        private void g(Pair pair, e0 e0Var) {
            e0Var.b(new C0629a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        private synchronized boolean j() {
            Iterator it = this.f39885b.iterator();
            while (it.hasNext()) {
                if (((e0) ((Pair) it.next()).second).E()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator it = this.f39885b.iterator();
            while (it.hasNext()) {
                if (!((e0) ((Pair) it.next()).second).M()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized f l() {
            f fVar;
            fVar = f.LOW;
            Iterator it = this.f39885b.iterator();
            while (it.hasNext()) {
                fVar = f.b(fVar, ((e0) ((Pair) it.next()).second).q());
            }
            return fVar;
        }

        /* access modifiers changed from: private */
        public void q(e eVar) {
            boolean z10;
            synchronized (this) {
                try {
                    boolean z11 = false;
                    if (this.f39889f == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    k.b(Boolean.valueOf(z10));
                    if (this.f39890g == null) {
                        z11 = true;
                    }
                    k.b(Boolean.valueOf(z11));
                    if (this.f39885b.isEmpty()) {
                        U.this.k(this.f39884a, this);
                        return;
                    }
                    e0 e0Var = (e0) ((Pair) this.f39885b.iterator().next()).second;
                    C3299e eVar2 = new C3299e(e0Var.F(), e0Var.getId(), e0Var.y(), e0Var.a(), e0Var.T(), k(), j(), l(), e0Var.f());
                    this.f39889f = eVar2;
                    eVar2.I(e0Var.getExtras());
                    if (eVar.b()) {
                        this.f39889f.t("started_as_prefetch", Boolean.valueOf(eVar.a()));
                    }
                    b bVar = new b();
                    this.f39890g = bVar;
                    C3299e eVar3 = this.f39889f;
                    U.this.f39880b.b(bVar, eVar3);
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public synchronized List r() {
            C3299e eVar = this.f39889f;
            if (eVar == null) {
                return null;
            }
            return eVar.l(j());
        }

        /* access modifiers changed from: private */
        public synchronized List s() {
            C3299e eVar = this.f39889f;
            if (eVar == null) {
                return null;
            }
            return eVar.m(k());
        }

        /* access modifiers changed from: private */
        public synchronized List t() {
            C3299e eVar = this.f39889f;
            if (eVar == null) {
                return null;
            }
            return eVar.r(l());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            com.facebook.imagepipeline.producers.C3299e.h(r1);
            com.facebook.imagepipeline.producers.C3299e.i(r2);
            com.facebook.imagepipeline.producers.C3299e.g(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            if (r4 == r7.f39886c) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            if (r4 == null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            r4 = r7.f39891h.g(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
            if (r4 == null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            if (r5 <= 0.0f) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r8.d(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
            r8.c(r4, r6);
            i(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
            g(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0061, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            throw r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0065, code lost:
            throw r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean h(com.facebook.imagepipeline.producers.C3308n r8, com.facebook.imagepipeline.producers.e0 r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                com.facebook.imagepipeline.producers.U r1 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0012 }
                java.lang.Object r2 = r7.f39884a     // Catch:{ all -> 0x0012 }
                com.facebook.imagepipeline.producers.U$a r1 = r1.i(r2)     // Catch:{ all -> 0x0012 }
                if (r1 == r7) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0012 }
                r8 = 0
                return r8
            L_0x0012:
                r8 = move-exception
                goto L_0x0066
            L_0x0014:
                java.util.concurrent.CopyOnWriteArraySet r1 = r7.f39885b     // Catch:{ all -> 0x0012 }
                r1.add(r0)     // Catch:{ all -> 0x0012 }
                java.util.List r1 = r7.s()     // Catch:{ all -> 0x0012 }
                java.util.List r2 = r7.t()     // Catch:{ all -> 0x0012 }
                java.util.List r3 = r7.r()     // Catch:{ all -> 0x0012 }
                java.io.Closeable r4 = r7.f39886c     // Catch:{ all -> 0x0012 }
                float r5 = r7.f39887d     // Catch:{ all -> 0x0012 }
                int r6 = r7.f39888e     // Catch:{ all -> 0x0012 }
                monitor-exit(r7)     // Catch:{ all -> 0x0012 }
                com.facebook.imagepipeline.producers.C3299e.h(r1)
                com.facebook.imagepipeline.producers.C3299e.i(r2)
                com.facebook.imagepipeline.producers.C3299e.g(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x0054 }
                java.io.Closeable r1 = r7.f39886c     // Catch:{ all -> 0x0046 }
                if (r4 == r1) goto L_0x003d
                r4 = 0
                goto L_0x0048
            L_0x003d:
                if (r4 == 0) goto L_0x0048
                com.facebook.imagepipeline.producers.U r1 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0046 }
                java.io.Closeable r4 = r1.g(r4)     // Catch:{ all -> 0x0046 }
                goto L_0x0048
            L_0x0046:
                r8 = move-exception
                goto L_0x0062
            L_0x0048:
                monitor-exit(r7)     // Catch:{ all -> 0x0046 }
                if (r4 == 0) goto L_0x005c
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x0056
                r8.d(r5)     // Catch:{ all -> 0x0054 }
                goto L_0x0056
            L_0x0054:
                r8 = move-exception
                goto L_0x0064
            L_0x0056:
                r8.c(r4, r6)     // Catch:{ all -> 0x0054 }
                r7.i(r4)     // Catch:{ all -> 0x0054 }
            L_0x005c:
                monitor-exit(r0)     // Catch:{ all -> 0x0054 }
                r7.g(r0, r9)
                r8 = 1
                return r8
            L_0x0062:
                monitor-exit(r7)     // Catch:{ all -> 0x0046 }
                throw r8     // Catch:{ all -> 0x0054 }
            L_0x0064:
                monitor-exit(r0)     // Catch:{ all -> 0x0054 }
                throw r8
            L_0x0066:
                monitor-exit(r7)     // Catch:{ all -> 0x0012 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.U.a.h(com.facebook.imagepipeline.producers.n, com.facebook.imagepipeline.producers.e0):boolean");
        }

        public void m(b bVar) {
            synchronized (this) {
                try {
                    if (this.f39890g == bVar) {
                        this.f39890g = null;
                        this.f39889f = null;
                        i(this.f39886c);
                        this.f39886c = null;
                        q(e.UNSET);
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
            if (r6.hasNext() == false) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
            r1 = (android.util.Pair) r6.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            ((com.facebook.imagepipeline.producers.e0) r1.second).y().k((com.facebook.imagepipeline.producers.e0) r1.second, com.facebook.imagepipeline.producers.U.f(r5.f39891h), r7, (java.util.Map) null);
            r2 = r5.f39889f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            if (r2 == null) goto L_0x0058;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            ((com.facebook.imagepipeline.producers.e0) r1.second).I(r2.getExtras());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
            ((com.facebook.imagepipeline.producers.C3308n) r1.first).a(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
            throw r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void n(com.facebook.imagepipeline.producers.U.a.b r6, java.lang.Throwable r7) {
            /*
                r5 = this;
                monitor-enter(r5)
                com.facebook.imagepipeline.producers.U$a$b r0 = r5.f39890g     // Catch:{ all -> 0x0007 }
                if (r0 == r6) goto L_0x0009
                monitor-exit(r5)     // Catch:{ all -> 0x0007 }
                return
            L_0x0007:
                r6 = move-exception
                goto L_0x0064
            L_0x0009:
                java.util.concurrent.CopyOnWriteArraySet r6 = r5.f39885b     // Catch:{ all -> 0x0007 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0007 }
                java.util.concurrent.CopyOnWriteArraySet r0 = r5.f39885b     // Catch:{ all -> 0x0007 }
                r0.clear()     // Catch:{ all -> 0x0007 }
                com.facebook.imagepipeline.producers.U r0 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0007 }
                java.lang.Object r1 = r5.f39884a     // Catch:{ all -> 0x0007 }
                r0.k(r1, r5)     // Catch:{ all -> 0x0007 }
                java.io.Closeable r0 = r5.f39886c     // Catch:{ all -> 0x0007 }
                r5.i(r0)     // Catch:{ all -> 0x0007 }
                r0 = 0
                r5.f39886c = r0     // Catch:{ all -> 0x0007 }
                monitor-exit(r5)     // Catch:{ all -> 0x0007 }
            L_0x0024:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0063
                java.lang.Object r1 = r6.next()
                android.util.Pair r1 = (android.util.Pair) r1
                monitor-enter(r1)
                java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0056 }
                com.facebook.imagepipeline.producers.e0 r2 = (com.facebook.imagepipeline.producers.e0) r2     // Catch:{ all -> 0x0056 }
                com.facebook.imagepipeline.producers.g0 r2 = r2.y()     // Catch:{ all -> 0x0056 }
                java.lang.Object r3 = r1.second     // Catch:{ all -> 0x0056 }
                com.facebook.imagepipeline.producers.e0 r3 = (com.facebook.imagepipeline.producers.e0) r3     // Catch:{ all -> 0x0056 }
                com.facebook.imagepipeline.producers.U r4 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0056 }
                java.lang.String r4 = r4.f39882d     // Catch:{ all -> 0x0056 }
                r2.k(r3, r4, r7, r0)     // Catch:{ all -> 0x0056 }
                com.facebook.imagepipeline.producers.e r2 = r5.f39889f     // Catch:{ all -> 0x0056 }
                if (r2 == 0) goto L_0x0058
                java.lang.Object r3 = r1.second     // Catch:{ all -> 0x0056 }
                com.facebook.imagepipeline.producers.e0 r3 = (com.facebook.imagepipeline.producers.e0) r3     // Catch:{ all -> 0x0056 }
                java.util.Map r2 = r2.getExtras()     // Catch:{ all -> 0x0056 }
                r3.I(r2)     // Catch:{ all -> 0x0056 }
                goto L_0x0058
            L_0x0056:
                r6 = move-exception
                goto L_0x0061
            L_0x0058:
                java.lang.Object r2 = r1.first     // Catch:{ all -> 0x0056 }
                com.facebook.imagepipeline.producers.n r2 = (com.facebook.imagepipeline.producers.C3308n) r2     // Catch:{ all -> 0x0056 }
                r2.a(r7)     // Catch:{ all -> 0x0056 }
                monitor-exit(r1)     // Catch:{ all -> 0x0056 }
                goto L_0x0024
            L_0x0061:
                monitor-exit(r1)     // Catch:{ all -> 0x0056 }
                throw r6
            L_0x0063:
                return
            L_0x0064:
                monitor-exit(r5)     // Catch:{ all -> 0x0007 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.U.a.n(com.facebook.imagepipeline.producers.U$a$b, java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            if (r0.hasNext() == false) goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
            r2 = (android.util.Pair) r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
            if (com.facebook.imagepipeline.producers.C3297c.e(r9) == false) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
            ((com.facebook.imagepipeline.producers.e0) r2.second).y().j((com.facebook.imagepipeline.producers.e0) r2.second, com.facebook.imagepipeline.producers.U.f(r6.f39891h), (java.util.Map) null);
            r3 = r6.f39889f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
            if (r3 == null) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
            ((com.facebook.imagepipeline.producers.e0) r2.second).I(r3.getExtras());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
            r7 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
            ((com.facebook.imagepipeline.producers.e0) r2.second).t(com.facebook.imagepipeline.producers.U.c(r6.f39891h), java.lang.Integer.valueOf(r1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0087, code lost:
            ((com.facebook.imagepipeline.producers.C3308n) r2.first).c(r8, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
            throw r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0092, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void o(com.facebook.imagepipeline.producers.U.a.b r7, java.io.Closeable r8, int r9) {
            /*
                r6 = this;
                monitor-enter(r6)
                com.facebook.imagepipeline.producers.U$a$b r0 = r6.f39890g     // Catch:{ all -> 0x0007 }
                if (r0 == r7) goto L_0x000a
                monitor-exit(r6)     // Catch:{ all -> 0x0007 }
                return
            L_0x0007:
                r7 = move-exception
                goto L_0x0093
            L_0x000a:
                java.io.Closeable r7 = r6.f39886c     // Catch:{ all -> 0x0007 }
                r6.i(r7)     // Catch:{ all -> 0x0007 }
                r7 = 0
                r6.f39886c = r7     // Catch:{ all -> 0x0007 }
                java.util.concurrent.CopyOnWriteArraySet r0 = r6.f39885b     // Catch:{ all -> 0x0007 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0007 }
                java.util.concurrent.CopyOnWriteArraySet r1 = r6.f39885b     // Catch:{ all -> 0x0007 }
                int r1 = r1.size()     // Catch:{ all -> 0x0007 }
                boolean r2 = com.facebook.imagepipeline.producers.C3297c.f(r9)     // Catch:{ all -> 0x0007 }
                if (r2 == 0) goto L_0x002f
                com.facebook.imagepipeline.producers.U r2 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0007 }
                java.io.Closeable r2 = r2.g(r8)     // Catch:{ all -> 0x0007 }
                r6.f39886c = r2     // Catch:{ all -> 0x0007 }
                r6.f39888e = r9     // Catch:{ all -> 0x0007 }
                goto L_0x003b
            L_0x002f:
                java.util.concurrent.CopyOnWriteArraySet r2 = r6.f39885b     // Catch:{ all -> 0x0007 }
                r2.clear()     // Catch:{ all -> 0x0007 }
                com.facebook.imagepipeline.producers.U r2 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0007 }
                java.lang.Object r3 = r6.f39884a     // Catch:{ all -> 0x0007 }
                r2.k(r3, r6)     // Catch:{ all -> 0x0007 }
            L_0x003b:
                monitor-exit(r6)     // Catch:{ all -> 0x0007 }
            L_0x003c:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0092
                java.lang.Object r2 = r0.next()
                android.util.Pair r2 = (android.util.Pair) r2
                monitor-enter(r2)
                boolean r3 = com.facebook.imagepipeline.producers.C3297c.e(r9)     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x0087
                java.lang.Object r3 = r2.second     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.e0 r3 = (com.facebook.imagepipeline.producers.e0) r3     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.g0 r3 = r3.y()     // Catch:{ all -> 0x0074 }
                java.lang.Object r4 = r2.second     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.e0 r4 = (com.facebook.imagepipeline.producers.e0) r4     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.U r5 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0074 }
                java.lang.String r5 = r5.f39882d     // Catch:{ all -> 0x0074 }
                r3.j(r4, r5, r7)     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.e r3 = r6.f39889f     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x0076
                java.lang.Object r4 = r2.second     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.e0 r4 = (com.facebook.imagepipeline.producers.e0) r4     // Catch:{ all -> 0x0074 }
                java.util.Map r3 = r3.getExtras()     // Catch:{ all -> 0x0074 }
                r4.I(r3)     // Catch:{ all -> 0x0074 }
                goto L_0x0076
            L_0x0074:
                r7 = move-exception
                goto L_0x0090
            L_0x0076:
                java.lang.Object r3 = r2.second     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.e0 r3 = (com.facebook.imagepipeline.producers.e0) r3     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.U r4 = com.facebook.imagepipeline.producers.U.this     // Catch:{ all -> 0x0074 }
                java.lang.String r4 = r4.f39883e     // Catch:{ all -> 0x0074 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0074 }
                r3.t(r4, r5)     // Catch:{ all -> 0x0074 }
            L_0x0087:
                java.lang.Object r3 = r2.first     // Catch:{ all -> 0x0074 }
                com.facebook.imagepipeline.producers.n r3 = (com.facebook.imagepipeline.producers.C3308n) r3     // Catch:{ all -> 0x0074 }
                r3.c(r8, r9)     // Catch:{ all -> 0x0074 }
                monitor-exit(r2)     // Catch:{ all -> 0x0074 }
                goto L_0x003c
            L_0x0090:
                monitor-exit(r2)     // Catch:{ all -> 0x0074 }
                throw r7
            L_0x0092:
                return
            L_0x0093:
                monitor-exit(r6)     // Catch:{ all -> 0x0007 }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.U.a.o(com.facebook.imagepipeline.producers.U$a$b, java.io.Closeable, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
            if (r3.hasNext() == false) goto L_0x002b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
            r0 = (android.util.Pair) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            ((com.facebook.imagepipeline.producers.C3308n) r0.first).d(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void p(com.facebook.imagepipeline.producers.U.a.b r3, float r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                com.facebook.imagepipeline.producers.U$a$b r0 = r2.f39890g     // Catch:{ all -> 0x0007 }
                if (r0 == r3) goto L_0x0009
                monitor-exit(r2)     // Catch:{ all -> 0x0007 }
                return
            L_0x0007:
                r3 = move-exception
                goto L_0x002c
            L_0x0009:
                r2.f39887d = r4     // Catch:{ all -> 0x0007 }
                java.util.concurrent.CopyOnWriteArraySet r3 = r2.f39885b     // Catch:{ all -> 0x0007 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0007 }
                monitor-exit(r2)     // Catch:{ all -> 0x0007 }
            L_0x0012:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x002b
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0028 }
                com.facebook.imagepipeline.producers.n r1 = (com.facebook.imagepipeline.producers.C3308n) r1     // Catch:{ all -> 0x0028 }
                r1.d(r4)     // Catch:{ all -> 0x0028 }
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                goto L_0x0012
            L_0x0028:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r3
            L_0x002b:
                return
            L_0x002c:
                monitor-exit(r2)     // Catch:{ all -> 0x0007 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.U.a.p(com.facebook.imagepipeline.producers.U$a$b, float):void");
        }
    }

    protected U(d0 d0Var, String str, String str2) {
        this(d0Var, str, str2, false);
    }

    private synchronized a h(Object obj) {
        a aVar;
        aVar = new a(obj);
        this.f39879a.put(obj, aVar);
        return aVar;
    }

    public void b(C3308n nVar, e0 e0Var) {
        a i10;
        boolean z10;
        try {
            if (b.d()) {
                b.a("MultiplexProducer#produceResults");
            }
            e0Var.y().d(e0Var, this.f39882d);
            Object j10 = j(e0Var);
            do {
                synchronized (this) {
                    i10 = i(j10);
                    if (i10 == null) {
                        i10 = h(j10);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            } while (!i10.h(nVar, e0Var));
            if (z10) {
                i10.q(e.c(e0Var.M()));
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
    public abstract Closeable g(Closeable closeable);

    /* access modifiers changed from: protected */
    public synchronized a i(Object obj) {
        return (a) this.f39879a.get(obj);
    }

    /* access modifiers changed from: protected */
    public abstract Object j(e0 e0Var);

    /* access modifiers changed from: protected */
    public synchronized void k(Object obj, a aVar) {
        if (this.f39879a.get(obj) == aVar) {
            this.f39879a.remove(obj);
        }
    }

    protected U(d0 d0Var, String str, String str2, boolean z10) {
        this.f39880b = d0Var;
        this.f39879a = new HashMap();
        this.f39881c = z10;
        this.f39882d = str;
        this.f39883e = str2;
    }
}
