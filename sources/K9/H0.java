package k9;

import N9.C3070t;
import N9.r;
import android.os.Handler;
import com.google.common.collect.C4770v;
import ga.A;
import ga.B;
import ia.C3604b;
import ja.C3645a;
import k9.n1;
import l9.C3747a;

final class H0 {

    /* renamed from: a  reason: collision with root package name */
    private final n1.b f45295a = new n1.b();

    /* renamed from: b  reason: collision with root package name */
    private final n1.d f45296b = new n1.d();

    /* renamed from: c  reason: collision with root package name */
    private final C3747a f45297c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f45298d;

    /* renamed from: e  reason: collision with root package name */
    private long f45299e;

    /* renamed from: f  reason: collision with root package name */
    private int f45300f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f45301g;

    /* renamed from: h  reason: collision with root package name */
    private E0 f45302h;

    /* renamed from: i  reason: collision with root package name */
    private E0 f45303i;

    /* renamed from: j  reason: collision with root package name */
    private E0 f45304j;

    /* renamed from: k  reason: collision with root package name */
    private int f45305k;

    /* renamed from: l  reason: collision with root package name */
    private Object f45306l;

    /* renamed from: m  reason: collision with root package name */
    private long f45307m;

    public H0(C3747a aVar, Handler handler) {
        this.f45297c = aVar;
        this.f45298d = handler;
    }

    private static C3070t.b A(n1 n1Var, Object obj, long j10, long j11, n1.d dVar, n1.b bVar) {
        n1Var.l(obj, bVar);
        n1Var.r(bVar.f45715c, dVar);
        int f10 = n1Var.f(obj);
        Object obj2 = obj;
        while (bVar.f45716d == 0 && bVar.f() > 0 && bVar.t(bVar.r()) && bVar.h(0) == -1) {
            int i10 = f10 + 1;
            if (f10 >= dVar.f45743p) {
                break;
            }
            n1Var.k(i10, bVar, true);
            obj2 = C3645a.e(bVar.f45714b);
            f10 = i10;
        }
        n1Var.l(obj2, bVar);
        int h10 = bVar.h(j10);
        if (h10 == -1) {
            return new C3070t.b(obj2, j11, bVar.g(j10));
        }
        return new C3070t.b(obj2, h10, bVar.n(h10), j11);
    }

    private long C(n1 n1Var, Object obj) {
        int f10;
        int i10 = n1Var.l(obj, this.f45295a).f45715c;
        Object obj2 = this.f45306l;
        if (obj2 != null && (f10 = n1Var.f(obj2)) != -1 && n1Var.j(f10, this.f45295a).f45715c == i10) {
            return this.f45307m;
        }
        for (E0 e02 = this.f45302h; e02 != null; e02 = e02.j()) {
            if (e02.f45266b.equals(obj)) {
                return e02.f45270f.f45281a.f33288d;
            }
        }
        for (E0 e03 = this.f45302h; e03 != null; e03 = e03.j()) {
            int f11 = n1Var.f(e03.f45266b);
            if (f11 != -1 && n1Var.j(f11, this.f45295a).f45715c == i10) {
                return e03.f45270f.f45281a.f33288d;
            }
        }
        long j10 = this.f45299e;
        this.f45299e = 1 + j10;
        if (this.f45302h == null) {
            this.f45306l = obj;
            this.f45307m = j10;
        }
        return j10;
    }

    private boolean E(n1 n1Var) {
        E0 e02 = this.f45302h;
        if (e02 == null) {
            return true;
        }
        int f10 = n1Var.f(e02.f45266b);
        while (true) {
            f10 = n1Var.h(f10, this.f45295a, this.f45296b, this.f45300f, this.f45301g);
            while (e02.j() != null && !e02.f45270f.f45287g) {
                e02 = e02.j();
            }
            E0 j10 = e02.j();
            if (f10 == -1 || j10 == null || n1Var.f(j10.f45266b) != f10) {
                boolean z10 = z(e02);
                e02.f45270f = r(n1Var, e02.f45270f);
            } else {
                e02 = j10;
            }
        }
        boolean z102 = z(e02);
        e02.f45270f = r(n1Var, e02.f45270f);
        return !z102;
    }

