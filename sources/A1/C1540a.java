package a1;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.jvm.internal.C6496s;
import r0.i2;
import r0.j2;
import t0.C2606g;
import t0.C2609j;
import t0.C2610k;

/* renamed from: a1.a  reason: case insensitive filesystem */
public final class C1540a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a  reason: collision with root package name */
    private final C2606g f10576a;

    public C1540a(C2606g gVar) {
        this.f10576a = gVar;
    }

    private final Paint.Cap a(int i10) {
        i2.a aVar = i2.f25529a;
        if (i2.e(i10, aVar.a())) {
            return Paint.Cap.BUTT;
        }
        if (i2.e(i10, aVar.b())) {
            return Paint.Cap.ROUND;
        }
        if (i2.e(i10, aVar.c())) {
            return Paint.Cap.SQUARE;
        }
        return Paint.Cap.BUTT;
    }

    private final Paint.Join b(int i10) {
        j2.a aVar = j2.f25533a;
        if (j2.e(i10, aVar.b())) {
            return Paint.Join.MITER;
        }
        if (j2.e(i10, aVar.c())) {
            return Paint.Join.ROUND;
        }
        if (j2.e(i10, aVar.a())) {
            return Paint.Join.BEVEL;
        }
        return Paint.Join.MITER;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            C2606g gVar = this.f10576a;
            if (C6496s.c(gVar, C2609j.f25944a)) {
                textPaint.setStyle(Paint.Style.FILL);
            } else if (gVar instanceof C2610k) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((C2610k) this.f10576a).f());
                textPaint.setStrokeMiter(((C2610k) this.f10576a).d());
                textPaint.setStrokeJoin(b(((C2610k) this.f10576a).c()));
                textPaint.setStrokeCap(a(((C2610k) this.f10576a).b()));
                ((C2610k) this.f10576a).e();
                textPaint.setPathEffect((PathEffect) null);
            }
        }
    }
}
