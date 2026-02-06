package Tf;

import Bg.C5328n;
import Of.H;
import gg.C5961k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f65162c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5328n f65163a;

    /* renamed from: b  reason: collision with root package name */
    private final a f65164b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ClassLoader classLoader) {
            C6496s.h(classLoader, "classLoader");
            g gVar = new g(classLoader);
            C5961k.a aVar = C5961k.f67789b;
            ClassLoader classLoader2 = C6514M.class.getClassLoader();
            C6496s.g(classLoader2, "getClassLoader(...)");
            g gVar2 = new g(classLoader2);
            d dVar = new d(classLoader);
            C5961k.a.C1002a a10 = aVar.a(gVar, gVar2, dVar, "runtime module for " + classLoader, j.f65161b, l.f65165a);
            return new k(a10.a().a(), new a(a10.b(), gVar), (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(C5328n nVar, a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, aVar);
    }

    public final C5328n a() {
        return this.f65163a;
    }

    public final H b() {
        return this.f65163a.q();
    }

    public final a c() {
        return this.f65164b;
    }

    private k(C5328n nVar, a aVar) {
        this.f65163a = nVar;
        this.f65164b = aVar;
    }
}
