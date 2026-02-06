package t2;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.U;
import f2.C1960A;
import f2.C1961B;
import f2.C1975j;
import f2.s;
import f2.z;
import i2.C2073A;
import i2.C2076a;
import i2.C2081f;
import i2.L;
import i2.p;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k2.i;
import k2.j;
import k2.w;
import m2.C2190B;
import p2.t;
import p2.u;
import t2.C2614B;
import t2.C2621I;
import t2.C2657w;
import t2.Y;
import v2.x;
import w2.C2820b;
import w2.C2827i;
import w2.C2828j;
import z2.C2956A;
import z2.C2969m;
import z2.I;
import z2.J;
import z2.O;
import z2.r;

/* renamed from: t2.T  reason: case insensitive filesystem */
final class C2631T implements C2614B, r, C2828j.b, C2828j.f, Y.d {
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public static final Map f26023h0 = M();
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public static final s f26024i0 = new s.b().a0("icy").o0("application/x-icy").K();

    /* renamed from: A  reason: collision with root package name */
    private J f26025A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public long f26026B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f26027C;

    /* renamed from: D  reason: collision with root package name */
    private int f26028D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f26029E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f26030F;

    /* renamed from: G  reason: collision with root package name */
    private int f26031G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f26032H;

    /* renamed from: I  reason: collision with root package name */
    private long f26033I;

    /* renamed from: X  reason: collision with root package name */
    private long f26034X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f26035Y;

    /* renamed from: Z  reason: collision with root package name */
    private int f26036Z;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f26037a;

    /* renamed from: b  reason: collision with root package name */
    private final k2.f f26038b;

    /* renamed from: c  reason: collision with root package name */
    private final u f26039c;

    /* renamed from: d  reason: collision with root package name */
    private final C2827i f26040d;

    /* renamed from: e  reason: collision with root package name */
    private final C2621I.a f26041e;

    /* renamed from: f  reason: collision with root package name */
    private final t.a f26042f;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f26043f0;

    /* renamed from: g  reason: collision with root package name */
    private final c f26044g;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f26045g0;

    /* renamed from: h  reason: collision with root package name */
    private final C2820b f26046h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final String f26047i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final long f26048j;

    /* renamed from: k  reason: collision with root package name */
    private final long f26049k;

    /* renamed from: l  reason: collision with root package name */
    private final C2828j f26050l = new C2828j("ProgressiveMediaPeriod");

    /* renamed from: m  reason: collision with root package name */
    private final C2626N f26051m;

    /* renamed from: n  reason: collision with root package name */
    private final C2081f f26052n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f26053o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Runnable f26054p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Handler f26055q;

    /* renamed from: r  reason: collision with root package name */
    private C2614B.a f26056r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public M2.b f26057s;

    /* renamed from: t  reason: collision with root package name */
    private Y[] f26058t;

    /* renamed from: u  reason: collision with root package name */
    private e[] f26059u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f26060v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f26061w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f26062x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f26063y;

    /* renamed from: z  reason: collision with root package name */
    private f f26064z;

    /* renamed from: t2.T$a */
    class a extends C2956A {
        a(J j10) {
            super(j10);
        }

        public long g() {
            return C2631T.this.f26026B;
        }
    }

    /* renamed from: t2.T$b */
    final class b implements C2828j.e, C2657w.a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f26066a = C2658x.a();

        /* renamed from: b  reason: collision with root package name */
        private final Uri f26067b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final w f26068c;

        /* renamed from: d  reason: collision with root package name */
        private final C2626N f26069d;

        /* renamed from: e  reason: collision with root package name */
        private final r f26070e;

        /* renamed from: f  reason: collision with root package name */
        private final C2081f f26071f;

        /* renamed from: g  reason: collision with root package name */
        private final I f26072g = new I();

        /* renamed from: h  reason: collision with root package name */
        private volatile boolean f26073h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f26074i = true;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public long f26075j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public j f26076k = i(0);

        /* renamed from: l  reason: collision with root package name */
        private O f26077l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f26078m;

        public b(Uri uri, k2.f fVar, C2626N n10, r rVar, C2081f fVar2) {
            this.f26067b = uri;
            this.f26068c = new w(fVar);
            this.f26069d = n10;
            this.f26070e = rVar;
            this.f26071f = fVar2;
        }

        private j i(long j10) {
            return new j.b().h(this.f26067b).g(j10).f(C2631T.this.f26047i).b(6).e(C2631T.f26023h0).a();
        }

