package io.intercom.android.sdk.lightcompressor;

import Ug.K;
import android.content.Context;
import android.net.Uri;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.N;
import lf.C6514M;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Llf/M;", "<anonymous>", "(LUg/K;)V"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1", f = "VideoCompressor.kt", l = {117, 143}, m = "invokeSuspend")
final class VideoCompressor$doVideoCompression$1 extends l implements p {
    final /* synthetic */ AppSpecificStorageConfiguration $appSpecificStorageConfiguration;
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ int $i;
    final /* synthetic */ boolean $isStreamable;
    final /* synthetic */ CompressionListener $listener;
    final /* synthetic */ SharedStorageConfiguration $sharedStorageConfiguration;
    final /* synthetic */ N $streamableFile;
    final /* synthetic */ List<Uri> $uris;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoCompressor$doVideoCompression$1(Context context, SharedStorageConfiguration sharedStorageConfiguration, AppSpecificStorageConfiguration appSpecificStorageConfiguration, boolean z10, Configuration configuration, int i10, N n10, List<? extends Uri> list, CompressionListener compressionListener, C6658d<? super VideoCompressor$doVideoCompression$1> dVar) {
        super(2, dVar);
        this.$context = context;
        this.$sharedStorageConfiguration = sharedStorageConfiguration;
        this.$appSpecificStorageConfiguration = appSpecificStorageConfiguration;
        this.$isStreamable = z10;
        this.$configuration = configuration;
        this.$i = i10;
        this.$streamableFile = n10;
        this.$uris = list;
        this.$listener = compressionListener;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        VideoCompressor$doVideoCompression$1 videoCompressor$doVideoCompression$1 = new VideoCompressor$doVideoCompression$1(this.$context, this.$sharedStorageConfiguration, this.$appSpecificStorageConfiguration, this.$isStreamable, this.$configuration, this.$i, this.$streamableFile, this.$uris, this.$listener, dVar);
        videoCompressor$doVideoCompression$1.L$0 = obj;
        return videoCompressor$doVideoCompression$1;
    }

