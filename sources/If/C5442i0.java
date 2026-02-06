package If;

import Ff.g;
import Ff.k;
import Ff.l;
import Fg.S;
import If.C5447l;
import If.C5451n;
import If.a1;
import Jf.a;
import Jf.h;
import Jf.i;
import Jf.j;
import Jf.n;
import Jf.o;
import Of.C5484b;
import Of.C5487e;
import Of.C5494l;
import Of.C5495m;
import Of.C5507z;
import Of.c0;
import Of.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.C6484f;
import kotlin.jvm.internal.C6492n;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6531o;
import lf.C6534r;
import lf.C6535s;
import mf.C6559l;
import mf.C6565s;
import rg.C6693k;
import vg.C6755e;
import wg.C6766b;

/* renamed from: If.i0  reason: case insensitive filesystem */
public final class C5442i0 extends A implements C6492n, g, C5447l {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ l[] f63687m = {O.i(new F(O.b(C5442i0.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* renamed from: g  reason: collision with root package name */
    private final C5432d0 f63688g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63689h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f63690i;

    /* renamed from: j  reason: collision with root package name */
    private final a1.a f63691j;

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f63692k;

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f63693l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ C5442i0(C5432d0 d0Var, String str, String str2, C5507z zVar, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, str, str2, zVar, (i10 & 16) != 0 ? C6484f.NO_RECEIVER : obj);
    }

    /* access modifiers changed from: private */
    public static final h d0(C5442i0 i0Var) {
        Object obj;
        h hVar;
        C5451n g10 = f1.f63674a.g(i0Var.V());
        if (g10 instanceof C5451n.d) {
            if (i0Var.X()) {
                Class f10 = i0Var.T().f();
                Iterable<k> parameters = i0Var.getParameters();
                ArrayList arrayList = new ArrayList(C6565s.y(parameters, 10));
                for (k name : parameters) {
                    String name2 = name.getName();
                    C6496s.e(name2);
                    arrayList.add(name2);
                }
                return new a(f10, arrayList, a.C0940a.POSITIONAL_CALL, a.b.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
            }
            obj = i0Var.T().y(((C5451n.d) g10).b());
        } else if (g10 instanceof C5451n.e) {
            C5507z l02 = i0Var.V();
            C5495m b10 = l02.b();
            C6496s.g(b10, "getContainingDeclaration(...)");
            if (!C6693k.d(b10) || !(l02 instanceof C5494l) || !((C5494l) l02).d0()) {
                C5451n.e eVar = (C5451n.e) g10;
                obj = i0Var.T().D(eVar.c(), eVar.b());
            } else {
                C5507z l03 = i0Var.V();
                C5432d0 T10 = i0Var.T();
                String b11 = ((C5451n.e) g10).b();
                List k10 = i0Var.V().k();
                C6496s.g(k10, "getValueParameters(...)");
                return new n.b(l03, T10, b11, k10);
            }
        } else if (g10 instanceof C5451n.c) {
            obj = ((C5451n.c) g10).b();
            C6496s.f(obj, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else if (g10 instanceof C5451n.b) {
            obj = ((C5451n.b) g10).d();
            C6496s.f(obj, "null cannot be cast to non-null type java.lang.reflect.Member");
        } else if (g10 instanceof C5451n.a) {
            List d10 = ((C5451n.a) g10).d();
            Class f11 = i0Var.T().f();
            Iterable<Method> iterable = d10;
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
            for (Method name3 : iterable) {
                arrayList2.add(name3.getName());
            }
            return new a(f11, arrayList2, a.C0940a.POSITIONAL_CALL, a.b.JAVA, d10);
        } else {
            throw new C6535s();
        }
        if (obj instanceof Constructor) {
            hVar = i0Var.e0((Constructor) obj, i0Var.V(), false);
        } else if (obj instanceof Method) {
            Method method = (Method) obj;
            if (!Modifier.isStatic(method.getModifiers())) {
                hVar = i0Var.f0(method);
            } else if (i0Var.V().getAnnotations().i(j1.j()) != null) {
                hVar = i0Var.g0(method);
            } else {
                hVar = i0Var.h0(method);
            }
        } else {
            throw new Y0("Could not compute caller for function: " + i0Var.V() + " (member = " + obj + ')');
        }
        return o.j(hVar, i0Var.V(), false, 2, (Object) null);
    }

    private final i e0(Constructor constructor, C5507z zVar, boolean z10) {
        if (z10 || !C6766b.f(zVar)) {
            if (Y()) {
                return new i.c(constructor, k0());
            }
            return new i.e(constructor);
        } else if (Y()) {
            return new i.a(constructor, k0());
        } else {
            return new i.b(constructor);
        }
    }

    private final i.h f0(Method method) {
        if (Y()) {
            return new i.h.a(method, k0());
        }
        return new i.h.e(method);
    }

    private final i.h g0(Method method) {
        if (Y()) {
            return new i.h.b(method);
        }
        return new i.h.f(method);
    }

    private final i.h h0(Method method) {
        Object obj;
        if (!Y()) {
            return new i.h.g(method);
        }
        if (n0(method)) {
            obj = this.f63690i;
        } else {
            obj = k0();
        }
        return new i.h.c(method, obj);
    }

    /* access modifiers changed from: private */
    public static final h i0(C5442i0 i0Var) {
        Object obj;
        h hVar;
        f1 f1Var = f1.f63674a;
        C5451n g10 = f1Var.g(i0Var.V());
        if (g10 instanceof C5451n.e) {
            C5507z l02 = i0Var.V();
            C5495m b10 = l02.b();
            C6496s.g(b10, "getContainingDeclaration(...)");
            if (!C6693k.d(b10) || !(l02 instanceof C5494l) || !((C5494l) l02).d0()) {
                C5507z m02 = i0Var.m0(i0Var.V());
                if (m02 != null) {
                    C5451n g11 = f1Var.g(m02);
                    C6496s.f(g11, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                    C5451n.e eVar = (C5451n.e) g11;
                    obj = i0Var.T().A(eVar.c(), eVar.b(), true);
                } else {
                    C5432d0 T10 = i0Var.T();
                    C5451n.e eVar2 = (C5451n.e) g10;
                    String c10 = eVar2.c();
                    String b11 = eVar2.b();
                    Member member = i0Var.S().getMember();
                    C6496s.e(member);
                    obj = T10.A(c10, b11, !Modifier.isStatic(member.getModifiers()));
                }
            } else {
                throw new Y0(i0Var.V().b() + " cannot have default arguments");
            }
        } else if (g10 instanceof C5451n.d) {
            if (i0Var.X()) {
                Class f10 = i0Var.T().f();
                Iterable<k> parameters = i0Var.getParameters();
                ArrayList arrayList = new ArrayList(C6565s.y(parameters, 10));
                for (k name : parameters) {
                    String name2 = name.getName();
                    C6496s.e(name2);
                    arrayList.add(name2);
                }
                return new a(f10, arrayList, a.C0940a.CALL_BY_NAME, a.b.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
            }
            obj = i0Var.T().z(((C5451n.d) g10).b());
        } else if (g10 instanceof C5451n.a) {
            List d10 = ((C5451n.a) g10).d();
            Class f11 = i0Var.T().f();
            Iterable<Method> iterable = d10;
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable, 10));
            for (Method name3 : iterable) {
                arrayList2.add(name3.getName());
            }
            return new a(f11, arrayList2, a.C0940a.CALL_BY_NAME, a.b.JAVA, d10);
        } else {
            obj = null;
        }
        if (obj instanceof Constructor) {
            hVar = i0Var.e0((Constructor) obj, i0Var.V(), true);
        } else if (obj instanceof Method) {
            if (i0Var.V().getAnnotations().i(j1.j()) != null) {
                C5495m b12 = i0Var.V().b();
                C6496s.f(b12, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (!((C5487e) b12).b0()) {
                    hVar = i0Var.g0((Method) obj);
                }
            }
            hVar = i0Var.h0((Method) obj);
        } else {
            hVar = null;
        }
        if (hVar != null) {
            return o.i(hVar, i0Var.V(), true);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C5507z j0(C5442i0 i0Var, String str) {
        return i0Var.T().B(str, i0Var.f63689h);
    }

    private final Object k0() {
        return o.h(this.f63690i, V());
    }

    private final C5507z m0(C5507z zVar) {
        Object obj;
        List k10 = zVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        Iterable<t0> iterable = k10;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (t0 A02 : iterable) {
                if (A02.A0()) {
                    return null;
                }
            }
        }
        C5495m b10 = zVar.b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        if (!C6693k.g(b10)) {
            return null;
        }
        Member member = S().getMember();
        C6496s.e(member);
        if (!Modifier.isStatic(member.getModifiers())) {
            return null;
        }
        Iterator it = C6755e.z(zVar, false).iterator();
        loop1:
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List k11 = ((C5484b) obj).k();
            C6496s.g(k11, "getValueParameters(...)");
            Iterable<t0> iterable2 = k11;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (t0 A03 : iterable2) {
                    if (A03.A0()) {
                        break loop1;
                    }
                }
                continue;
            }
        }
        if (obj instanceof C5507z) {
            return (C5507z) obj;
        }
        return null;
    }

    private final boolean n0(Method method) {
        S type;
        c0 M10 = V().M();
        if (!(M10 == null || (type = M10.getType()) == null || !C6693k.c(type))) {
            Class[] parameterTypes = method.getParameterTypes();
            C6496s.g(parameterTypes, "getParameterTypes(...)");
            Class cls = (Class) C6559l.c0(parameterTypes);
            if (cls == null || !cls.isInterface()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public h S() {
        return (h) this.f63692k.getValue();
    }

    public C5432d0 T() {
        return this.f63688g;
    }

    public h U() {
        return (h) this.f63693l.getValue();
    }

    public boolean Y() {
        if (this.f63690i != C6484f.NO_RECEIVER) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        C5442i0 c10 = j1.c(obj);
        if (c10 != null && C6496s.c(T(), c10.T()) && C6496s.c(getName(), c10.getName()) && C6496s.c(this.f63689h, c10.f63689h) && C6496s.c(this.f63690i, c10.f63690i)) {
            return true;
        }
        return false;
    }

    public Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return C5447l.a.g(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    public int getArity() {
        return j.a(S());
    }

    public String getName() {
        String b10 = V().getName().b();
        C6496s.g(b10, "asString(...)");
        return b10;
    }

    public int hashCode() {
        return (((T().hashCode() * 31) + getName().hashCode()) * 31) + this.f63689h.hashCode();
    }

    public Object invoke() {
        return C5447l.a.a(this);
    }

    public boolean isExternal() {
        return V().isExternal();
    }

    public boolean isInfix() {
        return V().isInfix();
    }

    public boolean isInline() {
        return V().isInline();
    }

    public boolean isOperator() {
        return V().isOperator();
    }

    public boolean isSuspend() {
        return V().isSuspend();
    }

    /* renamed from: l0 */
    public C5507z V() {
        Object b10 = this.f63691j.b(this, f63687m[0]);
        C6496s.g(b10, "getValue(...)");
        return (C5507z) b10;
    }

    public String toString() {
        return e1.f63668a.f(V());
    }

    public Object invoke(Object obj) {
        return C5447l.a.b(this, obj);
    }

    private C5442i0(C5432d0 d0Var, String str, String str2, C5507z zVar, Object obj) {
        this.f63688g = d0Var;
        this.f63689h = str2;
        this.f63690i = obj;
        this.f63691j = a1.b(zVar, new C5436f0(this, str));
        C6534r rVar = C6534r.PUBLICATION;
        this.f63692k = C6531o.a(rVar, new C5438g0(this));
        this.f63693l = C6531o.a(rVar, new C5440h0(this));
    }

    public Object invoke(Object obj, Object obj2) {
        return C5447l.a.c(this, obj, obj2);
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        return C5447l.a.d(this, obj, obj2, obj3);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return C5447l.a.e(this, obj, obj2, obj3, obj4);
    }

    public Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return C5447l.a.f(this, obj, obj2, obj3, obj4, obj5);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C5442i0(C5432d0 d0Var, String str, String str2, Object obj) {
        this(d0Var, str, str2, (C5507z) null, obj);
        C6496s.h(d0Var, "container");
        C6496s.h(str, "name");
        C6496s.h(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5442i0(If.C5432d0 r10, Of.C5507z r11) {
        /*
            r9 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            ng.f r0 = r11.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.C6496s.g(r3, r0)
            If.f1 r0 = If.f1.f63674a
            If.n r0 = r0.g(r11)
            java.lang.String r4 = r0.a()
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: If.C5442i0.<init>(If.d0, Of.z):void");
    }
}
