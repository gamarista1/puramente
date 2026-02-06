package io.intercom.android.sdk.m5.navigation;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import X1.a;
import Y.C1500m;
import Y.P;
import a2.C1542a;
import androidx.activity.C1554j;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.ui.HomeScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import j3.C2124A;
import j3.C2125B;
import j3.H;
import j3.k;
import j3.x;
import j3.z;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import v.C2719b;
import yf.p;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HomeScreenDestinationKt$homeScreen$1 implements r {
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;
    final /* synthetic */ K $scope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12", f = "HomeScreenDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.navigation.HomeScreenDestinationKt$homeScreen$1$12  reason: invalid class name */
    static final class AnonymousClass12 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass12(dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass12) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                Injector.get().getMetricTracker().viewedSpace("home");
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    HomeScreenDestinationKt$homeScreen$1(C1554j jVar, x xVar, K k10) {
        this.$rootActivity = jVar;
        this.$navController = xVar;
        this.$scope = k10;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$0(x xVar) {
        C6496s.h(xVar, "$navController");
        Injector.get().getMetricTracker().clickedSpace("messages");
        IntercomRouterKt.openMessages$default(xVar, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1(x xVar) {
        C6496s.h(xVar, "$navController");
        Injector.get().getMetricTracker().clickedSpace("help");
        IntercomRouterKt.openHelpCenter$default(xVar, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 12, (DefaultConstructorMarker) null), false, 2, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$12(x xVar, String str) {
        C6496s.h(xVar, "$navController");
        C6496s.h(str, "conversationId");
        invoke$openConversation(xVar, str, C2125B.a(new Y()), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 12, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$12$lambda$11(C2124A a10) {
        C6496s.h(a10, "$this$navOptions");
        a10.d("HOME", new Z());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$12$lambda$11$lambda$10(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(false);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$13(x xVar) {
        C6496s.h(xVar, "$navController");
        Injector.get().getMetricTracker().viewedNewConversation("home");
        IntercomRouterKt.openNewConversation$default(xVar, false, (z) null, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.SLIDE_OUT_RIGHT, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 12, (DefaultConstructorMarker) null), 3, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$14(x xVar, Conversation conversation) {
        C6496s.h(xVar, "$navController");
        C6496s.h(conversation, "it");
        invoke$openConversation$default(xVar, conversation.getId(), (z) null, (TransitionArgs) null, 12, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$15(K k10, C1554j jVar) {
        C6496s.h(k10, "$scope");
        C6496s.h(jVar, "$rootActivity");
        C5600w0 unused = C5576k.d(k10, (g) null, (M) null, new HomeScreenDestinationKt$homeScreen$1$10$1(jVar, (C6658d<? super HomeScreenDestinationKt$homeScreen$1$10$1>) null), 3, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$16(x xVar, TicketType ticketType) {
        C6496s.h(xVar, "$navController");
        C6496s.h(ticketType, "it");
        IntercomRouterKt.openCreateTicketsScreen(xVar, ticketType, (String) null, MetricTracker.Context.HOME_SCREEN);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2(x xVar) {
        C6496s.h(xVar, "$navController");
        IntercomRouterKt.openTicketList$default(xVar, new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT), false, 2, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3(x xVar, String str) {
        C6496s.h(xVar, "$navController");
        C6496s.h(str, "ticketId");
        IntercomRouterKt.openTicketDetailScreen$default(xVar, str, "home", new TransitionArgs(EnterTransitionStyle.SLIDE_UP, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_DOWN), false, 8, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6(x xVar) {
        C6496s.h(xVar, "$navController");
        xVar.U("MESSAGES", new N());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6$lambda$5(C2124A a10) {
        C6496s.h(a10, "$this$navigate");
        a10.d("HOME", new X());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$6$lambda$5$lambda$4(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$9(x xVar) {
        C6496s.h(xVar, "$navController");
        IntercomRouterKt.openNewConversation(xVar, false, C2125B.a(new W()), new TransitionArgs(EnterTransitionStyle.NONE, ExitTransitionStyle.SLIDE_OUT_RIGHT, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 12, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$9$lambda$8(C2124A a10) {
        C6496s.h(a10, "$this$navOptions");
        a10.d("HOME", new V());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$9$lambda$8$lambda$7(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(false);
        return C6514M.f71813a;
    }

    private static final void invoke$openConversation(x xVar, String str, z zVar, TransitionArgs transitionArgs) {
        Injector.get().getMetricTracker().viewedConversation("home", str);
        IntercomRouterKt.openConversation$default(xVar, str, (String) null, false, (String) null, zVar, transitionArgs, 14, (Object) null);
    }

    static /* synthetic */ void invoke$openConversation$default(x xVar, String str, z zVar, TransitionArgs transitionArgs, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            zVar = null;
        }
        if ((i10 & 8) != 0) {
            transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
        }
        invoke$openConversation(xVar, str, zVar, transitionArgs);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "it");
        C1798v vVar = (C1798v) mVar2.m(a.a());
        e0 a10 = C1542a.f10582a.a(mVar2, C1542a.f10584c);
        if (a10 == null) {
            a10 = this.$rootActivity;
        }
        HomeScreenKt.HomeScreen(HomeViewModel.Companion.create(a10, vVar.getLifecycle()), new C6215a0(this.$navController), new C6219c0(this.$navController), new C6221d0(this.$navController), new C6223e0(this.$navController), new O(this.$navController), new P(this.$navController), new Q(this.$navController), new S(this.$navController), new T(this.$navController), new U(this.$scope, this.$rootActivity), new C6217b0(this.$navController), mVar, 8, 0);
        P.g("", new AnonymousClass12((C6658d<? super AnonymousClass12>) null), mVar2, 70);
    }
}
