package io.intercom.android.sdk.ui.component;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import k0.c;
import k0.i;
import kotlin.Metadata;
import lf.C6514M;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aw\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0014\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lk0/i;", "modifier", "", "title", "Lio/intercom/android/sdk/ui/component/IntercomTopBarIcon;", "navIcon", "Lk0/c$b;", "contentAlignment", "Lr0/x0;", "backgroundColor", "contentColor", "Lkotlin/Function0;", "Llf/M;", "onContentClick", "Lkotlin/Function1;", "LC/Y;", "menuItems", "IntercomTopBar-bogVsAg", "(Lk0/i;Ljava/lang/String;Lio/intercom/android/sdk/ui/component/IntercomTopBarIcon;Lk0/c$b;JJLyf/a;Lyf/q;LY/m;II)V", "IntercomTopBar", "IntercomTopBarPreview", "(LY/m;I)V", "IntercomTopBarPreviewWithoutNavIcon", "IntercomTopBarPreviewWithMenuItems", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomTopBarKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: io.intercom.android.sdk.ui.component.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0129  */
    /* renamed from: IntercomTopBar-bogVsAg  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m602IntercomTopBarbogVsAg(k0.i r78, java.lang.String r79, io.intercom.android.sdk.ui.component.IntercomTopBarIcon r80, k0.c.b r81, long r82, long r84, yf.C6787a r86, yf.q r87, Y.C1500m r88, int r89, int r90) {
        /*
            r11 = r89
            r12 = r90
            r1 = 128(0x80, float:1.794E-43)
            r2 = 48
            r3 = 6
            r4 = 32
            r5 = 16
            r6 = 832461575(0x319e5b07, float:4.608754E-9)
            r7 = r88
            Y.m r6 = r7.h(r6)
            r7 = 1
            r8 = r12 & 1
            r9 = 2
            r10 = 4
            if (r8 == 0) goto L_0x0023
            r13 = r11 | 6
            r14 = r13
            r13 = r78
            goto L_0x0037
        L_0x0023:
            r13 = r11 & 14
            if (r13 != 0) goto L_0x0034
            r13 = r78
            boolean r14 = r6.S(r13)
            if (r14 == 0) goto L_0x0031
            r14 = r10
            goto L_0x0032
        L_0x0031:
            r14 = r9
        L_0x0032:
            r14 = r14 | r11
            goto L_0x0037
        L_0x0034:
            r13 = r78
            r14 = r11
        L_0x0037:
            r15 = r12 & 2
            if (r15 == 0) goto L_0x003f
            r14 = r14 | r2
            r0 = r79
            goto L_0x0052
        L_0x003f:
            r16 = r11 & 112(0x70, float:1.57E-43)
            r0 = r79
            if (r16 != 0) goto L_0x0052
            boolean r16 = r6.S(r0)
            if (r16 == 0) goto L_0x004e
            r16 = r4
            goto L_0x0050
        L_0x004e:
            r16 = r5
        L_0x0050:
            r14 = r14 | r16
        L_0x0052:
            r16 = r12 & 4
            if (r16 == 0) goto L_0x005b
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r2 = r80
            goto L_0x006e
        L_0x005b:
            r2 = r11 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0058
            r2 = r80
            boolean r17 = r6.S(r2)
            if (r17 == 0) goto L_0x006a
            r17 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r17 = r1
        L_0x006c:
            r14 = r14 | r17
        L_0x006e:
            r17 = r12 & 8
            if (r17 == 0) goto L_0x0077
            r14 = r14 | 3072(0xc00, float:4.305E-42)
        L_0x0074:
            r9 = r81
            goto L_0x008a
        L_0x0077:
            r9 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r9 != 0) goto L_0x0074
            r9 = r81
            boolean r18 = r6.S(r9)
            if (r18 == 0) goto L_0x0086
            r18 = 2048(0x800, float:2.87E-42)
            goto L_0x0088
        L_0x0086:
            r18 = 1024(0x400, float:1.435E-42)
        L_0x0088:
            r14 = r14 | r18
        L_0x008a:
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r11 & r18
            if (r18 != 0) goto L_0x00ab
            r18 = r12 & 16
            if (r18 != 0) goto L_0x00a2
            r18 = r8
            r7 = r82
            boolean r19 = r6.e(r7)
            if (r19 == 0) goto L_0x00a6
            r19 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a2:
            r18 = r8
            r7 = r82
        L_0x00a6:
            r19 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r14 = r14 | r19
            goto L_0x00af
        L_0x00ab:
            r18 = r8
            r7 = r82
        L_0x00af:
            r19 = 458752(0x70000, float:6.42848E-40)
            r19 = r11 & r19
            if (r19 != 0) goto L_0x00c9
            r19 = r12 & 32
            r3 = r84
            if (r19 != 0) goto L_0x00c4
            boolean r20 = r6.e(r3)
            if (r20 == 0) goto L_0x00c4
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c6
        L_0x00c4:
            r20 = 65536(0x10000, float:9.18355E-41)
        L_0x00c6:
            r14 = r14 | r20
            goto L_0x00cb
        L_0x00c9:
            r3 = r84
        L_0x00cb:
            r20 = r12 & 64
            r22 = 3670016(0x380000, float:5.142788E-39)
            if (r20 == 0) goto L_0x00d8
            r23 = 1572864(0x180000, float:2.204052E-39)
            r14 = r14 | r23
            r10 = r86
            goto L_0x00eb
        L_0x00d8:
            r23 = r11 & r22
            r10 = r86
            if (r23 != 0) goto L_0x00eb
            boolean r24 = r6.C(r10)
            if (r24 == 0) goto L_0x00e7
            r24 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e9
        L_0x00e7:
            r24 = 524288(0x80000, float:7.34684E-40)
        L_0x00e9:
            r14 = r14 | r24
        L_0x00eb:
            r1 = r1 & r12
            if (r1 == 0) goto L_0x00f5
            r24 = 12582912(0xc00000, float:1.7632415E-38)
            r14 = r14 | r24
            r5 = r87
            goto L_0x010a
        L_0x00f5:
            r24 = 29360128(0x1c00000, float:7.052966E-38)
            r24 = r11 & r24
            r5 = r87
            if (r24 != 0) goto L_0x010a
            boolean r25 = r6.C(r5)
            if (r25 == 0) goto L_0x0106
            r25 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0108
        L_0x0106:
            r25 = 4194304(0x400000, float:5.877472E-39)
        L_0x0108:
            r14 = r14 | r25
        L_0x010a:
            r25 = 23967451(0x16db6db, float:4.3661218E-38)
            r0 = r14 & r25
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 != r2) goto L_0x0129
            boolean r0 = r6.i()
            if (r0 != 0) goto L_0x011b
            goto L_0x0129
        L_0x011b:
            r6.I()
            r2 = r79
            r1 = r13
            r12 = r3
            r4 = r9
            r9 = r10
            r3 = r80
        L_0x0126:
            r10 = r5
            goto L_0x057a
        L_0x0129:
            r6.D()
            r0 = 1
            r2 = r11 & 1
            r25 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto L_0x0157
            boolean r2 = r6.L()
            if (r2 == 0) goto L_0x013b
            goto L_0x0157
        L_0x013b:
            r6.I()
            r1 = 16
            r2 = r12 & 16
            if (r2 == 0) goto L_0x0146
            r14 = r14 & r25
        L_0x0146:
            r1 = 32
            r1 = r1 & r12
            if (r1 == 0) goto L_0x014f
            r1 = -458753(0xfffffffffff8ffff, float:NaN)
            r14 = r14 & r1
        L_0x014f:
            r2 = r79
            r1 = r80
            r0 = r13
            r70 = r14
            goto L_0x01af
        L_0x0157:
            if (r18 == 0) goto L_0x015c
            k0.i$a r2 = k0.i.f23074a
            r13 = r2
        L_0x015c:
            if (r15 == 0) goto L_0x0160
            r2 = 0
            goto L_0x0162
        L_0x0160:
            r2 = r79
        L_0x0162:
            if (r16 == 0) goto L_0x0166
            r15 = 0
            goto L_0x0168
        L_0x0166:
            r15 = r80
        L_0x0168:
            if (r17 == 0) goto L_0x0170
            k0.c$a r9 = k0.c.f23044a
            k0.c$b r9 = r9.k()
        L_0x0170:
            r16 = 16
            r17 = r12 & 16
            if (r17 == 0) goto L_0x0189
            io.intercom.android.sdk.ui.theme.IntercomTheme r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            r8 = 6
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r7.getColors(r6, r8)
            long r16 = r7.m691getHeader0d7_KjU()
            r14 = r14 & r25
            r0 = r8
            r7 = r16
        L_0x0186:
            r16 = 32
            goto L_0x018b
        L_0x0189:
            r0 = 6
            goto L_0x0186
        L_0x018b:
            r16 = r12 & 32
            if (r16 == 0) goto L_0x019e
            io.intercom.android.sdk.ui.theme.IntercomTheme r3 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            io.intercom.android.sdk.ui.theme.IntercomColors r3 = r3.getColors(r6, r0)
            long r3 = r3.m697getOnHeader0d7_KjU()
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r0 = r0 & r14
            r14 = r0
        L_0x019e:
            if (r20 == 0) goto L_0x01a6
            io.intercom.android.sdk.ui.component.q r0 = new io.intercom.android.sdk.ui.component.q
            r0.<init>()
            r10 = r0
        L_0x01a6:
            r0 = r13
            r70 = r14
            if (r1 == 0) goto L_0x01ae
            r1 = r15
            r5 = 0
            goto L_0x01af
        L_0x01ae:
            r1 = r15
        L_0x01af:
            r6.v()
            k0.i$a r13 = k0.i.f23074a
            C.c r71 = C.C1085c.f882a
            C.c$m r14 = r71.g()
            k0.c$a r72 = k0.c.f23044a
            k0.c$b r15 = r72.k()
            r11 = 0
            H0.F r14 = C.C1090h.a(r14, r15, r6, r11)
            int r15 = Y.C1494j.a(r6, r11)
            Y.y r11 = r6.p()
            k0.i r12 = k0.h.e(r6, r13)
            J0.g$a r73 = J0.C1241g.f3853J
            r74 = r5
            yf.a r5 = r73.a()
            Y.f r16 = r6.j()
            if (r16 != 0) goto L_0x01e2
            Y.C1494j.c()
        L_0x01e2:
            r6.F()
            boolean r16 = r6.f()
            if (r16 == 0) goto L_0x01ef
            r6.U(r5)
            goto L_0x01f2
        L_0x01ef:
            r6.q()
        L_0x01f2:
            Y.m r5 = Y.F1.a(r6)
            r75 = r3
            yf.p r3 = r73.c()
            Y.F1.b(r5, r14, r3)
            yf.p r3 = r73.e()
            Y.F1.b(r5, r11, r3)
            yf.p r3 = r73.b()
            boolean r4 = r5.f()
            if (r4 != 0) goto L_0x021e
            java.lang.Object r4 = r5.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r11)
            if (r4 != 0) goto L_0x022c
        L_0x021e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5.r(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r5.V(r4, r3)
        L_0x022c:
            yf.p r3 = r73.d()
            Y.F1.b(r5, r12, r3)
            C.k r3 = C.C1093k.f978a
            r3 = 2
            r4 = 0
            r5 = 0
            r78 = r0
            r79 = r7
            r81 = r5
            r82 = r3
            r83 = r4
            k0.i r3 = androidx.compose.foundation.b.d(r78, r79, r81, r82, r83)
            k0.i r3 = C.j0.e(r3)
            r4 = 0
            r5 = 1
            r11 = 0
            k0.i r3 = androidx.compose.foundation.layout.q.h(r3, r4, r5, r11)
            r5 = 56
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            k0.i r3 = androidx.compose.foundation.layout.q.i(r3, r5)
            r5 = 4
            float r5 = (float) r5
            float r5 = c1.h.j(r5)
            r12 = 2
            k0.i r3 = androidx.compose.foundation.layout.n.k(r3, r5, r4, r12, r11)
            r5 = 86796077(0x52c672d, float:8.1063515E-36)
            r6.T(r5)
            r5 = r70 & r22
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != r11) goto L_0x0275
            r5 = 1
            goto L_0x0276
        L_0x0275:
            r5 = 0
        L_0x0276:
            java.lang.Object r11 = r6.A()
            if (r5 != 0) goto L_0x0284
            Y.m$a r5 = Y.C1500m.f10026a
            java.lang.Object r5 = r5.a()
            if (r11 != r5) goto L_0x028c
        L_0x0284:
            io.intercom.android.sdk.ui.component.r r11 = new io.intercom.android.sdk.ui.component.r
            r11.<init>(r10)
            r6.r(r11)
        L_0x028c:
            r5 = r11
            yf.a r5 = (yf.C6787a) r5
            r6.M()
            r11 = 7
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r78 = r3
            r79 = r14
            r80 = r15
            r81 = r16
            r82 = r5
            r83 = r11
            r84 = r12
            k0.i r3 = androidx.compose.foundation.d.d(r78, r79, r80, r81, r82, r83, r84)
            k0.c r5 = r72.o()
            r11 = 0
            H0.F r5 = androidx.compose.foundation.layout.d.h(r5, r11)
            int r12 = Y.C1494j.a(r6, r11)
            Y.y r11 = r6.p()
            k0.i r3 = k0.h.e(r6, r3)
            yf.a r14 = r73.a()
            Y.f r15 = r6.j()
            if (r15 != 0) goto L_0x02cc
            Y.C1494j.c()
        L_0x02cc:
            r6.F()
            boolean r15 = r6.f()
            if (r15 == 0) goto L_0x02d9
            r6.U(r14)
            goto L_0x02dc
        L_0x02d9:
            r6.q()
        L_0x02dc:
            Y.m r14 = Y.F1.a(r6)
            yf.p r15 = r73.c()
            Y.F1.b(r14, r5, r15)
            yf.p r5 = r73.e()
            Y.F1.b(r14, r11, r5)
            yf.p r5 = r73.b()
            boolean r11 = r14.f()
            if (r11 != 0) goto L_0x0306
            java.lang.Object r11 = r14.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r15)
            if (r11 != 0) goto L_0x0314
        L_0x0306:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r14.r(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r14.V(r11, r5)
        L_0x0314:
            yf.p r5 = r73.d()
            Y.F1.b(r14, r3, r5)
            androidx.compose.foundation.layout.f r3 = androidx.compose.foundation.layout.f.f12848a
            if (r1 == 0) goto L_0x033d
            k0.c$b r5 = r72.g()
            boolean r5 = kotlin.jvm.internal.C6496s.c(r9, r5)
            if (r5 != 0) goto L_0x033d
            r5 = 48
            float r11 = (float) r5
            float r5 = c1.h.j(r11)
            r11 = 16
            float r12 = (float) r11
            float r12 = c1.h.j(r12)
            float r5 = r5 + r12
            float r5 = c1.h.j(r5)
            goto L_0x0344
        L_0x033d:
            r11 = 16
            float r5 = (float) r11
            float r5 = c1.h.j(r5)
        L_0x0344:
            float r11 = (float) r11
            float r11 = c1.h.j(r11)
            r12 = 1
            r14 = 0
            k0.i r15 = androidx.compose.foundation.layout.q.f(r13, r4, r12, r14)
            r12 = 10
            r14 = 0
            r16 = 0
            r17 = 0
            r78 = r15
            r79 = r5
            r80 = r16
            r81 = r11
            r82 = r17
            r83 = r12
            r84 = r14
            k0.i r5 = androidx.compose.foundation.layout.n.m(r78, r79, r80, r81, r82, r83, r84)
            C.c$f r11 = r71.b()
            r12 = 3
            int r14 = r70 >> 3
            r15 = r14 & 896(0x380, float:1.256E-42)
            r16 = 48
            r15 = r15 | 48
            int r15 = r15 >> r12
            r12 = r15 & 112(0x70, float:1.57E-43)
            r15 = 6
            r12 = r12 | r15
            H0.F r11 = C.C1090h.a(r11, r9, r6, r12)
            r12 = 0
            int r15 = Y.C1494j.a(r6, r12)
            Y.y r12 = r6.p()
            k0.i r5 = k0.h.e(r6, r5)
            yf.a r4 = r73.a()
            Y.f r16 = r6.j()
            if (r16 != 0) goto L_0x0398
            Y.C1494j.c()
        L_0x0398:
            r6.F()
            boolean r16 = r6.f()
            if (r16 == 0) goto L_0x03a5
            r6.U(r4)
            goto L_0x03a8
        L_0x03a5:
            r6.q()
        L_0x03a8:
            Y.m r4 = Y.F1.a(r6)
            r77 = r0
            yf.p r0 = r73.c()
            Y.F1.b(r4, r11, r0)
            yf.p r0 = r73.e()
            Y.F1.b(r4, r12, r0)
            yf.p r0 = r73.b()
            boolean r11 = r4.f()
            if (r11 != 0) goto L_0x03d4
            java.lang.Object r11 = r4.A()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            boolean r11 = kotlin.jvm.internal.C6496s.c(r11, r12)
            if (r11 != 0) goto L_0x03e2
        L_0x03d4:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r4.r(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r4.V(r11, r0)
        L_0x03e2:
            yf.p r0 = r73.d()
            Y.F1.b(r4, r5, r0)
            r0 = 560412879(0x216738cf, float:7.834103E-19)
            r6.T(r0)
            if (r2 == 0) goto L_0x0465
            b1.t$a r0 = b1.t.f19154a
            int r28 = r0.b()
            io.intercom.android.sdk.ui.theme.IntercomTheme r0 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            r4 = 6
            io.intercom.android.sdk.ui.theme.IntercomTypography r0 = r0.getTypography(r6, r4)
            Q0.T r38 = r0.getType03()
            r68 = 16777214(0xfffffe, float:2.3509884E-38)
            r69 = 0
            r41 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r55 = 0
            r56 = 0
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
            r39 = r75
            Q0.T r33 = Q0.T.c(r38, r39, r41, r43, r44, r45, r46, r47, r48, r50, r51, r52, r53, r55, r56, r57, r58, r59, r60, r62, r63, r64, r65, r66, r67, r68, r69)
            r35 = r14 & 14
            r36 = 3120(0xc30, float:4.372E-42)
            r37 = 55294(0xd7fe, float:7.7483E-41)
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r29 = 0
            r30 = 1
            r31 = 0
            r32 = 0
            r0 = r13
            r13 = r2
            r34 = r6
            V.T0.b(r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0466
        L_0x0465:
            r0 = r13
        L_0x0466:
            r6.M()
            r6.u()
            r4 = -1319827237(0xffffffffb15508db, float:-3.1000613E-9)
            r6.T(r4)
            if (r1 == 0) goto L_0x04b2
            k0.c r4 = r72.h()
            k0.i r4 = r3.e(r0, r4)
            yf.a r5 = r1.getOnClick()
            io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2 r11 = new io.intercom.android.sdk.ui.component.IntercomTopBarKt$IntercomTopBar$2$2$2
            r12 = r75
            r11.<init>(r1, r12)
            r14 = 54
            r15 = -1057882757(0xffffffffc0f1fd7b, float:-7.5621924)
            r16 = r1
            r1 = 1
            g0.a r11 = g0.c.e(r15, r1, r11, r6, r14)
            r1 = 196608(0x30000, float:2.75506E-40)
            r14 = 28
            r15 = 0
            r17 = 0
            r18 = 0
            r78 = r5
            r79 = r4
            r80 = r15
            r81 = r17
            r82 = r18
            r83 = r11
            r84 = r6
            r85 = r1
            r86 = r14
            V.U.b(r78, r79, r80, r81, r82, r83, r84, r85, r86)
            goto L_0x04b6
        L_0x04b2:
            r16 = r1
            r12 = r75
        L_0x04b6:
            r6.M()
            r1 = -1319809649(0xffffffffb1554d8f, float:-3.1039666E-9)
            r6.T(r1)
            if (r74 == 0) goto L_0x0561
            r1 = 1
            r4 = 0
            r5 = 0
            k0.i r0 = androidx.compose.foundation.layout.q.d(r0, r5, r1, r4)
            r1 = 0
            r5 = 3
            k0.i r0 = androidx.compose.foundation.layout.q.z(r0, r4, r1, r5, r4)
            k0.c r4 = r72.f()
            k0.i r0 = r3.e(r0, r4)
            k0.c$c r3 = r72.i()
            C.c$e r4 = r71.f()
            r5 = 48
            H0.F r3 = C.W.b(r4, r3, r6, r5)
            int r4 = Y.C1494j.a(r6, r1)
            Y.y r1 = r6.p()
            k0.i r0 = k0.h.e(r6, r0)
            yf.a r5 = r73.a()
            Y.f r11 = r6.j()
            if (r11 != 0) goto L_0x04fd
            Y.C1494j.c()
        L_0x04fd:
            r6.F()
            boolean r11 = r6.f()
            if (r11 == 0) goto L_0x050a
            r6.U(r5)
            goto L_0x050d
        L_0x050a:
            r6.q()
        L_0x050d:
            Y.m r5 = Y.F1.a(r6)
            yf.p r11 = r73.c()
            Y.F1.b(r5, r3, r11)
            yf.p r3 = r73.e()
            Y.F1.b(r5, r1, r3)
            yf.p r1 = r73.b()
            boolean r3 = r5.f()
            if (r3 != 0) goto L_0x0537
            java.lang.Object r3 = r5.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r11)
            if (r3 != 0) goto L_0x0545
        L_0x0537:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5.r(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5.V(r3, r1)
        L_0x0545:
            yf.p r1 = r73.d()
            Y.F1.b(r5, r0, r1)
            C.Z r0 = C.Z.f873a
            int r1 = r70 >> 18
            r1 = r1 & 112(0x70, float:1.57E-43)
            r3 = 6
            r1 = r1 | r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = r74
            r5.invoke(r0, r6, r1)
            r6.u()
            goto L_0x0563
        L_0x0561:
            r5 = r74
        L_0x0563:
            r6.M()
            r6.u()
            r0 = 1
            r1 = 0
            r3 = 0
            io.intercom.android.sdk.ui.component.IntercomDividerKt.IntercomDivider(r1, r6, r3, r0)
            r6.u()
            r4 = r9
            r9 = r10
            r3 = r16
            r1 = r77
            goto L_0x0126
        L_0x057a:
            Y.Y0 r14 = r6.k()
            if (r14 == 0) goto L_0x058f
            io.intercom.android.sdk.ui.component.s r15 = new io.intercom.android.sdk.ui.component.s
            r0 = r15
            r5 = r7
            r7 = r12
            r11 = r89
            r12 = r90
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12)
            r14.a(r15)
        L_0x058f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.ui.component.IntercomTopBarKt.m602IntercomTopBarbogVsAg(k0.i, java.lang.String, io.intercom.android.sdk.ui.component.IntercomTopBarIcon, k0.c$b, long, long, yf.a, yf.q, Y.m, int, int):void");
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-358701081);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m571getLambda1$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new t(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomTopBarPreview$lambda$8(int i10, C1500m mVar, int i11) {
        IntercomTopBarPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithMenuItems(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2022840780);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m575getLambda5$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new u(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomTopBarPreviewWithMenuItems$lambda$10(int i10, C1500m mVar, int i11) {
        IntercomTopBarPreviewWithMenuItems(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void IntercomTopBarPreviewWithoutNavIcon(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-110907621);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m572getLambda2$intercom_sdk_ui_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new v(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomTopBarPreviewWithoutNavIcon$lambda$9(int i10, C1500m mVar, int i11) {
        IntercomTopBarPreviewWithoutNavIcon(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomTopBar_bogVsAg$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomTopBar_bogVsAg$lambda$6$lambda$2$lambda$1(C6787a aVar) {
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M IntercomTopBar_bogVsAg$lambda$7(i iVar, String str, IntercomTopBarIcon intercomTopBarIcon, c.b bVar, long j10, long j11, C6787a aVar, q qVar, int i10, int i11, C1500m mVar, int i12) {
        m602IntercomTopBarbogVsAg(iVar, str, intercomTopBarIcon, bVar, j10, j11, aVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
