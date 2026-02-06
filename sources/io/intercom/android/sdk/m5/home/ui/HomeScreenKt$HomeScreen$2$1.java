package io.intercom.android.sdk.m5.home.ui;

import Y.A1;
import Y.C1500m;
import Y.C1503n0;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderBackdropKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import v.C2722e;
import yf.C6787a;
import yf.q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HomeScreenKt$HomeScreen$2$1 implements q {
    final /* synthetic */ C1503n0 $headerHeightPx;
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ A1 $uiState;

    HomeScreenKt$HomeScreen$2$1(A1 a12, HomeViewModel homeViewModel, C1503n0 n0Var) {
        this.$uiState = a12;
        this.$homeViewModel = homeViewModel;
        this.$headerHeightPx = n0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2722e) obj, (C1500m) obj2, ((Number) obj3).intValue());
        return C6514M.f71813a;
    }

    public final void invoke(C2722e eVar, C1500m mVar, int i10) {
        C6496s.h(eVar, "$this$AnimatedVisibility");
        HomeUiState homeUiState = (HomeUiState) this.$uiState.getValue();
        if (homeUiState instanceof HomeUiState.Content) {
            HomeHeaderBackdropKt.m390HomeHeaderBackdroporJrPs(((d) mVar.m(C1644k0.e())).m1(this.$headerHeightPx.c()), ((HomeUiState.Content) homeUiState).getHeader().getHeaderBackdropStyle(), new C6787a(this.$homeViewModel) {
                public final void invoke() {
                    ((HomeViewModel) this.receiver).onHeaderImageLoaded();
                }
            }, mVar, 0);
        }
    }
}
