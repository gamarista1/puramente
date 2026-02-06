package io.intercom.android.sdk.ui.component;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.os.Build;
import android.os.ext.SdkExtensions;
import e.C1935h;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.Y;
import qf.C6658d;
import qf.g;
import x.C2843G;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000D\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u001a{\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"", "maxSelection", "Lx/G;", "indication", "Lio/intercom/android/sdk/ui/component/MediaType;", "mediaType", "", "", "trustedFileExtensions", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "Llf/M;", "onResult", "Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;", "mediaPickerButtonCTAStyle", "Lkotlin/Function0;", "onClick", "content", "MediaPickerButton", "(ILx/G;Lio/intercom/android/sdk/ui/component/MediaType;Ljava/util/Set;Lyf/l;Lio/intercom/android/sdk/ui/component/MediaPickerButtonCTAStyle;Lyf/a;Lyf/p;LY/m;II)V", "", "isPhotoPickerAvailable", "()Z", "MediaPickerButtonPreview", "(LY/m;I)V", "defaultTrustedImageExtensions", "Ljava/util/Set;", "defaultTrustedVideoExtensions", "defaultTrustedDocumentExtensions", "defaultTrustedAudioExtensions", "defaultTrustedFileExtensions", "getDefaultTrustedFileExtensions", "()Ljava/util/Set;", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaPickerButtonKt {
    private static final Set<String> defaultTrustedAudioExtensions;
    private static final Set<String> defaultTrustedDocumentExtensions;
    private static final Set<String> defaultTrustedFileExtensions;
    private static final Set<String> defaultTrustedImageExtensions;
    private static final Set<String> defaultTrustedVideoExtensions;

    static {
        Set<String> j10 = Y.j("gif", "jpeg", "jpg", "png", "heic", "dng");
        defaultTrustedImageExtensions = j10;
        Set<String> j11 = Y.j("mp4", "mov");
        defaultTrustedVideoExtensions = j11;
        Set<String> j12 = Y.j("pdf", "txt");
        defaultTrustedDocumentExtensions = j12;
        Set<String> j13 = Y.j("oga", "ogg");
        defaultTrustedAudioExtensions = j13;
        defaultTrustedFileExtensions = Y.n(Y.n(Y.n(j10, j11), j12), j13);
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void MediaPickerButton(int r29, x.C2843G r30, io.intercom.android.sdk.ui.component.MediaType r31, java.util.Set<java.lang.String> r32, yf.C6798l r33, io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle r34, yf.C6787a r35, yf.p r36, Y.C1500m r37, int r38, int r39) {
        /*
            r1 = r29
            r5 = r33
            r6 = r34
            r8 = r36
            r9 = r38
            r10 = r39
            r0 = 8
            r2 = 128(0x80, float:1.794E-43)
            r3 = 16
            r4 = 32
            r7 = 4
            r11 = 2
            java.lang.String r12 = "onResult"
            kotlin.jvm.internal.C6496s.h(r5, r12)
            java.lang.String r12 = "mediaPickerButtonCTAStyle"
            kotlin.jvm.internal.C6496s.h(r6, r12)
            java.lang.String r12 = "content"
            kotlin.jvm.internal.C6496s.h(r8, r12)
            r12 = -1770734349(0xffffffff9674bcf3, float:-1.9769785E-25)
            r13 = r37
            Y.m r12 = r13.h(r12)
            r13 = 1
            r14 = r10 & 1
            if (r14 == 0) goto L_0x0036
            r14 = r9 | 6
            goto L_0x0046
        L_0x0036:
            r14 = r9 & 14
            if (r14 != 0) goto L_0x0045
            boolean r14 = r12.d(r1)
            if (r14 == 0) goto L_0x0042
            r14 = r7
            goto L_0x0043
        L_0x0042:
            r14 = r11
        L_0x0043:
            r14 = r14 | r9
            goto L_0x0046
        L_0x0045:
            r14 = r9
        L_0x0046:
            r15 = r9 & 112(0x70, float:1.57E-43)
            if (r15 != 0) goto L_0x0060
            r15 = r10 & 2
            if (r15 != 0) goto L_0x0059
            r15 = r30
            boolean r16 = r12.S(r15)
            if (r16 == 0) goto L_0x005b
            r16 = r4
            goto L_0x005d
        L_0x0059:
            r15 = r30
        L_0x005b:
            r16 = r3
        L_0x005d:
            r14 = r14 | r16
            goto L_0x0062
        L_0x0060:
            r15 = r30
        L_0x0062:
            r7 = r7 & r10
            if (r7 == 0) goto L_0x006a
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x0067:
            r11 = r31
            goto L_0x007d
        L_0x006a:
            r11 = r9 & 896(0x380, float:1.256E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r31
            boolean r17 = r12.S(r11)
            if (r17 == 0) goto L_0x0079
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x007b
        L_0x0079:
            r17 = r2
        L_0x007b:
            r14 = r14 | r17
        L_0x007d:
            r13 = r10 & 8
            if (r13 == 0) goto L_0x0083
            r14 = r14 | 1024(0x400, float:1.435E-42)
        L_0x0083:
            r3 = r3 & r10
            r18 = 57344(0xe000, float:8.0356E-41)
            if (r3 == 0) goto L_0x008c
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009c
        L_0x008c:
            r3 = r9 & r18
            if (r3 != 0) goto L_0x009c
            boolean r3 = r12.C(r5)
            if (r3 == 0) goto L_0x0099
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r14 = r14 | r3
        L_0x009c:
            r3 = r10 & 32
            if (r3 == 0) goto L_0x00a4
            r3 = 196608(0x30000, float:2.75506E-40)
        L_0x00a2:
            r14 = r14 | r3
            goto L_0x00b5
        L_0x00a4:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r9
            if (r3 != 0) goto L_0x00b5
            boolean r3 = r12.S(r6)
            if (r3 == 0) goto L_0x00b2
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a2
        L_0x00b2:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a2
        L_0x00b5:
            r3 = r10 & 64
            if (r3 == 0) goto L_0x00bf
            r4 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 | r4
        L_0x00bc:
            r4 = r35
            goto L_0x00d3
        L_0x00bf:
            r4 = 3670016(0x380000, float:5.142788E-39)
            r4 = r4 & r9
            if (r4 != 0) goto L_0x00bc
            r4 = r35
            boolean r19 = r12.C(r4)
            if (r19 == 0) goto L_0x00cf
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d1
        L_0x00cf:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d1:
            r14 = r14 | r19
        L_0x00d3:
            r2 = r2 & r10
            if (r2 == 0) goto L_0x00dc
            r2 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x00d8:
            r14 = r14 | r2
        L_0x00d9:
            r2 = 8
            goto L_0x00ed
        L_0x00dc:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r9
            if (r2 != 0) goto L_0x00d9
            boolean r2 = r12.C(r8)
            if (r2 == 0) goto L_0x00ea
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00d8
        L_0x00ea:
            r2 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x00d8
        L_0x00ed:
            if (r13 != r2) goto L_0x0109
            r2 = 23967451(0x16db6db, float:4.3661218E-38)
            r2 = r2 & r14
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r2 != r0) goto L_0x0109
            boolean r0 = r12.i()
            if (r0 != 0) goto L_0x00ff
            goto L_0x0109
        L_0x00ff:
            r12.I()
            r7 = r4
            r3 = r11
            r2 = r15
            r4 = r32
            goto L_0x0279
        L_0x0109:
            r12.D()
            r0 = 1
            r2 = r9 & 1
            if (r2 == 0) goto L_0x0117
            boolean r2 = r12.L()
            if (r2 == 0) goto L_0x0119
        L_0x0117:
            r2 = 2
            goto L_0x0129
        L_0x0119:
            r12.I()
            r2 = 2
            r2 = r2 & r10
            if (r2 == 0) goto L_0x0122
            r14 = r14 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0122:
            if (r13 == 0) goto L_0x0126
            r14 = r14 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0126:
            r2 = r32
            goto L_0x0150
        L_0x0129:
            r2 = r2 & r10
            if (r2 == 0) goto L_0x0139
            Y.I0 r2 = androidx.compose.foundation.j.a()
            java.lang.Object r2 = r12.m(r2)
            x.G r2 = (x.C2843G) r2
            r14 = r14 & -113(0xffffffffffffff8f, float:NaN)
            r15 = r2
        L_0x0139:
            if (r7 == 0) goto L_0x013e
            io.intercom.android.sdk.ui.component.MediaType r2 = io.intercom.android.sdk.ui.component.MediaType.All
            r11 = r2
        L_0x013e:
            if (r13 == 0) goto L_0x0146
            java.util.Set<java.lang.String> r2 = defaultTrustedFileExtensions
            r7 = r14 & -7169(0xffffffffffffe3ff, float:NaN)
            r14 = r7
            goto L_0x0148
        L_0x0146:
            r2 = r32
        L_0x0148:
            if (r3 == 0) goto L_0x0150
            io.intercom.android.sdk.ui.component.A r3 = new io.intercom.android.sdk.ui.component.A
            r3.<init>()
            r4 = r3
        L_0x0150:
            r12.v()
            java.lang.Object r3 = r12.A()
            Y.m$a r7 = Y.C1500m.f10026a
            java.lang.Object r13 = r7.a()
            if (r3 != r13) goto L_0x016e
            qf.h r3 = qf.h.f72645a
            Ug.K r3 = Y.P.j(r3, r12)
            Y.B r13 = new Y.B
            r13.<init>(r3)
            r12.r(r13)
            r3 = r13
        L_0x016e:
            Y.B r3 = (Y.B) r3
            Ug.K r3 = r3.a()
            io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract r13 = new io.intercom.android.sdk.ui.preview.ui.PreviewMediaContract
            r13.<init>()
            r0 = -2009946895(0xffffffff8832a4f1, float:-5.3758814E-34)
            r12.T(r0)
            r0 = r14 & r18
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r9) goto L_0x0187
            r0 = 1
            goto L_0x0188
        L_0x0187:
            r0 = 0
        L_0x0188:
            java.lang.Object r9 = r12.A()
            if (r0 != 0) goto L_0x0194
            java.lang.Object r0 = r7.a()
            if (r9 != r0) goto L_0x019c
        L_0x0194:
            io.intercom.android.sdk.ui.component.B r9 = new io.intercom.android.sdk.ui.component.B
            r9.<init>(r5)
            r12.r(r9)
        L_0x019c:
            yf.l r9 = (yf.C6798l) r9
            r12.M()
            r0 = 0
            e.h r9 = e.C1930c.a(r13, r9, r12, r0)
            io.intercom.android.sdk.ui.component.IntercomMediaPicker r0 = new io.intercom.android.sdk.ui.component.IntercomMediaPicker
            r0.<init>(r11, r2, r1)
            io.intercom.android.sdk.ui.component.C r13 = new io.intercom.android.sdk.ui.component.C
            r13.<init>(r3, r5, r9, r6)
            r3 = 8
            e.h r0 = e.C1930c.a(r0, r13, r12, r3)
            k0.i$a r20 = k0.i.f23074a
            r3 = -2009910284(0xffffffff883333f4, float:-5.3926924E-34)
            r12.T(r3)
            java.lang.Object r3 = r12.A()
            java.lang.Object r7 = r7.a()
            if (r3 != r7) goto L_0x01cf
            B.l r3 = B.k.a()
            r12.r(r3)
        L_0x01cf:
            r21 = r3
            B.l r21 = (B.l) r21
            r12.M()
            io.intercom.android.sdk.ui.component.D r3 = new io.intercom.android.sdk.ui.component.D
            r3.<init>(r4, r0)
            r27 = 28
            r28 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r22 = r15
            r26 = r3
            k0.i r0 = androidx.compose.foundation.d.b(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            k0.c$a r3 = k0.c.f23044a
            k0.c r3 = r3.o()
            r7 = 0
            H0.F r3 = androidx.compose.foundation.layout.d.h(r3, r7)
            int r7 = Y.C1494j.a(r12, r7)
            Y.y r9 = r12.p()
            k0.i r0 = k0.h.e(r12, r0)
            J0.g$a r13 = J0.C1241g.f3853J
            yf.a r1 = r13.a()
            Y.f r16 = r12.j()
            if (r16 != 0) goto L_0x0213
            Y.C1494j.c()
        L_0x0213:
            r12.F()
            boolean r16 = r12.f()
            if (r16 == 0) goto L_0x0220
            r12.U(r1)
            goto L_0x0223
        L_0x0220:
            r12.q()
        L_0x0223:
            Y.m r1 = Y.F1.a(r12)
            r16 = r2
            yf.p r2 = r13.c()
            Y.F1.b(r1, r3, r2)
            yf.p r2 = r13.e()
            Y.F1.b(r1, r9, r2)
            yf.p r2 = r13.b()
            boolean r3 = r1.f()
            if (r3 != 0) goto L_0x024f
            java.lang.Object r3 = r1.A()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r9)
            if (r3 != 0) goto L_0x025d
        L_0x024f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1.r(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1.V(r3, r2)
        L_0x025d:
            yf.p r2 = r13.d()
            Y.F1.b(r1, r0, r2)
            androidx.compose.foundation.layout.f r0 = androidx.compose.foundation.layout.f.f12848a
            int r0 = r14 >> 21
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.invoke(r12, r0)
            r12.u()
            r7 = r4
            r3 = r11
            r2 = r15
            r4 = r16
        L_0x0279:
            Y.Y0 r11 = r12.k()
            if (r11 == 0) goto L_0x0294
            io.intercom.android.sdk.ui.component.E r12 = new io.intercom.android.sdk.ui.component.E
            r0 = r12
            r1 = r29
            r5 = r33
            r6 = r34
            r8 = r36
            r9 = r38
            r10 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x0294:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.MediaPickerButtonKt.MediaPickerButton(int, x.G, io.intercom.android.sdk.ui.component.MediaType, java.util.Set, yf.l, io.intercom.android.sdk.ui.component.MediaPickerButtonCTAStyle, yf.a, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaPickerButton$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaPickerButton$lambda$2$lambda$1(C6798l lVar, List list) {
        C6496s.h(lVar, "$onResult");
        C6496s.h(list, "it");
        lVar.invoke(list);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaPickerButton$lambda$3(K k10, C6798l lVar, C1935h hVar, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, List list) {
        C6496s.h(k10, "$scope");
        C6496s.h(lVar, "$onResult");
        C6496s.h(hVar, "$previewLauncher");
        C6496s.h(mediaPickerButtonCTAStyle, "$mediaPickerButtonCTAStyle");
        C6496s.h(list, "it");
        if (!list.isEmpty()) {
            C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1(hVar, list, mediaPickerButtonCTAStyle, (C6658d<? super MediaPickerButtonKt$MediaPickerButton$pickerLauncher$1$1>) null), 3, (Object) null);
        } else {
            lVar.invoke(list);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaPickerButton$lambda$5(C6787a aVar, C1935h hVar) {
        C6496s.h(hVar, "$pickerLauncher");
        aVar.invoke();
        hVar.b("*/*");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaPickerButton$lambda$7(int i10, C2843G g10, MediaType mediaType, Set set, C6798l lVar, MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle, C6787a aVar, p pVar, int i11, int i12, C1500m mVar, int i13) {
        C6798l lVar2 = lVar;
        C6496s.h(lVar2, "$onResult");
        MediaPickerButtonCTAStyle mediaPickerButtonCTAStyle2 = mediaPickerButtonCTAStyle;
        C6496s.h(mediaPickerButtonCTAStyle2, "$mediaPickerButtonCTAStyle");
        p pVar2 = pVar;
        C6496s.h(pVar2, "$content");
        MediaPickerButton(i10, g10, mediaType, set, lVar2, mediaPickerButtonCTAStyle2, aVar, pVar2, mVar, M0.a(i11 | 1), i12);
        return C6514M.f71813a;
    }

    private static final void MediaPickerButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-158042907);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$MediaPickerButtonKt.INSTANCE.m578getLambda3$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new F(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M MediaPickerButtonPreview$lambda$8(int i10, C1500m mVar, int i11) {
        MediaPickerButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final Set<String> getDefaultTrustedFileExtensions() {
        return defaultTrustedFileExtensions;
    }

    public static final boolean isPhotoPickerAvailable() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 < 30 || SdkExtensions.getExtensionVersion(30) < 2) {
            return false;
        }
        return true;
    }
}
