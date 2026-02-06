package io.intercom.android.sdk.m5.helpcenter.ui;

import Ug.K;
import Xg.B;
import Xg.C5695g;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2", f = "HelpCenterCollectionsScreen.kt", l = {47}, m = "invokeSuspend")
final class HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2 extends l implements p {
    final /* synthetic */ C6798l $onAutoNavigateToCollection;
    final /* synthetic */ HelpCenterViewModel $viewModel;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2(HelpCenterViewModel helpCenterViewModel, C6798l lVar, C6658d<? super HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2> dVar) {
        super(2, dVar);
        this.$viewModel = helpCenterViewModel;
        this.$onAutoNavigateToCollection = lVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2(this.$viewModel, this.$onAutoNavigateToCollection, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            B effect = this.$viewModel.getEffect();
            final C6798l lVar = this.$onAutoNavigateToCollection;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(CollectionsUiEffects collectionsUiEffects, C6658d<? super C6514M> dVar) {
                    if (collectionsUiEffects instanceof CollectionsUiEffects.NavigateToCollectionContent) {
                        lVar.invoke(((CollectionsUiEffects.NavigateToCollectionContent) collectionsUiEffects).getCollectionId());
                        return C6514M.f71813a;
                    }
                    throw new C6535s();
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
