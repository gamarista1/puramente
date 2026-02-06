package io.intercom.android.sdk.tickets.list.ui;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.N;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.layout.n;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.tickets.list.ui.ComposableSingletons$TicketRowKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$TicketRowKt$lambda1$1 implements p {
    public static final ComposableSingletons$TicketRowKt$lambda1$1 INSTANCE = new ComposableSingletons$TicketRowKt$lambda1$1();

    ComposableSingletons$TicketRowKt$lambda1$1() {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i.a aVar = i.f23074a;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
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
            mVar2.T(-1850249373);
            for (TicketRowData TicketRow : C6565s.q(new TicketRowData("123", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "#123 • Waiting on you", TicketStatus.WaitingOnCustomer, true), new TicketRowData("321", "Bug", "#123456789012345678901234567890 • Submitted", TicketStatus.Submitted, true), new TicketRowData("456", "Address change", "In progress", TicketStatus.InProgress, false), new TicketRowData("654", "Can’t download from dashboard request ", "Resolved", TicketStatus.Resolved, true))) {
                TicketRowKt.TicketRow((i) null, TicketRow, (N) null, false, mVar, 0, 13);
                IntercomDividerKt.IntercomDivider(n.k(i.f23074a, c1.h.j((float) 20), 0.0f, 2, (Object) null), mVar2, 6, 0);
            }
            mVar.M();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
