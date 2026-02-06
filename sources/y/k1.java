package Y;

import i0.C2057k;
import i0.p;
import i0.q;
import i0.y;
import i0.z;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public abstract class k1 extends y implements C1503n0, q {

    /* renamed from: b  reason: collision with root package name */
    private a f10021b;

    private static final class a extends z {

        /* renamed from: c  reason: collision with root package name */
        private float f10022c;

        public a(float f10) {
            this.f10022c = f10;
        }

        public void c(z zVar) {
            C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f10022c = ((a) zVar).f10022c;
        }

        public z d() {
            return new a(this.f10022c);
        }

        public final float i() {
            return this.f10022c;
        }

        public final void j(float f10) {
            this.f10022c = f10;
        }
    }

    public k1(float f10) {
        a aVar = new a(f10);
        if (C2057k.f21728e.e()) {
            a aVar2 = new a(f10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f10021b = aVar;
    }

    public float c() {
        return ((a) p.X(this.f10021b, this)).i();
    }

    public o1 d() {
        return p1.q();
    }

    public z g(z zVar, z zVar2, z zVar3) {
        C6496s.f(zVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        C6496s.f(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) zVar2).i() == ((a) zVar3).i()) {
            return zVar2;
        }
        return null;
    }

    public z k() {
        return this.f10021b;
    }

    public void l(float f10) {
        C2057k c10;
        a aVar = (a) p.F(this.f10021b);
        if (aVar.i() != f10) {
            a aVar2 = this.f10021b;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                ((a) p.S(aVar2, this, c10, aVar)).j(f10);
                C6514M m10 = C6514M.f71813a;
            }
            p.Q(c10, this);
        }
    }

    public void n(z zVar) {
        C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f10021b = (a) zVar;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) p.F(this.f10021b)).i() + ")@" + hashCode();
    }
}
