package w4;

import C4.d;
import C4.e;
import C4.g;
import D4.b;
import H4.k;
import H4.l;
import I4.c;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C1607v;
import java.util.ArrayList;
import java.util.List;
import u4.C4065e;
import u4.C4071k;
import u4.L;
import u4.T;
import v4.C4103a;
import x4.C4155a;
import x4.C4157c;
import x4.C4158d;
import x4.q;

/* renamed from: w4.h  reason: case insensitive filesystem */
public class C4123h implements C4120e, C4155a.b, C4126k {

    /* renamed from: a  reason: collision with root package name */
    private final String f49043a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f49044b;

    /* renamed from: c  reason: collision with root package name */
    private final b f49045c;

    /* renamed from: d  reason: collision with root package name */
    private final C1607v f49046d = new C1607v();

    /* renamed from: e  reason: collision with root package name */
    private final C1607v f49047e = new C1607v();

    /* renamed from: f  reason: collision with root package name */
    private final Path f49048f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f49049g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f49050h;

    /* renamed from: i  reason: collision with root package name */
    private final List f49051i;

    /* renamed from: j  reason: collision with root package name */
    private final g f49052j;

    /* renamed from: k  reason: collision with root package name */
    private final C4155a f49053k;

    /* renamed from: l  reason: collision with root package name */
    private final C4155a f49054l;

    /* renamed from: m  reason: collision with root package name */
    private final C4155a f49055m;

    /* renamed from: n  reason: collision with root package name */
    private final C4155a f49056n;

    /* renamed from: o  reason: collision with root package name */
    private C4155a f49057o;

    /* renamed from: p  reason: collision with root package name */
    private q f49058p;

    /* renamed from: q  reason: collision with root package name */
    private final L f49059q;

    /* renamed from: r  reason: collision with root package name */
    private final int f49060r;

    /* renamed from: s  reason: collision with root package name */
    private C4155a f49061s;

    /* renamed from: t  reason: collision with root package name */
    float f49062t;

    /* renamed from: u  reason: collision with root package name */
    private C4157c f49063u;

    public C4123h(L l10, C4071k kVar, b bVar, e eVar) {
        Path path = new Path();
        this.f49048f = path;
        this.f49049g = new C4103a(1);
        this.f49050h = new RectF();
        this.f49051i = new ArrayList();
        this.f49062t = 0.0f;
        this.f49045c = bVar;
        this.f49043a = eVar.f();
        this.f49044b = eVar.i();
        this.f49059q = l10;
        this.f49052j = eVar.e();
        path.setFillType(eVar.c());
        this.f49060r = (int) (kVar.d() / 32.0f);
        C4155a h10 = eVar.d().h();
        this.f49053k = h10;
        h10.a(this);
        bVar.i(h10);
        C4155a h11 = eVar.g().h();
        this.f49054l = h11;
        h11.a(this);
        bVar.i(h11);
        C4155a h12 = eVar.h().h();
        this.f49055m = h12;
        h12.a(this);
        bVar.i(h12);
        C4155a h13 = eVar.b().h();
        this.f49056n = h13;
        h13.a(this);
        bVar.i(h13);
        if (bVar.x() != null) {
            C4158d a10 = bVar.x().a().h();
            this.f49061s = a10;
            a10.a(this);
            bVar.i(this.f49061s);
        }
        if (bVar.z() != null) {
            this.f49063u = new C4157c(this, bVar, bVar.z());
        }
    }

