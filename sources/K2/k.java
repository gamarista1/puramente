package k2;

import android.content.Context;
import android.net.Uri;
import i2.C2076a;
import i2.L;
import i2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k2.f;
import k2.l;

public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23215a;

    /* renamed from: b  reason: collision with root package name */
    private final List f23216b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final f f23217c;

    /* renamed from: d  reason: collision with root package name */
    private f f23218d;

    /* renamed from: e  reason: collision with root package name */
    private f f23219e;

    /* renamed from: f  reason: collision with root package name */
    private f f23220f;

    /* renamed from: g  reason: collision with root package name */
    private f f23221g;

    /* renamed from: h  reason: collision with root package name */
    private f f23222h;

    /* renamed from: i  reason: collision with root package name */
    private f f23223i;

    /* renamed from: j  reason: collision with root package name */
    private f f23224j;

    /* renamed from: k  reason: collision with root package name */
    private f f23225k;

    public static final class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f23226a;

        /* renamed from: b  reason: collision with root package name */
        private final f.a f23227b;

        /* renamed from: c  reason: collision with root package name */
        private x f23228c;

        public a(Context context) {
            this(context, new l.b());
        }

        /* renamed from: b */
        public k a() {
            k kVar = new k(this.f23226a, this.f23227b.a());
            x xVar = this.f23228c;
            if (xVar != null) {
                kVar.n(xVar);
            }
            return kVar;
        }

        public a(Context context, f.a aVar) {
            this.f23226a = context.getApplicationContext();
            this.f23227b = aVar;
        }
    }

    public k(Context context, f fVar) {
        this.f23215a = context.getApplicationContext();
        this.f23217c = (f) C2076a.e(fVar);
    }

    private void o(f fVar) {
        for (int i10 = 0; i10 < this.f23216b.size(); i10++) {
            fVar.n((x) this.f23216b.get(i10));
        }
    }

    private f p() {
        if (this.f23219e == null) {
            C2146a aVar = new C2146a(this.f23215a);
            this.f23219e = aVar;
            o(aVar);
        }
        return this.f23219e;
    }

    private f q() {
        if (this.f23220f == null) {
            d dVar = new d(this.f23215a);
            this.f23220f = dVar;
            o(dVar);
        }
        return this.f23220f;
    }

    private f r() {
        if (this.f23223i == null) {
            e eVar = new e();
            this.f23223i = eVar;
            o(eVar);
        }
        return this.f23223i;
    }

    private f s() {
        if (this.f23218d == null) {
            o oVar = new o();
            this.f23218d = oVar;
            o(oVar);
        }
        return this.f23218d;
    }

    private f t() {
        if (this.f23224j == null) {
            v vVar = new v(this.f23215a);
            this.f23224j = vVar;
            o(vVar);
        }
        return this.f23224j;
    }

    private f u() {
        if (this.f23221g == null) {
            try {
                f fVar = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                this.f23221g = fVar;
                o(fVar);
            } catch (ClassNotFoundException unused) {
                p.h("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f23221g == null) {
                this.f23221g = this.f23217c;
            }
        }
        return this.f23221g;
    }

    private f v() {
        if (this.f23222h == null) {
            y yVar = new y();
            this.f23222h = yVar;
            o(yVar);
        }
        return this.f23222h;
    }

    private void w(f fVar, x xVar) {
        if (fVar != null) {
            fVar.n(xVar);
        }
    }

    public void close() {
        f fVar = this.f23225k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.f23225k = null;
            }
        }
    }

    public Map d() {
        f fVar = this.f23225k;
        if (fVar == null) {
            return Collections.emptyMap();
        }
        return fVar.d();
    }

    public Uri getUri() {
        f fVar = this.f23225k;
        if (fVar == null) {
            return null;
        }
        return fVar.getUri();
    }

    public long m(j jVar) {
        boolean z10;
        if (this.f23225k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        String scheme = jVar.f23194a.getScheme();
        if (L.F0(jVar.f23194a)) {
            String path = jVar.f23194a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                this.f23225k = s();
            } else {
                this.f23225k = p();
            }
        } else if ("asset".equals(scheme)) {
            this.f23225k = p();
        } else if ("content".equals(scheme)) {
            this.f23225k = q();
        } else if ("rtmp".equals(scheme)) {
            this.f23225k = u();
        } else if ("udp".equals(scheme)) {
            this.f23225k = v();
        } else if ("data".equals(scheme)) {
            this.f23225k = r();
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            this.f23225k = t();
        } else {
            this.f23225k = this.f23217c;
        }
        return this.f23225k.m(jVar);
    }

    public void n(x xVar) {
        C2076a.e(xVar);
        this.f23217c.n(xVar);
        this.f23216b.add(xVar);
        w(this.f23218d, xVar);
        w(this.f23219e, xVar);
        w(this.f23220f, xVar);
        w(this.f23221g, xVar);
        w(this.f23222h, xVar);
        w(this.f23223i, xVar);
        w(this.f23224j, xVar);
    }

    public int read(byte[] bArr, int i10, int i11) {
        return ((f) C2076a.e(this.f23225k)).read(bArr, i10, i11);
    }
}
