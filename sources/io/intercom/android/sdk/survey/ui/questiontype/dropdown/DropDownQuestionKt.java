package io.intercom.android.sdk.survey.ui.questiontype.dropdown;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import C.W;
import C.Z;
import C.a0;
import H0.F;
import I.a;
import J0.C1241g;
import O0.g;
import Q0.A;
import Q0.T;
import V.B0;
import V.C1375d;
import V.T0;
import V.V;
import V0.o;
import Y.C1494j;
import Y.C1500m;
import Y.C1510r0;
import Y.C1523y;
import Y.F1;
import Y.M0;
import Y.Y0;
import Y.o1;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.platform.C1644k0;
import b1.C1869a;
import b1.C1876h;
import b1.j;
import b1.k;
import b1.s;
import c1.h;
import com.BV.LinearGradient.LinearGradientManager;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.theme.IntercomColors;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.ui.theme.IntercomTypography;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.UUID;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import o0.C2342e;
import p0.e;
import r0.C2544x0;
import r0.C2550z0;
import r0.e2;
import r0.g2;
import t0.C2606g;
import x.C2866e;
import x.C2868g;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aW\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u000f\u0010\u0012\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u0002"}, d2 = {"Lk0/i;", "modifier", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DropDownQuestionModel;", "dropDownQuestionModel", "Lio/intercom/android/sdk/survey/ui/models/Answer;", "answer", "Lkotlin/Function1;", "Llf/M;", "onAnswer", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "colors", "Lkotlin/Function0;", "questionHeader", "DropDownQuestion", "(Lk0/i;Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DropDownQuestionModel;Lio/intercom/android/sdk/survey/ui/models/Answer;Lyf/l;Lio/intercom/android/sdk/survey/SurveyUiColors;Lyf/p;LY/m;II)V", "DropDownQuestionPreview", "(LY/m;I)V", "DropDownSelectedQuestionPreview", "ColoredDropDownSelectedQuestionPreview", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$DropDownQuestionModel;", "", "expanded", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DropDownQuestionKt {
    /* access modifiers changed from: private */
    public static final SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel;

    static {
        String uuid = UUID.randomUUID().toString();
        C6496s.g(uuid, "toString(...)");
        dropDownQuestionModel = new SurveyData.Step.Question.DropDownQuestionModel(uuid, C6565s.e(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText("Is this a preview?")), true, C6565s.q("Option A", "Option B", "Option C"), "Please Select", (Integer) null, 32, (DefaultConstructorMarker) null);
    }

    public static final void ColoredDropDownSelectedQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-2103500414);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m487getLambda4$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new f(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M ColoredDropDownSelectedQuestionPreview$lambda$14(int i10, C1500m mVar, int i11) {
        ColoredDropDownSelectedQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void DropDownQuestion(i iVar, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, C6798l lVar, SurveyUiColors surveyUiColors, p pVar, C1500m mVar, int i10, int i11) {
        i iVar2;
        Answer answer2;
        p pVar2;
        boolean z10;
        long r10;
        long d10;
        long j10;
        String str;
        C1510r0 r0Var;
        C6496s.h(dropDownQuestionModel2, "dropDownQuestionModel");
        C6496s.h(lVar, "onAnswer");
        C6496s.h(surveyUiColors, LinearGradientManager.PROP_COLORS);
        C1500m h10 = mVar.h(1475245134);
        if ((i11 & 1) != 0) {
            iVar2 = i.f23074a;
        } else {
            iVar2 = iVar;
        }
        if ((i11 & 4) != 0) {
            answer2 = Answer.NoAnswer.InitialNoAnswer.INSTANCE;
        } else {
            answer2 = answer;
        }
        if ((i11 & 32) != 0) {
            pVar2 = ComposableSingletons$DropDownQuestionKt.INSTANCE.m484getLambda1$intercom_sdk_base_release();
        } else {
            pVar2 = pVar;
        }
        h10.T(1842846722);
        Object A10 = h10.A();
        C1500m.a aVar = C1500m.f10026a;
        if (A10 == aVar.a()) {
            A10 = u1.d(Boolean.FALSE, (o1) null, 2, (Object) null);
            h10.r(A10);
        }
        C1510r0 r0Var2 = (C1510r0) A10;
        h10.M();
        if (DropDownQuestion$lambda$1(r0Var2) || !(answer2 instanceof Answer.NoAnswer)) {
            z10 = true;
        } else {
            z10 = false;
        }
        h10.T(1842850501);
        if (z10) {
            r10 = surveyUiColors.m423getButton0d7_KjU();
        } else {
            r10 = IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m678getBackground0d7_KjU();
        }
        long j11 = r10;
        h10.M();
        if (z10) {
            d10 = ColorExtensionsKt.m712generateTextColor8_81llA(surveyUiColors.m423getButton0d7_KjU());
        } else {
            d10 = C2550z0.d(4285756278L);
        }
        long j12 = d10;
        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
        int i12 = IntercomTheme.$stable;
        long o10 = C2544x0.o(intercomTheme.getColors(h10, i12).m700getPrimaryText0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        float j13 = h.j((float) 1);
        C2544x0 r16 = surveyUiColors.m425getDropDownSelectedColorQN2ZGVo();
        if (r16 != null) {
            j10 = r16.y();
        } else {
            j10 = j12;
        }
        e eVar = (e) h10.m(C1644k0.f());
        c.a aVar2 = c.f23044a;
        F h11 = d.h(aVar2.o(), false);
        int a10 = C1494j.a(h10, 0);
        C1523y p10 = h10.p();
        i e10 = k0.h.e(h10, iVar2);
        C1241g.a aVar3 = C1241g.f3853J;
        i iVar3 = iVar2;
        C6787a a11 = aVar3.a();
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
        e eVar2 = eVar;
        F1.b(a12, h11, aVar3.c());
        F1.b(a12, p10, aVar3.e());
        p b10 = aVar3.b();
        if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
            a12.r(Integer.valueOf(a10));
            a12.V(Integer.valueOf(a10), b10);
        }
        F1.b(a12, e10, aVar3.d());
        f fVar = f.f12848a;
        i.a aVar4 = i.f23074a;
        C1085c cVar = C1085c.f882a;
        F a13 = C1090h.a(cVar.g(), aVar2.k(), h10, 0);
        int a14 = C1494j.a(h10, 0);
        C1523y p11 = h10.p();
        i e11 = k0.h.e(h10, aVar4);
        C6787a a15 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a15);
        } else {
            h10.q();
        }
        C1500m a16 = F1.a(h10);
        Answer answer3 = answer2;
        F1.b(a16, a13, aVar3.c());
        F1.b(a16, p11, aVar3.e());
        p b11 = aVar3.b();
        if (a16.f() || !C6496s.c(a16.A(), Integer.valueOf(a14))) {
            a16.r(Integer.valueOf(a14));
            a16.V(Integer.valueOf(a14), b11);
        }
        F1.b(a16, e11, aVar3.d());
        C1093k kVar = C1093k.f978a;
        pVar2.invoke(h10, Integer.valueOf((i10 >> 15) & 14));
        float f10 = (float) 8;
        a0.a(q.i(aVar4, h.j(f10)), h10, 6);
        i a17 = C2342e.a(C2866e.f(q.h(aVar4, 0.0f, 1, (Object) null), j13, o10, intercomTheme.getShapes(h10, i12).e()), intercomTheme.getShapes(h10, i12).e());
        F a18 = C1090h.a(cVar.g(), aVar2.k(), h10, 0);
        int a19 = C1494j.a(h10, 0);
        C1523y p12 = h10.p();
        i e12 = k0.h.e(h10, a17);
        C6787a a20 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a20);
        } else {
            h10.q();
        }
        C1500m a21 = F1.a(h10);
        F1.b(a21, a18, aVar3.c());
        F1.b(a21, p12, aVar3.e());
        p b12 = aVar3.b();
        if (a21.f() || !C6496s.c(a21.A(), Integer.valueOf(a19))) {
            a21.r(Integer.valueOf(a19));
            a21.V(Integer.valueOf(a19), b12);
        }
        F1.b(a21, e12, aVar3.d());
        i d11 = b.d(q.h(aVar4, 0.0f, 1, (Object) null), j11, (g2) null, 2, (Object) null);
        h10.T(-585751888);
        Object A11 = h10.A();
        if (A11 == aVar.a()) {
            A11 = new g(r0Var2);
            h10.r(A11);
        }
        h10.M();
        i d12 = androidx.compose.foundation.d.d(d11, false, (String) null, (g) null, (C6787a) A11, 7, (Object) null);
        F b13 = W.b(cVar.d(), aVar2.i(), h10, 54);
        int a22 = C1494j.a(h10, 0);
        C1523y p13 = h10.p();
        i e13 = k0.h.e(h10, d12);
        C6787a a23 = aVar3.a();
        if (h10.j() == null) {
            C1494j.c();
        }
        h10.F();
        if (h10.f()) {
            h10.U(a23);
        } else {
            h10.q();
        }
        C1500m a24 = F1.a(h10);
        F1.b(a24, b13, aVar3.c());
        F1.b(a24, p13, aVar3.e());
        p b14 = aVar3.b();
        if (a24.f() || !C6496s.c(a24.A(), Integer.valueOf(a22))) {
            a24.r(Integer.valueOf(a22));
            a24.V(Integer.valueOf(a22), b14);
        }
        F1.b(a24, e13, aVar3.d());
        Z z11 = Z.f873a;
        h10.T(602811706);
        if (dropDownQuestionModel2.getPlaceHolderStringRes() != null) {
            str = M0.i.a(dropDownQuestionModel2.getPlaceHolderStringRes().intValue(), h10, 0);
        } else {
            str = dropDownQuestionModel2.getPlaceholder();
        }
        h10.M();
        Answer answer4 = answer3;
        if (answer4 instanceof Answer.SingleAnswer) {
            str = ((Answer.SingleAnswer) answer4).getAnswer();
        }
        float f11 = (float) 16;
        C1510r0 r0Var3 = r0Var2;
        p pVar3 = pVar2;
        T0.b(str, q.x(n.i(aVar4, h.j(f11)), (c) null, false, 3, (Object) null), 0, 0, (V0.n) null, (V0.p) null, (V0.h) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C6798l) null, T.c(intercomTheme.getTypography(h10, i12).getType04(), j12, 0, (V0.p) null, (V0.n) null, (o) null, (V0.h) null, (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (C2606g) null, 0, 0, 0, (b1.q) null, (A) null, (C1876h) null, 0, 0, (s) null, 16777214, (Object) null), h10, 48, 0, 65532);
        V.b(S.b.a(Q.b.f5154a.a()), M0.i.a(R.string.intercom_choose_one, h10, 0), n.i(aVar4, h.j(f11)), j10, h10, 384, 0);
        h10.u();
        boolean DropDownQuestion$lambda$1 = DropDownQuestion$lambda$1(r0Var3);
        i g10 = q.g(aVar4, 0.8f);
        int i13 = i12;
        IntercomTheme intercomTheme2 = intercomTheme;
        long r14 = intercomTheme2.getColors(h10, i13).m678getBackground0d7_KjU();
        a e14 = intercomTheme2.getShapes(h10, i13).e();
        float j14 = h.j(f10);
        h10.T(-585711023);
        Object A12 = h10.A();
        if (A12 == aVar.a()) {
            r0Var = r0Var3;
            A12 = new h(r0Var);
            h10.r(A12);
        } else {
            r0Var = r0Var3;
        }
        h10.M();
        C1375d.a(DropDownQuestion$lambda$1, (C6787a) A12, g10, 0, (androidx.compose.foundation.o) null, (androidx.compose.ui.window.s) null, e14, r14, 0.0f, j14, (C2868g) null, g0.c.e(17506981, true, new DropDownQuestionKt$DropDownQuestion$1$1$1$4(dropDownQuestionModel2, eVar2, lVar, r0Var), h10, 54), h10, 805306800, 48, 1336);
        h10.u();
        h10.u();
        h10.u();
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new i(iVar3, dropDownQuestionModel2, answer4, lVar, surveyUiColors, pVar3, i10, i11));
        }
    }

    private static final boolean DropDownQuestion$lambda$1(C1510r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C6514M DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$4$lambda$3(C1510r0 r0Var) {
        C6496s.h(r0Var, "$expanded$delegate");
        DropDownQuestion$lambda$2(r0Var, true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M DropDownQuestion$lambda$10$lambda$9$lambda$8$lambda$7$lambda$6(C1510r0 r0Var) {
        C6496s.h(r0Var, "$expanded$delegate");
        DropDownQuestion$lambda$2(r0Var, false);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M DropDownQuestion$lambda$11(i iVar, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel2, Answer answer, C6798l lVar, SurveyUiColors surveyUiColors, p pVar, int i10, int i11, C1500m mVar, int i12) {
        C6496s.h(dropDownQuestionModel2, "$dropDownQuestionModel");
        C6496s.h(lVar, "$onAnswer");
        C6496s.h(surveyUiColors, "$colors");
        DropDownQuestion(iVar, dropDownQuestionModel2, answer, lVar, surveyUiColors, pVar, mVar, M0.a(i10 | 1), i11);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final void DropDownQuestion$lambda$2(C1510r0 r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    public static final void DropDownQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(281876673);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m485getLambda2$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DropDownQuestionPreview$lambda$12(int i10, C1500m mVar, int i11) {
        DropDownQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    public static final void DropDownSelectedQuestionPreview(C1500m mVar, int i10) {
        C1500m h10 = mVar.h(-891294020);
        if (i10 != 0 || !h10.i()) {
            IntercomThemeKt.IntercomTheme((IntercomColors) null, (IntercomTypography) null, (B0) null, ComposableSingletons$DropDownQuestionKt.INSTANCE.m486getLambda3$intercom_sdk_base_release(), h10, 3072, 7);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new e(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M DropDownSelectedQuestionPreview$lambda$13(int i10, C1500m mVar, int i11) {
        DropDownSelectedQuestionPreview(mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }
}
