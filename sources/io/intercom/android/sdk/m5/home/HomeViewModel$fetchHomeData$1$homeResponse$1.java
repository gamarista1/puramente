package io.intercom.android.sdk.m5.home;

import Ug.K;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeRepository;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUg/K;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/m5/home/data/HomeV2Response;", "<anonymous>", "(LUg/K;)Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$homeResponse$1", f = "HomeViewModel.kt", l = {115}, m = "invokeSuspend")
final class HomeViewModel$fetchHomeData$1$homeResponse$1 extends l implements p {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeViewModel$fetchHomeData$1$homeResponse$1(HomeViewModel homeViewModel, C6658d<? super HomeViewModel$fetchHomeData$1$homeResponse$1> dVar) {
        super(2, dVar);
        this.this$0 = homeViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HomeViewModel$fetchHomeData$1$homeResponse$1(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super NetworkResponse<HomeV2Response>> dVar) {
        return ((HomeViewModel$fetchHomeData$1$homeResponse$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            HomeRepository access$getHomeRepository$p = this.this$0.homeRepository;
            this.label = 1;
            obj = access$getHomeRepository$p.getHomeCards(this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
