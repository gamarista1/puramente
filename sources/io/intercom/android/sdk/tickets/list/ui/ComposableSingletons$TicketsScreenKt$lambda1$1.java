package io.intercom.android.sdk.tickets.list.ui;

import D.c;
import H0.F;
import J0.C1241g;
import V.C1400p0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketsScreenKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TicketsScreenKt$lambda1$1 implements q {
    public static final ComposableSingletons$TicketsScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketsScreenKt$lambda1$1();

    ComposableSingletons$TicketsScreenKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((c) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(c cVar, C1500m mVar, int i10) {
        C6496s.h(cVar, "$this$item");
        if ((i10 & 81) != 16 || !mVar.i()) {
            i h10 = androidx.compose.foundation.layout.q.h(n.k(i.f23074a, 0.0f, h.j((float) 16), 1, (Object) null), 0.0f, 1, (Object) null);
            F h11 = d.h(k0.c.f23044a.e(), false);
            int a10 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar, h10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, h11, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            f fVar = f.f12848a;
            C1400p0.a((i) null, IntercomTheme.INSTANCE.getColors(mVar, IntercomTheme.$stable).m673getActionContrastWhite0d7_KjU(), 0.0f, 0, 0, mVar, 0, 29);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