    private boolean d(long j10, long j11) {
        if (j10 == -9223372036854775807L || j10 == j11) {
            return true;
        }
        return false;
    }

    private boolean e(F0 f02, F0 f03) {
        if (f02.f45282b != f03.f45282b || !f02.f45281a.equals(f03.f45281a)) {
            return false;
        }
        return true;
    }

    private F0 h(Q0 q02) {
        return k(q02.f45352a, q02.f45353b, q02.f45354c, q02.f45369r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cc, code lost:
        if (r0.t(r0.r()) != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private k9.F0 i(k9.n1 r20, k9.E0 r21, long r22) {
        /*
            r19 = this;
            r9 = r19
            r8 = r20
            r10 = r21
            k9.F0 r11 = r10.f45270f
            long r0 = r21.l()
            long r2 = r11.f45285e
            long r0 = r0 + r2
            long r6 = r0 - r22
            boolean r0 = r11.f45287g
            r13 = -1
            r14 = 1
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = 0
            if (r0 == 0) goto L_0x00f0
            N9.t$b r0 = r11.f45281a
            java.lang.Object r0 = r0.f33285a
            int r1 = r8.f(r0)
            k9.n1$b r2 = r9.f45295a
            k9.n1$d r3 = r9.f45296b
            int r0 = r9.f45300f
            boolean r5 = r9.f45301g
            r4 = r0
            r0 = r20
            int r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 != r13) goto L_0x0038
            return r17
        L_0x0038:
            k9.n1$b r1 = r9.f45295a
            k9.n1$b r1 = r8.k(r0, r1, r14)
            int r3 = r1.f45715c
            k9.n1$b r1 = r9.f45295a
            java.lang.Object r1 = r1.f45714b
            java.lang.Object r1 = ja.C3645a.e(r1)
            N9.t$b r2 = r11.f45281a
            long r4 = r2.f33288d
            k9.n1$d r2 = r9.f45296b
            k9.n1$d r2 = r8.r(r3, r2)
            int r2 = r2.f45742o
            if (r2 != r0) goto L_0x0099
            k9.n1$d r1 = r9.f45296b
            k9.n1$b r2 = r9.f45295a
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x006e
            return r17
        L_0x006e:
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            k9.E0 r0 = r21.j()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r2 = r0.f45266b
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0091
            k9.F0 r0 = r0.f45270f
            N9.t$b r0 = r0.f45281a
            long r2 = r0.f33288d
        L_0x008c:
            r12 = r4
            r17 = r15
            r4 = r2
            goto L_0x009d
        L_0x0091:
            long r2 = r9.f45299e
            r6 = 1
            long r6 = r6 + r2
            r9.f45299e = r6
            goto L_0x008c
        L_0x0099:
            r12 = 0
            r17 = r12
        L_0x009d:
            k9.n1$d r6 = r9.f45296b
            k9.n1$b r7 = r9.f45295a
            r0 = r20
            r2 = r12
            N9.t$b r2 = A(r0, r1, r2, r4, r6, r7)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            long r0 = r11.f45283c
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            N9.t$b r0 = r11.f45281a
            java.lang.Object r0 = r0.f33285a
            k9.n1$b r1 = r9.f45295a
            k9.n1$b r0 = r8.l(r0, r1)
            int r0 = r0.f()
            if (r0 <= 0) goto L_0x00cf
            k9.n1$b r0 = r9.f45295a
            int r1 = r0.r()
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r14 = 0
        L_0x00d0:
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x00dd
            if (r14 == 0) goto L_0x00dd
            long r0 = r11.f45283c
            r3 = r0
            r5 = r12
            goto L_0x00e7
        L_0x00dd:
            if (r14 == 0) goto L_0x00e5
            long r0 = r11.f45283c
            r5 = r0
        L_0x00e2:
            r3 = r17
            goto L_0x00e7
        L_0x00e5:
            r5 = r12
            goto L_0x00e2
        L_0x00e7:
            r0 = r19
            r1 = r20
            k9.F0 r0 = r0.k(r1, r2, r3, r5)
            return r0
        L_0x00f0:
            r0 = r13
            r12 = 0
            N9.t$b r10 = r11.f45281a
            java.lang.Object r1 = r10.f33285a
            k9.n1$b r2 = r9.f45295a
            r8.l(r1, r2)
            boolean r1 = r10.b()
            if (r1 == 0) goto L_0x016c
            int r3 = r10.f33286b
            k9.n1$b r1 = r9.f45295a
            int r1 = r1.d(r3)
            if (r1 != r0) goto L_0x010d
            return r17
        L_0x010d:
            k9.n1$b r0 = r9.f45295a
            int r2 = r10.f33287c
            int r4 = r0.o(r3, r2)
            if (r4 >= r1) goto L_0x0127
            java.lang.Object r2 = r10.f33285a
            long r5 = r11.f45283c
            long r10 = r10.f33288d
            r0 = r19
            r1 = r20
            r7 = r10
            k9.F0 r0 = r0.l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x0127:
            long r0 = r11.f45283c
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x014d
            k9.n1$d r1 = r9.f45296b
            k9.n1$b r2 = r9.f45295a
            int r3 = r2.f45715c
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r6 = java.lang.Math.max(r12, r6)
            r0 = r20
            android.util.Pair r0 = r0.o(r1, r2, r3, r4, r6)
            if (r0 != 0) goto L_0x0145
            return r17
        L_0x0145:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
        L_0x014d:
            java.lang.Object r2 = r10.f33285a
            int r3 = r10.f33286b
            long r2 = r9.n(r8, r2, r3)
            java.lang.Object r4 = r10.f33285a
            long r5 = java.lang.Math.max(r2, r0)
            long r11 = r11.f45283c
            long r13 = r10.f33288d
            r0 = r19
            r1 = r20
            r2 = r4
            r3 = r5
            r5 = r11
            r7 = r13
            k9.F0 r0 = r0.m(r1, r2, r3, r5, r7)
            return r0
        L_0x016c:
            k9.n1$b r0 = r9.f45295a
            int r1 = r10.f33289e
            int r4 = r0.n(r1)
            k9.n1$b r0 = r9.f45295a
            int r1 = r10.f33289e
            boolean r0 = r0.t(r1)
            if (r0 == 0) goto L_0x018b
            k9.n1$b r0 = r9.f45295a
            int r1 = r10.f33289e
            int r0 = r0.k(r1, r4)
            r1 = 3
            if (r0 != r1) goto L_0x018b
            r12 = r14
            goto L_0x018c
        L_0x018b:
            r12 = 0
        L_0x018c:
            k9.n1$b r0 = r9.f45295a
            int r1 = r10.f33289e
            int r0 = r0.d(r1)
            if (r4 == r0) goto L_0x01ab
            if (r12 == 0) goto L_0x0199
            goto L_0x01ab
        L_0x0199:
            java.lang.Object r2 = r10.f33285a
            int r3 = r10.f33289e
            long r5 = r11.f45285e
            long r10 = r10.f33288d
            r0 = r19
            r1 = r20
            r7 = r10
            k9.F0 r0 = r0.l(r1, r2, r3, r4, r5, r7)
            return r0
        L_0x01ab:
            java.lang.Object r0 = r10.f33285a
            int r1 = r10.f33289e
            long r3 = r9.n(r8, r0, r1)
            java.lang.Object r2 = r10.f33285a
            long r5 = r11.f45285e
            long r10 = r10.f33288d
            r0 = r19
            r1 = r20
            r7 = r10
            k9.F0 r0 = r0.m(r1, r2, r3, r5, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.H0.i(k9.n1, k9.E0, long):k9.F0");
    }

    private F0 k(n1 n1Var, C3070t.b bVar, long j10, long j11) {
        C3070t.b bVar2 = bVar;
        n1 n1Var2 = n1Var;
        n1Var.l(bVar2.f33285a, this.f45295a);
        if (bVar.b()) {
            return l(n1Var, bVar2.f33285a, bVar2.f33286b, bVar2.f33287c, j10, bVar2.f33288d);
        }
        return m(n1Var, bVar2.f33285a, j11, j10, bVar2.f33288d);
    }

    private F0 l(n1 n1Var, Object obj, int i10, int i11, long j10, long j11) {
        long j12;
        long j13;
        int i12 = i11;
        C3070t.b bVar = new C3070t.b(obj, i10, i12, j11);
        long e10 = n1Var.l(bVar.f33285a, this.f45295a).e(bVar.f33286b, bVar.f33287c);
        if (i12 == this.f45295a.n(i10)) {
            j12 = this.f45295a.j();
        } else {
            j12 = 0;
        }
        boolean t10 = this.f45295a.t(bVar.f33286b);
        if (e10 == -9223372036854775807L || j12 < e10) {
            j13 = j12;
        } else {
            j13 = Math.max(0, e10 - 1);
        }
        return new F0(bVar, j13, j10, -9223372036854775807L, e10, t10, false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private k9.F0 m(k9.n1 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            k9.n1$b r5 = r0.f45295a
            r1.l(r2, r5)
            k9.n1$b r5 = r0.f45295a
            int r5 = r5.g(r3)
            r6 = 1
            r7 = 0
            r8 = -1
            if (r5 != r8) goto L_0x002e
            k9.n1$b r9 = r0.f45295a
            int r9 = r9.f()
            if (r9 <= 0) goto L_0x004d
            k9.n1$b r9 = r0.f45295a
            int r10 = r9.r()
            boolean r9 = r9.t(r10)
            if (r9 == 0) goto L_0x004d
            r9 = r6
            goto L_0x004e
        L_0x002e:
            k9.n1$b r9 = r0.f45295a
            boolean r9 = r9.t(r5)
            if (r9 == 0) goto L_0x004d
            k9.n1$b r9 = r0.f45295a
            long r9 = r9.i(r5)
            k9.n1$b r11 = r0.f45295a
            long r12 = r11.f45716d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x004d
            boolean r9 = r11.s(r5)
            if (r9 == 0) goto L_0x004d
            r9 = r6
            r5 = r8
            goto L_0x004e
        L_0x004d:
            r9 = r7
        L_0x004e:
            N9.t$b r11 = new N9.t$b
            r12 = r31
            r11.<init>(r2, r12, r5)
            boolean r2 = r0.s(r11)
            boolean r22 = r0.u(r1, r11)
            boolean r23 = r0.t(r1, r11, r2)
            if (r5 == r8) goto L_0x006e
            k9.n1$b r1 = r0.f45295a
            boolean r1 = r1.t(r5)
            if (r1 == 0) goto L_0x006e
            r20 = r6
            goto L_0x0070
        L_0x006e:
            r20 = r7
        L_0x0070:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L_0x0080
            k9.n1$b r1 = r0.f45295a
            long r14 = r1.i(r5)
        L_0x007d:
            r16 = r14
            goto L_0x0089
        L_0x0080:
            if (r9 == 0) goto L_0x0087
            k9.n1$b r1 = r0.f45295a
            long r14 = r1.f45716d
            goto L_0x007d
        L_0x0087:
            r16 = r12
        L_0x0089:
            int r1 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x0097
            r14 = -9223372036854775808
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0094
            goto L_0x0097
        L_0x0094:
            r18 = r16
            goto L_0x009d
        L_0x0097:
            k9.n1$b r1 = r0.f45295a
            long r14 = r1.f45716d
            r18 = r14
        L_0x009d:
            int r1 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x00b4
            int r1 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x00b4
            if (r23 != 0) goto L_0x00ab
            if (r9 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r6 = r7
        L_0x00ab:
            long r3 = (long) r6
            long r3 = r18 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        L_0x00b4:
            r12 = r3
            k9.F0 r1 = new k9.F0
            r10 = r1
            r14 = r29
            r21 = r2
            r10.<init>(r11, r12, r14, r16, r18, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.H0.m(k9.n1, java.lang.Object, long, long, long):k9.F0");
    }

    private long n(n1 n1Var, Object obj, int i10) {
        n1Var.l(obj, this.f45295a);
        long i11 = this.f45295a.i(i10);
        if (i11 == Long.MIN_VALUE) {
            return this.f45295a.f45716d;
        }
        return i11 + this.f45295a.l(i10);
    }

    private boolean s(C3070t.b bVar) {
        if (bVar.b() || bVar.f33289e != -1) {
            return false;
        }
        return true;
    }

    private boolean t(n1 n1Var, C3070t.b bVar, boolean z10) {
        int f10 = n1Var.f(bVar.f33285a);
        if (!n1Var.r(n1Var.j(f10, this.f45295a).f45715c, this.f45296b).f45736i) {
            if (!n1Var.v(f10, this.f45295a, this.f45296b, this.f45300f, this.f45301g) || !z10) {
                return false;
            }
            return true;
        }
        return false;
    }

    private boolean u(n1 n1Var, C3070t.b bVar) {
        if (!s(bVar)) {
            return false;
        }
        int i10 = n1Var.l(bVar.f33285a, this.f45295a).f45715c;
        if (n1Var.r(i10, this.f45296b).f45743p == n1Var.f(bVar.f33285a)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(C4770v.a aVar, C3070t.b bVar) {
        this.f45297c.i0(aVar.k(), bVar);
    }

    private void x() {
        C3070t.b bVar;
        C4770v.a t10 = C4770v.t();
        for (E0 e02 = this.f45302h; e02 != null; e02 = e02.j()) {
            t10.a(e02.f45270f.f45281a);
        }
        E0 e03 = this.f45303i;
        if (e03 == null) {
            bVar = null;
        } else {
            bVar = e03.f45270f.f45281a;
        }
        this.f45298d.post(new G0(this, t10, bVar));
    }

    public C3070t.b B(n1 n1Var, Object obj, long j10) {
        long C10 = C(n1Var, obj);
        n1Var.l(obj, this.f45295a);
        n1Var.r(this.f45295a.f45715c, this.f45296b);
        boolean z10 = false;
        for (int f10 = n1Var.f(obj); f10 >= this.f45296b.f45742o; f10--) {
            boolean z11 = true;
            n1Var.k(f10, this.f45295a, true);
            if (this.f45295a.f() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            n1.b bVar = this.f45295a;
            if (bVar.h(bVar.f45716d) != -1) {
                obj = C3645a.e(this.f45295a.f45714b);
            }
            if (z10 && (!z11 || this.f45295a.f45716d != 0)) {
                break;
            }
        }
        return A(n1Var, obj, j10, C10, this.f45296b, this.f45295a);
    }

    public boolean D() {
        E0 e02 = this.f45304j;
        if (e02 == null || (!e02.f45270f.f45289i && e02.q() && this.f45304j.f45270f.f45285e != -9223372036854775807L && this.f45305k < 100)) {
            return true;
        }
        return false;
    }

    public boolean F(n1 n1Var, long j10, long j11) {
        F0 f02;
        long j12;
        boolean z10;
        E0 e02 = null;
        for (E0 e03 = this.f45302h; e03 != null; e03 = e03.j()) {
            F0 f03 = e03.f45270f;
            if (e02 == null) {
                f02 = r(n1Var, f03);
            } else {
                F0 i10 = i(n1Var, e02, j10);
                if (i10 == null) {
                    return !z(e02);
                }
                if (!e(f03, i10)) {
                    return !z(e02);
                }
                f02 = i10;
            }
            e03.f45270f = f02.a(f03.f45283c);
            if (!d(f03.f45285e, f02.f45285e)) {
                e03.A();
                long j13 = f02.f45285e;
                if (j13 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = e03.z(j13);
                }
                if (e03 != this.f45303i || e03.f45270f.f45286f || (j11 != Long.MIN_VALUE && j11 < j12)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z(e03) || z10) {
                    return false;
                }
                return true;
            }
            e02 = e03;
        }
        return true;
    }

    public boolean G(n1 n1Var, int i10) {
        this.f45300f = i10;
        return E(n1Var);
    }

    public boolean H(n1 n1Var, boolean z10) {
        this.f45301g = z10;
        return E(n1Var);
    }

    public E0 b() {
        E0 e02 = this.f45302h;
        if (e02 == null) {
            return null;
        }
        if (e02 == this.f45303i) {
            this.f45303i = e02.j();
        }
        this.f45302h.t();
        int i10 = this.f45305k - 1;
        this.f45305k = i10;
        if (i10 == 0) {
            this.f45304j = null;
            E0 e03 = this.f45302h;
            this.f45306l = e03.f45266b;
            this.f45307m = e03.f45270f.f45281a.f33288d;
        }
        this.f45302h = this.f45302h.j();
        x();
        return this.f45302h;
    }

    public E0 c() {
        boolean z10;
        E0 e02 = this.f45303i;
        if (e02 == null || e02.j() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        C3645a.f(z10);
        this.f45303i = this.f45303i.j();
        x();
        return this.f45303i;
    }

    public void f() {
        if (this.f45305k != 0) {
            E0 e02 = (E0) C3645a.h(this.f45302h);
            this.f45306l = e02.f45266b;
            this.f45307m = e02.f45270f.f45281a.f33288d;
            while (e02 != null) {
                e02.t();
                e02 = e02.j();
            }
            this.f45302h = null;
            this.f45304j = null;
            this.f45303i = null;
            this.f45305k = 0;
            x();
        }
    }

    public E0 g(b1[] b1VarArr, A a10, C3604b bVar, K0 k02, F0 f02, B b10) {
        long l10;
        E0 e02 = this.f45304j;
        if (e02 == null) {
            l10 = 1000000000000L;
            F0 f03 = f02;
        } else {
            l10 = (e02.l() + this.f45304j.f45270f.f45285e) - f02.f45282b;
        }
        E0 e03 = new E0(b1VarArr, l10, a10, bVar, k02, f02, b10);
        E0 e04 = this.f45304j;
        if (e04 != null) {
            e04.w(e03);
        } else {
            this.f45302h = e03;
            this.f45303i = e03;
        }
        this.f45306l = null;
        this.f45304j = e03;
        this.f45305k++;
        x();
        return e03;
    }

    public E0 j() {
        return this.f45304j;
    }

    public F0 o(long j10, Q0 q02) {
        E0 e02 = this.f45304j;
        if (e02 == null) {
            return h(q02);
        }
        return i(q02.f45352a, e02, j10);
    }

    public E0 p() {
        return this.f45302h;
    }

    public E0 q() {
        return this.f45303i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k9.F0 r(k9.n1 r19, k9.F0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            N9.t$b r3 = r2.f45281a
            boolean r12 = r0.s(r3)
            boolean r13 = r0.u(r1, r3)
            boolean r14 = r0.t(r1, r3, r12)
            N9.t$b r4 = r2.f45281a
            java.lang.Object r4 = r4.f33285a
            k9.n1$b r5 = r0.f45295a
            r1.l(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f33289e
            if (r1 != r6) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            k9.n1$b r7 = r0.f45295a
            long r7 = r7.i(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r4
        L_0x0036:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x0048
            k9.n1$b r1 = r0.f45295a
            int r4 = r3.f33286b
            int r5 = r3.f33287c
            long r4 = r1.e(r4, r5)
        L_0x0046:
            r9 = r4
            goto L_0x005c
        L_0x0048:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0055
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r9 = r7
            goto L_0x005c
        L_0x0055:
            k9.n1$b r1 = r0.f45295a
            long r4 = r1.m()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x006c
            k9.n1$b r1 = r0.f45295a
            int r4 = r3.f33286b
            boolean r1 = r1.t(r4)
        L_0x006a:
            r11 = r1
            goto L_0x007c
        L_0x006c:
            int r1 = r3.f33289e
            if (r1 == r6) goto L_0x007a
            k9.n1$b r4 = r0.f45295a
            boolean r1 = r4.t(r1)
            if (r1 == 0) goto L_0x007a
            r1 = 1
            goto L_0x006a
        L_0x007a:
            r1 = 0
            goto L_0x006a
        L_0x007c:
            k9.F0 r15 = new k9.F0
            long r4 = r2.f45282b
            long r1 = r2.f45283c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.H0.r(k9.n1, k9.F0):k9.F0");
    }

    public boolean v(r rVar) {
        E0 e02 = this.f45304j;
        if (e02 == null || e02.f45265a != rVar) {
            return false;
        }
        return true;
    }

    public void y(long j10) {
        E0 e02 = this.f45304j;
        if (e02 != null) {
            e02.s(j10);
        }
    }

    public boolean z(E0 e02) {
        boolean z10;
        boolean z11 = false;
        if (e02 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        if (e02.equals(this.f45304j)) {
            return false;
        }
        this.f45304j = e02;
        while (e02.j() != null) {
            e02 = e02.j();
            if (e02 == this.f45303i) {
                this.f45303i = this.f45302h;
                z11 = true;
            }
            e02.t();
            this.f45305k--;
        }
        this.f45304j.w((E0) null);
        x();
        return z11;
    }
}
