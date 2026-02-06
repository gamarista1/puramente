package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n  reason: case insensitive filesystem */
abstract class C1741n {

    /* renamed from: a  reason: collision with root package name */
    static final Class f16405a = c();

    public static C1742o a() {
        if (f16405a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C1742o.f16409e;
    }

    private static final C1742o b(String str) {
        return (C1742o) f16405a.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
