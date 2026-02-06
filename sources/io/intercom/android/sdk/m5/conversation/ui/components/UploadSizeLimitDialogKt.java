package io.intercom.android.sdk.m5.conversation.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "title", "message", "Lkotlin/Function0;", "Llf/M;", "onDismiss", "UploadSizeLimitDialog", "(Ljava/lang/String;Ljava/lang/String;Lyf/a;LY/m;II)V", "UploadSizeLimitDialogPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UploadSizeLimitDialogKt {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void UploadSizeLimitDialog(java.lang.String r28, java.lang.String r29, yf.C6787a r30, Y.C1500m r31, int r32, int r33) {
        /*
            r1 = r28
            r2 = r29
            r4 = r32
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = -2057533015(0xffffffff855c89a9, float:-1.03696345E-35)
            r3 = r31
            Y.m r0 = r3.h(r0)
            r3 = r33 & 1
            if (r3 == 0) goto L_0x0020
            r3 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r3 = r4 & 14
            if (r3 != 0) goto L_0x002f
            boolean r3 = r0.S(r1)
            if (r3 == 0) goto L_0x002c
            r3 = 4
            goto L_0x002d
        L_0x002c:
            r3 = 2
        L_0x002d:
            r3 = r3 | r4
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            r5 = r33 & 2
            if (r5 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0047
        L_0x0037:
            r5 = r4 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0047
            boolean r5 = r0.S(r2)
            if (r5 == 0) goto L_0x0044
            r5 = 32
            goto L_0x0046
        L_0x0044:
            r5 = 16
        L_0x0046:
            r3 = r3 | r5
        L_0x0047:
            r5 = r33 & 4
            r6 = 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r7 = r30
            goto L_0x0063
        L_0x0052:
            r7 = r4 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x004f
            r7 = r30
            boolean r8 = r0.C(r7)
            if (r8 == 0) goto L_0x0060
            r8 = r6
            goto L_0x0062
        L_0x0060:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r8
        L_0x0063:
            r8 = r3 & 731(0x2db, float:1.024E-42)
            r9 = 146(0x92, float:2.05E-43)
            if (r8 != r9) goto L_0x0076
            boolean r8 = r0.i()
            if (r8 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            r0.I()
            r3 = r7
            goto L_0x0104
        L_0x0076:
            if (r5 == 0) goto L_0x007f
            io.intercom.android.sdk.m5.conversation.ui.components.E0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.E0
            r5.<init>()
            r13 = r5
            goto L_0x0080
        L_0x007f:
            r13 = r7
        L_0x0080:
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r5 = r5.getColors(r0, r7)
            long r22 = r5.m678getBackground0d7_KjU()
            androidx.compose.ui.window.i r27 = new androidx.compose.ui.window.i
            r11 = 5
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r7 = r27
            r7.<init>((boolean) r8, (boolean) r9, (boolean) r10, (int) r11, (kotlin.jvm.internal.DefaultConstructorMarker) r12)
            r5 = -537314259(0xffffffffdff93c2d, float:-3.5918558E19)
            r0.T(r5)
            r3 = r3 & 896(0x380, float:1.256E-42)
            r7 = 1
            if (r3 != r6) goto L_0x00a5
            r3 = r7
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            java.lang.Object r5 = r0.A()
            if (r3 != 0) goto L_0x00b4
            Y.m$a r3 = Y.C1500m.f10026a
            java.lang.Object r3 = r3.a()
            if (r5 != r3) goto L_0x00bc
        L_0x00b4:
            io.intercom.android.sdk.m5.conversation.ui.components.F0 r5 = new io.intercom.android.sdk.m5.conversation.ui.components.F0
            r5.<init>(r13)
            r0.r(r5)
        L_0x00bc:
            yf.a r5 = (yf.C6787a) r5
            r0.M()
            io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$3 r3 = new io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$3
            r3.<init>(r13)
            r6 = 582096881(0x22b217f1, float:4.8272346E-18)
            r8 = 54
            g0.a r6 = g0.c.e(r6, r7, r3, r0, r8)
            io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$4 r3 = new io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$4
            r3.<init>(r1)
            r9 = -905132043(0xffffffffca0cc7f5, float:-2306557.2)
            g0.a r10 = g0.c.e(r9, r7, r3, r0, r8)
            io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$5 r3 = new io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt$UploadSizeLimitDialog$5
            r3.<init>(r2)
            r9 = -203197450(0xfffffffff3e373f6, float:-3.6041362E31)
            g0.a r11 = g0.c.e(r9, r7, r3, r0, r8)
            r25 = 3072(0xc00, float:4.305E-42)
            r26 = 7836(0x1e9c, float:1.098E-41)
            r7 = 0
            r8 = 0
            r9 = 0
            r12 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r24 = 1769520(0x1b0030, float:2.479626E-39)
            r3 = r13
            r13 = r22
            r22 = r27
            r23 = r0
            V.C1373c.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r19, r21, r22, r23, r24, r25, r26)
        L_0x0104:
            Y.Y0 r6 = r0.k()
            if (r6 == 0) goto L_0x011b
            io.intercom.android.sdk.m5.conversation.ui.components.G0 r7 = new io.intercom.android.sdk.m5.conversation.ui.components.G0
            r0 = r7
            r1 = r28
            r2 = r29
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.UploadSizeLimitDialogKt.UploadSizeLimitDialog(java.lang.String, java.lang.String, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadSizeLimitDialog$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadSizeLimitDialog$lambda$2$lambda$1(C6787a aVar) {
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadSizeLimitDialog$lambda$3(String str, String str2, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$title");
        C6496s.h(str2, "$message");
        UploadSizeLimitDialog(str, str2, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void UploadSizeLimitDialogPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-532105575);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$UploadSizeLimitDialogKt.INSTANCE.m249getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new H0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M UploadSizeLimitDialogPreview$lambda$4(int i10, C1500m mVar, int i11) {
        UploadSizeLimitDialogPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
