package R0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f5519a;

    /* renamed from: b  reason: collision with root package name */
    private final TextPaint f5520b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5521c;

    /* renamed from: d  reason: collision with root package name */
    private float f5522d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    private float f5523e = Float.NaN;

    /* renamed from: f  reason: collision with root package name */
    private BoringLayout.Metrics f5524f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5525g;

    public M(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f5519a = charSequence;
        this.f5520b = textPaint;
        this.f5521c = i10;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f5525g) {
            this.f5524f = C1354k.f5560a.c(this.f5519a, this.f5520b, n0.k(this.f5521c));
            this.f5525g = true;
        }
        return this.f5524f;
    }

    public final float b() {
        int i10;
        if (!Float.isNaN(this.f5522d)) {
            return this.f5522d;
        }
        BoringLayout.Metrics a10 = a();
        if (a10 != null) {
            i10 = a10.width;
        } else {
            i10 = -1;
        }
        float f10 = (float) i10;
        if (f10 < 0.0f) {
            CharSequence charSequence = this.f5519a;
            f10 = (float) Math.ceil((double) Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f5520b));
        }
        if (O.e(f10, this.f5519a, this.f5520b)) {
            f10 += 0.5f;
        }
        this.f5522d = f10;
        return f10;
    }

    public final float c() {
        if (!Float.isNaN(this.f5523e)) {
            return this.f5523e;
        }
        float c10 = O.c(this.f5519a, this.f5520b);
        this.f5523e = c10;
        return c10;
    }
}
