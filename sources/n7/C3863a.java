package n7;

/* renamed from: n7.a  reason: case insensitive filesystem */
public abstract class C3863a {
    public static void a(boolean z10) {
        if (!z10) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z10, String str) {
        if (!z10) {
            throw new AssertionError(str);
        }
    }

    public static Object c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError();
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError(str);
    }

    public static Object e(Object obj) {
        return obj;
    }

    public static Object f(Object obj, String str) {
        return obj;
    }
}
