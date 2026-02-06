package D0;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import q0.C2421g;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    private final long f1359a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1360b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1361c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f1362d;

    /* renamed from: e  reason: collision with root package name */
    private final float f1363e;

    /* renamed from: f  reason: collision with root package name */
    private final long f1364f;

    /* renamed from: g  reason: collision with root package name */
    private final long f1365g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1366h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1367i;

    /* renamed from: j  reason: collision with root package name */
    private final long f1368j;

    /* renamed from: k  reason: collision with root package name */
    private List f1369k;

    /* renamed from: l  reason: collision with root package name */
    private long f1370l;

    /* renamed from: m  reason: collision with root package name */
    private C1113d f1371m;

    public /* synthetic */ A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15);
    }

    public static /* synthetic */ A c(A a10, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18;
        boolean z12;
        long j19;
        long j20;
        boolean z13;
        int i12;
        long j21;
        A a11 = a10;
        int i13 = i11;
        if ((i13 & 1) != 0) {
            j16 = a11.f1359a;
        } else {
            j16 = j10;
        }
        if ((i13 & 2) != 0) {
            j17 = a11.f1360b;
        } else {
            j17 = j11;
        }
        if ((i13 & 4) != 0) {
            j18 = a11.f1361c;
        } else {
            j18 = j12;
        }
        if ((i13 & 8) != 0) {
            z12 = a11.f1362d;
        } else {
            z12 = z10;
        }
        if ((i13 & 16) != 0) {
            j19 = a11.f1364f;
        } else {
            j19 = j13;
        }
        if ((i13 & 32) != 0) {
            j20 = a11.f1365g;
        } else {
            j20 = j14;
        }
        if ((i13 & 64) != 0) {
            z13 = a11.f1366h;
        } else {
            z13 = z11;
        }
        if ((i13 & 128) != 0) {
            i12 = a11.f1367i;
        } else {
            i12 = i10;
        }
        int i14 = i12;
        if ((i13 & 512) != 0) {
            j21 = a11.f1368j;
        } else {
            j21 = j15;
        }
        return a10.b(j16, j17, j18, z12, j19, j20, z13, i14, list, j21);
    }

    public final void a() {
        this.f1371m.c(true);
        this.f1371m.d(true);
    }

    public final A b(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        return d(j10, j11, j12, z10, this.f1363e, j13, j14, z11, i10, list, j15);
    }

    public final A d(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, int i10, List list, long j15) {
        long j16 = j10;
        A a10 = r1;
        A a11 = new A(j10, j11, j12, z10, f10, j13, j14, z11, false, i10, list, j15, this.f1370l, (DefaultConstructorMarker) null);
        A a12 = a10;
        a12.f1371m = this.f1371m;
        return a12;
    }

    public final List e() {
        List list = this.f1369k;
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public final long f() {
        return this.f1359a;
    }

    public final long g() {
        return this.f1370l;
    }

    public final long h() {
        return this.f1361c;
    }

    public final boolean i() {
        return this.f1362d;
    }

    public final float j() {
        return this.f1363e;
    }

    public final long k() {
        return this.f1365g;
    }

    public final boolean l() {
        return this.f1366h;
    }

    public final long m() {
        return this.f1368j;
    }

    public final int n() {
        return this.f1367i;
    }

    public final long o() {
        return this.f1360b;
    }

    public final boolean p() {
        if (this.f1371m.a() || this.f1371m.b()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "PointerInputChange(id=" + z.f(this.f1359a) + ", uptimeMillis=" + this.f1360b + ", position=" + C2421g.t(this.f1361c) + ", pressed=" + this.f1362d + ", pressure=" + this.f1363e + ", previousUptimeMillis=" + this.f1364f + ", previousPosition=" + C2421g.t(this.f1365g) + ", previousPressed=" + this.f1366h + ", isConsumed=" + p() + ", type=" + O.i(this.f1367i) + ", historical=" + e() + ",scrollDelta=" + C2421g.t(this.f1368j) + ')';
    }

    public /* synthetic */ A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, list, j15, j16);
    }

    private A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, long j15) {
        this.f1359a = j10;
        this.f1360b = j11;
        this.f1361c = j12;
        this.f1362d = z10;
        this.f1363e = f10;
        this.f1364f = j13;
        this.f1365g = j14;
        this.f1366h = z11;
        this.f1367i = i10;
        this.f1368j = j15;
        this.f1370l = C2421g.f25320b.c();
        boolean z13 = z12;
        this.f1371m = new C1113d(z13, z13);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ A(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, boolean r35, int r36, long r37, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x000f
            D0.O$a r1 = D0.O.f1413a
            int r1 = r1.d()
            r17 = r1
            goto L_0x0011
        L_0x000f:
            r17 = r36
        L_0x0011:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001e
            q0.g$a r0 = q0.C2421g.f25320b
            long r0 = r0.c()
            r18 = r0
            goto L_0x0020
        L_0x001e:
            r18 = r37
        L_0x0020:
            r20 = 0
            r2 = r21
            r3 = r22
            r5 = r24
            r7 = r26
            r9 = r28
            r10 = r29
            r11 = r30
            r13 = r32
            r15 = r34
            r16 = r35
            r2.<init>(r3, r5, r7, r9, r10, r11, r13, r15, r16, r17, r18, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.A.<init>(long, long, long, boolean, float, long, long, boolean, boolean, int, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private A(long j10, long j11, long j12, boolean z10, float f10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, long j16) {
        this(j10, j11, j12, z10, f10, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
        this.f1369k = list;
        this.f1370l = j16;
    }
}
