package com.google.protobuf;

/* renamed from: com.google.protobuf.w  reason: case insensitive filesystem */
public enum C4884w {
    VOID(Void.class, Void.class, (Class) null),
    INT(r4, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(C4868f.class, C4868f.class, C4868f.f58458b),
    ENUM(r4, Integer.class, (Class) null),
    MESSAGE(Object.class, Object.class, (Class) null);
    

    /* renamed from: a  reason: collision with root package name */
    private final Class f58679a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f58680b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f58681c;

    private C4884w(Class cls, Class cls2, Object obj) {
        this.f58679a = cls;
        this.f58680b = cls2;
        this.f58681c = obj;
    }

    public Class b() {
        return this.f58680b;
    }
}
