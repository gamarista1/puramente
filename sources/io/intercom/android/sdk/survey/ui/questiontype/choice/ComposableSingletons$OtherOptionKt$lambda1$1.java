package io.intercom.android.sdk.survey.ui.questiontype.choice;

import Y.C1500m;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.survey.ui.questiontype.choice.ComposableSingletons$OtherOptionKt$lambda-1$1  reason: invalid class name */
final class ComposableSingletons$OtherOptionKt$lambda1$1 implements p {
    public static final ComposableSingletons$OtherOptionKt$lambda1$1 INSTANCE = new ComposableSingletons$OtherOptionKt$lambda1$1();

    ComposableSingletons$OtherOptionKt$lambda1$1() {
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0() {
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(String str) {
        C6496s.h(str, "it");
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            OtherOptionKt.m483OtherOptionYCJL08c(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization((String) null, (String) null, 3, (DefaultConstructorMarker) null)), "none", new i(), new j(), 0, 0.0f, 0, (V0.p) null, 0, mVar, 28038, 992);
        } else {
            mVar.I();
        }
    }
}
