package io.intercom.android.sdk.m5.inbox.ui;

import Ug.K;
import Xg.B;
import Xg.C5695g;
import io.intercom.android.sdk.m5.inbox.InboxViewModel;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import lf.w;
import n3.C2331a;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.inbox.ui.InboxScreenKt$InboxScreen$2", f = "InboxScreen.kt", l = {78}, m = "invokeSuspend")
final class InboxScreenKt$InboxScreen$2 extends l implements p {
    final /* synthetic */ C2331a $lazyPagingItems;
    final /* synthetic */ C6798l $onConversationClicked;
    final /* synthetic */ InboxViewModel $viewModel;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InboxScreenKt$InboxScreen$2(InboxViewModel inboxViewModel, C6798l lVar, C2331a aVar, C6658d<? super InboxScreenKt$InboxScreen$2> dVar) {
        super(2, dVar);
        this.$viewModel = inboxViewModel;
        this.$onConversationClicked = lVar;
        this.$lazyPagingItems = aVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new InboxScreenKt$InboxScreen$2(this.$viewModel, this.$onConversationClicked, this.$lazyPagingItems, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((InboxScreenKt$InboxScreen$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            B effect = this.$viewModel.getEffect();
            final C6798l lVar = this.$onConversationClicked;
            final C2331a aVar = this.$lazyPagingItems;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(InboxUiEffects inboxUiEffects, C6658d<? super C6514M> dVar) {
                    if (inboxUiEffects instanceof InboxUiEffects.NavigateToConversation) {
                        lVar.invoke(inboxUiEffects);
                    } else if (inboxUiEffects instanceof InboxUiEffects.RefreshInbox) {
                        aVar.j();
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
