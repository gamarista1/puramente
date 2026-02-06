package io.intercom.android.sdk.lightcompressor.compressor;

import Ug.K;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.revenuecat.purchases.common.UtilsKt;
import io.intercom.android.sdk.lightcompressor.CompressionProgressListener;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.utils.CompressorUtils;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.v;
import lf.w;
import lf.z;
import qf.C6658d;
import rf.C6680b;
import yf.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUg/K;", "Lio/intercom/android/sdk/lightcompressor/video/Result;", "<anonymous>", "(LUg/K;)Lio/intercom/android/sdk/lightcompressor/video/Result;"}, k = 3, mv = {2, 0, 0})
@f(c = "io.intercom.android.sdk.lightcompressor.compressor.Compressor$compressVideo$2", f = "Compressor.kt", l = {}, m = "invokeSuspend")
final class Compressor$compressVideo$2 extends l implements p {
    final /* synthetic */ Configuration $configuration;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $destination;
    final /* synthetic */ int $index;
    final /* synthetic */ CompressionProgressListener $listener;
    final /* synthetic */ Uri $srcUri;
    final /* synthetic */ String $streamableFile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Compressor$compressVideo$2(Context context, Uri uri, int i10, Configuration configuration, String str, String str2, CompressionProgressListener compressionProgressListener, C6658d<? super Compressor$compressVideo$2> dVar) {
        super(2, dVar);
        this.$context = context;
        this.$srcUri = uri;
        this.$index = i10;
        this.$configuration = configuration;
        this.$destination = str;
        this.$streamableFile = str2;
        this.$listener = compressionProgressListener;
    }

    public final C6658d<C6514M> create(Object obj, C6658d<?> dVar) {
        Compressor$compressVideo$2 compressor$compressVideo$2 = new Compressor$compressVideo$2(this.$context, this.$srcUri, this.$index, this.$configuration, this.$destination, this.$streamableFile, this.$listener, dVar);
        compressor$compressVideo$2.L$0 = obj;
        return compressor$compressVideo$2;
    }

    public final Object invoke(K k10, C6658d<? super Result> dVar) {
        return ((Compressor$compressVideo$2) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        int intValue;
        Pair<Integer, Integer> pair;
        int i10;
        Integer num;
        C6680b.f();
        if (this.label == 0) {
            w.b(obj);
            K k10 = (K) this.L$0;
            MediaExtractor mediaExtractor = new MediaExtractor();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.$context, this.$srcUri);
                Context context = this.$context;
                Uri uri = this.$srcUri;
                Integer num2 = null;
                try {
                    v.a aVar = v.f71841b;
                    mediaExtractor.setDataSource(context, uri, (Map) null);
                    v.b(C6514M.f71813a);
                } catch (Throwable th2) {
                    v.a aVar2 = v.f71841b;
                    v.b(w.a(th2));
                }
                CompressorUtils compressorUtils = CompressorUtils.INSTANCE;
                double prepareVideoHeight = compressorUtils.prepareVideoHeight(mediaMetadataRetriever);
                double prepareVideoWidth = compressorUtils.prepareVideoWidth(mediaMetadataRetriever);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                if (extractMetadata == null || extractMetadata.length() == 0 || extractMetadata2 == null || extractMetadata2.length() == 0 || extractMetadata3 == null || extractMetadata3.length() == 0) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0, (String) null, 24, (DefaultConstructorMarker) null);
                }
                try {
                    z zVar = new z(b.c(Integer.parseInt(extractMetadata)), b.c(Integer.parseInt(extractMetadata2)), b.d(Long.parseLong(extractMetadata3) * ((long) 1000)));
                    int intValue2 = ((Number) zVar.a()).intValue();
                    int intValue3 = ((Number) zVar.b()).intValue();
                    long longValue = ((Number) zVar.c()).longValue();
                    if (this.$configuration.isMinBitrateCheckEnabled() && intValue3 <= 2000000) {
                        return new Result(this.$index, false, "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false", 0, (String) null, 24, (DefaultConstructorMarker) null);
                    }
                    if (this.$configuration.getVideoBitrateInMbps() == null) {
                        intValue = compressorUtils.getBitrate(intValue3, this.$configuration.getQuality());
                    } else {
                        Integer videoBitrateInMbps = this.$configuration.getVideoBitrateInMbps();
                        C6496s.e(videoBitrateInMbps);
                        intValue = videoBitrateInMbps.intValue() * UtilsKt.MICROS_MULTIPLIER;
                    }
                    int i11 = intValue;
                    if (this.$configuration.getVideoHeight() != null) {
                        Double videoWidth = this.$configuration.getVideoWidth();
                        if (videoWidth != null) {
                            num = b.c((int) videoWidth.doubleValue());
                        } else {
                            num = null;
                        }
                        Double videoHeight = this.$configuration.getVideoHeight();
                        if (videoHeight != null) {
                            num2 = b.c((int) videoHeight.doubleValue());
                        }
                        pair = new Pair<>(num, num2);
                    } else {
                        pair = compressorUtils.generateWidthAndHeight(prepareVideoWidth, prepareVideoHeight, this.$configuration.getKeepOriginalResolution());
                    }
                    Integer num3 = (Integer) pair.a();
                    Integer num4 = (Integer) pair.b();
                    if (intValue2 != 90) {
                        if (intValue2 == 180) {
                            i10 = 0;
                        } else if (intValue2 != 270) {
                            i10 = intValue2;
                        }
                        Compressor compressor = Compressor.INSTANCE;
                        int i12 = this.$index;
                        C6496s.e(num3);
                        int intValue4 = num3.intValue();
                        C6496s.e(num4);
                        return compressor.start(i12, intValue4, num4.intValue(), this.$destination, i11, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, longValue, i10);
                    }
                    i10 = 0;
                    Integer num5 = num3;
                    num3 = num4;
                    num4 = num5;
                    Compressor compressor2 = Compressor.INSTANCE;
                    int i122 = this.$index;
                    C6496s.e(num3);
                    int intValue42 = num3.intValue();
                    C6496s.e(num4);
                    return compressor2.start(i122, intValue42, num4.intValue(), this.$destination, i11, this.$streamableFile, this.$configuration.getDisableAudio(), mediaExtractor, this.$listener, longValue, i10);
                } catch (Exception unused) {
                    return new Result(this.$index, false, "Failed to extract video meta-data, please try again", 0, (String) null, 24, (DefaultConstructorMarker) null);
                }
            } catch (IllegalArgumentException e10) {
                CompressorUtils.INSTANCE.printException(e10);
                return new Result(this.$index, false, String.valueOf(e10.getMessage()), 0, (String) null, 24, (DefaultConstructorMarker) null);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
