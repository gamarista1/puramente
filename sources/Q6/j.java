package q6;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import j7.b;
import java.lang.ref.WeakReference;

public class j extends m {

    /* renamed from: X  reason: collision with root package name */
    private static boolean f47654X = false;

    /* renamed from: D  reason: collision with root package name */
    private final Paint f47655D;

    /* renamed from: E  reason: collision with root package name */
    private final Paint f47656E;

    /* renamed from: F  reason: collision with root package name */
    private final Bitmap f47657F;

    /* renamed from: G  reason: collision with root package name */
    private WeakReference f47658G;

    /* renamed from: H  reason: collision with root package name */
    private boolean f47659H;

    /* renamed from: I  reason: collision with root package name */
    private RectF f47660I = null;

    public j(Resources resources, Bitmap bitmap, Paint paint, boolean z10) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.f47655D = paint2;
        Paint paint3 = new Paint(1);
        this.f47656E = paint3;
        this.f47657F = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
        this.f47659H = z10;
    }

    public static boolean i() {
        return f47654X;
    }

    private void n() {
        Shader shader;
        WeakReference weakReference = this.f47658G;
        if (weakReference == null || weakReference.get() != this.f47657F) {
            this.f47658G = new WeakReference(this.f47657F);
            if (this.f47657F != null) {
                Paint paint = this.f47655D;
                Bitmap bitmap = this.f47657F;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                this.f47705f = true;
            }
        }
        if (this.f47705f && (shader = this.f47655D.getShader()) != null) {
            shader.setLocalMatrix(this.f47723x);
            this.f47705f = false;
        }
        this.f47655D.setFilterBitmap(b());
    }

    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedBitmapDrawable#draw");
        }
        if (!f()) {
            super.draw(canvas);
            if (b.d()) {
                b.b();
                return;
            }
            return;
        }
        h();
        g();
        n();
        int save = canvas.save();
        canvas.concat(this.f47720u);
        if (this.f47659H || this.f47660I == null) {
            canvas.drawPath(this.f47704e, this.f47655D);
        } else {
            int save2 = canvas.save();
            canvas.clipRect(this.f47660I);
            canvas.drawPath(this.f47704e, this.f47655D);
            canvas.restoreToCount(save2);
        }
        float f10 = this.f47703d;
        if (f10 > 0.0f) {
            this.f47656E.setStrokeWidth(f10);
            this.f47656E.setColor(C3956e.c(this.f47706g, this.f47655D.getAlpha()));
            canvas.drawPath(this.f47707h, this.f47656E);
        }
        canvas.restoreToCount(save);
        if (b.d()) {
            b.b();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        if (!super.f() || this.f47657F == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void h() {
        super.h();
        if (!this.f47659H) {
            if (this.f47660I == null) {
                this.f47660I = new RectF();
            }
            this.f47723x.mapRect(this.f47660I, this.f47713n);
        }
    }

    public void m(boolean z10) {
        this.f47659H = z10;
    }

    public void setAlpha(int i10) {
        super.setAlpha(i10);
        if (i10 != this.f47655D.getAlpha()) {
            this.f47655D.setAlpha(i10);
            super.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f47655D.setColorFilter(colorFilter);
    }
}
