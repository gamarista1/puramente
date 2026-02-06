package If;

import Ff.l;
import If.a1;
import Of.C5484b;
import Of.C5494l;
import Of.C5501t;
import Of.C5502u;
import Of.C5507z;
import Of.Z;
import Sg.m;
import Tf.k;
import Uf.C5553f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6486h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import lf.C6514M;
import mf.C6565s;
import ng.f;
import qg.n;
import sf.C6714a;
import yf.p;

/* renamed from: If.d0  reason: case insensitive filesystem */
public abstract class C5432d0 implements C6486h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63653a = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private static final Class f63654b = DefaultConstructorMarker.class;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final m f63655c = new m("<v#(\\d+)>");

    /* renamed from: If.d0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return C5432d0.f63655c;
        }

        private a() {
        }
    }

    /* renamed from: If.d0$b */
    public abstract class b {

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ l[] f63656c = {O.i(new F(O.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};

        /* renamed from: a  reason: collision with root package name */
        private final a1.a f63657a;

        public b() {
            this.f63657a = a1.c(new C5434e0(C5432d0.this));
        }

        /* access modifiers changed from: private */
        public static final k c(C5432d0 d0Var) {
            return Z0.a(d0Var.f());
        }

        public final k b() {
            Object b10 = this.f63657a.b(this, f63656c[0]);
            C6496s.g(b10, "getValue(...)");
            return (k) b10;
        }
    }

    /* renamed from: If.d0$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final List f63659a;

        /* renamed from: b  reason: collision with root package name */
        private final Class f63660b;

        public c(List list, Class cls) {
            C6496s.h(list, "parameters");
            this.f63659a = list;
            this.f63660b = cls;
        }

        public final List a() {
            return this.f63659a;
        }

        public final Class b() {
            return this.f63660b;
        }
    }

    /* renamed from: If.d0$d */
    protected enum d {
        DECLARED,
        INHERITED;

        static {
            d[] a10;
            f63664d = C6714a.a(a10);
        }

        public final boolean b(C5484b bVar) {
            boolean z10;
            C6496s.h(bVar, "member");
            boolean a10 = bVar.h().a();
            if (this == DECLARED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (a10 == z10) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: If.d0$e */
    public static final class e extends C5443j {
        e(C5432d0 d0Var) {
            super(d0Var);
        }

        /* renamed from: r */
        public A a(C5494l lVar, C6514M m10) {
            C6496s.h(lVar, "descriptor");
            C6496s.h(m10, "data");
            throw new IllegalStateException("No constructors should appear here: " + lVar);
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence C(C5507z zVar) {
        C6496s.h(zVar, "descriptor");
        return n.f72702k.O(zVar) + " | " + f1.f63674a.g(zVar).a();
    }

    /* access modifiers changed from: private */
    public static final int F(C5502u uVar, C5502u uVar2) {
        Integer d10 = C5501t.d(uVar, uVar2);
        if (d10 != null) {
            return d10.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final int G(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* access modifiers changed from: private */
    public static final CharSequence H(Z z10) {
        C6496s.h(z10, "descriptor");
        return n.f72702k.O(z10) + " | " + f1.f63674a.f(z10).a();
    }

    private final Method O(Class cls, String str, Class[] clsArr, Class cls2, boolean z10) {
        Method O10;
        if (z10) {
            clsArr[0] = cls;
        }
        Method S10 = S(cls, str, clsArr, cls2);
        if (S10 != null) {
            return S10;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (O10 = O(superclass, str, clsArr, cls2, z10)) != null) {
            return O10;
        }
        Iterator a10 = C6481c.a(cls.getInterfaces());
        while (a10.hasNext()) {
            Class cls3 = (Class) a10.next();
            C6496s.e(cls3);
            Method O11 = O(cls3, str, clsArr, cls2, z10);
            if (O11 != null) {
                return O11;
            }
            if (z10) {
                ClassLoader j10 = C5553f.j(cls3);
                Class a11 = Tf.e.a(j10, cls3.getName() + "$DefaultImpls");
                if (a11 != null) {
                    clsArr[0] = cls3;
                    Method S11 = S(a11, str, clsArr, cls2);
                    if (S11 != null) {
                        return S11;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    private final c P(String str, boolean z10) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        while (true) {
            Class cls = null;
            if (str.charAt(i11) != ')') {
                int i12 = i11;
                while (str.charAt(i12) == '[') {
                    i12++;
                }
                char charAt = str.charAt(i12);
                if (Sg.p.N("VZCBSIFJD", charAt, false, 2, (Object) null)) {
                    i10 = i12 + 1;
                } else if (charAt == 'L') {
                    i10 = Sg.p.a0(str, ';', i11, false, 4, (Object) null) + 1;
                } else {
                    throw new Y0("Unknown type prefix in the method signature: " + str);
                }
                arrayList.add(Q(str, i11, i10));
                i11 = i10;
            } else {
                if (z10) {
                    cls = Q(str, i11 + 1, str.length());
                }
                return new c(arrayList, cls);
            }
        }
    }

    private final Class Q(String str, int i10, int i11) {
        char charAt = str.charAt(i10);
        if (charAt == 'F') {
            return Float.TYPE;
        }
        if (charAt == 'L') {
            ClassLoader j10 = C5553f.j(f());
            String substring = str.substring(i10 + 1, i11 - 1);
            C6496s.g(substring, "substring(...)");
            Class<?> loadClass = j10.loadClass(Sg.p.C(substring, '/', '.', false, 4, (Object) null));
            C6496s.g(loadClass, "loadClass(...)");
            return loadClass;
        } else if (charAt == 'S') {
            return Short.TYPE;
        } else {
            if (charAt == 'V') {
                Class cls = Void.TYPE;
                C6496s.g(cls, "TYPE");
                return cls;
            } else if (charAt == 'I') {
                return Integer.TYPE;
            } else {
                if (charAt == 'J') {
                    return Long.TYPE;
                }
                if (charAt == 'Z') {
                    return Boolean.TYPE;
                }
                if (charAt == '[') {
                    return j1.f(Q(str, i10 + 1, i11));
                }
                switch (charAt) {
                    case 'B':
                        return Byte.TYPE;
                    case 'C':
                        return Character.TYPE;
                    case 'D':
                        return Double.TYPE;
                    default:
                        throw new Y0("Unknown type prefix in the method signature: " + str);
                }
            }
        }
    }

    private final Constructor R(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final Method S(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (C6496s.c(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            C6496s.g(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (C6496s.c(method.getName(), str) && C6496s.c(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final void x(List list, List list2, boolean z10) {
        Class<Object> cls;
        if (C6496s.c(C6565s.B0(list2), f63654b)) {
            list2 = list2.subList(0, list2.size() - 1);
        }
        list.addAll(list2);
        int size = (list2.size() + 31) / 32;
        for (int i10 = 0; i10 < size; i10++) {
            Class cls2 = Integer.TYPE;
            C6496s.g(cls2, "TYPE");
            list.add(cls2);
        }
        if (z10) {
            cls = f63654b;
        } else {
            cls = Object.class;
        }
        C6496s.e(cls);
        list.add(cls);
    }

    public final Method A(String str, String str2, boolean z10) {
        C6496s.h(str, "name");
        C6496s.h(str2, "desc");
        if (C6496s.c(str, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(f());
        }
        c P10 = P(str2, true);
        x(arrayList, P10.a(), false);
        Class M10 = M();
        Class b10 = P10.b();
        C6496s.e(b10);
        return O(M10, str + "$default", (Class[]) arrayList.toArray(new Class[0]), b10, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x002a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Of.C5507z B(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "<init>"
            boolean r0 = kotlin.jvm.internal.C6496s.c(r14, r0)
            if (r0 == 0) goto L_0x00c2
            java.util.Collection r0 = r13.I()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = mf.C6565s.e1(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x002a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r1.next()
            r4 = r3
            Of.l r4 = (Of.C5494l) r4
            boolean r5 = r4.d0()
            if (r5 == 0) goto L_0x00ad
            Of.i r5 = r4.b()
            java.lang.String r6 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            boolean r5 = rg.C6693k.d(r5)
            if (r5 == 0) goto L_0x00ad
            If.f1 r5 = If.f1.f63674a
            If.n r5 = r5.g(r4)
            java.lang.String r5 = r5.a()
            java.lang.String r7 = "constructor-impl"
            r8 = 0
            r9 = 2
            r10 = 0
            boolean r7 = Sg.p.J(r5, r7, r8, r9, r10)
            if (r7 == 0) goto L_0x008a
            java.lang.String r7 = ")V"
            boolean r7 = Sg.p.u(r5, r7, r8, r9, r10)
            if (r7 == 0) goto L_0x008a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "V"
            java.lang.String r5 = Sg.p.w0(r5, r8)
            r7.append(r5)
            Of.i r4 = r4.b()
            kotlin.jvm.internal.C6496s.g(r4, r6)
            java.lang.String r4 = Jf.o.u(r4)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L_0x00b7
        L_0x008a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Invalid signature of "
            r14.append(r15)
            r14.append(r4)
            java.lang.String r15 = ": "
            r14.append(r15)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
        L_0x00ad:
            If.f1 r5 = If.f1.f63674a
            If.n r4 = r5.g(r4)
            java.lang.String r4 = r4.a()
        L_0x00b7:
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r15)
            if (r4 == 0) goto L_0x002a
            r2.add(r3)
            goto L_0x002a
        L_0x00c2:
            ng.f r0 = ng.f.i(r14)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.util.Collection r0 = r13.J(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00db:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00fc
            java.lang.Object r3 = r1.next()
            r4 = r3
            Of.z r4 = (Of.C5507z) r4
            If.f1 r5 = If.f1.f63674a
            If.n r4 = r5.g(r4)
            java.lang.String r4 = r4.a()
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r15)
            if (r4 == 0) goto L_0x00db
            r2.add(r3)
            goto L_0x00db
        L_0x00fc:
            int r1 = r2.size()
            r3 = 1
            if (r1 == r3) goto L_0x015e
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            If.c0 r10 = If.C5430c0.f63650a
            r11 = 30
            r12 = 0
            java.lang.String r5 = "\n"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = mf.C6565s.x0(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            If.Y0 r1 = new If.Y0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Function '"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = "' (JVM signature: "
            r2.append(r14)
            r2.append(r15)
            java.lang.String r14 = ") not resolved in "
            r2.append(r14)
            r2.append(r13)
            r14 = 58
            r2.append(r14)
            int r14 = r0.length()
            if (r14 != 0) goto L_0x0142
            java.lang.String r14 = " no members found"
            goto L_0x0153
        L_0x0142:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = 10
            r14.append(r15)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
        L_0x0153:
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L_0x015e:
            java.lang.Object r14 = mf.C6565s.P0(r2)
            Of.z r14 = (Of.C5507z) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: If.C5432d0.B(java.lang.String, java.lang.String):Of.z");
    }

    public final Method D(String str, String str2) {
        Method O10;
        C6496s.h(str, "name");
        C6496s.h(str2, "desc");
        if (C6496s.c(str, "<init>")) {
            return null;
        }
        c P10 = P(str2, true);
        Class[] clsArr = (Class[]) P10.a().toArray(new Class[0]);
        Class b10 = P10.b();
        C6496s.e(b10);
        Method O11 = O(M(), str, clsArr, b10, false);
        if (O11 != null) {
            return O11;
        }
        if (!M().isInterface() || (O10 = O(Object.class, str, clsArr, b10, false)) == null) {
            return null;
        }
        return O10;
    }

    public final Z E(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        C6496s.h(str4, "name");
        C6496s.h(str5, "signature");
        Sg.k c10 = f63655c.c(str5);
        if (c10 != null) {
            String str6 = (String) c10.a().a().b().get(1);
            Z K10 = K(Integer.parseInt(str6));
            if (K10 != null) {
                return K10;
            }
            throw new Y0("Local property #" + str6 + " not found in " + f());
        }
        f i10 = f.i(str);
        C6496s.g(i10, "identifier(...)");
        ArrayList arrayList = new ArrayList();
        for (Object next : N(i10)) {
            if (C6496s.c(f1.f63674a.f((Z) next).a(), str5)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Y0("Property '" + str4 + "' (JVM signature: " + str5 + ") not resolved in " + this);
        } else if (arrayList.size() == 1) {
            return (Z) C6565s.P0(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                C5502u visibility = ((Z) next2).getVisibility();
                Object obj = linkedHashMap.get(visibility);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(visibility, obj);
                }
                ((List) obj).add(next2);
            }
            Collection values = mf.O.h(linkedHashMap, new C5426a0(Z.f63642a)).values();
            C6496s.g(values, "<get-values>(...)");
            List list = (List) C6565s.y0(values);
            if (list.size() == 1) {
                C6496s.e(list);
                return (Z) C6565s.o0(list);
            }
            f i11 = f.i(str);
            C6496s.g(i11, "identifier(...)");
            String x02 = C6565s.x0(N(i11), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C5428b0.f63648a, 30, (Object) null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Property '");
            sb2.append(str4);
            sb2.append("' (JVM signature: ");
            sb2.append(str5);
            sb2.append(") not resolved in ");
            sb2.append(this);
            sb2.append(':');
            if (x02.length() == 0) {
                str3 = " no members found";
            } else {
                str3 = 10 + x02;
            }
            sb2.append(str3);
            throw new Y0(sb2.toString());
        }
    }

    public abstract Collection I();

    public abstract Collection J(f fVar);

    public abstract Z K(int i10);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection L(yg.C6812k r8, If.C5432d0.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            If.d0$e r0 = new If.d0$e
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = yg.C6815n.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0020:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x0055
            java.lang.Object r3 = r8.next()
            Of.m r3 = (Of.C5495m) r3
            boolean r4 = r3 instanceof Of.C5484b
            if (r4 == 0) goto L_0x004e
            r4 = r3
            Of.b r4 = (Of.C5484b) r4
            Of.u r5 = r4.getVisibility()
            Of.u r6 = Of.C5501t.f64512h
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r6)
            if (r5 != 0) goto L_0x004e
            boolean r4 = r9.b(r4)
            if (r4 == 0) goto L_0x004e
            lf.M r4 = lf.C6514M.f71813a
            java.lang.Object r3 = r3.U(r0, r4)
            If.A r3 = (If.A) r3
            goto L_0x004f
        L_0x004e:
            r3 = r2
        L_0x004f:
            if (r3 == 0) goto L_0x0020
            r1.add(r3)
            goto L_0x0020
        L_0x0055:
            java.util.List r8 = mf.C6565s.e1(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: If.C5432d0.L(yg.k, If.d0$d):java.util.Collection");
    }

    /* access modifiers changed from: protected */
    public Class M() {
        Class k10 = C5553f.k(f());
        if (k10 == null) {
            return f();
        }
        return k10;
    }

    public abstract Collection N(f fVar);

    public final Constructor y(String str) {
        C6496s.h(str, "desc");
        return R(f(), P(str, false).a());
    }

    public final Constructor z(String str) {
        C6496s.h(str, "desc");
        Class f10 = f();
        ArrayList arrayList = new ArrayList();
        x(arrayList, P(str, false).a(), true);
        C6514M m10 = C6514M.f71813a;
        return R(f10, arrayList);
    }
}
