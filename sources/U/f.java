package U;

import B.i;
import B.j;
import B.n;
import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import Y.A1;
import Y.C1500m;
import Y.C1506p;
import Y.P;
import Y.p1;
import c1.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import r0.C2544x0;
import rf.C6680b;
import x.C2843G;
import x.C2844H;
import yf.p;

public abstract class f implements C2843G {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f6214a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6215b;

    /* renamed from: c  reason: collision with root package name */
    private final A1 f6216c;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6217a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6218b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f6219c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f6220d;

        /* renamed from: U.f$a$a  reason: collision with other inner class name */
        static final class C0145a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ o f6221a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f6222b;

            C0145a(o oVar, K k10) {
                this.f6221a = oVar;
                this.f6222b = k10;
            }

            /* renamed from: a */
            public final Object emit(i iVar, C6658d dVar) {
                if (iVar instanceof n.b) {
                    this.f6221a.e((n.b) iVar, this.f6222b);
                } else if (iVar instanceof n.c) {
                    this.f6221a.g(((n.c) iVar).a());
                } else if (iVar instanceof n.a) {
                    this.f6221a.g(((n.a) iVar).a());
                } else {
                    this.f6221a.h(iVar, this.f6222b);
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, o oVar, C6658d dVar) {
            super(2, dVar);
            this.f6219c = jVar;
            this.f6220d = oVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f6219c, this.f6220d, dVar);
            aVar.f6218b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6217a;
            if (i10 == 0) {
                w.b(obj);
                C5694f c10 = this.f6219c.c();
                C0145a aVar = new C0145a(this.f6220d, (K) this.f6218b);
                this.f6217a = 1;
                if (c10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public /* synthetic */ f(boolean z10, float f10, A1 a12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, a12);
    }

    public final C2844H b(j jVar, C1500m mVar, int i10) {
        long j10;
        mVar.T(988743187);
        if (C1506p.H()) {
            C1506p.Q(988743187, i10, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)");
        }
        r rVar = (r) mVar.m(s.d());
        boolean z10 = false;
        if (((C2544x0) this.f6216c.getValue()).y() != 16) {
            mVar.T(-303571590);
            mVar.M();
            j10 = ((C2544x0) this.f6216c.getValue()).y();
        } else {
            mVar.T(-303521246);
            j10 = rVar.b(mVar, 0);
            mVar.M();
        }
        A1 o10 = p1.o(C2544x0.k(j10), mVar, 0);
        A1 o11 = p1.o(rVar.a(mVar, 0), mVar, 0);
        int i11 = i10 & 14;
        o c10 = c(jVar, this.f6214a, this.f6215b, o10, o11, mVar, i11 | ((i10 << 12) & 458752));
        if (((i11 ^ 6) > 4 && mVar.S(jVar)) || (i10 & 6) == 4) {
            z10 = true;
        }
        boolean C10 = mVar.C(c10) | z10;
        Object A10 = mVar.A();
        if (C10 || A10 == C1500m.f10026a.a()) {
            A10 = new a(jVar, c10, (C6658d) null);
            mVar.r(A10);
        }
        P.f(c10, jVar, (p) A10, mVar, (i10 << 3) & 112);
        if (C1506p.H()) {
            C1506p.P();
        }
        mVar.M();
        return c10;
    }

    public abstract o c(j jVar, boolean z10, float f10, A1 a12, A1 a13, C1500m mVar, int i10);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f6214a == fVar.f6214a && h.m(this.f6215b, fVar.f6215b) && C6496s.c(this.f6216c, fVar.f6216c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f6214a) * 31) + h.o(this.f6215b)) * 31) + this.f6216c.hashCode();
    }

    private f(boolean z10, float f10, A1 a12) {
        this.f6214a = z10;
        this.f6215b = f10;
        this.f6216c = a12;
    }
}
