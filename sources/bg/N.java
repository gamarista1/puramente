package Bg;

import Of.h0;
import ig.c;
import kg.C6435b;
import kg.C6436c;
import kg.g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    private final C6436c f62475a;

    /* renamed from: b  reason: collision with root package name */
    private final g f62476b;

    /* renamed from: c  reason: collision with root package name */
    private final h0 f62477c;

    public static final class a extends N {

        /* renamed from: d  reason: collision with root package name */
        private final c f62478d;

        /* renamed from: e  reason: collision with root package name */
        private final a f62479e;

        /* renamed from: f  reason: collision with root package name */
        private final ng.b f62480f;

        /* renamed from: g  reason: collision with root package name */
        private final c.C1017c f62481g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f62482h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f62483i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, C6436c cVar2, g gVar, h0 h0Var, a aVar) {
            super(cVar2, gVar, h0Var, (DefaultConstructorMarker) null);
            C6496s.h(cVar, "classProto");
            C6496s.h(cVar2, "nameResolver");
            C6496s.h(gVar, "typeTable");
            this.f62478d = cVar;
            this.f62479e = aVar;
            this.f62480f = L.a(cVar2, cVar.F0());
            c.C1017c cVar3 = (c.C1017c) C6435b.f71547f.d(cVar.E0());
            this.f62481g = cVar3 == null ? c.C1017c.CLASS : cVar3;
            Boolean f10 = C6435b.f71548g.d(cVar.E0());
            C6496s.g(f10, "get(...)");
            this.f62482h = f10.booleanValue();
            Boolean f11 = C6435b.f71549h.d(cVar.E0());
            C6496s.g(f11, "get(...)");
            this.f62483i = f11.booleanValue();
        }

        public ng.c a() {
            return this.f62480f.a();
        }

        public final ng.b e() {
            return this.f62480f;
        }

        public final c f() {
            return this.f62478d;
        }

        public final c.C1017c g() {
            return this.f62481g;
        }

        public final a h() {
            return this.f62479e;
        }

        public final boolean i() {
            return this.f62482h;
        }
    }

    public static final class b extends N {

        /* renamed from: d  reason: collision with root package name */
        private final ng.c f62484d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ng.c cVar, C6436c cVar2, g gVar, h0 h0Var) {
            super(cVar2, gVar, h0Var, (DefaultConstructorMarker) null);
            C6496s.h(cVar, "fqName");
            C6496s.h(cVar2, "nameResolver");
            C6496s.h(gVar, "typeTable");
            this.f62484d = cVar;
        }

        public ng.c a() {
            return this.f62484d;
        }
    }

    public /* synthetic */ N(C6436c cVar, g gVar, h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, gVar, h0Var);
    }

    public abstract ng.c a();

    public final C6436c b() {
        return this.f62475a;
    }

    public final h0 c() {
        return this.f62477c;
    }

    public final g d() {
        return this.f62476b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private N(C6436c cVar, g gVar, h0 h0Var) {
        this.f62475a = cVar;
        this.f62476b = gVar;
        this.f62477c = h0Var;
    }
}
