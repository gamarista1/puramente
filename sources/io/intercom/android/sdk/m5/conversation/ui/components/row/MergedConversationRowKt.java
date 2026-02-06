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
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk0/i;", "modifier", "", "description", "conversationId", "Lkotlin/Function1;", "Llf/M;", "onConversationClick", "MergedConversationRow", "(Lk0/i;Ljava/lang/String;Ljava/lang/String;Lyf/l;LY/m;II)V", "MergedConversationRowPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MergedConversationRowKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: io.intercom.android.sdk.m5.conversation.ui.components.row.X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MergedConversationRow(k0.i r77, java.lang.String r78, java.lang.String r79, yf.C6798l r80, Y.C1500m r81, int r82, int r83) {
        /*
            r0 = r78
            r15 = r79
            r13 = r82
            r1 = 48
            r14 = 6
            java.lang.String r2 = "description"
            kotlin.jvm.internal.C6496s.h(r0, r2)
            java.lang.String r2 = "conversationId"
            kotlin.jvm.internal.C6496s.h(r15, r2)
            r2 = -635122177(0xffffffffda24cdff, float:-1.15970978E16)
            r3 = r81
            Y.m r11 = r3.h(r2)
            r25 = 1
            r2 = r83 & 1
            r3 = 2
            r9 = 4
            if (r2 == 0) goto L_0x002a
            r4 = r13 | 6
            r5 = r4
            r4 = r77
            goto L_0x003e
        L_0x002a:
            r4 = r13 & 14
            if (r4 != 0) goto L_0x003b
            r4 = r77
            boolean r5 = r11.S(r4)
            if (r5 == 0) goto L_0x0038
            r5 = r9
            goto L_0x0039
        L_0x0038:
            r5 = r3
        L_0x0039:
            r5 = r5 | r13
            goto L_0x003e
        L_0x003b:
            r4 = r77
            r5 = r13
        L_0x003e:
            r6 = r83 & 2
            r7 = 16
            if (r6 == 0) goto L_0x0046
            r5 = r5 | r1
            goto L_0x0055
        L_0x0046:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0055
            boolean r6 = r11.S(r0)
            if (r6 == 0) goto L_0x0053
            r6 = 32
            goto L_0x0054
        L_0x0053:
            r6 = r7
        L_0x0054:
            r5 = r5 | r6
        L_0x0055:
            r6 = r83 & 4
            r10 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x005e
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x006d
        L_0x005e:
            r6 = r13 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x006d
            boolean r6 = r11.S(r15)
            if (r6 == 0) goto L_0x006a
            r6 = r10
            goto L_0x006c
        L_0x006a:
            r6 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r5 = r5 | r6
        L_0x006d:
            r6 = r83 & 8
            if (r6 == 0) goto L_0x0076
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0073:
            r12 = r80
            goto L_0x0089
        L_0x0076:
            r12 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0073
            r12 = r80
            boolean r16 = r11.C(r12)
            if (r16 == 0) goto L_0x0085
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0087
        L_0x0085:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0087:
            r5 = r5 | r16
        L_0x0089:
            r8 = r5 & 5851(0x16db, float:8.199E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x009e
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x0096
            goto L_0x009e
        L_0x0096:
            r11.I()
            r1 = r4
            r2 = r11
            r4 = r15
            goto L_0x0283
        L_0x009e:
            if (r2 == 0) goto L_0x00a4
            k0.i$a r2 = k0.i.f23074a
            r9 = r2
            goto L_0x00a5
        L_0x00a4:
            r9 = r4
        L_0x00a5:
            if (r6 == 0) goto L_0x00ae
            io.intercom.android.sdk.m5.conversation.ui.components.row.X r2 = new io.intercom.android.sdk.m5.conversation.ui.components.row.X
            r2.<init>()
            r8 = r2
            goto L_0x00af
        L_0x00ae:
            r8 = r12
        L_0x00af:
            float r2 = (float) r7
            float r2 = c1.h.j(r2)
            r4 = 0
            r6 = 0
            k0.i r2 = androidx.compose.foundation.layout.n.k(r9, r2, r4, r3, r6)
            k0.c$a r3 = k0.c.f23044a
            k0.c$b r3 = r3.g()
            C.c r4 = C.C1085c.f882a
            C.c$m r4 = r4.g()
            H0.F r1 = C.C1090h.a(r4, r3, r11, r1)
            r7 = 0
            int r3 = Y.C1494j.a(r11, r7)
            Y.y r4 = r11.p()
            k0.i r2 = k0.h.e(r11, r2)
            J0.g$a r6 = J0.C1241g.f3853J
            yf.a r12 = r6.a()
            Y.f r17 = r11.j()
            if (r17 != 0) goto L_0x00e6
            Y.C1494j.c()
        L_0x00e6:
            r11.F()
            boolean r17 = r11.f()
            if (r17 == 0) goto L_0x00f3
            r11.U(r12)
            goto L_0x00f6
        L_0x00f3:
            r11.q()
        L_0x00f6:
            Y.m r12 = Y.F1.a(r11)
            yf.p r7 = r6.c()
            Y.F1.b(r12, r1, r7)
            yf.p r1 = r6.e()
            Y.F1.b(r12, r4, r1)
            yf.p r1 = r6.b()
            boolean r4 = r12.f()
            if (r4 != 0) goto L_0x0120
            java.lang.Object r4 = r12.A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r7)
            if (r4 != 0) goto L_0x012e
        L_0x0120:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12.r(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.V(r3, r1)
        L_0x012e:
            yf.p r1 = r6.d()
            Y.F1.b(r12, r2, r1)
            C.k r1 = C.C1093k.f978a
            io.intercom.android.sdk.ui.theme.IntercomTheme r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r1 = r7.getTypography(r11, r6)
            Q0.T r20 = r1.getType04Point5()
            b1.j$a r26 = b1.j.f19110b
            int r1 = r26.a()
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r7.getColors(r11, r6)
            long r2 = r2.m686getDescriptionText0d7_KjU()
            b1.j r12 = b1.j.h(r1)
            int r1 = r5 >> 3
            r22 = r1 & 14
            r23 = 0
            r24 = 65018(0xfdfa, float:9.111E-41)
            r1 = 0
            r17 = 0
            r40 = r5
            r4 = r17
            r17 = 0
            r41 = r6
            r6 = r17
            r42 = r7
            r7 = r17
            r43 = r8
            r8 = r17
            r17 = 0
            r44 = r9
            r9 = r17
            r16 = 0
            r77 = r11
            r11 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r78
            r21 = r77
            V.T0.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            k0.i$a r0 = k0.i.f23074a
            r1 = 4
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            k0.i r1 = androidx.compose.foundation.layout.q.i(r0, r1)
            r3 = 6
            r2 = r77
            C.a0.a(r1, r2, r3)
            r1 = -1680452062(0xffffffff9bd65622, float:-3.5458992E-22)
            r2.T(r1)
            r5 = r40
            r1 = r5 & 7168(0x1c00, float:1.0045E-41)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 != r3) goto L_0x01b7
            r7 = r25
            goto L_0x01b8
        L_0x01b7:
            r7 = 0
        L_0x01b8:
            r1 = r5 & 896(0x380, float:1.256E-42)
            r3 = 256(0x100, float:3.59E-43)
            if (r1 != r3) goto L_0x01bf
            goto L_0x01c1
        L_0x01bf:
            r25 = 0
        L_0x01c1:
            r1 = r7 | r25
            java.lang.Object r3 = r2.A()
            if (r1 != 0) goto L_0x01d7
            Y.m$a r1 = Y.C1500m.f10026a
            java.lang.Object r1 = r1.a()
            if (r3 != r1) goto L_0x01d2
            goto L_0x01d7
        L_0x01d2:
            r4 = r79
            r12 = r43
            goto L_0x01e3
        L_0x01d7:
            io.intercom.android.sdk.m5.conversation.ui.components.row.Y r3 = new io.intercom.android.sdk.m5.conversation.ui.components.row.Y
            r4 = r79
            r12 = r43
            r3.<init>(r12, r4)
            r2.r(r3)
        L_0x01e3:
            r31 = r3
            yf.a r31 = (yf.C6787a) r31
            r2.M()
            r32 = 7
            r33 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r27 = r0
            k0.i r16 = androidx.compose.foundation.d.d(r27, r28, r29, r30, r31, r32, r33)
            int r0 = io.intercom.android.sdk.R.string.intercom_view_conversation
            r1 = 0
            java.lang.String r15 = M0.i.a(r0, r2, r1)
            r1 = r41
            r0 = r42
            io.intercom.android.sdk.ui.theme.IntercomTypography r3 = r0.getTypography(r2, r1)
            Q0.T r45 = r3.getType04Point5()
            V0.p$a r3 = V0.p.f8210b
            V0.p r50 = r3.a()
            r75 = 16777211(0xfffffb, float:2.350988E-38)
            r76 = 0
            r46 = 0
            r48 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            r74 = 0
            Q0.T r35 = Q0.T.c(r45, r46, r48, r50, r51, r52, r53, r54, r55, r57, r58, r59, r60, r62, r63, r64, r65, r66, r67, r69, r70, r71, r72, r73, r74, r75, r76)
            int r3 = r26.a()
            io.intercom.android.sdk.ui.theme.IntercomColors r0 = r0.getColors(r2, r1)
            long r17 = r0.m673getActionContrastWhite0d7_KjU()
            b1.j r27 = b1.j.h(r3)
            r38 = 0
            r39 = 65016(0xfdf8, float:9.1107E-41)
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r36 = r2
            V.T0.b(r15, r16, r17, r19, r21, r22, r23, r24, r26, r27, r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r2.u()
            r1 = r44
        L_0x0283:
            Y.Y0 r7 = r2.k()
            if (r7 == 0) goto L_0x029b
            io.intercom.android.sdk.m5.conversation.ui.components.row.Z r8 = new io.intercom.android.sdk.m5.conversation.ui.components.row.Z
            r0 = r8
            r2 = r78
            r3 = r79
            r4 = r12
            r5 = r82
            r6 = r83
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x029b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt.MergedConversationRow(k0.i, java.lang.String, java.lang.String, yf.l, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M MergedConversationRow$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MergedConversationRow$lambda$3$lambda$2$lambda$1(C6798l lVar, String str) {
        C6496s.h(str, "$conversationId");
        lVar.invoke(str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MergedConversationRow$lambda$4(i iVar, String str, String str2, C6798l lVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$description");
        C6496s.h(str2, "$conversationId");
        MergedConversationRow(iVar, str, str2, lVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void MergedConversationRowPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-243500111);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$MergedConversationRowKt.INSTANCE.m299getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6129a0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MergedConversationRowPreview$lambda$5(int i10, C1500m mVar, int i11) {
        MergedConversationRowPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
