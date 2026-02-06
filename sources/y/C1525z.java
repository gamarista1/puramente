package Y;

import g0.e;
import g0.f;
import kotlin.jvm.internal.C6496s;

/* renamed from: Y.z  reason: case insensitive filesystem */
public abstract class C1525z {
    public static final boolean a(B0 b02, C1517v vVar) {
        C6496s.f(vVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return b02.containsKey(vVar);
    }

    public static final Object b(B0 b02, C1517v vVar) {
        C6496s.f(vVar, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = b02.get(vVar);
        if (obj == null) {
            obj = vVar.a();
        }
        return ((G1) obj).a(b02);
    }

    public static final B0 c(J0[] j0Arr, B0 b02, B0 b03) {
        e.a x10 = f.a().builder();
        for (J0 j02 : j0Arr) {
            C1517v b10 = j02.b();
            C6496s.f(b10, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            I0 i02 = (I0) b10;
            if (j02.a() || !a(b02, i02)) {
                C6496s.f(j02, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                x10.put(i02, i02.b(j02, (G1) b03.get(i02)));
            }
        }
        return x10.f();
    }

    public static /* synthetic */ B0 d(J0[] j0Arr, B0 b02, B0 b03, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            b03 = f.a();
        }
        return c(j0Arr, b02, b03);
    }
}
