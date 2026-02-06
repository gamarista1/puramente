package N9;

import N9.A;
import N9.C3064m;
import N9.L;
import N9.r;
import android.net.Uri;
import android.os.Handler;
import ia.A;
import ia.B;
import ia.C3604b;
import ia.C3610h;
import ia.C3612j;
import ia.I;
import ia.n;
import ja.C3645a;
import ja.C3651g;
import ja.M;
import ja.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k9.C3717q0;
import k9.C3718r0;
import k9.L0;
import k9.e1;
import n9.C3871g;
import o9.u;
import o9.v;
import q9.C3962B;
import q9.m;
import q9.y;
import q9.z;

final class G implements r, m, B.b, B.f, L.d {
    /* access modifiers changed from: private */

    /* renamed from: f0  reason: collision with root package name */
    public static final Map f33036f0 = L();
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public static final C3717q0 f33037g0 = new C3717q0.b().S("icy").e0("application/x-icy").E();

    /* renamed from: A  reason: collision with root package name */
    private boolean f33038A;

    /* renamed from: B  reason: collision with root package name */
    private int f33039B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f33040C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f33041D;

    /* renamed from: E  reason: collision with root package name */
    private int f33042E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f33043F;

    /* renamed from: G  reason: collision with root package name */
    private long f33044G;

    /* renamed from: H  reason: collision with root package name */
    private long f33045H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f33046I;

    /* renamed from: X  reason: collision with root package name */
    private int f33047X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f33048Y;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f33049Z;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f33050a;

    /* renamed from: b  reason: collision with root package name */
    private final C3612j f33051b;

    /* renamed from: c  reason: collision with root package name */
    private final v f33052c;

    /* renamed from: d  reason: collision with root package name */
    private final A f33053d;

    /* renamed from: e  reason: collision with root package name */
    private final A.a f33054e;

    /* renamed from: f  reason: collision with root package name */
    private final u.a f33055f;

    /* renamed from: g  reason: collision with root package name */
    private final b f33056g;

    /* renamed from: h  reason: collision with root package name */
    private final C3604b f33057h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final String f33058i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final long f33059j;

    /* renamed from: k  reason: collision with root package name */
    private final B f33060k = new B("ProgressiveMediaPeriod");

    /* renamed from: l  reason: collision with root package name */
    private final B f33061l;

    /* renamed from: m  reason: collision with root package name */
    private final C3651g f33062m;

    /* renamed from: n  reason: collision with root package name */
    private final Runnable f33063n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Runnable f33064o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Handler f33065p;

    /* renamed from: q  reason: collision with root package name */
    private r.a f33066q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public H9.b f33067r;

    /* renamed from: s  reason: collision with root package name */
    private L[] f33068s;

    /* renamed from: t  reason: collision with root package name */
    private d[] f33069t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f33070u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f33071v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f33072w;

    /* renamed from: x  reason: collision with root package name */
    private e f33073x;

    /* renamed from: y  reason: collision with root package name */
    private z f33074y;

    /* renamed from: z  reason: collision with root package name */
    private long f33075z;

    final class a implements B.e, C3064m.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f33076a = C3065n.a();

        /* renamed from: b  reason: collision with root package name */
        private final Uri f33077b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final I f33078c;

        /* renamed from: d  reason: collision with root package name */
        private final B f33079d;

        /* renamed from: e  reason: collision with root package name */
        private final m f33080e;

        /* renamed from: f  reason: collision with root package name */
        private final C3651g f33081f;

        /* renamed from: g  reason: collision with root package name */
        private final y f33082g = new y();

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f33083h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f33084i = true;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f33085j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public n f33086k = i(0);

        /* renamed from: l  reason: collision with root package name */
        private C3962B f33087l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f33088m;

        public a(Uri uri, C3612j jVar, B b10, m mVar, C3651g gVar) {
            this.f33077b = uri;
            this.f33078c = new I(jVar);
            this.f33079d = b10;
            this.f33080e = mVar;
            this.f33081f = gVar;
        }

