package io.intercom.android.sdk.ui.component;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aC\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u000f\u0010\u0010\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/ui/component/IntercomButton$Style;", "style", "", "text", "", "trailingIconId", "Lkotlin/Function0;", "Llf/M;", "onClick", "IntercomButton", "(Lk0/i;Lio/intercom/android/sdk/ui/component/IntercomButton$Style;Ljava/lang/String;Ljava/lang/Integer;Lyf/a;LY/m;II)V", "PrimaryButtonPreview", "(LY/m;I)V", "PrimaryButtonWithTrailingIconPreview", "OutlinedButtonPreview", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IntercomButton(k0.i r22, io.intercom.android.sdk.ui.component.IntercomButton.Style r23, java.lang.String r24, java.lang.Integer r25, yf.C6787a r26, Y.C1500m r27, int r28, int r29) {
        /*
            r2 = r23
            r3 = r24
            r1 = r26
            r0 = r28
            java.lang.String r4 = "style"
            kotlin.jvm.internal.C6496s.h(r2, r4)
            java.lang.String r4 = "text"
            kotlin.jvm.internal.C6496s.h(r3, r4)
            java.lang.String r4 = "onClick"
            kotlin.jvm.internal.C6496s.h(r1, r4)
            r4 = 1819808567(0x6c781337, float:1.1996174E27)
            r5 = r27
            Y.m r4 = r5.h(r4)
            r5 = r29 & 1
            if (r5 == 0) goto L_0x002a
            r6 = r0 | 6
            r7 = r6
            r6 = r22
            goto L_0x003e
        L_0x002a:
            r6 = r0 & 14
            if (r6 != 0) goto L_0x003b
            r6 = r22
            boolean r7 = r4.S(r6)
            if (r7 == 0) goto L_0x0038
            r7 = 4
            goto L_0x0039
        L_0x0038:
            r7 = 2
        L_0x0039:
            r7 = r7 | r0
            goto L_0x003e
        L_0x003b:
            r6 = r22
            r7 = r0
        L_0x003e:
            r8 = r29 & 2
            if (r8 == 0) goto L_0x0045
            r7 = r7 | 48
            goto L_0x0055
        L_0x0045:
            r8 = r0 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0055
            boolean r8 = r4.S(r2)
            if (r8 == 0) goto L_0x0052
            r8 = 32
            goto L_0x0054
        L_0x0052:
            r8 = 16
        L_0x0054:
            r7 = r7 | r8
        L_0x0055:
            r8 = r29 & 4
            if (r8 == 0) goto L_0x005c
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x006c
        L_0x005c:
            r8 = r0 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x006c
            boolean r8 = r4.S(r3)
            if (r8 == 0) goto L_0x0069
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x006b
        L_0x0069:
            r8 = 128(0x80, float:1.794E-43)
        L_0x006b:
            r7 = r7 | r8
        L_0x006c:
            r8 = r29 & 8
            if (r8 == 0) goto L_0x0075
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0072:
            r9 = r25
            goto L_0x0087
        L_0x0075:
            r9 = r0 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0072
            r9 = r25
            boolean r10 = r4.S(r9)
            if (r10 == 0) goto L_0x0084
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0086
        L_0x0084:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0086:
            r7 = r7 | r10
        L_0x0087:
            r10 = r29 & 16
            if (r10 == 0) goto L_0x0090
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x008d:
            r17 = r7
            goto L_0x00a3
        L_0x0090:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r0
            if (r10 != 0) goto L_0x008d
            boolean r10 = r4.C(r1)
            if (r10 == 0) goto L_0x009f
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r7 = r7 | r10
            goto L_0x008d
        L_0x00a3:
            r7 = 46811(0xb6db, float:6.5596E-41)
            r7 = r17 & r7
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r10) goto L_0x00bd
            boolean r7 = r4.i()
            if (r7 != 0) goto L_0x00b3
            goto L_0x00bd
        L_0x00b3:
            r4.I()
            r19 = r4
            r18 = r6
            r4 = r9
            goto L_0x0144
        L_0x00bd:
            if (r5 == 0) goto L_0x00c4
            k0.i$a r5 = k0.i.f23074a
            r18 = r5
            goto L_0x00c6
        L_0x00c4:
            r18 = r6
        L_0x00c6:
            if (r8 == 0) goto L_0x00cb
            r5 = 0
            r15 = r5
            goto L_0x00cc
        L_0x00cb:
            r15 = r9
        L_0x00cc:
            V.k r5 = V.C1389k.f7680a
            long r6 = r23.m588getBackgroundColor0d7_KjU()
            long r8 = r23.m589getContentColor0d7_KjU()
            int r10 = V.C1389k.f7694o
            r14 = 12
            int r16 = r10 << 12
            r19 = 12
            r10 = 0
            r12 = 0
            r14 = r4
            r21 = r15
            r15 = r16
            r16 = r19
            V.j r8 = r5.p(r6, r8, r10, r12, r14, r15, r16)
            x.g r10 = r23.getBorder()
            r5 = 12
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            r6 = 10
            float r6 = (float) r6
            float r6 = c1.h.j(r6)
            C.N r11 = androidx.compose.foundation.layout.n.b(r5, r6)
            io.intercom.android.sdk.ui.theme.IntercomTheme r5 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            r6 = 6
            V.B0 r5 = r5.getShapes(r4, r6)
            I.a r7 = r5.e()
            io.intercom.android.sdk.ui.component.IntercomButtonKt$IntercomButton$1 r5 = new io.intercom.android.sdk.ui.component.IntercomButtonKt$IntercomButton$1
            r15 = r21
            r5.<init>(r2, r3, r15)
            r6 = 54
            r9 = 905924137(0x35ff4e29, float:1.9021728E-6)
            r12 = 1
            g0.a r13 = g0.c.e(r9, r12, r5, r4, r6)
            int r5 = r17 >> 12
            r5 = r5 & 14
            r6 = 817889280(0x30c00000, float:1.3969839E-9)
            r5 = r5 | r6
            int r6 = r17 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r16 = r5 | r6
            r17 = 292(0x124, float:4.09E-43)
            r6 = 0
            r9 = 0
            r12 = 0
            r19 = r4
            r4 = r26
            r5 = r18
            r14 = r19
            r20 = r15
            r15 = r16
            r16 = r17
            V.C1393m.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r20
        L_0x0144:
            Y.Y0 r8 = r19.k()
            if (r8 == 0) goto L_0x015f
            io.intercom.android.sdk.ui.component.m r9 = new io.intercom.android.sdk.ui.component.m
            r0 = r9
            r1 = r18
            r2 = r23
            r3 = r24
            r5 = r26
            r6 = r28
            r7 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x015f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.IntercomButtonKt.IntercomButton(k0.i, io.intercom.android.sdk.ui.component.IntercomButton$Style, java.lang.String, java.lang.Integer, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomButton$lambda$0(i iVar, IntercomButton.Style style, String str, Integer num, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(style, "$style");
        C6496s.h(str, "$text");
        C6496s.h(aVar, "$onClick");
        IntercomButton(iVar, style, str, num, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void OutlinedButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2065130974);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomButtonKt.INSTANCE.m570getLambda3$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6346k(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M OutlinedButtonPreview$lambda$3(int i10, C1500m mVar, int i11) {
        OutlinedButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1818981662);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomButtonKt.INSTANCE.m568getLambda1$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6347l(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PrimaryButtonPreview$lambda$1(int i10, C1500m mVar, int i11) {
        PrimaryButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-340414909);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomButtonKt.INSTANCE.m569getLambda2$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6345j(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PrimaryButtonWithTrailingIconPreview$lambda$2(int i10, C1500m mVar, int i11) {
        PrimaryButtonWithTrailingIconPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
