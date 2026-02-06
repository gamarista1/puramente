package com.facebook.react.uimanager;

public final class T {

    /* renamed from: a  reason: collision with root package name */
    public static final T f41550a = new T();

    /* renamed from: b  reason: collision with root package name */
    private static int f41551b = 1;

    private T() {
    }

    public static final synchronized int a() {
        int i10;
        synchronized (T.class) {
            i10 = f41551b;
            f41551b = i10 + 10;
        }
        return i10;
    }
}
