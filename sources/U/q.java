package U;

import B.j;
import B.n;
import J0.A;
import J0.C1242h;
import J0.C1245k;
import J0.C1252s;
import J0.r;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Xg.C5694f;
import Xg.C5695g;
import androidx.collection.I;
import c1.d;
import c1.s;
import k0.i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import q0.C2427m;
import qf.C6658d;
import qf.g;
import r0.C2443E0;
import rf.C6680b;
import t0.C2602c;
import t0.C2605f;
import yf.C6787a;
import yf.p;

public abstract class q extends i.c implements C1242h, r, A {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final j f6278n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f6279o;

    /* renamed from: p  reason: collision with root package name */
    private final float f6280p;

    /* renamed from: q  reason: collision with root package name */
    private final C2443E0 f6281q;

    /* renamed from: r  reason: collision with root package name */
    private final C6787a f6282r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f6283s;

    /* renamed from: t  reason: collision with root package name */
    private u f6284t;

    /* renamed from: u  reason: collision with root package name */
    private float f6285u;

    /* renamed from: v  reason: collision with root package name */
    private long f6286v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f6287w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final I f6288x;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f6289a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f6290b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f6291c;

        /* renamed from: U.q$a$a  reason: collision with other inner class name */
        static final class C0147a implements C5695g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f6292a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ K f6293b;

            C0147a(q qVar, K k10) {
                this.f6292a = qVar;
                this.f6293b = k10;
            }

            /* renamed from: a */
            public final Object emit(B.i iVar, C6658d dVar) {
                if (!(iVar instanceof n)) {
                    this.f6292a.y2(iVar, this.f6293b);
                } else if (this.f6292a.f6287w) {
                    this.f6292a.w2((n) iVar);
                } else {
                    this.f6292a.f6288x.g(iVar);
                }
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(q qVar, C6658d dVar) {
            super(2, dVar);
            this.f6291c = qVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f6291c, dVar);
            aVar.f6290b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f6289a;
            if (i10 == 0) {
                w.b(obj);
                C5694f c10 = this.f6291c.f6278n.c();
                C0147a aVar = new C0147a(this.f6291c, (K) this.f6290b);
                this.f6289a = 1;
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

    public /* synthetic */ q(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, z10, f10, e02, aVar);
    }

    /* access modifiers changed from: private */
    public final void w2(n nVar) {
        if (nVar instanceof n.b) {
            q2((n.b) nVar, this.f6286v, this.f6285u);
        } else if (nVar instanceof n.c) {
            x2(((n.c) nVar).a());
        } else if (nVar instanceof n.a) {
            x2(((n.a) nVar).a());
        }
    }

    /* access modifiers changed from: private */
    public final void y2(B.i iVar, K k10) {
        u uVar = this.f6284t;
        if (uVar == null) {
            uVar = new u(this.f6279o, this.f6282r);
            C1252s.a(this);
            this.f6284t = uVar;
        }
        uVar.c(iVar, k10);
    }

    public void O(long j10) {
        float f10;
        this.f6287w = true;
        d i10 = C1245k.i(this);
        this.f6286v = s.d(j10);
        if (Float.isNaN(this.f6280p)) {
            f10 = i.a(i10, this.f6279o, this.f6286v);
        } else {
            f10 = i10.t1(this.f6280p);
        }
        this.f6285u = f10;
        I i11 = this.f6288x;
        Object[] objArr = i11.f12112a;
        int i12 = i11.f12113b;
        for (int i13 = 0; i13 < i12; i13++) {
            w2((n) objArr[i13]);
        }
        this.f6288x.h();
    }

    public final boolean Q1() {
        return this.f6283s;
    }

    public void V1() {
        C5600w0 unused = C5576k.d(L1(), (g) null, (M) null, new a(this, (C6658d) null), 3, (Object) null);
    }

    public abstract void q2(n.b bVar, long j10, float f10);

    public abstract void r2(C2605f fVar);

    /* access modifiers changed from: protected */
    public final boolean s2() {
        return this.f6279o;
    }

    /* access modifiers changed from: protected */
    public final C6787a t2() {
        return this.f6282r;
    }

    public void u(C2602c cVar) {
        cVar.H1();
        u uVar = this.f6284t;
        if (uVar != null) {
            uVar.b(cVar, this.f6285u, u2());
        }
        r2(cVar);
    }

    public final long u2() {
        return this.f6281q.a();
    }

    /* access modifiers changed from: protected */
    public final long v2() {
        return this.f6286v;
    }

    public abstract void x2(n.b bVar);

    private q(j jVar, boolean z10, float f10, C2443E0 e02, C6787a aVar) {
        this.f6278n = jVar;
        this.f6279o = z10;
        this.f6280p = f10;
        this.f6281q = e02;
        this.f6282r = aVar;
        this.f6286v = C2427m.f25341b.b();
        this.f6288x = new I(0, 1, (DefaultConstructorMarker) null);
    }
}
