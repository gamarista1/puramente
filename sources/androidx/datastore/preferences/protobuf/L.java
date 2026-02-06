package androidx.datastore.preferences.protobuf;

abstract class L {

    /* renamed from: a  reason: collision with root package name */
    private static final J f16280a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final J f16281b = new K();

    static J a() {
        return f16280a;
    }

    static J b() {
        return f16281b;
    }

    private static J c() {
        try {
            return (J) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
