package q6;

import T5.k;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import j7.b;
import java.util.Arrays;

public abstract class m extends Drawable implements i, C3949C {

    /* renamed from: A  reason: collision with root package name */
    private boolean f47697A = false;

    /* renamed from: B  reason: collision with root package name */
    private boolean f47698B = true;

    /* renamed from: C  reason: collision with root package name */
    private C3950D f47699C;

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f47700a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f47701b = false;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f47702c = false;

    /* renamed from: d  reason: collision with root package name */
    protected float f47703d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    protected final Path f47704e = new Path();

    /* renamed from: f  reason: collision with root package name */
    protected boolean f47705f = true;

    /* renamed from: g  reason: collision with root package name */
    protected int f47706g = 0;

    /* renamed from: h  reason: collision with root package name */
    protected final Path f47707h = new Path();

    /* renamed from: i  reason: collision with root package name */
    private final float[] f47708i = new float[8];

    /* renamed from: j  reason: collision with root package name */
    final float[] f47709j = new float[8];

    /* renamed from: k  reason: collision with root package name */
    float[] f47710k;

    /* renamed from: l  reason: collision with root package name */
    final RectF f47711l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    final RectF f47712m = new RectF();

    /* renamed from: n  reason: collision with root package name */
    final RectF f47713n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    final RectF f47714o = new RectF();

    /* renamed from: p  reason: collision with root package name */
    RectF f47715p;

    /* renamed from: q  reason: collision with root package name */
    final Matrix f47716q = new Matrix();

    /* renamed from: r  reason: collision with root package name */
    final Matrix f47717r = new Matrix();

    /* renamed from: s  reason: collision with root package name */
    final Matrix f47718s = new Matrix();

    /* renamed from: t  reason: collision with root package name */
    final Matrix f47719t = new Matrix();

    /* renamed from: u  reason: collision with root package name */
    final Matrix f47720u = new Matrix();

    /* renamed from: v  reason: collision with root package name */
    Matrix f47721v;

    /* renamed from: w  reason: collision with root package name */
    Matrix f47722w;

    /* renamed from: x  reason: collision with root package name */
    final Matrix f47723x = new Matrix();

    /* renamed from: y  reason: collision with root package name */
    private float f47724y = 0.0f;

    /* renamed from: z  reason: collision with root package name */
    private boolean f47725z = false;

    m(Drawable drawable) {
        this.f47700a = drawable;
    }

    private static Matrix a(Matrix matrix) {
        if (matrix == null) {
            return null;
        }
        return new Matrix(matrix);
    }

    private static boolean e(Matrix matrix, Matrix matrix2) {
        if (matrix == null && matrix2 == null) {
            return true;
        }
        if (matrix == null || matrix2 == null) {
            return false;
        }
        return matrix.equals(matrix2);
    }

    public boolean b() {
        return this.f47697A;
    }

    public void c(int i10, float f10) {
        if (this.f47706g != i10 || this.f47703d != f10) {
            this.f47706g = i10;
            this.f47703d = f10;
            this.f47698B = true;
            invalidateSelf();
        }
    }

    public void clearColorFilter() {
        this.f47700a.clearColorFilter();
    }

