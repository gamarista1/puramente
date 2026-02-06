package com.google.protobuf;

/* renamed from: com.google.protobuf.q  reason: case insensitive filesystem */
class C4879q implements J {

    /* renamed from: a  reason: collision with root package name */
    private static final C4879q f58646a = new C4879q();

    private C4879q() {
    }

    public static C4879q c() {
        return f58646a;
    }

    public I a(Class cls) {
        Class<r> cls2 = r.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (I) r.A(cls.asSubclass(cls2)).p();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
    }

    public boolean b(Class cls) {
        return r.class.isAssignableFrom(cls);
    }
}
