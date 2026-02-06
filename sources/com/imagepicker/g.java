package com.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.FileInputStream;
import java.io.IOException;

public class g extends d {

    /* renamed from: d  reason: collision with root package name */
    private int f59131d;

    /* renamed from: e  reason: collision with root package name */
    private int f59132e;

    public g(Uri uri, Context context) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        Bitmap b10 = b(uri, context, mediaMetadataRetriever);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(5);
        if (extractMetadata != null) {
            this.f59131d = Math.round(Float.parseFloat(extractMetadata)) / 1000;
        }
        if (extractMetadata2 != null) {
            this.f59132e = Integer.parseInt(extractMetadata2);
        }
        if (extractMetadata3 != null) {
            this.f59110a = a(extractMetadata3.substring(0, extractMetadata3.indexOf(".")).replace("T", MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR), "yyyyMMdd HHmmss");
        }
        if (b10 != null) {
            this.f59112c = b10.getWidth();
            this.f59111b = b10.getHeight();
        }
        try {
            mediaMetadataRetriever.release();
        } catch (IOException e10) {
            Log.e("VideoMetadata", "IO error releasing metadataRetriever", e10);
        }
    }

    private Bitmap b(Uri uri, Context context, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            mediaMetadataRetriever.setDataSource(new FileInputStream(context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor()).getFD());
            return mediaMetadataRetriever.getFrameAtTime();
        } catch (IOException | RuntimeException e10) {
            Log.e("RNIP", "Could not retrieve width and height from video: " + e10.getMessage());
            return null;
        }
    }

    public int c() {
        return this.f59132e;
    }

    public String d() {
        return this.f59110a;
    }

    public int e() {
        return this.f59131d;
    }

    public int f() {
        return this.f59111b;
    }

    public int g() {
        return this.f59112c;
    }
}
