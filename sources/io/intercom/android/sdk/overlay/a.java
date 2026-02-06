package io.intercom.android.sdk.overlay;

import android.view.ViewGroup;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OverlayPresenter f70049a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f70050b;

    public /* synthetic */ a(OverlayPresenter overlayPresenter, ViewGroup viewGroup) {
        this.f70049a = overlayPresenter;
        this.f70050b = viewGroup;
    }

    public final void run() {
        this.f70049a.lambda$onStateChange$4(this.f70050b);
    }
}
