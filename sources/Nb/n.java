package nb;

abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final m f61098a = b();

    private static final class b implements m {
        private b() {
        }
    }

    static String a(String str) {
        if (c(str)) {
            return null;
        }
        return str;
    }

    private static m b() {
        return new b();
    }

    static boolean c(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }
}
