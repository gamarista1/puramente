package D4;

import H4.l;
import I4.c;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import u4.L;
import u4.O;
import u4.T;
import v4.C4103a;
import x4.C4155a;
import x4.C4157c;
import x4.q;

public class d extends b {

    /* renamed from: E  reason: collision with root package name */
    private final Paint f30310E = new C4103a(3);

    /* renamed from: F  reason: collision with root package name */
    private final Rect f30311F = new Rect();

    /* renamed from: G  reason: collision with root package name */
    private final Rect f30312G = new Rect();

    /* renamed from: H  reason: collision with root package name */
    private final O f30313H;

    /* renamed from: I  reason: collision with root package name */
    private C4155a f30314I;

    /* renamed from: J  reason: collision with root package name */
    private C4155a f30315J;

    /* renamed from: K  reason: collision with root package name */
    private C4157c f30316K;

    d(L l10, e eVar) {
        super(l10, eVar);
        this.f30313H = l10.P(eVar.n());
        if (z() != null) {
            this.f30316K = new C4157c(this, this, z());
        }
    }

    private Bitmap Q() {
        Bitmap bitmap;
        C4155a aVar = this.f30315J;
        if (aVar != null && (bitmap = (Bitmap) aVar.h()) != null) {
            return bitmap;
        }
        Bitmap G10 = this.f30289p.G(this.f30290q.n());
        if (G10 != null) {
            return G10;
        }
        O o10 = this.f30313H;
        if (o10 != null) {
            return o10.b();
        }
        return null;
    }

    public void e(Object obj, c cVar) {
        super.e(obj, cVar);
        if (obj == T.f48398K) {
            if (cVar == null) {
                this.f30314I = null;
            } else {
                this.f30314I = new q(cVar);
            }
        } else if (obj != T.f48401N) {
        } else {
            if (cVar == null) {
                this.f30315J = null;
            } else {
                this.f30315J = new q(cVar);
            }
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        if (this.f30313H != null) {
            float e10 = l.e();
            rectF.set(0.0f, 0.0f, ((float) this.f30313H.f()) * e10, ((float) this.f30313H.d()) * e10);
            this.f30288o.mapRect(rectF);
        }
    }

    public void u(Canvas canvas, Matrix matrix, int i10) {
        Bitmap Q10 = Q();
        if (Q10 != null && !Q10.isRecycled() && this.f30313H != null) {
            float e10 = l.e();
            this.f30310E.setAlpha(i10);
            C4155a aVar = this.f30314I;
            if (aVar != null) {
                this.f30310E.setColorFilter((ColorFilter) aVar.h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f30311F.set(0, 0, Q10.getWidth(), Q10.getHeight());
            if (this.f30289p.Q()) {
                this.f30312G.set(0, 0, (int) (((float) this.f30313H.f()) * e10), (int) (((float) this.f30313H.d()) * e10));
            } else {
                this.f30312G.set(0, 0, (int) (((float) Q10.getWidth()) * e10), (int) (((float) Q10.getHeight()) * e10));
            }
            C4157c cVar = this.f30316K;
            if (cVar != null) {
                cVar.a(this.f30310E, matrix, i10);
            }
            canvas.drawBitmap(Q10, this.f30311F, this.f30312G, this.f30310E);
            canvas.restore();
        }
    }
}
