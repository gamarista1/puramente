package io.intercom.android.sdk.m5.home;

import Ug.K;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.home.HomeViewModel$handleOpening$2", f = "HomeViewModel.kt", l = {91, 98}, m = "invokeSuspend")
final class HomeViewModel$handleOpening$2 extends l implements p {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeViewModel$handleOpening$2(HomeViewModel homeViewModel, C6658d<? super HomeViewModel$handleOpening$2> dVar) {
        super(2, dVar);
        this.this$0 = homeViewModel;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HomeViewModel$handleOpening$2(this.this$0, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HomeViewModel$handleOpening$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        List<String> list;
        Object obj2;
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            CommonRepository access$getCommonRepository$p = this.this$0.commonRepository;
            this.label = 1;
            obj = access$getCommonRepository$p.openMessenger(this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else if (i10 == 2) {
            w.b(obj);
            this.this$0.hasConversationScreenOpenedDirectlyFromHome = true;
            return C6514M.f71813a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        if (openMessengerResponse == null || (list = openMessengerResponse.getOpenInboundConversations()) == null) {
            list = C6565s.n();
        }
        this.this$0.fetchHomeData();
        Xg.w access$get_effect$p = this.this$0._effect;
        if (!list.isEmpty()) {
            obj2 = new HomeUiEffects.NavigateToConversation((String) C6565s.o0(list));
        } else {
            obj2 = HomeUiEffects.NavigateToNewConversation.INSTANCE;
        }
        this.label = 2;
        if (access$get_effect$p.emit(obj2, this) == f10) {
            return f10;
        }
        this.this$0.hasConversationScreenOpenedDirectlyFromHome = true;
        return C6514M.f71813a;
    }
}
