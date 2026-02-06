package ia;

import N9.C3065n;
import android.net.Uri;
import ia.B;
import ia.n;
import ja.C3645a;
import ja.M;
import java.io.InputStream;
import java.util.Map;

public final class D implements B.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f44382a;

    /* renamed from: b  reason: collision with root package name */
    public final n f44383b;

    /* renamed from: c  reason: collision with root package name */
    public final int f44384c;

    /* renamed from: d  reason: collision with root package name */
    private final I f44385d;

    /* renamed from: e  reason: collision with root package name */
    private final a f44386e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f44387f;

    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public D(C3612j jVar, Uri uri, int i10, a aVar) {
        this(jVar, new n.b().i(uri).b(1).a(), i10, aVar);
    }

    public final void a() {
        this.f44385d.r();
        l lVar = new l(this.f44385d, this.f44383b);
        try {
            lVar.b();
            this.f44387f = this.f44386e.a((Uri) C3645a.e(this.f44385d.getUri()), lVar);
        } finally {
            M.n(lVar);
        }
    }

    public long c() {
        return this.f44385d.o();
    }

    public Map d() {
        return this.f44385d.q();
    }

    public final Object e() {
        return this.f44387f;
    }

    public Uri f() {
        return this.f44385d.p();
    }

    public D(C3612j jVar, n nVar, int i10, a aVar) {
        this.f44385d = new I(jVar);
        this.f44383b = nVar;
        this.f44384c = i10;
        this.f44386e = aVar;
        this.f44382a = C3065n.a();
    }

    public final void b() {
    }
}
