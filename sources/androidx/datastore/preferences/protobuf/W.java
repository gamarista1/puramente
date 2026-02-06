package androidx.datastore.preferences.protobuf;

abstract class W {

    /* renamed from: a  reason: collision with root package name */
    private static final U f16305a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final U f16306b = new V();

    static U a() {
        return f16305a;
    }

    static U b() {
        return f16306b;
    }

    private static U c() {
        try {
            return (U) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
