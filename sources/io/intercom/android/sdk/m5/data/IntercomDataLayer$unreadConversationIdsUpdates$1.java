package io.intercom.android.sdk.m5.data;

import Ug.K;
import Xg.C5696h;
import Xg.L;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1", f = "IntercomDataLayer.kt", l = {386}, m = "invokeSuspend")
final class IntercomDataLayer$unreadConversationIdsUpdates$1 extends l implements p {
    final /* synthetic */ C6798l $onNewUnreadConversationsIdsState;
    int label;
    final /* synthetic */ IntercomDataLayer this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Llf/M;", "<anonymous>", "(Ljava/util/Set;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1", f = "IntercomDataLayer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: io.intercom.android.sdk.m5.data.IntercomDataLayer$unreadConversationIdsUpdates$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends l implements p {
        /* synthetic */ Object L$0;
        int label;

        public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
            AnonymousClass1 r02 = new AnonymousClass1(lVar, dVar);
            r02.L$0 = obj;
            return r02;
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.label == 0) {
                w.b(obj);
                lVar.invoke((Set) this.L$0);
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(Set<String> set, C6658d<? super C6514M> dVar) {
            return ((AnonymousClass1) create(set, dVar)).invokeSuspend(C6514M.f71813a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    IntercomDataLayer$unreadConversationIdsUpdates$1(IntercomDataLayer intercomDataLayer, C6798l lVar, C6658d<? super IntercomDataLayer$unreadConversationIdsUpdates$1> dVar) {
        super(2, dVar);
        this.this$0 = intercomDataLayer;
        this.$onNewUnreadConversationsIdsState = lVar;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new IntercomDataLayer$unreadConversationIdsUpdates$1(this.this$0, this.$onNewUnreadConversationsIdsState, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((IntercomDataLayer$unreadConversationIdsUpdates$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            L unreadConversationIds = this.this$0.getUnreadConversationIds();
            final C6798l lVar = this.$onNewUnreadConversationsIdsState;
            AnonymousClass1 r12 = new AnonymousClass1((C6658d<? super AnonymousClass1>) null);
            this.label = 1;
            if (C5696h.i(unreadConversationIds, r12, this) == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C6514M.f71813a;
    }
}
