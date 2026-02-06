package io.intercom.android.sdk.helpcenter.articles;

import android.webkit.ValueCallback;

/* renamed from: io.intercom.android.sdk.helpcenter.articles.f  reason: case insensitive filesystem */
public final /* synthetic */ class C6006f implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArticleFragment f68579a;

    public /* synthetic */ C6006f(ArticleFragment articleFragment) {
        this.f68579a = articleFragment;
    }

    public final void onReceiveValue(Object obj) {
        ArticleFragment.renderContent$lambda$7$lambda$6(this.f68579a, (String) obj);
    }
}
