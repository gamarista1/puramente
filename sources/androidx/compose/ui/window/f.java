package androidx.compose.ui.window;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f14270a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static p f14271b = c.c(210148896, false, a.f14272a);

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14272a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(210148896, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt.lambda-1.<anonymous> (AndroidDialog.android.kt:227)");
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
        return f14271b;
    }
}
