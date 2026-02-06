package io.intercom.android.sdk.survey.ui;

import Ug.K;
import Xg.C5695g;
import io.intercom.android.sdk.survey.SurveyEffects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onStart$1", f = "IntercomSurveyActivity.kt", l = {79}, m = "invokeSuspend")
final class IntercomSurveyActivity$onStart$1 extends l implements p {
    int label;
    final /* synthetic */ IntercomSurveyActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IntercomSurveyActivity$onStart$1(IntercomSurveyActivity intercomSurveyActivity, C6658d<? super IntercomSurveyActivity$onStart$1> dVar) {
        super(2, dVar);
        this.this$0 = intercomSurveyActivity;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new IntercomSurveyActivity$onStart$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((IntercomSurveyActivity$onStart$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            Xg.w effects = this.this$0.getViewModel().getEffects();
            final IntercomSurveyActivity intercomSurveyActivity = this.this$0;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(SurveyEffects surveyEffects, C6658d<? super C6514M> dVar) {
                    if (C6496s.c(surveyEffects, SurveyEffects.ExitSurvey.INSTANCE)) {
                        intercomSurveyActivity.finish();
                        return C6514M.f71813a;
                    }
                    throw new C6535s();
                }
            };
            this.label = 1;
            if (effects.collect(r12, this) == f10) {
                return f10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.b(obj);
        }
        throw new C6527k();
    }
}