    public final Object invoke(K k10, C6658d<? super C6514M> dVar) {
        return ((VideoCompressor$doVideoCompression$1) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            r25 = this;
            r9 = r25
            java.lang.Object r10 = rf.C6680b.f()
            int r0 = r9.label
            r1 = 2
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r12) goto L_0x003f
            if (r0 != r1) goto L_0x0037
            boolean r0 = r9.Z$0
            int r1 = r9.I$0
            java.lang.Object r2 = r9.L$4
            io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration r2 = (io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration) r2
            java.lang.Object r3 = r9.L$3
            io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration r3 = (io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration) r3
            java.lang.Object r4 = r9.L$2
            io.intercom.android.sdk.lightcompressor.config.Configuration r4 = (io.intercom.android.sdk.lightcompressor.config.Configuration) r4
            java.lang.Object r5 = r9.L$1
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r9.L$0
            io.intercom.android.sdk.lightcompressor.CompressionListener r6 = (io.intercom.android.sdk.lightcompressor.CompressionListener) r6
            lf.w.b(r26)
            r11 = r0
            r21 = r2
            r20 = r3
            r18 = r5
            r0 = r26
            goto L_0x0134
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003f:
            lf.w.b(r26)
            r0 = r26
            goto L_0x0069
        L_0x0045:
            lf.w.b(r26)
            java.lang.Object r0 = r9.L$0
            r2 = r0
            Ug.K r2 = (Ug.K) r2
            io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1$job$1 r5 = new io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1$job$1
            android.content.Context r0 = r9.$context
            java.util.List<android.net.Uri> r3 = r9.$uris
            int r4 = r9.$i
            r5.<init>(r0, r3, r4, r11)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            Ug.S r0 = Ug.C5576k.b(r2, r3, r4, r5, r6, r7)
            r9.label = r12
            java.lang.Object r0 = r0.y(r9)
            if (r0 != r10) goto L_0x0069
            return r10
        L_0x0069:
            java.lang.String r0 = (java.lang.String) r0
            io.intercom.android.sdk.lightcompressor.VideoCompressor r2 = io.intercom.android.sdk.lightcompressor.VideoCompressor.INSTANCE
            android.content.Context r14 = r9.$context
            io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration r3 = r9.$sharedStorageConfiguration
            io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration r4 = r9.$appSpecificStorageConfiguration
            boolean r5 = r9.$isStreamable
            java.lang.Boolean r18 = kotlin.coroutines.jvm.internal.b.a(r5)
            io.intercom.android.sdk.lightcompressor.config.Configuration r5 = r9.$configuration
            java.util.List r5 = r5.getVideoNames()
            int r6 = r9.$i
            java.lang.Object r5 = r5.get(r6)
            r19 = r5
            java.lang.String r19 = (java.lang.String) r19
            r5 = 0
            java.lang.Boolean r20 = kotlin.coroutines.jvm.internal.b.a(r5)
            r13 = r2
            r15 = r0
            r16 = r3
            r17 = r4
            java.io.File r3 = r13.saveVideoFile(r14, r15, r16, r17, r18, r19, r20)
            boolean r4 = r9.$isStreamable
            if (r4 == 0) goto L_0x00c6
            kotlin.jvm.internal.N r4 = r9.$streamableFile
            android.content.Context r14 = r9.$context
            io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration r6 = r9.$sharedStorageConfiguration
            io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration r7 = r9.$appSpecificStorageConfiguration
            io.intercom.android.sdk.lightcompressor.config.Configuration r8 = r9.$configuration
            java.util.List r8 = r8.getVideoNames()
            int r13 = r9.$i
            java.lang.Object r8 = r8.get(r13)
            r19 = r8
            java.lang.String r19 = (java.lang.String) r19
            java.lang.Boolean r20 = kotlin.coroutines.jvm.internal.b.a(r5)
            r18 = 0
            r13 = r2
            r15 = r0
            r16 = r6
            r17 = r7
            java.io.File r0 = r13.saveVideoFile(r14, r15, r16, r17, r18, r19, r20)
            r4.f71759a = r0
        L_0x00c6:
            if (r3 == 0) goto L_0x0175
            io.intercom.android.sdk.lightcompressor.CompressionListener r13 = r9.$listener
            int r14 = r9.$i
            android.content.Context r15 = r9.$context
            java.util.List<android.net.Uri> r0 = r9.$uris
            kotlin.jvm.internal.N r4 = r9.$streamableFile
            io.intercom.android.sdk.lightcompressor.config.Configuration r8 = r9.$configuration
            io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration r7 = r9.$sharedStorageConfiguration
            io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration r6 = r9.$appSpecificStorageConfiguration
            boolean r5 = r9.$isStreamable
            io.intercom.android.sdk.lightcompressor.compressor.Compressor r11 = io.intercom.android.sdk.lightcompressor.compressor.Compressor.INSTANCE
            r11.setRunning(r12)
            r13.onStart(r14)
            java.lang.Object r0 = r0.get(r14)
            r11 = r0
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.String r3 = r3.getPath()
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.C6496s.g(r3, r0)
            java.lang.Object r0 = r4.f71759a
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = r0.getPath()
            r17 = r0
            goto L_0x0101
        L_0x00ff:
            r17 = 0
        L_0x0101:
            r9.L$0 = r13
            r9.L$1 = r15
            r9.L$2 = r8
            r9.L$3 = r7
            r9.L$4 = r6
            r9.I$0 = r14
            r9.Z$0 = r5
            r9.label = r1
            r0 = r2
            r1 = r14
            r2 = r15
            r4 = r3
            r3 = r11
            r11 = r5
            r5 = r17
            r17 = r6
            r6 = r8
            r18 = r7
            r7 = r13
            r19 = r8
            r8 = r25
            java.lang.Object r0 = r0.startCompression(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto L_0x012a
            return r10
        L_0x012a:
            r6 = r13
            r1 = r14
            r21 = r17
            r20 = r18
            r4 = r19
            r18 = r15
        L_0x0134:
            io.intercom.android.sdk.lightcompressor.video.Result r0 = (io.intercom.android.sdk.lightcompressor.video.Result) r0
            boolean r2 = r0.getSuccess()
            if (r2 == 0) goto L_0x016a
            io.intercom.android.sdk.lightcompressor.VideoCompressor r17 = io.intercom.android.sdk.lightcompressor.VideoCompressor.INSTANCE
            java.lang.String r19 = r0.getPath()
            java.lang.Boolean r22 = kotlin.coroutines.jvm.internal.b.a(r11)
            java.util.List r2 = r4.getVideoNames()
            java.lang.Object r2 = r2.get(r1)
            r23 = r2
            java.lang.String r23 = (java.lang.String) r23
            java.lang.Boolean r24 = kotlin.coroutines.jvm.internal.b.a(r12)
            java.io.File r2 = r17.saveVideoFile(r18, r19, r20, r21, r22, r23, r24)
            long r3 = r0.getSize()
            if (r2 == 0) goto L_0x0165
            java.lang.String r11 = r2.getPath()
            goto L_0x0166
        L_0x0165:
            r11 = 0
        L_0x0166:
            r6.onSuccess(r1, r3, r11)
            goto L_0x0175
        L_0x016a:
            java.lang.String r0 = r0.getFailureMessage()
            if (r0 != 0) goto L_0x0172
            java.lang.String r0 = "An error has occurred!"
        L_0x0172:
            r6.onFailure(r1, r0)
        L_0x0175:
            lf.M r0 = lf.C6514M.f71813a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.lightcompressor.VideoCompressor$doVideoCompression$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
