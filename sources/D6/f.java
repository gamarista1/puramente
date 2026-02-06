package d6;

import T5.i;
import T5.k;
import T5.n;
import io.intercom.android.sdk.models.AttributeType;
import java.util.List;

public class f implements n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final List f43156a;

    private class a extends C3475a {

        /* renamed from: h  reason: collision with root package name */
        private int f43157h = 0;

        /* renamed from: i  reason: collision with root package name */
        private C3477c f43158i = null;

        /* renamed from: j  reason: collision with root package name */
        private C3477c f43159j = null;

        /* renamed from: d6.f$a$a  reason: collision with other inner class name */
        private class C0666a implements e {
            public void b(C3477c cVar) {
                a.this.s(Math.max(a.this.f(), cVar.f()));
            }

            public void c(C3477c cVar) {
                if (cVar.b()) {
                    a.this.F(cVar);
                } else if (cVar.c()) {
                    a.this.E(cVar);
                }
            }

            public void d(C3477c cVar) {
                a.this.E(cVar);
            }

            private C0666a() {
            }

            public void a(C3477c cVar) {
            }
        }

        public a() {
            if (!H()) {
                p(new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        private void A(C3477c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        private synchronized C3477c B() {
            return this.f43159j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized T5.n C() {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = r3.k()     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x002b
                int r0 = r3.f43157h     // Catch:{ all -> 0x0029 }
                d6.f r1 = d6.f.this     // Catch:{ all -> 0x0029 }
                java.util.List r1 = r1.f43156a     // Catch:{ all -> 0x0029 }
                int r1 = r1.size()     // Catch:{ all -> 0x0029 }
                if (r0 >= r1) goto L_0x002b
                d6.f r0 = d6.f.this     // Catch:{ all -> 0x0029 }
                java.util.List r0 = r0.f43156a     // Catch:{ all -> 0x0029 }
                int r1 = r3.f43157h     // Catch:{ all -> 0x0029 }
                int r2 = r1 + 1
                r3.f43157h = r2     // Catch:{ all -> 0x0029 }
                java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0029 }
                T5.n r0 = (T5.n) r0     // Catch:{ all -> 0x0029 }
                monitor-exit(r3)
                return r0
            L_0x0029:
                r0 = move-exception
                goto L_0x002e
            L_0x002b:
                monitor-exit(r3)
                r0 = 0
                return r0
            L_0x002e:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.f.a.C():T5.n");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
            A(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void D(d6.C3477c r2, boolean r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                d6.c r0 = r1.f43158i     // Catch:{ all -> 0x0018 }
                if (r2 != r0) goto L_0x001a
                d6.c r0 = r1.f43159j     // Catch:{ all -> 0x0018 }
                if (r2 != r0) goto L_0x000a
                goto L_0x001a
            L_0x000a:
                if (r0 == 0) goto L_0x0011
                if (r3 == 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r0 = 0
                goto L_0x0013
            L_0x0011:
                r1.f43159j = r2     // Catch:{ all -> 0x0018 }
            L_0x0013:
                monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                r1.A(r0)
                return
            L_0x0018:
                r2 = move-exception
                goto L_0x001c
            L_0x001a:
                monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                return
            L_0x001c:
                monitor-exit(r1)     // Catch:{ all -> 0x0018 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.f.a.D(d6.c, boolean):void");
        }

        /* access modifiers changed from: private */
        public void E(C3477c cVar) {
            if (z(cVar)) {
                if (cVar != B()) {
                    A(cVar);
                }
                if (!H()) {
                    q(cVar.d(), cVar.getExtras());
                }
            }
        }

        /* access modifiers changed from: private */
        public void F(C3477c cVar) {
            D(cVar, cVar.c());
            if (cVar == B()) {
                u((Object) null, cVar.c(), cVar.getExtras());
            }
        }

        private synchronized boolean G(C3477c cVar) {
            if (k()) {
                return false;
            }
            this.f43158i = cVar;
            return true;
        }

        private boolean H() {
            C3477c cVar;
            n C10 = C();
            if (C10 != null) {
                cVar = (C3477c) C10.get();
            } else {
                cVar = null;
            }
            if (!G(cVar) || cVar == null) {
                A(cVar);
                return false;
            }
            cVar.e(new C0666a(), R5.a.a());
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized boolean z(d6.C3477c r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.k()     // Catch:{ all -> 0x0012 }
                if (r0 != 0) goto L_0x0014
                d6.c r0 = r1.f43158i     // Catch:{ all -> 0x0012 }
                if (r2 == r0) goto L_0x000c
                goto L_0x0014
            L_0x000c:
                r2 = 0
                r1.f43158i = r2     // Catch:{ all -> 0x0012 }
                monitor-exit(r1)
                r2 = 1
                return r2
            L_0x0012:
                r2 = move-exception
                goto L_0x0017
            L_0x0014:
                monitor-exit(r1)
                r2 = 0
                return r2
            L_0x0017:
                monitor-exit(r1)     // Catch:{ all -> 0x0012 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.f.a.z(d6.c):boolean");
        }

        public synchronized Object a() {
            Object obj;
            C3477c B10 = B();
            if (B10 != null) {
                obj = B10.a();
            } else {
                obj = null;
            }
            return obj;
        }

        public synchronized boolean b() {
            boolean z10;
            C3477c B10 = B();
            if (B10 == null || !B10.b()) {
                z10 = false;
            } else {
                z10 = true;
            }
            return z10;
        }

        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    C3477c cVar = this.f43158i;
                    this.f43158i = null;
                    C3477c cVar2 = this.f43159j;
                    this.f43159j = null;
                    A(cVar2);
                    A(cVar);
                    return true;
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
    }

    private f(List list) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f43156a = list;
    }

    public static f b(List list) {
        return new f(list);
    }

    /* renamed from: c */
    public C3477c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return i.a(this.f43156a, ((f) obj).f43156a);
    }

    public int hashCode() {
        return this.f43156a.hashCode();
    }

    public String toString() {
        return i.b(this).b(AttributeType.LIST, this.f43156a).toString();
    }
}
