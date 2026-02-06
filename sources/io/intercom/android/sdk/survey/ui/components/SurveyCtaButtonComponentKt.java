package io.intercom.android.sdk.survey.ui.components;

import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.List;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a_\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lk0/i;", "modifier", "", "primaryCtaText", "", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "secondaryCtas", "Lkotlin/Function0;", "Llf/M;", "onPrimaryCtaClicked", "Lkotlin/Function1;", "onSecondaryCtaClicked", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "surveyUiColors", "SurveyCtaButtonComponent", "(Lk0/i;Ljava/lang/String;Ljava/util/List;Lyf/a;Lyf/l;Lio/intercom/android/sdk/survey/SurveyUiColors;LY/m;II)V", "LightButtonPreview", "(LY/m;I)V", "DarkButtonPreview", "SecondaryCtaPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SurveyCtaButtonComponentKt {
    public static final void DarkButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-41399177);
        if (i10 != 0 || !h10.i()) {
            i.a aVar = i.f23074a;
            F h11 = d.h(c.f23044a.o(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = h.e(h10, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, h11, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar2.d());
            f fVar = f.f12848a;
            SurveyCtaButtonComponent((i) null, "Submit", (List<SurveyState.Content.SecondaryCta>) null, (C6787a) null, (C6798l) null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, "#222222", 1, (DefaultConstructorMarker) null)), h10, 48, 29);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new G(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DarkButtonPreview$lambda$10(int i10, C1500m mVar, int i11) {
        DarkButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void LightButtonPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1401512691);
        if (i10 != 0 || !h10.i()) {
            i.a aVar = i.f23074a;
            F h11 = d.h(c.f23044a.o(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = h.e(h10, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, h11, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar2.d());
            f fVar = f.f12848a;
            SurveyCtaButtonComponent((i) null, "Submit", (List<SurveyState.Content.SecondaryCta>) null, (C6787a) null, (C6798l) null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), h10, 48, 29);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new I(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M LightButtonPreview$lambda$8(int i10, C1500m mVar, int i11) {
        LightButtonPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SecondaryCtaPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1826494403);
        if (i10 != 0 || !h10.i()) {
            i.a aVar = i.f23074a;
            F h11 = d.h(c.f23044a.o(), false);
            int a10 = C1494j.a(h10, 0);
            C1523y p10 = h10.p();
            i e10 = h.e(h10, aVar);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a11 = aVar2.a();
            if (h10.j() == null) {
                C1494j.c();
            }
            h10.F();
            if (h10.f()) {
                h10.U(a11);
            } else {
                h10.q();
            }
            C1500m a12 = F1.a(h10);
            F1.b(a12, h11, aVar2.c());
            F1.b(a12, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar2.d());
            f fVar = f.f12848a;
            SurveyCtaButtonComponent((i) null, "Submit", C6565s.e(new SurveyState.Content.SecondaryCta("Open website", "https://www.google.com", true)), (C6787a) null, (C6798l) null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), h10, 48, 25);
            h10.u();
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new H(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SecondaryCtaPreview$lambda$12(int i10, C1500m mVar, int i11) {
        SecondaryCtaPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: io.intercom.android.sdk.survey.ui.components.J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SurveyCtaButtonComponent(k0.i r36, java.lang.String r37, java.util.List<io.intercom.android.sdk.survey.SurveyState.Content.SecondaryCta> r38, yf.C6787a r39, yf.C6798l r40, io.intercom.android.sdk.survey.SurveyUiColors r41, Y.C1500m r42, int r43, int r44) {
        /*
            r2 = r37
            r6 = r41
            r7 = r43
            r0 = 8
            r1 = 16
            r3 = 32
            r4 = 6
            java.lang.String r5 = "primaryCtaText"
            kotlin.jvm.internal.C6496s.h(r2, r5)
            java.lang.String r5 = "surveyUiColors"
            kotlin.jvm.internal.C6496s.h(r6, r5)
            r5 = -1455595547(0xffffffffa93d5fe5, float:-4.2049606E-14)
            r8 = r42
            Y.m r5 = r8.h(r5)
            r15 = 1
            r8 = r44 & 1
            r13 = 2
            r14 = 4
            if (r8 == 0) goto L_0x002d
            r9 = r7 | 6
            r10 = r9
            r9 = r36
            goto L_0x0041
        L_0x002d:
            r9 = r7 & 14
            if (r9 != 0) goto L_0x003e
            r9 = r36
            boolean r10 = r5.S(r9)
            if (r10 == 0) goto L_0x003b
            r10 = r14
            goto L_0x003c
        L_0x003b:
            r10 = r13
        L_0x003c:
            r10 = r10 | r7
            goto L_0x0041
        L_0x003e:
            r9 = r36
            r10 = r7
        L_0x0041:
            r11 = r44 & 2
            if (r11 == 0) goto L_0x0048
            r10 = r10 | 48
            goto L_0x0056
        L_0x0048:
            r11 = r7 & 112(0x70, float:1.57E-43)
            if (r11 != 0) goto L_0x0056
            boolean r11 = r5.S(r2)
            if (r11 == 0) goto L_0x0054
            r11 = r3
            goto L_0x0055
        L_0x0054:
            r11 = r1
        L_0x0055:
            r10 = r10 | r11
        L_0x0056:
            r11 = r44 & 4
            if (r11 == 0) goto L_0x005c
            r10 = r10 | 128(0x80, float:1.794E-43)
        L_0x005c:
            r12 = r44 & 8
            if (r12 == 0) goto L_0x0065
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0062:
            r13 = r39
            goto L_0x0078
        L_0x0065:
            r13 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0062
            r13 = r39
            boolean r16 = r5.C(r13)
            if (r16 == 0) goto L_0x0074
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r10 = r10 | r16
        L_0x0078:
            r1 = r44 & 16
            r22 = 57344(0xe000, float:8.0356E-41)
            if (r1 == 0) goto L_0x0084
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
            r4 = r40
            goto L_0x0097
        L_0x0084:
            r16 = r7 & r22
            r4 = r40
            if (r16 != 0) goto L_0x0097
            boolean r16 = r5.C(r4)
            if (r16 == 0) goto L_0x0093
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r10 = r10 | r16
        L_0x0097:
            r3 = r44 & 32
            if (r3 == 0) goto L_0x00a0
            r3 = 196608(0x30000, float:2.75506E-40)
        L_0x009d:
            r10 = r10 | r3
        L_0x009e:
            r3 = r10
            goto L_0x00b1
        L_0x00a0:
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x009e
            boolean r3 = r5.S(r6)
            if (r3 == 0) goto L_0x00ae
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x009d
        L_0x00ae:
            r3 = 65536(0x10000, float:9.18355E-41)
            goto L_0x009d
        L_0x00b1:
            if (r11 != r14) goto L_0x00ce
            r10 = 374491(0x5b6db, float:5.24774E-40)
            r10 = r10 & r3
            r14 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r14) goto L_0x00ce
            boolean r10 = r5.i()
            if (r10 != 0) goto L_0x00c3
            goto L_0x00ce
        L_0x00c3:
            r5.I()
            r3 = r38
            r21 = r4
            r1 = r9
            r4 = r13
            goto L_0x0336
        L_0x00ce:
            if (r8 == 0) goto L_0x00d4
            k0.i$a r8 = k0.i.f23074a
            r14 = r8
            goto L_0x00d5
        L_0x00d4:
            r14 = r9
        L_0x00d5:
            if (r11 == 0) goto L_0x00de
            java.util.List r8 = mf.C6565s.n()
            r24 = r8
            goto L_0x00e0
        L_0x00de:
            r24 = r38
        L_0x00e0:
            if (r12 == 0) goto L_0x00ea
            io.intercom.android.sdk.survey.ui.components.J r8 = new io.intercom.android.sdk.survey.ui.components.J
            r8.<init>()
            r25 = r8
            goto L_0x00ec
        L_0x00ea:
            r25 = r13
        L_0x00ec:
            if (r1 == 0) goto L_0x00f4
            io.intercom.android.sdk.survey.ui.components.K r1 = new io.intercom.android.sdk.survey.ui.components.K
            r1.<init>()
            goto L_0x00f5
        L_0x00f4:
            r1 = r4
        L_0x00f5:
            float r4 = (float) r15
            float r4 = c1.h.j(r4)
            long r8 = r41.m424getButtonBorder0d7_KjU()
            x.g r4 = x.C2869h.a(r4, r8)
            float r0 = (float) r0
            float r8 = c1.h.j(r0)
            I.f r26 = I.g.c(r8)
            k0.i$a r8 = k0.i.f23074a
            r9 = 0
            r13 = 0
            k0.i r8 = androidx.compose.foundation.layout.q.h(r8, r9, r15, r13)
            r9 = 56
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
            k0.i r27 = androidx.compose.foundation.layout.q.i(r8, r9)
            C.c r8 = C.C1085c.f882a
            C.c$m r8 = r8.g()
            k0.c$a r9 = k0.c.f23044a
            k0.c$b r9 = r9.k()
            r11 = 0
            H0.F r8 = C.C1090h.a(r8, r9, r5, r11)
            int r9 = Y.C1494j.a(r5, r11)
            Y.y r10 = r5.p()
            k0.i r12 = k0.h.e(r5, r14)
            J0.g$a r17 = J0.C1241g.f3853J
            yf.a r11 = r17.a()
            Y.f r18 = r5.j()
            if (r18 != 0) goto L_0x014a
            Y.C1494j.c()
        L_0x014a:
            r5.F()
            boolean r18 = r5.f()
            if (r18 == 0) goto L_0x0157
            r5.U(r11)
            goto L_0x015a
        L_0x0157:
            r5.q()
        L_0x015a:
            Y.m r11 = Y.F1.a(r5)
            yf.p r13 = r17.c()
            Y.F1.b(r11, r8, r13)
            yf.p r8 = r17.e()
            Y.F1.b(r11, r10, r8)
            yf.p r8 = r17.b()
            boolean r10 = r11.f()
            if (r10 != 0) goto L_0x0184
            java.lang.Object r10 = r11.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C6496s.c(r10, r13)
            if (r10 != 0) goto L_0x0192
        L_0x0184:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.r(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.V(r9, r8)
        L_0x0192:
            yf.p r8 = r17.d()
            Y.F1.b(r11, r12, r8)
            C.k r8 = C.C1093k.f978a
            r8 = 1171126262(0x45cdf7f6, float:6590.995)
            r5.T(r8)
            r8 = r24
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r28 = r8.iterator()
        L_0x01a9:
            boolean r8 = r28.hasNext()
            r13 = 54
            if (r8 == 0) goto L_0x024b
            java.lang.Object r8 = r28.next()
            r11 = r8
            io.intercom.android.sdk.survey.SurveyState$Content$SecondaryCta r11 = (io.intercom.android.sdk.survey.SurveyState.Content.SecondaryCta) r11
            V.k r8 = V.C1389k.f7680a
            long r9 = r41.m423getButton0d7_KjU()
            int r12 = V.C1389k.f7694o
            int r18 = r12 << 12
            r19 = 14
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = r11
            r11 = r29
            r29 = r14
            r30 = 0
            r13 = r31
            r15 = r33
            r17 = r5
            V.j r12 = r8.b(r9, r11, r13, r15, r17, r18, r19)
            r8 = 1934483982(0x734de20e, float:1.6311734E31)
            r5.T(r8)
            r8 = r3 & r22
            r15 = 16384(0x4000, float:2.2959E-41)
            r9 = r35
            if (r8 != r15) goto L_0x01ec
            r8 = 1
            goto L_0x01ed
        L_0x01ec:
            r8 = 0
        L_0x01ed:
            boolean r10 = r5.S(r9)
            r8 = r8 | r10
            java.lang.Object r10 = r5.A()
            if (r8 != 0) goto L_0x0200
            Y.m$a r8 = Y.C1500m.f10026a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x0208
        L_0x0200:
            io.intercom.android.sdk.survey.ui.components.L r10 = new io.intercom.android.sdk.survey.ui.components.L
            r10.<init>(r1, r9)
            r5.r(r10)
        L_0x0208:
            r8 = r10
            yf.a r8 = (yf.C6787a) r8
            r5.M()
            io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2 r10 = new io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
            r10.<init>(r9, r6)
            r9 = 468620518(0x1bee94e6, float:3.947002E-22)
            r13 = 54
            r14 = 1
            g0.a r17 = g0.c.e(r9, r14, r10, r5, r13)
            r19 = 805306416(0x30000030, float:4.6566395E-10)
            r20 = 420(0x1a4, float:5.89E-43)
            r10 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r9 = r27
            r11 = r26
            r14 = r4
            r23 = r15
            r15 = r16
            r16 = r18
            r18 = r5
            V.C1393m.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            k0.i$a r8 = k0.i.f23074a
            float r9 = c1.h.j(r0)
            k0.i r8 = androidx.compose.foundation.layout.q.i(r8, r9)
            r9 = 6
            C.a0.a(r8, r5, r9)
            r14 = r29
            r15 = 1
            goto L_0x01a9
        L_0x024b:
            r29 = r14
            r30 = 0
            r5.M()
            boolean r8 = r24.isEmpty()
            if (r8 == 0) goto L_0x026e
            kotlin.Pair r8 = new kotlin.Pair
            long r9 = r41.m423getButton0d7_KjU()
            r0.x0 r9 = r0.C2544x0.k(r9)
            long r10 = r41.m427getOnButton0d7_KjU()
            r0.x0 r10 = r0.C2544x0.k(r10)
            r8.<init>(r9, r10)
            goto L_0x0285
        L_0x026e:
            kotlin.Pair r8 = new kotlin.Pair
            r0.x0$a r9 = r0.C2544x0.f25560b
            long r9 = r9.g()
            r0.x0 r9 = r0.C2544x0.k(r9)
            long r10 = r41.m426getOnBackground0d7_KjU()
            r0.x0 r10 = r0.C2544x0.k(r10)
            r8.<init>(r9, r10)
        L_0x0285:
            java.lang.Object r9 = r8.a()
            r0.x0 r9 = (r0.C2544x0) r9
            long r17 = r9.y()
            java.lang.Object r8 = r8.b()
            r0.x0 r8 = (r0.C2544x0) r8
            long r14 = r8.y()
            boolean r8 = r24.isEmpty()
            if (r8 == 0) goto L_0x02a0
            goto L_0x02a2
        L_0x02a0:
            r4 = r30
        L_0x02a2:
            r8 = 1171170596(0x45cea524, float:6612.6426)
            r5.T(r8)
            boolean r8 = r24.isEmpty()
            if (r8 == 0) goto L_0x02e4
            V.k r8 = V.C1389k.f7680a
            r9 = 2
            float r9 = (float) r9
            float r9 = c1.h.j(r9)
            float r10 = c1.h.j(r0)
            r0 = 0
            float r0 = (float) r0
            float r0 = c1.h.j(r0)
            r11 = 4
            float r11 = (float) r11
            float r12 = c1.h.j(r11)
            float r11 = c1.h.j(r11)
            int r16 = V.C1389k.f7694o
            int r13 = r16 << 15
            r13 = r13 | 28086(0x6db6, float:3.9357E-41)
            r16 = 0
            r21 = r1
            r19 = r13
            r1 = 54
            r13 = r0
            r6 = r14
            r14 = r5
            r15 = r19
            V.l r0 = r8.c(r9, r10, r11, r12, r13, r14, r15, r16)
            r30 = r0
            goto L_0x02e8
        L_0x02e4:
            r21 = r1
            r1 = r13
            r6 = r14
        L_0x02e8:
            r5.M()
            V.k r8 = V.C1389k.f7680a
            int r0 = V.C1389k.f7694o
            int r0 = r0 << 12
            r19 = 14
            r11 = 0
            r13 = 0
            r15 = 0
            r9 = r17
            r17 = r5
            r18 = r0
            V.j r12 = r8.b(r9, r11, r13, r15, r17, r18, r19)
            io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2 r0 = new io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
            r0.<init>(r2, r6)
            r6 = 767351755(0x2dbcdbcb, float:2.1470733E-11)
            r7 = 1
            g0.a r17 = g0.c.e(r6, r7, r0, r5, r1)
            int r0 = r3 >> 9
            r0 = r0 & 14
            r1 = 805306416(0x30000030, float:4.6566395E-10)
            r19 = r0 | r1
            r20 = 388(0x184, float:5.44E-43)
            r10 = 0
            r15 = 0
            r16 = 0
            r8 = r25
            r9 = r27
            r11 = r26
            r13 = r30
            r14 = r4
            r18 = r5
            V.C1393m.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5.u()
            r3 = r24
            r4 = r25
            r1 = r29
        L_0x0336:
            Y.Y0 r9 = r5.k()
            if (r9 == 0) goto L_0x034f
            io.intercom.android.sdk.survey.ui.components.M r10 = new io.intercom.android.sdk.survey.ui.components.M
            r0 = r10
            r2 = r37
            r5 = r21
            r6 = r41
            r7 = r43
            r8 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x034f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(k0.i, java.lang.String, java.util.List, yf.a, yf.l, io.intercom.android.sdk.survey.SurveyUiColors, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyCtaButtonComponent$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyCtaButtonComponent$lambda$1(SurveyState.Content.SecondaryCta secondaryCta) {
        C6496s.h(secondaryCta, "it");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(C6798l lVar, SurveyState.Content.SecondaryCta secondaryCta) {
        C6496s.h(secondaryCta, "$it");
        lVar.invoke(secondaryCta);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyCtaButtonComponent$lambda$6(i iVar, String str, List list, C6787a aVar, C6798l lVar, SurveyUiColors surveyUiColors, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(str, "$primaryCtaText");
        C6496s.h(surveyUiColors, "$surveyUiColors");
        SurveyCtaButtonComponent(iVar, str, list, aVar, lVar, surveyUiColors, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
