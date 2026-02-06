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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lj3/v;", "Landroidx/activity/j;", "rootActivity", "Lj3/x;", "navController", "Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;", "intercomRootActivityArgs", "Llf/M;", "helpCenterDestination", "(Lj3/v;Landroidx/activity/j;Lj3/x;Lio/intercom/android/sdk/m5/navigation/IntercomRootActivityArgs;)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HelpCenterDestinationKt {
    public static final void helpCenterDestination(v vVar, C1554j jVar, x xVar, IntercomRootActivityArgs intercomRootActivityArgs) {
        C1554j jVar2 = jVar;
        x xVar2 = xVar;
        IntercomRootActivityArgs intercomRootActivityArgs2 = intercomRootActivityArgs;
        v vVar2 = vVar;
        C6496s.h(vVar2, "<this>");
        C6496s.h(jVar2, "rootActivity");
        C6496s.h(xVar2, "navController");
        C6496s.h(intercomRootActivityArgs2, "intercomRootActivityArgs");
        C2159k.b(vVar2, "HELP_CENTER?transitionArgs={transitionArgs}&isLaunchedProgrammatically={isLaunchedProgrammatically}", C6565s.q(C2135f.a("transitionArgs", new G()), C2135f.a("isLaunchedProgrammatically", new H())), (List) null, new I(), new J(), new K(), new L(), (C6798l) null, c.c(-2139595832, true, new HelpCenterDestinationKt$helpCenterDestination$7(jVar2, intercomRootActivityArgs2, xVar2)), 132, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C6514M helpCenterDestination$lambda$0(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(TransitionStyleKt.getTransitionArgNavType());
        iVar.b(new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null));
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final C6514M helpCenterDestination$lambda$1(i iVar) {
        C6496s.h(iVar, "$this$navArgument");
        iVar.d(C2126C.BoolType);
        iVar.c(false);
        iVar.b(Boolean.FALSE);
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i helpCenterDestination$lambda$2(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k helpCenterDestination$lambda$3(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getExit().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.i helpCenterDestination$lambda$4(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.d(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopEnter().transition();
    }

    /* access modifiers changed from: private */
    public static final androidx.compose.animation.k helpCenterDestination$lambda$5(d dVar) {
        C6496s.h(dVar, "$this$composable");
        return ((TransitionArgs) NavBackStackEntryExtensionKt.getParcelableObject((k) dVar.e(), "transitionArgs", TransitionArgs.class, new TransitionArgs((EnterTransitionStyle) null, (ExitTransitionStyle) null, (EnterTransitionStyle) null, (ExitTransitionStyle) null, 15, (DefaultConstructorMarker) null))).getPopExit().transition();
    }
}
