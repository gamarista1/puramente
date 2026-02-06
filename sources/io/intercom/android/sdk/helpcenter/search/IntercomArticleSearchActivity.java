package io.intercom.android.sdk.helpcenter.search;

import C.f0;
import V.C1415x0;
import Y.C1500m;
import Y.M0;
import Y.Y0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.M;
import androidx.activity.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C1708p0;
import androidx.core.view.f1;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.databinding.IntercomActivityArticleSearchBinding;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel;
import io.intercom.android.sdk.ui.theme.IntercomColorsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import k0.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6531o;
import lf.C6535s;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 (2\u00020\u0001:\u0002()B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003JS\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000bH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "<init>", "()V", "Llf/M;", "setupInsets", "subscribeToStates", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;", "articleSearchState", "Lkotlin/Function0;", "onBackClick", "Lkotlin/Function1;", "LXg/x;", "", "onTextChanged", "onArticleClicked", "SearchScreenContent", "(Lio/intercom/android/sdk/helpcenter/search/ArticleSearchState;Lyf/a;Lyf/l;Lyf/l;LY/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "_binding", "Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewModel", "()Lio/intercom/android/sdk/helpcenter/search/ArticleSearchViewModel;", "viewModel", "Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "args$delegate", "getArgs", "()Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "args", "getBinding", "()Lio/intercom/android/sdk/databinding/IntercomActivityArticleSearchBinding;", "binding", "Companion", "ArticleSearchArgs", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomArticleSearchActivity extends IntercomHelpCenterBaseActivity {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String IS_FROM_SEARCH_BROWSE = "IS_SEARCH_BROWSE";
    private IntercomActivityArticleSearchBinding _binding;
    private final Lazy args$delegate = C6531o.b(new f(this));
    private final Lazy viewModel$delegate = C6531o.b(new e(this));

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000b\u001a\u00020\fH×\u0001J\t\u0010\r\u001a\u00020\u000eH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "", "isFromSearchBrowse", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ArticleSearchArgs {
        public static final int $stable = 0;
        private final boolean isFromSearchBrowse;

        public ArticleSearchArgs() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ ArticleSearchArgs copy$default(ArticleSearchArgs articleSearchArgs, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = articleSearchArgs.isFromSearchBrowse;
            }
            return articleSearchArgs.copy(z10);
        }

        public final boolean component1() {
            return this.isFromSearchBrowse;
        }

        public final ArticleSearchArgs copy(boolean z10) {
            return new ArticleSearchArgs(z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ArticleSearchArgs) && this.isFromSearchBrowse == ((ArticleSearchArgs) obj).isFromSearchBrowse;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromSearchBrowse);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return "ArticleSearchArgs(isFromSearchBrowse=" + this.isFromSearchBrowse + ')';
        }

        public ArticleSearchArgs(boolean z10) {
            this.isFromSearchBrowse = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ArticleSearchArgs(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$Companion;", "", "<init>", "()V", "IS_FROM_SEARCH_BROWSE", "", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "isFromSearchBrowse", "", "getArguments", "Lio/intercom/android/sdk/helpcenter/search/IntercomArticleSearchActivity$ArticleSearchArgs;", "intent", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent buildIntent(Context context, boolean z10) {
            C6496s.h(context, "context");
            Intent intent = new Intent(context, IntercomArticleSearchActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, z10);
            return intent;
        }

        public final ArticleSearchArgs getArguments(Intent intent) {
            C6496s.h(intent, "intent");
            return new ArticleSearchArgs(intent.getBooleanExtra(IntercomArticleSearchActivity.IS_FROM_SEARCH_BROWSE, false));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.intercom.android.sdk.ui.theme.ThemeMode[] r0 = io.intercom.android.sdk.ui.theme.ThemeMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.ui.theme.ThemeMode r1 = io.intercom.android.sdk.ui.theme.ThemeMode.DARK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.ui.theme.ThemeMode r1 = io.intercom.android.sdk.ui.theme.ThemeMode.LIGHT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.ui.theme.ThemeMode r1 = io.intercom.android.sdk.ui.theme.ThemeMode.SYSTEM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.IntercomArticleSearchActivity.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public final void SearchScreenContent(ArticleSearchState articleSearchState, C6787a aVar, C6798l lVar, C6798l lVar2, C1500m mVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ArticleSearchState articleSearchState2 = articleSearchState;
        C6787a aVar2 = aVar;
        C6798l lVar3 = lVar;
        C6798l lVar4 = lVar2;
        int i16 = i10;
        C1500m h10 = mVar.h(865873108);
        if ((i16 & 14) == 0) {
            if (h10.S(articleSearchState2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i16;
        } else {
            i11 = i16;
        }
        if ((i16 & 112) == 0) {
            if (h10.C(aVar2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i16 & 896) == 0) {
            if (h10.C(lVar3)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i16 & 7168) == 0) {
            if (h10.C(lVar4)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 5851) != 1170 || !h10.i()) {
            C1415x0.a((i) null, c.e(-1018273896, true, new IntercomArticleSearchActivity$SearchScreenContent$1(aVar2, lVar3), h10, 54), (p) null, (p) null, (p) null, 0, IntercomTheme.INSTANCE.getColors(h10, IntercomTheme.$stable).m678getBackground0d7_KjU(), 0, (f0) null, c.e(955713763, true, new IntercomArticleSearchActivity$SearchScreenContent$2(articleSearchState2, lVar4), h10, 54), h10, 805306416, 445);
        } else {
            h10.I();
        }
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new g(this, articleSearchState, aVar, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C6514M SearchScreenContent$lambda$3(IntercomArticleSearchActivity intercomArticleSearchActivity, ArticleSearchState articleSearchState, C6787a aVar, C6798l lVar, C6798l lVar2, int i10, C1500m mVar, int i11) {
        C6496s.h(intercomArticleSearchActivity, "$tmp0_rcvr");
        C6496s.h(articleSearchState, "$articleSearchState");
        C6496s.h(aVar, "$onBackClick");
        C6496s.h(lVar, "$onTextChanged");
        C6496s.h(lVar2, "$onArticleClicked");
        intercomArticleSearchActivity.SearchScreenContent(articleSearchState, aVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final ArticleSearchArgs args_delegate$lambda$1(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        C6496s.h(intercomArticleSearchActivity, "this$0");
        Companion companion = Companion;
        Intent intent = intercomArticleSearchActivity.getIntent();
        C6496s.g(intent, "getIntent(...)");
        return companion.getArguments(intent);
    }

    public static final Intent buildIntent(Context context, boolean z10) {
        return Companion.buildIntent(context, z10);
    }

    private final ArticleSearchArgs getArgs() {
        return (ArticleSearchArgs) this.args$delegate.getValue();
    }

    private final IntercomActivityArticleSearchBinding getBinding() {
        IntercomActivityArticleSearchBinding intercomActivityArticleSearchBinding = this._binding;
        if (intercomActivityArticleSearchBinding != null) {
            return intercomActivityArticleSearchBinding;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final ArticleSearchViewModel getViewModel() {
        return (ArticleSearchViewModel) this.viewModel$delegate.getValue();
    }

    private final void setupInsets() {
        s.c(this, (M) null, (M) null, 3, (Object) null);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.intercom_search_screen_root);
        f1 a10 = C1708p0.a(getWindow(), getWindow().getDecorView());
        int i10 = WhenMappings.$EnumSwitchMapping$0[((ThemeMode) IntercomColorsKt.getCurrentThemeMode().getValue()).ordinal()];
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 == 2) {
                z10 = true;
            } else if (i10 != 3) {
                throw new C6535s();
            }
        }
        a10.d(z10);
    }

    private final void subscribeToStates() {
        getBinding().articleSearchComposeView.setContent(c.c(-779899693, true, new IntercomArticleSearchActivity$subscribeToStates$1(this)));
    }

    /* access modifiers changed from: private */
    public static final ArticleSearchViewModel viewModel_delegate$lambda$0(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        C6496s.h(intercomArticleSearchActivity, "this$0");
        ArticleSearchViewModel.Companion companion = ArticleSearchViewModel.Companion;
        HelpCenterApi helpCenterApi = Injector.get().getHelpCenterApi();
        C6496s.g(helpCenterApi, "getHelpCenterApi(...)");
        return companion.create(intercomArticleSearchActivity, helpCenterApi, intercomArticleSearchActivity.getArgs().isFromSearchBrowse());
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.intercom_donothing, R.anim.intercom_fade_out);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this._binding = IntercomActivityArticleSearchBinding.inflate(getLayoutInflater());
        setContentView((View) getBinding().getRoot());
        setupInsets();
        subscribeToStates();
        overridePendingTransition(R.anim.intercom_fade_in, R.anim.intercom_donothing);
    }
}
