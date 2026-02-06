package m7;

import W5.b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import x1.f;

/* renamed from: m7.c  reason: case insensitive filesystem */
public final class C3783c {

    /* renamed from: a  reason: collision with root package name */
    public static final C3783c f46505a = new C3783c();

    /* renamed from: b  reason: collision with root package name */
    private static final Lazy f46506b = C6531o.b(new C3781a());

    /* renamed from: c  reason: collision with root package name */
    private static boolean f46507c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f46508d;

    /* renamed from: m7.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f46509a;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|(2:13|14)|15|17) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0036 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0041 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0036 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0036 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0036 }
            L_0x0036:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_1010102     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                f46509a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m7.C3783c.a.<clinit>():void");
        }
    }

    private C3783c() {
    }

    /* access modifiers changed from: private */
    public static final f b() {
        return new f(12);
    }

    private final ByteBuffer c() {
        if (f46507c) {
            return b.f34852a.b();
        }
        return (ByteBuffer) g().b();
    }

    public static final Pair d(InputStream inputStream) {
        if (inputStream != null) {
            C3783c cVar = f46505a;
            ByteBuffer k10 = cVar.k();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = k10.array();
                Pair pair = null;
                cVar.f(inputStream, (Rect) null, options);
                if (options.outWidth != -1) {
                    if (options.outHeight != -1) {
                        pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                    }
                }
                cVar.l(k10);
                return pair;
            } catch (Throwable th2) {
                f46505a.l(k10);
                throw th2;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final C3785e e(InputStream inputStream) {
        if (inputStream != null) {
            C3783c cVar = f46505a;
            ByteBuffer k10 = cVar.k();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = k10.array();
                ColorSpace colorSpace = null;
                cVar.f(inputStream, (Rect) null, options);
                if (Build.VERSION.SDK_INT >= 26) {
                    colorSpace = options.outColorSpace;
                }
                C3785e eVar = new C3785e(options.outWidth, options.outHeight, colorSpace);
                cVar.l(k10);
                return eVar;
            } catch (Throwable th2) {
                f46505a.l(k10);
                throw th2;
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    private final f g() {
        return (f) f46506b.getValue();
    }

    public static final int h(Bitmap.Config config) {
        int i10;
        if (config == null) {
            i10 = -1;
        } else {
            i10 = a.f46509a[config.ordinal()];
        }
        switch (i10) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int i(int i10, int i11, Bitmap.Config config) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(("width must be > 0, width is: " + i10).toString());
        } else if (i11 > 0) {
            int h10 = h(config);
            int i12 = i10 * i11 * h10;
            if (i12 > 0) {
                return i12;
            }
            throw new IllegalStateException(("size must be > 0: size: " + i12 + ", width: " + i10 + ", height: " + i11 + ", pixelSize: " + h10).toString());
        } else {
            throw new IllegalArgumentException(("height must be > 0, height is: " + i11).toString());
        }
    }

    public static final int j(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    private final ByteBuffer k() {
        ByteBuffer c10 = c();
        if (c10 != null) {
            return c10;
        }
        ByteBuffer allocate = ByteBuffer.allocate(b.e());
        C6496s.g(allocate, "allocate(...)");
        return allocate;
    }

    private final void l(ByteBuffer byteBuffer) {
        if (!f46507c) {
            g().a(byteBuffer);
        }
    }

    public final Bitmap f(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (!f46508d) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        try {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
