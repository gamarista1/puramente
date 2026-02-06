package io.intercom.android.sdk.m5.helpcenter.ui;

import Y.C1500m;
import android.content.Context;
import android.os.Bundle;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import j3.C2128E;
import j3.k;
import j3.n;
import j3.x;
import j3.z;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import v.C2719b;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HelpCenterScreenKt$HelpCenterNavGraph$1$4 implements r {
    final /* synthetic */ Context $context;
    final /* synthetic */ x $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    HelpCenterScreenKt$HelpCenterNavGraph$1$4(HelpCenterViewModel helpCenterViewModel, Context context, x xVar) {
        this.$viewModel = helpCenterViewModel;
        this.$context = context;
        this.$navController = xVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(HelpCenterViewModel helpCenterViewModel, Context context, String str) {
        C6496s.h(helpCenterViewModel, "$viewModel");
        C6496s.h(context, "$context");
        C6496s.h(str, "articleId");
        helpCenterViewModel.onArticleClicked();
        context.startActivity(ArticleActivity.Companion.buildIntent(context, new ArticleActivity.ArticleActivityArguments(str, MetricTracker.Place.COLLECTION_LIST, false, false, 8, (DefaultConstructorMarker) null)));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(x xVar, String str) {
        C6496s.h(xVar, "$navController");
        C6496s.h(str, "subCollectionId");
        n.V(xVar, "COLLECTION_DETAILS/" + str, (z) null, (C2128E.a) null, 6, (Object) null);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        String str;
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "it");
        Bundle c10 = kVar.c();
        if (c10 == null || (str = c10.getString("id")) == null) {
            str = "";
        }
        String str2 = str;
        HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        HelpCenterCollectionDetailsScreenKt.HelpCenterCollectionDetailsScreen(helpCenterViewModel, str2, new y(helpCenterViewModel, this.$context), new z(this.$navController), mVar, 8, 0);
    }
}
