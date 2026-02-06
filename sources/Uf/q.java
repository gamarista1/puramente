package Uf;

import Ff.f;
import Of.w0;
import Of.x0;
import Rg.h;
import Rg.k;
import Sg.p;
import eg.C5823D;
import eg.C5830g;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.T;
import mf.C6559l;
import mf.C6565s;
import yf.C6798l;

public final class q extends u implements j, A, C5830g {

    /* renamed from: a  reason: collision with root package name */
    private final Class f65258a;

    /* synthetic */ class a extends C6493o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65259a = new a();

        a() {
            super(1);
        }

        public final String getName() {
            return "isSynthetic";
        }

        public final f getOwner() {
            return O.b(Member.class);
        }

        public final String getSignature() {
            return "isSynthetic()Z";
        }

        /* renamed from: i */
        public final Boolean invoke(Member member) {
            C6496s.h(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* synthetic */ class b extends C6493o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65260a = new b();

        b() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final f getOwner() {
            return O.b(t.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        /* renamed from: i */
        public final t invoke(Constructor constructor) {
            C6496s.h(constructor, "p0");
            return new t(constructor);
        }
    }

    /* synthetic */ class c extends C6493o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65261a = new c();

        c() {
            super(1);
        }

        public final String getName() {
            return "isSynthetic";
        }

        public final f getOwner() {
            return O.b(Member.class);
        }

        public final String getSignature() {
            return "isSynthetic()Z";
        }

        /* renamed from: i */
        public final Boolean invoke(Member member) {
            C6496s.h(member, "p0");
            return Boolean.valueOf(member.isSynthetic());
        }
    }

    /* synthetic */ class d extends C6493o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65262a = new d();

        d() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final f getOwner() {
            return O.b(w.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        /* renamed from: i */
        public final w invoke(Field field) {
            C6496s.h(field, "p0");
            return new w(field);
        }
    }

    /* synthetic */ class e extends C6493o implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final e f65263a = new e();

        e() {
            super(1);
        }

        public final String getName() {
            return "<init>";
        }

        public final f getOwner() {
            return O.b(z.class);
        }

        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        /* renamed from: i */
        public final z invoke(Method method) {
            C6496s.h(method, "p0");
            return new z(method);
        }
    }

    public q(Class cls) {
        C6496s.h(cls, "klass");
        this.f65258a = cls;
    }

    /* access modifiers changed from: private */
    public static final boolean R(Class cls) {
        String simpleName = cls.getSimpleName();
        C6496s.g(simpleName, "getSimpleName(...)");
        if (simpleName.length() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final ng.f S(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!ng.f.l(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return ng.f.i(simpleName);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean T(q qVar, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (qVar.w()) {
            C6496s.e(method);
            if (qVar.d0(method)) {
                return false;
            }
        }
        return true;
    }

    private final boolean d0(Method method) {
        String name = method.getName();
        if (C6496s.c(name, "values")) {
            Class[] parameterTypes = method.getParameterTypes();
            C6496s.g(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0) {
                return true;
            }
            return false;
        } else if (C6496s.c(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else {
            return false;
        }
    }

    public h D() {
        Class[] c10 = C5549b.f65230a.c(this.f65258a);
        if (c10 != null) {
            ArrayList arrayList = new ArrayList(c10.length);
            for (Class sVar : c10) {
                arrayList.add(new s(sVar));
            }
            h b02 = C6565s.b0(arrayList);
            if (b02 != null) {
                return b02;
            }
        }
        return k.e();
    }

    public boolean E() {
        return false;
    }

    public int J() {
        return this.f65258a.getModifiers();
    }

    public boolean L() {
        return this.f65258a.isInterface();
    }

    public C5823D M() {
        return null;
    }

    /* renamed from: X */
    public List j() {
        Constructor[] declaredConstructors = this.f65258a.getDeclaredConstructors();
        C6496s.g(declaredConstructors, "getDeclaredConstructors(...)");
        return k.G(k.x(k.p(C6559l.S(declaredConstructors), a.f65259a), b.f65260a));
    }

    /* renamed from: Y */
    public Class t() {
        return this.f65258a;
    }

    /* renamed from: Z */
    public List y() {
        Field[] declaredFields = this.f65258a.getDeclaredFields();
        C6496s.g(declaredFields, "getDeclaredFields(...)");
        return k.G(k.x(k.p(C6559l.S(declaredFields), c.f65261a), d.f65262a));
    }

    /* renamed from: a0 */
    public List B() {
        Class[] declaredClasses = this.f65258a.getDeclaredClasses();
        C6496s.g(declaredClasses, "getDeclaredClasses(...)");
        return k.G(k.y(k.p(C6559l.S(declaredClasses), n.f65255a), o.f65256a));
    }

    /* renamed from: b0 */
    public List C() {
        Method[] declaredMethods = this.f65258a.getDeclaredMethods();
        C6496s.g(declaredMethods, "getDeclaredMethods(...)");
        return k.G(k.x(k.o(C6559l.S(declaredMethods), new p(this)), e.f65263a));
    }

    /* renamed from: c0 */
    public q h() {
        Class<?> declaringClass = this.f65258a.getDeclaringClass();
        if (declaringClass != null) {
            return new q(declaringClass);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q) || !C6496s.c(this.f65258a, ((q) obj).f65258a)) {
            return false;
        }
        return true;
    }

    public ng.c f() {
        return C5553f.e(this.f65258a).a();
    }

    public boolean g() {
        return Modifier.isStatic(J());
    }

    public ng.f getName() {
        if (this.f65258a.isAnonymousClass()) {
            String name = this.f65258a.getName();
            C6496s.g(name, "getName(...)");
            ng.f i10 = ng.f.i(p.W0(name, ".", (String) null, 2, (Object) null));
            C6496s.e(i10);
            return i10;
        }
        ng.f i11 = ng.f.i(this.f65258a.getSimpleName());
        C6496s.e(i11);
        return i11;
    }

    public List getTypeParameters() {
        TypeVariable[] typeParameters = this.f65258a.getTypeParameters();
        C6496s.g(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable f10 : typeParameters) {
            arrayList.add(new F(f10));
        }
        return arrayList;
    }

    public x0 getVisibility() {
        int J10 = J();
        if (Modifier.isPublic(J10)) {
            return w0.h.f64533c;
        }
        if (Modifier.isPrivate(J10)) {
            return w0.e.f64530c;
        }
        if (!Modifier.isProtected(J10)) {
            return Sf.a.f65025c;
        }
        if (Modifier.isStatic(J10)) {
            return Sf.c.f65027c;
        }
        return Sf.b.f65026c;
    }

    public int hashCode() {
        return this.f65258a.hashCode();
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(J());
    }

    public boolean isFinal() {
        return Modifier.isFinal(J());
    }

    public Collection l() {
        Type type = Object.class;
        if (C6496s.c(this.f65258a, type)) {
            return C6565s.n();
        }
        T t10 = new T(2);
        Type genericSuperclass = this.f65258a.getGenericSuperclass();
        if (genericSuperclass != null) {
            type = genericSuperclass;
        }
        t10.a(type);
        t10.b(this.f65258a.getGenericInterfaces());
        Iterable<Type> q10 = C6565s.q(t10.d(new Type[t10.c()]));
        ArrayList arrayList = new ArrayList(C6565s.y(q10, 10));
        for (Type sVar : q10) {
            arrayList.add(new s(sVar));
        }
        return arrayList;
    }

    public Collection n() {
        Object[] d10 = C5549b.f65230a.d(this.f65258a);
        if (d10 == null) {
            d10 = new Object[0];
        }
        ArrayList arrayList = new ArrayList(d10.length);
        for (Object d11 : d10) {
            arrayList.add(new D(d11));
        }
        return arrayList;
    }

    public boolean p() {
        return this.f65258a.isAnnotation();
    }

    public boolean r() {
        Boolean e10 = C5549b.f65230a.e(this.f65258a);
        if (e10 != null) {
            return e10.booleanValue();
        }
        return false;
    }

    public boolean s() {
        return false;
    }

    public String toString() {
        return q.class.getName() + ": " + this.f65258a;
    }

    public boolean w() {
        return this.f65258a.isEnum();
    }

    public boolean z() {
        Boolean f10 = C5549b.f65230a.f(this.f65258a);
        if (f10 != null) {
            return f10.booleanValue();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = Uf.k.b((r0 = r0.getDeclaredAnnotations()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List getAnnotations() {
        /*
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.t()
            if (r0 == 0) goto L_0x0012
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = Uf.k.b(r0)
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.util.List r0 = mf.C6565s.n()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Uf.q.getAnnotations():java.util.List");
    }

    public C5554g i(ng.c cVar) {
        Annotation[] declaredAnnotations;
        C6496s.h(cVar, "fqName");
        AnnotatedElement t10 = t();
        if (t10 == null || (declaredAnnotations = t10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }
}
