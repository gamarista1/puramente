package q6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class h extends g {

    /* renamed from: e  reason: collision with root package name */
    final Matrix f47649e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    private int f47650f;

    /* renamed from: g  reason: collision with root package name */
    private int f47651g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f47652h = new Matrix();

    /* renamed from: i  reason: collision with root package name */
    private final RectF f47653i = new RectF();

    public h(Drawable drawable, int i10, int i11) {
        super(drawable);
        this.f47650f = i10 - (i10 % 90);
        this.f47651g = (i11 < 0 || i11 > 8) ? 0 : i11;
    }

    public void draw(Canvas canvas) {
        int i10;
        if (this.f47650f > 0 || !((i10 = this.f47651g) == 0 || i10 == 1)) {
            int save = canvas.save();
            canvas.concat(this.f47649e);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public void e(Matrix matrix) {
        u(matrix);
        if (!this.f47649e.isIdentity()) {
            matrix.preConcat(this.f47649e);
        }
    }

    public int getIntrinsicHeight() {
        int i10 = this.f47651g;
        if (i10 == 5 || i10 == 7 || this.f47650f % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        int i10 = this.f47651g;
        if (i10 == 5 || i10 == 7 || this.f47650f % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int i10;
        Drawable current = getCurrent();
        if (current != null) {
            int i11 = this.f47650f;
            if (i11 > 0 || !((i10 = this.f47651g) == 0 || i10 == 1)) {
                int i12 = this.f47651g;
                if (i12 == 2) {
                    this.f47649e.setScale(-1.0f, 1.0f);
                } else if (i12 == 7) {
                    this.f47649e.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                    this.f47649e.postScale(-1.0f, 1.0f);
                } else if (i12 == 4) {
                    this.f47649e.setScale(1.0f, -1.0f);
                } else if (i12 != 5) {
                    this.f47649e.setRotate((float) i11, (float) rect.centerX(), (float) rect.centerY());
                } else {
                    this.f47649e.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                    this.f47649e.postScale(1.0f, -1.0f);
                }
                this.f47652h.reset();
                this.f47649e.invert(this.f47652h);
                this.f47653i.set(rect);
                this.f47652h.mapRect(this.f47653i);
                RectF rectF = this.f47653i;
                current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                return;
            }
            current.setBounds(rect);
        }
    }
}
