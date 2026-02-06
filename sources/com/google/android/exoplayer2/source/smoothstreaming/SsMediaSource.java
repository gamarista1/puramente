package com.google.android.exoplayer2.source.smoothstreaming;

import N9.A;
import N9.C3052a;
import N9.C3059h;
import N9.C3060i;
import N9.C3065n;
import N9.C3068q;
import N9.C3070t;
import N9.P;
import N9.r;
import V9.a;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.smoothstreaming.a;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import ia.A;
import ia.B;
import ia.C;
import ia.C3604b;
import ia.C3612j;
import ia.D;
import ia.J;
import ia.w;
import ja.C3645a;
import ja.M;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import k9.C3711n0;
import k9.C3732y0;
import o9.C3925l;
import o9.v;
import o9.x;

public final class SsMediaSource extends C3052a implements B.b {

    /* renamed from: A  reason: collision with root package name */
    private Handler f42949A;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f42950h;

    /* renamed from: i  reason: collision with root package name */
    private final Uri f42951i;

    /* renamed from: j  reason: collision with root package name */
    private final C3732y0.h f42952j;

    /* renamed from: k  reason: collision with root package name */
    private final C3732y0 f42953k;

    /* renamed from: l  reason: collision with root package name */
    private final C3612j.a f42954l;

    /* renamed from: m  reason: collision with root package name */
    private final b.a f42955m;

    /* renamed from: n  reason: collision with root package name */
    private final C3059h f42956n;

    /* renamed from: o  reason: collision with root package name */
    private final v f42957o;

    /* renamed from: p  reason: collision with root package name */
    private final A f42958p;

    /* renamed from: q  reason: collision with root package name */
    private final long f42959q;

    /* renamed from: r  reason: collision with root package name */
    private final A.a f42960r;

    /* renamed from: s  reason: collision with root package name */
    private final D.a f42961s;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList f42962t;

    /* renamed from: u  reason: collision with root package name */
    private C3612j f42963u;

    /* renamed from: v  reason: collision with root package name */
    private B f42964v;

    /* renamed from: w  reason: collision with root package name */
    private C f42965w;

    /* renamed from: x  reason: collision with root package name */
    private J f42966x;

    /* renamed from: y  reason: collision with root package name */
    private long f42967y;

    /* renamed from: z  reason: collision with root package name */
    private V9.a f42968z;

    public static final class Factory implements C3070t.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f42969a;

        /* renamed from: b  reason: collision with root package name */
        private final C3612j.a f42970b;

        /* renamed from: c  reason: collision with root package name */
        private C3059h f42971c;

        /* renamed from: d  reason: collision with root package name */
        private x f42972d;

        /* renamed from: e  reason: collision with root package name */
        private ia.A f42973e;

        /* renamed from: f  reason: collision with root package name */
        private long f42974f;

        /* renamed from: g  reason: collision with root package name */
        private D.a f42975g;

        public Factory(C3612j.a aVar) {
            this(new a.C0661a(aVar), aVar);
        }

        public SsMediaSource a(C3732y0 y0Var) {
            M9.b bVar;
            C3645a.e(y0Var.f45856b);
            D.a aVar = this.f42975g;
            if (aVar == null) {
                aVar = new V9.b();
            }
            List list = y0Var.f45856b.f45922d;
            if (!list.isEmpty()) {
                bVar = new M9.b(aVar, list);
            } else {
                bVar = aVar;
            }
            return new SsMediaSource(y0Var, (V9.a) null, this.f42970b, bVar, this.f42969a, this.f42971c, this.f42972d.a(y0Var), this.f42973e, this.f42974f);
        }

