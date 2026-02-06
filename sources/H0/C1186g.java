package H0;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

/* renamed from: H0.g  reason: case insensitive filesystem */
public final class C1186g {

    /* renamed from: a  reason: collision with root package name */
    public static final C1186g f2605a = new C1186g();

    /* renamed from: b  reason: collision with root package name */
    public static p f2606b = c.c(-1741544742, false, a.f2607a);

    /* renamed from: H0.g$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2607a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1741544742, i10, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:473)");
                }
                if (C1506p.H()) {
                    C1506p.P();
                    return;
                }
                return;
            }
            mVar.I();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public final p a() {
        return f2606b;
    }
}
