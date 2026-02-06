package com.google.android.exoplayer2.source.dash;

import N9.A;
import N9.C3052a;
import N9.C3059h;
import N9.C3060i;
import N9.C3065n;
import N9.C3068q;
import N9.C3070t;
import N9.r;
import R9.j;
import R9.o;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.e;
import ia.A;
import ia.B;
import ia.C;
import ia.C3604b;
import ia.C3612j;
import ia.D;
import ia.J;
import ia.w;
import ja.C3645a;
import ja.D;
import ja.M;
import ja.s;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.C3711n0;
import k9.C3732y0;
import k9.L0;
import k9.n1;
import nb.C5110e;
import o9.C3925l;
import o9.u;
import o9.v;
import o9.x;

public final class DashMediaSource extends C3052a {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public B f42778A;

    /* renamed from: B  reason: collision with root package name */
    private J f42779B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public IOException f42780C;

    /* renamed from: D  reason: collision with root package name */
    private Handler f42781D;

    /* renamed from: E  reason: collision with root package name */
    private C3732y0.g f42782E;

    /* renamed from: F  reason: collision with root package name */
    private Uri f42783F;

    /* renamed from: G  reason: collision with root package name */
    private Uri f42784G;

    /* renamed from: H  reason: collision with root package name */
    private R9.c f42785H;

    /* renamed from: I  reason: collision with root package name */
    private boolean f42786I;

    /* renamed from: X  reason: collision with root package name */
    private long f42787X;

    /* renamed from: Y  reason: collision with root package name */
    private long f42788Y;

    /* renamed from: Z  reason: collision with root package name */
    private long f42789Z;

    /* renamed from: f0  reason: collision with root package name */
    private int f42790f0;

    /* renamed from: g0  reason: collision with root package name */
    private long f42791g0;

    /* renamed from: h  reason: collision with root package name */
    private final C3732y0 f42792h;

    /* renamed from: h0  reason: collision with root package name */
    private int f42793h0;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f42794i;

    /* renamed from: j  reason: collision with root package name */
    private final C3612j.a f42795j;

    /* renamed from: k  reason: collision with root package name */
    private final a.C0659a f42796k;

    /* renamed from: l  reason: collision with root package name */
    private final C3059h f42797l;

    /* renamed from: m  reason: collision with root package name */
    private final v f42798m;

    /* renamed from: n  reason: collision with root package name */
    private final A f42799n;

    /* renamed from: o  reason: collision with root package name */
    private final Q9.b f42800o;

    /* renamed from: p  reason: collision with root package name */
    private final long f42801p;

    /* renamed from: q  reason: collision with root package name */
    private final A.a f42802q;

    /* renamed from: r  reason: collision with root package name */
    private final D.a f42803r;

    /* renamed from: s  reason: collision with root package name */
    private final e f42804s;

    /* renamed from: t  reason: collision with root package name */
    private final Object f42805t;

    /* renamed from: u  reason: collision with root package name */
    private final SparseArray f42806u;

    /* renamed from: v  reason: collision with root package name */
    private final Runnable f42807v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f42808w;

    /* renamed from: x  reason: collision with root package name */
    private final e.b f42809x;

    /* renamed from: y  reason: collision with root package name */
    private final C f42810y;

    /* renamed from: z  reason: collision with root package name */
    private C3612j f42811z;

    public static final class Factory implements C3070t.a {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0659a f42812a;

        /* renamed from: b  reason: collision with root package name */
        private final C3612j.a f42813b;

        /* renamed from: c  reason: collision with root package name */
        private x f42814c;

        /* renamed from: d  reason: collision with root package name */
        private C3059h f42815d;

        /* renamed from: e  reason: collision with root package name */
        private ia.A f42816e;

        /* renamed from: f  reason: collision with root package name */
        private long f42817f;

        /* renamed from: g  reason: collision with root package name */
        private D.a f42818g;

