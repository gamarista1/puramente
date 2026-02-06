package t2;

import W2.s;
import android.os.Handler;
import f2.H;
import f2.w;
import k2.x;
import n2.u1;
import p2.t;
import w2.C2820b;
import w2.C2827i;

/* renamed from: t2.C  reason: case insensitive filesystem */
public interface C2615C {

    /* renamed from: t2.C$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f25960a;

        /* renamed from: b  reason: collision with root package name */
        public final int f25961b;

        /* renamed from: c  reason: collision with root package name */
        public final int f25962c;

        /* renamed from: d  reason: collision with root package name */
        public final long f25963d;

        /* renamed from: e  reason: collision with root package name */
        public final int f25964e;

        public b(Object obj) {
            this(obj, -1);
        }

        public b a(Object obj) {
            if (this.f25960a.equals(obj)) {
                return this;
            }
            return new b(obj, this.f25961b, this.f25962c, this.f25963d, this.f25964e);
        }

        public boolean b() {
            if (this.f25961b != -1) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f25960a.equals(bVar.f25960a) && this.f25961b == bVar.f25961b && this.f25962c == bVar.f25962c && this.f25963d == bVar.f25963d && this.f25964e == bVar.f25964e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return ((((((((527 + this.f25960a.hashCode()) * 31) + this.f25961b) * 31) + this.f25962c) * 31) + ((int) this.f25963d)) * 31) + this.f25964e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f25960a = obj;
            this.f25961b = i10;
            this.f25962c = i11;
            this.f25963d = j10;
            this.f25964e = i12;
        }
    }

    /* renamed from: t2.C$c */
    public interface c {
        void a(C2615C c10, H h10);
    }

    w a();

    void c();

    boolean d() {
        return true;
    }

    H e() {
        return null;
    }

    void f(c cVar);

    void g(c cVar);

    void h(Handler handler, t tVar);

    void i(Handler handler, C2621I i10);

    void j(C2614B b10);

    void k(c cVar, x xVar, u1 u1Var);

    void l(C2621I i10);

    void n(t tVar);

    C2614B o(b bVar, C2820b bVar2, long j10);

    void p(c cVar);

    /* renamed from: t2.C$a */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25959a = C2622J.f25991b;

        C2615C d(w wVar);

        a e(p2.w wVar);

        a f(C2827i iVar);

        a c(s.a aVar) {
            return this;
        }

        a g(boolean z10) {
            return this;
        }
    }

    void m(w wVar) {
    }
}
