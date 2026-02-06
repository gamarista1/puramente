package t2;

import android.net.Uri;
import f2.H;
import f2.w;
import i2.C2076a;

public final class c0 extends H {

    /* renamed from: r  reason: collision with root package name */
    private static final Object f26168r = new Object();

    /* renamed from: s  reason: collision with root package name */
    private static final w f26169s = new w.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* renamed from: e  reason: collision with root package name */
    private final long f26170e;

    /* renamed from: f  reason: collision with root package name */
    private final long f26171f;

    /* renamed from: g  reason: collision with root package name */
    private final long f26172g;

    /* renamed from: h  reason: collision with root package name */
    private final long f26173h;

    /* renamed from: i  reason: collision with root package name */
    private final long f26174i;

    /* renamed from: j  reason: collision with root package name */
    private final long f26175j;

    /* renamed from: k  reason: collision with root package name */
    private final long f26176k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f26177l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f26178m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f26179n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f26180o;

    /* renamed from: p  reason: collision with root package name */
    private final w f26181p;

    /* renamed from: q  reason: collision with root package name */
    private final w.g f26182q;

    public c0(long j10, boolean z10, boolean z11, boolean z12, Object obj, w wVar) {
        this(j10, j10, 0, 0, z10, z11, z12, obj, wVar);
    }

    public int b(Object obj) {
        if (f26168r.equals(obj)) {
            return 0;
        }
        return -1;
    }

    public H.b g(int i10, H.b bVar, boolean z10) {
        Object obj;
        C2076a.c(i10, 0, 1);
        if (z10) {
            obj = f26168r;
        } else {
            obj = null;
        }
        return bVar.s((Object) null, obj, 0, this.f26173h, -this.f26175j);
    }

    public int i() {
        return 1;
    }

    public Object m(int i10) {
        C2076a.c(i10, 0, 1);
        return f26168r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r1 > r3) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f2.H.c o(int r25, f2.H.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            i2.C2076a.c(r3, r1, r2)
            long r1 = r0.f26176k
            boolean r14 = r0.f26178m
            if (r14 == 0) goto L_0x002e
            boolean r3 = r0.f26179n
            if (r3 != 0) goto L_0x002e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x002e
            long r3 = r0.f26174i
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
            java.lang.Object r4 = f2.H.c.f19757q
            f2.w r5 = r0.f26181p
            java.lang.Object r6 = r0.f26180o
            long r7 = r0.f26170e
            long r9 = r0.f26171f
            long r11 = r0.f26172g
            boolean r13 = r0.f26177l
            f2.w$g r15 = r0.f26182q
            long r1 = r0.f26174i
            r18 = r1
            r21 = 0
            long r1 = r0.f26175j
            r22 = r1
            r20 = 0
            r3 = r26
            f2.H$c r1 = r3.g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.c0.o(int, f2.H$c, long):f2.H$c");
    }

    public int p() {
        return 1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, w wVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, wVar, z12 ? wVar.f20159d : null);
    }

    public c0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, w wVar, w.g gVar) {
        this.f26170e = j10;
        this.f26171f = j11;
        this.f26172g = j12;
        this.f26173h = j13;
        this.f26174i = j14;
        this.f26175j = j15;
        this.f26176k = j16;
        this.f26177l = z10;
        this.f26178m = z11;
        this.f26179n = z12;
        this.f26180o = obj;
        this.f26181p = (w) C2076a.e(wVar);
        this.f26182q = gVar;
    }
}
