package q6;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

public class k extends Drawable implements i {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f47661a = new float[8];

    /* renamed from: b  reason: collision with root package name */
    final float[] f47662b = new float[8];

    /* renamed from: c  reason: collision with root package name */
    float[] f47663c;

    /* renamed from: d  reason: collision with root package name */
    final Paint f47664d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private boolean f47665e = false;

    /* renamed from: f  reason: collision with root package name */
    private float f47666f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    private float f47667g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    private int f47668h = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f47669i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47670j = false;

    /* renamed from: k  reason: collision with root package name */
    final Path f47671k = new Path();

    /* renamed from: l  reason: collision with root package name */
    final Path f47672l = new Path();

    /* renamed from: m  reason: collision with root package name */
    private int f47673m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f47674n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    private int f47675o = 255;

    public k(int i10) {
        e(i10);
    }

    public static k a(ColorDrawable colorDrawable) {
        return new k(colorDrawable.getColor());
    }

    private void f() {
        float f10;
        float[] fArr;
        float[] fArr2;
        this.f47671k.reset();
        this.f47672l.reset();
        this.f47674n.set(getBounds());
        RectF rectF = this.f47674n;
        float f11 = this.f47666f;
        rectF.inset(f11 / 2.0f, f11 / 2.0f);
        int i10 = 0;
        if (this.f47665e) {
            this.f47672l.addCircle(this.f47674n.centerX(), this.f47674n.centerY(), Math.min(this.f47674n.width(), this.f47674n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i11 = 0;
            while (true) {
                fArr2 = this.f47662b;
                if (i11 >= fArr2.length) {
                    break;
                }
                fArr2[i11] = (this.f47661a[i11] + this.f47667g) - (this.f47666f / 2.0f);
                i11++;
            }
            this.f47672l.addRoundRect(this.f47674n, fArr2, Path.Direction.CW);
        }
        RectF rectF2 = this.f47674n;
        float f12 = this.f47666f;
        rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
        float f13 = this.f47667g;
        if (this.f47669i) {
            f10 = this.f47666f;
        } else {
            f10 = 0.0f;
        }
        float f14 = f13 + f10;
        this.f47674n.inset(f14, f14);
        if (this.f47665e) {
            this.f47671k.addCircle(this.f47674n.centerX(), this.f47674n.centerY(), Math.min(this.f47674n.width(), this.f47674n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f47669i) {
            if (this.f47663c == null) {
                this.f47663c = new float[8];
            }
            while (true) {
                fArr = this.f47663c;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = this.f47661a[i10] - this.f47666f;
                i10++;
            }
            this.f47671k.addRoundRect(this.f47674n, fArr, Path.Direction.CW);
        } else {
            this.f47671k.addRoundRect(this.f47674n, this.f47661a, Path.Direction.CW);
        }
        float f15 = -f14;
        this.f47674n.inset(f15, f15);
    }

    public boolean b() {
        return this.f47670j;
    }

    public void c(int i10, float f10) {
        if (this.f47668h != i10) {
            this.f47668h = i10;
            invalidateSelf();
        }
        if (this.f47666f != f10) {
            this.f47666f = f10;
            f();
            invalidateSelf();
        }
    }

    public void d(boolean z10) {
        this.f47665e = z10;
        f();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f47664d.setColor(C3956e.c(this.f47673m, this.f47675o));
        this.f47664d.setStyle(Paint.Style.FILL);
        this.f47664d.setFilterBitmap(b());
        canvas.drawPath(this.f47671k, this.f47664d);
        if (this.f47666f != 0.0f) {
            this.f47664d.setColor(C3956e.c(this.f47668h, this.f47675o));
            this.f47664d.setStyle(Paint.Style.STROKE);
            this.f47664d.setStrokeWidth(this.f47666f);
            canvas.drawPath(this.f47672l, this.f47664d);
        }
    }

    public void e(int i10) {
        if (this.f47673m != i10) {
            this.f47673m = i10;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f47675o;
    }

    public int getOpacity() {
        return C3956e.b(C3956e.c(this.f47673m, this.f47675o));
    }

    public void j(float f10) {
        if (this.f47667g != f10) {
            this.f47667g = f10;
            f();
            invalidateSelf();
        }
    }

    public void l(float f10) {
        boolean z10;
        if (f10 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        T5.k.c(z10, "radius should be non negative");
        Arrays.fill(this.f47661a, f10);
        f();
        invalidateSelf();
    }

    public void o(boolean z10) {
        if (this.f47670j != z10) {
            this.f47670j = z10;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f();
    }

    public void p(boolean z10) {
        if (this.f47669i != z10) {
            this.f47669i = z10;
            f();
            invalidateSelf();
        }
    }

    public void setAlpha(int i10) {
        if (i10 != this.f47675o) {
            this.f47675o = i10;
            invalidateSelf();
        }
    }

    public void t(float[] fArr) {
        boolean z10;
        if (fArr == null) {
            Arrays.fill(this.f47661a, 0.0f);
        } else {
            if (fArr.length == 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            T5.k.c(z10, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f47661a, 0, 8);
        }
        f();
        invalidateSelf();
    }

    public void m(boolean z10) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
