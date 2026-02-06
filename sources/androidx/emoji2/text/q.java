package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class q extends j {

    /* renamed from: g  reason: collision with root package name */
    private static Paint f16678g;

    /* renamed from: f  reason: collision with root package name */
    private TextPaint f16679f;

    public q(p pVar) {
        super(pVar);
    }

    private TextPaint c(CharSequence charSequence, int i10, int i11, Paint paint) {
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i10, i11, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint = this.f16679f;
                    if (textPaint == null) {
                        textPaint = new TextPaint();
                        this.f16679f = textPaint;
                    }
                    textPaint.set(paint);
                    for (CharacterStyle updateDrawState : characterStyleArr) {
                        updateDrawState.updateDrawState(textPaint);
                    }
                    return textPaint;
                }
            }
            if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            }
            return null;
        } else if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        } else {
            return null;
        }
    }

    private static Paint e() {
        if (f16678g == null) {
            TextPaint textPaint = new TextPaint();
            f16678g = textPaint;
            textPaint.setColor(f.c().e());
            f16678g.setStyle(Paint.Style.FILL);
        }
        return f16678g;
    }

    /* access modifiers changed from: package-private */
    public void d(Canvas canvas, TextPaint textPaint, float f10, float f11, float f12, float f13) {
        int color = textPaint.getColor();
        Paint.Style style = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(f10, f12, f11, f13, textPaint);
        textPaint.setStyle(style);
        textPaint.setColor(color);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        float f11 = f10;
        int i15 = i12;
        int i16 = i14;
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = paint;
        TextPaint c10 = c(charSequence, i10, i11, textPaint);
        if (!(c10 == null || c10.bgColor == 0)) {
            d(canvas, c10, f10, f11 + ((float) b()), (float) i15, (float) i16);
        }
        if (f.c().l()) {
            canvas.drawRect(f10, (float) i15, f11 + ((float) b()), (float) i16, e());
        }
        p a10 = a();
        float f12 = (float) i13;
        Canvas canvas2 = canvas;
        if (c10 != null) {
            textPaint = c10;
        }
        a10.a(canvas, f11, f12, textPaint);
    }
}
