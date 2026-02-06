package io.intercom.android.sdk.survey.ui.questiontype;

import V.B0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.d;
import com.google.android.material.datepicker.j;
import com.google.android.material.timepicker.b;
import com.revenuecat.purchases.common.Constants;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.TimeFormatter;
import java.util.ArrayList;
import java.util.List;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import p0.e;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\u001aO\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\u0007*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\u0012\u0010\u000e\u001a\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a/\u0010\u0018\u001a\u00020\u0007*\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0011\u001a%\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DatePickerQuestionModel;", "questionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lkotlin/Function0;", "questionHeader", "DatePickerQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DatePickerQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lyf/p;LY/m;II)V", "DatePicker", "(Lk0/i;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;LY/m;I)V", "Landroidx/appcompat/app/d;", "showDatePicker", "(Landroidx/appcompat/app/d;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;)V", "TimePicker", "", "enabled", "", "contentAlpha", "(ZLY/m;I)F", "showTimePicker", "", "hour", "minute", "", "", "getUtcTime", "(II)Ljava/util/List;", "getLocalTime", "(Lio/intercom/android/sdk/survey/ui/models/Answer;)Ljava/util/List;", "DatePickerQuestionPreview", "(LY/m;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DatePickerQuestionKt {
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void DatePicker(k0.i r35, io.intercom.android.sdk.survey.ui.models.Answer r36, yf.C6798l r37, Y.C1500m r38, int r39) {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r39
            r4 = 2133326452(0x7f27fa74, float:2.232815E38)
            r5 = r38
            Y.m r4 = r5.h(r4)
            r5 = r3 & 14
            if (r5 != 0) goto L_0x0020
            boolean r5 = r4.S(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0031
            boolean r6 = r4.S(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 32
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r5 = r5 | r6
        L_0x0031:
            r6 = r3 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0041
            boolean r6 = r4.C(r2)
            if (r6 == 0) goto L_0x003e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r5 = r5 | r6
        L_0x0041:
            r5 = r5 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0053
            boolean r5 = r4.i()
            if (r5 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r4.I()
            goto L_0x020d
        L_0x0053:
            Y.I0 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r5 = r4.m(r5)
            android.content.Context r5 = (android.content.Context) r5
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.f()
            java.lang.Object r6 = r4.m(r6)
            p0.e r6 = (p0.e) r6
            boolean r8 = r1 instanceof io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer
            java.lang.String r9 = "DD - MM - YYYY"
            if (r8 == 0) goto L_0x0086
            r8 = r1
            io.intercom.android.sdk.survey.ui.models.Answer$DateTimeAnswer r8 = (io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer) r8
            long r10 = r8.getDate()
            r12 = -1
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0086
            long r10 = r8.getDate()
            java.lang.String r8 = "dd - MM - YYYY"
            java.lang.String r8 = io.intercom.android.sdk.utilities.TimeFormatter.formatTimeInMillisAsDate(r10, r8)
            r14 = r8
            goto L_0x0087
        L_0x0086:
            r14 = r9
        L_0x0087:
            r8 = 1
            float r10 = (float) r8
            float r10 = c1.h.j(r10)
            io.intercom.android.sdk.ui.theme.IntercomTheme r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r13 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r11 = r15.getColors(r4, r13)
            long r16 = r11.m700getPrimaryText0d7_KjU()
            r22 = 14
            r23 = 0
            r18 = 1036831949(0x3dcccccd, float:0.1)
            r19 = 0
            r20 = 0
            r21 = 0
            long r11 = r0.C2544x0.o(r16, r18, r19, r20, r21, r22, r23)
            V.B0 r16 = r15.getShapes(r4, r13)
            I.a r8 = r16.e()
            k0.i r8 = x.C2866e.f(r0, r10, r11, r8)
            V.B0 r10 = r15.getShapes(r4, r13)
            I.a r10 = r10.e()
            k0.i r16 = o0.C2342e.a(r8, r10)
            io.intercom.android.sdk.ui.theme.IntercomColors r8 = r15.getColors(r4, r13)
            long r17 = r8.m678getBackground0d7_KjU()
            r20 = 2
            r21 = 0
            r19 = 0
            k0.i r22 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            io.intercom.android.sdk.survey.ui.questiontype.d r8 = new io.intercom.android.sdk.survey.ui.questiontype.d
            r8.<init>(r6, r5, r1, r2)
            r27 = 7
            r28 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = r8
            k0.i r5 = androidx.compose.foundation.d.d(r22, r23, r24, r25, r26, r27, r28)
            C.c r6 = C.C1085c.f882a
            C.c$f r6 = r6.d()
            k0.c$a r8 = k0.c.f23044a
            k0.c$c r8 = r8.i()
            r10 = 54
            H0.F r6 = C.W.b(r6, r8, r4, r10)
            r12 = 0
            int r8 = Y.C1494j.a(r4, r12)
            Y.y r10 = r4.p()
            k0.i r5 = k0.h.e(r4, r5)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r12 = r11.a()
            Y.f r17 = r4.j()
            if (r17 != 0) goto L_0x0117
            Y.C1494j.c()
        L_0x0117:
            r4.F()
            boolean r17 = r4.f()
            if (r17 == 0) goto L_0x0124
            r4.U(r12)
            goto L_0x0127
        L_0x0124:
            r4.q()
        L_0x0127:
            Y.m r12 = Y.F1.a(r4)
            yf.p r7 = r11.c()
            Y.F1.b(r12, r6, r7)
            yf.p r6 = r11.e()
            Y.F1.b(r12, r10, r6)
            yf.p r6 = r11.b()
            boolean r7 = r12.f()
            if (r7 != 0) goto L_0x0151
            java.lang.Object r7 = r12.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r10)
            if (r7 != 0) goto L_0x015f
        L_0x0151:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r12.r(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r12.V(r7, r6)
        L_0x015f:
            yf.p r6 = r11.d()
            Y.F1.b(r12, r5, r6)
            C.Z r5 = C.Z.f873a
            kotlin.jvm.internal.C6496s.e(r14)
            k0.i$a r6 = k0.i.f23074a
            r5 = 16
            float r5 = (float) r5
            float r7 = c1.h.j(r5)
            k0.i r7 = androidx.compose.foundation.layout.n.i(r6, r7)
            r8 = 3
            r10 = 0
            r12 = 0
            k0.i r25 = androidx.compose.foundation.layout.q.x(r7, r10, r12, r8, r10)
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r15.getTypography(r4, r13)
            Q0.T r26 = r7.getType04()
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r15.getColors(r4, r13)
            long r16 = r7.m700getPrimaryText0d7_KjU()
            boolean r7 = kotlin.jvm.internal.C6496s.c(r14, r9)
            r8 = 1
            r7 = r7 ^ r8
            float r18 = contentAlpha(r7, r4, r12)
            r22 = 14
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            long r7 = r0.C2544x0.o(r16, r18, r19, r20, r21, r22, r23)
            r28 = 0
            r29 = 65528(0xfff8, float:9.1824E-41)
            r9 = 0
            r11 = 0
            r16 = 0
            r12 = r16
            r30 = r13
            r13 = r16
            r16 = 0
            r31 = r14
            r32 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 48
            r33 = r5
            r5 = r31
            r34 = r6
            r6 = r25
            r25 = r26
            r26 = r4
            V.T0.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r5 = io.intercom.android.sdk.R.drawable.intercom_ic_pick_date
            r6 = 0
            w0.c r5 = M0.e.c(r5, r4, r6)
            int r7 = io.intercom.android.sdk.R.string.intercom_choose_the_date
            java.lang.String r6 = M0.i.a(r7, r4, r6)
            float r7 = c1.h.j(r33)
            r8 = r34
            k0.i r7 = androidx.compose.foundation.layout.n.i(r8, r7)
            r9 = r30
            r8 = r32
            io.intercom.android.sdk.ui.theme.IntercomColors r8 = r8.getColors(r4, r9)
            long r8 = r8.m672getAction0d7_KjU()
            r11 = 392(0x188, float:5.5E-43)
            r12 = 0
            r10 = r4
            V.V.a(r5, r6, r7, r8, r10, r11, r12)
            r4.u()
        L_0x020d:
            Y.Y0 r4 = r4.k()
            if (r4 == 0) goto L_0x021b
            io.intercom.android.sdk.survey.ui.questiontype.e r5 = new io.intercom.android.sdk.survey.ui.questiontype.e
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.DatePicker(k0.i, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M DatePicker$lambda$3(e eVar, Context context, Answer answer, C6798l lVar) {
        C6496s.h(eVar, "$focusManager");
        C6496s.h(context, "$context");
        C6496s.h(answer, "$answer");
        C6496s.h(lVar, "$onAnswer");
        d dVar = null;
        e.c(eVar, false, 1, (Object) null);
        if (context instanceof d) {
            dVar = (d) context;
        }
        if (dVar != null) {
            showDatePicker(dVar, answer, lVar);
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M DatePicker$lambda$5(i iVar, Answer answer, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(iVar, "$modifier");
        C6496s.h(answer, "$answer");
        C6496s.h(lVar, "$onAnswer");
        DatePicker(iVar, answer, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void DatePickerQuestion(k0.i r18, io.intercom.android.sdk.survey.model.SurveyData.Step.Question.DatePickerQuestionModel r19, io.intercom.android.sdk.survey.ui.models.Answer r20, yf.C6798l r21, yf.p r22, Y.C1500m r23, int r24, int r25) {
        /*
            r4 = r21
            r6 = r24
            r0 = 16
            r1 = 8
            r2 = 4
            r3 = 6
            java.lang.String r5 = "questionModel"
            r7 = r19
            kotlin.jvm.internal.C6496s.h(r7, r5)
            java.lang.String r5 = "onAnswer"
            kotlin.jvm.internal.C6496s.h(r4, r5)
            r5 = 1725209962(0x66d49d6a, float:5.0202274E23)
            r8 = r23
            Y.m r5 = r8.h(r5)
            r8 = 1
            r9 = r25 & 1
            if (r9 == 0) goto L_0x002a
            r10 = r6 | 6
            r11 = r10
            r10 = r18
            goto L_0x003e
        L_0x002a:
            r10 = r6 & 14
            if (r10 != 0) goto L_0x003b
            r10 = r18
            boolean r11 = r5.S(r10)
            if (r11 == 0) goto L_0x0038
            r11 = r2
            goto L_0x0039
        L_0x0038:
            r11 = 2
        L_0x0039:
            r11 = r11 | r6
            goto L_0x003e
        L_0x003b:
            r10 = r18
            r11 = r6
        L_0x003e:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0047
            r11 = r11 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r12 = r20
            goto L_0x0059
        L_0x0047:
            r12 = r6 & 896(0x380, float:1.256E-42)
            if (r12 != 0) goto L_0x0044
            r12 = r20
            boolean r13 = r5.S(r12)
            if (r13 == 0) goto L_0x0056
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r11 = r11 | r13
        L_0x0059:
            r13 = r25 & 8
            if (r13 == 0) goto L_0x0060
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            goto L_0x0070
        L_0x0060:
            r13 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r13 != 0) goto L_0x0070
            boolean r13 = r5.C(r4)
            if (r13 == 0) goto L_0x006d
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x006f
        L_0x006d:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x006f:
            r11 = r11 | r13
        L_0x0070:
            r13 = r25 & 16
            if (r13 == 0) goto L_0x0079
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0076:
            r14 = r22
            goto L_0x008d
        L_0x0079:
            r14 = 57344(0xe000, float:8.0356E-41)
            r14 = r14 & r6
            if (r14 != 0) goto L_0x0076
            r14 = r22
            boolean r15 = r5.C(r14)
            if (r15 == 0) goto L_0x008a
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x008a:
            r15 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r11 = r11 | r15
        L_0x008d:
            r15 = 46731(0xb68b, float:6.5484E-41)
            r15 = r15 & r11
            r0 = 9346(0x2482, float:1.3097E-41)
            if (r15 != r0) goto L_0x00a3
            boolean r0 = r5.i()
            if (r0 != 0) goto L_0x009c
            goto L_0x00a3
        L_0x009c:
            r5.I()
        L_0x009f:
            r1 = r10
            r3 = r12
            goto L_0x01fe
        L_0x00a3:
            if (r9 == 0) goto L_0x00a8
            k0.i$a r0 = k0.i.f23074a
            r10 = r0
        L_0x00a8:
            if (r2 == 0) goto L_0x00ad
            io.intercom.android.sdk.survey.ui.models.Answer$NoAnswer$InitialNoAnswer r0 = io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer.InitialNoAnswer.INSTANCE
            r12 = r0
        L_0x00ad:
            if (r13 == 0) goto L_0x00b6
            io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt r0 = io.intercom.android.sdk.survey.ui.questiontype.ComposableSingletons$DatePickerQuestionKt.INSTANCE
            yf.p r0 = r0.m472getLambda1$intercom_sdk_base_release()
            r14 = r0
        L_0x00b6:
            C.c r0 = C.C1085c.f882a
            C.c$m r2 = r0.g()
            k0.c$a r9 = k0.c.f23044a
            k0.c$b r13 = r9.k()
            r15 = 0
            H0.F r2 = C.C1090h.a(r2, r13, r5, r15)
            int r13 = Y.C1494j.a(r5, r15)
            Y.y r15 = r5.p()
            k0.i r8 = k0.h.e(r5, r10)
            J0.g$a r16 = J0.C1241g.f3853J
            yf.a r3 = r16.a()
            Y.f r17 = r5.j()
            if (r17 != 0) goto L_0x00e2
            Y.C1494j.c()
        L_0x00e2:
            r5.F()
            boolean r17 = r5.f()
            if (r17 == 0) goto L_0x00ef
            r5.U(r3)
            goto L_0x00f2
        L_0x00ef:
            r5.q()
        L_0x00f2:
            Y.m r3 = Y.F1.a(r5)
            yf.p r1 = r16.c()
            Y.F1.b(r3, r2, r1)
            yf.p r1 = r16.e()
            Y.F1.b(r3, r15, r1)
            yf.p r1 = r16.b()
            boolean r2 = r3.f()
            if (r2 != 0) goto L_0x011c
            java.lang.Object r2 = r3.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r15)
            if (r2 != 0) goto L_0x012a
        L_0x011c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r3.r(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r3.V(r2, r1)
        L_0x012a:
            yf.p r1 = r16.d()
            Y.F1.b(r3, r8, r1)
            C.k r1 = C.C1093k.f978a
            int r1 = r11 >> 12
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14.invoke(r5, r1)
            k0.i$a r1 = k0.i.f23074a
            r2 = 8
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            k0.i r2 = androidx.compose.foundation.layout.q.i(r1, r2)
            r3 = 6
            C.a0.a(r2, r5, r3)
            r2 = 0
            r8 = 0
            r13 = 1
            k0.i r2 = androidx.compose.foundation.layout.q.h(r1, r2, r13, r8)
            C.c$f r0 = r0.d()
            k0.c$c r8 = r9.l()
            H0.F r0 = C.W.b(r0, r8, r5, r3)
            r3 = 0
            int r3 = Y.C1494j.a(r5, r3)
            Y.y r8 = r5.p()
            k0.i r2 = k0.h.e(r5, r2)
            yf.a r9 = r16.a()
            Y.f r13 = r5.j()
            if (r13 != 0) goto L_0x017c
            Y.C1494j.c()
        L_0x017c:
            r5.F()
            boolean r13 = r5.f()
            if (r13 == 0) goto L_0x0189
            r5.U(r9)
            goto L_0x018c
        L_0x0189:
            r5.q()
        L_0x018c:
            Y.m r9 = Y.F1.a(r5)
            yf.p r13 = r16.c()
            Y.F1.b(r9, r0, r13)
            yf.p r0 = r16.e()
            Y.F1.b(r9, r8, r0)
            yf.p r0 = r16.b()
            boolean r8 = r9.f()
            if (r8 != 0) goto L_0x01b6
            java.lang.Object r8 = r9.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r13)
            if (r8 != 0) goto L_0x01c4
        L_0x01b6:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r9.r(r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.V(r3, r0)
        L_0x01c4:
            yf.p r0 = r16.d()
            Y.F1.b(r9, r2, r0)
            C.Z r0 = C.Z.f873a
            r0 = 1056964608(0x3f000000, float:0.5)
            k0.i r0 = androidx.compose.foundation.layout.q.g(r1, r0)
            int r2 = r11 >> 3
            r3 = r2 & 112(0x70, float:1.57E-43)
            r8 = 6
            r3 = r3 | r8
            r2 = r2 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            DatePicker(r0, r12, r4, r5, r2)
            r0 = 16
            float r0 = (float) r0
            float r0 = c1.h.j(r0)
            k0.i r0 = androidx.compose.foundation.layout.q.r(r1, r0)
            C.a0.a(r0, r5, r8)
            r0 = 1065353216(0x3f800000, float:1.0)
            k0.i r0 = androidx.compose.foundation.layout.q.g(r1, r0)
            TimePicker(r0, r12, r4, r5, r2)
            r5.u()
            r5.u()
            goto L_0x009f
        L_0x01fe:
            Y.Y0 r8 = r5.k()
            if (r8 == 0) goto L_0x0216
            io.intercom.android.sdk.survey.ui.questiontype.j r9 = new io.intercom.android.sdk.survey.ui.questiontype.j
            r0 = r9
            r2 = r19
            r4 = r21
            r5 = r14
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.DatePickerQuestion(k0.i, io.intercom.android.sdk.survey.model.SurveyData$Step$Question$DatePickerQuestionModel, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, yf.p, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M DatePickerQuestion$lambda$2(i iVar, SurveyData.Step.Question.DatePickerQuestionModel datePickerQuestionModel, Answer answer, C6798l lVar, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(datePickerQuestionModel, "$questionModel");
        C6496s.h(lVar, "$onAnswer");
        DatePickerQuestion(iVar, datePickerQuestionModel, answer, lVar, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    @IntercomPreviews
    private static final void DatePickerQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1652233850);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$DatePickerQuestionKt.INSTANCE.m474getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DatePickerQuestionPreview$lambda$15(int i10, C1500m mVar, int i11) {
        DatePickerQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void TimePicker(k0.i r35, io.intercom.android.sdk.survey.ui.models.Answer r36, yf.C6798l r37, Y.C1500m r38, int r39) {
        /*
            r0 = r35
            r1 = r36
            r2 = r37
            r3 = r39
            r4 = 1270472949(0x4bb9e0f5, float:2.4363498E7)
            r5 = r38
            Y.m r4 = r5.h(r4)
            r5 = r3 & 14
            if (r5 != 0) goto L_0x0020
            boolean r5 = r4.S(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r3
            goto L_0x0021
        L_0x0020:
            r5 = r3
        L_0x0021:
            r6 = r3 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0031
            boolean r6 = r4.S(r1)
            if (r6 == 0) goto L_0x002e
            r6 = 32
            goto L_0x0030
        L_0x002e:
            r6 = 16
        L_0x0030:
            r5 = r5 | r6
        L_0x0031:
            r6 = r3 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0041
            boolean r6 = r4.C(r2)
            if (r6 == 0) goto L_0x003e
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r5 = r5 | r6
        L_0x0041:
            r5 = r5 & 731(0x2db, float:1.024E-42)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0053
            boolean r5 = r4.i()
            if (r5 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r4.I()
            goto L_0x0204
        L_0x0053:
            Y.I0 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r5 = r4.m(r5)
            android.content.Context r5 = (android.content.Context) r5
            Y.I0 r6 = androidx.compose.ui.platform.C1644k0.f()
            java.lang.Object r6 = r4.m(r6)
            p0.e r6 = (p0.e) r6
            boolean r8 = r1 instanceof io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer
            java.lang.String r9 = "HH:MM"
            if (r8 == 0) goto L_0x0080
            r8 = r1
            io.intercom.android.sdk.survey.ui.models.Answer$DateTimeAnswer r8 = (io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer) r8
            java.lang.String r10 = r8.getLocalTime()
            boolean r10 = Sg.p.d0(r10)
            if (r10 != 0) goto L_0x0080
            java.lang.String r8 = r8.getLocalTime()
            r14 = r8
            goto L_0x0081
        L_0x0080:
            r14 = r9
        L_0x0081:
            r8 = 1
            float r10 = (float) r8
            float r10 = c1.h.j(r10)
            io.intercom.android.sdk.ui.theme.IntercomTheme r15 = io.intercom.android.sdk.ui.theme.IntercomTheme.INSTANCE
            int r13 = io.intercom.android.sdk.ui.theme.IntercomTheme.$stable
            io.intercom.android.sdk.ui.theme.IntercomColors r11 = r15.getColors(r4, r13)
            long r16 = r11.m700getPrimaryText0d7_KjU()
            r22 = 14
            r23 = 0
            r18 = 1036831949(0x3dcccccd, float:0.1)
            r19 = 0
            r20 = 0
            r21 = 0
            long r11 = r0.C2544x0.o(r16, r18, r19, r20, r21, r22, r23)
            V.B0 r16 = r15.getShapes(r4, r13)
            I.a r8 = r16.e()
            k0.i r8 = x.C2866e.f(r0, r10, r11, r8)
            V.B0 r10 = r15.getShapes(r4, r13)
            I.a r10 = r10.e()
            k0.i r16 = o0.C2342e.a(r8, r10)
            io.intercom.android.sdk.ui.theme.IntercomColors r8 = r15.getColors(r4, r13)
            long r17 = r8.m678getBackground0d7_KjU()
            r20 = 2
            r21 = 0
            r19 = 0
            k0.i r22 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            io.intercom.android.sdk.survey.ui.questiontype.f r8 = new io.intercom.android.sdk.survey.ui.questiontype.f
            r8.<init>(r6, r5, r1, r2)
            r27 = 7
            r28 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = r8
            k0.i r5 = androidx.compose.foundation.d.d(r22, r23, r24, r25, r26, r27, r28)
            C.c r6 = C.C1085c.f882a
            C.c$f r6 = r6.d()
            k0.c$a r8 = k0.c.f23044a
            k0.c$c r8 = r8.i()
            r10 = 54
            H0.F r6 = C.W.b(r6, r8, r4, r10)
            r12 = 0
            int r8 = Y.C1494j.a(r4, r12)
            Y.y r10 = r4.p()
            k0.i r5 = k0.h.e(r4, r5)
            J0.g$a r11 = J0.C1241g.f3853J
            yf.a r12 = r11.a()
            Y.f r17 = r4.j()
            if (r17 != 0) goto L_0x0111
            Y.C1494j.c()
        L_0x0111:
            r4.F()
            boolean r17 = r4.f()
            if (r17 == 0) goto L_0x011e
            r4.U(r12)
            goto L_0x0121
        L_0x011e:
            r4.q()
        L_0x0121:
            Y.m r12 = Y.F1.a(r4)
            yf.p r7 = r11.c()
            Y.F1.b(r12, r6, r7)
            yf.p r6 = r11.e()
            Y.F1.b(r12, r10, r6)
            yf.p r6 = r11.b()
            boolean r7 = r12.f()
            if (r7 != 0) goto L_0x014b
            java.lang.Object r7 = r12.A()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r10)
            if (r7 != 0) goto L_0x0159
        L_0x014b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r12.r(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r12.V(r7, r6)
        L_0x0159:
            yf.p r6 = r11.d()
            Y.F1.b(r12, r5, r6)
            C.Z r5 = C.Z.f873a
            k0.i$a r6 = k0.i.f23074a
            r5 = 16
            float r5 = (float) r5
            float r7 = c1.h.j(r5)
            k0.i r7 = androidx.compose.foundation.layout.n.i(r6, r7)
            r8 = 3
            r10 = 0
            r12 = 0
            k0.i r25 = androidx.compose.foundation.layout.q.x(r7, r10, r12, r8, r10)
            io.intercom.android.sdk.ui.theme.IntercomTypography r7 = r15.getTypography(r4, r13)
            Q0.T r26 = r7.getType04()
            io.intercom.android.sdk.ui.theme.IntercomColors r7 = r15.getColors(r4, r13)
            long r16 = r7.m700getPrimaryText0d7_KjU()
            boolean r7 = kotlin.jvm.internal.C6496s.c(r14, r9)
            r8 = 1
            r7 = r7 ^ r8
            float r18 = contentAlpha(r7, r4, r12)
            r22 = 14
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            long r7 = r0.C2544x0.o(r16, r18, r19, r20, r21, r22, r23)
            r28 = 0
            r29 = 65528(0xfff8, float:9.1824E-41)
            r9 = 0
            r11 = 0
            r16 = 0
            r12 = r16
            r30 = r13
            r13 = r16
            r16 = 0
            r31 = r14
            r32 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r27 = 48
            r33 = r5
            r5 = r31
            r34 = r6
            r6 = r25
            r25 = r26
            r26 = r4
            V.T0.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r5 = io.intercom.android.sdk.R.drawable.intercom_ic_pick_time
            r6 = 0
            w0.c r5 = M0.e.c(r5, r4, r6)
            int r7 = io.intercom.android.sdk.R.string.intercom_choose_the_date
            java.lang.String r6 = M0.i.a(r7, r4, r6)
            float r7 = c1.h.j(r33)
            r8 = r34
            k0.i r7 = androidx.compose.foundation.layout.n.i(r8, r7)
            r9 = r30
            r8 = r32
            io.intercom.android.sdk.ui.theme.IntercomColors r8 = r8.getColors(r4, r9)
            long r8 = r8.m672getAction0d7_KjU()
            r11 = 392(0x188, float:5.5E-43)
            r12 = 0
            r10 = r4
            V.V.a(r5, r6, r7, r8, r10, r11, r12)
            r4.u()
        L_0x0204:
            Y.Y0 r4 = r4.k()
            if (r4 == 0) goto L_0x0212
            io.intercom.android.sdk.survey.ui.questiontype.g r5 = new io.intercom.android.sdk.survey.ui.questiontype.g
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.questiontype.DatePickerQuestionKt.TimePicker(k0.i, io.intercom.android.sdk.survey.ui.models.Answer, yf.l, Y.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M TimePicker$lambda$10(i iVar, Answer answer, C6798l lVar, int i10, C1500m mVar, int i11) {
        C6496s.h(iVar, "$modifier");
        C6496s.h(answer, "$answer");
        C6496s.h(lVar, "$onAnswer");
        TimePicker(iVar, answer, lVar, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M TimePicker$lambda$8(e eVar, Context context, Answer answer, C6798l lVar) {
        C6496s.h(eVar, "$focusManager");
        C6496s.h(context, "$context");
        C6496s.h(answer, "$answer");
        C6496s.h(lVar, "$onAnswer");
        d dVar = null;
        e.c(eVar, false, 1, (Object) null);
        if (context instanceof d) {
            dVar = (d) context;
        }
        if (dVar != null) {
            showTimePicker(dVar, answer, lVar);
        }
        return C6514M.f71813a;
    }

    public static final float contentAlpha(boolean z10, C1500m mVar, int i10) {
        float f10;
        mVar.T(2064501839);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        mVar.M();
        return f10;
    }

    private static final List<String> getLocalTime(Answer answer) {
        if (answer instanceof Answer.DateTimeAnswer) {
            return Sg.p.F0(((Answer.DateTimeAnswer) answer).getLocalTime(), new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, (Object) null);
        }
        return C6565s.n();
    }

    private static final List<String> getUtcTime(int i10, int i11) {
        String formatToUtcTime = TimeFormatter.formatToUtcTime(i10, i11);
        C6496s.g(formatToUtcTime, "formatToUtcTime(...)");
        return Sg.p.F0(formatToUtcTime, new String[]{Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, (Object) null);
    }

    private static final void showDatePicker(d dVar, Answer answer, C6798l lVar) {
        long j10;
        j.f g10 = j.f.c().f(R.style.Intercom_MaterialCalendar).g("Select date");
        if (answer instanceof Answer.DateTimeAnswer) {
            Answer.DateTimeAnswer dateTimeAnswer = (Answer.DateTimeAnswer) answer;
            if (dateTimeAnswer.getDate() > 0) {
                j10 = dateTimeAnswer.getDate();
                j a10 = g10.e(Long.valueOf(j10)).a();
                C6496s.g(a10, "build(...)");
                a10.c0(new i(new h(answer, lVar)));
                a10.T(dVar.getSupportFragmentManager(), a10.toString());
            }
        }
        j10 = j.q0();
        j a102 = g10.e(Long.valueOf(j10)).a();
        C6496s.g(a102, "build(...)");
        a102.c0(new i(new h(answer, lVar)));
        a102.T(dVar.getSupportFragmentManager(), a102.toString());
    }

    /* access modifiers changed from: private */
    public static final C6514M showDatePicker$lambda$6(Answer answer, C6798l lVar, Long l10) {
        Answer.DateTimeAnswer dateTimeAnswer;
        C6496s.h(answer, "$answer");
        C6496s.h(lVar, "$onAnswer");
        if (answer instanceof Answer.DateTimeAnswer) {
            C6496s.e(l10);
            dateTimeAnswer = Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, l10.longValue(), 0, 0, 6, (Object) null);
        } else {
            long currentTimeMillis = Injector.get().getTimeProvider().currentTimeMillis();
            List<String> utcTime = getUtcTime(TimeFormatter.getHour(currentTimeMillis), TimeFormatter.getMinute(currentTimeMillis));
            C6496s.e(l10);
            dateTimeAnswer = new Answer.DateTimeAnswer(l10.longValue(), Integer.parseInt(utcTime.get(0)), Integer.parseInt(utcTime.get(1)));
        }
        lVar.invoke(dateTimeAnswer);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void showDatePicker$lambda$7(C6798l lVar, Object obj) {
        C6496s.h(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    private static final void showTimePicker(d dVar, Answer answer, C6798l lVar) {
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        for (String m10 : getLocalTime(answer)) {
            Integer m11 = Sg.p.m(m10);
            if (m11 != null) {
                arrayList.add(m11);
            }
        }
        b.d n10 = new b.d().m(R.style.Intercom_TimePicker).o("Select time").n(1);
        if (arrayList.size() > 0) {
            i10 = arrayList.get(0);
        } else {
            i10 = 0;
        }
        b.d k10 = n10.k(((Number) i10).intValue());
        if (1 < arrayList.size()) {
            i11 = arrayList.get(1);
        } else {
            i11 = 0;
        }
        b j10 = k10.l(((Number) i11).intValue()).j();
        C6496s.g(j10, "build(...)");
        j10.b0(new b(j10, answer, lVar));
        j10.T(dVar.getSupportFragmentManager(), j10.toString());
    }

    /* access modifiers changed from: private */
    public static final void showTimePicker$lambda$14(b bVar, Answer answer, C6798l lVar, View view) {
        Answer.DateTimeAnswer dateTimeAnswer;
        C6496s.h(bVar, "$picker");
        C6496s.h(answer, "$answer");
        C6496s.h(lVar, "$onAnswer");
        List<String> utcTime = getUtcTime(bVar.d0(), bVar.e0());
        if (answer instanceof Answer.DateTimeAnswer) {
            dateTimeAnswer = Answer.DateTimeAnswer.copy$default((Answer.DateTimeAnswer) answer, 0, Integer.parseInt(utcTime.get(0)), Integer.parseInt(utcTime.get(1)), 1, (Object) null);
        } else {
            dateTimeAnswer = new Answer.DateTimeAnswer(-1, Integer.parseInt(utcTime.get(0)), Integer.parseInt(utcTime.get(1)));
        }
        lVar.invoke(dateTimeAnswer);
    }
}
