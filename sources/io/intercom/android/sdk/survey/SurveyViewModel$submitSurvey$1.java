package io.intercom.android.sdk.survey;

import Ug.K;
import io.intercom.android.sdk.survey.SurveyState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1", f = "SurveyViewModel.kt", l = {325, 365, 411}, m = "invokeSuspend")
final class SurveyViewModel$submitSurvey$1 extends l implements p {
    final /* synthetic */ K $compositionAwareScope;
    final /* synthetic */ SurveyState.Content $surveyContent;
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurveyViewModel$submitSurvey$1(SurveyViewModel surveyViewModel, SurveyState.Content content, K k10, C6658d<? super SurveyViewModel$submitSurvey$1> dVar) {
        super(2, dVar);
        this.this$0 = surveyViewModel;
        this.$surveyContent = content;
        this.$compositionAwareScope = k10;
    }

    /* access modifiers changed from: private */
    public static final C6514M invokeSuspend$lambda$7(SurveyViewModel surveyViewModel, SurveyState.Content content, K k10) {
        surveyViewModel.submitSurvey(content, k10);
        return C6514M.f71813a;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new SurveyViewModel$submitSurvey$1(this.this$0, this.$surveyContent, this.$compositionAwareScope, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((SurveyViewModel$submitSurvey$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01cd, code lost:
        if (r0.getType() == io.intercom.android.sdk.survey.model.SurveyData.StepType.CONTENT) goto L_0x01cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0265  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = rf.C6680b.f()
            int r1 = r14.label
            r2 = 3
            r3 = 1
            r4 = 2
            java.lang.String r5 = "currentStep"
            r6 = 0
            if (r1 == 0) goto L_0x002a
            if (r1 == r3) goto L_0x0026
            if (r1 == r4) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            lf.w.b(r15)
            goto L_0x030e
        L_0x0019:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x0021:
            lf.w.b(r15)
            goto L_0x0198
        L_0x0026:
            lf.w.b(r15)
            goto L_0x0062
        L_0x002a:
            lf.w.b(r15)
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData$Step r15 = r15.currentStep
            if (r15 != 0) goto L_0x0039
            kotlin.jvm.internal.C6496s.v(r5)
            r15 = r6
        L_0x0039:
            io.intercom.android.sdk.survey.model.SurveyData$StepType r15 = r15.getType()
            io.intercom.android.sdk.survey.model.SurveyData$StepType r1 = io.intercom.android.sdk.survey.model.SurveyData.StepType.THANK_YOU
            if (r15 != r1) goto L_0x0065
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            io.intercom.android.sdk.survey.CloseEventTrigger r1 = io.intercom.android.sdk.survey.CloseEventTrigger.CTA
            r15.sendDismissedEvent(r1)
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            io.intercom.android.sdk.m5.data.IntercomDataLayer r15 = r15.intercomDataLayer
            r15.clearSurveyData()
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            Xg.w r15 = r15.getEffects()
            io.intercom.android.sdk.survey.SurveyEffects$ExitSurvey r1 = io.intercom.android.sdk.survey.SurveyEffects.ExitSurvey.INSTANCE
            r14.label = r3
            java.lang.Object r15 = r15.emit(r1, r14)
            if (r15 != r0) goto L_0x0062
            return r0
        L_0x0062:
            lf.M r15 = lf.C6514M.f71813a
            return r15
        L_0x0065:
            io.intercom.android.sdk.survey.SurveyState$Content r15 = r14.$surveyContent
            java.util.List r15 = r15.getQuestions()
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00da
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r1 = r15.iterator()
        L_0x007a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x008a
            java.lang.Object r3 = r1.next()
            io.intercom.android.sdk.survey.QuestionState r3 = (io.intercom.android.sdk.survey.QuestionState) r3
            r3.validate()
            goto L_0x007a
        L_0x008a:
            boolean r1 = r15 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0098
            r1 = r15
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0098
            goto L_0x00da
        L_0x0098:
            java.util.Iterator r1 = r15.iterator()
        L_0x009c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00da
            java.lang.Object r3 = r1.next()
            io.intercom.android.sdk.survey.QuestionState r3 = (io.intercom.android.sdk.survey.QuestionState) r3
            io.intercom.android.sdk.survey.ValidationError r3 = r3.getValidationError()
            boolean r3 = r3 instanceof io.intercom.android.sdk.survey.ValidationError.NoValidationError
            if (r3 != 0) goto L_0x009c
            java.util.Iterator r15 = r15.iterator()
        L_0x00b4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r15.next()
            io.intercom.android.sdk.survey.QuestionState r0 = (io.intercom.android.sdk.survey.QuestionState) r0
            io.intercom.android.sdk.survey.ValidationError r1 = r0.getValidationError()
            boolean r1 = r1 instanceof io.intercom.android.sdk.survey.ValidationError.NoValidationError
            if (r1 != 0) goto L_0x00b4
            Ug.K r15 = r14.$compositionAwareScope
            if (r15 == 0) goto L_0x00cf
            r0.bringIntoView(r15)
        L_0x00cf:
            lf.M r15 = lf.C6514M.f71813a
            return r15
        L_0x00d2:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r15.<init>(r0)
            throw r15
        L_0x00da:
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            r15.emitLoading()
            io.intercom.android.sdk.survey.SurveyState$Content r15 = r14.$surveyContent
            java.util.List r15 = r15.getQuestions()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = mf.C6565s.y(r15, r3)
            r1.<init>(r3)
            java.util.Iterator r15 = r15.iterator()
        L_0x00f6:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L_0x0151
            java.lang.Object r3 = r15.next()
            io.intercom.android.sdk.survey.QuestionState r3 = (io.intercom.android.sdk.survey.QuestionState) r3
            io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem r7 = new io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r8 = r3.getQuestionModel()
            java.lang.String r8 = r8.getId()
            io.intercom.android.sdk.survey.ui.models.Answer r3 = r3.getAnswer()
            boolean r9 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer
            if (r9 == 0) goto L_0x011b
            io.intercom.android.sdk.survey.ui.models.Answer$MultipleAnswer r3 = (io.intercom.android.sdk.survey.ui.models.Answer.MultipleAnswer) r3
            java.util.List r3 = r3.getAnswers()
            goto L_0x0144
        L_0x011b:
            boolean r9 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.NoAnswer
            if (r9 == 0) goto L_0x0124
            java.util.List r3 = mf.C6565s.n()
            goto L_0x0144
        L_0x0124:
            boolean r9 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer
            if (r9 == 0) goto L_0x0133
            io.intercom.android.sdk.survey.ui.models.Answer$SingleAnswer r3 = (io.intercom.android.sdk.survey.ui.models.Answer.SingleAnswer) r3
            java.lang.String r3 = r3.getAnswer()
            java.util.List r3 = mf.C6565s.e(r3)
            goto L_0x0144
        L_0x0133:
            boolean r9 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.DateTimeAnswer
            if (r9 == 0) goto L_0x013c
            java.util.List r3 = mf.C6565s.n()
            goto L_0x0144
        L_0x013c:
            boolean r3 = r3 instanceof io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer
            if (r3 == 0) goto L_0x014b
            java.util.List r3 = mf.C6565s.n()
        L_0x0144:
            r7.<init>(r8, r3)
            r1.add(r7)
            goto L_0x00f6
        L_0x014b:
            lf.s r15 = new lf.s
            r15.<init>()
            throw r15
        L_0x0151:
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            java.util.List r15 = r15.completedResponses
            r15.addAll(r1)
            io.intercom.android.sdk.survey.model.SubmitSurveyRequest r15 = new io.intercom.android.sdk.survey.model.SubmitSurveyRequest
            io.intercom.android.sdk.survey.SurveyViewModel r1 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r1 = r1.surveyData
            java.lang.String r1 = r1.getSurveyProgressId()
            io.intercom.android.sdk.survey.SurveyViewModel r3 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData$Step r3 = r3.currentStep
            if (r3 != 0) goto L_0x0172
            kotlin.jvm.internal.C6496s.v(r5)
            r3 = r6
        L_0x0172:
            java.lang.String r3 = r3.getId()
            io.intercom.android.sdk.survey.SurveyViewModel r7 = r14.this$0
            java.util.List r7 = r7.completedResponses
            r15.<init>(r1, r3, r7)
            io.intercom.android.sdk.survey.SurveyViewModel r1 = r14.this$0
            io.intercom.android.sdk.survey.SurveyRepository r1 = r1.surveyRepository
            io.intercom.android.sdk.survey.SurveyViewModel r3 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r3 = r3.surveyData
            java.lang.String r3 = r3.getId()
            r14.label = r4
            java.lang.Object r15 = r1.submitSurvey(r15, r3, r14)
            if (r15 != r0) goto L_0x0198
            return r0
        L_0x0198:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r15 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r15
            boolean r1 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success
            r3 = 0
            if (r1 == 0) goto L_0x0265
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse$Success r15 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.Success) r15
            java.lang.Object r15 = r15.getBody()
            io.intercom.android.sdk.survey.model.SubmitSurveyResponse r15 = (io.intercom.android.sdk.survey.model.SubmitSurveyResponse) r15
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData$Step r0 = r0.currentStep
            if (r0 != 0) goto L_0x01b3
            kotlin.jvm.internal.C6496s.v(r5)
            r0 = r6
        L_0x01b3:
            io.intercom.android.sdk.survey.model.SurveyData$StepType r0 = r0.getType()
            io.intercom.android.sdk.survey.model.SurveyData$StepType r1 = io.intercom.android.sdk.survey.model.SurveyData.StepType.QUESTION
            if (r0 == r1) goto L_0x01cf
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData$Step r0 = r0.currentStep
            if (r0 != 0) goto L_0x01c7
            kotlin.jvm.internal.C6496s.v(r5)
            r0 = r6
        L_0x01c7:
            io.intercom.android.sdk.survey.model.SurveyData$StepType r0 = r0.getType()
            io.intercom.android.sdk.survey.model.SurveyData$StepType r1 = io.intercom.android.sdk.survey.model.SurveyData.StepType.CONTENT
            if (r0 != r1) goto L_0x01e5
        L_0x01cf:
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            java.util.List r0 = r0.completedSteps
            io.intercom.android.sdk.survey.SurveyViewModel r1 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData$Step r1 = r1.currentStep
            if (r1 != 0) goto L_0x01e1
            kotlin.jvm.internal.C6496s.v(r5)
            goto L_0x01e2
        L_0x01e1:
            r6 = r1
        L_0x01e2:
            r0.add(r6)
        L_0x01e5:
            boolean r0 = r15.getComplete()
            if (r0 == 0) goto L_0x0247
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            java.util.List r0 = r0.completedSteps
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r12 = r3
        L_0x01f8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0210
            java.lang.Object r1 = r0.next()
            io.intercom.android.sdk.survey.model.SurveyData$Step r1 = (io.intercom.android.sdk.survey.model.SurveyData.Step) r1
            java.util.List r1 = r1.getQuestions()
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r12 = r12 + r1
            goto L_0x01f8
        L_0x0210:
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.metrics.MetricTracker r4 = r0.metricTracker
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r0 = r0.surveyData
            java.lang.String r8 = r0.getId()
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r0 = r0.surveyData
            java.lang.String r9 = r0.getFormatMetric()
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            java.util.List r0 = r0.completedSteps
            int r10 = r0.size()
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r0 = r0.surveyData
            int r11 = r0.getStepCount()
            java.lang.String r5 = "completed"
            java.lang.String r6 = "survey"
            java.lang.String r7 = "from_cta"
            r4.surveyCompleted(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0247:
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData$Step r15 = r15.getNextStep()
            r0.currentStep = r15
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            Xg.x r15 = r15.getState()
            io.intercom.android.sdk.survey.SurveyViewModel r0 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r1 = r0.surveyData
            io.intercom.android.sdk.survey.SurveyState$Content r0 = r0.buildContentState(r1)
            r15.setValue(r0)
            goto L_0x030e
        L_0x0265:
            boolean r1 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.NetworkError
            r5 = 0
            if (r1 == 0) goto L_0x02aa
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            Xg.x r15 = r15.getState()
            io.intercom.android.sdk.survey.SurveyState$Error$WithCTA r0 = new io.intercom.android.sdk.survey.SurveyState$Error$WithCTA
            io.intercom.android.sdk.survey.SurveyState$Content r1 = r14.$surveyContent
            io.intercom.android.sdk.survey.SurveyUiColors r9 = r1.getSurveyUiColors()
            io.intercom.android.sdk.survey.SurveyState$Content r1 = r14.$surveyContent
            io.intercom.android.sdk.survey.TopBarState r1 = r1.getTopBarState()
            io.intercom.android.sdk.survey.SurveyState$Content r2 = r14.$surveyContent
            io.intercom.android.sdk.survey.TopBarState r2 = r2.getTopBarState()
            io.intercom.android.sdk.survey.ProgressBarState r2 = r2.getProgressBarState()
            io.intercom.android.sdk.survey.ProgressBarState r2 = io.intercom.android.sdk.survey.ProgressBarState.copy$default(r2, r3, r5, r4, r6)
            io.intercom.android.sdk.survey.TopBarState r1 = r1.withProgressBarState(r2)
            io.intercom.android.sdk.survey.TopBarState r10 = r1.enableDismissButton()
            io.intercom.android.sdk.survey.SurveyViewModel r1 = r14.this$0
            io.intercom.android.sdk.survey.SurveyState$Content r2 = r14.$surveyContent
            Ug.K r3 = r14.$compositionAwareScope
            io.intercom.android.sdk.survey.c r11 = new io.intercom.android.sdk.survey.c
            r11.<init>(r1, r2, r3)
            r12 = 1
            r13 = 0
            r8 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r15.setValue(r0)
            goto L_0x030e
        L_0x02aa:
            boolean r1 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ServerError
            if (r1 != 0) goto L_0x02b9
            boolean r1 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r1 == 0) goto L_0x02b3
            goto L_0x02b9
        L_0x02b3:
            lf.s r15 = new lf.s
            r15.<init>()
            throw r15
        L_0x02b9:
            io.intercom.android.sdk.survey.SurveyViewModel r1 = r14.this$0
            Xg.x r1 = r1.getState()
            io.intercom.android.sdk.survey.SurveyState$Error$WithoutCTA r13 = new io.intercom.android.sdk.survey.SurveyState$Error$WithoutCTA
            io.intercom.android.sdk.survey.SurveyState$Content r7 = r14.$surveyContent
            io.intercom.android.sdk.survey.SurveyUiColors r9 = r7.getSurveyUiColors()
            io.intercom.android.sdk.survey.SurveyState$Content r7 = r14.$surveyContent
            io.intercom.android.sdk.survey.TopBarState r7 = r7.getTopBarState()
            io.intercom.android.sdk.survey.SurveyState$Content r8 = r14.$surveyContent
            io.intercom.android.sdk.survey.TopBarState r8 = r8.getTopBarState()
            io.intercom.android.sdk.survey.ProgressBarState r8 = r8.getProgressBarState()
            io.intercom.android.sdk.survey.ProgressBarState r3 = io.intercom.android.sdk.survey.ProgressBarState.copy$default(r8, r3, r5, r4, r6)
            io.intercom.android.sdk.survey.TopBarState r3 = r7.withProgressBarState(r3)
            io.intercom.android.sdk.survey.TopBarState r10 = r3.enableDismissButton()
            r11 = 1
            r12 = 0
            r8 = 0
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            r1.setValue(r13)
            boolean r15 = r15 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
            if (r15 == 0) goto L_0x030e
            io.intercom.android.sdk.survey.SurveyViewModel r15 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r1 = r15.surveyData
            java.lang.String r1 = r1.getId()
            io.intercom.android.sdk.survey.SurveyViewModel r3 = r14.this$0
            io.intercom.android.sdk.survey.model.SurveyData r3 = r3.surveyData
            java.lang.String r3 = r3.getSurveyProgressId()
            r14.label = r2
            java.lang.Object r15 = r15.reportFailure(r1, r3, r14)
            if (r15 != r0) goto L_0x030e
            return r0
        L_0x030e:
            lf.M r15 = lf.C6514M.f71813a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
