package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.NexusWrapper;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import lf.C6514M;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.utilities.NexusClientUtilsKt", f = "NexusClientUtils.kt", l = {23}, m = "handleNexusClientLifecycle")
final class NexusClientUtilsKt$handleNexusClientLifecycle$2 extends d {
    int label;
    /* synthetic */ Object result;

    NexusClientUtilsKt$handleNexusClientLifecycle$2(C6658d<? super NexusClientUtilsKt$handleNexusClientLifecycle$2> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NexusClientUtilsKt.handleNexusClientLifecycle((IntercomDataLayer) null, (NexusWrapper) null, (C6658d<? super C6514M>) this);
    }
}
