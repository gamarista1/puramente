package io.intercom.android.sdk.tickets.list.ui;

import D.c;
import Y.C1500m;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketsScreenKt$TicketsScreenContent$2$1 implements r {
    final /* synthetic */ C6798l $onClick;
    final /* synthetic */ TicketsScreenUiState.Content $uiState;

    TicketsScreenKt$TicketsScreenContent$2$1(TicketsScreenUiState.Content content, C6798l lVar) {
        this.$uiState = content;
        this.$onClick = lVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$1$lambda$0(C6798l lVar, TicketRowData ticketRowData) {
        C6496s.h(ticketRowData, "$data");
        lVar.invoke(ticketRowData.getId());
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((c) obj, ((Number) obj2).intValue(), (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(D.c r10, int r11, Y.C1500m r12, int r13) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$items"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            r10 = r13 & 112(0x70, float:1.57E-43)
            if (r10 != 0) goto L_0x0015
            boolean r10 = r12.d(r11)
            if (r10 == 0) goto L_0x0012
            r10 = 32
            goto L_0x0014
        L_0x0012:
            r10 = 16
        L_0x0014:
            r13 = r13 | r10
        L_0x0015:
            r10 = r13 & 721(0x2d1, float:1.01E-42)
            r13 = 144(0x90, float:2.02E-43)
            if (r10 != r13) goto L_0x0026
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            r12.I()
            goto L_0x008a
        L_0x0026:
            io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState$Content r10 = r9.$uiState
            n3.a r10 = r10.getLazyPagingTickets()
            java.lang.Object r10 = r10.f(r11)
            r1 = r10
            io.intercom.android.sdk.tickets.list.ui.TicketRowData r1 = (io.intercom.android.sdk.tickets.list.ui.TicketRowData) r1
            if (r1 != 0) goto L_0x0036
            goto L_0x008a
        L_0x0036:
            yf.l r10 = r9.$onClick
            k0.i$a r11 = k0.i.f23074a
            r13 = 122186268(0x7486a1c, float:1.507751E-34)
            r12.T(r13)
            boolean r13 = r12.S(r10)
            boolean r0 = r12.S(r1)
            r13 = r13 | r0
            java.lang.Object r0 = r12.A()
            if (r13 != 0) goto L_0x0057
            Y.m$a r13 = Y.C1500m.f10026a
            java.lang.Object r13 = r13.a()
            if (r0 != r13) goto L_0x005f
        L_0x0057:
            io.intercom.android.sdk.tickets.list.ui.p r0 = new io.intercom.android.sdk.tickets.list.ui.p
            r0.<init>(r10, r1)
            r12.r(r0)
        L_0x005f:
            r6 = r0
            yf.a r6 = (yf.C6787a) r6
            r12.M()
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r11
            k0.i r0 = androidx.compose.foundation.d.d(r2, r3, r4, r5, r6, r7, r8)
            r5 = 0
            r6 = 12
            r2 = 0
            r4 = r12
            io.intercom.android.sdk.tickets.list.ui.TicketRowKt.TicketRow(r0, r1, r2, r3, r4, r5, r6)
            r10 = 20
            float r10 = (float) r10
            float r10 = c1.h.j(r10)
            r13 = 2
            r0 = 0
            r1 = 0
            k0.i r10 = androidx.compose.foundation.layout.n.k(r11, r10, r1, r13, r0)
            r11 = 6
            r13 = 0
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r10, r12, r11, r13)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$1.invoke(D.c, int, Y.m, int):void");
    }
}
