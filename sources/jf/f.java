package Jf;

import Ff.d;
import If.Y0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.O;
import lf.C6531o;
import mf.C6559l;
import mf.C6565s;
import xf.C6781a;

public abstract class f {
    public static final Object g(Class cls, Map map, List list) {
        C6496s.h(cls, "annotationClass");
        C6496s.h(map, "values");
        C6496s.h(list, "methods");
        Lazy b10 = C6531o.b(new b(map));
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new d(cls, map, C6531o.b(new c(cls, map)), b10, list));
        C6496s.f(newProxyInstance, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return newProxyInstance;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Iterable<String> keySet = map.keySet();
            ArrayList arrayList = new ArrayList(C6565s.y(keySet, 10));
            for (String declaredMethod : keySet) {
                arrayList.add(cls.getDeclaredMethod(declaredMethod, (Class[]) null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    private static final boolean i(Class cls, List list, Map map, Object obj) {
        Annotation annotation;
        Class cls2;
        boolean z10;
        boolean z11;
        d a10;
        if (obj instanceof Annotation) {
            annotation = (Annotation) obj;
        } else {
            annotation = null;
        }
        if (annotation == null || (a10 = C6781a.a(annotation)) == null) {
            cls2 = null;
        } else {
            cls2 = C6781a.b(a10);
        }
        if (!C6496s.c(cls2, cls)) {
            return false;
        }
        Iterable iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Method method = (Method) it.next();
                Object obj2 = map.get(method.getName());
                Object invoke = method.invoke(obj, (Object[]) null);
                if (obj2 instanceof boolean[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    z11 = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                    continue;
                } else if (obj2 instanceof char[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                    z11 = Arrays.equals((char[]) obj2, (char[]) invoke);
                    continue;
                } else if (obj2 instanceof byte[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    z11 = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                    continue;
                } else if (obj2 instanceof short[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    z11 = Arrays.equals((short[]) obj2, (short[]) invoke);
                    continue;
                } else if (obj2 instanceof int[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                    z11 = Arrays.equals((int[]) obj2, (int[]) invoke);
                    continue;
                } else if (obj2 instanceof float[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    z11 = Arrays.equals((float[]) obj2, (float[]) invoke);
                    continue;
                } else if (obj2 instanceof long[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                    z11 = Arrays.equals((long[]) obj2, (long[]) invoke);
                    continue;
                } else if (obj2 instanceof double[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    z11 = Arrays.equals((double[]) obj2, (double[]) invoke);
                    continue;
                } else if (obj2 instanceof Object[]) {
                    C6496s.f(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    z11 = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                    continue;
                } else {
                    z11 = C6496s.c(obj2, invoke);
                    continue;
                }
                if (!z11) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final int j(Map map) {
        int i10;
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                i10 = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                i10 = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                i10 = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                i10 = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                i10 = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                i10 = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                i10 = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                i10 = Arrays.hashCode((double[]) value);
            } else if (value instanceof Object[]) {
                i10 = Arrays.hashCode((Object[]) value);
            } else {
                i10 = value.hashCode();
            }
            i11 += i10 ^ (str.hashCode() * 127);
        }
        return i11;
    }

    private static final int k(Lazy lazy) {
        return ((Number) lazy.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public static final String l(Class cls, Map map) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        C6565s.v0(map.entrySet(), sb2, ", ", "(", ")", 0, (CharSequence) null, e.f63801a, 48, (Object) null);
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    /* access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String str;
        C6496s.h(entry, "entry");
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
            C6496s.g(str, "toString(...)");
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
            C6496s.g(str, "toString(...)");
        } else {
            str = value.toString();
        }
        return str2 + '=' + str;
    }

    private static final String n(Lazy lazy) {
        return (String) lazy.getValue();
    }

    /* access modifiers changed from: private */
    public static final Object o(Class cls, Map map, Lazy lazy, Lazy lazy2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(lazy2));
                }
            } else if (name.equals("toString")) {
                return n(lazy);
            }
        }
        if (C6496s.c(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, C6559l.Z0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(C6559l.n1(objArr));
        sb2.append(')');
        throw new Y0(sb2.toString());
    }

    /* access modifiers changed from: private */
    public static final Void p(int i10, String str, Class cls) {
        d dVar;
        String str2;
        Class<Class> cls2 = Class.class;
        if (C6496s.c(cls, cls2)) {
            dVar = O.b(d.class);
        } else if (!cls.isArray() || !C6496s.c(cls.getComponentType(), cls2)) {
            dVar = C6781a.e(cls);
        } else {
            dVar = O.b(d[].class);
        }
        if (C6496s.c(dVar.v(), O.b(Object[].class).v())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dVar.v());
            sb2.append('<');
            Class<?> componentType = C6781a.b(dVar).getComponentType();
            C6496s.g(componentType, "getComponentType(...)");
            sb2.append(C6781a.e(componentType).v());
            sb2.append('>');
            str2 = sb2.toString();
        } else {
            str2 = dVar.v();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + str2);
    }

    /* access modifiers changed from: private */
    public static final Object q(Object obj, Class cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof d) {
            obj = C6781a.b((d) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof d[]) {
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                d[] dVarArr = (d[]) obj;
                ArrayList arrayList = new ArrayList(dVarArr.length);
                for (d b10 : dVarArr) {
                    arrayList.add(C6781a.b(b10));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
