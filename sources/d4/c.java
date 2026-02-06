package D4;

import A4.e;
import B4.b;
import H4.l;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.C1607v;
import java.util.ArrayList;
import java.util.List;
import u4.C4065e;
import u4.C4071k;
import u4.L;
import u4.T;
import x4.C4155a;
import x4.C4158d;
import x4.q;

public class c extends b {

    /* renamed from: E  reason: collision with root package name */
    private C4155a f30302E;

    /* renamed from: F  reason: collision with root package name */
    private final List f30303F = new ArrayList();

    /* renamed from: G  reason: collision with root package name */
    private final RectF f30304G = new RectF();

    /* renamed from: H  reason: collision with root package name */
    private final RectF f30305H = new RectF();

    /* renamed from: I  reason: collision with root package name */
    private final Paint f30306I = new Paint();

    /* renamed from: J  reason: collision with root package name */
    private float f30307J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f30308K = true;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30309a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                D4.e$b[] r0 = D4.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30309a = r0
                D4.e$b r1 = D4.e.b.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30309a     // Catch:{ NoSuchFieldError -> 0x001d }
                D4.e$b r1 = D4.e.b.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D4.c.a.<clinit>():void");
        }
    }

    public c(L l10, e eVar, List list, C4071k kVar) {
        super(l10, eVar);
        int i10;
        b bVar;
        b v10 = eVar.v();
        if (v10 != null) {
            C4158d a10 = v10.h();
            this.f30302E = a10;
            i(a10);
            this.f30302E.a(this);
        } else {
            this.f30302E = null;
        }
        C1607v vVar = new C1607v(kVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = (e) list.get(size);
            b v11 = b.v(this, eVar2, l10, kVar);
            if (v11 != null) {
                vVar.j(v11.A().e(), v11);
                if (bVar2 != null) {
                    bVar2.K(v11);
                    bVar2 = null;
                } else {
                    this.f30303F.add(0, v11);
                    int i11 = a.f30309a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = v11;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < vVar.m(); i10++) {
            b bVar3 = (b) vVar.e(vVar.i(i10));
            if (!(bVar3 == null || (bVar = (b) vVar.e(bVar3.A().k())) == null)) {
                bVar3.M(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void J(e eVar, int i10, List list, e eVar2) {
        for (int i11 = 0; i11 < this.f30303F.size(); i11++) {
            ((b) this.f30303F.get(i11)).d(eVar, i10, list, eVar2);
        }
    }

    public void L(boolean z10) {
        super.L(z10);
        for (b L10 : this.f30303F) {
            L10.L(z10);
        }
    }

    public void N(float f10) {
        if (C4065e.h()) {
            C4065e.b("CompositionLayer#setProgress");
        }
        this.f30307J = f10;
        super.N(f10);
        if (this.f30302E != null) {
            f10 = ((((Float) this.f30302E.h()).floatValue() * this.f30290q.c().i()) - this.f30290q.c().p()) / (this.f30289p.J().e() + 0.01f);
        }
        if (this.f30302E == null) {
            f10 -= this.f30290q.s();
        }
        if (this.f30290q.w() != 0.0f && !"__container".equals(this.f30290q.j())) {
            f10 /= this.f30290q.w();
        }
        for (int size = this.f30303F.size() - 1; size >= 0; size--) {
            ((b) this.f30303F.get(size)).N(f10);
        }
        if (C4065e.h()) {
            C4065e.c("CompositionLayer#setProgress");
        }
    }

    public float Q() {
        return this.f30307J;
    }

    public void R(boolean z10) {
        this.f30308K = z10;
    }

    public void e(Object obj, I4.c cVar) {
        super.e(obj, cVar);
        if (obj != T.f48392E) {
            return;
        }
        if (cVar == null) {
            C4155a aVar = this.f30302E;
            if (aVar != null) {
                aVar.o((I4.c) null);
                return;
            }
            return;
        }
        q qVar = new q(cVar);
        this.f30302E = qVar;
        qVar.a(this);
        i(this.f30302E);
    }

    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        for (int size = this.f30303F.size() - 1; size >= 0; size--) {
            this.f30304G.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) this.f30303F.get(size)).f(this.f30304G, this.f30288o, true);
            rectF.union(this.f30304G);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        if (C4065e.h()) {
            C4065e.b("CompositionLayer#draw");
        }
        this.f30305H.set(0.0f, 0.0f, this.f30290q.m(), this.f30290q.l());
        matrix.mapRect(this.f30305H);
        if (!this.f30289p.f0() || this.f30303F.size() <= 1 || i10 == 255) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f30306I.setAlpha(i10);
            l.n(canvas, this.f30305H, this.f30306I);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f30303F.size() - 1; size >= 0; size--) {
            if ((this.f30308K || !"__container".equals(this.f30290q.j())) && !this.f30305H.isEmpty()) {
                z11 = canvas.clipRect(this.f30305H);
            } else {
                z11 = true;
            }
            if (z11) {
                ((b) this.f30303F.get(size)).h(canvas, matrix, i10);
            }
        }
        canvas.restore();
        if (C4065e.h()) {
            C4065e.c("CompositionLayer#draw");
        }
    }
}
