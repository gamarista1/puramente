package b2;

import androidx.lifecycle.a0;
import kotlin.jvm.internal.C6496s;

/* renamed from: b2.d  reason: case insensitive filesystem */
public final class C1880d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1880d f19160a = new C1880d();

    private C1880d() {
    }

    public final a0 a(Class cls) {
        C6496s.h(cls, "modelClass");
        try {
            Object newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            C6496s.g(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (a0) newInstance;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
