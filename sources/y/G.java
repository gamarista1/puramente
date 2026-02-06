package Y;

import Ug.C5572i;
import Ug.C5582n;
import Ug.C5584o;
import Ug.K;
import Ug.Z;
import Y.C1490h0;
import android.view.Choreographer;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

final class G implements C1490h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final G f9761a = new G();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Choreographer f9762b = ((Choreographer) C5572i.e(Z.c().D1(), new a((C6658d) null)));

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f9763a;

        a(C6658d dVar) {
            super(2, dVar);
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f9763a == 0) {
                w.b(obj);
                return Choreographer.getInstance();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f9764a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f9764a = frameCallback;
        }

        public final void a(Throwable th2) {
            G.f9762b.removeFrameCallback(this.f9764a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f9765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C6798l f9766b;

        c(C5582n nVar, C6798l lVar) {
            this.f9765a = nVar;
            this.f9766b = lVar;
        }

        public final void doFrame(long j10) {
            Object obj;
            C5582n nVar = this.f9765a;
            G g10 = G.f9761a;
            C6798l lVar = this.f9766b;
            try {
                v.a aVar = v.f71841b;
                obj = v.b(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                v.a aVar2 = v.f71841b;
                obj = v.b(w.a(th2));
            }
            nVar.resumeWith(obj);
        }
    }

    private G() {
    }

    public Object L0(C6798l lVar, C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        c cVar = new c(oVar, lVar);
        f9762b.postFrameCallback(cVar);
        oVar.s(new b(cVar));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        return v10;
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
