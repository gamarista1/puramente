package io.intercom.android.sdk.m5.inbox.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import m3.L;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.inbox.data.InboxPagingSource", f = "InboxPagingSource.kt", l = {18, 32}, m = "load")
final class InboxPagingSource$load$1 extends d {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InboxPagingSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InboxPagingSource$load$1(InboxPagingSource inboxPagingSource, C6658d<? super InboxPagingSource$load$1> dVar) {
        super(dVar);
        this.this$0 = inboxPagingSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load((L.a) null, this);
    }
}
