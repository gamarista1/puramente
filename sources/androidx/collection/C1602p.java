package androidx.collection;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.collection.p  reason: case insensitive filesystem */
public abstract class C1602p {

    /* renamed from: a  reason: collision with root package name */
    private static final C f12193a = new C(0);

    public static final C1601o a() {
        C c10 = f12193a;
        C6496s.f(c10, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return c10;
    }

    public static final C b() {
        return new C(0, 1, (DefaultConstructorMarker) null);
    }

    public static final C c(int i10, Object obj, int i11, Object obj2, int i12, Object obj3) {
        C c10 = new C(0, 1, (DefaultConstructorMarker) null);
        c10.t(i10, obj);
        c10.t(i11, obj2);
        c10.t(i12, obj3);
        return c10;
    }
}
