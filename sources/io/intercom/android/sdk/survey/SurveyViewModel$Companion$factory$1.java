package io.intercom.android.sdk.survey;

import Ff.d;
import Ug.G;
import Z1.a;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/intercom/android/sdk/survey/SurveyViewModel$Companion$factory$1", "Landroidx/lifecycle/c0$c;", "Landroidx/lifecycle/a0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/a0;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SurveyViewModel$Companion$factory$1 implements c0.c {
    final /* synthetic */ SurveyLaunchMode $launchMode;

    SurveyViewModel$Companion$factory$1(SurveyLaunchMode surveyLaunchMode) {
        this.$launchMode = surveyLaunchMode;
    }

    public /* bridge */ /* synthetic */ a0 create(d dVar, a aVar) {
        return super.create(dVar, aVar);
    }

    public /* bridge */ /* synthetic */ a0 create(Class cls, a aVar) {
        return super.create(cls, aVar);
    }

    public <T extends a0> T create(Class<T> cls) {
        C6496s.h(cls, "modelClass");
        return new SurveyViewModel((G) null, this.$launchMode, (SurveyRepository) null, (AppConfig) null, (MetricTracker) null, (IntercomDataLayer) null, 61, (DefaultConstructorMarker) null);
    }
}
