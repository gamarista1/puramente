package F;

import H0.G;
import Ug.K;
import c1.d;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;
import z.q;

public final class v implements q, G {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f2068a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f2069b;

    /* renamed from: c  reason: collision with root package name */
    private float f2070c;

    /* renamed from: d  reason: collision with root package name */
    private final G f2071d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2072e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2073f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2074g;

    /* renamed from: h  reason: collision with root package name */
    private final C f2075h;

    /* renamed from: i  reason: collision with root package name */
    private final D f2076i;

    /* renamed from: j  reason: collision with root package name */
    private final d f2077j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2078k;

    /* renamed from: l  reason: collision with root package name */
    private final List f2079l;

    /* renamed from: m  reason: collision with root package name */
    private final long f2080m;

    /* renamed from: n  reason: collision with root package name */
    private final int f2081n;

    /* renamed from: o  reason: collision with root package name */
    private final int f2082o;

    /* renamed from: p  reason: collision with root package name */
    private final int f2083p;

    /* renamed from: q  reason: collision with root package name */
    private final int f2084q;

    /* renamed from: r  reason: collision with root package name */
    private final int f2085r;

    /* renamed from: s  reason: collision with root package name */
    private final K f2086s;

    /* renamed from: t  reason: collision with root package name */
    private final q f2087t;

    public /* synthetic */ v(int[] iArr, int[] iArr2, float f10, G g10, boolean z10, boolean z11, boolean z12, C c10, D d10, d dVar, int i10, List list, long j10, int i11, int i12, int i13, int i14, int i15, K k10, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f10, g10, z10, z11, z12, c10, d10, dVar, i10, list, j10, i11, i12, i13, i14, i15, k10);
    }

    public long a() {
        return this.f2080m;
    }

    public int b() {
        return this.f2084q;
    }

    public q c() {
        return this.f2087t;
    }

    public int d() {
        return this.f2071d.d();
    }

    public int e() {
        return this.f2071d.e();
    }

    public int f() {
        return this.f2083p;
    }

    public final boolean g() {
        if (this.f2068a[0] != 0 || this.f2069b[0] > 0) {
            return true;
        }
        return false;
    }

    public int h() {
        return this.f2078k;
    }

    public int i() {
        return this.f2085r;
    }

    public final boolean j() {
        return this.f2072e;
    }

    public List k() {
        return this.f2079l;
    }

    public final float l() {
        return this.f2070c;
    }

    public final int[] m() {
        return this.f2068a;
    }

    public final int[] n() {
        return this.f2069b;
    }

    public final C o() {
        return this.f2075h;
    }

    public Map p() {
        return this.f2071d.p();
    }

    public void q() {
        this.f2071d.q();
    }

    public C6798l r() {
        return this.f2071d.r();
    }

    public final D s() {
        return this.f2076i;
    }

    public int t() {
        return this.f2082o;
    }

    public int u() {
        return this.f2081n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.f2074g
            r1 = 0
            if (r0 != 0) goto L_0x00e4
            java.util.List r0 = r9.k()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e4
            int[] r0 = r9.f2068a
            int r0 = r0.length
            if (r0 != 0) goto L_0x0016
            goto L_0x00e4
        L_0x0016:
            int[] r0 = r9.f2069b
            int r0 = r0.length
            if (r0 != 0) goto L_0x001d
            goto L_0x00e4
        L_0x001d:
            int r0 = r9.t()
            int r2 = r9.b()
            int r0 = r0 - r2
            java.util.List r2 = r9.k()
            int r3 = r2.size()
            r4 = r1
        L_0x002f:
            r5 = 1
            if (r4 >= r3) goto L_0x00ae
            java.lang.Object r6 = r2.get(r4)
            F.x r6 = (F.x) r6
            boolean r7 = r6.p()
            if (r7 != 0) goto L_0x00ad
            int r7 = r6.o()
            if (r7 > 0) goto L_0x0046
            r7 = r5
            goto L_0x0047
        L_0x0046:
            r7 = r1
        L_0x0047:
            int r8 = r6.o()
            int r8 = r8 + r10
            if (r8 > 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r5 = r1
        L_0x0050:
            if (r7 == r5) goto L_0x0053
            goto L_0x00ad
        L_0x0053:
            int r5 = r6.o()
            int r7 = r9.u()
            if (r5 > r7) goto L_0x007e
            if (r10 >= 0) goto L_0x0071
            int r5 = r6.o()
            int r7 = r6.i()
            int r5 = r5 + r7
            int r7 = r9.u()
            int r5 = r5 - r7
            int r7 = -r10
            if (r5 <= r7) goto L_0x007d
            goto L_0x007e
        L_0x0071:
            int r5 = r9.u()
            int r7 = r6.o()
            int r5 = r5 - r7
            if (r5 <= r10) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            return r1
        L_0x007e:
            int r5 = r6.o()
            int r7 = r6.i()
            int r5 = r5 + r7
            if (r5 < r0) goto L_0x00aa
            if (r10 >= 0) goto L_0x009d
            int r5 = r6.o()
            int r6 = r6.i()
            int r5 = r5 + r6
            int r6 = r9.t()
            int r5 = r5 - r6
            int r6 = -r10
            if (r5 <= r6) goto L_0x00a9
            goto L_0x00aa
        L_0x009d:
            int r5 = r9.t()
            int r6 = r6.o()
            int r5 = r5 - r6
            if (r5 <= r10) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            return r1
        L_0x00aa:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x00ad:
            return r1
        L_0x00ae:
            int[] r0 = r9.f2069b
            int r0 = r0.length
            int[] r2 = new int[r0]
            r3 = r1
        L_0x00b4:
            if (r3 >= r0) goto L_0x00c0
            int[] r4 = r9.f2069b
            r4 = r4[r3]
            int r4 = r4 - r10
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x00b4
        L_0x00c0:
            r9.f2069b = r2
            java.util.List r0 = r9.k()
            int r2 = r0.size()
        L_0x00ca:
            if (r1 >= r2) goto L_0x00d8
            java.lang.Object r3 = r0.get(r1)
            F.x r3 = (F.x) r3
            r3.m(r10)
            int r1 = r1 + 1
            goto L_0x00ca
        L_0x00d8:
            float r0 = (float) r10
            r9.f2070c = r0
            boolean r0 = r9.f2072e
            if (r0 != 0) goto L_0x00e3
            if (r10 <= 0) goto L_0x00e3
            r9.f2072e = r5
        L_0x00e3:
            return r5
        L_0x00e4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F.v.v(int):boolean");
    }

    private v(int[] iArr, int[] iArr2, float f10, G g10, boolean z10, boolean z11, boolean z12, C c10, D d10, d dVar, int i10, List list, long j10, int i11, int i12, int i13, int i14, int i15, K k10) {
        boolean z13 = z11;
        this.f2068a = iArr;
        this.f2069b = iArr2;
        this.f2070c = f10;
        this.f2071d = g10;
        this.f2072e = z10;
        this.f2073f = z13;
        this.f2074g = z12;
        this.f2075h = c10;
        this.f2076i = d10;
        this.f2077j = dVar;
        this.f2078k = i10;
        this.f2079l = list;
        this.f2080m = j10;
        this.f2081n = i11;
        this.f2082o = i12;
        this.f2083p = i13;
        this.f2084q = i14;
        this.f2085r = i15;
        this.f2086s = k10;
        this.f2087t = z13 ? q.Vertical : q.Horizontal;
    }
}
