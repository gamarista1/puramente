package p2;

import android.os.Handler;
import i2.C2076a;
import i2.L;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t2.C2615C;

public interface t {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f25302a;

        /* renamed from: b  reason: collision with root package name */
        public final C2615C.b f25303b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList f25304c;

        /* renamed from: p2.t$a$a  reason: collision with other inner class name */
        private static final class C0424a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f25305a;

            /* renamed from: b  reason: collision with root package name */
            public t f25306b;

            public C0424a(Handler handler, t tVar) {
                this.f25305a = handler;
                this.f25306b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (C2615C.b) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(t tVar) {
            tVar.O(this.f25302a, this.f25303b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(t tVar) {
            tVar.Z(this.f25302a, this.f25303b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(t tVar) {
            tVar.l0(this.f25302a, this.f25303b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(t tVar, int i10) {
            tVar.a0(this.f25302a, this.f25303b);
            tVar.V(this.f25302a, this.f25303b, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(t tVar, Exception exc) {
            tVar.T(this.f25302a, this.f25303b, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(t tVar) {
            tVar.m0(this.f25302a, this.f25303b);
        }

        public void g(Handler handler, t tVar) {
            C2076a.e(handler);
            C2076a.e(tVar);
            this.f25304c.add(new C0424a(handler, tVar));
        }

        public void h() {
            Iterator it = this.f25304c.iterator();
            while (it.hasNext()) {
                C0424a aVar = (C0424a) it.next();
                L.R0(aVar.f25305a, new s(this, aVar.f25306b));
            }
        }

        public void i() {
            Iterator it = this.f25304c.iterator();
            while (it.hasNext()) {
                C0424a aVar = (C0424a) it.next();
                L.R0(aVar.f25305a, new q(this, aVar.f25306b));
            }
        }

        public void j() {
            Iterator it = this.f25304c.iterator();
            while (it.hasNext()) {
                C0424a aVar = (C0424a) it.next();
                L.R0(aVar.f25305a, new r(this, aVar.f25306b));
            }
        }

        public void k(int i10) {
            Iterator it = this.f25304c.iterator();
            while (it.hasNext()) {
                C0424a aVar = (C0424a) it.next();
                L.R0(aVar.f25305a, new C2411o(this, aVar.f25306b, i10));
            }
        }

        public void l(Exception exc) {
            Iterator it = this.f25304c.iterator();
            while (it.hasNext()) {
                C0424a aVar = (C0424a) it.next();
                L.R0(aVar.f25305a, new C2410n(this, aVar.f25306b, exc));
            }
        }

        public void m() {
            Iterator it = this.f25304c.iterator();
            while (it.hasNext()) {
                C0424a aVar = (C0424a) it.next();
                L.R0(aVar.f25305a, new p(this, aVar.f25306b));
            }
        }

        public void t(t tVar) {
            Iterator it = this.f25304c.iterator();
            while (it.hasNext()) {
                C0424a aVar = (C0424a) it.next();
                if (aVar.f25306b == tVar) {
                    this.f25304c.remove(aVar);
                }
            }
        }

        public a u(int i10, C2615C.b bVar) {
            return new a(this.f25304c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C2615C.b bVar) {
            this.f25304c = copyOnWriteArrayList;
            this.f25302a = i10;
            this.f25303b = bVar;
        }
    }

    void O(int i10, C2615C.b bVar);

    void T(int i10, C2615C.b bVar, Exception exc);

    void V(int i10, C2615C.b bVar, int i11);

    void Z(int i10, C2615C.b bVar);

    void l0(int i10, C2615C.b bVar);

    void m0(int i10, C2615C.b bVar);

    void a0(int i10, C2615C.b bVar) {
    }
}
