package k9;

import android.os.Bundle;
import ja.C3656l;
import java.util.ArrayList;
import java.util.List;
import k9.C3700i;
import ka.y;
import nb.k;

public interface T0 {

    public static final class b implements C3700i {

        /* renamed from: b  reason: collision with root package name */
        public static final b f45379b = new a().e();

        /* renamed from: c  reason: collision with root package name */
        public static final C3700i.a f45380c = new U0();
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final C3656l f45381a;

        public static final class a {

            /* renamed from: b  reason: collision with root package name */
            private static final int[] f45382b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

            /* renamed from: a  reason: collision with root package name */
            private final C3656l.b f45383a = new C3656l.b();

            public a a(int i10) {
                this.f45383a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f45383a.b(bVar.f45381a);
                return this;
            }

            public a c(int... iArr) {
                this.f45383a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f45383a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f45383a.e());
            }
        }

        /* access modifiers changed from: private */
        public static b c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(d(0));
            if (integerArrayList == null) {
                return f45379b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.e();
        }

        private static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f45381a.equals(((b) obj).f45381a);
        }

        public int hashCode() {
            return this.f45381a.hashCode();
        }

        private b(C3656l lVar) {
            this.f45381a = lVar;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final C3656l f45384a;

        public c(C3656l lVar) {
            this.f45384a = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.f45384a.equals(((c) obj).f45384a);
        }

        public int hashCode() {
            return this.f45384a.hashCode();
        }
    }

    public static final class e implements C3700i {

        /* renamed from: k  reason: collision with root package name */
        public static final C3700i.a f45385k = new V0();

        /* renamed from: a  reason: collision with root package name */
        public final Object f45386a;

        /* renamed from: b  reason: collision with root package name */
        public final int f45387b;

        /* renamed from: c  reason: collision with root package name */
        public final int f45388c;

        /* renamed from: d  reason: collision with root package name */
        public final C3732y0 f45389d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f45390e;

        /* renamed from: f  reason: collision with root package name */
        public final int f45391f;

        /* renamed from: g  reason: collision with root package name */
        public final long f45392g;

        /* renamed from: h  reason: collision with root package name */
        public final long f45393h;

        /* renamed from: i  reason: collision with root package name */
        public final int f45394i;

        /* renamed from: j  reason: collision with root package name */
        public final int f45395j;

        public e(Object obj, int i10, C3732y0 y0Var, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f45386a = obj;
            this.f45387b = i10;
            this.f45388c = i10;
            this.f45389d = y0Var;
            this.f45390e = obj2;
            this.f45391f = i11;
            this.f45392g = j10;
            this.f45393h = j11;
            this.f45394i = i12;
            this.f45395j = i13;
        }

        /* access modifiers changed from: private */
        public static e b(Bundle bundle) {
            C3732y0 y0Var;
            int i10 = bundle.getInt(c(0), -1);
            Bundle bundle2 = bundle.getBundle(c(1));
            if (bundle2 == null) {
                y0Var = null;
            } else {
                y0Var = (C3732y0) C3732y0.f45854j.a(bundle2);
            }
            return new e((Object) null, i10, y0Var, (Object) null, bundle.getInt(c(2), -1), bundle.getLong(c(3), -9223372036854775807L), bundle.getLong(c(4), -9223372036854775807L), bundle.getInt(c(5), -1), bundle.getInt(c(6), -1));
        }

        private static String c(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f45388c == eVar.f45388c && this.f45391f == eVar.f45391f && this.f45392g == eVar.f45392g && this.f45393h == eVar.f45393h && this.f45394i == eVar.f45394i && this.f45395j == eVar.f45395j && k.a(this.f45386a, eVar.f45386a) && k.a(this.f45390e, eVar.f45390e) && k.a(this.f45389d, eVar.f45389d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return k.b(this.f45386a, Integer.valueOf(this.f45388c), this.f45389d, this.f45390e, Integer.valueOf(this.f45391f), Long.valueOf(this.f45392g), Long.valueOf(this.f45393h), Integer.valueOf(this.f45394i), Integer.valueOf(this.f45395j));
        }
    }

    boolean A();

    int B();

    boolean D();

    boolean E();

    boolean g();

    long getCurrentPosition();

    long h();

    P0 i();

    int k();

    s1 m();

    int n();

    boolean o();

    int p();

    boolean q();

    int r();

    n1 s();

    void t(int i10, long j10);

    boolean u();

    int v();

    boolean w();

    int x();

    long z();

    public interface d {
        void E(int i10);

        void H(boolean z10, int i10);

        void a0(P0 p02);

        void o(S0 s02);

        void p(y yVar);

        void r(int i10);

        void t(boolean z10);

        void z();

        void X() {
        }

        void F(boolean z10) {
        }

        void J(W9.e eVar) {
        }

        void K(C3714p pVar) {
        }

        void N(boolean z10) {
        }

        void Y(float f10) {
        }

        void Z(D0 d02) {
        }

        void a(boolean z10) {
        }

        void g(List list) {
        }

        void j0(P0 p02) {
        }

        void k0(s1 s1Var) {
        }

        void l0(b bVar) {
        }

        void s(int i10) {
        }

        void u(D9.a aVar) {
        }

        void v(int i10) {
        }

        void C(int i10, int i11) {
        }

        void L(boolean z10, int i10) {
        }

        void R(C3732y0 y0Var, int i10) {
        }

        void S(n1 n1Var, int i10) {
        }

        void T(T0 t02, c cVar) {
        }

        void y(int i10, boolean z10) {
        }

        void Q(e eVar, e eVar2, int i10) {
        }
    }
}
