package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.V;
import com.google.common.collect.C4770v;
import f2.H;
import i2.C2076a;
import i2.C2087l;
import java.util.ArrayList;
import java.util.List;
import n2.C2280a;
import t2.C2614B;
import t2.C2615C;

final class Y {

    /* renamed from: a  reason: collision with root package name */
    private final H.b f17576a = new H.b();

    /* renamed from: b  reason: collision with root package name */
    private final H.c f17577b = new H.c();

    /* renamed from: c  reason: collision with root package name */
    private final C2280a f17578c;

    /* renamed from: d  reason: collision with root package name */
    private final C2087l f17579d;

    /* renamed from: e  reason: collision with root package name */
    private final V.a f17580e;

    /* renamed from: f  reason: collision with root package name */
    private long f17581f;

    /* renamed from: g  reason: collision with root package name */
    private int f17582g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f17583h;

    /* renamed from: i  reason: collision with root package name */
    private V f17584i;

    /* renamed from: j  reason: collision with root package name */
    private V f17585j;

    /* renamed from: k  reason: collision with root package name */
    private V f17586k;

    /* renamed from: l  reason: collision with root package name */
    private int f17587l;

    /* renamed from: m  reason: collision with root package name */
    private Object f17588m;

    /* renamed from: n  reason: collision with root package name */
    private long f17589n;

    /* renamed from: o  reason: collision with root package name */
    private ExoPlayer.c f17590o;

    /* renamed from: p  reason: collision with root package name */
    private List f17591p = new ArrayList();

    public Y(C2280a aVar, C2087l lVar, V.a aVar2, ExoPlayer.c cVar) {
        this.f17578c = aVar;
        this.f17579d = lVar;
        this.f17580e = aVar2;
        this.f17590o = cVar;
    }

    private boolean A(H h10, C2615C.b bVar) {
        if (!y(bVar)) {
            return false;
        }
        int i10 = h10.h(bVar.f25960a, this.f17576a).f19746c;
        if (h10.n(i10, this.f17577b).f19781o == h10.b(bVar.f25960a)) {
            return true;
        }
        return false;
    }

