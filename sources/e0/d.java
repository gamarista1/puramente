package E0;

import E0.c;
import G0.a;
import c1.y;
import c1.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final c.a f1730a;

    /* renamed from: b  reason: collision with root package name */
    private final c f1731b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1732c;

    /* renamed from: d  reason: collision with root package name */
    private long f1733d;

    /* renamed from: e  reason: collision with root package name */
    private long f1734e;

    public d() {
        c.a aVar;
        if (e.h()) {
            aVar = c.a.Impulse;
        } else {
            aVar = c.a.Lsq2;
        }
        this.f1730a = aVar;
        this.f1731b = new c(false, aVar, 1, (DefaultConstructorMarker) null);
        this.f1732c = new c(false, aVar, 1, (DefaultConstructorMarker) null);
        this.f1733d = C2421g.f25320b.c();
    }

    public final void a(long j10, long j11) {
        this.f1731b.a(j10, C2421g.m(j11));
        this.f1732c.a(j10, C2421g.n(j11));
    }

    public final long b(long j10) {
        boolean z10;
        if (y.h(j10) <= 0.0f || y.i(j10) <= 0.0f) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            a.b("maximumVelocity should be a positive value. You specified=" + y.n(j10));
        }
        return z.a(this.f1731b.d(y.h(j10)), this.f1732c.d(y.i(j10)));
    }

    public final long c() {
        return this.f1733d;
    }

    public final long d() {
        return this.f1734e;
    }

    public final void e() {
        this.f1731b.e();
        this.f1732c.e();
        this.f1734e = 0;
    }

    public final void f(long j10) {
        this.f1733d = j10;
    }

    public final void g(long j10) {
        this.f1734e = j10;
    }
}
