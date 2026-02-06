package io.intercom.android.sdk.ui.component;

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
import yf.C6787a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a]\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk0/i;", "modifier", "", "message", "confirmText", "dismissText", "", "iconId", "Lkotlin/Function0;", "Llf/M;", "onDismiss", "onConfirm", "PermissionDeniedDialog", "(Lk0/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lyf/a;Lyf/a;LY/m;II)V", "PermissionDeniedDialogPreview", "(LY/m;I)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PermissionDeniedDialogKt {
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void PermissionDeniedDialog(k0.i r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.Integer r35, yf.C6787a r36, yf.C6787a r37, Y.C1500m r38, int r39, int r40) {
        /*
            r2 = r32
            r3 = r33
            r4 = r34
            r8 = r39
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "confirmText"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "dismissText"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r0 = -537034576(0xffffffffdffd80b0, float:-3.6533587E19)
            r1 = r38
            Y.m r0 = r1.h(r0)
            r1 = r40 & 1
            if (r1 == 0) goto L_0x002a
            r5 = r8 | 6
            r6 = r5
            r5 = r31
            goto L_0x003e
        L_0x002a:
            r5 = r8 & 14
            if (r5 != 0) goto L_0x003b
            r5 = r31
            boolean r6 = r0.S(r5)
            if (r6 == 0) goto L_0x0038
            r6 = 4
            goto L_0x0039
        L_0x0038:
            r6 = 2
        L_0x0039:
            r6 = r6 | r8
            goto L_0x003e
        L_0x003b:
            r5 = r31
            r6 = r8
        L_0x003e:
            r7 = r40 & 2
            if (r7 == 0) goto L_0x0045
            r6 = r6 | 48
            goto L_0x0055
        L_0x0045:
            r7 = r8 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0055
            boolean r7 = r0.S(r2)
            if (r7 == 0) goto L_0x0052
            r7 = 32
            goto L_0x0054
        L_0x0052:
            r7 = 16
        L_0x0054:
            r6 = r6 | r7
        L_0x0055:
            r7 = r40 & 4
            if (r7 == 0) goto L_0x005c
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r7 = r8 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x006c
            boolean r7 = r0.S(r3)
            if (r7 == 0) goto L_0x0069
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r6 = r6 | r7
        L_0x006c:
            r7 = r40 & 8
            if (r7 == 0) goto L_0x0073
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x0083
        L_0x0073:
            r7 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0083
            boolean r7 = r0.S(r4)
            if (r7 == 0) goto L_0x0080
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r6 = r6 | r7
        L_0x0083:
            r7 = r40 & 16
            if (r7 == 0) goto L_0x008c
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0089:
            r9 = r35
            goto L_0x00a0
        L_0x008c:
            r9 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r8
            if (r9 != 0) goto L_0x0089
            r9 = r35
            boolean r10 = r0.S(r9)
            if (r10 == 0) goto L_0x009d
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009f
        L_0x009d:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009f:
            r6 = r6 | r10
        L_0x00a0:
            r10 = r40 & 32
            if (r10 == 0) goto L_0x00aa
            r11 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r11
        L_0x00a7:
            r11 = r36
            goto L_0x00bd
        L_0x00aa:
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r8
            if (r11 != 0) goto L_0x00a7
            r11 = r36
            boolean r12 = r0.C(r11)
            if (r12 == 0) goto L_0x00ba
            r12 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00bc
        L_0x00ba:
            r12 = 65536(0x10000, float:9.18355E-41)
        L_0x00bc:
            r6 = r6 | r12
        L_0x00bd:
            r12 = r40 & 64
            if (r12 == 0) goto L_0x00c7
            r13 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r13
        L_0x00c4:
            r13 = r37
            goto L_0x00da
        L_0x00c7:
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r8
            if (r13 != 0) goto L_0x00c4
            r13 = r37
            boolean r14 = r0.C(r13)
            if (r14 == 0) goto L_0x00d7
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d9
        L_0x00d7:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00d9:
            r6 = r6 | r14
        L_0x00da:
            r14 = 2995931(0x2db6db, float:4.198194E-39)
            r14 = r14 & r6
            r15 = 599186(0x92492, float:8.39638E-40)
            if (r14 != r15) goto L_0x00f3
            boolean r14 = r0.i()
            if (r14 != 0) goto L_0x00ea
            goto L_0x00f3
        L_0x00ea:
            r0.I()
            r1 = r5
            r5 = r9
            r6 = r11
            r7 = r13
            goto L_0x0189
        L_0x00f3:
            if (r1 == 0) goto L_0x00f8
            k0.i$a r1 = k0.i.f23074a
            goto L_0x00f9
        L_0x00f8:
            r1 = r5
        L_0x00f9:
            if (r7 == 0) goto L_0x00fd
            r5 = 0
            goto L_0x00fe
        L_0x00fd:
            r5 = r9
        L_0x00fe:
            if (r10 == 0) goto L_0x0106
            io.intercom.android.sdk.ui.component.H r7 = new io.intercom.android.sdk.ui.component.H
            r7.<init>()
            goto L_0x0107
        L_0x0106:
            r7 = r11
        L_0x0107:
            if (r12 == 0) goto L_0x0110
            io.intercom.android.sdk.ui.component.I r9 = new io.intercom.android.sdk.ui.component.I
            r9.<init>()
            r11 = r9
            goto L_0x0111
        L_0x0110:
            r11 = r13
        L_0x0111:
            io.intercom.android.sdk.ui.theme.IntercomTheme r9 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            r14 = 6
            io.intercom.android.sdk.ui.theme.IntercomColors r9 = r9.getColors(r0, r14)
            long r17 = r9.m678getBackground0d7_KjU()
            androidx.compose.ui.window.i r19 = new androidx.compose.ui.window.i
            r26 = r19
            r23 = 5
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r19.<init>((boolean) r20, (boolean) r21, (boolean) r22, (int) r23, (kotlin.jvm.internal.DefaultConstructorMarker) r24)
            io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3 r9 = new io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$3
            r9.<init>(r11, r3)
            r10 = -1474258584(0xffffffffa8209968, float:-8.915049E-15)
            r15 = 1
            r13 = 54
            g0.a r10 = g0.c.e(r10, r15, r9, r0, r13)
            io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4 r9 = new io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$4
            r9.<init>(r7, r4)
            r12 = -868483802(0xffffffffcc3bfd26, float:-4.9280152E7)
            g0.a r12 = g0.c.e(r12, r15, r9, r0, r13)
            io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$5 r9 = new io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$5
            r9.<init>(r5)
            r14 = -565596411(0xffffffffde49af05, float:-3.63321001E18)
            g0.a r9 = g0.c.e(r14, r15, r9, r0, r13)
            r14 = r13
            r13 = r9
            io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$6 r9 = new io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt$PermissionDeniedDialog$6
            r9.<init>(r2)
            r2 = 40178371(0x26512c3, float:1.6829647E-37)
            g0.a r15 = g0.c.e(r2, r15, r9, r0, r14)
            int r2 = r6 >> 15
            r2 = r2 & 14
            r9 = 1600560(0x186c30, float:2.242862E-39)
            r2 = r2 | r9
            r9 = 6
            int r6 = r6 << r9
            r6 = r6 & 896(0x380, float:1.256E-42)
            r28 = r2 | r6
            r29 = 3072(0xc00, float:4.305E-42)
            r30 = 7840(0x1ea0, float:1.0986E-41)
            r14 = 0
            r16 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r9 = r7
            r2 = r11
            r11 = r1
            r27 = r0
            V.C1373c.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r6 = r7
            r7 = r2
        L_0x0189:
            Y.Y0 r10 = r0.k()
            if (r10 == 0) goto L_0x01a2
            io.intercom.android.sdk.ui.component.J r11 = new io.intercom.android.sdk.ui.component.J
            r0 = r11
            r2 = r32
            r3 = r33
            r4 = r34
            r8 = r39
            r9 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.PermissionDeniedDialogKt.PermissionDeniedDialog(k0.i, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, yf.a, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M PermissionDeniedDialog$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PermissionDeniedDialog$lambda$1() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M PermissionDeniedDialog$lambda$2(i iVar, String str, String str2, String str3, Integer num, C6787a aVar, C6787a aVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$message");
        C6496s.h(str2, "$confirmText");
        C6496s.h(str3, "$dismissText");
        PermissionDeniedDialog(iVar, str, str2, str3, num, aVar, aVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void PermissionDeniedDialogPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-501567607);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$PermissionDeniedDialogKt.INSTANCE.m579getLambda1$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new G(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PermissionDeniedDialogPreview$lambda$3(int i10, C1500m mVar, int i11) {
        PermissionDeniedDialogPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
