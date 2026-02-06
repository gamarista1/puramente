package J;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;
import yf.q;

/* renamed from: J.f  reason: case insensitive filesystem */
public final class C1210f {

    /* renamed from: a  reason: collision with root package name */
    public static final C1210f f3166a = new C1210f();

    /* renamed from: b  reason: collision with root package name */
    public static q f3167b = c.c(671295101, false, a.f3168a);

    /* renamed from: J.f$a */
    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3168a = new a();

        a() {
            super(3);
        }

        public final void a(p pVar, C1500m mVar, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                if (mVar.C(pVar)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                i10 |= i11;
            }
            if ((i10 & 19) != 18 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(671295101, i10, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:219)");
                }
                pVar.invoke(mVar, Integer.valueOf(i10 & 14));
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((p) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    public final q a() {
        return f3167b;
    }
}
