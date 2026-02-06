package io.intercom.android.sdk.survey.ui.questiontype.choice;

import V.O0;
import V0.p;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.n;
import c1.h;
import io.intercom.android.sdk.survey.SurveyUiColors;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import r0.g2;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a{\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u000f\u0010\u0016\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "selected", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "surveyUiColors", "", "text", "Lkotlin/Function0;", "Llf/M;", "onClicked", "Lkotlin/Function1;", "onTextChanged", "Lr0/x0;", "strokeColor", "Lc1/h;", "strokeWidth", "backgroundColor", "LV0/p;", "fontWeight", "fontColor", "OtherOption-YCJL08c", "(ZLio/intercom/android/sdk/survey/SurveyUiColors;Ljava/lang/String;Lyf/a;Lyf/l;JFJLV0/p;JLY/m;II)V", "OtherOption", "OtherOptionPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class OtherOptionKt {
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x012c  */
    /* renamed from: OtherOption-YCJL08c  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m483OtherOptionYCJL08c(boolean r34, io.intercom.android.sdk.survey.SurveyUiColors r35, java.lang.String r36, yf.C6787a r37, yf.C6798l r38, long r39, float r41, long r42, V0.p r44, long r45, Y.C1500m r47, int r48, int r49) {
        /*
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r14 = r48
            r15 = r49
            java.lang.String r0 = "surveyUiColors"
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "onClicked"
            kotlin.jvm.internal.C6496s.h(r4, r0)
            java.lang.String r0 = "onTextChanged"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            r0 = -933969743(0xffffffffc854c0b1, float:-217858.77)
            r1 = r47
            Y.m r0 = r1.h(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0033
            r1 = r14 | 6
            r6 = r1
            r1 = r34
            goto L_0x0047
        L_0x0033:
            r1 = r14 & 14
            if (r1 != 0) goto L_0x0044
            r1 = r34
            boolean r6 = r0.b(r1)
            if (r6 == 0) goto L_0x0041
            r6 = 4
            goto L_0x0042
        L_0x0041:
            r6 = 2
        L_0x0042:
            r6 = r6 | r14
            goto L_0x0047
        L_0x0044:
            r1 = r34
            r6 = r14
        L_0x0047:
            r7 = r15 & 2
            if (r7 == 0) goto L_0x004e
            r6 = r6 | 48
            goto L_0x005e
        L_0x004e:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x005e
            boolean r7 = r0.S(r2)
            if (r7 == 0) goto L_0x005b
            r7 = 32
            goto L_0x005d
        L_0x005b:
            r7 = 16
        L_0x005d:
            r6 = r6 | r7
        L_0x005e:
            r7 = r15 & 4
            if (r7 == 0) goto L_0x0065
            r6 = r6 | 384(0x180, float:5.38E-43)
            goto L_0x0075
        L_0x0065:
            r7 = r14 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x0075
            boolean r7 = r0.S(r3)
            if (r7 == 0) goto L_0x0072
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0074
        L_0x0072:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0074:
            r6 = r6 | r7
        L_0x0075:
            r7 = r15 & 8
            if (r7 == 0) goto L_0x007c
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            goto L_0x008c
        L_0x007c:
            r7 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r7 != 0) goto L_0x008c
            boolean r7 = r0.C(r4)
            if (r7 == 0) goto L_0x0089
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x008b
        L_0x0089:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x008b:
            r6 = r6 | r7
        L_0x008c:
            r7 = r15 & 16
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r7 == 0) goto L_0x0096
            r6 = r6 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0096:
            r7 = r14 & r9
            if (r7 != 0) goto L_0x00a6
            boolean r7 = r0.C(r5)
            if (r7 == 0) goto L_0x00a3
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r6 = r6 | r7
        L_0x00a6:
            r7 = r15 & 32
            r10 = 458752(0x70000, float:6.42848E-40)
            if (r7 == 0) goto L_0x00b2
            r11 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 | r11
        L_0x00af:
            r11 = r39
            goto L_0x00c4
        L_0x00b2:
            r11 = r14 & r10
            if (r11 != 0) goto L_0x00af
            r11 = r39
            boolean r13 = r0.e(r11)
            if (r13 == 0) goto L_0x00c1
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r6 = r6 | r13
        L_0x00c4:
            r13 = r15 & 64
            r16 = 3670016(0x380000, float:5.142788E-39)
            if (r13 == 0) goto L_0x00d1
            r17 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 | r17
            r10 = r41
            goto L_0x00e4
        L_0x00d1:
            r17 = r14 & r16
            r10 = r41
            if (r17 != 0) goto L_0x00e4
            boolean r17 = r0.c(r10)
            if (r17 == 0) goto L_0x00e0
            r17 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e2
        L_0x00e0:
            r17 = 524288(0x80000, float:7.34684E-40)
        L_0x00e2:
            r6 = r6 | r17
        L_0x00e4:
            r9 = r15 & 128(0x80, float:1.794E-43)
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            if (r9 == 0) goto L_0x00f3
            r19 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r19
            r20 = r9
            r8 = r42
            goto L_0x0108
        L_0x00f3:
            r19 = r14 & r18
            r20 = r9
            r8 = r42
            if (r19 != 0) goto L_0x0108
            boolean r21 = r0.e(r8)
            if (r21 == 0) goto L_0x0104
            r21 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0106
        L_0x0104:
            r21 = 4194304(0x400000, float:5.877472E-39)
        L_0x0106:
            r6 = r6 | r21
        L_0x0108:
            r1 = r15 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0113
            r21 = 100663296(0x6000000, float:2.4074124E-35)
            r6 = r6 | r21
            r8 = r44
            goto L_0x0127
        L_0x0113:
            r21 = 234881024(0xe000000, float:1.5777218E-30)
            r21 = r14 & r21
            r8 = r44
            if (r21 != 0) goto L_0x0127
            boolean r9 = r0.S(r8)
            if (r9 == 0) goto L_0x0124
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0126
        L_0x0124:
            r9 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0126:
            r6 = r6 | r9
        L_0x0127:
            r9 = 1879048192(0x70000000, float:1.58456325E29)
            r9 = r9 & r14
            if (r9 != 0) goto L_0x0142
            r9 = r15 & 512(0x200, float:7.175E-43)
            if (r9 != 0) goto L_0x013b
            r8 = r45
            boolean r21 = r0.e(r8)
            if (r21 == 0) goto L_0x013d
            r21 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013f
        L_0x013b:
            r8 = r45
        L_0x013d:
            r21 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013f:
            r6 = r6 | r21
            goto L_0x0144
        L_0x0142:
            r8 = r45
        L_0x0144:
            r21 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r8 = r6 & r21
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r9) goto L_0x0165
            boolean r8 = r0.i()
            if (r8 != 0) goto L_0x0155
            goto L_0x0165
        L_0x0155:
            r0.I()
            r14 = r44
            r30 = r45
            r9 = r3
            r13 = r5
            r8 = r10
            r6 = r11
            r11 = r42
            r5 = r2
            goto L_0x02e9
        L_0x0165:
            r0.D()
            r8 = r14 & 1
            r9 = 1
            if (r8 == 0) goto L_0x0187
            boolean r8 = r0.L()
            if (r8 == 0) goto L_0x0174
            goto L_0x0187
        L_0x0174:
            r0.I()
            r1 = r15 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x017f
            r1 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r1
        L_0x017f:
            r1 = r44
            r30 = r45
            r7 = r11
            r11 = r42
            goto L_0x01bf
        L_0x0187:
            if (r7 == 0) goto L_0x0190
            r0.x0$a r7 = r0.C2544x0.f25560b
            long r7 = r7.a()
            goto L_0x0191
        L_0x0190:
            r7 = r11
        L_0x0191:
            if (r13 == 0) goto L_0x0198
            float r10 = (float) r9
            float r10 = c1.h.j(r10)
        L_0x0198:
            if (r20 == 0) goto L_0x01a1
            r0.x0$a r11 = r0.C2544x0.f25560b
            long r11 = r11.i()
            goto L_0x01a3
        L_0x01a1:
            r11 = r42
        L_0x01a3:
            if (r1 == 0) goto L_0x01ac
            V0.p$a r1 = V0.p.f8210b
            V0.p r1 = r1.c()
            goto L_0x01ae
        L_0x01ac:
            r1 = r44
        L_0x01ae:
            r13 = r15 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x01bd
            long r22 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m712generateTextColor8_81llA(r11)
            r13 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r6 = r6 & r13
            r30 = r22
            goto L_0x01bf
        L_0x01bd:
            r30 = r45
        L_0x01bf:
            r0.v()
            k0.i$a r13 = k0.i.f23074a
            C.c r20 = C.C1085c.f882a
            C.c$m r9 = r20.g()
            k0.c$a r20 = k0.c.f23044a
            k0.c$b r14 = r20.k()
            r15 = 0
            H0.F r9 = C.C1090h.a(r9, r14, r0, r15)
            int r14 = Y.C1494j.a(r0, r15)
            Y.y r15 = r0.p()
            k0.i r2 = k0.h.e(r0, r13)
            J0.g$a r20 = J0.C1241g.f3853J
            yf.a r3 = r20.a()
            Y.f r21 = r0.j()
            if (r21 != 0) goto L_0x01f0
            Y.C1494j.c()
        L_0x01f0:
            r0.F()
            boolean r21 = r0.f()
            if (r21 == 0) goto L_0x01fd
            r0.U(r3)
            goto L_0x0200
        L_0x01fd:
            r0.q()
        L_0x0200:
            Y.m r3 = Y.F1.a(r0)
            yf.p r5 = r20.c()
            Y.F1.b(r3, r9, r5)
            yf.p r5 = r20.e()
            Y.F1.b(r3, r15, r5)
            yf.p r5 = r20.b()
            boolean r9 = r3.f()
            if (r9 != 0) goto L_0x022a
            java.lang.Object r9 = r3.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r15)
            if (r9 != 0) goto L_0x0238
        L_0x022a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r3.r(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)
            r3.V(r9, r5)
        L_0x0238:
            yf.p r5 = r20.d()
            Y.F1.b(r3, r2, r5)
            C.k r2 = C.C1093k.f978a
            int r3 = io.intercom.android.sdk.R.string.intercom_surveys_multiselect_other_option_value
            r5 = 0
            java.lang.String r3 = M0.i.a(r3, r0, r5)
            r9 = -1990898758(0xffffffff89554bba, float:-2.5674549E-33)
            r0.T(r9)
            r9 = r6 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r9 != r14) goto L_0x0256
            r15 = 1
            goto L_0x0257
        L_0x0256:
            r15 = r5
        L_0x0257:
            java.lang.Object r5 = r0.A()
            if (r15 != 0) goto L_0x0265
            Y.m$a r9 = Y.C1500m.f10026a
            java.lang.Object r9 = r9.a()
            if (r5 != r9) goto L_0x026d
        L_0x0265:
            io.intercom.android.sdk.survey.ui.questiontype.choice.t r5 = new io.intercom.android.sdk.survey.ui.questiontype.choice.t
            r5.<init>(r4)
            r0.r(r5)
        L_0x026d:
            yf.l r5 = (yf.C6798l) r5
            r0.M()
            r9 = r6 & 14
            int r14 = r6 >> 6
            r15 = r14 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r15
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r14
            r9 = r9 | r15
            r15 = 458752(0x70000, float:6.42848E-40)
            r15 = r15 & r14
            r9 = r9 | r15
            r15 = r14 & r16
            r9 = r9 | r15
            r14 = r14 & r18
            r28 = r9 | r14
            r29 = 0
            r16 = r34
            r17 = r5
            r18 = r3
            r19 = r7
            r21 = r10
            r22 = r11
            r24 = r1
            r25 = r30
            r27 = r0
            io.intercom.android.sdk.survey.ui.questiontype.choice.ChoicePillKt.m475ChoicePillUdaoDFU(r16, r17, r18, r19, r21, r22, r24, r25, r27, r28, r29)
            r3 = 8
            float r3 = (float) r3
            float r3 = c1.h.j(r3)
            k0.i r3 = androidx.compose.foundation.layout.q.i(r13, r3)
            r5 = 6
            C.a0.a(r3, r0, r5)
            io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2 r3 = new io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
            r5 = r35
            r9 = r36
            r13 = r38
            r3.<init>(r5, r9, r13)
            r14 = 54
            r15 = -252181085(0xfffffffff0f805a3, float:-6.1407277E29)
            r39 = r1
            r1 = 1
            g0.a r22 = g0.c.e(r15, r1, r3, r0, r14)
            int r1 = r6 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r3 = 1572870(0x180006, float:2.20406E-39)
            r24 = r3 | r1
            r25 = 30
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r16 = r2
            r17 = r34
            r23 = r0
            v.C2721d.e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.u()
            r14 = r39
            r6 = r7
            r8 = r10
        L_0x02e9:
            Y.Y0 r15 = r0.k()
            if (r15 == 0) goto L_0x0314
            io.intercom.android.sdk.survey.ui.questiontype.choice.u r10 = new io.intercom.android.sdk.survey.ui.questiontype.choice.u
            r0 = r10
            r1 = r34
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r13 = r10
            r9 = r11
            r11 = r14
            r14 = r13
            r12 = r30
            r32 = r14
            r14 = r48
            r33 = r15
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r11, r12, r14, r15)
            r1 = r32
            r0 = r33
            r0.a(r1)
        L_0x0314:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt.m483OtherOptionYCJL08c(boolean, io.intercom.android.sdk.survey.SurveyUiColors, java.lang.String, yf.a, yf.l, long, float, long, V0.p, long, Y.m, int, int):void");
    }

    public static final void OtherOptionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-469899921);
        if (i10 != 0 || !h10.i()) {
            O0.a(n.i(i.f23074a, h.j((float) 16)), (g2) null, 0, 0, 0.0f, 0.0f, (C2868g) null, ComposableSingletons$OtherOptionKt.INSTANCE.m481getLambda1$intercom_sdk_base_release(), h10, 12582918, 126);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new s(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M OtherOptionPreview$lambda$4(int i10, C1500m mVar, int i11) {
        OtherOptionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(C6787a aVar, String str) {
        C6496s.h(aVar, "$onClicked");
        C6496s.h(str, "it");
        aVar.invoke();
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M OtherOption_YCJL08c$lambda$3(boolean z10, SurveyUiColors surveyUiColors, String str, C6787a aVar, C6798l lVar, long j10, float f10, long j11, p pVar, long j12, int i10, int i11, C1500m mVar, int i12) {
        SurveyUiColors surveyUiColors2 = surveyUiColors;
        C6496s.h(surveyUiColors2, "$surveyUiColors");
        String str2 = str;
        C6496s.h(str2, "$text");
        C6787a aVar2 = aVar;
        C6496s.h(aVar2, "$onClicked");
        C6798l lVar2 = lVar;
        C6496s.h(lVar2, "$onTextChanged");
        m483OtherOptionYCJL08c(z10, surveyUiColors2, str2, aVar2, lVar2, j10, f10, j11, pVar, j12, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
