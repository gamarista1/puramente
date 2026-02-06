package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.v  reason: case insensitive filesystem */
class C1748v implements N {

    /* renamed from: a  reason: collision with root package name */
    private static final C1748v f16559a = new C1748v();

    private C1748v() {
    }

    public static C1748v c() {
        return f16559a;
    }

    public M a(Class cls) {
        Class<C1749w> cls2 = C1749w.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (M) C1749w.t(cls.asSubclass(cls2)).l();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }

    public boolean b(Class cls) {
        return C1749w.class.isAssignableFrom(cls);
    }
}
