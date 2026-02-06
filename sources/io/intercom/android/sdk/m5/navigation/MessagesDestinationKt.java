package io.intercom.android.sdk.m5.navigation;

import androidx.activity.C1554j;
import androidx.compose.animation.d;
import g0.c;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj3/v;", "Lj3/x;", "navController", "Landroidx/activity/j;", "rootActivity", "Llf/M;", "messagesDestination", "(Lj3/v;Lj3/x;Landroidx/activity/j;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MessagesDestinationKt {
    public static final void messagesDestination(v vVar, x xVar, C1554j jVar) {
        C6496s.h(vVar, "<this>");
        C6496s.h(xVar, "navController");
        C6496s.h(jVar, "rootActivity");
        C2159k.b(vVar, "MESSAGES?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", C6565s.q(C2135f.a("transitionArgs", new C6235k0()), C2135f.a("isLaunchedProgrammatically", new C6237l0())), (List) null, new C6239m0(), new C6241n0(), new C6243o0(), new C6245p0(), (C6798l) null, c.c(559331213, true, new MessagesDestinationKt$messagesDestination$7(jVar, xVar)), 132, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M messagesDestination$lambda$0(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(TransitionStyleKt.getTransitionArgNavType());
        iVar.b(new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M messagesDestination$lambda$1(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.BoolType);
        iVar.b(Boolean.FALSE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i messagesDestination$lambda$2(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k messagesDestination$lambda$3(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getExit().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i messagesDestination$lambda$4(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k messagesDestination$lambda$5(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopExit().transition();
    }
}
