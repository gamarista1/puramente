package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import V0.p;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.C2544x0;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a]\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"", "content", "Lk0/i;", "modifier", "Lr0/x0;", "strokeColor", "Lc1/h;", "strokeWidth", "backgroundColor", "LV0/p;", "fontWeight", "fontColor", "Lc1/v;", "fontSize", "Llf/M;", "NumericRatingCell-jWvj134", "(Ljava/lang/String;Lk0/i;JFJLV0/p;JJLY/m;II)V", "NumericRatingCell", "EmptyCell", "(LY/m;I)V", "FilledCell", "DarkFilledCell", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NumericRatingCellKt {
    private static final void DarkFilledCell(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(477358395);
        if (i11 != 0 || !h10.i()) {
            m504NumericRatingCelljWvj134("1", (i) null, 0, 0.0f, C2544x0.f25560b.a(), (p) null, 0, 0, h10, 24582, 238);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DarkFilledCell$lambda$4(int i10, C1500m mVar, int i11) {
        DarkFilledCell(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void EmptyCell(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(1361614452);
        if (i11 != 0 || !h10.i()) {
            m504NumericRatingCelljWvj134("1", (i) null, 0, 0.0f, 0, (p) null, 0, 0, h10, 6, 254);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new i(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M EmptyCell$lambda$2(int i10, C1500m mVar, int i11) {
        EmptyCell(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    private static final void FilledCell(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(1860651045);
        if (i11 != 0 || !h10.i()) {
            m504NumericRatingCelljWvj134("1", (i) null, 0, 0.0f, C2544x0.f25560b.j(), (p) null, 0, 0, h10, 24582, 238);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M FilledCell$lambda$3(int i10, C1500m mVar, int i11) {
        FilledCell(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110  */
    /* renamed from: NumericRatingCell-jWvj134  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m504NumericRatingCelljWvj134(java.lang.String r38, k0.i r39, long r40, float r42, long r43, V0.p r45, long r46, long r48, Y.C1500m r50, int r51, int r52) {
        /*
            r7 = r38
            r4 = r51
            r5 = r52
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            r0 = -881315304(0xffffffffcb783218, float:-1.6265752E7)
            r1 = r50
            Y.m r2 = r1.h(r0)
            r0 = r5 & 1
            if (r0 == 0) goto L_0x001b
            r0 = r4 | 6
            goto L_0x002b
        L_0x001b:
            r0 = r4 & 14
            if (r0 != 0) goto L_0x002a
            boolean r0 = r2.S(r7)
            if (r0 == 0) goto L_0x0027
            r0 = 4
            goto L_0x0028
        L_0x0027:
            r0 = 2
        L_0x0028:
            r0 = r0 | r4
            goto L_0x002b
        L_0x002a:
            r0 = r4
        L_0x002b:
            r1 = r5 & 2
            if (r1 == 0) goto L_0x0034
            r0 = r0 | 48
        L_0x0031:
            r3 = r39
            goto L_0x0046
        L_0x0034:
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0031
            r3 = r39
            boolean r6 = r2.S(r3)
            if (r6 == 0) goto L_0x0043
            r6 = 32
            goto L_0x0045
        L_0x0043:
            r6 = 16
        L_0x0045:
            r0 = r0 | r6
        L_0x0046:
            r6 = r5 & 4
            if (r6 == 0) goto L_0x004f
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r8 = r40
            goto L_0x0061
        L_0x004f:
            r8 = r4 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x004c
            r8 = r40
            boolean r10 = r2.e(r8)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r0 = r0 | r10
        L_0x0061:
            r10 = r5 & 8
            if (r10 == 0) goto L_0x006a
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r42
            goto L_0x007c
        L_0x006a:
            r11 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r11 != 0) goto L_0x0067
            r11 = r42
            boolean r12 = r2.c(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r0 = r0 | r12
        L_0x007c:
            r12 = r5 & 16
            if (r12 == 0) goto L_0x0085
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r43
            goto L_0x0099
        L_0x0085:
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r13 & r4
            if (r13 != 0) goto L_0x0082
            r13 = r43
            boolean r15 = r2.e(r13)
            if (r15 == 0) goto L_0x0096
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r0 = r0 | r15
        L_0x0099:
            r15 = r5 & 32
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r15 == 0) goto L_0x00a6
            r17 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r17
            r3 = r45
            goto L_0x00b9
        L_0x00a6:
            r17 = r4 & r16
            r3 = r45
            if (r17 != 0) goto L_0x00b9
            boolean r17 = r2.S(r3)
            if (r17 == 0) goto L_0x00b5
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b7
        L_0x00b5:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b7:
            r0 = r0 | r17
        L_0x00b9:
            r17 = 3670016(0x380000, float:5.142788E-39)
            r17 = r4 & r17
            if (r17 != 0) goto L_0x00d2
            r17 = r5 & 64
            r7 = r46
            if (r17 != 0) goto L_0x00ce
            boolean r9 = r2.e(r7)
            if (r9 == 0) goto L_0x00ce
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d0
        L_0x00ce:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x00d0:
            r0 = r0 | r9
            goto L_0x00d4
        L_0x00d2:
            r7 = r46
        L_0x00d4:
            r9 = 29360128(0x1c00000, float:7.052966E-38)
            r9 = r9 & r4
            if (r9 != 0) goto L_0x00ec
            r9 = r5 & 128(0x80, float:1.794E-43)
            r7 = r48
            if (r9 != 0) goto L_0x00e8
            boolean r9 = r2.e(r7)
            if (r9 == 0) goto L_0x00e8
            r9 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r9 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r0 = r0 | r9
            goto L_0x00ee
        L_0x00ec:
            r7 = r48
        L_0x00ee:
            r9 = 23967451(0x16db6db, float:4.3661218E-38)
            r9 = r9 & r0
            r3 = 4793490(0x492492, float:6.71711E-39)
            if (r9 != r3) goto L_0x0110
            boolean r3 = r2.i()
            if (r3 != 0) goto L_0x00fe
            goto L_0x0110
        L_0x00fe:
            r2.I()
            r3 = r40
            r9 = r46
            r34 = r2
            r5 = r11
            r2 = r39
            r11 = r7
            r6 = r13
            r8 = r45
            goto L_0x02ac
        L_0x0110:
            r2.D()
            r3 = r4 & 1
            r9 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r3 == 0) goto L_0x0141
            boolean r3 = r2.L()
            if (r3 == 0) goto L_0x0124
            goto L_0x0141
        L_0x0124:
            r2.I()
            r1 = r5 & 64
            if (r1 == 0) goto L_0x012d
            r0 = r0 & r17
        L_0x012d:
            r1 = r5 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0132
            r0 = r0 & r9
        L_0x0132:
            r27 = r45
            r28 = r46
            r30 = r7
            r3 = r11
            r25 = r13
            r7 = r39
            r13 = r40
            goto L_0x019f
        L_0x0141:
            if (r1 == 0) goto L_0x0146
            k0.i$a r1 = k0.i.f23074a
            goto L_0x0148
        L_0x0146:
            r1 = r39
        L_0x0148:
            if (r6 == 0) goto L_0x0151
            r0.x0$a r3 = r0.C2544x0.f25560b
            long r18 = r3.a()
            goto L_0x0153
        L_0x0151:
            r18 = r40
        L_0x0153:
            if (r10 == 0) goto L_0x015c
            r3 = 1
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            goto L_0x015d
        L_0x015c:
            r3 = r11
        L_0x015d:
            if (r12 == 0) goto L_0x0166
            r0.x0$a r6 = r0.C2544x0.f25560b
            long r10 = r6.i()
            goto L_0x0167
        L_0x0166:
            r10 = r13
        L_0x0167:
            if (r15 == 0) goto L_0x0170
            V0.p$a r6 = V0.p.f8210b
            V0.p r6 = r6.c()
            goto L_0x0172
        L_0x0170:
            r6 = r45
        L_0x0172:
            r12 = r5 & 64
            if (r12 == 0) goto L_0x017d
            long r12 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m712generateTextColor8_81llA(r10)
            r0 = r0 & r17
            goto L_0x017f
        L_0x017d:
            r12 = r46
        L_0x017f:
            r14 = r5 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0194
            io.intercom.android.sdk.ui.theme.IntercomTheme r7 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r8 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r7.getTypography(r2, r8)
            Q0.T r7 = r7.getType04()
            long r7 = r7.l()
            r0 = r0 & r9
        L_0x0194:
            r27 = r6
            r30 = r7
            r25 = r10
            r28 = r12
            r13 = r18
            r7 = r1
        L_0x019f:
            r2.v()
            io.intercom.android.sdk.ui.theme.IntercomTheme r1 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r6 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            V.B0 r1 = r1.getShapes(r2, r6)
            I.a r1 = r1.e()
            x.g r6 = x.C2869h.a(r3, r13)
            k0.i r6 = x.C2866e.e(r7, r6, r1)
            k0.i r1 = o0.C2342e.a(r6, r1)
            r6 = 2
            r8 = 0
            r9 = 0
            r39 = r1
            r40 = r25
            r42 = r9
            r43 = r6
            r44 = r8
            k0.i r1 = androidx.compose.foundation.b.d(r39, r40, r42, r43, r44)
            r6 = 44
            float r6 = (float) r6
            float r8 = c1.h.j(r6)
            k0.i r1 = androidx.compose.foundation.layout.q.r(r1, r8)
            float r6 = c1.h.j(r6)
            k0.i r1 = androidx.compose.foundation.layout.q.i(r1, r6)
            k0.c$a r6 = k0.c.f23044a
            k0.c r8 = r6.o()
            r9 = 0
            H0.F r8 = androidx.compose.foundation.layout.d.h(r8, r9)
            int r9 = Y.C1494j.a(r2, r9)
            Y.y r10 = r2.p()
            k0.i r1 = k0.h.e(r2, r1)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r12 = r11.a()
            Y.f r15 = r2.j()
            if (r15 != 0) goto L_0x0204
            Y.C1494j.c()
        L_0x0204:
            r2.F()
            boolean r15 = r2.f()
            if (r15 == 0) goto L_0x0211
            r2.U(r12)
            goto L_0x0214
        L_0x0211:
            r2.q()
        L_0x0214:
            Y.m r12 = Y.F1.a(r2)
            yf.p r15 = r11.c()
            Y.F1.b(r12, r8, r15)
            yf.p r8 = r11.e()
            Y.F1.b(r12, r10, r8)
            yf.p r8 = r11.b()
            boolean r10 = r12.f()
            if (r10 != 0) goto L_0x023e
            java.lang.Object r10 = r12.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r15)
            if (r10 != 0) goto L_0x024c
        L_0x023e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.r(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.V(r9, r8)
        L_0x024c:
            yf.p r8 = r11.d()
            Y.F1.b(r12, r1, r8)
            androidx.compose.foundation.layout.f r1 = androidx.compose.foundation.layout.f.f12848a
            k0.i$a r8 = k0.i.f23074a
            k0.c r6 = r6.e()
            k0.i r1 = r1.e(r8, r6)
            r6 = r0 & 14
            int r8 = r0 >> 12
            r9 = r8 & 896(0x380, float:1.256E-42)
            r6 = r6 | r9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 | r8
            r0 = r0 & r16
            r22 = r6 | r0
            r23 = 0
            r24 = 131024(0x1ffd0, float:1.83604E-40)
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r32 = r13
            r13 = r15
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r0 = r38
            r34 = r2
            r35 = r3
            r2 = r28
            r4 = r30
            r36 = r7
            r7 = r27
            r21 = r34
            V.T0.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r34.u()
            r6 = r25
            r8 = r27
            r9 = r28
            r11 = r30
            r3 = r32
            r5 = r35
            r2 = r36
        L_0x02ac:
            Y.Y0 r15 = r34.k()
            if (r15 == 0) goto L_0x02c5
            io.intercom.android.sdk.survey.ui.questiontype.numericscale.h r14 = new io.intercom.android.sdk.survey.ui.questiontype.numericscale.h
            r0 = r14
            r1 = r38
            r13 = r51
            r37 = r14
            r14 = r52
            r0.<init>(r1, r2, r3, r5, r6, r8, r9, r11, r13, r14)
            r0 = r37
            r15.a(r0)
        L_0x02c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.numericscale.NumericRatingCellKt.m504NumericRatingCelljWvj134(java.lang.String, k0.i, long, float, long, V0.p, long, long, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M NumericRatingCell_jWvj134$lambda$1(String str, i iVar, long j10, float f10, long j11, p pVar, long j12, long j13, int i10, int i11, C1500m mVar, int i12) {
        String str2 = str;
        C6496s.h(str2, "$content");
        m504NumericRatingCelljWvj134(str2, iVar, j10, f10, j11, pVar, j12, j13, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
