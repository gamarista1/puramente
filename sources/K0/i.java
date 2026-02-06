package k0;

import J0.C1235c0;
import J0.C1244j;
import J0.C1245k;
import J0.j0;
import Ug.A0;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import yf.C6787a;
import yf.C6798l;
import yf.p;

public interface i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23074a = a.f23075b;

    public interface b extends i {
        boolean c(C6798l lVar) {
            return ((Boolean) lVar.invoke(this)).booleanValue();
        }

        Object f(Object obj, p pVar) {
            return pVar.invoke(obj, this);
        }
    }

    boolean c(C6798l lVar);

    Object f(Object obj, p pVar);

    i h(i iVar) {
        if (iVar == f23074a) {
            return this;
        }
        return new f(this, iVar);
    }

    public static abstract class c implements C1244j {

        /* renamed from: a  reason: collision with root package name */
        private c f23076a = this;

        /* renamed from: b  reason: collision with root package name */
        private K f23077b;

        /* renamed from: c  reason: collision with root package name */
        private int f23078c;

        /* renamed from: d  reason: collision with root package name */
        private int f23079d = -1;

        /* renamed from: e  reason: collision with root package name */
        private c f23080e;

        /* renamed from: f  reason: collision with root package name */
        private c f23081f;

        /* renamed from: g  reason: collision with root package name */
        private j0 f23082g;

        /* renamed from: h  reason: collision with root package name */
        private C1235c0 f23083h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f23084i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f23085j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f23086k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f23087l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f23088m;

        public final int I1() {
            return this.f23079d;
        }

        public final c J1() {
            return this.f23081f;
        }

        public final C1235c0 K1() {
            return this.f23083h;
        }

        public final K L1() {
            K k10 = this.f23077b;
            if (k10 != null) {
                return k10;
            }
            K a10 = L.a(C1245k.n(this).getCoroutineContext().n1(A0.a((C5600w0) C1245k.n(this).getCoroutineContext().b(C5600w0.f65416O))));
            this.f23077b = a10;
            return a10;
        }

        public final boolean M1() {
            return this.f23084i;
        }

        public final int N1() {
            return this.f23078c;
        }

        public final j0 O1() {
            return this.f23082g;
        }

        public final c P1() {
            return this.f23080e;
        }

        public boolean Q1() {
            return true;
        }

        public final boolean R1() {
            return this.f23085j;
        }

        public final boolean S1() {
            return this.f23088m;
        }

        public void T1() {
            boolean z10;
            if (this.f23088m) {
                G0.a.b("node attached multiple times");
            }
            if (this.f23083h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                G0.a.b("attach invoked on a node without a coordinator");
            }
            this.f23088m = true;
            this.f23086k = true;
        }

        public void U1() {
            if (!this.f23088m) {
                G0.a.b("Cannot detach a node that is not attached");
            }
            if (this.f23086k) {
                G0.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f23087l) {
                G0.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f23088m = false;
            K k10 = this.f23077b;
            if (k10 != null) {
                L.c(k10, new j());
                this.f23077b = null;
            }
        }

        public void Y1() {
            if (!this.f23088m) {
                G0.a.b("reset() called on an unattached node");
            }
            X1();
        }

        public void Z1() {
            if (!this.f23088m) {
                G0.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f23086k) {
                G0.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f23086k = false;
            V1();
            this.f23087l = true;
        }

        public void a2() {
            boolean z10;
            if (!this.f23088m) {
                G0.a.b("node detached multiple times");
            }
            if (this.f23083h != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                G0.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f23087l) {
                G0.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f23087l = false;
            W1();
        }

        public final void b2(int i10) {
            this.f23079d = i10;
        }

        public void c2(c cVar) {
            this.f23076a = cVar;
        }

        public final void d2(c cVar) {
            this.f23081f = cVar;
        }

        public final void e2(boolean z10) {
            this.f23084i = z10;
        }

        public final void f2(int i10) {
            this.f23078c = i10;
        }

        public final void g2(j0 j0Var) {
            this.f23082g = j0Var;
        }

        public final void h2(c cVar) {
            this.f23080e = cVar;
        }

        public final void i2(boolean z10) {
            this.f23085j = z10;
        }

        public final void j2(C6787a aVar) {
            C1245k.n(this).h(aVar);
        }

        public void k2(C1235c0 c0Var) {
            this.f23083h = c0Var;
        }

        public final c v0() {
            return this.f23076a;
        }

        public void V1() {
        }

        public void W1() {
        }

        public void X1() {
        }
    }

    public static final class a implements i {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f23075b = new a();

        private a() {
        }

        public boolean c(C6798l lVar) {
            return true;
        }

        public String toString() {
            return "Modifier";
        }

        public i h(i iVar) {
            return iVar;
        }

        public Object f(Object obj, p pVar) {
            return obj;
        }
    }
}
