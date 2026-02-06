package w4;

import A4.e;
import C4.l;
import C4.t;
import D4.b;
import H4.k;
import I4.c;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import u4.L;
import u4.T;
import x4.C4155a;
import x4.C4158d;

public class o implements C4155a.b, C4126k, C4128m {

    /* renamed from: a  reason: collision with root package name */
    private final Path f49101a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f49102b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private final String f49103c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f49104d;

    /* renamed from: e  reason: collision with root package name */
    private final L f49105e;

    /* renamed from: f  reason: collision with root package name */
    private final C4155a f49106f;

    /* renamed from: g  reason: collision with root package name */
    private final C4155a f49107g;

    /* renamed from: h  reason: collision with root package name */
    private final C4155a f49108h;

    /* renamed from: i  reason: collision with root package name */
    private final C4117b f49109i = new C4117b();

    /* renamed from: j  reason: collision with root package name */
    private C4155a f49110j = null;

    /* renamed from: k  reason: collision with root package name */
    private boolean f49111k;

    public o(L l10, b bVar, l lVar) {
        this.f49103c = lVar.c();
        this.f49104d = lVar.f();
        this.f49105e = l10;
        C4155a h10 = lVar.d().h();
        this.f49106f = h10;
        C4155a h11 = lVar.e().h();
        this.f49107g = h11;
        C4158d a10 = lVar.b().h();
        this.f49108h = a10;
        bVar.i(h10);
        bVar.i(h11);
        bVar.i(a10);
        h10.a(this);
        h11.a(this);
        a10.a(this);
    }

    private void g() {
        this.f49111k = false;
        this.f49105e.invalidateSelf();
    }

    public void b() {
        g();
    }

    public void c(List list, List list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            C4118c cVar = (C4118c) list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == t.a.SIMULTANEOUSLY) {
                    this.f49109i.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof q) {
                this.f49110j = ((q) cVar).g();
            }
        }
    }

    public void d(e eVar, int i10, List list, e eVar2) {
        k.k(eVar, i10, list, eVar2, this);
    }

    public void e(Object obj, c cVar) {
        if (obj == T.f48415l) {
            this.f49107g.o(cVar);
        } else if (obj == T.f48417n) {
            this.f49106f.o(cVar);
        } else if (obj == T.f48416m) {
            this.f49108h.o(cVar);
        }
    }

    public String getName() {
        return this.f49103c;
    }

    public Path m() {
        float f10;
        C4155a aVar;
        if (this.f49111k) {
            return this.f49101a;
        }
        this.f49101a.reset();
        if (this.f49104d) {
            this.f49111k = true;
            return this.f49101a;
        }
        PointF pointF = (PointF) this.f49107g.h();
        float f11 = pointF.x / 2.0f;
        float f12 = pointF.y / 2.0f;
        C4155a aVar2 = this.f49108h;
        if (aVar2 == null) {
            f10 = 0.0f;
        } else {
            f10 = ((C4158d) aVar2).q();
        }
        if (f10 == 0.0f && (aVar = this.f49110j) != null) {
            f10 = Math.min(((Float) aVar.h()).floatValue(), Math.min(f11, f12));
        }
        float min = Math.min(f11, f12);
        if (f10 > min) {
            f10 = min;
        }
        PointF pointF2 = (PointF) this.f49106f.h();
        this.f49101a.moveTo(pointF2.x + f11, (pointF2.y - f12) + f10);
        this.f49101a.lineTo(pointF2.x + f11, (pointF2.y + f12) - f10);
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.f49102b;
            float f13 = pointF2.x;
            float f14 = f10 * 2.0f;
            float f15 = pointF2.y;
            rectF.set((f13 + f11) - f14, (f15 + f12) - f14, f13 + f11, f15 + f12);
            this.f49101a.arcTo(this.f49102b, 0.0f, 90.0f, false);
        }
        this.f49101a.lineTo((pointF2.x - f11) + f10, pointF2.y + f12);
        if (i10 > 0) {
            RectF rectF2 = this.f49102b;
            float f16 = pointF2.x;
            float f17 = pointF2.y;
            float f18 = f10 * 2.0f;
            rectF2.set(f16 - f11, (f17 + f12) - f18, (f16 - f11) + f18, f17 + f12);
            this.f49101a.arcTo(this.f49102b, 90.0f, 90.0f, false);
        }
        this.f49101a.lineTo(pointF2.x - f11, (pointF2.y - f12) + f10);
        if (i10 > 0) {
            RectF rectF3 = this.f49102b;
            float f19 = pointF2.x;
            float f20 = pointF2.y;
            float f21 = f10 * 2.0f;
            rectF3.set(f19 - f11, f20 - f12, (f19 - f11) + f21, (f20 - f12) + f21);
            this.f49101a.arcTo(this.f49102b, 180.0f, 90.0f, false);
        }
        this.f49101a.lineTo((pointF2.x + f11) - f10, pointF2.y - f12);
        if (i10 > 0) {
            RectF rectF4 = this.f49102b;
            float f22 = pointF2.x;
            float f23 = f10 * 2.0f;
            float f24 = pointF2.y;
            rectF4.set((f22 + f11) - f23, f24 - f12, f22 + f11, (f24 - f12) + f23);
            this.f49101a.arcTo(this.f49102b, 270.0f, 90.0f, false);
        }
        this.f49101a.close();
        this.f49109i.b(this.f49101a);
        this.f49111k = true;
        return this.f49101a;
    }
}