    private static boolean C(H.b bVar) {
        int i10;
        int c10 = bVar.c();
        if (c10 == 0) {
            return false;
        }
        if ((c10 == 1 && bVar.q(0)) || !bVar.r(bVar.o())) {
            return false;
        }
        long j10 = 0;
        if (bVar.e(0) != -1) {
            return false;
        }
        if (bVar.f19747d == 0) {
            return true;
        }
        if (bVar.q(c10 - 1)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = c10 - i10;
        for (int i12 = 0; i12 <= i11; i12++) {
            j10 += bVar.i(i12);
        }
        if (bVar.f19747d <= j10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void D(C4770v.a aVar, C2615C.b bVar) {
        this.f17578c.S(aVar.k(), bVar);
    }

    private void E() {
        C2615C.b bVar;
        C4770v.a t10 = C4770v.t();
        for (V v10 = this.f17584i; v10 != null; v10 = v10.k()) {
            t10.a(v10.f17554f.f17564a);
        }
        V v11 = this.f17585j;
        if (v11 == null) {
            bVar = null;
        } else {
            bVar = v11.f17554f.f17564a;
        }
        this.f17579d.f(new X(this, t10, bVar));
    }

    private void G(List list) {
        for (int i10 = 0; i10 < this.f17591p.size(); i10++) {
            ((V) this.f17591p.get(i10)).v();
        }
        this.f17591p = list;
    }

    private V J(W w10) {
        for (int i10 = 0; i10 < this.f17591p.size(); i10++) {
            if (((V) this.f17591p.get(i10)).d(w10)) {
                return (V) this.f17591p.remove(i10);
            }
        }
        return null;
    }

    private static C2615C.b K(H h10, Object obj, long j10, long j11, H.c cVar, H.b bVar) {
        h10.h(obj, bVar);
        h10.n(bVar.f19746c, cVar);
        int b10 = h10.b(obj);
        Object obj2 = obj;
        while (C(bVar) && b10 <= cVar.f19781o) {
            h10.g(b10, bVar, true);
            obj2 = C2076a.e(bVar.f19745b);
            b10++;
        }
        h10.h(obj2, bVar);
        int e10 = bVar.e(j10);
        if (e10 == -1) {
            return new C2615C.b(obj2, j11, bVar.d(j10));
        }
        return new C2615C.b(obj2, e10, bVar.k(e10), j11);
    }

    private long M(H h10, Object obj) {
        int b10;
        int i10 = h10.h(obj, this.f17576a).f19746c;
        Object obj2 = this.f17588m;
        if (obj2 != null && (b10 = h10.b(obj2)) != -1 && h10.f(b10, this.f17576a).f19746c == i10) {
            return this.f17589n;
        }
        for (V v10 = this.f17584i; v10 != null; v10 = v10.k()) {
            if (v10.f17550b.equals(obj)) {
                return v10.f17554f.f17564a.f25963d;
            }
        }
        for (V v11 = this.f17584i; v11 != null; v11 = v11.k()) {
            int b11 = h10.b(v11.f17550b);
            if (b11 != -1 && h10.f(b11, this.f17576a).f19746c == i10) {
                return v11.f17554f.f17564a.f25963d;
            }
        }
        long N10 = N(obj);
        if (N10 != -1) {
            return N10;
        }
        long j10 = this.f17581f;
        this.f17581f = 1 + j10;
        if (this.f17584i == null) {
            this.f17588m = obj;
            this.f17589n = j10;
        }
        return j10;
    }

    private long N(Object obj) {
        for (int i10 = 0; i10 < this.f17591p.size(); i10++) {
            V v10 = (V) this.f17591p.get(i10);
            if (v10.f17550b.equals(obj)) {
                return v10.f17554f.f17564a.f25963d;
            }
        }
        return -1;
    }

    private boolean P(H h10) {
        V v10 = this.f17584i;
        if (v10 == null) {
            return true;
        }
        int b10 = h10.b(v10.f17550b);
        while (true) {
            b10 = h10.d(b10, this.f17576a, this.f17577b, this.f17582g, this.f17583h);
            while (((V) C2076a.e(v10)).k() != null && !v10.f17554f.f17570g) {
                v10 = v10.k();
            }
            V k10 = v10.k();
            if (b10 == -1 || k10 == null || h10.b(k10.f17550b) != b10) {
                boolean I10 = I(v10);
                v10.f17554f = v(h10, v10.f17554f);
            } else {
                v10 = k10;
            }
        }
        boolean I102 = I(v10);
        v10.f17554f = v(h10, v10.f17554f);
        return !I102;
    }

    static boolean d(long j10, long j11) {
        return j10 == -9223372036854775807L || j10 == j11;
    }

    private boolean e(W w10, W w11) {
        if (w10.f17565b != w11.f17565b || !w10.f17564a.equals(w11.f17564a)) {
            return false;
        }
        return true;
    }

    private Pair h(H h10, Object obj, long j10) {
        int e10 = h10.e(h10.h(obj, this.f17576a).f19746c, this.f17582g, this.f17583h);
        if (e10 == -1) {
            return null;
        }
        return h10.k(this.f17577b, this.f17576a, e10, -9223372036854775807L, j10);
    }

    private W i(n0 n0Var) {
        return n(n0Var.f17754a, n0Var.f17755b, n0Var.f17756c, n0Var.f17772s);
    }

    private W j(H h10, V v10, long j10) {
        long j11;
        Object obj;
        long j12;
        long j13;
        W w10;
        long j14;
        long N10;
        H h11 = h10;
        W w11 = v10.f17554f;
        int d10 = h10.d(h11.b(w11.f17564a.f25960a), this.f17576a, this.f17577b, this.f17582g, this.f17583h);
        if (d10 == -1) {
            return null;
        }
        int i10 = h11.g(d10, this.f17576a, true).f19746c;
        Object e10 = C2076a.e(this.f17576a.f19745b);
        long j15 = w11.f17564a.f25963d;
        if (h11.n(i10, this.f17577b).f19780n == d10) {
            w10 = w11;
            Pair k10 = h10.k(this.f17577b, this.f17576a, i10, -9223372036854775807L, Math.max(0, j10));
            if (k10 == null) {
                return null;
            }
            Object obj2 = k10.first;
            long longValue = ((Long) k10.second).longValue();
            V k11 = v10.k();
            if (k11 == null || !k11.f17550b.equals(obj2)) {
                N10 = N(obj2);
                if (N10 == -1) {
                    N10 = this.f17581f;
                    this.f17581f = 1 + N10;
                }
            } else {
                N10 = k11.f17554f.f17564a.f25963d;
            }
            j11 = N10;
            j12 = -9223372036854775807L;
            obj = obj2;
            j13 = longValue;
        } else {
            w10 = w11;
            j11 = j15;
            j12 = 0;
            obj = e10;
            j13 = 0;
        }
        C2615C.b K10 = K(h10, obj, j13, j11, this.f17577b, this.f17576a);
        if (!(j12 == -9223372036854775807L || w10.f17566c == -9223372036854775807L)) {
            boolean w12 = w(w10.f17564a.f25960a, h11);
            if (K10.b() && w12) {
                j12 = w10.f17566c;
            } else if (w12) {
                j14 = w10.f17566c;
                return n(h10, K10, j12, j14);
            }
        }
        j14 = j13;
        return n(h10, K10, j12, j14);
    }

    private W k(H h10, V v10, long j10) {
        W w10 = v10.f17554f;
        long m10 = (v10.m() + w10.f17568e) - j10;
        if (w10.f17570g) {
            return j(h10, v10, m10);
        }
        return l(h10, v10, m10);
    }

    private W l(H h10, V v10, long j10) {
        boolean z10;
        H h11 = h10;
        W w10 = v10.f17554f;
        C2615C.b bVar = w10.f17564a;
        h10.h(bVar.f25960a, this.f17576a);
        if (bVar.b()) {
            int i10 = bVar.f25961b;
            int a10 = this.f17576a.a(i10);
            if (a10 == -1) {
                return null;
            }
            int l10 = this.f17576a.l(i10, bVar.f25962c);
            if (l10 < a10) {
                return o(h10, bVar.f25960a, i10, l10, w10.f17566c, bVar.f25963d);
            }
            long j11 = w10.f17566c;
            if (j11 == -9223372036854775807L) {
                H.c cVar = this.f17577b;
                H.b bVar2 = this.f17576a;
                Pair k10 = h10.k(cVar, bVar2, bVar2.f19746c, -9223372036854775807L, Math.max(0, j10));
                if (k10 == null) {
                    return null;
                }
                j11 = ((Long) k10.second).longValue();
            }
            long r10 = r(h10, bVar.f25960a, bVar.f25961b);
            return p(h10, bVar.f25960a, Math.max(r10, j11), w10.f17566c, bVar.f25963d);
        }
        long j12 = j10;
        int i11 = bVar.f25964e;
        if (i11 != -1 && this.f17576a.q(i11)) {
            return j(h10, v10, j10);
        }
        int k11 = this.f17576a.k(bVar.f25964e);
        if (!this.f17576a.r(bVar.f25964e) || this.f17576a.h(bVar.f25964e, k11) != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (k11 == this.f17576a.a(bVar.f25964e) || z10) {
            return p(h10, bVar.f25960a, r(h10, bVar.f25960a, bVar.f25964e), w10.f17568e, bVar.f25963d);
        }
        return o(h10, bVar.f25960a, bVar.f25964e, k11, w10.f17568e, bVar.f25963d);
    }

    private W n(H h10, C2615C.b bVar, long j10, long j11) {
        C2615C.b bVar2 = bVar;
        H h11 = h10;
        h10.h(bVar2.f25960a, this.f17576a);
        if (bVar.b()) {
            return o(h10, bVar2.f25960a, bVar2.f25961b, bVar2.f25962c, j10, bVar2.f25963d);
        }
        return p(h10, bVar2.f25960a, j11, j10, bVar2.f25963d);
    }

    private W o(H h10, Object obj, int i10, int i11, long j10, long j11) {
        long j12;
        long j13;
        int i12 = i11;
        C2615C.b bVar = new C2615C.b(obj, i10, i12, j11);
        long b10 = h10.h(bVar.f25960a, this.f17576a).b(bVar.f25961b, bVar.f25962c);
        if (i12 == this.f17576a.k(i10)) {
            j12 = this.f17576a.g();
        } else {
            j12 = 0;
        }
        boolean r10 = this.f17576a.r(bVar.f25961b);
        if (b10 == -9223372036854775807L || j12 < b10) {
            j13 = j12;
        } else {
            j13 = Math.max(0, b10 - 1);
        }
        return new W(bVar, j13, j10, -9223372036854775807L, b10, r10, false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.media3.exoplayer.W p(f2.H r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            f2.H$b r5 = r0.f17576a
            r1.h(r2, r5)
            f2.H$b r5 = r0.f17576a
            int r5 = r5.d(r3)
            r6 = 0
            r7 = 1
            r8 = -1
            if (r5 == r8) goto L_0x0022
            f2.H$b r9 = r0.f17576a
            boolean r9 = r9.q(r5)
            if (r9 == 0) goto L_0x0022
            r9 = r7
            goto L_0x0023
        L_0x0022:
            r9 = r6
        L_0x0023:
            if (r5 != r8) goto L_0x003b
            f2.H$b r10 = r0.f17576a
            int r10 = r10.c()
            if (r10 <= 0) goto L_0x005a
            f2.H$b r10 = r0.f17576a
            int r11 = r10.o()
            boolean r10 = r10.r(r11)
            if (r10 == 0) goto L_0x005a
            r10 = r7
            goto L_0x005b
        L_0x003b:
            f2.H$b r10 = r0.f17576a
            boolean r10 = r10.r(r5)
            if (r10 == 0) goto L_0x005a
            f2.H$b r10 = r0.f17576a
            long r10 = r10.f(r5)
            f2.H$b r12 = r0.f17576a
            long r13 = r12.f19747d
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L_0x005a
            boolean r10 = r12.p(r5)
            if (r10 == 0) goto L_0x005a
            r10 = r7
            r5 = r8
            goto L_0x005b
        L_0x005a:
            r10 = r6
        L_0x005b:
            t2.C$b r12 = new t2.C$b
            r13 = r32
            r12.<init>(r2, r13, r5)
            boolean r2 = r0.y(r12)
            boolean r23 = r0.A(r1, r12)
            boolean r24 = r0.z(r1, r12, r2)
            if (r5 == r8) goto L_0x007d
            f2.H$b r1 = r0.f17576a
            boolean r1 = r1.r(r5)
            if (r1 == 0) goto L_0x007d
            if (r9 != 0) goto L_0x007d
            r21 = r7
            goto L_0x007f
        L_0x007d:
            r21 = r6
        L_0x007f:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r8) goto L_0x0091
            if (r9 != 0) goto L_0x0091
            f2.H$b r1 = r0.f17576a
            long r8 = r1.f(r5)
        L_0x008e:
            r17 = r8
            goto L_0x009a
        L_0x0091:
            if (r10 == 0) goto L_0x0098
            f2.H$b r1 = r0.f17576a
            long r8 = r1.f19747d
            goto L_0x008e
        L_0x0098:
            r17 = r13
        L_0x009a:
            int r1 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x00a8
            r8 = -9223372036854775808
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r19 = r17
            goto L_0x00ae
        L_0x00a8:
            f2.H$b r1 = r0.f17576a
            long r8 = r1.f19747d
            r19 = r8
        L_0x00ae:
            int r1 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x00c4
            int r1 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r1 < 0) goto L_0x00c4
            if (r24 != 0) goto L_0x00ba
            if (r10 != 0) goto L_0x00bb
        L_0x00ba:
            r6 = r7
        L_0x00bb:
            long r3 = (long) r6
            long r3 = r19 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        L_0x00c4:
            r13 = r3
            androidx.media3.exoplayer.W r1 = new androidx.media3.exoplayer.W
            r11 = r1
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.Y.p(f2.H, java.lang.Object, long, long, long):androidx.media3.exoplayer.W");
    }

    private W q(H h10, Object obj, long j10, long j11) {
        C2615C.b K10 = K(h10, obj, j10, j11, this.f17577b, this.f17576a);
        if (K10.b()) {
            return o(h10, K10.f25960a, K10.f25961b, K10.f25962c, j10, K10.f25963d);
        }
        return p(h10, K10.f25960a, j10, -9223372036854775807L, K10.f25963d);
    }

    private long r(H h10, Object obj, int i10) {
        h10.h(obj, this.f17576a);
        long f10 = this.f17576a.f(i10);
        if (f10 == Long.MIN_VALUE) {
            return this.f17576a.f19747d;
        }
        return f10 + this.f17576a.i(i10);
    }

    private boolean w(Object obj, H h10) {
        int c10 = h10.h(obj, this.f17576a).c();
        int o10 = this.f17576a.o();
        if (c10 <= 0 || !this.f17576a.r(o10) || (c10 <= 1 && this.f17576a.f(o10) == Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    private boolean y(C2615C.b bVar) {
        if (bVar.b() || bVar.f25964e != -1) {
            return false;
        }
        return true;
    }

    private boolean z(H h10, C2615C.b bVar, boolean z10) {
        int b10 = h10.b(bVar.f25960a);
        if (!h10.n(h10.f(b10, this.f17576a).f19746c, this.f17577b).f19775i) {
            if (!h10.r(b10, this.f17576a, this.f17577b, this.f17582g, this.f17583h) || !z10) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean B(C2614B b10) {
        V v10 = this.f17586k;
        if (v10 == null || v10.f17549a != b10) {
            return false;
        }
        return true;
    }

    public void F(long j10) {
        V v10 = this.f17586k;
        if (v10 != null) {
            v10.u(j10);
        }
    }

    public void H() {
        if (!this.f17591p.isEmpty()) {
            G(new ArrayList());
        }
    }

    public boolean I(V v10) {
        C2076a.i(v10);
        boolean z10 = false;
        if (v10.equals(this.f17586k)) {
            return false;
        }
        this.f17586k = v10;
        while (v10.k() != null) {
            v10 = (V) C2076a.e(v10.k());
            if (v10 == this.f17585j) {
                this.f17585j = this.f17584i;
                z10 = true;
            }
            v10.v();
            this.f17587l--;
        }
        ((V) C2076a.e(this.f17586k)).y((V) null);
        E();
        return z10;
    }

    public C2615C.b L(H h10, Object obj, long j10) {
        long M10 = M(h10, obj);
        h10.h(obj, this.f17576a);
        h10.n(this.f17576a.f19746c, this.f17577b);
        boolean z10 = false;
        for (int b10 = h10.b(obj); b10 >= this.f17577b.f19780n; b10--) {
            boolean z11 = true;
            h10.g(b10, this.f17576a, true);
            if (this.f17576a.c() <= 0) {
                z11 = false;
            }
            z10 |= z11;
            H.b bVar = this.f17576a;
            if (bVar.e(bVar.f19747d) != -1) {
                obj = C2076a.e(this.f17576a.f19745b);
            }
            if (z10 && (!z11 || this.f17576a.f19747d != 0)) {
                break;
            }
        }
        return K(h10, obj, j10, M10, this.f17577b, this.f17576a);
    }

    public boolean O() {
        V v10 = this.f17586k;
        if (v10 == null || (!v10.f17554f.f17572i && v10.s() && this.f17586k.f17554f.f17568e != -9223372036854775807L && this.f17587l < 100)) {
            return true;
        }
        return false;
    }

    public void Q(H h10, ExoPlayer.c cVar) {
        this.f17590o = cVar;
        x(h10);
    }

    public boolean R(H h10, long j10, long j11) {
        W w10;
        long j12;
        boolean z10;
        V v10 = null;
        for (V v11 = this.f17584i; v11 != null; v11 = v11.k()) {
            W w11 = v11.f17554f;
            if (v10 == null) {
                w10 = v(h10, w11);
            } else {
                W k10 = k(h10, v10, j10);
                if (k10 == null) {
                    return !I(v10);
                }
                if (!e(w11, k10)) {
                    return !I(v10);
                }
                w10 = k10;
            }
            v11.f17554f = w10.a(w11.f17566c);
            if (!d(w11.f17568e, w10.f17568e)) {
                v11.C();
                long j13 = w10.f17568e;
                if (j13 == -9223372036854775807L) {
                    j12 = Long.MAX_VALUE;
                } else {
                    j12 = v11.B(j13);
                }
                if (v11 != this.f17585j || v11.f17554f.f17569f || (j11 != Long.MIN_VALUE && j11 < j12)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (I(v11) || z10) {
                    return false;
                }
                return true;
            }
            v10 = v11;
        }
        return true;
    }

    public boolean S(H h10, int i10) {
        this.f17582g = i10;
        return P(h10);
    }

    public boolean T(H h10, boolean z10) {
        this.f17583h = z10;
        return P(h10);
    }

    public V b() {
        V v10 = this.f17584i;
        if (v10 == null) {
            return null;
        }
        if (v10 == this.f17585j) {
            this.f17585j = v10.k();
        }
        this.f17584i.v();
        int i10 = this.f17587l - 1;
        this.f17587l = i10;
        if (i10 == 0) {
            this.f17586k = null;
            V v11 = this.f17584i;
            this.f17588m = v11.f17550b;
            this.f17589n = v11.f17554f.f17564a.f25963d;
        }
        this.f17584i = this.f17584i.k();
        E();
        return this.f17584i;
    }

    public V c() {
        this.f17585j = ((V) C2076a.i(this.f17585j)).k();
        E();
        return (V) C2076a.i(this.f17585j);
    }

    public void f() {
        if (this.f17587l != 0) {
            V v10 = (V) C2076a.i(this.f17584i);
            this.f17588m = v10.f17550b;
            this.f17589n = v10.f17554f.f17564a.f25963d;
            while (v10 != null) {
                v10.v();
                v10 = v10.k();
            }
            this.f17584i = null;
            this.f17586k = null;
            this.f17585j = null;
            this.f17587l = 0;
            E();
        }
    }

    public V g(W w10) {
        long j10;
        V v10 = this.f17586k;
        if (v10 == null) {
            j10 = 1000000000000L;
        } else {
            j10 = (v10.m() + this.f17586k.f17554f.f17568e) - w10.f17565b;
        }
        V J10 = J(w10);
        if (J10 == null) {
            J10 = this.f17580e.a(w10, j10);
        } else {
            J10.f17554f = w10;
            J10.z(j10);
        }
        V v11 = this.f17586k;
        if (v11 != null) {
            v11.y(J10);
        } else {
            this.f17584i = J10;
            this.f17585j = J10;
        }
        this.f17588m = null;
        this.f17586k = J10;
        this.f17587l++;
        E();
        return J10;
    }

    public V m() {
        return this.f17586k;
    }

    public W s(long j10, n0 n0Var) {
        V v10 = this.f17586k;
        if (v10 == null) {
            return i(n0Var);
        }
        return k(n0Var.f17754a, v10, j10);
    }

    public V t() {
        return this.f17584i;
    }

    public V u() {
        return this.f17585j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.media3.exoplayer.W v(f2.H r19, androidx.media3.exoplayer.W r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            t2.C$b r3 = r2.f17564a
            boolean r12 = r0.y(r3)
            boolean r13 = r0.A(r1, r3)
            boolean r14 = r0.z(r1, r3, r12)
            t2.C$b r4 = r2.f17564a
            java.lang.Object r4 = r4.f25960a
            f2.H$b r5 = r0.f17576a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L_0x0035
            int r1 = r3.f25964e
            if (r1 != r6) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            f2.H$b r7 = r0.f17576a
            long r7 = r7.f(r1)
            goto L_0x0036
        L_0x0035:
            r7 = r4
        L_0x0036:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x0048
            f2.H$b r1 = r0.f17576a
            int r4 = r3.f25961b
            int r5 = r3.f25962c
            long r4 = r1.b(r4, r5)
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
            f2.H$b r1 = r0.f17576a
            long r4 = r1.j()
            goto L_0x0046
        L_0x005c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x006c
            f2.H$b r1 = r0.f17576a
            int r4 = r3.f25961b
            boolean r1 = r1.r(r4)
        L_0x006a:
            r11 = r1
            goto L_0x007c
        L_0x006c:
            int r1 = r3.f25964e
            if (r1 == r6) goto L_0x007a
            f2.H$b r4 = r0.f17576a
            boolean r1 = r4.r(r1)
            if (r1 == 0) goto L_0x007a
            r1 = 1
            goto L_0x006a
        L_0x007a:
            r1 = 0
            goto L_0x006a
        L_0x007c:
            androidx.media3.exoplayer.W r15 = new androidx.media3.exoplayer.W
            long r4 = r2.f17565b
            long r1 = r2.f17566c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.Y.v(f2.H, androidx.media3.exoplayer.W):androidx.media3.exoplayer.W");
    }

    public void x(H h10) {
        V v10;
        if (this.f17590o.f17362a == -9223372036854775807L || (v10 = this.f17586k) == null) {
            H();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair h11 = h(h10, v10.f17554f.f17564a.f25960a, 0);
        if (h11 != null && !h10.n(h10.h(h11.first, this.f17576a).f19746c, this.f17577b).f()) {
            long N10 = N(h11.first);
            if (N10 == -1) {
                N10 = this.f17581f;
                this.f17581f = 1 + N10;
            }
            H h12 = h10;
            W q10 = q(h12, h11.first, ((Long) h11.second).longValue(), N10);
            V J10 = J(q10);
            if (J10 == null) {
                J10 = this.f17580e.a(q10, (v10.m() + v10.f17554f.f17568e) - q10.f17565b);
            }
            arrayList.add(J10);
        }
        G(arrayList);
    }
}
