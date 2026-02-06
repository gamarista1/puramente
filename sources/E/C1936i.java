package e;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Wg.d;
import Wg.g;
import Wg.u;
import Xg.C5694f;
import Xg.C5695g;
import Xg.C5696h;
import androidx.activity.C1546b;
import androidx.activity.G;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.J;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;
import yf.q;

/* renamed from: e.i  reason: case insensitive filesystem */
final class C1936i {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19499a;

    /* renamed from: b  reason: collision with root package name */
    private final d f19500b = g.b(-2, Wg.a.SUSPEND, (C6798l) null, 4, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C5600w0 f19501c;

    /* renamed from: e.i$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f19502a;

        /* renamed from: b  reason: collision with root package name */
        int f19503b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ G f19504c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f19505d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1936i f19506e;

        /* renamed from: e.i$a$a  reason: collision with other inner class name */
        static final class C0341a extends l implements q {

            /* renamed from: a  reason: collision with root package name */
            int f19507a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ J f19508b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0341a(J j10, C6658d dVar) {
                super(3, dVar);
                this.f19508b = j10;
            }

            /* renamed from: i */
            public final Object invoke(C5695g gVar, Throwable th2, C6658d dVar) {
                return new C0341a(this.f19508b, dVar).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                C6680b.f();
                if (this.f19507a == 0) {
                    w.b(obj);
                    this.f19508b.f71755a = true;
                    return C6514M.f71813a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(G g10, p pVar, C1936i iVar, C6658d dVar) {
            super(2, dVar);
            this.f19504c = g10;
            this.f19505d = pVar;
            this.f19506e = iVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new a(this.f19504c, this.f19505d, this.f19506e, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            J j10;
            Object f10 = C6680b.f();
            int i10 = this.f19503b;
            if (i10 == 0) {
                w.b(obj);
                if (this.f19504c.g()) {
                    J j11 = new J();
                    p pVar = this.f19505d;
                    C5694f F10 = C5696h.F(C5696h.k(this.f19506e.c()), new C0341a(j11, (C6658d) null));
                    this.f19502a = j11;
                    this.f19503b = 1;
                    if (pVar.invoke(F10, this) == f10) {
                        return f10;
                    }
                    j10 = j11;
                }
                return C6514M.f71813a;
            } else if (i10 == 1) {
                j10 = (J) this.f19502a;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!j10.f71755a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return C6514M.f71813a;
        }
    }

    public C1936i(K k10, boolean z10, p pVar, G g10) {
        this.f19499a = z10;
        this.f19501c = C5576k.d(k10, (qf.g) null, (M) null, new a(g10, pVar, this, (C6658d) null), 3, (Object) null);
    }

    public final void a() {
        this.f19500b.n(new CancellationException("onBack cancelled"));
        C5600w0.a.a(this.f19501c, (CancellationException) null, 1, (Object) null);
    }

    public final boolean b() {
        return u.a.a(this.f19500b, (Throwable) null, 1, (Object) null);
    }

    public final d c() {
        return this.f19500b;
    }

    public final boolean d() {
        return this.f19499a;
    }

    public final Object e(C1546b bVar) {
        return this.f19500b.c(bVar);
    }

    public final void f(boolean z10) {
        this.f19499a = z10;
    }
}
