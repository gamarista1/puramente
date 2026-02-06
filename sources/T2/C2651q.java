package t2;

import W2.h;
import W2.o;
import W2.s;
import android.content.Context;
import android.support.v4.media.session.c;
import com.google.android.gms.common.api.a;
import com.google.common.collect.C4770v;
import f2.s;
import f2.w;
import i2.C2076a;
import i2.L;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k2.f;
import k2.k;
import p2.w;
import t2.C2615C;
import t2.C2632U;
import t2.C2655u;
import t2.e0;
import w2.C2827i;
import z2.C2968l;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.O;
import z2.r;
import z2.u;

/* renamed from: t2.q  reason: case insensitive filesystem */
public final class C2651q implements C2622J {

    /* renamed from: c  reason: collision with root package name */
    private final a f26289c;

    /* renamed from: d  reason: collision with root package name */
    private f.a f26290d;

    /* renamed from: e  reason: collision with root package name */
    private s.a f26291e;

    /* renamed from: f  reason: collision with root package name */
    private C2615C.a f26292f;

    /* renamed from: g  reason: collision with root package name */
    private C2827i f26293g;

    /* renamed from: h  reason: collision with root package name */
    private long f26294h;

    /* renamed from: i  reason: collision with root package name */
    private long f26295i;

    /* renamed from: j  reason: collision with root package name */
    private long f26296j;

    /* renamed from: k  reason: collision with root package name */
    private float f26297k;

    /* renamed from: l  reason: collision with root package name */
    private float f26298l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f26299m;

    /* renamed from: t2.q$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final u f26300a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f26301b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Map f26302c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private f.a f26303d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f26304e = true;

        /* renamed from: f  reason: collision with root package name */
        private s.a f26305f;

        /* renamed from: g  reason: collision with root package name */
        private w f26306g;

        /* renamed from: h  reason: collision with root package name */
        private C2827i f26307h;

