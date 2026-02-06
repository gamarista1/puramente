package io.intercom.android.sdk.m5.conversation.ui.components.row;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "text", "Lk0/i;", "modifier", "Llf/M;", "DayDivider", "(Ljava/lang/String;Lk0/i;LY/m;II)V", "DayDividerPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DayDividerKt {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DayDivider(java.lang.String r27, k0.i r28, Y.C1500m r29, int r30, int r31) {
        /*
            r0 = r27
            r15 = r30
            r13 = r31
            r1 = 2
            java.lang.String r2 = "text"
            kotlin.jvm.internal.C6496s.h(r0, r2)
            r2 = 600554765(0x23cbbd0d, float:2.208937E-17)
            r3 = r29
            Y.m r14 = r3.h(r2)
            r2 = r13 & 1
            r3 = 4
            if (r2 == 0) goto L_0x001d
            r2 = r15 | 6
            goto L_0x002d
        L_0x001d:
            r2 = r15 & 14
            if (r2 != 0) goto L_0x002c
            boolean r2 = r14.S(r0)
            if (r2 == 0) goto L_0x0029
            r2 = r3
            goto L_0x002a
        L_0x0029:
            r2 = r1
        L_0x002a:
            r2 = r2 | r15
            goto L_0x002d
        L_0x002c:
            r2 = r15
        L_0x002d:
            r1 = r1 & r13
            if (r1 == 0) goto L_0x0035
            r2 = r2 | 48
        L_0x0032:
            r4 = r28
            goto L_0x0047
        L_0x0035:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x0032
            r4 = r28
            boolean r5 = r14.S(r4)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r2 = r2 | r5
        L_0x0047:
            r5 = r2 & 91
            r6 = 18
            if (r5 != r6) goto L_0x005b
            boolean r5 = r14.i()
            if (r5 != 0) goto L_0x0054
            goto L_0x005b
        L_0x0054:
            r14.I()
            r26 = r14
            goto L_0x014b
        L_0x005b:
            if (r1 == 0) goto L_0x0061
            k0.i$a r1 = k0.i.f23074a
            r12 = r1
            goto L_0x0062
        L_0x0061:
            r12 = r4
        L_0x0062:
            C.c r1 = C.C1085c.f882a
            C.c$f r1 = r1.b()
            k0.c$a r4 = k0.c.f23044a
            k0.c$c r4 = r4.i()
            r5 = 3
            r6 = 0
            r7 = 0
            k0.i r5 = androidx.compose.foundation.layout.q.x(r12, r6, r7, r5, r6)
            io.intercom.android.sdk.ui.theme.IntercomTheme r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r9 = r6.getColors(r14, r8)
            long r9 = r9.m706getTimestampBackground0d7_KjU()
            V.B0 r11 = r6.getShapes(r14, r8)
            I.a r11 = r11.e()
            k0.i r5 = androidx.compose.foundation.b.c(r5, r9, r11)
            r9 = 12
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.n.j(r5, r9, r3)
            r5 = 54
            H0.F r1 = C.W.b(r1, r4, r14, r5)
            int r4 = Y.C1494j.a(r14, r7)
            Y.y r5 = r14.p()
            k0.i r3 = k0.h.e(r14, r3)
            J0.g$a r7 = J0.C1241g.f3853J
            yf.a r9 = r7.a()
            Y.f r10 = r14.j()
            if (r10 != 0) goto L_0x00be
            Y.C1494j.c()
        L_0x00be:
            r14.F()
            boolean r10 = r14.f()
            if (r10 == 0) goto L_0x00cb
            r14.U(r9)
            goto L_0x00ce
        L_0x00cb:
            r14.q()
        L_0x00ce:
            Y.m r9 = Y.F1.a(r14)
            yf.p r10 = r7.c()
            Y.F1.b(r9, r1, r10)
            yf.p r1 = r7.e()
            Y.F1.b(r9, r5, r1)
            yf.p r1 = r7.b()
            boolean r5 = r9.f()
            if (r5 != 0) goto L_0x00f8
            java.lang.Object r5 = r9.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r10)
            if (r5 != 0) goto L_0x0106
        L_0x00f8:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r9.r(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.V(r4, r1)
        L_0x0106:
            yf.p r1 = r7.d()
            Y.F1.b(r9, r3, r1)
            C.Z r1 = C.Z.f873a
            io.intercom.android.sdk.ui.theme.IntercomTypography r1 = r6.getTypography(r14, r8)
            Q0.T r20 = r1.getType04Point5()
            r22 = r2 & 14
            r23 = 0
            r24 = 65534(0xfffe, float:9.1833E-41)
            r1 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r16 = 0
            r25 = r12
            r12 = r16
            r16 = 0
            r26 = r14
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r27
            r21 = r26
            V.T0.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r26.u()
            r4 = r25
        L_0x014b:
            Y.Y0 r0 = r26.k()
            if (r0 == 0) goto L_0x015f
            io.intercom.android.sdk.m5.conversation.ui.components.row.A r1 = new io.intercom.android.sdk.m5.conversation.ui.components.row.A
            r2 = r27
            r3 = r30
            r5 = r31
            r1.<init>(r2, r4, r3, r5)
            r0.a(r1)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt.DayDivider(java.lang.String, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M DayDivider$lambda$1(String str, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        DayDivider(str, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void DayDividerPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(191155235);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$DayDividerKt.INSTANCE.m287getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new B(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DayDividerPreview$lambda$2(int i10, C1500m mVar, int i11) {
        DayDividerPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
