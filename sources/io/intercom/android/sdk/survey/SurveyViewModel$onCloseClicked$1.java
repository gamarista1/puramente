package io.intercom.android.sdk.survey;

import Ug.C5585o0;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.survey.SurveyEffects;
import io.intercom.android.sdk.survey.model.SurveyData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1", f = "SurveyViewModel.kt", l = {291}, m = "invokeSuspend")
final class SurveyViewModel$onCloseClicked$1 extends l implements p {
    final /* synthetic */ CloseEventTrigger $triggerType;
    int label;
    final /* synthetic */ SurveyViewModel this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1", f = "SurveyViewModel.kt", l = {275, 280}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass1(surveyViewModel, dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.label;
            if (i10 == 0) {
                w.b(obj);
                if (!surveyViewModel.surveyData.getSteps().isEmpty()) {
                    SurveyData.Step access$getCurrentStep$p = surveyViewModel.currentStep;
                    if (access$getCurrentStep$p == null) {
                        C6496s.v("currentStep");
                        access$getCurrentStep$p = null;
                    }
                    if (access$getCurrentStep$p.getType() != SurveyData.StepType.THANK_YOU) {
                        SurveyRepository access$getSurveyRepository$p = surveyViewModel.surveyRepository;
                        String id2 = surveyViewModel.surveyData.getId();
                        String surveyProgressId = surveyViewModel.surveyData.getSurveyProgressId();
                        this.label = 1;
                        obj = access$getSurveyRepository$p.dismissSurvey(id2, surveyProgressId, this);
                        if (obj == f10) {
                            return f10;
                        }
                    }
                }
                return C6514M.f71813a;
            } else if (i10 == 1) {
                w.b(obj);
            } else if (i10 == 2) {
                w.b(obj);
                return C6514M.f71813a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((NetworkResponse) obj) instanceof NetworkResponse.ClientError) {
                SurveyViewModel surveyViewModel = surveyViewModel;
                String id3 = surveyViewModel.surveyData.getId();
                String surveyProgressId2 = surveyViewModel.surveyData.getSurveyProgressId();
                this.label = 2;
                if (surveyViewModel.reportFailure(id3, surveyProgressId2, this) == f10) {
                    return f10;
                }
            }
            return C6514M.f71813a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SurveyViewModel$onCloseClicked$1(SurveyViewModel surveyViewModel, CloseEventTrigger closeEventTrigger, C6658d<? super SurveyViewModel$onCloseClicked$1> dVar) {
        super(2, dVar);
        this.this$0 = surveyViewModel;
        this.$triggerType = closeEventTrigger;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new SurveyViewModel$onCloseClicked$1(this.this$0, this.$triggerType, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((SurveyViewModel$onCloseClicked$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            this.this$0.sendDismissedEvent(this.$triggerType);
            C5585o0 o0Var = C5585o0.f65402a;
            final SurveyViewModel surveyViewModel = this.this$0;
            C5600w0 unused = C5576k.d(o0Var, (g) null, (M) null, new AnonymousClass1((C6658d<? super AnonymousClass1>) null), 3, (Object) null);
            this.this$0.intercomDataLayer.clearSurveyData();
            Xg.w effects = this.this$0.getEffects();
            SurveyEffects.ExitSurvey exitSurvey = SurveyEffects.ExitSurvey.INSTANCE;
            this.label = 1;
            if (effects.emit(exitSurvey, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
