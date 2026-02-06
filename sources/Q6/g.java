package q6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class g extends Drawable implements Drawable.Callback, C3950D, C3949C, C3954c {

    /* renamed from: d  reason: collision with root package name */
    private static final Matrix f47645d = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    private Drawable f47646a;

    /* renamed from: b  reason: collision with root package name */
    private final C3955d f47647b = new C3955d();

    /* renamed from: c  reason: collision with root package name */
    protected C3950D f47648c;

    public g(Drawable drawable) {
        this.f47646a = drawable;
        C3956e.d(drawable, this, this);
    }

    public Drawable b() {
        return getCurrent();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void e(Matrix matrix) {
        u(matrix);
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public Drawable getCurrent() {
        return this.f47646a;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    public Drawable i(Drawable drawable) {
        return v(drawable);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    public void k(C3950D d10) {
        this.f47648c = d10;
    }

    public Drawable mutate() {
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return super.onLevelChange(i10);
        }
        return drawable.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public void q(RectF rectF) {
        C3950D d10 = this.f47648c;
        if (d10 != null) {
            d10.q(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f47647b.b(i10);
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f47647b.c(colorFilter);
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z10) {
        this.f47647b.d(z10);
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.setDither(z10);
        }
    }

    public void setFilterBitmap(boolean z10) {
        this.f47647b.e(z10);
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.setFilterBitmap(z10);
        }
    }

    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f47646a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f47646a;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z10, z11);
    }

    /* access modifiers changed from: protected */
    public void u(Matrix matrix) {
        C3950D d10 = this.f47648c;
        if (d10 != null) {
            d10.e(matrix);
        } else {
            matrix.reset();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public Drawable v(Drawable drawable) {
        Drawable w10 = w(drawable);
        invalidateSelf();
        return w10;
    }

    /* access modifiers changed from: protected */
    public Drawable w(Drawable drawable) {
        Drawable drawable2 = this.f47646a;
        C3956e.d(drawable2, (Drawable.Callback) null, (C3950D) null);
        C3956e.d(drawable, (Drawable.Callback) null, (C3950D) null);
        C3956e.e(drawable, this.f47647b);
        C3956e.a(drawable, this);
        C3956e.d(drawable, this, this);
        this.f47646a = drawable;
        return drawable2;
    }
}
