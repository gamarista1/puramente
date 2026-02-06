package r0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2415a;
import q0.C2421g;
import q0.C2423i;
import q0.C2425k;
import r0.S1;
import r0.W1;

/* renamed from: r0.V  reason: case insensitive filesystem */
public final class C2469V implements S1 {

    /* renamed from: b  reason: collision with root package name */
    private final Path f25469b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f25470c;

    /* renamed from: d  reason: collision with root package name */
    private float[] f25471d;

    /* renamed from: e  reason: collision with root package name */
    private Matrix f25472e;

    public C2469V(Path path) {
        this.f25469b = path;
    }

    private final void v(C2423i iVar) {
        if (Float.isNaN(iVar.i()) || Float.isNaN(iVar.l()) || Float.isNaN(iVar.j()) || Float.isNaN(iVar.e())) {
            C2472Y.d("Invalid rectangle, make sure no value is NaN");
        }
    }

    public boolean b() {
        return this.f25469b.isConvex();
    }

    public void c(float f10, float f11) {
        this.f25469b.rMoveTo(f10, f11);
    }

    public void close() {
        this.f25469b.close();
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f25469b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    public void e(int i10) {
        Path.FillType fillType;
        Path path = this.f25469b;
        if (U1.d(i10, U1.f25466a.a())) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        path.setFillType(fillType);
    }

    public void f(float f10, float f11, float f12, float f13) {
        this.f25469b.quadTo(f10, f11, f12, f13);
    }

    public void g(C2423i iVar, S1.b bVar) {
        v(iVar);
        if (this.f25470c == null) {
            this.f25470c = new RectF();
        }
        RectF rectF = this.f25470c;
        C6496s.e(rectF);
        rectF.set(iVar.i(), iVar.l(), iVar.j(), iVar.e());
        Path path = this.f25469b;
        RectF rectF2 = this.f25470c;
        C6496s.e(rectF2);
        path.addRect(rectF2, C2472Y.e(bVar));
    }

    public C2423i getBounds() {
        if (this.f25470c == null) {
            this.f25470c = new RectF();
        }
        RectF rectF = this.f25470c;
        C6496s.e(rectF);
        this.f25469b.computeBounds(rectF, true);
        return new C2423i(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public void i(long j10) {
        Matrix matrix = this.f25472e;
        if (matrix == null) {
            this.f25472e = new Matrix();
        } else {
            C6496s.e(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f25472e;
        C6496s.e(matrix2);
        matrix2.setTranslate(C2421g.m(j10), C2421g.n(j10));
        Path path = this.f25469b;
        Matrix matrix3 = this.f25472e;
        C6496s.e(matrix3);
        path.transform(matrix3);
    }

    public boolean isEmpty() {
        return this.f25469b.isEmpty();
    }

    public void k(float f10, float f11, float f12, float f13) {
        this.f25469b.rQuadTo(f10, f11, f12, f13);
    }

    public boolean l(S1 s12, S1 s13, int i10) {
        Path.Op op;
        W1.a aVar = W1.f25474a;
        if (W1.f(i10, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (W1.f(i10, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (W1.f(i10, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else if (W1.f(i10, aVar.d())) {
            op = Path.Op.UNION;
        } else {
            op = Path.Op.XOR;
        }
        Path path = this.f25469b;
        if (s12 instanceof C2469V) {
            Path u10 = ((C2469V) s12).u();
            if (s13 instanceof C2469V) {
                return path.op(u10, ((C2469V) s13).u(), op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void m(S1 s12, long j10) {
        Path path = this.f25469b;
        if (s12 instanceof C2469V) {
            path.addPath(((C2469V) s12).u(), C2421g.m(j10), C2421g.n(j10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public int n() {
        if (this.f25469b.getFillType() == Path.FillType.EVEN_ODD) {
            return U1.f25466a.a();
        }
        return U1.f25466a.b();
    }

    public void o() {
        this.f25469b.rewind();
    }

    public void p(float f10, float f11) {
        this.f25469b.moveTo(f10, f11);
    }

    public void q(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f25469b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    public void r(C2425k kVar, S1.b bVar) {
        if (this.f25470c == null) {
            this.f25470c = new RectF();
        }
        RectF rectF = this.f25470c;
        C6496s.e(rectF);
        rectF.set(kVar.e(), kVar.g(), kVar.f(), kVar.a());
        if (this.f25471d == null) {
            this.f25471d = new float[8];
        }
        float[] fArr = this.f25471d;
        C6496s.e(fArr);
        fArr[0] = C2415a.d(kVar.h());
        fArr[1] = C2415a.e(kVar.h());
        fArr[2] = C2415a.d(kVar.i());
        fArr[3] = C2415a.e(kVar.i());
        fArr[4] = C2415a.d(kVar.c());
        fArr[5] = C2415a.e(kVar.c());
        fArr[6] = C2415a.d(kVar.b());
        fArr[7] = C2415a.e(kVar.b());
        Path path = this.f25469b;
        RectF rectF2 = this.f25470c;
        C6496s.e(rectF2);
        float[] fArr2 = this.f25471d;
        C6496s.e(fArr2);
        path.addRoundRect(rectF2, fArr2, C2472Y.e(bVar));
    }

    public void reset() {
        this.f25469b.reset();
    }

    public void s(float f10, float f11) {
        this.f25469b.rLineTo(f10, f11);
    }

    public void t(float f10, float f11) {
        this.f25469b.lineTo(f10, f11);
    }

    public final Path u() {
        return this.f25469b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2469V(Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Path() : path);
    }
}
