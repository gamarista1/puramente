package io.intercom.android.sdk.lightcompressor;

import Ug.K;
import android.content.Context;
import android.net.Uri;
import io.intercom.android.sdk.lightcompressor.compressor.Compressor;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.video.Result;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Lio/intercom/android/sdk/lightcompressor/video/Result;", "<anonymous>", "(LUg/K;)Lio/intercom/android/sdk/lightcompressor/video/Result;"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$startCompression$2", f = "VideoCompressor.kt", l = {183}, m = "invokeSuspend")
final class VideoCompressor$startCompression$2 extends l implements p {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $destPath;
    final /* synthetic */ int $index;
    final /* synthetic */ CompressionListener $listener;
    final /* synthetic */ Uri $srcUri;
    final /* synthetic */ String $streamableFile;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoCompressor$startCompression$2(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionListener compressionListener, C6658d<? super VideoCompressor$startCompression$2> dVar) {
        super(2, dVar);
        this.$index = i10;
        this.$context = context;
        this.$srcUri = uri;
        this.$destPath = str;
        this.$streamableFile = str2;
        this.$configuration = configuration;
        this.$listener = compressionListener;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        return new VideoCompressor$startCompression$2(this.$index, this.$context, this.$srcUri, this.$destPath, this.$streamableFile, this.$configuration, this.$listener, dVar);
    }

    public final Object invoke(K k10, C6658d<? super Result> dVar) {
        return ((VideoCompressor$startCompression$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f10 = C6680b.f();
        int i10 = this.label;
        if (i10 == 0) {
            w.b(obj);
            Compressor compressor = Compressor.INSTANCE;
            int i11 = this.$index;
            Context context = this.$context;
            Uri uri = this.$srcUri;
            String str = this.$destPath;
            String str2 = this.$streamableFile;
            Configuration configuration = this.$configuration;
            final CompressionListener compressionListener = this.$listener;
            AnonymousClass1 r82 = new CompressionProgressListener() {
                public void onProgressCancelled(int i10) {
                    compressionListener.onCancelled(i10);
                }

                public void onProgressChanged(int i10, float f10) {
                    compressionListener.onProgress(i10, f10);
                }
            };
            this.label = 1;
            obj = compressor.compressVideo(i11, context, uri, str, str2, configuration, r82, this);
            if (obj == f10) {
                return f10;
            }
        } else if (i10 == 1) {
            w.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