        public Factory(C3612j.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public DashMediaSource a(C3732y0 y0Var) {
            M9.b bVar;
            C3645a.e(y0Var.f45856b);
            D.a aVar = this.f42818g;
            if (aVar == null) {
                aVar = new R9.d();
            }
            List list = y0Var.f45856b.f45922d;
            if (!list.isEmpty()) {
                bVar = new M9.b(aVar, list);
            } else {
                bVar = aVar;
            }
            return new DashMediaSource(y0Var, (R9.c) null, this.f42813b, bVar, this.f42812a, this.f42815d, this.f42814c.a(y0Var), this.f42816e, this.f42817f, (a) null);
        }

        public Factory(a.C0659a aVar, C3612j.a aVar2) {
            this.f42812a = (a.C0659a) C3645a.e(aVar);
            this.f42813b = aVar2;
            this.f42814c = new C3925l();
            this.f42816e = new w();
            this.f42817f = 30000;
            this.f42815d = new C3060i();
        }
    }

    class a implements D.b {
        a() {
        }

        public void a() {
            DashMediaSource.this.b0(ja.D.h());
        }

        public void b(IOException iOException) {
            DashMediaSource.this.a0(iOException);
        }
    }

    private static final class b extends n1 {

        /* renamed from: c  reason: collision with root package name */
        private final long f42820c;

        /* renamed from: d  reason: collision with root package name */
        private final long f42821d;

        /* renamed from: e  reason: collision with root package name */
        private final long f42822e;

        /* renamed from: f  reason: collision with root package name */
        private final int f42823f;

        /* renamed from: g  reason: collision with root package name */
        private final long f42824g;

        /* renamed from: h  reason: collision with root package name */
        private final long f42825h;

        /* renamed from: i  reason: collision with root package name */
        private final long f42826i;

        /* renamed from: j  reason: collision with root package name */
        private final R9.c f42827j;

        /* renamed from: k  reason: collision with root package name */
        private final C3732y0 f42828k;

        /* renamed from: l  reason: collision with root package name */
        private final C3732y0.g f42829l;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, R9.c cVar, C3732y0 y0Var, C3732y0.g gVar) {
            boolean z10;
            R9.c cVar2 = cVar;
            C3732y0.g gVar2 = gVar;
            boolean z11 = cVar2.f33756d;
            boolean z12 = false;
            if (gVar2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C3645a.f(z11 == z10 ? true : z12);
            this.f42820c = j10;
            this.f42821d = j11;
            this.f42822e = j12;
            this.f42823f = i10;
            this.f42824g = j13;
            this.f42825h = j14;
            this.f42826i = j15;
            this.f42827j = cVar2;
            this.f42828k = y0Var;
            this.f42829l = gVar2;
        }

        private long x(long j10) {
            Q9.f l10;
            long j11 = this.f42826i;
            if (!y(this.f42827j)) {
                return j11;
            }
            if (j10 > 0) {
                j11 += j10;
                if (j11 > this.f42825h) {
                    return -9223372036854775807L;
                }
            }
            long j12 = this.f42824g + j11;
            long g10 = this.f42827j.g(0);
            int i10 = 0;
            while (i10 < this.f42827j.e() - 1 && j12 >= g10) {
                j12 -= g10;
                i10++;
                g10 = this.f42827j.g(i10);
            }
            R9.g d10 = this.f42827j.d(i10);
            int a10 = d10.a(2);
            if (a10 == -1 || (l10 = ((j) ((R9.a) d10.f33790c.get(a10)).f33745c.get(0)).l()) == null || l10.h(g10) == 0) {
                return j11;
            }
            return (j11 + l10.b(l10.g(j12, g10))) - j12;
        }

        private static boolean y(R9.c cVar) {
            if (!cVar.f33756d || cVar.f33757e == -9223372036854775807L || cVar.f33754b != -9223372036854775807L) {
                return false;
            }
            return true;
        }

        public int f(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f42823f) >= 0 && intValue < m()) {
                return intValue;
            }
            return -1;
        }

        public n1.b k(int i10, n1.b bVar, boolean z10) {
            String str;
            C3645a.c(i10, 0, m());
            Integer num = null;
            if (z10) {
                str = this.f42827j.d(i10).f33788a;
            } else {
                str = null;
            }
            if (z10) {
                num = Integer.valueOf(this.f42823f + i10);
            }
            return bVar.v(str, num, 0, this.f42827j.g(i10), M.C0(this.f42827j.d(i10).f33789b - this.f42827j.d(0).f33789b) - this.f42824g);
        }

