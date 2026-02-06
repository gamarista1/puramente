package io.intercom.android.sdk.m5.conversation.ui.components;

import Y.C1500m;
import Y.C1510r0;
import Y.M0;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aU\u0010\f\u001a\u00020\u00042\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "headerMenuItems", "Lkotlin/Function1;", "Llf/M;", "onMenuClicked", "Lr0/x0;", "contentColor", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "trackMetric", "ConversationKebab-cf5BqRc", "(Ljava/util/List;Lyf/l;JLyf/l;LY/m;II)V", "ConversationKebab", "", "shouldShowUnreadDot", "(Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;)Z", "", "badgeText", "(Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;)Ljava/lang/String;", "", "icon", "(Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;)I", "isMoreMenuContext", "metricData", "(Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;Z)Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationKebabKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086  */
    /* renamed from: ConversationKebab-cf5BqRc  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m250ConversationKebabcf5BqRc(java.util.List<? extends io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem> r32, yf.C6798l r33, long r34, yf.C6798l r36, Y.C1500m r37, int r38, int r39) {
        /*
            r6 = r38
            r0 = 8
            r1 = 48
            r2 = 2
            r3 = 1084184456(0x409f5788, float:4.979435)
            r4 = r37
            Y.m r3 = r4.h(r3)
            int r4 = r3.a()
            r5 = 1
            r7 = r39 & 1
            if (r7 == 0) goto L_0x001c
            r8 = r6 | 2
            goto L_0x001d
        L_0x001c:
            r8 = r6
        L_0x001d:
            r9 = r39 & 2
            if (r9 == 0) goto L_0x0025
            r8 = r8 | r1
        L_0x0022:
            r11 = r33
            goto L_0x0037
        L_0x0025:
            r11 = r6 & 112(0x70, float:1.57E-43)
            if (r11 != 0) goto L_0x0022
            r11 = r33
            boolean r12 = r3.C(r11)
            if (r12 == 0) goto L_0x0034
            r12 = 32
            goto L_0x0036
        L_0x0034:
            r12 = 16
        L_0x0036:
            r8 = r8 | r12
        L_0x0037:
            r12 = r39 & 4
            if (r12 == 0) goto L_0x0040
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x003d:
            r13 = r34
            goto L_0x0052
        L_0x0040:
            r13 = r6 & 896(0x380, float:1.256E-42)
            if (r13 != 0) goto L_0x003d
            r13 = r34
            boolean r15 = r3.e(r13)
            if (r15 == 0) goto L_0x004f
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0051
        L_0x004f:
            r15 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r8 = r8 | r15
        L_0x0052:
            r15 = r39 & 8
            if (r15 == 0) goto L_0x005b
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x0058:
            r2 = r36
            goto L_0x006e
        L_0x005b:
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0058
            r2 = r36
            boolean r17 = r3.C(r2)
            if (r17 == 0) goto L_0x006a
            r17 = 2048(0x800, float:2.87E-42)
            goto L_0x006c
        L_0x006a:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x006c:
            r8 = r8 | r17
        L_0x006e:
            if (r7 != r5) goto L_0x0086
            r0 = r8 & 5851(0x16db, float:8.199E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r0 != r10) goto L_0x0086
            boolean r0 = r3.i()
            if (r0 != 0) goto L_0x007d
            goto L_0x0086
        L_0x007d:
            r3.I()
            r1 = r32
            r5 = r2
            r2 = r11
            goto L_0x03ab
        L_0x0086:
            if (r7 == 0) goto L_0x008f
            java.util.List r0 = mf.C6565s.n()
            r29 = r0
            goto L_0x0091
        L_0x008f:
            r29 = r32
        L_0x0091:
            if (r9 == 0) goto L_0x0099
            io.intercom.android.sdk.m5.conversation.ui.components.i r0 = new io.intercom.android.sdk.m5.conversation.ui.components.i
            r0.<init>()
            r11 = r0
        L_0x0099:
            if (r12 == 0) goto L_0x00a4
            r0.x0$a r0 = r0.C2544x0.f25560b
            long r9 = r0.a()
            r30 = r9
            goto L_0x00a6
        L_0x00a4:
            r30 = r13
        L_0x00a6:
            if (r15 == 0) goto L_0x00af
            io.intercom.android.sdk.m5.conversation.ui.components.j r0 = new io.intercom.android.sdk.m5.conversation.ui.components.j
            r0.<init>()
            r15 = r0
            goto L_0x00b0
        L_0x00af:
            r15 = r2
        L_0x00b0:
            k0.c$a r0 = k0.c.f23044a
            k0.c$c r0 = r0.i()
            k0.i$a r2 = k0.i.f23074a
            C.c r7 = C.C1085c.f882a
            C.c$e r7 = r7.f()
            H0.F r0 = C.W.b(r7, r0, r3, r1)
            r1 = 0
            int r7 = Y.C1494j.a(r3, r1)
            Y.y r9 = r3.p()
            k0.i r2 = k0.h.e(r3, r2)
            J0.g$a r10 = J0.C1241g.f3853J
            yf.a r12 = r10.a()
            Y.f r13 = r3.j()
            if (r13 != 0) goto L_0x00de
            Y.C1494j.c()
        L_0x00de:
            r3.F()
            boolean r13 = r3.f()
            if (r13 == 0) goto L_0x00eb
            r3.U(r12)
            goto L_0x00ee
        L_0x00eb:
            r3.q()
        L_0x00ee:
            Y.m r12 = Y.F1.a(r3)
            yf.p r13 = r10.c()
            Y.F1.b(r12, r0, r13)
            yf.p r0 = r10.e()
            Y.F1.b(r12, r9, r0)
            yf.p r0 = r10.b()
            boolean r9 = r12.f()
            if (r9 != 0) goto L_0x0118
            java.lang.Object r9 = r12.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 != 0) goto L_0x0126
        L_0x0118:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r12.r(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r12.V(r7, r0)
        L_0x0126:
            yf.p r0 = r10.d()
            Y.F1.b(r12, r2, r0)
            C.Z r0 = C.Z.f873a
            r0 = 2047867882(0x7a0ffbea, float:1.8690197E35)
            r3.T(r0)
            r0 = r29
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x013d:
            boolean r2 = r0.hasNext()
            r7 = 0
            if (r2 == 0) goto L_0x0150
            java.lang.Object r2 = r0.next()
            r9 = r2
            io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem r9 = (io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem) r9
            boolean r9 = r9 instanceof io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages
            if (r9 == 0) goto L_0x013d
            goto L_0x0151
        L_0x0150:
            r2 = r7
        L_0x0151:
            io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem r2 = (io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem) r2
            if (r2 == 0) goto L_0x0161
            java.lang.String r0 = "null cannot be cast to non-null type io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages"
            kotlin.jvm.internal.C6496s.f(r2, r0)
            io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem$Messages r2 = (io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.Messages) r2
            io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem$TotalCountIndicator r0 = r2.getTotalCountIndicator()
            goto L_0x0162
        L_0x0161:
            r0 = r7
        L_0x0162:
            boolean r2 = r0 instanceof io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator
            if (r2 == 0) goto L_0x016f
            r2 = r0
            io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem$TotalCountIndicator$UnreadCountIndicator r2 = (io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.TotalCountIndicator.UnreadCountIndicator) r2
            java.lang.String r2 = r2.getUnreadMessagesCount()
            r10 = r2
            goto L_0x0170
        L_0x016f:
            r10 = r7
        L_0x0170:
            boolean r12 = r0 instanceof io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem.TotalCountIndicator.UnreadDotIndicator
            boolean r0 = r29.isEmpty()
            if (r0 == 0) goto L_0x019e
            r0 = 2048373646(0x7a17b38e, float:1.9691966E35)
            r3.T(r0)
            r3.M()
            r3.n(r4)
            Y.Y0 r8 = r3.k()
            if (r8 == 0) goto L_0x019d
            io.intercom.android.sdk.m5.conversation.ui.components.k r9 = new io.intercom.android.sdk.m5.conversation.ui.components.k
            r0 = r9
            r1 = r29
            r2 = r11
            r3 = r30
            r5 = r15
            r6 = r38
            r7 = r39
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.a(r9)
        L_0x019d:
            return
        L_0x019e:
            int r0 = r29.size()
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            if (r0 != r5) goto L_0x021c
            r0 = 2048472753(0x7a1936b1, float:1.9888267E35)
            r3.T(r0)
            java.lang.Object r0 = mf.C6565s.o0(r29)
            io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem r0 = (io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem) r0
            io.intercom.android.sdk.ui.common.StringProvider r4 = r0.getLabel()
            int r7 = io.intercom.android.sdk.ui.common.StringProvider.$stable
            java.lang.String r4 = r4.getText(r3, r7)
            int r9 = icon(r0)
            boolean r16 = r0.getEnabled()
            r7 = -1180838359(0xffffffffb99dd629, float:-3.0104935E-4)
            r3.T(r7)
            r7 = r8 & 112(0x70, float:1.57E-43)
            r13 = 32
            if (r7 != r13) goto L_0x01d2
            r7 = r5
            goto L_0x01d3
        L_0x01d2:
            r7 = r1
        L_0x01d3:
            boolean r13 = r3.S(r0)
            r7 = r7 | r13
            r13 = r8 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 != r14) goto L_0x01df
            goto L_0x01e0
        L_0x01df:
            r5 = r1
        L_0x01e0:
            r1 = r7 | r5
            java.lang.Object r5 = r3.A()
            if (r1 != 0) goto L_0x01f0
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r5 != r1) goto L_0x01f8
        L_0x01f0:
            io.intercom.android.sdk.m5.conversation.ui.components.l r5 = new io.intercom.android.sdk.m5.conversation.ui.components.l
            r5.<init>(r11, r0, r15)
            r3.r(r5)
        L_0x01f8:
            r14 = r5
            yf.a r14 = (yf.C6787a) r14
            r3.M()
            int r0 = r8 << 21
            r0 = r0 & r2
            r1 = 1572864(0x180000, float:2.204052E-39)
            r19 = r0 | r1
            r20 = 17
            r7 = 0
            r0 = 0
            r13 = 0
            r8 = r4
            r4 = r11
            r11 = r0
            r0 = r15
            r15 = r16
            r16 = r30
            r18 = r3
            io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.m252HeaderMenuItemRow6RhP_wg(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            r3.M()
            goto L_0x039f
        L_0x021c:
            r4 = r11
            r0 = r15
            r9 = 2049182219(0x7a240a0b, float:2.129351E35)
            r3.T(r9)
            r9 = -1180824432(0xffffffffb99e0c90, float:-3.0145468E-4)
            r3.T(r9)
            java.lang.Object r9 = r3.A()
            Y.m$a r22 = Y.C1500m.f10026a
            java.lang.Object r11 = r22.a()
            if (r9 != r11) goto L_0x0240
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r11 = 2
            Y.r0 r9 = Y.u1.d(r9, r7, r11, r7)
            r3.r(r9)
        L_0x0240:
            r15 = r9
            Y.r0 r15 = (Y.C1510r0) r15
            r3.M()
            k0.i$a r14 = k0.i.f23074a
            r9 = 3
            k0.i r7 = androidx.compose.foundation.layout.q.z(r14, r7, r1, r9, r7)
            C.c r9 = C.C1085c.f882a
            C.c$m r9 = r9.g()
            k0.c$a r11 = k0.c.f23044a
            k0.c$b r11 = r11.k()
            H0.F r9 = C.C1090h.a(r9, r11, r3, r1)
            int r11 = Y.C1494j.a(r3, r1)
            Y.y r13 = r3.p()
            k0.i r7 = k0.h.e(r3, r7)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r1 = r16.a()
            Y.f r17 = r3.j()
            if (r17 != 0) goto L_0x0278
            Y.C1494j.c()
        L_0x0278:
            r3.F()
            boolean r17 = r3.f()
            if (r17 == 0) goto L_0x0285
            r3.U(r1)
            goto L_0x0288
        L_0x0285:
            r3.q()
        L_0x0288:
            Y.m r1 = Y.F1.a(r3)
            yf.p r2 = r16.c()
            Y.F1.b(r1, r9, r2)
            yf.p r2 = r16.e()
            Y.F1.b(r1, r13, r2)
            yf.p r2 = r16.b()
            boolean r9 = r1.f()
            if (r9 != 0) goto L_0x02b2
            java.lang.Object r9 = r1.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r13)
            if (r9 != 0) goto L_0x02c0
        L_0x02b2:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r1.r(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r1.V(r9, r2)
        L_0x02c0:
            yf.p r2 = r16.d()
            Y.F1.b(r1, r7, r2)
            C.k r1 = C.C1093k.f978a
            int r9 = io.intercom.android.sdk.R.drawable.intercom_kebab
            java.lang.Object r1 = r15.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r11 = r1 ^ 1
            r1 = -1935443118(0xffffffff8ca37b52, float:-2.5188347E-31)
            r3.T(r1)
            r1 = r8 & 7168(0x1c00, float:1.0045E-41)
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 != r2) goto L_0x02e5
            r1 = r5
            goto L_0x02e6
        L_0x02e5:
            r1 = 0
        L_0x02e6:
            java.lang.Object r2 = r3.A()
            if (r1 != 0) goto L_0x02f2
            java.lang.Object r1 = r22.a()
            if (r2 != r1) goto L_0x02fa
        L_0x02f2:
            io.intercom.android.sdk.m5.conversation.ui.components.m r2 = new io.intercom.android.sdk.m5.conversation.ui.components.m
            r2.<init>(r15, r0)
            r3.r(r2)
        L_0x02fa:
            r1 = r2
            yf.a r1 = (yf.C6787a) r1
            r3.M()
            int r2 = r8 << 21
            r7 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r7
            r7 = 102236208(0x6180030, float:2.858816E-35)
            r19 = r2 | r7
            r20 = 1
            r7 = 0
            java.lang.String r8 = "More Menu"
            r13 = 0
            r2 = 1
            r5 = r14
            r14 = r1
            r1 = r15
            r15 = r2
            r16 = r30
            r18 = r3
            io.intercom.android.sdk.m5.conversation.ui.components.HeaderMenuItemRowKt.m252HeaderMenuItemRow6RhP_wg(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20)
            r2 = 220(0xdc, float:3.08E-43)
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            k0.i r9 = androidx.compose.foundation.layout.q.r(r5, r2)
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r8 = r2.getColors(r3, r5)
            long r15 = r8.m678getBackground0d7_KjU()
            V.B0 r2 = r2.getShapes(r3, r5)
            I.a r14 = r2.e()
            r2 = 8
            float r2 = (float) r2
            float r18 = c1.h.j(r2)
            r2 = -1935428387(0xffffffff8ca3b4dd, float:-2.522298E-31)
            r3.T(r2)
            java.lang.Object r2 = r3.A()
            java.lang.Object r5 = r22.a()
            if (r2 != r5) goto L_0x0364
            io.intercom.android.sdk.m5.conversation.ui.components.n r2 = new io.intercom.android.sdk.m5.conversation.ui.components.n
            r2.<init>(r1)
            r3.r(r2)
        L_0x0364:
            r8 = r2
            yf.a r8 = (yf.C6787a) r8
            r3.M()
            io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$ConversationKebab$3$3$3 r2 = new io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$ConversationKebab$3$3$3
            r22 = r2
            r23 = r29
            r24 = r4
            r25 = r0
            r26 = r30
            r28 = r1
            r22.<init>(r23, r24, r25, r26, r28)
            r1 = 54
            r5 = 1309645384(0x4e0f9a48, float:6.0231322E8)
            r10 = 1
            g0.a r20 = g0.c.e(r5, r10, r2, r3, r1)
            r23 = 48
            r24 = 1336(0x538, float:1.872E-42)
            r10 = 0
            r12 = 0
            r13 = 0
            r17 = 0
            r19 = 0
            r22 = 805306800(0x300001b0, float:4.6568527E-10)
            r21 = r3
            V.C1375d.a(r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            r3.u()
            r3.M()
        L_0x039f:
            r3.M()
            r3.u()
            r5 = r0
            r2 = r4
            r1 = r29
            r13 = r30
        L_0x03ab:
            Y.Y0 r8 = r3.k()
            if (r8 == 0) goto L_0x03bf
            io.intercom.android.sdk.m5.conversation.ui.components.o r9 = new io.intercom.android.sdk.m5.conversation.ui.components.o
            r0 = r9
            r3 = r13
            r6 = r38
            r7 = r39
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r8.a(r9)
        L_0x03bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt.m250ConversationKebabcf5BqRc(java.util.List, yf.l, long, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationKebab_cf5BqRc$lambda$0(HeaderMenuItem headerMenuItem) {
        C6496s.h(headerMenuItem, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationKebab_cf5BqRc$lambda$1(MetricData metricData) {
        C6496s.h(metricData, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$11$lambda$10(C1510r0 r0Var) {
        C6496s.h(r0Var, "$isExpanded");
        r0Var.setValue(Boolean.FALSE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationKebab_cf5BqRc$lambda$13$lambda$12$lambda$9$lambda$8(C1510r0 r0Var, C6798l lVar) {
        C6496s.h(r0Var, "$isExpanded");
        r0Var.setValue(Boolean.valueOf(!((Boolean) r0Var.getValue()).booleanValue()));
        lVar.invoke(MetricData.MoreMenuClicked.INSTANCE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationKebab_cf5BqRc$lambda$13$lambda$4(List list, C6798l lVar, long j10, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        m250ConversationKebabcf5BqRc(list, lVar, j10, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationKebab_cf5BqRc$lambda$13$lambda$6$lambda$5(C6798l lVar, HeaderMenuItem headerMenuItem, C6798l lVar2) {
        C6496s.h(headerMenuItem, "$menuItem");
        lVar.invoke(headerMenuItem);
        lVar2.invoke(metricData(headerMenuItem, false));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ConversationKebab_cf5BqRc$lambda$14(List list, C6798l lVar, long j10, C6798l lVar2, int i10, int i11, C1500m mVar, int i12) {
        m250ConversationKebabcf5BqRc(list, lVar, j10, lVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final String badgeText(HeaderMenuItem headerMenuItem) {
        if (!(headerMenuItem instanceof HeaderMenuItem.Messages)) {
            return null;
        }
        String unreadMessagesCount = ((HeaderMenuItem.Messages) headerMenuItem).getUnreadMessagesCount();
        if (unreadMessagesCount.length() == 0) {
            return null;
        }
        return unreadMessagesCount;
    }

    /* access modifiers changed from: private */
    public static final int icon(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return R.drawable.intercom_inbox;
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return R.drawable.intercom_send_message_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return R.drawable.intercom_ticket_detail_icon;
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return R.drawable.intercom_help_centre_icon;
        }
        throw new C6535s();
    }

    /* access modifiers changed from: private */
    public static final MetricData metricData(HeaderMenuItem headerMenuItem, boolean z10) {
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            return new MetricData.ConversationsInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return new MetricData.TicketsInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            return new MetricData.NewConversationInMoreMenuClicked(z10);
        }
        if (headerMenuItem instanceof HeaderMenuItem.Help) {
            return MetricData.HelpInMoreMenuClicked.INSTANCE;
        }
        throw new C6535s();
    }

    /* access modifiers changed from: private */
    public static final boolean shouldShowUnreadDot(HeaderMenuItem headerMenuItem) {
        if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            return ((HeaderMenuItem.Tickets) headerMenuItem).getHasUnreadTickets();
        }
        return false;
    }
}
