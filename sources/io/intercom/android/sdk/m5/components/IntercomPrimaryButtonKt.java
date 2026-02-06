package io.intercom.android.sdk.m5.components;

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
import yf.q;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a;\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\n\u001aE\u0010\u000b\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eH\u0001¢\u0006\u0004\b\u000b\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"", "text", "Lk0/i;", "modifier", "", "trailingIconId", "Lkotlin/Function0;", "Llf/M;", "onClick", "IntercomPrimaryButton", "(Ljava/lang/String;Lk0/i;Ljava/lang/Integer;Lyf/a;LY/m;II)V", "LegacyIntercomPrimaryButton", "", "enabled", "Lkotlin/Function1;", "LC/Y;", "content", "(Lyf/a;Lk0/i;ZLyf/q;LY/m;II)V", "PrimaryButtonPreview", "(LY/m;I)V", "PrimaryButtonWithTrailingIconPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomPrimaryButtonKt {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IntercomPrimaryButton(java.lang.String r13, k0.i r14, java.lang.Integer r15, yf.C6787a r16, Y.C1500m r17, int r18, int r19) {
        /*
            r7 = r13
            r8 = r16
            r9 = r18
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            r0 = -801577387(0xffffffffd038e655, float:-1.24084111E10)
            r1 = r17
            Y.m r10 = r1.h(r0)
            r0 = r19 & 1
            if (r0 == 0) goto L_0x001f
            r0 = r9 | 6
            goto L_0x002f
        L_0x001f:
            r0 = r9 & 14
            if (r0 != 0) goto L_0x002e
            boolean r0 = r10.S(r13)
            if (r0 == 0) goto L_0x002b
            r0 = 4
            goto L_0x002c
        L_0x002b:
            r0 = 2
        L_0x002c:
            r0 = r0 | r9
            goto L_0x002f
        L_0x002e:
            r0 = r9
        L_0x002f:
            r1 = r19 & 2
            if (r1 == 0) goto L_0x0037
            r0 = r0 | 48
        L_0x0035:
            r2 = r14
            goto L_0x0048
        L_0x0037:
            r2 = r9 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0035
            r2 = r14
            boolean r3 = r10.S(r14)
            if (r3 == 0) goto L_0x0045
            r3 = 32
            goto L_0x0047
        L_0x0045:
            r3 = 16
        L_0x0047:
            r0 = r0 | r3
        L_0x0048:
            r3 = r19 & 4
            if (r3 == 0) goto L_0x0050
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r4 = r15
            goto L_0x0061
        L_0x0050:
            r4 = r9 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x004e
            r4 = r15
            boolean r5 = r10.S(r15)
            if (r5 == 0) goto L_0x005e
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r0 = r0 | r5
        L_0x0061:
            r5 = r19 & 8
            if (r5 == 0) goto L_0x0068
            r0 = r0 | 3072(0xc00, float:4.305E-42)
            goto L_0x0078
        L_0x0068:
            r5 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0078
            boolean r5 = r10.C(r8)
            if (r5 == 0) goto L_0x0075
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0075:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r0 = r0 | r5
        L_0x0078:
            r5 = r0 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r5 != r6) goto L_0x008a
            boolean r5 = r10.i()
            if (r5 != 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            r10.I()
            r3 = r4
            goto L_0x00a5
        L_0x008a:
            if (r1 == 0) goto L_0x0090
            k0.i$a r1 = k0.i.f23074a
            r11 = r1
            goto L_0x0091
        L_0x0090:
            r11 = r2
        L_0x0091:
            if (r3 == 0) goto L_0x0096
            r1 = 0
            r12 = r1
            goto L_0x0097
        L_0x0096:
            r12 = r4
        L_0x0097:
            r5 = r0 & 8190(0x1ffe, float:1.1477E-41)
            r6 = 0
            r0 = r13
            r1 = r11
            r2 = r12
            r3 = r16
            r4 = r10
            LegacyIntercomPrimaryButton((java.lang.String) r0, (k0.i) r1, (java.lang.Integer) r2, (yf.C6787a) r3, (Y.C1500m) r4, (int) r5, (int) r6)
            r2 = r11
            r3 = r12
        L_0x00a5:
            Y.Y0 r10 = r10.k()
            if (r10 == 0) goto L_0x00bb
            io.intercom.android.sdk.m5.components.G0 r11 = new io.intercom.android.sdk.m5.components.G0
            r0 = r11
            r1 = r13
            r4 = r16
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.a(r11)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.IntercomPrimaryButton(java.lang.String, k0.i, java.lang.Integer, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomPrimaryButton$lambda$0(String str, i iVar, Integer num, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        C6496s.h(aVar, "$onClick");
        IntercomPrimaryButton(str, iVar, num, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @lf.C6521e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void LegacyIntercomPrimaryButton(java.lang.String r15, k0.i r16, java.lang.Integer r17, yf.C6787a r18, Y.C1500m r19, int r20, int r21) {
        /*
            r1 = r15
            r5 = r20
            r0 = 398234558(0x17bc93be, float:1.2186511E-24)
            r2 = r19
            Y.m r0 = r2.h(r0)
            r2 = r21 & 1
            if (r2 == 0) goto L_0x0013
            r2 = r5 | 6
            goto L_0x0023
        L_0x0013:
            r2 = r5 & 14
            if (r2 != 0) goto L_0x0022
            boolean r2 = r0.S(r15)
            if (r2 == 0) goto L_0x001f
            r2 = 4
            goto L_0x0020
        L_0x001f:
            r2 = 2
        L_0x0020:
            r2 = r2 | r5
            goto L_0x0023
        L_0x0022:
            r2 = r5
        L_0x0023:
            r3 = r21 & 4
            if (r3 == 0) goto L_0x002c
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0029:
            r4 = r17
            goto L_0x003e
        L_0x002c:
            r4 = r5 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0029
            r4 = r17
            boolean r6 = r0.S(r4)
            if (r6 == 0) goto L_0x003b
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x003d
        L_0x003b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x003d:
            r2 = r2 | r6
        L_0x003e:
            r6 = r21 & 8
            if (r6 == 0) goto L_0x0047
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r13 = r18
            goto L_0x0059
        L_0x0047:
            r6 = r5 & 7168(0x1c00, float:1.0045E-41)
            r13 = r18
            if (r6 != 0) goto L_0x0059
            boolean r6 = r0.C(r13)
            if (r6 == 0) goto L_0x0056
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0058
        L_0x0056:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0058:
            r2 = r2 | r6
        L_0x0059:
            r6 = r2 & 5771(0x168b, float:8.087E-42)
            r7 = 1154(0x482, float:1.617E-42)
            if (r6 != r7) goto L_0x006d
            boolean r6 = r0.i()
            if (r6 != 0) goto L_0x0066
            goto L_0x006d
        L_0x0066:
            r0.I()
            r2 = r16
            r3 = r4
            goto L_0x009b
        L_0x006d:
            r6 = r21 & 2
            if (r6 == 0) goto L_0x0075
            k0.i$a r6 = k0.i.f23074a
            r14 = r6
            goto L_0x0077
        L_0x0075:
            r14 = r16
        L_0x0077:
            if (r3 == 0) goto L_0x007b
            r3 = 0
            goto L_0x007c
        L_0x007b:
            r3 = r4
        L_0x007c:
            io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$LegacyIntercomPrimaryButton$1 r4 = new io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt$LegacyIntercomPrimaryButton$1
            r4.<init>(r15, r3)
            r6 = 54
            r7 = 2099872974(0x7d2984ce, float:1.4083068E37)
            r8 = 1
            g0.a r9 = g0.c.e(r7, r8, r4, r0, r6)
            int r2 = r2 >> 9
            r2 = r2 & 14
            r11 = r2 | 3072(0xc00, float:4.305E-42)
            r12 = 6
            r7 = 0
            r8 = 0
            r6 = r18
            r10 = r0
            LegacyIntercomPrimaryButton((yf.C6787a) r6, (k0.i) r7, (boolean) r8, (yf.q) r9, (Y.C1500m) r10, (int) r11, (int) r12)
            r2 = r14
        L_0x009b:
            Y.Y0 r7 = r0.k()
            if (r7 == 0) goto L_0x00b1
            io.intercom.android.sdk.m5.components.J0 r8 = new io.intercom.android.sdk.m5.components.J0
            r0 = r8
            r1 = r15
            r4 = r18
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(java.lang.String, k0.i, java.lang.Integer, yf.a, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M LegacyIntercomPrimaryButton$lambda$1(String str, i iVar, Integer num, C6787a aVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        C6496s.h(aVar, "$onClick");
        LegacyIntercomPrimaryButton(str, iVar, num, aVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M LegacyIntercomPrimaryButton$lambda$2(C6787a aVar, i iVar, boolean z10, q qVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(aVar, "$onClick");
        C6496s.h(qVar, "$content");
        LegacyIntercomPrimaryButton(aVar, iVar, z10, qVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1925294537);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m180getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new I0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PrimaryButtonPreview$lambda$3(int i10, C1500m mVar, int i11) {
        PrimaryButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void PrimaryButtonWithTrailingIconPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1297682962);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomPrimaryButtonKt.INSTANCE.m181getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new K0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M PrimaryButtonWithTrailingIconPreview$lambda$4(int i10, C1500m mVar, int i11) {
        PrimaryButtonWithTrailingIconPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void LegacyIntercomPrimaryButton(yf.C6787a r28, k0.i r29, boolean r30, yf.q r31, Y.C1500m r32, int r33, int r34) {
        /*
            r13 = r28
            r14 = r31
            r15 = r33
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C6496s.h(r14, r0)
            r0 = -1285013288(0xffffffffb36840d8, float:-5.4075684E-8)
            r1 = r32
            Y.m r0 = r1.h(r0)
            r1 = r34 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r15 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r15 & 14
            if (r1 != 0) goto L_0x002f
            boolean r1 = r0.C(r13)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r15
            goto L_0x0030
        L_0x002f:
            r1 = r15
        L_0x0030:
            r2 = r34 & 2
            r12 = 16
            if (r2 == 0) goto L_0x003b
            r1 = r1 | 48
        L_0x0038:
            r3 = r29
            goto L_0x004c
        L_0x003b:
            r3 = r15 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0038
            r3 = r29
            boolean r4 = r0.S(r3)
            if (r4 == 0) goto L_0x004a
            r4 = 32
            goto L_0x004b
        L_0x004a:
            r4 = r12
        L_0x004b:
            r1 = r1 | r4
        L_0x004c:
            r4 = r34 & 4
            if (r4 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0052:
            r5 = r30
            goto L_0x0067
        L_0x0055:
            r5 = r15 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0052
            r5 = r30
            boolean r6 = r0.b(r5)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r1 = r1 | r6
        L_0x0067:
            r6 = r34 & 8
            if (r6 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r11 = r1
            goto L_0x0080
        L_0x006f:
            r6 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != 0) goto L_0x006d
            boolean r6 = r0.C(r14)
            if (r6 == 0) goto L_0x007c
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r1 = r1 | r6
            goto L_0x006d
        L_0x0080:
            r1 = r11 & 5851(0x16db, float:8.199E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x0095
            boolean r1 = r0.i()
            if (r1 != 0) goto L_0x008d
            goto L_0x0095
        L_0x008d:
            r0.I()
            r13 = r0
            r2 = r3
            r3 = r5
            goto L_0x0192
        L_0x0095:
            if (r2 == 0) goto L_0x009c
            k0.i$a r1 = k0.i.f23074a
            r16 = r1
            goto L_0x009e
        L_0x009c:
            r16 = r3
        L_0x009e:
            r1 = 1
            if (r4 == 0) goto L_0x00a4
            r17 = r1
            goto L_0x00a6
        L_0x00a4:
            r17 = r5
        L_0x00a6:
            io.intercom.android.sdk.ui.theme.IntercomTheme r2 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r2.getColors(r0, r3)
            long r4 = r4.m672getAction0d7_KjU()
            boolean r4 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m719isLightColor8_81llA(r4)
            if (r4 == 0) goto L_0x00db
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            r0.x0$a r4 = r0.C2544x0.f25560b
            long r18 = r4.a()
            r24 = 14
            r25 = 0
            r20 = 1045220557(0x3e4ccccd, float:0.2)
            r21 = 0
            r22 = 0
            r23 = 0
            long r4 = r0.C2544x0.o(r18, r20, r21, r22, r23, r24, r25)
            x.g r1 = x.C2869h.a(r1, r4)
        L_0x00d8:
            r18 = r1
            goto L_0x00fc
        L_0x00db:
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            r0.x0$a r4 = r0.C2544x0.f25560b
            long r18 = r4.i()
            r24 = 14
            r25 = 0
            r20 = 1045220557(0x3e4ccccd, float:0.2)
            r21 = 0
            r22 = 0
            r23 = 0
            long r4 = r0.C2544x0.o(r18, r20, r21, r22, r23, r24, r25)
            x.g r1 = x.C2869h.a(r1, r4)
            goto L_0x00d8
        L_0x00fc:
            V.B0 r1 = r2.getShapes(r0, r3)
            I.a r19 = r1.e()
            V.k r1 = V.C1389k.f7680a
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r2.getColors(r0, r3)
            long r20 = r4.m700getPrimaryText0d7_KjU()
            r26 = 14
            r27 = 0
            r22 = 1045220557(0x3e4ccccd, float:0.2)
            r23 = 0
            r24 = 0
            r25 = 0
            long r6 = r0.C2544x0.o(r20, r22, r23, r24, r25, r26, r27)
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r2.getColors(r0, r3)
            long r20 = r4.m700getPrimaryText0d7_KjU()
            r22 = 1053609165(0x3ecccccd, float:0.4)
            long r8 = r0.C2544x0.o(r20, r22, r23, r24, r25, r26, r27)
            io.intercom.android.sdk.ui.theme.IntercomColors r4 = r2.getColors(r0, r3)
            long r4 = r4.m672getAction0d7_KjU()
            io.intercom.android.sdk.ui.theme.IntercomColors r2 = r2.getColors(r0, r3)
            long r20 = r2.m694getOnAction0d7_KjU()
            int r2 = V.C1389k.f7694o
            r10 = 12
            int r22 = r2 << 12
            r23 = 0
            r2 = r4
            r4 = r20
            r10 = r0
            r32 = r0
            r0 = r11
            r11 = r22
            r13 = r12
            r12 = r23
            V.j r4 = r1.b(r2, r4, r6, r8, r10, r11, r12)
            float r1 = (float) r13
            float r1 = c1.h.j(r1)
            r2 = 12
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            C.N r7 = androidx.compose.foundation.layout.n.b(r1, r2)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r0 & 14
            r1 = r1 | r2
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r0 = r0 << 18
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r2
            r11 = r1 | r0
            r12 = 288(0x120, float:4.04E-43)
            r5 = 0
            r8 = 0
            r13 = r32
            r0 = r28
            r1 = r16
            r2 = r17
            r3 = r19
            r6 = r18
            r9 = r31
            r10 = r13
            V.C1393m.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r16
            r3 = r17
        L_0x0192:
            Y.Y0 r7 = r13.k()
            if (r7 == 0) goto L_0x01a9
            io.intercom.android.sdk.m5.components.H0 r8 = new io.intercom.android.sdk.m5.components.H0
            r0 = r8
            r1 = r28
            r4 = r31
            r5 = r33
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(yf.a, k0.i, boolean, yf.q, Y.m, int, int):void");
    }
}
