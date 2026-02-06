package androidx.datastore.preferences.protobuf;

abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final C1743p f16445a = new C1744q();

    /* renamed from: b  reason: collision with root package name */
    private static final C1743p f16446b = c();

    static C1743p a() {
        C1743p pVar = f16446b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static C1743p b() {
        return f16445a;
    }

    private static C1743p c() {
        try {
            return (C1743p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
