package D;

import E.z;
import Ef.m;
import H0.U;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.b;
import c1.n;
import c1.o;
import c1.t;
import java.util.List;
import k0.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u0.C2673c;
import yf.C6798l;

public final class s implements k, z {

    /* renamed from: a  reason: collision with root package name */
    private final int f1324a;

    /* renamed from: b  reason: collision with root package name */
    private final List f1325b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1326c;

    /* renamed from: d  reason: collision with root package name */
    private final c.b f1327d;

    /* renamed from: e  reason: collision with root package name */
    private final c.C0368c f1328e;

    /* renamed from: f  reason: collision with root package name */
    private final t f1329f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1330g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1331h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1332i;

    /* renamed from: j  reason: collision with root package name */
    private final int f1333j;

    /* renamed from: k  reason: collision with root package name */
    private final long f1334k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f1335l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f1336m;

    /* renamed from: n  reason: collision with root package name */
    private final LazyLayoutItemAnimator f1337n;

    /* renamed from: o  reason: collision with root package name */
    private final long f1338o;

    /* renamed from: p  reason: collision with root package name */
    private int f1339p;

    /* renamed from: q  reason: collision with root package name */
    private final int f1340q;

    /* renamed from: r  reason: collision with root package name */
    private final int f1341r;

    /* renamed from: s  reason: collision with root package name */
    private final int f1342s;

    /* renamed from: t  reason: collision with root package name */
    private final int f1343t;

    /* renamed from: u  reason: collision with root package name */
    private final int f1344u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1345v;

    /* renamed from: w  reason: collision with root package name */
    private int f1346w;

    /* renamed from: x  reason: collision with root package name */
    private int f1347x;

    /* renamed from: y  reason: collision with root package name */
    private int f1348y;

    /* renamed from: z  reason: collision with root package name */
    private final int[] f1349z;

