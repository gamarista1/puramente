package c4;

import Af.a;
import a4.C3116i;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import k4.C3666h;

/* renamed from: c4.d  reason: case insensitive filesystem */
public final class C3168d extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f36414a;

    /* renamed from: b  reason: collision with root package name */
    private final C3666h f36415b;

    /* renamed from: c  reason: collision with root package name */
    private float f36416c;

    /* renamed from: d  reason: collision with root package name */
    private float f36417d;

    /* renamed from: e  reason: collision with root package name */
    private float f36418e = 1.0f;

    public C3168d(Drawable drawable, C3666h hVar) {
        this.f36414a = drawable;
        this.f36415b = hVar;
        drawable.setCallback(this);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.f36416c, this.f36417d);
            float f10 = this.f36418e;
            canvas.scale(f10, f10);
            this.f36414a.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public int getAlpha() {
        return this.f36414a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f36414a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f36414a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f36414a.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f36414a.getOpacity();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isRunning() {
        Drawable drawable = this.f36414a;
        if (!(drawable instanceof Animatable) || !((Animatable) drawable).isRunning()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        int intrinsicWidth = this.f36414a.getIntrinsicWidth();
        int intrinsicHeight = this.f36414a.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.f36414a.setBounds(rect);
            this.f36416c = 0.0f;
            this.f36417d = 0.0f;
            this.f36418e = 1.0f;
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c10 = C3116i.c(intrinsicWidth, intrinsicHeight, width, height, this.f36415b);
        double d10 = (double) 2;
        int c11 = a.c((((double) width) - (((double) intrinsicWidth) * c10)) / d10);
        int c12 = a.c((((double) height) - (((double) intrinsicHeight) * c10)) / d10);
        this.f36414a.setBounds(c11, c12, intrinsicWidth + c11, intrinsicHeight + c12);
        this.f36416c = (float) rect.left;
        this.f36417d = (float) rect.top;
        this.f36418e = (float) c10;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f36414a.setLevel(i10);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f36414a.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f36414a.setAlpha(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f36414a.setColorFilter(colorFilter);
    }

    public void setTint(int i10) {
        this.f36414a.setTint(i10);
    }

    public void setTintBlendMode(BlendMode blendMode) {
        this.f36414a.setTintBlendMode(blendMode);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f36414a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f36414a.setTintMode(mode);
    }

    public void start() {
        Drawable drawable = this.f36414a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void stop() {
        Drawable drawable = this.f36414a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
