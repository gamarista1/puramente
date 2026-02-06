package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

public final /* synthetic */ class j0 implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f11923a;

    public /* synthetic */ j0(Runnable runnable) {
        this.f11923a = runnable;
    }

    public final void onBackInvoked() {
        this.f11923a.run();
    }
}
