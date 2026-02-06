package x2;

import android.os.Handler;
import android.os.SystemClock;
import f2.P;
import f2.s;
import i2.C2076a;
import i2.L;
import m2.k;
import m2.l;

/* renamed from: x2.D  reason: case insensitive filesystem */
public interface C2900D {

    /* renamed from: x2.D$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f28223a;

        /* renamed from: b  reason: collision with root package name */
        private final C2900D f28224b;

        public a(Handler handler, C2900D d10) {
            Handler handler2;
            if (d10 != null) {
                handler2 = (Handler) C2076a.e(handler);
            } else {
                handler2 = null;
            }
            this.f28223a = handler2;
            this.f28224b = d10;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(String str, long j10, long j11) {
            ((C2900D) L.h(this.f28224b)).d(str, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(String str) {
            ((C2900D) L.h(this.f28224b)).c(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(k kVar) {
            kVar.c();
            ((C2900D) L.h(this.f28224b)).M(kVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void t(int i10, long j10) {
            ((C2900D) L.h(this.f28224b)).j(i10, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void u(k kVar) {
            ((C2900D) L.h(this.f28224b)).D(kVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(s sVar, l lVar) {
            ((C2900D) L.h(this.f28224b)).u(sVar, lVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(Object obj, long j10) {
            ((C2900D) L.h(this.f28224b)).k(obj, j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(long j10, int i10) {
            ((C2900D) L.h(this.f28224b)).n(j10, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(Exception exc) {
            ((C2900D) L.h(this.f28224b)).i(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(P p10) {
            ((C2900D) L.h(this.f28224b)).p(p10);
        }

        public void A(Object obj) {
            if (this.f28223a != null) {
                this.f28223a.post(new w(this, obj, SystemClock.elapsedRealtime()));
            }
        }

        public void B(long j10, int i10) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new x(this, j10, i10));
            }
        }

        public void C(Exception exc) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new y(this, exc));
            }
        }

        public void D(P p10) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new u(this, p10));
            }
        }

        public void k(String str, long j10, long j11) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new t(this, str, j10, j11));
            }
        }

        public void l(String str) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new C2899C(this, str));
            }
        }

        public void m(k kVar) {
            kVar.c();
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new C2898B(this, kVar));
            }
        }

        public void n(int i10, long j10) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new v(this, i10, j10));
            }
        }

        public void o(k kVar) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new z(this, kVar));
            }
        }

        public void p(s sVar, l lVar) {
            Handler handler = this.f28223a;
            if (handler != null) {
                handler.post(new C2897A(this, sVar, lVar));
            }
        }
    }

    void D(k kVar);

    void M(k kVar);

    void c(String str);

    void d(String str, long j10, long j11);

    void i(Exception exc);

    void j(int i10, long j10);

    void k(Object obj, long j10);

    void n(long j10, int i10);

    void p(P p10);

    void u(s sVar, l lVar);
}
