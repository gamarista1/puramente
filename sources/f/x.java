package F;

import E.z;
import Ef.m;
import H0.U;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.b;
import c1.n;
import c1.o;
import c1.s;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import u0.C2673c;
import yf.C6798l;

public final class x implements C1174i, z {

    /* renamed from: a  reason: collision with root package name */
    private final int f2094a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f2095b;

    /* renamed from: c  reason: collision with root package name */
    private final List f2096c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f2097d;

    /* renamed from: e  reason: collision with root package name */
    private final int f2098e;

    /* renamed from: f  reason: collision with root package name */
    private final int f2099f;

    /* renamed from: g  reason: collision with root package name */
    private final int f2100g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2101h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f2102i;

    /* renamed from: j  reason: collision with root package name */
    private final LazyLayoutItemAnimator f2103j;

    /* renamed from: k  reason: collision with root package name */
    private final long f2104k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f2105l;

    /* renamed from: m  reason: collision with root package name */
    private final int f2106m;

    /* renamed from: n  reason: collision with root package name */
    private final int f2107n;

    /* renamed from: o  reason: collision with root package name */
    private final int f2108o;

    /* renamed from: p  reason: collision with root package name */
    private int f2109p;

    /* renamed from: q  reason: collision with root package name */
    private int f2110q;

    /* renamed from: r  reason: collision with root package name */
    private int f2111r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f2112s;

    /* renamed from: t  reason: collision with root package name */
    private final long f2113t;

    /* renamed from: u  reason: collision with root package name */
    private long f2114u;

