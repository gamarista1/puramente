package io.intercom.android.sdk.m5.helpcenter.ui.components;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import I.g;
import J0.C1241g;
import V.B0;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.h;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import o0.C2341d;
import o0.C2342e;
import o0.C2345h;
import q0.C2427m;
import r0.C2472Y;
import r0.C2547y0;
import r0.S1;
import r0.g2;
import t0.C2605f;
import t0.C2606g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "teamPresenceState", "", "needsDivider", "Lio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceButtonStyle;", "buttonStyle", "Llf/M;", "TeamPresenceComponent", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;ZLio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceButtonStyle;LY/m;II)V", "TeamPresenceComponentWithBubble", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;LY/m;I)V", "TeamPresenceWithBubblePreview", "(LY/m;I)V", "TeamPresencePreview", "mockTeamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TeamPresenceComponentKt {
    /* access modifiers changed from: private */
    public static final ArticleViewState.TeamPresenceState mockTeamPresenceState;

    static {
        int i10 = R.string.intercom_the_team_can_help_if_needed;
        mockTeamPresenceState = new ArticleViewState.TeamPresenceState((ArticleMetadata) null, (ArticleViewState.ConversationState) null, Integer.valueOf(i10), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, new OpenMessengerResponse.NewConversationData.Cta("Send us a message", "The team can help if needed", OpenMessengerResponse.IconType.PAPER_PLANE));
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TeamPresenceComponent(io.intercom.android.sdk.helpcenter.articles.ArticleViewState.TeamPresenceState r39, boolean r40, io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle r41, Y.C1500m r42, int r43, int r44) {
        /*
            r1 = r39
            r4 = r43
            r0 = 48
            r2 = 2
            r3 = 4
            r5 = 6
            java.lang.String r6 = "teamPresenceState"
            kotlin.jvm.internal.C6496s.h(r1, r6)
            r6 = -696298916(0xffffffffd67f525c, float:-7.0182299E13)
            r7 = r42
            Y.m r6 = r7.h(r6)
            r7 = 1
            r8 = r44 & 1
            if (r8 == 0) goto L_0x001f
            r8 = r4 | 6
            goto L_0x002f
        L_0x001f:
            r8 = r4 & 14
            if (r8 != 0) goto L_0x002e
            boolean r8 = r6.S(r1)
            if (r8 == 0) goto L_0x002b
            r8 = r3
            goto L_0x002c
        L_0x002b:
            r8 = r2
        L_0x002c:
            r8 = r8 | r4
            goto L_0x002f
        L_0x002e:
            r8 = r4
        L_0x002f:
            r2 = r44 & 2
            r15 = 16
            if (r2 == 0) goto L_0x0039
            r8 = r8 | r0
        L_0x0036:
            r9 = r40
            goto L_0x004a
        L_0x0039:
            r9 = r4 & 112(0x70, float:1.57E-43)
            if (r9 != 0) goto L_0x0036
            r9 = r40
            boolean r10 = r6.b(r9)
            if (r10 == 0) goto L_0x0048
            r10 = 32
            goto L_0x0049
        L_0x0048:
            r10 = r15
        L_0x0049:
            r8 = r8 | r10
        L_0x004a:
            r3 = r44 & 4
            if (r3 == 0) goto L_0x0053
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0050:
            r10 = r41
            goto L_0x0065
        L_0x0053:
            r10 = r4 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x0050
            r10 = r41
            boolean r11 = r6.S(r10)
            if (r11 == 0) goto L_0x0062
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r8 = r8 | r11
        L_0x0065:
            r8 = r8 & 731(0x2db, float:1.024E-42)
            r11 = 146(0x92, float:2.05E-43)
            if (r8 != r11) goto L_0x0079
            boolean r8 = r6.i()
            if (r8 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r6.I()
            r2 = r9
            r3 = r10
            goto L_0x02a2
        L_0x0079:
            if (r2 == 0) goto L_0x007d
            r2 = r7
            goto L_0x007e
        L_0x007d:
            r2 = r9
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle r3 = io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle.SECONDARY
            goto L_0x0084
        L_0x0083:
            r3 = r10
        L_0x0084:
            Y.I0 r8 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r8 = r6.m(r8)
            r14 = r8
            android.content.Context r14 = (android.content.Context) r14
            k0.i$a r13 = k0.i.f23074a
            r8 = 0
            r9 = 0
            k0.i r10 = androidx.compose.foundation.layout.q.h(r13, r8, r7, r9)
            r11 = 24
            float r11 = (float) r11
            float r11 = c1.h.j(r11)
            k0.i r7 = androidx.compose.foundation.layout.n.k(r10, r8, r11, r7, r9)
            k0.c$a r8 = k0.c.f23044a
            k0.c$b r8 = r8.g()
            C.c r10 = C.C1085c.f882a
            C.c$m r10 = r10.g()
            H0.F r0 = C.C1090h.a(r10, r8, r6, r0)
            r8 = 0
            int r10 = Y.C1494j.a(r6, r8)
            Y.y r11 = r6.p()
            k0.i r7 = k0.h.e(r6, r7)
            J0.g$a r12 = J0.C1241g.f3853J
            yf.a r9 = r12.a()
            Y.f r16 = r6.j()
            if (r16 != 0) goto L_0x00ce
            Y.C1494j.c()
        L_0x00ce:
            r6.F()
            boolean r16 = r6.f()
            if (r16 == 0) goto L_0x00db
            r6.U(r9)
            goto L_0x00de
        L_0x00db:
            r6.q()
        L_0x00de:
            Y.m r9 = Y.F1.a(r6)
            yf.p r5 = r12.c()
            Y.F1.b(r9, r0, r5)
            yf.p r0 = r12.e()
            Y.F1.b(r9, r11, r0)
            yf.p r0 = r12.b()
            boolean r5 = r9.f()
            if (r5 != 0) goto L_0x0108
            java.lang.Object r5 = r9.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r11)
            if (r5 != 0) goto L_0x0116
        L_0x0108:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r9.r(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r9.V(r5, r0)
        L_0x0116:
            yf.p r0 = r12.d()
            Y.F1.b(r9, r7, r0)
            C.k r0 = C.C1093k.f978a
            r0 = -937558243(0xffffffffc81dff1d, float:-161788.45)
            r6.T(r0)
            if (r2 == 0) goto L_0x0149
            r0 = 100
            float r0 = (float) r0
            float r0 = c1.h.j(r0)
            k0.i r17 = androidx.compose.foundation.layout.q.r(r13, r0)
            float r0 = (float) r15
            float r21 = c1.h.j(r0)
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            k0.i r0 = androidx.compose.foundation.layout.n.m(r17, r18, r19, r20, r21, r22, r23)
            r5 = 6
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r0, r6, r5, r8)
        L_0x0149:
            r6.M()
            int r0 = r39.getMessageButtonText()
            java.lang.String r0 = M0.i.a(r0, r6, r8)
            int r5 = r39.getMessageButtonIcon()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = r39.getSubtitleText()
            r9 = -937545761(0xffffffffc81e2fdf, float:-161983.48)
            r6.T(r9)
            if (r7 != 0) goto L_0x016a
            r9 = 0
            goto L_0x0172
        L_0x016a:
            int r7 = r7.intValue()
            java.lang.String r9 = M0.i.a(r7, r6, r8)
        L_0x0172:
            r6.M()
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r7 = r39.getCtaData()
            if (r7 == 0) goto L_0x019f
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r0 = r39.getCtaData()
            java.lang.String r0 = r0.getText()
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r7 = r39.getCtaData()
            io.intercom.android.sdk.models.OpenMessengerResponse$IconType r7 = r7.getIcon()
            java.lang.Integer r7 = r7.getIcon()
            if (r7 != 0) goto L_0x0192
            goto L_0x0193
        L_0x0192:
            r5 = r7
        L_0x0193:
            io.intercom.android.sdk.models.OpenMessengerResponse$NewConversationData$Cta r7 = r39.getCtaData()
            java.lang.String r7 = r7.getSubtitle()
            r17 = r5
            r5 = r7
            goto L_0x01a2
        L_0x019f:
            r17 = r5
            r5 = r9
        L_0x01a2:
            r7 = -937533382(0xffffffffc81e603a, float:-162176.9)
            r6.T(r7)
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ConversationState r7 = r39.getConversationState()
            if (r7 == 0) goto L_0x01ba
            io.intercom.android.sdk.helpcenter.articles.ArticleViewState$ConversationState r0 = r39.getConversationState()
            int r0 = r0.getMessageButtonText()
            java.lang.String r0 = M0.i.a(r0, r6, r8)
        L_0x01ba:
            r6.M()
            io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle r7 = io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle.PRIMARY
            if (r3 != r7) goto L_0x01e1
            r7 = 1001451744(0x3bb0f0e0, float:0.0053998083)
            r6.T(r7)
            io.intercom.android.sdk.m5.helpcenter.ui.components.L r10 = new io.intercom.android.sdk.m5.helpcenter.ui.components.L
            r10.<init>(r1, r14)
            r12 = 0
            r14 = 2
            r8 = 0
            r7 = r0
            r9 = r17
            r11 = r6
            r0 = r13
            r13 = r14
            io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.IntercomPrimaryButton(r7, r8, r9, r10, r11, r12, r13)
            r6.M()
            r32 = r0
            r40 = r2
            r2 = r15
            goto L_0x021b
        L_0x01e1:
            r7 = 1001651663(0x3bb3fdcf, float:0.005492903)
            r6.T(r7)
            io.intercom.android.sdk.ui.component.IntercomButton r7 = io.intercom.android.sdk.ui.component.IntercomButton.INSTANCE
            int r8 = io.intercom.android.sdk.ui.component.IntercomButton.$stable
            int r18 = r8 << 9
            r19 = 7
            r8 = 0
            r10 = 0
            r12 = 0
            r32 = r13
            r13 = r6
            r33 = r14
            r14 = r18
            r40 = r2
            r2 = r15
            r15 = r19
            io.intercom.android.sdk.ui.component.IntercomButton$Style r8 = r7.m582outlinedStyleKlgxPg(r8, r10, r12, r13, r14, r15)
            io.intercom.android.sdk.m5.helpcenter.ui.components.M r11 = new io.intercom.android.sdk.m5.helpcenter.ui.components.M
            r7 = r33
            r11.<init>(r1, r7)
            int r7 = io.intercom.android.sdk.ui.component.IntercomButton.Style.$stable
            int r13 = r7 << 3
            r14 = 1
            r7 = 0
            r9 = r0
            r10 = r17
            r12 = r6
            io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton(r7, r8, r9, r10, r11, r12, r13, r14)
            r6.M()
        L_0x021b:
            float r0 = (float) r2
            float r0 = c1.h.j(r0)
            r2 = r32
            k0.i r0 = androidx.compose.foundation.layout.q.i(r2, r0)
            r2 = 6
            C.a0.a(r0, r6, r2)
            r0 = -937510359(0xffffffffc81eba29, float:-162536.64)
            r6.T(r0)
            if (r5 == 0) goto L_0x029a
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r0 = r0.getTypography(r6, r2)
            Q0.T r7 = r0.getType04Point5()
            r8 = 4285887861(0xff757575, double:2.117509954E-314)
            long r8 = r0.C2550z0.d(r8)
            r37 = 16777214(0xfffffe, float:2.3509884E-38)
            r38 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            Q0.T r27 = Q0.T.c(r7, r8, r10, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r37, r38)
            r30 = 0
            r31 = 65534(0xfffe, float:9.1833E-41)
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r29 = 0
            r7 = r5
            r28 = r6
            V.T0.b(r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x029a:
            r6.M()
            r6.u()
            r2 = r40
        L_0x02a2:
            Y.Y0 r6 = r6.k()
            if (r6 == 0) goto L_0x02b7
            io.intercom.android.sdk.m5.helpcenter.ui.components.N r7 = new io.intercom.android.sdk.m5.helpcenter.ui.components.N
            r0 = r7
            r1 = r39
            r4 = r43
            r5 = r44
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x02b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt.TeamPresenceComponent(io.intercom.android.sdk.helpcenter.articles.ArticleViewState$TeamPresenceState, boolean, io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceButtonStyle, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceComponent$lambda$3$lambda$1(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        C6496s.h(teamPresenceState, "$teamPresenceState");
        C6496s.h(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceComponent$lambda$3$lambda$2(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        C6496s.h(teamPresenceState, "$teamPresenceState");
        C6496s.h(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceComponent$lambda$4(ArticleViewState.TeamPresenceState teamPresenceState, boolean z10, TeamPresenceButtonStyle teamPresenceButtonStyle, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponent(teamPresenceState, z10, teamPresenceButtonStyle, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void TeamPresenceComponent$onClick(Context context, ArticleViewState.TeamPresenceState teamPresenceState) {
        Injector.get().getMetricTracker().clickedNewConversation(teamPresenceState.getMetricPlace(), teamPresenceState.getMetricContext(), teamPresenceState.isFromSearchBrowse());
        if (teamPresenceState.getConversationState() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, (String) null, false, (ArticleMetadata) null, teamPresenceState.getConversationState().getConversationId(), 14, (Object) null);
        } else if (teamPresenceState.getArticleMetadata() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, (String) null, false, teamPresenceState.getArticleMetadata(), (String) null, 22, (Object) null);
        } else {
            ConversationScreenOpenerKt.openComposer$default(context, (String) null, false, (ArticleMetadata) null, (String) null, 30, (Object) null);
        }
    }

    public static final void TeamPresenceComponentWithBubble(ArticleViewState.TeamPresenceState teamPresenceState, C1500m mVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        ArticleViewState.TeamPresenceState teamPresenceState2 = teamPresenceState;
        int i13 = i10;
        C6496s.h(teamPresenceState2, "teamPresenceState");
        C1500m h10 = mVar.h(1539837505);
        if ((i13 & 14) == 0) {
            if (h10.S(teamPresenceState2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i13;
        } else {
            i11 = i13;
        }
        if ((i11 & 11) != 2 || !h10.i()) {
            float j10 = h.j((float) ((Configuration) h10.m(AndroidCompositionLocals_androidKt.f())).screenWidthDp);
            long r22 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m681getBubbleBackground0d7_KjU();
            i.a aVar = i.f23074a;
            C1085c.m g10 = C1085c.f882a.g();
            c.a aVar2 = c.f23044a;
            F a10 = C1090h.a(g10, aVar2.k(), h10, 0);
            int a11 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = k0.h.e(h10, aVar);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
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
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            h10.T(-745953431);
            if (teamPresenceState.getSubtitleText() != null) {
                i a14 = l.a(aVar, h.j(h.j(j10 / 2.0f) - h.j((float) 60)), h.j((float) 0));
                h10.T(-745947382);
                boolean e11 = h10.e(r22);
                Object A10 = h10.A();
                if (e11 || A10 == C1500m.f10026a.a()) {
                    A10 = new H(r22);
                    h10.r(A10);
                }
                h10.M();
                a0.a(q.n(b.c(a14, (C6798l) A10), h.j((float) 16)), h10, 0);
            }
            h10.M();
            float f10 = (float) 24;
            i a15 = C2342e.a(n.m(aVar, h.j(f10), 0.0f, h.j(f10), h.j(f10), 2, (Object) null), g.c(h.j((float) 8)));
            if (teamPresenceState.getSubtitleText() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            h10.T(-745925551);
            boolean e12 = h10.e(r22);
            Object A11 = h10.A();
            if (e12 || A11 == C1500m.f10026a.a()) {
                A11 = new I(r22);
                h10.r(A11);
            }
            h10.M();
            i ifTrue = ModifierExtensionsKt.ifTrue(a15, z10, (C6798l) A11);
            F h11 = d.h(aVar2.o(), false);
            int a16 = C1494j.a(h10, 0);
            C1523y p11 = h10.p();
            i e13 = k0.h.e(h10, ifTrue);
            C6787a a17 = aVar3.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a17);
            } else {
                h10.q();
            }
            C1500m a18 = F1.a(h10);
            F1.b(a18, h11, aVar3.c());
            F1.b(a18, p11, aVar3.e());
            p b11 = aVar3.b();
            if (a18.f() || !C6496s.c(a18.A(), Integer.valueOf(a16))) {
                a18.r(Integer.valueOf(a16));
                a18.V(Integer.valueOf(a16), b11);
            }
            F1.b(a18, e13, aVar3.d());
            f fVar = f.f12848a;
            TeamPresenceComponent(teamPresenceState, false, TeamPresenceButtonStyle.PRIMARY, h10, (i11 & 14) | 432, 0);
            h10.u();
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new J(teamPresenceState2, i13));
        }
    }

    /* access modifiers changed from: private */
    public static final C2345h TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6(long j10, C2341d dVar) {
        C6496s.h(dVar, "$this$drawWithCache");
        S1 a10 = C2472Y.a();
        a10.p(0.0f, C2427m.i(dVar.d()));
        a10.t(C2427m.k(dVar.d()) / 2.0f, C2427m.i(dVar.d()) / 2.0f);
        a10.t(C2427m.k(dVar.d()), C2427m.i(dVar.d()));
        a10.close();
        return dVar.e(new K(a10, j10));
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5(S1 s12, long j10, C2605f fVar) {
        C6496s.h(s12, "$path");
        C6496s.h(fVar, "$this$onDrawBehind");
        C2605f.U(fVar, s12, j10, 0.0f, (C2606g) null, (C2547y0) null, 0, 60, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final i TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8(long j10, i iVar) {
        C6496s.h(iVar, "$this$ifTrue");
        return androidx.compose.foundation.b.d(iVar, j10, (g2) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceComponentWithBubble$lambda$12(ArticleViewState.TeamPresenceState teamPresenceState, int i10, C1500m mVar, int i11) {
        C6496s.h(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponentWithBubble(teamPresenceState, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TeamPresencePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-161512363);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m359getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new G(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresencePreview$lambda$14(int i10, C1500m mVar, int i11) {
        TeamPresencePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void TeamPresenceWithBubblePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1128132221);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m357getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TeamPresenceWithBubblePreview$lambda$13(int i10, C1500m mVar, int i11) {
        TeamPresenceWithBubblePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
