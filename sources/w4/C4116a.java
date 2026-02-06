package w4;

import A4.e;
import B4.d;
import C4.t;
import H4.k;
import H4.l;
import I4.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import u4.C4065e;
import u4.L;
import u4.T;
import v4.C4103a;
import x4.C4155a;
import x4.C4157c;
import x4.C4158d;
import x4.C4160f;
import x4.q;

/* renamed from: w4.a  reason: case insensitive filesystem */
public abstract class C4116a implements C4155a.b, C4126k, C4120e {

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f48991a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private final Path f48992b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f48993c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f48994d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final L f48995e;

    /* renamed from: f  reason: collision with root package name */
    protected final D4.b f48996f;

    /* renamed from: g  reason: collision with root package name */
    private final List f48997g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f48998h;

    /* renamed from: i  reason: collision with root package name */
    final Paint f48999i;

    /* renamed from: j  reason: collision with root package name */
    private final C4155a f49000j;

    /* renamed from: k  reason: collision with root package name */
    private final C4155a f49001k;

    /* renamed from: l  reason: collision with root package name */
    private final List f49002l;

    /* renamed from: m  reason: collision with root package name */
    private final C4155a f49003m;

    /* renamed from: n  reason: collision with root package name */
    private C4155a f49004n;

    /* renamed from: o  reason: collision with root package name */
    private C4155a f49005o;

    /* renamed from: p  reason: collision with root package name */
    float f49006p;

    /* renamed from: q  reason: collision with root package name */
    private C4157c f49007q;

    /* renamed from: w4.a$b */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List f49008a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final u f49009b;

