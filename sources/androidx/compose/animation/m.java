package androidx.compose.animation;

import H0.E;
import H0.G;
import H0.H;
import H0.U;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Y.C1510r0;
import Y.o1;
import c1.r;
import c1.s;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import v.C2733p;
import w.C2782a;
import w.C2790e;
import w.C2794g;
import w.C2797i;
import w.t0;
import yf.C6798l;
import yf.p;

final class m extends C2733p {

    /* renamed from: n  reason: collision with root package name */
    private C2797i f12388n;

    /* renamed from: o  reason: collision with root package name */
    private k0.c f12389o;

    /* renamed from: p  reason: collision with root package name */
    private p f12390p;

    /* renamed from: q  reason: collision with root package name */
    private long f12391q = f.c();

    /* renamed from: r  reason: collision with root package name */
    private long f12392r = c1.c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: s  reason: collision with root package name */
    private boolean f12393s;

    /* renamed from: t  reason: collision with root package name */
    private final C1510r0 f12394t = u1.d((Object) null, (o1) null, 2, (Object) null);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C2782a f12395a;

        /* renamed from: b  reason: collision with root package name */
        private long f12396b;

        public /* synthetic */ a(C2782a aVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, j10);
        }

        public final C2782a a() {
            return this.f12395a;
        }

        public final long b() {
            return this.f12396b;
        }

        public final void c(long j10) {
            this.f12396b = j10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C6496s.c(this.f12395a, aVar.f12395a) && r.e(this.f12396b, aVar.f12396b);
        }

        public int hashCode() {
            return (this.f12395a.hashCode() * 31) + r.h(this.f12396b);
        }

        public String toString() {
            return "AnimData(anim=" + this.f12395a + ", startSize=" + r.i(this.f12396b) + ')';
        }

        private a(C2782a aVar, long j10) {
            this.f12395a = aVar;
            this.f12396b = j10;
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f12397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f12398b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f12399c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m f12400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, long j10, m mVar, C6658d dVar) {
            super(2, dVar);
            this.f12398b = aVar;
            this.f12399c = j10;
            this.f12400d = mVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f12398b, this.f12399c, this.f12400d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            p p22;
            Object f10 = C6680b.f();
            int i10 = this.f12397a;
            if (i10 == 0) {
                w.b(obj);
                C2782a a10 = this.f12398b.a();
                r b10 = r.b(this.f12399c);
                C2797i o22 = this.f12400d.o2();
                this.f12397a = 1;
                obj = C2782a.f(a10, b10, o22, (Object) null, (C6798l) null, this, 12, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2794g gVar = (C2794g) obj;
            if (gVar.a() == C2790e.Finished && (p22 = this.f12400d.p2()) != null) {
                p22.invoke(r.b(this.f12398b.b()), gVar.b().getValue());
            }
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f12401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f12402b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12403c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f12404d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ H f12405e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ U f12406f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(m mVar, long j10, int i10, int i11, H h10, U u10) {
            super(1);
            this.f12401a = mVar;
            this.f12402b = j10;
            this.f12403c = i10;
            this.f12404d = i11;
            this.f12405e = h10;
            this.f12406f = u10;
        }

        public final void a(U.a aVar) {
            U.a aVar2 = aVar;
            U.a.j(aVar2, this.f12406f, this.f12401a.m2().a(this.f12402b, s.a(this.f12403c, this.f12404d), this.f12405e.getLayoutDirection()), 0.0f, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((U.a) obj);
            return C6514M.f71813a;
        }
    }

    public m(C2797i iVar, k0.c cVar, p pVar) {
        this.f12388n = iVar;
        this.f12389o = cVar;
        this.f12390p = pVar;
    }

    private final void u2(long j10) {
        this.f12392r = j10;
        this.f12393s = true;
    }

    private final long v2(long j10) {
        if (this.f12393s) {
            return this.f12392r;
        }
        return j10;
    }

    public void V1() {
        super.V1();
        this.f12391q = f.c();
        this.f12393s = false;
    }

    public void X1() {
        super.X1();
        r2((a) null);
    }

    public final long l2(long j10) {
        long j11 = j10;
        a n22 = n2();
        boolean z10 = true;
        if (n22 != null) {
            if (r.e(j11, ((r) n22.a().m()).j()) || n22.a().p()) {
                z10 = false;
            }
            if (!r.e(j11, ((r) n22.a().k()).j()) || z10) {
                n22.c(((r) n22.a().m()).j());
                C5600w0 unused = C5576k.d(L1(), (g) null, (M) null, new b(n22, j10, this, (C6658d) null), 3, (Object) null);
            }
        } else {
            n22 = new a(new C2782a(r.b(j10), t0.e(r.f19235b), r.b(s.a(1, 1)), (String) null, 8, (DefaultConstructorMarker) null), j11, (DefaultConstructorMarker) null);
        }
        r2(n22);
        return ((r) n22.a().m()).j();
    }

    public final k0.c m2() {
        return this.f12389o;
    }

    public final a n2() {
        return (a) this.f12394t.getValue();
    }

    public G o(H h10, E e10, long j10) {
        U v02;
        long j11;
        long j12;
        long j13 = j10;
        if (h10.r0()) {
            u2(j13);
            v02 = e10.v0(j10);
        } else {
            v02 = e10.v0(v2(j13));
        }
        U u10 = v02;
        long a10 = s.a(u10.X0(), u10.R0());
        if (h10.r0()) {
            this.f12391q = a10;
            j11 = a10;
        } else {
            if (f.d(this.f12391q)) {
                j12 = this.f12391q;
            } else {
                j12 = a10;
            }
            j11 = c1.c.f(j13, l2(j12));
        }
        int g10 = r.g(j11);
        int f10 = r.f(j11);
        return H.N(h10, g10, f10, (Map) null, new c(this, a10, g10, f10, h10, u10), 4, (Object) null);
    }

    public final C2797i o2() {
        return this.f12388n;
    }

    public final p p2() {
        return this.f12390p;
    }

    public final void q2(k0.c cVar) {
        this.f12389o = cVar;
    }

    public final void r2(a aVar) {
        this.f12394t.setValue(aVar);
    }

    public final void s2(C2797i iVar) {
        this.f12388n = iVar;
    }

    public final void t2(p pVar) {
        this.f12390p = pVar;
    }
}
