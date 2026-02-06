package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import x1.g;

public abstract class j extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private final Paint.FontMetricsInt f16644a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    private final p f16645b;

    /* renamed from: c  reason: collision with root package name */
    private short f16646c = -1;

    /* renamed from: d  reason: collision with root package name */
    private short f16647d = -1;

    /* renamed from: e  reason: collision with root package name */
    private float f16648e = 1.0f;

    j(p pVar) {
        g.g(pVar, "rasterizer cannot be null");
        this.f16645b = pVar;
    }

    public final p a() {
        return this.f16645b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.f16646c;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f16644a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f16644a;
        this.f16648e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f16645b.e());
        this.f16647d = (short) ((int) (((float) this.f16645b.e()) * this.f16648e));
        short i12 = (short) ((int) (((float) this.f16645b.i()) * this.f16648e));
        this.f16646c = i12;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f16644a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i12;
    }
}
