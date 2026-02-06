package io.intercom.android.sdk.m5.navigation;

import Y.C1500m;
import a2.C1542a;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.C1554j;
import androidx.compose.foundation.layout.q;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import j3.C2124A;
import j3.C2125B;
import j3.H;
import j3.k;
import j3.x;
import j3.z;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.J;
import lf.C6514M;
import lf.C6535s;
import v.C2719b;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ConversationDestinationKt$conversationDestination$11 implements r {
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;

    ConversationDestinationKt$conversationDestination$11(C1554j jVar, x xVar) {
        this.$rootActivity = jVar;
        this.$navController = xVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(x xVar, C1554j jVar) {
        C6496s.h(xVar, "$navController");
        C6496s.h(jVar, "$rootActivity");
        if (xVar.K() == null) {
            jVar.getOnBackPressedDispatcher().l();
        } else {
            xVar.X();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2(x xVar) {
        C6496s.h(xVar, "$navController");
        Injector.get().getMetricTracker().viewedNewConversation(MetricTracker.Context.FROM_CONVERSATION);
        IntercomRouterKt.openNewConversation$default(xVar, false, (z) null, (TransitionArgs) null, 7, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3(x xVar, J j10) {
        C6496s.h(xVar, "$navController");
        C6496s.h(j10, "$isLaunchedProgrammatically");
        IntercomRouterKt.openTicketDetailScreen$default(xVar, false, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 12, (DefaultConstructorMarker) null), j10.f71755a, 1, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4(x xVar, J j10, String str) {
        C6496s.h(xVar, "$navController");
        C6496s.h(j10, "$isLaunchedProgrammatically");
        C6496s.h(str, "ticketId");
        IntercomRouterKt.openTicketDetailScreen(xVar, str, MetricTracker.Context.HOME_SCREEN, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), j10.f71755a);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5(x xVar, ConversationViewModel conversationViewModel, TicketType ticketType) {
        C6496s.h(xVar, "$navController");
        C6496s.h(conversationViewModel, "$conversationViewModel");
        C6496s.h(ticketType, "ticketType");
        IntercomRouterKt.openCreateTicketsScreen(xVar, ticketType, conversationViewModel.getConversationId(), MetricTracker.Context.FROM_CONVERSATION);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6(x xVar, J j10, HeaderMenuItem headerMenuItem) {
        C6496s.h(xVar, "$navController");
        C6496s.h(j10, "$isLaunchedProgrammatically");
        C6496s.h(headerMenuItem, "headerMenuItem");
        if (headerMenuItem instanceof HeaderMenuItem.Messages) {
            IntercomRouterKt.openMessages(xVar, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 12, (DefaultConstructorMarker) null), j10.f71755a);
        } else if (headerMenuItem instanceof HeaderMenuItem.StartNewConversation) {
            IntercomRouterKt.openNewConversation$default(xVar, j10.f71755a, (z) null, (TransitionArgs) null, 6, (Object) null);
        } else if (headerMenuItem instanceof HeaderMenuItem.Tickets) {
            IntercomRouterKt.openTicketList(xVar, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_OUT_LEFT, EnterTransitionStyle.SLIDE_IN_RIGHT, ExitTransitionStyle.SLIDE_DOWN), true);
        } else if (headerMenuItem instanceof HeaderMenuItem.Help) {
            IntercomRouterKt.openHelpCenter(xVar, new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.SLIDE_DOWN, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 12, (DefaultConstructorMarker) null), true);
        } else {
            throw new C6535s();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$9(x xVar, J j10, String str) {
        z zVar;
        C6496s.h(xVar, "$navController");
        C6496s.h(j10, "$isLaunchedProgrammatically");
        C6496s.h(str, "it");
        boolean z10 = j10.f71755a;
        if (z10) {
            zVar = C2125B.a(new C6238m());
        } else {
            zVar = null;
        }
        IntercomRouterKt.openConversation$default(xVar, str, (String) null, z10, (String) null, zVar, (TransitionArgs) null, 42, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$9$lambda$8(C2124A a10) {
        C6496s.h(a10, "$this$navOptions");
        a10.d("CONVERSATION", new C6240n());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$9$lambda$8$lambda$7(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(true);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "backStackEntry");
        J j10 = new J();
        Intent intent = this.$rootActivity.getIntent();
        C6496s.g(intent, "getIntent(...)");
        IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
        IntercomRootActivityArgs.ConversationScreenArgs conversationScreenArgs = argsForIntent instanceof IntercomRootActivityArgs.ConversationScreenArgs ? (IntercomRootActivityArgs.ConversationScreenArgs) argsForIntent : null;
        Bundle c10 = kVar.c();
        if (c10 != null && c10.containsKey("conversationId")) {
            Bundle c11 = kVar.c();
            String string = c11 != null ? c11.getString("conversationId") : null;
            Bundle c12 = kVar.c();
            str4 = c12 != null ? c12.getString("initialMessage") : null;
            Bundle c13 = kVar.c();
            str3 = c13 != null ? c13.getString("articleId") : null;
            Bundle c14 = kVar.c();
            str2 = c14 != null ? c14.getString("articleTitle") : null;
            Bundle c15 = kVar.c();
            j10.f71755a = c15 != null ? c15.getBoolean("isLaunchedProgrammatically") : false;
            str = string;
        } else if (conversationScreenArgs != null) {
            String conversationId = conversationScreenArgs.getConversationId();
            str4 = conversationScreenArgs.getEncodedInitialMessage();
            j10.f71755a = conversationScreenArgs.isLaunchedProgrammatically();
            str3 = conversationScreenArgs.getArticleId();
            str2 = conversationScreenArgs.getArticleTitle();
            str = conversationId;
        } else {
            str3 = null;
            str2 = null;
            str = null;
            str4 = "";
        }
        e0 a10 = C1542a.f10582a.a(mVar, C1542a.f10584c);
        if (a10 == null) {
            a10 = this.$rootActivity;
        }
        e0 e0Var = a10;
        boolean z10 = j10.f71755a;
        ArticleMetadata articleMetadata = str3 != null ? new ArticleMetadata(str3, str2) : null;
        if (str4 == null) {
            str5 = "";
        } else {
            str5 = str4;
        }
        ConversationViewModel access$getConversationViewModel = ConversationDestinationKt.getConversationViewModel(e0Var, str, str5, z10, articleMetadata, mVar, 8, 0);
        ConversationScreenKt.ConversationScreen(access$getConversationViewModel, q.f(i.f23074a, 0.0f, 1, (Object) null), new C6242o(this.$navController, this.$rootActivity), new C6244p(this.$navController), new C6246q(this.$navController, j10), new r(this.$navController, j10), new C6249s(this.$navController, access$getConversationViewModel), new C6251t(this.$navController, j10), new C6253u(this.$navController, j10), mVar, 56, 0);
    }
}
