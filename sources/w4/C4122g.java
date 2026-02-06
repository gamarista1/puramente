package w4;

import A4.e;
import C4.p;
import D4.b;
import H4.k;
import H4.l;
import I4.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import u4.C4065e;
import u4.L;
import u4.T;
import v4.C4103a;
import x4.C4155a;
import x4.C4156b;
import x4.C4157c;
import x4.C4158d;
import x4.q;

/* renamed from: w4.g  reason: case insensitive filesystem */
public class C4122g implements C4120e, C4155a.b, C4126k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f49030a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f49031b = new C4103a(1);

    /* renamed from: c  reason: collision with root package name */
    private final b f49032c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49033d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f49034e;

    /* renamed from: f  reason: collision with root package name */
    private final List f49035f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final C4155a f49036g;

    /* renamed from: h  reason: collision with root package name */
    private final C4155a f49037h;

    /* renamed from: i  reason: collision with root package name */
    private C4155a f49038i;

    /* renamed from: j  reason: collision with root package name */
    private final L f49039j;

    /* renamed from: k  reason: collision with root package name */
    private C4155a f49040k;

    /* renamed from: l  reason: collision with root package name */
    float f49041l;

    /* renamed from: m  reason: collision with root package name */
    private C4157c f49042m;

    public C4122g(L l10, b bVar, p pVar) {
        Path path = new Path();
        this.f49030a = path;
        this.f49032c = bVar;
        this.f49033d = pVar.d();
        this.f49034e = pVar.f();
        this.f49039j = l10;
        if (bVar.x() != null) {
            C4158d a10 = bVar.x().a().h();
            this.f49040k = a10;
            a10.a(this);
            bVar.i(this.f49040k);
        }
        if (bVar.z() != null) {
            this.f49042m = new C4157c(this, bVar, bVar.z());
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f49036g = null;
            this.f49037h = null;
            return;
        }
        path.setFillType(pVar.c());
        C4155a h10 = pVar.b().h();
        this.f49036g = h10;
        h10.a(this);
        bVar.i(h10);
        C4155a h11 = pVar.e().h();
        this.f49037h = h11;
        h11.a(this);
        bVar.i(h11);
    }

    public void b() {
        this.f49039j.invalidateSelf();
    }

    public void c(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            C4118c cVar = (C4118c) list2.get(i10);
            if (cVar instanceof C4128m) {
                this.f49035f.add((C4128m) cVar);
            }
        }
    }

    public void d(e eVar, int i10, List list, e eVar2) {
        k.k(eVar, i10, list, eVar2, this);
    }

    public void e(Object obj, c cVar) {
        C4157c cVar2;
        C4157c cVar3;
        C4157c cVar4;
        C4157c cVar5;
        C4157c cVar6;
        if (obj == T.f48404a) {
            this.f49036g.o(cVar);
        } else if (obj == T.f48407d) {
            this.f49037h.o(cVar);
        } else if (obj == T.f48398K) {
            C4155a aVar = this.f49038i;
            if (aVar != null) {
                this.f49032c.I(aVar);
            }
            if (cVar == null) {
                this.f49038i = null;
                return;
            }
            q qVar = new q(cVar);
            this.f49038i = qVar;
            qVar.a(this);
            this.f49032c.i(this.f49038i);
        } else if (obj == T.f48413j) {
            C4155a aVar2 = this.f49040k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            q qVar2 = new q(cVar);
            this.f49040k = qVar2;
            qVar2.a(this);
            this.f49032c.i(this.f49040k);
        } else if (obj == T.f48408e && (cVar6 = this.f49042m) != null) {
            cVar6.c(cVar);
        } else if (obj == T.f48394G && (cVar5 = this.f49042m) != null) {
            cVar5.f(cVar);
        } else if (obj == T.f48395H && (cVar4 = this.f49042m) != null) {
            cVar4.d(cVar);
        } else if (obj == T.f48396I && (cVar3 = this.f49042m) != null) {
            cVar3.e(cVar);
        } else if (obj == T.f48397J && (cVar2 = this.f49042m) != null) {
            cVar2.g(cVar);
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f49030a.reset();
        for (int i10 = 0; i10 < this.f49035f.size(); i10++) {
            this.f49030a.addPath(((C4128m) this.f49035f.get(i10)).m(), matrix);
        }
        this.f49030a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public String getName() {
        return this.f49033d;
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f49034e) {
            if (C4065e.h()) {
                C4065e.b("FillContent#draw");
            }
            int q10 = ((C4156b) this.f49036g).q();
            int intValue = (int) ((((((float) i10) / 255.0f) * ((float) ((Integer) this.f49037h.h()).intValue())) / 100.0f) * 255.0f);
            this.f49031b.setColor((q10 & 16777215) | (k.c(intValue, 0, 255) << 24));
            C4155a aVar = this.f49038i;
            if (aVar != null) {
                this.f49031b.setColorFilter((ColorFilter) aVar.h());
            }
            C4155a aVar2 = this.f49040k;
            if (aVar2 != null) {
                float floatValue = ((Float) aVar2.h()).floatValue();
                if (floatValue == 0.0f) {
                    this.f49031b.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f49041l) {
                    this.f49031b.setMaskFilter(this.f49032c.y(floatValue));
                }
                this.f49041l = floatValue;
            }
            C4157c cVar = this.f49042m;
            if (cVar != null) {
                cVar.a(this.f49031b, matrix, l.l(i10, intValue));
            }
            this.f49030a.reset();
            for (int i11 = 0; i11 < this.f49035f.size(); i11++) {
                this.f49030a.addPath(((C4128m) this.f49035f.get(i11)).m(), matrix);
            }
            canvas.drawPath(this.f49030a, this.f49031b);
            if (C4065e.h()) {
                C4065e.c("FillContent#draw");
            }
        }
    }
}
