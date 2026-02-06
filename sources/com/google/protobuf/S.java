package com.google.protobuf;

abstract class S {

    /* renamed from: a  reason: collision with root package name */
    private static final P f58412a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final P f58413b = new Q();

    static P a() {
        return f58412a;
    }

    static P b() {
        return f58413b;
    }

    private static P c() {
        try {
            return (P) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