        public Factory(b.a aVar, C3612j.a aVar2) {
            this.f42969a = (b.a) C3645a.e(aVar);
            this.f42970b = aVar2;
            this.f42972d = new C3925l();
            this.f42973e = new w();
            this.f42974f = 30000;
            this.f42971c = new C3060i();
        }
    }

    static {
        C3711n0.a("goog.exo.smoothstreaming");
    }

    private void J() {
        P p10;
        long j10;
        long j11;
        for (int i10 = 0; i10 < this.f42962t.size(); i10++) {
            ((c) this.f42962t.get(i10)).w(this.f42968z);
        }
        long j12 = Long.MIN_VALUE;
        long j13 = Long.MAX_VALUE;
        for (a.b bVar : this.f42968z.f34759f) {
            if (bVar.f34775k > 0) {
                j13 = Math.min(j13, bVar.e(0));
                j12 = Math.max(j12, bVar.e(bVar.f34775k - 1) + bVar.c(bVar.f34775k - 1));
            }
        }
        if (j13 == Long.MAX_VALUE) {
            if (this.f42968z.f34757d) {
                j11 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            V9.a aVar = this.f42968z;
            boolean z10 = aVar.f34757d;
            p10 = new P(j11, 0, 0, 0, true, z10, z10, aVar, this.f42953k);
        } else {
            V9.a aVar2 = this.f42968z;
            if (aVar2.f34757d) {
                long j14 = aVar2.f34761h;
                if (j14 != -9223372036854775807L && j14 > 0) {
                    j13 = Math.max(j13, j12 - j14);
                }
                long j15 = j13;
                long j16 = j12 - j15;
                long C02 = j16 - M.C0(this.f42959q);
                if (C02 < 5000000) {
                    C02 = Math.min(5000000, j16 / 2);
                }
                p10 = new P(-9223372036854775807L, j16, j15, C02, true, true, true, this.f42968z, this.f42953k);
            } else {
                long j17 = aVar2.f34760g;
                if (j17 != -9223372036854775807L) {
                    j10 = j17;
                } else {
                    j10 = j12 - j13;
                }
                p10 = new P(j13 + j10, j10, j13, 0, true, false, false, this.f42968z, this.f42953k);
            }
        }
        D(p10);
    }

    private void K() {
        if (this.f42968z.f34757d) {
            this.f42949A.postDelayed(new U9.a(this), Math.max(0, (this.f42967y + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* access modifiers changed from: private */
    public void L() {
        if (!this.f42964v.i()) {
            D d10 = new D(this.f42963u, this.f42951i, 4, this.f42961s);
            this.f42960r.z(new C3065n(d10.f44382a, d10.f44383b, this.f42964v.n(d10, this, this.f42958p.a(d10.f44384c))), d10.f44384c);
        }
    }

    /* access modifiers changed from: protected */
    public void C(J j10) {
        this.f42966x = j10;
        this.f42957o.j();
        this.f42957o.b(Looper.myLooper(), A());
        if (this.f42950h) {
            this.f42965w = new C.a();
            J();
            return;
        }
        this.f42963u = this.f42954l.a();
        B b10 = new B("SsMediaSource");
        this.f42964v = b10;
        this.f42965w = b10;
        this.f42949A = M.w();
        L();
    }

    /* access modifiers changed from: protected */
    public void E() {
        V9.a aVar;
        if (this.f42950h) {
            aVar = this.f42968z;
        } else {
            aVar = null;
        }
        this.f42968z = aVar;
        this.f42963u = null;
        this.f42967y = 0;
        B b10 = this.f42964v;
        if (b10 != null) {
            b10.l();
            this.f42964v = null;
        }
        Handler handler = this.f42949A;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.f42949A = null;
        }
        this.f42957o.release();
    }

    /* renamed from: G */
    public void t(D d10, long j10, long j11, boolean z10) {
        D d11 = d10;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        this.f42958p.b(d11.f44382a);
        this.f42960r.q(nVar, d11.f44384c);
    }

    /* renamed from: H */
    public void p(D d10, long j10, long j11) {
        D d11 = d10;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        this.f42958p.b(d11.f44382a);
        this.f42960r.t(nVar, d11.f44384c);
        this.f42968z = (V9.a) d10.e();
        this.f42967y = j10 - j11;
        J();
        K();
    }

    /* renamed from: I */
    public B.c u(D d10, long j10, long j11, IOException iOException, int i10) {
        B.c cVar;
        D d11 = d10;
        IOException iOException2 = iOException;
        C3065n nVar = new C3065n(d11.f44382a, d11.f44383b, d10.f(), d10.d(), j10, j11, d10.c());
        long c10 = this.f42958p.c(new A.c(nVar, new C3068q(d11.f44384c), iOException2, i10));
        if (c10 == -9223372036854775807L) {
            cVar = B.f44365g;
        } else {
            cVar = B.h(false, c10);
        }
        boolean c11 = cVar.c();
        this.f42960r.x(nVar, d11.f44384c, iOException2, !c11);
        if (!c11) {
            this.f42958p.b(d11.f44382a);
        }
        return cVar;
    }

    public C3732y0 a() {
        return this.f42953k;
    }

    public void c() {
        this.f42965w.e();
    }

    public void g(r rVar) {
        ((c) rVar).v();
        this.f42962t.remove(rVar);
    }

    public r i(C3070t.b bVar, C3604b bVar2, long j10) {
        A.a w10 = w(bVar);
        c cVar = new c(this.f42968z, this.f42955m, this.f42966x, this.f42956n, this.f42957o, s(bVar), this.f42958p, w10, this.f42965w, bVar2);
        this.f42962t.add(cVar);
        return cVar;
    }

    private SsMediaSource(C3732y0 y0Var, V9.a aVar, C3612j.a aVar2, D.a aVar3, b.a aVar4, C3059h hVar, v vVar, ia.A a10, long j10) {
        Uri uri;
        boolean z10 = true;
        C3645a.f(aVar == null || !aVar.f34757d);
        this.f42953k = y0Var;
        C3732y0.h hVar2 = (C3732y0.h) C3645a.e(y0Var.f45856b);
        this.f42952j = hVar2;
        this.f42968z = aVar;
        if (hVar2.f45919a.equals(Uri.EMPTY)) {
            uri = null;
        } else {
            uri = M.B(hVar2.f45919a);
        }
        this.f42951i = uri;
        this.f42954l = aVar2;
        this.f42961s = aVar3;
        this.f42955m = aVar4;
        this.f42956n = hVar;
        this.f42957o = vVar;
        this.f42958p = a10;
        this.f42959q = j10;
        this.f42960r = w((C3070t.b) null);
        this.f42950h = aVar == null ? false : z10;
        this.f42962t = new ArrayList();
    }
}
