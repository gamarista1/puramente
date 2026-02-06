package w4;

import A4.e;
import C4.b;
import C4.t;
import H4.k;
import I4.c;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import u4.L;
import u4.T;
import x4.C4155a;

/* renamed from: w4.f  reason: case insensitive filesystem */
public class C4121f implements C4128m, C4155a.b, C4126k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f49022a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f49023b;

    /* renamed from: c  reason: collision with root package name */
    private final L f49024c;

    /* renamed from: d  reason: collision with root package name */
    private final C4155a f49025d;

    /* renamed from: e  reason: collision with root package name */
    private final C4155a f49026e;

    /* renamed from: f  reason: collision with root package name */
    private final b f49027f;

    /* renamed from: g  reason: collision with root package name */
    private final C4117b f49028g = new C4117b();

    /* renamed from: h  reason: collision with root package name */
    private boolean f49029h;

    public C4121f(L l10, D4.b bVar, b bVar2) {
        this.f49023b = bVar2.b();
        this.f49024c = l10;
        C4155a h10 = bVar2.d().h();
        this.f49025d = h10;
        C4155a h11 = bVar2.c().h();
        this.f49026e = h11;
        this.f49027f = bVar2;
        bVar.i(h10);
        bVar.i(h11);
        h10.a(this);
        h11.a(this);
    }

    private void g() {
        this.f49029h = false;
        this.f49024c.invalidateSelf();
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
                    this.f49028g.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    public void d(e eVar, int i10, List list, e eVar2) {
        k.k(eVar, i10, list, eVar2, this);
    }

    public void e(Object obj, c cVar) {
        if (obj == T.f48414k) {
            this.f49025d.o(cVar);
        } else if (obj == T.f48417n) {
            this.f49026e.o(cVar);
        }
    }

    public String getName() {
        return this.f49023b;
    }

    public Path m() {
        if (this.f49029h) {
            return this.f49022a;
        }
        this.f49022a.reset();
        if (this.f49027f.e()) {
            this.f49029h = true;
            return this.f49022a;
        }
        PointF pointF = (PointF) this.f49025d.h();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f49022a.reset();
        if (this.f49027f.f()) {
            float f14 = -f11;
            this.f49022a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f49022a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            float f19 = f14;
            this.f49022a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f20 = f12 + 0.0f;
            this.f49022a.cubicTo(f20, f11, f10, f18, f10, 0.0f);
            this.f49022a.cubicTo(f10, f17, f20, f19, 0.0f, f19);
        } else {
            float f21 = -f11;
            this.f49022a.moveTo(0.0f, f21);
            float f22 = f12 + 0.0f;
            float f23 = 0.0f - f13;
            this.f49022a.cubicTo(f22, f21, f10, f23, f10, 0.0f);
            float f24 = f13 + 0.0f;
            this.f49022a.cubicTo(f10, f24, f22, f11, 0.0f, f11);
            float f25 = 0.0f - f12;
            float f26 = -f10;
            this.f49022a.cubicTo(f25, f11, f26, f24, f26, 0.0f);
            float f27 = f21;
            this.f49022a.cubicTo(f26, f23, f25, f27, 0.0f, f27);
        }
        PointF pointF2 = (PointF) this.f49026e.h();
        this.f49022a.offset(pointF2.x, pointF2.y);
        this.f49022a.close();
        this.f49028g.b(this.f49022a);
        this.f49029h = true;
        return this.f49022a;
    }
}
