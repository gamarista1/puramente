package io.intercom.android.sdk.m5.components;

import V.B0;
import V0.p;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import g0.c;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;", "args", "Llf/M;", "TicketHeader", "(Lk0/i;Lio/intercom/android/sdk/m5/components/TicketStatusHeaderArgs;LY/m;II)V", "", "text", "LV0/p;", "fontWeight", "SimpleTicketHeader", "(Lk0/i;Ljava/lang/String;LV0/p;LY/m;II)V", "TicketHeaderPreview", "(LY/m;I)V", "TicketHeaderLongTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketHeaderKt {
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SimpleTicketHeader(k0.i r52, java.lang.String r53, V0.p r54, Y.C1500m r55, int r56, int r57) {
        /*
            r0 = r53
            r13 = r56
            r1 = 48
            r2 = 2
            r3 = 6
            java.lang.String r4 = "text"
            kotlin.jvm.internal.C6496s.h(r0, r4)
            r4 = -921635597(0xffffffffc910f4f3, float:-593743.2)
            r5 = r55
            Y.m r14 = r5.h(r4)
            r4 = r57 & 1
            r15 = 4
            if (r4 == 0) goto L_0x0021
            r5 = r13 | 6
            r6 = r5
            r5 = r52
            goto L_0x0035
        L_0x0021:
            r5 = r13 & 14
            if (r5 != 0) goto L_0x0032
            r5 = r52
            boolean r6 = r14.S(r5)
            if (r6 == 0) goto L_0x002f
            r6 = r15
            goto L_0x0030
        L_0x002f:
            r6 = r2
        L_0x0030:
            r6 = r6 | r13
            goto L_0x0035
        L_0x0032:
            r5 = r52
            r6 = r13
        L_0x0035:
            r2 = r57 & 2
            r7 = 16
            if (r2 == 0) goto L_0x003d
            r6 = r6 | r1
            goto L_0x004c
        L_0x003d:
            r2 = r13 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x004c
            boolean r2 = r14.S(r0)
            if (r2 == 0) goto L_0x004a
            r2 = 32
            goto L_0x004b
        L_0x004a:
            r2 = r7
        L_0x004b:
            r6 = r6 | r2
        L_0x004c:
            r2 = r57 & 4
            if (r2 == 0) goto L_0x0056
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r8 = r54
        L_0x0054:
            r12 = r6
            goto L_0x0069
        L_0x0056:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0052
            r8 = r54
            boolean r9 = r14.S(r8)
            if (r9 == 0) goto L_0x0065
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0067
        L_0x0065:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0067:
            r6 = r6 | r9
            goto L_0x0054
        L_0x0069:
            r6 = r12 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r6 != r9) goto L_0x007f
            boolean r6 = r14.i()
            if (r6 != 0) goto L_0x0076
            goto L_0x007f
        L_0x0076:
            r14.I()
            r1 = r5
            r3 = r8
            r26 = r14
            goto L_0x01d4
        L_0x007f:
            if (r4 == 0) goto L_0x0084
            k0.i$a r4 = k0.i.f23074a
            goto L_0x0085
        L_0x0084:
            r4 = r5
        L_0x0085:
            if (r2 == 0) goto L_0x0090
            V0.p$a r2 = V0.p.f8210b
            V0.p r2 = r2.c()
            r48 = r2
            goto L_0x0092
        L_0x0090:
            r48 = r8
        L_0x0092:
            k0.c$a r2 = k0.c.f23044a
            k0.c$c r2 = r2.i()
            r5 = 0
            r6 = 0
            r11 = 3
            k0.i r5 = androidx.compose.foundation.layout.q.x(r4, r5, r6, r11, r5)
            C.c r8 = C.C1085c.f882a
            C.c$e r8 = r8.f()
            H0.F r1 = C.W.b(r8, r2, r14, r1)
            int r2 = Y.C1494j.a(r14, r6)
            Y.y r8 = r14.p()
            k0.i r5 = k0.h.e(r14, r5)
            J0.g$a r9 = J0.C1241g.f3853J
            yf.a r10 = r9.a()
            Y.f r16 = r14.j()
            if (r16 != 0) goto L_0x00c4
            Y.C1494j.c()
        L_0x00c4:
            r14.F()
            boolean r16 = r14.f()
            if (r16 == 0) goto L_0x00d1
            r14.U(r10)
            goto L_0x00d4
        L_0x00d1:
            r14.q()
        L_0x00d4:
            Y.m r10 = Y.F1.a(r14)
            yf.p r11 = r9.c()
            Y.F1.b(r10, r1, r11)
            yf.p r1 = r9.e()
            Y.F1.b(r10, r8, r1)
            yf.p r1 = r9.b()
            boolean r8 = r10.f()
            if (r8 != 0) goto L_0x00fe
            java.lang.Object r8 = r10.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r11)
            if (r8 != 0) goto L_0x010c
        L_0x00fe:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r10.r(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.V(r2, r1)
        L_0x010c:
            yf.p r1 = r9.d()
            Y.F1.b(r10, r5, r1)
            C.Z r1 = C.Z.f873a
            k0.i$a r1 = k0.i.f23074a
            float r2 = (float) r7
            float r2 = c1.h.j(r2)
            k0.i r7 = androidx.compose.foundation.layout.q.n(r1, r2)
            int r2 = io.intercom.android.sdk.R.drawable.intercom_ticket_detail_icon
            w0.c r5 = M0.e.c(r2, r14, r6)
            io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r6 = r2.getColors(r14, r11)
            long r8 = r6.m686getDescriptionText0d7_KjU()
            r16 = 440(0x1b8, float:6.17E-43)
            r17 = 0
            r6 = 0
            r10 = r14
            r50 = r11
            r49 = 3
            r11 = r16
            r51 = r12
            r12 = r17
            V.V.a(r5, r6, r7, r8, r10, r11, r12)
            float r5 = (float) r15
            float r5 = c1.h.j(r5)
            k0.i r1 = androidx.compose.foundation.layout.q.r(r1, r5)
            C.a0.a(r1, r14, r3)
            r1 = r50
            io.intercom.android.sdk.ui.theme.IntercomTypography r3 = r2.getTypography(r14, r1)
            Q0.T r16 = r3.getType04()
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r2.getColors(r14, r1)
            long r17 = r1.m686getDescriptionText0d7_KjU()
            r46 = 16777210(0xfffffa, float:2.3509879E-38)
            r47 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r21 = r48
            Q0.T r20 = Q0.T.c(r16, r17, r19, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r40, r41, r42, r43, r44, r45, r46, r47)
            b1.t$a r1 = b1.t.f19154a
            int r15 = r1.b()
            int r1 = r51 >> 3
            r22 = r1 & 14
            r23 = 3120(0xc30, float:4.372E-42)
            r24 = 55294(0xd7fe, float:7.7483E-41)
            r1 = 0
            r2 = 0
            r5 = 0
            r25 = r4
            r4 = r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r16 = 0
            r26 = r14
            r13 = r16
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r0 = r53
            r21 = r26
            V.T0.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r26.u()
            r1 = r25
            r3 = r48
        L_0x01d4:
            Y.Y0 r6 = r26.k()
            if (r6 == 0) goto L_0x01e9
            io.intercom.android.sdk.m5.components.f1 r7 = new io.intercom.android.sdk.m5.components.f1
            r0 = r7
            r2 = r53
            r4 = r56
            r5 = r57
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.TicketHeaderKt.SimpleTicketHeader(k0.i, java.lang.String, V0.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M SimpleTicketHeader$lambda$2(i iVar, String str, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        SimpleTicketHeader(iVar, str, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    public static final void TicketHeader(i iVar, TicketStatusHeaderArgs ticketStatusHeaderArgs, C1500m mVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        C6496s.h(ticketStatusHeaderArgs, "args");
        C1500m h10 = mVar.h(-254158349);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (h10.S(iVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (h10.S(ticketStatusHeaderArgs)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) != 18 || !h10.i()) {
            if (i15 != 0) {
                iVar = i.f23074a;
            }
            int i16 = i12 & 14;
            SimpleTicketHeader(iVar, ticketStatusHeaderArgs.getTitle(), ticketStatusHeaderArgs.getFontWeight(), h10, i16, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new i1(iVar, ticketStatusHeaderArgs, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketHeader$lambda$0(i iVar, TicketStatusHeaderArgs ticketStatusHeaderArgs, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(ticketStatusHeaderArgs, "$args");
        TicketHeader(iVar, ticketStatusHeaderArgs, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void TicketHeaderLongTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1234985657);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(337942641, true, new TicketHeaderKt$TicketHeaderLongTextPreview$1(new TicketStatusHeaderArgs("Very long long long long title", (p) null, 2, (DefaultConstructorMarker) null)), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketHeaderLongTextPreview$lambda$4(int i10, C1500m mVar, int i11) {
        TicketHeaderLongTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void TicketHeaderPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1418431454);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, c.e(10965256, true, new TicketHeaderKt$TicketHeaderPreview$1(new TicketStatusHeaderArgs("Bug", (p) null, 2, (DefaultConstructorMarker) null)), h10, 54), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new h1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TicketHeaderPreview$lambda$3(int i10, C1500m mVar, int i11) {
        TicketHeaderPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
