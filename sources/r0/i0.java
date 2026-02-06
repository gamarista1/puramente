package R0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5535a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5536b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5537c;

    /* renamed from: d  reason: collision with root package name */
    private final TextPaint f5538d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5539e;

    /* renamed from: f  reason: collision with root package name */
    private final TextDirectionHeuristic f5540f;

    /* renamed from: g  reason: collision with root package name */
    private final Layout.Alignment f5541g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5542h;

    /* renamed from: i  reason: collision with root package name */
    private final TextUtils.TruncateAt f5543i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5544j;

    /* renamed from: k  reason: collision with root package name */
    private final float f5545k;

    /* renamed from: l  reason: collision with root package name */
    private final float f5546l;

    /* renamed from: m  reason: collision with root package name */
    private final int f5547m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f5548n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f5549o;

    /* renamed from: p  reason: collision with root package name */
    private final int f5550p;

    /* renamed from: q  reason: collision with root package name */
    private final int f5551q;

    /* renamed from: r  reason: collision with root package name */
    private final int f5552r;

    /* renamed from: s  reason: collision with root package name */
    private final int f5553s;

    /* renamed from: t  reason: collision with root package name */
    private final int[] f5554t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f5555u;

    public i0(CharSequence charSequence, int i10, int i11, TextPaint textPaint, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, float f10, float f11, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, int[] iArr, int[] iArr2) {
        int i20 = i10;
        int i21 = i11;
        int i22 = i12;
        int i23 = i13;
        int i24 = i14;
        float f12 = f10;
        this.f5535a = charSequence;
        this.f5536b = i20;
        this.f5537c = i21;
        this.f5538d = textPaint;
        this.f5539e = i22;
        this.f5540f = textDirectionHeuristic;
        this.f5541g = alignment;
        this.f5542h = i23;
        this.f5543i = truncateAt;
        this.f5544j = i24;
        this.f5545k = f12;
        this.f5546l = f11;
        this.f5547m = i15;
        this.f5548n = z10;
        this.f5549o = z11;
        this.f5550p = i16;
        this.f5551q = i17;
        this.f5552r = i18;
        this.f5553s = i19;
        this.f5554t = iArr;
        this.f5555u = iArr2;
        if (i20 < 0 || i20 > i21) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i21 < 0 || i21 > length) {
            throw new IllegalArgumentException("invalid end value");
        } else if (i23 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        } else if (i22 < 0) {
            throw new IllegalArgumentException("invalid width value");
        } else if (i24 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        } else if (f12 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value");
        }
    }

    public final Layout.Alignment a() {
        return this.f5541g;
    }

    public final int b() {
        return this.f5550p;
    }

    public final TextUtils.TruncateAt c() {
        return this.f5543i;
    }

    public final int d() {
        return this.f5544j;
    }

    public final int e() {
        return this.f5537c;
    }

    public final int f() {
        return this.f5553s;
    }

    public final boolean g() {
        return this.f5548n;
    }

    public final int h() {
        return this.f5547m;
    }

    public final int[] i() {
        return this.f5554t;
    }

    public final int j() {
        return this.f5551q;
    }

    public final int k() {
        return this.f5552r;
    }

    public final float l() {
        return this.f5546l;
    }

    public final float m() {
        return this.f5545k;
    }

    public final int n() {
        return this.f5542h;
    }

    public final TextPaint o() {
        return this.f5538d;
    }

    public final int[] p() {
        return this.f5555u;
    }

    public final int q() {
        return this.f5536b;
    }

    public final CharSequence r() {
        return this.f5535a;
    }

    public final TextDirectionHeuristic s() {
        return this.f5540f;
    }

    public final boolean t() {
        return this.f5549o;
    }

    public final int u() {
        return this.f5539e;
    }
}
