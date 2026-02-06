package n2;

import android.util.Base64;
import f2.H;
import i2.C2076a;
import i2.L;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import n2.C2282b;
import n2.t1;
import nb.u;
import t2.C2615C;

/* renamed from: n2.q0  reason: case insensitive filesystem */
public final class C2313q0 implements t1 {

    /* renamed from: i  reason: collision with root package name */
    public static final u f24596i = new C2311p0();

    /* renamed from: j  reason: collision with root package name */
    private static final Random f24597j = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final H.c f24598a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final H.b f24599b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f24600c;

    /* renamed from: d  reason: collision with root package name */
    private final u f24601d;

    /* renamed from: e  reason: collision with root package name */
    private t1.a f24602e;

    /* renamed from: f  reason: collision with root package name */
    private H f24603f;

    /* renamed from: g  reason: collision with root package name */
    private String f24604g;

    /* renamed from: h  reason: collision with root package name */
    private long f24605h;

    /* renamed from: n2.q0$a */
    private final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f24606a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f24607b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f24608c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C2615C.b f24609d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f24610e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f24611f;

        public a(String str, int i10, C2615C.b bVar) {
            long j10;
            this.f24606a = str;
            this.f24607b = i10;
            if (bVar == null) {
                j10 = -1;
            } else {
                j10 = bVar.f25963d;
            }
            this.f24608c = j10;
            if (bVar != null && bVar.b()) {
                this.f24609d = bVar;
            }
        }

        private int l(H h10, H h11, int i10) {
            if (i10 < h10.p()) {
                h10.n(i10, C2313q0.this.f24598a);
                for (int i11 = C2313q0.this.f24598a.f19780n; i11 <= C2313q0.this.f24598a.f19781o; i11++) {
                    int b10 = h11.b(h10.m(i11));
                    if (b10 != -1) {
                        return h11.f(b10, C2313q0.this.f24599b).f19746c;
                    }
                }
                return -1;
            } else if (i10 < h11.p()) {
                return i10;
            } else {
                return -1;
            }
        }

        public boolean i(int i10, C2615C.b bVar) {
            if (bVar != null) {
                C2615C.b bVar2 = this.f24609d;
                if (bVar2 == null) {
                    if (bVar.b() || bVar.f25963d != this.f24608c) {
                        return false;
                    }
                    return true;
                } else if (bVar.f25963d == bVar2.f25963d && bVar.f25961b == bVar2.f25961b && bVar.f25962c == bVar2.f25962c) {
                    return true;
                } else {
                    return false;
                }
            } else if (i10 == this.f24607b) {
                return true;
            } else {
                return false;
            }
        }

        public boolean j(C2282b.a aVar) {
            C2615C.b bVar = aVar.f24514d;
            if (bVar != null) {
                long j10 = this.f24608c;
                if (j10 == -1) {
                    return false;
                }
                if (bVar.f25963d > j10) {
                    return true;
                }
                if (this.f24609d == null) {
                    return false;
                }
                int b10 = aVar.f24512b.b(bVar.f25960a);
                int b11 = aVar.f24512b.b(this.f24609d.f25960a);
                C2615C.b bVar2 = aVar.f24514d;
                if (bVar2.f25963d < this.f24609d.f25963d || b10 < b11) {
                    return false;
                }
                if (b10 > b11) {
                    return true;
                }
                if (bVar2.b()) {
                    C2615C.b bVar3 = aVar.f24514d;
                    int i10 = bVar3.f25961b;
                    int i11 = bVar3.f25962c;
                    C2615C.b bVar4 = this.f24609d;
                    int i12 = bVar4.f25961b;
                    if (i10 > i12) {
                        return true;
                    }
                    if (i10 != i12 || i11 <= bVar4.f25962c) {
                        return false;
                    }
                    return true;
                }
                int i13 = aVar.f24514d.f25964e;
                if (i13 == -1 || i13 > this.f24609d.f25961b) {
                    return true;
                }
                return false;
            } else if (this.f24607b != aVar.f24513c) {
                return true;
            } else {
                return false;
            }
        }

        public void k(int i10, C2615C.b bVar) {
            if (this.f24608c == -1 && i10 == this.f24607b && bVar != null && bVar.f25963d >= C2313q0.this.n()) {
                this.f24608c = bVar.f25963d;
            }
        }

