package J;

import Q0.C1321d;
import W0.I;
import W0.a0;
import W0.c0;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I f3461a = new o0(I.f8482a.a(), 0, 0);

    public static final a0 c(c0 c0Var, C1321d dVar) {
        a0 a10 = c0Var.a(dVar);
        f(a10, dVar.length(), 0, 2, (Object) null);
        return new a0(a10.b(), new o0(a10.a(), dVar.length(), a10.b().length()));
    }

    public static final I d() {
        return f3461a;
    }

    public static final void e(a0 a0Var, int i10, int i11) {
        int length = a0Var.b().length();
        int min = Math.min(i10, i11);
        for (int i12 = 0; i12 < min; i12++) {
            g(a0Var.a().b(i12), length, i12);
        }
        g(a0Var.a().b(i10), length, i10);
        int min2 = Math.min(length, i11);
        for (int i13 = 0; i13 < min2; i13++) {
            h(a0Var.a().a(i13), i10, i13);
        }
        h(a0Var.a().a(length), i10, length);
    }

    public static /* synthetic */ void f(a0 a0Var, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        e(a0Var, i10, i11);
    }

    /* access modifiers changed from: private */
    public static final void g(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']').toString());
        }
    }

    /* access modifiers changed from: private */
    public static final void h(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']').toString());
        }
    }
}
