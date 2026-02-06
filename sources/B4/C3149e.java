package b4;

import Gh.C5407h;
import Gh.C5411l;
import Gh.M;
import Ug.G;
import b4.C3145a;
import b4.C3147c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b4.e  reason: case insensitive filesystem */
public final class C3149e implements C3145a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f36233e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f36234a;

    /* renamed from: b  reason: collision with root package name */
    private final M f36235b;

    /* renamed from: c  reason: collision with root package name */
    private final C5411l f36236c;

    /* renamed from: d  reason: collision with root package name */
    private final C3147c f36237d;

    /* renamed from: b4.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: b4.e$b */
    private static final class b implements C3145a.b {

        /* renamed from: a  reason: collision with root package name */
        private final C3147c.b f36238a;

        public b(C3147c.b bVar) {
            this.f36238a = bVar;
        }

        public void a() {
            this.f36238a.a();
        }

        /* renamed from: c */
        public c b() {
            C3147c.d c10 = this.f36238a.c();
            if (c10 != null) {
                return new c(c10);
            }
            return null;
        }

        public M getData() {
            return this.f36238a.f(1);
        }

        public M getMetadata() {
            return this.f36238a.f(0);
        }
    }

    /* renamed from: b4.e$c */
    private static final class c implements C3145a.c {

        /* renamed from: a  reason: collision with root package name */
        private final C3147c.d f36239a;

        public c(C3147c.d dVar) {
            this.f36239a = dVar;
        }

        /* renamed from: a */
        public b T0() {
            C3147c.b a10 = this.f36239a.a();
            if (a10 != null) {
                return new b(a10);
            }
            return null;
        }

        public void close() {
            this.f36239a.close();
        }

        public M getData() {
            return this.f36239a.b(1);
        }

        public M getMetadata() {
            return this.f36239a.b(0);
        }
    }

    public C3149e(long j10, M m10, C5411l lVar, G g10) {
        this.f36234a = j10;
        this.f36235b = m10;
        this.f36236c = lVar;
        this.f36237d = new C3147c(c(), d(), g10, e(), 1, 2);
    }

    private final String f(String str) {
        return C5407h.f63295d.d(str).N().r();
    }

    public C3145a.b a(String str) {
        C3147c.b f02 = this.f36237d.f0(f(str));
        if (f02 != null) {
            return new b(f02);
        }
        return null;
    }

    public C3145a.c b(String str) {
        C3147c.d g02 = this.f36237d.g0(f(str));
        if (g02 != null) {
            return new c(g02);
        }
        return null;
    }

    public C5411l c() {
        return this.f36236c;
    }

    public M d() {
        return this.f36235b;
    }

    public long e() {
        return this.f36234a;
    }
}
