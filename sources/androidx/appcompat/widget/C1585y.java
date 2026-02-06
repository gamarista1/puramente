package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.C1680b0;
import i.j;
import q1.C2429a;

/* renamed from: androidx.appcompat.widget.y  reason: case insensitive filesystem */
class C1585y extends C1580t {

    /* renamed from: d  reason: collision with root package name */
    private final SeekBar f12015d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f12016e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f12017f = null;

    /* renamed from: g  reason: collision with root package name */
    private PorterDuff.Mode f12018g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12019h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f12020i = false;

    C1585y(SeekBar seekBar) {
        super(seekBar);
        this.f12015d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f12016e;
        if (drawable == null) {
            return;
        }
        if (this.f12019h || this.f12020i) {
            Drawable l10 = C2429a.l(drawable.mutate());
            this.f12016e = l10;
            if (this.f12019h) {
                C2429a.i(l10, this.f12017f);
            }
            if (this.f12020i) {
                C2429a.j(this.f12016e, this.f12018g);
            }
            if (this.f12016e.isStateful()) {
                this.f12016e.setState(this.f12015d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(AttributeSet attributeSet, int i10) {
        super.c(attributeSet, i10);
        g0 v10 = g0.v(this.f12015d.getContext(), attributeSet, j.f21526T, i10, 0);
        SeekBar seekBar = this.f12015d;
        C1680b0.m0(seekBar, seekBar.getContext(), j.f21526T, attributeSet, v10.r(), i10, 0);
        Drawable h10 = v10.h(j.f21530U);
        if (h10 != null) {
            this.f12015d.setThumb(h10);
        }
        j(v10.g(j.f21534V));
        if (v10.s(j.f21542X)) {
            this.f12018g = N.e(v10.k(j.f21542X, -1), this.f12018g);
            this.f12020i = true;
        }
        if (v10.s(j.f21538W)) {
            this.f12017f = v10.c(j.f21538W);
            this.f12019h = true;
        }
        v10.x();
        f();
    }

    /* access modifiers changed from: package-private */
    public void g(Canvas canvas) {
        int i10;
        if (this.f12016e != null) {
            int max = this.f12015d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f12016e.getIntrinsicWidth();
                int intrinsicHeight = this.f12016e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f12016e.setBounds(-i10, -i11, i10, i11);
                float width = ((float) ((this.f12015d.getWidth() - this.f12015d.getPaddingLeft()) - this.f12015d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f12015d.getPaddingLeft(), (float) (this.f12015d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f12016e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        Drawable drawable = this.f12016e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f12015d.getDrawableState())) {
            this.f12015d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        Drawable drawable = this.f12016e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Drawable drawable) {
        Drawable drawable2 = this.f12016e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f12016e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f12015d);
            C2429a.g(drawable, this.f12015d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f12015d.getDrawableState());
            }
            f();
        }
        this.f12015d.invalidate();
    }
}
