package io.intercom.android.sdk.m5.utils;

import android.content.Context;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.utils.MediaCompressionKt", f = "MediaCompression.kt", l = {133}, m = "getCompressedMediaData")
final class MediaCompressionKt$getCompressedMediaData$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MediaCompressionKt$getCompressedMediaData$1(C6658d<? super MediaCompressionKt$getCompressedMediaData$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MediaCompressionKt.getCompressedMediaData((MediaData.Media) null, (Context) null, this);
    }
}
