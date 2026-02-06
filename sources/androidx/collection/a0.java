package androidx.collection;

import kotlin.jvm.internal.C6496s;
import u.C2664a;

public abstract class a0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Object f12156a = new Object();

    public static final Object c(Z z10, int i10) {
        Object obj;
        C6496s.h(z10, "<this>");
        int a10 = C2664a.a(z10.f12141b, z10.f12143d, i10);
        if (a10 < 0 || (obj = z10.f12142c[a10]) == f12156a) {
            return null;
        }
        return obj;
    }

    /* access modifiers changed from: private */
    public static final void d(Z z10) {
        int i10 = z10.f12143d;
        int[] iArr = z10.f12141b;
        Object[] objArr = z10.f12142c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f12156a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        z10.f12140a = false;
        z10.f12143d = i11;
    }
}
