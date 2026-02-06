package Y;

import i0.C2057k;
import i0.p;
import i0.q;
import i0.y;
import i0.z;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public abstract class m1 extends y implements C1507p0, q {

    /* renamed from: b  reason: collision with root package name */
    private a f10035b;

    private static final class a extends z {

        /* renamed from: c  reason: collision with root package name */
        private long f10036c;

        public a(long j10) {
            this.f10036c = j10;
        }

        public void c(z zVar) {
            C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.f10036c = ((a) zVar).f10036c;
        }

        public z d() {
            return new a(this.f10036c);
        }

        public final long i() {
            return this.f10036c;
        }

        public final void j(long j10) {
            this.f10036c = j10;
        }
    }

    public m1(long j10) {
        a aVar = new a(j10);
        if (C2057k.f21728e.e()) {
            a aVar2 = new a(j10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f10035b = aVar;
    }

    public long a() {
        return ((a) p.X(this.f10035b, this)).i();
    }

    public o1 d() {
        return p1.q();
    }

    public z g(z zVar, z zVar2, z zVar3) {
        C6496s.f(zVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        C6496s.f(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((a) zVar2).i() == ((a) zVar3).i()) {
            return zVar2;
        }
        return null;
    }

    public z k() {
        return this.f10035b;
    }

    public void n(z zVar) {
        C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f10035b = (a) zVar;
    }

    public void o(long j10) {
        C2057k c10;
        a aVar = (a) p.F(this.f10035b);
        if (aVar.i() != j10) {
            a aVar2 = this.f10035b;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                ((a) p.S(aVar2, this, c10, aVar)).j(j10);
                C6514M m10 = C6514M.f71813a;
            }
            p.Q(c10, this);
        }
    }

    public String toString() {
        return "MutableLongState(value=" + ((a) p.F(this.f10035b)).i() + ")@" + hashCode();
    }
}
