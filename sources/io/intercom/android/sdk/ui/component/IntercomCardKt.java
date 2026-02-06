package io.intercom.android.sdk.ui.component;

import B.l;
import Y.C1500m;
import Y.M0;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;", "style", "Lkotlin/Function1;", "LC/j;", "Llf/M;", "content", "IntercomCard", "(Lk0/i;Lio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;Lyf/q;LY/m;II)V", "Lkotlin/Function0;", "onClick", "", "enabled", "LB/l;", "interactionSource", "(Lyf/a;Lk0/i;ZLio/intercom/android/sdk/ui/component/IntercomCardStyle$Style;LB/l;Lyf/q;LY/m;II)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomCardKt {
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IntercomCard(k0.i r25, io.intercom.android.sdk.ui.component.IntercomCardStyle.Style r26, yf.q r27, Y.C1500m r28, int r29, int r30) {
        /*
            r9 = r27
            r10 = r29
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C6496s.h(r9, r0)
            r0 = 1083788517(0x40994ce5, float:4.7906365)
            r1 = r28
            Y.m r8 = r1.h(r0)
            r0 = r30 & 1
            r1 = 2
            if (r0 == 0) goto L_0x001d
            r2 = r10 | 6
            r3 = r2
            r2 = r25
            goto L_0x0031
        L_0x001d:
            r2 = r10 & 14
            if (r2 != 0) goto L_0x002e
            r2 = r25
            boolean r3 = r8.S(r2)
            if (r3 == 0) goto L_0x002b
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            r3 = r3 | r10
            goto L_0x0031
        L_0x002e:
            r2 = r25
            r3 = r10
        L_0x0031:
            r4 = r10 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r30 & 2
            if (r4 != 0) goto L_0x0044
            r4 = r26
            boolean r5 = r8.S(r4)
            if (r5 == 0) goto L_0x0046
            r5 = 32
            goto L_0x0048
        L_0x0044:
            r4 = r26
        L_0x0046:
            r5 = 16
        L_0x0048:
            r3 = r3 | r5
            goto L_0x004c
        L_0x004a:
            r4 = r26
        L_0x004c:
            r5 = r30 & 4
            if (r5 == 0) goto L_0x0053
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r5 = r10 & 896(0x380, float:1.256E-42)
            if (r5 != 0) goto L_0x0063
            boolean r5 = r8.C(r9)
            if (r5 == 0) goto L_0x0060
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r3 = r3 | r5
        L_0x0063:
            r5 = r3 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0078
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            r8.I()
            r1 = r2
            r2 = r4
            r12 = r8
            goto L_0x014b
        L_0x0078:
            r8.D()
            r5 = r10 & 1
            if (r5 == 0) goto L_0x0094
            boolean r5 = r8.L()
            if (r5 == 0) goto L_0x0086
            goto L_0x0094
        L_0x0086:
            r8.I()
            r0 = r30 & 2
            if (r0 == 0) goto L_0x008f
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
        L_0x008f:
            r23 = r2
        L_0x0091:
            r24 = r4
            goto L_0x00bf
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            k0.i$a r0 = k0.i.f23074a
            goto L_0x009a
        L_0x0099:
            r0 = r2
        L_0x009a:
            r2 = r30 & 2
            if (r2 == 0) goto L_0x00bc
            io.intercom.android.sdk.ui.component.IntercomCardStyle r11 = io.intercom.android.sdk.ui.component.IntercomCardStyle.INSTANCE
            r22 = 1572864(0x180000, float:2.204052E-39)
            r23 = 63
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = r8
            io.intercom.android.sdk.ui.component.IntercomCardStyle$Style r2 = r11.m591defaultStyleqUnfpCA(r12, r13, r15, r17, r18, r19, r21, r22, r23)
            r3 = r3 & -113(0xffffffffffffff8f, float:NaN)
            r23 = r0
            r24 = r2
            goto L_0x00bf
        L_0x00bc:
            r23 = r0
            goto L_0x0091
        L_0x00bf:
            r8.v()
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 < r2) goto L_0x00ce
            float r0 = r24.m600getElevationD9Ej5fM()
        L_0x00cc:
            r12 = r0
            goto L_0x00d4
        L_0x00ce:
            float r0 = (float) r1
            float r0 = c1.h.j(r0)
            goto L_0x00cc
        L_0x00d4:
            r0.g2 r13 = r24.getShape()
            r0.x0 r0 = r24.m601getShadowColorQN2ZGVo()
            if (r0 == 0) goto L_0x00e5
            long r0 = r0.y()
        L_0x00e2:
            r17 = r0
            goto L_0x00ec
        L_0x00e5:
            r0.x0$a r0 = r0.C2544x0.f25560b
            long r0 = r0.a()
            goto L_0x00e2
        L_0x00ec:
            r19 = 12
            r20 = 0
            r14 = 0
            r15 = 0
            r11 = r23
            k0.i r0 = o0.C2349l.b(r11, r12, r13, r14, r15, r17, r19, r20)
            r0.g2 r1 = r24.getShape()
            V.o r2 = V.C1397o.f7854a
            long r12 = r24.m598getBackgroundColor0d7_KjU()
            long r14 = r24.m599getContentColor0d7_KjU()
            int r4 = V.C1397o.f7855b
            int r21 = r4 << 12
            r22 = 12
            r16 = 0
            r18 = 0
            r11 = r2
            r20 = r8
            V.n r5 = r11.b(r12, r14, r16, r18, r20, r21, r22)
            r6 = 0
            float r6 = (float) r6
            float r12 = c1.h.j(r6)
            int r4 = r4 << 18
            r19 = r4 | 6
            r20 = 62
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = r8
            V.p r4 = r11.c(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            x.g r6 = r24.getBorder()
            int r2 = r3 << 9
            r3 = 458752(0x70000, float:6.42848E-40)
            r7 = r2 & r3
            r11 = 0
            r2 = r5
            r3 = r4
            r4 = r6
            r5 = r27
            r6 = r8
            r12 = r8
            r8 = r11
            V.C1401q.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r23
            r2 = r24
        L_0x014b:
            Y.Y0 r6 = r12.k()
            if (r6 == 0) goto L_0x0160
            io.intercom.android.sdk.ui.component.n r7 = new io.intercom.android.sdk.ui.component.n
            r0 = r7
            r3 = r27
            r4 = r29
            r5 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.IntercomCardKt.IntercomCard(k0.i, io.intercom.android.sdk.ui.component.IntercomCardStyle$Style, yf.q, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomCard$lambda$0(i iVar, IntercomCardStyle.Style style, q qVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(qVar, "$content");
        IntercomCard(iVar, style, qVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomCard$lambda$2(C6787a aVar, i iVar, boolean z10, IntercomCardStyle.Style style, l lVar, q qVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(aVar, "$onClick");
        C6496s.h(qVar, "$content");
        IntercomCard(aVar, iVar, z10, style, lVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void IntercomCard(yf.C6787a r32, k0.i r33, boolean r34, io.intercom.android.sdk.ui.component.IntercomCardStyle.Style r35, B.l r36, yf.q r37, Y.C1500m r38, int r39, int r40) {
        /*
            r12 = r32
            r13 = r37
            r14 = r39
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C6496s.h(r13, r0)
            r0 = 254499300(0xf2b59e4, float:8.448263E-30)
            r1 = r38
            Y.m r11 = r1.h(r0)
            r0 = r40 & 1
            if (r0 == 0) goto L_0x0020
            r0 = r14 | 6
            goto L_0x0030
        L_0x0020:
            r0 = r14 & 14
            if (r0 != 0) goto L_0x002f
            boolean r0 = r11.C(r12)
            if (r0 == 0) goto L_0x002c
            r0 = 4
            goto L_0x002d
        L_0x002c:
            r0 = 2
        L_0x002d:
            r0 = r0 | r14
            goto L_0x0030
        L_0x002f:
            r0 = r14
        L_0x0030:
            r1 = r40 & 2
            if (r1 == 0) goto L_0x0039
            r0 = r0 | 48
        L_0x0036:
            r2 = r33
            goto L_0x004b
        L_0x0039:
            r2 = r14 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0036
            r2 = r33
            boolean r3 = r11.S(r2)
            if (r3 == 0) goto L_0x0048
            r3 = 32
            goto L_0x004a
        L_0x0048:
            r3 = 16
        L_0x004a:
            r0 = r0 | r3
        L_0x004b:
            r3 = r40 & 4
            if (r3 == 0) goto L_0x0054
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r4 = r34
            goto L_0x0066
        L_0x0054:
            r4 = r14 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0051
            r4 = r34
            boolean r5 = r11.b(r4)
            if (r5 == 0) goto L_0x0063
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r0 = r0 | r5
        L_0x0066:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x007f
            r5 = r40 & 8
            if (r5 != 0) goto L_0x0079
            r5 = r35
            boolean r6 = r11.S(r5)
            if (r6 == 0) goto L_0x007b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007d
        L_0x0079:
            r5 = r35
        L_0x007b:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007d:
            r0 = r0 | r6
            goto L_0x0081
        L_0x007f:
            r5 = r35
        L_0x0081:
            r6 = r40 & 16
            if (r6 == 0) goto L_0x008a
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r7 = r36
            goto L_0x009e
        L_0x008a:
            r7 = 57344(0xe000, float:8.0356E-41)
            r7 = r7 & r14
            if (r7 != 0) goto L_0x0087
            r7 = r36
            boolean r8 = r11.S(r7)
            if (r8 == 0) goto L_0x009b
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r0 = r0 | r8
        L_0x009e:
            r8 = r40 & 32
            if (r8 == 0) goto L_0x00a6
            r8 = 196608(0x30000, float:2.75506E-40)
        L_0x00a4:
            r0 = r0 | r8
            goto L_0x00b7
        L_0x00a6:
            r8 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r14
            if (r8 != 0) goto L_0x00b7
            boolean r8 = r11.C(r13)
            if (r8 == 0) goto L_0x00b4
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a4
        L_0x00b4:
            r8 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00a4
        L_0x00b7:
            r8 = 374491(0x5b6db, float:5.24774E-40)
            r8 = r8 & r0
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r9) goto L_0x00d0
            boolean r8 = r11.i()
            if (r8 != 0) goto L_0x00c7
            goto L_0x00d0
        L_0x00c7:
            r11.I()
            r3 = r4
            r4 = r5
            r5 = r7
            r15 = r11
            goto L_0x01b4
        L_0x00d0:
            r11.D()
            r8 = r14 & 1
            if (r8 == 0) goto L_0x00f0
            boolean r8 = r11.L()
            if (r8 == 0) goto L_0x00de
            goto L_0x00f0
        L_0x00de:
            r11.I()
            r1 = r40 & 8
            if (r1 == 0) goto L_0x00e7
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00e7:
            r27 = r2
            r28 = r4
            r29 = r5
        L_0x00ed:
            r30 = r7
            goto L_0x014b
        L_0x00f0:
            if (r1 == 0) goto L_0x00f5
            k0.i$a r1 = k0.i.f23074a
            goto L_0x00f6
        L_0x00f5:
            r1 = r2
        L_0x00f6:
            if (r3 == 0) goto L_0x00fa
            r2 = 1
            goto L_0x00fb
        L_0x00fa:
            r2 = r4
        L_0x00fb:
            r3 = r40 & 8
            if (r3 == 0) goto L_0x011a
            io.intercom.android.sdk.ui.component.IntercomCardStyle r15 = io.intercom.android.sdk.ui.component.IntercomCardStyle.INSTANCE
            r26 = 1572864(0x180000, float:2.204052E-39)
            r27 = 63
            r16 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r11
            io.intercom.android.sdk.ui.component.IntercomCardStyle$Style r3 = r15.m591defaultStyleqUnfpCA(r16, r17, r19, r21, r22, r23, r25, r26, r27)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x011b
        L_0x011a:
            r3 = r5
        L_0x011b:
            if (r6 == 0) goto L_0x0144
            r4 = -2091443309(0xffffffff83571b93, float:-6.3214475E-37)
            r11.T(r4)
            java.lang.Object r4 = r11.A()
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r4 != r5) goto L_0x0136
            B.l r4 = B.k.a()
            r11.r(r4)
        L_0x0136:
            B.l r4 = (B.l) r4
            r11.M()
            r27 = r1
            r28 = r2
            r29 = r3
            r30 = r4
            goto L_0x014b
        L_0x0144:
            r27 = r1
            r28 = r2
            r29 = r3
            goto L_0x00ed
        L_0x014b:
            r11.v()
            r0.g2 r31 = r29.getShape()
            V.o r1 = V.C1397o.f7854a
            long r16 = r29.m598getBackgroundColor0d7_KjU()
            long r18 = r29.m599getContentColor0d7_KjU()
            int r2 = V.C1397o.f7855b
            int r25 = r2 << 12
            r26 = 12
            r20 = 0
            r22 = 0
            r15 = r1
            r24 = r11
            V.n r15 = r15.b(r16, r18, r20, r22, r24, r25, r26)
            float r3 = r29.m600getElevationD9Ej5fM()
            int r9 = r2 << 18
            r10 = 62
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r11
            V.p r5 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            x.g r6 = r29.getBorder()
            r1 = r0 & 1022(0x3fe, float:1.432E-42)
            int r0 = r0 << 9
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r0
            r1 = r1 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r2
            r10 = r1 | r0
            r16 = 0
            r0 = r32
            r1 = r27
            r2 = r28
            r3 = r31
            r4 = r15
            r7 = r30
            r8 = r37
            r9 = r11
            r15 = r11
            r11 = r16
            V.C1401q.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
        L_0x01b4:
            Y.Y0 r9 = r15.k()
            if (r9 == 0) goto L_0x01cb
            io.intercom.android.sdk.ui.component.o r10 = new io.intercom.android.sdk.ui.component.o
            r0 = r10
            r1 = r32
            r6 = r37
            r7 = r39
            r8 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.IntercomCardKt.IntercomCard(yf.a, k0.i, boolean, io.intercom.android.sdk.ui.component.IntercomCardStyle$Style, B.l, yf.q, Y.m, int, int):void");
    }
}
