package com.facebook.react.views.modal;

import android.content.DialogInterface;
import com.facebook.react.uimanager.C3415h0;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.modal.ReactModalHostView;

public final /* synthetic */ class a implements ReactModalHostView.OnRequestCloseListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EventDispatcher f41910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C3415h0 f41911b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ReactModalHostView f41912c;

    public /* synthetic */ a(EventDispatcher eventDispatcher, C3415h0 h0Var, ReactModalHostView reactModalHostView) {
        this.f41910a = eventDispatcher;
        this.f41911b = h0Var;
        this.f41912c = reactModalHostView;
    }

    public final void onRequestClose(DialogInterface dialogInterface) {
        ReactModalHostManager.addEventEmitters$lambda$0(this.f41910a, this.f41911b, this.f41912c, dialogInterface);
    }
}
