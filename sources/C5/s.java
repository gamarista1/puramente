package c5;

import T4.h;
import T4.i;
import T4.j;
import V4.v;
import W4.d;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import c5.o;
import c5.y;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import o5.g;
import o5.k;
import o5.l;

public final class s {

    /* renamed from: f  reason: collision with root package name */
    public static final h f36483f = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", T4.b.f34151c);

    /* renamed from: g  reason: collision with root package name */
    public static final h f36484g = h.e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: h  reason: collision with root package name */
    public static final h f36485h = o.f36478h;

    /* renamed from: i  reason: collision with root package name */
    public static final h f36486i;

    /* renamed from: j  reason: collision with root package name */
    public static final h f36487j;

    /* renamed from: k  reason: collision with root package name */
    private static final Set f36488k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l  reason: collision with root package name */
    private static final b f36489l = new a();

    /* renamed from: m  reason: collision with root package name */
    private static final Set f36490m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n  reason: collision with root package name */
    private static final Queue f36491n = l.g(0);

    /* renamed from: a  reason: collision with root package name */
    private final d f36492a;

    /* renamed from: b  reason: collision with root package name */
    private final DisplayMetrics f36493b;

    /* renamed from: c  reason: collision with root package name */
    private final W4.b f36494c;

    /* renamed from: d  reason: collision with root package name */
    private final List f36495d;

    /* renamed from: e  reason: collision with root package name */
    private final x f36496e = x.b();

    public interface b {
        void a();

        void b(d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f36486i = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f36487j = h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public s(List list, DisplayMetrics displayMetrics, d dVar, W4.b bVar) {
        this.f36495d = list;
        this.f36493b = (DisplayMetrics) k.d(displayMetrics);
        this.f36492a = (d) k.d(dVar);
        this.f36494c = (W4.b) k.d(bVar);
    }

    private static int a(double d10) {
        int l10 = l(d10);
        int x10 = x(((double) l10) * d10);
        return x((d10 / ((double) (((float) x10) / ((float) l10)))) * ((double) x10));
    }

    private void b(y yVar, T4.b bVar, boolean z10, boolean z11, BitmapFactory.Options options, int i10, int i11) {
        boolean z12;
        Bitmap.Config config;
        if (!this.f36496e.g(i10, i11, options, z10, z11)) {
            if (bVar != T4.b.PREFER_ARGB_8888) {
                try {
                    z12 = yVar.d().hasAlpha();
                } catch (IOException e10) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e10);
                    }
                    z12 = false;
                }
                if (z12) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, y yVar, b bVar, d dVar, o oVar, int i10, int i11, int i12, int i13, int i14, BitmapFactory.Options options) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ImageHeaderParser.ImageType imageType2 = imageType;
        o oVar2 = oVar;
        int i20 = i11;
        int i21 = i12;
        int i22 = i13;
        int i23 = i14;
        BitmapFactory.Options options2 = options;
        if (i20 > 0 && i21 > 0) {
            if (r(i10)) {
                i15 = i20;
                i16 = i21;
            } else {
                i16 = i20;
                i15 = i21;
            }
            float b10 = oVar2.b(i16, i15, i22, i23);
            if (b10 > 0.0f) {
                o.g a10 = oVar2.a(i16, i15, i22, i23);
                if (a10 != null) {
                    float f10 = (float) i16;
                    float f11 = (float) i15;
                    int x10 = i16 / x((double) (b10 * f10));
                    int x11 = i15 / x((double) (b10 * f11));
                    o.g gVar = o.g.MEMORY;
                    if (a10 == gVar) {
                        i17 = Math.max(x10, x11);
                    } else {
                        i17 = Math.min(x10, x11);
                    }
                    int max = Math.max(1, Integer.highestOneBit(i17));
                    if (a10 == gVar && ((float) max) < 1.0f / b10) {
                        max <<= 1;
                    }
                    options2.inSampleSize = max;
                    if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(max, 8);
                        i18 = (int) Math.ceil((double) (f10 / min));
                        i19 = (int) Math.ceil((double) (f11 / min));
                        int i24 = max / 8;
                        if (i24 > 0) {
                            i18 /= i24;
                            i19 /= i24;
                        }
                    } else if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f12 = (float) max;
                        i18 = (int) Math.floor((double) (f10 / f12));
                        i19 = (int) Math.floor((double) (f11 / f12));
                    } else if (imageType.isWebp()) {
                        float f13 = (float) max;
                        i18 = Math.round(f10 / f13);
                        i19 = Math.round(f11 / f13);
                    } else if (i16 % max == 0 && i15 % max == 0) {
                        i18 = i16 / max;
                        i19 = i15 / max;
                    } else {
                        int[] m10 = m(yVar, options2, bVar, dVar);
                        i18 = m10[0];
                        i19 = m10[1];
                    }
                    double b11 = (double) oVar2.b(i18, i19, i22, i23);
                    options2.inTargetDensity = a(b11);
                    options2.inDensity = l(b11);
                    if (s(options)) {
                        options2.inScaled = true;
                    } else {
                        options2.inTargetDensity = 0;
                        options2.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i11 + "x" + i12 + "], degreesToRotate: " + i10 + ", target: [" + i22 + "x" + i23 + "], power of two scaled: [" + i18 + "x" + i19 + "], exact scale factor: " + b10 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b11 + ", target density: " + options2.inTargetDensity + ", density: " + options2.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i25 = i21;
            int i26 = i20;
            throw new IllegalArgumentException("Cannot scale with factor: " + b10 + " from: " + oVar2 + ", source: [" + i26 + "x" + i25 + "], target: [" + i22 + "x" + i23 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType2 + " with target [" + i22 + "x" + i23 + "]");
        }
    }

