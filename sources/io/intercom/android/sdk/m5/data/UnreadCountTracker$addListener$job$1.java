package io.intercom.android.sdk.m5.data;

import Ug.K;
import Xg.C5695g;
import Xg.L;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.C6527k;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1", f = "UnreadCountTracker.kt", l = {22}, m = "invokeSuspend")
final class UnreadCountTracker$addListener$job$1 extends l implements p {
    final /* synthetic */ UnreadConversationCountListener $listener;
    int label;
    final /* synthetic */ UnreadCountTracker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnreadCountTracker$addListener$job$1(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, C6658d<? super UnreadCountTracker$addListener$job$1> dVar) {
        super(2, dVar);
        this.this$0 = unreadCountTracker;
        this.$listener = unreadConversationCountListener;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new UnreadCountTracker$addListener$job$1(this.this$0, this.$listener, dVar);
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((UnreadCountTracker$addListener$job$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            L unreadConversationIds = this.this$0.getDataLayer().getUnreadConversationIds();
            final UnreadConversationCountListener unreadConversationCountListener = this.$listener;
            AnonymousClass1 r12 = new C5695g() {
                public final Object emit(Set<String> set, C6658d<? super C6514M> dVar) {
                    unreadConversationCountListener.onCountUpdate(set.size());
                    return C6514M.f71813a;
                }
            };
            this.label = 1;
            if (unreadConversationIds.collect(r12, this) == f10) {
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
