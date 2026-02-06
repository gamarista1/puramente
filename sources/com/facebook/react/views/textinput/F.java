package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.widget.TextView;
import com.facebook.react.uimanager.C3415h0;

public final /* synthetic */ class F implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3443j f42236a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3415h0 f42237b;

    public /* synthetic */ F(C3443j jVar, C3415h0 h0Var) {
        this.f42236a = jVar;
        this.f42237b = h0Var;
    }

    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        return ReactTextInputManager.lambda$addEventEmitters$1(this.f42236a, this.f42237b, textView, i10, keyEvent);
    }
}
