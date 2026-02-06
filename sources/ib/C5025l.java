package ib;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: ib.l  reason: case insensitive filesystem */
public class C5025l {

    /* renamed from: a  reason: collision with root package name */
    private final m[] f60750a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    private final Matrix[] f60751b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix[] f60752c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    private final PointF f60753d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    private final Path f60754e = new Path();

    /* renamed from: f  reason: collision with root package name */
    private final Path f60755f = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final m f60756g = new m();

    /* renamed from: h  reason: collision with root package name */
    private final float[] f60757h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    private final float[] f60758i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final Path f60759j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private final Path f60760k = new Path();

    /* renamed from: l  reason: collision with root package name */
    private boolean f60761l = true;

    /* renamed from: ib.l$a */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final C5025l f60762a = new C5025l();
    }

    /* renamed from: ib.l$b */
    public interface b {
        void a(m mVar, Matrix matrix, int i10);

        void b(m mVar, Matrix matrix, int i10);
    }

    /* renamed from: ib.l$c */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final C5024k f60763a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f60764b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f60765c;

        /* renamed from: d  reason: collision with root package name */
        public final b f60766d;

        /* renamed from: e  reason: collision with root package name */
        public final float f60767e;

        c(C5024k kVar, float f10, RectF rectF, b bVar, Path path) {
            this.f60766d = bVar;
            this.f60763a = kVar;
            this.f60767e = f10;
            this.f60765c = rectF;
            this.f60764b = path;
        }
    }

    public C5025l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f60750a[i10] = new m();
            this.f60751b[i10] = new Matrix();
            this.f60752c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return (float) ((i10 + 1) * 90);
    }

    private void b(c cVar, int i10) {
        this.f60757h[0] = this.f60750a[i10].k();
        this.f60757h[1] = this.f60750a[i10].l();
        this.f60751b[i10].mapPoints(this.f60757h);
        if (i10 == 0) {
            Path path = cVar.f60764b;
            float[] fArr = this.f60757h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f60764b;
            float[] fArr2 = this.f60757h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f60750a[i10].d(this.f60751b[i10], cVar.f60764b);
        b bVar = cVar.f60766d;
        if (bVar != null) {
            bVar.a(this.f60750a[i10], this.f60751b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f60757h[0] = this.f60750a[i10].i();
        this.f60757h[1] = this.f60750a[i10].j();
        this.f60751b[i10].mapPoints(this.f60757h);
        this.f60758i[0] = this.f60750a[i11].k();
        this.f60758i[1] = this.f60750a[i11].l();
        this.f60751b[i11].mapPoints(this.f60758i);
        float[] fArr = this.f60757h;
        float f10 = fArr[0];
        float[] fArr2 = this.f60758i;
        float max = Math.max(((float) Math.hypot((double) (f10 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i12 = i(cVar.f60765c, i10);
        this.f60756g.n(0.0f, 0.0f);
        C5019f j10 = j(i10, cVar.f60763a);
        j10.b(max, i12, cVar.f60767e, this.f60756g);
        this.f60759j.reset();
        this.f60756g.d(this.f60752c[i10], this.f60759j);
        if (!this.f60761l || (!j10.a() && !l(this.f60759j, i10) && !l(this.f60759j, i11))) {
            this.f60756g.d(this.f60752c[i10], cVar.f60764b);
        } else {
            Path path = this.f60759j;
            path.op(path, this.f60755f, Path.Op.DIFFERENCE);
            this.f60757h[0] = this.f60756g.k();
            this.f60757h[1] = this.f60756g.l();
            this.f60752c[i10].mapPoints(this.f60757h);
            Path path2 = this.f60754e;
            float[] fArr3 = this.f60757h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f60756g.d(this.f60752c[i10], this.f60754e);
        }
        b bVar = cVar.f60766d;
        if (bVar != null) {
            bVar.b(this.f60756g, this.f60752c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private C5016c g(int i10, C5024k kVar) {
        if (i10 == 1) {
            return kVar.l();
        }
        if (i10 == 2) {
            return kVar.j();
        }
        if (i10 != 3) {
            return kVar.t();
        }
        return kVar.r();
    }

    private C5017d h(int i10, C5024k kVar) {
        if (i10 == 1) {
            return kVar.k();
        }
        if (i10 == 2) {
            return kVar.i();
        }
        if (i10 != 3) {
            return kVar.s();
        }
        return kVar.q();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f60757h;
        m mVar = this.f60750a[i10];
        fArr[0] = mVar.f60770c;
        fArr[1] = mVar.f60771d;
        this.f60751b[i10].mapPoints(fArr);
        if (i10 == 1 || i10 == 3) {
            return Math.abs(rectF.centerX() - this.f60757h[0]);
        }
        return Math.abs(rectF.centerY() - this.f60757h[1]);
    }

    private C5019f j(int i10, C5024k kVar) {
        if (i10 == 1) {
            return kVar.h();
        }
        if (i10 == 2) {
            return kVar.n();
        }
        if (i10 != 3) {
            return kVar.o();
        }
        return kVar.p();
    }

    public static C5025l k() {
        return a.f60762a;
    }

    private boolean l(Path path, int i10) {
        this.f60760k.reset();
        this.f60750a[i10].d(this.f60751b[i10], this.f60760k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f60760k.computeBounds(rectF, true);
        path.op(this.f60760k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f60763a).b(this.f60750a[i10], 90.0f, cVar.f60767e, cVar.f60765c, g(i10, cVar.f60763a));
        float a10 = a(i10);
        this.f60751b[i10].reset();
        f(i10, cVar.f60765c, this.f60753d);
        Matrix matrix = this.f60751b[i10];
        PointF pointF = this.f60753d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f60751b[i10].preRotate(a10);
    }

    private void n(int i10) {
        this.f60757h[0] = this.f60750a[i10].i();
        this.f60757h[1] = this.f60750a[i10].j();
        this.f60751b[i10].mapPoints(this.f60757h);
        float a10 = a(i10);
        this.f60752c[i10].reset();
        Matrix matrix = this.f60752c[i10];
        float[] fArr = this.f60757h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f60752c[i10].preRotate(a10);
    }

    public void d(C5024k kVar, float f10, RectF rectF, Path path) {
        e(kVar, f10, rectF, (b) null, path);
    }

    public void e(C5024k kVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f60754e.rewind();
        this.f60755f.rewind();
        this.f60755f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f60754e.close();
        if (!this.f60754e.isEmpty()) {
            path.op(this.f60754e, Path.Op.UNION);
        }
    }
}
