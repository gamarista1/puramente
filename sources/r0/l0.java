package R0;

import S0.i;
import T0.a;
import T0.d;
import T0.h;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.C6496s;
import yf.p;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f5563a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5564b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f5565c;

    /* renamed from: d  reason: collision with root package name */
    private final M f5566d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5567e;

    /* renamed from: f  reason: collision with root package name */
    private i f5568f;

    /* renamed from: g  reason: collision with root package name */
    private final Layout f5569g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5570h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5571i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5572j;

    /* renamed from: k  reason: collision with root package name */
    private final float f5573k;

    /* renamed from: l  reason: collision with root package name */
    private final float f5574l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f5575m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint.FontMetricsInt f5576n;

    /* renamed from: o  reason: collision with root package name */
    private final int f5577o;

    /* renamed from: p  reason: collision with root package name */
    private final h[] f5578p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f5579q;

    /* renamed from: r  reason: collision with root package name */
    private L f5580r;

    public l0(CharSequence charSequence, float f10, TextPaint textPaint, int i10, TextUtils.TruncateAt truncateAt, int i11, float f11, float f12, boolean z10, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, M m10) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z12;
        boolean z13;
        Layout layout;
        boolean z14;
        CharSequence charSequence2 = charSequence;
        float f13 = f10;
        int i18 = i12;
        this.f5563a = textPaint;
        this.f5564b = z10;
        this.f5565c = z11;
        this.f5566d = m10;
        this.f5579q = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic k10 = n0.k(i11);
        Layout.Alignment a10 = j0.f5557a.a(i10);
        boolean z15 = (charSequence2 instanceof Spanned) && ((Spanned) charSequence2).nextSpanTransition(-1, length, a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a11 = m10.a();
            Layout.Alignment alignment = a10;
            double d10 = (double) f13;
            TextDirectionHeuristic textDirectionHeuristic2 = k10;
            int ceil = (int) ((float) Math.ceil(d10));
            if (a11 == null || m10.b() > f13 || z15) {
                TextDirectionHeuristic textDirectionHeuristic3 = textDirectionHeuristic2;
                z13 = true;
                this.f5575m = false;
                z12 = false;
                textDirectionHeuristic = textDirectionHeuristic3;
                layout = g0.f5532a.a(charSequence, textPaint, ceil, 0, charSequence.length(), textDirectionHeuristic3, alignment, i12, truncateAt, (int) ((float) Math.ceil(d10)), f11, f12, i17, z10, z11, i13, i14, i15, i16, iArr, iArr2);
            } else {
                this.f5575m = true;
                z13 = true;
                layout = C1354k.f5560a.a(charSequence, textPaint, ceil, a11, alignment, z10, z11, truncateAt, ceil);
                textDirectionHeuristic = textDirectionHeuristic2;
                z12 = false;
            }
            this.f5569g = layout;
            Trace.endSection();
            int i19 = i12;
            int min = Math.min(layout.getLineCount(), i19);
            this.f5570h = min;
            int i20 = min - 1;
            if (min >= i19 && (layout.getEllipsisCount(i20) > 0 || layout.getLineEnd(i20) != charSequence.length())) {
                z14 = z13;
            } else {
                z14 = z12;
            }
            this.f5567e = z14;
            long f14 = n0.l(this);
            h[] d11 = n0.j(this);
            this.f5578p = d11;
            long c10 = d11 != null ? n0.i(d11) : n0.f5583b;
            this.f5571i = Math.max(o0.c(f14), o0.c(c10));
            this.f5572j = Math.max(o0.b(f14), o0.b(c10));
            Paint.FontMetricsInt b10 = n0.h(this, textPaint, textDirectionHeuristic, d11);
            this.f5577o = b10 != null ? b10.bottom - ((int) s(i20)) : z12;
            this.f5576n = b10;
            this.f5573k = d.b(layout, i20, (Paint) null, 2, (Object) null);
            this.f5574l = d.d(layout, i20, (Paint) null, 2, (Object) null);
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static /* synthetic */ float B(l0 l0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return l0Var.A(i10, z10);
    }

    public static /* synthetic */ float E(l0 l0Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return l0Var.D(i10, z10);
    }

    private final float g(int i10) {
        if (i10 == this.f5570h - 1) {
            return this.f5573k + this.f5574l;
        }
        return 0.0f;
    }

    private final L j() {
        L l10 = this.f5580r;
        if (l10 == null) {
            L l11 = new L(this.f5569g);
            this.f5580r = l11;
            return l11;
        }
        C6496s.e(l10);
        return l10;
    }

    public final float A(int i10, boolean z10) {
        return j().c(i10, true, z10) + g(q(i10));
    }

    public final int[] C(RectF rectF, int i10, p pVar) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C1349f.f5530a.c(this, rectF, i10, pVar);
        }
        return m0.d(this, this.f5569g, j(), rectF, i10, pVar);
    }

    public final float D(int i10, boolean z10) {
        return j().c(i10, false, z10) + g(q(i10));
    }

    public final void F(int i10, int i11, Path path) {
        this.f5569g.getSelectionPath(i10, i11, path);
        if (this.f5571i != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) this.f5571i);
        }
    }

    public final CharSequence G() {
        return this.f5569g.getText();
    }

    public final TextPaint H() {
        return this.f5563a;
    }

    public final i I() {
        i iVar = this.f5568f;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this.f5569g.getText(), 0, this.f5569g.getText().length(), this.f5563a.getTextLocale());
        this.f5568f = iVar2;
        return iVar2;
    }

    public final boolean J() {
        if (this.f5575m) {
            C1354k kVar = C1354k.f5560a;
            Layout layout = this.f5569g;
            C6496s.f(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return kVar.b((BoringLayout) layout);
        }
        g0 g0Var = g0.f5532a;
        Layout layout2 = this.f5569g;
        C6496s.f(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return g0Var.c((StaticLayout) layout2, this.f5565c);
    }

    public final boolean K(int i10) {
        return this.f5569g.isRtlCharAt(i10);
    }

    public final void L(Canvas canvas) {
        if (canvas.getClipBounds(this.f5579q)) {
            int i10 = this.f5571i;
            if (i10 != 0) {
                canvas.translate(0.0f, (float) i10);
            }
            k0 e10 = n0.f5582a;
            e10.a(canvas);
            this.f5569g.draw(e10);
            int i11 = this.f5571i;
            if (i11 != 0) {
                canvas.translate(0.0f, ((float) -1) * ((float) i11));
            }
        }
    }

    public final void a(int i10, int i11, float[] fArr, int i12) {
        float f10;
        float f11;
        int length = G().length();
        if (i10 < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        } else if (i10 >= length) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        } else if (i11 <= i10) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        } else if (i11 <= length) {
            if (fArr.length - i12 >= (i11 - i10) * 4) {
                int q10 = q(i10);
                int q11 = q(i11 - 1);
                I i13 = new I(this);
                if (q10 <= q11) {
                    while (true) {
                        int v10 = v(q10);
                        int p10 = p(q10);
                        int min = Math.min(i11, p10);
                        float w10 = w(q10);
                        float l10 = l(q10);
                        boolean z10 = true;
                        if (z(q10) != 1) {
                            z10 = false;
                        }
                        for (int max = Math.max(i10, v10); max < min; max++) {
                            boolean K10 = K(max);
                            if (z10 && !K10) {
                                f11 = i13.b(max);
                                f10 = i13.c(max + 1);
                            } else if (z10 && K10) {
                                f10 = i13.d(max);
                                f11 = i13.e(max + 1);
                            } else if (z10 || !K10) {
                                f11 = i13.d(max);
                                f10 = i13.e(max + 1);
                            } else {
                                f10 = i13.b(max);
                                f11 = i13.c(max + 1);
                            }
                            fArr[i12] = f11;
                            fArr[i12 + 1] = w10;
                            fArr[i12 + 2] = f10;
                            fArr[i12 + 3] = l10;
                            i12 += 4;
                        }
                        if (q10 != q11) {
                            q10++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
            }
        } else {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
    }

    public final void b(int i10, float[] fArr) {
        float f10;
        float f11;
        int v10 = v(i10);
        int p10 = p(i10);
        if (fArr.length >= (p10 - v10) * 2) {
            I i11 = new I(this);
            int i12 = 0;
            boolean z10 = true;
            if (z(i10) != 1) {
                z10 = false;
            }
            while (v10 < p10) {
                boolean K10 = K(v10);
                if (z10 && !K10) {
                    f10 = i11.b(v10);
                    f11 = i11.c(v10 + 1);
                } else if (z10 && K10) {
                    f11 = i11.d(v10);
                    f10 = i11.e(v10 + 1);
                } else if (K10) {
                    f11 = i11.b(v10);
                    f10 = i11.c(v10 + 1);
                } else {
                    f10 = i11.d(v10);
                    f11 = i11.e(v10 + 1);
                }
                fArr[i12] = f10;
                fArr[i12 + 1] = f11;
                i12 += 2;
                v10++;
            }
            return;
        }
        throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
    }

    public final RectF c(int i10) {
        boolean z10;
        float f10;
        float f11;
        float A10;
        float A11;
        int q10 = q(i10);
        float w10 = w(q10);
        float l10 = l(q10);
        if (z(q10) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isRtlCharAt = this.f5569g.isRtlCharAt(i10);
        if (!z10 || isRtlCharAt) {
            if (z10 && isRtlCharAt) {
                A10 = D(i10, false);
                A11 = D(i10 + 1, true);
            } else if (isRtlCharAt) {
                A10 = A(i10, false);
                A11 = A(i10 + 1, true);
            } else {
                f11 = D(i10, false);
                f10 = D(i10 + 1, true);
            }
            float f12 = A10;
            f11 = A11;
            f10 = f12;
        } else {
            f11 = A(i10, false);
            f10 = A(i10 + 1, true);
        }
        return new RectF(f11, w10, f10, l10);
    }

    public final boolean d() {
        return this.f5567e;
    }

    public final boolean e() {
        return this.f5565c;
    }

    public final int f() {
        int i10;
        if (this.f5567e) {
            i10 = this.f5569g.getLineBottom(this.f5570h - 1);
        } else {
            i10 = this.f5569g.getHeight();
        }
        return i10 + this.f5571i + this.f5572j + this.f5577o;
    }

    public final boolean h() {
        return this.f5564b;
    }

    public final Layout i() {
        return this.f5569g;
    }

    public final float k(int i10) {
        float f10;
        float f11 = (float) this.f5571i;
        if (i10 != this.f5570h - 1 || this.f5576n == null) {
            f10 = (float) this.f5569g.getLineBaseline(i10);
        } else {
            f10 = w(i10) - ((float) this.f5576n.ascent);
        }
        return f11 + f10;
    }

    public final float l(int i10) {
        int i11;
        if (i10 == this.f5570h - 1 && this.f5576n != null) {
            return ((float) this.f5569g.getLineBottom(i10 - 1)) + ((float) this.f5576n.bottom);
        }
        float lineBottom = ((float) this.f5571i) + ((float) this.f5569g.getLineBottom(i10));
        if (i10 == this.f5570h - 1) {
            i11 = this.f5572j;
        } else {
            i11 = 0;
        }
        return lineBottom + ((float) i11);
    }

    public final int m() {
        return this.f5570h;
    }

    public final int n(int i10) {
        return this.f5569g.getEllipsisCount(i10);
    }

    public final int o(int i10) {
        return this.f5569g.getEllipsisStart(i10);
    }

    public final int p(int i10) {
        if (this.f5569g.getEllipsisStart(i10) == 0) {
            return this.f5569g.getLineEnd(i10);
        }
        return this.f5569g.getText().length();
    }

    public final int q(int i10) {
        return this.f5569g.getLineForOffset(i10);
    }

    public final int r(int i10) {
        return this.f5569g.getLineForVertical(i10 - this.f5571i);
    }

    public final float s(int i10) {
        return l(i10) - w(i10);
    }

    public final float t(int i10) {
        float f10;
        float lineLeft = this.f5569g.getLineLeft(i10);
        if (i10 == this.f5570h - 1) {
            f10 = this.f5573k;
        } else {
            f10 = 0.0f;
        }
        return lineLeft + f10;
    }

    public final float u(int i10) {
        float f10;
        float lineRight = this.f5569g.getLineRight(i10);
        if (i10 == this.f5570h - 1) {
            f10 = this.f5574l;
        } else {
            f10 = 0.0f;
        }
        return lineRight + f10;
    }

    public final int v(int i10) {
        return this.f5569g.getLineStart(i10);
    }

    public final float w(int i10) {
        int i11;
        float lineTop = (float) this.f5569g.getLineTop(i10);
        if (i10 == 0) {
            i11 = 0;
        } else {
            i11 = this.f5571i;
        }
        return lineTop + ((float) i11);
    }

    public final int x(int i10) {
        if (this.f5569g.getEllipsisStart(i10) == 0) {
            return j().e(i10);
        }
        return this.f5569g.getEllipsisStart(i10) + this.f5569g.getLineStart(i10);
    }

    public final int y(int i10, float f10) {
        return this.f5569g.getOffsetForHorizontal(i10, f10 + (((float) -1) * g(i10)));
    }

    public final int z(int i10) {
        return this.f5569g.getParagraphDirection(i10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l0(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, R0.M r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r27
        L_0x000b:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r8 = r3
            goto L_0x0014
        L_0x0012:
            r8 = r28
        L_0x0014:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001b
            r1 = 2
            r9 = r1
            goto L_0x001d
        L_0x001b:
            r9 = r29
        L_0x001d:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0025
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L_0x0027
        L_0x0025:
            r10 = r30
        L_0x0027:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x002e
            r1 = 0
            r11 = r1
            goto L_0x0030
        L_0x002e:
            r11 = r31
        L_0x0030:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0036
            r12 = r2
            goto L_0x0038
        L_0x0036:
            r12 = r32
        L_0x0038:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x003f
            r1 = 1
            r13 = r1
            goto L_0x0041
        L_0x003f:
            r13 = r33
        L_0x0041:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004a
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L_0x004c
        L_0x004a:
            r14 = r34
        L_0x004c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r15 = r2
            goto L_0x0054
        L_0x0052:
            r15 = r35
        L_0x0054:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005b
            r16 = r2
            goto L_0x005d
        L_0x005b:
            r16 = r36
        L_0x005d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0064
            r17 = r2
            goto L_0x0066
        L_0x0064:
            r17 = r37
        L_0x0066:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x006d
            r18 = r2
            goto L_0x006f
        L_0x006d:
            r18 = r38
        L_0x006f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0078
            r19 = r2
            goto L_0x007a
        L_0x0078:
            r19 = r39
        L_0x007a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0082
            r20 = r3
            goto L_0x0084
        L_0x0082:
            r20 = r40
        L_0x0084:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008c
            r21 = r3
            goto L_0x008e
        L_0x008c:
            r21 = r41
        L_0x008e:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x009f
            R0.M r0 = new R0.M
            r1 = r24
            r2 = r26
            r0.<init>(r1, r2, r9)
            r22 = r0
            goto L_0x00a5
        L_0x009f:
            r1 = r24
            r2 = r26
            r22 = r42
        L_0x00a5:
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.l0.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], R0.M, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