    private int[] g(int[] iArr) {
        q qVar = this.f49058p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    private int i() {
        int i10;
        int round = Math.round(this.f49055m.f() * ((float) this.f49060r));
        int round2 = Math.round(this.f49056n.f() * ((float) this.f49060r));
        int round3 = Math.round(this.f49053k.f() * ((float) this.f49060r));
        if (round != 0) {
            i10 = 527 * round;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }

    private LinearGradient j() {
        long i10 = (long) i();
        LinearGradient linearGradient = (LinearGradient) this.f49046d.e(i10);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f49055m.h();
        PointF pointF2 = (PointF) this.f49056n.h();
        d dVar = (d) this.f49053k.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, g(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f49046d.j(i10, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient k() {
        long i10 = (long) i();
        RadialGradient radialGradient = (RadialGradient) this.f49047e.e(i10);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f49055m.h();
        PointF pointF2 = (PointF) this.f49056n.h();
        d dVar = (d) this.f49053k.h();
        int[] g10 = g(dVar.d());
        float[] e10 = dVar.e();
        float f10 = pointF.x;
        float f11 = pointF.y;
        float hypot = (float) Math.hypot((double) (pointF2.x - f10), (double) (pointF2.y - f11));
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, hypot, g10, e10, Shader.TileMode.CLAMP);
        this.f49047e.j(i10, radialGradient2);
        return radialGradient2;
    }

    public void b() {
        this.f49059q.invalidateSelf();
    }

    public void c(List list, List list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            C4118c cVar = (C4118c) list2.get(i10);
            if (cVar instanceof C4128m) {
                this.f49051i.add((C4128m) cVar);
            }
        }
    }

    public void d(A4.e eVar, int i10, List list, A4.e eVar2) {
        k.k(eVar, i10, list, eVar2, this);
    }

    public void e(Object obj, c cVar) {
        C4157c cVar2;
        C4157c cVar3;
        C4157c cVar4;
        C4157c cVar5;
        C4157c cVar6;
        if (obj == T.f48407d) {
            this.f49054l.o(cVar);
        } else if (obj == T.f48398K) {
            C4155a aVar = this.f49057o;
            if (aVar != null) {
                this.f49045c.I(aVar);
            }
            if (cVar == null) {
                this.f49057o = null;
                return;
            }
            q qVar = new q(cVar);
            this.f49057o = qVar;
            qVar.a(this);
            this.f49045c.i(this.f49057o);
        } else if (obj == T.f48399L) {
            q qVar2 = this.f49058p;
            if (qVar2 != null) {
                this.f49045c.I(qVar2);
            }
            if (cVar == null) {
                this.f49058p = null;
                return;
            }
            this.f49046d.a();
            this.f49047e.a();
            q qVar3 = new q(cVar);
            this.f49058p = qVar3;
            qVar3.a(this);
            this.f49045c.i(this.f49058p);
        } else if (obj == T.f48413j) {
            C4155a aVar2 = this.f49061s;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            q qVar4 = new q(cVar);
            this.f49061s = qVar4;
            qVar4.a(this);
            this.f49045c.i(this.f49061s);
        } else if (obj == T.f48408e && (cVar6 = this.f49063u) != null) {
            cVar6.c(cVar);
        } else if (obj == T.f48394G && (cVar5 = this.f49063u) != null) {
            cVar5.f(cVar);
        } else if (obj == T.f48395H && (cVar4 = this.f49063u) != null) {
            cVar4.d(cVar);
        } else if (obj == T.f48396I && (cVar3 = this.f49063u) != null) {
            cVar3.e(cVar);
        } else if (obj == T.f48397J && (cVar2 = this.f49063u) != null) {
            cVar2.g(cVar);
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        this.f49048f.reset();
        for (int i10 = 0; i10 < this.f49051i.size(); i10++) {
            this.f49048f.addPath(((C4128m) this.f49051i.get(i10)).m(), matrix);
        }
        this.f49048f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public String getName() {
        return this.f49043a;
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (!this.f49044b) {
            if (C4065e.h()) {
                C4065e.b("GradientFillContent#draw");
            }
            this.f49048f.reset();
            for (int i11 = 0; i11 < this.f49051i.size(); i11++) {
                this.f49048f.addPath(((C4128m) this.f49051i.get(i11)).m(), matrix);
            }
            this.f49048f.computeBounds(this.f49050h, false);
            if (this.f49052j == g.LINEAR) {
                shader = j();
            } else {
                shader = k();
            }
            shader.setLocalMatrix(matrix);
            this.f49049g.setShader(shader);
            C4155a aVar = this.f49057o;
            if (aVar != null) {
                this.f49049g.setColorFilter((ColorFilter) aVar.h());
            }
            C4155a aVar2 = this.f49061s;
            if (aVar2 != null) {
                float floatValue = ((Float) aVar2.h()).floatValue();
                if (floatValue == 0.0f) {
                    this.f49049g.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f49062t) {
                    this.f49049g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.f49062t = floatValue;
            }
            int intValue = (int) ((((((float) i10) / 255.0f) * ((float) ((Integer) this.f49054l.h()).intValue())) / 100.0f) * 255.0f);
            this.f49049g.setAlpha(k.c(intValue, 0, 255));
            C4157c cVar = this.f49063u;
            if (cVar != null) {
                cVar.a(this.f49049g, matrix, l.l(i10, intValue));
            }
            canvas.drawPath(this.f49048f, this.f49049g);
            if (C4065e.h()) {
                C4065e.c("GradientFillContent#draw");
            }
        }
    }
}
