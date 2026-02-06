package G;

import H0.U;
import c1.n;
import c1.o;
import c1.t;
import java.util.List;
import k0.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;
import z.q;

/* renamed from: G.e  reason: case insensitive filesystem */
public final class C1179e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final int f2295a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2296b;

    /* renamed from: c  reason: collision with root package name */
    private final List f2297c;

    /* renamed from: d  reason: collision with root package name */
    private final long f2298d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f2299e;

    /* renamed from: f  reason: collision with root package name */
    private final c.b f2300f;

    /* renamed from: g  reason: collision with root package name */
    private final c.C0368c f2301g;

    /* renamed from: h  reason: collision with root package name */
    private final t f2302h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f2303i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f2304j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2305k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f2306l;

    /* renamed from: m  reason: collision with root package name */
    private int f2307m;

    /* renamed from: n  reason: collision with root package name */
    private int f2308n;

    public /* synthetic */ C1179e(int i10, int i11, List list, long j10, Object obj, q qVar, c.b bVar, c.C0368c cVar, t tVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, j10, obj, qVar, bVar, cVar, tVar, z10);
    }

    private final int e(U u10) {
        if (this.f2304j) {
            return u10.R0();
        }
        return u10.X0();
    }

    private final long f(int i10) {
        int[] iArr = this.f2306l;
        int i11 = i10 * 2;
        return o.a(iArr[i11], iArr[i11 + 1]);
    }

    public int a() {
        return this.f2307m;
    }

    public final void b(int i10) {
        this.f2307m = a() + i10;
        int length = this.f2306l.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f2304j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                int[] iArr = this.f2306l;
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    public final int c() {
        return this.f2305k;
    }

    public Object d() {
        return this.f2299e;
    }

    public final int g() {
        return this.f2296b;
    }

    public int getIndex() {
        return this.f2295a;
    }

    public final void h(U.a aVar) {
        int i10;
        int i11;
        if (this.f2308n != Integer.MIN_VALUE) {
            int size = this.f2297c.size();
            for (int i12 = 0; i12 < size; i12++) {
                U u10 = (U) this.f2297c.get(i12);
                long f10 = f(i12);
                if (this.f2303i) {
                    if (this.f2304j) {
                        i10 = n.j(f10);
                    } else {
                        i10 = (this.f2308n - n.j(f10)) - e(u10);
                    }
                    if (this.f2304j) {
                        i11 = (this.f2308n - n.k(f10)) - e(u10);
                    } else {
                        i11 = n.k(f10);
                    }
                    f10 = o.a(i10, i11);
                }
                long n10 = n.n(f10, this.f2298d);
                if (this.f2304j) {
                    U.a.y(aVar, u10, n10, 0.0f, (C6798l) null, 6, (Object) null);
                } else {
                    U.a.s(aVar, u10, n10, 0.0f, (C6798l) null, 6, (Object) null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first");
    }

    public final void i(int i10, int i11, int i12) {
        int i13;
        int X02;
        this.f2307m = i10;
        if (this.f2304j) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        this.f2308n = i13;
        List list = this.f2297c;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            U u10 = (U) list.get(i14);
            int i15 = i14 * 2;
            if (this.f2304j) {
                int[] iArr = this.f2306l;
                c.b bVar = this.f2300f;
                if (bVar != null) {
                    iArr[i15] = bVar.a(u10.X0(), i11, this.f2302h);
                    this.f2306l[i15 + 1] = i10;
                    X02 = u10.R0();
                } else {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
            } else {
                int[] iArr2 = this.f2306l;
                iArr2[i15] = i10;
                int i16 = i15 + 1;
                c.C0368c cVar = this.f2301g;
                if (cVar != null) {
                    iArr2[i16] = cVar.a(u10.R0(), i12);
                    X02 = u10.X0();
                } else {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
            }
            i10 += X02;
        }
    }

    private C1179e(int i10, int i11, List list, long j10, Object obj, q qVar, c.b bVar, c.C0368c cVar, t tVar, boolean z10) {
        this.f2295a = i10;
        this.f2296b = i11;
        this.f2297c = list;
        this.f2298d = j10;
        this.f2299e = obj;
        this.f2300f = bVar;
        this.f2301g = cVar;
        this.f2302h = tVar;
        this.f2303i = z10;
        this.f2304j = qVar == q.Vertical;
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            U u10 = (U) list.get(i13);
            i12 = Math.max(i12, !this.f2304j ? u10.R0() : u10.X0());
        }
        this.f2305k = i12;
        this.f2306l = new int[(this.f2297c.size() * 2)];
        this.f2308n = Integer.MIN_VALUE;
    }
}
