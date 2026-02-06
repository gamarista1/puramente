package Pc;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final I f52196a = c();

    class a extends I {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f52197b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f52198c;

        a(Method method, Object obj) {
            this.f52197b = method;
            this.f52198c = obj;
        }

        public Object d(Class cls) {
            I.b(cls);
            return this.f52197b.invoke(this.f52198c, new Object[]{cls});
        }
    }

    class b extends I {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f52199b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f52200c;

        b(Method method, int i10) {
            this.f52199b = method;
            this.f52200c = i10;
        }

        public Object d(Class cls) {
            I.b(cls);
            return this.f52199b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f52200c)});
        }
    }

    class c extends I {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Method f52201b;

        c(Method method) {
            this.f52201b = method;
        }

        public Object d(Class cls) {
            I.b(cls);
            return this.f52201b.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    class d extends I {
        d() {
        }

        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* access modifiers changed from: private */
    public static void b(Class cls) {
        String t10 = t.t(cls);
        if (t10 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + t10);
        }
    }

    private static I c() {
        Class<ObjectStreamClass> cls = ObjectStreamClass.class;
        Class<Class> cls2 = Class.class;
        try {
            Class<?> cls3 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls3.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls3.getMethod("allocateInstance", new Class[]{cls2}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getConstructorId", new Class[]{cls2});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = cls.getDeclaredMethod("newInstance", new Class[]{cls2, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{cls2, cls2});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract Object d(Class cls);
}
