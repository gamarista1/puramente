package k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import q1.C2429a;

/* renamed from: k.a  reason: case insensitive filesystem */
public abstract class C2138a extends Drawable implements Drawable.Callback {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f23034a;

    public C2138a(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f23034a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f23034a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f23034a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f23034a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f23034a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f23034a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f23034a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f23034a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f23034a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f23034a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f23034a.getPadding(rect);
    }

    public int[] getState() {
        return this.f23034a.getState();
    }

    public Region getTransparentRegion() {
        return this.f23034a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C2429a.c(this.f23034a);
    }

    public boolean isStateful() {
        return this.f23034a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f23034a.jumpToCurrentState();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f23034a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i10) {
        return this.f23034a.setLevel(i10);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    public void setAlpha(int i10) {
        this.f23034a.setAlpha(i10);
    }

    public void setAutoMirrored(boolean z10) {
        C2429a.d(this.f23034a, z10);
    }

    public void setChangingConfigurations(int i10) {
        this.f23034a.setChangingConfigurations(i10);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f23034a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z10) {
        this.f23034a.setDither(z10);
    }

    public void setFilterBitmap(boolean z10) {
        this.f23034a.setFilterBitmap(z10);
    }

    public void setHotspot(float f10, float f11) {
        C2429a.e(this.f23034a, f10, f11);
    }

    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        C2429a.f(this.f23034a, i10, i11, i12, i13);
    }

    public boolean setState(int[] iArr) {
        return this.f23034a.setState(iArr);
    }

    public void setTint(int i10) {
        C2429a.h(this.f23034a, i10);
    }

    public void setTintList(ColorStateList colorStateList) {
        C2429a.i(this.f23034a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C2429a.j(this.f23034a, mode);
    }

    public boolean setVisible(boolean z10, boolean z11) {
        if (super.setVisible(z10, z11) || this.f23034a.setVisible(z10, z11)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
