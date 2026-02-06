package r0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import c1.n;
import c1.r;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import q0.C2421g;
import q0.C2423i;

/* renamed from: r0.G  reason: case insensitive filesystem */
public final class C2446G implements C2520p0 {

    /* renamed from: a  reason: collision with root package name */
    private Canvas f25418a = C2448H.f25422a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f25419b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f25420c;

    public final Region.Op A(int i10) {
        if (C2541w0.d(i10, C2541w0.f25557a.a())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    public final Canvas a() {
        return this.f25418a;
    }

    public void b(S1 s12, int i10) {
        Canvas canvas = this.f25418a;
        if (s12 instanceof C2469V) {
            canvas.clipPath(((C2469V) s12).u(), A(i10));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void c(float f10, float f11, float f12, float f13, int i10) {
        this.f25418a.clipRect(f10, f11, f12, f13, A(i10));
    }

    public void d(float f10, float f11) {
        this.f25418a.translate(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f25418a.scale(f10, f11);
    }

    public void g(C2423i iVar, Q1 q12) {
        this.f25418a.saveLayer(iVar.i(), iVar.l(), iVar.j(), iVar.e(), q12.q(), 31);
    }

    public void h() {
        this.f25418a.restore();
    }

    public void i(float f10, float f11, float f12, float f13, float f14, float f15, Q1 q12) {
        this.f25418a.drawRoundRect(f10, f11, f12, f13, f14, f15, q12.q());
    }

    public void j(long j10, long j11, Q1 q12) {
        this.f25418a.drawLine(C2421g.m(j10), C2421g.n(j10), C2421g.m(j11), C2421g.n(j11), q12.q());
    }

    public void k(S1 s12, Q1 q12) {
        Canvas canvas = this.f25418a;
        if (s12 instanceof C2469V) {
            canvas.drawPath(((C2469V) s12).u(), q12.q());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void l(float f10, float f11, float f12, float f13, Q1 q12) {
        this.f25418a.drawRect(f10, f11, f12, f13, q12.q());
    }

    public void m(long j10, float f10, Q1 q12) {
        this.f25418a.drawCircle(C2421g.m(j10), C2421g.n(j10), f10, q12.q());
    }

    public void n() {
        C2529s0.f25552a.a(this.f25418a, true);
    }

    public void o(float f10) {
        this.f25418a.rotate(f10);
    }

    public void q() {
        this.f25418a.save();
    }

    public void r() {
        C2529s0.f25552a.a(this.f25418a, false);
    }

    public void s(float[] fArr) {
        if (!N1.c(fArr)) {
            Matrix matrix = new Matrix();
            C2466S.a(matrix, fArr);
            this.f25418a.concat(matrix);
        }
    }

    public void u(H1 h12, long j10, Q1 q12) {
        this.f25418a.drawBitmap(C2465Q.b(h12), C2421g.m(j10), C2421g.n(j10), q12.q());
    }

    public void v(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Q1 q12) {
        this.f25418a.drawArc(f10, f11, f12, f13, f14, f15, z10, q12.q());
    }

    public void y(H1 h12, long j10, long j11, long j12, long j13, Q1 q12) {
        if (this.f25419b == null) {
            this.f25419b = new Rect();
            this.f25420c = new Rect();
        }
        Canvas canvas = this.f25418a;
        Bitmap b10 = C2465Q.b(h12);
        Rect rect = this.f25419b;
        C6496s.e(rect);
        rect.left = n.j(j10);
        rect.top = n.k(j10);
        rect.right = n.j(j10) + r.g(j11);
        rect.bottom = n.k(j10) + r.f(j11);
        C6514M m10 = C6514M.f71813a;
        Rect rect2 = this.f25420c;
        C6496s.e(rect2);
        rect2.left = n.j(j12);
        rect2.top = n.k(j12);
        rect2.right = n.j(j12) + r.g(j13);
        rect2.bottom = n.k(j12) + r.f(j13);
        canvas.drawBitmap(b10, rect, rect2, q12.q());
    }

    public final void z(Canvas canvas) {
        this.f25418a = canvas;
    }
}
