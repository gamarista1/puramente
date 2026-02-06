package N9;

import android.net.Uri;
import ja.C3645a;
import k9.C3732y0;
import k9.n1;

public final class P extends n1 {

    /* renamed from: p  reason: collision with root package name */
    private static final Object f33170p = new Object();

    /* renamed from: q  reason: collision with root package name */
    private static final C3732y0 f33171q = new C3732y0.c().c("SinglePeriodTimeline").e(Uri.EMPTY).a();

    /* renamed from: c  reason: collision with root package name */
    private final long f33172c;

    /* renamed from: d  reason: collision with root package name */
    private final long f33173d;

    /* renamed from: e  reason: collision with root package name */
    private final long f33174e;

    /* renamed from: f  reason: collision with root package name */
    private final long f33175f;

    /* renamed from: g  reason: collision with root package name */
    private final long f33176g;

    /* renamed from: h  reason: collision with root package name */
    private final long f33177h;

    /* renamed from: i  reason: collision with root package name */
    private final long f33178i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f33179j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f33180k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f33181l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f33182m;

    /* renamed from: n  reason: collision with root package name */
    private final C3732y0 f33183n;

    /* renamed from: o  reason: collision with root package name */
    private final C3732y0.g f33184o;

    public P(long j10, boolean z10, boolean z11, boolean z12, Object obj, C3732y0 y0Var) {
        this(j10, j10, 0, 0, z10, z11, z12, obj, y0Var);
    }

    public int f(Object obj) {
        if (f33170p.equals(obj)) {
            return 0;
        }
        return -1;
    }

    public n1.b k(int i10, n1.b bVar, boolean z10) {
        Object obj;
        C3645a.c(i10, 0, 1);
        if (z10) {
            obj = f33170p;
        } else {
            obj = null;
        }
        return bVar.v((Object) null, obj, 0, this.f33175f, -this.f33177h);
    }

    public int m() {
        return 1;
    }

    public Object q(int i10) {
        C3645a.c(i10, 0, 1);
        return f33170p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r3) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k9.n1.d s(int r25, k9.n1.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            ja.C3645a.c(r3, r1, r2)
            long r1 = r0.f33178i
            boolean r14 = r0.f33180k
            if (r14 == 0) goto L_0x002e
            boolean r3 = r0.f33181l
            if (r3 != 0) goto L_0x002e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002e
            long r3 = r0.f33176g
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0027
        L_0x0024:
            r16 = r5
            goto L_0x0030
        L_0x0027:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x002e
            goto L_0x0024
        L_0x002e:
            r16 = r1
        L_0x0030:
            java.lang.Object r4 = k9.n1.d.f45724r
            k9.y0 r5 = r0.f33183n
            java.lang.Object r6 = r0.f33182m
            long r7 = r0.f33172c
            long r9 = r0.f33173d
            long r11 = r0.f33174e
            boolean r13 = r0.f33179j
            k9.y0$g r15 = r0.f33184o
            long r1 = r0.f33176g
            r18 = r1
            r21 = 0
            long r1 = r0.f33177h
            r22 = r1
            r20 = 0
            r3 = r26
            k9.n1$d r1 = r3.i(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.P.s(int, k9.n1$d, long):k9.n1$d");
    }

    public int t() {
        return 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public P(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, C3732y0 y0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, y0Var, z12 ? y0Var.f45858d : null);
    }

    public P(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, C3732y0 y0Var, C3732y0.g gVar) {
        this.f33172c = j10;
        this.f33173d = j11;
        this.f33174e = j12;
        this.f33175f = j13;
        this.f33176g = j14;
        this.f33177h = j15;
        this.f33178i = j16;
        this.f33179j = z10;
        this.f33180k = z11;
        this.f33181l = z12;
        this.f33182m = obj;
        this.f33183n = (C3732y0) C3645a.e(y0Var);
        this.f33184o = gVar;
    }
}
