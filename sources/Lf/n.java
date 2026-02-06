package Lf;

import Ff.l;
import Fg.C5380k0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Lf.o;
import Of.C5487e;
import Of.C5490h;
import Of.C5506y;
import Of.H;
import Of.M;
import Of.m0;
import Wf.d;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;
import ng.f;
import yg.C6812k;

public final class n {

    /* renamed from: k  reason: collision with root package name */
    public static final b f63907k = new b((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ l[] f63908l;

    /* renamed from: a  reason: collision with root package name */
    private final M f63909a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f63910b;

    /* renamed from: c  reason: collision with root package name */
    private final a f63911c = new a(1);

    /* renamed from: d  reason: collision with root package name */
    private final a f63912d = new a(1);

    /* renamed from: e  reason: collision with root package name */
    private final a f63913e = new a(1);

    /* renamed from: f  reason: collision with root package name */
    private final a f63914f = new a(2);

    /* renamed from: g  reason: collision with root package name */
    private final a f63915g = new a(3);

    /* renamed from: h  reason: collision with root package name */
    private final a f63916h = new a(1);

    /* renamed from: i  reason: collision with root package name */
    private final a f63917i = new a(2);

    /* renamed from: j  reason: collision with root package name */
    private final a f63918j = new a(3);

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f63919a;

        public a(int i10) {
            this.f63919a = i10;
        }

        public final C5487e a(n nVar, l lVar) {
            C6496s.h(nVar, "types");
            C6496s.h(lVar, "property");
            return nVar.c(Ng.a.a(lVar.getName()), this.f63919a);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final S a(H h10) {
            C6496s.h(h10, "module");
            C5487e b10 = C5506y.b(h10, o.a.f64040w0);
            if (b10 == null) {
                return null;
            }
            r0 j10 = r0.f63046b.j();
            List parameters = b10.l().getParameters();
            C6496s.g(parameters, "getParameters(...)");
            Object P02 = C6565s.P0(parameters);
            C6496s.g(P02, "single(...)");
            return V.h(j10, b10, C6565s.e(new C5380k0((m0) P02)));
        }

        private b() {
        }
    }

    static {
        Class<n> cls = n.class;
        f63908l = new l[]{O.i(new F(O.b(cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), O.i(new F(O.b(cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    }

    public n(H h10, M m10) {
        C6496s.h(h10, "module");
        C6496s.h(m10, "notFoundClasses");
        this.f63909a = m10;
        this.f63910b = C6531o.a(C6534r.PUBLICATION, new m(h10));
    }

    /* access modifiers changed from: private */
    public final C5487e c(String str, int i10) {
        C5487e eVar;
        f i11 = f.i(str);
        C6496s.g(i11, "identifier(...)");
        C5490h e10 = e().e(i11, d.FROM_REFLECTION);
        if (e10 instanceof C5487e) {
            eVar = (C5487e) e10;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return this.f63909a.d(new ng.b(o.f63951x, i11), C6565s.e(Integer.valueOf(i10)));
        }
        return eVar;
    }

    private final C6812k e() {
        return (C6812k) this.f63910b.getValue();
    }

    /* access modifiers changed from: private */
    public static final C6812k f(H h10) {
        return h10.l0(o.f63951x).o();
    }

    public final C5487e d() {
        return this.f63911c.a(this, f63908l[0]);
    }
}