    public void d(boolean z10) {
        this.f47701b = z10;
        this.f47698B = true;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (b.d()) {
            b.a("RoundedDrawable#draw");
        }
        this.f47700a.draw(canvas);
        if (b.d()) {
            b.b();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        if (this.f47701b || this.f47702c || this.f47703d > 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void g() {
        float f10;
        float[] fArr;
        if (this.f47698B) {
            this.f47707h.reset();
            RectF rectF = this.f47711l;
            float f11 = this.f47703d;
            rectF.inset(f11 / 2.0f, f11 / 2.0f);
            if (this.f47701b) {
                this.f47707h.addCircle(this.f47711l.centerX(), this.f47711l.centerY(), Math.min(this.f47711l.width(), this.f47711l.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i10 = 0;
                while (true) {
                    fArr = this.f47709j;
                    if (i10 >= fArr.length) {
                        break;
                    }
                    fArr[i10] = (this.f47708i[i10] + this.f47724y) - (this.f47703d / 2.0f);
                    i10++;
                }
                this.f47707h.addRoundRect(this.f47711l, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f47711l;
            float f12 = this.f47703d;
            rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
            this.f47704e.reset();
            float f13 = this.f47724y;
            if (this.f47725z) {
                f10 = this.f47703d;
            } else {
                f10 = 0.0f;
            }
            float f14 = f13 + f10;
            this.f47711l.inset(f14, f14);
            if (this.f47701b) {
                this.f47704e.addCircle(this.f47711l.centerX(), this.f47711l.centerY(), Math.min(this.f47711l.width(), this.f47711l.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f47725z) {
                if (this.f47710k == null) {
                    this.f47710k = new float[8];
                }
                for (int i11 = 0; i11 < this.f47709j.length; i11++) {
                    this.f47710k[i11] = this.f47708i[i11] - this.f47703d;
                }
                this.f47704e.addRoundRect(this.f47711l, this.f47710k, Path.Direction.CW);
            } else {
                this.f47704e.addRoundRect(this.f47711l, this.f47708i, Path.Direction.CW);
            }
            float f15 = -f14;
            this.f47711l.inset(f15, f15);
            this.f47704e.setFillType(Path.FillType.WINDING);
            this.f47698B = false;
        }
    }

    public int getAlpha() {
        return this.f47700a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f47700a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f47700a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f47700a.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f47700a.getOpacity();
    }

    /* access modifiers changed from: protected */
    public void h() {
        Matrix matrix;
        Matrix matrix2;
        C3950D d10 = this.f47699C;
        if (d10 != null) {
            d10.e(this.f47718s);
            this.f47699C.q(this.f47711l);
        } else {
            this.f47718s.reset();
            this.f47711l.set(getBounds());
        }
        this.f47713n.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.f47714o.set(this.f47700a.getBounds());
        Matrix matrix3 = this.f47716q;
        RectF rectF = this.f47713n;
        RectF rectF2 = this.f47714o;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix3.setRectToRect(rectF, rectF2, scaleToFit);
        if (this.f47725z) {
            RectF rectF3 = this.f47715p;
            if (rectF3 == null) {
                this.f47715p = new RectF(this.f47711l);
            } else {
                rectF3.set(this.f47711l);
            }
            RectF rectF4 = this.f47715p;
            float f10 = this.f47703d;
            rectF4.inset(f10, f10);
            if (this.f47721v == null) {
                this.f47721v = new Matrix();
            }
            this.f47721v.setRectToRect(this.f47711l, this.f47715p, scaleToFit);
        } else {
            Matrix matrix4 = this.f47721v;
            if (matrix4 != null) {
                matrix4.reset();
            }
        }
        if (!this.f47718s.equals(this.f47719t) || !this.f47716q.equals(this.f47717r) || ((matrix2 = this.f47721v) != null && !e(matrix2, this.f47722w))) {
            this.f47705f = true;
            this.f47718s.invert(this.f47720u);
            this.f47723x.set(this.f47718s);
            if (this.f47725z && (matrix = this.f47721v) != null) {
                this.f47723x.postConcat(matrix);
            }
            this.f47723x.preConcat(this.f47716q);
            this.f47719t.set(this.f47718s);
            this.f47717r.set(this.f47716q);
            if (this.f47725z) {
                Matrix matrix5 = this.f47722w;
                if (matrix5 == null) {
                    this.f47722w = a(this.f47721v);
                } else {
                    matrix5.set(this.f47721v);
                }
            } else {
                Matrix matrix6 = this.f47722w;
                if (matrix6 != null) {
                    matrix6.reset();
                }
            }
        }
        if (!this.f47711l.equals(this.f47712m)) {
            this.f47698B = true;
            this.f47712m.set(this.f47711l);
        }
    }

    public void j(float f10) {
        if (this.f47724y != f10) {
            this.f47724y = f10;
            this.f47698B = true;
            invalidateSelf();
        }
    }

    public void k(C3950D d10) {
        this.f47699C = d10;
    }

    public void l(float f10) {
        boolean z10;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        boolean z11 = false;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.i(z10);
        Arrays.fill(this.f47708i, f10);
        if (i10 != 0) {
            z11 = true;
        }
        this.f47702c = z11;
        this.f47698B = true;
        invalidateSelf();
    }

    public void o(boolean z10) {
        if (this.f47697A != z10) {
            this.f47697A = z10;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f47700a.setBounds(rect);
    }

    public void p(boolean z10) {
        if (this.f47725z != z10) {
            this.f47725z = z10;
            this.f47698B = true;
            invalidateSelf();
        }
    }

    public void setAlpha(int i10) {
        this.f47700a.setAlpha(i10);
    }

    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        this.f47700a.setColorFilter(i10, mode);
    }

    public void t(float[] fArr) {
        boolean z10;
        boolean z11;
        if (fArr == null) {
            Arrays.fill(this.f47708i, 0.0f);
            this.f47702c = false;
        } else {
            if (fArr.length == 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            k.c(z10, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f47708i, 0, 8);
            this.f47702c = false;
            for (int i10 = 0; i10 < 8; i10++) {
                boolean z12 = this.f47702c;
                if (fArr[i10] > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f47702c = z12 | z11;
            }
        }
        this.f47698B = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f47700a.setColorFilter(colorFilter);
    }

    public void m(boolean z10) {
    }
}
