package Y;

import i0.C2057k;
import i0.p;
import i0.q;
import i0.y;
import i0.z;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public abstract class n1 extends y implements q {

    /* renamed from: b  reason: collision with root package name */
    private final o1 f10098b;

    /* renamed from: c  reason: collision with root package name */
    private a f10099c;

    private static final class a extends z {

        /* renamed from: c  reason: collision with root package name */
        private Object f10100c;

        public a(Object obj) {
            this.f10100c = obj;
        }

        public void c(z zVar) {
            C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f10100c = ((a) zVar).f10100c;
        }

        public z d() {
            return new a(this.f10100c);
        }

        public final Object i() {
            return this.f10100c;
        }

        public final void j(Object obj) {
            this.f10100c = obj;
        }
    }

    public n1(Object obj, o1 o1Var) {
        this.f10098b = o1Var;
        a aVar = new a(obj);
        if (C2057k.f21728e.e()) {
            a aVar2 = new a(obj);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f10099c = aVar;
    }

    public o1 d() {
        return this.f10098b;
    }

    public z g(z zVar, z zVar2, z zVar3) {
        C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) zVar;
        C6496s.f(zVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) zVar2;
        C6496s.f(zVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) zVar3;
        if (d().b(aVar2.i(), aVar3.i())) {
            return zVar2;
        }
        Object a10 = d().a(aVar.i(), aVar2.i(), aVar3.i());
        if (a10 == null) {
            return null;
        }
        z d10 = aVar3.d();
        C6496s.f(d10, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((a) d10).j(a10);
        return d10;
    }

    public Object getValue() {
        return ((a) p.X(this.f10099c, this)).i();
    }

    public z k() {
        return this.f10099c;
    }

    public void n(z zVar) {
        C6496s.f(zVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f10099c = (a) zVar;
    }

    public void setValue(Object obj) {
        C2057k c10;
        a aVar = (a) p.F(this.f10099c);
        if (!d().b(aVar.i(), obj)) {
            a aVar2 = this.f10099c;
            p.J();
            synchronized (p.I()) {
                c10 = C2057k.f21728e.c();
                ((a) p.S(aVar2, this, c10, aVar)).j(obj);
                C6514M m10 = C6514M.f71813a;
            }
            p.Q(c10, this);
        }
    }

    public String toString() {
        return "MutableState(value=" + ((a) p.F(this.f10099c)).i() + ")@" + hashCode();
    }
}
