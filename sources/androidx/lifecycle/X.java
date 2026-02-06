package androidx.lifecycle;

import android.app.Application;
import io.branch.rnbranch.RNBranchModule;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import mf.C6565s;

public abstract class X {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final List f17180a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final List f17181b;

    static {
        Class<P> cls = P.class;
        f17180a = C6565s.q(Application.class, cls);
        f17181b = C6565s.e(cls);
    }

    public static final Constructor c(Class cls, List list) {
        C6496s.h(cls, "modelClass");
        C6496s.h(list, "signature");
        Constructor[] constructors = cls.getConstructors();
        C6496s.g(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (i10 < length) {
            Constructor constructor = constructors[i10];
            Class[] parameterTypes = constructor.getParameterTypes();
            C6496s.g(parameterTypes, "constructor.parameterTypes");
            List n12 = C6559l.n1(parameterTypes);
            if (C6496s.c(list, n12)) {
                C6496s.f(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            } else if (list.size() != n12.size() || !n12.containsAll(list)) {
                i10++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final a0 d(Class cls, Constructor constructor, Object... objArr) {
        C6496s.h(cls, "modelClass");
        C6496s.h(constructor, "constructor");
        C6496s.h(objArr, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
        try {
            return (a0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
