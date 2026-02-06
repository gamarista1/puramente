package ka;

import android.os.Handler;
import android.os.SystemClock;
import ja.C3645a;
import ja.M;
import k9.C3717q0;
import n9.C3869e;
import n9.C3873i;

public interface w {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f46093a;

        /* renamed from: b  reason: collision with root package name */
        private final w f46094b;

        public a(Handler handler, w wVar) {
            Handler handler2;
            if (wVar != null) {
                handler2 = (Handler) C3645a.e(handler);
            } else {
                handler2 = null;
            }
            this.f46093a = handler2;
            this.f46094b = wVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((w) M.j(this.f46094b)).d(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((w) M.j(this.f46094b)).c(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(C3869e eVar) {
            eVar.c();
            ((w) M.j(this.f46094b)).A(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((w) M.j(this.f46094b)).j(i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(C3869e eVar) {
            ((w) M.j(this.f46094b)).I(eVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(C3717q0 q0Var, C3873i iVar) {
            ((w) M.j(this.f46094b)).K(q0Var);
            ((w) M.j(this.f46094b)).q(q0Var, iVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((w) M.j(this.f46094b)).k(obj, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((w) M.j(this.f46094b)).n(j10, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((w) M.j(this.f46094b)).i(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(y yVar) {
            ((w) M.j(this.f46094b)).p(yVar);
        }

        public void A(Object obj) {
            if (this.f46093a != null) {
                this.f46093a.post(new o(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        public void B(long j10, int i10) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new v(this, j10, i10));
            }
        }

        public void C(Exception exc) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new r(this, exc));
            }
        }

        public void D(y yVar) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new m(this, yVar));
            }
        }

        public void k(String str, long j10, long j11) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new s(this, str, j10, j11));
            }
        }

        public void l(String str) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new p(this, str));
            }
        }

        public void m(C3869e eVar) {
            eVar.c();
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new q(this, eVar));
            }
        }

        public void n(int i10, long j10) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new n(this, i10, j10));
            }
        }

        public void o(C3869e eVar) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new t(this, eVar));
            }
        }

        public void p(C3717q0 q0Var, C3873i iVar) {
            Handler handler = this.f46093a;
            if (handler != null) {
                handler.post(new u(this, q0Var, iVar));
            }
        }
    }

    void A(C3869e eVar);

    void I(C3869e eVar);

    void c(String str);

    void d(String str, long j10, long j11);

    void i(Exception exc);

    void j(int i10, long j10);

    void k(Object obj, long j10);

    void n(long j10, int i10);

    void p(y yVar);

    void q(C3717q0 q0Var, C3873i iVar);

    void K(C3717q0 q0Var) {
    }
}
