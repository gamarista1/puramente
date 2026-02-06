package M;

import H0.C1197s;
import J.C1228y;
import J0.C1242h;
import J0.C1243i;
import J0.C1253t;
import M.q0;
import P.G;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Y.C1510r0;
import Y.o1;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.C1651m1;
import androidx.compose.ui.platform.M0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.platform.v1;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.C6527k;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

public final class n0 extends i.c implements M0, C1242h, C1253t, q0.a {

    /* renamed from: n  reason: collision with root package name */
    private q0 f4222n;

    /* renamed from: o  reason: collision with root package name */
    private C1228y f4223o;

    /* renamed from: p  reason: collision with root package name */
    private G f4224p;

    /* renamed from: q  reason: collision with root package name */
    private final C1510r0 f4225q = u1.d((Object) null, (o1) null, 2, (Object) null);

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f4227b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f4228c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n0 n0Var, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f4227b = n0Var;
            this.f4228c = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f4227b, this.f4228c, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4226a;
            if (i10 == 0) {
                w.b(obj);
                n0 n0Var = this.f4227b;
                p pVar = this.f4228c;
                this.f4226a = 1;
                if (N0.b(n0Var, pVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.b(obj);
            }
            throw new C6527k();
        }
    }

    public n0(q0 q0Var, C1228y yVar, G g10) {
        this.f4222n = q0Var;
        this.f4223o = yVar;
        this.f4224p = g10;
    }

    private void l2(C1197s sVar) {
        this.f4225q.setValue(sVar);
    }

    public C1228y E1() {
        return this.f4223o;
    }

    public C5600w0 U0(p pVar) {
        if (!S1()) {
            return null;
        }
        return C5576k.d(L1(), (g) null, M.UNDISPATCHED, new a(this, pVar, (C6658d) null), 1, (Object) null);
    }

    public void V1() {
        this.f4222n.j(this);
    }

    public void W1() {
        this.f4222n.l(this);
    }

    public G f1() {
        return this.f4224p;
    }

    public C1651m1 getSoftwareKeyboardController() {
        return (C1651m1) C1243i.a(this, C1644k0.o());
    }

    public v1 getViewConfiguration() {
        return (v1) C1243i.a(this, C1644k0.r());
    }

    public void m2(C1228y yVar) {
        this.f4223o = yVar;
    }

    public final void n2(q0 q0Var) {
        if (S1()) {
            this.f4222n.d();
            this.f4222n.l(this);
        }
        this.f4222n = q0Var;
        if (S1()) {
            this.f4222n.j(this);
        }
    }

    public void o2(G g10) {
        this.f4224p = g10;
    }

    public void p(C1197s sVar) {
        l2(sVar);
    }

    public C1197s x0() {
        return (C1197s) this.f4225q.getValue();
    }
}
