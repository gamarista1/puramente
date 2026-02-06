package c5;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.l;

public final class x {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f36501e;

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f36502f;

    /* renamed from: g  reason: collision with root package name */
    private static final File f36503g = new File("/proc/self/fd");

    /* renamed from: h  reason: collision with root package name */
    private static volatile x f36504h;

    /* renamed from: a  reason: collision with root package name */
    private final int f36505a = 20000;

    /* renamed from: b  reason: collision with root package name */
    private int f36506b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36507c = true;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f36508d = new AtomicBoolean(false);

    static {
        boolean z10;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i10 < 29) {
            z10 = true;
        } else {
            z10 = false;
        }
        f36501e = z10;
        if (i10 >= 28) {
            z11 = true;
        }
        f36502f = z11;
    }

    x() {
    }

    private boolean a() {
        if (!f36501e || this.f36508d.get()) {
            return false;
        }
        return true;
    }

    public static x b() {
        if (f36504h == null) {
            synchronized (x.class) {
                try {
                    if (f36504h == null) {
                        f36504h = new x();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36504h;
    }

    private int c() {
        if (e()) {
            return 500;
        }
        return this.f36505a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f36506b + 1;
            this.f36506b = i10;
            if (i10 >= 50) {
                this.f36506b = 0;
                int length = f36503g.list().length;
                long c10 = (long) c();
                if (((long) length) >= c10) {
                    z10 = false;
                }
                this.f36507c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + c10);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f36507c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        for (String startsWith : Arrays.asList(new String[]{"GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013"})) {
            if (Build.MODEL.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        } else if (!f36502f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        } else if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        } else if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        } else if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        } else if (d()) {
            return true;
        } else {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean f10 = f(i10, i11, z10, z11);
        if (f10) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return f10;
    }

    public void h() {
        l.b();
        this.f36508d.set(true);
    }
}
