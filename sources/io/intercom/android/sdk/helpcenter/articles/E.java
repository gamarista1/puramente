package io.intercom.android.sdk.helpcenter.articles;

import android.webkit.ValueCallback;

public final /* synthetic */ class E implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntercomArticleActivity f68560a;

    public /* synthetic */ E(IntercomArticleActivity intercomArticleActivity) {
        this.f68560a = intercomArticleActivity;
    }

    public final void onReceiveValue(Object obj) {
        IntercomArticleActivity$onCreate$1$1$3$1$1$1$1.onArticleFinishedLoading$lambda$0(this.f68560a, (String) obj);
    }
}
