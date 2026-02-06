package Y;

import i0.C2057k;
import i0.p;
import i0.q;
import i0.y;
import i0.z;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public abstract class l1 extends y implements C1505o0, q {

    /* renamed from: b  reason: collision with root package name */
    private a f10024b;

    private static final class a extends z {

        /* renamed from: c  reason: collision with root package name */
        private int f10025c;

        public a(int i10) {
            this.f10025c = i10;
        }

        public void c(z zVar) {
            C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
            this.f10025c = ((a) zVar).f10025c;
        }

        public z d() {
            return new a(this.f10025c);
        }

        public final int i() {
            return this.f10025c;
        }

        public final void j(int i10) {
            this.f10025c = i10;
        }
    }

    public l1(int i10) {
        a aVar = new a(i10);
        if (C2057k.f21728e.e()) {
            a aVar2 = new a(i10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f10024b = aVar;
    }

    public int b() {
        return ((a) p.X(this.f10024b, this)).i();
    }

    public o1 d() {
        return p1.q();
    }

    public void f(int i10) {
        C2057k c10;
        a aVar = (a) p.F(this.f10024b);
        if (aVar.i() != i10) {
            a aVar2 = this.f10024b;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                ((a) p.S(aVar2, this, c10, aVar)).j(i10);
                C6514M m10 = C6514M.f71813a;
            }
            p.Q(c10, this);
        }
    }

    public z g(z zVar, z zVar2, z zVar3) {
        C6496s.f(zVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        C6496s.f(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        if (((a) zVar2).i() == ((a) zVar3).i()) {
            return zVar2;
        }
        return null;
    }

    public z k() {
        return this.f10024b;
    }

    public void n(z zVar) {
        C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f10024b = (a) zVar;
    }

    public String toString() {
        return "MutableIntState(value=" + ((a) p.F(this.f10024b)).i() + ")@" + hashCode();
    }
}
