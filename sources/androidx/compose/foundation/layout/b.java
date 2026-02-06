package androidx.compose.foundation.layout;

import H0.C1180a;
import H0.E;
import H0.G;
import H0.H;
import J0.B;
import k0.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class b extends i.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C1180a f12820n;

    /* renamed from: o  reason: collision with root package name */
    private float f12821o;

    /* renamed from: p  reason: collision with root package name */
    private float f12822p;

    public /* synthetic */ b(C1180a aVar, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f10, f11);
    }

    public final void l2(float f10) {
        this.f12822p = f10;
    }

    public final void m2(C1180a aVar) {
        this.f12820n = aVar;
    }

    public final void n2(float f10) {
        this.f12821o = f10;
    }

    public G o(H h10, E e10, long j10) {
        return a.c(h10, this.f12820n, this.f12821o, this.f12822p, e10, j10);
    }

    private b(C1180a aVar, float f10, float f11) {
        this.f12820n = aVar;
        this.f12821o = f10;
        this.f12822p = f11;
    }
}
