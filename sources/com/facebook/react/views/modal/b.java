package com.facebook.react.views.modal;

import android.content.DialogInterface;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.events.EventDispatcher;

public final /* synthetic */ class b implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EventDispatcher f41913a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3415h0 f41914b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReactModalHostView f41915c;

    public /* synthetic */ b(EventDispatcher eventDispatcher, C3415h0 h0Var, ReactModalHostView reactModalHostView) {
        this.f41913a = eventDispatcher;
        this.f41914b = h0Var;
        this.f41915c = reactModalHostView;
    }

    public final void onShow(DialogInterface dialogInterface) {
        ReactModalHostManager.addEventEmitters$lambda$1(this.f41913a, this.f41914b, this.f41915c, dialogInterface);
    }
}
