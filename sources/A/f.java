package A;

import A.d;
import Ef.m;
import G.A;
import G.C;
import G.n;
import G.o;
import c1.t;
import java.util.List;
import kotlin.Pair;
import lf.C6502A;
import q0.C2421g;
import yf.q;

public abstract class f {

    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A f373c;

        a(C c10, q qVar, A a10) {
            this.f371a = c10;
            this.f372b = qVar;
            this.f373c = a10;
        }

        private final Pair e(j jVar) {
            float f10;
            List k10 = c().k();
            C c10 = this.f371a;
            int size = k10.size();
            boolean z10 = false;
            float f11 = Float.NEGATIVE_INFINITY;
            float f12 = Float.POSITIVE_INFINITY;
            int i10 = 0;
            while (true) {
                f10 = 0.0f;
                if (i10 >= size) {
                    break;
                }
                G.f fVar = (G.f) k10.get(i10);
                float a10 = k.a(o.a(c()), c().f(), c().b(), c().i(), fVar.a(), fVar.getIndex(), jVar, c10.F());
                if (a10 <= 0.0f && a10 > f11) {
                    f11 = a10;
                }
                if (a10 >= 0.0f && a10 < f12) {
                    f12 = a10;
                }
                i10++;
            }
            if (f11 == Float.NEGATIVE_INFINITY) {
                f11 = f12;
            }
            if (f12 == Float.POSITIVE_INFINITY) {
                f12 = f11;
            }
            if (f.e(this.f371a) == 0.0f) {
                z10 = true;
            }
            if (!this.f371a.d()) {
                if (z10 || !f.g(this.f371a)) {
                    f12 = 0.0f;
                } else {
                    f11 = 0.0f;
                    f12 = 0.0f;
                }
            }
            if (this.f371a.c()) {
                f10 = f11;
            } else if (!z10 && !f.g(this.f371a)) {
                f12 = 0.0f;
            }
            return C6502A.a(Float.valueOf(f10), Float.valueOf(f12));
        }

        public float a(float f10) {
            Pair e10 = e(this.f371a.C().n());
            float floatValue = ((Number) e10.a()).floatValue();
            float floatValue2 = ((Number) e10.b()).floatValue();
            float floatValue3 = ((Number) this.f372b.invoke(Float.valueOf(f10), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
            if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
                throw new IllegalStateException(("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0").toString());
            } else if (d(floatValue3)) {
                return floatValue3;
            } else {
                return 0.0f;
            }
        }

        public float b(float f10, float f11) {
            int i10;
            int G10 = this.f371a.G() + this.f371a.I();
            if (G10 == 0) {
                return 0.0f;
            }
            if (f10 < 0.0f) {
                i10 = this.f371a.y() + 1;
            } else {
                i10 = this.f371a.y();
            }
            int i11 = i10;
            int d10 = m.d(Math.abs((m.l(this.f373c.a(i11, m.l(((int) (f11 / ((float) G10))) + i10, 0, this.f371a.F()), f10, this.f371a.G(), this.f371a.I()), 0, this.f371a.F()) - i10) * G10) - G10, 0);
            if (d10 == 0) {
                return (float) d10;
            }
            return Math.signum(f10) * ((float) d10);
        }

        public final n c() {
            return this.f371a.C();
        }

        public final boolean d(float f10) {
            if (f10 == Float.POSITIVE_INFINITY || f10 == Float.NEGATIVE_INFINITY) {
                return false;
            }
            return true;
        }
    }

    public static final i a(C c10, A a10, q qVar) {
        return new a(c10, qVar, a10);
    }

    public static final float d(C c10, t tVar, float f10, float f11, float f12, float f13) {
        boolean z10;
        float f14;
        if (c10.C().c() == z.q.Vertical) {
            z10 = g(c10);
        } else if (tVar == t.Ltr) {
            z10 = g(c10);
        } else if (!g(c10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = c10.C().i();
        if (i10 == 0) {
            f14 = 0.0f;
        } else {
            f14 = e(c10) / ((float) i10);
        }
        float f15 = f14 - ((float) ((int) f14));
        int a10 = e.a(c10.x(), f11);
        d.a aVar = d.f367a;
        if (d.e(a10, aVar.a())) {
            if (Math.abs(f15) > f10) {
                if (!z10) {
                    return f12;
                }
            } else if (Math.abs(f14) >= Math.abs(c10.L())) {
                if (z10) {
                    return f12;
                }
            } else if (Math.abs(f12) < Math.abs(f13)) {
                return f12;
            }
        } else if (!d.e(a10, aVar.b())) {
            if (d.e(a10, aVar.c())) {
                return f12;
            }
            return 0.0f;
        }
        return f13;
    }

    /* access modifiers changed from: private */
    public static final float e(C c10) {
        if (c10.C().c() == z.q.Horizontal) {
            return C2421g.m(c10.R());
        }
        return C2421g.n(c10.R());
    }

    private static final boolean f(C c10) {
        if (e(c10) > 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean g(C c10) {
        boolean h10 = c10.C().h();
        if ((!f(c10) || !h10) && (f(c10) || h10)) {
            return false;
        }
        return true;
    }
}
