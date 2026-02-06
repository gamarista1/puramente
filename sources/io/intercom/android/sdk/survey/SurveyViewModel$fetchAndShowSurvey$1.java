package io.intercom.android.sdk.survey;

import Ug.K;
import Xg.x;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
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
@f(c = "io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1", f = "SurveyViewModel.kt", l = {142}, m = "invokeSuspend")
final class SurveyViewModel$fetchAndShowSurvey$1 extends l implements p {
    final /* synthetic */ String $surveyId;
    final /* synthetic */ SurveyUiColors $uiColors;
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurveyViewModel$fetchAndShowSurvey$1(String str, SurveyViewModel surveyViewModel, SurveyUiColors surveyUiColors, C6658d<? super SurveyViewModel$fetchAndShowSurvey$1> dVar) {
        super(2, dVar);
        this.$surveyId = str;
        this.this$0 = surveyViewModel;
        this.$uiColors = surveyUiColors;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$0(SurveyViewModel surveyViewModel, String str) {
        surveyViewModel.fetchAndShowSurvey(str);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new SurveyViewModel$fetchAndShowSurvey$1(this.$surveyId, this.this$0, this.$uiColors, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((SurveyViewModel$fetchAndShowSurvey$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            if (Sg.p.d0(this.$surveyId)) {
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, (ProgressBarState) null, 4, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null));
                return C6514M.f71813a;
            }
            this.this$0.emitLoading();
            SurveyRepository access$getSurveyRepository$p = this.this$0.surveyRepository;
            String str = this.$surveyId;
            this.label = 1;
            obj = access$getSurveyRepository$p.fetchSurvey(str, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if (networkResponse instanceof NetworkResponse.Success) {
            this.this$0.surveyData = ((FetchSurveyRequest) ((NetworkResponse.Success) networkResponse).getBody()).getSurvey();
            if (!this.this$0.surveyData.getSteps().isEmpty()) {
                this.this$0.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_PROGRAMMATIC, this.this$0.surveyData.getId(), this.this$0.surveyData.getFormatMetric());
                SurveyViewModel surveyViewModel = this.this$0;
                surveyViewModel.currentStep = (SurveyData.Step) C6565s.o0(surveyViewModel.surveyData.getSteps());
                x state = this.this$0.getState();
                SurveyViewModel surveyViewModel2 = this.this$0;
                state.setValue(surveyViewModel2.buildContentState(surveyViewModel2.surveyData));
            } else {
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, (ProgressBarState) null, 4, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null));
            }
        } else if (networkResponse instanceof NetworkResponse.ClientError) {
            this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, (ProgressBarState) null, 4, (DefaultConstructorMarker) null), 1, (DefaultConstructorMarker) null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            this.this$0.getState().setValue(new SurveyState.Error.WithCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, (ProgressBarState) null, 4, (DefaultConstructorMarker) null), new b(this.this$0, this.$surveyId), 1, (DefaultConstructorMarker) null));
        } else if (networkResponse instanceof NetworkResponse.ServerError) {
            this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(R.string.intercom_page_not_found, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, (ProgressBarState) null, 4, (DefaultConstructorMarker) null)));
        } else {
            throw new C6535s();
        }
        return C6514M.f71813a;
    }
}
