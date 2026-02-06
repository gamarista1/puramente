package io.intercom.android.sdk.tickets;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import M0.e;
import V.B0;
import V.T0;
import V.V;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import b1.j;
import b1.k;
import c1.h;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.TicketAttributeType;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import r0.C2544x0;
import r0.C2550z0;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aC\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0011\u0010\u000f\"\u001a\u0010\u0012\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "ticketDetailContentState", "Lkotlin/Function1;", "", "Llf/M;", "onConversationCTAClicked", "", "showSubmissionCard", "TicketDetailContent", "(Lk0/i;Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;Lyf/l;ZLY/m;II)V", "TicketSubmissionCard", "(Lk0/i;LY/m;II)V", "TicketSubmissionCardPreview", "(LY/m;I)V", "TicketPreview", "TicketPreviewSubmittedCard", "sampleTicketDetailState", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "getSampleTicketDetailState", "()Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "Lio/intercom/android/sdk/tickets/CardState;", "cardState", "Lc1/h;", "submissionCardOffset", "", "submissionCardAlpha", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketDetailContentKt {
    private static final TicketDetailState.TicketDetailContentState sampleTicketDetailState;

    static {
        Avatar create = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        C6496s.g(create, "create(...)");
        sampleTicketDetailState = new TicketDetailState.TicketDetailContentState("API issue", new TicketTimelineCardState(C6565s.e(new AvatarWrapper(create, false, 2, (DefaultConstructorMarker) null)), "Hannah will pick this up soon", "🕑  Estimated to be resolved today at 4pm", C2544x0.f25560b.b(), C6565s.q(new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(false, true), new TicketTimelineCardState.ProgressSection(false, false)), "Submitted", Long.valueOf(System.currentTimeMillis()), (DefaultConstructorMarker) null), C6565s.q(new Ticket.TicketAttribute.PrimitiveAttribute((String) null, (String) null, "Description", false, (TicketAttributeType) null, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Et, ut hendrerit et lacus, dictumst ridiculus morbi elementum.", 27, (DefaultConstructorMarker) null), new Ticket.TicketAttribute.PrimitiveAttribute((String) null, (String) null, "API Version", false, (TicketAttributeType) null, "1.2", 27, (DefaultConstructorMarker) null), new Ticket.TicketAttribute.DateTimeAttribute((String) null, (String) null, "When did the issue occur?", false, (TicketAttributeType) null, "1676555323", 27, (DefaultConstructorMarker) null)), "test@gmail.com", "123", new ConversationButtonState(true, Integer.valueOf(R.drawable.intercom_send_message_icon), new StringProvider.StringRes(R.string.intercom_send_us_a_message, (List) null, 2, (DefaultConstructorMarker) null)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: io.intercom.android.sdk.tickets.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TicketDetailContent(k0.i r66, io.intercom.android.sdk.tickets.TicketDetailState.TicketDetailContentState r67, yf.C6798l r68, boolean r69, Y.C1500m r70, int r71, int r72) {
        /*
            r2 = r67
            r5 = r71
            r0 = 8
            java.lang.String r1 = "ticketDetailContentState"
            kotlin.jvm.internal.C6496s.h(r2, r1)
            r1 = -872031756(0xffffffffcc05d9f4, float:-3.5088336E7)
            r3 = r70
            Y.m r1 = r3.h(r1)
            r3 = 1
            r4 = r72 & 1
            if (r4 == 0) goto L_0x001c
            k0.i$a r4 = k0.i.f23074a
            goto L_0x001e
        L_0x001c:
            r4 = r66
        L_0x001e:
            r6 = r72 & 4
            if (r6 == 0) goto L_0x0029
            io.intercom.android.sdk.tickets.n r6 = new io.intercom.android.sdk.tickets.n
            r6.<init>()
            r15 = r6
            goto L_0x002b
        L_0x0029:
            r15 = r68
        L_0x002b:
            r6 = r72 & 8
            r14 = 0
            if (r6 == 0) goto L_0x0032
            r13 = r14
            goto L_0x0034
        L_0x0032:
            r13 = r69
        L_0x0034:
            java.lang.Object[] r6 = new java.lang.Object[r14]
            r7 = 1639443041(0x61b7ea61, float:4.2408037E20)
            r1.T(r7)
            r7 = r5 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 ^ 3072(0xc00, float:4.305E-42)
            r8 = 2048(0x800, float:2.87E-42)
            if (r7 <= r8) goto L_0x004a
            boolean r7 = r1.b(r13)
            if (r7 != 0) goto L_0x004e
        L_0x004a:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != r8) goto L_0x0050
        L_0x004e:
            r7 = r3
            goto L_0x0051
        L_0x0050:
            r7 = r14
        L_0x0051:
            java.lang.Object r8 = r1.A()
            if (r7 != 0) goto L_0x005f
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0067
        L_0x005f:
            io.intercom.android.sdk.tickets.o r8 = new io.intercom.android.sdk.tickets.o
            r8.<init>(r13)
            r1.r(r8)
        L_0x0067:
            r9 = r8
            yf.a r9 = (yf.C6787a) r9
            r1.M()
            r11 = 8
            r12 = 6
            r7 = 0
            r8 = 0
            r10 = r1
            java.lang.Object r6 = h0.C2018b.e(r6, r7, r8, r9, r10, r11, r12)
            r12 = r6
            Y.r0 r12 = (Y.C1510r0) r12
            r6 = 1639447110(0x61b7fa46, float:4.2422353E20)
            r1.T(r6)
            java.lang.Object r6 = r1.A()
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r8 = r7.a()
            r9 = 2
            r11 = 0
            if (r6 != r8) goto L_0x00a0
            r6 = -56
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            c1.h r6 = c1.h.e(r6)
            Y.r0 r6 = Y.u1.d(r6, r11, r9, r11)
            r1.r(r6)
        L_0x00a0:
            r10 = r6
            Y.r0 r10 = (Y.C1510r0) r10
            r1.M()
            r6 = 1639449312(0x61b802e0, float:4.24301E20)
            r1.T(r6)
            java.lang.Object r6 = r1.A()
            java.lang.Object r8 = r7.a()
            r0 = 0
            if (r6 != r8) goto L_0x00c2
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            Y.r0 r6 = Y.u1.d(r6, r11, r9, r11)
            r1.r(r6)
        L_0x00c2:
            r8 = r6
            Y.r0 r8 = (Y.C1510r0) r8
            r1.M()
            r6 = 1639450743(0x61b80877, float:4.2435136E20)
            r1.T(r6)
            io.intercom.android.sdk.tickets.CardState r6 = TicketDetailContent$lambda$3(r12)
            r16 = r13
            io.intercom.android.sdk.tickets.CardState r13 = io.intercom.android.sdk.tickets.CardState.SubmissionCard
            if (r6 != r13) goto L_0x0100
            r6 = 1639454260(0x61b81634, float:4.244751E20)
            r1.T(r6)
            boolean r6 = r1.S(r12)
            java.lang.Object r9 = r1.A()
            if (r6 != 0) goto L_0x00ee
            java.lang.Object r6 = r7.a()
            if (r9 != r6) goto L_0x00f6
        L_0x00ee:
            io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$2$1 r9 = new io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$2$1
            r9.<init>(r10, r8, r12, r11)
            r1.r(r9)
        L_0x00f6:
            yf.p r9 = (yf.p) r9
            r1.M()
            r6 = 70
            Y.P.g(r11, r9, r1, r6)
        L_0x0100:
            r1.M()
            k0.i r17 = androidx.compose.foundation.layout.q.d(r4, r0, r3, r11)
            androidx.compose.foundation.o r18 = androidx.compose.foundation.m.a(r14, r1, r14, r3)
            r22 = 14
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            k0.i r6 = androidx.compose.foundation.m.d(r17, r18, r19, r20, r21, r22, r23)
            C.c r19 = C.C1085c.f882a
            C.c$m r7 = r19.g()
            k0.c$a r20 = k0.c.f23044a
            k0.c$b r9 = r20.k()
            H0.F r7 = C.C1090h.a(r7, r9, r1, r14)
            int r9 = Y.C1494j.a(r1, r14)
            Y.y r14 = r1.p()
            k0.i r6 = k0.h.e(r1, r6)
            J0.g$a r21 = J0.C1241g.f3853J
            yf.a r0 = r21.a()
            Y.f r17 = r1.j()
            if (r17 != 0) goto L_0x0144
            Y.C1494j.c()
        L_0x0144:
            r1.F()
            boolean r17 = r1.f()
            if (r17 == 0) goto L_0x0151
            r1.U(r0)
            goto L_0x0154
        L_0x0151:
            r1.q()
        L_0x0154:
            Y.m r0 = Y.F1.a(r1)
            yf.p r3 = r21.c()
            Y.F1.b(r0, r7, r3)
            yf.p r3 = r21.e()
            Y.F1.b(r0, r14, r3)
            yf.p r3 = r21.b()
            boolean r7 = r0.f()
            if (r7 != 0) goto L_0x017e
            java.lang.Object r7 = r0.A()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r14)
            if (r7 != 0) goto L_0x018c
        L_0x017e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r0.r(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r0.V(r7, r3)
        L_0x018c:
            yf.p r3 = r21.d()
            Y.F1.b(r0, r6, r3)
            C.k r22 = C.C1093k.f978a
            k0.i$a r0 = k0.i.f23074a
            io.intercom.android.sdk.ui.theme.IntercomTheme r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r14 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r6 = r3.getColors(r1, r14)
            long r24 = r6.m678getBackground0d7_KjU()
            r27 = 2
            r28 = 0
            r26 = 0
            r23 = r0
            k0.i r6 = androidx.compose.foundation.b.d(r23, r24, r26, r27, r28)
            r7 = 1
            r9 = 0
            k0.i r6 = androidx.compose.foundation.layout.q.f(r6, r9, r7, r11)
            r7 = 194(0xc2, float:2.72E-43)
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            r5 = 2
            k0.i r6 = androidx.compose.foundation.layout.q.k(r6, r7, r9, r5, r11)
            r9 = 7
            r66 = r8
            r7 = 0
            w.q0 r8 = w.C2798j.j(r7, r7, r11, r9, r11)
            k0.i r5 = androidx.compose.animation.f.b(r6, r8, r11, r5, r11)
            k0.c r6 = r20.e()
            H0.F r6 = androidx.compose.foundation.layout.d.h(r6, r7)
            int r8 = Y.C1494j.a(r1, r7)
            Y.y r7 = r1.p()
            k0.i r5 = k0.h.e(r1, r5)
            yf.a r9 = r21.a()
            Y.f r18 = r1.j()
            if (r18 != 0) goto L_0x01ee
            Y.C1494j.c()
        L_0x01ee:
            r1.F()
            boolean r18 = r1.f()
            if (r18 == 0) goto L_0x01fb
            r1.U(r9)
            goto L_0x01fe
        L_0x01fb:
            r1.q()
        L_0x01fe:
            Y.m r9 = Y.F1.a(r1)
            yf.p r11 = r21.c()
            Y.F1.b(r9, r6, r11)
            yf.p r6 = r21.e()
            Y.F1.b(r9, r7, r6)
            yf.p r6 = r21.b()
            boolean r7 = r9.f()
            if (r7 != 0) goto L_0x0228
            java.lang.Object r7 = r9.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r11)
            if (r7 != 0) goto L_0x0236
        L_0x0228:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9.r(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r9.V(r7, r6)
        L_0x0236:
            yf.p r6 = r21.d()
            Y.F1.b(r9, r5, r6)
            androidx.compose.foundation.layout.f r5 = androidx.compose.foundation.layout.f.f12848a
            io.intercom.android.sdk.tickets.TicketTimelineCardState r5 = r67.getTicketTimelineCardState()
            io.intercom.android.sdk.tickets.CardState r6 = TicketDetailContent$lambda$3(r12)
            io.intercom.android.sdk.tickets.CardState r7 = io.intercom.android.sdk.tickets.CardState.TimelineCard
            if (r6 != r7) goto L_0x0251
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x024d:
            r7 = 0
            r9 = 7
            r11 = 0
            goto L_0x0253
        L_0x0251:
            r6 = 0
            goto L_0x024d
        L_0x0253:
            w.g0 r8 = w.C2798j.h(r7, r7, r11, r9, r11)
            r17 = 48
            r18 = 28
            r23 = 0
            r24 = 0
            r25 = 0
            r7 = r8
            r26 = r66
            r8 = r23
            r9 = r24
            r23 = r10
            r10 = r25
            r11 = r1
            r24 = r12
            r12 = r17
            r66 = r15
            r31 = r16
            r15 = r13
            r13 = r18
            Y.A1 r6 = w.C2786c.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            k0.i r6 = o0.C2338a.a(r0, r6)
            r7 = 0
            r8 = 8
            io.intercom.android.sdk.tickets.TicketTimelineCardKt.TicketTimelineCard(r5, r6, r1, r8, r7)
            io.intercom.android.sdk.tickets.CardState r5 = TicketDetailContent$lambda$3(r24)
            if (r5 != r15) goto L_0x029c
            float r5 = TicketDetailContent$lambda$9(r26)
            r6 = r5
            goto L_0x029d
        L_0x029c:
            r6 = 0
        L_0x029d:
            io.intercom.android.sdk.tickets.CardState r5 = TicketDetailContent$lambda$3(r24)
            r13 = 1000(0x3e8, float:1.401E-42)
            r12 = 6
            if (r5 != r15) goto L_0x02ad
            r5 = 0
            w.q0 r8 = w.C2798j.j(r13, r7, r5, r12, r5)
        L_0x02ab:
            r7 = r8
            goto L_0x02b5
        L_0x02ad:
            r5 = 0
            r7 = 0
            r8 = 7
            w.g0 r8 = w.C2798j.h(r7, r7, r5, r8, r5)
            goto L_0x02ab
        L_0x02b5:
            r15 = 64
            r16 = 28
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = r1
            r12 = r15
            r15 = r13
            r13 = r16
            Y.A1 r6 = w.C2786c.d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            k0.i r13 = o0.C2338a.a(r0, r6)
            float r6 = TicketDetailContent$lambda$6(r23)
            r7 = 0
            r12 = 6
            w.q0 r8 = w.C2798j.j(r15, r7, r5, r12, r5)
            r11 = 48
            r15 = 12
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r1
            r12 = r15
            Y.A1 r6 = w.C2786c.c(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r6 = r6.getValue()
            c1.h r6 = (c1.h) r6
            float r6 = r6.r()
            r7 = 1
            r8 = 0
            k0.i r6 = androidx.compose.foundation.layout.l.b(r13, r8, r6, r7, r5)
            r15 = 0
            TicketSubmissionCard(r6, r1, r15, r15)
            r1.u()
            io.intercom.android.sdk.ui.theme.IntercomColors r6 = r3.getColors(r1, r14)
            long r9 = r6.m678getBackground0d7_KjU()
            k0.i r6 = androidx.compose.foundation.layout.q.f(r0, r8, r7, r5)
            io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2 r8 = new io.intercom.android.sdk.tickets.TicketDetailContentKt$TicketDetailContent$3$2
            r8.<init>(r2)
            r11 = 54
            r12 = 925724611(0x372d6fc3, float:1.0337625E-5)
            g0.a r16 = g0.c.e(r12, r7, r8, r1, r11)
            r17 = 12582918(0xc00006, float:1.7632424E-38)
            r18 = 122(0x7a, float:1.71E-43)
            r7 = 0
            r11 = 0
            r13 = 0
            r23 = 0
            r24 = 0
            r8 = r9
            r10 = r11
            r12 = r13
            r13 = r23
            r32 = r14
            r14 = r24
            r33 = r66
            r5 = r15
            r15 = r16
            r16 = r1
            V.O0.a(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            r6 = 1933738547(0x73428233, float:1.5410558E31)
            r1.T(r6)
            io.intercom.android.sdk.tickets.ConversationButtonState r6 = r67.getConversationButtonState()
            boolean r6 = r6.getShowButton()
            if (r6 == 0) goto L_0x04bc
            r26 = 2
            r27 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r23 = r0
            k0.i r6 = C.C1092j.c(r22, r23, r24, r25, r26, r27)
            C.a0.a(r6, r1, r5)
            r6 = 1
            r7 = 0
            r8 = 0
            k0.i r9 = androidx.compose.foundation.layout.q.h(r0, r8, r6, r7)
            r10 = 16
            float r15 = (float) r10
            float r10 = c1.h.j(r15)
            k0.i r9 = androidx.compose.foundation.layout.n.k(r9, r8, r10, r6, r7)
            k0.c$b r6 = r20.g()
            C.c$m r7 = r19.g()
            r8 = 48
            H0.F r6 = C.C1090h.a(r7, r6, r1, r8)
            int r7 = Y.C1494j.a(r1, r5)
            Y.y r8 = r1.p()
            k0.i r9 = k0.h.e(r1, r9)
            yf.a r10 = r21.a()
            Y.f r11 = r1.j()
            if (r11 != 0) goto L_0x0395
            Y.C1494j.c()
        L_0x0395:
            r1.F()
            boolean r11 = r1.f()
            if (r11 == 0) goto L_0x03a2
            r1.U(r10)
            goto L_0x03a5
        L_0x03a2:
            r1.q()
        L_0x03a5:
            Y.m r10 = Y.F1.a(r1)
            yf.p r11 = r21.c()
            Y.F1.b(r10, r6, r11)
            yf.p r6 = r21.e()
            Y.F1.b(r10, r8, r6)
            yf.p r6 = r21.b()
            boolean r8 = r10.f()
            if (r8 != 0) goto L_0x03cf
            java.lang.Object r8 = r10.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r11)
            if (r8 != 0) goto L_0x03dd
        L_0x03cf:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.V(r7, r6)
        L_0x03dd:
            yf.p r6 = r21.d()
            Y.F1.b(r10, r9, r6)
            r6 = 1
            r7 = 0
            r8 = 0
            k0.i r7 = androidx.compose.foundation.layout.q.h(r0, r8, r6, r7)
            b1.j$a r6 = b1.j.f19110b
            int r8 = r6.a()
            int r6 = io.intercom.android.sdk.R.string.intercom_tickets_cta_text
            java.lang.String r6 = M0.i.a(r6, r1, r5)
            r5 = r32
            io.intercom.android.sdk.ui.theme.IntercomTypography r9 = r3.getTypography(r1, r5)
            Q0.T r34 = r9.getType04Point5()
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r1, r5)
            long r35 = r3.m686getDescriptionText0d7_KjU()
            r64 = 16777214(0xfffffe, float:2.3509884E-38)
            r65 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            Q0.T r26 = Q0.T.c(r34, r35, r37, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r51, r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64, r65)
            b1.j r18 = b1.j.h(r8)
            r29 = 0
            r30 = 65020(0xfdfc, float:9.1112E-41)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r3 = r15
            r15 = r16
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 48
            r27 = r1
            V.T0.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 8
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            k0.i r5 = androidx.compose.foundation.layout.q.i(r0, r5)
            r15 = 6
            C.a0.a(r5, r1, r15)
            io.intercom.android.sdk.tickets.ConversationButtonState r5 = r67.getConversationButtonState()
            io.intercom.android.sdk.ui.component.IntercomButton r6 = io.intercom.android.sdk.ui.component.IntercomButton.INSTANCE
            int r7 = io.intercom.android.sdk.ui.component.IntercomButton.$stable
            int r13 = r7 << 9
            r14 = 7
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = r1
            io.intercom.android.sdk.ui.component.IntercomButton$Style r7 = r6.m583primaryStyleKlgxPg(r7, r9, r11, r12, r13, r14)
            io.intercom.android.sdk.ui.common.StringProvider r6 = r5.getText()
            int r8 = io.intercom.android.sdk.ui.common.StringProvider.$stable
            java.lang.String r8 = r6.getText(r1, r8)
            java.lang.Integer r9 = r5.getIconRes()
            io.intercom.android.sdk.tickets.p r10 = new io.intercom.android.sdk.tickets.p
            r5 = r33
            r10.<init>(r5, r2)
            int r6 = io.intercom.android.sdk.ui.component.IntercomButton.Style.$stable
            int r12 = r6 << 3
            r13 = 1
            r6 = 0
            r11 = r1
            io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton(r6, r7, r8, r9, r10, r11, r12, r13)
            float r3 = c1.h.j(r3)
            k0.i r0 = androidx.compose.foundation.layout.q.i(r0, r3)
            C.a0.a(r0, r1, r15)
            r1.u()
            goto L_0x04be
        L_0x04bc:
            r5 = r33
        L_0x04be:
            r1.M()
            r1.u()
            Y.Y0 r7 = r1.k()
            if (r7 == 0) goto L_0x04dd
            io.intercom.android.sdk.tickets.q r8 = new io.intercom.android.sdk.tickets.q
            r0 = r8
            r1 = r4
            r2 = r67
            r3 = r5
            r4 = r31
            r5 = r71
            r6 = r72
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x04dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.TicketDetailContentKt.TicketDetailContent(k0.i, io.intercom.android.sdk.tickets.TicketDetailState$TicketDetailContentState, yf.l, boolean, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailContent$lambda$0(String str) {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$10(C1510r0 r0Var, float f10) {
        r0Var.setValue(Float.valueOf(f10));
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailContent$lambda$15$lambda$14$lambda$13(C6798l lVar, TicketDetailState.TicketDetailContentState ticketDetailContentState) {
        C6496s.h(ticketDetailContentState, "$ticketDetailContentState");
        lVar.invoke(ticketDetailContentState.getConversationId());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailContent$lambda$16(i iVar, TicketDetailState.TicketDetailContentState ticketDetailContentState, C6798l lVar, boolean z10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(ticketDetailContentState, "$ticketDetailContentState");
        TicketDetailContent(iVar, ticketDetailContentState, lVar, z10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C1510r0 TicketDetailContent$lambda$2$lambda$1(boolean z10) {
        CardState cardState;
        if (z10) {
            cardState = CardState.SubmissionCard;
        } else {
            cardState = CardState.TimelineCard;
        }
        return u1.d(cardState, (o1) null, 2, (Object) null);
    }

    private static final CardState TicketDetailContent$lambda$3(C1510r0 r0Var) {
        return (CardState) r0Var.getValue();
    }

    /* access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$4(C1510r0 r0Var, CardState cardState) {
        r0Var.setValue(cardState);
    }

    private static final float TicketDetailContent$lambda$6(C1510r0 r0Var) {
        return ((h) r0Var.getValue()).r();
    }

    /* access modifiers changed from: private */
    public static final void TicketDetailContent$lambda$7(C1510r0 r0Var, float f10) {
        r0Var.setValue(h.e(f10));
    }

    private static final float TicketDetailContent$lambda$9(C1510r0 r0Var) {
        return ((Number) r0Var.getValue()).floatValue();
    }

    @IntercomPreviews
    public static final void TicketPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1759013677);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m523getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketPreview$lambda$20(int i10, C1500m mVar, int i11) {
        TicketPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TicketPreviewSubmittedCard(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(2122497154);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m524getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new r(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketPreviewSubmittedCard$lambda$21(int i10, C1500m mVar, int i11) {
        TicketPreviewSubmittedCard(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void TicketSubmissionCard(i iVar, C1500m mVar, int i10, int i11) {
        int i12;
        i iVar2;
        i.a aVar;
        int i13;
        int i14 = i10;
        int i15 = i11;
        C1500m h10 = mVar.h(-2022209692);
        int i16 = i15 & 1;
        if (i16 != 0) {
            i12 = i14 | 6;
            iVar2 = iVar;
        } else if ((i14 & 14) == 0) {
            iVar2 = iVar;
            if (h10.S(iVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i14;
        } else {
            iVar2 = iVar;
            i12 = i14;
        }
        if ((i12 & 11) != 2 || !h10.i()) {
            if (i16 != 0) {
                aVar = i.f23074a;
            } else {
                aVar = iVar2;
            }
            float f10 = (float) 16;
            C1085c.f n10 = C1085c.f882a.n(h.j(f10));
            c.b g10 = c.f23044a.g();
            i i17 = n.i(aVar, h.j(f10));
            F a10 = C1090h.a(n10, g10, h10, 54);
            int a11 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, i17);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a12 = aVar2.a();
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
            F1.b(a13, a10, aVar2.c());
            F1.b(a13, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            V.a(e.c(R.drawable.intercom_submitted, h10, 0), (String) null, q.n(i.f23074a, h.j((float) 48)), C2550z0.d(4279072050L), h10, 3512, 0);
            String a14 = M0.i.a(R.string.intercom_tickets_created_confirmation_header, h10, 0);
            j.a aVar3 = j.f19110b;
            int a15 = aVar3.a();
            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
            int i18 = IntercomTheme.$stable;
            C1500m mVar2 = h10;
            T0.b(a14, (i) null, intercomTheme.getColors(h10, i18).m700getPrimaryText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(a15), 0, 0, false, 0, 0, (C6798l) null, intercomTheme.getTypography(h10, i18).getType04(), mVar2, 0, 0, 65018);
            int i19 = i18;
            IntercomTheme intercomTheme2 = intercomTheme;
            T0.b(M0.i.a(R.string.intercom_tickets_submitted_confirmation_paragraph, h10, 0), (i) null, intercomTheme2.getColors(h10, i19).m700getPrimaryText0d7_KjU(), 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, j.h(aVar3.a()), 0, 0, false, 0, 0, (C6798l) null, intercomTheme2.getTypography(h10, i19).getType04(), mVar2, 0, 0, 65018);
            h10.u();
            iVar2 = aVar;
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new s(iVar2, i14, i15));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketSubmissionCard$lambda$18(i iVar, int i10, int i11, C1500m mVar, int i12) {
        TicketSubmissionCard(iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TicketSubmissionCardPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-981393609);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketDetailContentKt.INSTANCE.m522getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketSubmissionCardPreview$lambda$19(int i10, C1500m mVar, int i11) {
        TicketSubmissionCardPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final TicketDetailState.TicketDetailContentState getSampleTicketDetailState() {
        return sampleTicketDetailState;
    }
}
