package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* renamed from: com.horcrux.svg.j  reason: case insensitive filesystem */
class C4900j extends C4906p {

    /* renamed from: c  reason: collision with root package name */
    String f58959c;

    /* renamed from: d  reason: collision with root package name */
    String f58960d;

    /* renamed from: e  reason: collision with root package name */
    C4908r f58961e;

    /* renamed from: com.horcrux.svg.j$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58962a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.horcrux.svg.r[] r0 = com.horcrux.svg.C4908r.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58962a = r0
                com.horcrux.svg.r r1 = com.horcrux.svg.C4908r.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f58962a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.r r1 = com.horcrux.svg.C4908r.SCREEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f58962a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.r r1 = com.horcrux.svg.C4908r.LIGHTEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f58962a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.r r1 = com.horcrux.svg.C4908r.DARKEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f58962a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.r r1 = com.horcrux.svg.C4908r.MULTIPLY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C4900j.a.<clinit>():void");
        }
    }

    public C4900j(ReactContext reactContext) {
        super(reactContext);
        this.f59004b.mX = new SVGLength(0.0d);
        this.f59004b.mY = new SVGLength(0.0d);
        this.f59004b.mW = new SVGLength("100%");
        this.f59004b.mH = new SVGLength("100%");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ float[] u(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[1];
        float f13 = fArr2[1];
        float f14 = fArr[2];
        float f15 = fArr2[2];
        float f16 = fArr[3];
        float f17 = fArr2[3];
        float f18 = (f16 * f10 * (1.0f - f11)) + (f17 * f11 * (1.0f - f10)) + (f16 * f10 * f17 * f11);
        return new float[]{1.0f - ((1.0f - f10) * (1.0f - f11)), (f12 * f10 * (1.0f - f11)) + (f13 * f11 * (1.0f - f10)) + (f12 * f10 * f13 * f11), (f14 * f10 * (1.0f - f11)) + (f15 * f11 * (1.0f - f10)) + (f14 * f10 * f15 * f11), f18};
    }

    public Bitmap l(HashMap hashMap, Bitmap bitmap) {
        Bitmap n10 = C4906p.n(hashMap, bitmap, this.f58959c);
        Bitmap n11 = C4906p.n(hashMap, bitmap, this.f58960d);
        if (this.f58961e == C4908r.MULTIPLY) {
            return CustomFilter.apply(n10, n11, new C4899i());
        }
        Bitmap createBitmap = Bitmap.createBitmap(n10.getWidth(), n10.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(n10, 0.0f, 0.0f, paint);
        int i10 = a.f58962a[this.f58961e.ordinal()];
        if (i10 == 1) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i10 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i10 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i10 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(n11, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public void v(String str) {
        this.f58959c = str;
        invalidate();
    }

    public void w(String str) {
        this.f58960d = str;
        invalidate();
    }

    public void x(String str) {
        this.f58961e = C4908r.b(str);
        invalidate();
    }
}
