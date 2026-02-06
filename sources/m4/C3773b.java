package m4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import k4.C3667i;
import o4.C3878a;
import qf.C6658d;

/* renamed from: m4.b  reason: case insensitive filesystem */
public final class C3773b implements e {

    /* renamed from: a  reason: collision with root package name */
    private final String f46454a = C3773b.class.getName();

    public boolean equals(Object obj) {
        return obj instanceof C3773b;
    }

    public String getCacheKey() {
        return this.f46454a;
    }

    public int hashCode() {
        return C3773b.class.hashCode();
    }

    public Object transform(Bitmap bitmap, C3667i iVar, C6658d dVar) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f10 = ((float) min) / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, C3878a.c(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f10, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f10 - (((float) bitmap.getWidth()) / 2.0f), f10 - (((float) bitmap.getHeight()) / 2.0f), paint);
        return createBitmap;
    }
}