        /* access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f26072g.f29106a = j10;
            this.f26075j = j11;
            this.f26074i = true;
            this.f26078m = false;
        }

        public void a() {
            int i10 = 0;
            while (i10 == 0 && !this.f26073h) {
                try {
                    long j10 = this.f26072g.f29106a;
                    j i11 = i(j10);
                    this.f26076k = i11;
                    long m10 = this.f26068c.m(i11);
                    if (this.f26073h) {
                        if (!(i10 == 1 || this.f26069d.c() == -1)) {
                            this.f26072g.f29106a = this.f26069d.c();
                        }
                        i.a(this.f26068c);
                        return;
                    }
                    if (m10 != -1) {
                        m10 += j10;
                        C2631T.this.a0();
                    }
                    long j11 = m10;
                    M2.b unused = C2631T.this.f26057s = M2.b.a(this.f26068c.d());
                    C1975j jVar = this.f26068c;
                    if (!(C2631T.this.f26057s == null || C2631T.this.f26057s.f4309f == -1)) {
                        jVar = new C2657w(this.f26068c, C2631T.this.f26057s.f4309f, this);
                        O P10 = C2631T.this.P();
                        this.f26077l = P10;
                        P10.c(C2631T.f26024i0);
                    }
                    long j12 = j10;
                    this.f26069d.e(jVar, this.f26067b, this.f26068c.d(), j10, j11, this.f26070e);
                    if (C2631T.this.f26057s != null) {
                        this.f26069d.b();
                    }
                    if (this.f26074i) {
                        this.f26069d.a(j12, this.f26075j);
                        this.f26074i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f26073h) {
                            this.f26071f.a();
                            i10 = this.f26069d.d(this.f26072g);
                            j12 = this.f26069d.c();
                            if (j12 > C2631T.this.f26048j + j13) {
                                this.f26071f.c();
                                C2631T.this.f26055q.post(C2631T.this.f26054p);
                            }
                        }
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f26069d.c() != -1) {
                        this.f26072g.f29106a = this.f26069d.c();
                    }
                    i.a(this.f26068c);
                } catch (InterruptedException unused2) {
                    throw new InterruptedIOException();
                } catch (Throwable th2) {
                    if (!(i10 == 1 || this.f26069d.c() == -1)) {
                        this.f26072g.f29106a = this.f26069d.c();
                    }
                    i.a(this.f26068c);
                    throw th2;
                }
            }
        }

        public void b() {
            this.f26073h = true;
        }

        public void c(C2073A a10) {
            long max;
            if (!this.f26078m) {
                max = this.f26075j;
            } else {
                max = Math.max(C2631T.this.O(true), this.f26075j);
            }
            long j10 = max;
            int a11 = a10.a();
            O o10 = (O) C2076a.e(this.f26077l);
            o10.f(a10, a11);
            o10.d(j10, 1, a11, 0, (O.a) null);
            this.f26078m = true;
        }
    }

    /* renamed from: t2.T$c */
    interface c {
        void b(long j10, boolean z10, boolean z11);
    }

    /* renamed from: t2.T$d */
    private final class d implements Z {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f26080a;

        public d(int i10) {
            this.f26080a = i10;
        }

        public int a(m2.w wVar, l2.f fVar, int i10) {
            return C2631T.this.f0(this.f26080a, wVar, fVar, i10);
        }

        public boolean d() {
            return C2631T.this.R(this.f26080a);
        }

        public void e() {
            C2631T.this.Z(this.f26080a);
        }

        public int k(long j10) {
            return C2631T.this.j0(this.f26080a, j10);
        }
    }

    /* renamed from: t2.T$e */
    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f26082a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f26083b;

