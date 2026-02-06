package Yg;

import Ug.F;
import Wg.r;
import Xg.C5694f;
import Xg.C5695g;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.e;
import rf.C6680b;
import yf.p;

public abstract class g extends e {

    /* renamed from: d  reason: collision with root package name */
    protected final C5694f f66793d;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66794a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f66795b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f66796c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C6658d dVar) {
            super(2, dVar);
            this.f66796c = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f66796c, dVar);
            aVar.f66795b = obj;
            return aVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((a) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66794a;
            if (i10 == 0) {
                w.b(obj);
                g gVar = this.f66796c;
                this.f66794a = 1;
                if (gVar.r((C5695g) this.f66795b, this) == f10) {
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

    public g(C5694f fVar, qf.g gVar, int i10, Wg.a aVar) {
        super(gVar, i10, aVar);
        this.f66793d = fVar;
    }

    static /* synthetic */ Object o(g gVar, C5695g gVar2, C6658d dVar) {
        if (gVar.f66784b == -3) {
            qf.g context = dVar.getContext();
            qf.g e10 = F.e(context, gVar.f66783a);
            if (C6496s.c(e10, context)) {
                Object r10 = gVar.r(gVar2, dVar);
                if (r10 == C6680b.f()) {
                    return r10;
                }
                return C6514M.f71813a;
            }
            e.b bVar = e.f72642c0;
            if (C6496s.c(e10.b(bVar), context.b(bVar))) {
                Object q10 = gVar.q(gVar2, e10, dVar);
                if (q10 == C6680b.f()) {
                    return q10;
                }
                return C6514M.f71813a;
            }
        }
        Object collect = super.collect(gVar2, dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }

    static /* synthetic */ Object p(g gVar, r rVar, C6658d dVar) {
        Object r10 = gVar.r(new x(rVar), dVar);
        if (r10 == C6680b.f()) {
            return r10;
        }
        return C6514M.f71813a;
    }

    private final Object q(C5695g gVar, qf.g gVar2, C6658d dVar) {
        return f.c(gVar2, f.d(gVar, dVar.getContext()), (Object) null, new a(this, (C6658d) null), dVar, 4, (Object) null);
    }

    public Object collect(C5695g gVar, C6658d dVar) {
        return o(this, gVar, dVar);
    }

    /* access modifiers changed from: protected */
    public Object i(r rVar, C6658d dVar) {
        return p(this, rVar, dVar);
    }

    /* access modifiers changed from: protected */
    public abstract Object r(C5695g gVar, C6658d dVar);

    public String toString() {
        return this.f66793d + " -> " + super.toString();
    }
}
