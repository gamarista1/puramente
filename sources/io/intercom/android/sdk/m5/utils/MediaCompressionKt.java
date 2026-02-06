package io.intercom.android.sdk.m5.utils;

import android.content.Context;
import android.net.Uri;
import io.intercom.android.sdk.lightcompressor.VideoCompressor;
import io.intercom.android.sdk.lightcompressor.VideoQuality;
import io.intercom.android.sdk.lightcompressor.config.AppSpecificStorageConfiguration;
import io.intercom.android.sdk.lightcompressor.config.Configuration;
import io.intercom.android.sdk.lightcompressor.config.SharedStorageConfiguration;
import io.intercom.android.sdk.logger.LumberMill;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import qf.C6658d;
import qf.i;
import rf.C6680b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H@¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a \u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00038\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\u00038\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroid/net/Uri;", "Landroid/content/Context;", "context", "", "videoName", "Lkotlin/Pair;", "", "getCompressedVideoData", "(Landroid/net/Uri;Landroid/content/Context;Ljava/lang/String;Lqf/d;)Ljava/lang/Object;", "imageName", "Lio/intercom/android/sdk/m5/utils/CompressedImageData;", "getCompressedImageData", "(Landroid/net/Uri;Landroid/content/Context;Ljava/lang/String;)Lio/intercom/android/sdk/m5/utils/CompressedImageData;", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "uncompressedMediaData", "getCompressedMediaData", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Landroid/content/Context;Lqf/d;)Ljava/lang/Object;", "uri", "Llf/M;", "deleteCompressedMedia", "(Landroid/net/Uri;)V", "compressedVideosFolderName", "Ljava/lang/String;", "compressedImagesFolderName", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaCompressionKt {
    private static final String compressedImagesFolderName = "compressed_images";
    private static final String compressedVideosFolderName = "compressed_videos";

    public static final void deleteCompressedMedia(Uri uri) {
        C6496s.h(uri, "uri");
        if (uri.getPathSegments().contains(compressedVideosFolderName) || uri.getPathSegments().contains(compressedImagesFolderName)) {
            new File(uri.toString()).delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final io.intercom.android.sdk.m5.utils.CompressedImageData getCompressedImageData(android.net.Uri r9, android.content.Context r10, java.lang.String r11) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            android.content.ContentResolver r1 = r10.getContentResolver()
            java.io.InputStream r1 = r1.openInputStream(r9)
            r2 = 0
            android.graphics.BitmapFactory.decodeStream(r1, r2, r0)
            if (r1 == 0) goto L_0x0019
            r1.close()
        L_0x0019:
            r1 = 612(0x264, float:8.58E-43)
            r3 = 816(0x330, float:1.143E-42)
            int r1 = io.intercom.android.sdk.utilities.BitmapUtilsKt.calculateInSampleSize(r0, r1, r3)
            r0.inSampleSize = r1
            r1 = 0
            r0.inJustDecodeBounds = r1
            android.content.ContentResolver r1 = r10.getContentResolver()
            java.io.InputStream r1 = r1.openInputStream(r9)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r2, r0)
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            if (r0 == 0) goto L_0x009b
            android.graphics.Bitmap r9 = io.intercom.android.sdk.utilities.BitmapUtilsKt.determineBitmapRotation(r10, r9, r0)
            java.io.File r0 = new java.io.File
            java.io.File r10 = r10.getCacheDir()
            java.lang.String r1 = "compressed_images"
            r0.<init>(r10, r1)
            r0.mkdirs()
            java.io.File r10 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r11 = ".jpg"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.<init>(r0, r11)
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ all -> 0x008f }
            r11.<init>(r10)     // Catch:{ all -> 0x008f }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x008c }
            r1 = 80
            r9.compress(r0, r1, r11)     // Catch:{ all -> 0x008c }
            android.net.Uri r4 = android.net.Uri.fromFile(r10)     // Catch:{ all -> 0x008c }
            r11.flush()
            r11.close()
            if (r4 == 0) goto L_0x009b
            io.intercom.android.sdk.m5.utils.CompressedImageData r2 = new io.intercom.android.sdk.m5.utils.CompressedImageData
            int r5 = r9.getWidth()
            int r6 = r9.getHeight()
            long r7 = r10.length()
            r3 = r2
            r3.<init>(r4, r5, r6, r7)
            goto L_0x009b
        L_0x008c:
            r9 = move-exception
            r2 = r11
            goto L_0x0090
        L_0x008f:
            r9 = move-exception
        L_0x0090:
            if (r2 == 0) goto L_0x0095
            r2.flush()
        L_0x0095:
            if (r2 == 0) goto L_0x009a
            r2.close()
        L_0x009a:
            throw r9
        L_0x009b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.utils.MediaCompressionKt.getCompressedImageData(android.net.Uri, android.content.Context, java.lang.String):io.intercom.android.sdk.m5.utils.CompressedImageData");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094 A[Catch:{ all -> 0x00df }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object getCompressedMediaData(io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media r24, android.content.Context r25, qf.C6658d<? super io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media> r26) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1
            if (r3 == 0) goto L_0x0019
            r3 = r2
            io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1 r3 = (io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1 r3 = new io.intercom.android.sdk.m5.utils.MediaCompressionKt$getCompressedMediaData$1
            r3.<init>(r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = rf.C6680b.f()
            int r5 = r3.label
            r6 = 1
            if (r5 == 0) goto L_0x004d
            if (r5 != r6) goto L_0x0045
            java.lang.Object r0 = r3.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r3.L$1
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r3 = r3.L$0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media r3 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media) r3
            lf.w.b(r2)     // Catch:{ all -> 0x0042 }
            r23 = r1
            r1 = r0
            r0 = r3
            r3 = r2
            r2 = r23
            goto L_0x008a
        L_0x0042:
            r0 = r3
            goto L_0x00df
        L_0x0045:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004d:
            lf.w.b(r2)
            boolean r2 = r0 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video
            java.lang.String r5 = "."
            if (r2 == 0) goto L_0x00e2
            r2 = r0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r2 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r2     // Catch:{ all -> 0x00df }
            java.lang.String r7 = r2.getFileName()     // Catch:{ all -> 0x00df }
            java.lang.String[] r8 = new java.lang.String[]{r5}     // Catch:{ all -> 0x00df }
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            java.util.List r2 = Sg.p.F0(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00df }
            java.lang.Object r2 = mf.C6565s.o0(r2)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00df }
            r5 = r0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r5 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r5     // Catch:{ all -> 0x00df }
            android.net.Uri r5 = r5.getUri()     // Catch:{ all -> 0x00df }
            r3.L$0 = r0     // Catch:{ all -> 0x00df }
            r3.L$1 = r1     // Catch:{ all -> 0x00df }
            r3.L$2 = r2     // Catch:{ all -> 0x00df }
            r3.label = r6     // Catch:{ all -> 0x00df }
            java.lang.Object r3 = getCompressedVideoData(r5, r1, r2, r3)     // Catch:{ all -> 0x00df }
            if (r3 != r4) goto L_0x0085
            return r4
        L_0x0085:
            r23 = r2
            r2 = r1
            r1 = r23
        L_0x008a:
            kotlin.Pair r3 = (kotlin.Pair) r3     // Catch:{ all -> 0x00df }
            java.lang.Object r4 = r3.c()     // Catch:{ all -> 0x00df }
            android.net.Uri r4 = (android.net.Uri) r4     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x00da
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            r5.<init>()     // Catch:{ all -> 0x00df }
            r5.append(r1)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = ".mp4"
            r5.append(r1)     // Catch:{ all -> 0x00df }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00df }
            java.lang.String r6 = "video/mp4"
            java.lang.Object r1 = r3.d()     // Catch:{ all -> 0x00df }
            java.lang.Number r1 = (java.lang.Number) r1     // Catch:{ all -> 0x00df }
            long r7 = r1.longValue()     // Catch:{ all -> 0x00df }
            r9 = 0
            r1 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r7 = r9
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r10 = io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt.getVideoData(r1, r2, r3, r4, r5, r7)     // Catch:{ all -> 0x00df }
            if (r10 == 0) goto L_0x00da
            r1 = r0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r1     // Catch:{ all -> 0x00df }
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r20 = r1.getThumbnail()     // Catch:{ all -> 0x00df }
            r21 = 127(0x7f, float:1.78E-43)
            r22 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r1 = io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video.copy$default(r10, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22)     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r1 = r0
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r1 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r1     // Catch:{ all -> 0x00df }
        L_0x00dd:
            r0 = r1
            goto L_0x0136
        L_0x00df:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Video r0 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Video) r0
            goto L_0x0136
        L_0x00e2:
            boolean r2 = r0 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image
            if (r2 == 0) goto L_0x0132
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r0 = (io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image) r0
            java.lang.String r6 = r0.getFileName()
            java.lang.String[] r7 = new java.lang.String[]{r5}
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            java.util.List r2 = Sg.p.F0(r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = mf.C6565s.o0(r2)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r3 = r0.getUri()
            io.intercom.android.sdk.m5.utils.CompressedImageData r1 = getCompressedImageData(r3, r1, r2)
            if (r1 == 0) goto L_0x0136
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ".jpg"
            r0.append(r2)
            java.lang.String r9 = r0.toString()
            int r5 = r1.getWidth()
            int r6 = r1.getHeight()
            long r7 = r1.getSize()
            android.net.Uri r10 = r1.getUri()
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r0 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image
            java.lang.String r4 = "image/jpg"
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9, r10)
            goto L_0x0136
        L_0x0132:
            boolean r1 = r0 instanceof io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Other
            if (r1 == 0) goto L_0x0137
        L_0x0136:
            return r0
        L_0x0137:
            lf.s r0 = new lf.s
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.utils.MediaCompressionKt.getCompressedMediaData(io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media, android.content.Context, qf.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object getCompressedVideoData(Uri uri, Context context, String str, C6658d<? super Pair<? extends Uri, Long>> dVar) {
        i iVar = new i(C6680b.c(dVar));
        Context context2 = context;
        VideoCompressor.start$default(context2, C6565s.e(uri), false, (SharedStorageConfiguration) null, new AppSpecificStorageConfiguration(compressedVideosFolderName), new Configuration(VideoQuality.LOW, false, (Integer) null, false, false, (Double) null, (Double) null, C6565s.e(str), 126, (DefaultConstructorMarker) null), new MediaCompressionKt$getCompressedVideoData$2$1(LumberMill.getLogger(), iVar), 8, (Object) null);
        Object b10 = iVar.b();
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }
}
