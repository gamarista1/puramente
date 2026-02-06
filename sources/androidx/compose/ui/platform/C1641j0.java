package androidx.compose.ui.platform;

import Y.C1500m;
import Y.C1506p;
import g0.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

/* renamed from: androidx.compose.ui.platform.j0  reason: case insensitive filesystem */
public final class C1641j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1641j0 f13759a = new C1641j0();

    /* renamed from: b  reason: collision with root package name */
    public static p f13760b = c.c(-1759434350, false, a.f13761a);

    /* renamed from: androidx.compose.ui.platform.j0$a */
    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13761a = new a();

        a() {
            super(2);
        }

        public final void a(C1500m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.i()) {
                if (C1506p.H()) {
                    C1506p.Q(-1759434350, i10, -1, "androidx.compose.ui.platform.ComposableSingletons$Wrapper_androidKt.lambda-1.<anonymous> (Wrapper.android.kt:120)");
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
        return f13760b;
    }
}
