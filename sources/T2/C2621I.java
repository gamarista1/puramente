package t2;

import android.os.Handler;
import f2.s;
import i2.C2076a;
import i2.L;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t2.C2615C;

/* renamed from: t2.I  reason: case insensitive filesystem */
public interface C2621I {

    /* renamed from: t2.I$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f25986a;

        /* renamed from: b  reason: collision with root package name */
        public final C2615C.b f25987b;

        /* renamed from: c  reason: collision with root package name */
        private final CopyOnWriteArrayList f25988c;

        /* renamed from: t2.I$a$a  reason: collision with other inner class name */
        private static final class C0436a {

            /* renamed from: a  reason: collision with root package name */
            public Handler f25989a;

            /* renamed from: b  reason: collision with root package name */
            public C2621I f25990b;

            public C0436a(Handler handler, C2621I i10) {
                this.f25989a = handler;
                this.f25990b = i10;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, (C2615C.b) null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void i(C2621I i10, C2613A a10) {
            i10.j0(this.f25986a, this.f25987b, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void j(C2621I i10, C2658x xVar, C2613A a10) {
            i10.i0(this.f25986a, this.f25987b, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void k(C2621I i10, C2658x xVar, C2613A a10) {
            i10.X(this.f25986a, this.f25987b, xVar, a10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void l(C2621I i10, C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
            i10.g0(this.f25986a, this.f25987b, xVar, a10, iOException, z10);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void m(C2621I i10, C2658x xVar, C2613A a10) {
            i10.b0(this.f25986a, this.f25987b, xVar, a10);
        }

        public void f(Handler handler, C2621I i10) {
            C2076a.e(handler);
            C2076a.e(i10);
            this.f25988c.add(new C0436a(handler, i10));
        }

        public void g(int i10, s sVar, int i11, Object obj, long j10) {
            h(new C2613A(1, i10, sVar, i11, obj, L.h1(j10), -9223372036854775807L));
        }

        public void h(C2613A a10) {
            Iterator it = this.f25988c.iterator();
            while (it.hasNext()) {
                C0436a aVar = (C0436a) it.next();
                L.R0(aVar.f25989a, new C2616D(this, aVar.f25990b, a10));
            }
        }

        public void n(C2658x xVar, int i10, int i11, s sVar, int i12, Object obj, long j10, long j11) {
            C2613A a10 = new C2613A(i10, i11, sVar, i12, obj, L.h1(j10), L.h1(j11));
            C2658x xVar2 = xVar;
            o(xVar, a10);
        }

        public void o(C2658x xVar, C2613A a10) {
            Iterator it = this.f25988c.iterator();
            while (it.hasNext()) {
                C0436a aVar = (C0436a) it.next();
                L.R0(aVar.f25989a, new C2620H(this, aVar.f25990b, xVar, a10));
            }
        }

        public void p(C2658x xVar, int i10, int i11, s sVar, int i12, Object obj, long j10, long j11) {
            C2613A a10 = new C2613A(i10, i11, sVar, i12, obj, L.h1(j10), L.h1(j11));
            C2658x xVar2 = xVar;
            q(xVar, a10);
        }

        public void q(C2658x xVar, C2613A a10) {
            Iterator it = this.f25988c.iterator();
            while (it.hasNext()) {
                C0436a aVar = (C0436a) it.next();
                L.R0(aVar.f25989a, new C2618F(this, aVar.f25990b, xVar, a10));
            }
        }

        public void r(C2658x xVar, int i10, int i11, s sVar, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            C2613A a10 = new C2613A(i10, i11, sVar, i12, obj, L.h1(j10), L.h1(j11));
            C2658x xVar2 = xVar;
            s(xVar, a10, iOException, z10);
        }

        public void s(C2658x xVar, C2613A a10, IOException iOException, boolean z10) {
            Iterator it = this.f25988c.iterator();
            while (it.hasNext()) {
                C0436a aVar = (C0436a) it.next();
                L.R0(aVar.f25989a, new C2619G(this, aVar.f25990b, xVar, a10, iOException, z10));
            }
        }

        public void t(C2658x xVar, int i10, int i11, s sVar, int i12, Object obj, long j10, long j11) {
            C2613A a10 = new C2613A(i10, i11, sVar, i12, obj, L.h1(j10), L.h1(j11));
            C2658x xVar2 = xVar;
            u(xVar, a10);
        }

        public void u(C2658x xVar, C2613A a10) {
            Iterator it = this.f25988c.iterator();
            while (it.hasNext()) {
                C0436a aVar = (C0436a) it.next();
                L.R0(aVar.f25989a, new C2617E(this, aVar.f25990b, xVar, a10));
            }
        }

        public void v(C2621I i10) {
            Iterator it = this.f25988c.iterator();
            while (it.hasNext()) {
                C0436a aVar = (C0436a) it.next();
                if (aVar.f25990b == i10) {
                    this.f25988c.remove(aVar);
                }
            }
        }

        public a w(int i10, C2615C.b bVar) {
            return new a(this.f25988c, i10, bVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i10, C2615C.b bVar) {
            this.f25988c = copyOnWriteArrayList;
            this.f25986a = i10;
            this.f25987b = bVar;
        }
    }

    void X(int i10, C2615C.b bVar, C2658x xVar, C2613A a10);

    void b0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10);

    void g0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10, IOException iOException, boolean z10);

    void i0(int i10, C2615C.b bVar, C2658x xVar, C2613A a10);

    void j0(int i10, C2615C.b bVar, C2613A a10);
}
