package io.intercom.android.sdk.m5.helpcenter.ui.components;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlin/Function0;", "Llf/M;", "onBackClick", "onSearchClick", "", "navIcon", "Lio/intercom/android/sdk/ui/common/StringProvider;", "title", "HelpCenterTopBar", "(Lyf/a;Lyf/a;ILio/intercom/android/sdk/ui/common/StringProvider;LY/m;II)V", "HelpCenterTopBarPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterTopBarKt {
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ad, code lost:
        if ((r31 & 8) != 0) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void HelpCenterTopBar(yf.C6787a r25, yf.C6787a r26, int r27, io.intercom.android.sdk.ui.common.StringProvider r28, Y.C1500m r29, int r30, int r31) {
        /*
            r5 = r25
            r14 = r26
            r12 = r30
            java.lang.String r0 = "onBackClick"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            java.lang.String r0 = "onSearchClick"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            r0 = 644687815(0x266d27c7, float:8.22798E-16)
            r1 = r29
            Y.m r13 = r1.h(r0)
            r0 = r31 & 1
            r1 = 2
            if (r0 == 0) goto L_0x0021
            r0 = r12 | 6
            goto L_0x0031
        L_0x0021:
            r0 = r12 & 14
            if (r0 != 0) goto L_0x0030
            boolean r0 = r13.C(r5)
            if (r0 == 0) goto L_0x002d
            r0 = 4
            goto L_0x002e
        L_0x002d:
            r0 = r1
        L_0x002e:
            r0 = r0 | r12
            goto L_0x0031
        L_0x0030:
            r0 = r12
        L_0x0031:
            r2 = r31 & 2
            if (r2 == 0) goto L_0x0038
            r0 = r0 | 48
            goto L_0x0048
        L_0x0038:
            r2 = r12 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0048
            boolean r2 = r13.C(r14)
            if (r2 == 0) goto L_0x0045
            r2 = 32
            goto L_0x0047
        L_0x0045:
            r2 = 16
        L_0x0047:
            r0 = r0 | r2
        L_0x0048:
            r2 = r12 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0061
            r2 = r31 & 4
            if (r2 != 0) goto L_0x005b
            r2 = r27
            boolean r3 = r13.d(r2)
            if (r3 == 0) goto L_0x005d
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005b:
            r2 = r27
        L_0x005d:
            r3 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r0 = r0 | r3
            goto L_0x0063
        L_0x0061:
            r2 = r27
        L_0x0063:
            r3 = r12 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x007c
            r3 = r31 & 8
            if (r3 != 0) goto L_0x0076
            r3 = r28
            boolean r4 = r13.S(r3)
            if (r4 == 0) goto L_0x0078
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r3 = r28
        L_0x0078:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r0 = r0 | r4
            goto L_0x007e
        L_0x007c:
            r3 = r28
        L_0x007e:
            r4 = r0 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r4 != r6) goto L_0x0094
            boolean r4 = r13.i()
            if (r4 != 0) goto L_0x008b
            goto L_0x0094
        L_0x008b:
            r13.I()
            r4 = r3
            r24 = r13
            r3 = r2
            goto L_0x012f
        L_0x0094:
            r13.D()
            r4 = r12 & 1
            if (r4 == 0) goto L_0x00b5
            boolean r4 = r13.L()
            if (r4 == 0) goto L_0x00a2
            goto L_0x00b5
        L_0x00a2:
            r13.I()
            r1 = r31 & 4
            if (r1 == 0) goto L_0x00ab
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00ab:
            r1 = r31 & 8
            if (r1 == 0) goto L_0x00b1
        L_0x00af:
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00b1:
            r20 = r2
            r7 = r3
            goto L_0x00ca
        L_0x00b5:
            r4 = r31 & 4
            if (r4 == 0) goto L_0x00bd
            int r2 = io.intercom.android.sdk.R.drawable.intercom_back
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00bd:
            r4 = r31 & 8
            if (r4 == 0) goto L_0x00b1
            io.intercom.android.sdk.ui.common.StringProvider$StringRes r3 = new io.intercom.android.sdk.ui.common.StringProvider$StringRes
            int r4 = io.intercom.android.sdk.R.string.intercom_get_help
            r6 = 0
            r3.<init>(r4, r6, r1, r6)
            goto L_0x00af
        L_0x00ca:
            r13.v()
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r1.getColors(r13, r2)
            long r8 = r3.m691getHeader0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r13, r2)
            long r2 = r1.m697getOnHeader0d7_KjU()
            r10 = r2
            int r1 = io.intercom.android.sdk.ui.common.StringProvider.$stable
            int r4 = r0 >> 9
            r4 = r4 & 14
            r1 = r1 | r4
            java.lang.String r1 = r7.getText(r13, r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1 r4 = new io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt$HelpCenterTopBar$1
            r4.<init>(r14, r2)
            r2 = 54
            r3 = 736282477(0x2be2c76d, float:1.6113618E-12)
            r15 = 1
            g0.a r15 = g0.c.e(r3, r15, r4, r13, r2)
            int r2 = r0 << 15
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            int r0 = r0 << 12
            r3 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r3
            r17 = r2 | r0
            r18 = 384(0x180, float:5.38E-43)
            r19 = 3229(0xc9d, float:4.525E-42)
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r16 = 0
            r21 = r7
            r7 = r16
            r22 = 0
            r24 = r13
            r12 = r22
            r16 = 0
            r14 = r16
            r5 = r25
            r16 = r24
            io.intercom.android.sdk.m5.components.TopActionBarKt.m207TopActionBarNpQZenA(r0, r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r18, r19)
            r3 = r20
            r4 = r21
        L_0x012f:
            Y.Y0 r7 = r24.k()
            if (r7 == 0) goto L_0x0146
            io.intercom.android.sdk.m5.helpcenter.ui.components.C r8 = new io.intercom.android.sdk.m5.helpcenter.ui.components.C
            r0 = r8
            r1 = r25
            r2 = r26
            r5 = r30
            r6 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.helpcenter.ui.components.HelpCenterTopBarKt.HelpCenterTopBar(yf.a, yf.a, int, io.intercom.android.sdk.ui.common.StringProvider, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterTopBar$lambda$0(C6787a aVar, C6787a aVar2, int i10, StringProvider stringProvider, int i11, int i12, C1500m mVar, int i13) {
        C6496s.h(aVar, "$onBackClick");
        C6496s.h(aVar2, "$onSearchClick");
        HelpCenterTopBar(aVar, aVar2, i10, stringProvider, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    public static final void HelpCenterTopBarPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-536592516);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$HelpCenterTopBarKt.INSTANCE.m355getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new D(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M HelpCenterTopBarPreview$lambda$1(int i10, C1500m mVar, int i11) {
        HelpCenterTopBarPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
