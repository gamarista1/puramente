package a9;

/* renamed from: a9.d  reason: case insensitive filesystem */
public abstract class C3144d {
    public static void a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
