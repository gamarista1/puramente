package T9;

import N9.A;
import N9.C3065n;
import N9.C3068q;
import S9.g;
import T9.g;
import T9.h;
import T9.j;
import T9.l;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.a;
import ia.A;
import ia.B;
import ia.C3612j;
import ia.D;
import ia.y;
import ja.C3645a;
import ja.M;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k9.L0;

public final class c implements l, B.b {

    /* renamed from: p  reason: collision with root package name */
    public static final l.a f34236p = new b();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g f34237a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f34238b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final A f34239c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f34240d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final CopyOnWriteArrayList f34241e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final double f34242f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public A.a f34243g;

    /* renamed from: h  reason: collision with root package name */
    private B f34244h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public Handler f34245i;

    /* renamed from: j  reason: collision with root package name */
    private l.e f34246j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public h f34247k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public Uri f34248l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public g f34249m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f34250n;

    /* renamed from: o  reason: collision with root package name */
    private long f34251o;

    private class b implements l.b {
        private b() {
        }

        public boolean e(Uri uri, A.c cVar, boolean z10) {
            C0558c cVar2;
            if (c.this.f34249m == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((h) M.j(c.this.f34247k)).f34312e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0558c cVar3 = (C0558c) c.this.f34240d.get(((h.b) list.get(i11)).f34325a);
                    if (cVar3 != null && elapsedRealtime < cVar3.f34260h) {
                        i10++;
                    }
                }
                A.b d10 = c.this.f34239c.d(new A.a(1, 0, c.this.f34247k.f34312e.size(), i10), cVar);
                if (!(d10 == null || d10.f44356a != 2 || (cVar2 = (C0558c) c.this.f34240d.get(uri)) == null)) {
                    boolean unused = cVar2.h(d10.f44357b);
                }
            }
            return false;
        }

