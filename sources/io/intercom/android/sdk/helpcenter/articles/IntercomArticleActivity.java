package io.intercom.android.sdk.helpcenter.articles;

import Y.C1488g1;
import Y.C1505o0;
import Y.r;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieManager;
import androidx.activity.M;
import androidx.activity.s;
import e.C1932e;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6531o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0015¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "<init>", "()V", "Llf/M;", "setCookies", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "arguments$delegate", "Lkotlin/Lazy;", "getArguments", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "arguments", "LY/o0;", "scrollBy", "LY/o0;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel$delegate", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomArticleActivity extends IntercomHelpCenterBaseActivity {
    public static final int $stable = 8;
    private final Lazy arguments$delegate = C6531o.b(new u(this));
    private final C1505o0 scrollBy = C1488g1.a(0);
    private final Lazy viewModel$delegate = C6531o.b(new v(this));

    /* access modifiers changed from: private */
    public static final ArticleActivity.ArticleActivityArguments arguments_delegate$lambda$0(IntercomArticleActivity intercomArticleActivity) {
        C6496s.h(intercomArticleActivity, "this$0");
        ArticleActivity.Companion companion = ArticleActivity.Companion;
        Intent intent = intercomArticleActivity.getIntent();
        C6496s.g(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    /* access modifiers changed from: private */
    public final ArticleActivity.ArticleActivityArguments getArguments() {
        return (ArticleActivity.ArticleActivityArguments) this.arguments$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final ArticleViewModel getViewModel() {
        return (ArticleViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void setCookies() {
        Injector injector = Injector.get();
        String str = "intercom-session-" + injector.getAppIdentity().appId();
        String encryptedUserId = injector.getUserIdentity().getEncryptedUserId();
        C6496s.g(encryptedUserId, "getEncryptedUserId(...)");
        CookieManager.getInstance().setCookie(injector.getAppConfigProvider().get().getHelpCenterUrl(), str + '=' + encryptedUserId);
    }

    /* access modifiers changed from: private */
    public static final ArticleViewModel viewModel_delegate$lambda$2(IntercomArticleActivity intercomArticleActivity) {
        C6496s.h(intercomArticleActivity, "this$0");
        ArticleViewModel.Companion companion = ArticleViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        C6496s.g(helpCenterApi, "getHelpCenterApi(...)");
        return companion.create(intercomArticleActivity, helpCenterApi, Injector.get().getAppConfigProvider().get().getHelpCenterUrl(), intercomArticleActivity.getArguments().getMetricPlace(), intercomArticleActivity.getArguments().isFromSearchBrowse(), intercomArticleActivity.getArguments().getShouldHideReactions(), new w(intercomArticleActivity));
    }

    /* access modifiers changed from: private */
    public static final C6514M viewModel_delegate$lambda$2$lambda$1(IntercomArticleActivity intercomArticleActivity, int i10) {
        C6496s.h(intercomArticleActivity, "this$0");
        intercomArticleActivity.scrollBy.f(i10);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s.c(this, (M) null, (M) null, 3, (Object) null);
        C1932e.b(this, (r) null, c.c(1674700077, true, new IntercomArticleActivity$onCreate$1(this)), 1, (Object) null);
    }
}
