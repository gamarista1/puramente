package L1;

import I1.f;
import Xg.C5694f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final f f4128a;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4129a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f4130b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f4131c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C6658d dVar) {
            super(2, dVar);
            this.f4131c = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f4131c, dVar);
            aVar.f4130b = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(d dVar, C6658d dVar2) {
            return ((a) create(dVar, dVar2)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4129a;
            if (i10 == 0) {
                w.b(obj);
                p pVar = this.f4131c;
                this.f4129a = 1;
                obj = pVar.invoke((d) this.f4130b, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d dVar = (d) obj;
            ((a) dVar).f();
            return dVar;
        }
    }

    public b(f fVar) {
        C6496s.h(fVar, "delegate");
        this.f4128a = fVar;
    }

    public Object a(p pVar, C6658d dVar) {
        return this.f4128a.a(new a(pVar, (C6658d) null), dVar);
    }

    public C5694f getData() {
        return this.f4128a.getData();
    }
}
