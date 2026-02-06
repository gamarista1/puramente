package com.google.android.exoplayer2.ui;

import W9.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import ha.a;
import ja.C3645a;
import ja.M;

final class f {

    /* renamed from: A  reason: collision with root package name */
    private int f43052A;

    /* renamed from: B  reason: collision with root package name */
    private int f43053B;

    /* renamed from: C  reason: collision with root package name */
    private int f43054C;

    /* renamed from: D  reason: collision with root package name */
    private int f43055D;

    /* renamed from: E  reason: collision with root package name */
    private StaticLayout f43056E;

    /* renamed from: F  reason: collision with root package name */
    private StaticLayout f43057F;

    /* renamed from: G  reason: collision with root package name */
    private int f43058G;

    /* renamed from: H  reason: collision with root package name */
    private int f43059H;

    /* renamed from: I  reason: collision with root package name */
    private int f43060I;

    /* renamed from: J  reason: collision with root package name */
    private Rect f43061J;

    /* renamed from: a  reason: collision with root package name */
    private final float f43062a;

    /* renamed from: b  reason: collision with root package name */
    private final float f43063b;

    /* renamed from: c  reason: collision with root package name */
    private final float f43064c;

    /* renamed from: d  reason: collision with root package name */
    private final float f43065d;

    /* renamed from: e  reason: collision with root package name */
    private final float f43066e;

    /* renamed from: f  reason: collision with root package name */
    private final TextPaint f43067f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f43068g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f43069h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f43070i;

    /* renamed from: j  reason: collision with root package name */
    private Layout.Alignment f43071j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f43072k;

    /* renamed from: l  reason: collision with root package name */
    private float f43073l;

    /* renamed from: m  reason: collision with root package name */
    private int f43074m;

    /* renamed from: n  reason: collision with root package name */
    private int f43075n;

    /* renamed from: o  reason: collision with root package name */
    private float f43076o;

    /* renamed from: p  reason: collision with root package name */
    private int f43077p;

    /* renamed from: q  reason: collision with root package name */
    private float f43078q;

    /* renamed from: r  reason: collision with root package name */
    private float f43079r;

    /* renamed from: s  reason: collision with root package name */
    private int f43080s;

    /* renamed from: t  reason: collision with root package name */
    private int f43081t;

    /* renamed from: u  reason: collision with root package name */
    private int f43082u;

    /* renamed from: v  reason: collision with root package name */
    private int f43083v;

    /* renamed from: w  reason: collision with root package name */
    private int f43084w;

    /* renamed from: x  reason: collision with root package name */
    private float f43085x;

    /* renamed from: y  reason: collision with root package name */
    private float f43086y;

    /* renamed from: z  reason: collision with root package name */
    private float f43087z;

