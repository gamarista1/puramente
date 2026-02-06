package io.intercom.android.sdk.lightcompressor.utils;

import Af.a;
import Sg.p;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import io.intercom.android.sdk.lightcompressor.video.Mp4Movie;
import java.io.File;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u00020\u001d2\n\u0010(\u001a\u00060&j\u0002`'¢\u0006\u0004\b)\u0010*J\u001d\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J1\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006032\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\"¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\"¢\u0006\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lio/intercom/android/sdk/lightcompressor/utils/CompressorUtils;", "", "<init>", "()V", "Landroid/media/MediaFormat;", "format", "", "getFrameRate", "(Landroid/media/MediaFormat;)I", "getIFrameIntervalRate", "getColorStandard", "(Landroid/media/MediaFormat;)Ljava/lang/Integer;", "getColorTransfer", "getColorRange", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "", "prepareVideoWidth", "(Landroid/media/MediaMetadataRetriever;)D", "prepareVideoHeight", "rotation", "Ljava/io/File;", "cacheFile", "Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;", "setUpMP4Movie", "(ILjava/io/File;)Lio/intercom/android/sdk/lightcompressor/video/Mp4Movie;", "inputFormat", "outputFormat", "newBitrate", "Llf/M;", "setOutputFileParameters", "(Landroid/media/MediaFormat;Landroid/media/MediaFormat;I)V", "Landroid/media/MediaExtractor;", "extractor", "", "isVideo", "findTrack", "(Landroid/media/MediaExtractor;Z)I", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "printException", "(Ljava/lang/Exception;)V", "bitrate", "Lio/intercom/android/sdk/lightcompressor/VideoQuality;", "quality", "getBitrate", "(ILio/intercom/android/sdk/lightcompressor/VideoQuality;)I", "width", "height", "keepOriginalResolution", "Lkotlin/Pair;", "generateWidthAndHeight", "(DDZ)Lkotlin/Pair;", "hasQTI", "()Z", "MIN_HEIGHT", "D", "MIN_WIDTH", "I_FRAME_INTERVAL", "I", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompressorUtils {
    public static final CompressorUtils INSTANCE = new CompressorUtils();
    private static final int I_FRAME_INTERVAL = 1;
    private static final double MIN_HEIGHT = 640.0d;
    private static final double MIN_WIDTH = 368.0d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                io.intercom.android.sdk.lightcompressor.VideoQuality[] r0 = io.intercom.android.sdk.lightcompressor.VideoQuality.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.intercom.android.sdk.lightcompressor.VideoQuality r1 = io.intercom.android.sdk.lightcompressor.VideoQuality.VERY_LOW     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.intercom.android.sdk.lightcompressor.VideoQuality r1 = io.intercom.android.sdk.lightcompressor.VideoQuality.LOW     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.intercom.android.sdk.lightcompressor.VideoQuality r1 = io.intercom.android.sdk.lightcompressor.VideoQuality.MEDIUM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                io.intercom.android.sdk.lightcompressor.VideoQuality r1 = io.intercom.android.sdk.lightcompressor.VideoQuality.HIGH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                io.intercom.android.sdk.lightcompressor.VideoQuality r1 = io.intercom.android.sdk.lightcompressor.VideoQuality.VERY_HIGH     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.lightcompressor.utils.CompressorUtils.WhenMappings.<clinit>():void");
        }
    }

    private CompressorUtils() {
    }

    private final Integer getColorRange(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-range")) {
            return Integer.valueOf(mediaFormat.getInteger("color-range"));
        }
        return null;
    }

    private final Integer getColorStandard(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-standard")) {
            return Integer.valueOf(mediaFormat.getInteger("color-standard"));
        }
        return null;
    }

    private final Integer getColorTransfer(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("color-transfer")) {
            return Integer.valueOf(mediaFormat.getInteger("color-transfer"));
        }
        return null;
    }

    private final int getFrameRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("frame-rate")) {
            return mediaFormat.getInteger("frame-rate");
        }
        return 30;
    }

    private final int getIFrameIntervalRate(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("i-frame-interval")) {
            return mediaFormat.getInteger("i-frame-interval");
        }
        return 1;
    }

    public final int findTrack(MediaExtractor mediaExtractor, boolean z10) {
        C6496s.h(mediaExtractor, "extractor");
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
            C6496s.g(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            Boolean bool = null;
            if (z10) {
                if (string != null) {
                    bool = Boolean.valueOf(p.J(string, "video/", false, 2, (Object) null));
                }
                C6496s.e(bool);
                if (bool.booleanValue()) {
                    return i10;
                }
            } else {
                if (string != null) {
                    bool = Boolean.valueOf(p.J(string, "audio/", false, 2, (Object) null));
                }
                C6496s.e(bool);
                if (bool.booleanValue()) {
                    return i10;
                }
            }
        }
        return -5;
    }

    public final Pair<Integer, Integer> generateWidthAndHeight(double d10, double d11, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            return new Pair<>(Integer.valueOf(a.c(d10)), Integer.valueOf(a.c(d11)));
        }
        if (d10 >= 1920.0d || d11 >= 1920.0d) {
            i11 = NumbersUtilsKt.generateWidthHeightValue(d10, 0.5d);
            i10 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.5d);
        } else if (d10 >= 1280.0d || d11 >= 1280.0d) {
            i11 = NumbersUtilsKt.generateWidthHeightValue(d10, 0.75d);
            i10 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.75d);
        } else if (d10 >= 960.0d || d11 >= 960.0d) {
            i11 = NumbersUtilsKt.generateWidthHeightValue(d10, 0.95d);
            i10 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.95d);
        } else {
            i11 = NumbersUtilsKt.generateWidthHeightValue(d10, 0.9d);
            i10 = NumbersUtilsKt.generateWidthHeightValue(d11, 0.9d);
        }
        return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i10));
    }

    public final int getBitrate(int i10, VideoQuality videoQuality) {
        C6496s.h(videoQuality, "quality");
        int i11 = WhenMappings.$EnumSwitchMapping$0[videoQuality.ordinal()];
        if (i11 == 1) {
            return a.c(((double) i10) * 0.1d);
        }
        if (i11 == 2) {
            return a.c(((double) i10) * 0.2d);
        }
        if (i11 == 3) {
            return a.c(((double) i10) * 0.3d);
        }
        if (i11 == 4) {
            return a.c(((double) i10) * 0.4d);
        }
        if (i11 == 5) {
            return a.c(((double) i10) * 0.6d);
        }
        throw new C6535s();
    }

    public final boolean hasQTI() {
        Iterator a10 = C6481c.a(new MediaCodecList(0).getCodecInfos());
        while (a10.hasNext()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) a10.next();
            Log.i("CODECS: ", mediaCodecInfo.getName());
            String name = mediaCodecInfo.getName();
            C6496s.g(name, "getName(...)");
            if (p.O(name, "qti.avc", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final double prepareVideoHeight(MediaMetadataRetriever mediaMetadataRetriever) {
        C6496s.h(mediaMetadataRetriever, "mediaMetadataRetriever");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(19);
        if (extractMetadata == null || extractMetadata.length() == 0) {
            return MIN_HEIGHT;
        }
        return Double.parseDouble(extractMetadata);
    }

    public final double prepareVideoWidth(MediaMetadataRetriever mediaMetadataRetriever) {
        C6496s.h(mediaMetadataRetriever, "mediaMetadataRetriever");
        String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
        if (extractMetadata == null || extractMetadata.length() == 0) {
            return MIN_WIDTH;
        }
        return Double.parseDouble(extractMetadata);
    }

    public final void printException(Exception exc) {
        C6496s.h(exc, "exception");
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = "An error has occurred!";
        }
        Log.e("Compressor", localizedMessage, exc);
    }

    public final void setOutputFileParameters(MediaFormat mediaFormat, MediaFormat mediaFormat2, int i10) {
        C6496s.h(mediaFormat, "inputFormat");
        C6496s.h(mediaFormat2, "outputFormat");
        int frameRate = getFrameRate(mediaFormat);
        int iFrameIntervalRate = getIFrameIntervalRate(mediaFormat);
        mediaFormat2.setInteger("color-format", 2130708361);
        mediaFormat2.setInteger("frame-rate", frameRate);
        mediaFormat2.setInteger("i-frame-interval", iFrameIntervalRate);
        mediaFormat2.setInteger("bitrate", i10);
        mediaFormat2.setInteger("bitrate-mode", 2);
        CompressorUtils compressorUtils = INSTANCE;
        Integer colorStandard = compressorUtils.getColorStandard(mediaFormat);
        if (colorStandard != null) {
            mediaFormat2.setInteger("color-standard", colorStandard.intValue());
        }
        Integer colorTransfer = compressorUtils.getColorTransfer(mediaFormat);
        if (colorTransfer != null) {
            mediaFormat2.setInteger("color-transfer", colorTransfer.intValue());
        }
        Integer colorRange = compressorUtils.getColorRange(mediaFormat);
        if (colorRange != null) {
            mediaFormat2.setInteger("color-range", colorRange.intValue());
        }
        Log.i("Output file parameters", "videoFormat: " + mediaFormat2);
    }

    public final Mp4Movie setUpMP4Movie(int i10, File file) {
        C6496s.h(file, "cacheFile");
        Mp4Movie mp4Movie = new Mp4Movie();
        mp4Movie.setCacheFile(file);
        mp4Movie.setRotation(i10);
        return mp4Movie;
    }
}
