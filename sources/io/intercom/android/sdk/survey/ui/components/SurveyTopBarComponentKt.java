package io.intercom.android.sdk.survey.ui.components;

import Y.A1;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import t0.C2605f;
import yf.C6787a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/survey/TopBarState;", "topBarState", "Lkotlin/Function0;", "Llf/M;", "onClose", "Lk0/i;", "modifier", "SurveyTopBar", "(Lio/intercom/android/sdk/survey/TopBarState;Lyf/a;Lk0/i;LY/m;II)V", "SurveyAvatarBar", "(LY/m;I)V", "NoTopBar", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SurveyTopBarComponentKt {
    public static final void NoTopBar(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1502798722);
        if (i10 != 0 || !h10.i()) {
            SurveyTopBar(new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), new ProgressBarState(false, 0.0f, 3, (DefaultConstructorMarker) null)), new N(), (i) null, h10, 48, 4);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new O(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M NoTopBar$lambda$11() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M NoTopBar$lambda$12(int i10, C1500m mVar, int i11) {
        NoTopBar(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void SurveyAvatarBar(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(1511683997);
        if (i10 != 0 || !h10.i()) {
            Avatar build = new Avatar.Builder().withInitials("VR").build();
            C6496s.g(build, "build(...)");
            SurveyTopBar(new TopBarState.SenderTopBarState(build, "Vinesh", SurveyComponentKt.getEmptyAppConfig(), false, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), (ProgressBarState) null, 32, (DefaultConstructorMarker) null), new T(), (i) null, h10, 56, 4);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new U(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyAvatarBar$lambda$10(int i10, C1500m mVar, int i11) {
        SurveyAvatarBar(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyAvatarBar$lambda$9() {
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: yf.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: k0.i$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void SurveyTopBar(io.intercom.android.sdk.survey.TopBarState r38, yf.C6787a r39, k0.i r40, Y.C1500m r41, int r42, int r43) {
        /*
            r1 = r38
            r9 = r39
            r10 = r42
            r0 = 48
            r2 = 4
            r3 = 14
            r11 = 6
            java.lang.String r4 = "topBarState"
            kotlin.jvm.internal.C6496s.h(r1, r4)
            java.lang.String r4 = "onClose"
            kotlin.jvm.internal.C6496s.h(r9, r4)
            r4 = -295801747(0xffffffffee5e6c6d, float:-1.7209188E28)
            r5 = r41
            Y.m r8 = r5.h(r4)
            r7 = 1
            r4 = r43 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0028
            r4 = r10 | 6
            goto L_0x0038
        L_0x0028:
            r4 = r10 & 14
            if (r4 != 0) goto L_0x0037
            boolean r4 = r8.S(r1)
            if (r4 == 0) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0034:
            r4 = r5
        L_0x0035:
            r4 = r4 | r10
            goto L_0x0038
        L_0x0037:
            r4 = r10
        L_0x0038:
            r6 = r43 & 2
            r12 = 16
            if (r6 == 0) goto L_0x0040
            r4 = r4 | r0
            goto L_0x004f
        L_0x0040:
            r6 = r10 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004f
            boolean r6 = r8.C(r9)
            if (r6 == 0) goto L_0x004d
            r6 = 32
            goto L_0x004e
        L_0x004d:
            r6 = r12
        L_0x004e:
            r4 = r4 | r6
        L_0x004f:
            r2 = r43 & 4
            if (r2 == 0) goto L_0x0058
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0055:
            r6 = r40
            goto L_0x006a
        L_0x0058:
            r6 = r10 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L_0x0055
            r6 = r40
            boolean r13 = r8.S(r6)
            if (r13 == 0) goto L_0x0067
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r13 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r4 = r4 | r13
        L_0x006a:
            r4 = r4 & 731(0x2db, float:1.024E-42)
            r13 = 146(0x92, float:2.05E-43)
            if (r4 != r13) goto L_0x007e
            boolean r4 = r8.i()
            if (r4 != 0) goto L_0x0077
            goto L_0x007e
        L_0x0077:
            r8.I()
            r3 = r6
            r4 = r8
            goto L_0x0431
        L_0x007e:
            if (r2 == 0) goto L_0x0083
            k0.i$a r2 = k0.i.f23074a
            r6 = r2
        L_0x0083:
            C.c r2 = C.C1085c.f882a
            C.c$m r4 = r2.g()
            k0.c$a r13 = k0.c.f23044a
            k0.c$b r14 = r13.k()
            r15 = 0
            H0.F r4 = C.C1090h.a(r4, r14, r8, r15)
            int r14 = Y.C1494j.a(r8, r15)
            Y.y r3 = r8.p()
            k0.i r0 = k0.h.e(r8, r6)
            J0.g$a r17 = J0.C1241g.f3853J
            yf.a r15 = r17.a()
            Y.f r18 = r8.j()
            if (r18 != 0) goto L_0x00af
            Y.C1494j.c()
        L_0x00af:
            r8.F()
            boolean r18 = r8.f()
            if (r18 == 0) goto L_0x00bc
            r8.U(r15)
            goto L_0x00bf
        L_0x00bc:
            r8.q()
        L_0x00bf:
            Y.m r15 = Y.F1.a(r8)
            yf.p r7 = r17.c()
            Y.F1.b(r15, r4, r7)
            yf.p r4 = r17.e()
            Y.F1.b(r15, r3, r4)
            yf.p r3 = r17.b()
            boolean r4 = r15.f()
            if (r4 != 0) goto L_0x00e9
            java.lang.Object r4 = r15.A()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r7)
            if (r4 != 0) goto L_0x00f7
        L_0x00e9:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r15.r(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r15.V(r4, r3)
        L_0x00f7:
            yf.p r3 = r17.d()
            Y.F1.b(r15, r0, r3)
            C.k r0 = C.C1093k.f978a
            k0.i$a r0 = k0.i.f23074a
            float r7 = (float) r12
            float r3 = c1.h.j(r7)
            k0.i r3 = androidx.compose.foundation.layout.q.i(r0, r3)
            C.a0.a(r3, r8, r11)
            k0.c$c r3 = r13.i()
            float r4 = c1.h.j(r7)
            r15 = 0
            r14 = 0
            k0.i r4 = androidx.compose.foundation.layout.n.k(r0, r4, r15, r5, r14)
            r5 = 1
            k0.i r4 = androidx.compose.foundation.layout.q.h(r4, r15, r5, r14)
            C.c$f r5 = r2.d()
            r12 = 54
            H0.F r3 = C.W.b(r5, r3, r8, r12)
            r5 = 0
            int r12 = Y.C1494j.a(r8, r5)
            Y.y r5 = r8.p()
            k0.i r4 = k0.h.e(r8, r4)
            yf.a r14 = r17.a()
            Y.f r20 = r8.j()
            if (r20 != 0) goto L_0x0145
            Y.C1494j.c()
        L_0x0145:
            r8.F()
            boolean r20 = r8.f()
            if (r20 == 0) goto L_0x0152
            r8.U(r14)
            goto L_0x0155
        L_0x0152:
            r8.q()
        L_0x0155:
            Y.m r14 = Y.F1.a(r8)
            yf.p r15 = r17.c()
            Y.F1.b(r14, r3, r15)
            yf.p r3 = r17.e()
            Y.F1.b(r14, r5, r3)
            yf.p r3 = r17.b()
            boolean r5 = r14.f()
            if (r5 != 0) goto L_0x017f
            java.lang.Object r5 = r14.A()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r15)
            if (r5 != 0) goto L_0x018d
        L_0x017f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r14.r(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r14.V(r5, r3)
        L_0x018d:
            yf.p r3 = r17.d()
            Y.F1.b(r14, r4, r3)
            C.Z r3 = C.Z.f873a
            boolean r3 = r1 instanceof io.intercom.android.sdk.survey.TopBarState.SenderTopBarState
            if (r3 == 0) goto L_0x02bd
            r3 = 359796343(0x15720e77, float:4.8882922E-26)
            r8.T(r3)
            Y.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r8.m(r3)
            android.content.Context r3 = (android.content.Context) r3
            int r4 = io.intercom.android.sdk.R.string.intercom_teammate_from_company
            io.intercom.android.sdk.utilities.Phrase r3 = io.intercom.android.sdk.utilities.Phrase.from((android.content.Context) r3, (int) r4)
            r4 = r1
            io.intercom.android.sdk.survey.TopBarState$SenderTopBarState r4 = (io.intercom.android.sdk.survey.TopBarState.SenderTopBarState) r4
            java.lang.String r5 = r4.getSenderName()
            java.lang.String r12 = "name"
            io.intercom.android.sdk.utilities.Phrase r3 = r3.put((java.lang.String) r12, (java.lang.CharSequence) r5)
            io.intercom.android.sdk.identity.AppConfig r5 = r4.getAppConfig()
            java.lang.String r5 = r5.getName()
            java.lang.String r12 = "company"
            io.intercom.android.sdk.utilities.Phrase r3 = r3.put((java.lang.String) r12, (java.lang.CharSequence) r5)
            java.lang.CharSequence r3 = r3.format()
            k0.c$c r5 = r13.i()
            C.c$e r2 = r2.f()
            r12 = 48
            H0.F r2 = C.W.b(r2, r5, r8, r12)
            r5 = 0
            int r12 = Y.C1494j.a(r8, r5)
            Y.y r13 = r8.p()
            k0.i r14 = k0.h.e(r8, r0)
            yf.a r15 = r17.a()
            Y.f r16 = r8.j()
            if (r16 != 0) goto L_0x01f7
            Y.C1494j.c()
        L_0x01f7:
            r8.F()
            boolean r16 = r8.f()
            if (r16 == 0) goto L_0x0204
            r8.U(r15)
            goto L_0x0207
        L_0x0204:
            r8.q()
        L_0x0207:
            Y.m r15 = Y.F1.a(r8)
            yf.p r5 = r17.c()
            Y.F1.b(r15, r2, r5)
            yf.p r2 = r17.e()
            Y.F1.b(r15, r13, r2)
            yf.p r2 = r17.b()
            boolean r5 = r15.f()
            if (r5 != 0) goto L_0x0231
            java.lang.Object r5 = r15.A()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r13)
            if (r5 != 0) goto L_0x023f
        L_0x0231:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r15.r(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r15.V(r5, r2)
        L_0x023f:
            yf.p r2 = r17.d()
            Y.F1.b(r15, r14, r2)
            io.intercom.android.sdk.models.Avatar r12 = r4.getAvatar()
            io.intercom.android.sdk.identity.AppConfig r2 = r4.getAppConfig()
            int r2 = r2.getSecondaryColor()
            long r13 = r0.C2550z0.b(r2)
            r17 = 8
            r2 = 4
            r15 = 0
            r5 = 0
            r37 = r7
            r7 = 0
            r16 = r8
            r18 = r2
            io.intercom.android.sdk.survey.ui.components.CircularAvatarComponentKt.m465CircularAvataraMcp0Q(r12, r13, r15, r16, r17, r18)
            r2 = 8
            float r2 = (float) r2
            float r2 = c1.h.j(r2)
            k0.i r2 = androidx.compose.foundation.layout.q.r(r0, r2)
            C.a0.a(r2, r8, r11)
            java.lang.String r12 = r3.toString()
            r2 = 14
            long r16 = c1.w.f(r2)
            V0.p$a r2 = V0.p.f8210b
            V0.p r19 = r2.c()
            b1.t$a r2 = b1.t.f19154a
            int r27 = r2.b()
            io.intercom.android.sdk.survey.SurveyUiColors r2 = r4.getSurveyUiColors()
            long r14 = r2.m426getOnBackground0d7_KjU()
            r35 = 3120(0xc30, float:4.372E-42)
            r36 = 120786(0x1d7d2, float:1.69257E-40)
            r13 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 1
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 199680(0x30c00, float:2.79811E-40)
            r33 = r8
            V.T0.b(r12, r13, r14, r16, r18, r19, r20, r21, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r8.u()
            r8.M()
            r12 = 1
            goto L_0x02db
        L_0x02bd:
            r37 = r7
            r5 = 0
            r7 = 0
            boolean r2 = r1 instanceof io.intercom.android.sdk.survey.TopBarState.NoTopBarState
            if (r2 == 0) goto L_0x0449
            r2 = 360841663(0x158201bf, float:5.2509337E-26)
            r8.T(r2)
            r12 = 1
            float r2 = (float) r12
            float r2 = c1.h.j(r2)
            k0.i r2 = androidx.compose.foundation.layout.q.r(r0, r2)
            C.a0.a(r2, r8, r11)
            r8.M()
        L_0x02db:
            r2 = 1535664392(0x5b886108, float:7.6774568E16)
            r8.T(r2)
            boolean r2 = r38.getShowDismissButton()
            if (r2 == 0) goto L_0x0328
            Q.b r2 = Q.b.f5154a
            Q.b$a r2 = r2.a()
            x0.d r13 = S.d.a(r2)
            int r2 = io.intercom.android.sdk.R.string.intercom_dismiss
            java.lang.String r14 = M0.i.a(r2, r8, r7)
            io.intercom.android.sdk.survey.SurveyUiColors r2 = r38.getSurveyUiColors()
            long r15 = r2.m426getOnBackground0d7_KjU()
            r17 = 7
            r18 = 0
            r3 = 0
            r4 = 0
            r19 = 0
            r2 = r0
            r5 = r19
            r24 = r6
            r6 = r39
            r20 = r37
            r7 = r17
            r40 = r8
            r8 = r18
            k0.i r2 = androidx.compose.foundation.d.d(r2, r3, r4, r5, r6, r7, r8)
            r18 = 0
            r19 = 0
            r3 = r12
            r12 = r13
            r13 = r14
            r14 = r2
            r17 = r40
            V.V.b(r12, r13, r14, r15, r17, r18, r19)
            goto L_0x032f
        L_0x0328:
            r24 = r6
            r40 = r8
            r3 = r12
            r20 = r37
        L_0x032f:
            r40.M()
            r40.u()
            r2 = -1116808288(0xffffffffbd6edba0, float:-0.05831492)
            r4 = r40
            r4.T(r2)
            io.intercom.android.sdk.survey.ProgressBarState r2 = r38.getProgressBarState()
            r5 = -1116806779(0xffffffffbd6ee185, float:-0.05832054)
            r4.T(r5)
            boolean r5 = r2.isVisible()
            if (r5 == 0) goto L_0x0424
            float r5 = c1.h.j(r20)
            k0.i r5 = androidx.compose.foundation.layout.q.i(r0, r5)
            C.a0.a(r5, r4, r11)
            float r12 = r2.getProgress()
            r2 = 200(0xc8, float:2.8E-43)
            r5 = 0
            r6 = 0
            w.q0 r13 = w.C2798j.j(r2, r5, r6, r11, r6)
            r18 = 48
            r19 = 28
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = r4
            Y.A1 r2 = w.C2786c.d(r12, r13, r14, r15, r16, r17, r18, r19)
            io.intercom.android.sdk.survey.SurveyUiColors r7 = r38.getSurveyUiColors()
            long r7 = r7.m422getBackground0d7_KjU()
            boolean r7 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m718isDarkColor8_81llA(r7)
            if (r7 == 0) goto L_0x038a
            r7 = 1728053247(0x66ffffff, float:6.0446287E23)
            long r7 = r0.C2550z0.b(r7)
        L_0x0387:
            r16 = r7
            goto L_0x0391
        L_0x038a:
            r7 = 1291845632(0x4d000000, float:1.34217728E8)
            long r7 = r0.C2550z0.b(r7)
            goto L_0x0387
        L_0x0391:
            io.intercom.android.sdk.survey.SurveyUiColors r7 = r38.getSurveyUiColors()
            long r11 = r7.m422getBackground0d7_KjU()
            long r13 = r7.m423getButton0d7_KjU()
            boolean r8 = r0.C2544x0.q(r11, r13)
            if (r8 == 0) goto L_0x03b9
            long r11 = r7.m422getBackground0d7_KjU()
            boolean r8 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m720isWhite8_81llA(r11)
            if (r8 == 0) goto L_0x03b9
            r7 = 3439329279(0xccffffff, double:1.6992544415E-314)
            long r7 = r0.C2550z0.d(r7)
        L_0x03b6:
            r14 = r7
            r7 = 0
            goto L_0x03e0
        L_0x03b9:
            long r11 = r7.m422getBackground0d7_KjU()
            long r13 = r7.m423getButton0d7_KjU()
            boolean r8 = r0.C2544x0.q(r11, r13)
            if (r8 == 0) goto L_0x03db
            long r11 = r7.m422getBackground0d7_KjU()
            boolean r8 = io.intercom.android.sdk.utilities.ColorExtensionsKt.m716isBlack8_81llA(r11)
            if (r8 == 0) goto L_0x03db
            r7 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r7 = r0.C2550z0.d(r7)
            goto L_0x03b6
        L_0x03db:
            long r7 = r7.m423getButton0d7_KjU()
            goto L_0x03b6
        L_0x03e0:
            k0.i r13 = androidx.compose.foundation.layout.q.h(r0, r7, r3, r6)
            float r0 = (float) r5
            float r19 = c1.h.j(r0)
            r0.i2$a r0 = r0.i2.f25529a
            int r18 = r0.c()
            r0 = 1535711889(0x5b891a91, float:7.7182564E16)
            r4.T(r0)
            boolean r0 = r4.S(r2)
            java.lang.Object r3 = r4.A()
            if (r0 != 0) goto L_0x0407
            Y.m$a r0 = Y.C1500m.f10026a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x040f
        L_0x0407:
            io.intercom.android.sdk.survey.ui.components.P r3 = new io.intercom.android.sdk.survey.ui.components.P
            r3.<init>(r2)
            r4.r(r3)
        L_0x040f:
            r12 = r3
            yf.a r12 = (yf.C6787a) r12
            r4.M()
            io.intercom.android.sdk.survey.ui.components.Q r20 = new io.intercom.android.sdk.survey.ui.components.Q
            r20.<init>()
            r22 = 1769520(0x1b0030, float:2.479626E-39)
            r23 = 0
            r21 = r4
            V.C1400p0.b(r12, r13, r14, r16, r18, r19, r20, r21, r22, r23)
        L_0x0424:
            r4.M()
            lf.M r0 = lf.C6514M.f71813a
            r4.M()
            r4.u()
            r3 = r24
        L_0x0431:
            Y.Y0 r6 = r4.k()
            if (r6 == 0) goto L_0x0448
            io.intercom.android.sdk.survey.ui.components.S r7 = new io.intercom.android.sdk.survey.ui.components.S
            r0 = r7
            r1 = r38
            r2 = r39
            r4 = r42
            r5 = r43
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0448:
            return
        L_0x0449:
            r4 = r8
            r0 = 1535625226(0x5b87c80a, float:7.6438134E16)
            r4.T(r0)
            r4.M()
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt.SurveyTopBar(io.intercom.android.sdk.survey.TopBarState, yf.a, k0.i, Y.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(A1 a12) {
        C6496s.h(a12, "$animateFloatAsState");
        return ((Number) a12.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyTopBar$lambda$7$lambda$6$lambda$5(C2605f fVar) {
        C6496s.h(fVar, "$this$LinearProgressIndicator");
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M SurveyTopBar$lambda$8(TopBarState topBarState, C6787a aVar, i iVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(topBarState, "$topBarState");
        C6496s.h(aVar, "$onClose");
        SurveyTopBar(topBarState, aVar, iVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }
}
