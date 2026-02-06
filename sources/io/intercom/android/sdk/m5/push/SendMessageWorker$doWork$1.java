package io.intercom.android.sdk.m5.push;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.push.SendMessageWorker", f = "SendMessageWorker.kt", l = {31}, m = "doWork")
final class SendMessageWorker$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendMessageWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendMessageWorker$doWork$1(SendMessageWorker sendMessageWorker, C6658d<? super SendMessageWorker$doWork$1> dVar) {
        super(dVar);
        this.this$0 = sendMessageWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
