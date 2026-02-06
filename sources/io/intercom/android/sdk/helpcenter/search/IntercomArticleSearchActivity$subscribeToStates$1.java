package io.intercom.android.sdk.helpcenter.search;

import Xg.x;
import Y.C1500m;
import Y.p1;
import g0.c;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import qf.g;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomArticleSearchActivity$subscribeToStates$1 implements p {
    final /* synthetic */ IntercomArticleSearchActivity this$0;

    IntercomArticleSearchActivity$subscribeToStates$1(IntercomArticleSearchActivity intercomArticleSearchActivity) {
        this.this$0 = intercomArticleSearchActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        if ((i10 & 11) != 2 || !mVar.i()) {
            AppConfig appConfig = Injector.get().getAppConfigProvider().get();
            C6496s.g(appConfig, "get(...)");
            final IntercomArticleSearchActivity intercomArticleSearchActivity = this.this$0;
            ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, c.e(-1191058574, true, new p() {
                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$0(IntercomArticleSearchActivity intercomArticleSearchActivity) {
                    C6496s.h(intercomArticleSearchActivity, "this$0");
                    intercomArticleSearchActivity.onBackPressed();
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$1(IntercomArticleSearchActivity intercomArticleSearchActivity, x xVar) {
                    C6496s.h(intercomArticleSearchActivity, "this$0");
                    C6496s.h(xVar, "textFlow");
                    intercomArticleSearchActivity.getViewModel().searchForArticles(xVar);
                    return C6514M.f71813a;
                }

                /* access modifiers changed from: private */
                public static final C6514M invoke$lambda$2(IntercomArticleSearchActivity intercomArticleSearchActivity, String str) {
                    C6496s.h(intercomArticleSearchActivity, "this$0");
                    C6496s.h(str, "it");
                    intercomArticleSearchActivity.getViewModel().addTeammateHelpRow();
                    intercomArticleSearchActivity.getViewModel().sendClickOnSearchResultMetric();
                    intercomArticleSearchActivity.startActivity(ArticleActivity.Companion.buildIntent(intercomArticleSearchActivity, new ArticleActivity.ArticleActivityArguments(str, MetricTracker.Place.SEARCH_RESULTS, false, false, 12, (DefaultConstructorMarker) null)));
                    return C6514M.f71813a;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((C1500m) obj, ((Number) obj2).intValue());
                    return C6514M.f71813a;
                }

                public final void invoke(C1500m mVar, int i10) {
                    if ((i10 & 11) != 2 || !mVar.i()) {
                        intercomArticleSearchActivity.SearchScreenContent((ArticleSearchState) p1.b(intercomArticleSearchActivity.getViewModel().getState(), (g) null, mVar, 8, 1).getValue(), new j(intercomArticleSearchActivity), new k(intercomArticleSearchActivity), new l(intercomArticleSearchActivity), mVar, 32768);
                        return;
                    }
                    mVar.I();
                }
            }, mVar, 54), mVar, 56);
            return;
        }
        mVar.I();
    }
}