        private b(u uVar) {
            this.f49008a = new ArrayList();
            this.f49009b = uVar;
        }
    }

    C4116a(L l10, D4.b bVar, Paint.Cap cap, Paint.Join join, float f10, d dVar, B4.b bVar2, List list, B4.b bVar3) {
        C4103a aVar = new C4103a(1);
        this.f48999i = aVar;
        this.f49006p = 0.0f;
        this.f48995e = l10;
        this.f48996f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f49001k = dVar.h();
        this.f49000j = bVar2.h();
        if (bVar3 == null) {
            this.f49003m = null;
        } else {
            this.f49003m = bVar3.h();
        }
        this.f49002l = new ArrayList(list.size());
        this.f48998h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f49002l.add(((B4.b) list.get(i10)).h());
        }
        bVar.i(this.f49001k);
        bVar.i(this.f49000j);
        for (int i11 = 0; i11 < this.f49002l.size(); i11++) {
            bVar.i((C4155a) this.f49002l.get(i11));
        }
        C4155a aVar2 = this.f49003m;
        if (aVar2 != null) {
            bVar.i(aVar2);
        }
        this.f49001k.a(this);
        this.f49000j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((C4155a) this.f49002l.get(i12)).a(this);
        }
        C4155a aVar3 = this.f49003m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            C4158d a10 = bVar.x().a().h();
            this.f49005o = a10;
            a10.a(this);
            bVar.i(this.f49005o);
        }
        if (bVar.z() != null) {
            this.f49007q = new C4157c(this, bVar, bVar.z());
        }
    }

    private void g() {
        float f10;
        if (C4065e.h()) {
            C4065e.b("StrokeContent#applyDashPattern");
        }
        if (!this.f49002l.isEmpty()) {
            for (int i10 = 0; i10 < this.f49002l.size(); i10++) {
                this.f48998h[i10] = ((Float) ((C4155a) this.f49002l.get(i10)).h()).floatValue();
                if (i10 % 2 == 0) {
                    float[] fArr = this.f48998h;
                    if (fArr[i10] < 1.0f) {
                        fArr[i10] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.f48998h;
                    if (fArr2[i10] < 0.1f) {
                        fArr2[i10] = 0.1f;
                    }
                }
            }
            C4155a aVar = this.f49003m;
            if (aVar == null) {
                f10 = 0.0f;
            } else {
                f10 = ((Float) aVar.h()).floatValue();
            }
            this.f48999i.setPathEffect(new DashPathEffect(this.f48998h, f10));
            if (C4065e.h()) {
                C4065e.c("StrokeContent#applyDashPattern");
            }
        } else if (C4065e.h()) {
            C4065e.c("StrokeContent#applyDashPattern");
        }
    }

    private void i(Canvas canvas, b bVar) {
        float f10;
        float f11;
        float f12;
        if (C4065e.h()) {
            C4065e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.f49009b != null) {
            this.f48992b.reset();
            for (int size = bVar.f49008a.size() - 1; size >= 0; size--) {
                this.f48992b.addPath(((C4128m) bVar.f49008a.get(size)).m());
            }
            float floatValue = ((Float) bVar.f49009b.i().h()).floatValue() / 100.0f;
            float floatValue2 = ((Float) bVar.f49009b.e().h()).floatValue() / 100.0f;
            float floatValue3 = ((Float) bVar.f49009b.g().h()).floatValue() / 360.0f;
            if (floatValue >= 0.01f || floatValue2 <= 0.99f) {
                this.f48991a.setPath(this.f48992b, false);
                float length = this.f48991a.getLength();
                while (this.f48991a.nextContour()) {
                    length += this.f48991a.getLength();
                }
                float f13 = floatValue3 * length;
                float f14 = (floatValue * length) + f13;
                float min = Math.min((floatValue2 * length) + f13, (f14 + length) - 1.0f);
                float f15 = 0.0f;
                for (int size2 = bVar.f49008a.size() - 1; size2 >= 0; size2--) {
                    this.f48993c.set(((C4128m) bVar.f49008a.get(size2)).m());
                    this.f48991a.setPath(this.f48993c, false);
                    float length2 = this.f48991a.getLength();
                    if (min > length) {
                        float f16 = min - length;
                        if (f16 < f15 + length2 && f15 < f16) {
                            if (f14 > length) {
                                f12 = (f14 - length) / length2;
                            } else {
                                f12 = 0.0f;
                            }
                            l.a(this.f48993c, f12, Math.min(f16 / length2, 1.0f), 0.0f);
                            canvas.drawPath(this.f48993c, this.f48999i);
                            f15 += length2;
                        }
                    }
                    float f17 = f15 + length2;
                    if (f17 >= f14 && f15 <= min) {
                        if (f17 > min || f14 >= f15) {
                            if (f14 < f15) {
                                f10 = 0.0f;
                            } else {
                                f10 = (f14 - f15) / length2;
                            }
                            if (min > f17) {
                                f11 = 1.0f;
                            } else {
                                f11 = (min - f15) / length2;
                            }
                            l.a(this.f48993c, f10, f11, 0.0f);
                            canvas.drawPath(this.f48993c, this.f48999i);
                        } else {
                            canvas.drawPath(this.f48993c, this.f48999i);
                        }
                    }
                    f15 += length2;
                }
                if (C4065e.h()) {
                    C4065e.c("StrokeContent#applyTrimPath");
                    return;
                }
                return;
            }
            canvas.drawPath(this.f48992b, this.f48999i);
            if (C4065e.h()) {
                C4065e.c("StrokeContent#applyTrimPath");
            }
        } else if (C4065e.h()) {
            C4065e.c("StrokeContent#applyTrimPath");
        }
    }

    public void b() {
        this.f48995e.invalidateSelf();
    }

    public void c(List list, List list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            C4118c cVar = (C4118c) list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.j() == t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.d(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            C4118c cVar2 = (C4118c) list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.j() == t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f48997g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.d(this);
                }
            }
            if (cVar2 instanceof C4128m) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f49008a.add((C4128m) cVar2);
            }
        }
        if (bVar != null) {
            this.f48997g.add(bVar);
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
        if (obj == T.f48407d) {
            this.f49001k.o(cVar);
        } else if (obj == T.f48422s) {
            this.f49000j.o(cVar);
        } else if (obj == T.f48398K) {
            C4155a aVar = this.f49004n;
            if (aVar != null) {
                this.f48996f.I(aVar);
            }
            if (cVar == null) {
                this.f49004n = null;
                return;
            }
            q qVar = new q(cVar);
            this.f49004n = qVar;
            qVar.a(this);
            this.f48996f.i(this.f49004n);
        } else if (obj == T.f48413j) {
            C4155a aVar2 = this.f49005o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            q qVar2 = new q(cVar);
            this.f49005o = qVar2;
            qVar2.a(this);
            this.f48996f.i(this.f49005o);
        } else if (obj == T.f48408e && (cVar6 = this.f49007q) != null) {
            cVar6.c(cVar);
        } else if (obj == T.f48394G && (cVar5 = this.f49007q) != null) {
            cVar5.f(cVar);
        } else if (obj == T.f48395H && (cVar4 = this.f49007q) != null) {
            cVar4.d(cVar);
        } else if (obj == T.f48396I && (cVar3 = this.f49007q) != null) {
            cVar3.e(cVar);
        } else if (obj == T.f48397J && (cVar2 = this.f49007q) != null) {
            cVar2.g(cVar);
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        if (C4065e.h()) {
            C4065e.b("StrokeContent#getBounds");
        }
        this.f48992b.reset();
        for (int i10 = 0; i10 < this.f48997g.size(); i10++) {
            b bVar = (b) this.f48997g.get(i10);
            for (int i11 = 0; i11 < bVar.f49008a.size(); i11++) {
                this.f48992b.addPath(((C4128m) bVar.f49008a.get(i11)).m(), matrix);
            }
        }
        this.f48992b.computeBounds(this.f48994d, false);
        float q10 = ((C4158d) this.f49000j).q();
        RectF rectF2 = this.f48994d;
        float f10 = q10 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f48994d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (C4065e.h()) {
            C4065e.c("StrokeContent#getBounds");
        }
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (C4065e.h()) {
            C4065e.b("StrokeContent#draw");
        }
        if (!l.h(matrix)) {
            int q10 = (int) ((((((float) i10) / 255.0f) * ((float) ((C4160f) this.f49001k).q())) / 100.0f) * 255.0f);
            this.f48999i.setAlpha(k.c(q10, 0, 255));
            this.f48999i.setStrokeWidth(((C4158d) this.f49000j).q());
            if (this.f48999i.getStrokeWidth() > 0.0f) {
                g();
                C4155a aVar = this.f49004n;
                if (aVar != null) {
                    this.f48999i.setColorFilter((ColorFilter) aVar.h());
                }
                C4155a aVar2 = this.f49005o;
                if (aVar2 != null) {
                    float floatValue = ((Float) aVar2.h()).floatValue();
                    if (floatValue == 0.0f) {
                        this.f48999i.setMaskFilter((MaskFilter) null);
                    } else if (floatValue != this.f49006p) {
                        this.f48999i.setMaskFilter(this.f48996f.y(floatValue));
                    }
                    this.f49006p = floatValue;
                }
                C4157c cVar = this.f49007q;
                if (cVar != null) {
                    cVar.a(this.f48999i, matrix, l.l(i10, q10));
                }
                canvas.save();
                canvas.concat(matrix);
                for (int i11 = 0; i11 < this.f48997g.size(); i11++) {
                    b bVar = (b) this.f48997g.get(i11);
                    if (bVar.f49009b != null) {
                        i(canvas, bVar);
                    } else {
                        if (C4065e.h()) {
                            C4065e.b("StrokeContent#buildPath");
                        }
                        this.f48992b.reset();
                        for (int size = bVar.f49008a.size() - 1; size >= 0; size--) {
                            this.f48992b.addPath(((C4128m) bVar.f49008a.get(size)).m());
                        }
                        if (C4065e.h()) {
                            C4065e.c("StrokeContent#buildPath");
                            C4065e.b("StrokeContent#drawPath");
                        }
                        canvas.drawPath(this.f48992b, this.f48999i);
                        if (C4065e.h()) {
                            C4065e.c("StrokeContent#drawPath");
                        }
                    }
                }
                canvas.restore();
                if (C4065e.h()) {
                    C4065e.c("StrokeContent#draw");
                }
            } else if (C4065e.h()) {
                C4065e.c("StrokeContent#draw");
            }
        } else if (C4065e.h()) {
            C4065e.c("StrokeContent#draw");
        }
    }
}
