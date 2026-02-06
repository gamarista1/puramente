package com.google.protobuf;

/* renamed from: com.google.protobuf.j  reason: case insensitive filesystem */
abstract class C4872j {

    /* renamed from: a  reason: collision with root package name */
    static final Class f58496a = c();

    public static C4873k a() {
        C4873k b10 = b("getEmptyRegistry");
        if (b10 != null) {
            return b10;
        }
        return C4873k.f58505d;
    }

    private static final C4873k b(String str) {
        Class cls = f58496a;
        if (cls == null) {
            return null;
        }
        try {
            return (C4873k) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
