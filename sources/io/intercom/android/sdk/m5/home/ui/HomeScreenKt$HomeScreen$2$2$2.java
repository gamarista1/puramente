package io.intercom.android.sdk.m5.home.ui;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.C1197s;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1503n0;
import Y.C1523y;
import Y.F1;
import androidx.compose.foundation.o;
import c1.r;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import o0.C2338a;
import v.C2722e;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$2$2$2 implements q {
    final /* synthetic */ C1503n0 $headerHeightPx;
    final /* synthetic */ HomeUiState $homeState;
    final /* synthetic */ C6798l $onConversationClicked;
    final /* synthetic */ C6787a $onHelpClicked;
    final /* synthetic */ C6787a $onMessagesClicked;
    final /* synthetic */ C6787a $onNewConversationClicked;
    final /* synthetic */ C6798l $onTicketItemClicked;
    final /* synthetic */ C6798l $onTicketLinkClicked;
    final /* synthetic */ C6787a $onTicketsClicked;
    final /* synthetic */ o $scrollState;

    HomeScreenKt$HomeScreen$2$2$2(HomeUiState homeUiState, o oVar, C1503n0 n0Var, C6787a aVar, C6787a aVar2, C6787a aVar3, C6798l lVar, C6787a aVar4, C6798l lVar2, C6798l lVar3) {
        this.$homeState = homeUiState;
        this.$scrollState = oVar;
        this.$headerHeightPx = n0Var;
        this.$onMessagesClicked = aVar;
        this.$onHelpClicked = aVar2;
        this.$onTicketsClicked = aVar3;
        this.$onTicketItemClicked = lVar;
        this.$onNewConversationClicked = aVar4;
        this.$onConversationClicked = lVar2;
        this.$onTicketLinkClicked = lVar3;
    }

    /* access modifiers changed from: private */
    public static final C6514M invoke$lambda$2$lambda$1$lambda$0(C1503n0 n0Var, C1197s sVar) {
        C6496s.h(n0Var, "$headerHeightPx");
        C6496s.h(sVar, "it");
        n0Var.l((float) r.f(sVar.b()));
        return C6514M.f71813a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C1500m mVar2 = mVar;
        C6496s.h(eVar, "$this$AnimatedVisibility");
        HomeUiState homeUiState = this.$homeState;
        if (homeUiState instanceof HomeUiState.Content) {
            o oVar = this.$scrollState;
            C1503n0 n0Var = this.$headerHeightPx;
            C6787a aVar = this.$onMessagesClicked;
            C6787a aVar2 = this.$onHelpClicked;
            C6787a aVar3 = this.$onTicketsClicked;
            C6798l lVar = this.$onTicketItemClicked;
            C6787a aVar4 = this.$onNewConversationClicked;
            C6798l lVar2 = this.$onConversationClicked;
            C6798l lVar3 = this.$onTicketLinkClicked;
            i.a aVar5 = i.f23074a;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar2, 0);
            int a11 = C1494j.a(mVar2, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar2, aVar5);
            C1241g.a aVar6 = C1241g.f3853J;
            C6798l lVar4 = lVar3;
            C6787a a12 = aVar6.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar2.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            C6798l lVar5 = lVar2;
            F1.b(a13, a10, aVar6.c());
            F1.b(a13, p10, aVar6.e());
            p b10 = aVar6.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar6.d());
            C1093k kVar = C1093k.f978a;
            i a14 = C2338a.a(aVar5, HomeScreenKt.getHeaderContentOpacity(oVar.n(), n0Var.c()));
            mVar2.T(1117650240);
            Object A10 = mVar.A();
            if (A10 == C1500m.f10026a.a()) {
                A10 = new q(n0Var);
                mVar2.r(A10);
            }
            mVar.M();
            i a15 = androidx.compose.ui.layout.c.a(a14, (C6798l) A10);
            HomeUiState.Content content = (HomeUiState.Content) homeUiState;
            HomeHeaderKt.HomeContentHeader(a15, content.getHeader(), mVar2, 64, 0);
            HomeContentScreenKt.HomeContentScreen((i) null, content, aVar, aVar2, aVar3, lVar, aVar4, lVar5, lVar4, mVar, 64, 1);
            mVar.u();
        }
    }
}
