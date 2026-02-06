package o4;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: o4.a  reason: case insensitive filesystem */
public abstract class C3878a {
    public static final int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return b(bitmap.getConfig()) * bitmap.getWidth() * bitmap.getHeight();
            }
        } else {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
    }

    public static final int b(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) {
            return 4;
        }
        return 8;
    }

    public static final Bitmap.Config c(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            return Bitmap.Config.ARGB_8888;
        }
        return config;
    }

    public static final boolean d(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.HARDWARE) {
            return false;
        }
        return true;
    }

    public static final Bitmap.Config e(Bitmap.Config config) {
        if (config == null || d(config)) {
            return Bitmap.Config.ARGB_8888;
        }
        return config;
    }
}
