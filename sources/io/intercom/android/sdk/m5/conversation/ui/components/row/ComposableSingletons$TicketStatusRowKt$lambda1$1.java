package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import c1.h;
import io.intercom.android.sdk.metrics.MetricTracker;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$TicketStatusRowKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TicketStatusRowKt$lambda1$1 implements p {
    public static final ComposableSingletons$TicketStatusRowKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketStatusRowKt$lambda1$1();

    ComposableSingletons$TicketStatusRowKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            C1085c.f n10 = C1085c.f882a.n(h.j((float) 12));
            i.a aVar = i.f23074a;
            F a10 = C1090h.a(n10, c.f23044a.k(), mVar, 6);
            int a11 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar2.c());
            F1.b(a13, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            C1500m mVar2 = mVar;
            TicketStatusRowKt.TicketStatusRow(MetricTracker.Action.SUBMITTED, "Submitted", "Just now", (i) null, (String) null, (String) null, mVar2, 438, 56);
            TicketStatusRowKt.TicketStatusRow("in_progress", "In progress", "Just now", (i) null, (String) null, (String) null, mVar2, 438, 56);
            TicketStatusRowKt.TicketStatusRow("waiting_on_customer", "Waiting on you", "Just now", (i) null, (String) null, (String) null, mVar2, 438, 56);
            TicketStatusRowKt.TicketStatusRow("resolved", "Resolved", "Just now", (i) null, (String) null, (String) null, mVar2, 438, 56);
            TicketStatusRowKt.TicketStatusRow("resolved", "Resolved", "Just now", (i) null, "This is custom resolved state", "This is custom state prefix", mVar2, 221622, 8);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
