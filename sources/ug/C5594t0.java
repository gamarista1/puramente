package Ug;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.C6787a;
import yf.p;

/* renamed from: Ug.t0  reason: case insensitive filesystem */
public abstract class C5594t0 {

    /* renamed from: Ug.t0$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f65409a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f65410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6787a f65411c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6787a aVar, C6658d dVar) {
            super(2, dVar);
            this.f65411c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f65411c, dVar);
            aVar.f65410b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f65409a == 0) {
                w.b(obj);
                return C5594t0.d(((K) this.f65410b).getCoroutineContext(), this.f65411c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final Object b(g gVar, C6787a aVar, C6658d dVar) {
        return C5572i.g(gVar, new a(aVar, (C6658d) null), dVar);
    }

    public static /* synthetic */ Object c(g gVar, C6787a aVar, C6658d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f72645a;
        }
        return b(gVar, aVar, dVar);
    }

    /* access modifiers changed from: private */
    public static final Object d(g gVar, C6787a aVar) {
        b1 b1Var;
        try {
            b1Var = new b1(A0.n(gVar));
            b1Var.e();
            Object invoke = aVar.invoke();
            b1Var.a();
            return invoke;
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        } catch (Throwable th2) {
            b1Var.a();
            throw th2;
        }
    }
}
