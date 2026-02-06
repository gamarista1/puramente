package com.horcrux.svg;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import java.text.Bidi;
import java.util.ArrayList;

class Z extends m0 {

    /* renamed from: q  reason: collision with root package name */
    private Path f58856q;

    /* renamed from: r  reason: collision with root package name */
    String f58857r;

    /* renamed from: s  reason: collision with root package name */
    private a0 f58858s;

    /* renamed from: t  reason: collision with root package name */
    private final ArrayList f58859t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    private final ArrayList f58860u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    private final AssetManager f58861v = this.mContext.getResources().getAssets();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58862a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f58863b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f58864c;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|(2:41|42)|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|(2:41|42)|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f6 */
        static {
            /*
                com.horcrux.svg.b0[] r0 = com.horcrux.svg.b0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58864c = r0
                r1 = 1
                com.horcrux.svg.b0 r2 = com.horcrux.svg.b0.baseline     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f58864c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.b0 r3 = com.horcrux.svg.b0.textBottom     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.afterEdge     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.textAfterEdge     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.alphabetic     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.ideographic     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.middle     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.central     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x006c }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.mathematical     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.hanging     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5 = 10
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.textTop     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r5 = 11
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.beforeEdge     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r5 = 12
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x009c }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.textBeforeEdge     // Catch:{ NoSuchFieldError -> 0x009c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5 = 13
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.bottom     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r5 = 14
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.center     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r5 = 15
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r3 = f58864c     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.horcrux.svg.b0 r4 = com.horcrux.svg.b0.top     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r5 = 16
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                com.horcrux.svg.h0[] r3 = com.horcrux.svg.h0.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f58863b = r3
                com.horcrux.svg.h0 r4 = com.horcrux.svg.h0.spacing     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r3 = f58863b     // Catch:{ NoSuchFieldError -> 0x00db }
                com.horcrux.svg.h0 r4 = com.horcrux.svg.h0.spacingAndGlyphs     // Catch:{ NoSuchFieldError -> 0x00db }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                com.horcrux.svg.f0[] r3 = com.horcrux.svg.f0.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f58862a = r3
                com.horcrux.svg.f0 r4 = com.horcrux.svg.f0.start     // Catch:{ NoSuchFieldError -> 0x00ec }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ec }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00ec }
            L_0x00ec:
                int[] r1 = f58862a     // Catch:{ NoSuchFieldError -> 0x00f6 }
                com.horcrux.svg.f0 r3 = com.horcrux.svg.f0.middle     // Catch:{ NoSuchFieldError -> 0x00f6 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f6 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00f6 }
            L_0x00f6:
                int[] r0 = f58862a     // Catch:{ NoSuchFieldError -> 0x0100 }
                com.horcrux.svg.f0 r1 = com.horcrux.svg.f0.end     // Catch:{ NoSuchFieldError -> 0x0100 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0100 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0100 }
            L_0x0100:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.Z.a.<clinit>():void");
        }
    }

    public Z(ReactContext reactContext) {
        super(reactContext);
    }

    private void N(Paint paint, C4912v vVar) {
        int i10 = Build.VERSION.SDK_INT;
        double d10 = vVar.f59051n;
        paint.setLetterSpacing((float) (d10 / (vVar.f59038a * ((double) this.mScale))));
        if (d10 == 0.0d && vVar.f59046i == d0.f58912a) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + vVar.f59044g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + vVar.f59044g);
        }
        if (i10 >= 26) {
            boolean unused = paint.setFontVariationSettings("'wght' " + vVar.f59043f + vVar.f59045h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r5 = android.graphics.Typeface.create(android.graphics.Typeface.createFromAsset(r10.f58861v, r7), r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void O(android.graphics.Paint r11, com.horcrux.svg.C4912v r12) {
        /*
            r10 = this;
            com.horcrux.svg.e0 r0 = r12.f59042e
            com.horcrux.svg.e0 r1 = com.horcrux.svg.e0.Bold
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0011
            int r0 = r12.f59043f
            r1 = 550(0x226, float:7.71E-43)
            if (r0 < r1) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r3
        L_0x0012:
            com.horcrux.svg.c0 r1 = r12.f59040c
            com.horcrux.svg.c0 r4 = com.horcrux.svg.c0.italic
            if (r1 != r4) goto L_0x001a
            r1 = r3
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            if (r0 == 0) goto L_0x0021
            if (r1 == 0) goto L_0x0021
            r2 = 3
            goto L_0x0028
        L_0x0021:
            if (r0 == 0) goto L_0x0025
            r2 = r3
            goto L_0x0028
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            r2 = 2
        L_0x0028:
            int r0 = r12.f59043f
            java.lang.String r4 = r12.f59039b
            r5 = 0
            if (r4 == 0) goto L_0x00d3
            int r6 = r4.length()
            if (r6 <= 0) goto L_0x00d3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fonts/"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r8 = ".otf"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r4)
            java.lang.String r7 = ".ttf"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r8 < r9) goto L_0x00be
            com.horcrux.svg.Y.a()
            android.content.res.AssetManager r5 = r10.f58861v
            android.graphics.Typeface$Builder r5 = com.horcrux.svg.X.a(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "'wght' "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r9 = r12.f59045h
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            android.graphics.Typeface.Builder unused = r5.setFontVariationSettings(r6)
            android.graphics.Typeface.Builder unused = r5.setWeight(r0)
            android.graphics.Typeface.Builder unused = r5.setItalic(r1)
            android.graphics.Typeface r5 = r5.build()
            if (r5 != 0) goto L_0x00d3
            com.horcrux.svg.Y.a()
            android.content.res.AssetManager r5 = r10.f58861v
            android.graphics.Typeface$Builder r5 = com.horcrux.svg.X.a(r5, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r0)
            java.lang.String r7 = r12.f59045h
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.graphics.Typeface.Builder unused = r5.setFontVariationSettings(r6)
            android.graphics.Typeface.Builder unused = r5.setWeight(r0)
            android.graphics.Typeface.Builder unused = r5.setItalic(r1)
            android.graphics.Typeface r5 = r5.build()
            goto L_0x00d3
        L_0x00be:
            android.content.res.AssetManager r8 = r10.f58861v     // Catch:{ Exception -> 0x00c9 }
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromAsset(r8, r6)     // Catch:{ Exception -> 0x00c9 }
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r2)     // Catch:{ Exception -> 0x00c9 }
            goto L_0x00d3
        L_0x00c9:
            android.content.res.AssetManager r6 = r10.f58861v     // Catch:{ Exception -> 0x00d3 }
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromAsset(r6, r7)     // Catch:{ Exception -> 0x00d3 }
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r2)     // Catch:{ Exception -> 0x00d3 }
        L_0x00d3:
            if (r5 != 0) goto L_0x00df
            com.facebook.react.views.text.d r6 = com.facebook.react.views.text.d.c()     // Catch:{ Exception -> 0x00df }
            android.content.res.AssetManager r7 = r10.f58861v     // Catch:{ Exception -> 0x00df }
            android.graphics.Typeface r5 = r6.e(r4, r2, r7)     // Catch:{ Exception -> 0x00df }
        L_0x00df:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r2 < r4) goto L_0x00e9
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r0, r1)
        L_0x00e9:
            r11.setLinearText(r3)
            r11.setSubpixelText(r3)
            r11.setTypeface(r5)
            double r0 = r12.f59038a
            float r12 = r10.mScale
            double r2 = (double) r12
            double r0 = r0 * r2
            float r12 = (float) r0
            r11.setTextSize(r12)
            r12 = 0
            r11.setLetterSpacing(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.Z.O(android.graphics.Paint, com.horcrux.svg.v):void");
    }

    private void P(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        C4914x p10 = p();
        r();
        C4912v b10 = p10.b();
        TextPaint textPaint = new TextPaint(paint);
        O(textPaint, b10);
        N(textPaint, b10);
        double c10 = p10.c();
        int i10 = a.f58862a[b10.f59047j.ordinal()];
        if (i10 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i10 != 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout S10 = S(textPaint, alignment, true, new SpannableString(this.f58857r), (int) K.a(this.f58983f, (double) canvas.getWidth(), 0.0d, (double) this.mScale, c10));
        int lineAscent = S10.getLineAscent(0);
        q();
        canvas.save();
        canvas.translate((float) p10.l(0.0d), (float) (p10.m() + ((double) lineAscent)));
        S10.draw(canvas);
        canvas.restore();
    }

    private double Q(SVGLength sVGLength, double d10, double d11) {
        return K.a(sVGLength, d10, 0.0d, (double) this.mScale, d11);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ed, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01f1, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01fa, code lost:
        r3 = r13 * r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0243 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x027e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Path R(java.lang.String r71, android.graphics.Paint r72, android.graphics.Canvas r73) {
        /*
            r70 = this;
            r6 = r70
            r14 = r72
            r15 = r73
            r12 = 0
            int r10 = r71.length()
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            java.util.ArrayList r0 = r6.f58859t
            r0.clear()
            java.util.ArrayList r0 = r6.f58860u
            r0.clear()
            if (r10 != 0) goto L_0x001d
            return r9
        L_0x001d:
            com.horcrux.svg.a0 r0 = r6.f58858s
            if (r0 == 0) goto L_0x0024
            r16 = 1
            goto L_0x0026
        L_0x0024:
            r16 = r12
        L_0x0026:
            r17 = 0
            if (r16 == 0) goto L_0x0048
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            com.horcrux.svg.a0 r1 = r6.f58858s
            android.graphics.Path r1 = r1.Q(r15, r14)
            r0.<init>(r1, r12)
            float r1 = r0.getLength()
            double r1 = (double) r1
            boolean r3 = r0.isClosed()
            int r4 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x0043
            return r9
        L_0x0043:
            r8 = r0
            r4 = r1
            r19 = r3
            goto L_0x004e
        L_0x0048:
            r0 = 0
            r8 = r0
            r19 = r12
            r4 = r17
        L_0x004e:
            com.horcrux.svg.x r2 = r70.p()
            com.horcrux.svg.v r0 = r2.b()
            r6.O(r14, r0)
            com.horcrux.svg.y r3 = new com.horcrux.svg.y
            r3.<init>(r14)
            boolean[] r1 = new boolean[r10]
            char[] r20 = r71.toCharArray()
            r22 = r8
            double r7 = r0.f59049l
            double r11 = r0.f59050m
            double r13 = r0.f59051n
            r26 = r11
            boolean r12 = r0.f59052o
            int r11 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r11 != 0) goto L_0x007e
            com.horcrux.svg.d0 r11 = r0.f59046i
            r28 = r1
            com.horcrux.svg.d0 r1 = com.horcrux.svg.d0.f58912a
            if (r11 != r1) goto L_0x0080
            r1 = 1
            goto L_0x0081
        L_0x007e:
            r28 = r1
        L_0x0080:
            r1 = 0
        L_0x0081:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r1 == 0) goto L_0x00a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r29 = r3
            java.lang.String r3 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', "
            r1.append(r3)
            java.lang.String r3 = r0.f59044g
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = r72
            r3.setFontFeatureSettings(r1)
            r30 = r7
            goto L_0x00be
        L_0x00a2:
            r29 = r3
            r3 = r72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r30 = r7
            java.lang.String r7 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, "
            r1.append(r7)
            java.lang.String r7 = r0.f59044g
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r3.setFontFeatureSettings(r1)
        L_0x00be:
            r1 = 26
            if (r11 < r1) goto L_0x00dd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "'wght' "
            r1.append(r7)
            int r7 = r0.f59043f
            r1.append(r7)
            java.lang.String r7 = r0.f59045h
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            boolean unused = r3.setFontVariationSettings(r1)
        L_0x00dd:
            com.facebook.react.bridge.ReadableMap r7 = r0.f59041d
            float[] r11 = new float[r10]
            r1 = r71
            r3.getTextWidths(r1, r11)
            com.horcrux.svg.f0 r8 = r0.f59047j
            com.horcrux.svg.m0 r0 = r70.A()
            double r0 = r0.z(r3)
            double r32 = r6.T(r8, r0)
            double r43 = r2.c()
            r45 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r16 == 0) goto L_0x0152
            r34 = r0
            com.horcrux.svg.a0 r0 = r6.f58858s
            com.horcrux.svg.j0 r0 = r0.N()
            com.horcrux.svg.j0 r1 = com.horcrux.svg.j0.sharp
            if (r0 != r1) goto L_0x010b
            r36 = 1
            goto L_0x010d
        L_0x010b:
            r36 = 0
        L_0x010d:
            com.horcrux.svg.a0 r0 = r6.f58858s
            com.horcrux.svg.k0 r0 = r0.O()
            com.horcrux.svg.k0 r1 = com.horcrux.svg.k0.right
            if (r0 != r1) goto L_0x011a
            r37 = -1
            goto L_0x011c
        L_0x011a:
            r37 = 1
        L_0x011c:
            com.horcrux.svg.a0 r0 = r6.f58858s
            com.horcrux.svg.SVGLength r1 = r0.P()
            r47 = r34
            r0 = r70
            r15 = r2
            r49 = r9
            r50 = r29
            r9 = r3
            r2 = r4
            r51 = r11
            r29 = r12
            r11 = r4
            r4 = r43
            double r0 = r0.Q(r1, r2, r4)
            double r32 = r32 + r0
            if (r19 == 0) goto L_0x014e
            double r4 = r11 / r45
            com.horcrux.svg.f0 r2 = com.horcrux.svg.f0.middle
            if (r8 != r2) goto L_0x0144
            double r2 = -r4
            goto L_0x0146
        L_0x0144:
            r2 = r17
        L_0x0146:
            double r0 = r0 + r2
            double r4 = r0 + r11
        L_0x0149:
            r2 = r36
            r3 = r37
            goto L_0x0163
        L_0x014e:
            r4 = r11
            r0 = r17
            goto L_0x0149
        L_0x0152:
            r47 = r0
            r15 = r2
            r49 = r9
            r51 = r11
            r50 = r29
            r9 = r3
            r29 = r12
            r11 = r4
            r0 = r17
            r2 = 0
            r3 = 1
        L_0x0163:
            com.horcrux.svg.SVGLength r8 = r6.f58984g
            r52 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r8 == 0) goto L_0x01ab
            r54 = r11
            int r11 = r73.getWidth()
            double r11 = (double) r11
            r71 = r2
            float r2 = r6.mScale
            r56 = r0
            double r0 = (double) r2
            r37 = 0
            r34 = r8
            r35 = r11
            r39 = r0
            r41 = r43
            double r0 = com.horcrux.svg.K.a(r34, r35, r37, r39, r41)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x01a3
            int[] r2 = com.horcrux.svg.Z.a.f58863b
            com.horcrux.svg.h0 r8 = r6.f58986i
            int r8 = r8.ordinal()
            r2 = r2[r8]
            r8 = 2
            if (r2 == r8) goto L_0x01a0
            double r0 = r0 - r47
            r2 = 1
            int r8 = r10 + -1
            double r11 = (double) r8
            double r0 = r0 / r11
            double r13 = r13 + r0
        L_0x019e:
            r0 = r13
            goto L_0x01b2
        L_0x01a0:
            double r52 = r0 / r47
            goto L_0x019e
        L_0x01a3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Negative textLength value"
            r0.<init>(r1)
            throw r0
        L_0x01ab:
            r56 = r0
            r71 = r2
            r54 = r11
            goto L_0x019e
        L_0x01b2:
            double r13 = (double) r3
            double r11 = r52 * r13
            android.graphics.Paint$FontMetrics r2 = r72.getFontMetrics()
            float r8 = r2.descent
            r41 = r11
            double r11 = (double) r8
            float r8 = r2.leading
            r47 = r4
            r5 = r3
            double r3 = (double) r8
            double r3 = r3 + r11
            r19 = r5
            float r5 = r2.ascent
            float r5 = -r5
            float r5 = r5 + r8
            r58 = r13
            double r13 = (double) r5
            float r2 = r2.top
            float r2 = -r2
            r60 = r0
            double r0 = (double) r2
            double r34 = r0 + r3
            java.lang.String r2 = r70.x()
            com.horcrux.svg.b0 r5 = r70.w()
            if (r5 == 0) goto L_0x021b
            int[] r8 = com.horcrux.svg.Z.a.f58864c
            int r36 = r5.ordinal()
            r8 = r8[r36]
            switch(r8) {
                case 2: goto L_0x0218;
                case 3: goto L_0x0218;
                case 4: goto L_0x0218;
                case 5: goto L_0x021b;
                case 6: goto L_0x0218;
                case 7: goto L_0x0204;
                case 8: goto L_0x0200;
                case 9: goto L_0x01fd;
                case 10: goto L_0x01f5;
                case 11: goto L_0x01f3;
                case 12: goto L_0x01f3;
                case 13: goto L_0x01f3;
                case 14: goto L_0x01f1;
                case 15: goto L_0x01ef;
                case 16: goto L_0x01ed;
                default: goto L_0x01eb;
            }
        L_0x01eb:
            r0 = r17
        L_0x01ed:
            r3 = 0
            goto L_0x021e
        L_0x01ef:
            double r3 = r34 / r45
        L_0x01f1:
            r0 = r3
            goto L_0x01ed
        L_0x01f3:
            r0 = r13
            goto L_0x01ed
        L_0x01f5:
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
        L_0x01fa:
            double r3 = r13 * r0
            goto L_0x01f1
        L_0x01fd:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x01fa
        L_0x0200:
            double r13 = r13 - r11
            double r3 = r13 / r45
            goto L_0x01f1
        L_0x0204:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.String r1 = "x"
            r3 = 0
            r4 = 1
            r9.getTextBounds(r1, r3, r4, r0)
            int r0 = r0.height()
            double r0 = (double) r0
            double r0 = r0 / r45
            goto L_0x021e
        L_0x0218:
            r3 = 0
            double r0 = -r11
            goto L_0x021e
        L_0x021b:
            r3 = 0
            r0 = r17
        L_0x021e:
            if (r2 == 0) goto L_0x02e9
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x02e9
            int[] r4 = com.horcrux.svg.Z.a.f58864c
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 14
            if (r4 == r5) goto L_0x02e9
            r5 = 16
            if (r4 == r5) goto L_0x02e9
            java.lang.String r4 = "os2"
            java.lang.String r5 = "unitsPerEm"
            java.lang.String r8 = "tables"
            int r11 = r2.hashCode()
            switch(r11) {
                case -1720785339: goto L_0x025e;
                case 114240: goto L_0x0252;
                case 109801339: goto L_0x0246;
                default: goto L_0x0243;
            }
        L_0x0243:
            r21 = -1
            goto L_0x0269
        L_0x0246:
            java.lang.String r11 = "super"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L_0x024f
            goto L_0x0243
        L_0x024f:
            r21 = 2
            goto L_0x0269
        L_0x0252:
            java.lang.String r11 = "sub"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L_0x025b
            goto L_0x0243
        L_0x025b:
            r21 = 1
            goto L_0x0269
        L_0x025e:
            java.lang.String r11 = "baseline"
            boolean r11 = r2.equals(r11)
            if (r11 != 0) goto L_0x0267
            goto L_0x0243
        L_0x0267:
            r21 = r3
        L_0x0269:
            switch(r21) {
                case 0: goto L_0x02e9;
                case 1: goto L_0x02b4;
                case 2: goto L_0x027e;
                default: goto L_0x026c;
            }
        L_0x026c:
            float r4 = r6.mScale
            double r7 = (double) r4
            double r35 = r7 * r43
            double r4 = (double) r4
            r34 = r2
            r37 = r4
            r39 = r43
            double r4 = com.horcrux.svg.K.b(r34, r35, r37, r39)
            double r0 = r0 - r4
            goto L_0x02e9
        L_0x027e:
            if (r7 == 0) goto L_0x02e9
            boolean r2 = r7.hasKey(r8)
            if (r2 == 0) goto L_0x02e9
            boolean r2 = r7.hasKey(r5)
            if (r2 == 0) goto L_0x02e9
            int r2 = r7.getInt(r5)
            com.facebook.react.bridge.ReadableMap r5 = r7.getMap(r8)
            boolean r7 = r5.hasKey(r4)
            if (r7 == 0) goto L_0x02e9
            com.facebook.react.bridge.ReadableMap r4 = r5.getMap(r4)
            java.lang.String r5 = "ySuperscriptYOffset"
            boolean r7 = r4.hasKey(r5)
            if (r7 == 0) goto L_0x02e9
            double r4 = r4.getDouble(r5)
            float r7 = r6.mScale
            double r7 = (double) r7
            double r7 = r7 * r43
            double r7 = r7 * r4
            double r4 = (double) r2
            double r7 = r7 / r4
            double r0 = r0 - r7
            goto L_0x02e9
        L_0x02b4:
            if (r7 == 0) goto L_0x02e9
            boolean r2 = r7.hasKey(r8)
            if (r2 == 0) goto L_0x02e9
            boolean r2 = r7.hasKey(r5)
            if (r2 == 0) goto L_0x02e9
            int r2 = r7.getInt(r5)
            com.facebook.react.bridge.ReadableMap r5 = r7.getMap(r8)
            boolean r7 = r5.hasKey(r4)
            if (r7 == 0) goto L_0x02e9
            com.facebook.react.bridge.ReadableMap r4 = r5.getMap(r4)
            java.lang.String r5 = "ySubscriptYOffset"
            boolean r7 = r4.hasKey(r5)
            if (r7 == 0) goto L_0x02e9
            double r4 = r4.getDouble(r5)
            float r7 = r6.mScale
            double r7 = (double) r7
            double r7 = r7 * r43
            double r7 = r7 * r4
            double r4 = (double) r2
            double r7 = r7 / r4
            double r0 = r0 + r7
        L_0x02e9:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r7 = 9
            float[] r14 = new float[r7]
            float[] r13 = new float[r7]
            r12 = r3
            r7 = r30
        L_0x0301:
            if (r12 >= r10) goto L_0x0581
            char r11 = r20[r12]
            java.lang.String r21 = java.lang.String.valueOf(r11)
            boolean r23 = r28[r12]
            if (r23 == 0) goto L_0x0316
            java.lang.String r21 = ""
            r35 = r7
            r3 = r21
            r21 = 0
            goto L_0x034f
        L_0x0316:
            r24 = r12
            r62 = r21
            r21 = 0
        L_0x031c:
            r31 = 1
            int r3 = r24 + 1
            if (r3 >= r10) goto L_0x032a
            r31 = r51[r3]
            r34 = 0
            int r31 = (r31 > r34 ? 1 : (r31 == r34 ? 0 : -1))
            if (r31 <= 0) goto L_0x032f
        L_0x032a:
            r35 = r7
            r8 = r62
            goto L_0x034e
        L_0x032f:
            r35 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r62
            r7.append(r8)
            char r8 = r20[r3]
            r7.append(r8)
            java.lang.String r62 = r7.toString()
            r7 = 1
            r28[r3] = r7
            r24 = r3
            r7 = r35
            r21 = 1
            goto L_0x031c
        L_0x034e:
            r3 = r8
        L_0x034f:
            float r7 = r9.measureText(r3)
            double r7 = (double) r7
            double r7 = r7 * r52
            if (r29 != 0) goto L_0x0363
            r9 = r51[r12]
            r31 = r10
            double r9 = (double) r9
            double r9 = r9 * r52
            double r9 = r9 - r7
            r35 = r9
            goto L_0x0365
        L_0x0363:
            r31 = r10
        L_0x0365:
            r9 = 32
            if (r11 != r9) goto L_0x036b
            r9 = 1
            goto L_0x036c
        L_0x036b:
            r9 = 0
        L_0x036c:
            if (r9 == 0) goto L_0x0371
            r37 = r26
            goto L_0x0373
        L_0x0371:
            r37 = r17
        L_0x0373:
            double r37 = r37 + r60
            double r37 = r7 + r37
            if (r23 == 0) goto L_0x037e
            r43 = r11
            r10 = r17
            goto L_0x0384
        L_0x037e:
            double r39 = r35 + r37
            r43 = r11
            r10 = r39
        L_0x0384:
            double r10 = r15.l(r10)
            r39 = r0
            double r0 = r15.m()
            double r62 = r15.i()
            double r64 = r15.j()
            r66 = r0
            double r0 = r15.k()
            if (r23 != 0) goto L_0x03a0
            if (r9 == 0) goto L_0x03c3
        L_0x03a0:
            r8 = r73
            r23 = r2
            r11 = r6
            r30 = r12
            r21 = r13
            r10 = r15
            r37 = r19
            r15 = r22
            r24 = r31
            r3 = r49
            r6 = r50
            r19 = r51
            r1 = r54
            r43 = r58
            r0 = 1
            r25 = 2
            r31 = 0
            r12 = r72
            goto L_0x055f
        L_0x03c3:
            double r37 = r37 * r58
            double r7 = r7 * r58
            double r10 = r10 + r62
            double r10 = r10 * r58
            double r10 = r32 + r10
            double r10 = r10 - r37
            if (r16 == 0) goto L_0x049c
            r37 = r0
            double r0 = r10 + r7
            double r7 = r7 / r45
            r44 = r12
            r23 = r13
            double r12 = r10 + r7
            int r9 = (r12 > r47 ? 1 : (r12 == r47 ? 0 : -1))
            if (r9 <= 0) goto L_0x0404
        L_0x03e1:
            r12 = r72
            r8 = r73
            r11 = r6
            r10 = r15
            r37 = r19
            r15 = r22
            r21 = r23
            r24 = r31
            r30 = r44
            r3 = r49
            r6 = r50
            r19 = r51
            r43 = r58
            r0 = 1
            r25 = 2
            r31 = 0
            r23 = r2
            r1 = r54
            goto L_0x055f
        L_0x0404:
            int r9 = (r12 > r56 ? 1 : (r12 == r56 ? 0 : -1))
            if (r9 >= 0) goto L_0x0409
            goto L_0x03e1
        L_0x0409:
            r9 = 3
            if (r71 == 0) goto L_0x041c
            float r0 = (float) r12
            r1 = r22
            r1.getMatrix(r0, r4, r9)
            r22 = r15
            r0 = r23
            r12 = r54
            r15 = r1
            r23 = r2
            goto L_0x047f
        L_0x041c:
            r69 = r22
            r22 = r15
            r15 = r69
            int r62 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r62 >= 0) goto L_0x0430
            r6 = 0
            r15.getMatrix(r6, r2, r9)
            float r10 = (float) r10
            r2.preTranslate(r10, r6)
            r10 = 1
            goto L_0x0435
        L_0x0430:
            float r6 = (float) r10
            r10 = 1
            r15.getMatrix(r6, r2, r10)
        L_0x0435:
            float r6 = (float) r12
            r15.getMatrix(r6, r4, r10)
            int r6 = (r0 > r54 ? 1 : (r0 == r54 ? 0 : -1))
            if (r6 <= 0) goto L_0x044a
            r12 = r54
            float r6 = (float) r12
            r15.getMatrix(r6, r5, r9)
            double r0 = r0 - r12
            float r0 = (float) r0
            r1 = 0
            r5.preTranslate(r0, r1)
            goto L_0x0450
        L_0x044a:
            r12 = r54
            float r0 = (float) r0
            r15.getMatrix(r0, r5, r10)
        L_0x0450:
            r2.getValues(r14)
            r0 = r23
            r5.getValues(r0)
            r1 = 2
            r6 = r14[r1]
            double r10 = (double) r6
            r6 = 5
            r9 = r14[r6]
            r54 = r7
            double r6 = (double) r9
            r9 = r0[r1]
            r23 = r2
            double r1 = (double) r9
            r8 = 5
            r8 = r0[r8]
            double r8 = (double) r8
            double r1 = r1 - r10
            double r8 = r8 - r6
            double r1 = java.lang.Math.atan2(r8, r1)
            r6 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r1 = r1 * r6
            double r1 = r1 * r58
            float r1 = (float) r1
            r4.preRotate(r1)
            r7 = r54
        L_0x047f:
            double r1 = -r7
            float r1 = (float) r1
            double r6 = r64 + r39
            float r2 = (float) r6
            r4.preTranslate(r1, r2)
            r1 = r41
            float r6 = (float) r1
            r9 = r19
            float r7 = (float) r9
            r4.preScale(r6, r7)
            r6 = r66
            float r6 = (float) r6
            r7 = 0
            r4.postTranslate(r7, r6)
            r6 = r37
            r19 = 1
            goto L_0x04be
        L_0x049c:
            r37 = r0
            r23 = r2
            r44 = r12
            r0 = r13
            r9 = r19
            r1 = r41
            r12 = r54
            r6 = r66
            r19 = 1
            r69 = r22
            r22 = r15
            r15 = r69
            float r8 = (float) r10
            double r6 = r6 + r64
            double r6 = r6 + r39
            float r6 = (float) r6
            r4.setTranslate(r8, r6)
            r6 = r37
        L_0x04be:
            float r6 = (float) r6
            r4.preRotate(r6)
            if (r21 == 0) goto L_0x04f9
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            int r10 = r3.length()
            r11 = 0
            r21 = 0
            r24 = 0
            r7 = r72
            r8 = r3
            r37 = r9
            r68 = r49
            r9 = r24
            r24 = r31
            r41 = r1
            r1 = r12
            r13 = r19
            r19 = r51
            r30 = r44
            r31 = 0
            r12 = r21
            r21 = r0
            r0 = r13
            r43 = r58
            r25 = 2
            r13 = r6
            r7.getTextPath(r8, r9, r10, r11, r12, r13)
            r7 = r6
            r6 = r50
            goto L_0x0518
        L_0x04f9:
            r21 = r0
            r41 = r1
            r37 = r9
            r1 = r12
            r0 = r19
            r24 = r31
            r7 = r43
            r30 = r44
            r68 = r49
            r6 = r50
            r19 = r51
            r43 = r58
            r25 = 2
            r31 = 0
            android.graphics.Path r7 = r6.b(r7, r3)
        L_0x0518:
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.computeBounds(r8, r0)
            float r8 = r8.width()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x054f
            r73.save()
            r8 = r73
            r10 = r22
            r8.concat(r4)
            r11 = r70
            java.util.ArrayList r7 = r11.f58859t
            r7.add(r3)
            java.util.ArrayList r7 = r11.f58860u
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>(r4)
            r7.add(r12)
            r12 = r72
            r8.drawText(r3, r9, r9, r12)
            r73.restore()
            r3 = r68
            goto L_0x055f
        L_0x054f:
            r11 = r70
            r12 = r72
            r8 = r73
            r10 = r22
            r7.transform(r4)
            r3 = r68
            r3.addPath(r7)
        L_0x055f:
            int r7 = r30 + 1
            r54 = r1
            r49 = r3
            r50 = r6
            r6 = r11
            r9 = r12
            r22 = r15
            r51 = r19
            r13 = r21
            r2 = r23
            r3 = r31
            r19 = r37
            r0 = r39
            r58 = r43
            r12 = r7
            r15 = r10
            r10 = r24
            r7 = r35
            goto L_0x0301
        L_0x0581:
            r11 = r6
            r3 = r49
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.Z.R(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    private StaticLayout S(TextPaint textPaint, Layout.Alignment alignment, boolean z10, SpannableString spannableString, int i10) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i10).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z10).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    private double T(f0 f0Var, double d10) {
        int i10 = a.f58862a[f0Var.ordinal()];
        if (i10 == 2) {
            return (-d10) / 2.0d;
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return -d10;
    }

    private void V() {
        ViewParent parent = getParent();
        while (parent != null) {
            if (parent.getClass() == a0.class) {
                this.f58858s = (a0) parent;
                return;
            } else if (parent instanceof m0) {
                parent = parent.getParent();
            } else {
                return;
            }
        }
    }

    public static String W(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            bArr[i10] = (byte) bidi.getRunLevel(i10);
            numArr[i10] = Integer.valueOf(i10);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < runCount; i11++) {
            int intValue = numArr[i11].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit < runStart) {
                        break;
                    }
                    sb2.append(str.charAt(runLimit));
                }
            } else {
                sb2.append(str, runStart, runLimit);
            }
        }
        return sb2.toString();
    }

    public void U(String str) {
        this.f58857r = str;
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void clearCache() {
        this.f58856q = null;
        super.clearCache();
    }

    /* access modifiers changed from: package-private */
    public void draw(Canvas canvas, Paint paint, float f10) {
        if (this.f58857r != null) {
            SVGLength sVGLength = this.f58983f;
            if (sVGLength == null || sVGLength.f58808a == 0.0d) {
                int size = this.f58859t.size();
                if (size > 0) {
                    O(paint, p().b());
                    for (int i10 = 0; i10 < size; i10++) {
                        canvas.save();
                        canvas.concat((Matrix) this.f58860u.get(i10));
                        canvas.drawText((String) this.f58859t.get(i10), 0.0f, 0.0f, paint);
                        canvas.restore();
                    }
                }
                m(canvas, paint, f10);
                return;
            }
            if (setupFillPaint(paint, this.fillOpacity * f10)) {
                P(canvas, paint);
            }
            if (setupStrokePaint(paint, f10 * this.strokeOpacity)) {
                P(canvas, paint);
                return;
            }
            return;
        }
        clip(canvas, paint);
        l(canvas, paint, f10);
    }

    /* access modifiers changed from: package-private */
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f58856q;
        if (path != null) {
            return path;
        }
        if (this.f58857r == null) {
            Path y10 = y(canvas, paint);
            this.f58856q = y10;
            return y10;
        }
        V();
        r();
        this.f58856q = R(W(this.f58857r), paint, canvas);
        q();
        return this.f58856q;
    }

    /* access modifiers changed from: package-private */
    public int hitTest(float[] fArr) {
        Region region;
        if (this.f58857r == null) {
            return super.hitTest(fArr);
        }
        if (this.mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.mStrokeRegion) != null && region.contains(round, round2))) {
                if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    public void invalidate() {
        this.f58856q = null;
        super.invalidate();
    }

    /* access modifiers changed from: package-private */
    public double z(Paint paint) {
        if (!Double.isNaN(this.f58993p)) {
            return this.f58993p;
        }
        String str = this.f58857r;
        double d10 = 0.0d;
        if (str == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt instanceof m0) {
                    d10 += ((m0) childAt).z(paint);
                }
            }
            this.f58993p = d10;
            return d10;
        } else if (str.length() == 0) {
            this.f58993p = 0.0d;
            return 0.0d;
        } else {
            C4912v b10 = p().b();
            O(paint, b10);
            N(paint, b10);
            double measureText = (double) paint.measureText(str);
            this.f58993p = measureText;
            return measureText;
        }
    }
}
