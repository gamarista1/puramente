package ia;

import android.content.Context;
import android.net.Uri;
import ia.C3612j;
import ia.t;
import ja.C3645a;
import ja.M;
import ja.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class r implements C3612j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f44512a;

    /* renamed from: b  reason: collision with root package name */
    private final List f44513b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C3612j f44514c;

    /* renamed from: d  reason: collision with root package name */
    private C3612j f44515d;

    /* renamed from: e  reason: collision with root package name */
    private C3612j f44516e;

    /* renamed from: f  reason: collision with root package name */
    private C3612j f44517f;

    /* renamed from: g  reason: collision with root package name */
    private C3612j f44518g;

    /* renamed from: h  reason: collision with root package name */
    private C3612j f44519h;

    /* renamed from: i  reason: collision with root package name */
    private C3612j f44520i;

    /* renamed from: j  reason: collision with root package name */
    private C3612j f44521j;

    /* renamed from: k  reason: collision with root package name */
    private C3612j f44522k;

    public static final class a implements C3612j.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f44523a;

        /* renamed from: b  reason: collision with root package name */
        private final C3612j.a f44524b;

        /* renamed from: c  reason: collision with root package name */
        private J f44525c;

        public a(Context context) {
            this(context, new t.b());
        }

        /* renamed from: b */
        public r a() {
            r rVar = new r(this.f44523a, this.f44524b.a());
            J j10 = this.f44525c;
            if (j10 != null) {
                rVar.n(j10);
            }
            return rVar;
        }

        public a(Context context, C3612j.a aVar) {
            this.f44523a = context.getApplicationContext();
            this.f44524b = aVar;
        }
    }

    public r(Context context, C3612j jVar) {
        this.f44512a = context.getApplicationContext();
        this.f44514c = (C3612j) C3645a.e(jVar);
    }

    private void o(C3612j jVar) {
        for (int i10 = 0; i10 < this.f44513b.size(); i10++) {
            jVar.n((J) this.f44513b.get(i10));
        }
    }

    private C3612j p() {
        if (this.f44516e == null) {
            C3605c cVar = new C3605c(this.f44512a);
            this.f44516e = cVar;
            o(cVar);
        }
        return this.f44516e;
    }

    private C3612j q() {
        if (this.f44517f == null) {
            C3609g gVar = new C3609g(this.f44512a);
            this.f44517f = gVar;
            o(gVar);
        }
        return this.f44517f;
    }

    private C3612j r() {
        if (this.f44520i == null) {
            C3611i iVar = new C3611i();
            this.f44520i = iVar;
            o(iVar);
        }
        return this.f44520i;
    }

    private C3612j s() {
        if (this.f44515d == null) {
            x xVar = new x();
            this.f44515d = xVar;
            o(xVar);
        }
        return this.f44515d;
    }

    private C3612j t() {
        if (this.f44521j == null) {
            E e10 = new E(this.f44512a);
            this.f44521j = e10;
            o(e10);
        }
        return this.f44521j;
    }

    private C3612j u() {
        if (this.f44518g == null) {
            try {
                C3612j jVar = (C3612j) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                this.f44518g = jVar;
                o(jVar);
            } catch (ClassNotFoundException unused) {
                s.i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f44518g == null) {
                this.f44518g = this.f44514c;
            }
        }
        return this.f44518g;
    }

    private C3612j v() {
        if (this.f44519h == null) {
            K k10 = new K();
            this.f44519h = k10;
            o(k10);
        }
        return this.f44519h;
    }

    private void w(C3612j jVar, J j10) {
        if (jVar != null) {
            jVar.n(j10);
        }
    }

    public void close() {
        C3612j jVar = this.f44522k;
        if (jVar != null) {
            try {
                jVar.close();
            } finally {
                this.f44522k = null;
            }
        }
    }

    public Map d() {
        C3612j jVar = this.f44522k;
        if (jVar == null) {
            return Collections.emptyMap();
        }
        return jVar.d();
    }

    public Uri getUri() {
        C3612j jVar = this.f44522k;
        if (jVar == null) {
            return null;
        }
        return jVar.getUri();
    }

    public long m(n nVar) {
        boolean z10;
        if (this.f44522k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        String scheme = nVar.f44456a.getScheme();
        if (M.x0(nVar.f44456a)) {
            String path = nVar.f44456a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f44522k = s();
            } else {
                this.f44522k = p();
            }
        } else if ("asset".equals(scheme)) {
            this.f44522k = p();
        } else if ("content".equals(scheme)) {
            this.f44522k = q();
        } else if ("rtmp".equals(scheme)) {
            this.f44522k = u();
        } else if ("udp".equals(scheme)) {
            this.f44522k = v();
        } else if ("data".equals(scheme)) {
            this.f44522k = r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f44522k = t();
        } else {
            this.f44522k = this.f44514c;
        }
        return this.f44522k.m(nVar);
    }

    public void n(J j10) {
        C3645a.e(j10);
        this.f44514c.n(j10);
        this.f44513b.add(j10);
        w(this.f44515d, j10);
        w(this.f44516e, j10);
        w(this.f44517f, j10);
        w(this.f44518g, j10);
        w(this.f44519h, j10);
        w(this.f44520i, j10);
        w(this.f44521j, j10);
    }

    public int read(byte[] bArr, int i10, int i11) {
        return ((C3612j) C3645a.e(this.f44522k)).read(bArr, i10, i11);
    }
}
