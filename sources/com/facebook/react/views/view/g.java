package com.facebook.react.views.view;

import android.view.View;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f42342a;

    public /* synthetic */ g(e eVar) {
        this.f42342a = eVar;
    }

    public final void onClick(View view) {
        ReactViewManager.setFocusable$lambda$2(this.f42342a, view);
    }
}
