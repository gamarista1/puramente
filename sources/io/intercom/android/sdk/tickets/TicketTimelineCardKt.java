package io.intercom.android.sdk.tickets;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import J0.C1241g;
import V.B0;
import V.T0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.j;
import b1.k;
import c1.h;
import c1.w;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\b\u001a\u000f\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\b\"\u001a\u0010\f\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "ticketTimelineCardState", "Lk0/i;", "modifier", "Llf/M;", "TicketTimelineCard", "(Lio/intercom/android/sdk/tickets/TicketTimelineCardState;Lk0/i;LY/m;II)V", "WaitingOnCustomerTicketTimelinePreview", "(LY/m;I)V", "SubmittedTicketTimelineWithLabelPreview", "ResolvedTicketTimelineWithLabelPreview", "InProgressTicketTimelineWithLabelPreview", "sampleTicketTimelineCardState", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "getSampleTicketTimelineCardState", "()Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketTimelineCardKt {
    private static final TicketTimelineCardState sampleTicketTimelineCardState;

    static {
        Avatar create = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        C6496s.g(create, "create(...)");
        sampleTicketTimelineCardState = new TicketTimelineCardState(C6565s.e(new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null)), "Hannah will pick this up soon 🙌", "🕑  Estimated to be resolved today at 4pm", TicketStatus.Submitted.m537getColor0d7_KjU(), C6565s.q(new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false), new TicketTimelineCardState.ProgressSection(false, false)), "Submitted", 1634889351L, (DefaultConstructorMarker) null);
    }

    public static final void InProgressTicketTimelineWithLabelPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-255211063);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m534getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new N(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M InProgressTicketTimelineWithLabelPreview$lambda$6(int i10, C1500m mVar, int i11) {
        InProgressTicketTimelineWithLabelPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ResolvedTicketTimelineWithLabelPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2040249091);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m533getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new L(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ResolvedTicketTimelineWithLabelPreview$lambda$5(int i10, C1500m mVar, int i11) {
        ResolvedTicketTimelineWithLabelPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SubmittedTicketTimelineWithLabelPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1972637636);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m532getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new K(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SubmittedTicketTimelineWithLabelPreview$lambda$4(int i10, C1500m mVar, int i11) {
        SubmittedTicketTimelineWithLabelPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void TicketTimelineCard(TicketTimelineCardState ticketTimelineCardState, i iVar, C1500m mVar, int i10, int i11) {
        String str;
        i.a aVar;
        TicketTimelineCardState ticketTimelineCardState2 = ticketTimelineCardState;
        int i12 = i11;
        C6496s.h(ticketTimelineCardState2, "ticketTimelineCardState");
        C1500m h10 = mVar.h(926572596);
        i.a aVar2 = (i12 & 2) != 0 ? i.f23074a : iVar;
        Context context = (Context) h10.m(AndroidCompositionLocals_androidKt.g());
        i i13 = n.i(aVar2, h.j((float) 24));
        c.a aVar3 = c.f23044a;
        c.b g10 = aVar3.g();
        C1085c cVar = C1085c.f882a;
        F a10 = C1090h.a(cVar.g(), g10, h10, 48);
        int a11 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, i13);
        C1241g.a aVar4 = C1241g.f3853J;
        C6787a a12 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a12);
        } else {
            h10.q();
        }
        C1500m a13 = F1.a(h10);
        F1.b(a13, a10, aVar4.c());
        F1.b(a13, p10, aVar4.e());
        p b10 = aVar4.b();
        if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
            a13.r(Integer.valueOf(a11));
            a13.V(Integer.valueOf(a11), b10);
        }
        F1.b(a13, e10, aVar4.d());
        C1093k kVar = C1093k.f978a;
        i.a aVar5 = i.f23074a;
        i z10 = q.z(aVar5, (c.b) null, false, 3, (Object) null);
        F b11 = W.b(cVar.f(), aVar3.l(), h10, 0);
        int a14 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = k0.h.e(h10, z10);
        C6787a a15 = aVar4.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a15);
        } else {
            h10.q();
        }
        C1500m a16 = F1.a(h10);
        F1.b(a16, b11, aVar4.c());
        F1.b(a16, p11, aVar4.e());
        p b12 = aVar4.b();
        if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
            a16.r(Integer.valueOf(a14));
            a16.V(Integer.valueOf(a14), b12);
        }
        F1.b(a16, e11, aVar4.d());
        Z z11 = Z.f873a;
        AvatarGroupKt.m136AvatarGroupJ8mCjc(ticketTimelineCardState.getAdminAvatars(), (i) null, h.j((float) 64), w.f(24), h10, 3464, 2);
        h10.u();
        a0.a(q.i(aVar5, h.j((float) 12)), h10, 6);
        String statusLabel = ticketTimelineCardState.getStatusLabel();
        Long timestamp = ticketTimelineCardState.getTimestamp();
        if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context)) == null) {
            str = "";
        }
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i14 = IntercomTheme.$stable;
        i iVar2 = aVar2;
        TextWithSeparatorKt.m206TextWithSeparatorwV1YYcM(statusLabel, str, (i) null, (String) null, intercomTheme.getTypography(h10, i14).getType04SemiBold(), ticketTimelineCardState.m541getProgressColor0d7_KjU(), 0, 0, j.h(j.f19110b.a()), h10, 0, 204);
        float f10 = (float) 8;
        i.a aVar6 = aVar5;
        a0.a(q.i(aVar6, h.j(f10)), h10, 6);
        int i15 = i14;
        IntercomTheme intercomTheme2 = intercomTheme;
        int i16 = i15;
        IntercomTheme intercomTheme3 = intercomTheme2;
        i.a aVar7 = aVar6;
        float f11 = f10;
        T0.b(ticketTimelineCardState.getStatusTitle(), (i) null, intercomTheme2.getColors(h10, i15).m700getPrimaryText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme2.getTypography(h10, i15).getType04(), h10, 0, 0, 65530);
        h10.T(2095162818);
        if (ticketTimelineCardState.getStatusSubtitle().length() > 0) {
            i.a aVar8 = aVar7;
            a0.a(q.i(aVar8, h.j(f11)), h10, 6);
            int i17 = i16;
            IntercomTheme intercomTheme4 = intercomTheme3;
            aVar = aVar8;
            T0.b(ticketTimelineCardState.getStatusSubtitle(), (i) null, intercomTheme4.getColors(h10, i17).m700getPrimaryText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, intercomTheme4.getTypography(h10, i17).getType04(), h10, 0, 0, 65530);
        } else {
            aVar = aVar7;
        }
        h10.M();
        a0.a(q.i(aVar, h.j((float) 16)), h10, 6);
        TicketProgressIndicatorKt.m536TicketProgressIndicator3IgeMak(ticketTimelineCardState.getProgressSections(), ticketTimelineCardState.m541getProgressColor0d7_KjU(), (i) null, h10, 8, 4);
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new O(ticketTimelineCardState2, iVar2, i10, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketTimelineCard$lambda$2(TicketTimelineCardState ticketTimelineCardState, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(ticketTimelineCardState, "$ticketTimelineCardState");
        TicketTimelineCard(ticketTimelineCardState, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void WaitingOnCustomerTicketTimelinePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-670677167);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m531getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new M(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M WaitingOnCustomerTicketTimelinePreview$lambda$3(int i10, C1500m mVar, int i11) {
        WaitingOnCustomerTicketTimelinePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final TicketTimelineCardState getSampleTicketTimelineCardState() {
        return sampleTicketTimelineCardState;
    }
}
