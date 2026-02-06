package C4;

import A4.a;
import H4.f;
import H4.k;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final List f29990a;

    /* renamed from: b  reason: collision with root package name */
    private PointF f29991b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29992c;

    public o(PointF pointF, boolean z10, List list) {
        this.f29991b = pointF;
        this.f29992c = z10;
        this.f29990a = new ArrayList(list);
    }

    public List a() {
        return this.f29990a;
    }

    public PointF b() {
        return this.f29991b;
    }

    public void c(o oVar, o oVar2, float f10) {
        boolean z10;
        if (this.f29991b == null) {
            this.f29991b = new PointF();
        }
        if (oVar.d() || oVar2.d()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29992c = z10;
        if (oVar.a().size() != oVar2.a().size()) {
            f.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int min = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f29990a.size() < min) {
            for (int size = this.f29990a.size(); size < min; size++) {
                this.f29990a.add(new a());
            }
        } else if (this.f29990a.size() > min) {
            for (int size2 = this.f29990a.size() - 1; size2 >= min; size2--) {
                List list = this.f29990a;
                list.remove(list.size() - 1);
            }
        }
        PointF b10 = oVar.b();
        PointF b11 = oVar2.b();
        f(k.i(b10.x, b11.x, f10), k.i(b10.y, b11.y, f10));
        for (int size3 = this.f29990a.size() - 1; size3 >= 0; size3--) {
            a aVar = (a) oVar.a().get(size3);
            a aVar2 = (a) oVar2.a().get(size3);
            PointF a10 = aVar.a();
            PointF b12 = aVar.b();
            PointF c10 = aVar.c();
            PointF a11 = aVar2.a();
            PointF b13 = aVar2.b();
            PointF c11 = aVar2.c();
            ((a) this.f29990a.get(size3)).d(k.i(a10.x, a11.x, f10), k.i(a10.y, a11.y, f10));
            ((a) this.f29990a.get(size3)).e(k.i(b12.x, b13.x, f10), k.i(b12.y, b13.y, f10));
            ((a) this.f29990a.get(size3)).f(k.i(c10.x, c11.x, f10), k.i(c10.y, c11.y, f10));
        }
    }

    public boolean d() {
        return this.f29992c;
    }

    public void e(boolean z10) {
        this.f29992c = z10;
    }

    public void f(float f10, float f11) {
        if (this.f29991b == null) {
            this.f29991b = new PointF();
        }
        this.f29991b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f29990a.size() + "closed=" + this.f29992c + '}';
    }

    public o() {
        this.f29990a = new ArrayList();
    }
}
