package Yg;

import Ug.K;
import Xg.C5694f;
import Xg.C5695g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;
import yf.q;

public abstract class o {

    public static final class a implements C5694f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f66842a;

        public a(q qVar) {
            this.f66842a = qVar;
        }

        public Object collect(C5695g gVar, C6658d dVar) {
            Object a10 = o.a(new b(this.f66842a, gVar, (C6658d) null), dVar);
            if (a10 == C6680b.f()) {
                return a10;
            }
            return C6514M.f71813a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f66843a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f66844b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q f66845c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5695g f66846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q qVar, C5695g gVar, C6658d dVar) {
            super(2, dVar);
            this.f66845c = qVar;
            this.f66846d = gVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f66845c, this.f66846d, dVar);
            bVar.f66844b = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f66843a;
            if (i10 == 0) {
                w.b(obj);
                q qVar = this.f66845c;
                C5695g gVar = this.f66846d;
                this.f66843a = 1;
                if (qVar.invoke((K) this.f66844b, gVar, this) == f10) {
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

    public static final Object a(p pVar, C6658d dVar) {
        n nVar = new n(dVar.getContext(), dVar);
        Object b10 = ah.b.b(nVar, nVar, pVar);
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }

    public static final C5694f b(q qVar) {
        return new a(qVar);
    }
}
