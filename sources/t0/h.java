package T0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

public final class h implements LineHeightSpan {

    /* renamed from: a  reason: collision with root package name */
    private final float f5916a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5917b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5918c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5919d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5920e;

    /* renamed from: f  reason: collision with root package name */
    private final float f5921f;

    /* renamed from: g  reason: collision with root package name */
    private int f5922g = Integer.MIN_VALUE;

    /* renamed from: h  reason: collision with root package name */
    private int f5923h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    private int f5924i = Integer.MIN_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private int f5925j = Integer.MIN_VALUE;

    /* renamed from: k  reason: collision with root package name */
    private int f5926k;

    /* renamed from: l  reason: collision with root package name */
    private int f5927l;

    public h(float f10, int i10, int i11, boolean z10, boolean z11, float f11) {
        this.f5916a = f10;
        this.f5917b = i10;
        this.f5918c = i11;
        this.f5919d = z10;
        this.f5920e = z11;
        this.f5921f = f11;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int a10 = i.a(fontMetricsInt);
        int ceil2 = (int) ((float) Math.ceil((double) this.f5916a));
        int i10 = ceil2 - a10;
        float f10 = this.f5921f;
        if (f10 == -1.0f) {
            f10 = Math.abs((float) fontMetricsInt.ascent) / ((float) i.a(fontMetricsInt));
        }
        if (i10 <= 0) {
            ceil = Math.ceil((double) (((float) i10) * f10));
        } else {
            ceil = Math.ceil((double) (((float) i10) * (1.0f - f10)));
        }
        int i11 = (int) ((float) ceil);
        int i12 = fontMetricsInt.descent;
        int i13 = i11 + i12;
        this.f5924i = i13;
        int i14 = i13 - ceil2;
        this.f5923h = i14;
        if (this.f5919d) {
            i14 = fontMetricsInt.ascent;
        }
        this.f5922g = i14;
        if (this.f5920e) {
            i13 = i12;
        }
        this.f5925j = i13;
        this.f5926k = fontMetricsInt.ascent - i14;
        this.f5927l = i13 - i12;
    }

    public final h b(int i10, int i11, boolean z10) {
        return new h(this.f5916a, i10, i11, z10, this.f5920e, this.f5921f);
    }

    public final int c() {
        return this.f5926k;
    }

    public void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i14;
        int i15;
        if (i.a(fontMetricsInt) > 0) {
            boolean z11 = false;
            if (i10 == this.f5917b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 == this.f5918c) {
                z11 = true;
            }
            if (!z10 || !z11 || !this.f5919d || !this.f5920e) {
                if (this.f5922g == Integer.MIN_VALUE) {
                    a(fontMetricsInt);
                }
                if (z10) {
                    i14 = this.f5922g;
                } else {
                    i14 = this.f5923h;
                }
                fontMetricsInt.ascent = i14;
                if (z11) {
                    i15 = this.f5925j;
                } else {
                    i15 = this.f5924i;
                }
                fontMetricsInt.descent = i15;
            }
        }
    }

    public final int d() {
        return this.f5927l;
    }

    public final boolean e() {
        return this.f5920e;
    }
}
