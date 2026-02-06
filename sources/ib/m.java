package ib;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import hb.C5009a;
import java.util.ArrayList;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public float f60768a;

    /* renamed from: b  reason: collision with root package name */
    public float f60769b;

    /* renamed from: c  reason: collision with root package name */
    public float f60770c;

    /* renamed from: d  reason: collision with root package name */
    public float f60771d;

    /* renamed from: e  reason: collision with root package name */
    public float f60772e;

    /* renamed from: f  reason: collision with root package name */
    public float f60773f;

    /* renamed from: g  reason: collision with root package name */
    private final List f60774g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List f60775h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private boolean f60776i;

    class a extends g {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f60777b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f60778c;

        a(List list, Matrix matrix) {
            this.f60777b = list;
            this.f60778c = matrix;
        }

        public void a(Matrix matrix, C5009a aVar, int i10, Canvas canvas) {
            for (g a10 : this.f60777b) {
                a10.a(this.f60778c, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        private final d f60780b;

        public b(d dVar) {
            this.f60780b = dVar;
        }

        public void a(Matrix matrix, C5009a aVar, int i10, Canvas canvas) {
            float h10 = this.f60780b.m();
            float i11 = this.f60780b.n();
            aVar.a(canvas, matrix, new RectF(this.f60780b.k(), this.f60780b.o(), this.f60780b.l(), this.f60780b.j()), i10, h10, i11);
        }
    }

    static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        private final e f60781b;

        /* renamed from: c  reason: collision with root package name */
        private final float f60782c;

        /* renamed from: d  reason: collision with root package name */
        private final float f60783d;

        public c(e eVar, float f10, float f11) {
            this.f60781b = eVar;
            this.f60782c = f10;
            this.f60783d = f11;
        }

        public void a(Matrix matrix, C5009a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f60781b.f60792c - this.f60783d), (double) (this.f60781b.f60791b - this.f60782c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f60782c, this.f60783d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i10);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f60781b.f60792c - this.f60783d) / (this.f60781b.f60791b - this.f60782c))));
        }
    }

    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        private static final RectF f60784h = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public float f60785b;

        /* renamed from: c  reason: collision with root package name */
        public float f60786c;

        /* renamed from: d  reason: collision with root package name */
        public float f60787d;

        /* renamed from: e  reason: collision with root package name */
        public float f60788e;

        /* renamed from: f  reason: collision with root package name */
        public float f60789f;

        /* renamed from: g  reason: collision with root package name */
        public float f60790g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.f60788e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.f60785b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.f60787d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f60789f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.f60790g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.f60786c;
        }

        private void p(float f10) {
            this.f60788e = f10;
        }

        private void q(float f10) {
            this.f60785b = f10;
        }

        private void r(float f10) {
            this.f60787d = f10;
        }

        /* access modifiers changed from: private */
        public void s(float f10) {
            this.f60789f = f10;
        }

        /* access modifiers changed from: private */
        public void t(float f10) {
            this.f60790g = f10;
        }

        private void u(float f10) {
            this.f60786c = f10;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f60793a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f60784h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public float f60791b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public float f60792c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f60793a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f60791b, this.f60792c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected final Matrix f60793a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        static final Matrix f60794a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, C5009a aVar, int i10, Canvas canvas);

        public final void b(C5009a aVar, int i10, Canvas canvas) {
            a(f60794a, aVar, i10, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() != f10) {
            float g10 = ((f10 - g()) + 360.0f) % 360.0f;
            if (g10 <= 180.0f) {
                d dVar = new d(i(), j(), i(), j());
                dVar.s(g());
                dVar.t(g10);
                this.f60775h.add(new b(dVar));
                p(f10);
            }
        }
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f60775h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f60772e;
    }

    private float h() {
        return this.f60773f;
    }

    private void p(float f10) {
        this.f60772e = f10;
    }

    private void q(float f10) {
        this.f60773f = f10;
    }

    private void r(float f10) {
        this.f60770c = f10;
    }

    private void s(float f10) {
        this.f60771d = f10;
    }

    private void t(float f10) {
        this.f60768a = f10;
    }

    private void u(float f10) {
        this.f60769b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10;
        float f16;
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f60774g.add(dVar);
        b bVar = new b(dVar);
        float f17 = f14 + f15;
        if (f15 < 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        if (z10) {
            f16 = (180.0f + f17) % 360.0f;
        } else {
            f16 = f17;
        }
        c(bVar, f14, f16);
        double d10 = (double) f17;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f60774g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f60774g.get(i10)).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f60776i;
    }

    /* access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f60775h), new Matrix(matrix));
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f60770c;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f60771d;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f60768a;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f60769b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        float unused = eVar.f60791b = f10;
        float unused2 = eVar.f60792c = f11;
        this.f60774g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f60774g.clear();
        this.f60775h.clear();
        this.f60776i = false;
    }
}
