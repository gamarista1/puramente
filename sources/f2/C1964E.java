package f2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import f2.r;
import h2.C2031b;
import i2.L;
import java.util.List;
import nb.k;

/* renamed from: f2.E  reason: case insensitive filesystem */
public interface C1964E {

    /* renamed from: f2.E$b */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f19712b = new a().e();

        /* renamed from: c  reason: collision with root package name */
        private static final String f19713c = L.y0(0);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final r f19714a;

        /* renamed from: f2.E$b$a */
        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f19715b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a  reason: collision with root package name */
            private final r.b f19716a = new r.b();

            public a a(int i10) {
                this.f19716a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f19716a.b(bVar.f19714a);
                return this;
            }

            public a c(int... iArr) {
                this.f19716a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f19716a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f19716a.e());
            }
        }

        public boolean b(int i10) {
            return this.f19714a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f19714a.equals(((b) obj).f19714a);
        }

        public int hashCode() {
            return this.f19714a.hashCode();
        }

        private b(r rVar) {
            this.f19714a = rVar;
        }
    }

    /* renamed from: f2.E$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final r f19717a;

        public c(r rVar) {
            this.f19717a = rVar;
        }

        public boolean a(int... iArr) {
            return this.f19717a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f19717a.equals(((c) obj).f19717a);
        }

        public int hashCode() {
            return this.f19717a.hashCode();
        }
    }

    /* renamed from: f2.E$e */
    public static final class e {

        /* renamed from: k  reason: collision with root package name */
        static final String f19718k = L.y0(0);

        /* renamed from: l  reason: collision with root package name */
        private static final String f19719l = L.y0(1);

        /* renamed from: m  reason: collision with root package name */
        static final String f19720m = L.y0(2);

        /* renamed from: n  reason: collision with root package name */
        static final String f19721n = L.y0(3);

        /* renamed from: o  reason: collision with root package name */
        static final String f19722o = L.y0(4);

        /* renamed from: p  reason: collision with root package name */
        private static final String f19723p = L.y0(5);

        /* renamed from: q  reason: collision with root package name */
        private static final String f19724q = L.y0(6);

        /* renamed from: a  reason: collision with root package name */
        public final Object f19725a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19726b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19727c;

        /* renamed from: d  reason: collision with root package name */
        public final w f19728d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f19729e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19730f;

        /* renamed from: g  reason: collision with root package name */
        public final long f19731g;

        /* renamed from: h  reason: collision with root package name */
        public final long f19732h;

        /* renamed from: i  reason: collision with root package name */
        public final int f19733i;

        /* renamed from: j  reason: collision with root package name */
        public final int f19734j;

        public e(Object obj, int i10, w wVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f19725a = obj;
            this.f19726b = i10;
            this.f19727c = i10;
            this.f19728d = wVar;
            this.f19729e = obj2;
            this.f19730f = i11;
            this.f19731g = j10;
            this.f19732h = j11;
            this.f19733i = i12;
            this.f19734j = i13;
        }

        public boolean a(e eVar) {
            if (this.f19727c == eVar.f19727c && this.f19730f == eVar.f19730f && this.f19731g == eVar.f19731g && this.f19732h == eVar.f19732h && this.f19733i == eVar.f19733i && this.f19734j == eVar.f19734j && k.a(this.f19728d, eVar.f19728d)) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (!a(eVar) || !k.a(this.f19725a, eVar.f19725a) || !k.a(this.f19729e, eVar.f19729e)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return k.b(this.f19725a, Integer.valueOf(this.f19727c), this.f19728d, this.f19729e, Integer.valueOf(this.f19730f), Long.valueOf(this.f19731g), Long.valueOf(this.f19732h), Integer.valueOf(this.f19733i), Integer.valueOf(this.f19734j));
        }
    }

    boolean A();

    int B();

    void C(int i10);

    boolean D();

    boolean E();

    void F(d dVar);

    void G();

    void H(List list, boolean z10);

    void I(SurfaceView surfaceView);

    void J();

    void K(boolean z10);

    boolean L(int i10);

    Looper M();

    K N();

    void O();

    void P(TextureView textureView);

    b Q();

    void R(boolean z10);

    long S();

    long T();

    void U(TextureView textureView);

    P V();

    void W(w wVar);

    long X();

    void Y(K k10);

    void Z(SurfaceView surfaceView);

    long a0();

    void b0();

    C1963D c();

    void c0();

    y d0();

    void e0(d dVar);

    void f(C1963D d10);

    long f0();

    boolean g();

    long getCurrentPosition();

    long getDuration();

    long h();

    C1962C i();

    boolean isPlaying();

    void j();

    int k();

    void l();

    L m();

    int n();

    boolean o();

    int p();

    void pause();

    boolean q();

    int r();

    H s();

    void t(int i10, long j10);

    boolean u();

    int v();

    boolean w();

    int x();

    void y(long j10);

    long z();

    /* renamed from: f2.E$d */
    public interface d {
        void z() {
        }

        void B(C1963D d10) {
        }

        void E(int i10) {
        }

        void F(boolean z10) {
        }

        void I(z zVar) {
        }

        void K(C2031b bVar) {
        }

        void N(boolean z10) {
        }

        void P(C1962C c10) {
        }

        void Q(boolean z10) {
        }

        void R(y yVar) {
        }

        void Y(L l10) {
        }

        void a(boolean z10) {
        }

        void c0(C1978m mVar) {
        }

        void d0(C1962C c10) {
        }

        void f0(K k10) {
        }

        void g(List list) {
        }

        void n0(b bVar) {
        }

        void p(P p10) {
        }

        void r(int i10) {
        }

        void s(int i10) {
        }

        void t(boolean z10) {
        }

        void v(int i10) {
        }

        void C(int i10, int i11) {
        }

        void H(boolean z10, int i10) {
        }

        void L(boolean z10, int i10) {
        }

        void W(w wVar, int i10) {
        }

        void e0(H h10, int i10) {
        }

        void h0(C1964E e10, c cVar) {
        }

        void y(int i10, boolean z10) {
        }

        void U(e eVar, e eVar2, int i10) {
        }
    }
}
