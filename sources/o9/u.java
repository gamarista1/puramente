package o9;

import N9.C3070t;
import android.os.Handler;
import ja.C3645a;
import ja.M;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public interface u {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f47542a;

        /* renamed from: b  reason: collision with root package name */
        public final C3070t.b f47543b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList f47544c;

        /* renamed from: o9.u$a$a  reason: collision with other inner class name */
        private static final class C0712a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f47545a;

            /* renamed from: b  reason: collision with root package name */
            public u f47546b;

            public C0712a(Handler handler, u uVar) {
                this.f47545a = handler;
                this.f47546b = uVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (C3070t.b) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(u uVar) {
            uVar.m0(this.f47542a, this.f47543b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(u uVar) {
            uVar.W(this.f47542a, this.f47543b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(u uVar) {
            uVar.b0(this.f47542a, this.f47543b);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void q(u uVar, int i10) {
            uVar.f0(this.f47542a, this.f47543b);
            uVar.e0(this.f47542a, this.f47543b, i10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void r(u uVar, Exception exc) {
            uVar.d0(this.f47542a, this.f47543b, exc);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void s(u uVar) {
            uVar.M(this.f47542a, this.f47543b);
        }

        public void g(Handler handler, u uVar) {
            C3645a.e(handler);
            C3645a.e(uVar);
            this.f47544c.add(new C0712a(handler, uVar));
        }

        public void h() {
            Iterator it = this.f47544c.iterator();
            while (it.hasNext()) {
                C0712a aVar = (C0712a) it.next();
                M.L0(aVar.f47545a, new t(this, aVar.f47546b));
            }
        }

        public void i() {
            Iterator it = this.f47544c.iterator();
            while (it.hasNext()) {
                C0712a aVar = (C0712a) it.next();
                M.L0(aVar.f47545a, new r(this, aVar.f47546b));
            }
        }

        public void j() {
            Iterator it = this.f47544c.iterator();
            while (it.hasNext()) {
                C0712a aVar = (C0712a) it.next();
                M.L0(aVar.f47545a, new s(this, aVar.f47546b));
            }
        }

        public void k(int i10) {
            Iterator it = this.f47544c.iterator();
            while (it.hasNext()) {
                C0712a aVar = (C0712a) it.next();
                M.L0(aVar.f47545a, new q(this, aVar.f47546b, i10));
            }
        }

        public void l(Exception exc) {
            Iterator it = this.f47544c.iterator();
            while (it.hasNext()) {
                C0712a aVar = (C0712a) it.next();
                M.L0(aVar.f47545a, new o(this, aVar.f47546b, exc));
            }
        }

        public void m() {
            Iterator it = this.f47544c.iterator();
            while (it.hasNext()) {
                C0712a aVar = (C0712a) it.next();
                M.L0(aVar.f47545a, new p(this, aVar.f47546b));
            }
        }

        public void t(u uVar) {
            Iterator it = this.f47544c.iterator();
            while (it.hasNext()) {
                C0712a aVar = (C0712a) it.next();
                if (aVar.f47546b == uVar) {
                    this.f47544c.remove(aVar);
                }
            }
        }

        public a u(int i10, C3070t.b bVar) {
            return new a(this.f47544c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C3070t.b bVar) {
            this.f47544c = copyOnWriteArrayList;
            this.f47542a = i10;
            this.f47543b = bVar;
        }
    }

    void M(int i10, C3070t.b bVar);

    void W(int i10, C3070t.b bVar);

    void b0(int i10, C3070t.b bVar);

    void d0(int i10, C3070t.b bVar, Exception exc);

    void e0(int i10, C3070t.b bVar, int i11);

    void m0(int i10, C3070t.b bVar);

    void f0(int i10, C3070t.b bVar) {
    }
}