    private v e(y yVar, int i10, int i11, i iVar, b bVar) {
        boolean z10;
        i iVar2 = iVar;
        byte[] bArr = (byte[]) this.f36494c.d(65536, byte[].class);
        BitmapFactory.Options k10 = k();
        k10.inTempStorage = bArr;
        T4.b bVar2 = (T4.b) iVar2.c(f36483f);
        j jVar = (j) iVar2.c(f36484g);
        o oVar = (o) iVar2.c(o.f36478h);
        boolean booleanValue = ((Boolean) iVar2.c(f36486i)).booleanValue();
        h hVar = f36487j;
        if (iVar2.c(hVar) == null || !((Boolean) iVar2.c(hVar)).booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        try {
            return C3176g.c(h(yVar, k10, oVar, bVar2, jVar, z10, i10, i11, booleanValue, bVar), this.f36492a);
        } finally {
            v(k10);
            this.f36494c.c(bArr);
        }
    }

    private Bitmap h(y yVar, BitmapFactory.Options options, o oVar, T4.b bVar, j jVar, boolean z10, int i10, int i11, boolean z11, b bVar2) {
        boolean z12;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        ColorSpace.Named named;
        int i16;
        int i17;
        float f10;
        int i18;
        y yVar2 = yVar;
        BitmapFactory.Options options2 = options;
        j jVar2 = jVar;
        b bVar3 = bVar2;
        long b10 = g.b();
        int[] m10 = m(yVar2, options2, bVar3, this.f36492a);
        int i19 = m10[0];
        int i20 = m10[1];
        String str2 = options2.outMimeType;
        if (i19 == -1 || i20 == -1) {
            z12 = false;
        } else {
            z12 = z10;
        }
        int c10 = yVar.c();
        int j10 = F.j(c10);
        boolean m11 = F.m(c10);
        int i21 = i10;
        if (i21 == Integer.MIN_VALUE) {
            i13 = i11;
            if (r(j10)) {
                i12 = i20;
            } else {
                i12 = i19;
            }
        } else {
            i13 = i11;
            i12 = i21;
        }
        if (i13 != Integer.MIN_VALUE) {
            i14 = i13;
        } else if (r(j10)) {
            i14 = i19;
        } else {
            i14 = i20;
        }
        ImageHeaderParser.ImageType d10 = yVar.d();
        ImageHeaderParser.ImageType imageType = d10;
        c(d10, yVar, bVar2, this.f36492a, oVar, j10, i19, i20, i12, i14, options);
        String str3 = str2;
        int i22 = i20;
        int i23 = i19;
        b bVar4 = bVar3;
        j jVar3 = jVar2;
        BitmapFactory.Options options3 = options2;
        int i24 = c10;
        y yVar3 = yVar2;
        b(yVar, bVar, z12, m11, options, i12, i14);
        int i25 = Build.VERSION.SDK_INT;
        if (z(imageType)) {
            if (i23 < 0 || i22 < 0 || !z11) {
                if (s(options)) {
                    f10 = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                } else {
                    f10 = 1.0f;
                }
                int i26 = options3.inSampleSize;
                float f11 = (float) i26;
                int round = Math.round(((float) ((int) Math.ceil((double) (((float) i23) / f11)))) * f10);
                i16 = Math.round(((float) ((int) Math.ceil((double) (((float) i22) / f11)))) * f10);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculated target [");
                    sb2.append(round);
                    sb2.append("x");
                    sb2.append(i16);
                    i18 = round;
                    sb2.append("] for source [");
                    sb2.append(i23);
                    sb2.append("x");
                    sb2.append(i22);
                    sb2.append("], sampleSize: ");
                    sb2.append(i26);
                    sb2.append(", targetDensity: ");
                    sb2.append(options3.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options3.inDensity);
                    sb2.append(", density multiplier: ");
                    sb2.append(f10);
                    Log.v(str, sb2.toString());
                } else {
                    i18 = round;
                }
                i17 = i18;
            } else {
                str = "Downsampler";
                i17 = i12;
                i16 = i14;
            }
            if (i17 > 0 && i16 > 0) {
                y(options3, this.f36492a, i17, i16);
            }
        } else {
            str = "Downsampler";
        }
        if (jVar3 != null) {
            if (i25 >= 28) {
                if (jVar3 != j.DISPLAY_P3 || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) {
                    named = ColorSpace.Named.SRGB;
                } else {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                options3.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i25 >= 26) {
                options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap i27 = i(yVar3, options3, bVar4, this.f36492a);
        bVar4.b(this.f36492a, i27);
        if (Log.isLoggable(str, 2)) {
            i15 = i24;
            t(i23, i22, str3, options, i27, i10, i11, b10);
        } else {
            i15 = i24;
        }
        if (i27 == null) {
            return null;
        }
        i27.setDensity(this.f36493b.densityDpi);
        Bitmap n10 = F.n(this.f36492a, i27, i15);
        if (i27.equals(n10)) {
            return n10;
        }
        this.f36492a.c(i27);
        return n10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap i(c5.y r5, android.graphics.BitmapFactory.Options r6, c5.s.b r7, W4.d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.a()
            r5.b()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = c5.F.i()
            r4.lock()
            android.graphics.Bitmap r5 = r5.a(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = c5.F.i()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.c(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = c5.F.i()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = c5.F.i()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.s.i(c5.y, android.graphics.BitmapFactory$Options, c5.s$b, W4.d):android.graphics.Bitmap");
    }

    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options options;
        synchronized (s.class) {
            Queue queue = f36491n;
            synchronized (queue) {
                options = (BitmapFactory.Options) queue.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                w(options);
            }
        }
        return options;
    }

    private static int l(double d10) {
        if (d10 > 1.0d) {
            d10 = 1.0d / d10;
        }
        return (int) Math.round(d10 * 2.147483647E9d);
    }

    private static int[] m(y yVar, BitmapFactory.Options options, b bVar, d dVar) {
        options.inJustDecodeBounds = true;
        i(yVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i10) {
        if (i10 == 90 || i10 == 270) {
            return true;
        }
        return false;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i10;
        int i11 = options.inTargetDensity;
        if (i11 <= 0 || (i10 = options.inDensity) <= 0 || i11 == i10) {
            return false;
        }
        return true;
    }

    private static void t(int i10, int i11, String str, BitmapFactory.Options options, Bitmap bitmap, int i12, int i13, long j10) {
        Log.v("Downsampler", "Decoded " + j(bitmap) + " from [" + i10 + "x" + i11 + "] " + str + " with inBitmap " + n(options) + " for [" + i12 + "x" + i13 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + g.a(j10));
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i10 + ", outHeight: " + i11 + ", outMimeType: " + str + ", inBitmap: " + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue queue = f36491n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private static int x(double d10) {
        return (int) (d10 + 0.5d);
    }

    private static void y(BitmapFactory.Options options, d dVar, int i10, int i11) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.e(i10, i11, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    public v d(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i iVar) {
        return e(new y.c(parcelFileDescriptor, this.f36495d, this.f36494c), i10, i11, iVar, f36489l);
    }

    public v f(InputStream inputStream, int i10, int i11, i iVar, b bVar) {
        return e(new y.b(inputStream, this.f36495d, this.f36494c), i10, i11, iVar, bVar);
    }

    public v g(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        return e(new y.a(byteBuffer, this.f36495d, this.f36494c), i10, i11, iVar, f36489l);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }

    class a implements b {
        a() {
        }

        public void a() {
        }

        public void b(d dVar, Bitmap bitmap) {
        }
    }
}
