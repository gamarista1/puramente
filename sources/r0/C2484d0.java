package r0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import s0.C2581c;
import s0.C2585g;

/* renamed from: r0.d0  reason: case insensitive filesystem */
public final class C2484d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final C2484d0 f25490a = new C2484d0();

    private C2484d0() {
    }

    public static final C2581c a(Bitmap bitmap) {
        C2581c b10;
        ColorSpace a10 = bitmap.getColorSpace();
        if (a10 == null || (b10 = C2452J.b(a10)) == null) {
            return C2585g.f25794a.w();
        }
        return b10;
    }

    public static final Bitmap b(int i10, int i11, int i12, boolean z10, C2581c cVar) {
        return Bitmap.createBitmap((DisplayMetrics) null, i10, i11, C2465Q.d(i12), z10, C2452J.a(cVar));
    }
}
