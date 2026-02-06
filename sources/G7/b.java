package g7;

import T5.k;
import X5.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import c7.C3189i;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import f7.i;
import f7.r;
import java.io.IOException;
import java.io.InputStream;
import x1.e;

public abstract class b implements d {

    /* renamed from: f  reason: collision with root package name */
    private static final Class f43665f = b.class;

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f43666g = {-1, -39};

    /* renamed from: a  reason: collision with root package name */
    private final i f43667a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f43668b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f43669c;

    /* renamed from: d  reason: collision with root package name */
    private final PreverificationHelper f43670d;

    /* renamed from: e  reason: collision with root package name */
    final e f43671e;

    public b(i iVar, e eVar, f fVar) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.f43670d = preverificationHelper;
        this.f43667a = iVar;
        if (iVar instanceof r) {
            this.f43668b = fVar.a();
            this.f43669c = fVar.b();
        }
        this.f43671e = eVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:56|57|(2:59|60)) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009a, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        U5.a.k(f43665f, "Could not decode region %s, decoding full bitmap instead.", r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b8, code lost:
        if (r0 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x00ad */
    /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x011f */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0094 A[SYNTHETIC, Splitter:B:42:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC, Splitter:B:48:0x009f] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c0 A[Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, all -> 0x00a3, IOException -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c7 A[Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, all -> 0x00a3, IOException -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X5.a c(java.io.InputStream r9, android.graphics.BitmapFactory.Options r10, android.graphics.Rect r11, android.graphics.ColorSpace r12) {
        /*
            r8 = this;
            T5.k.g(r9)
            int r0 = r10.outWidth
            int r1 = r10.outHeight
            if (r11 == 0) goto L_0x0017
            int r0 = r11.width()
            int r1 = r10.inSampleSize
            int r0 = r0 / r1
            int r1 = r11.height()
            int r2 = r10.inSampleSize
            int r1 = r1 / r2
        L_0x0017:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 1
            r4 = 26
            r5 = 0
            if (r2 < r4) goto L_0x002d
            com.facebook.imagepipeline.platform.PreverificationHelper r6 = r8.f43670d
            if (r6 == 0) goto L_0x002d
            android.graphics.Bitmap$Config r7 = r10.inPreferredConfig
            boolean r6 = r6.shouldUseHardwareBitmapConfig(r7)
            if (r6 == 0) goto L_0x002d
            r6 = r3
            goto L_0x002e
        L_0x002d:
            r6 = r5
        L_0x002e:
            r7 = 0
            if (r11 != 0) goto L_0x0036
            if (r6 == 0) goto L_0x0036
            r10.inMutable = r5
            goto L_0x0059
        L_0x0036:
            if (r11 == 0) goto L_0x003e
            if (r6 == 0) goto L_0x003e
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            r10.inPreferredConfig = r5
        L_0x003e:
            boolean r5 = r8.f43668b
            if (r5 != 0) goto L_0x0059
            int r5 = r8.d(r0, r1, r10)
            f7.i r6 = r8.f43667a
            java.lang.Object r5 = r6.get(r5)
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 == 0) goto L_0x0051
            goto L_0x005a
        L_0x0051:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "BitmapPool.get returned null"
            r9.<init>(r10)
            throw r9
        L_0x0059:
            r5 = r7
        L_0x005a:
            r10.inBitmap = r5
            if (r2 < r4) goto L_0x006b
            if (r12 != 0) goto L_0x0068
            android.graphics.ColorSpace$Named r12 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r12 = android.graphics.ColorSpace.get(r12)
        L_0x0068:
            r10.inPreferredColorSpace = r12
        L_0x006b:
            x1.e r12 = r8.f43671e
            java.lang.Object r12 = r12.b()
            java.nio.ByteBuffer r12 = (java.nio.ByteBuffer) r12
            if (r12 != 0) goto L_0x007d
            int r12 = W5.b.e()
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r12)
        L_0x007d:
            byte[] r2 = r12.array()     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
            r10.inTempStorage = r2     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
            if (r11 == 0) goto L_0x00c4
            if (r5 == 0) goto L_0x00c4
            android.graphics.Bitmap$Config r2 = r10.inPreferredConfig     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
            if (r2 == 0) goto L_0x00c4
            r5.reconfigure(r0, r1, r2)     // Catch:{ IOException -> 0x00ac, all -> 0x00aa }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r9, r3)     // Catch:{ IOException -> 0x00ac, all -> 0x00aa }
            if (r0 == 0) goto L_0x009c
            android.graphics.Bitmap r11 = r0.decodeRegion(r11, r10)     // Catch:{ IOException -> 0x00ad }
            goto L_0x009d
        L_0x0099:
            r10 = move-exception
            r7 = r0
            goto L_0x00be
        L_0x009c:
            r11 = r7
        L_0x009d:
            if (r0 == 0) goto L_0x00c5
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
            goto L_0x00c5
        L_0x00a3:
            r9 = move-exception
            goto L_0x0120
        L_0x00a6:
            r9 = move-exception
            goto L_0x00f8
        L_0x00a8:
            r10 = move-exception
            goto L_0x0100
        L_0x00aa:
            r10 = move-exception
            goto L_0x00be
        L_0x00ac:
            r0 = r7
        L_0x00ad:
            java.lang.Class r1 = f43665f     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch:{ all -> 0x0099 }
            U5.a.k(r1, r2, r11)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x00c4
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
            goto L_0x00c4
        L_0x00be:
            if (r7 == 0) goto L_0x00c3
            r7.recycle()     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
        L_0x00c3:
            throw r10     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
        L_0x00c4:
            r11 = r7
        L_0x00c5:
            if (r11 != 0) goto L_0x00cb
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r9, r7, r10)     // Catch:{ IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6 }
        L_0x00cb:
            x1.e r9 = r8.f43671e
            r9.a(r12)
            if (r5 == 0) goto L_0x00e4
            if (r5 == r11) goto L_0x00e4
            f7.i r9 = r8.f43667a
            r9.a(r5)
            if (r11 == 0) goto L_0x00de
            r11.recycle()
        L_0x00de:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x00e4:
            boolean r9 = r8.f43669c
            if (r9 == 0) goto L_0x00f1
            g7.b$a r9 = g7.b.a.f43672a
            X5.a r9 = X5.a.g0(r11, r9)
            return r9
        L_0x00f1:
            f7.i r9 = r8.f43667a
            X5.a r9 = X5.a.g0(r11, r9)
            return r9
        L_0x00f8:
            if (r5 == 0) goto L_0x00ff
            f7.i r10 = r8.f43667a     // Catch:{ all -> 0x00a3 }
            r10.a(r5)     // Catch:{ all -> 0x00a3 }
        L_0x00ff:
            throw r9     // Catch:{ all -> 0x00a3 }
        L_0x0100:
            if (r5 == 0) goto L_0x0107
            f7.i r11 = r8.f43667a     // Catch:{ all -> 0x00a3 }
            r11.a(r5)     // Catch:{ all -> 0x00a3 }
        L_0x0107:
            r9.reset()     // Catch:{ IOException -> 0x011f }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch:{ IOException -> 0x011f }
            if (r9 == 0) goto L_0x011e
            U6.f r11 = U6.f.b()     // Catch:{ IOException -> 0x011f }
            X5.a r9 = X5.a.g0(r9, r11)     // Catch:{ IOException -> 0x011f }
            x1.e r10 = r8.f43671e
            r10.a(r12)
            return r9
        L_0x011e:
            throw r10     // Catch:{ IOException -> 0x011f }
        L_0x011f:
            throw r10     // Catch:{ all -> 0x00a3 }
        L_0x0120:
            x1.e r10 = r8.f43671e
            r10.a(r12)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.b.c(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):X5.a");
    }

    private static BitmapFactory.Options e(C3189i iVar, Bitmap.Config config, boolean z10) {
        boolean z11;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = iVar.I();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.HARDWARE) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z10) {
            BitmapFactory.decodeStream(iVar.E(), (Rect) null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z11) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    public X5.a a(C3189i iVar, Bitmap.Config config, Rect rect, int i10, ColorSpace colorSpace) {
        boolean z10;
        boolean V10 = iVar.V(i10);
        BitmapFactory.Options e10 = e(iVar, config, this.f43668b);
        Z5.b E10 = iVar.E();
        k.g(E10);
        if (iVar.M() > i10) {
            E10 = new Z5.a(E10, i10);
        }
        if (!V10) {
            E10 = new Z5.b(E10, f43666g);
        }
        if (e10.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            X5.a c10 = c(E10, e10, rect, colorSpace);
            try {
                E10.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            return c10;
        } catch (RuntimeException e12) {
            if (z10) {
                X5.a a10 = a(iVar, Bitmap.Config.ARGB_8888, rect, i10, colorSpace);
                try {
                    E10.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                return a10;
            }
            throw e12;
        } catch (Throwable th2) {
            try {
                E10.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
            throw th2;
        }
    }

    public X5.a b(C3189i iVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        boolean z10;
        BitmapFactory.Options e10 = e(iVar, config, this.f43668b);
        if (e10.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            return c((InputStream) k.g(iVar.E()), e10, rect, colorSpace);
        } catch (RuntimeException e11) {
            if (z10) {
                return b(iVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e11;
        }
    }

    public abstract int d(int i10, int i11, BitmapFactory.Options options);

    private static final class a implements h {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final a f43672a = new a();

        private a() {
        }

        /* renamed from: c */
        public void a(Bitmap bitmap) {
        }
    }
}
