package androidx.fragment.app;

import androidx.collection.Y;
import androidx.fragment.app.C1769q;

/* renamed from: androidx.fragment.app.z  reason: case insensitive filesystem */
public abstract class C1777z {

    /* renamed from: a  reason: collision with root package name */
    private static final Y f17075a = new Y();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return C1769q.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) {
        Y y10 = f17075a;
        Y y11 = (Y) y10.get(classLoader);
        if (y11 == null) {
            y11 = new Y();
            y10.put(classLoader, y11);
        }
        Class cls = (Class) y11.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        y11.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e10) {
            throw new C1769q.l("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        } catch (ClassCastException e11) {
            throw new C1769q.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e11);
        }
    }

    public abstract C1769q a(ClassLoader classLoader, String str);
}
