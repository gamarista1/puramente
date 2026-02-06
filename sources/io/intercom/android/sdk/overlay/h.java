package io.intercom.android.sdk.overlay;

import android.app.Activity;
import io.intercom.android.sdk.Intercom;
import java.util.List;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OverlayPresenter f70059a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f70060b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f70061c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Intercom.Visibility f70062d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Activity f70063e;

    public /* synthetic */ h(OverlayPresenter overlayPresenter, String str, List list, Intercom.Visibility visibility, Activity activity) {
        this.f70059a = overlayPresenter;
        this.f70060b = str;
        this.f70061c = list;
        this.f70062d = visibility;
        this.f70063e = activity;
    }

    public final void run() {
        this.f70059a.lambda$preloadAvatarThenDisplayNotifications$7(this.f70060b, this.f70061c, this.f70062d, this.f70063e);
    }
}
