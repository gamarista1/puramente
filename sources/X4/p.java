package x4;

import B4.n;
import D4.b;
import I4.a;
import I4.c;
import I4.d;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import u4.T;
import x4.C4155a;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f49413a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f49414b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f49415c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f49416d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f49417e;

    /* renamed from: f  reason: collision with root package name */
    private C4155a f49418f;

    /* renamed from: g  reason: collision with root package name */
    private C4155a f49419g;

    /* renamed from: h  reason: collision with root package name */
    private C4155a f49420h;

    /* renamed from: i  reason: collision with root package name */
    private C4155a f49421i;

    /* renamed from: j  reason: collision with root package name */
    private C4155a f49422j;

    /* renamed from: k  reason: collision with root package name */
    private C4158d f49423k;

    /* renamed from: l  reason: collision with root package name */
    private C4158d f49424l;

    /* renamed from: m  reason: collision with root package name */
    private C4155a f49425m;

    /* renamed from: n  reason: collision with root package name */
    private C4155a f49426n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f49427o;

    public p(n nVar) {
        C4155a aVar;
        C4155a aVar2;
        C4155a aVar3;
        C4158d dVar;
        C4158d dVar2;
        C4158d dVar3;
        if (nVar.c() == null) {
            aVar = null;
        } else {
            aVar = nVar.c().h();
        }
        this.f49418f = aVar;
        if (nVar.f() == null) {
            aVar2 = null;
        } else {
            aVar2 = nVar.f().h();
        }
        this.f49419g = aVar2;
        if (nVar.h() == null) {
            aVar3 = null;
        } else {
            aVar3 = nVar.h().h();
        }
        this.f49420h = aVar3;
        if (nVar.g() == null) {
            dVar = null;
        } else {
            dVar = nVar.g().h();
        }
        this.f49421i = dVar;
        if (nVar.i() == null) {
            dVar2 = null;
        } else {
            dVar2 = nVar.i().h();
        }
        this.f49423k = dVar2;
        this.f49427o = nVar.l();
        if (this.f49423k != null) {
            this.f49414b = new Matrix();
            this.f49415c = new Matrix();
            this.f49416d = new Matrix();
            this.f49417e = new float[9];
        } else {
            this.f49414b = null;
            this.f49415c = null;
            this.f49416d = null;
            this.f49417e = null;
        }
        if (nVar.j() == null) {
            dVar3 = null;
        } else {
            dVar3 = nVar.j().h();
        }
        this.f49424l = dVar3;
        if (nVar.e() != null) {
            this.f49422j = nVar.e().h();
        }
        if (nVar.k() != null) {
            this.f49425m = nVar.k().h();
        } else {
            this.f49425m = null;
        }
        if (nVar.d() != null) {
            this.f49426n = nVar.d().h();
        } else {
            this.f49426n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f49417e[i10] = 0.0f;
        }
    }

    public void a(b bVar) {
        bVar.i(this.f49422j);
        bVar.i(this.f49425m);
        bVar.i(this.f49426n);
        bVar.i(this.f49418f);
        bVar.i(this.f49419g);
        bVar.i(this.f49420h);
        bVar.i(this.f49421i);
        bVar.i(this.f49423k);
        bVar.i(this.f49424l);
    }

    public void b(C4155a.b bVar) {
        C4155a aVar = this.f49422j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        C4155a aVar2 = this.f49425m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        C4155a aVar3 = this.f49426n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        C4155a aVar4 = this.f49418f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        C4155a aVar5 = this.f49419g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        C4155a aVar6 = this.f49420h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        C4155a aVar7 = this.f49421i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        C4158d dVar = this.f49423k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        C4158d dVar2 = this.f49424l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public boolean c(Object obj, c cVar) {
        if (obj == T.f48409f) {
            C4155a aVar = this.f49418f;
            if (aVar == null) {
                this.f49418f = new q(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        } else if (obj == T.f48410g) {
            C4155a aVar2 = this.f49419g;
            if (aVar2 == null) {
                this.f49419g = new q(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        } else {
            if (obj == T.f48411h) {
                C4155a aVar3 = this.f49419g;
                if (aVar3 instanceof n) {
                    ((n) aVar3).s(cVar);
                    return true;
                }
            }
            if (obj == T.f48412i) {
                C4155a aVar4 = this.f49419g;
                if (aVar4 instanceof n) {
                    ((n) aVar4).t(cVar);
                    return true;
                }
            }
            if (obj == T.f48418o) {
                C4155a aVar5 = this.f49420h;
                if (aVar5 == null) {
                    this.f49420h = new q(cVar, new d());
                    return true;
                }
                aVar5.o(cVar);
                return true;
            } else if (obj == T.f48419p) {
                C4155a aVar6 = this.f49421i;
                if (aVar6 == null) {
                    this.f49421i = new q(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.o(cVar);
                return true;
            } else if (obj == T.f48406c) {
                C4155a aVar7 = this.f49422j;
                if (aVar7 == null) {
                    this.f49422j = new q(cVar, 100);
                    return true;
                }
                aVar7.o(cVar);
                return true;
            } else if (obj == T.f48390C) {
                C4155a aVar8 = this.f49425m;
                if (aVar8 == null) {
                    this.f49425m = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.o(cVar);
                return true;
            } else if (obj == T.f48391D) {
                C4155a aVar9 = this.f49426n;
                if (aVar9 == null) {
                    this.f49426n = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.o(cVar);
                return true;
            } else if (obj == T.f48420q) {
                if (this.f49423k == null) {
                    this.f49423k = new C4158d(Collections.singletonList(new a(Float.valueOf(0.0f))));
                }
                this.f49423k.o(cVar);
                return true;
            } else if (obj != T.f48421r) {
                return false;
            } else {
                if (this.f49424l == null) {
                    this.f49424l = new C4158d(Collections.singletonList(new a(Float.valueOf(0.0f))));
                }
                this.f49424l.o(cVar);
                return true;
            }
        }
    }

    public C4155a e() {
        return this.f49426n;
    }

    public Matrix f() {
        PointF pointF;
        d dVar;
        float f10;
        float f11;
        float f12;
        PointF pointF2;
        this.f49413a.reset();
        C4155a aVar = this.f49419g;
        if (!(aVar == null || (pointF2 = (PointF) aVar.h()) == null)) {
            float f13 = pointF2.x;
            if (!(f13 == 0.0f && pointF2.y == 0.0f)) {
                this.f49413a.preTranslate(f13, pointF2.y);
            }
        }
        if (!this.f49427o) {
            C4155a aVar2 = this.f49421i;
            if (aVar2 != null) {
                if (aVar2 instanceof q) {
                    f12 = ((Float) aVar2.h()).floatValue();
                } else {
                    f12 = ((C4158d) aVar2).q();
                }
                if (f12 != 0.0f) {
                    this.f49413a.preRotate(f12);
                }
            }
        } else if (aVar != null) {
            float f14 = aVar.f();
            PointF pointF3 = (PointF) aVar.h();
            float f15 = pointF3.x;
            float f16 = pointF3.y;
            aVar.n(1.0E-4f + f14);
            PointF pointF4 = (PointF) aVar.h();
            aVar.n(f14);
            this.f49413a.preRotate((float) Math.toDegrees(Math.atan2((double) (pointF4.y - f16), (double) (pointF4.x - f15))));
        }
        C4158d dVar2 = this.f49423k;
        if (dVar2 != null) {
            C4158d dVar3 = this.f49424l;
            if (dVar3 == null) {
                f10 = 0.0f;
            } else {
                f10 = (float) Math.cos(Math.toRadians((double) ((-dVar3.q()) + 90.0f)));
            }
            C4158d dVar4 = this.f49424l;
            if (dVar4 == null) {
                f11 = 1.0f;
            } else {
                f11 = (float) Math.sin(Math.toRadians((double) ((-dVar4.q()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) dVar2.q()));
            d();
            float[] fArr = this.f49417e;
            fArr[0] = f10;
            fArr[1] = f11;
            float f17 = -f11;
            fArr[3] = f17;
            fArr[4] = f10;
            fArr[8] = 1.0f;
            this.f49414b.setValues(fArr);
            d();
            float[] fArr2 = this.f49417e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f49415c.setValues(fArr2);
            d();
            float[] fArr3 = this.f49417e;
            fArr3[0] = f10;
            fArr3[1] = f17;
            fArr3[3] = f11;
            fArr3[4] = f10;
            fArr3[8] = 1.0f;
            this.f49416d.setValues(fArr3);
            this.f49415c.preConcat(this.f49414b);
            this.f49416d.preConcat(this.f49415c);
            this.f49413a.preConcat(this.f49416d);
        }
        C4155a aVar3 = this.f49420h;
        if (!(aVar3 == null || (dVar = (d) aVar3.h()) == null || (dVar.b() == 1.0f && dVar.c() == 1.0f))) {
            this.f49413a.preScale(dVar.b(), dVar.c());
        }
        C4155a aVar4 = this.f49418f;
        if (!(aVar4 == null || (pointF = (PointF) aVar4.h()) == null)) {
            float f18 = pointF.x;
            if (!(f18 == 0.0f && pointF.y == 0.0f)) {
                this.f49413a.preTranslate(-f18, -pointF.y);
            }
        }
        return this.f49413a;
    }

    public Matrix g(float f10) {
        PointF pointF;
        d dVar;
        float f11;
        C4155a aVar = this.f49419g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) aVar.h();
        }
        C4155a aVar2 = this.f49420h;
        if (aVar2 == null) {
            dVar = null;
        } else {
            dVar = (d) aVar2.h();
        }
        this.f49413a.reset();
        if (pointF != null) {
            this.f49413a.preTranslate(pointF.x * f10, pointF.y * f10);
        }
        if (dVar != null) {
            double d10 = (double) f10;
            this.f49413a.preScale((float) Math.pow((double) dVar.b(), d10), (float) Math.pow((double) dVar.c(), d10));
        }
        C4155a aVar3 = this.f49421i;
        if (aVar3 != null) {
            float floatValue = ((Float) aVar3.h()).floatValue();
            C4155a aVar4 = this.f49418f;
            if (aVar4 != null) {
                pointF2 = (PointF) aVar4.h();
            }
            Matrix matrix = this.f49413a;
            float f12 = floatValue * f10;
            float f13 = 0.0f;
            if (pointF2 == null) {
                f11 = 0.0f;
            } else {
                f11 = pointF2.x;
            }
            if (pointF2 != null) {
                f13 = pointF2.y;
            }
            matrix.preRotate(f12, f11, f13);
        }
        return this.f49413a;
    }

    public C4155a h() {
        return this.f49422j;
    }

    public C4155a i() {
        return this.f49425m;
    }

    public void j(float f10) {
        C4155a aVar = this.f49422j;
        if (aVar != null) {
            aVar.n(f10);
        }
        C4155a aVar2 = this.f49425m;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        C4155a aVar3 = this.f49426n;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        C4155a aVar4 = this.f49418f;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        C4155a aVar5 = this.f49419g;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        C4155a aVar6 = this.f49420h;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        C4155a aVar7 = this.f49421i;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        C4158d dVar = this.f49423k;
        if (dVar != null) {
            dVar.n(f10);
        }
        C4158d dVar2 = this.f49424l;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
    }
}
