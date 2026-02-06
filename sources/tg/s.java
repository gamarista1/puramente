package tg;

import Fg.B0;
import Fg.C5366d0;
import Fg.D0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.W;
import Fg.r0;
import Hg.k;
import Hg.l;
import Kg.d;
import Lf.i;
import Lf.o;
import Of.C5487e;
import Of.C5490h;
import Of.C5506y;
import Of.H;
import Of.m0;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import ng.b;
import ng.c;
import vg.C6755e;

public final class s extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73576b = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(S s10) {
            C6496s.h(s10, "argumentType");
            if (W.a(s10)) {
                return null;
            }
            S s11 = s10;
            int i10 = 0;
            while (i.c0(s11)) {
                s11 = ((B0) C6565s.P0(s11.L0())).getType();
                i10++;
            }
            C5490h o10 = s11.N0().o();
            if (o10 instanceof C5487e) {
                ng.b n10 = C6755e.n(o10);
                if (n10 == null) {
                    return new s((b) new b.a(s10));
                }
                return new s(n10, i10);
            } else if (!(o10 instanceof m0)) {
                return null;
            } else {
                b.a aVar = ng.b.f72283d;
                c l10 = o.a.f63997b.l();
                C6496s.g(l10, "toSafe(...)");
                return new s(aVar.c(l10), 0);
            }
        }

        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final S f73577a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(S s10) {
                super((DefaultConstructorMarker) null);
                C6496s.h(s10, "type");
                this.f73577a = s10;
            }

            public final S a() {
                return this.f73577a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && C6496s.c(this.f73577a, ((a) obj).f73577a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f73577a.hashCode();
            }

            public String toString() {
                return "LocalClass(type=" + this.f73577a + ')';
            }
        }

        /* renamed from: tg.s$b$b  reason: collision with other inner class name */
        public static final class C1070b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C6740f f73578a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1070b(C6740f fVar) {
                super((DefaultConstructorMarker) null);
                C6496s.h(fVar, "value");
                this.f73578a = fVar;
            }

            public final int a() {
                return this.f73578a.c();
            }

            public final ng.b b() {
                return this.f73578a.d();
            }

            public final C6740f c() {
                return this.f73578a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C1070b) && C6496s.c(this.f73578a, ((C1070b) obj).f73578a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f73578a.hashCode();
            }

            public String toString() {
                return "NormalClass(value=" + this.f73578a + ')';
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(b bVar) {
        super(bVar);
        C6496s.h(bVar, "value");
    }

    public S a(H h10) {
        C6496s.h(h10, "module");
        r0 j10 = r0.f63046b.j();
        C5487e E10 = h10.m().E();
        C6496s.g(E10, "getKClass(...)");
        return V.h(j10, E10, C6565s.e(new D0(c(h10))));
    }

    public final S c(H h10) {
        C6496s.h(h10, "module");
        b bVar = (b) b();
        if (bVar instanceof b.a) {
            return ((b.a) b()).a();
        }
        if (bVar instanceof b.C1070b) {
            C6740f c10 = ((b.C1070b) b()).c();
            ng.b a10 = c10.a();
            int b10 = c10.b();
            C5487e b11 = C5506y.b(h10, a10);
            if (b11 == null) {
                return l.d(k.UNRESOLVED_KCLASS_CONSTANT_VALUE, a10.toString(), String.valueOf(b10));
            }
            C5366d0 p10 = b11.p();
            C6496s.g(p10, "getDefaultType(...)");
            S D10 = d.D(p10);
            for (int i10 = 0; i10 < b10; i10++) {
                D10 = h10.m().l(N0.INVARIANT, D10);
            }
            return D10;
        }
        throw new C6535s();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(C6740f fVar) {
        this((b) new b.C1070b(fVar));
        C6496s.h(fVar, "value");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public s(ng.b bVar, int i10) {
        this(new C6740f(bVar, i10));
        C6496s.h(bVar, "classId");
    }
}
