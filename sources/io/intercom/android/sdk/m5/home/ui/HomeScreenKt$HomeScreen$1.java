package io.intercom.android.sdk.m5.home.ui;

import Ug.K;
import Xg.B;
import Xg.C5695g;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1", f = "HomeScreen.kt", l = {79}, m = "invokeSuspend")
final class HomeScreenKt$HomeScreen$1 extends l implements p {
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ C6798l $navigateToExistingConversation;
    final /* synthetic */ C6787a $navigateToMessages;
    final /* synthetic */ C6787a $navigateToNewConversation;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeScreenKt$HomeScreen$1(HomeViewModel homeViewModel, C6787a aVar, C6787a aVar2, C6798l lVar, C6658d<? super HomeScreenKt$HomeScreen$1> dVar) {
        super(2, dVar);
        this.$homeViewModel = homeViewModel;
        this.$navigateToMessages = aVar;
        this.$navigateToNewConversation = aVar2;
        this.$navigateToExistingConversation = lVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HomeScreenKt$HomeScreen$1(this.$homeViewModel, this.$navigateToMessages, this.$navigateToNewConversation, this.$navigateToExistingConversation, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HomeScreenKt$HomeScreen$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            B effect = this.$homeViewModel.getEffect();
            final C6787a aVar = this.$navigateToMessages;
            final C6787a aVar2 = this.$navigateToNewConversation;
            final C6798l lVar = this.$navigateToExistingConversation;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(HomeUiEffects homeUiEffects, C6658d<? super C6514M> dVar) {
                    if (C6496s.c(homeUiEffects, HomeUiEffects.NavigateToMessages.INSTANCE)) {
                        aVar.invoke();
                    } else if (C6496s.c(homeUiEffects, HomeUiEffects.NavigateToNewConversation.INSTANCE)) {
                        aVar2.invoke();
                    } else if (homeUiEffects instanceof HomeUiEffects.NavigateToConversation) {
                        lVar.invoke(((HomeUiEffects.NavigateToConversation) homeUiEffects).getConversationId());
                    } else {
                        throw new C6535s();
                    }
                    return C6514M.f71813a;
                }
            };
            this.label = 1;
            if (effect.collect(r12, this) == f10) {
                return f10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            w.b(obj);
        }
        throw new C6527k();
    }
}