        public e(int i10, boolean z10) {
            this.f26082a = i10;
            this.f26083b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f26082a == eVar.f26082a && this.f26083b == eVar.f26083b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f26082a * 31) + (this.f26083b ? 1 : 0);
        }
    }

    /* renamed from: t2.T$f */
    private static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final j0 f26084a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f26085b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f26086c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean[] f26087d;

        public f(j0 j0Var, boolean[] zArr) {
            this.f26084a = j0Var;
            this.f26085b = zArr;
            int i10 = j0Var.f26271a;
            this.f26086c = new boolean[i10];
            this.f26087d = new boolean[i10];
        }
    }

    public C2631T(Uri uri, k2.f fVar, C2626N n10, u uVar, t.a aVar, C2827i iVar, C2621I.a aVar2, c cVar, C2820b bVar, String str, int i10, long j10) {
        this.f26037a = uri;
        this.f26038b = fVar;
        this.f26039c = uVar;
        this.f26042f = aVar;
        this.f26040d = iVar;
        this.f26041e = aVar2;
        this.f26044g = cVar;
        this.f26046h = bVar;
        this.f26047i = str;
        this.f26048j = (long) i10;
        this.f26051m = n10;
        this.f26049k = j10;
        this.f26052n = new C2081f();
        this.f26053o = new C2628P(this);
        this.f26054p = new C2629Q(this);
        this.f26055q = L.z();
        this.f26059u = new e[0];
        this.f26058t = new Y[0];
        this.f26034X = -9223372036854775807L;
        this.f26028D = 1;
    }

    private void K() {
        C2076a.g(this.f26061w);
        C2076a.e(this.f26064z);
        C2076a.e(this.f26025A);
    }

    private boolean L(b bVar, int i10) {
        J j10;
        if (this.f26032H || !((j10 = this.f26025A) == null || j10.g() == -9223372036854775807L)) {
            this.f26036Z = i10;
            return true;
        }
        if (!this.f26061w || l0()) {
            this.f26030F = this.f26061w;
            this.f26033I = 0;
            this.f26036Z = 0;
            for (Y P10 : this.f26058t) {
                P10.P();
            }
            bVar.j(0, 0);
            return true;
        }
        this.f26035Y = true;
        return false;
    }

    private static Map M() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int N() {
        int i10 = 0;
        for (Y C10 : this.f26058t) {
            i10 += C10.C();
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public long O(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f26058t.length; i10++) {
            if (z10 || ((f) C2076a.e(this.f26064z)).f26086c[i10]) {
                j10 = Math.max(j10, this.f26058t[i10].v());
            }
        }
        return j10;
    }

    private boolean Q() {
        if (this.f26034X != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void S() {
        if (!this.f26045g0) {
            ((C2614B.a) C2076a.e(this.f26056r)).d(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void T() {
        this.f26032H = true;
    }

    /* access modifiers changed from: private */
    public void V() {
        boolean z10;
        boolean z11;
        z zVar;
        if (!this.f26045g0 && !this.f26061w && this.f26060v && this.f26025A != null) {
            Y[] yArr = this.f26058t;
            int length = yArr.length;
            int i10 = 0;
            while (i10 < length) {
                if (yArr[i10].B() != null) {
                    i10++;
                } else {
                    return;
                }
            }
            this.f26052n.c();
            int length2 = this.f26058t.length;
            f2.I[] iArr = new f2.I[length2];
            boolean[] zArr = new boolean[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                s sVar = (s) C2076a.e(this.f26058t[i11].B());
                String str = sVar.f20083n;
                boolean l10 = C1960A.l(str);
                if (l10 || C1960A.o(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zArr[i11] = z10;
                this.f26062x = z10 | this.f26062x;
                boolean m10 = C1960A.m(str);
                if (this.f26049k == -9223372036854775807L || length2 != 1 || !m10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                this.f26063y = z11;
                M2.b bVar = this.f26057s;
                if (bVar != null) {
                    if (l10 || this.f26059u[i11].f26083b) {
                        z zVar2 = sVar.f20080k;
                        if (zVar2 == null) {
                            zVar = new z(bVar);
                        } else {
                            zVar = zVar2.a(bVar);
                        }
                        sVar = sVar.a().h0(zVar).K();
                    }
                    if (l10 && sVar.f20076g == -1 && sVar.f20077h == -1 && bVar.f4304a != -1) {
                        sVar = sVar.a().M(bVar.f4304a).K();
                    }
                }
                iArr[i11] = new f2.I(Integer.toString(i11), sVar.b(this.f26039c.d(sVar)));
            }
            this.f26064z = new f(new j0(iArr), zArr);
            if (this.f26063y && this.f26026B == -9223372036854775807L) {
                this.f26026B = this.f26049k;
                this.f26025A = new a(this.f26025A);
            }
            this.f26044g.b(this.f26026B, this.f26025A.e(), this.f26027C);
            this.f26061w = true;
            ((C2614B.a) C2076a.e(this.f26056r)).i(this);
        }
    }

    private void W(int i10) {
        K();
        f fVar = this.f26064z;
        boolean[] zArr = fVar.f26087d;
        if (!zArr[i10]) {
            s a10 = fVar.f26084a.b(i10).a(0);
            this.f26041e.g(C1960A.i(a10.f20083n), a10, 0, (Object) null, this.f26033I);
            zArr[i10] = true;
        }
    }

    private void X(int i10) {
        K();
        boolean[] zArr = this.f26064z.f26085b;
        if (this.f26035Y && zArr[i10]) {
            if (!this.f26058t[i10].F(false)) {
                this.f26034X = 0;
                this.f26035Y = false;
                this.f26030F = true;
                this.f26033I = 0;
                this.f26036Z = 0;
                for (Y P10 : this.f26058t) {
                    P10.P();
                }
                ((C2614B.a) C2076a.e(this.f26056r)).d(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a0() {
        this.f26055q.post(new C2627O(this));
    }

    private O e0(e eVar) {
        int length = this.f26058t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f26059u[i10])) {
                return this.f26058t[i10];
            }
        }
        if (this.f26060v) {
            p.h("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f26082a + ") after finishing tracks.");
            return new C2969m();
        }
        Y k10 = Y.k(this.f26046h, this.f26039c, this.f26042f);
        k10.W(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f26059u, i11);
        eVarArr[length] = eVar;
        this.f26059u = (e[]) L.i(eVarArr);
        Y[] yArr = (Y[]) Arrays.copyOf(this.f26058t, i11);
        yArr[length] = k10;
        this.f26058t = (Y[]) L.i(yArr);
        return k10;
    }

    private boolean h0(boolean[] zArr, long j10) {
        boolean z10;
        int length = this.f26058t.length;
        for (int i10 = 0; i10 < length; i10++) {
            Y y10 = this.f26058t[i10];
            if (this.f26063y) {
                z10 = y10.S(y10.u());
            } else {
                z10 = y10.T(j10, false);
            }
            if (!z10 && (zArr[i10] || !this.f26062x)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void U(J j10) {
        J j11;
        boolean z10;
        if (this.f26057s == null) {
            j11 = j10;
        } else {
            j11 = new J.b(-9223372036854775807L);
        }
        this.f26025A = j11;
        this.f26026B = j10.g();
        int i10 = 1;
        if (this.f26032H || j10.g() != -9223372036854775807L) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f26027C = z10;
        if (z10) {
            i10 = 7;
        }
        this.f26028D = i10;
        if (this.f26061w) {
            this.f26044g.b(this.f26026B, j10.e(), this.f26027C);
        } else {
            V();
        }
    }

    private void k0() {
        b bVar = new b(this.f26037a, this.f26038b, this.f26051m, this, this.f26052n);
        if (this.f26061w) {
            C2076a.g(Q());
            long j10 = this.f26026B;
            if (j10 == -9223372036854775807L || this.f26034X <= j10) {
                bVar.j(((J) C2076a.e(this.f26025A)).c(this.f26034X).f29107a.f29113b, this.f26034X);
                for (Y U10 : this.f26058t) {
                    U10.U(this.f26034X);
                }
                this.f26034X = -9223372036854775807L;
            } else {
                this.f26043f0 = true;
                this.f26034X = -9223372036854775807L;
                return;
            }
        }
        this.f26036Z = N();
        this.f26041e.t(new C2658x(bVar.f26066a, bVar.f26076k, this.f26050l.n(bVar, this, this.f26040d.a(this.f26028D))), 1, -1, (s) null, 0, (Object) null, bVar.f26075j, this.f26026B);
    }

    private boolean l0() {
        if (this.f26030F || Q()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public O P() {
        return e0(new e(0, true));
    }

    /* access modifiers changed from: package-private */
    public boolean R(int i10) {
        if (l0() || !this.f26058t[i10].F(this.f26043f0)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Y() {
        this.f26050l.k(this.f26040d.a(this.f26028D));
    }

    /* access modifiers changed from: package-private */
    public void Z(int i10) {
        this.f26058t[i10].I();
        Y();
    }

    public long a() {
        return c();
    }

    public boolean b() {
        if (!this.f26050l.i() || !this.f26052n.d()) {
            return false;
        }
        return true;
    }

    /* renamed from: b0 */
    public void m(b bVar, long j10, long j11, boolean z10) {
        w d10 = bVar.f26068c;
        C2658x xVar = new C2658x(bVar.f26066a, bVar.f26076k, d10.p(), d10.q(), j10, j11, d10.o());
        this.f26040d.b(bVar.f26066a);
        this.f26041e.n(xVar, 1, -1, (s) null, 0, (Object) null, bVar.f26075j, this.f26026B);
        if (!z10) {
            for (Y P10 : this.f26058t) {
                P10.P();
            }
            if (this.f26031G > 0) {
                ((C2614B.a) C2076a.e(this.f26056r)).d(this);
            }
        }
    }

    public long c() {
        long j10;
        K();
        if (this.f26043f0 || this.f26031G == 0) {
            return Long.MIN_VALUE;
        }
        if (Q()) {
            return this.f26034X;
        }
        if (this.f26062x) {
            int length = this.f26058t.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f26064z;
                if (fVar.f26085b[i10] && fVar.f26086c[i10] && !this.f26058t[i10].E()) {
                    j10 = Math.min(j10, this.f26058t[i10].v());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = O(false);
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f26033I;
        }
        return j10;
    }

    /* renamed from: c0 */
    public void r(b bVar, long j10, long j11) {
        J j12;
        long j13;
        if (this.f26026B == -9223372036854775807L && (j12 = this.f26025A) != null) {
            boolean e10 = j12.e();
            long O10 = O(true);
            if (O10 == Long.MIN_VALUE) {
                j13 = 0;
            } else {
                j13 = O10 + 10000;
            }
            this.f26026B = j13;
            this.f26044g.b(j13, e10, this.f26027C);
        }
        w d10 = bVar.f26068c;
        C2658x xVar = new C2658x(bVar.f26066a, bVar.f26076k, d10.p(), d10.q(), j10, j11, d10.o());
        this.f26040d.b(bVar.f26066a);
        this.f26041e.p(xVar, 1, -1, (s) null, 0, (Object) null, bVar.f26075j, this.f26026B);
        this.f26043f0 = true;
        ((C2614B.a) C2076a.e(this.f26056r)).d(this);
    }

    public O d(int i10, int i11) {
        return e0(new e(i10, false));
    }

    /* renamed from: d0 */
    public C2828j.c q(b bVar, long j10, long j11, IOException iOException, int i10) {
        C2828j.c cVar;
        boolean z10;
        w d10 = bVar.f26068c;
        C2658x xVar = new C2658x(bVar.f26066a, bVar.f26076k, d10.p(), d10.q(), j10, j11, d10.o());
        long c10 = this.f26040d.c(new C2827i.a(xVar, new C2613A(1, -1, (s) null, 0, (Object) null, L.h1(bVar.f26075j), L.h1(this.f26026B)), iOException, i10));
        if (c10 == -9223372036854775807L) {
            cVar = C2828j.f27760g;
            b bVar2 = bVar;
        } else {
            int N10 = N();
            if (N10 > this.f26036Z) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (L(bVar, N10)) {
                cVar = C2828j.g(z10, c10);
            } else {
                cVar = C2828j.f27759f;
            }
        }
        boolean c11 = cVar.c();
        this.f26041e.r(xVar, 1, -1, (s) null, 0, (Object) null, bVar.f26075j, this.f26026B, iOException, !c11);
        if (!c11) {
            this.f26040d.b(bVar.f26066a);
        }
        return cVar;
    }

    public boolean e(U u10) {
        if (this.f26043f0 || this.f26050l.h() || this.f26035Y) {
            return false;
        }
        if (this.f26061w && this.f26031G == 0) {
            return false;
        }
        boolean e10 = this.f26052n.e();
        if (this.f26050l.i()) {
            return e10;
        }
        k0();
        return true;
    }

    /* access modifiers changed from: package-private */
    public int f0(int i10, m2.w wVar, l2.f fVar, int i11) {
        if (l0()) {
            return -3;
        }
        W(i10);
        int M10 = this.f26058t[i10].M(wVar, fVar, i11, this.f26043f0);
        if (M10 == -3) {
            X(i10);
        }
        return M10;
    }

    public long g(long j10) {
        K();
        boolean[] zArr = this.f26064z.f26085b;
        if (!this.f26025A.e()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f26030F = false;
        this.f26033I = j10;
        if (Q()) {
            this.f26034X = j10;
            return j10;
        } else if (this.f26028D != 7 && ((this.f26043f0 || this.f26050l.i()) && h0(zArr, j10))) {
            return j10;
        } else {
            this.f26035Y = false;
            this.f26034X = j10;
            this.f26043f0 = false;
            if (this.f26050l.i()) {
                Y[] yArr = this.f26058t;
                int length = yArr.length;
                while (i10 < length) {
                    yArr[i10].p();
                    i10++;
                }
                this.f26050l.e();
            } else {
                this.f26050l.f();
                Y[] yArr2 = this.f26058t;
                int length2 = yArr2.length;
                while (i10 < length2) {
                    yArr2[i10].P();
                    i10++;
                }
            }
            return j10;
        }
    }

    public void g0() {
        if (this.f26061w) {
            for (Y L10 : this.f26058t) {
                L10.L();
            }
        }
        this.f26050l.m(this);
        this.f26055q.removeCallbacksAndMessages((Object) null);
        this.f26056r = null;
        this.f26045g0 = true;
    }

    public long h() {
        if (!this.f26030F) {
            return -9223372036854775807L;
        }
        if (!this.f26043f0 && N() <= this.f26036Z) {
            return -9223372036854775807L;
        }
        this.f26030F = false;
        return this.f26033I;
    }

    public void i() {
        for (Y N10 : this.f26058t) {
            N10.N();
        }
        this.f26051m.release();
    }

    public void j() {
        Y();
        if (this.f26043f0 && !this.f26061w) {
            throw C1961B.a("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    /* access modifiers changed from: package-private */
    public int j0(int i10, long j10) {
        if (l0()) {
            return 0;
        }
        W(i10);
        Y y10 = this.f26058t[i10];
        int A10 = y10.A(j10, this.f26043f0);
        y10.X(A10);
        if (A10 == 0) {
            X(i10);
        }
        return A10;
    }

    public void k() {
        this.f26060v = true;
        this.f26055q.post(this.f26053o);
    }

    public void l(s sVar) {
        this.f26055q.post(this.f26053o);
    }

    public j0 n() {
        K();
        return this.f26064z.f26084a;
    }

    public void o(long j10, boolean z10) {
        if (!this.f26063y) {
            K();
            if (!Q()) {
                boolean[] zArr = this.f26064z.f26086c;
                int length = this.f26058t.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.f26058t[i10].o(j10, z10, zArr[i10]);
                }
            }
        }
    }

    public void p(C2614B.a aVar, long j10) {
        this.f26056r = aVar;
        this.f26052n.e();
        k0();
    }

    public long s(long j10, C2190B b10) {
        K();
        if (!this.f26025A.e()) {
            return 0;
        }
        J.a c10 = this.f26025A.c(j10);
        return b10.a(j10, c10.f29107a.f29112a, c10.f29108b.f29112a);
    }

    public long t(x[] xVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j10) {
        boolean z10;
        x xVar;
        boolean z11;
        boolean z12;
        K();
        f fVar = this.f26064z;
        j0 j0Var = fVar.f26084a;
        boolean[] zArr4 = fVar.f26086c;
        int i10 = this.f26031G;
        int i11 = 0;
        for (int i12 = 0; i12 < xVarArr.length; i12++) {
            d dVar = zArr2[i12];
            if (dVar != null && (xVarArr[i12] == null || !zArr[i12])) {
                int b10 = dVar.f26080a;
                C2076a.g(zArr4[b10]);
                this.f26031G--;
                zArr4[b10] = false;
                zArr2[i12] = null;
            }
        }
        if (!this.f26029E ? j10 == 0 || this.f26063y : i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        for (int i13 = 0; i13 < xVarArr.length; i13++) {
            if (zArr2[i13] == null && (xVar = xVarArr[i13]) != null) {
                if (xVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C2076a.g(z11);
                if (xVar.c(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C2076a.g(z12);
                int d10 = j0Var.d(xVar.g());
                C2076a.g(!zArr4[d10]);
                this.f26031G++;
                zArr4[d10] = true;
                zArr2[i13] = new d(d10);
                zArr3[i13] = true;
                if (!z10) {
                    Y y10 = this.f26058t[d10];
                    if (y10.y() == 0 || y10.T(j10, true)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
            }
        }
        if (this.f26031G == 0) {
            this.f26035Y = false;
            this.f26030F = false;
            if (this.f26050l.i()) {
                Y[] yArr = this.f26058t;
                int length = yArr.length;
                while (i11 < length) {
                    yArr[i11].p();
                    i11++;
                }
                this.f26050l.e();
            } else {
                this.f26043f0 = false;
                Y[] yArr2 = this.f26058t;
                int length2 = yArr2.length;
                while (i11 < length2) {
                    yArr2[i11].P();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = g(j10);
            while (i11 < zArr2.length) {
                if (zArr2[i11] != null) {
                    zArr3[i11] = true;
                }
                i11++;
            }
        }
        this.f26029E = true;
        return j10;
    }

    public void u(J j10) {
        this.f26055q.post(new C2630S(this, j10));
    }

    public void f(long j10) {
    }
}
