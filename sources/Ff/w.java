package Ff;

import Rg.h;
import Rg.k;
import Sg.p;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6497t;
import lf.C6535s;
import mf.C6565s;
import xf.C6781a;
import yf.C6798l;

public abstract class w {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f62903a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Ff.s[] r0 = Ff.s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ff.s r1 = Ff.s.IN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ff.s r1 = Ff.s.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Ff.s r1 = Ff.s.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f62903a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ff.w.a.<clinit>():void");
        }
    }

    /* synthetic */ class b extends C6494p implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62904a = new b();

        b() {
            super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
        }

        /* renamed from: i */
        public final Class invoke(Class cls) {
            C6496s.h(cls, "p0");
            return cls.getComponentType();
        }
    }

    /* access modifiers changed from: private */
    public static final Type c(p pVar, boolean z10) {
        Class cls;
        int i10;
        e b10 = pVar.b();
        if (b10 instanceof q) {
            return new v((q) b10);
        }
        if (b10 instanceof d) {
            d dVar = (d) b10;
            if (z10) {
                cls = C6781a.c(dVar);
            } else {
                cls = C6781a.b(dVar);
            }
            List c10 = pVar.c();
            if (c10.isEmpty()) {
                return cls;
            }
            if (!cls.isArray()) {
                return e(cls, c10);
            }
            if (cls.getComponentType().isPrimitive()) {
                return cls;
            }
            r rVar = (r) C6565s.R0(c10);
            if (rVar != null) {
                s a10 = rVar.a();
                p b11 = rVar.b();
                if (a10 == null) {
                    i10 = -1;
                } else {
                    i10 = a.f62903a[a10.ordinal()];
                }
                if (i10 == -1 || i10 == 1) {
                    return cls;
                }
                if (i10 == 2 || i10 == 3) {
                    C6496s.e(b11);
                    Type d10 = d(b11, false, 1, (Object) null);
                    if (d10 instanceof Class) {
                        return cls;
                    }
                    return new a(d10);
                }
                throw new C6535s();
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + pVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + pVar);
    }

    static /* synthetic */ Type d(p pVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(pVar, z10);
    }

    private static final Type e(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            Iterable<r> iterable = list;
            ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
            for (r g10 : iterable) {
                arrayList.add(g(g10));
            }
            return new u(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            Iterable<r> iterable2 = list;
            ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
            for (r g11 : iterable2) {
                arrayList2.add(g(g11));
            }
            return new u(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type e10 = e(declaringClass, list.subList(length, list.size()));
            Iterable<r> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(C6565s.y(subList, 10));
            for (r g12 : subList) {
                arrayList3.add(g(g12));
            }
            return new u(cls, e10, arrayList3);
        }
    }

    public static final Type f(p pVar) {
        Type a10;
        C6496s.h(pVar, "<this>");
        if (!(pVar instanceof C6497t) || (a10 = ((C6497t) pVar).a()) == null) {
            return d(pVar, false, 1, (Object) null);
        }
        return a10;
    }

    private static final Type g(r rVar) {
        s d10 = rVar.d();
        if (d10 == null) {
            return x.f62905c.a();
        }
        p c10 = rVar.c();
        C6496s.e(c10);
        int i10 = a.f62903a[d10.ordinal()];
        if (i10 == 1) {
            return new x((Type) null, c(c10, true));
        }
        if (i10 == 2) {
            return c(c10, true);
        }
        if (i10 == 3) {
            return new x(c(c10, true), (Type) null);
        }
        throw new C6535s();
    }

    /* access modifiers changed from: private */
    public static final String h(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            h h10 = k.h(type, b.f62904a);
            str = ((Class) k.w(h10)).getName() + p.z("[]", k.m(h10));
        } else {
            str = cls.getName();
        }
        C6496s.e(str);
        return str;
    }
}
