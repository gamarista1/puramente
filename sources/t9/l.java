package T9;

import N9.A;
import S9.g;
import android.net.Uri;
import ia.A;
import java.io.IOException;

public interface l {

    public interface a {
        l a(g gVar, A a10, k kVar);
    }

    public interface b {
        boolean e(Uri uri, A.c cVar, boolean z10);

        void i();
    }

    public static final class c extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f34391a;

        public c(Uri uri) {
            this.f34391a = uri;
        }
    }

    public static final class d extends IOException {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f34392a;

        public d(Uri uri) {
            this.f34392a = uri;
        }
    }

    public interface e {
        void l(g gVar);
    }

    void a(Uri uri, A.a aVar, e eVar);

    void b(Uri uri);

    void c(b bVar);

    long d();

    h e();

    void f(Uri uri);

    void g(b bVar);

    boolean h(Uri uri);

    boolean i();

    boolean j(Uri uri, long j10);

    void k();

    g l(Uri uri, boolean z10);

    void stop();
}
