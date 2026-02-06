package r0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import r0.I1;
import s0.C2581c;

/* renamed from: r0.Q  reason: case insensitive filesystem */
public abstract class C2465Q {
    public static final H1 a(int i10, int i11, int i12, boolean z10, C2581c cVar) {
        Bitmap bitmap;
        Bitmap.Config d10 = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmap = C2484d0.b(i10, i11, i12, z10, cVar);
        } else {
            bitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, d10);
            bitmap.setHasAlpha(z10);
        }
        return new C2460N(bitmap);
    }

    public static final Bitmap b(H1 h12) {
        if (h12 instanceof C2460N) {
            return ((C2460N) h12).c();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final H1 c(Bitmap bitmap) {
        return new C2460N(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        I1.a aVar = I1.f25425b;
        if (I1.i(i10, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (I1.i(i10, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (I1.i(i10, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && I1.i(i10, aVar.c())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i11 < 26 || !I1.i(i10, aVar.d())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.HARDWARE;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return I1.f25425b.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return I1.f25425b.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return I1.f25425b.b();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && config == Bitmap.Config.RGBA_F16) {
            return I1.f25425b.c();
        }
        if (i10 < 26 || config != Bitmap.Config.HARDWARE) {
            return I1.f25425b.b();
        }
        return I1.f25425b.d();
    }
}
