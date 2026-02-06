package F;

import E.A;
import E.x;
import Ef.m;
import androidx.compose.foundation.lazy.layout.c;
import c1.b;
import java.util.List;

public abstract class u implements A {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2064a;

    /* renamed from: b  reason: collision with root package name */
    private final j f2065b;

    /* renamed from: c  reason: collision with root package name */
    private final x f2066c;

    /* renamed from: d  reason: collision with root package name */
    private final C f2067d;

    public u(boolean z10, j jVar, x xVar, C c10) {
        this.f2064a = z10;
        this.f2065b = jVar;
        this.f2066c = xVar;
        this.f2067d = c10;
    }

    private final long b(int i10, int i11) {
        int i12;
        if (i11 == 1) {
            i12 = this.f2067d.b()[i10];
        } else {
            int i13 = this.f2067d.a()[i10];
            int i14 = (i10 + i11) - 1;
            i12 = (this.f2067d.a()[i14] + this.f2067d.b()[i14]) - i13;
        }
        if (this.f2064a) {
            return b.f19206b.e(i12);
        }
        return b.f19206b.d(i12);
    }

    public abstract x c(int i10, int i11, int i12, Object obj, Object obj2, List list, long j10);

    /* renamed from: d */
    public x a(int i10, int i11, int i12, long j10) {
        return c(i10, i11, i12, this.f2065b.d(i10), this.f2065b.f(i10), this.f2066c.l0(i10, j10), j10);
    }

    public final x e(int i10, long j10) {
        Object d10 = this.f2065b.d(i10);
        Object f10 = this.f2065b.f(i10);
        int length = this.f2067d.b().length;
        int i11 = (int) (j10 >> 32);
        int h10 = m.h(i11, length - 1);
        int h11 = m.h(((int) (j10 & 4294967295L)) - i11, length - h10);
        long b10 = b(h10, h11);
        return c(i10, h10, h11, d10, f10, this.f2066c.l0(i10, b10), b10);
    }

    public final c f() {
        return this.f2065b.b();
    }
}
