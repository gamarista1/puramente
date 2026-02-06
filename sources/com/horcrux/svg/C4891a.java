package com.horcrux.svg;

import U5.a;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.horcrux.svg.SVGLength;

/* renamed from: com.horcrux.svg.a  reason: case insensitive filesystem */
class C4891a {

    /* renamed from: a  reason: collision with root package name */
    private final C0872a f58865a;

    /* renamed from: b  reason: collision with root package name */
    private final SVGLength[] f58866b;

    /* renamed from: c  reason: collision with root package name */
    private ReadableArray f58867c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f58868d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f58869e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f58870f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f58871g;

    /* renamed from: h  reason: collision with root package name */
    private I f58872h;

    /* renamed from: com.horcrux.svg.a$a  reason: collision with other inner class name */
    enum C0872a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* renamed from: com.horcrux.svg.a$b */
    enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    C4891a(C0872a aVar, SVGLength[] sVGLengthArr, b bVar) {
        boolean z10;
        this.f58865a = aVar;
        this.f58866b = sVGLengthArr;
        if (bVar == b.OBJECT_BOUNDING_BOX) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f58868d = z10;
    }

    private RectF a(RectF rectF) {
        float f10;
        float f11;
        if (!this.f58868d) {
            rectF = new RectF(this.f58871g);
        }
        float width = rectF.width();
        float height = rectF.height();
        if (this.f58868d) {
            f11 = rectF.left;
            f10 = rectF.top;
        } else {
            f11 = 0.0f;
            f10 = 0.0f;
        }
        return new RectF(f11, f10, width + f11, height + f10);
    }

    private double b(SVGLength sVGLength, double d10, float f10, float f11) {
        double d11;
        if (this.f58868d) {
            if (sVGLength.f58809b == SVGLength.UnitType.NUMBER) {
                d11 = d10;
            }
            d11 = (double) f10;
        } else {
            SVGLength sVGLength2 = sVGLength;
            d11 = (double) f10;
        }
        return K.a(sVGLength, d10, 0.0d, d11, (double) f11);
    }

    private static void c(ReadableArray readableArray, int i10, float[] fArr, int[] iArr, float f10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = i11 * 2;
            fArr[i11] = (float) readableArray.getDouble(i12);
            int i13 = readableArray.getInt(i12 + 1);
            iArr[i11] = (i13 & 16777215) | (Math.round(((float) (i13 >>> 24)) * f10) << 24);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(b bVar) {
        boolean z10;
        if (bVar == b.OBJECT_BOUNDING_BOX) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f58869e = z10;
    }

    /* access modifiers changed from: package-private */
    public void e(ReadableArray readableArray) {
        this.f58867c = readableArray;
    }

    /* access modifiers changed from: package-private */
    public void f(Matrix matrix) {
        this.f58870f = matrix;
    }

    /* access modifiers changed from: package-private */
    public void g(I i10) {
        this.f58872h = i10;
    }

    /* access modifiers changed from: package-private */
    public void h(Rect rect) {
        this.f58871g = rect;
    }

    /* access modifiers changed from: package-private */
    public void i(Paint paint, RectF rectF, float f10, float f11) {
        int[] iArr;
        float[] fArr;
        float[] fArr2;
        int[] iArr2;
        double d10;
        Paint paint2 = paint;
        float f12 = f11;
        RectF a10 = a(rectF);
        float width = a10.width();
        float height = a10.height();
        float f13 = a10.left;
        float f14 = a10.top;
        float textSize = paint.getTextSize();
        if (this.f58865a == C0872a.PATTERN) {
            double d11 = (double) width;
            double b10 = b(this.f58866b[0], d11, f10, textSize);
            double d12 = (double) height;
            double d13 = d12;
            double d14 = b10;
            double b11 = b(this.f58866b[1], d12, f10, textSize);
            double d15 = d11;
            double d16 = b11;
            float f15 = f10;
            float f16 = textSize;
            double b12 = b(this.f58866b[2], d15, f15, f16);
            double b13 = b(this.f58866b[3], d13, f15, f16);
            if (b12 > 1.0d && b13 > 1.0d) {
                Bitmap createBitmap = Bitmap.createBitmap((int) b12, (int) b13, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                RectF viewBox = this.f58872h.getViewBox();
                if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                    RectF rectF2 = new RectF((float) d14, (float) d16, (float) b12, (float) b13);
                    I i10 = this.f58872h;
                    canvas.concat(o0.a(viewBox, rectF2, i10.f58759p, i10.f58760q));
                }
                if (this.f58869e) {
                    canvas.scale(width / f10, height / f10);
                }
                this.f58872h.draw(canvas, new Paint(), f11);
                Matrix matrix = new Matrix();
                Matrix matrix2 = this.f58870f;
                if (matrix2 != null) {
                    matrix.preConcat(matrix2);
                }
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
                bitmapShader.setLocalMatrix(matrix);
                paint.setShader(bitmapShader);
                return;
            }
            return;
        }
        float f17 = f12;
        int size = this.f58867c.size();
        if (size == 0) {
            a.I("ReactNative", "Gradient contains no stops");
            return;
        }
        int i11 = size / 2;
        int[] iArr3 = new int[i11];
        float[] fArr3 = new float[i11];
        c(this.f58867c, i11, fArr3, iArr3, f17);
        if (i11 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            a.I("ReactNative", "Gradient contains only one stop");
            iArr = iArr4;
            fArr = fArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        C0872a aVar = this.f58865a;
        if (aVar == C0872a.LINEAR_GRADIENT) {
            double d17 = (double) width;
            double d18 = d17;
            double d19 = (double) f13;
            double d20 = (double) height;
            double b14 = b(this.f58866b[0], d17, f10, textSize) + d19;
            double d21 = d19;
            double d22 = (double) f14;
            double b15 = b(this.f58866b[1], d20, f10, textSize) + d22;
            double d23 = d18;
            double d24 = d22;
            double b16 = b(this.f58866b[2], d23, f10, textSize) + d21;
            double d25 = d20;
            LinearGradient linearGradient = new LinearGradient((float) b14, (float) b15, (float) b16, (float) (b(this.f58866b[3], d25, f10, textSize) + d24), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f58870f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f58870f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (aVar == C0872a.RADIAL_GRADIENT) {
            double d26 = (double) width;
            double d27 = d26;
            double d28 = d26;
            float f18 = f10;
            float f19 = textSize;
            double b17 = b(this.f58866b[2], d27, f18, f19);
            double d29 = (double) height;
            double b18 = b(this.f58866b[3], d29, f18, f19);
            if (b17 <= 0.0d || b18 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                int[] iArr6 = iArr5;
                iArr2 = new int[]{iArr6[iArr6.length - 1], iArr6[iArr6.length - 1]};
                fArr2 = fArr6;
                b18 = d29;
                d10 = d28;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d10 = b17;
            }
            double d30 = b18 / d10;
            double b19 = b(this.f58866b[4], d28, f10, textSize) + ((double) f13);
            double d31 = d29 / d30;
            RadialGradient radialGradient = new RadialGradient((float) b19, (float) (b(this.f58866b[5], d31, f10, textSize) + (((double) f14) / d30)), (float) d10, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d30);
            Matrix matrix5 = this.f58870f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}
