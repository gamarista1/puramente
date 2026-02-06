package io.intercom.android.sdk.survey.ui.questiontype;

import android.view.View;
import io.intercom.android.sdk.survey.ui.models.Answer;
import yf.C6798l;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.timepicker.b f70329a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Answer f70330b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6798l f70331c;

    public /* synthetic */ b(com.google.android.material.timepicker.b bVar, Answer answer, C6798l lVar) {
        this.f70329a = bVar;
        this.f70330b = answer;
        this.f70331c = lVar;
    }

    public final void onClick(View view) {
        DatePickerQuestionKt.showTimePicker$lambda$14(this.f70329a, this.f70330b, this.f70331c, view);
    }
}
