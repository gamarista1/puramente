package f2;

import android.net.Uri;
import android.util.Pair;
import f2.C1967b;
import f2.w;
import i2.C2076a;
import i2.L;

public abstract class H {

    /* renamed from: a  reason: collision with root package name */
    public static final H f19735a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f19736b = L.y0(0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f19737c = L.y0(1);

    /* renamed from: d  reason: collision with root package name */
    private static final String f19738d = L.y0(2);

    class a extends H {
        a() {
        }

        public int b(Object obj) {
            return -1;
        }

        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        public int i() {
            return 0;
        }

        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int p() {
            return 0;
        }
    }

    public static final class b {

        /* renamed from: h  reason: collision with root package name */
        private static final String f19739h = L.y0(0);

        /* renamed from: i  reason: collision with root package name */
        private static final String f19740i = L.y0(1);

        /* renamed from: j  reason: collision with root package name */
        private static final String f19741j = L.y0(2);

        /* renamed from: k  reason: collision with root package name */
        private static final String f19742k = L.y0(3);

        /* renamed from: l  reason: collision with root package name */
        private static final String f19743l = L.y0(4);

        /* renamed from: a  reason: collision with root package name */
        public Object f19744a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19745b;

        /* renamed from: c  reason: collision with root package name */
        public int f19746c;

        /* renamed from: d  reason: collision with root package name */
        public long f19747d;

        /* renamed from: e  reason: collision with root package name */
        public long f19748e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f19749f;

        /* renamed from: g  reason: collision with root package name */
        private C1967b f19750g = C1967b.f19921g;

        public int a(int i10) {
            return this.f19750g.a(i10).f19943b;
        }

        public long b(int i10, int i11) {
            C1967b.a a10 = this.f19750g.a(i10);
            if (a10.f19943b != -1) {
                return a10.f19948g[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f19750g.f19928b;
        }

        public int d(long j10) {
            return this.f19750g.b(j10, this.f19747d);
        }

        public int e(long j10) {
            return this.f19750g.c(j10, this.f19747d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (b.class.equals(obj.getClass())) {
                    b bVar = (b) obj;
                    if (L.c(this.f19744a, bVar.f19744a) && L.c(this.f19745b, bVar.f19745b) && this.f19746c == bVar.f19746c && this.f19747d == bVar.f19747d && this.f19748e == bVar.f19748e && this.f19749f == bVar.f19749f && L.c(this.f19750g, bVar.f19750g)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public long f(int i10) {
            return this.f19750g.a(i10).f19942a;
        }

        public long g() {
            return this.f19750g.f19929c;
        }

        public int h(int i10, int i11) {
            C1967b.a a10 = this.f19750g.a(i10);
            if (a10.f19943b != -1) {
                return a10.f19947f[i11];
            }
            return 0;
        }

        public int hashCode() {
            int i10;
            Object obj = this.f19744a;
            int i11 = 0;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            int i12 = (217 + i10) * 31;
            Object obj2 = this.f19745b;
            if (obj2 != null) {
                i11 = obj2.hashCode();
            }
            long j10 = this.f19747d;
            long j11 = this.f19748e;
            return ((((((((((i12 + i11) * 31) + this.f19746c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f19749f ? 1 : 0)) * 31) + this.f19750g.hashCode();
        }

        public long i(int i10) {
            return this.f19750g.a(i10).f19949h;
        }

        public long j() {
            return this.f19747d;
        }

        public int k(int i10) {
            return this.f19750g.a(i10).d();
        }

        public int l(int i10, int i11) {
            return this.f19750g.a(i10).e(i11);
        }

        public long m() {
            return L.h1(this.f19748e);
        }

        public long n() {
            return this.f19748e;
        }

        public int o() {
            return this.f19750g.f19931e;
        }

        public boolean p(int i10) {
            return !this.f19750g.a(i10).f();
        }

        public boolean q(int i10) {
            if (i10 != c() - 1 || !this.f19750g.d(i10)) {
                return false;
            }
            return true;
        }

        public boolean r(int i10) {
            return this.f19750g.a(i10).f19950i;
        }

        public b s(Object obj, Object obj2, int i10, long j10, long j11) {
            return t(obj, obj2, i10, j10, j11, C1967b.f19921g, false);
        }

        public b t(Object obj, Object obj2, int i10, long j10, long j11, C1967b bVar, boolean z10) {
            this.f19744a = obj;
            this.f19745b = obj2;
            this.f19746c = i10;
            this.f19747d = j10;
            this.f19748e = j11;
            this.f19750g = bVar;
            this.f19749f = z10;
            return this;
        }
    }

    public static final class c {

        /* renamed from: A  reason: collision with root package name */
        private static final String f19751A = L.y0(8);

        /* renamed from: B  reason: collision with root package name */
        private static final String f19752B = L.y0(9);

        /* renamed from: C  reason: collision with root package name */
        private static final String f19753C = L.y0(10);

        /* renamed from: D  reason: collision with root package name */
        private static final String f19754D = L.y0(11);

        /* renamed from: E  reason: collision with root package name */
        private static final String f19755E = L.y0(12);

        /* renamed from: F  reason: collision with root package name */
        private static final String f19756F = L.y0(13);

        /* renamed from: q  reason: collision with root package name */
        public static final Object f19757q = new Object();

        /* renamed from: r  reason: collision with root package name */
        private static final Object f19758r = new Object();

        /* renamed from: s  reason: collision with root package name */
        private static final w f19759s = new w.c().c("androidx.media3.common.Timeline").f(Uri.EMPTY).a();

        /* renamed from: t  reason: collision with root package name */
        private static final String f19760t = L.y0(1);

        /* renamed from: u  reason: collision with root package name */
        private static final String f19761u = L.y0(2);

        /* renamed from: v  reason: collision with root package name */
        private static final String f19762v = L.y0(3);

        /* renamed from: w  reason: collision with root package name */
        private static final String f19763w = L.y0(4);

        /* renamed from: x  reason: collision with root package name */
        private static final String f19764x = L.y0(5);

        /* renamed from: y  reason: collision with root package name */
        private static final String f19765y = L.y0(6);

        /* renamed from: z  reason: collision with root package name */
        private static final String f19766z = L.y0(7);

        /* renamed from: a  reason: collision with root package name */
        public Object f19767a = f19757q;

        /* renamed from: b  reason: collision with root package name */
        public Object f19768b;

        /* renamed from: c  reason: collision with root package name */
        public w f19769c = f19759s;

        /* renamed from: d  reason: collision with root package name */
        public Object f19770d;

        /* renamed from: e  reason: collision with root package name */
        public long f19771e;

        /* renamed from: f  reason: collision with root package name */
        public long f19772f;

        /* renamed from: g  reason: collision with root package name */
        public long f19773g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f19774h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f19775i;

        /* renamed from: j  reason: collision with root package name */
        public w.g f19776j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f19777k;

        /* renamed from: l  reason: collision with root package name */
        public long f19778l;

        /* renamed from: m  reason: collision with root package name */
        public long f19779m;

        /* renamed from: n  reason: collision with root package name */
        public int f19780n;

        /* renamed from: o  reason: collision with root package name */
        public int f19781o;

        /* renamed from: p  reason: collision with root package name */
        public long f19782p;

        public long a() {
            return L.c0(this.f19773g);
        }

        public long b() {
            return L.h1(this.f19778l);
        }

        public long c() {
            return this.f19778l;
        }

        public long d() {
            return L.h1(this.f19779m);
        }

        public long e() {
            return this.f19782p;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (c.class.equals(obj.getClass())) {
                    c cVar = (c) obj;
                    if (L.c(this.f19767a, cVar.f19767a) && L.c(this.f19769c, cVar.f19769c) && L.c(this.f19770d, cVar.f19770d) && L.c(this.f19776j, cVar.f19776j) && this.f19771e == cVar.f19771e && this.f19772f == cVar.f19772f && this.f19773g == cVar.f19773g && this.f19774h == cVar.f19774h && this.f19775i == cVar.f19775i && this.f19777k == cVar.f19777k && this.f19778l == cVar.f19778l && this.f19779m == cVar.f19779m && this.f19780n == cVar.f19780n && this.f19781o == cVar.f19781o && this.f19782p == cVar.f19782p) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public boolean f() {
            if (this.f19776j != null) {
                return true;
            }
            return false;
        }

        public c g(Object obj, w wVar, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, w.g gVar, long j13, long j14, int i10, int i11, long j15) {
            w wVar2;
            Object obj3;
            w.h hVar;
            w wVar3 = wVar;
            this.f19767a = obj;
            if (wVar3 != null) {
                wVar2 = wVar3;
            } else {
                wVar2 = f19759s;
            }
            this.f19769c = wVar2;
            if (wVar3 == null || (hVar = wVar3.f20157b) == null) {
                obj3 = null;
            } else {
                obj3 = hVar.f20256h;
            }
            this.f19768b = obj3;
            this.f19770d = obj2;
            this.f19771e = j10;
            this.f19772f = j11;
            this.f19773g = j12;
            this.f19774h = z10;
            this.f19775i = z11;
            this.f19776j = gVar;
            this.f19778l = j13;
            this.f19779m = j14;
            this.f19780n = i10;
            this.f19781o = i11;
            this.f19782p = j15;
            this.f19777k = false;
            return this;
        }

        public int hashCode() {
            int i10;
            int hashCode = (((217 + this.f19767a.hashCode()) * 31) + this.f19769c.hashCode()) * 31;
            Object obj = this.f19770d;
            int i11 = 0;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            int i12 = (hashCode + i10) * 31;
            w.g gVar = this.f19776j;
            if (gVar != null) {
                i11 = gVar.hashCode();
            }
            long j10 = this.f19771e;
            long j11 = this.f19772f;
            long j12 = this.f19773g;
            long j13 = this.f19778l;
            long j14 = this.f19779m;
            long j15 = this.f19782p;
            return ((((((((((((((((((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f19774h ? 1 : 0)) * 31) + (this.f19775i ? 1 : 0)) * 31) + (this.f19777k ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f19780n) * 31) + this.f19781o) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    protected H() {
    }

    public int a(boolean z10) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f19746c;
        if (n(i12, cVar).f19781o != i10) {
            return i10 + 1;
        }
        int e10 = e(i12, i11, z10);
        if (e10 == -1) {
            return -1;
        }
        return n(e10, cVar).f19780n;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 != 2) {
                throw new IllegalStateException();
            } else if (i10 == c(z10)) {
                return a(z10);
            } else {
                return i10 + 1;
            }
        } else if (i10 == c(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        if (h10.p() != p() || h10.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(h10.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(h10.g(i11, bVar2, true))) {
                return false;
            }
        }
        int a10 = a(true);
        if (a10 != h10.a(true) || (c10 = c(true)) != h10.c(true)) {
            return false;
        }
        while (a10 != c10) {
            int e10 = e(a10, 0, true);
            if (e10 != h10.e(a10, 0, true)) {
                return false;
            }
            a10 = e10;
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = 217 + p();
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (p10 * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        int a10 = a(true);
        while (a10 != -1) {
            i11 = (i11 * 31) + a10;
            a10 = e(a10, 0, true);
        }
        return i11;
    }

    public abstract int i();

    public final Pair j(c cVar, b bVar, int i10, long j10) {
        return (Pair) C2076a.e(k(cVar, bVar, i10, j10, 0));
    }

    public final Pair k(c cVar, b bVar, int i10, long j10, long j11) {
        C2076a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.c();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f19780n;
        f(i11, bVar);
        while (i11 < cVar.f19781o && bVar.f19748e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f19748e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        long j12 = j10 - bVar.f19748e;
        long j13 = bVar.f19747d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(C2076a.e(bVar.f19745b), Long.valueOf(Math.max(0, j12)));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 != 2) {
                throw new IllegalStateException();
            } else if (i10 == a(z10)) {
                return c(z10);
            } else {
                return i10 - 1;
            }
        } else if (i10 == a(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        if (d(i10, bVar, cVar, i11, z10) == -1) {
            return true;
        }
        return false;
    }
}