        private n i(long j10) {
            return new n.b().i(this.f33077b).h(j10).f(G.this.f33058i).b(6).e(G.f33036f0).a();
        }

        /* access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f33082g.f47919a = j10;
            this.f33085j = j11;
            this.f33084i = true;
            this.f33088m = false;
        }

        public void a() {
            int i10 = 0;
            while (i10 == 0 && !this.f33083h) {
                try {
                    long j10 = this.f33082g.f47919a;
                    n i11 = i(j10);
                    this.f33086k = i11;
                    long m10 = this.f33078c.m(i11);
                    if (m10 != -1) {
                        m10 += j10;
                        G.this.Z();
                    }
                    long j11 = m10;
                    H9.b unused = G.this.f33067r = H9.b.a(this.f33078c.d());
                    C3610h hVar = this.f33078c;
                    if (!(G.this.f33067r == null || G.this.f33067r.f31723f == -1)) {
                        hVar = new C3064m(this.f33078c, G.this.f33067r.f31723f, this);
                        C3962B O10 = G.this.O();
                        this.f33087l = O10;
                        O10.c(G.f33037g0);
                    }
                    long j12 = j10;
                    this.f33079d.d(hVar, this.f33077b, this.f33078c.d(), j10, j11, this.f33080e);
                    if (G.this.f33067r != null) {
                        this.f33079d.b();
                    }
                    if (this.f33084i) {
                        this.f33079d.a(j12, this.f33085j);
                        this.f33084i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f33083h) {
                            this.f33081f.a();
                            i10 = this.f33079d.e(this.f33082g);
                            j12 = this.f33079d.c();
                            if (j12 > G.this.f33059j + j13) {
                                this.f33081f.c();
                                G.this.f33065p.post(G.this.f33064o);
                            }
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f33079d.c() != -1) {
                        this.f33082g.f47919a = this.f33079d.c();
                    }
                    ia.m.a(this.f33078c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th2) {
                    if (!(i10 == 1 || this.f33079d.c() == -1)) {
                        this.f33082g.f47919a = this.f33079d.c();
                    }
                    ia.m.a(this.f33078c);
                    throw th2;
                }
            }
        }

        public void b() {
            this.f33083h = true;
        }

        public void c(ja.B b10) {
            long max;
            if (!this.f33088m) {
                max = this.f33085j;
            } else {
                max = Math.max(G.this.N(true), this.f33085j);
            }
            long j10 = max;
            int a10 = b10.a();
            C3962B b11 = (C3962B) C3645a.e(this.f33087l);
            b11.d(b10, a10);
            b11.f(j10, 1, a10, 0, (C3962B.a) null);
            this.f33088m = true;
        }
    }

    interface b {
        void b(long j10, boolean z10, boolean z11);
    }

    private final class c implements M {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f33090a;

        public c(int i10) {
            this.f33090a = i10;
        }

        public boolean d() {
            return G.this.Q(this.f33090a);
        }

        public void e() {
            G.this.Y(this.f33090a);
        }

        public int k(long j10) {
            return G.this.i0(this.f33090a, j10);
        }

        public int q(C3718r0 r0Var, C3871g gVar, int i10) {
            return G.this.e0(this.f33090a, r0Var, gVar, i10);
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f33092a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f33093b;

        public d(int i10, boolean z10) {
            this.f33092a = i10;
            this.f33093b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f33092a == dVar.f33092a && this.f33093b == dVar.f33093b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f33092a * 31) + (this.f33093b ? 1 : 0);
        }
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final V f33094a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f33095b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f33096c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f33097d;

        public e(V v10, boolean[] zArr) {
            this.f33094a = v10;
            this.f33095b = zArr;
            int i10 = v10.f33196a;
            this.f33096c = new boolean[i10];
            this.f33097d = new boolean[i10];
        }
    }

    public G(Uri uri, C3612j jVar, B b10, v vVar, u.a aVar, ia.A a10, A.a aVar2, b bVar, C3604b bVar2, String str, int i10) {
        this.f33050a = uri;
        this.f33051b = jVar;
        this.f33052c = vVar;
        this.f33055f = aVar;
        this.f33053d = a10;
        this.f33054e = aVar2;
        this.f33056g = bVar;
        this.f33057h = bVar2;
        this.f33058i = str;
        this.f33059j = (long) i10;
        this.f33061l = b10;
        this.f33062m = new C3651g();
        this.f33063n = new C(this);
        this.f33064o = new D(this);
        this.f33065p = M.w();
        this.f33069t = new d[0];
        this.f33068s = new L[0];
        this.f33045H = -9223372036854775807L;
        this.f33075z = -9223372036854775807L;
        this.f33039B = 1;
    }

    private void J() {
        C3645a.f(this.f33071v);
        C3645a.e(this.f33073x);
        C3645a.e(this.f33074y);
    }

    private boolean K(a aVar, int i10) {
        z zVar;
        if (this.f33043F || !((zVar = this.f33074y) == null || zVar.g() == -9223372036854775807L)) {
            this.f33047X = i10;
            return true;
        }
        if (!this.f33071v || k0()) {
            this.f33041D = this.f33071v;
            this.f33044G = 0;
            this.f33047X = 0;
            for (L V10 : this.f33068s) {
                V10.V();
            }
            aVar.j(0, 0);
            return true;
        }
        this.f33046I = true;
        return false;
    }

    private static Map L() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int M() {
        int i10 = 0;
        for (L G10 : this.f33068s) {
            i10 += G10.G();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public long N(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f33068s.length; i10++) {
            if (z10 || ((e) C3645a.e(this.f33073x)).f33096c[i10]) {
                j10 = Math.max(j10, this.f33068s[i10].z());
            }
        }
        return j10;
    }

    private boolean P() {
        if (this.f33045H != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R() {
        if (!this.f33049Z) {
            ((r.a) C3645a.e(this.f33066q)).p(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S() {
        this.f33043F = true;
    }

    /* access modifiers changed from: private */
    public void U() {
        boolean z10;
        D9.a aVar;
        if (!this.f33049Z && !this.f33071v && this.f33070u && this.f33074y != null) {
            L[] lArr = this.f33068s;
            int length = lArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (lArr[i10].F() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            this.f33062m.c();
            int length2 = this.f33068s.length;
            T[] tArr = new T[length2];
            boolean[] zArr = new boolean[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                C3717q0 q0Var = (C3717q0) C3645a.e(this.f33068s[i11].F());
                String str = q0Var.f45770l;
                boolean o10 = w.o(str);
                if (o10 || w.s(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[i11] = z10;
                this.f33072w = z10 | this.f33072w;
                H9.b bVar = this.f33067r;
                if (bVar != null) {
                    if (o10 || this.f33069t[i11].f33093b) {
                        D9.a aVar2 = q0Var.f45768j;
                        if (aVar2 == null) {
                            aVar = new D9.a(bVar);
                        } else {
                            aVar = aVar2.a(bVar);
                        }
                        q0Var = q0Var.b().X(aVar).E();
                    }
                    if (o10 && q0Var.f45764f == -1 && q0Var.f45765g == -1 && bVar.f31718a != -1) {
                        q0Var = q0Var.b().G(bVar.f31718a).E();
                    }
                }
                tArr[i11] = new T(Integer.toString(i11), q0Var.c(this.f33052c.d(q0Var)));
            }
            this.f33073x = new e(new V(tArr), zArr);
            this.f33071v = true;
            ((r.a) C3645a.e(this.f33066q)).k(this);
        }
    }

    private void V(int i10) {
        J();
        e eVar = this.f33073x;
        boolean[] zArr = eVar.f33097d;
        if (!zArr[i10]) {
            C3717q0 b10 = eVar.f33094a.b(i10).b(0);
            this.f33054e.i(w.k(b10.f45770l), b10, 0, (Object) null, this.f33044G);
            zArr[i10] = true;
        }
    }

    private void W(int i10) {
        J();
        boolean[] zArr = this.f33073x.f33095b;
        if (this.f33046I && zArr[i10]) {
            if (!this.f33068s[i10].K(false)) {
                this.f33045H = 0;
                this.f33046I = false;
                this.f33041D = true;
                this.f33044G = 0;
                this.f33047X = 0;
                for (L V10 : this.f33068s) {
                    V10.V();
                }
                ((r.a) C3645a.e(this.f33066q)).p(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void Z() {
        this.f33065p.post(new E(this));
    }

    private C3962B d0(d dVar) {
        int length = this.f33068s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.f33069t[i10])) {
                return this.f33068s[i10];
            }
        }
        L k10 = L.k(this.f33057h, this.f33052c, this.f33055f);
        k10.d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f33069t, i11);
        dVarArr[length] = dVar;
        this.f33069t = (d[]) M.k(dVarArr);
        L[] lArr = (L[]) Arrays.copyOf(this.f33068s, i11);
        lArr[length] = k10;
        this.f33068s = (L[]) M.k(lArr);
        return k10;
    }

    private boolean g0(boolean[] zArr, long j10) {
        int length = this.f33068s.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.f33068s[i10].Z(j10, false) && (zArr[i10] || !this.f33072w)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void T(z zVar) {
        z zVar2;
        boolean z10;
        if (this.f33067r == null) {
            zVar2 = zVar;
        } else {
            zVar2 = new z.b(-9223372036854775807L);
        }
        this.f33074y = zVar2;
        this.f33075z = zVar.g();
        int i10 = 1;
        if (this.f33043F || zVar.g() != -9223372036854775807L) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f33038A = z10;
        if (z10) {
            i10 = 7;
        }
        this.f33039B = i10;
        this.f33056g.b(this.f33075z, zVar.e(), this.f33038A);
        if (!this.f33071v) {
            U();
        }
    }

    private void j0() {
        a aVar = new a(this.f33050a, this.f33051b, this.f33061l, this, this.f33062m);
        if (this.f33071v) {
            C3645a.f(P());
            long j10 = this.f33075z;
            if (j10 == -9223372036854775807L || this.f33045H <= j10) {
                aVar.j(((z) C3645a.e(this.f33074y)).c(this.f33045H).f47920a.f47790b, this.f33045H);
                for (L b02 : this.f33068s) {
                    b02.b0(this.f33045H);
                }
                this.f33045H = -9223372036854775807L;
            } else {
                this.f33048Y = true;
                this.f33045H = -9223372036854775807L;
                return;
            }
        }
        this.f33047X = M();
        this.f33054e.A(new C3065n(aVar.f33076a, aVar.f33086k, this.f33060k.n(aVar, this, this.f33053d.a(this.f33039B))), 1, -1, (C3717q0) null, 0, (Object) null, aVar.f33085j, this.f33075z);
    }

    private boolean k0() {
        if (this.f33041D || P()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public C3962B O() {
        return d0(new d(0, true));
    }

    /* access modifiers changed from: package-private */
    public boolean Q(int i10) {
        if (k0() || !this.f33068s[i10].K(this.f33048Y)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void X() {
        this.f33060k.k(this.f33053d.a(this.f33039B));
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10) {
        this.f33068s[i10].N();
        X();
    }

    public long a() {
        return c();
    }

    /* renamed from: a0 */
    public void t(a aVar, long j10, long j11, boolean z10) {
        I d10 = aVar.f33078c;
        C3065n nVar = new C3065n(aVar.f33076a, aVar.f33086k, d10.p(), d10.q(), j10, j11, d10.o());
        this.f33053d.b(aVar.f33076a);
        this.f33054e.r(nVar, 1, -1, (C3717q0) null, 0, (Object) null, aVar.f33085j, this.f33075z);
        if (!z10) {
            for (L V10 : this.f33068s) {
                V10.V();
            }
            if (this.f33042E > 0) {
                ((r.a) C3645a.e(this.f33066q)).p(this);
            }
        }
    }

    public boolean b() {
        if (!this.f33060k.j() || !this.f33062m.d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    public void p(a aVar, long j10, long j11) {
        z zVar;
        long j12;
        if (this.f33075z == -9223372036854775807L && (zVar = this.f33074y) != null) {
            boolean e10 = zVar.e();
            long N10 = N(true);
            if (N10 == Long.MIN_VALUE) {
                j12 = 0;
            } else {
                j12 = N10 + 10000;
            }
            this.f33075z = j12;
            this.f33056g.b(j12, e10, this.f33038A);
        }
        I d10 = aVar.f33078c;
        C3065n nVar = new C3065n(aVar.f33076a, aVar.f33086k, d10.p(), d10.q(), j10, j11, d10.o());
        this.f33053d.b(aVar.f33076a);
        this.f33054e.u(nVar, 1, -1, (C3717q0) null, 0, (Object) null, aVar.f33085j, this.f33075z);
        this.f33048Y = true;
        ((r.a) C3645a.e(this.f33066q)).p(this);
    }

    public long c() {
        long j10;
        J();
        if (this.f33048Y || this.f33042E == 0) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.f33045H;
        }
        if (this.f33072w) {
            int length = this.f33068s.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.f33073x;
                if (eVar.f33095b[i10] && eVar.f33096c[i10] && !this.f33068s[i10].J()) {
                    j10 = Math.min(j10, this.f33068s[i10].z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = N(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f33044G;
        }
        return j10;
    }

    /* renamed from: c0 */
    public B.c u(a aVar, long j10, long j11, IOException iOException, int i10) {
        B.c cVar;
        boolean z10;
        I d10 = aVar.f33078c;
        C3065n nVar = new C3065n(aVar.f33076a, aVar.f33086k, d10.p(), d10.q(), j10, j11, d10.o());
        long c10 = this.f33053d.c(new A.c(nVar, new C3068q(1, -1, (C3717q0) null, 0, (Object) null, M.Z0(aVar.f33085j), M.Z0(this.f33075z)), iOException, i10));
        if (c10 == -9223372036854775807L) {
            cVar = B.f44365g;
            a aVar2 = aVar;
        } else {
            int M10 = M();
            if (M10 > this.f33047X) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (K(aVar, M10)) {
                cVar = B.h(z10, c10);
            } else {
                cVar = B.f44364f;
            }
        }
        boolean c11 = cVar.c();
        this.f33054e.w(nVar, 1, -1, (C3717q0) null, 0, (Object) null, aVar.f33085j, this.f33075z, iOException, !c11);
        if (!c11) {
            this.f33053d.b(aVar.f33076a);
        }
        return cVar;
    }

    public C3962B d(int i10, int i11) {
        return d0(new d(i10, false));
    }

    public void e(C3717q0 q0Var) {
        this.f33065p.post(this.f33063n);
    }

    /* access modifiers changed from: package-private */
    public int e0(int i10, C3718r0 r0Var, C3871g gVar, int i11) {
        if (k0()) {
            return -3;
        }
        V(i10);
        int S10 = this.f33068s[i10].S(r0Var, gVar, i11, this.f33048Y);
        if (S10 == -3) {
            W(i10);
        }
        return S10;
    }

    public void f0() {
        if (this.f33071v) {
            for (L R10 : this.f33068s) {
                R10.R();
            }
        }
        this.f33060k.m(this);
        this.f33065p.removeCallbacksAndMessages((Object) null);
        this.f33066q = null;
        this.f33049Z = true;
    }

    public long g(long j10) {
        J();
        boolean[] zArr = this.f33073x.f33095b;
        if (!this.f33074y.e()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f33041D = false;
        this.f33044G = j10;
        if (P()) {
            this.f33045H = j10;
            return j10;
        } else if (this.f33039B != 7 && g0(zArr, j10)) {
            return j10;
        } else {
            this.f33046I = false;
            this.f33045H = j10;
            this.f33048Y = false;
            if (this.f33060k.j()) {
                L[] lArr = this.f33068s;
                int length = lArr.length;
                while (i10 < length) {
                    lArr[i10].r();
                    i10++;
                }
                this.f33060k.f();
            } else {
                this.f33060k.g();
                L[] lArr2 = this.f33068s;
                int length2 = lArr2.length;
                while (i10 < length2) {
                    lArr2[i10].V();
                    i10++;
                }
            }
            return j10;
        }
    }

    public long h() {
        if (!this.f33041D) {
            return -9223372036854775807L;
        }
        if (!this.f33048Y && M() <= this.f33047X) {
            return -9223372036854775807L;
        }
        this.f33041D = false;
        return this.f33044G;
    }

    public void i() {
        for (L T10 : this.f33068s) {
            T10.T();
        }
        this.f33061l.release();
    }

    /* access modifiers changed from: package-private */
    public int i0(int i10, long j10) {
        if (k0()) {
            return 0;
        }
        V(i10);
        L l10 = this.f33068s[i10];
        int E10 = l10.E(j10, this.f33048Y);
        l10.e0(E10);
        if (E10 == 0) {
            W(i10);
        }
        return E10;
    }

    public void j() {
        X();
        if (this.f33048Y && !this.f33071v) {
            throw L0.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public void k() {
        this.f33070u = true;
        this.f33065p.post(this.f33063n);
    }

    public long l(long j10, e1 e1Var) {
        J();
        if (!this.f33074y.e()) {
            return 0;
        }
        z.a c10 = this.f33074y.c(j10);
        return e1Var.a(j10, c10.f47920a.f47789a, c10.f47921b.f47789a);
    }

    public boolean m(long j10) {
        if (this.f33048Y || this.f33060k.i() || this.f33046I) {
            return false;
        }
        if (this.f33071v && this.f33042E == 0) {
            return false;
        }
        boolean e10 = this.f33062m.e();
        if (this.f33060k.j()) {
            return e10;
        }
        j0();
        return true;
    }

    public V n() {
        J();
        return this.f33073x.f33094a;
    }

    public void o(long j10, boolean z10) {
        J();
        if (!P()) {
            boolean[] zArr = this.f33073x.f33096c;
            int length = this.f33068s.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.f33068s[i10].q(j10, z10, zArr[i10]);
            }
        }
    }

    public void q(z zVar) {
        this.f33065p.post(new F(this, zVar));
    }

    public void r(r.a aVar, long j10) {
        this.f33066q = aVar;
        this.f33062m.e();
        j0();
    }

    public long s(ga.r[] rVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j10) {
        boolean z10;
        ga.r rVar;
        boolean z11;
        boolean z12;
        J();
        e eVar = this.f33073x;
        V v10 = eVar.f33094a;
        boolean[] zArr3 = eVar.f33096c;
        int i10 = this.f33042E;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            c cVar = mArr[i12];
            if (cVar != null && (rVarArr[i12] == null || !zArr[i12])) {
                int a10 = cVar.f33090a;
                C3645a.f(zArr3[a10]);
                this.f33042E--;
                zArr3[a10] = false;
                mArr[i12] = null;
            }
        }
        if (!this.f33040C ? j10 == 0 : i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        for (int i13 = 0; i13 < rVarArr.length; i13++) {
            if (mArr[i13] == null && (rVar = rVarArr[i13]) != null) {
                if (rVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C3645a.f(z11);
                if (rVar.c(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C3645a.f(z12);
                int c10 = v10.c(rVar.g());
                C3645a.f(!zArr3[c10]);
                this.f33042E++;
                zArr3[c10] = true;
                mArr[i13] = new c(c10);
                zArr2[i13] = true;
                if (!z10) {
                    L l10 = this.f33068s[c10];
                    if (l10.Z(j10, true) || l10.C() == 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
            }
        }
        if (this.f33042E == 0) {
            this.f33046I = false;
            this.f33041D = false;
            if (this.f33060k.j()) {
                L[] lArr = this.f33068s;
                int length = lArr.length;
                while (i11 < length) {
                    lArr[i11].r();
                    i11++;
                }
                this.f33060k.f();
            } else {
                L[] lArr2 = this.f33068s;
                int length2 = lArr2.length;
                while (i11 < length2) {
                    lArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = g(j10);
            while (i11 < mArr.length) {
                if (mArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f33040C = true;
        return j10;
    }

    public void f(long j10) {
    }
}
