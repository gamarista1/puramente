package io.intercom.android.sdk.helpcenter.articles;

import Sg.p;
import android.webkit.WebView;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"io/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$onCreate$1$1$3$1$1$1$1", "Lio/intercom/android/sdk/articles/ArticleWebViewListener;", "Llf/M;", "onArticleStartedLoading", "()V", "onArticleFinishedLoading", "onArticleLoadingError", "articleNotFound", "", "y", "scrollArticleViewTo", "(I)V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomArticleActivity$onCreate$1$1$3$1$1$1$1 implements ArticleWebViewListener {
    final /* synthetic */ WebView $this_apply;
    final /* synthetic */ IntercomArticleActivity this$0;

    IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(IntercomArticleActivity intercomArticleActivity, WebView webView) {
        this.this$0 = intercomArticleActivity;
        this.$this_apply = webView;
    }

    /* access modifiers changed from: private */
    public static final void onArticleFinishedLoading$lambda$0(IntercomArticleActivity intercomArticleActivity, String str) {
        C6496s.h(intercomArticleActivity, "this$0");
        ArticleViewModel access$getViewModel = intercomArticleActivity.getViewModel();
        C6496s.e(str);
        access$getViewModel.articleContentIdFetched(p.x0(str, "\""));
    }

    public void articleNotFound() {
        this.this$0.getViewModel().articleNotFound();
    }

    public void onArticleFinishedLoading() {
        this.this$0.getViewModel().onArticleFinishedLoading();
        this.$this_apply.evaluateJavascript("window.alexandriaArticleContentId", new E(this.this$0));
    }

    public void onArticleLoadingError() {
        this.this$0.getViewModel().onArticleLoadingError();
    }

    public void onArticleStartedLoading() {
        this.this$0.getViewModel().onArticleStartedLoading();
    }

    public void scrollArticleViewTo(int i10) {
        this.this$0.getViewModel().scrollArticleViewTo(i10);
    }
}
