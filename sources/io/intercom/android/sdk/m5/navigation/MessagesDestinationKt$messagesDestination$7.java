package io.intercom.android.sdk.m5.navigation;

import Ug.K;
import Y.C1488g1;
import Y.C1500m;
import Y.C1505o0;
import Y.P;
import a2.C1542a;
import android.os.Bundle;
import androidx.activity.C1554j;
import androidx.lifecycle.e0;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt;
import io.intercom.android.sdk.m5.navigation.transitions.EnterTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.ExitTransitionStyle;
import io.intercom.android.sdk.m5.navigation.transitions.TransitionArgs;
import io.intercom.android.sdk.ui.R;
import j3.C2124A;
import j3.C2125B;
import j3.C2128E;
import j3.H;
import j3.k;
import j3.n;
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
import rf.C6680b;
import v.C2719b;
import yf.p;
import yf.r;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MessagesDestinationKt$messagesDestination$7 implements r {
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5", f = "MessagesDestination.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.navigation.MessagesDestinationKt$messagesDestination$7$5  reason: invalid class name */
    static final class AnonymousClass5 extends l implements p {
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            return new AnonymousClass5(dVar);
        }

        public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass5) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                Injector.get().getMetricTracker().viewedSpace("messages");
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    MessagesDestinationKt$messagesDestination$7(C1554j jVar, x xVar) {
        this.$rootActivity = jVar;
        this.$navController = xVar;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3(x xVar, boolean z10) {
        C6496s.h(xVar, "$navController");
        Injector.get().getMetricTracker().viewedNewConversation("messages");
        IntercomRouterKt.openNewConversation$default(xVar, z10, C2125B.a(new C6250s0()), (TransitionArgs) null, 4, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$2(C2124A a10) {
        C6496s.h(a10, "$this$navOptions");
        a10.d("CONVERSATION", new C6247q0());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$3$lambda$2$lambda$1(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(true);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$4(x xVar) {
        C6496s.h(xVar, "$navController");
        n.V(xVar, "HELP_CENTER", (z) null, (C2128E.a) null, 6, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$5(x xVar, C1554j jVar) {
        C6496s.h(xVar, "$navController");
        C6496s.h(jVar, "$rootActivity");
        if (xVar.K() == null) {
            jVar.finish();
        } else {
            xVar.X();
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$8(boolean z10, x xVar, InboxUiEffects.NavigateToConversation navigateToConversation) {
        TransitionArgs transitionArgs;
        C6496s.h(xVar, "$navController");
        C6496s.h(navigateToConversation, "it");
        Injector.get().getMetricTracker().viewedConversation("messages", navigateToConversation.getConversation().getId());
        if (z10) {
            transitionArgs = new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null);
        } else {
            transitionArgs = new TransitionArgs(EnterTransitionStyle.SLIDE_IN_LEFT, ExitTransitionStyle.NULL, EnterTransitionStyle.NULL, ExitTransitionStyle.SLIDE_OUT_RIGHT);
        }
        IntercomRouterKt.openConversation$default(xVar, navigateToConversation.getConversation().getId(), (String) null, z10, (String) null, C2125B.a(new C6260x0()), transitionArgs, 10, (Object) null);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$8$lambda$7(C2124A a10) {
        C6496s.h(a10, "$this$navOptions");
        a10.d("CONVERSATION", new C6248r0());
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$8$lambda$7$lambda$6(H h10) {
        C6496s.h(h10, "$this$popUpTo");
        h10.c(true);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((C2719b) obj, (k) obj2, (C1500m) obj3, ((Number) obj4).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2719b bVar, k kVar, C1500m mVar, int i10) {
        int i11;
        C6496s.h(bVar, "$this$composable");
        C6496s.h(kVar, "it");
        InboxViewModel.Companion companion = InboxViewModel.Companion;
        e0 a10 = C1542a.f10582a.a(mVar, C1542a.f10584c);
        if (a10 == null) {
            a10 = this.$rootActivity;
        }
        InboxViewModel create = companion.create(a10);
        Bundle c10 = kVar.c();
        boolean z10 = c10 != null ? c10.getBoolean("isLaunchedProgrammatically") : false;
        mVar.T(596908281);
        x xVar = this.$navController;
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            if (xVar.K() == null) {
                i11 = R.drawable.intercom_ic_close;
            } else if (z10) {
                i11 = R.drawable.intercom_ic_chevron_down;
            } else {
                i11 = R.drawable.intercom_ic_back;
            }
            A10 = C1488g1.a(i11);
            mVar.r(A10);
        }
        mVar.M();
        InboxScreenKt.InboxScreen(create, new C6252t0(this.$navController, z10), new C6254u0(this.$navController), new C6256v0(this.$navController, this.$rootActivity), new C6258w0(z10, this.$navController), ((C1505o0) A10).b(), mVar, 8);
        P.g("", new AnonymousClass5((C6658d<? super AnonymousClass5>) null), mVar, 70);
    }
}
