package io.intercom.android.sdk.ui.component;

import Y.C1500m;
import Y.M0;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.q;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ac\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lk0/i;", "modifier", "", "text", "Lr0/x0;", "borderColor", "textColor", "Lkotlin/Function1;", "LC/Y;", "Llf/M;", "trialingIcon", "leadingIcon", "BoxedTextLayout-Y0xEhic", "(Lk0/i;Ljava/lang/String;JJLyf/q;Lyf/q;LY/m;II)V", "BoxedTextLayout", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BoxedTextLayoutKt {
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0177  */
    /* renamed from: BoxedTextLayout-Y0xEhic  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m567BoxedTextLayoutY0xEhic(k0.i r33, java.lang.String r34, long r35, long r37, yf.q r39, yf.q r40, Y.C1500m r41, int r42, int r43) {
        /*
            r2 = r34
            r13 = r35
            r3 = r42
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            r0 = -1728859823(0xffffffff98f3b151, float:-6.299307E-24)
            r1 = r41
            Y.m r0 = r1.h(r0)
            r1 = r43 & 1
            if (r1 == 0) goto L_0x001e
            r5 = r3 | 6
            r6 = r5
            r5 = r33
            goto L_0x0032
        L_0x001e:
            r5 = r3 & 14
            if (r5 != 0) goto L_0x002f
            r5 = r33
            boolean r6 = r0.S(r5)
            if (r6 == 0) goto L_0x002c
            r6 = 4
            goto L_0x002d
        L_0x002c:
            r6 = 2
        L_0x002d:
            r6 = r6 | r3
            goto L_0x0032
        L_0x002f:
            r5 = r33
            r6 = r3
        L_0x0032:
            r7 = r43 & 2
            if (r7 == 0) goto L_0x0039
            r6 = r6 | 48
            goto L_0x0049
        L_0x0039:
            r7 = r3 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0049
            boolean r7 = r0.S(r2)
            if (r7 == 0) goto L_0x0046
            r7 = 32
            goto L_0x0048
        L_0x0046:
            r7 = 16
        L_0x0048:
            r6 = r6 | r7
        L_0x0049:
            r7 = r43 & 4
            if (r7 == 0) goto L_0x0050
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0060
        L_0x0050:
            r7 = r3 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0060
            boolean r7 = r0.e(r13)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r6 = r6 | r7
        L_0x0060:
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x0079
            r7 = r43 & 8
            if (r7 != 0) goto L_0x0073
            r7 = r37
            boolean r9 = r0.e(r7)
            if (r9 == 0) goto L_0x0075
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0077
        L_0x0073:
            r7 = r37
        L_0x0075:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0077:
            r6 = r6 | r9
            goto L_0x007b
        L_0x0079:
            r7 = r37
        L_0x007b:
            r9 = r43 & 16
            if (r9 == 0) goto L_0x0084
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r10 = r39
            goto L_0x0098
        L_0x0084:
            r10 = 57344(0xe000, float:8.0356E-41)
            r10 = r10 & r3
            if (r10 != 0) goto L_0x0081
            r10 = r39
            boolean r11 = r0.C(r10)
            if (r11 == 0) goto L_0x0095
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r6 = r6 | r11
        L_0x0098:
            r11 = r43 & 32
            if (r11 == 0) goto L_0x00a2
            r12 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r12
        L_0x009f:
            r12 = r40
            goto L_0x00b5
        L_0x00a2:
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r3
            if (r12 != 0) goto L_0x009f
            r12 = r40
            boolean r15 = r0.C(r12)
            if (r15 == 0) goto L_0x00b2
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r15 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r6 = r6 | r15
        L_0x00b5:
            r15 = 374491(0x5b6db, float:5.24774E-40)
            r15 = r15 & r6
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r15 != r4) goto L_0x00cb
            boolean r4 = r0.i()
            if (r4 != 0) goto L_0x00c5
            goto L_0x00cb
        L_0x00c5:
            r0.I()
            r1 = r0
            goto L_0x024e
        L_0x00cb:
            r0.D()
            r4 = r3 & 1
            r15 = 6
            if (r4 == 0) goto L_0x00eb
            boolean r4 = r0.L()
            if (r4 == 0) goto L_0x00da
            goto L_0x00eb
        L_0x00da:
            r0.I()
            r1 = r43 & 8
            if (r1 == 0) goto L_0x00e3
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00e3:
            r27 = r6
            r25 = r7
            r11 = r10
            r9 = r12
            r12 = r5
            goto L_0x010d
        L_0x00eb:
            if (r1 == 0) goto L_0x00f0
            k0.i$a r1 = k0.i.f23074a
            r5 = r1
        L_0x00f0:
            r1 = r43 & 8
            if (r1 == 0) goto L_0x0100
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            io.intercom.android.sdk.ui.theme.IntercomColors r1 = r1.getColors(r0, r15)
            long r7 = r1.m700getPrimaryText0d7_KjU()
            r6 = r6 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0100:
            r1 = 0
            if (r9 == 0) goto L_0x0104
            r10 = r1
        L_0x0104:
            if (r11 == 0) goto L_0x00e3
            r9 = r1
            r12 = r5
            r27 = r6
            r25 = r7
            r11 = r10
        L_0x010d:
            r0.v()
            r1 = 1
            float r1 = (float) r1
            float r1 = c1.h.j(r1)
            io.intercom.android.sdk.ui.theme.IntercomTheme r4 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            V.B0 r5 = r4.getShapes(r0, r15)
            I.a r5 = r5.e()
            k0.i r1 = x.C2866e.f(r12, r1, r13, r5)
            r5 = 2
            I.f r5 = I.g.a(r5)
            k0.i r1 = o0.C2342e.a(r1, r5)
            r5 = 8
            float r5 = (float) r5
            float r6 = c1.h.j(r5)
            k0.i r1 = androidx.compose.foundation.layout.n.i(r1, r6)
            k0.c$a r6 = k0.c.f23044a
            k0.c$c r6 = r6.i()
            C.c r7 = C.C1085c.f882a
            float r5 = c1.h.j(r5)
            C.c$f r5 = r7.n(r5)
            r7 = 54
            H0.F r5 = C.W.b(r5, r6, r0, r7)
            r6 = 0
            int r7 = Y.C1494j.a(r0, r6)
            Y.y r8 = r0.p()
            k0.i r1 = k0.h.e(r0, r1)
            J0.g$a r10 = J0.C1241g.f3853J
            yf.a r6 = r10.a()
            Y.f r16 = r0.j()
            if (r16 != 0) goto L_0x016a
            Y.C1494j.c()
        L_0x016a:
            r0.F()
            boolean r16 = r0.f()
            if (r16 == 0) goto L_0x0177
            r0.U(r6)
            goto L_0x017a
        L_0x0177:
            r0.q()
        L_0x017a:
            Y.m r6 = Y.F1.a(r0)
            yf.p r15 = r10.c()
            Y.F1.b(r6, r5, r15)
            yf.p r5 = r10.e()
            Y.F1.b(r6, r8, r5)
            yf.p r5 = r10.b()
            boolean r8 = r6.f()
            if (r8 != 0) goto L_0x01a4
            java.lang.Object r8 = r6.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r15)
            if (r8 != 0) goto L_0x01b2
        L_0x01a4:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6.r(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.V(r7, r5)
        L_0x01b2:
            yf.p r5 = r10.d()
            Y.F1.b(r6, r1, r5)
            C.Z r10 = C.Z.f873a
            r1 = 581650633(0x22ab48c9, float:4.6426707E-18)
            r0.T(r1)
            if (r11 == 0) goto L_0x01d1
            int r1 = r27 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r5 = 6
            r1 = r1 | r5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.invoke(r10, r0, r1)
            goto L_0x01d2
        L_0x01d1:
            r5 = 6
        L_0x01d2:
            r0.M()
            k0.i$a r1 = k0.i.f23074a
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            k0.i r1 = r10.a(r1, r6, r7)
            io.intercom.android.sdk.ui.theme.IntercomTypography r4 = r4.getTypography(r0, r5)
            Q0.T r20 = r4.getType04()
            b1.t$a r4 = b1.t.f19154a
            int r15 = r4.b()
            r28 = r5
            int r4 = r27 >> 3
            r4 = r4 & 910(0x38e, float:1.275E-42)
            r22 = r4
            r23 = 3120(0xc30, float:4.372E-42)
            r24 = 55288(0xd7f8, float:7.7475E-41)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r16 = 0
            r29 = r9
            r30 = r10
            r9 = r16
            r16 = 0
            r31 = r11
            r11 = r16
            r32 = r12
            r12 = r16
            r16 = 0
            r13 = r16
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r33 = r0
            r0 = r34
            r2 = r25
            r21 = r33
            V.T0.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = 581663143(0x22ab79a7, float:4.6478447E-18)
            r1 = r33
            r1.T(r0)
            r12 = r29
            if (r12 == 0) goto L_0x0242
            int r0 = r27 >> 12
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r28 | r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = r30
            r12.invoke(r2, r1, r0)
        L_0x0242:
            r1.M()
            r1.u()
            r7 = r25
            r10 = r31
            r5 = r32
        L_0x024e:
            Y.Y0 r11 = r1.k()
            if (r11 == 0) goto L_0x0269
            io.intercom.android.sdk.ui.component.a r13 = new io.intercom.android.sdk.ui.component.a
            r0 = r13
            r1 = r5
            r2 = r34
            r3 = r35
            r5 = r7
            r7 = r10
            r8 = r12
            r9 = r42
            r10 = r43
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r11.a(r13)
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.BoxedTextLayoutKt.m567BoxedTextLayoutY0xEhic(k0.i, java.lang.String, long, long, yf.q, yf.q, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M BoxedTextLayout_Y0xEhic$lambda$1(i iVar, String str, long j10, long j11, q qVar, q qVar2, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$text");
        m567BoxedTextLayoutY0xEhic(iVar, str, j10, j11, qVar, qVar2, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
