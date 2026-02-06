package io.intercom.android.sdk.lightcompressor.compressor;

import Ug.C5572i;
import Ug.Z;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import io.intercom.android.sdk.lightcompressor.CompressionProgressListener;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.utils.CompressorUtils;
import io.intercom.android.sdk.lightcompressor.video.InputSurface;
import io.intercom.android.sdk.lightcompressor.video.MP4Builder;
import io.intercom.android.sdk.lightcompressor.video.OutputSurface;
import io.intercom.android.sdk.lightcompressor.video.Result;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import qf.C6658d;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J?\u0010/\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100JJ\u00109\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u0010H@¢\u0006\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\bA\u0010>R\"\u0010B\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bB\u0010D\"\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lio/intercom/android/sdk/lightcompressor/compressor/Compressor;", "", "<init>", "()V", "", "id", "newWidth", "newHeight", "", "destination", "newBitrate", "streamableFile", "", "disableAudio", "Landroid/media/MediaExtractor;", "extractor", "Lio/intercom/android/sdk/lightcompressor/CompressionProgressListener;", "compressionProgressListener", "", "duration", "rotation", "Lio/intercom/android/sdk/lightcompressor/video/Result;", "start", "(IIILjava/lang/String;ILjava/lang/String;ZLandroid/media/MediaExtractor;Lio/intercom/android/sdk/lightcompressor/CompressionProgressListener;JI)Lio/intercom/android/sdk/lightcompressor/video/Result;", "Lio/intercom/android/sdk/lightcompressor/video/MP4Builder;", "mediaMuxer", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Llf/M;", "processAudio", "(Lio/intercom/android/sdk/lightcompressor/video/MP4Builder;Landroid/media/MediaCodec$BufferInfo;ZLandroid/media/MediaExtractor;)V", "Landroid/media/MediaFormat;", "outputFormat", "hasQTI", "Landroid/media/MediaCodec;", "prepareEncoder", "(Landroid/media/MediaFormat;Z)Landroid/media/MediaCodec;", "inputFormat", "Lio/intercom/android/sdk/lightcompressor/video/OutputSurface;", "outputSurface", "prepareDecoder", "(Landroid/media/MediaFormat;Lio/intercom/android/sdk/lightcompressor/video/OutputSurface;)Landroid/media/MediaCodec;", "videoIndex", "decoder", "encoder", "Lio/intercom/android/sdk/lightcompressor/video/InputSurface;", "inputSurface", "dispose", "(ILandroid/media/MediaCodec;Landroid/media/MediaCodec;Lio/intercom/android/sdk/lightcompressor/video/InputSurface;Lio/intercom/android/sdk/lightcompressor/video/OutputSurface;Landroid/media/MediaExtractor;)V", "index", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "srcUri", "Lio/intercom/android/sdk/lightcompressor/config/Configuration;", "configuration", "listener", "compressVideo", "(ILandroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/lightcompressor/config/Configuration;Lio/intercom/android/sdk/lightcompressor/CompressionProgressListener;Lqf/d;)Ljava/lang/Object;", "MIN_BITRATE", "I", "MIME_TYPE", "Ljava/lang/String;", "MEDIACODEC_TIMEOUT_DEFAULT", "J", "INVALID_BITRATE", "isRunning", "Z", "()Z", "setRunning", "(Z)V", "intercom-sdk-lightcompressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Compressor {
    public static final Compressor INSTANCE = new Compressor();
    private static final String INVALID_BITRATE = "The provided bitrate is smaller than what is needed for compression try to set isMinBitRateEnabled to false";
    private static final long MEDIACODEC_TIMEOUT_DEFAULT = 100;
    private static final String MIME_TYPE = "video/avc";
    private static final int MIN_BITRATE = 2000000;
    private static boolean isRunning = true;

    private Compressor() {
    }

    private final void dispose(int i10, MediaCodec mediaCodec, MediaCodec mediaCodec2, InputSurface inputSurface, OutputSurface outputSurface, MediaExtractor mediaExtractor) {
        mediaExtractor.unselectTrack(i10);
        mediaCodec.stop();
        mediaCodec.release();
        mediaCodec2.stop();
        mediaCodec2.release();
        inputSurface.release();
        outputSurface.release();
    }

    private final MediaCodec prepareDecoder(MediaFormat mediaFormat, OutputSurface outputSurface) {
        String string = mediaFormat.getString("mime");
        C6496s.e(string);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
        C6496s.g(createDecoderByType, "createDecoderByType(...)");
        createDecoderByType.configure(mediaFormat, outputSurface.getSurface(), (MediaCrypto) null, 0);
        return createDecoderByType;
    }

    private final MediaCodec prepareEncoder(MediaFormat mediaFormat, boolean z10) {
        MediaCodec mediaCodec;
        if (z10) {
            mediaCodec = MediaCodec.createByCodecName("c2.android.avc.encoder");
        } else {
            mediaCodec = MediaCodec.createEncoderByType(MIME_TYPE);
        }
        C6496s.e(mediaCodec);
        try {
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return mediaCodec;
        } catch (Exception unused) {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(MIME_TYPE);
            createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return createEncoderByType;
        }
    }

    private final void processAudio(MP4Builder mP4Builder, MediaCodec.BufferInfo bufferInfo, boolean z10, MediaExtractor mediaExtractor) {
        int findTrack = CompressorUtils.INSTANCE.findTrack(mediaExtractor, false);
        if (findTrack >= 0 && !z10) {
            mediaExtractor.selectTrack(findTrack);
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(findTrack);
            C6496s.g(trackFormat, "getTrackFormat(...)");
            int addTrack = mP4Builder.addTrack(trackFormat, true);
            int integer = trackFormat.getInteger("max-input-size");
            if (integer <= 0) {
                integer = 65536;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(integer);
            C6496s.g(allocateDirect, "allocateDirect(...)");
            if (Build.VERSION.SDK_INT >= 28) {
                long a10 = mediaExtractor.getSampleSize();
                if (a10 > ((long) integer)) {
                    allocateDirect = ByteBuffer.allocateDirect((int) (a10 + ((long) 1024)));
                }
            }
            mediaExtractor.seekTo(0, 0);
            boolean z11 = false;
            while (!z11) {
                int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
                if (sampleTrackIndex == findTrack) {
                    int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                    bufferInfo.size = readSampleData;
                    if (readSampleData >= 0) {
                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                        bufferInfo.offset = 0;
                        bufferInfo.flags = 1;
                        mP4Builder.writeSampleData(addTrack, allocateDirect, bufferInfo, true);
                        mediaExtractor.advance();
                    } else {
                        bufferInfo.size = 0;
                    }
                } else if (sampleTrackIndex != -1) {
                }
                z11 = true;
            }
            mediaExtractor.unselectTrack(findTrack);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ec, code lost:
        r8 = r26;
        r24 = r7;
        r15 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e5 A[SYNTHETIC, Splitter:B:148:0x02e5] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x030b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.intercom.android.sdk.lightcompressor.video.Result start(int r27, int r28, int r29, java.lang.String r30, int r31, java.lang.String r32, boolean r33, android.media.MediaExtractor r34, io.intercom.android.sdk.lightcompressor.CompressionProgressListener r35, long r36, int r38) {
        /*
            r26 = this;
            r8 = r26
            r15 = r27
            r0 = r28
            r1 = r29
            r13 = r32
            r9 = r34
            r10 = r35
            if (r0 == 0) goto L_0x0328
            if (r1 == 0) goto L_0x0328
            java.io.File r14 = new java.io.File
            r2 = r30
            r14.<init>(r2)
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x02da }
            r11.<init>()     // Catch:{ Exception -> 0x02da }
            io.intercom.android.sdk.lightcompressor.utils.CompressorUtils r2 = io.intercom.android.sdk.lightcompressor.utils.CompressorUtils.INSTANCE     // Catch:{ Exception -> 0x02da }
            r3 = r38
            io.intercom.android.sdk.lightcompressor.video.Mp4Movie r3 = r2.setUpMP4Movie(r3, r14)     // Catch:{ Exception -> 0x02da }
            io.intercom.android.sdk.lightcompressor.video.MP4Builder r4 = new io.intercom.android.sdk.lightcompressor.video.MP4Builder     // Catch:{ Exception -> 0x02da }
            r4.<init>()     // Catch:{ Exception -> 0x02da }
            io.intercom.android.sdk.lightcompressor.video.MP4Builder r12 = r4.createMovie(r3)     // Catch:{ Exception -> 0x02da }
            r3 = 1
            int r4 = r2.findTrack(r9, r3)     // Catch:{ Exception -> 0x02da }
            r9.selectTrack(r4)     // Catch:{ Exception -> 0x02da }
            r5 = 0
            r7 = 0
            r9.seekTo(r5, r7)     // Catch:{ Exception -> 0x02da }
            android.media.MediaFormat r5 = r9.getTrackFormat(r4)     // Catch:{ Exception -> 0x02da }
            java.lang.String r6 = "getTrackFormat(...)"
            kotlin.jvm.internal.C6496s.g(r5, r6)     // Catch:{ Exception -> 0x02da }
            java.lang.String r6 = "video/avc"
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r6, r0, r1)     // Catch:{ Exception -> 0x02da }
            java.lang.String r1 = "createVideoFormat(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)     // Catch:{ Exception -> 0x02da }
            r1 = r31
            r2.setOutputFileParameters(r5, r0, r1)     // Catch:{ Exception -> 0x02da }
            boolean r1 = r2.hasQTI()     // Catch:{ Exception -> 0x02da }
            android.media.MediaCodec r6 = r8.prepareEncoder(r0, r1)     // Catch:{ Exception -> 0x02da }
            io.intercom.android.sdk.lightcompressor.video.InputSurface r2 = new io.intercom.android.sdk.lightcompressor.video.InputSurface     // Catch:{ Exception -> 0x02b6 }
            android.view.Surface r0 = r6.createInputSurface()     // Catch:{ Exception -> 0x02b6 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x02b6 }
            r2.makeCurrent()     // Catch:{ Exception -> 0x02b6 }
            r6.start()     // Catch:{ Exception -> 0x02b6 }
            io.intercom.android.sdk.lightcompressor.video.OutputSurface r1 = new io.intercom.android.sdk.lightcompressor.video.OutputSurface     // Catch:{ Exception -> 0x02b6 }
            r1.<init>()     // Catch:{ Exception -> 0x02b6 }
            android.media.MediaCodec r5 = r8.prepareDecoder(r5, r1)     // Catch:{ Exception -> 0x02b6 }
            r5.start()     // Catch:{ Exception -> 0x02b6 }
            r0 = r7
            r23 = r0
            r24 = -5
        L_0x007e:
            if (r0 != 0) goto L_0x0280
            r7 = 100
            if (r23 != 0) goto L_0x00e3
            int r3 = r34.getSampleTrackIndex()     // Catch:{ Exception -> 0x00b0 }
            if (r3 != r4) goto L_0x00ca
            int r3 = r5.dequeueInputBuffer(r7)     // Catch:{ Exception -> 0x00b0 }
            if (r3 < 0) goto L_0x00e3
            java.nio.ByteBuffer r7 = r5.getInputBuffer(r3)     // Catch:{ Exception -> 0x00b0 }
            kotlin.jvm.internal.C6496s.e(r7)     // Catch:{ Exception -> 0x00b0 }
            r8 = 0
            int r19 = r9.readSampleData(r7, r8)     // Catch:{ Exception -> 0x00b0 }
            if (r19 >= 0) goto L_0x00b7
            r20 = 0
            r22 = 4
            r18 = 0
            r19 = 0
            r16 = r5
            r17 = r3
            r16.queueInputBuffer(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x00b0 }
        L_0x00ad:
            r23 = 1
            goto L_0x00e3
        L_0x00b0:
            r0 = move-exception
            r1 = r26
        L_0x00b3:
            r15 = r13
            r13 = r14
            goto L_0x02ba
        L_0x00b7:
            long r20 = r34.getSampleTime()     // Catch:{ Exception -> 0x00b0 }
            r22 = 0
            r18 = 0
            r16 = r5
            r17 = r3
            r16.queueInputBuffer(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x00b0 }
            r34.advance()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00e3
        L_0x00ca:
            r7 = -1
            if (r3 != r7) goto L_0x00e3
            r7 = 100
            int r17 = r5.dequeueInputBuffer(r7)     // Catch:{ Exception -> 0x00b0 }
            if (r17 < 0) goto L_0x00e3
            r20 = 0
            r22 = 4
            r18 = 0
            r19 = 0
            r16 = r5
            r16.queueInputBuffer(r17, r18, r19, r20, r22)     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00ad
        L_0x00e3:
            r7 = r24
            r3 = 1
            r8 = 1
        L_0x00e7:
            if (r8 != 0) goto L_0x00f2
            if (r3 == 0) goto L_0x00ec
            goto L_0x00f2
        L_0x00ec:
            r8 = r26
            r24 = r7
            r7 = 0
            goto L_0x007e
        L_0x00f2:
            boolean r16 = isRunning     // Catch:{ Exception -> 0x027a }
            if (r16 != 0) goto L_0x012d
            r16 = r1
            r1 = r26
            r7 = r2
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r16
            r7 = r34
            r1.dispose(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0128 }
            r10.onProgressCancelled(r15)     // Catch:{ Exception -> 0x0128 }
            io.intercom.android.sdk.lightcompressor.video.Result r0 = new io.intercom.android.sdk.lightcompressor.video.Result     // Catch:{ Exception -> 0x0128 }
            java.lang.String r12 = "The compression has stopped!"
            r16 = 24
            r17 = 0
            r11 = 0
            r1 = 0
            r3 = 0
            r9 = r0
            r10 = r27
            r5 = r13
            r4 = r14
            r13 = r1
            r2 = r15
            r15 = r3
            r9.<init>(r10, r11, r12, r13, r15, r16, r17)     // Catch:{ Exception -> 0x0121 }
            return r0
        L_0x0121:
            r0 = move-exception
        L_0x0122:
            r1 = r26
            r13 = r4
            r15 = r5
            goto L_0x02ba
        L_0x0128:
            r0 = move-exception
            r5 = r13
            r4 = r14
            r2 = r15
            goto L_0x0122
        L_0x012d:
            r16 = r1
            r31 = r8
            r8 = 100
            r25 = r14
            r14 = r2
            r2 = r15
            r15 = r13
            r13 = r25
            int r1 = r6.dequeueOutputBuffer(r11, r8)     // Catch:{ Exception -> 0x0163 }
            r9 = -2
            r8 = -1
            if (r1 != r8) goto L_0x0149
            r3 = r0
            r19 = r7
            r7 = 0
            r9 = 1
            goto L_0x01ca
        L_0x0149:
            if (r1 != r9) goto L_0x016b
            android.media.MediaFormat r8 = r6.getOutputFormat()     // Catch:{ Exception -> 0x0163 }
            java.lang.String r9 = "getOutputFormat(...)"
            kotlin.jvm.internal.C6496s.g(r8, r9)     // Catch:{ Exception -> 0x0163 }
            r9 = -5
            if (r7 != r9) goto L_0x0168
            r9 = 0
            int r7 = r12.addTrack(r8, r9)     // Catch:{ Exception -> 0x0163 }
            r19 = r7
            r8 = -1
            r9 = 1
        L_0x0160:
            r7 = r3
            r3 = r0
            goto L_0x01ca
        L_0x0163:
            r0 = move-exception
        L_0x0164:
            r1 = r26
            goto L_0x02ba
        L_0x0168:
            r8 = 0
            r9 = 1
            goto L_0x0193
        L_0x016b:
            r8 = -3
            if (r1 == r8) goto L_0x0168
            if (r1 < 0) goto L_0x01b3
            java.nio.ByteBuffer r0 = r6.getOutputBuffer(r1)     // Catch:{ Exception -> 0x0163 }
            if (r0 == 0) goto L_0x0197
            int r8 = r11.size     // Catch:{ Exception -> 0x0163 }
            r9 = 1
            if (r8 <= r9) goto L_0x0185
            int r8 = r11.flags     // Catch:{ Exception -> 0x0163 }
            r8 = r8 & 2
            if (r8 != 0) goto L_0x0185
            r8 = 0
            r12.writeSampleData(r7, r0, r11, r8)     // Catch:{ Exception -> 0x0163 }
        L_0x0185:
            int r0 = r11.flags     // Catch:{ Exception -> 0x0163 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x018e
            r0 = r9
        L_0x018c:
            r8 = 0
            goto L_0x0190
        L_0x018e:
            r0 = 0
            goto L_0x018c
        L_0x0190:
            r6.releaseOutputBuffer(r1, r8)     // Catch:{ Exception -> 0x0163 }
        L_0x0193:
            r19 = r7
            r8 = -1
            goto L_0x0160
        L_0x0197:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0163 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0163 }
            r3.<init>()     // Catch:{ Exception -> 0x0163 }
            java.lang.String r4 = "encoderOutputBuffer "
            r3.append(r4)     // Catch:{ Exception -> 0x0163 }
            r3.append(r1)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r1 = " was null"
            r3.append(r1)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0163 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0163 }
            throw r0     // Catch:{ Exception -> 0x0163 }
        L_0x01b3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0163 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0163 }
            r3.<init>()     // Catch:{ Exception -> 0x0163 }
            java.lang.String r4 = "unexpected result from encoder.dequeueOutputBuffer: "
            r3.append(r4)     // Catch:{ Exception -> 0x0163 }
            r3.append(r1)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x0163 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0163 }
            throw r0     // Catch:{ Exception -> 0x0163 }
        L_0x01ca:
            if (r1 != r8) goto L_0x0268
            r9 = 100
            int r0 = r5.dequeueOutputBuffer(r11, r9)     // Catch:{ Exception -> 0x0163 }
            if (r0 != r8) goto L_0x01e8
            r9 = r34
            r10 = r35
        L_0x01d8:
            r0 = r3
            r3 = r7
            r1 = r16
            r7 = r19
            r8 = 0
        L_0x01df:
            r25 = r15
            r15 = r2
            r2 = r14
            r14 = r13
            r13 = r25
            goto L_0x00e7
        L_0x01e8:
            r1 = -3
            if (r0 == r1) goto L_0x0261
            r1 = -2
            if (r0 == r1) goto L_0x0261
            if (r0 < 0) goto L_0x024a
            int r1 = r11.size     // Catch:{ Exception -> 0x0163 }
            if (r1 == 0) goto L_0x01f6
            r1 = 1
            goto L_0x01f7
        L_0x01f6:
            r1 = 0
        L_0x01f7:
            r5.releaseOutputBuffer(r0, r1)     // Catch:{ Exception -> 0x0163 }
            if (r1 == 0) goto L_0x0237
            r16.awaitNewImage()     // Catch:{ Exception -> 0x0221 }
            r16.drawImage()     // Catch:{ Exception -> 0x0163 }
            long r0 = r11.presentationTimeUs     // Catch:{ Exception -> 0x0163 }
            r8 = 1000(0x3e8, float:1.401E-42)
            long r9 = (long) r8     // Catch:{ Exception -> 0x0163 }
            long r0 = r0 * r9
            r14.setPresentationTime(r0)     // Catch:{ Exception -> 0x0163 }
            long r0 = r11.presentationTimeUs     // Catch:{ Exception -> 0x0163 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0163 }
            r8 = r36
            float r1 = (float) r8     // Catch:{ Exception -> 0x0163 }
            float r0 = r0 / r1
            r1 = 100
            float r1 = (float) r1     // Catch:{ Exception -> 0x0163 }
            float r0 = r0 * r1
            r1 = r35
            r17 = 100
            r1.onProgressChanged(r2, r0)     // Catch:{ Exception -> 0x0163 }
            r14.swapBuffers()     // Catch:{ Exception -> 0x0163 }
            goto L_0x023d
        L_0x0221:
            r0 = move-exception
            r1 = r35
            r17 = r9
            r8 = r36
            r10 = r0
            java.lang.String r0 = "Compressor"
            java.lang.String r10 = r10.getMessage()     // Catch:{ Exception -> 0x0163 }
            if (r10 != 0) goto L_0x0233
            java.lang.String r10 = "Compression failed at swapping buffer"
        L_0x0233:
            android.util.Log.e(r0, r10)     // Catch:{ Exception -> 0x0163 }
            goto L_0x023d
        L_0x0237:
            r1 = r35
            r17 = r9
            r8 = r36
        L_0x023d:
            int r0 = r11.flags     // Catch:{ Exception -> 0x0163 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x026d
            r6.signalEndOfInputStream()     // Catch:{ Exception -> 0x0163 }
            r9 = r34
            r10 = r1
            goto L_0x01d8
        L_0x024a:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0163 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0163 }
            r3.<init>()     // Catch:{ Exception -> 0x0163 }
            java.lang.String r4 = "unexpected result from decoder.dequeueOutputBuffer: "
            r3.append(r4)     // Catch:{ Exception -> 0x0163 }
            r3.append(r0)     // Catch:{ Exception -> 0x0163 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0163 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0163 }
            throw r1     // Catch:{ Exception -> 0x0163 }
        L_0x0261:
            r1 = r35
            r17 = r9
            r8 = r36
            goto L_0x026d
        L_0x0268:
            r8 = r36
            r1 = r10
            r17 = 100
        L_0x026d:
            r8 = r31
            r9 = r34
            r10 = r1
            r0 = r3
            r3 = r7
            r1 = r16
            r7 = r19
            goto L_0x01df
        L_0x027a:
            r0 = move-exception
            r2 = r15
            r15 = r13
            r13 = r14
            goto L_0x0164
        L_0x0280:
            r16 = r1
            r25 = r14
            r14 = r2
            r2 = r15
            r15 = r13
            r13 = r25
            r1 = r26
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r14
            r6 = r16
            r7 = r34
            r1.dispose(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x02b2 }
            r2 = r33
            r3 = r34
            r1.processAudio(r12, r11, r2, r3)     // Catch:{ Exception -> 0x02ae }
            r34.release()     // Catch:{ Exception -> 0x02ae }
            r12.finishMovie()     // Catch:{ Exception -> 0x02a6 }
        L_0x02a3:
            r5 = r13
            r3 = r15
            goto L_0x02e3
        L_0x02a6:
            r0 = move-exception
            r2 = r0
            io.intercom.android.sdk.lightcompressor.utils.CompressorUtils r0 = io.intercom.android.sdk.lightcompressor.utils.CompressorUtils.INSTANCE     // Catch:{ Exception -> 0x02ae }
            r0.printException(r2)     // Catch:{ Exception -> 0x02ae }
            goto L_0x02a3
        L_0x02ae:
            r0 = move-exception
        L_0x02af:
            r5 = r13
            r3 = r15
            goto L_0x02de
        L_0x02b2:
            r0 = move-exception
            r1 = r26
            goto L_0x02af
        L_0x02b6:
            r0 = move-exception
            r1 = r8
            goto L_0x00b3
        L_0x02ba:
            io.intercom.android.sdk.lightcompressor.utils.CompressorUtils r2 = io.intercom.android.sdk.lightcompressor.utils.CompressorUtils.INSTANCE     // Catch:{ Exception -> 0x02ae }
            r2.printException(r0)     // Catch:{ Exception -> 0x02ae }
            io.intercom.android.sdk.lightcompressor.video.Result r2 = new io.intercom.android.sdk.lightcompressor.video.Result     // Catch:{ Exception -> 0x02ae }
            java.lang.String r12 = r0.getMessage()     // Catch:{ Exception -> 0x02ae }
            r16 = 24
            r17 = 0
            r11 = 0
            r3 = 0
            r0 = 0
            r9 = r2
            r10 = r27
            r5 = r13
            r13 = r3
            r3 = r15
            r15 = r0
            r9.<init>(r10, r11, r12, r13, r15, r16, r17)     // Catch:{ Exception -> 0x02d8 }
            return r2
        L_0x02d8:
            r0 = move-exception
            goto L_0x02de
        L_0x02da:
            r0 = move-exception
            r1 = r8
            r3 = r13
            r5 = r14
        L_0x02de:
            io.intercom.android.sdk.lightcompressor.utils.CompressorUtils r2 = io.intercom.android.sdk.lightcompressor.utils.CompressorUtils.INSTANCE
            r2.printException(r0)
        L_0x02e3:
            if (r3 == 0) goto L_0x030b
            io.intercom.android.sdk.lightcompressor.utils.StreamableVideo r0 = io.intercom.android.sdk.lightcompressor.utils.StreamableVideo.INSTANCE     // Catch:{ Exception -> 0x0303 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0303 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0303 }
            boolean r0 = r0.start(r5, r2)     // Catch:{ Exception -> 0x0303 }
            java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x0303 }
            r14.<init>(r3)     // Catch:{ Exception -> 0x0303 }
            if (r0 == 0) goto L_0x030c
            boolean r0 = r5.exists()     // Catch:{ Exception -> 0x0301 }
            if (r0 == 0) goto L_0x030c
            r5.delete()     // Catch:{ Exception -> 0x0301 }
            goto L_0x030c
        L_0x0301:
            r0 = move-exception
            goto L_0x0305
        L_0x0303:
            r0 = move-exception
            r14 = r5
        L_0x0305:
            io.intercom.android.sdk.lightcompressor.utils.CompressorUtils r2 = io.intercom.android.sdk.lightcompressor.utils.CompressorUtils.INSTANCE
            r2.printException(r0)
            goto L_0x030c
        L_0x030b:
            r14 = r5
        L_0x030c:
            io.intercom.android.sdk.lightcompressor.video.Result r0 = new io.intercom.android.sdk.lightcompressor.video.Result
            long r2 = r14.length()
            java.lang.String r4 = r14.getPath()
            r5 = 1
            r6 = 0
            r28 = r0
            r29 = r27
            r30 = r5
            r31 = r6
            r32 = r2
            r34 = r4
            r28.<init>(r29, r30, r31, r32, r34)
            return r0
        L_0x0328:
            r1 = r8
            io.intercom.android.sdk.lightcompressor.video.Result r0 = new io.intercom.android.sdk.lightcompressor.video.Result
            r2 = 24
            r3 = 0
            r4 = 0
            java.lang.String r5 = "Something went wrong, please try again"
            r6 = 0
            r8 = 0
            r28 = r0
            r29 = r27
            r30 = r4
            r31 = r5
            r32 = r6
            r34 = r8
            r35 = r2
            r36 = r3
            r28.<init>(r29, r30, r31, r32, r34, r35, r36)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.lightcompressor.compressor.Compressor.start(int, int, int, java.lang.String, int, java.lang.String, boolean, android.media.MediaExtractor, io.intercom.android.sdk.lightcompressor.CompressionProgressListener, long, int):io.intercom.android.sdk.lightcompressor.video.Result");
    }

    public final Object compressVideo(int i10, Context context, Uri uri, String str, String str2, Configuration configuration, CompressionProgressListener compressionProgressListener, C6658d<? super Result> dVar) {
        return C5572i.g(Z.a(), new Compressor$compressVideo$2(context, uri, i10, configuration, str, str2, compressionProgressListener, (C6658d<? super Compressor$compressVideo$2>) null), dVar);
    }

    public final boolean isRunning() {
        return isRunning;
    }

    public final void setRunning(boolean z10) {
        isRunning = z10;
    }
}
