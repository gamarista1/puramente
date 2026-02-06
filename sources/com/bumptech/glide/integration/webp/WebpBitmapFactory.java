package com.bumptech.glide.integration.webp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import androidx.annotation.Keep;
import com.bumptech.glide.integration.webp.c;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Keep
public class WebpBitmapFactory {
    private static final int IN_TEMP_BUFFER_SIZE = 8192;
    private static final int MAX_WEBP_HEADER_SIZE = 21;
    public static boolean sUseSystemDecoder = true;

    static {
        System.loadLibrary("glide-webp");
    }

    @Keep
    private static Bitmap createBitmap(int i10, int i11, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (!(options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable())) {
            Bitmap bitmap2 = options.inBitmap;
            if (bitmap2.getWidth() == i10 && bitmap2.getHeight() == i11 && bitmap2.getConfig() == options.inPreferredConfig) {
                bitmap2.setHasAlpha(true);
                bitmap2.eraseColor(0);
                return bitmap2;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        createBitmap.setHasAlpha(true);
        createBitmap.eraseColor(0);
        return createBitmap;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i10, int i11) {
        return decodeByteArray(bArr, i10, i11, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeFile(String str) {
        return decodeFile(str, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor) {
        return decodeFileDescriptor(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeResource(Resources resources, int i10) {
        return decodeResource(resources, i10, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i10 = typedValue.density;
            if (i10 == 0) {
                options.inDensity = 160;
            } else if (i10 != 65535) {
                options.inDensity = i10;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return decodeStream(inputStream, rect, options);
    }

    public static Bitmap decodeStream(InputStream inputStream) {
        return decodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    private static byte[] getImageHeader(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, MAX_WEBP_HEADER_SIZE);
        }
        inputStream.mark(MAX_WEBP_HEADER_SIZE);
        byte[] bArr = new byte[MAX_WEBP_HEADER_SIZE];
        try {
            inputStream.read(bArr, 0, MAX_WEBP_HEADER_SIZE);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        if (options == null || (bArr = options.inTempStorage) == null) {
            return new byte[IN_TEMP_BUFFER_SIZE];
        }
        return bArr;
    }

    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f10 = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i10 = options.inSampleSize;
        if (i10 > 1) {
            f10 = 1.0f / ((float) i10);
        }
        if (!options.inScaled) {
            return f10;
        }
        int i11 = options.inDensity;
        int i12 = options.inTargetDensity;
        int i13 = options.inScreenDensity;
        if (i11 == 0 || i12 == 0 || i11 == i13) {
            return f10;
        }
        return f10 * (((float) i12) / ((float) i11));
    }

    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options, float f10, byte[] bArr2);

    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f10, byte[] bArr);

    private static void setDefaultPadding(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static void setDensityFromOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i10 = options.inDensity;
            if (i10 != 0) {
                bitmap.setDensity(i10);
                int i11 = options.inTargetDensity;
                if (i11 != 0 && i10 != i11 && i10 != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i11);
                }
            } else if (options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    @Keep
    private static boolean setOutDimensions(BitmapFactory.Options options, int i10, int i11) {
        if (options == null) {
            return false;
        }
        options.outWidth = i10;
        options.outHeight = i11;
        return options.inJustDecodeBounds;
    }

    private static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        setDensityFromOptions(bitmap, options);
        if (options != null) {
            options.outMimeType = ClipboardModule.MIMETYPE_WEBP;
        }
    }

    public static boolean webpSupportRequired(byte[] bArr, int i10, int i11) {
        c.e eVar;
        try {
            eVar = c.d(bArr, i10, i11);
        } catch (IOException unused) {
            eVar = c.e.NONE_WEBP;
        }
        if (sUseSystemDecoder) {
            return false;
        }
        return c.g(eVar);
    }

    private static InputStream wrapToMarkSupportedStream(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            return new BufferedInputStream(inputStream, IN_TEMP_BUFFER_SIZE);
        }
        return inputStream;
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i10, int i11, BitmapFactory.Options options) {
        if ((i10 | i11) < 0 || bArr.length < i10 + i11) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (!webpSupportRequired(bArr, i10, i11)) {
            return BitmapFactory.decodeByteArray(bArr, i10, i11, options);
        } else {
            Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr, i10, i11, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            setWebpBitmapOptions(nativeDecodeByteArray, options);
            return nativeDecodeByteArray;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1 != null) goto L_0x000a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFile(java.lang.String r4, android.graphics.BitmapFactory.Options r5) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0015, all -> 0x0013 }
            android.graphics.Bitmap r0 = decodeStream(r1, r0, r5)     // Catch:{ Exception -> 0x0011 }
        L_0x000a:
            r1.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0030
        L_0x000e:
            r4 = move-exception
            r0 = r1
            goto L_0x0031
        L_0x0011:
            r4 = move-exception
            goto L_0x0017
        L_0x0013:
            r4 = move-exception
            goto L_0x0031
        L_0x0015:
            r4 = move-exception
            r1 = r0
        L_0x0017:
            java.lang.String r5 = "WebpBitmapFactory"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x000e }
            r2.<init>()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Unable to decode stream: "
            r2.append(r3)     // Catch:{ all -> 0x000e }
            r2.append(r4)     // Catch:{ all -> 0x000e }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x000e }
            android.util.Log.e(r5, r4)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x0030
            goto L_0x000a
        L_0x0030:
            return r0
        L_0x0031:
            if (r0 == 0) goto L_0x0036
            r0.close()     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(new FileInputStream(fileDescriptor));
        try {
            if (webpSupportRequired(getImageHeader(wrapToMarkSupportedStream), 0, MAX_WEBP_HEADER_SIZE)) {
                bitmap = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                setWebpBitmapOptions(bitmap, options);
                setDefaultPadding(rect);
            } else {
                bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
            }
            try {
                wrapToMarkSupportedStream.close();
            } catch (Throwable unused) {
            }
            return bitmap;
        } catch (Throwable unused2) {
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        if (r3 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r3 != null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.close();
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC, Splitter:B:14:0x001d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources r2, int r3, android.graphics.BitmapFactory.Options r4) {
        /*
            r0 = 0
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            r1.<init>()     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            java.io.InputStream r3 = r2.openRawResource(r3, r1)     // Catch:{ Exception -> 0x0019, all -> 0x0017 }
            android.graphics.Bitmap r0 = decodeResourceStream(r2, r1, r3, r0, r4)     // Catch:{ Exception -> 0x0021, all -> 0x0014 }
            if (r3 == 0) goto L_0x0024
        L_0x0010:
            r3.close()     // Catch:{ IOException -> 0x0024 }
            goto L_0x0024
        L_0x0014:
            r2 = move-exception
            r0 = r3
            goto L_0x001b
        L_0x0017:
            r2 = move-exception
            goto L_0x001b
        L_0x0019:
            r3 = r0
            goto L_0x0021
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            throw r2
        L_0x0021:
            if (r3 == 0) goto L_0x0024
            goto L_0x0010
        L_0x0024:
            if (r0 != 0) goto L_0x0035
            if (r4 == 0) goto L_0x0035
            android.graphics.Bitmap r2 = r4.inBitmap
            if (r2 != 0) goto L_0x002d
            goto L_0x0035
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Problem decoding into existing bitmap"
            r2.<init>(r3)
            throw r2
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (inputStream == null) {
            return null;
        }
        InputStream wrapToMarkSupportedStream = wrapToMarkSupportedStream(inputStream);
        if (!webpSupportRequired(getImageHeader(wrapToMarkSupportedStream), 0, MAX_WEBP_HEADER_SIZE)) {
            return BitmapFactory.decodeStream(wrapToMarkSupportedStream, rect, options);
        }
        Bitmap nativeDecodeStream = nativeDecodeStream(wrapToMarkSupportedStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeStream, options);
        setDefaultPadding(rect);
        return nativeDecodeStream;
    }
}
