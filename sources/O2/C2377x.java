package o2;

import android.os.Handler;
import f2.s;
import i2.C2076a;
import i2.L;
import m2.k;
import m2.l;
import o2.C2378y;

/* renamed from: o2.x  reason: case insensitive filesystem */
public interface C2377x {

    /* renamed from: o2.x$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f25048a;

        /* renamed from: b  reason: collision with root package name */
        private final C2377x f25049b;

        public a(Handler handler, C2377x xVar) {
            Handler handler2;
            if (xVar != null) {
                handler2 = (Handler) C2076a.e(handler);
            } else {
                handler2 = null;
            }
            this.f25048a = handler2;
            this.f25049b = xVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void A(String str) {
            ((C2377x) L.h(this.f25049b)).e(str);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void B(k kVar) {
            kVar.c();
            ((C2377x) L.h(this.f25049b)).G(kVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void C(k kVar) {
            ((C2377x) L.h(this.f25049b)).J(kVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void D(s sVar, l lVar) {
            ((C2377x) L.h(this.f25049b)).A(sVar, lVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void E(long j10) {
            ((C2377x) L.h(this.f25049b)).h(j10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void F(boolean z10) {
            ((C2377x) L.h(this.f25049b)).a(z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void G(int i10, long j10, long j11) {
            ((C2377x) L.h(this.f25049b)).m(i10, j10, j11);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void v(Exception exc) {
            ((C2377x) L.h(this.f25049b)).l(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void w(Exception exc) {
            ((C2377x) L.h(this.f25049b)).b(exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void x(C2378y.a aVar) {
            ((C2377x) L.h(this.f25049b)).q(aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void y(C2378y.a aVar) {
            ((C2377x) L.h(this.f25049b)).o(aVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void z(String str, long j10, long j11) {
            ((C2377x) L.h(this.f25049b)).f(str, j10, j11);
        }

        public void H(long j10) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2374u(this, j10));
            }
        }

        public void I(boolean z10) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2376w(this, z10));
            }
        }

        public void J(int i10, long j10, long j11) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2375v(this, i10, j10, j11));
            }
        }

        public void m(Exception exc) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2369o(this, exc));
            }
        }

        public void n(Exception exc) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2370p(this, exc));
            }
        }

        public void o(C2378y.a aVar) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2367m(this, aVar));
            }
        }

        public void p(C2378y.a aVar) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2368n(this, aVar));
            }
        }

        public void q(String str, long j10, long j11) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new r(this, str, j10, j11));
            }
        }

        public void r(String str) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2372s(this, str));
            }
        }

        public void s(k kVar) {
            kVar.c();
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2373t(this, kVar));
            }
        }

        public void t(k kVar) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2366l(this, kVar));
            }
        }

        public void u(s sVar, l lVar) {
            Handler handler = this.f25048a;
            if (handler != null) {
                handler.post(new C2371q(this, sVar, lVar));
            }
        }
    }

    void A(s sVar, l lVar);

    void G(k kVar);

    void J(k kVar);

    void a(boolean z10);

    void b(Exception exc);

    void e(String str);

    void f(String str, long j10, long j11);

    void h(long j10);

    void l(Exception exc);

    void m(int i10, long j10, long j11);

    void o(C2378y.a aVar);

    void q(C2378y.a aVar);
}
