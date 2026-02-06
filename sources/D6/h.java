package d6;

import T5.i;
import T5.k;
import T5.n;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class h implements n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final List f43162a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f43163b;

    private h(List list, boolean z10) {
        k.c(!list.isEmpty(), "List of suppliers is empty!");
        this.f43162a = list;
        this.f43163b = z10;
    }

    public static h c(List list, boolean z10) {
        return new h(list, z10);
    }

    /* renamed from: d */
    public C3477c get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return i.a(this.f43162a, ((h) obj).f43162a);
    }

    public int hashCode() {
        return this.f43162a.hashCode();
    }

    public String toString() {
        return i.b(this).b(AttributeType.LIST, this.f43162a).toString();
    }

    private class a extends C3475a {

        /* renamed from: h  reason: collision with root package name */
        private ArrayList f43164h;

        /* renamed from: i  reason: collision with root package name */
        private int f43165i;

        /* renamed from: j  reason: collision with root package name */
        private int f43166j;

        /* renamed from: k  reason: collision with root package name */
        private AtomicInteger f43167k;

        /* renamed from: l  reason: collision with root package name */
        private Throwable f43168l;

        /* renamed from: m  reason: collision with root package name */
        private Map f43169m;

        public a() {
            if (!h.this.f43163b) {
                A();
            }
        }

        private void A() {
            if (this.f43167k == null) {
                synchronized (this) {
                    try {
                        if (this.f43167k == null) {
                            int i10 = 0;
                            this.f43167k = new AtomicInteger(0);
                            int size = h.this.f43162a.size();
                            this.f43166j = size;
                            this.f43165i = size;
                            this.f43164h = new ArrayList(size);
                            while (true) {
                                if (i10 >= size) {
                                    break;
                                }
                                C3477c cVar = (C3477c) ((n) h.this.f43162a.get(i10)).get();
                                this.f43164h.add(cVar);
                                cVar.e(new C0667a(i10), R5.a.a());
                                if (cVar.b()) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d6.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized d6.C3477c B(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.util.ArrayList r0 = r2.f43164h     // Catch:{ all -> 0x0016 }
                r1 = 0
                if (r0 == 0) goto L_0x0018
                int r0 = r0.size()     // Catch:{ all -> 0x0016 }
                if (r3 >= r0) goto L_0x0018
                java.util.ArrayList r0 = r2.f43164h     // Catch:{ all -> 0x0016 }
                java.lang.Object r3 = r0.set(r3, r1)     // Catch:{ all -> 0x0016 }
                r1 = r3
                d6.c r1 = (d6.C3477c) r1     // Catch:{ all -> 0x0016 }
                goto L_0x0018
            L_0x0016:
                r3 = move-exception
                goto L_0x001a
            L_0x0018:
                monitor-exit(r2)
                return r1
            L_0x001a:
                monitor-exit(r2)     // Catch:{ all -> 0x0016 }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.h.a.B(int):d6.c");
        }

        private synchronized C3477c C(int i10) {
            C3477c cVar;
            ArrayList arrayList = this.f43164h;
            if (arrayList == null || i10 >= arrayList.size()) {
                cVar = null;
            } else {
                cVar = (C3477c) this.f43164h.get(i10);
            }
            return cVar;
        }

        private synchronized C3477c D() {
            return C(this.f43165i);
        }

        private void E() {
            Throwable th2;
            if (this.f43167k.incrementAndGet() == this.f43166j && (th2 = this.f43168l) != null) {
                q(th2, this.f43169m);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
            if (r0 <= r3) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
            z(B(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void F(int r3, d6.C3477c r4, boolean r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f43165i     // Catch:{ all -> 0x001b }
                d6.c r1 = r2.C(r3)     // Catch:{ all -> 0x001b }
                if (r4 != r1) goto L_0x002f
                int r4 = r2.f43165i     // Catch:{ all -> 0x001b }
                if (r3 != r4) goto L_0x000e
                goto L_0x002f
            L_0x000e:
                d6.c r4 = r2.D()     // Catch:{ all -> 0x001b }
                if (r4 == 0) goto L_0x001f
                if (r5 == 0) goto L_0x001d
                int r4 = r2.f43165i     // Catch:{ all -> 0x001b }
                if (r3 >= r4) goto L_0x001d
                goto L_0x001f
            L_0x001b:
                r3 = move-exception
                goto L_0x0031
            L_0x001d:
                r3 = r0
                goto L_0x0021
            L_0x001f:
                r2.f43165i = r3     // Catch:{ all -> 0x001b }
            L_0x0021:
                monitor-exit(r2)     // Catch:{ all -> 0x001b }
            L_0x0022:
                if (r0 <= r3) goto L_0x002e
                d6.c r4 = r2.B(r0)
                r2.z(r4)
                int r0 = r0 + -1
                goto L_0x0022
            L_0x002e:
                return
            L_0x002f:
                monitor-exit(r2)     // Catch:{ all -> 0x001b }
                return
            L_0x0031:
                monitor-exit(r2)     // Catch:{ all -> 0x001b }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.h.a.F(int, d6.c, boolean):void");
        }

        /* access modifiers changed from: private */
        public void G(int i10, C3477c cVar) {
            z(I(i10, cVar));
            if (i10 == 0) {
                this.f43168l = cVar.d();
                this.f43169m = cVar.getExtras();
            }
            E();
        }

        /* access modifiers changed from: private */
        public void H(int i10, C3477c cVar) {
            boolean z10;
            F(i10, cVar, cVar.c());
            if (cVar == D()) {
                if (i10 != 0 || !cVar.c()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u((Object) null, z10, cVar.getExtras());
            }
            E();
        }

        private synchronized C3477c I(int i10, C3477c cVar) {
            if (cVar == D()) {
                return null;
            }
            if (cVar != C(i10)) {
                return cVar;
            }
            return B(i10);
        }

        private void z(C3477c cVar) {
            if (cVar != null) {
                cVar.close();
            }
        }

        public synchronized Object a() {
            Object obj;
            try {
                if (h.this.f43163b) {
                    A();
                }
                C3477c D10 = D();
                if (D10 != null) {
                    obj = D10.a();
                } else {
                    obj = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return obj;
        }

        public synchronized boolean b() {
            boolean z10;
            try {
                if (h.this.f43163b) {
                    A();
                }
                C3477c D10 = D();
                if (D10 == null || !D10.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return z10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r1 >= r0.size()) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
            z((d6.C3477c) r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean close() {
            /*
                r3 = this;
                d6.h r0 = d6.h.this
                boolean r0 = r0.f43163b
                if (r0 == 0) goto L_0x000b
                r3.A()
            L_0x000b:
                monitor-enter(r3)
                boolean r0 = super.close()     // Catch:{ all -> 0x0015 }
                r1 = 0
                if (r0 != 0) goto L_0x0017
                monitor-exit(r3)     // Catch:{ all -> 0x0015 }
                return r1
            L_0x0015:
                r0 = move-exception
                goto L_0x0033
            L_0x0017:
                java.util.ArrayList r0 = r3.f43164h     // Catch:{ all -> 0x0015 }
                r2 = 0
                r3.f43164h = r2     // Catch:{ all -> 0x0015 }
                monitor-exit(r3)     // Catch:{ all -> 0x0015 }
                if (r0 == 0) goto L_0x0031
            L_0x001f:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x0031
                java.lang.Object r2 = r0.get(r1)
                d6.c r2 = (d6.C3477c) r2
                r3.z(r2)
                int r1 = r1 + 1
                goto L_0x001f
            L_0x0031:
                r0 = 1
                return r0
            L_0x0033:
                monitor-exit(r3)     // Catch:{ all -> 0x0015 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: d6.h.a.close():boolean");
        }

        /* renamed from: d6.h$a$a  reason: collision with other inner class name */
        private class C0667a implements e {

            /* renamed from: a  reason: collision with root package name */
            private int f43171a;

            public C0667a(int i10) {
                this.f43171a = i10;
            }

            public void b(C3477c cVar) {
                if (this.f43171a == 0) {
                    a.this.s(cVar.f());
                }
            }

            public void c(C3477c cVar) {
                if (cVar.b()) {
                    a.this.H(this.f43171a, cVar);
                } else if (cVar.c()) {
                    a.this.G(this.f43171a, cVar);
                }
            }

            public void d(C3477c cVar) {
                a.this.G(this.f43171a, cVar);
            }

            public void a(C3477c cVar) {
            }
        }
    }
}
