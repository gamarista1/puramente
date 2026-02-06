package x;

import H0.C1197s;
import J0.C1247m;
import J0.C1253t;
import J0.w0;
import J0.x0;
import O0.t;
import O0.v;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import androidx.compose.ui.focus.q;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import p0.k;
import p0.l;
import p0.o;
import q0.C2423i;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.p;

/* renamed from: x.z  reason: case insensitive filesystem */
public final class C2887z extends C1247m implements p0.b, w0, C1253t, k {

    /* renamed from: p  reason: collision with root package name */
    private final boolean f28000p;

    /* renamed from: q  reason: collision with root package name */
    private l f28001q;

    /* renamed from: r  reason: collision with root package name */
    private final C2886y f28002r;

    /* renamed from: s  reason: collision with root package name */
    private final C2837A f28003s = ((C2837A) l2(new C2837A()));

    /* renamed from: t  reason: collision with root package name */
    private final C2839C f28004t = ((C2839C) l2(new C2839C()));

    /* renamed from: x.z$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2887z f28005a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C2887z zVar) {
            super(0);
            this.f28005a = zVar;
        }

        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(q.a(this.f28005a));
        }
    }

    /* renamed from: x.z$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f28006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C2887z f28007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2887z zVar, C6658d dVar) {
            super(2, dVar);
            this.f28007b = zVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f28007b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f28006a;
            if (i10 == 0) {
                w.b(obj);
                C2887z zVar = this.f28007b;
                this.f28006a = 1;
                if (f.b(zVar, (C2423i) null, this, 1, (Object) null) == f10) {
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

    public C2887z(B.l lVar) {
        this.f28002r = (C2886y) l2(new C2886y(lVar));
        l2(o.a());
    }

    public boolean Q1() {
        return this.f28000p;
    }

    public void W(v vVar) {
        l lVar = this.f28001q;
        boolean z10 = false;
        if (lVar != null && lVar.a()) {
            z10 = true;
        }
        t.b0(vVar, z10);
        t.Q(vVar, (String) null, new a(this), 1, (Object) null);
    }

    public void m0(l lVar) {
        if (!C6496s.c(this.f28001q, lVar)) {
            boolean a10 = lVar.a();
            if (a10) {
                C5600w0 unused = C5576k.d(L1(), (g) null, (M) null, new b(this, (C6658d) null), 3, (Object) null);
            }
            if (S1()) {
                x0.b(this);
            }
            this.f28002r.n2(a10);
            this.f28004t.n2(a10);
            this.f28003s.m2(a10);
            this.f28001q = lVar;
        }
    }

    public void p(C1197s sVar) {
        this.f28004t.p(sVar);
    }

    public final void r2(B.l lVar) {
        this.f28002r.o2(lVar);
    }
}
