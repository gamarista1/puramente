package de;

import java.io.ObjectStreamClass;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C6496s;

public interface i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60063a = a.f60064a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f60064a = new a();

        private a() {
        }

        /* access modifiers changed from: private */
        public static final Object e(Method method, Class cls, int i10) {
            return method.invoke((Object) null, new Object[]{cls, Integer.valueOf(i10)});
        }

        /* access modifiers changed from: private */
        public static final Object f(Method method, Object obj, Class cls) {
            return method.invoke(obj, new Object[]{cls});
        }

        /* access modifiers changed from: private */
        public static final Object g(Class cls) {
            throw new IllegalArgumentException("Cannot allocate " + cls);
        }

        public final i d(Class cls) {
            Class<ObjectStreamClass> cls2 = ObjectStreamClass.class;
            Class<Class> cls3 = Class.class;
            C6496s.h(cls, "clazz");
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getConstructorId", new Class[]{cls3});
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke((Object) null, new Object[]{Object.class});
                C6496s.f(invoke, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) invoke).intValue();
                Method declaredMethod2 = cls2.getDeclaredMethod("newInstance", new Class[]{cls3, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new f(declaredMethod2, cls, intValue);
            } catch (Throwable unused) {
                return new h(cls);
            }
        }
    }

    Object b();
}
