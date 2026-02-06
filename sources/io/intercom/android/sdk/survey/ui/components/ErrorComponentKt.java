package io.intercom.android.sdk.survey.ui.components;

import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyState$Error;", "state", "Lk0/i;", "modifier", "Llf/M;", "SurveyError", "(Lio/intercom/android/sdk/survey/SurveyState$Error;Lk0/i;LY/m;II)V", "ErrorStateWithCTA", "(LY/m;I)V", "ErrorStateWithoutCTA", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ErrorComponentKt {
    public static final void ErrorStateWithCTA(C1500m mVar, int i10) {
        int i11 = i10;
        C1500m h10 = mVar.h(1921062712);
        if (i11 != 0 || !h10.i()) {
            SurveyError(new SurveyState.Error.WithCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), (ProgressBarState) null, 4, (DefaultConstructorMarker) null), new C6284g(), 1, (DefaultConstructorMarker) null), (i) null, h10, 0, 2);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6285h(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorStateWithCTA$lambda$2() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorStateWithCTA$lambda$3(int i10, C1500m mVar, int i11) {
        ErrorStateWithCTA(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void ErrorStateWithoutCTA(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-1056362620);
        if (i10 != 0 || !h10.i()) {
            SurveyError(new SurveyState.Error.WithoutCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), (ProgressBarState) null, 4, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null), (i) null, h10, 0, 2);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C6282e(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ErrorStateWithoutCTA$lambda$4(int i10, C1500m mVar, int i11) {
        ErrorStateWithoutCTA(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SurveyError(io.intercom.android.sdk.survey.SurveyState.Error r33, k0.i r34, Y.C1500m r35, int r36, int r37) {
        /*
            r0 = r33
            r1 = r36
            r2 = r37
            java.lang.String r3 = "state"
            kotlin.jvm.internal.C6496s.h(r0, r3)
            r3 = 805293226(0x2fffccaa, float:4.6529652E-10)
            r4 = r35
            Y.m r3 = r4.h(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x001b
            r4 = r1 | 6
            goto L_0x002b
        L_0x001b:
            r4 = r1 & 14
            if (r4 != 0) goto L_0x002a
            boolean r4 = r3.S(r0)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r1
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r5 = r2 & 2
            r15 = 16
            r10 = 32
            if (r5 == 0) goto L_0x0038
            r4 = r4 | 48
        L_0x0035:
            r6 = r34
            goto L_0x0048
        L_0x0038:
            r6 = r1 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x0035
            r6 = r34
            boolean r7 = r3.S(r6)
            if (r7 == 0) goto L_0x0046
            r7 = r10
            goto L_0x0047
        L_0x0046:
            r7 = r15
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r4 = r4 & 91
            r7 = 18
            if (r4 != r7) goto L_0x005a
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x0055
            goto L_0x005a
        L_0x0055:
            r3.I()
            goto L_0x0190
        L_0x005a:
            if (r5 == 0) goto L_0x0060
            k0.i$a r4 = k0.i.f23074a
            r13 = r4
            goto L_0x0061
        L_0x0060:
            r13 = r6
        L_0x0061:
            r4 = 0
            r5 = 0
            r6 = 1
            k0.i r4 = androidx.compose.foundation.layout.q.f(r13, r4, r6, r5)
            k0.c$a r29 = k0.c.f23044a
            k0.c r5 = r29.e()
            r14 = 0
            H0.F r5 = androidx.compose.foundation.layout.d.h(r5, r14)
            int r6 = Y.C1494j.a(r3, r14)
            Y.y r7 = r3.p()
            k0.i r4 = k0.h.e(r3, r4)
            J0.g$a r8 = J0.C1241g.f3853J
            yf.a r9 = r8.a()
            Y.f r11 = r3.j()
            if (r11 != 0) goto L_0x008e
            Y.C1494j.c()
        L_0x008e:
            r3.F()
            boolean r11 = r3.f()
            if (r11 == 0) goto L_0x009b
            r3.U(r9)
            goto L_0x009e
        L_0x009b:
            r3.q()
        L_0x009e:
            Y.m r9 = Y.F1.a(r3)
            yf.p r11 = r8.c()
            Y.F1.b(r9, r5, r11)
            yf.p r5 = r8.e()
            Y.F1.b(r9, r7, r5)
            yf.p r5 = r8.b()
            boolean r7 = r9.f()
            if (r7 != 0) goto L_0x00c8
            java.lang.Object r7 = r9.A()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C6496s.c(r7, r11)
            if (r7 != 0) goto L_0x00d6
        L_0x00c8:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.r(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.V(r6, r5)
        L_0x00d6:
            yf.p r5 = r8.d()
            Y.F1.b(r9, r4, r5)
            androidx.compose.foundation.layout.f r12 = androidx.compose.foundation.layout.f.f12848a
            int r4 = r33.getMessageResId()
            java.lang.String r4 = M0.i.a(r4, r3, r14)
            io.intercom.android.sdk.survey.SurveyUiColors r5 = r33.getSurveyUiColors()
            long r6 = r5.m426getOnBackground0d7_KjU()
            r5 = 36
            long r8 = c1.w.f(r5)
            V0.p$a r5 = V0.p.f8210b
            V0.p r11 = r5.a()
            b1.j$a r5 = b1.j.f19110b
            int r16 = r5.a()
            k0.i$a r5 = k0.i.f23074a
            float r10 = (float) r10
            float r14 = c1.h.j(r10)
            float r10 = c1.h.j(r10)
            k0.i r10 = androidx.compose.foundation.layout.n.j(r5, r14, r10)
            k0.c r14 = r29.m()
            k0.i r10 = r12.e(r10, r14)
            r14 = r5
            r5 = r10
            b1.j r16 = b1.j.h(r16)
            r27 = 0
            r28 = 130512(0x1fdd0, float:1.82886E-40)
            r10 = 0
            r17 = 0
            r30 = r12
            r12 = r17
            r17 = 0
            r31 = r13
            r32 = r14
            r13 = r17
            r17 = 0
            r15 = r17
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 199680(0x30c00, float:2.79811E-40)
            r25 = r3
            V.T0.b(r4, r5, r6, r8, r10, r11, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = -803498879(0xffffffffd01b9481, float:-1.04408033E10)
            r3.T(r4)
            boolean r4 = r0 instanceof io.intercom.android.sdk.survey.SurveyState.Error.WithCTA
            if (r4 == 0) goto L_0x0188
            r4 = 16
            float r4 = (float) r4
            float r4 = c1.h.j(r4)
            r5 = r32
            k0.i r4 = androidx.compose.foundation.layout.n.i(r5, r4)
            k0.c r5 = r29.b()
            r6 = r30
            k0.i r4 = r6.e(r4, r5)
            r5 = r0
            io.intercom.android.sdk.survey.SurveyState$Error$WithCTA r5 = (io.intercom.android.sdk.survey.SurveyState.Error.WithCTA) r5
            yf.a r7 = r5.getOnClick()
            io.intercom.android.sdk.survey.SurveyUiColors r9 = r5.getSurveyUiColors()
            int r5 = io.intercom.android.sdk.R.string.intercom_retry
            r6 = 0
            java.lang.String r5 = M0.i.a(r5, r3, r6)
            r11 = 0
            r12 = 20
            r6 = 0
            r8 = 0
            r10 = r3
            io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0188:
            r3.M()
            r3.u()
            r6 = r31
        L_0x0190:
            Y.Y0 r3 = r3.k()
            if (r3 == 0) goto L_0x019e
            io.intercom.android.sdk.survey.ui.components.f r4 = new io.intercom.android.sdk.survey.ui.components.f
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x019e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.components.ErrorComponentKt.SurveyError(io.intercom.android.sdk.survey.SurveyState$Error, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyError$lambda$1(SurveyState.Error error, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(error, "$state");
        SurveyError(error, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
