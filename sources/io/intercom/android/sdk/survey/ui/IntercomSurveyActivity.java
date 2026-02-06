package io.intercom.android.sdk.survey.ui;

import Ug.C5600w0;
import Y.r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.M;
import androidx.activity.s;
import androidx.lifecycle.C1799w;
import e.C1932e;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.survey.SurveyLaunchMode;
import io.intercom.android.sdk.survey.SurveyViewModel;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import qf.C6658d;
import qf.g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u0003R\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/survey/ui/IntercomSurveyActivity;", "Lio/intercom/android/sdk/activities/IntercomBaseActivity;", "<init>", "()V", "Lio/intercom/android/sdk/survey/SurveyViewModel;", "createVM", "()Lio/intercom/android/sdk/survey/SurveyViewModel;", "Landroid/os/Bundle;", "savedInstanceState", "Llf/M;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onBackPressed", "Lio/intercom/android/sdk/Injector;", "kotlin.jvm.PlatformType", "injector", "Lio/intercom/android/sdk/Injector;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "viewModel", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomSurveyActivity extends IntercomBaseActivity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String PARCEL_SURVEY_ID = "parcel_survey_id";
    /* access modifiers changed from: private */
    public final Injector injector = Injector.get();
    private final Lazy viewModel$delegate = C6531o.b(new a(this));

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/survey/ui/IntercomSurveyActivity$Companion;", "", "<init>", "()V", "PARCEL_SURVEY_ID", "", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "surveyId", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent buildIntent$default(Companion companion, Context context, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.buildIntent(context, str);
        }

        public final Intent buildIntent(Context context) {
            C6496s.h(context, "context");
            return buildIntent$default(this, context, (String) null, 2, (Object) null);
        }

        private Companion() {
        }

        public final Intent buildIntent(Context context, String str) {
            C6496s.h(context, "context");
            Intent intent = new Intent(context, IntercomSurveyActivity.class);
            intent.putExtra(IntercomSurveyActivity.PARCEL_SURVEY_ID, str);
            intent.setFlags(335544320);
            return intent;
        }
    }

    public static final Intent buildIntent(Context context) {
        return Companion.buildIntent(context);
    }

    private final SurveyViewModel createVM() {
        SurveyLaunchMode surveyLaunchMode;
        String stringExtra = getIntent().getStringExtra(PARCEL_SURVEY_ID);
        if (stringExtra != null) {
            surveyLaunchMode = new SurveyLaunchMode.Programmatic(stringExtra);
        } else {
            surveyLaunchMode = new SurveyLaunchMode.Automatic((SurveyData) this.injector.getDataLayer().getSurveyData().getValue());
        }
        return SurveyViewModel.Companion.create(this, surveyLaunchMode);
    }

    /* access modifiers changed from: private */
    public final SurveyViewModel getViewModel() {
        return (SurveyViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public static final SurveyViewModel viewModel_delegate$lambda$0(IntercomSurveyActivity intercomSurveyActivity) {
        C6496s.h(intercomSurveyActivity, "this$0");
        return intercomSurveyActivity.createVM();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        s.c(this, (M) null, (M) null, 3, (Object) null);
        super.onCreate(bundle);
        PhoneNumberValidator.loadCountryAreaCodes(this);
        C1932e.b(this, (r) null, c.c(-179321000, true, new IntercomSurveyActivity$onCreate$1(this)), 1, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C5600w0 unused = C5576k.d(C1799w.a(this), (g) null, (Ug.M) null, new IntercomSurveyActivity$onStart$1(this, (C6658d<? super IntercomSurveyActivity$onStart$1>) null), 3, (Object) null);
        getViewModel().onUiLoaded();
    }

    public static final Intent buildIntent(Context context, String str) {
        return Companion.buildIntent(context, str);
    }
}
