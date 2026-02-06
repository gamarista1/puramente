package io.intercom.android.sdk.survey;

import Ug.K;
import Xg.x;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.SurveyLaunchMode;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1", f = "SurveyViewModel.kt", l = {}, m = "invokeSuspend")
final class SurveyViewModel$onUiLoaded$1 extends l implements p {
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurveyViewModel$onUiLoaded$1(SurveyViewModel surveyViewModel, C6658d<? super SurveyViewModel$onUiLoaded$1> dVar) {
        super(2, dVar);
        this.this$0 = surveyViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new SurveyViewModel$onUiLoaded$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((SurveyViewModel$onUiLoaded$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            SurveyLaunchMode access$getLaunchMode$p = this.this$0.launchMode;
            if (access$getLaunchMode$p instanceof SurveyLaunchMode.Automatic) {
                SurveyViewModel surveyViewModel = this.this$0;
                surveyViewModel.surveyData = ((SurveyLaunchMode.Automatic) surveyViewModel.launchMode).getSurveyData();
                if (!this.this$0.surveyData.getSteps().isEmpty()) {
                    this.this$0.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_AUTOMATIC, this.this$0.surveyData.getId(), this.this$0.surveyData.getFormatMetric());
                    SurveyViewModel surveyViewModel2 = this.this$0;
                    surveyViewModel2.currentStep = (SurveyData.Step) C6565s.o0(surveyViewModel2.surveyData.getSteps());
                    x state = this.this$0.getState();
                    SurveyViewModel surveyViewModel3 = this.this$0;
                    state.setValue(surveyViewModel3.buildContentState(surveyViewModel3.surveyData));
                } else {
                    SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(this.this$0.surveyData.getCustomization());
                    this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, surveyUiColors, new TopBarState.NoTopBarState(true, surveyUiColors, (ProgressBarState) null, 4, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null));
                }
            } else if (access$getLaunchMode$p instanceof SurveyLaunchMode.Programmatic) {
                SurveyViewModel surveyViewModel4 = this.this$0;
                surveyViewModel4.fetchAndShowSurvey(((SurveyLaunchMode.Programmatic) surveyViewModel4.launchMode).getSurveyId());
            } else {
                throw new C6535s();
            }
            return C6514M.f71813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
