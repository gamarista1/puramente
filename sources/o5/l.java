package o5;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f47054a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f47055b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    private static volatile Handler f47056c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47057a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47057a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47057a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47057a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f47057a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f47057a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.l.a.<clinit>():void");
        }
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!s()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(com.bumptech.glide.request.a aVar, com.bumptech.glide.request.a aVar2) {
        if (aVar != null) {
            return aVar.isEquivalentTo(aVar2);
        }
        if (aVar2 == null) {
            return true;
        }
        return false;
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    private static String f(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f47054a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static Queue g(int i10) {
        return new ArrayDeque(i10);
    }

    public static int h(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * j(config);
    }

    public static int i(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    public static int j(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f47057a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        if (i10 != 4) {
            return 4;
        }
        return 8;
    }

    public static List k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static Handler l() {
        if (f47056c == null) {
            synchronized (l.class) {
                try {
                    if (f47056c == null) {
                        f47056c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f47056c;
    }

    public static int m(float f10) {
        return n(f10, 17);
    }

    public static int n(float f10, int i10) {
        return o(Float.floatToIntBits(f10), i10);
    }

    public static int o(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int p(Object obj, int i10) {
        int i11;
        if (obj == null) {
            i11 = 0;
        } else {
            i11 = obj.hashCode();
        }
        return o(i11, i10);
    }

    public static int q(boolean z10, int i10) {
        return o(z10 ? 1 : 0, i10);
    }

    public static boolean r() {
        return !s();
    }

    public static boolean s() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean t(int i10) {
        if (i10 > 0 || i10 == Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public static boolean u(int i10, int i11) {
        if (!t(i10) || !t(i11)) {
            return false;
        }
        return true;
    }

    public static void v(Runnable runnable) {
        l().post(runnable);
    }

    public static void w(Runnable runnable) {
        l().removeCallbacks(runnable);
    }

    public static String x(byte[] bArr) {
        String f10;
        char[] cArr = f47055b;
        synchronized (cArr) {
            f10 = f(bArr, cArr);
        }
        return f10;
    }
}
