package androidx.lifecycle;

import androidx.lifecycle.C1790m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
final class C1780c {

    /* renamed from: c  reason: collision with root package name */
    static C1780c f17192c = new C1780c();

    /* renamed from: a  reason: collision with root package name */
    private final Map f17193a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map f17194b = new HashMap();

    /* renamed from: androidx.lifecycle.c$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final Map f17195a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map f17196b;

        a(Map map) {
            this.f17196b = map;
            for (Map.Entry entry : map.entrySet()) {
                C1790m.a aVar = (C1790m.a) entry.getValue();
                List list = (List) this.f17195a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f17195a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        private static void b(List list, C1798v vVar, C1790m.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(vVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(C1798v vVar, C1790m.a aVar, Object obj) {
            b((List) this.f17195a.get(aVar), vVar, aVar, obj);
            b((List) this.f17195a.get(C1790m.a.ON_ANY), vVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.c$b */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f17197a;

        /* renamed from: b  reason: collision with root package name */
        final Method f17198b;

        b(int i10, Method method) {
            this.f17197a = i10;
            this.f17198b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(C1798v vVar, C1790m.a aVar, Object obj) {
            try {
                int i10 = this.f17197a;
                if (i10 == 0) {
                    this.f17198b.invoke(obj, (Object[]) null);
                } else if (i10 == 1) {
                    this.f17198b.invoke(obj, new Object[]{vVar});
                } else if (i10 == 2) {
                    this.f17198b.invoke(obj, new Object[]{vVar, aVar});
                }
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f17197a != bVar.f17197a || !this.f17198b.getName().equals(bVar.f17198b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f17197a * 31) + this.f17198b.getName().hashCode();
        }
    }

    C1780c() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a c10;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c10 = c(superclass)) == null)) {
            hashMap.putAll(c10.f17196b);
        }
        for (Class c11 : cls.getInterfaces()) {
            for (Map.Entry entry : c(c11).f17196b.entrySet()) {
                e(hashMap, (b) entry.getKey(), (C1790m.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            F f10 = (F) method.getAnnotation(F.class);
            if (f10 != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (C1798v.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1790m.a value = f10.value();
                if (parameterTypes.length > 1) {
                    if (!C1790m.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1790m.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i10, method), value, cls);
                    z10 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.f17193a.put(cls, aVar);
        this.f17194b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, C1790m.a aVar, Class cls) {
        C1790m.a aVar2 = (C1790m.a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f17198b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public a c(Class cls) {
        a aVar = (a) this.f17193a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f17194b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method annotation : b10) {
            if (((F) annotation.getAnnotation(F.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f17194b.put(cls, Boolean.FALSE);
        return false;
    }
}
