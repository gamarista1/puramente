package x;

import Af.a;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C0;
import o0.C2344g;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;
import r0.C2448H;
import t0.C2602c;
import t0.C2605f;
import yf.C6798l;

/* renamed from: x.o  reason: case insensitive filesystem */
final class C2876o extends C0 implements C2344g {

    /* renamed from: c  reason: collision with root package name */
    private final C2862a f27972c;

    /* renamed from: d  reason: collision with root package name */
    private final C2884w f27973d;

    /* renamed from: e  reason: collision with root package name */
    private final C2853Q f27974e;

    public C2876o(C2862a aVar, C2884w wVar, C2853Q q10, C6798l lVar) {
        super(lVar);
        this.f27972c = aVar;
        this.f27973d = wVar;
        this.f27974e = q10;
    }

    private final boolean a(C2605f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return i(180.0f, C2422h.a(-C2427m.k(fVar.d()), (-C2427m.i(fVar.d())) + fVar.t1(this.f27974e.a().a())), edgeEffect, canvas);
    }

    private final boolean b(C2605f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return i(270.0f, C2422h.a(-C2427m.i(fVar.d()), fVar.t1(this.f27974e.a().c(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean d(C2605f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return i(90.0f, C2422h.a(0.0f, (-((float) a.d(C2427m.k(fVar.d())))) + fVar.t1(this.f27974e.a().b(fVar.getLayoutDirection()))), edgeEffect, canvas);
    }

    private final boolean e(C2605f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        return i(0.0f, C2422h.a(0.0f, fVar.t1(this.f27974e.a().d())), edgeEffect, canvas);
    }

    private final boolean i(float f10, long j10, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f10);
        canvas.translate(C2421g.m(j10), C2421g.n(j10));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public void u(C2602c cVar) {
        boolean z10;
        this.f27972c.r(cVar.d());
        if (C2427m.m(cVar.d())) {
            cVar.H1();
            return;
        }
        cVar.H1();
        this.f27972c.j().getValue();
        Canvas d10 = C2448H.d(cVar.w1().f());
        C2884w wVar = this.f27973d;
        boolean z11 = false;
        if (wVar.r()) {
            z10 = b(cVar, wVar.h(), d10);
        } else {
            z10 = false;
        }
        if (wVar.y()) {
            if (e(cVar, wVar.l(), d10) || z10) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (wVar.u()) {
            if (d(cVar, wVar.j(), d10) || z10) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (wVar.o()) {
            if (a(cVar, wVar.f(), d10) || z10) {
                z11 = true;
            }
            z10 = z11;
        }
        if (z10) {
            this.f27972c.k();
        }
    }
}
