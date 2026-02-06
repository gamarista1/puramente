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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"", "text", "Lk0/i;", "modifier", "Llf/M;", "SpecialNotice", "(Ljava/lang/String;Lk0/i;LY/m;II)V", "SpecialNoticePreview", "(LY/m;I)V", "SpecialNoticeShortTextPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SpecialNoticeKt {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SpecialNotice(java.lang.String r32, k0.i r33, Y.C1500m r34, int r35, int r36) {
        /*
            r0 = r32
            r1 = r35
            r2 = r36
            java.lang.String r3 = "text"
            kotlin.jvm.internal.C6496s.h(r0, r3)
            r3 = -1272749637(0xffffffffb42361bb, float:-1.5216112E-7)
            r4 = r34
            Y.m r3 = r4.h(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002a
            boolean r4 = r3.S(r0)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r1
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r5 = r2 & 2
            r6 = 16
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r7 = r33
            goto L_0x0047
        L_0x0036:
            r7 = r1 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0033
            r7 = r33
            boolean r8 = r3.S(r7)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0046
        L_0x0045:
            r8 = r6
        L_0x0046:
            r4 = r4 | r8
        L_0x0047:
            r4 = r4 & 91
            r8 = 18
            if (r4 != r8) goto L_0x0059
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x0054
            goto L_0x0059
        L_0x0054:
            r3.I()
            goto L_0x01b6
        L_0x0059:
            if (r5 == 0) goto L_0x005f
            k0.i$a r4 = k0.i.f23074a
            r15 = r4
            goto L_0x0060
        L_0x005f:
            r15 = r7
        L_0x0060:
            r4 = 20
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            I.f r4 = I.g.c(r4)
            C.c r5 = C.C1085c.f882a
            C.c$e r5 = r5.f()
            k0.c$a r13 = k0.c.f23044a
            k0.c$c r7 = r13.l()
            r8 = 0
            r9 = 1
            r14 = 0
            k0.i r8 = androidx.compose.foundation.layout.q.h(r15, r8, r9, r14)
            io.intercom.android.sdk.ui.theme.IntercomTheme r11 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r16 = r11.getColors(r3, r10)
            r17 = r15
            long r14 = r16.m703getSpecialNoticeBackground0d7_KjU()
            k0.i r8 = androidx.compose.foundation.b.c(r8, r14, r4)
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
            io.intercom.android.sdk.ui.theme.IntercomColors r14 = r11.getColors(r3, r10)
            long r14 = r14.m704getSpecialNoticeBorder0d7_KjU()
            k0.i r4 = x.C2866e.f(r8, r9, r14, r4)
            r8 = 12
            float r8 = (float) r8
            float r8 = c1.h.j(r8)
            float r6 = (float) r6
            float r9 = c1.h.j(r6)
            k0.i r4 = androidx.compose.foundation.layout.n.j(r4, r9, r8)
            r8 = 54
            H0.F r5 = C.W.b(r5, r7, r3, r8)
            r14 = 0
            int r7 = Y.C1494j.a(r3, r14)
            Y.y r8 = r3.p()
            k0.i r4 = k0.h.e(r3, r4)
            J0.g$a r9 = J0.C1241g.f3853J
            yf.a r15 = r9.a()
            Y.f r16 = r3.j()
            if (r16 != 0) goto L_0x00d3
            Y.C1494j.c()
        L_0x00d3:
            r3.F()
            boolean r16 = r3.f()
            if (r16 == 0) goto L_0x00e0
            r3.U(r15)
            goto L_0x00e3
        L_0x00e0:
            r3.q()
        L_0x00e3:
            Y.m r15 = Y.F1.a(r3)
            yf.p r12 = r9.c()
            Y.F1.b(r15, r5, r12)
            yf.p r5 = r9.e()
            Y.F1.b(r15, r8, r5)
            yf.p r5 = r9.b()
            boolean r8 = r15.f()
            if (r8 != 0) goto L_0x010d
            java.lang.Object r8 = r15.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r12)
            if (r8 != 0) goto L_0x011b
        L_0x010d:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r15.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r15.V(r7, r5)
        L_0x011b:
            yf.p r5 = r9.d()
            Y.F1.b(r15, r4, r5)
            C.Z r12 = C.Z.f873a
            Q.b$b r4 = Q.b.C0130b.f5157a
            x0.d r4 = T.b.a(r4)
            k0.i$a r15 = k0.i.f23074a
            float r5 = c1.h.j(r6)
            k0.i r6 = androidx.compose.foundation.layout.q.n(r15, r5)
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r11.getColors(r3, r10)
            long r7 = r5.m673getActionContrastWhite0d7_KjU()
            r16 = 432(0x1b0, float:6.05E-43)
            r18 = 0
            r5 = 0
            r9 = r3
            r30 = r10
            r10 = r16
            r31 = r11
            r11 = r18
            V.V.b(r4, r5, r6, r7, r9, r10, r11)
            r4 = 8
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            k0.i r4 = androidx.compose.foundation.layout.q.r(r15, r4)
            r5 = 6
            C.a0.a(r4, r3, r5)
            k0.c$c r4 = r13.i()
            k0.i r5 = r12.c(r15, r4)
            android.text.Spanned r4 = w1.b.a(r0, r14)
            java.lang.String r6 = "fromHtml(...)"
            kotlin.jvm.internal.C6496s.g(r4, r6)
            Y.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r3.m(r6)
            android.content.Context r6 = (android.content.Context) r6
            r7 = 2
            r8 = 0
            Q0.d r4 = io.intercom.android.sdk.survey.block.BlockExtensionsKt.toAnnotatedString$default(r4, r6, r8, r7, r8)
            r7 = r30
            r6 = r31
            io.intercom.android.sdk.ui.theme.IntercomTypography r6 = r6.getTypography(r3, r7)
            Q0.T r25 = r6.getType04Point5()
            r28 = 0
            r29 = 131068(0x1fffc, float:1.83665E-40)
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r30 = r17
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 0
            r26 = r3
            V.T0.c(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.u()
            r7 = r30
        L_0x01b6:
            Y.Y0 r3 = r3.k()
            if (r3 == 0) goto L_0x01c4
            io.intercom.android.sdk.m5.conversation.ui.components.row.v0 r4 = new io.intercom.android.sdk.m5.conversation.ui.components.row.v0
            r4.<init>(r0, r7, r1, r2)
            r3.a(r4)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt.SpecialNotice(java.lang.String, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M SpecialNotice$lambda$1(String str, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        SpecialNotice(str, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void SpecialNoticePreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1291680485);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m306getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SpecialNoticePreview$lambda$2(int i10, C1500m mVar, int i11) {
        SpecialNoticePreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void SpecialNoticeShortTextPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(841465410);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$SpecialNoticeKt.INSTANCE.m308getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SpecialNoticeShortTextPreview$lambda$3(int i10, C1500m mVar, int i11) {
        SpecialNoticeShortTextPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