    public /* synthetic */ x(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, list, z10, i11, i12, i13, i14, i15, obj2, lazyLayoutItemAnimator, j10);
    }

    private final int n(long j10) {
        if (g()) {
            return n.k(j10);
        }
        return n.j(j10);
    }

    public long a() {
        return this.f2114u;
    }

    public long b() {
        return this.f2113t;
    }

    public long c() {
        return this.f2104k;
    }

    public int d() {
        return this.f2096c.size();
    }

    public void e(boolean z10) {
        this.f2112s = z10;
    }

    public int f() {
        return this.f2099f;
    }

    public boolean g() {
        return this.f2097d;
    }

    public int getIndex() {
        return this.f2094a;
    }

    public Object getKey() {
        return this.f2095b;
    }

    public void h(int i10, int i11, int i12, int i13) {
        if (g()) {
            i12 = i13;
        }
        s(i10, i11, i12);
    }

    public int i() {
        return this.f2107n;
    }

    public Object j(int i10) {
        return ((U) this.f2096c.get(i10)).a();
    }

    public long k(int i10) {
        return a();
    }

    public int l() {
        return this.f2098e;
    }

    public final void m(int i10) {
        int i11;
        int i12;
        if (!p()) {
            long a10 = a();
            if (g()) {
                i11 = n.j(a10);
            } else {
                i11 = n.j(a10) + i10;
            }
            boolean g10 = g();
            int k10 = n.k(a10);
            if (g10) {
                k10 += i10;
            }
            this.f2114u = o.a(i11, k10);
            int d10 = d();
            for (int i13 = 0; i13 < d10; i13++) {
                b e10 = this.f2103j.e(getKey(), i13);
                if (e10 != null) {
                    long s10 = e10.s();
                    if (g()) {
                        i12 = n.j(s10);
                    } else {
                        i12 = Integer.valueOf(n.j(s10) + i10).intValue();
                    }
                    boolean g11 = g();
                    int k11 = n.k(s10);
                    if (g11) {
                        k11 += i10;
                    }
                    e10.J(o.a(i12, k11));
                }
            }
        }
    }

    public final int o() {
        if (!g()) {
            return n.j(a());
        }
        return n.k(a());
    }

    public boolean p() {
        return this.f2112s;
    }

    public final boolean q() {
        return this.f2105l;
    }

    public final void r(U.a aVar, r rVar) {
        int i10;
        C2673c cVar;
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f2109p != -1) {
            List list = this.f2096c;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                U u10 = (U) list.get(i15);
                int i16 = this.f2110q;
                if (g()) {
                    i10 = u10.R0();
                } else {
                    i10 = u10.X0();
                }
                int i17 = i16 - i10;
                int i18 = this.f2111r;
                long a10 = a();
                b e10 = this.f2103j.e(getKey(), i15);
                if (e10 != null) {
                    long n10 = n.n(a10, e10.r());
                    if ((n(a10) <= i17 && n(n10) <= i17) || (n(a10) >= i18 && n(n10) >= i18)) {
                        e10.n();
                    }
                    cVar = e10.p();
                    a10 = n10;
                } else {
                    cVar = null;
                }
                if (rVar.p()) {
                    if (g()) {
                        i11 = n.j(a10);
                    } else {
                        int j10 = this.f2109p - n.j(a10);
                        if (g()) {
                            i14 = u10.R0();
                        } else {
                            i14 = u10.X0();
                        }
                        i11 = j10 - i14;
                    }
                    if (g()) {
                        int k10 = this.f2109p - n.k(a10);
                        if (g()) {
                            i13 = u10.R0();
                        } else {
                            i13 = u10.X0();
                        }
                        i12 = k10 - i13;
                    } else {
                        i12 = n.k(a10);
                    }
                    a10 = o.a(i11, i12);
                }
                long n11 = n.n(a10, rVar.d());
                if (e10 != null) {
                    e10.E(n11);
                }
                if (cVar != null) {
                    U.a.t(aVar, u10, n11, cVar, 0.0f, 4, (Object) null);
                } else {
                    U.a.s(aVar, u10, n11, 0.0f, (C6798l) null, 6, (Object) null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first");
    }

    public final void s(int i10, int i11, int i12) {
        long j10;
        this.f2109p = i12;
        this.f2110q = -this.f2100g;
        this.f2111r = i12 + this.f2101h;
        if (g()) {
            j10 = o.a(i11, i10);
        } else {
            j10 = o.a(i10, i11);
        }
        this.f2114u = j10;
    }

    public final void t(boolean z10) {
        this.f2105l = z10;
    }

    public String toString() {
        return super.toString();
    }

    public final void u(int i10) {
        this.f2109p = i10;
        this.f2111r = i10 + this.f2101h;
    }

    private x(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10) {
        Integer num;
        long j11;
        this.f2094a = i10;
        this.f2095b = obj;
        this.f2096c = list;
        this.f2097d = z10;
        this.f2098e = i12;
        this.f2099f = i13;
        this.f2100g = i14;
        this.f2101h = i15;
        this.f2102i = obj2;
        this.f2103j = lazyLayoutItemAnimator;
        this.f2104k = j10;
        int i16 = 1;
        this.f2105l = true;
        Integer num2 = null;
        int i17 = 0;
        if (list.isEmpty()) {
            num = null;
        } else {
            U u10 = (U) list.get(0);
            num = Integer.valueOf(g() ? u10.R0() : u10.X0());
            int p10 = C6565s.p(list);
            if (1 <= p10) {
                int i18 = 1;
                while (true) {
                    U u11 = (U) list.get(i18);
                    Integer valueOf = Integer.valueOf(g() ? u11.R0() : u11.X0());
                    num = valueOf.compareTo(num) > 0 ? valueOf : num;
                    if (i18 == p10) {
                        break;
                    }
                    i18++;
                }
            }
        }
        int intValue = num != null ? num.intValue() : 0;
        this.f2106m = intValue;
        this.f2107n = m.d(intValue + i11, 0);
        List list2 = this.f2096c;
        if (!list2.isEmpty()) {
            U u12 = (U) list2.get(0);
            Integer valueOf2 = Integer.valueOf(g() ? u12.X0() : u12.R0());
            int p11 = C6565s.p(list2);
            if (1 <= p11) {
                while (true) {
                    U u13 = (U) list2.get(i16);
                    Integer valueOf3 = Integer.valueOf(g() ? u13.X0() : u13.R0());
                    valueOf2 = valueOf3.compareTo(valueOf2) > 0 ? valueOf3 : valueOf2;
                    if (i16 == p11) {
                        break;
                    }
                    i16++;
                }
            }
            num2 = valueOf2;
        }
        i17 = num2 != null ? num2.intValue() : i17;
        this.f2108o = i17;
        this.f2109p = -1;
        if (g()) {
            j11 = s.a(i17, this.f2106m);
        } else {
            j11 = s.a(this.f2106m, i17);
        }
        this.f2113t = j11;
        this.f2114u = n.f19226b.a();
    }
}
