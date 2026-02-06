package io.intercom.android.sdk.helpcenter.articles;

import Sg.p;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.C1680b0;
import androidx.core.view.D0;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import androidx.lifecycle.C1799w;
import com.amazon.a.a.o.b;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.articles.ArticleWebViewClient;
import io.intercom.android.sdk.databinding.IntercomFragmentHelpCenterArticleBinding;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewModel;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.extensions.ViewExtensionsKt;
import io.intercom.android.sdk.views.IntercomShimmerLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import lf.C6531o;
import lf.C6535s;
import mf.O;
import p1.C2388d;
import qf.C6658d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleFragment;", "Landroidx/fragment/app/q;", "<init>", "()V", "Llf/M;", "requestData", "subscribeToStates", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;", "error", "renderErrors", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Error;)V", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;", "content", "renderContent", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$Content;)V", "setCookies", "setInsets", "initViews", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lio/intercom/android/sdk/databinding/IntercomFragmentHelpCenterArticleBinding;", "_binding", "Lio/intercom/android/sdk/databinding/IntercomFragmentHelpCenterArticleBinding;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "arguments$delegate", "Lkotlin/Lazy;", "getArguments", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "arguments", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel$delegate", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "viewModel", "getBinding", "()Lio/intercom/android/sdk/databinding/IntercomFragmentHelpCenterArticleBinding;", "binding", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleFragment extends C1769q {
    public static final int $stable = 8;
    private IntercomFragmentHelpCenterArticleBinding _binding;
    private final Lazy arguments$delegate = C6531o.b(new C6007g(this));
    private final Lazy viewModel$delegate = C6531o.b(new C6008h(this));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$WebViewStatus[] r0 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.WebViewStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$WebViewStatus r1 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.WebViewStatus.Idle     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$WebViewStatus r1 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.WebViewStatus.Loading     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.helpcenter.articles.ArticleViewState$WebViewStatus r1 = io.intercom.android.sdk.helpcenter.articles.ArticleViewState.WebViewStatus.Ready     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.articles.ArticleFragment.WhenMappings.<clinit>():void");
        }
    }

    public ArticleFragment() {
        super(R.layout.intercom_fragment_help_center_article);
    }

    /* access modifiers changed from: private */
    public static final ArticleActivity.ArticleActivityArguments arguments_delegate$lambda$0(ArticleFragment articleFragment) {
        C6496s.h(articleFragment, "this$0");
        ArticleActivity.Companion companion = ArticleActivity.Companion;
        Intent intent = articleFragment.requireActivity().getIntent();
        C6496s.g(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    private final ArticleActivity.ArticleActivityArguments getArguments() {
        return (ArticleActivity.ArticleActivityArguments) this.arguments$delegate.getValue();
    }

    private final IntercomFragmentHelpCenterArticleBinding getBinding() {
        IntercomFragmentHelpCenterArticleBinding intercomFragmentHelpCenterArticleBinding = this._binding;
        if (intercomFragmentHelpCenterArticleBinding != null) {
            return intercomFragmentHelpCenterArticleBinding;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final ArticleViewModel getViewModel() {
        return (ArticleViewModel) this.viewModel$delegate.getValue();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void initViews() {
        this._binding = IntercomFragmentHelpCenterArticleBinding.bind(requireView());
        IntercomFragmentHelpCenterArticleBinding binding = getBinding();
        binding.articleToolbar.setNavigationOnClickListener(new C6002b(this));
        binding.articleWebView.getSettings().setJavaScriptEnabled(true);
        binding.articleWebView.addJavascriptInterface(new HelpCenterWebViewInterface(binding.articleWebView, Injector.get().getGson(), Injector.get().getMetricTracker(), Injector.get().getApiProvider().get(), getArguments().isFromSearchBrowse()), "AndroidHost");
        binding.articleReactions.intercomReactionHappy.setOnClickListener(new C6003c(this));
        binding.articleReactions.intercomReactionNeutral.setOnClickListener(new C6004d(this));
        binding.articleReactions.intercomReactionSad.setOnClickListener(new C6005e(this));
    }

    /* access modifiers changed from: private */
    public static final void initViews$lambda$15$lambda$11(ArticleFragment articleFragment, View view) {
        C6496s.h(articleFragment, "this$0");
        C1773v activity = articleFragment.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    public static final void initViews$lambda$15$lambda$12(ArticleFragment articleFragment, View view) {
        C6496s.h(articleFragment, "this$0");
        articleFragment.getViewModel().happyReactionTapped();
    }

    /* access modifiers changed from: private */
    public static final void initViews$lambda$15$lambda$13(ArticleFragment articleFragment, View view) {
        C6496s.h(articleFragment, "this$0");
        articleFragment.getViewModel().neutralReactionTapped();
    }

    /* access modifiers changed from: private */
    public static final void initViews$lambda$15$lambda$14(ArticleFragment articleFragment, View view) {
        C6496s.h(articleFragment, "this$0");
        articleFragment.getViewModel().sadReactionTapped();
    }

    /* access modifiers changed from: private */
    public final void renderContent(ArticleViewState.Content content) {
        IntercomFragmentHelpCenterArticleBinding binding = getBinding();
        Group group = binding.articleErrorViews;
        C6496s.g(group, "articleErrorViews");
        ViewExtensionsKt.hide(group);
        binding.articleReactions.getRoot().setVisibility(content.getReactionState().getReactionComponentVisibility());
        binding.articleTeamHelp.setVisibility(content.getReactionState().getReactionComponentVisibility());
        binding.articleReactionsDivider.setVisibility(content.getReactionState().getReactionComponentVisibility());
        int i10 = WhenMappings.$EnumSwitchMapping$0[content.getWebViewStatus().ordinal()];
        if (i10 == 1) {
            IntercomShimmerLayout intercomShimmerLayout = binding.articleLoadingView;
            C6496s.g(intercomShimmerLayout, "articleLoadingView");
            ViewExtensionsKt.show(intercomShimmerLayout);
            LinearLayout linearLayout = binding.articleContents;
            C6496s.g(linearLayout, "articleContents");
            ViewExtensionsKt.hide(linearLayout);
            binding.articleWebView.setWebViewClient(new ArticleWebViewClient(content.getArticleUrl(), getViewModel(), Injector.get().getAppConfigProvider().get().getHelpCenterUrls()));
            setCookies();
            binding.articleWebView.loadUrl(content.getArticleUrl(), O.l(C6502A.a("MobileClientDisplayType", "AndroidIntercomHeaderless"), C6502A.a("MobileClient", "AndroidIntercomWebView"), C6502A.a("MobileClientReactionsHidden", b.f37475af)));
        } else if (i10 == 2) {
            IntercomShimmerLayout intercomShimmerLayout2 = binding.articleLoadingView;
            C6496s.g(intercomShimmerLayout2, "articleLoadingView");
            ViewExtensionsKt.show(intercomShimmerLayout2);
            LinearLayout linearLayout2 = binding.articleContents;
            C6496s.g(linearLayout2, "articleContents");
            ViewExtensionsKt.hide(linearLayout2);
        } else if (i10 == 3) {
            IntercomShimmerLayout intercomShimmerLayout3 = binding.articleLoadingView;
            C6496s.g(intercomShimmerLayout3, "articleLoadingView");
            ViewExtensionsKt.hide(intercomShimmerLayout3);
            LinearLayout linearLayout3 = binding.articleContents;
            C6496s.g(linearLayout3, "articleContents");
            ViewExtensionsKt.show(linearLayout3);
            binding.articleWebView.evaluateJavascript("window.alexandriaArticleContentId", new C6006f(this));
        } else {
            throw new C6535s();
        }
        binding.articleTeamHelp.setVisibility(content.getReactionState().getTeamHelpVisibility());
        binding.articleTeamHelp.setNeedsChatBubble(true);
        binding.articleTeamHelp.setTeamPresenceState(content.getTeamPresenceState());
        if (content.getReactionState().getShouldScrollToBottom()) {
            binding.articleReactions.motionLayout.setTransitionListener(new ArticleFragment$renderContent$1$2(binding));
        }
        binding.articleReactions.motionLayout.I0(content.getReactionState().getTransitionState());
    }

    /* access modifiers changed from: private */
    public static final void renderContent$lambda$7$lambda$6(ArticleFragment articleFragment, String str) {
        C6496s.h(articleFragment, "this$0");
        ArticleViewModel viewModel = articleFragment.getViewModel();
        C6496s.e(str);
        viewModel.articleContentIdFetched(p.x0(str, "\""));
    }

    /* access modifiers changed from: private */
    public final void renderErrors(ArticleViewState.Error error) {
        IntercomFragmentHelpCenterArticleBinding binding = getBinding();
        IntercomShimmerLayout intercomShimmerLayout = binding.articleLoadingView;
        C6496s.g(intercomShimmerLayout, "articleLoadingView");
        ViewExtensionsKt.hide(intercomShimmerLayout);
        LinearLayout linearLayout = binding.articleContents;
        C6496s.g(linearLayout, "articleContents");
        ViewExtensionsKt.hide(linearLayout);
        TextView textView = binding.articleErrorTextView;
        C6496s.g(textView, "articleErrorTextView");
        ViewExtensionsKt.show(textView);
        binding.articleErrorTextView.setText(error.getMessage());
        TextView textView2 = binding.articleRetryButton;
        textView2.setVisibility(error.getRetryButtonVisibility());
        textView2.setOnClickListener(new C6001a(this));
        textView2.setBackgroundTintList(ColorStateList.valueOf(ColorUtils.buttonBackgroundColorVariant(error.getRetryButtonPrimaryColor())));
        textView2.setTextColor(error.getRetryButtonPrimaryColor());
    }

    /* access modifiers changed from: private */
    public static final void renderErrors$lambda$5$lambda$4$lambda$3(ArticleFragment articleFragment, View view) {
        C6496s.h(articleFragment, "this$0");
        articleFragment.requestData();
    }

    private final void requestData() {
        getViewModel().fragmentLoaded(getArguments().getArticleId());
    }

    private final void setCookies() {
        Injector injector = Injector.get();
        String str = "intercom-session-" + injector.getAppIdentity().appId();
        String encryptedUserId = injector.getUserIdentity().getEncryptedUserId();
        C6496s.g(encryptedUserId, "getEncryptedUserId(...)");
        CookieManager.getInstance().setCookie(injector.getAppConfigProvider().get().getHelpCenterUrl(), str + '=' + encryptedUserId);
    }

    private final void setInsets() {
        C1680b0.C0(getBinding().articleParentView, new C6010j());
    }

    /* access modifiers changed from: private */
    public static final D0 setInsets$lambda$10$lambda$9(View view, D0 d02) {
        C6496s.h(view, "v");
        C6496s.h(d02, "insets");
        C2388d f10 = d02.f(D0.n.h() | D0.n.b());
        C6496s.g(f10, "getInsets(...)");
        view.setPadding(f10.f25150a, f10.f25151b, f10.f25152c, f10.f25153d);
        return D0.f15980b;
    }

    private final void subscribeToStates() {
        C1799w.a(this).b(new ArticleFragment$subscribeToStates$1(this, (C6658d<? super ArticleFragment$subscribeToStates$1>) null));
    }

    /* access modifiers changed from: private */
    public static final ArticleViewModel viewModel_delegate$lambda$2(ArticleFragment articleFragment) {
        C6496s.h(articleFragment, "this$0");
        ArticleViewModel.Companion companion = ArticleViewModel.Companion;
        C1773v requireActivity = articleFragment.requireActivity();
        C6496s.g(requireActivity, "requireActivity(...)");
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        C6496s.g(helpCenterApi, "getHelpCenterApi(...)");
        return companion.create(requireActivity, helpCenterApi, Injector.get().getAppConfigProvider().get().getHelpCenterUrl(), articleFragment.getArguments().getMetricPlace(), articleFragment.getArguments().isFromSearchBrowse(), articleFragment.getArguments().getShouldHideReactions(), new C6009i(articleFragment));
    }

    /* access modifiers changed from: private */
    public static final C6514M viewModel_delegate$lambda$2$lambda$1(ArticleFragment articleFragment, int i10) {
        C6496s.h(articleFragment, "this$0");
        articleFragment.getBinding().articleScrollview.scrollTo(0, i10);
        return C6514M.f71813a;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C6496s.h(view, "view");
        super.onViewCreated(view, bundle);
        initViews();
        setInsets();
        subscribeToStates();
        requestData();
    }
}