        public boolean m(H h10, H h11) {
            int l10 = l(h10, h11, this.f24607b);
            this.f24607b = l10;
            if (l10 == -1) {
                return false;
            }
            C2615C.b bVar = this.f24609d;
            if (bVar == null) {
                return true;
            }
            if (h11.b(bVar.f25960a) != -1) {
                return true;
            }
            return false;
        }
    }

    public C2313q0() {
        this(f24596i);
    }

    private void l(a aVar) {
        if (aVar.f24608c != -1) {
            this.f24605h = aVar.f24608c;
        }
        this.f24604g = null;
    }

    /* access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f24597j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* access modifiers changed from: private */
    public long n() {
        a aVar = (a) this.f24600c.get(this.f24604g);
        if (aVar == null || aVar.f24608c == -1) {
            return this.f24605h + 1;
        }
        return aVar.f24608c;
    }

    private a o(int i10, C2615C.b bVar) {
        int i11;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f24600c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long b10 = aVar2.f24608c;
                if (b10 == -1 || b10 < j10) {
                    aVar = aVar2;
                    j10 = b10;
                } else if (!(i11 != 0 || ((a) L.h(aVar)).f24609d == null || aVar2.f24609d == null)) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f24601d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f24600c.put(str, aVar3);
        return aVar3;
    }

    private void p(C2282b.a aVar) {
        if (aVar.f24512b.q()) {
            String str = this.f24604g;
            if (str != null) {
                l((a) C2076a.e((a) this.f24600c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f24600c.get(this.f24604g);
        a o10 = o(aVar.f24513c, aVar.f24514d);
        this.f24604g = o10.f24606a;
        f(aVar);
        C2615C.b bVar = aVar.f24514d;
        if (bVar != null && bVar.b()) {
            if (aVar2 == null || aVar2.f24608c != aVar.f24514d.f25963d || aVar2.f24609d == null || aVar2.f24609d.f25961b != aVar.f24514d.f25961b || aVar2.f24609d.f25962c != aVar.f24514d.f25962c) {
                C2615C.b bVar2 = aVar.f24514d;
                this.f24602e.l(aVar, o(aVar.f24513c, new C2615C.b(bVar2.f25960a, bVar2.f25963d)).f24606a, o10.f24606a);
            }
        }
    }

    public synchronized String a() {
        return this.f24604g;
    }

    public synchronized void b(C2282b.a aVar) {
        t1.a aVar2;
        try {
            String str = this.f24604g;
            if (str != null) {
                l((a) C2076a.e((a) this.f24600c.get(str)));
            }
            Iterator it = this.f24600c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f24610e && (aVar2 = this.f24602e) != null) {
                    aVar2.A(aVar, aVar3.f24606a, false);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized String c(H h10, C2615C.b bVar) {
        return o(h10.h(bVar.f25960a, this.f24599b).f19746c, bVar).f24606a;
    }

    public void d(t1.a aVar) {
        this.f24602e = aVar;
    }

    public synchronized void e(C2282b.a aVar) {
        try {
            C2076a.e(this.f24602e);
            H h10 = this.f24603f;
            this.f24603f = aVar.f24512b;
            Iterator it = this.f24600c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.m(h10, this.f24603f)) {
                    if (aVar2.j(aVar)) {
                    }
                }
                it.remove();
                if (aVar2.f24610e) {
                    if (aVar2.f24606a.equals(this.f24604g)) {
                        l(aVar2);
                    }
                    this.f24602e.A(aVar, aVar2.f24606a, false);
                }
            }
            p(aVar);
        } finally {
            while (true) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void f(n2.C2282b.a r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            n2.t1$a r2 = r1.f24602e     // Catch:{ all -> 0x0044 }
            i2.C2076a.e(r2)     // Catch:{ all -> 0x0044 }
            f2.H r2 = r0.f24512b     // Catch:{ all -> 0x0044 }
            boolean r2 = r2.q()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            t2.C$b r2 = r0.f24514d     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0047
            long r2 = r2.f25963d     // Catch:{ all -> 0x0044 }
            long r4 = r24.n()     // Catch:{ all -> 0x0044 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0024
            monitor-exit(r24)
            return
        L_0x0024:
            java.util.HashMap r2 = r1.f24600c     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r1.f24604g     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0044 }
            n2.q0$a r2 = (n2.C2313q0.a) r2     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0047
            long r3 = r2.f24608c     // Catch:{ all -> 0x0044 }
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0047
            int r2 = r2.f24607b     // Catch:{ all -> 0x0044 }
            int r3 = r0.f24513c     // Catch:{ all -> 0x0044 }
            if (r2 == r3) goto L_0x0047
            monitor-exit(r24)
            return
        L_0x0044:
            r0 = move-exception
            goto L_0x0115
        L_0x0047:
            int r2 = r0.f24513c     // Catch:{ all -> 0x0044 }
            t2.C$b r3 = r0.f24514d     // Catch:{ all -> 0x0044 }
            n2.q0$a r2 = r1.o(r2, r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r1.f24604g     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x0059
            java.lang.String r3 = r2.f24606a     // Catch:{ all -> 0x0044 }
            r1.f24604g = r3     // Catch:{ all -> 0x0044 }
        L_0x0059:
            t2.C$b r3 = r0.f24514d     // Catch:{ all -> 0x0044 }
            r4 = 1
            if (r3 == 0) goto L_0x00d6
            boolean r3 = r3.b()     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x00d6
            t2.C$b r10 = new t2.C$b     // Catch:{ all -> 0x0044 }
            t2.C$b r3 = r0.f24514d     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r3.f25960a     // Catch:{ all -> 0x0044 }
            long r6 = r3.f25963d     // Catch:{ all -> 0x0044 }
            int r3 = r3.f25961b     // Catch:{ all -> 0x0044 }
            r10.<init>(r5, r6, r3)     // Catch:{ all -> 0x0044 }
            int r3 = r0.f24513c     // Catch:{ all -> 0x0044 }
            n2.q0$a r3 = r1.o(r3, r10)     // Catch:{ all -> 0x0044 }
            boolean r5 = r3.f24610e     // Catch:{ all -> 0x0044 }
            if (r5 != 0) goto L_0x00d6
            boolean unused = r3.f24610e = r4     // Catch:{ all -> 0x0044 }
            f2.H r5 = r0.f24512b     // Catch:{ all -> 0x0044 }
            t2.C$b r6 = r0.f24514d     // Catch:{ all -> 0x0044 }
            java.lang.Object r6 = r6.f25960a     // Catch:{ all -> 0x0044 }
            f2.H$b r7 = r1.f24599b     // Catch:{ all -> 0x0044 }
            r5.h(r6, r7)     // Catch:{ all -> 0x0044 }
            f2.H$b r5 = r1.f24599b     // Catch:{ all -> 0x0044 }
            t2.C$b r6 = r0.f24514d     // Catch:{ all -> 0x0044 }
            int r6 = r6.f25961b     // Catch:{ all -> 0x0044 }
            long r5 = r5.f(r6)     // Catch:{ all -> 0x0044 }
            long r5 = i2.L.h1(r5)     // Catch:{ all -> 0x0044 }
            f2.H$b r7 = r1.f24599b     // Catch:{ all -> 0x0044 }
            long r7 = r7.m()     // Catch:{ all -> 0x0044 }
            long r5 = r5 + r7
            r7 = 0
            long r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0044 }
            n2.b$a r15 = new n2.b$a     // Catch:{ all -> 0x0044 }
            long r6 = r0.f24511a     // Catch:{ all -> 0x0044 }
            f2.H r8 = r0.f24512b     // Catch:{ all -> 0x0044 }
            int r9 = r0.f24513c     // Catch:{ all -> 0x0044 }
            f2.H r13 = r0.f24516f     // Catch:{ all -> 0x0044 }
            int r14 = r0.f24517g     // Catch:{ all -> 0x0044 }
            t2.C$b r5 = r0.f24518h     // Catch:{ all -> 0x0044 }
            r16 = r5
            long r4 = r0.f24519i     // Catch:{ all -> 0x0044 }
            r20 = r2
            r21 = r3
            long r2 = r0.f24520j     // Catch:{ all -> 0x0044 }
            r22 = r4
            r4 = r16
            r16 = r22
            r5 = r15
            r0 = r15
            r15 = r4
            r18 = r2
            r5.<init>(r6, r8, r9, r10, r11, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0044 }
            n2.t1$a r2 = r1.f24602e     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r21.f24606a     // Catch:{ all -> 0x0044 }
            r2.c0(r0, r3)     // Catch:{ all -> 0x0044 }
            goto L_0x00d8
        L_0x00d6:
            r20 = r2
        L_0x00d8:
            boolean r0 = r20.f24610e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x00f0
            r0 = r20
            r2 = 1
            boolean unused = r0.f24610e = r2     // Catch:{ all -> 0x0044 }
            n2.t1$a r2 = r1.f24602e     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r0.f24606a     // Catch:{ all -> 0x0044 }
            r4 = r25
            r2.c0(r4, r3)     // Catch:{ all -> 0x0044 }
            goto L_0x00f4
        L_0x00f0:
            r4 = r25
            r0 = r20
        L_0x00f4:
            java.lang.String r2 = r0.f24606a     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r1.f24604g     // Catch:{ all -> 0x0044 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0113
            boolean r2 = r0.f24611f     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0113
            r2 = 1
            boolean unused = r0.f24611f = r2     // Catch:{ all -> 0x0044 }
            n2.t1$a r2 = r1.f24602e     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r0.f24606a     // Catch:{ all -> 0x0044 }
            r2.r(r4, r0)     // Catch:{ all -> 0x0044 }
        L_0x0113:
            monitor-exit(r24)
            return
        L_0x0115:
            monitor-exit(r24)     // Catch:{ all -> 0x0044 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C2313q0.f(n2.b$a):void");
    }

    public synchronized void g(C2282b.a aVar, int i10) {
        boolean z10;
        boolean z11;
        try {
            C2076a.e(this.f24602e);
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Iterator it = this.f24600c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f24610e) {
                        boolean equals = aVar2.f24606a.equals(this.f24604g);
                        if (!z10 || !equals || !aVar2.f24611f) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (equals) {
                            l(aVar2);
                        }
                        this.f24602e.A(aVar, aVar2.f24606a, z11);
                    }
                }
            }
            p(aVar);
        } finally {
            while (true) {
            }
        }
    }

    public C2313q0(u uVar) {
        this.f24601d = uVar;
        this.f24598a = new H.c();
        this.f24599b = new H.b();
        this.f24600c = new HashMap();
        this.f24603f = H.f19735a;
        this.f24605h = -1;
    }
}
