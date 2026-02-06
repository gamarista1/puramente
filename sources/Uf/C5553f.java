package Uf;

import Ff.d;
import Rg.h;
import Rg.k;
import com.adjust.sdk.Constants;
import io.intercom.android.sdk.models.AttributeType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6502A;
import mf.C6559l;
import mf.C6565s;
import ng.b;
import ng.c;
import ng.f;
import xf.C6781a;
import yf.C6787a;
import yf.C6788b;
import yf.C6789c;
import yf.C6790d;
import yf.C6791e;
import yf.C6792f;
import yf.C6793g;
import yf.C6794h;
import yf.C6795i;
import yf.C6796j;
import yf.C6797k;
import yf.C6798l;
import yf.C6799m;
import yf.C6800n;
import yf.C6801o;
import yf.p;
import yf.q;
import yf.r;
import yf.s;
import yf.t;
import yf.u;
import yf.v;
import yf.w;

/* renamed from: Uf.f  reason: case insensitive filesystem */
public abstract class C5553f {

    /* renamed from: a  reason: collision with root package name */
    private static final List f65242a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map f65243b;

    /* renamed from: c  reason: collision with root package name */
    private static final Map f65244c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f65245d;

    static {
        int i10 = 0;
        List q10 = C6565s.q(O.b(Boolean.TYPE), O.b(Byte.TYPE), O.b(Character.TYPE), O.b(Double.TYPE), O.b(Float.TYPE), O.b(Integer.TYPE), O.b(Long.TYPE), O.b(Short.TYPE));
        f65242a = q10;
        Iterable<d> iterable = q10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (d dVar : iterable) {
            arrayList.add(C6502A.a(C6781a.c(dVar), C6781a.d(dVar)));
        }
        f65243b = mf.O.w(arrayList);
        Iterable<d> iterable2 = f65242a;
        ArrayList arrayList2 = new ArrayList(C6565s.y(iterable2, 10));
        for (d dVar2 : iterable2) {
            arrayList2.add(C6502A.a(C6781a.d(dVar2), C6781a.c(dVar2)));
        }
        f65244c = mf.O.w(arrayList2);
        Iterable q11 = C6565s.q(C6787a.class, C6798l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, C6788b.class, C6789c.class, C6790d.class, C6791e.class, C6792f.class, C6793g.class, C6794h.class, C6795i.class, C6796j.class, C6797k.class, C6799m.class, C6800n.class, C6801o.class);
        ArrayList arrayList3 = new ArrayList(C6565s.y(q11, 10));
        for (Object next : q11) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            arrayList3.add(C6502A.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f65245d = mf.O.w(arrayList3);
    }

    /* access modifiers changed from: private */
    public static final ParameterizedType a(ParameterizedType parameterizedType) {
        C6496s.h(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final h b(ParameterizedType parameterizedType) {
        C6496s.h(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C6496s.g(actualTypeArguments, "getActualTypeArguments(...)");
        return C6559l.S(actualTypeArguments);
    }

    public static final b e(Class cls) {
        b e10;
        C6496s.h(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (!cls.isArray()) {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                C6496s.g(simpleName, "getSimpleName(...)");
                if (simpleName.length() != 0) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (!(declaringClass == null || (e10 = e(declaringClass)) == null)) {
                        f i10 = f.i(cls.getSimpleName());
                        C6496s.g(i10, "identifier(...)");
                        b d10 = e10.d(i10);
                        if (d10 != null) {
                            return d10;
                        }
                    }
                    return b.f72283d.c(new c(cls.getName()));
                }
            }
            c cVar = new c(cls.getName());
            c e11 = cVar.e();
            C6496s.g(e11, "parent(...)");
            c k10 = c.k(cVar.g());
            C6496s.g(k10, "topLevel(...)");
            return new b(e11, k10, true);
        } else {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
    }

    public static final String f(Class cls) {
        C6496s.h(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name.equals(AttributeType.BOOLEAN)) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name.equals(AttributeType.FLOAT)) {
                        return "F";
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    break;
            }
            throw new IllegalArgumentException("Unsupported primitive type: " + cls);
        } else if (cls.isArray()) {
            String name2 = cls.getName();
            C6496s.g(name2, "getName(...)");
            return Sg.p.C(name2, '.', '/', false, 4, (Object) null);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('L');
            String name3 = cls.getName();
            C6496s.g(name3, "getName(...)");
            sb2.append(Sg.p.C(name3, '.', '/', false, 4, (Object) null));
            sb2.append(';');
            return sb2.toString();
        }
    }

    public static final Integer g(Class cls) {
        C6496s.h(cls, "<this>");
        return (Integer) f65245d.get(cls);
    }

    public static final List h(Type type) {
        C6496s.h(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C6565s.n();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return k.G(k.s(k.h(type, C5551d.f65240a), C5552e.f65241a));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C6496s.g(actualTypeArguments, "getActualTypeArguments(...)");
        return C6559l.n1(actualTypeArguments);
    }

    public static final Class i(Class cls) {
        C6496s.h(cls, "<this>");
        return (Class) f65243b.get(cls);
    }

    public static final ClassLoader j(Class cls) {
        C6496s.h(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        C6496s.g(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class k(Class cls) {
        C6496s.h(cls, "<this>");
        return (Class) f65244c.get(cls);
    }

    public static final boolean l(Class cls) {
        C6496s.h(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}
