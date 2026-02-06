package com.google.protobuf;

/* renamed from: com.google.protobuf.d  reason: case insensitive filesystem */
abstract class C4866d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f58454a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class f58455b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f58456c;

    static {
        boolean z10;
        if (f58454a || a("org.robolectric.Robolectric") == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        f58456c = z10;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f58455b;
    }

    static boolean c() {
        if (f58454a || (f58455b != null && !f58456c)) {
            return true;
        }
        return false;
    }
}
