package io.intercom.android.sdk.survey.ui.components;

import Y.C1500m;
import io.intercom.android.sdk.survey.SurveyState;
import k0.i;
import yf.p;

/* renamed from: io.intercom.android.sdk.survey.ui.components.f  reason: case insensitive filesystem */
public final /* synthetic */ class C6283f implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SurveyState.Error f70266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f70267b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f70268c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f70269d;

    public /* synthetic */ C6283f(SurveyState.Error error, i iVar, int i10, int i11) {
        this.f70266a = error;
        this.f70267b = iVar;
        this.f70268c = i10;
        this.f70269d = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ErrorComponentKt.SurveyError$lambda$1(this.f70266a, this.f70267b, this.f70268c, this.f70269d, (C1500m) obj, ((Integer) obj2).intValue());
    }
}
