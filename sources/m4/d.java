package m4;

import Af.a;
import a4.C3116i;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import k4.C3660b;
import k4.C3661c;
import k4.C3666h;
import k4.C3667i;
import kotlin.Pair;
import lf.C6502A;
import o4.C3878a;
import qf.C6658d;

public final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private final float f46460a;

    /* renamed from: b  reason: collision with root package name */
    private final float f46461b;

    /* renamed from: c  reason: collision with root package name */
    private final float f46462c;

    /* renamed from: d  reason: collision with root package name */
    private final float f46463d;

    /* renamed from: e  reason: collision with root package name */
    private final String f46464e;

    public d(float f10, float f11, float f12, float f13) {
        this.f46460a = f10;
        this.f46461b = f11;
        this.f46462c = f12;
        this.f46463d = f13;
        if (f10 < 0.0f || f11 < 0.0f || f12 < 0.0f || f13 < 0.0f) {
            throw new IllegalArgumentException("All radii must be >= 0.");
        }
        this.f46464e = d.class.getName() + '-' + f10 + ',' + f11 + ',' + f12 + ',' + f13;
    }

    private final Pair a(Bitmap bitmap, C3667i iVar) {
        int i10;
        if (C3660b.b(iVar)) {
            return C6502A.a(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        C3661c a10 = iVar.a();
        C3661c b10 = iVar.b();
        if ((a10 instanceof C3661c.a) && (b10 instanceof C3661c.a)) {
            return C6502A.a(Integer.valueOf(((C3661c.a) a10).f45103a), Integer.valueOf(((C3661c.a) b10).f45103a));
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C3661c d10 = iVar.d();
        int i11 = Integer.MIN_VALUE;
        if (d10 instanceof C3661c.a) {
            i10 = ((C3661c.a) d10).f45103a;
        } else {
            i10 = Integer.MIN_VALUE;
        }
        C3661c c10 = iVar.c();
        if (c10 instanceof C3661c.a) {
            i11 = ((C3661c.a) c10).f45103a;
        }
        double c11 = C3116i.c(width, height, i10, i11, C3666h.FILL);
        return C6502A.a(Integer.valueOf(a.c(((double) bitmap.getWidth()) * c11)), Integer.valueOf(a.c(c11 * ((double) bitmap.getHeight()))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f46460a == dVar.f46460a && this.f46461b == dVar.f46461b && this.f46462c == dVar.f46462c && this.f46463d == dVar.f46463d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String getCacheKey() {
        return this.f46464e;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f46460a) * 31) + Float.hashCode(this.f46461b)) * 31) + Float.hashCode(this.f46462c)) * 31) + Float.hashCode(this.f46463d);
    }

    public Object transform(Bitmap bitmap, C3667i iVar, C6658d dVar) {
        Paint paint = new Paint(3);
        Pair a10 = a(bitmap, iVar);
        int intValue = ((Number) a10.a()).intValue();
        int intValue2 = ((Number) a10.b()).intValue();
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, C3878a.c(bitmap));
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float c10 = (float) C3116i.c(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, C3666h.FILL);
        float f10 = (float) 2;
        matrix.setTranslate((((float) intValue) - (((float) bitmap.getWidth()) * c10)) / f10, (((float) intValue2) - (((float) bitmap.getHeight()) * c10)) / f10);
        matrix.preScale(c10, c10);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f11 = this.f46460a;
        float f12 = this.f46461b;
        float f13 = this.f46463d;
        float f14 = this.f46462c;
        float[] fArr = {f11, f11, f12, f12, f13, f13, f14, f14};
        RectF rectF = new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    public d(float f10) {
        this(f10, f10, f10, f10);
    }
}
