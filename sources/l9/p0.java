package l9;

import N9.C3070t;
import android.util.Base64;
import ja.C3645a;
import ja.M;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import k9.n1;
import l9.C3748b;
import l9.r0;
import nb.u;

public final class p0 implements r0 {

    /* renamed from: h  reason: collision with root package name */
    public static final u f46289h = new o0();

    /* renamed from: i  reason: collision with root package name */
    private static final Random f46290i = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n1.d f46291a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n1.b f46292b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f46293c;

    /* renamed from: d  reason: collision with root package name */
    private final u f46294d;

    /* renamed from: e  reason: collision with root package name */
    private r0.a f46295e;

    /* renamed from: f  reason: collision with root package name */
    private n1 f46296f;

    /* renamed from: g  reason: collision with root package name */
    private String f46297g;

    private final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f46298a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f46299b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f46300c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C3070t.b f46301d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f46302e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f46303f;

        public a(String str, int i10, C3070t.b bVar) {
            long j10;
            this.f46298a = str;
            this.f46299b = i10;
            if (bVar == null) {
                j10 = -1;
            } else {
                j10 = bVar.f33288d;
            }
            this.f46300c = j10;
            if (bVar != null && bVar.b()) {
                this.f46301d = bVar;
            }
        }

        private int l(n1 n1Var, n1 n1Var2, int i10) {
            if (i10 < n1Var.t()) {
                n1Var.r(i10, p0.this.f46291a);
                for (int i11 = p0.this.f46291a.f45742o; i11 <= p0.this.f46291a.f45743p; i11++) {
                    int f10 = n1Var2.f(n1Var.q(i11));
                    if (f10 != -1) {
                        return n1Var2.j(f10, p0.this.f46292b).f45715c;
                    }
                }
                return -1;
            } else if (i10 < n1Var2.t()) {
                return i10;
            } else {
                return -1;
            }
        }

        public boolean i(int i10, C3070t.b bVar) {
            if (bVar != null) {
                C3070t.b bVar2 = this.f46301d;
                if (bVar2 == null) {
                    if (bVar.b() || bVar.f33288d != this.f46300c) {
                        return false;
                    }
                    return true;
                } else if (bVar.f33288d == bVar2.f33288d && bVar.f33286b == bVar2.f33286b && bVar.f33287c == bVar2.f33287c) {
                    return true;
                } else {
                    return false;
                }
            } else if (i10 == this.f46299b) {
                return true;
            } else {
                return false;
            }
        }

        public boolean j(C3748b.a aVar) {
            long j10 = this.f46300c;
            if (j10 == -1) {
                return false;
            }
            C3070t.b bVar = aVar.f46205d;
            if (bVar == null) {
                if (this.f46299b != aVar.f46204c) {
                    return true;
                }
                return false;
            } else if (bVar.f33288d > j10) {
                return true;
            } else {
                if (this.f46301d == null) {
                    return false;
                }
                int f10 = aVar.f46203b.f(bVar.f33285a);
                int f11 = aVar.f46203b.f(this.f46301d.f33285a);
                C3070t.b bVar2 = aVar.f46205d;
                if (bVar2.f33288d < this.f46301d.f33288d || f10 < f11) {
                    return false;
                }
                if (f10 > f11) {
                    return true;
                }
                if (bVar2.b()) {
                    C3070t.b bVar3 = aVar.f46205d;
                    int i10 = bVar3.f33286b;
                    int i11 = bVar3.f33287c;
                    C3070t.b bVar4 = this.f46301d;
                    int i12 = bVar4.f33286b;
                    if (i10 > i12 || (i10 == i12 && i11 > bVar4.f33287c)) {
                        return true;
                    }
                    return false;
                }
                int i13 = aVar.f46205d.f33289e;
                if (i13 == -1 || i13 > this.f46301d.f33286b) {
                    return true;
                }
                return false;
            }
        }

        public void k(int i10, C3070t.b bVar) {
            if (this.f46300c == -1 && i10 == this.f46299b && bVar != null) {
                this.f46300c = bVar.f33288d;
            }
        }

