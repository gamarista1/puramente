package io.intercom.android.sdk.survey.ui.questiontype.choice;

import V.B0;
import V0.p;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001ag\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0013\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"", "selected", "Lkotlin/Function1;", "", "Llf/M;", "onClicked", "text", "Lr0/x0;", "strokeColor", "Lc1/h;", "strokeWidth", "backgroundColor", "LV0/p;", "fontWeight", "fontColor", "ChoicePill-UdaoDFU", "(ZLyf/l;Ljava/lang/String;JFJLV0/p;JLY/m;II)V", "ChoicePill", "EmptyPill", "(LY/m;I)V", "SelectedPill", "SelectedPillDark", "SelectedPillLongText", "SelectedPillLongBigText", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChoicePillKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: yf.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0115  */
    /* renamed from: ChoicePill-UdaoDFU  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m475ChoicePillUdaoDFU(boolean r39, yf.C6798l r40, java.lang.String r41, long r42, float r44, long r45, V0.p r47, long r48, Y.C1500m r50, int r51, int r52) {
        /*
            r1 = r39
            r0 = r41
            r9 = r51
            r4 = r52
            java.lang.String r2 = "text"
            kotlin.jvm.internal.C6496s.h(r0, r2)
            r2 = 418926179(0x18f84e63, float:6.4185648E-24)
            r3 = r50
            Y.m r5 = r3.h(r2)
            r2 = r4 & 1
            if (r2 == 0) goto L_0x001d
            r2 = r9 | 6
            goto L_0x002d
        L_0x001d:
            r2 = r9 & 14
            if (r2 != 0) goto L_0x002c
            boolean r2 = r5.b(r1)
            if (r2 == 0) goto L_0x0029
            r2 = 4
            goto L_0x002a
        L_0x0029:
            r2 = 2
        L_0x002a:
            r2 = r2 | r9
            goto L_0x002d
        L_0x002c:
            r2 = r9
        L_0x002d:
            r3 = r4 & 2
            if (r3 == 0) goto L_0x0036
            r2 = r2 | 48
        L_0x0033:
            r8 = r40
            goto L_0x0048
        L_0x0036:
            r8 = r9 & 112(0x70, float:1.57E-43)
            if (r8 != 0) goto L_0x0033
            r8 = r40
            boolean r10 = r5.C(r8)
            if (r10 == 0) goto L_0x0045
            r10 = 32
            goto L_0x0047
        L_0x0045:
            r10 = 16
        L_0x0047:
            r2 = r2 | r10
        L_0x0048:
            r10 = r4 & 4
            if (r10 == 0) goto L_0x004f
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x005f
        L_0x004f:
            r10 = r9 & 896(0x380, float:1.256E-42)
            if (r10 != 0) goto L_0x005f
            boolean r10 = r5.S(r0)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r2 = r2 | r10
        L_0x005f:
            r10 = r4 & 8
            if (r10 == 0) goto L_0x0068
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r12 = r42
            goto L_0x007a
        L_0x0068:
            r12 = r9 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != 0) goto L_0x0065
            r12 = r42
            boolean r14 = r5.e(r12)
            if (r14 == 0) goto L_0x0077
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r2 = r2 | r14
        L_0x007a:
            r14 = r4 & 16
            if (r14 == 0) goto L_0x0083
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r15 = r44
            goto L_0x0098
        L_0x0083:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r9
            if (r15 != 0) goto L_0x0080
            r15 = r44
            boolean r16 = r5.c(r15)
            if (r16 == 0) goto L_0x0094
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r2 = r2 | r16
        L_0x0098:
            r16 = r4 & 32
            r17 = 458752(0x70000, float:6.42848E-40)
            if (r16 == 0) goto L_0x00a5
            r18 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 | r18
            r11 = r45
            goto L_0x00b7
        L_0x00a5:
            r18 = r9 & r17
            r11 = r45
            if (r18 != 0) goto L_0x00b7
            boolean r13 = r5.e(r11)
            if (r13 == 0) goto L_0x00b4
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r2 = r2 | r13
        L_0x00b7:
            r13 = r4 & 64
            if (r13 == 0) goto L_0x00c2
            r18 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r18
            r6 = r47
            goto L_0x00d7
        L_0x00c2:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r9 & r18
            r6 = r47
            if (r18 != 0) goto L_0x00d7
            boolean r19 = r5.S(r6)
            if (r19 == 0) goto L_0x00d3
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d5
        L_0x00d3:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00d5:
            r2 = r2 | r19
        L_0x00d7:
            r19 = 29360128(0x1c00000, float:7.052966E-38)
            r19 = r9 & r19
            if (r19 != 0) goto L_0x00f3
            r7 = r4 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x00ec
            r6 = r48
            boolean r20 = r5.e(r6)
            if (r20 == 0) goto L_0x00ee
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f0
        L_0x00ec:
            r6 = r48
        L_0x00ee:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f0:
            r2 = r2 | r20
            goto L_0x00f5
        L_0x00f3:
            r6 = r48
        L_0x00f5:
            r20 = 23967451(0x16db6db, float:4.3661218E-38)
            r6 = r2 & r20
            r7 = 4793490(0x492492, float:6.71711E-39)
            if (r6 != r7) goto L_0x0115
            boolean r6 = r5.i()
            if (r6 != 0) goto L_0x0106
            goto L_0x0115
        L_0x0106:
            r5.I()
            r9 = r47
            r3 = r5
            r2 = r8
            r7 = r11
            r6 = r15
            r4 = r42
            r10 = r48
            goto L_0x034b
        L_0x0115:
            r5.D()
            r6 = r9 & 1
            r7 = 1
            if (r6 == 0) goto L_0x013c
            boolean r6 = r5.L()
            if (r6 == 0) goto L_0x0124
            goto L_0x013c
        L_0x0124:
            r5.I()
            r3 = r4 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x012f
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r2 = r2 & r3
        L_0x012f:
            r29 = r47
            r30 = r48
            r27 = r11
            r13 = r15
            r14 = r42
            r11 = r2
            r2 = r8
            goto L_0x0191
        L_0x013c:
            if (r3 == 0) goto L_0x0144
            io.intercom.android.sdk.survey.ui.questiontype.choice.c r3 = new io.intercom.android.sdk.survey.ui.questiontype.choice.c
            r3.<init>()
            goto L_0x0145
        L_0x0144:
            r3 = r8
        L_0x0145:
            if (r10 == 0) goto L_0x014e
            r0.x0$a r6 = r0.C2544x0.f25560b
            long r21 = r6.a()
            goto L_0x0150
        L_0x014e:
            r21 = r42
        L_0x0150:
            if (r14 == 0) goto L_0x0158
            float r6 = (float) r7
            float r6 = c1.h.j(r6)
            goto L_0x0159
        L_0x0158:
            r6 = r15
        L_0x0159:
            if (r16 == 0) goto L_0x0162
            r0.x0$a r8 = r0.C2544x0.f25560b
            long r10 = r8.i()
            goto L_0x0163
        L_0x0162:
            r10 = r11
        L_0x0163:
            if (r13 == 0) goto L_0x016c
            V0.p$a r8 = V0.p.f8210b
            V0.p r8 = r8.c()
            goto L_0x016e
        L_0x016c:
            r8 = r47
        L_0x016e:
            r12 = r4 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x0186
            long r12 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m712generateTextColor8_81llA(r10)
            r14 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r2 = r2 & r14
            r29 = r8
            r27 = r10
            r30 = r12
            r14 = r21
            r11 = r2
            r2 = r3
            r13 = r6
            goto L_0x0191
        L_0x0186:
            r30 = r48
            r13 = r6
            r29 = r8
            r27 = r10
            r14 = r21
            r11 = r2
            r2 = r3
        L_0x0191:
            r5.v()
            io.intercom.android.sdk.ui.theme.IntercomTheme r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            V.B0 r3 = r6.getShapes(r5, r8)
            I.a r3 = r3.e()
            k0.i$a r12 = k0.i.f23074a
            r10 = 0
            r4 = 0
            k0.i r4 = androidx.compose.foundation.layout.q.h(r12, r10, r7, r4)
            x.g r10 = x.C2869h.a(r13, r14)
            k0.i r4 = x.C2866e.e(r4, r10, r3)
            k0.i r3 = o0.C2342e.a(r4, r3)
            r4 = 2
            r10 = 0
            r16 = 0
            r42 = r3
            r43 = r27
            r45 = r16
            r46 = r4
            r47 = r10
            k0.i r3 = androidx.compose.foundation.b.d(r42, r43, r45, r46, r47)
            r4 = -8584634(0xffffffffff7d0246, float:-3.3630649E38)
            r5.T(r4)
            r4 = r11 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r4 != r7) goto L_0x01d4
            r4 = 1
            goto L_0x01d5
        L_0x01d4:
            r4 = 0
        L_0x01d5:
            r7 = r11 & 896(0x380, float:1.256E-42)
            r10 = 256(0x100, float:3.59E-43)
            if (r7 != r10) goto L_0x01dd
            r7 = 1
            goto L_0x01de
        L_0x01dd:
            r7 = 0
        L_0x01de:
            r4 = r4 | r7
            java.lang.Object r7 = r5.A()
            if (r4 != 0) goto L_0x01ed
            Y.m$a r4 = Y.C1500m.f10026a
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x01f5
        L_0x01ed:
            io.intercom.android.sdk.survey.ui.questiontype.choice.d r7 = new io.intercom.android.sdk.survey.ui.questiontype.choice.d
            r7.<init>(r2, r0)
            r5.r(r7)
        L_0x01f5:
            r4 = r7
            yf.a r4 = (yf.C6787a) r4
            r5.M()
            r7 = 7
            r10 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r42 = r3
            r43 = r16
            r44 = r19
            r45 = r20
            r46 = r4
            r47 = r7
            r48 = r10
            k0.i r3 = androidx.compose.foundation.d.d(r42, r43, r44, r45, r46, r47, r48)
            r4 = 16
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            k0.i r3 = androidx.compose.foundation.layout.n.i(r3, r4)
            C.c r4 = C.C1085c.f882a
            C.c$f r4 = r4.d()
            k0.c$a r32 = k0.c.f23044a
            k0.c$c r7 = r32.l()
            r10 = 6
            H0.F r4 = C.W.b(r4, r7, r5, r10)
            r10 = 0
            int r7 = Y.C1494j.a(r5, r10)
            Y.y r10 = r5.p()
            k0.i r3 = k0.h.e(r5, r3)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r0 = r16.a()
            Y.f r18 = r5.j()
            if (r18 != 0) goto L_0x024d
            Y.C1494j.c()
        L_0x024d:
            r5.F()
            boolean r18 = r5.f()
            if (r18 == 0) goto L_0x025a
            r5.U(r0)
            goto L_0x025d
        L_0x025a:
            r5.q()
        L_0x025d:
            Y.m r0 = Y.F1.a(r5)
            r23 = r2
            yf.p r2 = r16.c()
            Y.F1.b(r0, r4, r2)
            yf.p r2 = r16.e()
            Y.F1.b(r0, r10, r2)
            yf.p r2 = r16.b()
            boolean r4 = r0.f()
            if (r4 != 0) goto L_0x0289
            java.lang.Object r4 = r0.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r10)
            if (r4 != 0) goto L_0x0297
        L_0x0289:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r0.r(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r0.V(r4, r2)
        L_0x0297:
            yf.p r2 = r16.d()
            Y.F1.b(r0, r3, r2)
            C.Z r0 = C.Z.f873a
            r2 = 1062836634(0x3f59999a, float:0.85)
            k0.i r2 = androidx.compose.foundation.layout.q.g(r12, r2)
            k0.c$c r3 = r32.i()
            k0.i r3 = r0.c(r2, r3)
            io.intercom.android.sdk.ui.theme.IntercomTypography r2 = r6.getTypography(r5, r8)
            Q0.T r22 = r2.getType04()
            int r2 = r11 >> 6
            r2 = r2 & 14
            int r4 = r11 >> 15
            r4 = r4 & 896(0x380, float:1.256E-42)
            r2 = r2 | r4
            int r4 = r11 >> 3
            r4 = r4 & r17
            r24 = r2 | r4
            r25 = 0
            r26 = 65496(0xffd8, float:9.178E-41)
            r6 = 0
            r8 = 0
            r10 = 0
            r4 = 0
            r16 = 0
            r33 = r11
            r2 = r12
            r11 = r16
            r16 = 0
            r34 = r13
            r13 = r16
            r35 = r14
            r14 = r16
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r38 = r2
            r37 = r23
            r2 = r41
            r40 = r5
            r4 = r30
            r9 = r29
            r23 = r40
            V.T0.b(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r2 = 2120582664(0x7e658608, float:7.6272285E37)
            r3 = r40
            r3.T(r2)
            if (r1 == 0) goto L_0x0339
            Q.b r2 = Q.b.f5154a
            Q.b$a r2 = r2.a()
            x0.d r2 = S.c.a(r2)
            int r4 = k0.n.f23136g
            r5 = 0
            java.lang.String r4 = M0.i.a(r4, r3, r5)
            k0.c$c r5 = r32.i()
            r6 = r38
            k0.i r0 = r0.c(r6, r5)
            int r5 = r33 >> 12
            r5 = r5 & 7168(0x1c00, float:1.0045E-41)
            r6 = 0
            r42 = r2
            r43 = r4
            r44 = r0
            r45 = r30
            r47 = r3
            r48 = r5
            r49 = r6
            V.V.b(r42, r43, r44, r45, r47, r48, r49)
        L_0x0339:
            r3.M()
            r3.u()
            r7 = r27
            r9 = r29
            r10 = r30
            r6 = r34
            r4 = r35
            r2 = r37
        L_0x034b:
            Y.Y0 r14 = r3.k()
            if (r14 == 0) goto L_0x0362
            io.intercom.android.sdk.survey.ui.questiontype.choice.e r15 = new io.intercom.android.sdk.survey.ui.questiontype.choice.e
            r0 = r15
            r1 = r39
            r3 = r41
            r12 = r51
            r13 = r52
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r12, r13)
            r14.a(r15)
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt.m475ChoicePillUdaoDFU(boolean, yf.l, java.lang.String, long, float, long, V0.p, long, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M ChoicePill_UdaoDFU$lambda$0(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ChoicePill_UdaoDFU$lambda$2$lambda$1(C6798l lVar, String str) {
        C6496s.h(str, "$text");
        lVar.invoke(str);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ChoicePill_UdaoDFU$lambda$4(boolean z10, C6798l lVar, String str, long j10, float f10, long j11, p pVar, long j12, int i10, int i11, C1500m mVar, int i12) {
        String str2 = str;
        C6496s.h(str2, "$text");
        m475ChoicePillUdaoDFU(z10, lVar, str2, j10, f10, j11, pVar, j12, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    private static final void EmptyPill(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1274080153);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ChoicePillKt.INSTANCE.m476getLambda1$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6298a(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyPill$lambda$5(int i10, C1500m mVar, int i11) {
        EmptyPill(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void SelectedPill(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1118291055);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ChoicePillKt.INSTANCE.m477getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new h(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SelectedPill$lambda$6(int i10, C1500m mVar, int i11) {
        SelectedPill(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void SelectedPillDark(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-774877671);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ChoicePillKt.INSTANCE.m478getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6299b(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SelectedPillDark$lambda$7(int i10, C1500m mVar, int i11) {
        SelectedPillDark(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void SelectedPillLongBigText(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1982481602);
        if (i10 != 0 || !h10.i()) {
            SelectedPillLongText(h10, 0);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SelectedPillLongBigText$lambda$9(int i10, C1500m mVar, int i11) {
        SelectedPillLongBigText(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void SelectedPillLongText(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(173524454);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$ChoicePillKt.INSTANCE.m479getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SelectedPillLongText$lambda$8(int i10, C1500m mVar, int i11) {
        SelectedPillLongText(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
