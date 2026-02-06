package X4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f35009a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35010b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f35011c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35012d;

    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        static final int f35013i;

        /* renamed from: a  reason: collision with root package name */
        final Context f35014a;

        /* renamed from: b  reason: collision with root package name */
        ActivityManager f35015b;

        /* renamed from: c  reason: collision with root package name */
        c f35016c;

        /* renamed from: d  reason: collision with root package name */
        float f35017d = 2.0f;

        /* renamed from: e  reason: collision with root package name */
        float f35018e = ((float) f35013i);

        /* renamed from: f  reason: collision with root package name */
        float f35019f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        float f35020g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        int f35021h = 4194304;

        static {
            int i10;
            if (Build.VERSION.SDK_INT < 26) {
                i10 = 4;
            } else {
                i10 = 1;
            }
            f35013i = i10;
        }

        public a(Context context) {
            this.f35014a = context;
            this.f35015b = (ActivityManager) context.getSystemService("activity");
            this.f35016c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && i.e(this.f35015b)) {
                this.f35018e = 0.0f;
            }
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayMetrics f35022a;

        b(DisplayMetrics displayMetrics) {
            this.f35022a = displayMetrics;
        }

        public int a() {
            return this.f35022a.heightPixels;
        }

        public int b() {
            return this.f35022a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        int i10;
        boolean z10;
        this.f35011c = aVar.f35014a;
        if (e(aVar.f35015b)) {
            i10 = aVar.f35021h / 2;
        } else {
            i10 = aVar.f35021h;
        }
        this.f35012d = i10;
        int c10 = c(aVar.f35015b, aVar.f35019f, aVar.f35020g);
        float b10 = (float) (aVar.f35016c.b() * aVar.f35016c.a() * 4);
        int round = Math.round(aVar.f35018e * b10);
        int round2 = Math.round(b10 * aVar.f35017d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f35010b = round2;
            this.f35009a = round;
        } else {
            float f10 = (float) i11;
            float f11 = aVar.f35018e;
            float f12 = aVar.f35017d;
            float f13 = f10 / (f11 + f12);
            this.f35010b = Math.round(f12 * f13);
            this.f35009a = Math.round(f13 * aVar.f35018e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f35010b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f35009a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            if (i12 > c10) {
                z10 = true;
            } else {
                z10 = false;
            }
            sb2.append(z10);
            sb2.append(", max size: ");
            sb2.append(f(c10));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f35015b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f35015b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        boolean e10 = e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1048576);
        if (e10) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f35011c, (long) i10);
    }

    public int a() {
        return this.f35012d;
    }

    public int b() {
        return this.f35009a;
    }

    public int d() {
        return this.f35010b;
    }
}
