package androidx.collection;

import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.collection.n  reason: case insensitive filesystem */
public abstract class C1600n {

    /* renamed from: a  reason: collision with root package name */
    private static final C1599m f12187a = new B(0);

    public static final C1599m a(int... iArr) {
        C6496s.h(iArr, "elements");
        B b10 = new B(iArr.length);
        b10.k(iArr);
        return b10;
    }
}
