package com.revenuecat.purchases.utils;

import Rg.h;
import Rg.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/revenuecat/purchases/utils/Event;", "T", "LRg/h;", "", "sequence", "Llf/M;", "invoke", "(LRg/h;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class EventsFileHelper$readFile$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $block;
    final /* synthetic */ EventsFileHelper<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventsFileHelper$readFile$1(C6798l lVar, EventsFileHelper<T> eventsFileHelper) {
        super(1);
        this.$block = lVar;
        this.this$0 = eventsFileHelper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((h) obj);
        return C6514M.f71813a;
    }

    public final void invoke(h hVar) {
        C6496s.h(hVar, "sequence");
        C6798l lVar = this.$block;
        final EventsFileHelper<T> eventsFileHelper = this.this$0;
        lVar.invoke(k.x(hVar, new C6798l() {
            public final T invoke(String str) {
                C6496s.h(str, "line");
                return eventsFileHelper.mapToEvent(str);
            }
        }));
    }
}
