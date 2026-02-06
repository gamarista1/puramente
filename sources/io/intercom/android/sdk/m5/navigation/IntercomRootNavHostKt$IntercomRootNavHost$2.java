package io.intercom.android.sdk.m5.navigation;

import H0.F;
import J0.C1241g;
import Ug.K;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import androidx.activity.C1554j;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.q;
import j3.v;
import j3.x;
import k0.c;
import k0.h;
import k0.i;
import k3.C2161m;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class IntercomRootNavHostKt$IntercomRootNavHost$2 implements p {
    final /* synthetic */ IntercomRootActivityArgs $intercomRootActivityArgs;
    final /* synthetic */ x $navController;
    final /* synthetic */ C1554j $rootActivity;
    final /* synthetic */ K $scope;

    IntercomRootNavHostKt$IntercomRootNavHost$2(x xVar, IntercomRootActivityArgs intercomRootActivityArgs, C1554j jVar, K k10) {
        this.$navController = xVar;
        this.$intercomRootActivityArgs = intercomRootActivityArgs;
        this.$rootActivity = jVar;
        this.$scope = k10;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$1$lambda$0(x xVar, C1554j jVar, K k10, IntercomRootActivityArgs intercomRootActivityArgs, v vVar) {
        C6496s.h(xVar, "$navController");
        C6496s.h(jVar, "$rootActivity");
        C6496s.h(k10, "$scope");
        C6496s.h(intercomRootActivityArgs, "$intercomRootActivityArgs");
        C6496s.h(vVar, "$this$NavHost");
        HomeScreenDestinationKt.homeScreen(vVar, xVar, jVar, k10);
        MessagesDestinationKt.messagesDestination(vVar, xVar, jVar);
        HelpCenterDestinationKt.helpCenterDestination(vVar, jVar, xVar, intercomRootActivityArgs);
        TicketDetailDestinationKt.ticketDetailDestination(vVar, xVar, jVar);
        ConversationDestinationKt.conversationDestination(vVar, xVar, jVar);
        TicketsDestinationKt.ticketsDestination(vVar, xVar, jVar);
        CreateTicketDestinationKt.createTicketDestination(vVar, xVar, jVar);
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1500m) obj, ((Number) obj2).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        if ((i10 & 11) != 2 || !mVar.i()) {
            i f10 = q.f(i.f23074a, 0.0f, 1, (Object) null);
            x xVar = this.$navController;
            IntercomRootActivityArgs intercomRootActivityArgs = this.$intercomRootActivityArgs;
            C1554j jVar = this.$rootActivity;
            K k10 = this.$scope;
            F h10 = d.h(c.f23044a.o(), false);
            int a10 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, f10);
            C1241g.a aVar = C1241g.f3853J;
            C6787a a11 = aVar.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a11);
            } else {
                mVar.q();
            }
            C1500m a12 = F1.a(mVar);
            F1.b(a12, h10, aVar.c());
            F1.b(a12, p10, aVar.e());
            p b10 = aVar.b();
            if (a12.f() || !C6496s.c(a12.A(), Integer.valueOf(a10))) {
                a12.r(Integer.valueOf(a10));
                a12.V(Integer.valueOf(a10), b10);
            }
            F1.b(a12, e10, aVar.d());
            f fVar = f.f12848a;
            C2161m.b(xVar, intercomRootActivityArgs.getRoute(), (i) null, (c) null, (String) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, (C6798l) null, new C6229h0(xVar, jVar, k10, intercomRootActivityArgs), mVar, 8, 0, 1020);
            mVar.u();
            return;
        }
        mVar.I();
    }
}
