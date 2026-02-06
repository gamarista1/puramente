package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import ib.C5020g;
import ib.C5024k;

class c extends C5020g {

    /* renamed from: A  reason: collision with root package name */
    private final RectF f56229A;

    /* renamed from: z  reason: collision with root package name */
    private final Paint f56230z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c(C5024k kVar) {
        super(kVar == null ? new C5024k() : kVar);
        this.f56230z = new Paint(1);
        l0();
        this.f56229A = new RectF();
    }

    private void l0() {
        this.f56230z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f56230z.setColor(-1);
        this.f56230z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* access modifiers changed from: package-private */
    public boolean h0() {
        return !this.f56229A.isEmpty();
    }

    /* access modifiers changed from: package-private */
    public void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void j0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f56229A;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    public void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* access modifiers changed from: protected */
    public void r(Canvas canvas) {
        if (this.f56229A.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            boolean unused = canvas.clipOutRect(this.f56229A);
        } else {
            canvas.clipRect(this.f56229A, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }
}
