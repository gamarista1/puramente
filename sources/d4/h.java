package D4;

import I4.c;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import u4.L;
import u4.T;
import v4.C4103a;
import x4.C4155a;
import x4.q;

public class h extends b {

    /* renamed from: E  reason: collision with root package name */
    private final RectF f30359E = new RectF();

    /* renamed from: F  reason: collision with root package name */
    private final Paint f30360F;

    /* renamed from: G  reason: collision with root package name */
    private final float[] f30361G;

    /* renamed from: H  reason: collision with root package name */
    private final Path f30362H;

    /* renamed from: I  reason: collision with root package name */
    private final e f30363I;

    /* renamed from: J  reason: collision with root package name */
    private C4155a f30364J;

    /* renamed from: K  reason: collision with root package name */
    private C4155a f30365K;

    h(L l10, e eVar) {
        super(l10, eVar);
        C4103a aVar = new C4103a();
        this.f30360F = aVar;
        this.f30361G = new float[8];
        this.f30362H = new Path();
        this.f30363I = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    public void e(Object obj, c cVar) {
        super.e(obj, cVar);
        if (obj == T.f48398K) {
            if (cVar == null) {
                this.f30364J = null;
            } else {
                this.f30364J = new q(cVar);
            }
        } else if (obj != T.f48404a) {
        } else {
            if (cVar == null) {
                this.f30365K = null;
                this.f30360F.setColor(this.f30363I.p());
                return;
            }
            this.f30365K = new q(cVar);
        }
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        this.f30359E.set(0.0f, 0.0f, (float) this.f30363I.r(), (float) this.f30363I.q());
        this.f30288o.mapRect(this.f30359E);
        rectF.set(this.f30359E);
    }

    public void u(Canvas canvas, Matrix matrix, int i10) {
        Integer num;
        int i11;
        int alpha = Color.alpha(this.f30363I.p());
        if (alpha != 0) {
            C4155a aVar = this.f30365K;
            if (aVar == null) {
                num = null;
            } else {
                num = (Integer) aVar.h();
            }
            if (num != null) {
                this.f30360F.setColor(num.intValue());
            } else {
                this.f30360F.setColor(this.f30363I.p());
            }
            if (this.f30297x.h() == null) {
                i11 = 100;
            } else {
                i11 = ((Integer) this.f30297x.h().h()).intValue();
            }
            int i12 = (int) ((((float) i10) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) i11)) / 100.0f) * 255.0f);
            this.f30360F.setAlpha(i12);
            C4155a aVar2 = this.f30364J;
            if (aVar2 != null) {
                this.f30360F.setColorFilter((ColorFilter) aVar2.h());
            }
            if (i12 > 0) {
                float[] fArr = this.f30361G;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f30363I.r();
                float[] fArr2 = this.f30361G;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f30363I.r();
                this.f30361G[5] = (float) this.f30363I.q();
                float[] fArr3 = this.f30361G;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f30363I.q();
                matrix.mapPoints(this.f30361G);
                this.f30362H.reset();
                Path path = this.f30362H;
                float[] fArr4 = this.f30361G;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f30362H;
                float[] fArr5 = this.f30361G;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f30362H;
                float[] fArr6 = this.f30361G;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f30362H;
                float[] fArr7 = this.f30361G;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f30362H;
                float[] fArr8 = this.f30361G;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f30362H.close();
                canvas.drawPath(this.f30362H, this.f30360F);
            }
        }
    }
}
