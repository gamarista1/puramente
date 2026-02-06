package hb;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p1.C2387c;

/* renamed from: hb.a  reason: case insensitive filesystem */
public class C5009a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f60655i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f60656j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f60657k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f60658l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f60659a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f60660b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f60661c;

    /* renamed from: d  reason: collision with root package name */
    private int f60662d;

    /* renamed from: e  reason: collision with root package name */
    private int f60663e;

    /* renamed from: f  reason: collision with root package name */
    private int f60664f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f60665g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f60666h;

    public C5009a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        boolean z10;
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i11 = i10;
        float f12 = f11;
        if (f12 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = this.f60665g;
        if (z10) {
            int[] iArr = f60657k;
            iArr[0] = 0;
            iArr[1] = this.f60664f;
            iArr[2] = this.f60663e;
            iArr[3] = this.f60662d;
            float f13 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f10, f12);
            path.close();
            float f14 = (float) (-i11);
            rectF2.inset(f14, f14);
            int[] iArr2 = f60657k;
            iArr2[0] = 0;
            iArr2[1] = this.f60662d;
            iArr2[2] = this.f60663e;
            iArr2[3] = this.f60664f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f15 = 1.0f - (((float) i11) / width);
            float[] fArr = f60658l;
            fArr[1] = f15;
            fArr[2] = ((1.0f - f15) / 2.0f) + f15;
            this.f60660b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f60657k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.f60666h);
            }
            canvas.drawArc(rectF, f10, f11, true, this.f60660b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += (float) i10;
        rectF.offset(0.0f, (float) (-i10));
        int[] iArr = f60655i;
        iArr[0] = this.f60664f;
        iArr[1] = this.f60663e;
        iArr[2] = this.f60662d;
        Paint paint = this.f60661c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f60656j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f60661c);
        canvas.restore();
    }

    public Paint c() {
        return this.f60659a;
    }

    public void d(int i10) {
        this.f60662d = C2387c.p(i10, 68);
        this.f60663e = C2387c.p(i10, 20);
        this.f60664f = C2387c.p(i10, 0);
        this.f60659a.setColor(this.f60662d);
    }

    public C5009a(int i10) {
        this.f60665g = new Path();
        this.f60666h = new Paint();
        this.f60659a = new Paint();
        d(i10);
        this.f60666h.setColor(0);
        Paint paint = new Paint(4);
        this.f60660b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f60661c = new Paint(paint);
    }
}
