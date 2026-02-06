package io.intercom.android.sdk.m5.conversation.ui.components.row;

import C.C1085c;
import C.C1090h;
import C.C1092j;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import M0.e;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import b1.j;
import b1.k;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import w0.C2817c;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class BigTicketCardKt$BigTicketCard$3$1$1 implements q {
    final /* synthetic */ Context $context;
    final /* synthetic */ TicketDetailState.TicketDetailContentState $ticketDetailState;

    BigTicketCardKt$BigTicketCard$3$1$1(TicketDetailState.TicketDetailContentState ticketDetailContentState, Context context) {
        this.$ticketDetailState = ticketDetailContentState;
        this.$context = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1092j) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1092j jVar, C1500m mVar, int i10) {
        String str;
        C1500m mVar2 = mVar;
        C6496s.h(jVar, "$this$IntercomCard");
        if ((i10 & 81) != 16 || !mVar.i()) {
            TicketDetailState.TicketDetailContentState ticketDetailContentState = this.$ticketDetailState;
            Context context = this.$context;
            i.a aVar = i.f23074a;
            C1085c cVar = C1085c.f882a;
            C1085c.m g10 = cVar.g();
            c.a aVar2 = c.f23044a;
            F a10 = C1090h.a(g10, aVar2.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, aVar);
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
            float f10 = (float) 12;
            i i11 = n.i(aVar, c1.h.j(f10));
            F a14 = C1090h.a(cVar.g(), aVar2.g(), mVar2, 48);
            int a15 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e11 = h.e(mVar2, i11);
            C6787a a16 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a16);
            } else {
                mVar.q();
            }
            C1500m a17 = F1.a(mVar);
            F1.b(a17, a14, aVar3.c());
            F1.b(a17, p11, aVar3.e());
            p b11 = aVar3.b();
            if (a17.f() || !C6496s.c(a17.A(), Integer.valueOf(a15))) {
                a17.r(Integer.valueOf(a15));
                a17.V(Integer.valueOf(a15), b11);
            }
            F1.b(a17, e11, aVar3.d());
            a0.a(androidx.compose.foundation.layout.q.i(aVar, c1.h.j((float) 4)), mVar2, 6);
            String ticketName = ticketDetailContentState.getTicketName();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i12 = IntercomTheme.$stable;
            int i13 = i12;
            IntercomTheme intercomTheme2 = intercomTheme;
            float f11 = f10;
            C1093k kVar2 = kVar;
            Context context2 = context;
            TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
            T0.b(ticketName, (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(mVar2, i12).getType04SemiBold(), mVar, 0, 0, 65534);
            ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
            C6514M m10 = C6514M.f71813a;
            float f12 = (float) 8;
            i.a aVar4 = aVar;
            C1500m mVar3 = mVar;
            a0.a(androidx.compose.foundation.layout.q.i(aVar4, c1.h.j(f12)), mVar3, 6);
            String statusLabel = ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
            Long timestamp = ticketDetailContentState2.getTicketTimelineCardState().getTimestamp();
            if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context2)) == null) {
                str = "";
            }
            int i14 = i13;
            IntercomTheme intercomTheme3 = intercomTheme2;
            C1500m mVar4 = mVar3;
            TextWithSeparatorKt.m206TextWithSeparatorwV1YYcM(statusLabel, str, (i) null, (String) null, intercomTheme3.getTypography(mVar3, i14).getType04SemiBold(), ticketDetailContentState2.getTicketTimelineCardState().m541getProgressColor0d7_KjU(), 0, 0, j.h(j.f19110b.a()), mVar, 0, 204);
            a0.a(androidx.compose.foundation.layout.q.i(aVar4, c1.h.j(f12)), mVar4, 6);
            int i15 = i14;
            IntercomTheme intercomTheme4 = intercomTheme3;
            int i16 = i15;
            IntercomTheme intercomTheme5 = intercomTheme4;
            float f13 = f12;
            T0.b(ticketDetailContentState2.getTicketTimelineCardState().getStatusTitle(), (i) null, 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme4.getTypography(mVar4, i15).getType04(), mVar, 0, 0, 65534);
            i.a aVar5 = aVar4;
            a0.a(androidx.compose.foundation.layout.q.i(aVar5, c1.h.j((float) 16)), mVar4, 6);
            TicketProgressIndicatorKt.m536TicketProgressIndicator3IgeMak(ticketDetailContentState2.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState2.getTicketTimelineCardState().m541getProgressColor0d7_KjU(), (i) null, mVar, 8, 4);
            a0.a(androidx.compose.foundation.layout.q.i(aVar5, c1.h.j(f13)), mVar4, 6);
            mVar.u();
            IntercomDividerKt.IntercomDivider(n.k(aVar5, c1.h.j(f11), 0.0f, 2, (Object) null), mVar4, 6, 0);
            i k10 = n.k(kVar2.b(aVar5, aVar2.g()), 0.0f, c1.h.j((float) 14), 1, (Object) null);
            F b12 = W.b(cVar.f(), aVar2.i(), mVar4, 48);
            int a18 = C1494j.a(mVar4, 0);
            C1523y p12 = mVar.p();
            i e12 = h.e(mVar4, k10);
            C6787a a19 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar4.U(a19);
            } else {
                mVar.q();
            }
            C1500m a20 = F1.a(mVar);
            F1.b(a20, b12, aVar3.c());
            F1.b(a20, p12, aVar3.e());
            p b13 = aVar3.b();
            if (a20.f() || !C6496s.c(a20.A(), Integer.valueOf(a18))) {
                a20.r(Integer.valueOf(a18));
                a20.V(Integer.valueOf(a18), b13);
            }
            F1.b(a20, e12, aVar3.d());
            Z z10 = Z.f873a;
            C2817c c10 = e.c(R.drawable.intercom_ticket_detail_icon, mVar4, 0);
            int i17 = i16;
            IntercomTheme intercomTheme6 = intercomTheme5;
            long r13 = ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(intercomTheme6.getColors(mVar4, i17).m672getAction0d7_KjU());
            V.a(c10, (String) null, n.m(aVar5, 0.0f, 0.0f, c1.h.j(f13), 0.0f, 11, (Object) null), r13, mVar, 440, 0);
            T0.b(M0.i.a(R.string.intercom_tickets_view_ticket, mVar4, 0), (i) null, ColorExtensionsKt.m715getAccessibleColorOnWhiteBackground8_81llA(intercomTheme6.getColors(mVar4, i17).m672getAction0d7_KjU()), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme6.getTypography(mVar4, i17).getType04SemiBold(), mVar, 0, 0, 65530);
            mVar.u();
            mVar.u();
            return;
        }
        mVar.I();
    }
}
