package c5;

import T4.m;
import V4.v;
import W4.d;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.c;
import o5.l;

/* renamed from: c5.h  reason: case insensitive filesystem */
public abstract class C3177h implements m {
    public final v a(Context context, v vVar, int i10, int i11) {
        if (l.u(i10, i11)) {
            d h10 = c.e(context).h();
            Bitmap bitmap = (Bitmap) vVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c10 = c(h10, bitmap, i10, i11);
            if (bitmap.equals(c10)) {
                return vVar;
            }
            return C3176g.c(c10, h10);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    /* access modifiers changed from: protected */
    public abstract Bitmap c(d dVar, Bitmap bitmap, int i10, int i11);
}
