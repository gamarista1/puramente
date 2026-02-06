package r6;

import T5.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import j7.b;
import q6.C3954c;
import q6.C3957f;
import q6.g;
import q6.o;
import q6.q;
import t6.C4048c;

/* renamed from: r6.a  reason: case insensitive filesystem */
public class C3976a implements C4048c {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f47942a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f47943b;

    /* renamed from: c  reason: collision with root package name */
    private C3979d f47944c;

    /* renamed from: d  reason: collision with root package name */
    private final C3978c f47945d;

    /* renamed from: e  reason: collision with root package name */
    private final C3957f f47946e;

    /* renamed from: f  reason: collision with root package name */
    private final g f47947f;

    C3976a(C3977b bVar) {
        int i10;
        int i11;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f47942a = colorDrawable;
        if (b.d()) {
            b.a("GenericDraweeHierarchy()");
        }
        this.f47943b = bVar.o();
        this.f47944c = bVar.r();
        g gVar = new g(colorDrawable);
        this.f47947f = gVar;
        int i12 = 1;
        if (bVar.i() != null) {
            i10 = bVar.i().size();
        } else {
            i10 = 1;
        }
        i10 = i10 == 0 ? 1 : i10;
        if (bVar.l() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = i10 + i11;
        Drawable[] drawableArr = new Drawable[(i13 + 6)];
        drawableArr[0] = h(bVar.e(), (q) null);
        drawableArr[1] = h(bVar.j(), bVar.k());
        drawableArr[2] = g(gVar, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = h(bVar.m(), bVar.n());
        drawableArr[4] = h(bVar.p(), bVar.q());
        drawableArr[5] = h(bVar.g(), bVar.h());
        if (i13 > 0) {
            if (bVar.i() != null) {
                i12 = 0;
                for (Drawable h10 : bVar.i()) {
                    drawableArr[i12 + 6] = h(h10, (q) null);
                    i12++;
                }
            }
            if (bVar.l() != null) {
                drawableArr[i12 + 6] = h(bVar.l(), (q) null);
            }
        }
        C3957f fVar = new C3957f(drawableArr, false, 2);
        this.f47946e = fVar;
        fVar.u(bVar.f());
        C3978c cVar = new C3978c(e.e(fVar, this.f47944c));
        this.f47945d = cVar;
        cVar.mutate();
        s();
        if (b.d()) {
            b.b();
        }
    }

    private Drawable g(Drawable drawable, q qVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return e.g(drawable, qVar, pointF);
    }

    private Drawable h(Drawable drawable, q qVar) {
        return e.f(e.d(drawable, this.f47944c, this.f47943b), qVar);
    }

    private void i(int i10) {
        if (i10 >= 0) {
            this.f47946e.l(i10);
        }
    }

    private void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    private void k(int i10) {
        if (i10 >= 0) {
            this.f47946e.m(i10);
        }
    }

    private C3954c n(int i10) {
        C3954c c10 = this.f47946e.c(i10);
        c10.b();
        if (c10.b() instanceof o) {
            return (o) c10.b();
        }
        return c10;
    }

    private o p(int i10) {
        C3954c n10 = n(i10);
        if (n10 instanceof o) {
            return (o) n10;
        }
        return e.k(n10, q.f47733a);
    }

    private boolean q(int i10) {
        return n(i10) instanceof o;
    }

    private void r() {
        this.f47947f.i(this.f47942a);
    }

    private void s() {
        C3957f fVar = this.f47946e;
        if (fVar != null) {
            fVar.g();
            this.f47946e.j();
            j();
            i(1);
            this.f47946e.n();
            this.f47946e.i();
        }
    }

    private void u(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f47946e.f(i10, (Drawable) null);
            return;
        }
        n(i10).i(e.d(drawable, this.f47944c, this.f47943b));
    }

    private void x(float f10) {
        Drawable b10 = this.f47946e.b(3);
        if (b10 != null) {
            if (f10 >= 0.999f) {
                if (b10 instanceof Animatable) {
                    ((Animatable) b10).stop();
                }
                k(3);
            } else {
                if (b10 instanceof Animatable) {
                    ((Animatable) b10).start();
                }
                i(3);
            }
            b10.setLevel(Math.round(f10 * 10000.0f));
        }
    }

    public void a(Throwable th2) {
        this.f47946e.g();
        j();
        if (this.f47946e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f47946e.i();
    }

    public void b(Throwable th2) {
        this.f47946e.g();
        j();
        if (this.f47946e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f47946e.i();
    }

    public void c(float f10, boolean z10) {
        if (this.f47946e.b(3) != null) {
            this.f47946e.g();
            x(f10);
            if (z10) {
                this.f47946e.n();
            }
            this.f47946e.i();
        }
    }

    public Drawable d() {
        return this.f47945d;
    }

    public void e(Drawable drawable, float f10, boolean z10) {
        Drawable d10 = e.d(drawable, this.f47944c, this.f47943b);
        d10.mutate();
        this.f47947f.i(d10);
        this.f47946e.g();
        j();
        i(2);
        x(f10);
        if (z10) {
            this.f47946e.n();
        }
        this.f47946e.i();
    }

    public void f(Drawable drawable) {
        this.f47945d.x(drawable);
    }

    public Rect getBounds() {
        return this.f47945d.getBounds();
    }

    public PointF l() {
        if (!q(2)) {
            return null;
        }
        return p(2).z();
    }

    public q m() {
        if (!q(2)) {
            return null;
        }
        return p(2).A();
    }

    public C3979d o() {
        return this.f47944c;
    }

    public void reset() {
        r();
        s();
    }

    public void t(q qVar) {
        k.g(qVar);
        p(2).C(qVar);
    }

    public void v(int i10) {
        this.f47946e.u(i10);
    }

    public void w(Drawable drawable, q qVar) {
        u(1, drawable);
        p(1).C(qVar);
    }

    public void y(Drawable drawable) {
        u(3, drawable);
    }

    public void z(C3979d dVar) {
        this.f47944c = dVar;
        e.j(this.f47945d, dVar);
        for (int i10 = 0; i10 < this.f47946e.d(); i10++) {
            e.i(n(i10), this.f47944c, this.f47943b);
        }
    }
}
