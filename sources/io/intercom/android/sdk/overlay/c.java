package io.intercom.android.sdk.overlay;

import android.view.ViewGroup;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OverlayPresenter f70053a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f70054b;

    public /* synthetic */ c(OverlayPresenter overlayPresenter, ViewGroup viewGroup) {
        this.f70053a = overlayPresenter;
        this.f70054b = viewGroup;
    }

    public final void run() {
        this.f70053a.lambda$onNewConfig$5(this.f70054b);
    }
}
