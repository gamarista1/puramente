package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.G;

public class b extends View {

    /* renamed from: a  reason: collision with root package name */
    private final Paint f36570a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    private Path f36571b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f36572c;

    /* renamed from: d  reason: collision with root package name */
    private LinearGradient f36573d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f36574e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f36575f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    private float[] f36576g = {0.0f, 1.0f};

    /* renamed from: h  reason: collision with root package name */
    private int[] f36577h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f36578i = false;

    /* renamed from: j  reason: collision with root package name */
    private float[] f36579j = {0.5f, 0.5f};

    /* renamed from: k  reason: collision with root package name */
    private float f36580k = 45.0f;

    /* renamed from: l  reason: collision with root package name */
    private int[] f36581l = {0, 0};

    /* renamed from: m  reason: collision with root package name */
    private float[] f36582m = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public b(Context context) {
        super(context);
    }

    private void a() {
        float[] fArr;
        float[] fArr2;
        int[] iArr = this.f36577h;
        if (iArr != null) {
            float[] fArr3 = this.f36574e;
            if (fArr3 == null || iArr.length == fArr3.length) {
                if (!this.f36578i || this.f36579j == null) {
                    float[] fArr4 = this.f36575f;
                    float f10 = fArr4[0];
                    int[] iArr2 = this.f36581l;
                    int i10 = iArr2[0];
                    float f11 = fArr4[1];
                    int i11 = iArr2[1];
                    fArr = new float[]{f10 * ((float) i10), f11 * ((float) i11)};
                    float[] fArr5 = this.f36576g;
                    fArr2 = new float[]{fArr5[0] * ((float) i10), fArr5[1] * ((float) i11)};
                } else {
                    float[] b10 = b(90.0f - this.f36580k, this.f36581l);
                    float[] fArr6 = this.f36579j;
                    float f12 = fArr6[0];
                    int[] iArr3 = this.f36581l;
                    float[] fArr7 = {f12 * ((float) iArr3[0]), fArr6[1] * ((float) iArr3[1])};
                    fArr = new float[]{fArr7[0] + b10[0], fArr7[1] - b10[1]};
                    fArr2 = new float[]{fArr7[0] - b10[0], fArr7[1] + b10[1]};
                }
                LinearGradient linearGradient = new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.f36577h, this.f36574e, Shader.TileMode.CLAMP);
                this.f36573d = linearGradient;
                this.f36570a.setShader(linearGradient);
                invalidate();
            }
        }
    }

    private static float[] b(float f10, int[] iArr) {
        float f11 = f10 % 360.0f;
        if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (f11 % 90.0f == 0.0f) {
            return c(f11, iArr);
        }
        float tan = (float) Math.tan((((double) f11) * 3.141592653589793d) / 180.0d);
        float f12 = -1.0f / tan;
        float[] d10 = d(f11, iArr);
        float f13 = (d10[1] - (d10[0] * f12)) / (tan - f12);
        return new float[]{f13, tan * f13};
    }

    private static float[] c(float f10, int[] iArr) {
        float f11 = ((float) iArr[0]) / 2.0f;
        float f12 = ((float) iArr[1]) / 2.0f;
        if (f10 == 0.0f) {
            return new float[]{-f11, 0.0f};
        } else if (f10 == 90.0f) {
            return new float[]{0.0f, -f12};
        } else if (f10 == 180.0f) {
            return new float[]{f11, 0.0f};
        } else {
            return new float[]{0.0f, f12};
        }
    }

    private static float[] d(float f10, int[] iArr) {
        float f11 = ((float) iArr[0]) / 2.0f;
        float f12 = ((float) iArr[1]) / 2.0f;
        if (f10 < 90.0f) {
            return new float[]{-f11, -f12};
        } else if (f10 < 180.0f) {
            return new float[]{f11, -f12};
        } else if (f10 < 270.0f) {
            return new float[]{f11, f12};
        } else {
            return new float[]{-f11, f12};
        }
    }

    private void e() {
        if (this.f36571b == null) {
            this.f36571b = new Path();
            this.f36572c = new RectF();
        }
        this.f36571b.reset();
        RectF rectF = this.f36572c;
        int[] iArr = this.f36581l;
        rectF.set(0.0f, 0.0f, (float) iArr[0], (float) iArr[1]);
        this.f36571b.addRoundRect(this.f36572c, this.f36582m, Path.Direction.CW);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f36571b;
        if (path == null) {
            canvas.drawPaint(this.f36570a);
        } else {
            canvas.drawPath(path, this.f36570a);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f36581l = new int[]{i10, i11};
        e();
        a();
    }

    public void setAngle(float f10) {
        this.f36580k = f10;
        a();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f36579j = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = G.h((float) readableArray.getDouble(i10));
        }
        this.f36582m = fArr;
        e();
        a();
    }

    public void setColors(ReadableArray readableArray) {
        int i10;
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            if (readableArray.getType(i11) == ReadableType.Map) {
                i10 = ColorPropConverter.getColor(readableArray.getMap(i11), getContext()).intValue();
            } else {
                i10 = readableArray.getInt(i11);
            }
            iArr[i11] = i10;
        }
        this.f36577h = iArr;
        a();
    }

    public void setEndPoint(ReadableArray readableArray) {
        this.f36576g = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = (float) readableArray.getDouble(i10);
        }
        this.f36574e = fArr;
        a();
    }

    public void setStartPoint(ReadableArray readableArray) {
        this.f36575f = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        a();
    }

    public void setUseAngle(boolean z10) {
        this.f36578i = z10;
        a();
    }
}
