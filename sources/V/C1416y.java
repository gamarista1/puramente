package V;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import k0.i;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import r0.g2;
import yf.q;

/* renamed from: V.y  reason: case insensitive filesystem */
public final class C1416y {

    /* renamed from: a  reason: collision with root package name */
    public static final C1416y f8146a = new C1416y();

    /* renamed from: b  reason: collision with root package name */
    public static q f8147b = c.c(818736383, false, a.f8148a);

    /* renamed from: V.y$a */
    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8148a = new a();

        a() {
            super(3);
        }

        public final void a(G0 g02, C1500m mVar, int i10) {
            int i11;
            int i12;
            if ((i10 & 6) == 0) {
                if (mVar.S(g02)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i10 | i12;
            } else {
                G0 g03 = g02;
                C1500m mVar2 = mVar;
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(818736383, i11, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:220)");
                }
                L0.d(g02, (i) null, false, (g2) null, 0, 0, 0, 0, 0, mVar, i11 & 14, 510);
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((G0) obj, (C1500m) obj2, ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    public final q a() {
        return f8147b;
    }
}
