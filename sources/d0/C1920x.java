package d0;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

/* renamed from: d0.x  reason: case insensitive filesystem */
public abstract class C1920x {
    public static final int f(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    /* access modifiers changed from: private */
    public static final Object[] g(Object[] objArr, int i10, Object obj, Object obj2) {
        Object[] objArr2 = new Object[(objArr.length + 2)];
        C6559l.q(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C6559l.m(objArr, objArr2, i10 + 2, i10, objArr.length);
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[(objArr.length - 2)];
        C6559l.q(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C6559l.m(objArr, objArr2, i10, i10 + 2, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C6559l.q(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C6559l.m(objArr, objArr2, i10, i10 + 1, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i10, int i11, C1916t tVar) {
        Object[] objArr2 = new Object[(objArr.length - 1)];
        C6559l.q(objArr, objArr2, 0, 0, i10, 6, (Object) null);
        C6559l.m(objArr, objArr2, i10, i10 + 2, i11);
        objArr2[i11 - 2] = tVar;
        C6559l.m(objArr, objArr2, i11 - 1, i11, objArr.length);
        return objArr2;
    }

    /* access modifiers changed from: private */
    public static final Object[] k(Object[] objArr, int i10, int i11, Object obj, Object obj2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        C6559l.m(copyOf, copyOf, i10 + 2, i10 + 1, objArr.length);
        C6559l.m(copyOf, copyOf, i11 + 2, i11, i10);
        copyOf[i11] = obj;
        copyOf[i11 + 1] = obj2;
        return copyOf;
    }
}
