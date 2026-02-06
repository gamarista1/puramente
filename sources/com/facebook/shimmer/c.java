package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class c extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f42474a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final Paint f42475b;

    /* renamed from: c  reason: collision with root package name */
    private final Rect f42476c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f42477d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f42478e;

    /* renamed from: f  reason: collision with root package name */
    private b f42479f;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.invalidateSelf();
        }
    }

    public c() {
        Paint paint = new Paint();
        this.f42475b = paint;
        this.f42476c = new Rect();
        this.f42477d = new Matrix();
        paint.setAntiAlias(true);
    }

    private float c(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Rect r1 = r19.getBounds()
            int r2 = r1.width()
            int r1 = r1.height()
            if (r2 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            com.facebook.shimmer.b r3 = r0.f42479f
            if (r3 != 0) goto L_0x0017
            goto L_0x0078
        L_0x0017:
            int r2 = r3.d(r2)
            com.facebook.shimmer.b r3 = r0.f42479f
            int r1 = r3.a(r1)
            com.facebook.shimmer.b r3 = r0.f42479f
            int r4 = r3.f42458g
            r5 = 1
            if (r4 == r5) goto L_0x004c
            int r3 = r3.f42455d
            r4 = 0
            if (r3 == r5) goto L_0x0032
            r6 = 3
            if (r3 != r6) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r5 == 0) goto L_0x0035
            r2 = r4
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = r4
        L_0x0039:
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            float r6 = (float) r2
            float r7 = (float) r1
            com.facebook.shimmer.b r1 = r0.f42479f
            int[] r8 = r1.f42453b
            float[] r9 = r1.f42452a
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r4 = 0
            r5 = 0
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0073
        L_0x004c:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r13 = r3 / r4
            float r3 = (float) r1
            float r14 = r3 / r4
            int r1 = java.lang.Math.max(r2, r1)
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.sqrt(r3)
            double r1 = r1 / r3
            float r15 = (float) r1
            com.facebook.shimmer.b r1 = r0.f42479f
            int[] r2 = r1.f42453b
            float[] r1 = r1.f42452a
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r12 = r11
            r16 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0073:
            android.graphics.Paint r1 = r0.f42475b
            r1.setShader(r11)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.c.g():void");
    }

    private void h() {
        boolean z10;
        if (this.f42479f != null) {
            ValueAnimator valueAnimator = this.f42478e;
            if (valueAnimator != null) {
                z10 = valueAnimator.isStarted();
                this.f42478e.cancel();
                this.f42478e.removeAllUpdateListeners();
            } else {
                z10 = false;
            }
            b bVar = this.f42479f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (bVar.f42472u / bVar.f42471t)) + 1.0f});
            this.f42478e = ofFloat;
            ofFloat.setRepeatMode(this.f42479f.f42470s);
            this.f42478e.setRepeatCount(this.f42479f.f42469r);
            ValueAnimator valueAnimator2 = this.f42478e;
            b bVar2 = this.f42479f;
            valueAnimator2.setDuration(bVar2.f42471t + bVar2.f42472u);
            this.f42478e.addUpdateListener(this.f42474a);
            if (z10) {
                this.f42478e.start();
            }
        }
    }

    public boolean a() {
        ValueAnimator valueAnimator = this.f42478e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        b bVar;
        ValueAnimator valueAnimator = this.f42478e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (bVar = this.f42479f) != null && bVar.f42467p && getCallback() != null) {
            this.f42478e.start();
        }
    }

    public void d(b bVar) {
        PorterDuff.Mode mode;
        this.f42479f = bVar;
        if (bVar != null) {
            Paint paint = this.f42475b;
            if (this.f42479f.f42468q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        g();
        h();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f10;
        float f11;
        float c10;
        if (this.f42479f != null && this.f42475b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f42479f.f42465n));
            float height = ((float) this.f42476c.height()) + (((float) this.f42476c.width()) * tan);
            float width = ((float) this.f42476c.width()) + (tan * ((float) this.f42476c.height()));
            ValueAnimator valueAnimator = this.f42478e;
            float f12 = 0.0f;
            if (valueAnimator != null) {
                f10 = valueAnimator.getAnimatedFraction();
            } else {
                f10 = 0.0f;
            }
            int i10 = this.f42479f.f42455d;
            if (i10 != 1) {
                if (i10 == 2) {
                    c10 = c(width, -width, f10);
                } else if (i10 != 3) {
                    c10 = c(-width, width, f10);
                } else {
                    f11 = c(height, -height, f10);
                }
                f12 = c10;
                f11 = 0.0f;
            } else {
                f11 = c(-height, height, f10);
            }
            this.f42477d.reset();
            this.f42477d.setRotate(this.f42479f.f42465n, ((float) this.f42476c.width()) / 2.0f, ((float) this.f42476c.height()) / 2.0f);
            this.f42477d.postTranslate(f12, f11);
            this.f42475b.getShader().setLocalMatrix(this.f42477d);
            canvas.drawRect(this.f42476c, this.f42475b);
        }
    }

    public void e() {
        if (this.f42478e != null && !a() && getCallback() != null) {
            this.f42478e.start();
        }
    }

    public void f() {
        if (this.f42478e != null && a()) {
            this.f42478e.cancel();
        }
    }

    public int getOpacity() {
        b bVar = this.f42479f;
        if (bVar == null || (!bVar.f42466o && !bVar.f42468q)) {
            return -1;
        }
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42476c.set(0, 0, rect.width(), rect.height());
        g();
        b();
    }

    public void setAlpha(int i10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
