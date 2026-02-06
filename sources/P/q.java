package P;

import J.D;
import P.C1295k;
import kotlin.jvm.internal.C6496s;

public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4914a = a.f4915a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f4915a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final q f4916b = new C1296l();

        /* renamed from: c  reason: collision with root package name */
        private static final q f4917c = new C1297m();

        /* renamed from: d  reason: collision with root package name */
        private static final q f4918d = new n();

        /* renamed from: e  reason: collision with root package name */
        private static final q f4919e = new o();

        /* renamed from: f  reason: collision with root package name */
        private static final q f4920f = new p();

        /* renamed from: P.q$a$a  reason: collision with other inner class name */
        static final class C0128a implements C1287c {

            /* renamed from: a  reason: collision with root package name */
            public static final C0128a f4921a = new C0128a();

            C0128a() {
            }

            public final long a(C1294j jVar, int i10) {
                return D.c(jVar.c(), i10);
            }
        }

        static final class b implements C1287c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f4922a = new b();

            b() {
            }

            public final long a(C1294j jVar, int i10) {
                return jVar.k().C(i10);
            }
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public static final C1295k f(x xVar) {
            return r.h(f4916b.a(xVar), xVar);
        }

        /* access modifiers changed from: private */
        public static final C1295k g(x xVar) {
            C1295k.a aVar;
            C1295k.a aVar2;
            C1295k.a aVar3;
            C1295k.a aVar4;
            boolean z10;
            C1295k h10 = xVar.h();
            if (h10 == null) {
                return f4918d.a(xVar);
            }
            if (xVar.a()) {
                aVar4 = h10.e();
                aVar3 = r.l(xVar, xVar.j(), aVar4);
                aVar = h10.c();
                aVar2 = aVar3;
            } else {
                aVar4 = h10.c();
                aVar3 = r.l(xVar, xVar.i(), aVar4);
                aVar2 = h10.e();
                aVar = aVar3;
            }
            if (C6496s.c(aVar3, aVar4)) {
                return h10;
            }
            if (xVar.e() == C1289e.CROSSED || (xVar.e() == C1289e.COLLAPSED && aVar2.c() > aVar.c())) {
                z10 = true;
            } else {
                z10 = false;
            }
            return r.h(new C1295k(aVar2, aVar, z10), xVar);
        }

        /* access modifiers changed from: private */
        public static final C1295k h(x xVar) {
            boolean z10;
            C1295k.a a10 = xVar.j().a(xVar.j().g());
            C1295k.a a11 = xVar.i().a(xVar.i().e());
            if (xVar.e() == C1289e.CROSSED) {
                z10 = true;
            } else {
                z10 = false;
            }
            return new C1295k(a10, a11, z10);
        }

        /* access modifiers changed from: private */
        public static final C1295k i(x xVar) {
            return r.e(xVar, C0128a.f4921a);
        }

        /* access modifiers changed from: private */
        public static final C1295k j(x xVar) {
            return r.e(xVar, b.f4922a);
        }

        public final q k() {
            return f4920f;
        }

        public final q l() {
            return f4916b;
        }

        public final q m() {
            return f4919e;
        }

        public final q n() {
            return f4918d;
        }
    }

    C1295k a(x xVar);
}