    public /* synthetic */ s(int i10, List list, boolean z10, c.b bVar, c.C0368c cVar, t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, z10, bVar, cVar, tVar, z11, i11, i12, i13, j10, obj, obj2, lazyLayoutItemAnimator, j11);
    }

    private final int n(long j10) {
        if (g()) {
            return n.k(j10);
        }
        return n.j(j10);
    }

    private final int o(U u10) {
        if (g()) {
            return u10.R0();
        }
        return u10.X0();
    }

    public int a() {
        return this.f1339p;
    }

    public final void b(int i10, boolean z10) {
        int i11;
        if (!p()) {
            this.f1339p = a() + i10;
            int length = this.f1349z.length;
            for (int i12 = 0; i12 < length; i12++) {
                if ((g() && i12 % 2 == 1) || (!g() && i12 % 2 == 0)) {
                    int[] iArr = this.f1349z;
                    iArr[i12] = iArr[i12] + i10;
                }
            }
            if (z10) {
                int d10 = d();
                for (int i13 = 0; i13 < d10; i13++) {
                    b e10 = this.f1337n.e(getKey(), i13);
                    if (e10 != null) {
                        long s10 = e10.s();
                        if (g()) {
                            i11 = n.j(s10);
                        } else {
                            i11 = Integer.valueOf(n.j(s10) + i10).intValue();
                        }
                        boolean g10 = g();
                        int k10 = n.k(s10);
                        if (g10) {
                            k10 += i10;
                        }
                        e10.J(o.a(i11, k10));
                    }
                }
            }
        }
    }

    public long c() {
        return this.f1338o;
    }

    public int d() {
        return this.f1325b.size();
    }

    public void e(boolean z10) {
        this.f1345v = z10;
    }

    public int f() {
        return this.f1342s;
    }

    public boolean g() {
        return this.f1326c;
    }

    public int getIndex() {
        return this.f1324a;
    }

    public Object getKey() {
        return this.f1335l;
    }

    public int getSize() {
        return this.f1340q;
    }

    public void h(int i10, int i11, int i12, int i13) {
        r(i10, i12, i13);
    }

    public int i() {
        return this.f1343t;
    }

    public Object j(int i10) {
        return ((U) this.f1325b.get(i10)).a();
    }

    public long k(int i10) {
        int[] iArr = this.f1349z;
        int i11 = i10 * 2;
        return o.a(iArr[i11], iArr[i11 + 1]);
    }

    public int l() {
        return this.f1341r;
    }

    public final int m() {
        return this.f1344u;
    }

    public boolean p() {
        return this.f1345v;
    }

    public final void q(U.a aVar, boolean z10) {
        C2673c cVar;
        int i10;
        int i11;
        if (this.f1346w != Integer.MIN_VALUE) {
            int d10 = d();
            for (int i12 = 0; i12 < d10; i12++) {
                U u10 = (U) this.f1325b.get(i12);
                int o10 = this.f1347x - o(u10);
                int i13 = this.f1348y;
                long k10 = k(i12);
                b e10 = this.f1337n.e(getKey(), i12);
                if (e10 != null) {
                    if (z10) {
                        e10.F(k10);
                    } else {
                        if (!n.i(e10.q(), b.f12977s.a())) {
                            k10 = e10.q();
                        }
                        long n10 = n.n(k10, e10.r());
                        if ((n(k10) <= o10 && n(n10) <= o10) || (n(k10) >= i13 && n(n10) >= i13)) {
                            e10.n();
                        }
                        k10 = n10;
                    }
                    cVar = e10.p();
                } else {
                    cVar = null;
                }
                if (this.f1330g) {
                    if (g()) {
                        i10 = n.j(k10);
                    } else {
                        i10 = (this.f1346w - n.j(k10)) - o(u10);
                    }
                    if (g()) {
                        i11 = (this.f1346w - n.k(k10)) - o(u10);
                    } else {
                        i11 = n.k(k10);
                    }
                    k10 = o.a(i10, i11);
                }
                long n11 = n.n(k10, this.f1334k);
                if (!z10 && e10 != null) {
                    e10.E(n11);
                }
                if (g()) {
                    if (cVar != null) {
                        U.a.z(aVar, u10, n11, cVar, 0.0f, 4, (Object) null);
                    } else {
                        U.a.y(aVar, u10, n11, 0.0f, (C6798l) null, 6, (Object) null);
                    }
                } else if (cVar != null) {
                    U.a.t(aVar, u10, n11, cVar, 0.0f, 4, (Object) null);
                } else {
                    U.a.s(aVar, u10, n11, 0.0f, (C6798l) null, 6, (Object) null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first");
    }

    public final void r(int i10, int i11, int i12) {
        int i13;
        int X02;
        this.f1339p = i10;
        if (g()) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        this.f1346w = i13;
        List list = this.f1325b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            U u10 = (U) list.get(i14);
            int i15 = i14 * 2;
            if (g()) {
                int[] iArr = this.f1349z;
                c.b bVar = this.f1327d;
                if (bVar != null) {
                    iArr[i15] = bVar.a(u10.X0(), i11, this.f1329f);
                    this.f1349z[i15 + 1] = i10;
                    X02 = u10.R0();
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true");
                }
            } else {
                int[] iArr2 = this.f1349z;
                iArr2[i15] = i10;
                int i16 = i15 + 1;
                c.C0368c cVar = this.f1328e;
                if (cVar != null) {
                    iArr2[i16] = cVar.a(u10.R0(), i12);
                    X02 = u10.X0();
                } else {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false");
                }
            }
            i10 += X02;
        }
        this.f1347x = -this.f1331h;
        this.f1348y = this.f1346w + this.f1332i;
    }

    public final void s(int i10) {
        this.f1346w = i10;
        this.f1348y = i10 + this.f1332i;
    }

    private s(int i10, List list, boolean z10, c.b bVar, c.C0368c cVar, t tVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11) {
        this.f1324a = i10;
        this.f1325b = list;
        this.f1326c = z10;
        this.f1327d = bVar;
        this.f1328e = cVar;
        this.f1329f = tVar;
        this.f1330g = z11;
        this.f1331h = i11;
        this.f1332i = i12;
        this.f1333j = i13;
        this.f1334k = j10;
        this.f1335l = obj;
        this.f1336m = obj2;
        this.f1337n = lazyLayoutItemAnimator;
        this.f1338o = j11;
        this.f1342s = 1;
        this.f1346w = Integer.MIN_VALUE;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            U u10 = (U) list.get(i16);
            i14 += g() ? u10.R0() : u10.X0();
            i15 = Math.max(i15, !g() ? u10.R0() : u10.X0());
        }
        this.f1340q = i14;
        this.f1343t = m.d(getSize() + this.f1333j, 0);
        this.f1344u = i15;
        this.f1349z = new int[(this.f1325b.size() * 2)];
    }
}
