package io.intercom.android.sdk.tickets.list.ui;

import M0.e;
import V.V;
import Y.C1500m;
import androidx.compose.foundation.layout.n;
import c1.h;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketRowKt$TicketRow$1$1 implements p {
    final /* synthetic */ TicketRowData $data;

    TicketRowKt$TicketRow$1$1(TicketRowData ticketRowData) {
        this.$data = ticketRowData;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            V.a(e.c(this.$data.getStatus().getIconRes(), mVar, 0), (String) null, n.i(i.f23074a, h.j((float) 8)), this.$data.getStatus().m537getColor0d7_KjU(), mVar, 440, 0);
            return;
        }
        mVar.I();
    }
}
