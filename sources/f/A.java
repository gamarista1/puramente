package F;

import E.F;
import O0.b;
import Y.C1500m;
import Y.C1506p;
import androidx.compose.foundation.lazy.layout.f;
import c1.r;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import z.q;

public abstract class A {

    public static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f1919a;

        a(E e10) {
            this.f1919a = e10;
        }

        public int a() {
            return this.f1919a.w().f() + this.f1919a.w().b();
        }

        public float b() {
            return f.a(this.f1919a.r(), this.f1919a.s(), this.f1919a.d());
        }

        public b c() {
            return new b(-1, -1);
        }

        public int d() {
            if (this.f1919a.w().c() == q.Vertical) {
                return r.f(this.f1919a.w().a());
            }
            return r.g(this.f1919a.w().a());
        }

        public float e() {
            return f.b(this.f1919a.r(), this.f1919a.s());
        }

        public Object f(int i10, C6658d dVar) {
            Object L10 = E.L(this.f1919a, i10, 0, dVar, 2, (Object) null);
            if (L10 == C6680b.f()) {
                return L10;
            }
            return C6514M.f71813a;
        }
    }

    public static final F a(E e10, boolean z10, C1500m mVar, int i10) {
        boolean z11;
        if (C1506p.H()) {
            C1506p.Q(1629354903, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:33)");
        }
        boolean S10 = mVar.S(e10);
        if ((((i10 & 112) ^ 48) <= 32 || !mVar.b(z10)) && (i10 & 48) != 32) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z12 = z11 | S10;
        Object A10 = mVar.A();
        if (z12 || A10 == C1500m.f10026a.a()) {
            A10 = new a(e10);
            mVar.r(A10);
        }
        a aVar = (a) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return aVar;
    }
}
