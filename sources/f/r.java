package F;

import E.x;
import Ug.K;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.F1;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final E f2032a;

    /* renamed from: b  reason: collision with root package name */
    private final List f2033b;

    /* renamed from: c  reason: collision with root package name */
    private final j f2034c;

    /* renamed from: d  reason: collision with root package name */
    private final C f2035d;

    /* renamed from: e  reason: collision with root package name */
    private final long f2036e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2037f;

    /* renamed from: g  reason: collision with root package name */
    private final x f2038g;

    /* renamed from: h  reason: collision with root package name */
    private final int f2039h;

    /* renamed from: i  reason: collision with root package name */
    private final long f2040i;

    /* renamed from: j  reason: collision with root package name */
    private final int f2041j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2042k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f2043l;

    /* renamed from: m  reason: collision with root package name */
    private final int f2044m;

    /* renamed from: n  reason: collision with root package name */
    private final K f2045n;

    /* renamed from: o  reason: collision with root package name */
    private final F1 f2046o;

    /* renamed from: p  reason: collision with root package name */
    private final u f2047p;

    /* renamed from: q  reason: collision with root package name */
    private final p f2048q;

    /* renamed from: r  reason: collision with root package name */
    private final int f2049r;

    public static final class a extends u {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ r f2050e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, boolean z10, j jVar, x xVar, C c10) {
            super(z10, jVar, xVar, c10);
            this.f2050e = rVar;
        }

        public x c(int i10, int i11, int i12, Object obj, Object obj2, List list, long j10) {
            return new x(i10, obj, list, this.f2050e.t(), this.f2050e.k(), i11, i12, this.f2050e.b(), this.f2050e.a(), obj2, this.f2050e.r().t(), j10, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ r(E e10, List list, j jVar, C c10, long j10, boolean z10, x xVar, int i10, long j11, int i11, int i12, boolean z11, int i13, K k10, F1 f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(e10, list, jVar, c10, j10, z10, xVar, i10, j11, i11, i12, z11, i13, k10, f12);
    }

    public final int a() {
        return this.f2042k;
    }

    public final int b() {
        return this.f2041j;
    }

    public final long c() {
        return this.f2036e;
    }

    public final long d() {
        return this.f2040i;
    }

    public final K e() {
        return this.f2045n;
    }

    public final F1 f() {
        return this.f2046o;
    }

    public final j g() {
        return this.f2034c;
    }

    public final int h() {
        return this.f2049r;
    }

    public final p i() {
        return this.f2048q;
    }

    public final int j() {
        return this.f2039h;
    }

    public final int k() {
        return this.f2044m;
    }

    public final x l() {
        return this.f2038g;
    }

    public final u m() {
        return this.f2047p;
    }

    public final List n() {
        return this.f2033b;
    }

    public final C o() {
        return this.f2035d;
    }

    public final boolean p() {
        return this.f2043l;
    }

    public final long q(j jVar, int i10, int i11) {
        int i12;
        boolean a10 = jVar.h().a(i10);
        if (a10) {
            i12 = this.f2049r;
        } else {
            i12 = 1;
        }
        if (a10) {
            i11 = 0;
        }
        return G.a(i11, i12);
    }

    public final E r() {
        return this.f2032a;
    }

    public final boolean s(j jVar, int i10) {
        return jVar.h().a(i10);
    }

    public final boolean t() {
        return this.f2037f;
    }

    private r(E e10, List list, j jVar, C c10, long j10, boolean z10, x xVar, int i10, long j11, int i11, int i12, boolean z11, int i13, K k10, F1 f12) {
        this.f2032a = e10;
        this.f2033b = list;
        this.f2034c = jVar;
        this.f2035d = c10;
        this.f2036e = j10;
        this.f2037f = z10;
        this.f2038g = xVar;
        this.f2039h = i10;
        this.f2040i = j11;
        this.f2041j = i11;
        this.f2042k = i12;
        this.f2043l = z11;
        this.f2044m = i13;
        this.f2045n = k10;
        this.f2046o = f12;
        this.f2047p = new a(this, z10, jVar, xVar, c10);
        this.f2048q = e10.v();
        this.f2049r = c10.b().length;
    }
}
