package androidx.lifecycle;

import Ug.C5572i;
import Ug.C5600w0;
import Ug.K;
import Ug.Z;
import androidx.lifecycle.C1790m;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class H {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f17101a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f17102b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1790m f17103c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C1790m.b f17104d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p f17105e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1790m mVar, C1790m.b bVar, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f17103c = mVar;
            this.f17104d = bVar;
            this.f17105e = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f17103c, this.f17104d, this.f17105e, dVar);
            aVar.f17102b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C1792o oVar;
            Object f10 = C6680b.f();
            int i10 = this.f17101a;
            if (i10 == 0) {
                w.b(obj);
                C5600w0 w0Var = (C5600w0) ((K) this.f17102b).getCoroutineContext().b(C5600w0.f65416O);
                if (w0Var != null) {
                    G g10 = new G();
                    C1792o oVar2 = new C1792o(this.f17103c, this.f17104d, g10.f17100c, w0Var);
                    try {
                        p pVar = this.f17105e;
                        this.f17102b = oVar2;
                        this.f17101a = 1;
                        obj = C5572i.g(g10, pVar, this);
                        if (obj == f10) {
                            return f10;
                        }
                        oVar = oVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        oVar = oVar2;
                        oVar.b();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job");
                }
            } else if (i10 == 1) {
                oVar = (C1792o) this.f17102b;
                try {
                    w.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar.b();
            return obj;
        }
    }

    public static final Object a(C1790m mVar, p pVar, C6658d dVar) {
        return b(mVar, C1790m.b.STARTED, pVar, dVar);
    }

    public static final Object b(C1790m mVar, C1790m.b bVar, p pVar, C6658d dVar) {
        return C5572i.g(Z.c().D1(), new a(mVar, bVar, pVar, (C6658d) null), dVar);
    }
}
