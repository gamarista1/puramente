package io.intercom.android.sdk.survey.ui.components;

import C.C1085c;
import C.C1088f;
import C.C1090h;
import C.C1093k;
import C.a0;
import H0.F;
import J0.C1241g;
import O0.t;
import O0.v;
import Ug.K;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import Y.P;
import android.content.Context;
import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.m;
import androidx.compose.foundation.o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c1.h;
import com.adjust.sdk.network.ErrorCodes;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.survey.block.SuffixText;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import k0.c;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import qf.C6658d;
import r0.C2544x0;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class SurveyComponentKt$SurveyContent$1 implements q {
    final /* synthetic */ K $coroutineScope;
    final /* synthetic */ C6798l $onAnswerUpdated;
    final /* synthetic */ C6798l $onContinue;
    final /* synthetic */ C6798l $onSecondaryCtaClicked;
    final /* synthetic */ SurveyState.Content $state;

    SurveyComponentKt$SurveyContent$1(SurveyState.Content content, C6798l lVar, C6798l lVar2, C6798l lVar3, K k10) {
        this.$state = content;
        this.$onSecondaryCtaClicked = lVar;
        this.$onAnswerUpdated = lVar2;
        this.$onContinue = lVar3;
        this.$coroutineScope = k10;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$8$lambda$6$lambda$5$lambda$4(CharSequence charSequence, v vVar) {
        C6496s.h(vVar, "$this$semantics");
        t.Y(vVar, charSequence.toString());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$8$lambda$7(C6798l lVar, K k10) {
        C6496s.h(lVar, "$onContinue");
        C6496s.h(k10, "$coroutineScope");
        lVar.invoke(k10);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C1088f) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1088f fVar, C1500m mVar, int i10) {
        int i11;
        String a10;
        C1088f fVar2 = fVar;
        C1500m mVar2 = mVar;
        int i12 = 1;
        C6496s.h(fVar2, "$this$BoxWithConstraints");
        if ((i10 & 14) == 0) {
            i11 = i10 | (mVar2.S(fVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 91) != 18 || !mVar.i()) {
            float g10 = fVar.g();
            o a11 = m.a(0, mVar2, 0, 1);
            mVar2.T(1705494839);
            boolean S10 = mVar2.S(a11);
            Object A10 = mVar.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new SurveyComponentKt$SurveyContent$1$1$1(a11, (C6658d<? super SurveyComponentKt$SurveyContent$1$1$1>) null);
                mVar2.r(A10);
            }
            mVar.M();
            P.g("", (p) A10, mVar2, 70);
            i.a aVar = i.f23074a;
            float f10 = (float) 16;
            float f11 = f10;
            i d10 = m.d(n.k(androidx.compose.foundation.layout.q.f(aVar, 0.0f, 1, (Object) null), h.j(f10), 0.0f, 2, (Object) null), a11, true, (z.n) null, false, 12, (Object) null);
            SurveyState.Content content = this.$state;
            C6798l lVar = this.$onSecondaryCtaClicked;
            C6798l lVar2 = this.$onAnswerUpdated;
            C6798l lVar3 = this.$onContinue;
            K k10 = this.$coroutineScope;
            F a12 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a13 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = k0.h.e(mVar2, d10);
            C1241g.a aVar2 = C1241g.f3853J;
            C6787a a14 = aVar2.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a14);
            } else {
                mVar.q();
            }
            C1500m a15 = F1.a(mVar);
            F1.b(a15, a12, aVar2.c());
            F1.b(a15, p10, aVar2.e());
            p b10 = aVar2.b();
            if (a15.f() || !C6496s.c(a15.A(), Integer.valueOf(a13))) {
                a15.r(Integer.valueOf(a13));
                a15.V(Integer.valueOf(a13), b10);
            }
            F1.b(a15, e10, aVar2.d());
            C1093k kVar = C1093k.f978a;
            int i13 = 6;
            a0.a(androidx.compose.foundation.layout.q.i(aVar, h.j(f11)), mVar2, 6);
            float j10 = h.j(g10 - h.j((float) 96));
            int size = content.getSecondaryCtaActions().size();
            for (int i14 = 0; i14 < size; i14++) {
                j10 = h.j(j10 - h.j((float) 64));
            }
            i b11 = androidx.compose.foundation.layout.q.b(i.f23074a, 0.0f, j10, 1, (Object) null);
            F a16 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a17 = C1494j.a(mVar2, 0);
            C1523y p11 = mVar.p();
            i e11 = k0.h.e(mVar2, b11);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a18 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a18);
            } else {
                mVar.q();
            }
            C1500m a19 = F1.a(mVar);
            F1.b(a19, a16, aVar3.c());
            F1.b(a19, p11, aVar3.e());
            p b12 = aVar3.b();
            if (a19.f() || !C6496s.c(a19.A(), Integer.valueOf(a17))) {
                a19.r(Integer.valueOf(a17));
                a19.V(Integer.valueOf(a17), b12);
            }
            F1.b(a19, e11, aVar3.d());
            C1093k kVar2 = C1093k.f978a;
            mVar2.T(412604363);
            Iterable<Block.Builder> stepTitle = content.getStepTitle();
            ArrayList<Block> arrayList = new ArrayList<>(C6565s.y(stepTitle, 10));
            for (Block.Builder build : stepTitle) {
                arrayList.add(build.build());
            }
            for (Block block : arrayList) {
                i h10 = androidx.compose.foundation.layout.q.h(i.f23074a, 0.0f, i12, (Object) null);
                C6496s.e(block);
                BlockViewKt.BlockView(h10, new BlockRenderData(block, C2544x0.k(content.getSurveyUiColors().m426getOnBackground0d7_KjU()), (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, (BlockRenderTextStyle) null, 28, (DefaultConstructorMarker) null), false, (SuffixText) null, false, (String) null, (ImageRenderType) null, (C6787a) null, (C6798l) null, (C6798l) null, mVar, 70, 1020);
                i13 = i13;
                lVar2 = lVar2;
                lVar = lVar;
                content = content;
                k10 = k10;
                lVar3 = lVar3;
                i12 = 1;
            }
            K k11 = k10;
            C6798l lVar4 = lVar3;
            C6798l lVar5 = lVar2;
            C6798l lVar6 = lVar;
            SurveyState.Content content2 = content;
            int i15 = i13;
            mVar.M();
            float f12 = (float) 8;
            a0.a(androidx.compose.foundation.layout.q.i(i.f23074a, h.j(f12)), mVar2, i15);
            mVar2.T(412619710);
            int i16 = 0;
            for (Object next : content2.getQuestions()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    C6565s.x();
                }
                QuestionComponentKt.m467QuestionComponentlzVJ5Jw(n.k(O0.m.c(i.f23074a, true, new E(Phrase.from((Context) mVar2.m(AndroidCompositionLocals_androidKt.g()), R.string.intercom_surveys_question_question_number_of_question_count).put("questioin_number", i17).put("question_count", content2.getQuestions().size()).format())), 0.0f, h.j(f12), 1, (Object) null), (i) null, (QuestionState) next, (SurveyUiColors) null, lVar5, 0, 0.0f, (V0.p) null, 0, (C6798l) null, mVar, 512, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
                mVar2 = mVar2;
                i16 = i17;
                f12 = f12;
            }
            C1500m mVar3 = mVar2;
            mVar.M();
            mVar.u();
            i.a aVar4 = i.f23074a;
            a0.a(androidx.compose.foundation.layout.q.i(aVar4, h.j(f12)), mVar3, 6);
            SurveyState.Content.PrimaryCta primaryCta = content2.getPrimaryCta();
            mVar3.T(-1140607254);
            if (primaryCta instanceof SurveyState.Content.PrimaryCta.Custom) {
                a10 = ((SurveyState.Content.PrimaryCta.Custom) primaryCta).getText();
            } else if (primaryCta instanceof SurveyState.Content.PrimaryCta.Fallback) {
                a10 = M0.i.a(((SurveyState.Content.PrimaryCta.Fallback) primaryCta).getFallbackTextRes(), mVar3, 0);
            } else {
                throw new C6535s();
            }
            String str = a10;
            mVar.M();
            SurveyCtaButtonComponentKt.SurveyCtaButtonComponent((i) null, str, content2.getSecondaryCtaActions(), new F(lVar4, k11), lVar6, content2.getSurveyUiColors(), mVar, 512, 1);
            a0.a(androidx.compose.foundation.layout.q.i(aVar4, h.j(f11)), mVar3, 6);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
