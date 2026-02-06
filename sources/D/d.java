package D;

import E.F;
import O0.b;
import androidx.compose.foundation.lazy.layout.f;
import c1.r;
import lf.C6514M;
import qf.C6658d;
import rf.C6680b;
import z.q;

public abstract class d {

    public static final class a implements F {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ A f1230a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f1231b;

        a(A a10, boolean z10) {
            this.f1230a = a10;
            this.f1231b = z10;
        }

        public int a() {
            return this.f1230a.x().f() + this.f1230a.x().b();
        }

        public float b() {
            return f.a(this.f1230a.s(), this.f1230a.t(), this.f1230a.d());
        }

        public b c() {
            if (this.f1231b) {
                return new b(-1, 1);
            }
            return new b(1, -1);
        }

        public int d() {
            if (this.f1230a.x().c() == q.Vertical) {
                return r.f(this.f1230a.x().a());
            }
            return r.g(this.f1230a.x().a());
        }

        public float e() {
            return f.b(this.f1230a.s(), this.f1230a.t());
        }

        public Object f(int i10, C6658d dVar) {
            Object L10 = A.L(this.f1230a, i10, 0, dVar, 2, (Object) null);
            if (L10 == C6680b.f()) {
                return L10;
            }
            return C6514M.f71813a;
        }
    }

    public static final F a(A a10, boolean z10) {
        return new a(a10, z10);
    }
}
