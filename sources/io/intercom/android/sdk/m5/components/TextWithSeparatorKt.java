package io.intercom.android.sdk.m5.components;

import O0.t;
import O0.v;
import Q0.T;
import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import b1.j;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001ag\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"", "firstText", "secondText", "Lk0/i;", "modifier", "separator", "LQ0/T;", "style", "Lr0/x0;", "color", "Lb1/t;", "overflow", "", "maxLines", "Lb1/j;", "textAlign", "Llf/M;", "TextWithSeparator-wV1YYcM", "(Ljava/lang/String;Ljava/lang/String;Lk0/i;Ljava/lang/String;LQ0/T;JIILb1/j;LY/m;II)V", "TextWithSeparator", "TextWithSeparatorPreview", "(LY/m;I)V", "TextWithSeparatorSecondEmptyPreview", "TextWithSeparatorFirstEmptyPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextWithSeparatorKt {
    /* JADX WARNING: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012b  */
    /* renamed from: TextWithSeparator-wV1YYcM  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m206TextWithSeparatorwV1YYcM(java.lang.String r41, java.lang.String r42, k0.i r43, java.lang.String r44, Q0.T r45, long r46, int r48, int r49, b1.j r50, Y.C1500m r51, int r52, int r53) {
        /*
            r1 = r41
            r2 = r42
            r11 = r52
            r12 = r53
            java.lang.String r0 = "firstText"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.lang.String r0 = "secondText"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = 46249171(0x2c1b4d3, float:2.846259E-37)
            r3 = r51
            Y.m r0 = r3.h(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0022
            r3 = r11 | 6
            goto L_0x0032
        L_0x0022:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0031
            boolean r3 = r0.S(r1)
            if (r3 == 0) goto L_0x002e
            r3 = 4
            goto L_0x002f
        L_0x002e:
            r3 = 2
        L_0x002f:
            r3 = r3 | r11
            goto L_0x0032
        L_0x0031:
            r3 = r11
        L_0x0032:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0039
            r3 = r3 | 48
            goto L_0x0049
        L_0x0039:
            r5 = r11 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L_0x0049
            boolean r5 = r0.S(r2)
            if (r5 == 0) goto L_0x0046
            r5 = 32
            goto L_0x0048
        L_0x0046:
            r5 = 16
        L_0x0048:
            r3 = r3 | r5
        L_0x0049:
            r5 = r12 & 4
            if (r5 == 0) goto L_0x0052
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004f:
            r7 = r43
            goto L_0x0064
        L_0x0052:
            r7 = r11 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x004f
            r7 = r43
            boolean r8 = r0.S(r7)
            if (r8 == 0) goto L_0x0061
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r3 = r3 | r8
        L_0x0064:
            r8 = r12 & 8
            if (r8 == 0) goto L_0x006d
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006a:
            r9 = r44
            goto L_0x007f
        L_0x006d:
            r9 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x006a
            r9 = r44
            boolean r10 = r0.S(r9)
            if (r10 == 0) goto L_0x007c
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r3 = r3 | r10
        L_0x007f:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r11
            if (r10 != 0) goto L_0x009a
            r10 = r12 & 16
            if (r10 != 0) goto L_0x0094
            r10 = r45
            boolean r13 = r0.S(r10)
            if (r13 == 0) goto L_0x0096
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0094:
            r10 = r45
        L_0x0096:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r3 = r3 | r13
            goto L_0x009c
        L_0x009a:
            r10 = r45
        L_0x009c:
            r13 = r12 & 32
            if (r13 == 0) goto L_0x00a6
            r14 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 | r14
        L_0x00a3:
            r14 = r46
            goto L_0x00ba
        L_0x00a6:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r14 & r11
            if (r14 != 0) goto L_0x00a3
            r14 = r46
            boolean r16 = r0.e(r14)
            if (r16 == 0) goto L_0x00b6
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b8
        L_0x00b6:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00b8:
            r3 = r3 | r16
        L_0x00ba:
            r16 = r12 & 64
            r17 = 3670016(0x380000, float:5.142788E-39)
            if (r16 == 0) goto L_0x00c7
            r18 = 1572864(0x180000, float:2.204052E-39)
            r3 = r3 | r18
            r4 = r48
            goto L_0x00da
        L_0x00c7:
            r18 = r11 & r17
            r4 = r48
            if (r18 != 0) goto L_0x00da
            boolean r18 = r0.d(r4)
            if (r18 == 0) goto L_0x00d6
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d8
        L_0x00d6:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00d8:
            r3 = r3 | r18
        L_0x00da:
            r6 = r12 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00e5
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r3 = r3 | r19
            r4 = r49
            goto L_0x00fa
        L_0x00e5:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r11 & r19
            r4 = r49
            if (r19 != 0) goto L_0x00fa
            boolean r19 = r0.d(r4)
            if (r19 == 0) goto L_0x00f6
            r19 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f8
        L_0x00f6:
            r19 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f8:
            r3 = r3 | r19
        L_0x00fa:
            r4 = r12 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0105
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            r3 = r3 | r19
            r7 = r50
            goto L_0x011a
        L_0x0105:
            r19 = 234881024(0xe000000, float:1.5777218E-30)
            r19 = r11 & r19
            r7 = r50
            if (r19 != 0) goto L_0x011a
            boolean r19 = r0.S(r7)
            if (r19 == 0) goto L_0x0116
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0116:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r3 = r3 | r19
        L_0x011a:
            r19 = 191739611(0xb6db6db, float:4.5782105E-32)
            r7 = r3 & r19
            r9 = 38347922(0x2492492, float:1.4777643E-37)
            if (r7 != r9) goto L_0x013c
            boolean r7 = r0.i()
            if (r7 != 0) goto L_0x012b
            goto L_0x013c
        L_0x012b:
            r0.I()
            r3 = r43
            r4 = r44
            r8 = r48
            r9 = r49
            r5 = r10
            r6 = r14
            r10 = r50
            goto L_0x026d
        L_0x013c:
            r0.D()
            r7 = r11 & 1
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            if (r7 == 0) goto L_0x0164
            boolean r7 = r0.L()
            if (r7 == 0) goto L_0x014d
            goto L_0x0164
        L_0x014d:
            r0.I()
            r4 = r12 & 16
            if (r4 == 0) goto L_0x0156
            r3 = r3 & r19
        L_0x0156:
            r5 = r43
            r7 = r44
            r6 = r49
            r38 = r50
            r13 = r3
            r8 = r10
            r3 = r14
            r10 = r48
            goto L_0x01b0
        L_0x0164:
            if (r5 == 0) goto L_0x0169
            k0.i$a r5 = k0.i.f23074a
            goto L_0x016b
        L_0x0169:
            r5 = r43
        L_0x016b:
            if (r8 == 0) goto L_0x0170
            java.lang.String r7 = "•"
            goto L_0x0172
        L_0x0170:
            r7 = r44
        L_0x0172:
            r8 = r12 & 16
            if (r8 == 0) goto L_0x0185
            io.intercom.android.sdk.ui.theme.IntercomTheme r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r10 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r8 = r8.getTypography(r0, r10)
            Q0.T r8 = r8.getType04()
            r3 = r3 & r19
            goto L_0x0186
        L_0x0185:
            r8 = r10
        L_0x0186:
            if (r13 == 0) goto L_0x018f
            r0.x0$a r10 = r0.C2544x0.f25560b
            long r13 = r10.h()
            goto L_0x0190
        L_0x018f:
            r13 = r14
        L_0x0190:
            if (r16 == 0) goto L_0x0199
            b1.t$a r10 = b1.t.f19154a
            int r10 = r10.a()
            goto L_0x019b
        L_0x0199:
            r10 = r48
        L_0x019b:
            if (r6 == 0) goto L_0x01a1
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x01a3
        L_0x01a1:
            r6 = r49
        L_0x01a3:
            if (r4 == 0) goto L_0x01ad
            r38 = 0
        L_0x01a7:
            r39 = r13
            r13 = r3
            r3 = r39
            goto L_0x01b0
        L_0x01ad:
            r38 = r50
            goto L_0x01a7
        L_0x01b0:
            r0.v()
            boolean r14 = Sg.p.d0(r41)
            if (r14 != 0) goto L_0x01d4
            boolean r14 = Sg.p.d0(r42)
            if (r14 != 0) goto L_0x01d4
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = 32
            r14.append(r15)
            r14.append(r7)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r14 = ""
        L_0x01d6:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r1)
            r15.append(r14)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            r14 = 598373073(0x23aa72d1, float:1.8480064E-17)
            r0.T(r14)
            r14 = r13 & 14
            r9 = 4
            if (r14 != r9) goto L_0x01f5
            r9 = 1
            goto L_0x01f6
        L_0x01f5:
            r9 = 0
        L_0x01f6:
            r14 = r13 & 112(0x70, float:1.57E-43)
            r45 = r7
            r7 = 32
            if (r14 != r7) goto L_0x0200
            r7 = 1
            goto L_0x0201
        L_0x0200:
            r7 = 0
        L_0x0201:
            r7 = r7 | r9
            java.lang.Object r9 = r0.A()
            if (r7 != 0) goto L_0x0210
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r7 = r7.a()
            if (r9 != r7) goto L_0x0218
        L_0x0210:
            io.intercom.android.sdk.m5.components.a1 r9 = new io.intercom.android.sdk.m5.components.a1
            r9.<init>(r1, r2)
            r0.r(r9)
        L_0x0218:
            yf.l r9 = (yf.C6798l) r9
            r0.M()
            r1 = 1
            r7 = 0
            r14 = 0
            k0.i r14 = O0.m.d(r5, r14, r9, r1, r7)
            int r1 = r13 >> 9
            r1 = r1 & 896(0x380, float:1.256E-42)
            int r7 = r13 << 3
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r7 = r7 & r9
            r35 = r1 | r7
            int r1 = r13 >> 15
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r7 = r13 >> 12
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r7
            int r7 = r13 << 6
            r7 = r7 & r17
            r36 = r1 | r7
            r37 = 54776(0xd5f8, float:7.6758E-41)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r29 = 0
            r31 = 0
            r32 = 0
            r13 = r15
            r15 = r3
            r25 = r38
            r28 = r10
            r30 = r6
            r33 = r8
            r34 = r0
            V.T0.b(r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r9 = r6
            r6 = r3
            r3 = r5
            r5 = r8
            r8 = r10
            r10 = r38
            r4 = r45
        L_0x026d:
            Y.Y0 r13 = r0.k()
            if (r13 == 0) goto L_0x0284
            io.intercom.android.sdk.m5.components.b1 r14 = new io.intercom.android.sdk.m5.components.b1
            r0 = r14
            r1 = r41
            r2 = r42
            r11 = r52
            r12 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12)
            r13.a(r14)
        L_0x0284:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.components.TextWithSeparatorKt.m206TextWithSeparatorwV1YYcM(java.lang.String, java.lang.String, k0.i, java.lang.String, Q0.T, long, int, int, b1.j, Y.m, int, int):void");
    }

    @IntercomPreviews
    private static final void TextWithSeparatorFirstEmptyPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1116705163);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m195getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new e1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextWithSeparatorFirstEmptyPreview$lambda$5(int i10, C1500m mVar, int i11) {
        TextWithSeparatorFirstEmptyPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void TextWithSeparatorPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1364601736);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m193getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextWithSeparatorPreview$lambda$3(int i10, C1500m mVar, int i11) {
        TextWithSeparatorPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void TextWithSeparatorSecondEmptyPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1899699287);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m194getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d1(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M TextWithSeparatorSecondEmptyPreview$lambda$4(int i10, C1500m mVar, int i11) {
        TextWithSeparatorSecondEmptyPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextWithSeparator_wV1YYcM$lambda$1$lambda$0(String str, String str2, v vVar) {
        C6496s.h(str, "$firstText");
        C6496s.h(str2, "$secondText");
        C6496s.h(vVar, "$this$semantics");
        t.Y(vVar, str + ' ' + str2);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TextWithSeparator_wV1YYcM$lambda$2(String str, String str2, i iVar, String str3, T t10, long j10, int i10, int i11, j jVar, int i12, int i13, C1500m mVar, int i14) {
        C6496s.h(str, "$firstText");
        C6496s.h(str2, "$secondText");
        m206TextWithSeparatorwV1YYcM(str, str2, iVar, str3, t10, j10, i10, i11, jVar, mVar, M0.a(i12 | 1), i13);
        return C6514M.f71813a;
    }
}
