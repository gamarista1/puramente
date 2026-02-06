package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.activity.H;
import yf.C6787a;

public final /* synthetic */ class I implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6787a f10773a;

    public /* synthetic */ I(C6787a aVar) {
        this.f10773a = aVar;
    }

    public final void onBackInvoked() {
        H.f.c(this.f10773a);
    }
}
