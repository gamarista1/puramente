package io.intercom.android.sdk.m5.conversation.ui.components.row;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.animation.g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2721d;
import w.C2760D;
import w.C2798j;
import w.q0;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "ticketDetailState", "Lkotlin/Function0;", "Llf/M;", "onClick", "", "visible", "Lk0/i;", "modifier", "BigTicketCard", "(Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;Lyf/a;ZLk0/i;LY/m;II)V", "BigTicketCardPreview", "(LY/m;I)V", "BigTicketCardWaitingPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BigTicketCardKt {
    public static final void BigTicketCard(TicketDetailState.TicketDetailContentState ticketDetailContentState, C6787a aVar, boolean z10, i iVar, C1500m mVar, int i10, int i11) {
        i.a aVar2;
        TicketDetailState.TicketDetailContentState ticketDetailContentState2 = ticketDetailContentState;
        C6787a aVar3 = aVar;
        C6496s.h(ticketDetailContentState2, "ticketDetailState");
        C6496s.h(aVar3, "onClick");
        C1500m h10 = mVar.h(1861461937);
        if ((i11 & 8) != 0) {
            aVar2 = i.f23074a;
        } else {
            aVar2 = iVar;
        }
        q0 j10 = C2798j.j(1000, 0, (C2760D) null, 6, (Object) null);
        c.a aVar4 = c.f23044a;
        int i12 = i10 >> 6;
        C2721d.g(z10, aVar2, g.k(j10, aVar4.m(), false, (C6798l) null, 12, (Object) null).c(g.B(C2798j.j(1000, 500, (C2760D) null, 4, (Object) null), new C6136e())).c(g.o(C2798j.j(1000, 500, (C2760D) null, 4, (Object) null), 0.0f, 2, (Object) null)), g.F(C2798j.j(1000, 0, (C2760D) null, 6, (Object) null), new C6138f()).c(g.q(C2798j.j(1000, 0, (C2760D) null, 6, (Object) null), 0.0f, 2, (Object) null)).c(g.w(C2798j.j(1000, 500, (C2760D) null, 4, (Object) null), aVar4.m(), false, (C6798l) null, 12, (Object) null)), (String) null, g0.c.e(-915811879, true, new BigTicketCardKt$BigTicketCard$3(aVar3, ticketDetailContentState2, (Context) h10.m(AndroidCompositionLocals_androidKt.g())), h10, 54), h10, (i12 & 14) | 196992 | (i12 & 112), 16);
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6140g(ticketDetailContentState, aVar, z10, aVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final int BigTicketCard$lambda$0(int i10) {
        return -i10;
    }

    /* access modifiers changed from: private */
    public static final int BigTicketCard$lambda$1(int i10) {
        return -i10;
    }

    /* access modifiers changed from: private */
    public static final C6514M BigTicketCard$lambda$2(TicketDetailState.TicketDetailContentState ticketDetailContentState, C6787a aVar, boolean z10, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(ticketDetailContentState, "$ticketDetailState");
        C6496s.h(aVar, "$onClick");
        BigTicketCard(ticketDetailContentState, aVar, z10, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void BigTicketCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1841168271);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BigTicketCardKt.INSTANCE.m283getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6134d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BigTicketCardPreview$lambda$3(int i10, C1500m mVar, int i11) {
        BigTicketCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void BigTicketCardWaitingPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1532589538);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$BigTicketCardKt.INSTANCE.m284getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6141h(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M BigTicketCardWaitingPreview$lambda$4(int i10, C1500m mVar, int i11) {
        BigTicketCardWaitingPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
