package N9;

import N9.C3070t;
import android.os.Handler;
import ja.C3645a;
import ja.M;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k9.C3717q0;

public interface A {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33025a;

        /* renamed from: b  reason: collision with root package name */
        public final C3070t.b f33026b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList f33027c;

        /* renamed from: d  reason: collision with root package name */
        private final long f33028d;

        /* renamed from: N9.A$a$a  reason: collision with other inner class name */
        private static final class C0543a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f33029a;

            /* renamed from: b  reason: collision with root package name */
            public A f33030b;

            public C0543a(Handler handler, A a10) {
                this.f33029a = handler;
                this.f33030b = a10;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (C3070t.b) null, 0);
        }

        private long h(long j10) {
            long Z02 = M.Z0(j10);
            if (Z02 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f33028d + Z02;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(A a10, C3068q qVar) {
            a10.P(this.f33025a, this.f33026b, qVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(A a10, C3065n nVar, C3068q qVar) {
            a10.V(this.f33025a, this.f33026b, nVar, qVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(A a10, C3065n nVar, C3068q qVar) {
            a10.c0(this.f33025a, this.f33026b, nVar, qVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void n(A a10, C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
            a10.h0(this.f33025a, this.f33026b, nVar, qVar, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void o(A a10, C3065n nVar, C3068q qVar) {
            a10.g0(this.f33025a, this.f33026b, nVar, qVar);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void p(A a10, C3070t.b bVar, C3068q qVar) {
            a10.n0(this.f33025a, bVar, qVar);
        }

        public void A(C3065n nVar, int i10, int i11, C3717q0 q0Var, int i12, Object obj, long j10, long j11) {
            C3065n nVar2 = nVar;
            B(nVar, new C3068q(i10, i11, q0Var, i12, obj, h(j10), h(j11)));
        }

        public void B(C3065n nVar, C3068q qVar) {
            Iterator it = this.f33027c.iterator();
            while (it.hasNext()) {
                C0543a aVar = (C0543a) it.next();
                M.L0(aVar.f33029a, new x(this, aVar.f33030b, nVar, qVar));
            }
        }

        public void C(A a10) {
            Iterator it = this.f33027c.iterator();
            while (it.hasNext()) {
                C0543a aVar = (C0543a) it.next();
                if (aVar.f33030b == a10) {
                    this.f33027c.remove(aVar);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            long j12 = j10;
            E(new C3068q(1, i10, (C3717q0) null, 3, (Object) null, h(j10), h(j11)));
        }

        public void E(C3068q qVar) {
            C3070t.b bVar = (C3070t.b) C3645a.e(this.f33026b);
            Iterator it = this.f33027c.iterator();
            while (it.hasNext()) {
                C0543a aVar = (C0543a) it.next();
                M.L0(aVar.f33029a, new y(this, aVar.f33030b, bVar, qVar));
            }
        }

        public a F(int i10, C3070t.b bVar, long j10) {
            return new a(this.f33027c, i10, bVar, j10);
        }

        public void g(Handler handler, A a10) {
            C3645a.e(handler);
            C3645a.e(a10);
            this.f33027c.add(new C0543a(handler, a10));
        }

        public void i(int i10, C3717q0 q0Var, int i11, Object obj, long j10) {
            j(new C3068q(1, i10, q0Var, i11, obj, h(j10), -9223372036854775807L));
        }

        public void j(C3068q qVar) {
            Iterator it = this.f33027c.iterator();
            while (it.hasNext()) {
                C0543a aVar = (C0543a) it.next();
                M.L0(aVar.f33029a, new z(this, aVar.f33030b, qVar));
            }
        }

        public void q(C3065n nVar, int i10) {
            r(nVar, i10, -1, (C3717q0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void r(C3065n nVar, int i10, int i11, C3717q0 q0Var, int i12, Object obj, long j10, long j11) {
            C3065n nVar2 = nVar;
            s(nVar, new C3068q(i10, i11, q0Var, i12, obj, h(j10), h(j11)));
        }

        public void s(C3065n nVar, C3068q qVar) {
            Iterator it = this.f33027c.iterator();
            while (it.hasNext()) {
                C0543a aVar = (C0543a) it.next();
                M.L0(aVar.f33029a, new C3073w(this, aVar.f33030b, nVar, qVar));
            }
        }

        public void t(C3065n nVar, int i10) {
            u(nVar, i10, -1, (C3717q0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        public void u(C3065n nVar, int i10, int i11, C3717q0 q0Var, int i12, Object obj, long j10, long j11) {
            C3065n nVar2 = nVar;
            v(nVar, new C3068q(i10, i11, q0Var, i12, obj, h(j10), h(j11)));
        }

        public void v(C3065n nVar, C3068q qVar) {
            Iterator it = this.f33027c.iterator();
            while (it.hasNext()) {
                C0543a aVar = (C0543a) it.next();
                M.L0(aVar.f33029a, new C3071u(this, aVar.f33030b, nVar, qVar));
            }
        }

        public void w(C3065n nVar, int i10, int i11, C3717q0 q0Var, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            C3065n nVar2 = nVar;
            y(nVar, new C3068q(i10, i11, q0Var, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(C3065n nVar, int i10, IOException iOException, boolean z10) {
            w(nVar, i10, -1, (C3717q0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        public void y(C3065n nVar, C3068q qVar, IOException iOException, boolean z10) {
            Iterator it = this.f33027c.iterator();
            while (it.hasNext()) {
                C0543a aVar = (C0543a) it.next();
                M.L0(aVar.f33029a, new C3072v(this, aVar.f33030b, nVar, qVar, iOException, z10));
            }
        }

        public void z(C3065n nVar, int i10) {
            A(nVar, i10, -1, (C3717q0) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C3070t.b bVar, long j10) {
            this.f33027c = copyOnWriteArrayList;
            this.f33025a = i10;
            this.f33026b = bVar;
            this.f33028d = j10;
        }
    }

    void P(int i10, C3070t.b bVar, C3068q qVar);

    void V(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar);

    void c0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar);

    void g0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar);

    void h0(int i10, C3070t.b bVar, C3065n nVar, C3068q qVar, IOException iOException, boolean z10);

    void n0(int i10, C3070t.b bVar, C3068q qVar);
}
