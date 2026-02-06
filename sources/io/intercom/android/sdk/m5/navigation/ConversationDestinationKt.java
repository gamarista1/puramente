package io.intercom.android.sdk.m5.navigation;

import X1.a;
import Y.C1500m;
import Y.L;
import Y.M;
import Y.P;
import android.content.Context;
import androidx.activity.C1554j;
import androidx.compose.animation.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.e0;
import g0.c;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.m5.conversation.ConversationViewModel;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionStyleKt;
import io.intercom.android.sdk.ui.extension.NavBackStackEntryExtensionKt;
import j3.C2126C;
import j3.C2135f;
import j3.i;
import j3.k;
import j3.v;
import j3.x;
import java.util.List;
import k3.C2159k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj3/v;", "Lj3/x;", "navController", "Landroidx/activity/j;", "rootActivity", "Llf/M;", "conversationDestination", "(Lj3/v;Lj3/x;Landroidx/activity/j;)V", "Landroidx/lifecycle/e0;", "owner", "", "conversationId", "initialMessage", "", "isLaunchedProgrammatically", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "articleMetadata", "Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;", "getConversationViewModel", "(Landroidx/lifecycle/e0;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;LY/m;II)Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ConversationDestinationKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.lifecycle.m$a[] r0 = androidx.lifecycle.C1790m.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.navigation.ConversationDestinationKt.WhenMappings.<clinit>():void");
        }
    }

    public static final void conversationDestination(v vVar, x xVar, C1554j jVar) {
        C6496s.h(vVar, "<this>");
        C6496s.h(xVar, "navController");
        C6496s.h(jVar, "rootActivity");
        C2159k.b(vVar, "CONVERSATION?conversationId={conversationId}&initialMessage={initialMessage}&articleId={articleId}&articleTitle={articleTitle}&isLaunchedProgrammatically={isLaunchedProgrammatically}&transitionArgs={transitionArgs}", C6565s.q(C2135f.a("conversationId", new C6222e()), C2135f.a("initialMessage", new C6224f()), C2135f.a("articleId", new C6226g()), C2135f.a("articleTitle", new C6228h()), C2135f.a("isLaunchedProgrammatically", new C6230i()), C2135f.a("transitionArgs", new C6232j())), (List) null, new C6234k(), new C6236l(), new C6216b(), new C6218c(), (C6798l) null, c.c(-1198092933, true, new ConversationDestinationKt$conversationDestination$11(jVar, xVar)), 132, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M conversationDestination$lambda$0(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        iVar.c(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M conversationDestination$lambda$1(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        iVar.c(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M conversationDestination$lambda$2(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        iVar.c(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M conversationDestination$lambda$3(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.StringType);
        iVar.c(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M conversationDestination$lambda$4(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.BoolType);
        iVar.c(false);
        iVar.b(Boolean.FALSE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M conversationDestination$lambda$5(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(TransitionStyleKt.getTransitionArgNavType());
        iVar.c(false);
        iVar.b(new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i conversationDestination$lambda$6(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k conversationDestination$lambda$7(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getExit().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i conversationDestination$lambda$8(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k conversationDestination$lambda$9(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopExit().transition();
    }

    /* access modifiers changed from: private */
    public static final ConversationViewModel getConversationViewModel(e0 e0Var, String str, String str2, boolean z10, ArticleMetadata articleMetadata, C1500m mVar, int i10, int i11) {
        LaunchMode launchMode;
        mVar.T(-1203114984);
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i11 & 16) != 0) {
            articleMetadata = null;
        }
        ArticleMetadata articleMetadata2 = articleMetadata;
        C1798v vVar = (C1798v) mVar.m(a.a());
        Context context = (Context) mVar.m(AndroidCompositionLocals_androidKt.g());
        ConversationViewModel.Companion companion = ConversationViewModel.Companion;
        if (z10) {
            launchMode = LaunchMode.PROGRAMMATIC;
        } else {
            launchMode = LaunchMode.CLASSIC;
        }
        ConversationViewModel create = companion.create(e0Var, str, str3, articleMetadata2, launchMode);
        P.c(vVar, new C6214a(vVar, create, context), mVar, 8);
        mVar.M();
        return create;
    }

    /* access modifiers changed from: private */
    public static final L getConversationViewModel$lambda$12(C1798v vVar, ConversationViewModel conversationViewModel, Context context, M m10) {
        C6496s.h(vVar, "$lifecycleOwner");
        C6496s.h(conversationViewModel, "$viewModel");
        C6496s.h(context, "$context");
        C6496s.h(m10, "$this$DisposableEffect");
        C6220d dVar = new C6220d(conversationViewModel, context);
        vVar.getLifecycle().a(dVar);
        return new ConversationDestinationKt$getConversationViewModel$lambda$12$$inlined$onDispose$1(vVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final void getConversationViewModel$lambda$12$lambda$10(ConversationViewModel conversationViewModel, Context context, C1798v vVar, C1790m.a aVar) {
        C6496s.h(conversationViewModel, "$viewModel");
        C6496s.h(context, "$context");
        C6496s.h(vVar, "<unused var>");
        C6496s.h(aVar, "event");
        int i10 = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
        if (i10 == 1) {
            conversationViewModel.onResume(context);
        } else if (i10 == 2) {
            conversationViewModel.onPause(context);
        }
    }
}
