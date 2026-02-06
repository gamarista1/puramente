package mf;

import java.lang.reflect.Array;
import kotlin.jvm.internal.C6496s;

/* renamed from: mf.m  reason: case insensitive filesystem */
abstract class C6560m {
    public static final Object[] a(Object[] objArr, int i10) {
        C6496s.h(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
        C6496s.f(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }

    public static final void b(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
        }
    }
}
