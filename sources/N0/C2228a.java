package n0;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import c1.d;
import c1.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2427m;
import r0.C2448H;
import r0.C2520p0;
import t0.C2600a;
import yf.C6798l;

/* renamed from: n0.a  reason: case insensitive filesystem */
public final class C2228a extends View.DragShadowBuilder {

    /* renamed from: a  reason: collision with root package name */
    private final d f24393a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24394b;

    /* renamed from: c  reason: collision with root package name */
    private final C6798l f24395c;

    public /* synthetic */ C2228a(d dVar, long j10, C6798l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, lVar);
    }

    public void onDrawShadow(Canvas canvas) {
        C2600a aVar = new C2600a();
        d dVar = this.f24393a;
        long j10 = this.f24394b;
        t tVar = t.Ltr;
        C2520p0 b10 = C2448H.b(canvas);
        C6798l lVar = this.f24395c;
        C2600a.C0435a D10 = aVar.D();
        d a10 = D10.a();
        t b11 = D10.b();
        C2520p0 c10 = D10.c();
        long d10 = D10.d();
        C2600a.C0435a D11 = aVar.D();
        D11.j(dVar);
        D11.k(tVar);
        D11.i(b10);
        D11.l(j10);
        b10.q();
        lVar.invoke(aVar);
        b10.h();
        C2600a.C0435a D12 = aVar.D();
        D12.j(a10);
        D12.k(b11);
        D12.i(c10);
        D12.l(d10);
    }

    public void onProvideShadowMetrics(Point point, Point point2) {
        d dVar = this.f24393a;
        point.set(dVar.E0(dVar.m1(C2427m.k(this.f24394b))), dVar.E0(dVar.m1(C2427m.i(this.f24394b))));
        point2.set(point.x / 2, point.y / 2);
    }

    private C2228a(d dVar, long j10, C6798l lVar) {
        this.f24393a = dVar;
        this.f24394b = j10;
        this.f24395c = lVar;
    }
}
