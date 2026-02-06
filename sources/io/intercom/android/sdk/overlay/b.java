package io.intercom.android.sdk.overlay;

import android.view.View;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OverlayPresenter f70051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f70052b;

    public /* synthetic */ b(OverlayPresenter overlayPresenter, View view) {
        this.f70051a = overlayPresenter;
        this.f70052b = view;
    }

    public final void run() {
        this.f70051a.lambda$removeOverlaysIfPresent$6(this.f70052b);
    }
}
