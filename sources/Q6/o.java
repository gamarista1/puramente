package q6;

import T5.i;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class o extends g {

    /* renamed from: e  reason: collision with root package name */
    q f47726e;

    /* renamed from: f  reason: collision with root package name */
    Object f47727f;

    /* renamed from: g  reason: collision with root package name */
    PointF f47728g = null;

    /* renamed from: h  reason: collision with root package name */
    int f47729h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f47730i = 0;

    /* renamed from: j  reason: collision with root package name */
    Matrix f47731j;

    /* renamed from: k  reason: collision with root package name */
    private Matrix f47732k = new Matrix();

    public o(Drawable drawable, q qVar) {
        super(drawable);
        this.f47726e = qVar;
    }

    private void y() {
        Drawable current = getCurrent();
        if (current != null) {
            if (this.f47729h != current.getIntrinsicWidth() || this.f47730i != current.getIntrinsicHeight()) {
                x();
            }
        }
    }

    public q A() {
        return this.f47726e;
    }

    public void B(PointF pointF) {
        if (!i.a(this.f47728g, pointF)) {
            if (pointF == null) {
                this.f47728g = null;
            } else {
                if (this.f47728g == null) {
                    this.f47728g = new PointF();
                }
                this.f47728g.set(pointF);
            }
            x();
            invalidateSelf();
        }
    }

    public void C(q qVar) {
        if (!i.a(this.f47726e, qVar)) {
            this.f47726e = qVar;
            this.f47727f = null;
            x();
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        y();
        if (this.f47731j != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f47731j);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public void e(Matrix matrix) {
        u(matrix);
        y();
        Matrix matrix2 = this.f47731j;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        x();
    }

    public Drawable v(Drawable drawable) {
        Drawable v10 = super.v(drawable);
        x();
        return v10;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        float f10;
        float f11;
        Drawable current = getCurrent();
        if (current == null) {
            this.f47730i = 0;
            this.f47729h = 0;
            this.f47731j = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f47729h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f47730i = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f47731j = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f47731j = null;
        } else if (this.f47726e == q.f47733a) {
            current.setBounds(bounds);
            this.f47731j = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f47732k.reset();
            q qVar = this.f47726e;
            Matrix matrix = this.f47732k;
            PointF pointF = this.f47728g;
            if (pointF != null) {
                f10 = pointF.x;
            } else {
                f10 = 0.5f;
            }
            if (pointF != null) {
                f11 = pointF.y;
            } else {
                f11 = 0.5f;
            }
            qVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, f10, f11);
            this.f47731j = this.f47732k;
        }
    }

    public PointF z() {
        return this.f47728g;
    }
}
