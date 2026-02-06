package x;

import B.d;
import B.e;
import B.l;
import Ug.C5559b0;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: x.y  reason: case insensitive filesystem */
final class C2886y extends i.c {

    /* renamed from: n  reason: collision with root package name */
    private l f27991n;

    /* renamed from: o  reason: collision with root package name */
    private d f27992o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f27993p;

    /* renamed from: x.y$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f27994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f27995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B.i f27996c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5559b0 f27997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, B.i iVar, C5559b0 b0Var, C6658d dVar) {
            super(2, dVar);
            this.f27995b = lVar;
            this.f27996c = iVar;
            this.f27997d = b0Var;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f27995b, this.f27996c, this.f27997d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f27994a;
            if (i10 == 0) {
                w.b(obj);
                l lVar = this.f27995b;
                B.i iVar = this.f27996c;
                this.f27994a = 1;
                if (lVar.b(iVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5559b0 b0Var = this.f27997d;
            if (b0Var != null) {
                b0Var.dispose();
            }
            return C6514M.f71813a;
        }
    }

    /* renamed from: x.y$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f27998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ B.i f27999b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l lVar, B.i iVar) {
            super(1);
            this.f27998a = lVar;
            this.f27999b = iVar;
        }

        public final void a(Throwable th2) {
            this.f27998a.a(this.f27999b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public C2886y(l lVar) {
        this.f27991n = lVar;
    }

    private final void l2() {
        d dVar;
        l lVar = this.f27991n;
        if (!(lVar == null || (dVar = this.f27992o) == null)) {
            lVar.a(new e(dVar));
        }
        this.f27992o = null;
    }

    private final void m2(l lVar, B.i iVar) {
        C5559b0 b0Var;
        if (S1()) {
            C5600w0 w0Var = (C5600w0) L1().getCoroutineContext().b(C5600w0.f65416O);
            if (w0Var != null) {
                b0Var = w0Var.P0(new b(lVar, iVar));
            } else {
                b0Var = null;
            }
            C5600w0 unused = C5576k.d(L1(), (g) null, (M) null, new a(lVar, iVar, b0Var, (C6658d) null), 3, (Object) null);
            return;
        }
        lVar.a(iVar);
    }

    public boolean Q1() {
        return this.f27993p;
    }

    public final void n2(boolean z10) {
        l lVar = this.f27991n;
        if (lVar == null) {
            return;
        }
        if (z10) {
            d dVar = this.f27992o;
            if (dVar != null) {
                m2(lVar, new e(dVar));
                this.f27992o = null;
            }
            d dVar2 = new d();
            m2(lVar, dVar2);
            this.f27992o = dVar2;
            return;
        }
        d dVar3 = this.f27992o;
        if (dVar3 != null) {
            m2(lVar, new e(dVar3));
            this.f27992o = null;
        }
    }

    public final void o2(l lVar) {
        if (!C6496s.c(this.f27991n, lVar)) {
            l2();
            this.f27991n = lVar;
        }
    }
}
