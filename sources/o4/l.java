package o4;

import Sg.p;
import X3.b;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.c;
import b4.C3145a;
import com.google.android.gms.common.api.a;
import e4.C3488b;
import e4.C3489c;
import j4.C3628o;
import j4.C3632s;
import java.io.Closeable;
import java.io.File;
import k4.C3661c;
import k4.C3666h;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import mf.C6565s;
import rh.E;
import rh.F;
import rh.u;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Bitmap.Config[] f47005a;

    /* renamed from: b  reason: collision with root package name */
    private static final Bitmap.Config f47006b;

    /* renamed from: c  reason: collision with root package name */
    private static final u f47007c = new u.a().f();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47008a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f47009b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f47010c;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        static {
            /*
                a4.g[] r0 = a4.C3114g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                a4.g r2 = a4.C3114g.MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                a4.g r3 = a4.C3114g.MEMORY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                a4.g r4 = a4.C3114g.DISK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                a4.g r5 = a4.C3114g.NETWORK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f47008a = r0
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f47009b = r0
                k4.h[] r0 = k4.C3666h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                k4.h r3 = k4.C3666h.FILL     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                k4.h r1 = k4.C3666h.FIT     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                f47010c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o4.l.a.<clinit>():void");
        }
    }

    static {
        Bitmap.Config config;
        int i10 = Build.VERSION.SDK_INT;
        f47005a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f47006b = config;
    }

    public static final int A(C3661c cVar, C3666h hVar) {
        if (cVar instanceof C3661c.a) {
            return ((C3661c.a) cVar).f45103a;
        }
        int i10 = a.f47010c[hVar.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return a.e.API_PRIORITY_OTHER;
        }
        throw new C6535s();
    }

    public static final void a(C3145a.b bVar) {
        try {
            bVar.a();
        } catch (Exception unused) {
        }
    }

    public static final u.a b(u.a aVar, String str) {
        int a02 = p.a0(str, ':', 0, false, 6, (Object) null);
        if (a02 != -1) {
            String substring = str.substring(0, a02);
            C6496s.g(substring, "substring(...)");
            String obj = p.g1(substring).toString();
            String substring2 = str.substring(a02 + 1);
            C6496s.g(substring2, "substring(...)");
            aVar.e(obj, substring2);
            return aVar;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    public static final int c(Context context, double d10) {
        int i10;
        try {
            Object systemService = c.getSystemService(context, ActivityManager.class);
            C6496s.e(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            if ((context.getApplicationInfo().flags & 1048576) != 0) {
                i10 = activityManager.getLargeMemoryClass();
            } else {
                i10 = activityManager.getMemoryClass();
            }
        } catch (Exception unused) {
            i10 = 256;
        }
        double d11 = (double) 1024;
        return (int) (d10 * ((double) i10) * d11 * d11);
    }

    public static final void d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final double e(Context context) {
        try {
            Object systemService = c.getSystemService(context, ActivityManager.class);
            C6496s.e(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                return 0.15d;
            }
            return 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Bitmap.Config f() {
        return f47006b;
    }

    public static final b g(C3488b.a aVar) {
        if (aVar instanceof C3489c) {
            return ((C3489c) aVar).e();
        }
        return b.f9684b;
    }

    public static final String h(Uri uri) {
        return (String) C6565s.q0(uri.getPathSegments());
    }

    public static final int i(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return drawable.getIntrinsicHeight();
        }
        return bitmap.getHeight();
    }

    public static final String j(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || p.d0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(p.T0(p.V0(p.d1(p.d1(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    public static final int k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: j4.w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final j4.C3636w l(android.view.View r3) {
        /*
            int r0 = Y3.a.f10317a
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof j4.C3636w
            r2 = 0
            if (r1 == 0) goto L_0x000e
            j4.w r0 = (j4.C3636w) r0
            goto L_0x000f
        L_0x000e:
            r0 = r2
        L_0x000f:
            if (r0 != 0) goto L_0x0037
            monitor-enter(r3)
            int r0 = Y3.a.f10317a     // Catch:{ all -> 0x0020 }
            java.lang.Object r0 = r3.getTag(r0)     // Catch:{ all -> 0x0020 }
            boolean r1 = r0 instanceof j4.C3636w     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0022
            r2 = r0
            j4.w r2 = (j4.C3636w) r2     // Catch:{ all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r0 = move-exception
            goto L_0x0035
        L_0x0022:
            if (r2 == 0) goto L_0x0026
            r0 = r2
            goto L_0x0033
        L_0x0026:
            j4.w r0 = new j4.w     // Catch:{ all -> 0x0020 }
            r0.<init>(r3)     // Catch:{ all -> 0x0020 }
            r3.addOnAttachStateChangeListener(r0)     // Catch:{ all -> 0x0020 }
            int r1 = Y3.a.f10317a     // Catch:{ all -> 0x0020 }
            r3.setTag(r1, r0)     // Catch:{ all -> 0x0020 }
        L_0x0033:
            monitor-exit(r3)
            goto L_0x0037
        L_0x0035:
            monitor-exit(r3)
            throw r0
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.l.l(android.view.View):j4.w");
    }

    public static final File m(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null");
    }

    public static final C3666h n(ImageView imageView) {
        int i10;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        if (scaleType == null) {
            i10 = -1;
        } else {
            i10 = a.f47009b[scaleType.ordinal()];
        }
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return C3666h.FIT;
        }
        return C3666h.FILL;
    }

    public static final Bitmap.Config[] o() {
        return f47005a;
    }

    public static final int p(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return drawable.getIntrinsicWidth();
        }
        return bitmap.getWidth();
    }

    public static final boolean q(Uri uri) {
        if (!C6496s.c(uri.getScheme(), "file") || !C6496s.c(h(uri), "android_asset")) {
            return false;
        }
        return true;
    }

    public static final boolean r() {
        return C6496s.c(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final boolean s(int i10) {
        if (i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public static final boolean t(C3488b.a aVar) {
        if (!(aVar instanceof C3489c) || !((C3489c) aVar).f()) {
            return false;
        }
        return true;
    }

    public static final boolean u(Drawable drawable) {
        if ((drawable instanceof VectorDrawable) || (drawable instanceof F3.c)) {
            return true;
        }
        return false;
    }

    public static final C3628o v(C3628o oVar) {
        if (oVar == null) {
            return C3628o.f44767c;
        }
        return oVar;
    }

    public static final C3632s w(C3632s sVar) {
        if (sVar == null) {
            return C3632s.f44783c;
        }
        return sVar;
    }

    public static final u x(u uVar) {
        if (uVar == null) {
            return f47007c;
        }
        return uVar;
    }

    public static final F y(E e10) {
        F a10 = e10.a();
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final int z(String str, int i10) {
        Long o10 = p.o(str);
        if (o10 == null) {
            return i10;
        }
        long longValue = o10.longValue();
        if (longValue > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }
}