        public boolean m(n1 n1Var, n1 n1Var2) {
            int l10 = l(n1Var, n1Var2, this.f46299b);
            this.f46299b = l10;
            if (l10 == -1) {
                return false;
            }
            C3070t.b bVar = this.f46301d;
            if (bVar == null) {
                return true;
            }
            if (n1Var2.f(bVar.f33285a) != -1) {
                return true;
            }
            return false;
        }
    }

    public p0() {
        this(f46289h);
    }

    /* access modifiers changed from: private */
    public static String k() {
        byte[] bArr = new byte[12];
        f46290i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private a l(int i10, C3070t.b bVar) {
        int i11;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f46293c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long b10 = aVar2.f46300c;
                if (b10 == -1 || b10 < j10) {
                    aVar = aVar2;
                    j10 = b10;
                } else if (!(i11 != 0 || ((a) M.j(aVar)).f46301d == null || aVar2.f46301d == null)) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f46294d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f46293c.put(str, aVar3);
        return aVar3;
    }

    private void m(C3748b.a aVar) {
        if (aVar.f46203b.u()) {
            this.f46297g = null;
            return;
        }
        a aVar2 = (a) this.f46293c.get(this.f46297g);
        a l10 = l(aVar.f46204c, aVar.f46205d);
        this.f46297g = l10.f46298a;
        c(aVar);
        C3070t.b bVar = aVar.f46205d;
        if (bVar != null && bVar.b()) {
            if (aVar2 == null || aVar2.f46300c != aVar.f46205d.f33288d || aVar2.f46301d == null || aVar2.f46301d.f33286b != aVar.f46205d.f33286b || aVar2.f46301d.f33287c != aVar.f46205d.f33287c) {
                C3070t.b bVar2 = aVar.f46205d;
                this.f46295e.F(aVar, l(aVar.f46204c, new C3070t.b(bVar2.f33285a, bVar2.f33288d)).f46298a, l10.f46298a);
            }
        }
    }

    public synchronized String a() {
        return this.f46297g;
    }

    public synchronized void b(C3748b.a aVar) {
        r0.a aVar2;
        this.f46297g = null;
        Iterator it = this.f46293c.values().iterator();
        while (it.hasNext()) {
            a aVar3 = (a) it.next();
            it.remove();
            if (aVar3.f46302e && (aVar2 = this.f46295e) != null) {
                aVar2.w(aVar, aVar3.f46298a, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r0.f46205d.f33288d < l9.p0.a.b(r2)) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0115, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00df A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f1 A[Catch:{ all -> 0x0037 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(l9.C3748b.a r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            l9.r0$a r2 = r1.f46295e     // Catch:{ all -> 0x0037 }
            ja.C3645a.e(r2)     // Catch:{ all -> 0x0037 }
            k9.n1 r2 = r0.f46203b     // Catch:{ all -> 0x0037 }
            boolean r2 = r2.u()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            java.util.HashMap r2 = r1.f46293c     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r1.f46297g     // Catch:{ all -> 0x0037 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0037 }
            l9.p0$a r2 = (l9.p0.a) r2     // Catch:{ all -> 0x0037 }
            N9.t$b r3 = r0.f46205d     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0048
            if (r2 == 0) goto L_0x0048
            long r3 = r2.f46300c     // Catch:{ all -> 0x0037 }
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x003a
            int r2 = r2.f46299b     // Catch:{ all -> 0x0037 }
            int r3 = r0.f46204c     // Catch:{ all -> 0x0037 }
            if (r2 == r3) goto L_0x0048
            goto L_0x0046
        L_0x0037:
            r0 = move-exception
            goto L_0x0116
        L_0x003a:
            N9.t$b r3 = r0.f46205d     // Catch:{ all -> 0x0037 }
            long r3 = r3.f33288d     // Catch:{ all -> 0x0037 }
            long r5 = r2.f46300c     // Catch:{ all -> 0x0037 }
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0048
        L_0x0046:
            monitor-exit(r24)
            return
        L_0x0048:
            int r2 = r0.f46204c     // Catch:{ all -> 0x0037 }
            N9.t$b r3 = r0.f46205d     // Catch:{ all -> 0x0037 }
            l9.p0$a r2 = r1.l(r2, r3)     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r1.f46297g     // Catch:{ all -> 0x0037 }
            if (r3 != 0) goto L_0x005a
            java.lang.String r3 = r2.f46298a     // Catch:{ all -> 0x0037 }
            r1.f46297g = r3     // Catch:{ all -> 0x0037 }
        L_0x005a:
            N9.t$b r3 = r0.f46205d     // Catch:{ all -> 0x0037 }
            r4 = 1
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r3.b()     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x00d7
            N9.t$b r10 = new N9.t$b     // Catch:{ all -> 0x0037 }
            N9.t$b r3 = r0.f46205d     // Catch:{ all -> 0x0037 }
            java.lang.Object r5 = r3.f33285a     // Catch:{ all -> 0x0037 }
            long r6 = r3.f33288d     // Catch:{ all -> 0x0037 }
            int r3 = r3.f33286b     // Catch:{ all -> 0x0037 }
            r10.<init>(r5, r6, r3)     // Catch:{ all -> 0x0037 }
            int r3 = r0.f46204c     // Catch:{ all -> 0x0037 }
            l9.p0$a r3 = r1.l(r3, r10)     // Catch:{ all -> 0x0037 }
            boolean r5 = r3.f46302e     // Catch:{ all -> 0x0037 }
            if (r5 != 0) goto L_0x00d7
            boolean unused = r3.f46302e = r4     // Catch:{ all -> 0x0037 }
            k9.n1 r5 = r0.f46203b     // Catch:{ all -> 0x0037 }
            N9.t$b r6 = r0.f46205d     // Catch:{ all -> 0x0037 }
            java.lang.Object r6 = r6.f33285a     // Catch:{ all -> 0x0037 }
            k9.n1$b r7 = r1.f46292b     // Catch:{ all -> 0x0037 }
            r5.l(r6, r7)     // Catch:{ all -> 0x0037 }
            k9.n1$b r5 = r1.f46292b     // Catch:{ all -> 0x0037 }
            N9.t$b r6 = r0.f46205d     // Catch:{ all -> 0x0037 }
            int r6 = r6.f33286b     // Catch:{ all -> 0x0037 }
            long r5 = r5.i(r6)     // Catch:{ all -> 0x0037 }
            long r5 = ja.M.Z0(r5)     // Catch:{ all -> 0x0037 }
            k9.n1$b r7 = r1.f46292b     // Catch:{ all -> 0x0037 }
            long r7 = r7.p()     // Catch:{ all -> 0x0037 }
            long r5 = r5 + r7
            r7 = 0
            long r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0037 }
            l9.b$a r15 = new l9.b$a     // Catch:{ all -> 0x0037 }
            long r6 = r0.f46202a     // Catch:{ all -> 0x0037 }
            k9.n1 r8 = r0.f46203b     // Catch:{ all -> 0x0037 }
            int r9 = r0.f46204c     // Catch:{ all -> 0x0037 }
            k9.n1 r13 = r0.f46207f     // Catch:{ all -> 0x0037 }
            int r14 = r0.f46208g     // Catch:{ all -> 0x0037 }
            N9.t$b r5 = r0.f46209h     // Catch:{ all -> 0x0037 }
            r16 = r5
            long r4 = r0.f46210i     // Catch:{ all -> 0x0037 }
            r20 = r2
            r21 = r3
            long r2 = r0.f46211j     // Catch:{ all -> 0x0037 }
            r22 = r4
            r4 = r16
            r16 = r22
            r5 = r15
            r0 = r15
            r15 = r4
            r18 = r2
            r5.<init>(r6, r8, r9, r10, r11, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0037 }
            l9.r0$a r2 = r1.f46295e     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r21.f46298a     // Catch:{ all -> 0x0037 }
            r2.U(r0, r3)     // Catch:{ all -> 0x0037 }
            goto L_0x00d9
        L_0x00d7:
            r20 = r2
        L_0x00d9:
            boolean r0 = r20.f46302e     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x00f1
            r0 = r20
            r2 = 1
            boolean unused = r0.f46302e = r2     // Catch:{ all -> 0x0037 }
            l9.r0$a r2 = r1.f46295e     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r0.f46298a     // Catch:{ all -> 0x0037 }
            r4 = r25
            r2.U(r4, r3)     // Catch:{ all -> 0x0037 }
            goto L_0x00f5
        L_0x00f1:
            r4 = r25
            r0 = r20
        L_0x00f5:
            java.lang.String r2 = r0.f46298a     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = r1.f46297g     // Catch:{ all -> 0x0037 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0114
            boolean r2 = r0.f46303f     // Catch:{ all -> 0x0037 }
            if (r2 != 0) goto L_0x0114
            r2 = 1
            boolean unused = r0.f46303f = r2     // Catch:{ all -> 0x0037 }
            l9.r0$a r2 = r1.f46295e     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r0.f46298a     // Catch:{ all -> 0x0037 }
            r2.k0(r4, r0)     // Catch:{ all -> 0x0037 }
        L_0x0114:
            monitor-exit(r24)
            return
        L_0x0116:
            monitor-exit(r24)     // Catch:{ all -> 0x0037 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.p0.c(l9.b$a):void");
    }

    public synchronized void d(C3748b.a aVar, int i10) {
        boolean z10;
        boolean z11;
        try {
            C3645a.e(this.f46295e);
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f46293c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f46302e) {
                        boolean equals = aVar2.f46298a.equals(this.f46297g);
                        if (!z10 || !equals || !aVar2.f46303f) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (equals) {
                            this.f46297g = null;
                        }
                        this.f46295e.w(aVar, aVar2.f46298a, z11);
                    }
                }
            }
            m(aVar);
        } finally {
            while (true) {
            }
        }
    }

    public synchronized String e(n1 n1Var, C3070t.b bVar) {
        return l(n1Var.l(bVar.f33285a, this.f46292b).f45715c, bVar).f46298a;
    }

    public void f(r0.a aVar) {
        this.f46295e = aVar;
    }

    public synchronized void g(C3748b.a aVar) {
        try {
            C3645a.e(this.f46295e);
            n1 n1Var = this.f46296f;
            this.f46296f = aVar.f46203b;
            Iterator it = this.f46293c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.m(n1Var, this.f46296f)) {
                    if (aVar2.j(aVar)) {
                    }
                }
                it.remove();
                if (aVar2.f46302e) {
                    if (aVar2.f46298a.equals(this.f46297g)) {
                        this.f46297g = null;
                    }
                    this.f46295e.w(aVar, aVar2.f46298a, false);
                }
            }
            m(aVar);
        } finally {
            while (true) {
            }
        }
    }

    public p0(u uVar) {
        this.f46294d = uVar;
        this.f46291a = new n1.d();
        this.f46292b = new n1.b();
        this.f46293c = new HashMap();
        this.f46296f = n1.f45710a;
    }
}
