package io.intercom.android.sdk.m5.conversation.utils;

import Sg.p;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.core.content.d;
import com.reactnativecommunity.clipboard.ClipboardModule;
import io.intercom.android.sdk.IntercomFileProviderKt;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.carousel.AppearanceType;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import wf.C6763c;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a,\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a4\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0012"}, d2 = {"getMediaData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "generateThumbnailForVideo", "", "getImageData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Image;", "contentResolver", "Landroid/content/ContentResolver;", "fileName", "", "mimeType", "size", "", "getVideoData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media$Video;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class URIExtensionsKt {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        wf.C6763c.a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        throw r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData.Media.Image getImageData(android.net.Uri r8, android.content.ContentResolver r9, java.lang.String r10, java.lang.String r11, long r12) {
        /*
            java.io.InputStream r9 = r9.openInputStream(r8)
            r0 = 0
            if (r9 == 0) goto L_0x0045
            R1.a r1 = new R1.a     // Catch:{ all -> 0x003e }
            r1.<init>((java.io.InputStream) r9)     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "ImageLength"
            r3 = 480(0x1e0, float:6.73E-43)
            int r2 = r1.i(r2, r3)     // Catch:{ all -> 0x003e }
            java.lang.String r3 = "ImageWidth"
            r4 = 640(0x280, float:8.97E-43)
            int r3 = r1.i(r3, r4)     // Catch:{ all -> 0x003e }
            java.lang.String r4 = "Orientation"
            r5 = 1
            int r1 = r1.i(r4, r5)     // Catch:{ all -> 0x003e }
            r4 = 6
            if (r1 == r4) goto L_0x002a
            r4 = 8
            if (r1 != r4) goto L_0x002b
        L_0x002a:
            r0 = r5
        L_0x002b:
            if (r0 == 0) goto L_0x002f
            r1 = r3
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            if (r0 == 0) goto L_0x0034
            r0 = r2
            goto L_0x0035
        L_0x0034:
            r0 = r3
        L_0x0035:
            lf.M r2 = lf.C6514M.f71813a     // Catch:{ all -> 0x003e }
            r2 = 0
            wf.C6763c.a(r9, r2)
            r2 = r0
            r3 = r1
            goto L_0x0047
        L_0x003e:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r10 = move-exception
            wf.C6763c.a(r9, r8)
            throw r10
        L_0x0045:
            r2 = r0
            r3 = r2
        L_0x0047:
            io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image r9 = new io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image
            r0 = r9
            r1 = r11
            r4 = r12
            r6 = r10
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.utils.URIExtensionsKt.getImageData(android.net.Uri, android.content.ContentResolver, java.lang.String, java.lang.String, long):io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData$Media$Image");
    }

    public static final MediaData.Media getMediaData(Uri uri, Context context, boolean z10) {
        Throwable th2;
        String str;
        MediaData.Media media;
        Uri uri2 = uri;
        C6496s.h(uri, "<this>");
        Context context2 = context;
        C6496s.h(context, "context");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return null;
        }
        try {
            query.moveToFirst();
            String string = query.getString(query.getColumnIndexOrThrow("_display_name"));
            if (query.getColumnIndex("mime_type") != -1) {
                str = query.getString(query.getColumnIndexOrThrow("mime_type"));
            } else {
                C6496s.e(string);
                if (p.O(string, ".jpg", false, 2, (Object) null)) {
                    str = ClipboardModule.MIMETYPE_JPG;
                } else if (p.O(string, ".mp4", false, 2, (Object) null)) {
                    str = "video/mp4";
                } else {
                    str = "";
                }
            }
            long j10 = query.getLong(query.getColumnIndexOrThrow("_size"));
            C6496s.e(str);
            if (p.O(str, "video", false, 2, (Object) null)) {
                C6496s.e(string);
                media = getVideoData(uri, context, string, str, j10, z10);
            } else if (p.O(str, AppearanceType.IMAGE, false, 2, (Object) null)) {
                C6496s.e(contentResolver);
                C6496s.e(string);
                media = getImageData(uri, contentResolver, string, str, j10);
            } else {
                C6496s.e(string);
                media = new MediaData.Media.Other(str, j10, string, uri);
            }
            C6763c.a(query, (Throwable) null);
            return media;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C6763c.a(query, th2);
            throw th4;
        }
    }

    public static /* synthetic */ MediaData.Media getMediaData$default(Uri uri, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return getMediaData(uri, context, z10);
    }

    public static final MediaData.Media.Video getVideoData(Uri uri, Context context, String str, String str2, long j10, boolean z10) {
        long j11;
        int i10;
        MediaData.Media.Image image;
        Pair pair;
        Integer m10;
        Integer m11;
        Long o10;
        Uri uri2 = uri;
        Context context2 = context;
        String str3 = str;
        C6496s.h(uri2, "<this>");
        C6496s.h(context2, "context");
        C6496s.h(str3, "fileName");
        C6496s.h(str2, "mimeType");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context2, uri2);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        if (extractMetadata == null || (o10 = p.o(extractMetadata)) == null) {
            j11 = 0;
        } else {
            j11 = o10.longValue();
        }
        long j12 = j11;
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
        int i11 = 0;
        if (extractMetadata2 == null || (m11 = p.m(extractMetadata2)) == null) {
            i10 = 0;
        } else {
            i10 = m11.intValue();
        }
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
        if (!(extractMetadata3 == null || (m10 = p.m(extractMetadata3)) == null)) {
            i11 = m10.intValue();
        }
        if (z10) {
            String str4 = "thumbnail_" + p.a1(str3, ".", (String) null, 2, (Object) null) + ".jpg";
            if (i11 > i10) {
                pair = C6502A.a(320, 240);
            } else {
                pair = C6502A.a(240, 320);
            }
            String str5 = str4;
            Bitmap a10 = mediaMetadataRetriever.getScaledFrameAtTime(0, 2, Math.max(i10 / 2, ((Number) pair.b()).intValue()), Math.max(i11 / 2, ((Number) pair.a()).intValue()));
            if (a10 != null) {
                File file = new File(context.getExternalCacheDir(), "images");
                file.mkdir();
                File file2 = new File(file, str5);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                a10.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri uriForFile = d.getUriForFile(context2, IntercomFileProviderKt.fileProviderAuthority(context), file2);
                C6496s.e(uriForFile);
                image = new MediaData.Media.Image(ClipboardModule.MIMETYPE_JPG, a10.getWidth(), a10.getHeight(), file2.length(), str5, uriForFile);
                mediaMetadataRetriever.release();
                return new MediaData.Media.Video(str2, i10, i11, j10, str, uri, j12, image);
            }
        }
        image = null;
        mediaMetadataRetriever.release();
        return new MediaData.Media.Video(str2, i10, i11, j10, str, uri, j12, image);
    }
}
