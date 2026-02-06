package hd;

import android.app.UiModeManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.a;

/* renamed from: hd.b  reason: case insensitive filesystem */
public class C5012b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f60668a;

    public C5012b(Context context) {
        this.f60668a = context;
    }

    private a b() {
        WindowManager windowManager = (WindowManager) this.f60668a.getSystemService("window");
        if (windowManager == null) {
            return a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        double sqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
        if (sqrt >= 3.0d && sqrt <= 6.9d) {
            return a.HANDSET;
        }
        if (sqrt <= 6.9d || sqrt > 18.0d) {
            return a.UNKNOWN;
        }
        return a.TABLET;
    }

    private a c() {
        int i10 = this.f60668a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 == 0) {
            return a.UNKNOWN;
        }
        if (i10 >= 600) {
            return a.TABLET;
        }
        return a.HANDSET;
    }

    public a a() {
        if (this.f60668a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f60668a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return a.TV;
        }
        a c10 = c();
        if (c10 == null || c10 == a.UNKNOWN) {
            return b();
        }
        return c10;
    }

    public boolean d() {
        if (a() == a.TABLET) {
            return true;
        }
        return false;
    }
}
