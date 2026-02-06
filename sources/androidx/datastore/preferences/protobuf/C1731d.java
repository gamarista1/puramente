package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d  reason: case insensitive filesystem */
abstract class C1731d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f16322a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f16323b;

    static {
        boolean z10;
        if (a("org.robolectric.Robolectric") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f16323b = z10;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f16322a;
    }

    static boolean c() {
        if (f16322a == null || f16323b) {
            return false;
        }
        return true;
    }
}
