package L1;

import I1.f;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class g {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4135a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f4136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f4137c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C6658d dVar) {
            super(2, dVar);
            this.f4137c = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f4137c, dVar);
            aVar.f4136b = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(d dVar, C6658d dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4135a;
            if (i10 == 0) {
                w.b(obj);
                a c10 = ((d) this.f4136b).c();
                p pVar = this.f4137c;
                this.f4136b = c10;
                this.f4135a = 1;
                if (pVar.invoke(c10, this) == f10) {
                    return f10;
                }
                return c10;
            } else if (i10 == 1) {
                a aVar = (a) this.f4136b;
                w.b(obj);
                return aVar;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final Object a(f fVar, p pVar, C6658d dVar) {
        return fVar.a(new a(pVar, (C6658d) null), dVar);
    }
}
