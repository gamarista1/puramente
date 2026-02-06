package Gc;

import Zb.c;
import Zb.d;
import Zb.e;
import ac.C4458a;
import ac.C4459b;

public final class a implements C4458a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4458a f50824a = new a();

    /* renamed from: Gc.a$a  reason: collision with other inner class name */
    private static final class C0771a implements d {

        /* renamed from: a  reason: collision with root package name */
        static final C0771a f50825a = new C0771a();

        /* renamed from: b  reason: collision with root package name */
        private static final c f50826b = c.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        private static final c f50827c = c.d("variantId");

        /* renamed from: d  reason: collision with root package name */
        private static final c f50828d = c.d("parameterKey");

        /* renamed from: e  reason: collision with root package name */
        private static final c f50829e = c.d("parameterValue");

        /* renamed from: f  reason: collision with root package name */
        private static final c f50830f = c.d("templateVersion");

        private C0771a() {
        }

        /* renamed from: b */
        public void a(d dVar, e eVar) {
            eVar.f(f50826b, dVar.d());
            eVar.f(f50827c, dVar.f());
            eVar.f(f50828d, dVar.b());
            eVar.f(f50829e, dVar.c());
            eVar.c(f50830f, dVar.e());
        }
    }

    private a() {
    }

    public void a(C4459b bVar) {
        C0771a aVar = C0771a.f50825a;
        bVar.a(d.class, aVar);
        bVar.a(b.class, aVar);
    }
}
