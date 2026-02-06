package Y;

import Ug.C5572i;
import Ug.K;
import Ug.V;
import Ug.Z;
import Y.C1490h0;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

final class Z0 implements C1490h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z0 f9920a = new Z0();

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f9921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f9922b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6798l lVar, C6658d dVar) {
            super(2, dVar);
            this.f9922b = lVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f9922b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f9921a;
            if (i10 == 0) {
                w.b(obj);
                this.f9921a = 1;
                if (V.a(16, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f9922b.invoke(b.d(System.nanoTime()));
        }
    }

    private Z0() {
    }

    public Object L0(C6798l lVar, C6658d dVar) {
        return C5572i.g(Z.c(), new a(lVar, (C6658d) null), dVar);
    }

    public g R0(g.c cVar) {
        return C1490h0.a.c(this, cVar);
    }

    public g.b b(g.c cVar) {
        return C1490h0.a.b(this, cVar);
    }

    public Object f0(Object obj, p pVar) {
        return C1490h0.a.a(this, obj, pVar);
    }

    public g n1(g gVar) {
        return C1490h0.a.d(this, gVar);
    }
}