    public f(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f43066e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f43065d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f43062a = round;
        this.f43063b = round;
        this.f43064c = round;
        TextPaint textPaint = new TextPaint();
        this.f43067f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f43068g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f43069h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2))) {
            return true;
        }
        return false;
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f43072k, (Rect) null, this.f43061J, this.f43069h);
    }

    private void d(Canvas canvas, boolean z10) {
        if (z10) {
            e(canvas);
            return;
        }
        C3645a.e(this.f43061J);
        C3645a.e(this.f43072k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        int i10;
        StaticLayout staticLayout = this.f43056E;
        StaticLayout staticLayout2 = this.f43057F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate((float) this.f43058G, (float) this.f43059H);
            if (Color.alpha(this.f43082u) > 0) {
                this.f43068g.setColor(this.f43082u);
                canvas.drawRect((float) (-this.f43060I), 0.0f, (float) (staticLayout.getWidth() + this.f43060I), (float) staticLayout.getHeight(), this.f43068g);
            }
            int i11 = this.f43084w;
            boolean z10 = true;
            if (i11 == 1) {
                this.f43067f.setStrokeJoin(Paint.Join.ROUND);
                this.f43067f.setStrokeWidth(this.f43062a);
                this.f43067f.setColor(this.f43083v);
                this.f43067f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i11 == 2) {
                TextPaint textPaint = this.f43067f;
                float f10 = this.f43063b;
                float f11 = this.f43064c;
                textPaint.setShadowLayer(f10, f11, f11, this.f43083v);
            } else if (i11 == 3 || i11 == 4) {
                if (i11 != 3) {
                    z10 = false;
                }
                int i12 = -1;
                if (z10) {
                    i10 = -1;
                } else {
                    i10 = this.f43083v;
                }
                if (z10) {
                    i12 = this.f43083v;
                }
                float f12 = this.f43063b / 2.0f;
                this.f43067f.setColor(this.f43080s);
                this.f43067f.setStyle(Paint.Style.FILL);
                float f13 = -f12;
                this.f43067f.setShadowLayer(this.f43063b, f13, f13, i10);
                staticLayout2.draw(canvas);
                this.f43067f.setShadowLayer(this.f43063b, f12, f12, i12);
            }
            this.f43067f.setColor(this.f43080s);
            this.f43067f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f43067f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f43072k
            int r1 = r7.f43054C
            int r2 = r7.f43052A
            int r1 = r1 - r2
            int r3 = r7.f43055D
            int r4 = r7.f43053B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f43076o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f43073l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f43078q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f43079r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x002e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L_0x003f
        L_0x002e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L_0x003f:
            int r3 = r7.f43077p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L_0x0048
            float r3 = (float) r1
        L_0x0046:
            float r2 = r2 - r3
            goto L_0x004e
        L_0x0048:
            if (r3 != r5) goto L_0x004e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L_0x0046
        L_0x004e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f43075n
            if (r3 != r6) goto L_0x0059
            float r3 = (float) r0
        L_0x0057:
            float r4 = r4 - r3
            goto L_0x005f
        L_0x0059:
            if (r3 != r5) goto L_0x005f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L_0x0057
        L_0x005f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f43061J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.f.f():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r26 = this;
            r0 = r26
            java.lang.CharSequence r1 = r0.f43070i
            boolean r2 = r1 instanceof android.text.SpannableStringBuilder
            if (r2 == 0) goto L_0x000b
            android.text.SpannableStringBuilder r1 = (android.text.SpannableStringBuilder) r1
            goto L_0x0012
        L_0x000b:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r2 = r0.f43070i
            r1.<init>(r2)
        L_0x0012:
            int r2 = r0.f43054C
            int r3 = r0.f43052A
            int r2 = r2 - r3
            int r3 = r0.f43055D
            int r4 = r0.f43053B
            int r11 = r3 - r4
            android.text.TextPaint r3 = r0.f43067f
            float r4 = r0.f43085x
            r3.setTextSize(r4)
            float r3 = r0.f43085x
            r4 = 1040187392(0x3e000000, float:0.125)
            float r3 = r3 * r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r12 = (int) r3
            int r13 = r12 * 2
            int r3 = r2 - r13
            float r4 = r0.f43078q
            r14 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x003d
            float r3 = (float) r3
            float r3 = r3 * r4
            int r3 = (int) r3
        L_0x003d:
            r15 = r3
            java.lang.String r10 = "SubtitlePainter"
            if (r15 > 0) goto L_0x0048
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
            ja.s.i(r10, r1)
            return
        L_0x0048:
            float r3 = r0.f43086y
            r16 = 0
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            r4 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = 0
            if (r3 <= 0) goto L_0x0062
            android.text.style.AbsoluteSizeSpan r3 = new android.text.style.AbsoluteSizeSpan
            float r5 = r0.f43086y
            int r5 = (int) r5
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x0062:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r1)
            int r3 = r0.f43084w
            r7 = 1
            if (r3 != r7) goto L_0x0085
            int r3 = r8.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r5 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r3 = r8.getSpans(r9, r3, r5)
            android.text.style.ForegroundColorSpan[] r3 = (android.text.style.ForegroundColorSpan[]) r3
            int r5 = r3.length
            r6 = r9
        L_0x007a:
            if (r6 >= r5) goto L_0x0085
            r7 = r3[r6]
            r8.removeSpan(r7)
            int r6 = r6 + 1
            r7 = 1
            goto L_0x007a
        L_0x0085:
            int r3 = r0.f43081t
            int r3 = android.graphics.Color.alpha(r3)
            r7 = 2
            if (r3 <= 0) goto L_0x00b2
            int r3 = r0.f43084w
            if (r3 == 0) goto L_0x00a4
            if (r3 != r7) goto L_0x0095
            goto L_0x00a4
        L_0x0095:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f43081t
            r3.<init>(r5)
            int r5 = r8.length()
            r8.setSpan(r3, r9, r5, r4)
            goto L_0x00b2
        L_0x00a4:
            android.text.style.BackgroundColorSpan r3 = new android.text.style.BackgroundColorSpan
            int r5 = r0.f43081t
            r3.<init>(r5)
            int r5 = r1.length()
            r1.setSpan(r3, r9, r5, r4)
        L_0x00b2:
            android.text.Layout$Alignment r3 = r0.f43071j
            if (r3 != 0) goto L_0x00b8
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x00b8:
            r21 = r3
            android.text.StaticLayout r6 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f43067f
            float r4 = r0.f43065d
            float r3 = r0.f43066e
            r18 = 1
            r19 = r3
            r3 = r6
            r20 = r4
            r4 = r1
            r14 = r6
            r6 = r15
            r7 = r21
            r23 = r8
            r8 = r20
            r25 = r12
            r12 = r9
            r9 = r19
            r12 = r10
            r10 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f43056E = r14
            int r3 = r14.getHeight()
            android.text.StaticLayout r4 = r0.f43056E
            int r4 = r4.getLineCount()
            r5 = 0
            r9 = 0
        L_0x00eb:
            if (r9 >= r4) goto L_0x0100
            android.text.StaticLayout r6 = r0.f43056E
            float r6 = r6.getLineWidth(r9)
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r5 = java.lang.Math.max(r6, r5)
            int r9 = r9 + 1
            goto L_0x00eb
        L_0x0100:
            float r4 = r0.f43078q
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x010c
            if (r5 >= r15) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r15 = r5
        L_0x010d:
            int r15 = r15 + r13
            float r4 = r0.f43076o
            int r5 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0139
            float r2 = (float) r2
            float r2 = r2 * r4
            int r2 = java.lang.Math.round(r2)
            int r4 = r0.f43052A
            int r2 = r2 + r4
            int r5 = r0.f43077p
            r6 = 1
            if (r5 == r6) goto L_0x0128
            r7 = 2
            if (r5 == r7) goto L_0x0126
            goto L_0x012d
        L_0x0126:
            int r2 = r2 - r15
            goto L_0x012d
        L_0x0128:
            r7 = 2
            int r2 = r2 * 2
            int r2 = r2 - r15
            int r2 = r2 / r7
        L_0x012d:
            int r2 = java.lang.Math.max(r2, r4)
            int r15 = r15 + r2
            int r4 = r0.f43054C
            int r4 = java.lang.Math.min(r15, r4)
            goto L_0x0142
        L_0x0139:
            r6 = 1
            r7 = 2
            int r2 = r2 - r15
            int r2 = r2 / r7
            int r4 = r0.f43052A
            int r2 = r2 + r4
            int r4 = r2 + r15
        L_0x0142:
            int r20 = r4 - r2
            if (r20 > 0) goto L_0x014c
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            ja.s.i(r12, r1)
            return
        L_0x014c:
            float r4 = r0.f43073l
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x01a9
            int r5 = r0.f43074m
            if (r5 != 0) goto L_0x016e
            float r5 = (float) r11
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f43053B
            int r4 = r4 + r5
            int r5 = r0.f43075n
            if (r5 != r7) goto L_0x0167
            goto L_0x0198
        L_0x0167:
            if (r5 != r6) goto L_0x0199
            int r4 = r4 * 2
            int r4 = r4 - r3
            int r4 = r4 / r7
            goto L_0x0199
        L_0x016e:
            android.text.StaticLayout r4 = r0.f43056E
            r5 = 0
            int r4 = r4.getLineBottom(r5)
            android.text.StaticLayout r6 = r0.f43056E
            int r5 = r6.getLineTop(r5)
            int r4 = r4 - r5
            float r5 = r0.f43073l
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 < 0) goto L_0x018c
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f43053B
            int r4 = r4 + r5
            goto L_0x0199
        L_0x018c:
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            int r5 = r0.f43055D
            int r4 = r4 + r5
        L_0x0198:
            int r4 = r4 - r3
        L_0x0199:
            int r5 = r4 + r3
            int r6 = r0.f43055D
            if (r5 <= r6) goto L_0x01a3
            int r4 = r6 - r3
        L_0x01a1:
            r11 = r4
            goto L_0x01b3
        L_0x01a3:
            int r3 = r0.f43053B
            if (r4 >= r3) goto L_0x01a1
            r11 = r3
            goto L_0x01b3
        L_0x01a9:
            int r4 = r0.f43055D
            int r4 = r4 - r3
            float r3 = (float) r11
            float r5 = r0.f43087z
            float r3 = r3 * r5
            int r3 = (int) r3
            int r4 = r4 - r3
            goto L_0x01a1
        L_0x01b3:
            android.text.StaticLayout r12 = new android.text.StaticLayout
            android.text.TextPaint r5 = r0.f43067f
            float r8 = r0.f43065d
            float r9 = r0.f43066e
            r10 = 1
            r3 = r12
            r4 = r1
            r6 = r20
            r7 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.f43056E = r12
            android.text.StaticLayout r1 = new android.text.StaticLayout
            android.text.TextPaint r3 = r0.f43067f
            float r4 = r0.f43065d
            float r5 = r0.f43066e
            r24 = 1
            r17 = r1
            r18 = r23
            r19 = r3
            r22 = r4
            r23 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r0.f43057F = r1
            r0.f43058G = r2
            r0.f43059H = r11
            r1 = r25
            r0.f43060I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.f.g():void");
    }

    public void b(b bVar, a aVar, float f10, float f11, float f12, Canvas canvas, int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        if (bVar.f34931d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i14 = -16777216;
        } else if (!TextUtils.isEmpty(bVar.f34928a)) {
            if (bVar.f34939l) {
                i14 = bVar.f34940m;
            } else {
                i14 = aVar.f44136c;
            }
        } else {
            return;
        }
        if (a(this.f43070i, bVar.f34928a) && M.c(this.f43071j, bVar.f34929b) && this.f43072k == bVar.f34931d && this.f43073l == bVar.f34932e && this.f43074m == bVar.f34933f && M.c(Integer.valueOf(this.f43075n), Integer.valueOf(bVar.f34934g)) && this.f43076o == bVar.f34935h && M.c(Integer.valueOf(this.f43077p), Integer.valueOf(bVar.f34936i)) && this.f43078q == bVar.f34937j && this.f43079r == bVar.f34938k && this.f43080s == aVar.f44134a && this.f43081t == aVar.f44135b && this.f43082u == i14 && this.f43084w == aVar.f44137d && this.f43083v == aVar.f44138e && M.c(this.f43067f.getTypeface(), aVar.f44139f) && this.f43085x == f10 && this.f43086y == f11 && this.f43087z == f12 && this.f43052A == i10 && this.f43053B == i11 && this.f43054C == i12 && this.f43055D == i13) {
            d(canvas, z10);
            return;
        }
        this.f43070i = bVar.f34928a;
        this.f43071j = bVar.f34929b;
        this.f43072k = bVar.f34931d;
        this.f43073l = bVar.f34932e;
        this.f43074m = bVar.f34933f;
        this.f43075n = bVar.f34934g;
        this.f43076o = bVar.f34935h;
        this.f43077p = bVar.f34936i;
        this.f43078q = bVar.f34937j;
        this.f43079r = bVar.f34938k;
        this.f43080s = aVar.f44134a;
        this.f43081t = aVar.f44135b;
        this.f43082u = i14;
        this.f43084w = aVar.f44137d;
        this.f43083v = aVar.f44138e;
        this.f43067f.setTypeface(aVar.f44139f);
        this.f43085x = f10;
        this.f43086y = f11;
        this.f43087z = f12;
        this.f43052A = i10;
        this.f43053B = i11;
        this.f43054C = i12;
        this.f43055D = i13;
        if (z10) {
            C3645a.e(this.f43070i);
            g();
        } else {
            C3645a.e(this.f43072k);
            f();
        }
        d(canvas, z10);
    }
}
