package androidx.datastore.preferences.protobuf;

public enum A {
    VOID(Void.class, Void.class, (Class) null),
    INT(r0, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C1734g.class, C1734g.class, C1734g.f16324b),
    ENUM(r0, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: a  reason: collision with root package name */
    private final Class f16258a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f16259b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f16260c;

    private A(Class cls, Class cls2, Object obj) {
        this.f16258a = cls;
        this.f16259b = cls2;
        this.f16260c = obj;
    }

    public Class a() {
        return this.f16259b;
    }
}
