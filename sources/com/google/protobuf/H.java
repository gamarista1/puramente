package com.google.protobuf;

abstract class H {

    /* renamed from: a  reason: collision with root package name */
    private static final F f58386a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final F f58387b = new G();

    static F a() {
        return f58386a;
    }

    static F b() {
        return f58387b;
    }

    private static F c() {
        try {
            return (F) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
