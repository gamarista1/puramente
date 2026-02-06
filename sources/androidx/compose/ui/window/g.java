package androidx.compose.ui.window;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f14273a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static p f14274b = c.c(-1131826196, false, a.f14275a);

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14275a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1131826196, i10, -1, "androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt.lambda-1.<anonymous> (AndroidPopup.android.kt:555)");
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
        return f14274b;
    }
}
