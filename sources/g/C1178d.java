package G;

import E.F;
import O0.b;
import c1.r;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import z.q;

/* renamed from: G.d  reason: case insensitive filesystem */
public abstract class C1178d {

    /* renamed from: G.d$a */
    public static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C f2293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f2294b;

        a(C c10, boolean z10) {
            this.f2293a = c10;
            this.f2294b = z10;
        }

        public int a() {
            return this.f2293a.C().f() + this.f2293a.C().b();
        }

        public float b() {
            return (float) D.g(this.f2293a.C(), this.f2293a.F());
        }

        public b c() {
            if (this.f2294b) {
                return new b(this.f2293a.F(), 1);
            }
            return new b(1, this.f2293a.F());
        }

        public int d() {
            if (this.f2293a.C().c() == q.Vertical) {
                return r.f(this.f2293a.C().a());
            }
            return r.g(this.f2293a.C().a());
        }

        public float e() {
            return (float) y.a(this.f2293a);
        }

        public Object f(int i10, C6658d dVar) {
            Object Z10 = C.Z(this.f2293a, i10, 0.0f, dVar, 2, (Object) null);
            if (Z10 == C6680b.f()) {
                return Z10;
            }
            return C6514M.f71813a;
        }
    }

    public static final F a(C c10, boolean z10) {
        return new a(c10, z10);
    }
}
