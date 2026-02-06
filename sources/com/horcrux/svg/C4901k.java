package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.k  reason: case insensitive filesystem */
class C4901k extends C4906p {

    /* renamed from: c  reason: collision with root package name */
    String f58966c;

    /* renamed from: d  reason: collision with root package name */
    C4909s f58967d;

    /* renamed from: e  reason: collision with root package name */
    ReadableArray f58968e;

    /* renamed from: com.horcrux.svg.k$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58969a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.horcrux.svg.s[] r0 = com.horcrux.svg.C4909s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58969a = r0
                com.horcrux.svg.s r1 = com.horcrux.svg.C4909s.MATRIX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58969a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.s r1 = com.horcrux.svg.C4909s.SATURATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58969a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.s r1 = com.horcrux.svg.C4909s.HUE_ROTATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58969a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.s r1 = com.horcrux.svg.C4909s.LUMINANCE_TO_ALPHA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C4901k.a.<clinit>():void");
        }
    }

    public C4901k(ReactContext reactContext) {
        super(reactContext);
    }

    public Bitmap l(HashMap hashMap, Bitmap bitmap) {
        int i10;
        Bitmap n10 = C4906p.n(hashMap, bitmap, this.f58966c);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i11 = a.f58969a[this.f58967d.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
                    }
                } else if (this.f58968e.size() != 1) {
                    return n10;
                } else {
                    double d10 = (((double) ((float) this.f58968e.getDouble(0))) * 3.141592653589793d) / 180.0d;
                    float cos = (float) Math.cos(d10);
                    float sin = (float) Math.sin(d10);
                    float f10 = 0.715f - (cos * 0.715f);
                    float f11 = sin * 0.715f;
                    float f12 = 0.072f - (cos * 0.072f);
                    float f13 = 0.213f - (cos * 0.213f);
                    colorMatrix.set(new float[]{((cos * 0.787f) + 0.213f) - (sin * 0.213f), f10 - f11, f12 + (sin * 0.928f), 0.0f, 0.0f, f13 + (0.143f * sin), (0.285f * cos) + 0.715f + (0.14f * sin), f12 - (0.283f * sin), 0.0f, 0.0f, f13 - (0.787f * sin), f10 + f11, (cos * 0.928f) + 0.072f + (sin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
                }
            } else if (this.f58968e.size() != 1) {
                return n10;
            } else {
                colorMatrix.setSaturation((float) this.f58968e.getDouble(0));
            }
        } else if (this.f58968e.size() < 20) {
            return n10;
        } else {
            float[] fArr = new float[this.f58968e.size()];
            for (int i12 = 0; i12 < this.f58968e.size(); i12++) {
                float f14 = (float) this.f58968e.getDouble(i12);
                if (i12 % 5 == 4) {
                    i10 = 255;
                } else {
                    i10 = 1;
                }
                fArr[i12] = f14 * ((float) i10);
            }
            colorMatrix.set(fArr);
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, n10);
    }

    public void t(String str) {
        this.f58966c = str;
        invalidate();
    }

    public void u(String str) {
        this.f58967d = C4909s.b(str);
        invalidate();
    }

    public void v(ReadableArray readableArray) {
        this.f58968e = readableArray;
        invalidate();
    }
}
