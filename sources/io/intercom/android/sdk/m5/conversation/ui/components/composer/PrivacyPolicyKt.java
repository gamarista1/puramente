package io.intercom.android.sdk.m5.conversation.ui.components.composer;

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
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "text", "Lk0/i;", "modifier", "Lkotlin/Function0;", "Llf/M;", "onCloseClicked", "PrivacyPolicy", "(Ljava/lang/String;Lk0/i;Lyf/a;LY/m;II)V", "PrivacyPolicyPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PrivacyPolicyKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void PrivacyPolicy(java.lang.String r36, k0.i r37, yf.C6787a r38, Y.C1500m r39, int r40, int r41) {
        /*
            r1 = r36
            r4 = r40
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            r0 = -2047732965(0xffffffff85f2131b, float:-2.2764589E-35)
            r2 = r39
            Y.m r0 = r2.h(r0)
            r2 = r41 & 1
            r3 = 2
            if (r2 == 0) goto L_0x001a
            r2 = r4 | 6
            goto L_0x002a
        L_0x001a:
            r2 = r4 & 14
            if (r2 != 0) goto L_0x0029
            boolean r2 = r0.S(r1)
            if (r2 == 0) goto L_0x0026
            r2 = 4
            goto L_0x0027
        L_0x0026:
            r2 = r3
        L_0x0027:
            r2 = r2 | r4
            goto L_0x002a
        L_0x0029:
            r2 = r4
        L_0x002a:
            r5 = r41 & 2
            r6 = 16
            if (r5 == 0) goto L_0x0035
            r2 = r2 | 48
        L_0x0032:
            r7 = r37
            goto L_0x0046
        L_0x0035:
            r7 = r4 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0032
            r7 = r37
            boolean r8 = r0.S(r7)
            if (r8 == 0) goto L_0x0044
            r8 = 32
            goto L_0x0045
        L_0x0044:
            r8 = r6
        L_0x0045:
            r2 = r2 | r8
        L_0x0046:
            r8 = r41 & 4
            if (r8 == 0) goto L_0x004f
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r38
            goto L_0x0061
        L_0x004f:
            r9 = r4 & 896(0x380, float:1.256E-42)
            if (r9 != 0) goto L_0x004c
            r9 = r38
            boolean r10 = r0.C(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r2 = r2 | r10
        L_0x0061:
            r2 = r2 & 731(0x2db, float:1.024E-42)
            r10 = 146(0x92, float:2.05E-43)
            if (r2 != r10) goto L_0x0075
            boolean r2 = r0.i()
            if (r2 != 0) goto L_0x006e
            goto L_0x0075
        L_0x006e:
            r0.I()
            r2 = r7
            r3 = r9
            goto L_0x020f
        L_0x0075:
            if (r5 == 0) goto L_0x007a
            k0.i$a r2 = k0.i.f23074a
            goto L_0x007b
        L_0x007a:
            r2 = r7
        L_0x007b:
            if (r8 == 0) goto L_0x0085
            io.intercom.android.sdk.m5.conversation.ui.components.composer.v0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.v0
            r5.<init>()
            r31 = r5
            goto L_0x0087
        L_0x0085:
            r31 = r9
        L_0x0087:
            io.intercom.android.sdk.ui.theme.IntercomTheme r14 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            V.B0 r5 = r14.getShapes(r0, r15)
            I.a r5 = r5.e()
            C.c r7 = C.C1085c.f882a
            C.c$f r7 = r7.d()
            r8 = 0
            r9 = 1
            r10 = 0
            k0.i r11 = androidx.compose.foundation.layout.q.h(r2, r8, r9, r10)
            io.intercom.android.sdk.ui.theme.IntercomColors r12 = r14.getColors(r0, r15)
            long r12 = r12.m681getBubbleBackground0d7_KjU()
            k0.i r5 = androidx.compose.foundation.b.c(r11, r12, r5)
            r11 = 12
            float r11 = (float) r11
            float r11 = c1.h.j(r11)
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r5 = androidx.compose.foundation.layout.n.j(r5, r6, r11)
            r6 = 70
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            k0.i r5 = androidx.compose.foundation.layout.q.k(r5, r8, r6, r9, r10)
            k0.c$a r32 = k0.c.f23044a
            k0.c$c r6 = r32.l()
            r13 = 6
            H0.F r6 = C.W.b(r7, r6, r0, r13)
            r12 = 0
            int r7 = Y.C1494j.a(r0, r12)
            Y.y r8 = r0.p()
            k0.i r5 = k0.h.e(r0, r5)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r13 = r11.a()
            Y.f r16 = r0.j()
            if (r16 != 0) goto L_0x00ee
            Y.C1494j.c()
        L_0x00ee:
            r0.F()
            boolean r16 = r0.f()
            if (r16 == 0) goto L_0x00fb
            r0.U(r13)
            goto L_0x00fe
        L_0x00fb:
            r0.q()
        L_0x00fe:
            Y.m r13 = Y.F1.a(r0)
            yf.p r9 = r11.c()
            Y.F1.b(r13, r6, r9)
            yf.p r6 = r11.e()
            Y.F1.b(r13, r8, r6)
            yf.p r6 = r11.b()
            boolean r8 = r13.f()
            if (r8 != 0) goto L_0x0128
            java.lang.Object r8 = r13.A()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r9)
            if (r8 != 0) goto L_0x0136
        L_0x0128:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r13.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.V(r7, r6)
        L_0x0136:
            yf.p r6 = r11.d()
            Y.F1.b(r13, r5, r6)
            C.Z r13 = C.Z.f873a
            android.text.Spanned r5 = w1.b.a(r1, r12)
            java.lang.String r6 = "fromHtml(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)
            Y.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r6 = r0.m(r6)
            android.content.Context r6 = (android.content.Context) r6
            Q0.d r5 = io.intercom.android.sdk.survey.block.BlockExtensionsKt.toAnnotatedString$default(r5, r6, r10, r3, r10)
            k0.i$a r3 = k0.i.f23074a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r13
            r17 = r3
            k0.i r22 = C.Y.b(r16, r17, r18, r19, r20, r21)
            r6 = 1
            androidx.compose.foundation.o r23 = androidx.compose.foundation.m.a(r12, r0, r12, r6)
            r27 = 14
            r28 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            k0.i r6 = androidx.compose.foundation.m.d(r22, r23, r24, r25, r26, r27, r28)
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r14.getColors(r0, r15)
            long r7 = r7.m686getDescriptionText0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomTypography r9 = r14.getTypography(r0, r15)
            Q0.T r26 = r9.getType05()
            r29 = 0
            r30 = 131064(0x1fff8, float:1.8366E-40)
            r9 = 0
            r11 = 0
            r16 = 0
            r12 = r16
            r33 = r13
            r13 = r16
            r16 = 0
            r34 = r14
            r35 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            r27 = r0
            V.T0.c(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 8
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            k0.i r5 = androidx.compose.foundation.layout.q.r(r3, r5)
            r6 = 6
            C.a0.a(r5, r0, r6)
            r5 = 10
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            k0.i r3 = androidx.compose.foundation.layout.q.n(r3, r5)
            k0.c$c r5 = r32.i()
            r6 = r33
            k0.i r7 = r6.c(r3, r5)
            r12 = 7
            r13 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = r31
            k0.i r7 = androidx.compose.foundation.d.d(r7, r8, r9, r10, r11, r12, r13)
            int r3 = io.intercom.android.sdk.R.drawable.intercom_close
            r5 = 0
            w0.c r3 = M0.e.c(r3, r0, r5)
            int r6 = io.intercom.android.sdk.R.string.intercom_close
            java.lang.String r6 = M0.i.a(r6, r0, r5)
            r5 = r34
            r8 = r35
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r5.getColors(r0, r8)
            long r8 = r5.m686getDescriptionText0d7_KjU()
            r11 = 8
            r12 = 0
            r5 = r3
            r10 = r0
            V.V.a(r5, r6, r7, r8, r10, r11, r12)
            r0.u()
            r3 = r31
        L_0x020f:
            Y.Y0 r6 = r0.k()
            if (r6 == 0) goto L_0x0224
            io.intercom.android.sdk.m5.conversation.ui.components.composer.w0 r7 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.w0
            r0 = r7
            r1 = r36
            r4 = r40
            r5 = r41
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0224:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.composer.PrivacyPolicyKt.PrivacyPolicy(java.lang.String, k0.i, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M PrivacyPolicy$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PrivacyPolicy$lambda$2(String str, i iVar, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        PrivacyPolicy(str, iVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void PrivacyPolicyPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-520891099);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$PrivacyPolicyKt.INSTANCE.m272getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PrivacyPolicyPreview$lambda$3(int i10, C1500m mVar, int i11) {
        PrivacyPolicyPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
