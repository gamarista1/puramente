package Of;

import Eg.i;
import Eg.m;
import Eg.n;
import Ff.l;
import Fg.v0;
import Gg.g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import vg.C6755e;
import yf.C6798l;
import yg.C6812k;

public final class f0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f64491e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ l[] f64492f = {O.i(new F(O.b(f0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: a  reason: collision with root package name */
    private final C5487e f64493a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f64494b;

    /* renamed from: c  reason: collision with root package name */
    private final g f64495c;

    /* renamed from: d  reason: collision with root package name */
    private final i f64496d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 a(C5487e eVar, n nVar, g gVar, C6798l lVar) {
            C6496s.h(eVar, "classDescriptor");
            C6496s.h(nVar, "storageManager");
            C6496s.h(gVar, "kotlinTypeRefinerForOwnerModule");
            C6496s.h(lVar, "scopeFactory");
            return new f0(eVar, nVar, lVar, gVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ f0(C5487e eVar, n nVar, C6798l lVar, g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, nVar, lVar, gVar);
    }

    /* access modifiers changed from: private */
    public static final C6812k d(f0 f0Var, g gVar) {
        return (C6812k) f0Var.f64494b.invoke(gVar);
    }

    private final C6812k e() {
        return (C6812k) m.a(this.f64496d, this, f64492f[0]);
    }

    /* access modifiers changed from: private */
    public static final C6812k f(f0 f0Var) {
        return (C6812k) f0Var.f64494b.invoke(f0Var.f64495c);
    }

    public final C6812k c(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        if (!gVar.d(C6755e.s(this.f64493a))) {
            return e();
        }
        v0 l10 = this.f64493a.l();
        C6496s.g(l10, "getTypeConstructor(...)");
        if (!gVar.e(l10)) {
            return e();
        }
        return gVar.c(this.f64493a, new e0(this, gVar));
    }

    private f0(C5487e eVar, n nVar, C6798l lVar, g gVar) {
        this.f64493a = eVar;
        this.f64494b = lVar;
        this.f64495c = gVar;
        this.f64496d = nVar.g(new d0(this));
    }
}
