package io.intercom.android.sdk.survey;

import Ug.C5585o0;
import Ug.C5600w0;
import Ug.G;
import Ug.K;
import Ug.M;
import Ug.Z;
import Wg.a;
import Xg.D;
import Xg.N;
import Xg.w;
import Xg.x;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.SurveyApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.ValidationError;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import qf.C6658d;
import qf.g;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 P2\u00020\u0001:\u0001PBA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010\"\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0012¢\u0006\u0004\b*\u0010%J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b+\u0010)J\u0015\u0010.\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\u00020\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0012¢\u0006\u0004\b2\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020;0K8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010N¨\u0006Q"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyViewModel;", "Landroidx/lifecycle/a0;", "LUg/G;", "dispatcher", "Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "launchMode", "Lio/intercom/android/sdk/survey/SurveyRepository;", "surveyRepository", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "intercomDataLayer", "<init>", "(LUg/G;Lio/intercom/android/sdk/survey/SurveyLaunchMode;Lio/intercom/android/sdk/survey/SurveyRepository;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "", "surveyId", "Llf/M;", "fetchAndShowSurvey", "(Ljava/lang/String;)V", "Lio/intercom/android/sdk/survey/model/SurveyData;", "surveyData", "Lio/intercom/android/sdk/survey/SurveyState$Content;", "buildContentState", "(Lio/intercom/android/sdk/survey/model/SurveyData;)Lio/intercom/android/sdk/survey/SurveyState$Content;", "surveyContent", "LUg/K;", "compositionAwareScope", "submitSurvey", "(Lio/intercom/android/sdk/survey/SurveyState$Content;LUg/K;)V", "getCurrentContentState", "()Lio/intercom/android/sdk/survey/SurveyState$Content;", "surveyProgressId", "reportFailure", "(Ljava/lang/String;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "emitLoading", "()V", "Lio/intercom/android/sdk/survey/CloseEventTrigger;", "triggerType", "sendDismissedEvent", "(Lio/intercom/android/sdk/survey/CloseEventTrigger;)V", "onUiLoaded", "onCloseClicked", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "secondaryCta", "onSecondaryCtaClicked", "(Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;)V", "continueClicked", "(LUg/K;)V", "onAnswerUpdated", "LUg/G;", "getDispatcher", "()LUg/G;", "Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "Lio/intercom/android/sdk/survey/SurveyRepository;", "Lio/intercom/android/sdk/identity/AppConfig;", "Lio/intercom/android/sdk/metrics/MetricTracker;", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "currentStep", "Lio/intercom/android/sdk/survey/model/SurveyData$Step;", "Lio/intercom/android/sdk/survey/model/SurveyData;", "LXg/x;", "Lio/intercom/android/sdk/survey/SurveyState;", "state", "LXg/x;", "getState", "()LXg/x;", "LXg/w;", "Lio/intercom/android/sdk/survey/SurveyEffects;", "effects", "LXg/w;", "getEffects", "()LXg/w;", "", "Lio/intercom/android/sdk/survey/model/SubmitSurveyRequestItem;", "completedResponses", "Ljava/util/List;", "completedSteps", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveyViewModel extends a0 {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int ENTITY_TYPE = 85;
    private final AppConfig appConfig;
    /* access modifiers changed from: private */
    public final List<SubmitSurveyRequestItem> completedResponses;
    /* access modifiers changed from: private */
    public final List<SurveyData.Step> completedSteps;
    /* access modifiers changed from: private */
    public SurveyData.Step currentStep;
    private final G dispatcher;
    private final w effects;
    /* access modifiers changed from: private */
    public final IntercomDataLayer intercomDataLayer;
    /* access modifiers changed from: private */
    public final SurveyLaunchMode launchMode;
    /* access modifiers changed from: private */
    public final MetricTracker metricTracker;
    private final x state;
    /* access modifiers changed from: private */
    public SurveyData surveyData;
    /* access modifiers changed from: private */
    public final SurveyRepository surveyRepository;

    @Metadata(d1 = {"\u0000/\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/survey/SurveyViewModel$Companion;", "", "<init>", "()V", "Lio/intercom/android/sdk/survey/SurveyLaunchMode;", "launchMode", "io/intercom/android/sdk/survey/SurveyViewModel$Companion$factory$1", "factory", "(Lio/intercom/android/sdk/survey/SurveyLaunchMode;)Lio/intercom/android/sdk/survey/SurveyViewModel$Companion$factory$1;", "Landroidx/lifecycle/e0;", "owner", "Lio/intercom/android/sdk/survey/SurveyViewModel;", "create", "(Landroidx/lifecycle/e0;Lio/intercom/android/sdk/survey/SurveyLaunchMode;)Lio/intercom/android/sdk/survey/SurveyViewModel;", "", "ENTITY_TYPE", "I", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SurveyViewModel$Companion$factory$1 factory(SurveyLaunchMode surveyLaunchMode) {
            return new SurveyViewModel$Companion$factory$1(surveyLaunchMode);
        }

        public final SurveyViewModel create(e0 e0Var, SurveyLaunchMode surveyLaunchMode) {
            C6496s.h(e0Var, "owner");
            C6496s.h(surveyLaunchMode, "launchMode");
            return (SurveyViewModel) new c0(e0Var, (c0.c) factory(surveyLaunchMode)).b(SurveyViewModel.class);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                io.intercom.android.sdk.survey.model.SurveyData$StepType[] r0 = io.intercom.android.sdk.survey.model.SurveyData.StepType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                io.intercom.android.sdk.survey.model.SurveyData$StepType r2 = io.intercom.android.sdk.survey.model.SurveyData.StepType.QUESTION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                io.intercom.android.sdk.survey.model.SurveyData$StepType r3 = io.intercom.android.sdk.survey.model.SurveyData.StepType.INTRO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                io.intercom.android.sdk.survey.model.SurveyData$StepType r4 = io.intercom.android.sdk.survey.model.SurveyData.StepType.CONTENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                io.intercom.android.sdk.survey.model.SurveyData$StepType r5 = io.intercom.android.sdk.survey.model.SurveyData.StepType.THANK_YOU     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                io.intercom.android.sdk.survey.CloseEventTrigger[] r0 = io.intercom.android.sdk.survey.CloseEventTrigger.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.survey.CloseEventTrigger r5 = io.intercom.android.sdk.survey.CloseEventTrigger.CTA     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                io.intercom.android.sdk.survey.CloseEventTrigger r1 = io.intercom.android.sdk.survey.CloseEventTrigger.CLOSE_BUTTON     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                io.intercom.android.sdk.survey.CloseEventTrigger r1 = io.intercom.android.sdk.survey.CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                io.intercom.android.sdk.survey.CloseEventTrigger r1 = io.intercom.android.sdk.survey.CloseEventTrigger.SECONDARY_CTA_DEEP_LINK     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SurveyViewModel(G g10, SurveyLaunchMode surveyLaunchMode, SurveyRepository surveyRepository2, AppConfig appConfig2, MetricTracker metricTracker2, IntercomDataLayer intercomDataLayer2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Z.b() : g10, surveyLaunchMode, (i10 & 4) != 0 ? new SurveyRepository((SurveyApi) null, 1, (DefaultConstructorMarker) null) : surveyRepository2, (i10 & 8) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig2, (i10 & 16) != 0 ? Injector.get().getMetricTracker() : metricTracker2, (i10 & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer2);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r3.getType() == io.intercom.android.sdk.survey.model.SurveyData.StepType.QUESTION) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ec A[LOOP:0: B:38:0x00e6->B:40:0x00ec, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.intercom.android.sdk.survey.SurveyState.Content buildContentState(io.intercom.android.sdk.survey.model.SurveyData r13) {
        /*
            r12 = this;
            io.intercom.android.sdk.survey.model.SurveyCustomization r0 = r13.getCustomization()
            io.intercom.android.sdk.survey.SurveyUiColors r0 = io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(r0)
            int r1 = r13.getStepCount()
            float r1 = (float) r1
            java.util.List<io.intercom.android.sdk.survey.model.SurveyData$Step> r2 = r12.completedSteps
            int r2 = r2.size()
            boolean r3 = r13.getShowProgressBar()
            r8 = 1
            r9 = 0
            java.lang.String r10 = "currentStep"
            r11 = 0
            if (r3 == 0) goto L_0x003f
            io.intercom.android.sdk.survey.model.SurveyData$Step r3 = r12.currentStep
            if (r3 != 0) goto L_0x0026
            kotlin.jvm.internal.C6496s.v(r10)
            r3 = r11
        L_0x0026:
            io.intercom.android.sdk.survey.model.SurveyData$StepType r3 = r3.getType()
            io.intercom.android.sdk.survey.model.SurveyData$StepType r4 = io.intercom.android.sdk.survey.model.SurveyData.StepType.CONTENT
            if (r3 == r4) goto L_0x0041
            io.intercom.android.sdk.survey.model.SurveyData$Step r3 = r12.currentStep
            if (r3 != 0) goto L_0x0036
            kotlin.jvm.internal.C6496s.v(r10)
            r3 = r11
        L_0x0036:
            io.intercom.android.sdk.survey.model.SurveyData$StepType r3 = r3.getType()
            io.intercom.android.sdk.survey.model.SurveyData$StepType r4 = io.intercom.android.sdk.survey.model.SurveyData.StepType.QUESTION
            if (r3 != r4) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r3 = r9
            goto L_0x0042
        L_0x0041:
            r3 = r8
        L_0x0042:
            io.intercom.android.sdk.survey.ProgressBarState r7 = new io.intercom.android.sdk.survey.ProgressBarState
            float r2 = (float) r2
            float r2 = r2 / r1
            r7.<init>(r3, r2)
            io.intercom.android.sdk.survey.model.SurveySenderData r1 = r13.getSender()
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.getName()
            goto L_0x0055
        L_0x0054:
            r1 = r11
        L_0x0055:
            if (r1 != 0) goto L_0x0062
            io.intercom.android.sdk.survey.TopBarState$NoTopBarState r1 = new io.intercom.android.sdk.survey.TopBarState$NoTopBarState
            boolean r13 = r13.isDismissible()
            r1.<init>(r13, r0, r7)
            r7 = r1
            goto L_0x00b1
        L_0x0062:
            io.intercom.android.sdk.models.Avatar$Builder r1 = new io.intercom.android.sdk.models.Avatar$Builder
            r1.<init>()
            io.intercom.android.sdk.survey.model.SurveySenderData r2 = r13.getSender()
            io.intercom.android.sdk.survey.model.SurveySenderAvatar r2 = r2.getAvatar()
            if (r2 == 0) goto L_0x0076
            java.lang.String r2 = r2.getSquareImg128()
            goto L_0x0077
        L_0x0076:
            r2 = r11
        L_0x0077:
            io.intercom.android.sdk.models.Avatar$Builder r1 = r1.withImageUrl(r2)
            io.intercom.android.sdk.survey.model.SurveySenderData r2 = r13.getSender()
            java.lang.String r2 = r2.getInitials()
            io.intercom.android.sdk.models.Avatar$Builder r1 = r1.withInitials(r2)
            io.intercom.android.sdk.models.Avatar r2 = r1.build()
            java.lang.String r1 = "build(...)"
            kotlin.jvm.internal.C6496s.g(r2, r1)
            io.intercom.android.sdk.survey.model.SurveySenderData r1 = r13.getSender()
            java.lang.String r1 = r1.getFirstName()
            if (r1 != 0) goto L_0x00a2
            io.intercom.android.sdk.survey.model.SurveySenderData r1 = r13.getSender()
            java.lang.String r1 = r1.getName()
        L_0x00a2:
            r3 = r1
            boolean r5 = r13.isDismissible()
            io.intercom.android.sdk.identity.AppConfig r4 = r12.appConfig
            io.intercom.android.sdk.survey.TopBarState$SenderTopBarState r13 = new io.intercom.android.sdk.survey.TopBarState$SenderTopBarState
            r1 = r13
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r7 = r13
        L_0x00b1:
            io.intercom.android.sdk.survey.model.SurveyData$Step r13 = r12.currentStep
            if (r13 != 0) goto L_0x00b9
            kotlin.jvm.internal.C6496s.v(r10)
            r13 = r11
        L_0x00b9:
            java.lang.String r13 = r13.getCustomButtonText()
            io.intercom.android.sdk.survey.model.SurveyData$Step r1 = r12.currentStep
            if (r1 != 0) goto L_0x00c5
            kotlin.jvm.internal.C6496s.v(r10)
            r1 = r11
        L_0x00c5:
            java.util.List r2 = r1.getBlocks()
            io.intercom.android.sdk.survey.model.SurveyData$Step r1 = r12.currentStep
            if (r1 != 0) goto L_0x00d1
            kotlin.jvm.internal.C6496s.v(r10)
            r1 = r11
        L_0x00d1:
            java.util.List r1 = r1.getQuestions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r5 = mf.C6565s.y(r1, r4)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L_0x00e6:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r5 = r1.next()
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question r5 = (io.intercom.android.sdk.survey.model.SurveyData.Step.Question) r5
            io.intercom.android.sdk.survey.QuestionState r6 = new io.intercom.android.sdk.survey.QuestionState
            io.intercom.android.sdk.survey.model.SurveyData$Step$Question$QuestionModel r5 = r5.getQuestionModel()
            r6.<init>(r5, r0)
            r3.add(r6)
            goto L_0x00e6
        L_0x00ff:
            io.intercom.android.sdk.survey.model.SurveyData$Step r1 = r12.currentStep
            if (r1 != 0) goto L_0x0107
            kotlin.jvm.internal.C6496s.v(r10)
            r1 = r11
        L_0x0107:
            io.intercom.android.sdk.survey.model.SurveyData$StepType r1 = r1.getType()
            int[] r5 = io.intercom.android.sdk.survey.SurveyViewModel.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r5[r1]
            if (r1 == r8) goto L_0x0165
            r5 = 2
            if (r1 == r5) goto L_0x014e
            r5 = 3
            if (r1 == r5) goto L_0x014e
            r5 = 4
            if (r1 == r5) goto L_0x0137
            if (r13 == 0) goto L_0x012e
            int r1 = r13.length()
            if (r1 != 0) goto L_0x0127
            goto L_0x012e
        L_0x0127:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom r1 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom
            r1.<init>(r13)
        L_0x012c:
            r5 = r1
            goto L_0x017c
        L_0x012e:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback r13 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback
            int r1 = io.intercom.android.sdk.R.string.intercom_surveys_next_button
            r13.<init>(r1)
        L_0x0135:
            r5 = r13
            goto L_0x017c
        L_0x0137:
            if (r13 == 0) goto L_0x0146
            int r1 = r13.length()
            if (r1 != 0) goto L_0x0140
            goto L_0x0146
        L_0x0140:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom r1 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom
            r1.<init>(r13)
            goto L_0x012c
        L_0x0146:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback r13 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback
            int r1 = io.intercom.android.sdk.R.string.intercom_surveys_done_button
            r13.<init>(r1)
            goto L_0x0135
        L_0x014e:
            if (r13 == 0) goto L_0x015d
            int r1 = r13.length()
            if (r1 != 0) goto L_0x0157
            goto L_0x015d
        L_0x0157:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom r1 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom
            r1.<init>(r13)
            goto L_0x012c
        L_0x015d:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback r13 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback
            int r1 = io.intercom.android.sdk.R.string.intercom_surveys_next_button
            r13.<init>(r1)
            goto L_0x0135
        L_0x0165:
            if (r13 == 0) goto L_0x0174
            int r1 = r13.length()
            if (r1 != 0) goto L_0x016e
            goto L_0x0174
        L_0x016e:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom r1 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Custom
            r1.<init>(r13)
            goto L_0x012c
        L_0x0174:
            io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback r13 = new io.intercom.android.sdk.survey.SurveyState$Content$PrimaryCta$Fallback
            int r1 = io.intercom.android.sdk.R.string.intercom_submit
            r13.<init>(r1)
            goto L_0x0135
        L_0x017c:
            io.intercom.android.sdk.survey.model.SurveyData$Step r13 = r12.currentStep
            if (r13 != 0) goto L_0x0184
            kotlin.jvm.internal.C6496s.v(r10)
            goto L_0x0185
        L_0x0184:
            r11 = r13
        L_0x0185:
            java.util.List r13 = r11.getActions()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r6 = new java.util.ArrayList
            int r1 = mf.C6565s.y(r13, r4)
            r6.<init>(r1)
            java.util.Iterator r13 = r13.iterator()
        L_0x0198:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x01c9
            java.lang.Object r1 = r13.next()
            io.intercom.android.sdk.survey.model.SurveyData$SurveyActions r1 = (io.intercom.android.sdk.survey.model.SurveyData.SurveyActions) r1
            java.lang.String r4 = r1.getAndroidUri()
            if (r4 != 0) goto L_0x01ac
            r4 = r8
            goto L_0x01ad
        L_0x01ac:
            r4 = r9
        L_0x01ad:
            if (r4 == 0) goto L_0x01b4
            java.lang.String r10 = r1.getWebUrl()
            goto L_0x01b8
        L_0x01b4:
            java.lang.String r10 = r1.getAndroidUri()
        L_0x01b8:
            io.intercom.android.sdk.survey.SurveyState$Content$SecondaryCta r11 = new io.intercom.android.sdk.survey.SurveyState$Content$SecondaryCta
            java.lang.String r1 = r1.getActionTitle()
            if (r10 != 0) goto L_0x01c2
            java.lang.String r10 = ""
        L_0x01c2:
            r11.<init>(r1, r10, r4)
            r6.add(r11)
            goto L_0x0198
        L_0x01c9:
            io.intercom.android.sdk.survey.SurveyState$Content r13 = new io.intercom.android.sdk.survey.SurveyState$Content
            r1 = r13
            r4 = r6
            r6 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel.buildContentState(io.intercom.android.sdk.survey.model.SurveyData):io.intercom.android.sdk.survey.SurveyState$Content");
    }

    public static /* synthetic */ void continueClicked$default(SurveyViewModel surveyViewModel, K k10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k10 = null;
        }
        surveyViewModel.continueClicked(k10);
    }

    /* access modifiers changed from: private */
    public final void emitLoading() {
        x xVar = this.state;
        xVar.setValue(new SurveyState.Loading(((SurveyState) this.state.getValue()).getSurveyUiColors(), ((SurveyState) xVar.getValue()).getTopBarState()));
    }

    /* access modifiers changed from: private */
    public final void fetchAndShowSurvey(String str) {
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new SurveyViewModel$fetchAndShowSurvey$1(str, this, SurveyViewModelKt.toSurveyUiColors(this.surveyData.getCustomization()), (C6658d<? super SurveyViewModel$fetchAndShowSurvey$1>) null), 2, (Object) null);
    }

    private final SurveyState.Content getCurrentContentState() {
        Object value = this.state.getValue();
        C6496s.f(value, "null cannot be cast to non-null type io.intercom.android.sdk.survey.SurveyState.Content");
        return (SurveyState.Content) value;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object reportFailure(java.lang.String r5, java.lang.String r6, qf.C6658d<? super lf.C6514M> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1 r0 = (io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1 r0 = new io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = rf.C6680b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            lf.w.b(r7)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            lf.w.b(r7)
            io.intercom.android.sdk.survey.SurveyRepository r7 = r4.surveyRepository
            r0.label = r3
            java.lang.Object r7 = r7.reportFailure(r5, r6, r0)
            if (r7 != r1) goto L_0x003f
            return r1
        L_0x003f:
            io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r7 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r7
            lf.M r5 = lf.C6514M.f71813a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel.reportFailure(java.lang.String, java.lang.String, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void sendDismissedEvent(CloseEventTrigger closeEventTrigger) {
        String str;
        String str2;
        String str3;
        SurveyState surveyState = (SurveyState) this.state.getValue();
        if (surveyState instanceof SurveyState.Loading) {
            str = MetricTracker.Object.SURVEY_STEP_LOADING;
        } else if (surveyState instanceof SurveyState.Error) {
            str = MetricTracker.Object.SURVEY_STEP_ERROR;
        } else {
            str = "survey";
        }
        String str4 = str;
        int i10 = WhenMappings.$EnumSwitchMapping$1[closeEventTrigger.ordinal()];
        if (i10 == 1) {
            str2 = MetricTracker.Context.FROM_CTA;
        } else if (i10 == 2) {
            str2 = MetricTracker.Context.FROM_CLOSE_BUTTON;
        } else if (i10 == 3) {
            str2 = MetricTracker.Context.FROM_ONWARD_EXTERNAL_LINK;
        } else if (i10 == 4) {
            str2 = MetricTracker.Context.FROM_ONWARD_DEEP_LINK;
        } else {
            throw new C6535s();
        }
        String str5 = str2;
        if (!this.surveyData.getSteps().isEmpty()) {
            SurveyData.Step step = this.currentStep;
            SurveyData.Step step2 = null;
            if (step == null) {
                C6496s.v("currentStep");
                step = null;
            }
            if (step.getType() == SurveyData.StepType.THANK_YOU) {
                str3 = MetricTracker.Action.CLOSED;
            } else {
                str3 = MetricTracker.Action.DISMISSED;
            }
            String str6 = str3;
            int i11 = 0;
            for (SurveyData.Step questions : this.completedSteps) {
                i11 += questions.getQuestions().size();
            }
            SurveyData.Step step3 = this.currentStep;
            if (step3 == null) {
                C6496s.v("currentStep");
            } else {
                step2 = step3;
            }
            this.metricTracker.surveyDismissed(str6, str4, str5, this.surveyData.getId(), this.surveyData.getFormatMetric(), this.completedSteps.size(), this.surveyData.getStepCount(), i11 + step2.getQuestions().size());
        }
    }

    /* access modifiers changed from: private */
    public final void submitSurvey(SurveyState.Content content, K k10) {
        C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new SurveyViewModel$submitSurvey$1(this, content, k10, (C6658d<? super SurveyViewModel$submitSurvey$1>) null), 2, (Object) null);
    }

    static /* synthetic */ void submitSurvey$default(SurveyViewModel surveyViewModel, SurveyState.Content content, K k10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            k10 = null;
        }
        surveyViewModel.submitSurvey(content, k10);
    }

    public final void continueClicked(K k10) {
        submitSurvey(getCurrentContentState(), k10);
    }

    public final G getDispatcher() {
        return this.dispatcher;
    }

    public final w getEffects() {
        return this.effects;
    }

    public final x getState() {
        return this.state;
    }

    public final void onAnswerUpdated() {
        int i10;
        SurveyState.Content currentContentState = getCurrentContentState();
        float stepCount = (float) this.surveyData.getStepCount();
        int size = this.completedSteps.size();
        Iterable<QuestionState> questions = currentContentState.getQuestions();
        if (!(questions instanceof Collection) || !((Collection) questions).isEmpty()) {
            i10 = 0;
            for (QuestionState validationError : questions) {
                if ((validationError.getValidationError() instanceof ValidationError.NoValidationError) && (i10 = i10 + 1) < 0) {
                    C6565s.w();
                }
            }
        } else {
            i10 = 0;
        }
        float f10 = ((float) size) / stepCount;
        float f11 = (float) i10;
        SurveyData.Step step = this.currentStep;
        if (step == null) {
            C6496s.v("currentStep");
            step = null;
        }
        this.state.setValue(SurveyState.Content.copy$default(currentContentState, (List) null, (List) null, (List) null, (SurveyState.Content.PrimaryCta) null, (SurveyUiColors) null, currentContentState.getTopBarState().withProgressBarState(ProgressBarState.copy$default(currentContentState.getTopBarState().getProgressBarState(), false, f10 + (f11 / (stepCount * ((float) step.getQuestions().size()))), 1, (Object) null)), 31, (Object) null));
    }

    public final void onCloseClicked(CloseEventTrigger closeEventTrigger) {
        C6496s.h(closeEventTrigger, "triggerType");
        if (this.surveyData.isDismissible() || (this.state.getValue() instanceof SurveyState.Error)) {
            C5600w0 unused = C5576k.d(b0.a(this), (g) null, (M) null, new SurveyViewModel$onCloseClicked$1(this, closeEventTrigger, (C6658d<? super SurveyViewModel$onCloseClicked$1>) null), 3, (Object) null);
        }
    }

    public final void onSecondaryCtaClicked(SurveyState.Content.SecondaryCta secondaryCta) {
        CloseEventTrigger closeEventTrigger;
        C6496s.h(secondaryCta, "secondaryCta");
        if (secondaryCta.isExternalUrl()) {
            closeEventTrigger = CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK;
        } else {
            closeEventTrigger = CloseEventTrigger.SECONDARY_CTA_DEEP_LINK;
        }
        if (closeEventTrigger == CloseEventTrigger.SECONDARY_CTA_DEEP_LINK) {
            C5600w0 unused = C5576k.d(C5585o0.f65402a, (g) null, (M) null, new SurveyViewModel$onSecondaryCtaClicked$1(this, (C6658d<? super SurveyViewModel$onSecondaryCtaClicked$1>) null), 3, (Object) null);
        }
        onCloseClicked(closeEventTrigger);
    }

    public final void onUiLoaded() {
        if (C6496s.c(this.state.getValue(), SurveyState.Initial.INSTANCE)) {
            C5600w0 unused = C5576k.d(b0.a(this), this.dispatcher, (M) null, new SurveyViewModel$onUiLoaded$1(this, (C6658d<? super SurveyViewModel$onUiLoaded$1>) null), 2, (Object) null);
        }
    }

    public SurveyViewModel(G g10, SurveyLaunchMode surveyLaunchMode, SurveyRepository surveyRepository2, AppConfig appConfig2, MetricTracker metricTracker2, IntercomDataLayer intercomDataLayer2) {
        C6496s.h(g10, "dispatcher");
        C6496s.h(surveyLaunchMode, "launchMode");
        C6496s.h(surveyRepository2, "surveyRepository");
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(metricTracker2, "metricTracker");
        C6496s.h(intercomDataLayer2, "intercomDataLayer");
        this.dispatcher = g10;
        this.launchMode = surveyLaunchMode;
        this.surveyRepository = surveyRepository2;
        this.appConfig = appConfig2;
        this.metricTracker = metricTracker2;
        this.intercomDataLayer = intercomDataLayer2;
        this.surveyData = SurveyData.Companion.getNULL();
        this.state = N.a(SurveyState.Initial.INSTANCE);
        this.effects = D.b(0, 0, (a) null, 7, (Object) null);
        this.completedResponses = new ArrayList();
        this.completedSteps = new ArrayList();
    }
}
