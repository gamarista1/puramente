package x;

import Af.a;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.platform.C0;
import c1.d;
import c1.t;
import o0.C2344g;
import q0.C2421g;
import q0.C2427m;
import r0.C2448H;
import r0.C2520p0;
import t0.C2602c;
import t0.C2603d;
import u0.C2673c;
import yf.C6798l;

/* renamed from: x.u  reason: case insensitive filesystem */
final class C2882u extends C0 implements C2344g {

    /* renamed from: c  reason: collision with root package name */
    private final C2862a f27975c;

    /* renamed from: d  reason: collision with root package name */
    private final C2884w f27976d;

    /* renamed from: e  reason: collision with root package name */
    private RenderNode f27977e;

    public C2882u(C2862a aVar, C2884w wVar, C6798l lVar) {
        super(lVar);
        this.f27975c = aVar;
        this.f27976d = wVar;
    }

    private final boolean a(EdgeEffect edgeEffect, Canvas canvas) {
        return i(180.0f, edgeEffect, canvas);
    }

    private final boolean b(EdgeEffect edgeEffect, Canvas canvas) {
        return i(270.0f, edgeEffect, canvas);
    }

    private final boolean d(EdgeEffect edgeEffect, Canvas canvas) {
        return i(90.0f, edgeEffect, canvas);
    }

    private final boolean e(EdgeEffect edgeEffect, Canvas canvas) {
        return i(0.0f, edgeEffect, canvas);
    }

    private final boolean i(float f10, EdgeEffect edgeEffect, Canvas canvas) {
        if (f10 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f10);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    private final RenderNode j() {
        RenderNode renderNode = this.f27977e;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode a10 = C2877p.a("AndroidEdgeEffectOverscrollEffect");
        this.f27977e = a10;
        return a10;
    }

    private final boolean k() {
        C2884w wVar = this.f27976d;
        if (wVar.r() || wVar.s() || wVar.u() || wVar.v()) {
            return true;
        }
        return false;
    }

    private final boolean l() {
        C2884w wVar = this.f27976d;
        if (wVar.y() || wVar.z() || wVar.o() || wVar.p()) {
            return true;
        }
        return false;
    }

    public void u(C2602c cVar) {
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        this.f27975c.r(cVar.d());
        if (C2427m.m(cVar.d())) {
            cVar.H1();
            return;
        }
        this.f27975c.j().getValue();
        float t12 = cVar.t1(C2873l.b());
        Canvas d10 = C2448H.d(cVar.w1().f());
        C2884w wVar = this.f27976d;
        boolean l10 = l();
        boolean k10 = k();
        boolean z13 = false;
        if (l10 && k10) {
            boolean unused = j().setPosition(0, 0, d10.getWidth(), d10.getHeight());
        } else if (l10) {
            boolean unused2 = j().setPosition(0, 0, d10.getWidth() + (a.d(t12) * 2), d10.getHeight());
        } else if (k10) {
            boolean unused3 = j().setPosition(0, 0, d10.getWidth(), d10.getHeight() + (a.d(t12) * 2));
        } else {
            cVar.H1();
            return;
        }
        RecordingCanvas a10 = j().beginRecording();
        if (wVar.s()) {
            EdgeEffect i10 = wVar.i();
            d(i10, a10);
            i10.finish();
        }
        if (wVar.r()) {
            EdgeEffect h10 = wVar.h();
            z10 = b(h10, a10);
            if (wVar.t()) {
                float n10 = C2421g.n(this.f27975c.i());
                C2883v vVar = C2883v.f27978a;
                vVar.d(wVar.i(), vVar.b(h10), ((float) 1) - n10);
            }
        } else {
            z10 = false;
        }
        if (wVar.z()) {
            EdgeEffect m10 = wVar.m();
            a(m10, a10);
            m10.finish();
        }
        if (wVar.y()) {
            EdgeEffect l11 = wVar.l();
            if (e(l11, a10) || z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (wVar.A()) {
                float m11 = C2421g.m(this.f27975c.i());
                C2883v vVar2 = C2883v.f27978a;
                vVar2.d(wVar.m(), vVar2.b(l11), m11);
            }
        }
        if (wVar.v()) {
            EdgeEffect k11 = wVar.k();
            b(k11, a10);
            k11.finish();
        }
        if (wVar.u()) {
            EdgeEffect j10 = wVar.j();
            if (d(j10, a10) || z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (wVar.w()) {
                float n11 = C2421g.n(this.f27975c.i());
                C2883v vVar3 = C2883v.f27978a;
                vVar3.d(wVar.k(), vVar3.b(j10), n11);
            }
        }
        if (wVar.p()) {
            EdgeEffect g10 = wVar.g();
            e(g10, a10);
            g10.finish();
        }
        if (wVar.o()) {
            EdgeEffect f11 = wVar.f();
            if (a(f11, a10) || z10) {
                z13 = true;
            }
            if (wVar.q()) {
                float m12 = C2421g.m(this.f27975c.i());
                C2883v vVar4 = C2883v.f27978a;
                vVar4.d(wVar.g(), vVar4.b(f11), ((float) 1) - m12);
            }
            z10 = z13;
        }
        if (z10) {
            this.f27975c.k();
        }
        if (k10) {
            f10 = 0.0f;
        } else {
            f10 = t12;
        }
        if (l10) {
            t12 = 0.0f;
        }
        t layoutDirection = cVar.getLayoutDirection();
        C2520p0 b10 = C2448H.b(a10);
        long d11 = cVar.d();
        d density = cVar.w1().getDensity();
        t layoutDirection2 = cVar.w1().getLayoutDirection();
        C2520p0 f12 = cVar.w1().f();
        long d12 = cVar.w1().d();
        C2673c i11 = cVar.w1().i();
        C2603d w12 = cVar.w1();
        w12.b(cVar);
        w12.a(layoutDirection);
        w12.c(b10);
        w12.h(d11);
        w12.g((C2673c) null);
        b10.q();
        try {
            cVar.w1().e().d(f10, t12);
            cVar.H1();
            float f13 = -f10;
            float f14 = -t12;
            cVar.w1().e().d(f13, f14);
            b10.h();
            C2603d w13 = cVar.w1();
            w13.b(density);
            w13.a(layoutDirection2);
            w13.c(f12);
            w13.h(d12);
            w13.g(i11);
            j().endRecording();
            int save = d10.save();
            d10.translate(f13, f14);
            d10.drawRenderNode(j());
            d10.restoreToCount(save);
        } catch (Throwable th2) {
            b10.h();
            C2603d w14 = cVar.w1();
            w14.b(density);
            w14.a(layoutDirection2);
            w14.c(f12);
            w14.h(d12);
            w14.g(i11);
            throw th2;
        }
    }
}
