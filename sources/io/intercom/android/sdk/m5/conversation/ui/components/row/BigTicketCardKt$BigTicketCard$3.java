package io.intercom.android.sdk.m5.conversation.ui.components.row;

import B.l;
import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import V.T0;
import V0.n;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import b1.j;
import b1.k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import v.C2722e;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BigTicketCardKt$BigTicketCard$3 implements q {
    final /* synthetic */ Context $context;
    final /* synthetic */ C6787a $onClick;
    final /* synthetic */ TicketDetailState.TicketDetailContentState $ticketDetailState;

    BigTicketCardKt$BigTicketCard$3(C6787a aVar, TicketDetailState.TicketDetailContentState ticketDetailContentState, Context context) {
        this.$onClick = aVar;
        this.$ticketDetailState = ticketDetailContentState;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(eVar, "$this$AnimatedVisibility");
        c.b g10 = c.f23044a.g();
        C6787a aVar = this.$onClick;
        TicketDetailState.TicketDetailContentState ticketDetailContentState = this.$ticketDetailState;
        Context context = this.$context;
        i.a aVar2 = i.f23074a;
        F a10 = C1090h.a(C1085c.f882a.g(), g10, mVar2, 48);
        int a11 = C1494j.a(mVar2, 0);
        C1523y p10 = mVar.p();
        i e10 = h.e(mVar2, aVar2);
        C1241g.a aVar3 = C1241g.f3853J;
        C6787a a12 = aVar3.a();
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
        F1.b(a13, a10, aVar3.c());
        F1.b(a13, p10, aVar3.e());
        p b10 = aVar3.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar3.d());
        C1093k kVar = C1093k.f978a;
        Context context2 = context;
        T0.b(M0.i.a(R.string.intercom_your_ticket, mVar2, 0), (i) null, 0, 0, (n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, IntercomTheme.INSTANCE.getTypography(mVar2, IntercomTheme.$stable).getType04(), mVar, 0, 0, 65534);
        IntercomCardKt.IntercomCard(aVar, androidx.compose.foundation.layout.n.j(aVar2, c1.h.j((float) 14), c1.h.j((float) 12)), false, IntercomCardStyle.INSTANCE.m590conversationCardStylePEIptTM((g2) null, 0, 0, 0.0f, (C2868g) null, mVar, IntercomCardStyle.$stable << 15, 31), (l) null, g0.c.e(-1554241908, true, new BigTicketCardKt$BigTicketCard$3$1$1(ticketDetailContentState, context2), mVar, 54), mVar, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
        mVar.u();
    }
}
