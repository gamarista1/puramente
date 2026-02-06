package io.intercom.android.sdk.m5.components;

import V.O0;
import Y.C1500m;
import androidx.compose.foundation.layout.q;
import k0.c;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class TicketHeaderKt$TicketHeaderLongTextPreview$1 implements p {
    final /* synthetic */ TicketStatusHeaderArgs $args;

    TicketHeaderKt$TicketHeaderLongTextPreview$1(TicketStatusHeaderArgs ticketStatusHeaderArgs) {
        this.$args = ticketStatusHeaderArgs;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            i x10 = q.x(i.f23074a, (c) null, false, 3, (Object) null);
            final TicketStatusHeaderArgs ticketStatusHeaderArgs = this.$args;
            C1500m mVar2 = mVar;
            O0.a(x10, (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, g0.c.e(-177489460, true, new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        TicketHeaderKt.TicketHeader((i) null, ticketStatusHeaderArgs, mVar, 0, 1);
                    } else {
                        mVar.I();
                    }
                }
            }, mVar2, 54), mVar2, 12582918, 126);
            return;
        }
        mVar.I();
    }
}
