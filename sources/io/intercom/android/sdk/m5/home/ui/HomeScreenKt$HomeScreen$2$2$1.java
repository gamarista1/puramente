package io.intercom.android.sdk.m5.home.ui;

import C.C1085c;
import C.C1090h;
import C.C1093k;
import H0.F;
import J0.C1241g;
import Y.C1494j;
import Y.C1500m;
import Y.C1523y;
import Y.F1;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import k0.c;
import k0.h;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2722e;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$2$2$1 implements q {
    final /* synthetic */ HomeUiState $homeState;
    final /* synthetic */ C6787a $onCloseClick;

    HomeScreenKt$HomeScreen$2$2$1(HomeUiState homeUiState, C6787a aVar) {
        this.$homeState = homeUiState;
        this.$onCloseClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C6496s.h(eVar, "$this$AnimatedVisibility");
        HomeUiState homeUiState = this.$homeState;
        if (homeUiState instanceof HomeUiState.Error) {
            C6787a aVar = this.$onCloseClick;
            i.a aVar2 = i.f23074a;
            F a10 = C1090h.a(C1085c.f882a.g(), c.f23044a.k(), mVar, 0);
            int a11 = C1494j.a(mVar, 0);
            C1523y p10 = mVar.p();
            i e10 = h.e(mVar, aVar2);
            C1241g.a aVar3 = C1241g.f3853J;
            C6787a a12 = aVar3.a();
            if (mVar.j() == null) {
                C1494j.c();
            }
            mVar.F();
            if (mVar.f()) {
                mVar.U(a12);
            } else {
                mVar.q();
            }
            C1500m a13 = F1.a(mVar);
            F1.b(a13, a10, aVar3.c());
            F1.b(a13, p10, aVar3.e());
            p b10 = aVar3.b();
            if (a13.f() || !C6496s.c(a13.A(), Integer.valueOf(a11))) {
                a13.r(Integer.valueOf(a11));
                a13.V(Integer.valueOf(a11), b10);
            }
            F1.b(a13, e10, aVar3.d());
            C1093k kVar = C1093k.f978a;
            HomeUiState.Error error = (HomeUiState.Error) homeUiState;
            HomeHeaderKt.HomeErrorHeader((i) null, error.getHeader(), aVar, mVar, 0, 1);
            HomeErrorContentKt.HomeErrorContent(error.getErrorState(), (i) null, mVar, 0, 2);
            mVar.u();
        }
    }
}
