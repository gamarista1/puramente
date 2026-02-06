package w;

import kotlin.jvm.internal.C6496s;

/* renamed from: w.r  reason: case insensitive filesystem */
public abstract class C2806r {
    public static final C2801m a(float f10) {
        return new C2801m(f10);
    }

    public static final C2802n b(float f10, float f11) {
        return new C2802n(f10, f11);
    }

    public static final C2803o c(float f10, float f11, float f12) {
        return new C2803o(f10, f11, f12);
    }

    public static final C2804p d(float f10, float f11, float f12, float f13) {
        return new C2804p(f10, f11, f12, f13);
    }

    public static final C2805q e(C2805q qVar) {
        C2805q g10 = g(qVar);
        int b10 = g10.b();
        for (int i10 = 0; i10 < b10; i10++) {
            g10.e(i10, qVar.a(i10));
        }
        return g10;
    }

    public static final void f(C2805q qVar, C2805q qVar2) {
        int b10 = qVar.b();
        for (int i10 = 0; i10 < b10; i10++) {
            qVar.e(i10, qVar2.a(i10));
        }
    }

    public static final C2805q g(C2805q qVar) {
        C2805q c10 = qVar.c();
        C6496s.f(c10, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c10;
    }
}
