package com.google.android.exoplayer2.source.hls;

import N9.A;
import N9.C3052a;
import N9.C3059h;
import N9.C3060i;
import N9.C3070t;
import N9.P;
import N9.r;
import S9.c;
import S9.g;
import S9.h;
import T9.e;
import T9.g;
import T9.k;
import T9.l;
import android.os.Looper;
import ia.A;
import ia.C3604b;
import ia.C3612j;
import ia.J;
import ia.w;
import ja.C3645a;
import ja.M;
import java.util.List;
import k9.C3711n0;
import k9.C3732y0;
import o9.C3925l;
import o9.v;
import o9.x;

public final class HlsMediaSource extends C3052a implements l.e {

    /* renamed from: h  reason: collision with root package name */
    private final h f42918h;

    /* renamed from: i  reason: collision with root package name */
    private final C3732y0.h f42919i;

    /* renamed from: j  reason: collision with root package name */
    private final g f42920j;

    /* renamed from: k  reason: collision with root package name */
    private final C3059h f42921k;

    /* renamed from: l  reason: collision with root package name */
    private final v f42922l;

    /* renamed from: m  reason: collision with root package name */
    private final A f42923m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f42924n;

    /* renamed from: o  reason: collision with root package name */
    private final int f42925o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f42926p;

    /* renamed from: q  reason: collision with root package name */
    private final l f42927q;

    /* renamed from: r  reason: collision with root package name */
    private final long f42928r;

    /* renamed from: s  reason: collision with root package name */
    private final C3732y0 f42929s;

    /* renamed from: t  reason: collision with root package name */
    private C3732y0.g f42930t;

    /* renamed from: u  reason: collision with root package name */
    private J f42931u;

    public static final class Factory implements C3070t.a {

        /* renamed from: a  reason: collision with root package name */
        private final g f42932a;

        /* renamed from: b  reason: collision with root package name */
        private h f42933b;

        /* renamed from: c  reason: collision with root package name */
        private k f42934c;

        /* renamed from: d  reason: collision with root package name */
        private l.a f42935d;

        /* renamed from: e  reason: collision with root package name */
        private C3059h f42936e;

        /* renamed from: f  reason: collision with root package name */
        private x f42937f;

        /* renamed from: g  reason: collision with root package name */
        private A f42938g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f42939h;

        /* renamed from: i  reason: collision with root package name */
        private int f42940i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f42941j;

        /* renamed from: k  reason: collision with root package name */
        private long f42942k;

        public Factory(C3612j.a aVar) {
            this((g) new c(aVar));
        }

        public HlsMediaSource a(C3732y0 y0Var) {
            C3732y0 y0Var2 = y0Var;
            C3645a.e(y0Var2.f45856b);
            k kVar = this.f42934c;
            List list = y0Var2.f45856b.f45922d;
            if (!list.isEmpty()) {
                kVar = new e(kVar, list);
            }
            g gVar = this.f42932a;
            h hVar = this.f42933b;
            C3059h hVar2 = this.f42936e;
            v a10 = this.f42937f.a(y0Var2);
            A a11 = this.f42938g;
            return new HlsMediaSource(y0Var, gVar, hVar, hVar2, a10, a11, this.f42935d.a(this.f42932a, a11, kVar), this.f42942k, this.f42939h, this.f42940i, this.f42941j);
        }

        public Factory(g gVar) {
            this.f42932a = (g) C3645a.e(gVar);
            this.f42937f = new C3925l();
            this.f42934c = new T9.a();
            this.f42935d = T9.c.f34236p;
            this.f42933b = h.f34004a;
            this.f42938g = new w();
            this.f42936e = new C3060i();
            this.f42940i = 1;
            this.f42942k = -9223372036854775807L;
            this.f42939h = true;
        }
    }

    static {
        C3711n0.a("goog.exo.hls");
    }

    private P F(T9.g gVar, long j10, long j11, a aVar) {
        long j12;
        long L10;
        boolean z10;
        T9.g gVar2 = gVar;
        long d10 = gVar2.f34272h - this.f42927q.d();
        if (gVar2.f34279o) {
            j12 = d10 + gVar2.f34285u;
        } else {
            j12 = -9223372036854775807L;
        }
        long J10 = J(gVar);
        long j13 = this.f42930t.f45909a;
        if (j13 != -9223372036854775807L) {
            L10 = M.C0(j13);
        } else {
            L10 = L(gVar2, J10);
        }
        M(gVar2, M.r(L10, J10, gVar2.f34285u + J10));
        long K10 = K(gVar2, J10);
        if (gVar2.f34268d != 2 || !gVar2.f34270f) {
            z10 = false;
        } else {
            z10 = true;
        }
        return new P(j10, j11, -9223372036854775807L, j12, gVar2.f34285u, d10, K10, true, !gVar2.f34279o, z10, aVar, this.f42929s, this.f42930t);
    }

    private P G(T9.g gVar, long j10, long j11, a aVar) {
        long j12;
        T9.g gVar2 = gVar;
        if (gVar2.f34269e == -9223372036854775807L || gVar2.f34282r.isEmpty()) {
            j12 = 0;
        } else {
            if (!gVar2.f34271g) {
                long j13 = gVar2.f34269e;
                if (j13 != gVar2.f34285u) {
                    j12 = I(gVar2.f34282r, j13).f34298e;
                }
            }
            j12 = gVar2.f34269e;
        }
        long j14 = j12;
        long j15 = gVar2.f34285u;
        return new P(j10, j11, -9223372036854775807L, j15, j15, 0, j14, true, false, true, aVar, this.f42929s, (C3732y0.g) null);
    }

