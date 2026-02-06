package io.intercom.android.sdk.m5.home.ui;

import Ef.m;
import Y.C1500m;
import Y.M0;
import android.content.Context;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.PoweredBy;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aÉ\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0007H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u00158\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/home/HomeViewModel;", "homeViewModel", "Lkotlin/Function0;", "Llf/M;", "onMessagesClicked", "onHelpClicked", "onTicketsClicked", "Lkotlin/Function1;", "", "onTicketItemClicked", "navigateToMessages", "navigateToNewConversation", "navigateToExistingConversation", "onNewConversationClicked", "Lio/intercom/android/sdk/models/Conversation;", "onConversationClicked", "onCloseClick", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "onTicketLinkClicked", "HomeScreen", "(Lio/intercom/android/sdk/m5/home/HomeViewModel;Lyf/a;Lyf/a;Lyf/a;Lyf/l;Lyf/a;Lyf/a;Lyf/l;Lyf/a;Lyf/l;Lyf/a;Lyf/l;LY/m;II)V", "", "scrollValue", "", "headerHeight", "getHeaderContentOpacity", "(IF)F", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "", "isDarkContentEnabled", "(Lio/intercom/android/sdk/m5/home/states/HomeUiState;)Z", "ANIMATION_DURATION", "I", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenKt {
    private static final int ANIMATION_DURATION = 600;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: yf.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x034c, code lost:
        if (r7.S(r11) == false) goto L_0x0352;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0406  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HomeScreen(io.intercom.android.sdk.m5.home.HomeViewModel r30, yf.C6787a r31, yf.C6787a r32, yf.C6787a r33, yf.C6798l r34, yf.C6787a r35, yf.C6787a r36, yf.C6798l r37, yf.C6787a r38, yf.C6798l r39, yf.C6787a r40, yf.C6798l r41, Y.C1500m r42, int r43, int r44) {
        /*
            r6 = r30
            r11 = r40
            java.lang.String r0 = "homeViewModel"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            java.lang.String r0 = "onMessagesClicked"
            r9 = r31
            kotlin.jvm.internal.C6496s.h(r9, r0)
            java.lang.String r0 = "onHelpClicked"
            r10 = r32
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "onTicketsClicked"
            r15 = r33
            kotlin.jvm.internal.C6496s.h(r15, r0)
            java.lang.String r0 = "onTicketItemClicked"
            r14 = r34
            kotlin.jvm.internal.C6496s.h(r14, r0)
            java.lang.String r0 = "navigateToMessages"
            r13 = r35
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "navigateToNewConversation"
            r12 = r36
            kotlin.jvm.internal.C6496s.h(r12, r0)
            java.lang.String r0 = "navigateToExistingConversation"
            r5 = r37
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "onNewConversationClicked"
            r4 = r38
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "onConversationClicked"
            r3 = r39
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "onCloseClick"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.lang.String r0 = "onTicketLinkClicked"
            r2 = r41
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = 1138475448(0x43dbc1b8, float:439.51343)
            r1 = r42
            Y.m r1 = r1.h(r0)
            Xg.L r0 = r30.getUiState()
            r7 = 0
            r8 = 8
            r5 = 1
            Y.A1 r8 = Y.p1.b(r0, r7, r1, r8, r5)
            r0 = 0
            androidx.compose.foundation.o r26 = androidx.compose.foundation.m.a(r0, r1, r0, r5)
            r0 = 853953228(0x32e64acc, float:2.6809538E-8)
            r1.T(r0)
            java.lang.Object r0 = r1.A()
            Y.m$a r27 = Y.C1500m.f10026a
            java.lang.Object r5 = r27.a()
            r7 = 0
            if (r0 != r5) goto L_0x0088
            Y.n0 r0 = Y.D0.a(r7)
            r1.r(r0)
        L_0x0088:
            r5 = r0
            Y.n0 r5 = (Y.C1503n0) r5
            r1.M()
            io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1 r0 = new io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1
            r17 = 0
            r42 = r0
            r7 = 0
            r7 = r1
            r1 = r30
            r2 = r35
            r3 = r36
            r4 = r37
            r9 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 70
            r2 = r42
            r1 = 0
            Y.P.g(r1, r2, r7, r0)
            java.lang.Object r0 = r8.getValue()
            io.intercom.android.sdk.m5.home.states.HomeUiState r0 = (io.intercom.android.sdk.m5.home.states.HomeUiState) r0
            boolean r0 = isDarkContentEnabled(r0)
            r1 = 0
            io.intercom.android.sdk.utilities.ApplyStatusBarColorKt.ApplyStatusBarContentColor(r0, r7, r1)
            k0.i$a r0 = k0.i.f23074a
            k0.c$a r2 = k0.c.f23044a
            k0.c r3 = r2.o()
            H0.F r3 = androidx.compose.foundation.layout.d.h(r3, r1)
            int r4 = Y.C1494j.a(r7, r1)
            Y.y r1 = r7.p()
            k0.i r5 = k0.h.e(r7, r0)
            J0.g$a r28 = J0.C1241g.f3853J
            yf.a r10 = r28.a()
            Y.f r16 = r7.j()
            if (r16 != 0) goto L_0x00e1
            Y.C1494j.c()
        L_0x00e1:
            r7.F()
            boolean r16 = r7.f()
            if (r16 == 0) goto L_0x00ee
            r7.U(r10)
            goto L_0x00f1
        L_0x00ee:
            r7.q()
        L_0x00f1:
            Y.m r10 = Y.F1.a(r7)
            yf.p r12 = r28.c()
            Y.F1.b(r10, r3, r12)
            yf.p r3 = r28.e()
            Y.F1.b(r10, r1, r3)
            yf.p r1 = r28.b()
            boolean r3 = r10.f()
            if (r3 != 0) goto L_0x011b
            java.lang.Object r3 = r10.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r12)
            if (r3 != 0) goto L_0x0129
        L_0x011b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r10.r(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r10.V(r3, r1)
        L_0x0129:
            yf.p r1 = r28.d()
            Y.F1.b(r10, r5, r1)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            java.lang.Object r3 = r8.getValue()
            boolean r3 = r3 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Content
            r4 = 600(0x258, float:8.41E-43)
            r5 = 0
            r10 = 0
            r12 = 6
            w.q0 r13 = w.C2798j.j(r4, r10, r5, r12, r5)
            r14 = 2
            r15 = 0
            androidx.compose.animation.i r18 = androidx.compose.animation.g.o(r13, r15, r14, r5)
            w.q0 r13 = w.C2798j.j(r4, r10, r5, r12, r5)
            androidx.compose.animation.k r19 = androidx.compose.animation.g.q(r13, r15, r14, r5)
            io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$1 r5 = new io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$1
            r5.<init>(r8, r6, r9)
            r10 = 750386582(0x2cb9fd96, float:5.28617E-12)
            r15 = 54
            r12 = 1
            g0.a r21 = g0.c.e(r10, r12, r5, r7, r15)
            r23 = 200064(0x30d80, float:2.8035E-40)
            r24 = 18
            r17 = 0
            r20 = 0
            r16 = r3
            r22 = r7
            v.C2721d.g(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r3 = r8.getValue()
            io.intercom.android.sdk.m5.home.states.HomeUiState r3 = (io.intercom.android.sdk.m5.home.states.HomeUiState) r3
            r5 = 0
            r10 = 1
            r12 = 0
            k0.i r13 = androidx.compose.foundation.layout.q.f(r0, r12, r10, r5)
            k0.i r16 = C.j0.d(r13)
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r26
            k0.i r5 = androidx.compose.foundation.m.d(r16, r17, r18, r19, r20, r21, r22)
            C.c r10 = C.C1085c.f882a
            C.c$m r10 = r10.g()
            k0.c$b r12 = r2.k()
            r13 = 0
            H0.F r10 = C.C1090h.a(r10, r12, r7, r13)
            int r12 = Y.C1494j.a(r7, r13)
            Y.y r13 = r7.p()
            k0.i r5 = k0.h.e(r7, r5)
            yf.a r14 = r28.a()
            Y.f r16 = r7.j()
            if (r16 != 0) goto L_0x01b7
            Y.C1494j.c()
        L_0x01b7:
            r7.F()
            boolean r16 = r7.f()
            if (r16 == 0) goto L_0x01c4
            r7.U(r14)
            goto L_0x01c7
        L_0x01c4:
            r7.q()
        L_0x01c7:
            Y.m r14 = Y.F1.a(r7)
            yf.p r4 = r28.c()
            Y.F1.b(r14, r10, r4)
            yf.p r4 = r28.e()
            Y.F1.b(r14, r13, r4)
            yf.p r4 = r28.b()
            boolean r10 = r14.f()
            if (r10 != 0) goto L_0x01f1
            java.lang.Object r10 = r14.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r13)
            if (r10 != 0) goto L_0x01ff
        L_0x01f1:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r14.r(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r14.V(r10, r4)
        L_0x01ff:
            yf.p r4 = r28.d()
            Y.F1.b(r14, r5, r4)
            C.k r4 = C.C1093k.f978a
            r5 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            k0.i r18 = r4.a(r0, r5, r10)
            boolean r5 = r3 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Error
            io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$2$1 r12 = new io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$2$1
            r12.<init>(r3, r11)
            r13 = -1537640308(0xffffffffa459788c, float:-4.715648E-17)
            g0.a r22 = g0.c.e(r13, r10, r12, r7, r15)
            r25 = 28
            r19 = 0
            r20 = 0
            r21 = 0
            r10 = 1572870(0x180006, float:2.20406E-39)
            r16 = r4
            r17 = r5
            r23 = r7
            r24 = r10
            v.C2721d.e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r5 = r3 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Loading
            androidx.compose.animation.k$a r12 = androidx.compose.animation.k.f12384a
            androidx.compose.animation.k r20 = r12.a()
            io.intercom.android.sdk.m5.home.ui.ComposableSingletons$HomeScreenKt r12 = io.intercom.android.sdk.m5.home.ui.ComposableSingletons$HomeScreenKt.INSTANCE
            yf.q r22 = r12.m371getLambda1$intercom_sdk_base_release()
            r25 = 22
            r18 = 0
            r17 = r5
            v.C2721d.e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r5 = r3 instanceof io.intercom.android.sdk.m5.home.states.HomeUiState.Content
            r10 = 4
            r12 = 0
            r13 = 600(0x258, float:8.41E-43)
            w.q0 r14 = w.C2798j.j(r13, r13, r12, r10, r12)
            r10 = 2
            r15 = 0
            androidx.compose.animation.i r23 = androidx.compose.animation.g.o(r14, r15, r10, r12)
            r6 = 6
            r14 = 0
            w.q0 r13 = w.C2798j.j(r13, r14, r12, r6, r12)
            androidx.compose.animation.k r6 = androidx.compose.animation.g.q(r13, r15, r10, r12)
            io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$2$2 r10 = new io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$2$2
            r12 = r10
            r13 = r3
            r14 = r26
            r11 = 54
            r15 = r9
            r16 = r31
            r17 = r32
            r18 = r33
            r19 = r34
            r20 = r38
            r21 = r39
            r22 = r41
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r12 = 21007876(0x1408e04, float:3.5366722E-38)
            r13 = 1
            g0.a r18 = g0.c.e(r12, r13, r10, r7, r11)
            r20 = 1600518(0x186c06, float:2.242803E-39)
            r21 = 18
            r14 = 0
            r17 = 0
            r12 = r4
            r13 = r5
            r15 = r23
            r16 = r6
            r19 = r7
            v.C2721d.e(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = 100
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            k0.i r4 = androidx.compose.foundation.layout.q.i(r0, r4)
            r6 = 6
            C.a0.a(r4, r7, r6)
            r7.u()
            Y.I0 r4 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r4 = r7.m(r4)
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r6 = r8.getValue()
            io.intercom.android.sdk.m5.home.states.HomeUiState r6 = (io.intercom.android.sdk.m5.home.states.HomeUiState) r6
            io.intercom.android.sdk.models.PoweredBy r6 = r6.getPoweredBy()
            r8 = 748835432(0x2ca25268, float:4.613466E-12)
            r7.T(r8)
            if (r6 != 0) goto L_0x02c8
            goto L_0x02f0
        L_0x02c8:
            k0.i r8 = C.j0.d(r0)
            k0.c r10 = r2.b()
            k0.i r15 = r1.e(r8, r10)
            java.lang.String r12 = r6.getText()
            io.intercom.android.sdk.models.PoweredBy$PoweredByIconType r13 = r6.getIcon()
            io.intercom.android.sdk.m5.home.ui.n r14 = new io.intercom.android.sdk.m5.home.ui.n
            r14.<init>(r6, r4)
            r21 = 0
            r22 = 48
            r16 = 0
            r18 = 0
            r20 = r7
            io.intercom.android.sdk.m5.components.PoweredByBadgeKt.m205PoweredByBadgewBJOh4Y(r12, r13, r14, r15, r16, r18, r20, r21, r22)
            lf.M r4 = lf.C6514M.f71813a
        L_0x02f0:
            r7.M()
            r4 = 748856026(0x2ca2a2da, float:4.622397E-12)
            r7.T(r4)
            if (r5 == 0) goto L_0x045f
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content r3 = (io.intercom.android.sdk.m5.home.states.HomeUiState.Content) r3
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader r3 = r3.getHeader()
            io.intercom.android.sdk.m5.home.states.HomeUiState$Content$ContentHeader$CloseButtonColor r3 = r3.getCloseButtonColor()
            k0.i r4 = C.j0.d(r0)
            r5 = 14
            float r6 = (float) r5
            float r5 = c1.h.j(r6)
            r6 = -16
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r4 = androidx.compose.foundation.layout.l.a(r4, r6, r5)
            k0.c r5 = r2.n()
            k0.i r4 = r1.e(r4, r5)
            I.f r5 = I.g.e()
            k0.i r4 = o0.C2342e.a(r4, r5)
            r5 = 30
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            k0.i r12 = androidx.compose.foundation.layout.q.n(r4, r5)
            r4 = -1050635848(0xffffffffc16091b8, float:-14.035576)
            r7.T(r4)
            r4 = 14
            r4 = r44 & 14
            r5 = 6
            r4 = r4 ^ r5
            r6 = 4
            if (r4 <= r6) goto L_0x034f
            r4 = r11
            r11 = r40
            boolean r8 = r7.S(r11)
            if (r8 != 0) goto L_0x0356
            goto L_0x0352
        L_0x034f:
            r4 = r11
            r11 = r40
        L_0x0352:
            r5 = r44 & 6
            if (r5 != r6) goto L_0x0358
        L_0x0356:
            r5 = 1
            goto L_0x0359
        L_0x0358:
            r5 = 0
        L_0x0359:
            java.lang.Object r6 = r7.A()
            if (r5 != 0) goto L_0x0365
            java.lang.Object r5 = r27.a()
            if (r6 != r5) goto L_0x036d
        L_0x0365:
            io.intercom.android.sdk.m5.home.ui.o r6 = new io.intercom.android.sdk.m5.home.ui.o
            r6.<init>(r11)
            r7.r(r6)
        L_0x036d:
            r16 = r6
            yf.a r16 = (yf.C6787a) r16
            r7.M()
            r17 = 7
            r18 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            k0.i r5 = androidx.compose.foundation.d.d(r12, r13, r14, r15, r16, r17, r18)
            k0.c r6 = r2.o()
            r8 = 0
            H0.F r6 = androidx.compose.foundation.layout.d.h(r6, r8)
            int r10 = Y.C1494j.a(r7, r8)
            Y.y r8 = r7.p()
            k0.i r5 = k0.h.e(r7, r5)
            yf.a r12 = r28.a()
            Y.f r13 = r7.j()
            if (r13 != 0) goto L_0x03a1
            Y.C1494j.c()
        L_0x03a1:
            r7.F()
            boolean r13 = r7.f()
            if (r13 == 0) goto L_0x03ae
            r7.U(r12)
            goto L_0x03b1
        L_0x03ae:
            r7.q()
        L_0x03b1:
            Y.m r12 = Y.F1.a(r7)
            yf.p r13 = r28.c()
            Y.F1.b(r12, r6, r13)
            yf.p r6 = r28.e()
            Y.F1.b(r12, r8, r6)
            yf.p r6 = r28.b()
            boolean r8 = r12.f()
            if (r8 != 0) goto L_0x03db
            java.lang.Object r8 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r13)
            if (r8 != 0) goto L_0x03e9
        L_0x03db:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r12.r(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r12.V(r8, r6)
        L_0x03e9:
            yf.p r6 = r28.d()
            Y.F1.b(r12, r5, r6)
            int r5 = r26.n()
            double r5 = (double) r5
            float r8 = r9.c()
            double r8 = (double) r8
            r12 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r8 = r8 * r12
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0406
            r12 = 1
            goto L_0x0407
        L_0x0406:
            r12 = 0
        L_0x0407:
            r5 = 3
            r6 = 0
            r8 = 0
            androidx.compose.animation.i r14 = androidx.compose.animation.g.o(r6, r8, r5, r6)
            androidx.compose.animation.k r15 = androidx.compose.animation.g.q(r6, r8, r5, r6)
            io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$4$2$1 r5 = new io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$2$4$2$1
            r5.<init>(r1, r3)
            r6 = -1722206090(0xffffffff99593876, float:-1.1230039E-23)
            r8 = 1
            g0.a r17 = g0.c.e(r6, r8, r5, r7, r4)
            r19 = 200064(0x30d80, float:2.8035E-40)
            r20 = 18
            r13 = 0
            r16 = 0
            r18 = r7
            v.C2721d.g(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            k0.c r2 = r2.e()
            k0.i r14 = r1.e(r0, r2)
            Q.b r0 = Q.b.f5154a
            Q.b$a r0 = r0.a()
            x0.d r12 = S.d.a(r0)
            int r0 = io.intercom.android.sdk.R.string.intercom_close
            r1 = 0
            java.lang.String r13 = M0.i.a(r0, r7, r1)
            java.lang.String r0 = r3.getForegroundColor()
            r1 = 0
            r2 = 1
            r3 = 0
            long r15 = io.intercom.android.sdk.utilities.ColorExtensionsKt.toComposeColor$default(r0, r3, r2, r1)
            r18 = 0
            r19 = 0
            r17 = r7
            V.V.b(r12, r13, r14, r15, r17, r18, r19)
            r7.u()
            lf.M r0 = lf.C6514M.f71813a
            goto L_0x0461
        L_0x045f:
            r11 = r40
        L_0x0461:
            r7.M()
            r7.u()
            Y.Y0 r15 = r7.k()
            if (r15 == 0) goto L_0x0496
            io.intercom.android.sdk.m5.home.ui.p r14 = new io.intercom.android.sdk.m5.home.ui.p
            r0 = r14
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r41
            r13 = r43
            r29 = r14
            r14 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r29
            r15.a(r0)
        L_0x0496:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.home.ui.HomeScreenKt.HomeScreen(io.intercom.android.sdk.m5.home.HomeViewModel, yf.a, yf.a, yf.a, yf.l, yf.a, yf.a, yf.l, yf.a, yf.l, yf.a, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeScreen$lambda$8$lambda$3$lambda$2(PoweredBy poweredBy, Context context) {
        C6496s.h(poweredBy, "$poweredBy");
        C6496s.h(context, "$context");
        Injector.get().getMetricTracker().clickedPoweredBy("home");
        LinkOpener.handleUrl(poweredBy.getLinkUrl(), context, Injector.get().getApi());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeScreen$lambda$8$lambda$7$lambda$5$lambda$4(C6787a aVar) {
        C6496s.h(aVar, "$onCloseClick");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M HomeScreen$lambda$9(HomeViewModel homeViewModel, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6787a aVar4, C6787a aVar5, C6798l lVar2, C6787a aVar6, C6798l lVar3, C6787a aVar7, C6798l lVar4, int i10, int i11, C1500m mVar, int i12) {
        HomeViewModel homeViewModel2 = homeViewModel;
        C6496s.h(homeViewModel2, "$homeViewModel");
        C6787a aVar8 = aVar;
        C6496s.h(aVar8, "$onMessagesClicked");
        C6787a aVar9 = aVar2;
        C6496s.h(aVar9, "$onHelpClicked");
        C6787a aVar10 = aVar3;
        C6496s.h(aVar10, "$onTicketsClicked");
        C6798l lVar5 = lVar;
        C6496s.h(lVar5, "$onTicketItemClicked");
        C6787a aVar11 = aVar4;
        C6496s.h(aVar11, "$navigateToMessages");
        C6787a aVar12 = aVar5;
        C6496s.h(aVar12, "$navigateToNewConversation");
        C6798l lVar6 = lVar2;
        C6496s.h(lVar6, "$navigateToExistingConversation");
        C6787a aVar13 = aVar6;
        C6496s.h(aVar13, "$onNewConversationClicked");
        C6798l lVar7 = lVar3;
        C6496s.h(lVar7, "$onConversationClicked");
        C6787a aVar14 = aVar7;
        C6496s.h(aVar14, "$onCloseClick");
        C6798l lVar8 = lVar4;
        C6496s.h(lVar8, "$onTicketLinkClicked");
        HomeScreen(homeViewModel2, aVar8, aVar9, aVar10, lVar5, aVar11, aVar12, lVar6, aVar13, lVar7, aVar14, lVar8, mVar, M0.a(i10 | 1), M0.a(i11));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final float getHeaderContentOpacity(int i10, float f10) {
        return m.k((f10 - ((float) i10)) / f10, 0.0f, 1.0f);
    }

    private static final boolean isDarkContentEnabled(HomeUiState homeUiState) {
        if (homeUiState instanceof HomeUiState.Content) {
            return ColorExtensionsKt.m718isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Content) homeUiState).getHeader().getIntro().getColor(), 0.0f, 1, (Object) null));
        }
        if (homeUiState instanceof HomeUiState.Error) {
            return ColorExtensionsKt.m718isDarkColor8_81llA(ColorExtensionsKt.toComposeColor$default(((HomeUiState.Error) homeUiState).getHeader().getForegroundColor(), 0.0f, 1, (Object) null));
        }
        return true;
    }
}
