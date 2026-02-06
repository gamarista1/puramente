package k0;

public abstract class b {
    public static final boolean a(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    public static final Object b(Object obj) {
        return obj.getClass();
    }
}