    private static g.b H(List list, long j10) {
        g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            g.b bVar2 = (g.b) list.get(i10);
            long j11 = bVar2.f34298e;
            if (j11 <= j10 && bVar2.f34287l) {
                bVar = bVar2;
            } else if (j11 > j10) {
                break;
            }
        }
        return bVar;
    }

    private static g.d I(List list, long j10) {
        return (g.d) list.get(M.g(list, Long.valueOf(j10), true, true));
    }

    private long J(T9.g gVar) {
        if (gVar.f34280p) {
            return M.C0(M.b0(this.f42928r)) - gVar.e();
        }
        return 0;
    }

    private long K(T9.g gVar, long j10) {
        long j11 = gVar.f34269e;
        if (j11 == -9223372036854775807L) {
            j11 = (gVar.f34285u + j10) - M.C0(this.f42930t.f45909a);
        }
        if (gVar.f34271g) {
            return j11;
        }
        g.b H10 = H(gVar.f34283s, j11);
        if (H10 != null) {
            return H10.f34298e;
        }
        if (gVar.f34282r.isEmpty()) {
            return 0;
        }
        g.d I10 = I(gVar.f34282r, j11);
        g.b H11 = H(I10.f34293m, j11);
        if (H11 != null) {
            return H11.f34298e;
        }
        return I10.f34298e;
    }

    private static long L(T9.g gVar, long j10) {
        long j11;
        g.f fVar = gVar.f34286v;
        long j12 = gVar.f34269e;
        if (j12 != -9223372036854775807L) {
            j11 = gVar.f34285u - j12;
        } else {
            long j13 = fVar.f34308d;
            if (j13 == -9223372036854775807L || gVar.f34278n == -9223372036854775807L) {
                long j14 = fVar.f34307c;
                if (j14 != -9223372036854775807L) {
                    j11 = j14;
                } else {
                    j11 = gVar.f34277m * 3;
                }
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M(T9.g r5, long r6) {
        /*
            r4 = this;
            k9.y0 r0 = r4.f42929s
            k9.y0$g r0 = r0.f45858d
            float r1 = r0.f45912d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0028
            float r0 = r0.f45913e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            T9.g$f r5 = r5.f34286v
            long r0 = r5.f34307c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0028
            long r0 = r5.f34308d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0028
            r5 = 1
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            k9.y0$g$a r0 = new k9.y0$g$a
            r0.<init>()
            long r6 = ja.M.Z0(r6)
            k9.y0$g$a r6 = r0.k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L_0x003c
            r0 = r7
            goto L_0x0040
        L_0x003c:
            k9.y0$g r0 = r4.f42930t
            float r0 = r0.f45912d
        L_0x0040:
            k9.y0$g$a r6 = r6.j(r0)
            if (r5 == 0) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            k9.y0$g r5 = r4.f42930t
            float r7 = r5.f45913e
        L_0x004b:
            k9.y0$g$a r5 = r6.h(r7)
            k9.y0$g r5 = r5.f()
            r4.f42930t = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.M(T9.g, long):void");
    }

    /* access modifiers changed from: protected */
    public void C(J j10) {
        this.f42931u = j10;
        this.f42922l.j();
        this.f42922l.b((Looper) C3645a.e(Looper.myLooper()), A());
        this.f42927q.a(this.f42919i.f45919a, w((C3070t.b) null), this);
    }

    /* access modifiers changed from: protected */
    public void E() {
        this.f42927q.stop();
        this.f42922l.release();
    }

    public C3732y0 a() {
        return this.f42929s;
    }

    public void c() {
        this.f42927q.k();
    }

    public void g(r rVar) {
        ((S9.k) rVar).B();
    }

    public r i(C3070t.b bVar, C3604b bVar2, long j10) {
        A.a w10 = w(bVar);
        return new S9.k(this.f42918h, this.f42927q, this.f42920j, this.f42931u, this.f42922l, s(bVar), this.f42923m, w10, bVar2, this.f42921k, this.f42924n, this.f42925o, this.f42926p, A());
    }

    public void l(T9.g gVar) {
        long j10;
        long j11;
        P p10;
        if (gVar.f34280p) {
            j10 = M.Z0(gVar.f34272h);
        } else {
            j10 = -9223372036854775807L;
        }
        int i10 = gVar.f34268d;
        if (i10 == 2 || i10 == 1) {
            j11 = j10;
        } else {
            j11 = -9223372036854775807L;
        }
        a aVar = new a((T9.h) C3645a.e(this.f42927q.e()), gVar);
        if (this.f42927q.i()) {
            p10 = F(gVar, j11, j10, aVar);
        } else {
            p10 = G(gVar, j11, j10, aVar);
        }
        D(p10);
    }

    private HlsMediaSource(C3732y0 y0Var, S9.g gVar, h hVar, C3059h hVar2, v vVar, ia.A a10, l lVar, long j10, boolean z10, int i10, boolean z11) {
        this.f42919i = (C3732y0.h) C3645a.e(y0Var.f45856b);
        this.f42929s = y0Var;
        this.f42930t = y0Var.f45858d;
        this.f42920j = gVar;
        this.f42918h = hVar;
        this.f42921k = hVar2;
        this.f42922l = vVar;
        this.f42923m = a10;
        this.f42927q = lVar;
        this.f42928r = j10;
        this.f42924n = z10;
        this.f42925o = i10;
        this.f42926p = z11;
    }
}
