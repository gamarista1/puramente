package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private float f12063a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f12064b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f12065c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f12066d;

    /* renamed from: e  reason: collision with root package name */
    private float f12067e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12068f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12069g = true;

    /* renamed from: h  reason: collision with root package name */
    private ColorStateList f12070h;

    /* renamed from: i  reason: collision with root package name */
    private PorterDuffColorFilter f12071i;

    /* renamed from: j  reason: collision with root package name */
    private ColorStateList f12072j;

    /* renamed from: k  reason: collision with root package name */
    private PorterDuff.Mode f12073k = PorterDuff.Mode.SRC_IN;

    d(ColorStateList colorStateList, float f10) {
        this.f12063a = f10;
        this.f12064b = new Paint(5);
        e(colorStateList);
        this.f12065c = new RectF();
        this.f12066d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f12070h = colorStateList;
        this.f12064b.setColor(colorStateList.getColorForState(getState(), this.f12070h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f12065c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f12066d.set(rect);
        if (this.f12068f) {
            float b10 = e.b(this.f12067e, this.f12063a, this.f12069g);
            this.f12066d.inset((int) Math.ceil((double) e.a(this.f12067e, this.f12063a, this.f12069g)), (int) Math.ceil((double) b10));
            this.f12065c.set(this.f12066d);
        }
    }

    public ColorStateList b() {
        return this.f12070h;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f12067e;
    }

    public float d() {
        return this.f12063a;
    }

    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f12064b;
        if (this.f12071i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f12071i);
            z10 = true;
        }
        RectF rectF = this.f12065c;
        float f10 = this.f12063a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void g(float f10, boolean z10, boolean z11) {
        if (f10 != this.f12067e || this.f12068f != z10 || this.f12069g != z11) {
            this.f12067e = f10;
            this.f12068f = z10;
            this.f12069g = z11;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f12066d, this.f12063a);
    }

    /* access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 != this.f12063a) {
            this.f12063a = f10;
            i((Rect) null);
            invalidateSelf();
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f12072j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f12070h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f12070h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f12064b.getColor()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f12064b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f12072j;
        if (colorStateList2 == null || (mode = this.f12073k) == null) {
            return z10;
        }
        this.f12071i = a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i10) {
        this.f12064b.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12064b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f12072j = colorStateList;
        this.f12071i = a(colorStateList, this.f12073k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f12073k = mode;
        this.f12071i = a(this.f12072j, mode);
        invalidateSelf();
    }
}
