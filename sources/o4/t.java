package o4;

import Af.a;
import a4.C3116i;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import k4.C3660b;
import k4.C3666h;
import k4.C3667i;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f47014a = new t();

    private t() {
    }

    private final boolean b(Bitmap bitmap, Bitmap.Config config) {
        if (bitmap.getConfig() == C3878a.e(config)) {
            return true;
        }
        return false;
    }

    private final boolean c(boolean z10, Bitmap bitmap, C3667i iVar, C3666h hVar) {
        int i10;
        int i11;
        if (z10) {
            return true;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (C3660b.b(iVar)) {
            i10 = bitmap.getWidth();
        } else {
            i10 = l.A(iVar.d(), hVar);
        }
        if (C3660b.b(iVar)) {
            i11 = bitmap.getHeight();
        } else {
            i11 = l.A(iVar.c(), hVar);
        }
        if (C3116i.c(width, height, i10, i11, hVar) == 1.0d) {
            return true;
        }
        return false;
    }

    public final Bitmap a(Drawable drawable, Bitmap.Config config, C3667i iVar, C3666h hVar, boolean z10) {
        int i10;
        int i11;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (b(bitmap, config) && c(z10, bitmap, iVar, hVar)) {
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int p10 = l.p(mutate);
        int i12 = 512;
        if (p10 <= 0) {
            p10 = 512;
        }
        int i13 = l.i(mutate);
        if (i13 > 0) {
            i12 = i13;
        }
        if (C3660b.b(iVar)) {
            i10 = p10;
        } else {
            i10 = l.A(iVar.d(), hVar);
        }
        if (C3660b.b(iVar)) {
            i11 = i12;
        } else {
            i11 = l.A(iVar.c(), hVar);
        }
        double c10 = C3116i.c(p10, i12, i10, i11, hVar);
        int c11 = a.c(((double) p10) * c10);
        int c12 = a.c(c10 * ((double) i12));
        Bitmap createBitmap = Bitmap.createBitmap(c11, c12, C3878a.e(config));
        Rect bounds = mutate.getBounds();
        int i14 = bounds.left;
        int i15 = bounds.top;
        int i16 = bounds.right;
        int i17 = bounds.bottom;
        mutate.setBounds(0, 0, c11, c12);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i14, i15, i16, i17);
        return createBitmap;
    }
}
