package io.intercom.android.sdk.helpcenter.articles;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.M;
import androidx.activity.s;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.IntercomHelpCenterBaseActivity;
import io.intercom.android.sdk.identity.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity;", "Lio/intercom/android/sdk/helpcenter/IntercomHelpCenterBaseActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Llf/M;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Companion", "ArticleActivityArguments", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ArticleActivity extends IntercomHelpCenterBaseActivity {
    public static final int $stable = 0;
    private static final String ARTICLE_ID = "ARTICLE_ID";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String IS_SEARCH_BROWSE = "IS_FROM_SEARCH_BROWSE";
    private static final String METRIC_PLACE = "METRIC_PLACE";
    private static final String SHOULD_HIDE_REACTIONS = "SHOULD_HIDE_REACTIONS";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "", "articleId", "", "metricPlace", "isFromSearchBrowse", "", "shouldHideReactions", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getArticleId", "()Ljava/lang/String;", "getMetricPlace", "()Z", "getShouldHideReactions", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ArticleActivityArguments {
        public static final int $stable = 0;
        private final String articleId;
        private final boolean isFromSearchBrowse;
        private final String metricPlace;
        private final boolean shouldHideReactions;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public ArticleActivityArguments(String str, String str2) {
            this(str, str2, false, false, 12, (DefaultConstructorMarker) null);
            C6496s.h(str, "articleId");
            C6496s.h(str2, "metricPlace");
        }

        public static /* synthetic */ ArticleActivityArguments copy$default(ArticleActivityArguments articleActivityArguments, String str, String str2, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = articleActivityArguments.articleId;
            }
            if ((i10 & 2) != 0) {
                str2 = articleActivityArguments.metricPlace;
            }
            if ((i10 & 4) != 0) {
                z10 = articleActivityArguments.isFromSearchBrowse;
            }
            if ((i10 & 8) != 0) {
                z11 = articleActivityArguments.shouldHideReactions;
            }
            return articleActivityArguments.copy(str, str2, z10, z11);
        }

        public final String component1() {
            return this.articleId;
        }

        public final String component2() {
            return this.metricPlace;
        }

        public final boolean component3() {
            return this.isFromSearchBrowse;
        }

        public final boolean component4() {
            return this.shouldHideReactions;
        }

        public final ArticleActivityArguments copy(String str, String str2, boolean z10, boolean z11) {
            C6496s.h(str, "articleId");
            C6496s.h(str2, "metricPlace");
            return new ArticleActivityArguments(str, str2, z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleActivityArguments)) {
                return false;
            }
            ArticleActivityArguments articleActivityArguments = (ArticleActivityArguments) obj;
            return C6496s.c(this.articleId, articleActivityArguments.articleId) && C6496s.c(this.metricPlace, articleActivityArguments.metricPlace) && this.isFromSearchBrowse == articleActivityArguments.isFromSearchBrowse && this.shouldHideReactions == articleActivityArguments.shouldHideReactions;
        }

        public final String getArticleId() {
            return this.articleId;
        }

        public final String getMetricPlace() {
            return this.metricPlace;
        }

        public final boolean getShouldHideReactions() {
            return this.shouldHideReactions;
        }

        public int hashCode() {
            return (((((this.articleId.hashCode() * 31) + this.metricPlace.hashCode()) * 31) + Boolean.hashCode(this.isFromSearchBrowse)) * 31) + Boolean.hashCode(this.shouldHideReactions);
        }

        public final boolean isFromSearchBrowse() {
            return this.isFromSearchBrowse;
        }

        public String toString() {
            return "ArticleActivityArguments(articleId=" + this.articleId + ", metricPlace=" + this.metricPlace + ", isFromSearchBrowse=" + this.isFromSearchBrowse + ", shouldHideReactions=" + this.shouldHideReactions + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public ArticleActivityArguments(String str, String str2, boolean z10) {
            this(str, str2, z10, false, 8, (DefaultConstructorMarker) null);
            C6496s.h(str, "articleId");
            C6496s.h(str2, "metricPlace");
        }

        public ArticleActivityArguments(String str, String str2, boolean z10, boolean z11) {
            C6496s.h(str, "articleId");
            C6496s.h(str2, "metricPlace");
            this.articleId = str;
            this.metricPlace = str2;
            this.isFromSearchBrowse = z10;
            this.shouldHideReactions = z11;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ArticleActivityArguments(String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$Companion;", "", "<init>", "()V", "ARTICLE_ID", "", "METRIC_PLACE", "IS_SEARCH_BROWSE", "SHOULD_HIDE_REACTIONS", "buildIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "articleActivityArguments", "Lio/intercom/android/sdk/helpcenter/articles/ArticleActivity$ArticleActivityArguments;", "getArguments", "intent", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
            Class cls;
            C6496s.h(context, "context");
            C6496s.h(articleActivityArguments, "articleActivityArguments");
            if (Injector.isNotInitialised() || !Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.NEW_ARTICLE_SCREEN)) {
                cls = ArticleActivity.class;
            } else {
                cls = IntercomArticleActivity.class;
            }
            Intent intent = new Intent(context, cls);
            intent.setFlags(268435456);
            intent.putExtra(ArticleActivity.ARTICLE_ID, articleActivityArguments.getArticleId());
            intent.putExtra(ArticleActivity.METRIC_PLACE, articleActivityArguments.getMetricPlace());
            intent.putExtra(ArticleActivity.IS_SEARCH_BROWSE, articleActivityArguments.isFromSearchBrowse());
            intent.putExtra(ArticleActivity.SHOULD_HIDE_REACTIONS, articleActivityArguments.getShouldHideReactions());
            return intent;
        }

        @SuppressLint({"WrongConstant"})
        public final ArticleActivityArguments getArguments(Intent intent) {
            C6496s.h(intent, "intent");
            String stringExtra = intent.getStringExtra(ArticleActivity.ARTICLE_ID);
            String str = "";
            if (stringExtra == null) {
                stringExtra = str;
            }
            String stringExtra2 = intent.getStringExtra(ArticleActivity.METRIC_PLACE);
            if (stringExtra2 != null) {
                str = stringExtra2;
            }
            return new ArticleActivityArguments(stringExtra, str, intent.getBooleanExtra(ArticleActivity.IS_SEARCH_BROWSE, false), intent.getBooleanExtra(ArticleActivity.SHOULD_HIDE_REACTIONS, false));
        }

        private Companion() {
        }
    }

    public static final Intent buildIntent(Context context, ArticleActivityArguments articleActivityArguments) {
        return Companion.buildIntent(context, articleActivityArguments);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.intercom_donothing, R.anim.intercom_composer_slide_down);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        s.c(this, (M) null, (M) null, 3, (Object) null);
        super.onCreate(bundle);
        setContentView(R.layout.intercom_activity_help_center_article);
        overridePendingTransition(R.anim.intercom_composer_slide_up, R.anim.intercom_donothing);
    }
}
