package W;

import Y.C1500m;
import Y.C1506p;
import kotlin.jvm.internal.C6498u;
import w.C2762F;
import w.C2763G;
import w.C2798j;
import w.n0;
import yf.q;

public final class C extends C6498u implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final C f8259a = new C();

    public C() {
        super(3);
    }

    public final C2763G a(n0.b bVar, C1500m mVar, int i10) {
        C2763G g10;
        mVar.T(-1154662212);
        if (C1506p.H()) {
            C1506p.Q(-1154662212, i10, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:367)");
        }
        m mVar2 = m.Focused;
        m mVar3 = m.UnfocusedEmpty;
        if (bVar.g(mVar2, mVar3)) {
            g10 = C2798j.j(67, 0, C2762F.e(), 2, (Object) null);
        } else if (bVar.g(mVar3, mVar2) || bVar.g(m.UnfocusedNotEmpty, mVar3)) {
            g10 = C2798j.i(83, 67, C2762F.e());
        } else {
            g10 = C2798j.h(0.0f, 0.0f, (Object) null, 7, (Object) null);
        }
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.M();
        return g10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a((n0.b) obj, (C1500m) obj2, ((Number) obj3).intValue());
    }
}