        public void i() {
            c.this.f34241e.remove(this);
        }
    }

    /* renamed from: T9.c$c  reason: collision with other inner class name */
    private final class C0558c implements B.b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Uri f34253a;

        /* renamed from: b  reason: collision with root package name */
        private final B f34254b = new B("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c  reason: collision with root package name */
        private final C3612j f34255c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public g f34256d;

        /* renamed from: e  reason: collision with root package name */
        private long f34257e;

        /* renamed from: f  reason: collision with root package name */
        private long f34258f;

        /* renamed from: g  reason: collision with root package name */
        private long f34259g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public long f34260h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f34261i;

        /* renamed from: j  reason: collision with root package name */
        private IOException f34262j;

        public C0558c(Uri uri) {
            this.f34253a = uri;
            this.f34255c = c.this.f34237a.a(4);
        }

        /* access modifiers changed from: private */
        public boolean h(long j10) {
            this.f34260h = SystemClock.elapsedRealtime() + j10;
            if (!this.f34253a.equals(c.this.f34248l) || c.this.L()) {
                return false;
            }
            return true;
        }

        private Uri i() {
            String str;
            g gVar = this.f34256d;
            if (gVar != null) {
                g.f fVar = gVar.f34286v;
                if (fVar.f34305a != -9223372036854775807L || fVar.f34309e) {
                    Uri.Builder buildUpon = this.f34253a.buildUpon();
                    g gVar2 = this.f34256d;
                    if (gVar2.f34286v.f34309e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f34275k + ((long) gVar2.f34282r.size())));
                        g gVar3 = this.f34256d;
                        if (gVar3.f34278n != -9223372036854775807L) {
                            List list = gVar3.f34283s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) com.google.common.collect.B.d(list)).f34288m) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f34256d.f34286v;
                    if (fVar2.f34305a != -9223372036854775807L) {
                        if (fVar2.f34306b) {
                            str = "v2";
                        } else {
                            str = "YES";
                        }
                        buildUpon.appendQueryParameter("_HLS_skip", str);
                    }
                    return buildUpon.build();
                }
            }
            return this.f34253a;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(Uri uri) {
            this.f34261i = false;
            n(uri);
        }

        private void n(Uri uri) {
            D d10 = new D(this.f34255c, uri, 4, c.this.f34238b.b(c.this.f34247k, this.f34256d));
            c.this.f34243g.z(new C3065n(d10.f44382a, d10.f44383b, this.f34254b.n(d10, this, c.this.f34239c.a(d10.f44384c))), d10.f44384c);
        }

        /* access modifiers changed from: private */
        public void o(Uri uri) {
            this.f34260h = 0;
            if (!this.f34261i && !this.f34254b.j() && !this.f34254b.i()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < this.f34259g) {
                    this.f34261i = true;
                    c.this.f34245i.postDelayed(new d(this, uri), this.f34259g - elapsedRealtime);
                    return;
                }
                n(uri);
            }
        }

        /* access modifiers changed from: private */
        public void w(g gVar, C3065n nVar) {
            long j10;
            boolean z10;
            g gVar2 = this.f34256d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f34257e = elapsedRealtime;
            g r10 = c.this.G(gVar2, gVar);
            this.f34256d = r10;
            IOException iOException = null;
            if (r10 != gVar2) {
                this.f34262j = null;
                this.f34258f = elapsedRealtime;
                c.this.R(this.f34253a, r10);
            } else if (!r10.f34279o) {
                g gVar3 = this.f34256d;
                if (gVar.f34275k + ((long) gVar.f34282r.size()) < gVar3.f34275k) {
                    iOException = new l.c(this.f34253a);
                    z10 = true;
                } else {
                    z10 = false;
                    if (((double) (elapsedRealtime - this.f34258f)) > ((double) M.Z0(gVar3.f34277m)) * c.this.f34242f) {
                        iOException = new l.d(this.f34253a);
                    }
                }
                if (iOException != null) {
                    this.f34262j = iOException;
                    boolean unused = c.this.N(this.f34253a, new A.c(nVar, new C3068q(4), iOException, 1), z10);
                }
            }
            g gVar4 = this.f34256d;
            if (gVar4.f34286v.f34309e) {
                j10 = 0;
            } else if (gVar4 != gVar2) {
                j10 = gVar4.f34277m;
            } else {
                j10 = gVar4.f34277m / 2;
            }
            this.f34259g = elapsedRealtime + M.Z0(j10);
            if ((this.f34256d.f34278n != -9223372036854775807L || this.f34253a.equals(c.this.f34248l)) && !this.f34256d.f34279o) {
                o(i());
            }
        }

        public g j() {
            return this.f34256d;
        }

        public boolean k() {
            int i10;
            if (this.f34256d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000, M.Z0(this.f34256d.f34285u));
            g gVar = this.f34256d;
            if (gVar.f34279o || (i10 = gVar.f34268d) == 2 || i10 == 1 || this.f34257e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }

        public void m() {
            o(this.f34253a);
        }

        public void q() {
            this.f34254b.e();
            IOException iOException = this.f34262j;
            if (iOException != null) {
                throw iOException;
            }
        }

        /* renamed from: r */
        public void t(D d10, long j10, long j11, boolean z10) {
            D d11 = d10;
            C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
            c.this.f34239c.b(d11.f44382a);
            c.this.f34243g.q(nVar, 4);
        }

        /* renamed from: s */
        public void p(D d10, long j10, long j11) {
            D d11 = d10;
            i iVar = (i) d10.e();
            C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
            if (iVar instanceof g) {
                w((g) iVar, nVar);
                c.this.f34243g.t(nVar, 4);
            } else {
                this.f34262j = L0.c("Loaded playlist has unexpected type.", (Throwable) null);
                c.this.f34243g.x(nVar, 4, this.f34262j, true);
            }
            c.this.f34239c.b(d11.f44382a);
        }

        /* renamed from: v */
        public B.c u(D d10, long j10, long j11, IOException iOException, int i10) {
            boolean z10;
            B.c cVar;
            int i11;
            D d11 = d10;
            IOException iOException2 = iOException;
            C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
            if (d10.f().getQueryParameter("_HLS_msn") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = iOException2 instanceof j.a;
            if (z10 || z11) {
                if (iOException2 instanceof y.f) {
                    i11 = ((y.f) iOException2).f44562d;
                } else {
                    i11 = a.e.API_PRIORITY_OTHER;
                }
                if (z11 || i11 == 400 || i11 == 503) {
                    this.f34259g = SystemClock.elapsedRealtime();
                    m();
                    ((A.a) M.j(c.this.f34243g)).x(nVar, d11.f44384c, iOException2, true);
                    return B.f44364f;
                }
            }
            A.c cVar2 = new A.c(nVar, new C3068q(d11.f44384c), iOException2, i10);
            if (c.this.N(this.f34253a, cVar2, false)) {
                long c10 = c.this.f34239c.c(cVar2);
                if (c10 != -9223372036854775807L) {
                    cVar = B.h(false, c10);
                } else {
                    cVar = B.f44365g;
                }
            } else {
                cVar = B.f44364f;
            }
            boolean c11 = cVar.c();
            c.this.f34243g.x(nVar, d11.f44384c, iOException2, !c11);
            if (!c11) {
                c.this.f34239c.b(d11.f44382a);
            }
            return cVar;
        }

        public void x() {
            this.f34254b.l();
        }
    }

    public c(S9.g gVar, ia.A a10, k kVar) {
        this(gVar, a10, kVar, 3.5d);
    }

    private void E(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f34240d.put(uri, new C0558c(uri));
        }
    }

    private static g.d F(g gVar, g gVar2) {
        int i10 = (int) (gVar2.f34275k - gVar.f34275k);
        List list = gVar.f34282r;
        if (i10 < list.size()) {
            return (g.d) list.get(i10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public g G(g gVar, g gVar2) {
        if (gVar2.f(gVar)) {
            return gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
        }
        if (gVar2.f34279o) {
            return gVar.d();
        }
        return gVar;
    }

    private int H(g gVar, g gVar2) {
        int i10;
        g.d F10;
        if (gVar2.f34273i) {
            return gVar2.f34274j;
        }
        g gVar3 = this.f34249m;
        if (gVar3 != null) {
            i10 = gVar3.f34274j;
        } else {
            i10 = 0;
        }
        if (gVar == null || (F10 = F(gVar, gVar2)) == null) {
            return i10;
        }
        return (gVar.f34274j + F10.f34297d) - ((g.d) gVar2.f34282r.get(0)).f34297d;
    }

    private long I(g gVar, g gVar2) {
        long j10;
        if (gVar2.f34280p) {
            return gVar2.f34272h;
        }
        g gVar3 = this.f34249m;
        if (gVar3 != null) {
            j10 = gVar3.f34272h;
        } else {
            j10 = 0;
        }
        if (gVar == null) {
            return j10;
        }
        int size = gVar.f34282r.size();
        g.d F10 = F(gVar, gVar2);
        if (F10 != null) {
            return gVar.f34272h + F10.f34298e;
        }
        if (((long) size) == gVar2.f34275k - gVar.f34275k) {
            return gVar.e();
        }
        return j10;
    }

    private Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f34249m;
        if (gVar == null || !gVar.f34286v.f34309e || (cVar = (g.c) gVar.f34284t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f34290b));
        int i10 = cVar.f34291c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    private boolean K(Uri uri) {
        List list = this.f34247k.f34312e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((h.b) list.get(i10)).f34325a)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public boolean L() {
        List list = this.f34247k.f34312e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0558c cVar = (C0558c) C3645a.e((C0558c) this.f34240d.get(((h.b) list.get(i10)).f34325a));
            if (elapsedRealtime > cVar.f34260h) {
                Uri e10 = cVar.f34253a;
                this.f34248l = e10;
                cVar.o(J(e10));
                return true;
            }
        }
        return false;
    }

    private void M(Uri uri) {
        if (!uri.equals(this.f34248l) && K(uri)) {
            g gVar = this.f34249m;
            if (gVar == null || !gVar.f34279o) {
                this.f34248l = uri;
                C0558c cVar = (C0558c) this.f34240d.get(uri);
                g g10 = cVar.f34256d;
                if (g10 == null || !g10.f34279o) {
                    cVar.o(J(uri));
                    return;
                }
                this.f34249m = g10;
                this.f34246j.l(g10);
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean N(Uri uri, A.c cVar, boolean z10) {
        Iterator it = this.f34241e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((l.b) it.next()).e(uri, cVar, z10);
        }
        return z11;
    }

    /* access modifiers changed from: private */
    public void R(Uri uri, g gVar) {
        if (uri.equals(this.f34248l)) {
            if (this.f34249m == null) {
                this.f34250n = !gVar.f34279o;
                this.f34251o = gVar.f34272h;
            }
            this.f34249m = gVar;
            this.f34246j.l(gVar);
        }
        Iterator it = this.f34241e.iterator();
        while (it.hasNext()) {
            ((l.b) it.next()).i();
        }
    }

    /* renamed from: O */
    public void t(D d10, long j10, long j11, boolean z10) {
        D d11 = d10;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        this.f34239c.b(d11.f44382a);
        this.f34243g.q(nVar, 4);
    }

    /* renamed from: P */
    public void p(D d10, long j10, long j11) {
        h hVar;
        D d11 = d10;
        i iVar = (i) d10.e();
        boolean z10 = iVar instanceof g;
        if (z10) {
            hVar = h.e(iVar.f34331a);
        } else {
            hVar = (h) iVar;
        }
        this.f34247k = hVar;
        this.f34248l = ((h.b) hVar.f34312e.get(0)).f34325a;
        this.f34241e.add(new b());
        E(hVar.f34311d);
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        C0558c cVar = (C0558c) this.f34240d.get(this.f34248l);
        if (z10) {
            cVar.w((g) iVar, nVar);
        } else {
            cVar.m();
        }
        this.f34239c.b(d11.f44382a);
        this.f34243g.t(nVar, 4);
    }

    /* renamed from: Q */
    public B.c u(D d10, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        D d11 = d10;
        IOException iOException2 = iOException;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        long c10 = this.f34239c.c(new A.c(nVar, new C3068q(d11.f44384c), iOException2, i10));
        if (c10 == -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34243g.x(nVar, d11.f44384c, iOException2, z10);
        if (z10) {
            this.f34239c.b(d11.f44382a);
        }
        if (z10) {
            return B.f44365g;
        }
        return B.h(false, c10);
    }

    public void a(Uri uri, A.a aVar, l.e eVar) {
        boolean z10;
        this.f34245i = M.w();
        this.f34243g = aVar;
        this.f34246j = eVar;
        D d10 = new D(this.f34237a.a(4), uri, 4, this.f34238b.a());
        if (this.f34244h == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        B b10 = new B("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f34244h = b10;
        aVar.z(new C3065n(d10.f44382a, d10.f44383b, b10.n(d10, this, this.f34239c.a(d10.f44384c))), d10.f44384c);
    }

    public void b(Uri uri) {
        ((C0558c) this.f34240d.get(uri)).q();
    }

    public void c(l.b bVar) {
        C3645a.e(bVar);
        this.f34241e.add(bVar);
    }

    public long d() {
        return this.f34251o;
    }

    public h e() {
        return this.f34247k;
    }

    public void f(Uri uri) {
        ((C0558c) this.f34240d.get(uri)).m();
    }

    public void g(l.b bVar) {
        this.f34241e.remove(bVar);
    }

    public boolean h(Uri uri) {
        return ((C0558c) this.f34240d.get(uri)).k();
    }

    public boolean i() {
        return this.f34250n;
    }

    public boolean j(Uri uri, long j10) {
        C0558c cVar = (C0558c) this.f34240d.get(uri);
        if (cVar != null) {
            return !cVar.h(j10);
        }
        return false;
    }

    public void k() {
        B b10 = this.f34244h;
        if (b10 != null) {
            b10.e();
        }
        Uri uri = this.f34248l;
        if (uri != null) {
            b(uri);
        }
    }

    public g l(Uri uri, boolean z10) {
        g j10 = ((C0558c) this.f34240d.get(uri)).j();
        if (j10 != null && z10) {
            M(uri);
        }
        return j10;
    }

    public void stop() {
        this.f34248l = null;
        this.f34249m = null;
        this.f34247k = null;
        this.f34251o = -9223372036854775807L;
        this.f34244h.l();
        this.f34244h = null;
        for (C0558c x10 : this.f34240d.values()) {
            x10.x();
        }
        this.f34245i.removeCallbacksAndMessages((Object) null);
        this.f34245i = null;
        this.f34240d.clear();
    }

    public c(S9.g gVar, ia.A a10, k kVar, double d10) {
        this.f34237a = gVar;
        this.f34238b = kVar;
        this.f34239c = a10;
        this.f34242f = d10;
        this.f34241e = new CopyOnWriteArrayList();
        this.f34240d = new HashMap();
        this.f34251o = -9223372036854775807L;
    }
}
