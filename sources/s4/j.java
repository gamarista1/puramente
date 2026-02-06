package S4;

import T4.h;
import T4.i;
import V4.v;
import W4.b;
import W4.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import c5.C3176g;
import c5.F;
import c5.o;
import c5.s;
import com.bumptech.glide.integration.webp.c;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import o5.g;
import o5.k;
import o5.l;

public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final h f33875e = h.f("com.bumptech.glide.integration.webp.decoder.WebpDownsampler.DisableDecoder", Boolean.FALSE);

    /* renamed from: f  reason: collision with root package name */
    public static final h f33876f = h.f("com.bumptech.glide.integration.webp.decoder.WebpDownsampler.SystemDecoder", Boolean.TRUE);

    /* renamed from: g  reason: collision with root package name */
    private static final s.b f33877g = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final Queue f33878h = l.g(0);

    /* renamed from: a  reason: collision with root package name */
    private final d f33879a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f33880b;

    /* renamed from: c  reason: collision with root package name */
    private final b f33881c;

    /* renamed from: d  reason: collision with root package name */
    private final List f33882d;

    public j(List list, DisplayMetrics displayMetrics, d dVar, b bVar) {
        this.f33882d = list;
        this.f33880b = (DisplayMetrics) k.d(displayMetrics);
        this.f33879a = (d) k.d(dVar);
        this.f33881c = (b) k.d(bVar);
    }

    private static int a(double d10) {
        int s10 = s(1.0E9d * d10);
        return s((d10 / ((double) (((float) s10) / 1.0E9f))) * ((double) s10));
    }

    private void b(InputStream inputStream, T4.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12;
        Bitmap.Config config;
        if (bVar != T4.b.PREFER_ARGB_8888) {
            try {
                z12 = com.bumptech.glide.load.a.f(this.f33882d, inputStream, this.f33881c).hasAlpha();
            } catch (IOException e10) {
                if (Log.isLoggable("WebpDownsampler", 3)) {
                    Log.d("WebpDownsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                }
                z12 = false;
            }
            if (z12) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ALPHA_8) {
                options.inDither = true;
                return;
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    static void c(ImageHeaderParser.ImageType imageType, InputStream inputStream, s.b bVar, d dVar, o oVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        float f10;
        int i15;
        int i16;
        int i17;
        ImageHeaderParser.ImageType imageType2 = imageType;
        o oVar2 = oVar;
        int i18 = i10;
        int i19 = i11;
        int i20 = i12;
        int i21 = i13;
        int i22 = i14;
        BitmapFactory.Options options2 = options;
        if (i19 > 0 && i20 > 0) {
            if (i18 == 90 || i18 == 270) {
                f10 = oVar2.b(i20, i19, i21, i22);
            } else {
                f10 = oVar2.b(i19, i20, i21, i22);
            }
            if (f10 > 0.0f) {
                o.g a10 = oVar2.a(i19, i20, i21, i22);
                if (a10 != null) {
                    float f11 = (float) i19;
                    float f12 = (float) i20;
                    int s10 = i19 / s((double) (f10 * f11));
                    int s11 = i20 / s((double) (f10 * f12));
                    o.g gVar = o.g.MEMORY;
                    if (a10 == gVar) {
                        i15 = Math.max(s10, s11);
                    } else {
                        i15 = Math.min(s10, s11);
                    }
                    int max = Math.max(1, Integer.highestOneBit(i15));
                    if (a10 == gVar && ((float) max) < 1.0f / f10) {
                        max <<= 1;
                    }
                    options2.inSampleSize = max;
                    if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(max, 8);
                        i16 = (int) Math.ceil((double) (f11 / min));
                        i17 = (int) Math.ceil((double) (f12 / min));
                        int i23 = max / 8;
                        if (i23 > 0) {
                            i16 /= i23;
                            i17 /= i23;
                        }
                    } else if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f13 = (float) max;
                        i16 = (int) Math.floor((double) (f11 / f13));
                        i17 = (int) Math.floor((double) (f12 / f13));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        float f14 = (float) max;
                        i16 = Math.round(f11 / f14);
                        i17 = Math.round(f12 / f14);
                    } else if (i19 % max == 0 && i20 % max == 0) {
                        i16 = i19 / max;
                        i17 = i20 / max;
                    } else {
                        int[] j10 = j(inputStream, options2, bVar, dVar);
                        i16 = j10[0];
                        i17 = j10[1];
                    }
                    double b10 = (double) oVar2.b(i16, i17, i21, i22);
                    options2.inTargetDensity = a(b10);
                    options2.inDensity = 1000000000;
                    if (n(options)) {
                        options2.inScaled = true;
                    } else {
                        options2.inTargetDensity = 0;
                        options2.inDensity = 0;
                    }
                    if (Log.isLoggable("WebpDownsampler", 2)) {
                        Log.v("WebpDownsampler", "Calculate scaling, source: [" + i19 + "x" + i20 + "], target: [" + i21 + "x" + i22 + "], power of two scaled: [" + i16 + "x" + i17 + "], exact scale factor: " + f10 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b10 + ", target density: " + options2.inTargetDensity + ", density: " + options2.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + f10 + " from: " + oVar2 + ", source: [" + i19 + "x" + i20 + "], target: [" + i21 + "x" + i22 + "]");
        }
    }

    private Bitmap f(InputStream inputStream, BitmapFactory.Options options, o oVar, T4.b bVar, boolean z10, int i10, int i11, boolean z11, s.b bVar2) {
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f10;
        InputStream inputStream2 = inputStream;
        BitmapFactory.Options options2 = options;
        s.b bVar3 = bVar2;
        long b10 = g.b();
        int[] j10 = j(inputStream2, options2, bVar3, this.f33879a);
        int i17 = j10[0];
        int i18 = j10[1];
        String str = options2.outMimeType;
        if (i17 == -1 || i18 == -1) {
            z12 = false;
        } else {
            z12 = z10;
        }
        int b11 = com.bumptech.glide.load.a.b(this.f33882d, inputStream2, this.f33881c);
        int j11 = F.j(b11);
        boolean m10 = F.m(b11);
        int i19 = i10;
        int i20 = i11;
        if (i19 == Integer.MIN_VALUE) {
            i12 = i17;
        } else {
            i12 = i19;
        }
        if (i20 == Integer.MIN_VALUE) {
            i13 = i18;
        } else {
            i13 = i20;
        }
        ImageHeaderParser.ImageType f11 = com.bumptech.glide.load.a.f(this.f33882d, inputStream2, this.f33881c);
        c(f11, inputStream, bVar2, this.f33879a, oVar, j11, i17, i18, i12, i13, options);
        String str2 = str;
        int i21 = i18;
        int i22 = i17;
        s.b bVar4 = bVar3;
        BitmapFactory.Options options3 = options2;
        int i23 = b11;
        InputStream inputStream3 = inputStream2;
        b(inputStream, bVar, z12, m10, options, i12, i13);
        if (u(f11)) {
            if (z11) {
                i16 = i12;
                i15 = i13;
            } else {
                if (n(options)) {
                    f10 = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                } else {
                    f10 = 1.0f;
                }
                int i24 = options3.inSampleSize;
                float f12 = (float) i24;
                i16 = Math.round(((float) ((int) Math.ceil((double) (((float) i22) / f12)))) * f10);
                i15 = Math.round(((float) ((int) Math.ceil((double) (((float) i21) / f12)))) * f10);
                if (Log.isLoggable("WebpDownsampler", 2)) {
                    Log.v("WebpDownsampler", "Calculated target [" + i16 + "x" + i15 + "] for source [" + i22 + "x" + i21 + "], sampleSize: " + i24 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f10);
                }
            }
            if (i16 > 0 && i15 > 0) {
                t(options3, this.f33879a, i16, i15);
            }
        }
        Bitmap g10 = g(inputStream3, options3, bVar4, this.f33879a);
        bVar4.b(this.f33879a, g10);
        if (Log.isLoggable("WebpDownsampler", 2)) {
            i14 = i23;
            o(i22, i21, str2, options, g10, i10, i11, b10);
        } else {
            i14 = i23;
        }
        if (g10 == null) {
            return null;
        }
        g10.setDensity(this.f33880b.densityDpi);
        Bitmap n10 = F.n(this.f33879a, g10, i14);
        if (g10.equals(n10)) {
            return n10;
        }
        this.f33879a.c(g10);
        return n10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap g(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, c5.s.b r8, W4.d r9) {
        /*
            java.lang.String r0 = "WebpDownsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto L_0x000c
            r1 = 10485760(0xa00000, float:1.469368E-38)
            r6.mark(r1)
            goto L_0x000f
        L_0x000c:
            r8.a()
        L_0x000f:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = c5.F.i()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = com.bumptech.glide.integration.webp.WebpBitmapFactory.decodeStream(r6, r4, r7)     // Catch:{ IllegalArgumentException -> 0x0032 }
            java.util.concurrent.locks.Lock r9 = c5.F.i()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L_0x002f
            r6.reset()
        L_0x002f:
            return r8
        L_0x0030:
            r6 = move-exception
            goto L_0x005f
        L_0x0032:
            r5 = move-exception
            java.io.IOException r1 = p(r5, r1, r2, r3, r7)     // Catch:{ all -> 0x0030 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0043:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x005e
            r6.reset()     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch:{ IOException -> 0x005d }
            r9.c(r0)     // Catch:{ IOException -> 0x005d }
            r7.inBitmap = r4     // Catch:{ IOException -> 0x005d }
            android.graphics.Bitmap r6 = g(r6, r7, r8, r9)     // Catch:{ IOException -> 0x005d }
            java.util.concurrent.locks.Lock r7 = c5.F.i()
            r7.unlock()
            return r6
        L_0x005d:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005e:
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x005f:
            java.util.concurrent.locks.Lock r7 = c5.F.i()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.j.g(java.io.InputStream, android.graphics.BitmapFactory$Options, c5.s$b, W4.d):android.graphics.Bitmap");
    }

    private static String h(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options i() {
        BitmapFactory.Options options;
        synchronized (j.class) {
            Queue queue = f33878h;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                r(options);
            }
        }
        return options;
    }

    private static int[] j(InputStream inputStream, BitmapFactory.Options options, s.b bVar, d dVar) {
        options.inJustDecodeBounds = true;
        g(inputStream, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String k(BitmapFactory.Options options) {
        return h(options.inBitmap);
    }

    private static boolean n(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        if (i11 <= 0 || (i10 = options.inDensity) <= 0 || i11 == i10) {
            return false;
        }
        return true;
    }

    private static void o(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("WebpDownsampler", "Decoded " + h(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + k(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + g.a(j10));
    }

    private static IOException p(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + k(options), illegalArgumentException);
    }

    private static void q(BitmapFactory.Options options) {
        r(options);
        Queue queue = f33878h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void r(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int s(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void t(BitmapFactory.Options options, d dVar, int i10, int i11) {
        if (Build.VERSION.SDK_INT < 26 || options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            options.inBitmap = dVar.e(i10, i11, options.inPreferredConfig);
        }
    }

    private boolean u(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public v d(InputStream inputStream, int i10, int i11, i iVar) {
        return e(inputStream, i10, i11, iVar, f33877g);
    }

    public v e(InputStream inputStream, int i10, int i11, i iVar, s.b bVar) {
        boolean z10;
        i iVar2 = iVar;
        k.a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        Class<byte[]> cls = byte[].class;
        byte[] bArr = (byte[]) this.f33881c.d(65536, cls);
        BitmapFactory.Options i12 = i();
        i12.inTempStorage = bArr;
        T4.b bVar2 = (T4.b) iVar2.c(s.f36483f);
        o oVar = (o) iVar2.c(s.f36485h);
        boolean booleanValue = ((Boolean) iVar2.c(s.f36486i)).booleanValue();
        h hVar = s.f36487j;
        if (iVar2.c(hVar) == null || !((Boolean) iVar2.c(hVar)).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        try {
            return C3176g.c(f(inputStream, i12, oVar, bVar2, z10, i10, i11, booleanValue, bVar), this.f33879a);
        } finally {
            q(i12);
            this.f33881c.f(bArr, cls);
        }
    }

    public boolean l(InputStream inputStream, i iVar) {
        if (((Boolean) iVar.c(f33875e)).booleanValue()) {
            return false;
        }
        if (!((Boolean) iVar.c(f33876f)).booleanValue()) {
            return c.g(c.b(inputStream, this.f33881c));
        }
        if (c.f39075a) {
            return false;
        }
        c.e b10 = c.b(inputStream, this.f33881c);
        if (!c.g(b10) || b10 == c.e.WEBP_SIMPLE) {
            return false;
        }
        return true;
    }

    public boolean m(ByteBuffer byteBuffer, i iVar) {
        if (((Boolean) iVar.c(f33875e)).booleanValue()) {
            return false;
        }
        if (!((Boolean) iVar.c(f33876f)).booleanValue()) {
            return c.g(c.c(byteBuffer));
        }
        if (c.f39075a) {
            return false;
        }
        c.e c10 = c.c(byteBuffer);
        if (!c.g(c10) || c10 == c.e.WEBP_SIMPLE) {
            return false;
        }
        return true;
    }

    static class a implements s.b {
        a() {
        }

        public void a() {
        }

        public void b(d dVar, Bitmap bitmap) {
        }
    }
}
