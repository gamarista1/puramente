package If;

import Ff.g;
import Ff.h;
import Ff.l;
import If.C5455p;
import If.a1;
import Jf.h;
import Jf.o;
import Of.C5487e;
import Of.C5495m;
import Of.Y;
import Of.Z;
import Of.a0;
import Of.b0;
import Pf.h;
import Rf.L;
import Rf.M;
import Xf.C5682o;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.internal.C6484f;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6531o;
import lf.C6534r;
import lf.C6535s;
import lg.C6536a;
import mg.C6576d;
import mg.C6581i;
import rg.C6690h;

public abstract class K0 extends A implements l {

    /* renamed from: m  reason: collision with root package name */
    public static final b f63564m = new b((DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private static final Object f63565n = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final C5432d0 f63566g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63567h;

    /* renamed from: i  reason: collision with root package name */
    private final String f63568i;

    /* renamed from: j  reason: collision with root package name */
    private final Object f63569j;

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f63570k;

    /* renamed from: l  reason: collision with root package name */
    private final a1.a f63571l;

    public static abstract class a extends A implements g, l.a {
        public C5432d0 T() {
            return b0().T();
        }

        public h U() {
            return null;
        }

        public boolean Y() {
            return b0().Y();
        }

        public abstract Y a0();

        public abstract K0 b0();

        public boolean isExternal() {
            return a0().isExternal();
        }

        public boolean isInfix() {
            return a0().isInfix();
        }

        public boolean isInline() {
            return a0().isInline();
        }

        public boolean isOperator() {
            return a0().isOperator();
        }

        public boolean isSuspend() {
            return a0().isSuspend();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static abstract class c extends a implements l.b {

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ l[] f63572i = {O.i(new F(O.b(c.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        /* renamed from: g  reason: collision with root package name */
        private final a1.a f63573g = a1.c(new L0(this));

        /* renamed from: h  reason: collision with root package name */
        private final Lazy f63574h = C6531o.a(C6534r.PUBLICATION, new M0(this));

        /* access modifiers changed from: private */
        public static final h e0(c cVar) {
            return P0.b(cVar, true);
        }

        /* access modifiers changed from: private */
        public static final a0 f0(c cVar) {
            a0 d10 = cVar.b0().V().d();
            if (d10 != null) {
                return d10;
            }
            L d11 = C6690h.d(cVar.b0().V(), Pf.h.f64602L.b());
            C6496s.g(d11, "createDefaultGetter(...)");
            return d11;
        }

        public h S() {
            return (h) this.f63574h.getValue();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c) || !C6496s.c(b0(), ((c) obj).b0())) {
                return false;
            }
            return true;
        }

        /* renamed from: g0 */
        public a0 a0() {
            Object b10 = this.f63573g.b(this, f63572i[0]);
            C6496s.g(b10, "getValue(...)");
            return (a0) b10;
        }

        public String getName() {
            return "<get-" + b0().getName() + '>';
        }

        public int hashCode() {
            return b0().hashCode();
        }

        public String toString() {
            return "getter of " + b0();
        }
    }

    public static abstract class d extends a implements h.a {

        /* renamed from: i  reason: collision with root package name */
        static final /* synthetic */ l[] f63575i = {O.i(new F(O.b(d.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        /* renamed from: g  reason: collision with root package name */
        private final a1.a f63576g = a1.c(new N0(this));

        /* renamed from: h  reason: collision with root package name */
        private final Lazy f63577h = C6531o.a(C6534r.PUBLICATION, new O0(this));

        /* access modifiers changed from: private */
        public static final Jf.h e0(d dVar) {
            return P0.b(dVar, false);
        }

        /* access modifiers changed from: private */
        public static final b0 f0(d dVar) {
            b0 g10 = dVar.b0().V().g();
            if (g10 != null) {
                return g10;
            }
            Z h02 = dVar.b0().V();
            h.a aVar = Pf.h.f64602L;
            M e10 = C6690h.e(h02, aVar.b(), aVar.b());
            C6496s.g(e10, "createDefaultSetter(...)");
            return e10;
        }

        public Jf.h S() {
            return (Jf.h) this.f63577h.getValue();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d) || !C6496s.c(b0(), ((d) obj).b0())) {
                return false;
            }
            return true;
        }

        /* renamed from: g0 */
        public b0 a0() {
            Object b10 = this.f63576g.b(this, f63575i[0]);
            C6496s.g(b10, "getValue(...)");
            return (b0) b10;
        }

        public String getName() {
            return "<set-" + b0().getName() + '>';
        }

        public int hashCode() {
            return b0().hashCode();
        }

        public String toString() {
            return "setter of " + b0();
        }
    }

    private K0(C5432d0 d0Var, String str, String str2, Z z10, Object obj) {
        this.f63566g = d0Var;
        this.f63567h = str;
        this.f63568i = str2;
        this.f63569j = obj;
        this.f63570k = C6531o.a(C6534r.PUBLICATION, new I0(this));
        a1.a b10 = a1.b(z10, new J0(this));
        C6496s.g(b10, "lazySoft(...)");
        this.f63571l = b10;
    }

    /* access modifiers changed from: private */
    public static final Z a0(K0 k02) {
        return k02.T().E(k02.getName(), k02.f63568i);
    }

    /* access modifiers changed from: private */
    public static final Field b0(K0 k02) {
        Class<?> cls;
        C5455p f10 = f1.f63674a.f(k02.V());
        if (f10 instanceof C5455p.c) {
            C5455p.c cVar = (C5455p.c) f10;
            Z b10 = cVar.b();
            C6576d.a d10 = C6581i.d(C6581i.f72110a, cVar.e(), cVar.d(), cVar.g(), false, 8, (Object) null);
            if (d10 == null) {
                return null;
            }
            if (C5682o.e(b10) || C6581i.f(cVar.e())) {
                cls = k02.T().f().getEnclosingClass();
            } else {
                C5495m b11 = b10.b();
                if (b11 instanceof C5487e) {
                    cls = j1.q((C5487e) b11);
                } else {
                    cls = k02.T().f();
                }
            }
            if (cls == null) {
                return null;
            }
            try {
                return cls.getDeclaredField(d10.e());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        } else if (f10 instanceof C5455p.a) {
            return ((C5455p.a) f10).b();
        } else {
            if ((f10 instanceof C5455p.b) || (f10 instanceof C5455p.d)) {
                return null;
            }
            throw new C6535s();
        }
    }

    public Jf.h S() {
        return i0().S();
    }

    public C5432d0 T() {
        return this.f63566g;
    }

    public Jf.h U() {
        return i0().U();
    }

    public boolean Y() {
        if (this.f63569j != C6484f.NO_RECEIVER) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final Member e0() {
        if (!V().C()) {
            return null;
        }
        C5455p f10 = f1.f63674a.f(V());
        if (f10 instanceof C5455p.c) {
            C5455p.c cVar = (C5455p.c) f10;
            if (cVar.f().E()) {
                C6536a.c z10 = cVar.f().z();
                if (!z10.z() || !z10.y()) {
                    return null;
                }
                return T().D(cVar.d().getString(z10.x()), cVar.d().getString(z10.w()));
            }
        }
        return j0();
    }

    public boolean equals(Object obj) {
        K0 d10 = j1.d(obj);
        if (d10 != null && C6496s.c(T(), d10.T()) && C6496s.c(getName(), d10.getName()) && C6496s.c(this.f63568i, d10.f63568i) && C6496s.c(this.f63569j, d10.f63569j)) {
            return true;
        }
        return false;
    }

    public final Object f0() {
        return o.h(this.f63569j, V());
    }

    /* access modifiers changed from: protected */
    public final Object g0(Member member, Object obj, Object obj2) {
        Object obj3;
        AccessibleObject accessibleObject;
        try {
            Object obj4 = f63565n;
            if ((obj == obj4 || obj2 == obj4) && V().P() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (Y()) {
                obj3 = f0();
            } else {
                obj3 = obj;
            }
            if (obj3 == obj4) {
                obj3 = null;
            }
            if (!Y()) {
                obj = obj2;
            }
            if (obj == obj4) {
                obj = null;
            }
            if (member instanceof AccessibleObject) {
                accessibleObject = (AccessibleObject) member;
            } else {
                accessibleObject = null;
            }
            if (accessibleObject != null) {
                accessibleObject.setAccessible(Hf.a.a(this));
            }
            if (member == null) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(obj3);
            }
            if (member instanceof Method) {
                int length = ((Method) member).getParameterTypes().length;
                if (length == 0) {
                    return ((Method) member).invoke((Object) null, (Object[]) null);
                }
                if (length == 1) {
                    Method method = (Method) member;
                    if (obj3 == null) {
                        Class cls = ((Method) member).getParameterTypes()[0];
                        C6496s.g(cls, "get(...)");
                        obj3 = j1.g(cls);
                    }
                    return method.invoke((Object) null, new Object[]{obj3});
                } else if (length == 2) {
                    Method method2 = (Method) member;
                    if (obj == null) {
                        Class cls2 = ((Method) member).getParameterTypes()[1];
                        C6496s.g(cls2, "get(...)");
                        obj = j1.g(cls2);
                    }
                    return method2.invoke((Object) null, new Object[]{obj3, obj});
                } else {
                    throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
                }
            } else {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
        } catch (IllegalAccessException e10) {
            throw new Gf.b(e10);
        }
    }

    public String getName() {
        return this.f63567h;
    }

    /* renamed from: h0 */
    public Z V() {
        Object invoke = this.f63571l.invoke();
        C6496s.g(invoke, "invoke(...)");
        return (Z) invoke;
    }

    public int hashCode() {
        return (((T().hashCode() * 31) + getName().hashCode()) * 31) + this.f63568i.hashCode();
    }

    public abstract c i0();

    public boolean isSuspend() {
        return false;
    }

    public final Field j0() {
        return (Field) this.f63570k.getValue();
    }

    public final String k0() {
        return this.f63568i;
    }

    public String toString() {
        return e1.f63668a.k(V());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public K0(C5432d0 d0Var, String str, String str2, Object obj) {
        this(d0Var, str, str2, (Z) null, obj);
        C6496s.h(d0Var, "container");
        C6496s.h(str, "name");
        C6496s.h(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public K0(If.C5432d0 r8, Of.Z r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            ng.f r0 = r9.getName()
            java.lang.String r3 = r0.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.C6496s.g(r3, r0)
            If.f1 r0 = If.f1.f63674a
            If.p r0 = r0.f(r9)
            java.lang.String r4 = r0.a()
            java.lang.Object r6 = kotlin.jvm.internal.C6484f.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: If.K0.<init>(If.d0, Of.Z):void");
    }
}
