package io.intercom.android.sdk.lightcompressor;

import Ug.K;
import android.content.Context;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "", "<anonymous>", "(LUg/K;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1$job$1", f = "VideoCompressor.kt", l = {}, m = "invokeSuspend")
final class VideoCompressor$doVideoCompression$1$job$1 extends l implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $i;
    final /* synthetic */ List<Uri> $uris;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoCompressor$doVideoCompression$1$job$1(Context context, List<? extends Uri> list, int i10, C6658d<? super VideoCompressor$doVideoCompression$1$job$1> dVar) {
        super(2, dVar);
        this.$context = context;
        this.$uris = list;
        this.$i = i10;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new VideoCompressor$doVideoCompression$1$job$1(this.$context, this.$uris, this.$i, dVar);
    }

    public final Object invoke(K k10, C6658d<? super String> dVar) {
        return ((VideoCompressor$doVideoCompression$1$job$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            return VideoCompressor.INSTANCE.getMediaPath(this.$context, this.$uris.get(this.$i));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
