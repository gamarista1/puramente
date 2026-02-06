package n3;

import Xg.B;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import Y.C1510r0;
import Y.o1;
import androidx.compose.ui.platform.T;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import m3.C2201F;
import m3.C2208g;
import m3.C2218q;
import m3.C2219s;
import m3.G;
import m3.H;
import mf.C6565s;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

/* renamed from: n3.a  reason: case insensitive filesystem */
public final class C2331a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f24669f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C5694f f24670a;

    /* renamed from: b  reason: collision with root package name */
    private final g f24671b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final c f24672c;

    /* renamed from: d  reason: collision with root package name */
    private final C1510r0 f24673d;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f24674e;

    /* renamed from: n3.a$a  reason: collision with other inner class name */
    static final class C0416a implements C5695g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C2331a f24675a;

        C0416a(C2331a aVar) {
            this.f24675a = aVar;
        }

        /* renamed from: a */
        public final Object emit(C2208g gVar, C6658d dVar) {
            this.f24675a.m(gVar);
            return C6514M.f71813a;
        }
    }

    /* renamed from: n3.a$b */
    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f24676a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f24677b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C2331a f24678c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C2331a aVar, C6658d dVar) {
            super(2, dVar);
            this.f24678c = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f24678c, dVar);
            bVar.f24677b = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C2201F f10, C6658d dVar) {
            return ((b) create(f10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f24676a;
            if (i10 == 0) {
                w.b(obj);
                c a10 = this.f24678c.f24672c;
                this.f24676a = 1;
                if (a10.n((C2201F) this.f24677b, this) == f10) {
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

    /* renamed from: n3.a$c */
    public static final class c extends H {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C2331a f24679m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C2331a aVar, g gVar, C2201F f10) {
            super(gVar, f10);
            this.f24679m = aVar;
        }

        public Object r(G g10, C6658d dVar) {
            this.f24679m.n();
            return C6514M.f71813a;
        }
    }

    public C2331a(C5694f fVar) {
        C2201F f10;
        C6496s.h(fVar, "flow");
        this.f24670a = fVar;
        g b10 = T.f13656m.b();
        this.f24671b = b10;
        if (fVar instanceof B) {
            f10 = (C2201F) C6565s.q0(((B) fVar).d());
        } else {
            f10 = null;
        }
        c cVar = new c(this, b10, f10);
        this.f24672c = cVar;
        this.f24673d = u1.d(cVar.v(), (o1) null, 2, (Object) null);
        C2208g gVar = (C2208g) cVar.p().getValue();
        this.f24674e = u1.d(gVar == null ? new C2208g(C2332b.f24681b.f(), C2332b.f24681b.e(), C2332b.f24681b.d(), C2332b.f24681b, (C2219s) null, 16, (DefaultConstructorMarker) null) : gVar, (o1) null, 2, (Object) null);
    }

    private final void l(C2218q qVar) {
        this.f24673d.setValue(qVar);
    }

    /* access modifiers changed from: private */
    public final void m(C2208g gVar) {
        this.f24674e.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void n() {
        l(this.f24672c.v());
    }

    public final Object d(C6658d dVar) {
        Object collect = C5696h.t(this.f24672c.p()).collect(new C0416a(this), dVar);
        if (collect == C6680b.f()) {
            return collect;
        }
        return C6514M.f71813a;
    }

    public final Object e(C6658d dVar) {
        Object i10 = C5696h.i(this.f24670a, new b(this, (C6658d) null), dVar);
        if (i10 == C6680b.f()) {
            return i10;
        }
        return C6514M.f71813a;
    }

    public final Object f(int i10) {
        this.f24672c.o(i10);
        return h().get(i10);
    }

    public final int g() {
        return h().size();
    }

    public final C2218q h() {
        return (C2218q) this.f24673d.getValue();
    }

    public final C2208g i() {
        return (C2208g) this.f24674e.getValue();
    }

    public final void j() {
        this.f24672c.s();
    }

    public final void k() {
        this.f24672c.t();
    }
}
