package io.intercom.android.sdk.m5.navigation;

import Y.C1500m;
import Y.M0;
import androidx.activity.C1554j;
import androidx.compose.animation.d;
import g0.c;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import j3.C2124A;
import j3.C2125B;
import j3.C2126C;
import j3.C2135f;
import j3.H;
import j3.i;
import j3.k;
import j3.v;
import j3.x;
import java.util.List;
import k3.C2159k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\n\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aW\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\r8\u0000XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\r8\u0000XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\r8\u0000XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lj3/v;", "Lj3/x;", "navController", "Landroidx/activity/j;", "rootActivity", "Llf/M;", "ticketDetailDestination", "(Lj3/v;Lj3/x;Landroidx/activity/j;)V", "Lio/intercom/android/sdk/tickets/TicketDetailState;", "ticketDetailState", "Lkotlin/Function0;", "onBackClicked", "Lkotlin/Function2;", "", "", "onConversationCTAClicked", "showSubmissionCard", "isLaunchedProgrammatically", "TicketDetailScreen", "(Lio/intercom/android/sdk/tickets/TicketDetailState;Lyf/a;Lyf/p;ZZLY/m;II)V", "SHOW_SUBMISSION_CARD", "Ljava/lang/String;", "TICKET_ID", "LAUNCHED_FROM", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketDetailDestinationKt {
    public static final String LAUNCHED_FROM = "from";
    public static final String SHOW_SUBMISSION_CARD = "show_submission_card";
    public static final String TICKET_ID = "ticket_id";

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TicketDetailScreen(io.intercom.android.sdk.tickets.TicketDetailState r22, yf.C6787a r23, yf.p r24, boolean r25, boolean r26, Y.C1500m r27, int r28, int r29) {
        /*
            r1 = r22
            r5 = r26
            r6 = r28
            java.lang.String r0 = "ticketDetailState"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            r0 = 226165078(0xd7b0156, float:7.7346955E-31)
            r2 = r27
            Y.m r0 = r2.h(r0)
            r2 = r29 & 1
            if (r2 == 0) goto L_0x001b
            r2 = r6 | 6
            goto L_0x002b
        L_0x001b:
            r2 = r6 & 14
            if (r2 != 0) goto L_0x002a
            boolean r2 = r0.S(r1)
            if (r2 == 0) goto L_0x0027
            r2 = 4
            goto L_0x0028
        L_0x0027:
            r2 = 2
        L_0x0028:
            r2 = r2 | r6
            goto L_0x002b
        L_0x002a:
            r2 = r6
        L_0x002b:
            r3 = r29 & 2
            if (r3 == 0) goto L_0x0034
            r2 = r2 | 48
        L_0x0031:
            r4 = r23
            goto L_0x0046
        L_0x0034:
            r4 = r6 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0031
            r4 = r23
            boolean r7 = r0.C(r4)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r2 = r2 | r7
        L_0x0046:
            r7 = r29 & 4
            if (r7 == 0) goto L_0x004f
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r24
            goto L_0x0061
        L_0x004f:
            r8 = r6 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x004c
            r8 = r24
            boolean r9 = r0.C(r8)
            if (r9 == 0) goto L_0x005e
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r9
        L_0x0061:
            r9 = r29 & 8
            if (r9 == 0) goto L_0x006a
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r10 = r25
            goto L_0x007c
        L_0x006a:
            r10 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0067
            r10 = r25
            boolean r11 = r0.b(r10)
            if (r11 == 0) goto L_0x0079
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r2 = r2 | r11
        L_0x007c:
            r11 = r29 & 16
            if (r11 == 0) goto L_0x0083
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0095
        L_0x0083:
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r6
            if (r11 != 0) goto L_0x0095
            boolean r11 = r0.b(r5)
            if (r11 == 0) goto L_0x0092
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r2 = r2 | r11
        L_0x0095:
            r11 = 46811(0xb6db, float:6.5596E-41)
            r2 = r2 & r11
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r11) goto L_0x00ac
            boolean r2 = r0.i()
            if (r2 != 0) goto L_0x00a4
            goto L_0x00ac
        L_0x00a4:
            r0.I()
            r2 = r4
            r3 = r8
            r4 = r10
            goto L_0x0119
        L_0x00ac:
            if (r3 == 0) goto L_0x00b4
            io.intercom.android.sdk.m5.navigation.K0 r2 = new io.intercom.android.sdk.m5.navigation.K0
            r2.<init>()
            goto L_0x00b5
        L_0x00b4:
            r2 = r4
        L_0x00b5:
            if (r7 == 0) goto L_0x00bd
            io.intercom.android.sdk.m5.navigation.L0 r3 = new io.intercom.android.sdk.m5.navigation.L0
            r3.<init>()
            goto L_0x00be
        L_0x00bd:
            r3 = r8
        L_0x00be:
            if (r9 == 0) goto L_0x00c2
            r4 = 0
            goto L_0x00c3
        L_0x00c2:
            r4 = r10
        L_0x00c3:
            k0.i$a r7 = k0.i.f23074a
            io.intercom.android.sdk.ui.theme.IntercomTheme r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r8 = r8.getColors(r0, r9)
            long r8 = r8.m678getBackground0d7_KjU()
            r11 = 2
            r12 = 0
            r10 = 0
            k0.i r7 = androidx.compose.foundation.b.d(r7, r8, r10, r11, r12)
            C.f0$a r8 = C.f0.f925a
            r9 = 8
            C.f0 r8 = C.l0.b(r8, r0, r9)
            k0.i r7 = C.i0.d(r7, r8)
            java.lang.String r8 = "ticket_detail_screen"
            k0.i r7 = androidx.compose.ui.platform.n1.a(r7, r8)
            io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$3 r8 = new io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$3
            r8.<init>(r1, r2)
            r9 = -2018170598(0xffffffff87b5291a, float:-2.725801E-34)
            r10 = 1
            r11 = 54
            g0.a r8 = g0.c.e(r9, r10, r8, r0, r11)
            io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$4 r9 = new io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$4
            r9.<init>(r1, r3, r5, r4)
            r12 = 1401868325(0x538ed025, float:1.22675488E12)
            g0.a r18 = g0.c.e(r12, r10, r9, r0, r11)
            r20 = 805306416(0x30000030, float:4.6566395E-10)
            r21 = 508(0x1fc, float:7.12E-43)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = r0
            V.C1415x0.a(r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21)
        L_0x0119:
            Y.Y0 r8 = r0.k()
            if (r8 == 0) goto L_0x0130
            io.intercom.android.sdk.m5.navigation.M0 r9 = new io.intercom.android.sdk.m5.navigation.M0
            r0 = r9
            r1 = r22
            r5 = r26
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt.TicketDetailScreen(io.intercom.android.sdk.tickets.TicketDetailState, yf.a, yf.p, boolean, boolean, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailScreen$lambda$17() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailScreen$lambda$18(String str, boolean z10) {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketDetailScreen$lambda$19(TicketDetailState ticketDetailState, C6787a aVar, p pVar, boolean z10, boolean z11, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(ticketDetailState, "$ticketDetailState");
        TicketDetailScreen(ticketDetailState, aVar, pVar, z10, z11, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void ticketDetailDestination(v vVar, x xVar, C1554j jVar) {
        x xVar2 = xVar;
        C1554j jVar2 = jVar;
        C6496s.h(vVar, "<this>");
        C6496s.h(xVar2, "navController");
        C6496s.h(jVar2, "rootActivity");
        C2159k.b(vVar, "TICKET_DETAIL?show_submission_card={show_submission_card}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", C6565s.q(C2135f.a(SHOW_SUBMISSION_CARD, new N0()), C2135f.a("transitionArgs", new A0()), C2135f.a("isLaunchedProgrammatically", new B0())), (List) null, new C0(), new D0(), new E0(), new F0(), (C6798l) null, c.c(-1948427665, true, new TicketDetailDestinationKt$ticketDetailDestination$8(jVar2, xVar2)), 132, (Object) null);
        C2159k.b(vVar, "TICKET_DETAIL/{ticket_id}?from={from}&transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", C6565s.q(C2135f.a(TICKET_ID, new G0()), C2135f.a(LAUNCHED_FROM, new H0()), C2135f.a("transitionArgs", new I0()), C2135f.a("isLaunchedProgrammatically", new O0())), (List) null, new P0(), new Q0(), new R0(), new C6264z0(), (C6798l) null, c.c(1365826072, true, new TicketDetailDestinationKt$ticketDetailDestination$17(xVar2, jVar2)), 132, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$lambda$10(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        iVar.c(true);
        iVar.b(MetricTracker.Context.FROM_TICKETS_SPACE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$lambda$11(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(TransitionStyleKt.getTransitionArgNavType());
        iVar.b(new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$lambda$12(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.BoolType);
        iVar.b(Boolean.FALSE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i ticketDetailDestination$lambda$13(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k ticketDetailDestination$lambda$14(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getExit().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i ticketDetailDestination$lambda$15(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k ticketDetailDestination$lambda$16(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopExit().transition();
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$lambda$2(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.BoolType);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$lambda$3(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(TransitionStyleKt.getTransitionArgNavType());
        iVar.b(new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$lambda$4(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.BoolType);
        iVar.b(Boolean.FALSE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i ticketDetailDestination$lambda$5(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k ticketDetailDestination$lambda$6(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getExit().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i ticketDetailDestination$lambda$7(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k ticketDetailDestination$lambda$8(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopExit().transition();
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$lambda$9(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void ticketDetailDestination$onBackClicked(x xVar, C1554j jVar) {
        if (xVar.K() == null) {
            jVar.getOnBackPressedDispatcher().l();
        } else {
            xVar.X();
        }
    }

    /* access modifiers changed from: private */
    public static final void ticketDetailDestination$onConversationCTAClicked(x xVar, String str, boolean z10) {
        IntercomRouterKt.openConversation$default(xVar, str, (String) null, z10, (String) null, C2125B.a(new C6262y0()), (TransitionArgs) null, 42, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$onConversationCTAClicked$lambda$1(C2124A a10) {
        C6496s.h(a10, "$this$navOptions");
        a10.d("CONVERSATION", new J0());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ticketDetailDestination$onConversationCTAClicked$lambda$1$lambda$0(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(true);
        return C6514M.f71813a;
    }
}
