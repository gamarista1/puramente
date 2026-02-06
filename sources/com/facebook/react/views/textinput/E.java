package com.facebook.react.views.textinput;

import android.view.View;
import com.facebook.react.uimanager.C3415h0;

public final /* synthetic */ class E implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3415h0 f42234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3443j f42235b;

    public /* synthetic */ E(C3415h0 h0Var, C3443j jVar) {
        this.f42234a = h0Var;
        this.f42235b = jVar;
    }

    public final void onFocusChange(View view, boolean z10) {
        ReactTextInputManager.lambda$addEventEmitters$0(this.f42234a, this.f42235b, view, z10);
    }
}
