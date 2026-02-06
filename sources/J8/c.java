package j8;

import android.content.Context;
import android.graphics.RectF;
import com.facebook.react.modules.i18nmanager.a;
import kotlin.jvm.internal.C6496s;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Float[] f44845a = new Float[m.values().length];

    public final RectF a(int i10, Context context) {
        RectF rectF;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        C6496s.h(context, "context");
        float f19 = 0.0f;
        if (i10 == 0) {
            Float f20 = this.f44845a[m.f44923g.ordinal()];
            if (f20 == null && (f20 = this.f44845a[m.f44919c.ordinal()]) == null && (f20 = this.f44845a[m.f44925i.ordinal()]) == null && (f20 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f10 = 0.0f;
            } else {
                f10 = f20.floatValue();
            }
            Float f21 = this.f44845a[m.f44927k.ordinal()];
            if (f21 == null && (f21 = this.f44845a[m.f44921e.ordinal()]) == null && (f21 = this.f44845a[m.f44929m.ordinal()]) == null && (f21 = this.f44845a[m.f44926j.ordinal()]) == null && (f21 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f11 = 0.0f;
            } else {
                f11 = f21.floatValue();
            }
            Float f22 = this.f44845a[m.f44924h.ordinal()];
            if (f22 == null && (f22 = this.f44845a[m.f44920d.ordinal()]) == null && (f22 = this.f44845a[m.f44925i.ordinal()]) == null && (f22 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f12 = 0.0f;
            } else {
                f12 = f22.floatValue();
            }
            Float f23 = this.f44845a[m.f44928l.ordinal()];
            if (!(f23 == null && (f23 = this.f44845a[m.f44922f.ordinal()]) == null && (f23 = this.f44845a[m.f44929m.ordinal()]) == null && (f23 = this.f44845a[m.f44926j.ordinal()]) == null && (f23 = this.f44845a[m.f44918b.ordinal()]) == null)) {
                f19 = f23.floatValue();
            }
            rectF = new RectF(f10, f11, f12, f19);
        } else if (i10 != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        } else if (a.f41056a.a().d(context)) {
            Float f24 = this.f44845a[m.f44924h.ordinal()];
            if (f24 == null && (f24 = this.f44845a[m.f44920d.ordinal()]) == null && (f24 = this.f44845a[m.f44925i.ordinal()]) == null && (f24 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f16 = 0.0f;
            } else {
                f16 = f24.floatValue();
            }
            Float f25 = this.f44845a[m.f44927k.ordinal()];
            if (f25 == null && (f25 = this.f44845a[m.f44921e.ordinal()]) == null && (f25 = this.f44845a[m.f44929m.ordinal()]) == null && (f25 = this.f44845a[m.f44926j.ordinal()]) == null && (f25 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f17 = 0.0f;
            } else {
                f17 = f25.floatValue();
            }
            Float f26 = this.f44845a[m.f44923g.ordinal()];
            if (f26 == null && (f26 = this.f44845a[m.f44919c.ordinal()]) == null && (f26 = this.f44845a[m.f44925i.ordinal()]) == null && (f26 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f18 = 0.0f;
            } else {
                f18 = f26.floatValue();
            }
            Float f27 = this.f44845a[m.f44928l.ordinal()];
            if (!(f27 == null && (f27 = this.f44845a[m.f44922f.ordinal()]) == null && (f27 = this.f44845a[m.f44929m.ordinal()]) == null && (f27 = this.f44845a[m.f44926j.ordinal()]) == null && (f27 = this.f44845a[m.f44918b.ordinal()]) == null)) {
                f19 = f27.floatValue();
            }
            rectF = new RectF(f16, f17, f18, f19);
        } else {
            Float f28 = this.f44845a[m.f44924h.ordinal()];
            if (f28 == null && (f28 = this.f44845a[m.f44919c.ordinal()]) == null && (f28 = this.f44845a[m.f44925i.ordinal()]) == null && (f28 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f13 = 0.0f;
            } else {
                f13 = f28.floatValue();
            }
            Float f29 = this.f44845a[m.f44927k.ordinal()];
            if (f29 == null && (f29 = this.f44845a[m.f44921e.ordinal()]) == null && (f29 = this.f44845a[m.f44929m.ordinal()]) == null && (f29 = this.f44845a[m.f44926j.ordinal()]) == null && (f29 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f14 = 0.0f;
            } else {
                f14 = f29.floatValue();
            }
            Float f30 = this.f44845a[m.f44923g.ordinal()];
            if (f30 == null && (f30 = this.f44845a[m.f44920d.ordinal()]) == null && (f30 = this.f44845a[m.f44925i.ordinal()]) == null && (f30 = this.f44845a[m.f44918b.ordinal()]) == null) {
                f15 = 0.0f;
            } else {
                f15 = f30.floatValue();
            }
            Float f31 = this.f44845a[m.f44928l.ordinal()];
            if (!(f31 == null && (f31 = this.f44845a[m.f44922f.ordinal()]) == null && (f31 = this.f44845a[m.f44929m.ordinal()]) == null && (f31 = this.f44845a[m.f44926j.ordinal()]) == null && (f31 = this.f44845a[m.f44918b.ordinal()]) == null)) {
                f19 = f31.floatValue();
            }
            rectF = new RectF(f13, f14, f15, f19);
        }
        return rectF;
    }

    public final void b(m mVar, Float f10) {
        C6496s.h(mVar, "edge");
        this.f44845a[mVar.ordinal()] = f10;
    }
}
