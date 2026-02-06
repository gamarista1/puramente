package x4;

import I4.a;
import I4.c;
import android.graphics.PointF;
import java.util.Collections;
import x4.C4155a;

public class n extends C4155a {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f49403i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    private final PointF f49404j = new PointF();

    /* renamed from: k  reason: collision with root package name */
    private final C4155a f49405k;

    /* renamed from: l  reason: collision with root package name */
    private final C4155a f49406l;

    /* renamed from: m  reason: collision with root package name */
    protected c f49407m;

    /* renamed from: n  reason: collision with root package name */
    protected c f49408n;

    public n(C4155a aVar, C4155a aVar2) {
        super(Collections.emptyList());
        this.f49405k = aVar;
        this.f49406l = aVar2;
        n(f());
    }

    public void n(float f10) {
        this.f49405k.n(f10);
        this.f49406l.n(f10);
        this.f49403i.set(((Float) this.f49405k.h()).floatValue(), ((Float) this.f49406l.h()).floatValue());
        for (int i10 = 0; i10 < this.f49357a.size(); i10++) {
            ((C4155a.b) this.f49357a.get(i10)).b();
        }
    }

    /* renamed from: q */
    public PointF h() {
        return i((a) null, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public PointF i(a aVar, float f10) {
        Float f11;
        a b10;
        float f12;
        a b11;
        float f13;
        Float f14 = null;
        if (this.f49407m == null || (b11 = this.f49405k.b()) == null) {
            f11 = null;
        } else {
            Float f15 = b11.f31745h;
            c cVar = this.f49407m;
            float f16 = b11.f31744g;
            if (f15 == null) {
                f13 = f16;
            } else {
                f13 = f15.floatValue();
            }
            f11 = (Float) cVar.b(f16, f13, (Float) b11.f31739b, (Float) b11.f31740c, this.f49405k.d(), this.f49405k.e(), this.f49405k.f());
        }
        if (!(this.f49408n == null || (b10 = this.f49406l.b()) == null)) {
            Float f17 = b10.f31745h;
            c cVar2 = this.f49408n;
            float f18 = b10.f31744g;
            if (f17 == null) {
                f12 = f18;
            } else {
                f12 = f17.floatValue();
            }
            f14 = (Float) cVar2.b(f18, f12, (Float) b10.f31739b, (Float) b10.f31740c, this.f49406l.d(), this.f49406l.e(), this.f49406l.f());
        }
        if (f11 == null) {
            this.f49404j.set(this.f49403i.x, 0.0f);
        } else {
            this.f49404j.set(f11.floatValue(), 0.0f);
        }
        if (f14 == null) {
            PointF pointF = this.f49404j;
            pointF.set(pointF.x, this.f49403i.y);
        } else {
            PointF pointF2 = this.f49404j;
            pointF2.set(pointF2.x, f14.floatValue());
        }
        return this.f49404j;
    }

    public void s(c cVar) {
        c cVar2 = this.f49407m;
        if (cVar2 != null) {
            cVar2.c((C4155a) null);
        }
        this.f49407m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void t(c cVar) {
        c cVar2 = this.f49408n;
        if (cVar2 != null) {
            cVar2.c((C4155a) null);
        }
        this.f49408n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
