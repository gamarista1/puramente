package X3;

import a4.C3117j;
import d4.C3472i;
import d4.m;
import f4.C3505b;
import g4.C3526d;
import j4.C3627n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6565s;
import o4.C3880c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final List f9673a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9674b;

    /* renamed from: c  reason: collision with root package name */
    private final List f9675c;

    /* renamed from: d  reason: collision with root package name */
    private final List f9676d;

    /* renamed from: e  reason: collision with root package name */
    private final List f9677e;

    public /* synthetic */ a(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public final List a() {
        return this.f9677e;
    }

    public final List b() {
        return this.f9676d;
    }

    public final List c() {
        return this.f9673a;
    }

    public final List d() {
        return this.f9675c;
    }

    public final List e() {
        return this.f9674b;
    }

    public final String f(Object obj, C3627n nVar) {
        List list = this.f9675c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            C3505b bVar = (C3505b) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                C6496s.f(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a10 = bVar.a(obj, nVar);
                if (a10 != null) {
                    return a10;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, C3627n nVar) {
        List list = this.f9674b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) list.get(i10);
            C3526d dVar = (C3526d) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                C6496s.f(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a10 = dVar.a(obj, nVar);
                if (a10 != null) {
                    obj = a10;
                }
            }
        }
        return obj;
    }

    public final C0183a h() {
        return new C0183a(this);
    }

    public final Pair i(m mVar, C3627n nVar, g gVar, int i10) {
        int size = this.f9677e.size();
        while (i10 < size) {
            C3117j create = ((C3117j.a) this.f9677e.get(i10)).create(mVar, nVar, gVar);
            if (create != null) {
                return C6502A.a(create, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final Pair j(Object obj, C3627n nVar, g gVar, int i10) {
        int size = this.f9676d.size();
        while (i10 < size) {
            Pair pair = (Pair) this.f9676d.get(i10);
            C3472i.a aVar = (C3472i.a) pair.a();
            if (((Class) pair.b()).isAssignableFrom(obj.getClass())) {
                C6496s.f(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                C3472i a10 = aVar.a(obj, nVar, gVar);
                if (a10 != null) {
                    return C6502A.a(a10, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    private a(List list, List list2, List list3, List list4, List list5) {
        this.f9673a = list;
        this.f9674b = list2;
        this.f9675c = list3;
        this.f9676d = list4;
        this.f9677e = list5;
    }

    /* renamed from: X3.a$a  reason: collision with other inner class name */
    public static final class C0183a {

        /* renamed from: a  reason: collision with root package name */
        private final List f9678a;

        /* renamed from: b  reason: collision with root package name */
        private final List f9679b;

        /* renamed from: c  reason: collision with root package name */
        private final List f9680c;

        /* renamed from: d  reason: collision with root package name */
        private final List f9681d;

        /* renamed from: e  reason: collision with root package name */
        private final List f9682e;

        public C0183a() {
            this.f9678a = new ArrayList();
            this.f9679b = new ArrayList();
            this.f9680c = new ArrayList();
            this.f9681d = new ArrayList();
            this.f9682e = new ArrayList();
        }

        public final C0183a a(C3117j.a aVar) {
            this.f9682e.add(aVar);
            return this;
        }

        public final C0183a b(C3472i.a aVar, Class cls) {
            this.f9681d.add(C6502A.a(aVar, cls));
            return this;
        }

        public final C0183a c(C3505b bVar, Class cls) {
            this.f9680c.add(C6502A.a(bVar, cls));
            return this;
        }

        public final C0183a d(C3526d dVar, Class cls) {
            this.f9679b.add(C6502A.a(dVar, cls));
            return this;
        }

        public final a e() {
            return new a(C3880c.a(this.f9678a), C3880c.a(this.f9679b), C3880c.a(this.f9680c), C3880c.a(this.f9681d), C3880c.a(this.f9682e), (DefaultConstructorMarker) null);
        }

        public final List f() {
            return this.f9682e;
        }

        public final List g() {
            return this.f9681d;
        }

        public C0183a(a aVar) {
            this.f9678a = C6565s.h1(aVar.c());
            this.f9679b = C6565s.h1(aVar.e());
            this.f9680c = C6565s.h1(aVar.d());
            this.f9681d = C6565s.h1(aVar.b());
            this.f9682e = C6565s.h1(aVar.a());
        }
    }

    public a() {
        this(C6565s.n(), C6565s.n(), C6565s.n(), C6565s.n(), C6565s.n());
    }
}
