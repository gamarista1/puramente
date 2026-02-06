package S9;

import N9.C3053b;
import N9.T;
import P9.o;
import T9.g;
import T9.l;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.B;
import com.google.common.collect.C4770v;
import ga.r;
import ia.C3612j;
import ia.J;
import ia.n;
import ja.C3645a;
import ja.K;
import ja.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k9.C3717q0;
import k9.e1;
import l9.s0;

class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f33973a;

    /* renamed from: b  reason: collision with root package name */
    private final C3612j f33974b;

    /* renamed from: c  reason: collision with root package name */
    private final C3612j f33975c;

    /* renamed from: d  reason: collision with root package name */
    private final s f33976d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f33977e;

    /* renamed from: f  reason: collision with root package name */
    private final C3717q0[] f33978f;

    /* renamed from: g  reason: collision with root package name */
    private final l f33979g;

    /* renamed from: h  reason: collision with root package name */
    private final T f33980h;

    /* renamed from: i  reason: collision with root package name */
    private final List f33981i;

    /* renamed from: j  reason: collision with root package name */
    private final e f33982j = new e(4);

    /* renamed from: k  reason: collision with root package name */
    private final s0 f33983k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f33984l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f33985m = M.f44986f;

    /* renamed from: n  reason: collision with root package name */
    private IOException f33986n;

    /* renamed from: o  reason: collision with root package name */
    private Uri f33987o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f33988p;

    /* renamed from: q  reason: collision with root package name */
    private r f33989q;

    /* renamed from: r  reason: collision with root package name */
    private long f33990r = -9223372036854775807L;

    /* renamed from: s  reason: collision with root package name */
    private boolean f33991s;

    private static final class a extends P9.l {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f33992l;

        public a(C3612j jVar, n nVar, C3717q0 q0Var, int i10, Object obj, byte[] bArr) {
            super(jVar, nVar, 3, q0Var, i10, obj, bArr);
        }

        /* access modifiers changed from: protected */
        public void g(byte[] bArr, int i10) {
            this.f33992l = Arrays.copyOf(bArr, i10);
        }

        public byte[] j() {
            return this.f33992l;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public P9.f f33993a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f33994b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f33995c;

        public b() {
            a();
        }

        public void a() {
            this.f33993a = null;
            this.f33994b = false;
            this.f33995c = null;
        }
    }

    static final class c extends P9.b {

        /* renamed from: e  reason: collision with root package name */
        private final List f33996e;

        /* renamed from: f  reason: collision with root package name */
        private final long f33997f;

        /* renamed from: g  reason: collision with root package name */
        private final String f33998g;

        public c(String str, long j10, List list) {
            super(0, (long) (list.size() - 1));
            this.f33998g = str;
            this.f33997f = j10;
            this.f33996e = list;
        }

        public long a() {
            c();
            return this.f33997f + ((g.e) this.f33996e.get((int) d())).f34298e;
        }

        public long b() {
            c();
            g.e eVar = (g.e) this.f33996e.get((int) d());
            return this.f33997f + eVar.f34298e + eVar.f34296c;
        }
    }

    private static final class d extends ga.c {

        /* renamed from: h  reason: collision with root package name */
        private int f33999h;

        public d(T t10, int[] iArr) {
            super(t10, iArr);
            this.f33999h = l(t10.b(iArr[0]));
        }

        public int a() {
            return this.f33999h;
        }

        public void m(long j10, long j11, long j12, List list, o[] oVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (p(this.f33999h, elapsedRealtime)) {
                for (int i10 = this.f43789b - 1; i10 >= 0; i10--) {
                    if (!p(i10, elapsedRealtime)) {
                        this.f33999h = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public Object q() {
            return null;
        }

        public int s() {
            return 0;
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final g.e f34000a;

        /* renamed from: b  reason: collision with root package name */
        public final long f34001b;

        /* renamed from: c  reason: collision with root package name */
        public final int f34002c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f34003d;

        public e(g.e eVar, long j10, int i10) {
            boolean z10;
            this.f34000a = eVar;
            this.f34001b = j10;
            this.f34002c = i10;
            if (!(eVar instanceof g.b) || !((g.b) eVar).f34288m) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f34003d = z10;
        }
    }

    public f(h hVar, l lVar, Uri[] uriArr, C3717q0[] q0VarArr, g gVar, J j10, s sVar, List list, s0 s0Var) {
        this.f33973a = hVar;
        this.f33979g = lVar;
        this.f33977e = uriArr;
        this.f33978f = q0VarArr;
        this.f33976d = sVar;
        this.f33981i = list;
        this.f33983k = s0Var;
        C3612j a10 = gVar.a(1);
        this.f33974b = a10;
        if (j10 != null) {
            a10.n(j10);
        }
        this.f33975c = gVar.a(3);
        this.f33980h = new T(q0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((q0VarArr[i10].f45763e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f33989q = new d(this.f33980h, com.google.common.primitives.f.n(arrayList));
    }

    private static Uri d(g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f34300g) == null) {
            return null;
        }
        return K.e(gVar.f34331a, str);
    }

    private Pair f(i iVar, boolean z10, g gVar, long j10, long j11) {
        boolean z11;
        List list;
        long j12;
        long j13;
        int i10 = -1;
        if (iVar == null || z10) {
            long j14 = gVar.f34285u + j10;
            if (iVar != null && !this.f33988p) {
                j11 = iVar.f33606g;
            }
            if (!gVar.f34279o && j11 >= j14) {
                return new Pair(Long.valueOf(gVar.f34275k + ((long) gVar.f34282r.size())), -1);
            }
            long j15 = j11 - j10;
            List list2 = gVar.f34282r;
            Long valueOf = Long.valueOf(j15);
            int i11 = 0;
            if (!this.f33979g.i() || iVar == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int g10 = M.g(list2, valueOf, true, z11);
            long j16 = ((long) g10) + gVar.f34275k;
            if (g10 >= 0) {
                g.d dVar = (g.d) gVar.f34282r.get(g10);
                if (j15 < dVar.f34298e + dVar.f34296c) {
                    list = dVar.f34293m;
                } else {
                    list = gVar.f34283s;
                }
                while (true) {
                    if (i11 >= list.size()) {
                        break;
                    }
                    g.b bVar = (g.b) list.get(i11);
                    if (j15 >= bVar.f34298e + bVar.f34296c) {
                        i11++;
                    } else if (bVar.f34287l) {
                        if (list == gVar.f34283s) {
                            j12 = 1;
                        } else {
                            j12 = 0;
                        }
                        j16 += j12;
                        i10 = i11;
                    }
                }
            }
            return new Pair(Long.valueOf(j16), Integer.valueOf(i10));
        } else if (!iVar.h()) {
            return new Pair(Long.valueOf(iVar.f33651j), Integer.valueOf(iVar.f34022o));
        } else {
            if (iVar.f34022o == -1) {
                j13 = iVar.g();
            } else {
                j13 = iVar.f33651j;
            }
            Long valueOf2 = Long.valueOf(j13);
            int i12 = iVar.f34022o;
            if (i12 != -1) {
                i10 = i12 + 1;
            }
            return new Pair(valueOf2, Integer.valueOf(i10));
        }
    }

    private static e g(g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f34275k);
        if (i11 == gVar.f34282r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f34283s.size()) {
                return new e((g.e) gVar.f34283s.get(i10), j10, i10);
            }
            return null;
        }
        g.d dVar = (g.d) gVar.f34282r.get(i11);
        if (i10 == -1) {
            return new e(dVar, j10, -1);
        }
        if (i10 < dVar.f34293m.size()) {
            return new e((g.e) dVar.f34293m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f34282r.size()) {
            return new e((g.e) gVar.f34282r.get(i12), j10 + 1, -1);
        }
        if (!gVar.f34283s.isEmpty()) {
            return new e((g.e) gVar.f34283s.get(0), j10 + 1, 0);
        }
        return null;
    }

    static List i(g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f34275k);
        if (i11 < 0 || gVar.f34282r.size() < i11) {
            return C4770v.E();
        }
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        if (i11 < gVar.f34282r.size()) {
            if (i10 != -1) {
                g.d dVar = (g.d) gVar.f34282r.get(i11);
                if (i10 == 0) {
                    arrayList.add(dVar);
                } else if (i10 < dVar.f34293m.size()) {
                    List list = dVar.f34293m;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List list2 = gVar.f34282r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (gVar.f34278n != -9223372036854775807L) {
            if (i10 != -1) {
                i12 = i10;
            }
            if (i12 < gVar.f34283s.size()) {
                List list3 = gVar.f34283s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private P9.f l(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] c10 = this.f33982j.c(uri);
        if (c10 != null) {
            this.f33982j.b(uri, c10);
            return null;
        }
        return new a(this.f33975c, new n.b().i(uri).b(1).a(), this.f33978f[i10], this.f33989q.s(), this.f33989q.q(), this.f33985m);
    }

    private long s(long j10) {
        long j11 = this.f33990r;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    private void w(g gVar) {
        long j10;
        if (gVar.f34279o) {
            j10 = -9223372036854775807L;
        } else {
            j10 = gVar.e() - this.f33979g.d();
        }
        this.f33990r = j10;
    }

    public o[] a(i iVar, long j10) {
        int c10;
        int i10;
        boolean z10;
        i iVar2 = iVar;
        if (iVar2 == null) {
            c10 = -1;
        } else {
            c10 = this.f33980h.c(iVar2.f33603d);
        }
        int i11 = c10;
        int length = this.f33989q.length();
        o[] oVarArr = new o[length];
        boolean z11 = false;
        int i12 = 0;
        while (i12 < length) {
            int c11 = this.f33989q.c(i12);
            Uri uri = this.f33977e[c11];
            if (!this.f33979g.h(uri)) {
                oVarArr[i12] = o.f33652a;
                i10 = i12;
            } else {
                g l10 = this.f33979g.l(uri, z11);
                C3645a.e(l10);
                long d10 = l10.f34272h - this.f33979g.d();
                if (c11 != i11) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                i10 = i12;
                Pair f10 = f(iVar, z10, l10, d10, j10);
                oVarArr[i10] = new c(l10.f34331a, d10, i(l10, ((Long) f10.first).longValue(), ((Integer) f10.second).intValue()));
            }
            i12 = i10 + 1;
            z11 = false;
        }
        return oVarArr;
    }

    public long b(long j10, e1 e1Var) {
        g gVar;
        long j11;
        int a10 = this.f33989q.a();
        Uri[] uriArr = this.f33977e;
        if (a10 >= uriArr.length || a10 == -1) {
            gVar = null;
        } else {
            gVar = this.f33979g.l(uriArr[this.f33989q.i()], true);
        }
        if (gVar == null || gVar.f34282r.isEmpty() || !gVar.f34333c) {
            return j10;
        }
        long d10 = gVar.f34272h - this.f33979g.d();
        long j12 = j10 - d10;
        int g10 = M.g(gVar.f34282r, Long.valueOf(j12), true, true);
        long j13 = ((g.d) gVar.f34282r.get(g10)).f34298e;
        if (g10 != gVar.f34282r.size() - 1) {
            j11 = ((g.d) gVar.f34282r.get(g10 + 1)).f34298e;
        } else {
            j11 = j13;
        }
        return e1Var.a(j12, j13, j11) + d10;
    }

    public int c(i iVar) {
        List list;
        if (iVar.f34022o == -1) {
            return 1;
        }
        g gVar = (g) C3645a.e(this.f33979g.l(this.f33977e[this.f33980h.c(iVar.f33603d)], false));
        int i10 = (int) (iVar.f33651j - gVar.f34275k);
        if (i10 < 0) {
            return 1;
        }
        if (i10 < gVar.f34282r.size()) {
            list = ((g.d) gVar.f34282r.get(i10)).f34293m;
        } else {
            list = gVar.f34283s;
        }
        if (iVar.f34022o >= list.size()) {
            return 2;
        }
        g.b bVar = (g.b) list.get(iVar.f34022o);
        if (bVar.f34288m) {
            return 0;
        }
        if (M.c(Uri.parse(K.d(gVar.f34331a, bVar.f34294a)), iVar.f33601b.f44456a)) {
            return 1;
        }
        return 2;
    }

    public void e(long j10, long j11, List list, boolean z10, b bVar) {
        int i10;
        long j12;
        Uri uri;
        g gVar;
        int i11;
        long j13 = j11;
        b bVar2 = bVar;
        i iVar = list.isEmpty() ? null : (i) B.d(list);
        if (iVar == null) {
            i10 = -1;
        } else {
            i10 = this.f33980h.c(iVar.f33603d);
        }
        long j14 = j13 - j10;
        long s10 = s(j10);
        if (iVar != null && !this.f33988p) {
            long d10 = iVar.d();
            j14 = Math.max(0, j14 - d10);
            if (s10 != -9223372036854775807L) {
                s10 = Math.max(0, s10 - d10);
            }
        }
        this.f33989q.m(j10, j14, s10, list, a(iVar, j13));
        int i12 = this.f33989q.i();
        boolean z11 = i10 != i12;
        Uri uri2 = this.f33977e[i12];
        if (!this.f33979g.h(uri2)) {
            bVar2.f33995c = uri2;
            this.f33991s &= uri2.equals(this.f33987o);
            this.f33987o = uri2;
            return;
        }
        g l10 = this.f33979g.l(uri2, true);
        C3645a.e(l10);
        this.f33988p = l10.f34333c;
        w(l10);
        long d11 = l10.f34272h - this.f33979g.d();
        g gVar2 = l10;
        Uri uri3 = uri2;
        int i13 = i12;
        Pair f10 = f(iVar, z11, l10, d11, j11);
        long longValue = ((Long) f10.first).longValue();
        int intValue = ((Integer) f10.second).intValue();
        if (longValue >= l10.f34275k || iVar == null || !z11) {
            gVar = l10;
            j12 = d11;
            uri = uri3;
            i11 = i13;
        } else {
            Uri uri4 = this.f33977e[i10];
            g l11 = this.f33979g.l(uri4, true);
            C3645a.e(l11);
            j12 = l11.f34272h - this.f33979g.d();
            Pair f11 = f(iVar, false, l11, j12, j11);
            longValue = ((Long) f11.first).longValue();
            intValue = ((Integer) f11.second).intValue();
            i11 = i10;
            uri = uri4;
            gVar = l11;
        }
        if (longValue < gVar.f34275k) {
            this.f33986n = new C3053b();
            return;
        }
        e g10 = g(gVar, longValue, intValue);
        if (g10 == null) {
            if (!gVar.f34279o) {
                bVar2.f33995c = uri;
                this.f33991s &= uri.equals(this.f33987o);
                this.f33987o = uri;
                return;
            } else if (z10 || gVar.f34282r.isEmpty()) {
                bVar2.f33994b = true;
                return;
            } else {
                g10 = new e((g.e) B.d(gVar.f34282r), (gVar.f34275k + ((long) gVar.f34282r.size())) - 1, -1);
            }
        }
        this.f33991s = false;
        this.f33987o = null;
        Uri d12 = d(gVar, g10.f34000a.f34295b);
        P9.f l12 = l(d12, i11);
        bVar2.f33993a = l12;
        if (l12 == null) {
            Uri d13 = d(gVar, g10.f34000a);
            P9.f l13 = l(d13, i11);
            bVar2.f33993a = l13;
            if (l13 == null) {
                boolean w10 = i.w(iVar, uri, gVar, g10, j12);
                if (!w10 || !g10.f34003d) {
                    bVar2.f33993a = i.j(this.f33973a, this.f33974b, this.f33978f[i11], j12, gVar, g10, uri, this.f33981i, this.f33989q.s(), this.f33989q.q(), this.f33984l, this.f33976d, iVar, this.f33982j.a(d13), this.f33982j.a(d12), w10, this.f33983k);
                }
            }
        }
    }

    public int h(long j10, List list) {
        if (this.f33986n != null || this.f33989q.length() < 2) {
            return list.size();
        }
        return this.f33989q.r(j10, list);
    }

    public T j() {
        return this.f33980h;
    }

    public r k() {
        return this.f33989q;
    }

    public boolean m(P9.f fVar, long j10) {
        r rVar = this.f33989q;
        return rVar.o(rVar.f(this.f33980h.c(fVar.f33603d)), j10);
    }

    public void n() {
        IOException iOException = this.f33986n;
        if (iOException == null) {
            Uri uri = this.f33987o;
            if (uri != null && this.f33991s) {
                this.f33979g.b(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public boolean o(Uri uri) {
        return M.s(this.f33977e, uri);
    }

    public void p(P9.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f33985m = aVar.h();
            this.f33982j.b(aVar.f33601b.f44456a, (byte[]) C3645a.e(aVar.j()));
        }
    }

    public boolean q(Uri uri, long j10) {
        int f10;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f33977e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            } else if (uriArr[i10].equals(uri)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1 || (f10 = this.f33989q.f(i10)) == -1) {
            return true;
        }
        this.f33991s |= uri.equals(this.f33987o);
        if (j10 == -9223372036854775807L || (this.f33989q.o(f10, j10) && this.f33979g.j(uri, j10))) {
            return true;
        }
        return false;
    }

    public void r() {
        this.f33986n = null;
    }

    public void t(boolean z10) {
        this.f33984l = z10;
    }

    public void u(r rVar) {
        this.f33989q = rVar;
    }

    public boolean v(long j10, P9.f fVar, List list) {
        if (this.f33986n != null) {
            return false;
        }
        return this.f33989q.n(j10, fVar, list);
    }
}
