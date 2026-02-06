package io.intercom.android.sdk.tickets.list.ui;

import C.N;
import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "data", "LC/N;", "contentPadding", "", "showUnreadIndicator", "Llf/M;", "TicketRow", "(Lk0/i;Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;LC/N;ZLY/m;II)V", "TicketRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketRowKt {
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x035a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void TicketRow(k0.i r68, io.intercom.android.sdk.tickets.list.ui.TicketRowData r69, C.N r70, boolean r71, Y.C1500m r72, int r73, int r74) {
        /*
            r2 = r69
            r5 = r73
            r0 = 48
            r1 = 2
            r3 = 6
            java.lang.String r4 = "data"
            kotlin.jvm.internal.C6496s.h(r2, r4)
            r4 = -1789130333(0xffffffff955c09a3, float:-4.4436248E-26)
            r6 = r72
            Y.m r4 = r6.h(r4)
            r15 = 1
            r6 = r74 & 1
            r14 = 4
            if (r6 == 0) goto L_0x0022
            r7 = r5 | 6
            r8 = r7
            r7 = r68
            goto L_0x0036
        L_0x0022:
            r7 = r5 & 14
            if (r7 != 0) goto L_0x0033
            r7 = r68
            boolean r8 = r4.S(r7)
            if (r8 == 0) goto L_0x0030
            r8 = r14
            goto L_0x0031
        L_0x0030:
            r8 = r1
        L_0x0031:
            r8 = r8 | r5
            goto L_0x0036
        L_0x0033:
            r7 = r68
            r8 = r5
        L_0x0036:
            r1 = r74 & 2
            r9 = 16
            r10 = 32
            if (r1 == 0) goto L_0x0040
            r8 = r8 | r0
            goto L_0x004e
        L_0x0040:
            r1 = r5 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L_0x004e
            boolean r1 = r4.S(r2)
            if (r1 == 0) goto L_0x004c
            r1 = r10
            goto L_0x004d
        L_0x004c:
            r1 = r9
        L_0x004d:
            r8 = r8 | r1
        L_0x004e:
            r1 = r5 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L_0x0067
            r1 = r74 & 4
            if (r1 != 0) goto L_0x0061
            r1 = r70
            boolean r11 = r4.S(r1)
            if (r11 == 0) goto L_0x0063
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0061:
            r1 = r70
        L_0x0063:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r8 = r8 | r11
            goto L_0x0069
        L_0x0067:
            r1 = r70
        L_0x0069:
            r11 = r5 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0082
            r11 = r74 & 8
            if (r11 != 0) goto L_0x007c
            r11 = r71
            boolean r12 = r4.b(r11)
            if (r12 == 0) goto L_0x007e
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007c:
            r11 = r71
        L_0x007e:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r8 = r8 | r12
            goto L_0x0084
        L_0x0082:
            r11 = r71
        L_0x0084:
            r8 = r8 & 5851(0x16db, float:8.199E-42)
            r12 = 1170(0x492, float:1.64E-42)
            if (r8 != r12) goto L_0x0098
            boolean r8 = r4.i()
            if (r8 != 0) goto L_0x0091
            goto L_0x0098
        L_0x0091:
            r4.I()
            r3 = r1
            r1 = r7
            goto L_0x0383
        L_0x0098:
            r4.D()
            r8 = r5 & 1
            if (r8 == 0) goto L_0x00ae
            boolean r8 = r4.L()
            if (r8 == 0) goto L_0x00a6
            goto L_0x00ae
        L_0x00a6:
            r4.I()
            r13 = r1
            r1 = r7
        L_0x00ab:
            r31 = r11
            goto L_0x00d9
        L_0x00ae:
            if (r6 == 0) goto L_0x00b3
            k0.i$a r6 = k0.i.f23074a
            goto L_0x00b4
        L_0x00b3:
            r6 = r7
        L_0x00b4:
            r7 = r74 & 4
            if (r7 == 0) goto L_0x00c8
            float r1 = (float) r9
            float r1 = c1.h.j(r1)
            r7 = 20
            float r7 = (float) r7
            float r7 = c1.h.j(r7)
            C.N r1 = androidx.compose.foundation.layout.n.b(r7, r1)
        L_0x00c8:
            r7 = r74 & 8
            if (r7 == 0) goto L_0x00d6
            boolean r7 = r69.isRead()
            r7 = r7 ^ r15
            r13 = r1
            r1 = r6
            r31 = r7
            goto L_0x00d9
        L_0x00d6:
            r13 = r1
            r1 = r6
            goto L_0x00ab
        L_0x00d9:
            r4.v()
            k0.i r6 = androidx.compose.foundation.layout.n.h(r1, r13)
            k0.c$a r19 = k0.c.f23044a
            k0.c$c r7 = r19.i()
            C.c r20 = C.C1085c.f882a
            C.c$e r8 = r20.f()
            H0.F r0 = C.W.b(r8, r7, r4, r0)
            r12 = 0
            int r7 = Y.C1494j.a(r4, r12)
            Y.y r8 = r4.p()
            k0.i r6 = k0.h.e(r4, r6)
            J0.g$a r21 = J0.C1241g.f3853J
            yf.a r9 = r21.a()
            Y.f r11 = r4.j()
            if (r11 != 0) goto L_0x010c
            Y.C1494j.c()
        L_0x010c:
            r4.F()
            boolean r11 = r4.f()
            if (r11 == 0) goto L_0x0119
            r4.U(r9)
            goto L_0x011c
        L_0x0119:
            r4.q()
        L_0x011c:
            Y.m r9 = Y.F1.a(r4)
            yf.p r11 = r21.c()
            Y.F1.b(r9, r0, r11)
            yf.p r0 = r21.e()
            Y.F1.b(r9, r8, r0)
            yf.p r0 = r21.b()
            boolean r8 = r9.f()
            if (r8 != 0) goto L_0x0146
            java.lang.Object r8 = r9.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r11)
            if (r8 != 0) goto L_0x0154
        L_0x0146:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.V(r7, r0)
        L_0x0154:
            yf.p r0 = r21.d()
            Y.F1.b(r9, r6, r0)
            C.Z r22 = C.Z.f873a
            k0.i$a r0 = k0.i.f23074a
            float r6 = (float) r10
            float r6 = c1.h.j(r6)
            k0.i r6 = androidx.compose.foundation.layout.q.n(r0, r6)
            I.f r7 = I.g.e()
            io.intercom.android.sdk.tickets.TicketStatus r8 = r69.getStatus()
            long r23 = r8.m537getColor0d7_KjU()
            r29 = 14
            r30 = 0
            r25 = 1036831949(0x3dcccccd, float:0.1)
            r26 = 0
            r27 = 0
            r28 = 0
            long r8 = r0.C2544x0.o(r23, r25, r26, r27, r28, r29, r30)
            io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1 r10 = new io.intercom.android.sdk.tickets.list.ui.TicketRowKt$TicketRow$1$1
            r10.<init>(r2)
            r11 = 54
            r12 = 1329606754(0x4f403062, float:3.22439629E9)
            g0.a r16 = g0.c.e(r12, r15, r10, r4, r11)
            r17 = 12582918(0xc00006, float:1.7632424E-38)
            r18 = 120(0x78, float:1.68E-43)
            r10 = 0
            r12 = 0
            r23 = 0
            r24 = 0
            r33 = r13
            r13 = r23
            r14 = r24
            r15 = r16
            r16 = r4
            V.O0.a(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            r6 = 10
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r6 = androidx.compose.foundation.layout.q.r(r0, r6)
            C.a0.a(r6, r4, r3)
            r26 = 2
            r27 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r23 = r0
            k0.i r6 = C.Y.b(r22, r23, r24, r25, r26, r27)
            C.c$m r7 = r20.g()
            k0.c$b r8 = r19.k()
            r13 = 0
            H0.F r7 = C.C1090h.a(r7, r8, r4, r13)
            int r8 = Y.C1494j.a(r4, r13)
            Y.y r9 = r4.p()
            k0.i r6 = k0.h.e(r4, r6)
            yf.a r10 = r21.a()
            Y.f r11 = r4.j()
            if (r11 != 0) goto L_0x01ee
            Y.C1494j.c()
        L_0x01ee:
            r4.F()
            boolean r11 = r4.f()
            if (r11 == 0) goto L_0x01fb
            r4.U(r10)
            goto L_0x01fe
        L_0x01fb:
            r4.q()
        L_0x01fe:
            Y.m r10 = Y.F1.a(r4)
            yf.p r11 = r21.c()
            Y.F1.b(r10, r7, r11)
            yf.p r7 = r21.e()
            Y.F1.b(r10, r9, r7)
            yf.p r7 = r21.b()
            boolean r9 = r10.f()
            if (r9 != 0) goto L_0x0228
            java.lang.Object r9 = r10.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r11)
            if (r9 != 0) goto L_0x0236
        L_0x0228:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.r(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.V(r8, r7)
        L_0x0236:
            yf.p r7 = r21.d()
            Y.F1.b(r10, r6, r7)
            C.k r6 = C.C1093k.f978a
            java.lang.String r6 = r69.getTitle()
            io.intercom.android.sdk.ui.theme.IntercomTheme r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r14 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r15.getTypography(r4, r14)
            Q0.T r34 = r7.getType04()
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r15.getColors(r4, r14)
            long r35 = r7.m700getPrimaryText0d7_KjU()
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
            boolean r7 = r69.isRead()
            if (r7 == 0) goto L_0x029d
            V0.p$a r7 = V0.p.f8210b
            V0.p r7 = r7.c()
        L_0x029a:
            r27 = r7
            goto L_0x02a4
        L_0x029d:
            V0.p$a r7 = V0.p.f8210b
            V0.p r7 = r7.d()
            goto L_0x029a
        L_0x02a4:
            b1.t$a r32 = b1.t.f19154a
            int r21 = r32.b()
            r29 = 3120(0xc30, float:4.372E-42)
            r30 = 55262(0xd7de, float:7.7439E-41)
            r7 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r16 = 0
            r66 = r14
            r14 = r16
            r16 = 0
            r67 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r25 = 0
            r28 = 0
            r13 = r27
            r27 = r4
            V.T0.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r6 = 4
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r6 = androidx.compose.foundation.layout.q.i(r0, r6)
            C.a0.a(r6, r4, r3)
            java.lang.String r6 = r69.getSubTitle()
            int r21 = r32.b()
            r8 = r66
            r7 = r67
            io.intercom.android.sdk.ui.theme.IntercomTypography r9 = r7.getTypography(r4, r8)
            Q0.T r34 = r9.getType04()
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r7.getColors(r4, r8)
            long r35 = r7.m686getDescriptionText0d7_KjU()
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
            r30 = 55294(0xd7fe, float:7.7483E-41)
            r7 = 0
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            V.T0.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.u()
            if (r31 == 0) goto L_0x035a
            r0 = -318867215(0xffffffffecfe78f1, float:-2.4611063E27)
            r4.T(r0)
            r0 = 0
            r3 = 1
            r6 = 0
            io.intercom.android.sdk.m5.components.ConversationItemKt.UnreadIndicator(r0, r4, r6, r3)
            r4.M()
            goto L_0x037c
        L_0x035a:
            r6 = 0
            r7 = -318819320(0xffffffffecff3408, float:-2.4681744E27)
            r4.T(r7)
            float r7 = (float) r3
            float r24 = c1.h.j(r7)
            r28 = 14
            r29 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r23 = r0
            k0.i r0 = androidx.compose.foundation.layout.n.m(r23, r24, r25, r26, r27, r28, r29)
            io.intercom.android.sdk.m5.components.IntercomChevronKt.IntercomChevron(r0, r4, r3, r6)
            r4.M()
        L_0x037c:
            r4.u()
            r11 = r31
            r3 = r33
        L_0x0383:
            Y.Y0 r7 = r4.k()
            if (r7 == 0) goto L_0x0399
            io.intercom.android.sdk.tickets.list.ui.b r8 = new io.intercom.android.sdk.tickets.list.ui.b
            r0 = r8
            r2 = r69
            r4 = r11
            r5 = r73
            r6 = r74
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0399:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.list.ui.TicketRowKt.TicketRow(k0.i, io.intercom.android.sdk.tickets.list.ui.TicketRowData, C.N, boolean, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketRow$lambda$2(i iVar, TicketRowData ticketRowData, N n10, boolean z10, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(ticketRowData, "$data");
        TicketRow(iVar, ticketRowData, n10, z10, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void TicketRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1396185263);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TicketRowKt.INSTANCE.m550getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketRowPreview$lambda$3(int i10, C1500m mVar, int i11) {
        TicketRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
