package io.intercom.android.sdk.helpcenter.articles;

import io.intercom.android.sdk.databinding.IntercomFragmentHelpCenterArticleBinding;

/* renamed from: io.intercom.android.sdk.helpcenter.articles.k  reason: case insensitive filesystem */
public final /* synthetic */ class C6011k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntercomFragmentHelpCenterArticleBinding f68583a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArticleFragment$renderContent$1$2 f68584b;

    public /* synthetic */ C6011k(IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding, ArticleFragment$renderContent$1$2 articleFragment$renderContent$1$2) {
        this.f68583a = intercomFragmentHelpCenterArticleBinding;
        this.f68584b = articleFragment$renderContent$1$2;
    }

    public final void run() {
        ArticleFragment$renderContent$1$2.onTransitionCompleted$lambda$0(this.f68583a, this.f68584b);
    }
}
