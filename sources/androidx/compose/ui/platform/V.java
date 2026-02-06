package androidx.compose.ui.platform;

import Ug.C5582n;
import Ug.C5584o;
import Y.C1490h0;
import android.view.Choreographer;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.e;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

public final class V implements C1490h0 {

    /* renamed from: a  reason: collision with root package name */
    private final Choreographer f13674a;

    /* renamed from: b  reason: collision with root package name */
    private final T f13675b;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f13676a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f13677b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(T t10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f13676a = t10;
            this.f13677b = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f13676a.R1(this.f13677b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ V f13678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f13679b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(V v10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f13678a = v10;
            this.f13679b = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f13678a.c().removeFrameCallback(this.f13679b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5582n f13680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ V f13681b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f13682c;

        c(C5582n nVar, V v10, C6798l lVar) {
            this.f13680a = nVar;
            this.f13681b = v10;
            this.f13682c = lVar;
        }

        public final void doFrame(long j10) {
            Object obj;
            C5582n nVar = this.f13680a;
            C6798l lVar = this.f13682c;
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

    public V(Choreographer choreographer, T t10) {
        this.f13674a = choreographer;
        this.f13675b = t10;
    }

    public Object L0(C6798l lVar, C6658d dVar) {
        T t10 = this.f13675b;
        if (t10 == null) {
            g.b b10 = dVar.getContext().b(e.f72642c0);
            if (b10 instanceof T) {
                t10 = (T) b10;
            } else {
                t10 = null;
            }
        }
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        c cVar = new c(oVar, this, lVar);
        if (t10 == null || !C6496s.c(t10.L1(), c())) {
            c().postFrameCallback(cVar);
            oVar.s(new b(this, cVar));
        } else {
            t10.Q1(cVar);
            oVar.s(new a(t10, cVar));
        }
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

    public final Choreographer c() {
        return this.f13674a;
    }

    public Object f0(Object obj, p pVar) {
        return C1490h0.a.a(this, obj, pVar);
    }

    public g n1(g gVar) {
        return C1490h0.a.d(this, gVar);
    }
}
