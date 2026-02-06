package q6;

import T5.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

public class l extends g implements i {

    /* renamed from: e  reason: collision with root package name */
    b f47676e = b.OVERLAY_COLOR;

    /* renamed from: f  reason: collision with root package name */
    private final RectF f47677f = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private RectF f47678g;

    /* renamed from: h  reason: collision with root package name */
    private Matrix f47679h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f47680i = new float[8];

    /* renamed from: j  reason: collision with root package name */
    final float[] f47681j = new float[8];

    /* renamed from: k  reason: collision with root package name */
    final Paint f47682k = new Paint(1);

    /* renamed from: l  reason: collision with root package name */
    private boolean f47683l = false;

    /* renamed from: m  reason: collision with root package name */
    private float f47684m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    private int f47685n = 0;

    /* renamed from: o  reason: collision with root package name */
    private int f47686o = 0;

    /* renamed from: p  reason: collision with root package name */
    private float f47687p = 0.0f;

    /* renamed from: q  reason: collision with root package name */
    private boolean f47688q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f47689r = false;

    /* renamed from: s  reason: collision with root package name */
    private final Path f47690s = new Path();

    /* renamed from: t  reason: collision with root package name */
    private final Path f47691t = new Path();

    /* renamed from: u  reason: collision with root package name */
    private final RectF f47692u = new RectF();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47693a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                q6.l$b[] r0 = q6.l.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47693a = r0
                q6.l$b r1 = q6.l.b.CLIPPING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47693a     // Catch:{ NoSuchFieldError -> 0x001d }
                q6.l$b r1 = q6.l.b.OVERLAY_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.l.a.<clinit>():void");
        }
    }

    public enum b {
        OVERLAY_COLOR,
        CLIPPING
    }

    public l(Drawable drawable) {
        super((Drawable) k.g(drawable));
    }

    private void z() {
        float[] fArr;
        this.f47690s.reset();
        this.f47691t.reset();
        this.f47692u.set(getBounds());
        RectF rectF = this.f47692u;
        float f10 = this.f47687p;
        rectF.inset(f10, f10);
        if (this.f47676e == b.OVERLAY_COLOR) {
            this.f47690s.addRect(this.f47692u, Path.Direction.CW);
        }
        if (this.f47683l) {
            this.f47690s.addCircle(this.f47692u.centerX(), this.f47692u.centerY(), Math.min(this.f47692u.width(), this.f47692u.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f47690s.addRoundRect(this.f47692u, this.f47680i, Path.Direction.CW);
        }
        RectF rectF2 = this.f47692u;
        float f11 = this.f47687p;
        rectF2.inset(-f11, -f11);
        RectF rectF3 = this.f47692u;
        float f12 = this.f47684m;
        rectF3.inset(f12 / 2.0f, f12 / 2.0f);
        if (this.f47683l) {
            this.f47691t.addCircle(this.f47692u.centerX(), this.f47692u.centerY(), Math.min(this.f47692u.width(), this.f47692u.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i10 = 0;
            while (true) {
                fArr = this.f47681j;
                if (i10 >= fArr.length) {
                    break;
                }
                fArr[i10] = (this.f47680i[i10] + this.f47687p) - (this.f47684m / 2.0f);
                i10++;
            }
            this.f47691t.addRoundRect(this.f47692u, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f47692u;
        float f13 = this.f47684m;
        rectF4.inset((-f13) / 2.0f, (-f13) / 2.0f);
    }

    public void c(int i10, float f10) {
        this.f47685n = i10;
        this.f47684m = f10;
        z();
        invalidateSelf();
    }

    public void d(boolean z10) {
        this.f47683l = z10;
        z();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f47677f.set(getBounds());
        int i10 = a.f47693a[this.f47676e.ordinal()];
        if (i10 == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f47690s);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i10 == 2) {
            if (this.f47688q) {
                RectF rectF = this.f47678g;
                if (rectF == null) {
                    this.f47678g = new RectF(this.f47677f);
                    this.f47679h = new Matrix();
                } else {
                    rectF.set(this.f47677f);
                }
                RectF rectF2 = this.f47678g;
                float f10 = this.f47684m;
                rectF2.inset(f10, f10);
                Matrix matrix = this.f47679h;
                if (matrix != null) {
                    matrix.setRectToRect(this.f47677f, this.f47678g, Matrix.ScaleToFit.FILL);
                }
                int save2 = canvas.save();
                canvas.clipRect(this.f47677f);
                canvas.concat(this.f47679h);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f47682k.setStyle(Paint.Style.FILL);
            this.f47682k.setColor(this.f47686o);
            this.f47682k.setStrokeWidth(0.0f);
            this.f47682k.setFilterBitmap(x());
            this.f47690s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f47690s, this.f47682k);
            if (this.f47683l) {
                float width = ((this.f47677f.width() - this.f47677f.height()) + this.f47684m) / 2.0f;
                float height = ((this.f47677f.height() - this.f47677f.width()) + this.f47684m) / 2.0f;
                if (width > 0.0f) {
                    RectF rectF3 = this.f47677f;
                    float f11 = rectF3.left;
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(f11, rectF3.top, f11 + width, rectF3.bottom, this.f47682k);
                    RectF rectF4 = this.f47677f;
                    float f12 = rectF4.right;
                    canvas2.drawRect(f12 - width, rectF4.top, f12, rectF4.bottom, this.f47682k);
                }
                if (height > 0.0f) {
                    RectF rectF5 = this.f47677f;
                    float f13 = rectF5.left;
                    float f14 = rectF5.top;
                    Canvas canvas3 = canvas;
                    canvas3.drawRect(f13, f14, rectF5.right, f14 + height, this.f47682k);
                    RectF rectF6 = this.f47677f;
                    float f15 = rectF6.left;
                    float f16 = rectF6.bottom;
                    canvas3.drawRect(f15, f16 - height, rectF6.right, f16, this.f47682k);
                }
            }
        }
        if (this.f47685n != 0) {
            this.f47682k.setStyle(Paint.Style.STROKE);
            this.f47682k.setColor(this.f47685n);
            this.f47682k.setStrokeWidth(this.f47684m);
            this.f47690s.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f47691t, this.f47682k);
        }
    }

    public void j(float f10) {
        this.f47687p = f10;
        z();
        invalidateSelf();
    }

    public void l(float f10) {
        Arrays.fill(this.f47680i, f10);
        z();
        invalidateSelf();
    }

    public void o(boolean z10) {
        if (this.f47689r != z10) {
            this.f47689r = z10;
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        z();
    }

    public void p(boolean z10) {
        this.f47688q = z10;
        z();
        invalidateSelf();
    }

    public void t(float[] fArr) {
        boolean z10;
        if (fArr == null) {
            Arrays.fill(this.f47680i, 0.0f);
        } else {
            if (fArr.length == 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            k.c(z10, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f47680i, 0, 8);
        }
        z();
        invalidateSelf();
    }

    public boolean x() {
        return this.f47689r;
    }

    public void y(int i10) {
        this.f47686o = i10;
        invalidateSelf();
    }

    public void m(boolean z10) {
    }
}
