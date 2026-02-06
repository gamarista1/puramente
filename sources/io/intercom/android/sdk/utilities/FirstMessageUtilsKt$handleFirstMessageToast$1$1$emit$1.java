package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import lf.C6514M;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1", f = "FirstMessageUtils.kt", l = {31}, m = "emit")
final class FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirstMessageUtilsKt$handleFirstMessageToast$1.AnonymousClass1<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(FirstMessageUtilsKt$handleFirstMessageToast$1.AnonymousClass1<? super T> r12, C6658d<? super FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = r12;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((IntercomEvent.BaseResponseReceived) null, (C6658d<? super C6514M>) this);
    }
}
