package io.intercom.android.sdk.m5.upload.data;

import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import qf.C6658d;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@f(c = "io.intercom.android.sdk.m5.upload.data.UploadRepository", f = "UploadRepository.kt", l = {39, 45}, m = "uploadFile")
final class UploadRepository$uploadFile$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploadRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UploadRepository$uploadFile$1(UploadRepository uploadRepository, C6658d<? super UploadRepository$uploadFile$1> dVar) {
        super(dVar);
        this.this$0 = uploadRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadFile((MediaData.Media) null, this);
    }
}
