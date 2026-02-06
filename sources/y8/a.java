package Y8;

import ac.C4458a;
import ac.C4459b;
import b9.C3160a;
import b9.C3161b;
import b9.C3162c;
import b9.C3163d;
import b9.C3164e;
import cc.C4477a;

public final class a implements C4458a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4458a f35696a = new a();

    /* renamed from: Y8.a$a  reason: collision with other inner class name */
    private static final class C0580a implements Zb.d {

        /* renamed from: a  reason: collision with root package name */
        static final C0580a f35697a = new C0580a();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f35698b = Zb.c.a("window").b(C4477a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final Zb.c f35699c = Zb.c.a("logSourceMetrics").b(C4477a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final Zb.c f35700d = Zb.c.a("globalMetrics").b(C4477a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final Zb.c f35701e = Zb.c.a("appNamespace").b(C4477a.b().c(4).a()).a();

        private C0580a() {
        }

        /* renamed from: b */
        public void a(C3160a aVar, Zb.e eVar) {
            eVar.f(f35698b, aVar.d());
            eVar.f(f35699c, aVar.c());
            eVar.f(f35700d, aVar.b());
            eVar.f(f35701e, aVar.a());
        }
    }

    private static final class b implements Zb.d {

        /* renamed from: a  reason: collision with root package name */
        static final b f35702a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f35703b = Zb.c.a("storageMetrics").b(C4477a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(C3161b bVar, Zb.e eVar) {
            eVar.f(f35703b, bVar.a());
        }
    }

    private static final class c implements Zb.d {

        /* renamed from: a  reason: collision with root package name */
        static final c f35704a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f35705b = Zb.c.a("eventsDroppedCount").b(C4477a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final Zb.c f35706c = Zb.c.a("reason").b(C4477a.b().c(3).a()).a();

        private c() {
        }

        /* renamed from: b */
        public void a(C3162c cVar, Zb.e eVar) {
            eVar.c(f35705b, cVar.a());
            eVar.f(f35706c, cVar.b());
        }
    }

    private static final class d implements Zb.d {

        /* renamed from: a  reason: collision with root package name */
        static final d f35707a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f35708b = Zb.c.a("logSource").b(C4477a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final Zb.c f35709c = Zb.c.a("logEventDropped").b(C4477a.b().c(2).a()).a();

        private d() {
        }

        /* renamed from: b */
        public void a(C3163d dVar, Zb.e eVar) {
            eVar.f(f35708b, dVar.b());
            eVar.f(f35709c, dVar.a());
        }
    }

    private static final class e implements Zb.d {

        /* renamed from: a  reason: collision with root package name */
        static final e f35710a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f35711b = Zb.c.d("clientMetrics");

        private e() {
        }

        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.c.a(obj);
            b((l) null, (Zb.e) obj2);
        }

        public void b(l lVar, Zb.e eVar) {
            throw null;
        }
    }

    private static final class f implements Zb.d {

        /* renamed from: a  reason: collision with root package name */
        static final f f35712a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f35713b = Zb.c.a("currentCacheSizeBytes").b(C4477a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final Zb.c f35714c = Zb.c.a("maxCacheSizeBytes").b(C4477a.b().c(2).a()).a();

        private f() {
        }

        /* renamed from: b */
        public void a(C3164e eVar, Zb.e eVar2) {
            eVar2.c(f35713b, eVar.a());
            eVar2.c(f35714c, eVar.b());
        }
    }

    private static final class g implements Zb.d {

        /* renamed from: a  reason: collision with root package name */
        static final g f35715a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final Zb.c f35716b = Zb.c.a("startMs").b(C4477a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final Zb.c f35717c = Zb.c.a("endMs").b(C4477a.b().c(2).a()).a();

        private g() {
        }

        /* renamed from: b */
        public void a(b9.f fVar, Zb.e eVar) {
            eVar.c(f35716b, fVar.b());
            eVar.c(f35717c, fVar.a());
        }
    }

    private a() {
    }

    public void a(C4459b bVar) {
        bVar.a(l.class, e.f35710a);
        bVar.a(C3160a.class, C0580a.f35697a);
        bVar.a(b9.f.class, g.f35715a);
        bVar.a(C3163d.class, d.f35707a);
        bVar.a(C3162c.class, c.f35704a);
        bVar.a(C3161b.class, b.f35702a);
        bVar.a(C3164e.class, f.f35712a);
    }
}
