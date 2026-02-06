package androidx.lifecycle;

import Sg.p;
import android.support.v4.media.session.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public static final A f17077a = new A();

    /* renamed from: b  reason: collision with root package name */
    private static final Map f17078b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map f17079c = new HashMap();

    private A() {
    }

    private final C1787j a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            C6496s.g(newInstance, "{\n            constructo…tance(`object`)\n        }");
            c.a(newInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) {
        String str;
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (packageR != null) {
                str = packageR.getName();
            } else {
                str = "";
            }
            C6496s.g(str, "fullPackage");
            if (str.length() != 0) {
                C6496s.g(canonicalName, "name");
                canonicalName = canonicalName.substring(str.length() + 1);
                C6496s.g(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C6496s.g(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (str.length() != 0) {
                c10 = str + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            C6496s.f(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        C6496s.h(str, "className");
        return p.D(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f17078b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class cls) {
        if (cls == null || !C1797u.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public static final C1795s f(Object obj) {
        C6496s.h(obj, "object");
        boolean z10 = obj instanceof C1795s;
        boolean z11 = obj instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new C1782e((DefaultLifecycleObserver) obj, (C1795s) obj);
        }
        if (z11) {
            return new C1782e((DefaultLifecycleObserver) obj, (C1795s) null);
        }
        if (z10) {
            return (C1795s) obj;
        }
        Class<?> cls = obj.getClass();
        A a10 = f17077a;
        if (a10.d(cls) != 2) {
            return new K(obj);
        }
        Object obj2 = f17079c.get(cls);
        C6496s.e(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            a10.a((Constructor) list.get(0), obj);
            return new Z((C1787j) null);
        }
        int size = list.size();
        C1787j[] jVarArr = new C1787j[size];
        for (int i10 = 0; i10 < size; i10++) {
            f17077a.a((Constructor) list.get(i10), obj);
            jVarArr[i10] = null;
        }
        return new C1781d(jVarArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b10 = b(cls);
        if (b10 != null) {
            f17079c.put(cls, C6565s.e(b10));
            return 2;
        } else if (C1780c.f17192c.d(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            if (e(superclass)) {
                C6496s.g(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                Object obj = f17079c.get(superclass);
                C6496s.e(obj);
                arrayList = new ArrayList((Collection) obj);
            } else {
                arrayList = null;
            }
            Class[] interfaces = cls.getInterfaces();
            C6496s.g(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    C6496s.g(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    Object obj2 = f17079c.get(cls2);
                    C6496s.e(obj2);
                    arrayList.addAll((Collection) obj2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f17079c.put(cls, arrayList);
            return 2;
        }
    }
}