        public a(u uVar, s.a aVar) {
            this.f26300a = uVar;
            this.f26305f = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C2615C.a k(f.a aVar) {
            return new C2632U.b(aVar, this.f26300a);
        }

        private nb.u l(int i10) {
            nb.u uVar;
            nb.u lVar;
            nb.u uVar2 = (nb.u) this.f26301b.get(Integer.valueOf(i10));
            if (uVar2 != null) {
                return uVar2;
            }
            f.a aVar = (f.a) C2076a.e(this.f26303d);
            Class<C2615C.a> cls = C2615C.a.class;
            if (i10 == 0) {
                lVar = new C2646l(Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(cls), aVar);
            } else if (i10 == 1) {
                lVar = new C2647m(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls), aVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    uVar = new C2649o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls));
                } else if (i10 == 4) {
                    uVar = new C2650p(this, aVar);
                } else {
                    throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                }
                this.f26301b.put(Integer.valueOf(i10), uVar);
                return uVar;
            } else {
                lVar = new C2648n(Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(cls), aVar);
            }
            uVar = lVar;
            this.f26301b.put(Integer.valueOf(i10), uVar);
            return uVar;
        }

        public C2615C.a f(int i10) {
            C2615C.a aVar = (C2615C.a) this.f26302c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            C2615C.a aVar2 = (C2615C.a) l(i10).get();
            w wVar = this.f26306g;
            if (wVar != null) {
                aVar2.e(wVar);
            }
            C2827i iVar = this.f26307h;
            if (iVar != null) {
                aVar2.f(iVar);
            }
            aVar2.c(this.f26305f);
            aVar2.g(this.f26304e);
            this.f26302c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void m(f.a aVar) {
            if (aVar != this.f26303d) {
                this.f26303d = aVar;
                this.f26301b.clear();
                this.f26302c.clear();
            }
        }

        public void n(w wVar) {
            this.f26306g = wVar;
            for (C2615C.a e10 : this.f26302c.values()) {
                e10.e(wVar);
            }
        }

        public void o(int i10) {
            u uVar = this.f26300a;
            if (uVar instanceof C2968l) {
                ((C2968l) uVar).m(i10);
            }
        }

        public void p(C2827i iVar) {
            this.f26307h = iVar;
            for (C2615C.a f10 : this.f26302c.values()) {
                f10.f(iVar);
            }
        }

        public void q(boolean z10) {
            this.f26304e = z10;
            this.f26300a.e(z10);
            for (C2615C.a g10 : this.f26302c.values()) {
                g10.g(z10);
            }
        }

        public void r(s.a aVar) {
            this.f26305f = aVar;
            this.f26300a.c(aVar);
            for (C2615C.a c10 : this.f26302c.values()) {
                c10.c(aVar);
            }
        }
    }

    public C2651q(Context context, u uVar) {
        this((f.a) new k.a(context), uVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C2972p[] j(f2.s sVar) {
        C2972p pVar;
        if (this.f26291e.a(sVar)) {
            pVar = new o(this.f26291e.b(sVar), sVar);
        } else {
            pVar = new b(sVar);
        }
        return new C2972p[]{pVar};
    }

    private static C2615C k(f2.w wVar, C2615C c10) {
        w.d dVar = wVar.f20161f;
        if (dVar.f20186b == 0 && dVar.f20188d == Long.MIN_VALUE && !dVar.f20190f) {
            return c10;
        }
        w.d dVar2 = wVar.f20161f;
        return new C2639e(c10, dVar2.f20186b, dVar2.f20188d, !dVar2.f20191g, dVar2.f20189e, dVar2.f20190f);
    }

    private C2615C l(f2.w wVar, C2615C c10) {
        C2076a.e(wVar.f20157b);
        wVar.f20157b.getClass();
        return c10;
    }

    /* access modifiers changed from: private */
    public static C2615C.a m(Class cls) {
        try {
            return (C2615C.a) cls.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static C2615C.a n(Class cls, f.a aVar) {
        try {
            return (C2615C.a) cls.getConstructor(new Class[]{f.a.class}).newInstance(new Object[]{aVar});
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public C2615C d(f2.w wVar) {
        C2076a.e(wVar.f20157b);
        String scheme = wVar.f20157b.f20249a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((C2615C.a) C2076a.e(this.f26292f)).d(wVar);
        }
        if (Objects.equals(wVar.f20157b.f20250b, "application/x-image-uri")) {
            long L02 = L.L0(wVar.f20157b.f20257i);
            c.a(C2076a.e((Object) null));
            return new C2655u.b(L02, (C2653s) null).d(wVar);
        }
        w.h hVar = wVar.f20157b;
        int w02 = L.w0(hVar.f20249a, hVar.f20250b);
        if (wVar.f20157b.f20257i != -9223372036854775807L) {
            this.f26289c.o(1);
        }
        try {
            C2615C.a f10 = this.f26289c.f(w02);
            w.g.a a10 = wVar.f20159d.a();
            if (wVar.f20159d.f20231a == -9223372036854775807L) {
                a10.k(this.f26294h);
            }
            if (wVar.f20159d.f20234d == -3.4028235E38f) {
                a10.j(this.f26297k);
            }
            if (wVar.f20159d.f20235e == -3.4028235E38f) {
                a10.h(this.f26298l);
            }
            if (wVar.f20159d.f20232b == -9223372036854775807L) {
                a10.i(this.f26295i);
            }
            if (wVar.f20159d.f20233c == -9223372036854775807L) {
                a10.g(this.f26296j);
            }
            w.g f11 = a10.f();
            if (!f11.equals(wVar.f20159d)) {
                wVar = wVar.a().b(f11).a();
            }
            C2615C d10 = f10.d(wVar);
            C4770v vVar = ((w.h) L.h(wVar.f20157b)).f20254f;
            if (!vVar.isEmpty()) {
                C2615C[] cArr = new C2615C[(vVar.size() + 1)];
                cArr[0] = d10;
                for (int i10 = 0; i10 < vVar.size(); i10++) {
                    if (this.f26299m) {
                        C2632U.b bVar = new C2632U.b(this.f26290d, (u) new C2645k(this, new s.b().o0(((w.k) vVar.get(i10)).f20276b).e0(((w.k) vVar.get(i10)).f20277c).q0(((w.k) vVar.get(i10)).f20278d).m0(((w.k) vVar.get(i10)).f20279e).c0(((w.k) vVar.get(i10)).f20280f).a0(((w.k) vVar.get(i10)).f20281g).K()));
                        C2827i iVar = this.f26293g;
                        if (iVar != null) {
                            bVar.f(iVar);
                        }
                        cArr[i10 + 1] = bVar.d(f2.w.c(((w.k) vVar.get(i10)).f20275a.toString()));
                    } else {
                        e0.b bVar2 = new e0.b(this.f26290d);
                        C2827i iVar2 = this.f26293g;
                        if (iVar2 != null) {
                            bVar2.b(iVar2);
                        }
                        cArr[i10 + 1] = bVar2.a((w.k) vVar.get(i10), -9223372036854775807L);
                    }
                }
                d10 = new C2625M(cArr);
            }
            return l(wVar, k(wVar, d10));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: i */
    public C2651q g(boolean z10) {
        this.f26299m = z10;
        this.f26289c.q(z10);
        return this;
    }

    /* renamed from: o */
    public C2651q e(p2.w wVar) {
        this.f26289c.n((p2.w) C2076a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    /* renamed from: p */
    public C2651q f(C2827i iVar) {
        this.f26293g = (C2827i) C2076a.f(iVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f26289c.p(iVar);
        return this;
    }

    /* renamed from: q */
    public C2651q c(s.a aVar) {
        this.f26291e = (s.a) C2076a.e(aVar);
        this.f26289c.r(aVar);
        return this;
    }

    public C2651q(f.a aVar, u uVar) {
        this.f26290d = aVar;
        h hVar = new h();
        this.f26291e = hVar;
        a aVar2 = new a(uVar, hVar);
        this.f26289c = aVar2;
        aVar2.m(aVar);
        this.f26294h = -9223372036854775807L;
        this.f26295i = -9223372036854775807L;
        this.f26296j = -9223372036854775807L;
        this.f26297k = -3.4028235E38f;
        this.f26298l = -3.4028235E38f;
        this.f26299m = true;
    }

    /* renamed from: t2.q$b */
    private static final class b implements C2972p {

        /* renamed from: a  reason: collision with root package name */
        private final f2.s f26308a;

        public b(f2.s sVar) {
            this.f26308a = sVar;
        }

        public void f(r rVar) {
            O d10 = rVar.d(0, 3);
            rVar.u(new J.b(-9223372036854775807L));
            rVar.k();
            d10.c(this.f26308a.a().o0("text/x-unknown").O(this.f26308a.f20083n).K());
        }

        public int i(C2973q qVar, I i10) {
            if (qVar.b(a.e.API_PRIORITY_OTHER) == -1) {
                return -1;
            }
            return 0;
        }

        public boolean j(C2973q qVar) {
            return true;
        }

        public void release() {
        }

        public void a(long j10, long j11) {
        }
    }
}
