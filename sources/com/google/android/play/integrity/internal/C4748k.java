package com.google.android.play.integrity.internal;

/* renamed from: com.google.android.play.integrity.internal.k  reason: case insensitive filesystem */
public final class C4748k implements C4747j {

    /* renamed from: b  reason: collision with root package name */
    private static final C4748k f56585b = new C4748k((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final Object f56586a;

    private C4748k(Object obj) {
        this.f56586a = obj;
    }

    public static C4747j b(Object obj) {
        if (obj != null) {
            return new C4748k(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public final Object a() {
        return this.f56586a;
    }
}
