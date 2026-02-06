package w4;

import C4.s;
import D4.b;
import I4.c;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import u4.L;
import u4.T;
import x4.C4155a;
import x4.C4156b;
import x4.q;

public class t extends C4116a {

    /* renamed from: r  reason: collision with root package name */
    private final b f49133r;

    /* renamed from: s  reason: collision with root package name */
    private final String f49134s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f49135t;

    /* renamed from: u  reason: collision with root package name */
    private final C4155a f49136u;

    /* renamed from: v  reason: collision with root package name */
    private C4155a f49137v;

    public t(L l10, b bVar, s sVar) {
        super(l10, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f49133r = bVar;
        this.f49134s = sVar.h();
        this.f49135t = sVar.k();
        C4155a h10 = sVar.c().h();
        this.f49136u = h10;
        h10.a(this);
        bVar.i(h10);
    }

    public void e(Object obj, c cVar) {
        super.e(obj, cVar);
        if (obj == T.f48405b) {
            this.f49136u.o(cVar);
        } else if (obj == T.f48398K) {
            C4155a aVar = this.f49137v;
            if (aVar != null) {
                this.f49133r.I(aVar);
            }
            if (cVar == null) {
                this.f49137v = null;
                return;
            }
            q qVar = new q(cVar);
            this.f49137v = qVar;
            qVar.a(this);
            this.f49133r.i(this.f49136u);
        }
    }

    public String getName() {
        return this.f49134s;
    }

    public void h(Canvas canvas, Matrix matrix, int i10) {
        if (!this.f49135t) {
            this.f48999i.setColor(((C4156b) this.f49136u).q());
            C4155a aVar = this.f49137v;
            if (aVar != null) {
                this.f48999i.setColorFilter((ColorFilter) aVar.h());
            }
            super.h(canvas, matrix, i10);
        }
    }
}
