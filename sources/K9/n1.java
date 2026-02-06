package k9;

import O9.c;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.common.collect.C4770v;
import ja.C3645a;
import ja.C3646b;
import ja.M;
import k9.C3700i;
import k9.C3732y0;

public abstract class n1 implements C3700i {

    /* renamed from: a  reason: collision with root package name */
    public static final n1 f45710a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final C3700i.a f45711b = new m1();

    class a extends n1 {
        a() {
        }

        public int f(Object obj) {
            return -1;
        }

        public b k(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        public int m() {
            return 0;
        }

        public Object q(int i10) {
            throw new IndexOutOfBoundsException();
        }

        public d s(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        public int t() {
            return 0;
        }
    }

    public static final class b implements C3700i {

        /* renamed from: h  reason: collision with root package name */
        public static final C3700i.a f45712h = new o1();

        /* renamed from: a  reason: collision with root package name */
        public Object f45713a;

        /* renamed from: b  reason: collision with root package name */
        public Object f45714b;

        /* renamed from: c  reason: collision with root package name */
        public int f45715c;

        /* renamed from: d  reason: collision with root package name */
        public long f45716d;

        /* renamed from: e  reason: collision with root package name */
        public long f45717e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f45718f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public O9.c f45719g = O9.c.f33398g;

        /* access modifiers changed from: private */
        public static b c(Bundle bundle) {
            O9.c cVar;
            int i10 = bundle.getInt(u(0), 0);
            long j10 = bundle.getLong(u(1), -9223372036854775807L);
            long j11 = bundle.getLong(u(2), 0);
            boolean z10 = bundle.getBoolean(u(3));
            Bundle bundle2 = bundle.getBundle(u(4));
            if (bundle2 != null) {
                cVar = (O9.c) O9.c.f33400i.a(bundle2);
            } else {
                cVar = O9.c.f33398g;
            }
            O9.c cVar2 = cVar;
            b bVar = new b();
            bVar.w((Object) null, (Object) null, i10, j10, j11, cVar2, z10);
            return bVar;
        }

        private static String u(int i10) {
            return Integer.toString(i10, 36);
        }

        public int d(int i10) {
            return this.f45719g.c(i10).f33409b;
        }

        public long e(int i10, int i11) {
            c.a c10 = this.f45719g.c(i10);
            if (c10.f33409b != -1) {
                return c10.f33412e[i11];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (b.class.equals(obj.getClass())) {
                    b bVar = (b) obj;
                    if (M.c(this.f45713a, bVar.f45713a) && M.c(this.f45714b, bVar.f45714b) && this.f45715c == bVar.f45715c && this.f45716d == bVar.f45716d && this.f45717e == bVar.f45717e && this.f45718f == bVar.f45718f && M.c(this.f45719g, bVar.f45719g)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public int f() {
            return this.f45719g.f33402b;
        }

        public int g(long j10) {
            return this.f45719g.d(j10, this.f45716d);
        }

        public int h(long j10) {
            return this.f45719g.e(j10, this.f45716d);
        }

        public int hashCode() {
            int i10;
            Object obj = this.f45713a;
            int i11 = 0;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            int i12 = (217 + i10) * 31;
            Object obj2 = this.f45714b;
            if (obj2 != null) {
                i11 = obj2.hashCode();
            }
            long j10 = this.f45716d;
            long j11 = this.f45717e;
            return ((((((((((i12 + i11) * 31) + this.f45715c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f45718f ? 1 : 0)) * 31) + this.f45719g.hashCode();
        }

        public long i(int i10) {
            return this.f45719g.c(i10).f33408a;
        }

        public long j() {
            return this.f45719g.f33403c;
        }

        public int k(int i10, int i11) {
            c.a c10 = this.f45719g.c(i10);
            if (c10.f33409b != -1) {
                return c10.f33411d[i11];
            }
            return 0;
        }

        public long l(int i10) {
            return this.f45719g.c(i10).f33413f;
        }

        public long m() {
            return this.f45716d;
        }

        public int n(int i10) {
            return this.f45719g.c(i10).e();
        }

        public int o(int i10, int i11) {
            return this.f45719g.c(i10).f(i11);
        }

        public long p() {
            return M.Z0(this.f45717e);
        }

        public long q() {
            return this.f45717e;
        }

        public int r() {
            return this.f45719g.f33405e;
        }

        public boolean s(int i10) {
            return !this.f45719g.c(i10).g();
        }

        public boolean t(int i10) {
            return this.f45719g.c(i10).f33414g;
        }

        public b v(Object obj, Object obj2, int i10, long j10, long j11) {
            return w(obj, obj2, i10, j10, j11, O9.c.f33398g, false);
        }

        public b w(Object obj, Object obj2, int i10, long j10, long j11, O9.c cVar, boolean z10) {
            this.f45713a = obj;
            this.f45714b = obj2;
            this.f45715c = i10;
            this.f45716d = j10;
            this.f45717e = j11;
            this.f45719g = cVar;
            this.f45718f = z10;
            return this;
        }
    }

    public static final class c extends n1 {

        /* renamed from: c  reason: collision with root package name */
        private final C4770v f45720c;

        /* renamed from: d  reason: collision with root package name */
        private final C4770v f45721d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f45722e;

        /* renamed from: f  reason: collision with root package name */
        private final int[] f45723f;

        public c(C4770v vVar, C4770v vVar2, int[] iArr) {
            boolean z10;
            if (vVar.size() == iArr.length) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.a(z10);
            this.f45720c = vVar;
            this.f45721d = vVar2;
            this.f45722e = iArr;
            this.f45723f = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f45723f[iArr[i10]] = i10;
            }
        }

        public int e(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f45722e[0];
            }
            return 0;
        }

        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int g(boolean z10) {
            if (u()) {
                return -1;
            }
            if (z10) {
                return this.f45722e[t() - 1];
            }
            return t() - 1;
        }

        public int i(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 == g(z10)) {
                if (i11 == 2) {
                    return e(z10);
                }
                return -1;
            } else if (z10) {
                return this.f45722e[this.f45723f[i10] + 1];
            } else {
                return i10 + 1;
            }
        }

        public b k(int i10, b bVar, boolean z10) {
            b bVar2 = (b) this.f45721d.get(i10);
            bVar.w(bVar2.f45713a, bVar2.f45714b, bVar2.f45715c, bVar2.f45716d, bVar2.f45717e, bVar2.f45719g, bVar2.f45718f);
            return bVar;
        }

        public int m() {
            return this.f45721d.size();
        }

        public int p(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 == e(z10)) {
                if (i11 == 2) {
                    return g(z10);
                }
                return -1;
            } else if (z10) {
                return this.f45722e[this.f45723f[i10] - 1];
            } else {
                return i10 - 1;
            }
        }

        public Object q(int i10) {
            throw new UnsupportedOperationException();
        }

        public d s(int i10, d dVar, long j10) {
            d dVar2 = dVar;
            d dVar3 = (d) this.f45720c.get(i10);
            Object obj = dVar3.f45728a;
            C3732y0 y0Var = dVar3.f45730c;
            C3732y0 y0Var2 = y0Var;
            d dVar4 = dVar3;
            d dVar5 = dVar;
            dVar5.i(obj, y0Var2, dVar3.f45731d, dVar3.f45732e, dVar3.f45733f, dVar3.f45734g, dVar3.f45735h, dVar3.f45736i, dVar3.f45738k, dVar3.f45740m, dVar4.f45741n, dVar4.f45742o, dVar4.f45743p, dVar4.f45744q);
            d dVar6 = dVar;
            dVar6.f45739l = dVar4.f45739l;
            return dVar6;
        }

        public int t() {
            return this.f45720c.size();
        }
    }

    public static final class d implements C3700i {

        /* renamed from: r  reason: collision with root package name */
        public static final Object f45724r = new Object();

        /* renamed from: s  reason: collision with root package name */
        private static final Object f45725s = new Object();

        /* renamed from: t  reason: collision with root package name */
        private static final C3732y0 f45726t = new C3732y0.c().c("com.google.android.exoplayer2.Timeline").e(Uri.EMPTY).a();

        /* renamed from: u  reason: collision with root package name */
        public static final C3700i.a f45727u = new p1();

        /* renamed from: a  reason: collision with root package name */
        public Object f45728a = f45724r;

        /* renamed from: b  reason: collision with root package name */
        public Object f45729b;

        /* renamed from: c  reason: collision with root package name */
        public C3732y0 f45730c = f45726t;

        /* renamed from: d  reason: collision with root package name */
        public Object f45731d;

        /* renamed from: e  reason: collision with root package name */
        public long f45732e;

        /* renamed from: f  reason: collision with root package name */
        public long f45733f;

        /* renamed from: g  reason: collision with root package name */
        public long f45734g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f45735h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f45736i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f45737j;

        /* renamed from: k  reason: collision with root package name */
        public C3732y0.g f45738k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f45739l;

        /* renamed from: m  reason: collision with root package name */
        public long f45740m;

        /* renamed from: n  reason: collision with root package name */
        public long f45741n;

        /* renamed from: o  reason: collision with root package name */
        public int f45742o;

        /* renamed from: p  reason: collision with root package name */
        public int f45743p;

        /* renamed from: q  reason: collision with root package name */
        public long f45744q;

        /* JADX WARNING: type inference failed for: r1v19, types: [k9.i] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static k9.n1.d b(android.os.Bundle r26) {
            /*
                r0 = r26
                r1 = 1
                java.lang.String r1 = h(r1)
                android.os.Bundle r1 = r0.getBundle(r1)
                r2 = 0
                if (r1 == 0) goto L_0x0018
                k9.i$a r3 = k9.C3732y0.f45854j
                k9.i r1 = r3.a(r1)
                k9.y0 r1 = (k9.C3732y0) r1
                r5 = r1
                goto L_0x0019
            L_0x0018:
                r5 = r2
            L_0x0019:
                r1 = 2
                java.lang.String r1 = h(r1)
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                long r7 = r0.getLong(r1, r3)
                r1 = 3
                java.lang.String r1 = h(r1)
                long r9 = r0.getLong(r1, r3)
                r1 = 4
                java.lang.String r1 = h(r1)
                long r11 = r0.getLong(r1, r3)
                r1 = 5
                java.lang.String r1 = h(r1)
                r6 = 0
                boolean r13 = r0.getBoolean(r1, r6)
                r1 = 6
                java.lang.String r1 = h(r1)
                boolean r14 = r0.getBoolean(r1, r6)
                r1 = 7
                java.lang.String r1 = h(r1)
                android.os.Bundle r1 = r0.getBundle(r1)
                if (r1 == 0) goto L_0x0060
                k9.i$a r2 = k9.C3732y0.g.f45908g
                k9.i r1 = r2.a(r1)
                r2 = r1
                k9.y0$g r2 = (k9.C3732y0.g) r2
            L_0x0060:
                r15 = r2
                r1 = 8
                java.lang.String r1 = h(r1)
                boolean r1 = r0.getBoolean(r1, r6)
                r2 = 9
                java.lang.String r2 = h(r2)
                r24 = r7
                r6 = 0
                long r16 = r0.getLong(r2, r6)
                r2 = 10
                java.lang.String r2 = h(r2)
                long r18 = r0.getLong(r2, r3)
                r2 = 11
                java.lang.String r2 = h(r2)
                r3 = 0
                int r20 = r0.getInt(r2, r3)
                r2 = 12
                java.lang.String r2 = h(r2)
                int r21 = r0.getInt(r2, r3)
                r2 = 13
                java.lang.String r2 = h(r2)
                long r22 = r0.getLong(r2, r6)
                k9.n1$d r0 = new k9.n1$d
                r3 = r0
                r0.<init>()
                java.lang.Object r4 = f45725s
                r6 = 0
                r7 = r24
                r3.i(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
                r0.f45739l = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: k9.n1.d.b(android.os.Bundle):k9.n1$d");
        }

        private static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public long c() {
            return M.b0(this.f45734g);
        }

        public long d() {
            return M.Z0(this.f45740m);
        }

        public long e() {
            return this.f45740m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (d.class.equals(obj.getClass())) {
                    d dVar = (d) obj;
                    if (M.c(this.f45728a, dVar.f45728a) && M.c(this.f45730c, dVar.f45730c) && M.c(this.f45731d, dVar.f45731d) && M.c(this.f45738k, dVar.f45738k) && this.f45732e == dVar.f45732e && this.f45733f == dVar.f45733f && this.f45734g == dVar.f45734g && this.f45735h == dVar.f45735h && this.f45736i == dVar.f45736i && this.f45739l == dVar.f45739l && this.f45740m == dVar.f45740m && this.f45741n == dVar.f45741n && this.f45742o == dVar.f45742o && this.f45743p == dVar.f45743p && this.f45744q == dVar.f45744q) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public long f() {
            return M.Z0(this.f45741n);
        }

        public boolean g() {
            boolean z10;
            boolean z11;
            boolean z12 = this.f45737j;
            if (this.f45738k != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z12 == z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            C3645a.f(z11);
            if (this.f45738k != null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            int hashCode = (((217 + this.f45728a.hashCode()) * 31) + this.f45730c.hashCode()) * 31;
            Object obj = this.f45731d;
            int i11 = 0;
            if (obj == null) {
                i10 = 0;
            } else {
                i10 = obj.hashCode();
            }
            int i12 = (hashCode + i10) * 31;
            C3732y0.g gVar = this.f45738k;
            if (gVar != null) {
                i11 = gVar.hashCode();
            }
            long j10 = this.f45732e;
            long j11 = this.f45733f;
            long j12 = this.f45734g;
            long j13 = this.f45740m;
            long j14 = this.f45741n;
            long j15 = this.f45744q;
            return ((((((((((((((((((((((i12 + i11) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f45735h ? 1 : 0)) * 31) + (this.f45736i ? 1 : 0)) * 31) + (this.f45739l ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f45742o) * 31) + this.f45743p) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }

        public d i(Object obj, C3732y0 y0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, C3732y0.g gVar, long j13, long j14, int i10, int i11, long j15) {
            C3732y0 y0Var2;
            Object obj3;
            boolean z12;
            C3732y0.h hVar;
            C3732y0 y0Var3 = y0Var;
            C3732y0.g gVar2 = gVar;
            this.f45728a = obj;
            if (y0Var3 != null) {
                y0Var2 = y0Var3;
            } else {
                y0Var2 = f45726t;
            }
            this.f45730c = y0Var2;
            if (y0Var3 == null || (hVar = y0Var3.f45856b) == null) {
                obj3 = null;
            } else {
                obj3 = hVar.f45926h;
            }
            this.f45729b = obj3;
            this.f45731d = obj2;
            this.f45732e = j10;
            this.f45733f = j11;
            this.f45734g = j12;
            this.f45735h = z10;
            this.f45736i = z11;
            if (gVar2 != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f45737j = z12;
            this.f45738k = gVar2;
            this.f45740m = j13;
            this.f45741n = j14;
            this.f45742o = i10;
            this.f45743p = i11;
            this.f45744q = j15;
            this.f45739l = false;
            return this;
        }
    }

    protected n1() {
    }

    /* access modifiers changed from: private */
    public static n1 b(Bundle bundle) {
        C4770v c10 = c(d.f45727u, C3646b.a(bundle, w(0)));
        C4770v c11 = c(b.f45712h, C3646b.a(bundle, w(1)));
        int[] intArray = bundle.getIntArray(w(2));
        if (intArray == null) {
            intArray = d(c10.size());
        }
        return new c(c10, c11, intArray);
    }

    private static C4770v c(C3700i.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return C4770v.E();
        }
        C4770v.a aVar2 = new C4770v.a();
        C4770v a10 = C3698h.a(iBinder);
        for (int i10 = 0; i10 < a10.size(); i10++) {
            aVar2.a(aVar.a((Bundle) a10.get(i10)));
        }
        return aVar2.k();
    }

    private static int[] d(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    private static String w(int i10) {
        return Integer.toString(i10, 36);
    }

    public int e(boolean z10) {
        if (u()) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        int g10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (n1Var.t() != t() || n1Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < t(); i10++) {
            if (!r(i10, dVar).equals(n1Var.r(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < m(); i11++) {
            if (!k(i11, bVar, true).equals(n1Var.k(i11, bVar2, true))) {
                return false;
            }
        }
        int e10 = e(true);
        if (e10 != n1Var.e(true) || (g10 = g(true)) != n1Var.g(true)) {
            return false;
        }
        while (e10 != g10) {
            int i12 = i(e10, 0, true);
            if (i12 != n1Var.i(e10, 0, true)) {
                return false;
            }
            e10 = i12;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z10) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = j(i10, bVar).f45715c;
        if (r(i12, dVar).f45743p != i10) {
            return i10 + 1;
        }
        int i13 = i(i12, i11, z10);
        if (i13 == -1) {
            return -1;
        }
        return r(i13, dVar).f45742o;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int t10 = 217 + t();
        for (int i10 = 0; i10 < t(); i10++) {
            t10 = (t10 * 31) + r(i10, dVar).hashCode();
        }
        int m10 = (t10 * 31) + m();
        for (int i11 = 0; i11 < m(); i11++) {
            m10 = (m10 * 31) + k(i11, bVar, true).hashCode();
        }
        int e10 = e(true);
        while (e10 != -1) {
            m10 = (m10 * 31) + e10;
            e10 = i(e10, 0, true);
        }
        return m10;
    }

    public int i(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 != 2) {
                throw new IllegalStateException();
            } else if (i10 == g(z10)) {
                return e(z10);
            } else {
                return i10 + 1;
            }
        } else if (i10 == g(z10)) {
            return -1;
        } else {
            return i10 + 1;
        }
    }

    public final b j(int i10, b bVar) {
        return k(i10, bVar, false);
    }

    public abstract b k(int i10, b bVar, boolean z10);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair n(d dVar, b bVar, int i10, long j10) {
        return (Pair) C3645a.e(o(dVar, bVar, i10, j10, 0));
    }

    public final Pair o(d dVar, b bVar, int i10, long j10, long j11) {
        C3645a.c(i10, 0, t());
        s(i10, dVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = dVar.e();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = dVar.f45742o;
        j(i11, bVar);
        while (i11 < dVar.f45743p && bVar.f45717e != j10) {
            int i12 = i11 + 1;
            if (j(i12, bVar).f45717e > j10) {
                break;
            }
            i11 = i12;
        }
        k(i11, bVar, true);
        long j12 = j10 - bVar.f45717e;
        long j13 = bVar.f45716d;
        if (j13 != -9223372036854775807L) {
            j12 = Math.min(j12, j13 - 1);
        }
        return Pair.create(C3645a.e(bVar.f45714b), Long.valueOf(Math.max(0, j12)));
    }

    public int p(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 == 1) {
                return i10;
            }
            if (i11 != 2) {
                throw new IllegalStateException();
            } else if (i10 == e(z10)) {
                return g(z10);
            } else {
                return i10 - 1;
            }
        } else if (i10 == e(z10)) {
            return -1;
        } else {
            return i10 - 1;
        }
    }

    public abstract Object q(int i10);

    public final d r(int i10, d dVar) {
        return s(i10, dVar, 0);
    }

    public abstract d s(int i10, d dVar, long j10);

    public abstract int t();

    public final boolean u() {
        if (t() == 0) {
            return true;
        }
        return false;
    }

    public final boolean v(int i10, b bVar, d dVar, int i11, boolean z10) {
        if (h(i10, bVar, dVar, i11, z10) == -1) {
            return true;
        }
        return false;
    }
}
