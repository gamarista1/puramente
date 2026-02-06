package com.google.android.exoplayer2.source.dash;

import N9.C3053b;
import P9.g;
import P9.k;
import P9.m;
import P9.n;
import P9.o;
import P9.p;
import Q9.f;
import Q9.h;
import R9.i;
import R9.j;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import ga.r;
import ia.A;
import ia.C;
import ia.C3612j;
import ia.J;
import ia.y;
import ja.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k9.C3717q0;
import k9.e1;
import l9.s0;
import q9.C3968c;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C f42868a;

    /* renamed from: b  reason: collision with root package name */
    private final Q9.b f42869b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f42870c;

    /* renamed from: d  reason: collision with root package name */
    private final int f42871d;

    /* renamed from: e  reason: collision with root package name */
    private final C3612j f42872e;

    /* renamed from: f  reason: collision with root package name */
    private final long f42873f;

    /* renamed from: g  reason: collision with root package name */
    private final int f42874g;

    /* renamed from: h  reason: collision with root package name */
    private final e.c f42875h;

    /* renamed from: i  reason: collision with root package name */
    protected final b[] f42876i;

    /* renamed from: j  reason: collision with root package name */
    private r f42877j;

    /* renamed from: k  reason: collision with root package name */
    private R9.c f42878k;

    /* renamed from: l  reason: collision with root package name */
    private int f42879l;

    /* renamed from: m  reason: collision with root package name */
    private IOException f42880m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f42881n;

    public static final class a implements a.C0659a {

        /* renamed from: a  reason: collision with root package name */
        private final C3612j.a f42882a;

        /* renamed from: b  reason: collision with root package name */
        private final int f42883b;

        /* renamed from: c  reason: collision with root package name */
        private final g.a f42884c;

        public a(C3612j.a aVar) {
            this(aVar, 1);
        }

        public a a(C c10, R9.c cVar, Q9.b bVar, int i10, int[] iArr, r rVar, int i11, long j10, boolean z10, List list, e.c cVar2, J j11, s0 s0Var) {
            J j12 = j11;
            C3612j a10 = this.f42882a.a();
            if (j12 != null) {
                a10.n(j12);
            }
            return new c(this.f42884c, c10, cVar, bVar, i10, iArr, rVar, i11, a10, j10, this.f42883b, z10, list, cVar2, s0Var);
        }

        public a(C3612j.a aVar, int i10) {
            this(P9.e.f33582j, aVar, i10);
        }

        public a(g.a aVar, C3612j.a aVar2, int i10) {
            this.f42884c = aVar;
            this.f42882a = aVar2;
            this.f42883b = i10;
        }
    }

    protected static final class b {

        /* renamed from: a  reason: collision with root package name */
        final g f42885a;

        /* renamed from: b  reason: collision with root package name */
        public final j f42886b;

        /* renamed from: c  reason: collision with root package name */
        public final R9.b f42887c;

        /* renamed from: d  reason: collision with root package name */
        public final f f42888d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final long f42889e;

        /* renamed from: f  reason: collision with root package name */
        private final long f42890f;

        b(long j10, j jVar, R9.b bVar, g gVar, long j11, f fVar) {
            this.f42889e = j10;
            this.f42886b = jVar;
            this.f42887c = bVar;
            this.f42890f = j11;
            this.f42885a = gVar;
            this.f42888d = fVar;
        }

        /* access modifiers changed from: package-private */
        public b b(long j10, j jVar) {
            long g10;
            long j11 = j10;
            f l10 = this.f42886b.l();
            f l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f42887c, this.f42885a, this.f42890f, l10);
            } else if (!l10.i()) {
                return new b(j10, jVar, this.f42887c, this.f42885a, this.f42890f, l11);
            } else {
                long h10 = l10.h(j11);
                if (h10 == 0) {
                    return new b(j10, jVar, this.f42887c, this.f42885a, this.f42890f, l11);
                }
                long j12 = l10.j();
                long b10 = l10.b(j12);
                long j13 = h10 + j12;
                long j14 = j13 - 1;
                long b11 = l10.b(j14) + l10.c(j14, j11);
                long j15 = l11.j();
                f fVar = l10;
                long b12 = l11.b(j15);
                long j16 = j12;
                long j17 = this.f42890f;
                int i10 = (b11 > b12 ? 1 : (b11 == b12 ? 0 : -1));
                if (i10 != 0) {
                    if (i10 < 0) {
                        throw new C3053b();
                    } else if (b12 < b10) {
                        g10 = j17 - (l11.g(b10, j11) - j16);
                        return new b(j10, jVar, this.f42887c, this.f42885a, g10, l11);
                    } else {
                        j13 = fVar.g(b12, j11);
                    }
                }
                g10 = j17 + (j13 - j15);
                return new b(j10, jVar, this.f42887c, this.f42885a, g10, l11);
            }
        }

        /* access modifiers changed from: package-private */
        public b c(f fVar) {
            return new b(this.f42889e, this.f42886b, this.f42887c, this.f42885a, this.f42890f, fVar);
        }

        /* access modifiers changed from: package-private */
        public b d(R9.b bVar) {
            return new b(this.f42889e, this.f42886b, bVar, this.f42885a, this.f42890f, this.f42888d);
        }

        public long e(long j10) {
            return this.f42888d.d(this.f42889e, j10) + this.f42890f;
        }

        public long f() {
            return this.f42888d.j() + this.f42890f;
        }

        public long g(long j10) {
            return (e(j10) + this.f42888d.k(this.f42889e, j10)) - 1;
        }

        public long h() {
            return this.f42888d.h(this.f42889e);
        }

        public long i(long j10) {
            return k(j10) + this.f42888d.c(j10 - this.f42890f, this.f42889e);
        }

        public long j(long j10) {
            return this.f42888d.g(j10, this.f42889e) + this.f42890f;
        }

        public long k(long j10) {
            return this.f42888d.b(j10 - this.f42890f);
        }

        public i l(long j10) {
            return this.f42888d.f(j10 - this.f42890f);
        }

        public boolean m(long j10, long j11) {
            if (!this.f42888d.i() && j11 != -9223372036854775807L && i(j10) > j11) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    protected static final class C0660c extends P9.b {

        /* renamed from: e  reason: collision with root package name */
        private final b f42891e;

        /* renamed from: f  reason: collision with root package name */
        private final long f42892f;

        public C0660c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f42891e = bVar;
            this.f42892f = j12;
        }

        public long a() {
            c();
            return this.f42891e.k(d());
        }

        public long b() {
            c();
            return this.f42891e.i(d());
        }
    }

    public c(g.a aVar, C c10, R9.c cVar, Q9.b bVar, int i10, int[] iArr, r rVar, int i11, C3612j jVar, long j10, int i12, boolean z10, List list, e.c cVar2, s0 s0Var) {
        R9.c cVar3 = cVar;
        Q9.b bVar2 = bVar;
        int i13 = i10;
        r rVar2 = rVar;
        this.f42868a = c10;
        this.f42878k = cVar3;
        this.f42869b = bVar2;
        this.f42870c = iArr;
        this.f42877j = rVar2;
        this.f42871d = i11;
        this.f42872e = jVar;
        this.f42879l = i13;
        this.f42873f = j10;
        this.f42874g = i12;
        this.f42875h = cVar2;
        long g10 = cVar3.g(i13);
        ArrayList n10 = n();
        this.f42876i = new b[rVar.length()];
        int i14 = 0;
        while (i14 < this.f42876i.length) {
            j jVar2 = (j) n10.get(rVar2.c(i14));
            R9.b j11 = bVar2.j(jVar2.f33804c);
            int i15 = i14;
            this.f42876i[i15] = new b(g10, jVar2, j11 == null ? (R9.b) jVar2.f33804c.get(0) : j11, aVar.a(i11, jVar2.f33803b, z10, list, cVar2, s0Var), 0, jVar2.l());
            i14 = i15 + 1;
        }
    }

    private A.a j(r rVar, List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.p(i11, elapsedRealtime)) {
                i10++;
            }
        }
        int f10 = Q9.b.f(list);
        return new A.a(f10, f10 - this.f42869b.g(list), length, i10);
    }

    private long k(long j10, long j11) {
        if (!this.f42878k.f33756d) {
            return -9223372036854775807L;
        }
        return Math.max(0, Math.min(m(j10), this.f42876i[0].i(this.f42876i[0].g(j10))) - j11);
    }

    private long m(long j10) {
        R9.c cVar = this.f42878k;
        long j11 = cVar.f33753a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - M.C0(j11 + cVar.d(this.f42879l).f33789b);
    }

    private ArrayList n() {
        List list = this.f42878k.d(this.f42879l).f33790c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f42870c) {
            arrayList.addAll(((R9.a) list.get(i10)).f33745c);
        }
        return arrayList;
    }

    private long o(b bVar, n nVar, long j10, long j11, long j12) {
        if (nVar != null) {
            return nVar.g();
        }
        return M.r(bVar.j(j10), j11, j12);
    }

    private b r(int i10) {
        b bVar = this.f42876i[i10];
        R9.b j10 = this.f42869b.j(bVar.f42886b.f33804c);
        if (j10 == null || j10.equals(bVar.f42887c)) {
            return bVar;
        }
        b d10 = bVar.d(j10);
        this.f42876i[i10] = d10;
        return d10;
    }

    public void a(r rVar) {
        this.f42877j = rVar;
    }

    public boolean b(P9.f fVar, boolean z10, A.c cVar, A a10) {
        A.b d10;
        if (!z10) {
            return false;
        }
        e.c cVar2 = this.f42875h;
        if (cVar2 != null && cVar2.j(fVar)) {
            return true;
        }
        if (!this.f42878k.f33756d && (fVar instanceof n)) {
            IOException iOException = cVar.f44360c;
            if ((iOException instanceof y.f) && ((y.f) iOException).f44562d == 404) {
                b bVar = this.f42876i[this.f42877j.l(fVar.f33603d)];
                long h10 = bVar.h();
                if (!(h10 == -1 || h10 == 0)) {
                    if (((n) fVar).g() > (bVar.f() + h10) - 1) {
                        this.f42881n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f42876i[this.f42877j.l(fVar.f33603d)];
        R9.b j10 = this.f42869b.j(bVar2.f42886b.f33804c);
        if (j10 != null && !bVar2.f42887c.equals(j10)) {
            return true;
        }
        A.a j11 = j(this.f42877j, bVar2.f42886b.f33804c);
        if ((!j11.a(2) && !j11.a(1)) || (d10 = a10.d(j11, cVar)) == null || !j11.a(d10.f44356a)) {
            return false;
        }
        int i10 = d10.f44356a;
        if (i10 == 2) {
            r rVar = this.f42877j;
            return rVar.o(rVar.l(fVar.f33603d), d10.f44357b);
        } else if (i10 != 1) {
            return false;
        } else {
            this.f42869b.e(bVar2.f42887c, d10.f44357b);
            return true;
        }
    }

    public void c(R9.c cVar, int i10) {
        try {
            this.f42878k = cVar;
            this.f42879l = i10;
            long g10 = cVar.g(i10);
            ArrayList n10 = n();
            for (int i11 = 0; i11 < this.f42876i.length; i11++) {
                b[] bVarArr = this.f42876i;
                bVarArr[i11] = bVarArr[i11].b(g10, (j) n10.get(this.f42877j.c(i11)));
            }
        } catch (C3053b e10) {
            this.f42880m = e10;
        }
    }

    public void d(P9.f fVar) {
        C3968c b10;
        if (fVar instanceof m) {
            int l10 = this.f42877j.l(((m) fVar).f33603d);
            b bVar = this.f42876i[l10];
            if (bVar.f42888d == null && (b10 = bVar.f42885a.b()) != null) {
                this.f42876i[l10] = bVar.c(new h(b10, bVar.f42886b.f33805d));
            }
        }
        e.c cVar = this.f42875h;
        if (cVar != null) {
            cVar.i(fVar);
        }
    }

    public void e() {
        IOException iOException = this.f42880m;
        if (iOException == null) {
            this.f42868a.e();
            return;
        }
        throw iOException;
    }

    public boolean f(long j10, P9.f fVar, List list) {
        if (this.f42880m != null) {
            return false;
        }
        return this.f42877j.n(j10, fVar, list);
    }

    public void g(long j10, long j11, List list, P9.h hVar) {
        n nVar;
        boolean z10;
        i iVar;
        i iVar2;
        long j12;
        o[] oVarArr;
        int i10;
        int i11;
        long j13;
        long j14 = j10;
        P9.h hVar2 = hVar;
        if (this.f42880m == null) {
            long j15 = j11 - j14;
            long C02 = M.C0(this.f42878k.f33753a) + M.C0(this.f42878k.d(this.f42879l).f33789b) + j11;
            e.c cVar = this.f42875h;
            if (cVar == null || !cVar.h(C02)) {
                long C03 = M.C0(M.b0(this.f42873f));
                long m10 = m(C03);
                if (list.isEmpty()) {
                    List list2 = list;
                    nVar = null;
                } else {
                    nVar = (n) list.get(list.size() - 1);
                }
                int length = this.f42877j.length();
                o[] oVarArr2 = new o[length];
                int i12 = 0;
                while (i12 < length) {
                    b bVar = this.f42876i[i12];
                    if (bVar.f42888d == null) {
                        oVarArr2[i12] = o.f33652a;
                        i11 = i12;
                        i10 = length;
                        oVarArr = oVarArr2;
                        j12 = j15;
                        j13 = C03;
                    } else {
                        long e10 = bVar.e(C03);
                        long g10 = bVar.g(C03);
                        i11 = i12;
                        i10 = length;
                        oVarArr = oVarArr2;
                        j12 = j15;
                        j13 = C03;
                        long o10 = o(bVar, nVar, j11, e10, g10);
                        if (o10 < e10) {
                            oVarArr[i11] = o.f33652a;
                        } else {
                            oVarArr[i11] = new C0660c(r(i11), o10, g10, m10);
                        }
                    }
                    i12 = i11 + 1;
                    List list3 = list;
                    C03 = j13;
                    length = i10;
                    oVarArr2 = oVarArr;
                    j15 = j12;
                }
                long j16 = j15;
                long j17 = C03;
                this.f42877j.m(j10, j16, k(j17, j14), list, oVarArr2);
                b r10 = r(this.f42877j.a());
                g gVar = r10.f42885a;
                if (gVar != null) {
                    j jVar = r10.f42886b;
                    if (gVar.c() == null) {
                        iVar = jVar.n();
                    } else {
                        iVar = null;
                    }
                    if (r10.f42888d == null) {
                        iVar2 = jVar.m();
                    } else {
                        iVar2 = null;
                    }
                    if (!(iVar == null && iVar2 == null)) {
                        hVar2.f33609a = p(r10, this.f42872e, this.f42877j.j(), this.f42877j.s(), this.f42877j.q(), iVar, iVar2);
                        return;
                    }
                }
                long a10 = r10.f42889e;
                long j18 = -9223372036854775807L;
                int i13 = (a10 > -9223372036854775807L ? 1 : (a10 == -9223372036854775807L ? 0 : -1));
                if (i13 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (r10.h() == 0) {
                    hVar2.f33610b = z10;
                    return;
                }
                long e11 = r10.e(j17);
                long g11 = r10.g(j17);
                long o11 = o(r10, nVar, j11, e11, g11);
                if (o11 < e11) {
                    this.f42880m = new C3053b();
                    return;
                }
                int i14 = (o11 > g11 ? 1 : (o11 == g11 ? 0 : -1));
                if (i14 > 0 || (this.f42881n && i14 >= 0)) {
                    hVar2.f33610b = z10;
                } else if (!z10 || r10.k(o11) < a10) {
                    int min = (int) Math.min((long) this.f42874g, (g11 - o11) + 1);
                    if (i13 != 0) {
                        while (min > 1 && r10.k((((long) min) + o11) - 1) >= a10) {
                            min--;
                        }
                    }
                    int i15 = min;
                    if (list.isEmpty()) {
                        j18 = j11;
                    }
                    hVar2.f33609a = q(r10, this.f42872e, this.f42871d, this.f42877j.j(), this.f42877j.s(), this.f42877j.q(), o11, i15, j18, m10);
                } else {
                    hVar2.f33610b = true;
                }
            }
        }
    }

    public int h(long j10, List list) {
        if (this.f42880m != null || this.f42877j.length() < 2) {
            return list.size();
        }
        return this.f42877j.r(j10, list);
    }

    public long l(long j10, e1 e1Var) {
        long j11;
        long j12 = j10;
        for (b bVar : this.f42876i) {
            if (bVar.f42888d != null) {
                long j13 = bVar.j(j12);
                long k10 = bVar.k(j13);
                long h10 = bVar.h();
                if (k10 >= j12 || (h10 != -1 && j13 >= (bVar.f() + h10) - 1)) {
                    j11 = k10;
                } else {
                    j11 = bVar.k(j13 + 1);
                }
                return e1Var.a(j10, k10, j11);
            }
        }
        return j12;
    }

    /* access modifiers changed from: protected */
    public P9.f p(b bVar, C3612j jVar, C3717q0 q0Var, int i10, Object obj, i iVar, i iVar2) {
        b bVar2 = bVar;
        i iVar3 = iVar;
        j jVar2 = bVar2.f42886b;
        if (iVar3 != null) {
            i a10 = iVar3.a(iVar2, bVar2.f42887c.f33749a);
            if (a10 != null) {
                iVar3 = a10;
            }
        } else {
            iVar3 = iVar2;
        }
        return new m(jVar, Q9.g.a(jVar2, bVar2.f42887c.f33749a, iVar3, 0), q0Var, i10, obj, bVar2.f42885a);
    }

    /* access modifiers changed from: protected */
    public P9.f q(b bVar, C3612j jVar, int i10, C3717q0 q0Var, int i11, Object obj, long j10, int i12, long j11, long j12) {
        long j13;
        b bVar2 = bVar;
        long j14 = j10;
        long j15 = j12;
        j jVar2 = bVar2.f42886b;
        long k10 = bVar2.k(j14);
        i l10 = bVar2.l(j14);
        int i13 = 8;
        if (bVar2.f42885a == null) {
            long i14 = bVar2.i(j14);
            if (bVar2.m(j14, j15)) {
                i13 = 0;
            }
            return new p(jVar, Q9.g.a(jVar2, bVar2.f42887c.f33749a, l10, i13), q0Var, i11, obj, k10, i14, j10, i10, q0Var);
        }
        int i15 = 1;
        int i16 = i12;
        int i17 = 1;
        while (i15 < i16) {
            i a10 = l10.a(bVar2.l(((long) i15) + j14), bVar2.f42887c.f33749a);
            if (a10 == null) {
                break;
            }
            i17++;
            i15++;
            l10 = a10;
        }
        long j16 = (((long) i17) + j14) - 1;
        long i18 = bVar2.i(j16);
        long a11 = bVar.f42889e;
        if (a11 == -9223372036854775807L || a11 > i18) {
            j13 = -9223372036854775807L;
        } else {
            j13 = a11;
        }
        if (bVar2.m(j16, j15)) {
            i13 = 0;
        }
        g gVar = bVar2.f42885a;
        return new k(jVar, Q9.g.a(jVar2, bVar2.f42887c.f33749a, l10, i13), q0Var, i11, obj, k10, i18, j11, j13, j10, i17, -jVar2.f33805d, gVar);
    }

    public void release() {
        for (b bVar : this.f42876i) {
            g gVar = bVar.f42885a;
            if (gVar != null) {
                gVar.release();
            }
        }
    }
}
