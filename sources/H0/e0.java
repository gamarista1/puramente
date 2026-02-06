package H0;

import J0.G;
import Y.r;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

public final class e0 {

    /* renamed from: f  reason: collision with root package name */
    public static final int f2594f = 8;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final g0 f2595a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public A f2596b;

    /* renamed from: c  reason: collision with root package name */
    private final p f2597c;

    /* renamed from: d  reason: collision with root package name */
    private final p f2598d;

    /* renamed from: e  reason: collision with root package name */
    private final p f2599e;

    static final class b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f2600a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e0 e0Var) {
            super(2);
            this.f2600a = e0Var;
        }

        public final void a(G g10, r rVar) {
            this.f2600a.h().I(rVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (r) obj2);
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f2601a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e0 e0Var) {
            super(2);
            this.f2601a = e0Var;
        }

        public final void a(G g10, p pVar) {
            g10.g(this.f2601a.h().u(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (p) obj2);
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f2602a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e0 e0Var) {
            super(2);
            this.f2602a = e0Var;
        }

        public final void a(G g10, e0 e0Var) {
            e0 e0Var2 = this.f2602a;
            A q02 = g10.q0();
            if (q02 == null) {
                q02 = new A(g10, this.f2602a.f2595a);
                g10.J1(q02);
            }
            e0Var2.f2596b = q02;
            this.f2602a.h().B();
            this.f2602a.h().J(this.f2602a.f2595a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (e0) obj2);
            return C6514M.f71813a;
        }
    }

    public e0(g0 g0Var) {
        this.f2595a = g0Var;
        this.f2597c = new d(this);
        this.f2598d = new b(this);
        this.f2599e = new c(this);
    }

    /* access modifiers changed from: private */
    public final A h() {
        A a10 = this.f2596b;
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void d() {
        h().z();
    }

    public final p e() {
        return this.f2598d;
    }

    public final p f() {
        return this.f2599e;
    }

    public final p g() {
        return this.f2597c;
    }

    public final a i(Object obj, p pVar) {
        return h().G(obj, pVar);
    }

    public e0() {
        this(N.f2544a);
    }

    public interface a {
        int d() {
            return 0;
        }

        void dispose();

        void a(Object obj, C6798l lVar) {
        }

        void b(int i10, long j10) {
        }
    }
}
