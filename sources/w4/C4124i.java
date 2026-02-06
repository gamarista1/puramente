package w4;

import C4.d;
import C4.f;
import C4.g;
import D4.b;
import I4.c;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.C1607v;
import u4.L;
import u4.T;
import x4.C4155a;
import x4.q;

/* renamed from: w4.i  reason: case insensitive filesystem */
public class C4124i extends C4116a {

    /* renamed from: A  reason: collision with root package name */
    private final C4155a f49064A;

    /* renamed from: B  reason: collision with root package name */
    private q f49065B;

    /* renamed from: r  reason: collision with root package name */
    private final String f49066r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f49067s;

    /* renamed from: t  reason: collision with root package name */
    private final C1607v f49068t = new C1607v();

    /* renamed from: u  reason: collision with root package name */
    private final C1607v f49069u = new C1607v();

    /* renamed from: v  reason: collision with root package name */
    private final RectF f49070v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    private final g f49071w;

    /* renamed from: x  reason: collision with root package name */
    private final int f49072x;

    /* renamed from: y  reason: collision with root package name */
    private final C4155a f49073y;

    /* renamed from: z  reason: collision with root package name */
    private final C4155a f49074z;

    public C4124i(L l10, b bVar, f fVar) {
        super(l10, bVar, fVar.b().b(), fVar.g().b(), fVar.i(), fVar.k(), fVar.m(), fVar.h(), fVar.c());
        this.f49066r = fVar.j();
        this.f49071w = fVar.f();
        this.f49067s = fVar.n();
        this.f49072x = (int) (l10.J().d() / 32.0f);
        C4155a h10 = fVar.e().h();
        this.f49073y = h10;
        h10.a(this);
        bVar.i(h10);
        C4155a h11 = fVar.l().h();
        this.f49074z = h11;
        h11.a(this);
        bVar.i(h11);
        C4155a h12 = fVar.d().h();
        this.f49064A = h12;
        h12.a(this);
        bVar.i(h12);
    }

    private int[] j(int[] iArr) {
        q qVar = this.f49065B;
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

    private int k() {
        int i10;
        int round = Math.round(this.f49074z.f() * ((float) this.f49072x));
        int round2 = Math.round(this.f49064A.f() * ((float) this.f49072x));
        int round3 = Math.round(this.f49073y.f() * ((float) this.f49072x));
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

    private LinearGradient l() {
        long k10 = (long) k();
        LinearGradient linearGradient = (LinearGradient) this.f49068t.e(k10);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f49074z.h();
        PointF pointF2 = (PointF) this.f49064A.h();
        d dVar = (d) this.f49073y.h();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, j(dVar.d()), dVar.e(), Shader.TileMode.CLAMP);
        this.f49068t.j(k10, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient n() {
        long k10 = (long) k();
        RadialGradient radialGradient = (RadialGradient) this.f49069u.e(k10);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f49074z.h();
        PointF pointF2 = (PointF) this.f49064A.h();
        d dVar = (d) this.f49073y.h();
        int[] j10 = j(dVar.d());
        float[] e10 = dVar.e();
        float f10 = pointF.x;
        float f11 = pointF.y;
        RadialGradient radialGradient2 = new RadialGradient(f10, f11, (float) Math.hypot((double) (pointF2.x - f10), (double) (pointF2.y - f11)), j10, e10, Shader.TileMode.CLAMP);
        this.f49069u.j(k10, radialGradient2);
        return radialGradient2;
    }

    public void e(Object obj, c cVar) {
        super.e(obj, cVar);
        if (obj == T.f48399L) {
            q qVar = this.f49065B;
            if (qVar != null) {
                this.f48996f.I(qVar);
            }
            if (cVar == null) {
                this.f49065B = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.f49065B = qVar2;
            qVar2.a(this);
            this.f48996f.i(this.f49065B);
        }
    }

    public String getName() {
        return this.f49066r;
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (!this.f49067s) {
            f(this.f49070v, matrix, false);
            if (this.f49071w == g.LINEAR) {
                shader = l();
            } else {
                shader = n();
            }
            this.f48999i.setShader(shader);
            super.h(canvas, matrix, i10);
        }
    }
}
