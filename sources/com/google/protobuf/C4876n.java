package com.google.protobuf;

/* renamed from: com.google.protobuf.n  reason: case insensitive filesystem */
abstract class C4876n {

    /* renamed from: a  reason: collision with root package name */
    private static final C4874l f58568a = new C4875m();

    /* renamed from: b  reason: collision with root package name */
    private static final C4874l f58569b = c();

    static C4874l a() {
        C4874l lVar = f58569b;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static C4874l b() {
        return f58568a;
    }

    private static C4874l c() {
        try {
            return (C4874l) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