        public int m() {
            return this.f42827j.e();
        }

        public Object q(int i10) {
            C3645a.c(i10, 0, m());
            return Integer.valueOf(this.f42823f + i10);
        }

        public n1.d s(int i10, n1.d dVar, long j10) {
            C3645a.c(i10, 0, 1);
            long x10 = x(j10);
            Object obj = n1.d.f45724r;
            C3732y0 y0Var = this.f42828k;
            R9.c cVar = this.f42827j;
            return dVar.i(obj, y0Var, cVar, this.f42820c, this.f42821d, this.f42822e, true, y(cVar), this.f42829l, x10, this.f42825h, 0, m() - 1, this.f42824g);
        }

        public int t() {
            return 1;
        }
    }

    private final class c implements e.b {
        private c() {
        }

        public void a(long j10) {
            DashMediaSource.this.T(j10);
        }

        public void b() {
            DashMediaSource.this.U();
        }

        /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    static final class d implements D.a {

        /* renamed from: a  reason: collision with root package name */
        private static final Pattern f42831a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            long j10;
            long j11;
            String readLine = new BufferedReader(new InputStreamReader(inputStream, C5110e.f61085c)).readLine();
            try {
                Matcher matcher = f42831a.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        if ("+".equals(matcher.group(4))) {
                            j10 = 1;
                        } else {
                            j10 = -1;
                        }
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        if (TextUtils.isEmpty(group2)) {
                            j11 = 0;
                        } else {
                            j11 = Long.parseLong(group2);
                        }
                        time -= j10 * (((parseLong * 60) + j11) * 60000);
                    }
                    return Long.valueOf(time);
                }
                throw L0.c("Couldn't parse timestamp: " + readLine, (Throwable) null);
            } catch (ParseException e10) {
                throw L0.c((String) null, e10);
            }
        }
    }

    private final class e implements B.b {
        private e() {
        }

        /* renamed from: a */
        public void t(ia.D d10, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(d10, j10, j11);
        }

        /* renamed from: b */
        public void p(ia.D d10, long j10, long j11) {
            DashMediaSource.this.W(d10, j10, j11);
        }

        /* renamed from: c */
        public B.c u(ia.D d10, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.X(d10, j10, j11, iOException, i10);
        }

        /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    final class f implements C {
        f() {
        }

        private void a() {
            if (DashMediaSource.this.f42780C != null) {
                throw DashMediaSource.this.f42780C;
            }
        }

        public void e() {
            DashMediaSource.this.f42778A.e();
            a();
        }
    }

    private final class g implements B.b {
        private g() {
        }

        /* renamed from: a */
        public void t(ia.D d10, long j10, long j11, boolean z10) {
            DashMediaSource.this.V(d10, j10, j11);
        }

        /* renamed from: b */
        public void p(ia.D d10, long j10, long j11) {
            DashMediaSource.this.Y(d10, j10, j11);
        }

        /* renamed from: c */
        public B.c u(ia.D d10, long j10, long j11, IOException iOException, int i10) {
            return DashMediaSource.this.Z(d10, j10, j11, iOException);
        }

        /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    private static final class h implements D.a {
        private h() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(M.J0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static {
        C3711n0.a("goog.exo.dash");
    }

    /* synthetic */ DashMediaSource(C3732y0 y0Var, R9.c cVar, C3612j.a aVar, D.a aVar2, a.C0659a aVar3, C3059h hVar, v vVar, ia.A a10, long j10, a aVar4) {
        this(y0Var, cVar, aVar, aVar2, aVar3, hVar, vVar, a10, j10);
    }

    private static long L(R9.g gVar, long j10, long j11) {
        R9.g gVar2 = gVar;
        long j12 = j10;
        long j13 = j11;
        long C02 = M.C0(gVar2.f33789b);
        boolean P10 = P(gVar);
        long j14 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < gVar2.f33790c.size(); i10++) {
            R9.a aVar = (R9.a) gVar2.f33790c.get(i10);
            List list = aVar.f33745c;
            if ((!P10 || aVar.f33744b != 3) && !list.isEmpty()) {
                Q9.f l10 = ((j) list.get(0)).l();
                if (l10 == null) {
                    return C02 + j12;
                }
                long k10 = l10.k(j12, j13);
                if (k10 == 0) {
                    return C02;
                }
                long d10 = (l10.d(j12, j13) + k10) - 1;
                j14 = Math.min(j14, l10.c(d10, j12) + l10.b(d10) + C02);
            }
        }
        return j14;
    }

    private static long M(R9.g gVar, long j10, long j11) {
        R9.g gVar2 = gVar;
        long j12 = j10;
        long j13 = j11;
        long C02 = M.C0(gVar2.f33789b);
        boolean P10 = P(gVar);
        long j14 = C02;
        for (int i10 = 0; i10 < gVar2.f33790c.size(); i10++) {
            R9.a aVar = (R9.a) gVar2.f33790c.get(i10);
            List list = aVar.f33745c;
            if ((!P10 || aVar.f33744b != 3) && !list.isEmpty()) {
                Q9.f l10 = ((j) list.get(0)).l();
                if (l10 == null || l10.k(j12, j13) == 0) {
                    return C02;
                }
                j14 = Math.max(j14, l10.b(l10.d(j12, j13)) + C02);
            }
        }
        return j14;
    }

    private static long N(R9.c cVar, long j10) {
        Q9.f l10;
        R9.c cVar2 = cVar;
        int e10 = cVar.e() - 1;
        R9.g d10 = cVar2.d(e10);
        long C02 = M.C0(d10.f33789b);
        long g10 = cVar2.g(e10);
        long C03 = M.C0(j10);
        long C04 = M.C0(cVar2.f33753a);
        long C05 = M.C0(5000);
        for (int i10 = 0; i10 < d10.f33790c.size(); i10++) {
            List list = ((R9.a) d10.f33790c.get(i10)).f33745c;
            if (!list.isEmpty() && (l10 = ((j) list.get(0)).l()) != null) {
                long e11 = ((C04 + C02) + l10.e(g10, C03)) - C03;
                if (e11 < C05 - 100000 || (e11 > C05 && e11 < C05 + 100000)) {
                    C05 = e11;
                }
            }
        }
        return pb.e.b(C05, 1000, RoundingMode.CEILING);
    }

    private long O() {
        return (long) Math.min((this.f42790f0 - 1) * 1000, 5000);
    }

    private static boolean P(R9.g gVar) {
        for (int i10 = 0; i10 < gVar.f33790c.size(); i10++) {
            int i11 = ((R9.a) gVar.f33790c.get(i10)).f33744b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean Q(R9.g gVar) {
        for (int i10 = 0; i10 < gVar.f33790c.size(); i10++) {
            Q9.f l10 = ((j) ((R9.a) gVar.f33790c.get(i10)).f33745c.get(0)).l();
            if (l10 == null || l10.i()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void R() {
        c0(false);
    }

    private void S() {
        ja.D.j(this.f42778A, new a());
    }

    /* access modifiers changed from: private */
    public void a0(IOException iOException) {
        s.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        c0(true);
    }

    /* access modifiers changed from: private */
    public void b0(long j10) {
        this.f42789Z = j10;
        c0(true);
    }

    private void c0(boolean z10) {
        boolean z11;
        long j10;
        long j11;
        R9.g gVar;
        C3732y0.g gVar2;
        boolean z12;
        for (int i10 = 0; i10 < this.f42806u.size(); i10++) {
            int keyAt = this.f42806u.keyAt(i10);
            if (keyAt >= this.f42793h0) {
                ((b) this.f42806u.valueAt(i10)).M(this.f42785H, keyAt - this.f42793h0);
            }
        }
        R9.g d10 = this.f42785H.d(0);
        int e10 = this.f42785H.e() - 1;
        R9.g d11 = this.f42785H.d(e10);
        long g10 = this.f42785H.g(e10);
        long C02 = M.C0(M.b0(this.f42789Z));
        long M10 = M(d10, this.f42785H.g(0), C02);
        long L10 = L(d11, g10, C02);
        if (!this.f42785H.f33756d || Q(d11)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            long j12 = this.f42785H.f33758f;
            if (j12 != -9223372036854775807L) {
                M10 = Math.max(M10, L10 - M.C0(j12));
            }
        }
        long j13 = L10 - M10;
        R9.c cVar = this.f42785H;
        R9.g gVar3 = d10;
        if (cVar.f33756d) {
            if (cVar.f33753a != -9223372036854775807L) {
                z12 = true;
            } else {
                z12 = false;
            }
            C3645a.f(z12);
            long C03 = (C02 - M.C0(this.f42785H.f33753a)) - M10;
            j0(C03, j13);
            long Z02 = this.f42785H.f33753a + M.Z0(M10);
            long C04 = C03 - M.C0(this.f42782E.f45909a);
            long min = Math.min(5000000, j13 / 2);
            j11 = Z02;
            if (C04 < min) {
                j10 = min;
            } else {
                j10 = C04;
            }
            gVar = gVar3;
        } else {
            gVar = gVar3;
            j11 = -9223372036854775807L;
            j10 = 0;
        }
        long C05 = M10 - M.C0(gVar.f33789b);
        R9.c cVar2 = this.f42785H;
        long j14 = cVar2.f33753a;
        long j15 = this.f42789Z;
        int i11 = this.f42793h0;
        C3732y0 y0Var = this.f42792h;
        if (cVar2.f33756d) {
            gVar2 = this.f42782E;
        } else {
            gVar2 = null;
        }
        D(new b(j14, j11, j15, i11, C05, j13, j10, cVar2, y0Var, gVar2));
        if (!this.f42794i) {
            this.f42781D.removeCallbacks(this.f42808w);
            if (z11) {
                this.f42781D.postDelayed(this.f42808w, N(this.f42785H, M.b0(this.f42789Z)));
            }
            if (this.f42786I) {
                i0();
            } else if (z10) {
                R9.c cVar3 = this.f42785H;
                if (cVar3.f33756d) {
                    long j16 = cVar3.f33757e;
                    if (j16 != -9223372036854775807L) {
                        if (j16 == 0) {
                            j16 = 5000;
                        }
                        g0(Math.max(0, (this.f42787X + j16) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    private void d0(o oVar) {
        String str = oVar.f33843a;
        if (M.c(str, "urn:mpeg:dash:utc:direct:2014") || M.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            e0(oVar);
        } else if (M.c(str, "urn:mpeg:dash:utc:http-iso:2014") || M.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            f0(oVar, new d());
        } else if (M.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || M.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            f0(oVar, new h((a) null));
        } else if (M.c(str, "urn:mpeg:dash:utc:ntp:2014") || M.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            S();
        } else {
            a0(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void e0(o oVar) {
        try {
            b0(M.J0(oVar.f33844b) - this.f42788Y);
        } catch (L0 e10) {
            a0(e10);
        }
    }

    private void f0(o oVar, D.a aVar) {
        h0(new ia.D(this.f42811z, Uri.parse(oVar.f33844b), 5, aVar), new g(this, (a) null), 1);
    }

    private void g0(long j10) {
        this.f42781D.postDelayed(this.f42807v, j10);
    }

    private void h0(ia.D d10, B.b bVar, int i10) {
        this.f42802q.z(new C3065n(d10.f44382a, d10.f44383b, this.f42778A.n(d10, bVar, i10)), d10.f44384c);
    }

    /* access modifiers changed from: private */
    public void i0() {
        Uri uri;
        this.f42781D.removeCallbacks(this.f42807v);
        if (!this.f42778A.i()) {
            if (this.f42778A.j()) {
                this.f42786I = true;
                return;
            }
            synchronized (this.f42805t) {
                uri = this.f42783F;
            }
            this.f42786I = false;
            h0(new ia.D(this.f42811z, uri, 4, this.f42803r), this.f42804s, this.f42799n.a(4));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j0(long r18, long r20) {
        /*
            r17 = this;
            r0 = r17
            long r5 = ja.M.Z0(r18)
            k9.y0 r1 = r0.f42792h
            k9.y0$g r1 = r1.f45858d
            long r1 = r1.f45911c
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001b
            long r1 = java.lang.Math.min(r5, r1)
        L_0x0019:
            r9 = r1
            goto L_0x002d
        L_0x001b:
            R9.c r1 = r0.f42785H
            R9.l r1 = r1.f33762j
            if (r1 == 0) goto L_0x002c
            long r1 = r1.f33835c
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x002c
            long r1 = java.lang.Math.min(r5, r1)
            goto L_0x0019
        L_0x002c:
            r9 = r5
        L_0x002d:
            long r1 = r18 - r20
            long r1 = ja.M.Z0(r1)
            r3 = 0
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x003e
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x003e
            r1 = r3
        L_0x003e:
            R9.c r3 = r0.f42785H
            long r3 = r3.f33755c
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            long r1 = r1 + r3
            long r1 = java.lang.Math.min(r1, r5)
        L_0x004b:
            r3 = r1
            k9.y0 r1 = r0.f42792h
            k9.y0$g r1 = r1.f45858d
            long r1 = r1.f45910b
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x005b
            long r3 = ja.M.r(r1, r3, r5)
            goto L_0x006b
        L_0x005b:
            R9.c r1 = r0.f42785H
            R9.l r1 = r1.f33762j
            if (r1 == 0) goto L_0x006b
            long r1 = r1.f33834b
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x006b
            long r3 = ja.M.r(r1, r3, r5)
        L_0x006b:
            int r1 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0070
            r9 = r3
        L_0x0070:
            k9.y0$g r1 = r0.f42782E
            long r1 = r1.f45909a
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0079
            goto L_0x0090
        L_0x0079:
            R9.c r1 = r0.f42785H
            R9.l r2 = r1.f33762j
            if (r2 == 0) goto L_0x0087
            long r5 = r2.f33833a
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r1 = r5
            goto L_0x0090
        L_0x0087:
            long r1 = r1.f33759g
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            long r1 = r0.f42801p
        L_0x0090:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0095
            r1 = r3
        L_0x0095:
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 <= 0) goto L_0x00b0
            r1 = 2
            long r1 = r20 / r1
            r5 = 5000000(0x4c4b40, double:2.470328E-317)
            long r1 = java.lang.Math.min(r5, r1)
            long r1 = r18 - r1
            long r11 = ja.M.Z0(r1)
            r13 = r3
            r15 = r9
            long r1 = ja.M.r(r11, r13, r15)
        L_0x00b0:
            k9.y0 r5 = r0.f42792h
            k9.y0$g r5 = r5.f45858d
            float r6 = r5.f45912d
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00be
            goto L_0x00c8
        L_0x00be:
            R9.c r6 = r0.f42785H
            R9.l r6 = r6.f33762j
            if (r6 == 0) goto L_0x00c7
            float r6 = r6.f33836d
            goto L_0x00c8
        L_0x00c7:
            r6 = r11
        L_0x00c8:
            float r5 = r5.f45913e
            int r12 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r12 == 0) goto L_0x00cf
            goto L_0x00d9
        L_0x00cf:
            R9.c r5 = r0.f42785H
            R9.l r5 = r5.f33762j
            if (r5 == 0) goto L_0x00d8
            float r5 = r5.f33837e
            goto L_0x00d9
        L_0x00d8:
            r5 = r11
        L_0x00d9:
            int r12 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r12 != 0) goto L_0x00f0
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x00f0
            R9.c r11 = r0.f42785H
            R9.l r11 = r11.f33762j
            if (r11 == 0) goto L_0x00ed
            long r11 = r11.f33833a
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x00f0
        L_0x00ed:
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = r6
        L_0x00f0:
            k9.y0$g$a r7 = new k9.y0$g$a
            r7.<init>()
            k9.y0$g$a r1 = r7.k(r1)
            k9.y0$g$a r1 = r1.i(r3)
            k9.y0$g$a r1 = r1.g(r9)
            k9.y0$g$a r1 = r1.j(r6)
            k9.y0$g$a r1 = r1.h(r5)
            k9.y0$g r1 = r1.f()
            r0.f42782E = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.j0(long, long):void");
    }

    /* access modifiers changed from: protected */
    public void C(J j10) {
        this.f42779B = j10;
        this.f42798m.j();
        this.f42798m.b(Looper.myLooper(), A());
        if (this.f42794i) {
            c0(false);
            return;
        }
        this.f42811z = this.f42795j.a();
        this.f42778A = new B("DashMediaSource");
        this.f42781D = M.w();
        i0();
    }

    /* access modifiers changed from: protected */
    public void E() {
        R9.c cVar;
        this.f42786I = false;
        this.f42811z = null;
        B b10 = this.f42778A;
        if (b10 != null) {
            b10.l();
            this.f42778A = null;
        }
        this.f42787X = 0;
        this.f42788Y = 0;
        if (this.f42794i) {
            cVar = this.f42785H;
        } else {
            cVar = null;
        }
        this.f42785H = cVar;
        this.f42783F = this.f42784G;
        this.f42780C = null;
        Handler handler = this.f42781D;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f42781D = null;
        }
        this.f42789Z = -9223372036854775807L;
        this.f42790f0 = 0;
        this.f42791g0 = -9223372036854775807L;
        this.f42793h0 = 0;
        this.f42806u.clear();
        this.f42800o.i();
        this.f42798m.release();
    }

    /* access modifiers changed from: package-private */
    public void T(long j10) {
        long j11 = this.f42791g0;
        if (j11 == -9223372036854775807L || j11 < j10) {
            this.f42791g0 = j10;
        }
    }

    /* access modifiers changed from: package-private */
    public void U() {
        this.f42781D.removeCallbacks(this.f42808w);
        i0();
    }

    /* access modifiers changed from: package-private */
    public void V(ia.D d10, long j10, long j11) {
        ia.D d11 = d10;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        this.f42799n.b(d11.f44382a);
        this.f42802q.q(nVar, d11.f44384c);
    }

    /* access modifiers changed from: package-private */
    public void W(ia.D d10, long j10, long j11) {
        int i10;
        ia.D d11 = d10;
        long j12 = j10;
        C3065n nVar = r2;
        C3065n nVar2 = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        this.f42799n.b(d11.f44382a);
        this.f42802q.t(nVar, d11.f44384c);
        R9.c cVar = (R9.c) d10.e();
        R9.c cVar2 = this.f42785H;
        if (cVar2 == null) {
            i10 = 0;
        } else {
            i10 = cVar2.e();
        }
        long j13 = cVar.d(0).f33789b;
        int i11 = 0;
        while (i11 < i10 && this.f42785H.d(i11).f33789b < j13) {
            i11++;
        }
        if (cVar.f33756d) {
            if (i10 - i11 > cVar.e()) {
                s.i("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = this.f42791g0;
                if (j14 == -9223372036854775807L || cVar.f33760h * 1000 > j14) {
                    this.f42790f0 = 0;
                } else {
                    s.i("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f33760h + ", " + this.f42791g0);
                }
            }
            int i12 = this.f42790f0;
            this.f42790f0 = i12 + 1;
            if (i12 < this.f42799n.a(d11.f44384c)) {
                g0(O());
                return;
            } else {
                this.f42780C = new Q9.c();
                return;
            }
        }
        this.f42785H = cVar;
        this.f42786I = cVar.f33756d & this.f42786I;
        long j15 = j10;
        this.f42787X = j15 - j11;
        this.f42788Y = j15;
        synchronized (this.f42805t) {
            try {
                if (d11.f44383b.f44456a == this.f42783F) {
                    Uri uri = this.f42785H.f33763k;
                    if (uri == null) {
                        uri = d10.f();
                    }
                    this.f42783F = uri;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (i10 == 0) {
            R9.c cVar3 = this.f42785H;
            if (cVar3.f33756d) {
                o oVar = cVar3.f33761i;
                if (oVar != null) {
                    d0(oVar);
                } else {
                    S();
                }
            } else {
                c0(true);
            }
        } else {
            this.f42793h0 += i11;
            c0(true);
        }
    }

    /* access modifiers changed from: package-private */
    public B.c X(ia.D d10, long j10, long j11, IOException iOException, int i10) {
        B.c cVar;
        ia.D d11 = d10;
        IOException iOException2 = iOException;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        long c10 = this.f42799n.c(new A.c(nVar, new C3068q(d11.f44384c), iOException2, i10));
        if (c10 == -9223372036854775807L) {
            cVar = B.f44365g;
        } else {
            cVar = B.h(false, c10);
        }
        boolean c11 = cVar.c();
        this.f42802q.x(nVar, d11.f44384c, iOException2, !c11);
        if (!c11) {
            this.f42799n.b(d11.f44382a);
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public void Y(ia.D d10, long j10, long j11) {
        ia.D d11 = d10;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        this.f42799n.b(d11.f44382a);
        this.f42802q.t(nVar, d11.f44384c);
        b0(((Long) d10.e()).longValue() - j10);
    }

    /* access modifiers changed from: package-private */
    public B.c Z(ia.D d10, long j10, long j11, IOException iOException) {
        ia.D d11 = d10;
        IOException iOException2 = iOException;
        A.a aVar = this.f42802q;
        C3065n nVar = r4;
        C3065n nVar2 = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        aVar.x(nVar, d11.f44384c, iOException2, true);
        this.f42799n.b(d11.f44382a);
        a0(iOException2);
        return B.f44364f;
    }

    public C3732y0 a() {
        return this.f42792h;
    }

    public void c() {
        this.f42810y.e();
    }

    public void g(r rVar) {
        b bVar = (b) rVar;
        bVar.I();
        this.f42806u.remove(bVar.f42837a);
    }

    public r i(C3070t.b bVar, C3604b bVar2, long j10) {
        C3070t.b bVar3 = bVar;
        int intValue = ((Integer) bVar3.f33285a).intValue() - this.f42793h0;
        int i10 = intValue;
        A.a x10 = x(bVar3, this.f42785H.d(intValue).f33789b);
        u.a s10 = s(bVar);
        b bVar4 = r2;
        b bVar5 = new b(intValue + this.f42793h0, this.f42785H, this.f42800o, i10, this.f42796k, this.f42779B, this.f42798m, s10, this.f42799n, x10, this.f42789Z, this.f42810y, bVar2, this.f42797l, this.f42809x, A());
        b bVar6 = bVar4;
        this.f42806u.put(bVar6.f42837a, bVar6);
        return bVar6;
    }

    private DashMediaSource(C3732y0 y0Var, R9.c cVar, C3612j.a aVar, D.a aVar2, a.C0659a aVar3, C3059h hVar, v vVar, ia.A a10, long j10) {
        this.f42792h = y0Var;
        this.f42782E = y0Var.f45858d;
        this.f42783F = ((C3732y0.h) C3645a.e(y0Var.f45856b)).f45919a;
        this.f42784G = y0Var.f45856b.f45919a;
        this.f42785H = cVar;
        this.f42795j = aVar;
        this.f42803r = aVar2;
        this.f42796k = aVar3;
        this.f42798m = vVar;
        this.f42799n = a10;
        this.f42801p = j10;
        this.f42797l = hVar;
        this.f42800o = new Q9.b();
        boolean z10 = cVar != null;
        this.f42794i = z10;
        this.f42802q = w((C3070t.b) null);
        this.f42805t = new Object();
        this.f42806u = new SparseArray();
        this.f42809x = new c(this, (a) null);
        this.f42791g0 = -9223372036854775807L;
        this.f42789Z = -9223372036854775807L;
        if (z10) {
            C3645a.f(true ^ cVar.f33756d);
            this.f42804s = null;
            this.f42807v = null;
            this.f42808w = null;
            this.f42810y = new C.a();
            return;
        }
        this.f42804s = new e(this, (a) null);
        this.f42810y = new f();
        this.f42807v = new Q9.d(this);
        this.f42808w = new Q9.e(this);
    }
}
