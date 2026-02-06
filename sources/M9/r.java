package m9;

import android.os.Handler;
import ja.C3645a;
import ja.M;
import k9.C3717q0;
import n9.C3869e;
import n9.C3873i;

public interface r {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f46682a;

        /* renamed from: b  reason: collision with root package name */
        private final r f46683b;

        public a(Handler handler, r rVar) {
            Handler handler2;
            if (rVar != null) {
                handler2 = (Handler) C3645a.e(handler);
            } else {
                handler2 = null;
            }
            this.f46682a = handler2;
            this.f46683b = rVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void A(int i10, long j10, long j11) {
            ((r) M.j(this.f46683b)).m(i10, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(Exception exc) {
            ((r) M.j(this.f46683b)).l(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(Exception exc) {
            ((r) M.j(this.f46683b)).b(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(String str, long j10, long j11) {
            ((r) M.j(this.f46683b)).f(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(String str) {
            ((r) M.j(this.f46683b)).e(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(C3869e eVar) {
            eVar.c();
            ((r) M.j(this.f46683b)).D(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(C3869e eVar) {
            ((r) M.j(this.f46683b)).B(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(C3717q0 q0Var, C3873i iVar) {
            ((r) M.j(this.f46683b)).o(q0Var);
            ((r) M.j(this.f46683b)).G(q0Var, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(long j10) {
            ((r) M.j(this.f46683b)).h(j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(boolean z10) {
            ((r) M.j(this.f46683b)).a(z10);
        }

        public void B(long j10) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new C3853k(this, j10));
            }
        }

        public void C(boolean z10) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new q(this, z10));
            }
        }

        public void D(int i10, long j10, long j11) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new p(this, i10, j10, j11));
            }
        }

        public void k(Exception exc) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new C3852j(this, exc));
            }
        }

        public void l(Exception exc) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new o(this, exc));
            }
        }

        public void m(String str, long j10, long j11) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new C3851i(this, str, j10, j11));
            }
        }

        public void n(String str) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new C3850h(this, str));
            }
        }

        public void o(C3869e eVar) {
            eVar.c();
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new m(this, eVar));
            }
        }

        public void p(C3869e eVar) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new l(this, eVar));
            }
        }

        public void q(C3717q0 q0Var, C3873i iVar) {
            Handler handler = this.f46682a;
            if (handler != null) {
                handler.post(new n(this, q0Var, iVar));
            }
        }
    }

    void B(C3869e eVar);

    void D(C3869e eVar);

    void G(C3717q0 q0Var, C3873i iVar);

    void a(boolean z10);

    void b(Exception exc);

    void e(String str);

    void f(String str, long j10, long j11);

    void h(long j10);

    void l(Exception exc);

    void m(int i10, long j10, long j11);

    void o(C3717q0 q0Var) {
    }
}
