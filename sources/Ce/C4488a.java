package ce;

import Ug.C5582n;
import Ug.C5584o;
import Ug.C5585o0;
import Ug.C5600w0;
import Ug.K;
import Ug.M;
import android.content.Intent;
import be.C4475a;
import be.d;
import be.e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import lf.w;
import me.a;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: ce.a  reason: case insensitive filesystem */
public final class C4488a implements C4475a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b f53743a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f53744b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    private final d f53745c = new d();

    /* renamed from: ce.a$a  reason: collision with other inner class name */
    static final class C0816a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f53746a;

        /* renamed from: b  reason: collision with root package name */
        Object f53747b;

        /* renamed from: c  reason: collision with root package name */
        int f53748c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4488a f53749d;

        /* renamed from: ce.a$a$a  reason: collision with other inner class name */
        public static final class C0817a implements e {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5582n f53750a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4475a f53751b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4488a f53752c;

            public C0817a(C5582n nVar, C4475a aVar, C4488a aVar2) {
                this.f53750a = nVar;
                this.f53751b = aVar;
                this.f53752c = aVar2;
            }

            public void a(androidx.appcompat.app.d dVar) {
                Object obj;
                C6496s.h(dVar, "activity");
                if (this.f53750a.a()) {
                    this.f53751b.b(this);
                    C5582n nVar = this.f53750a;
                    try {
                        v.a aVar = v.f71841b;
                        this.f53752c.f53743a.d(dVar);
                        obj = v.b(C6514M.f71813a);
                    } catch (Throwable th2) {
                        v.a aVar2 = v.f71841b;
                        obj = v.b(w.a(th2));
                    }
                    nVar.resumeWith(obj);
                }
            }
        }

        /* renamed from: ce.a$a$b */
        public static final class b implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4475a f53753a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C0817a f53754b;

            public b(C4475a aVar, C0817a aVar2) {
                this.f53753a = aVar;
                this.f53754b = aVar2;
            }

            public final void a(Throwable th2) {
                this.f53753a.b(this.f53754b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0816a(C4488a aVar, C6658d dVar) {
            super(2, dVar);
            this.f53749d = aVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0816a(this.f53749d, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0816a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f53748c;
            if (i10 == 0) {
                w.b(obj);
                C4488a aVar = this.f53749d;
                this.f53746a = aVar;
                this.f53747b = aVar;
                this.f53748c = 1;
                C5584o oVar = new C5584o(C6680b.c(this), 1);
                oVar.E();
                C0817a aVar2 = new C0817a(oVar, aVar, aVar);
                aVar.a(aVar2);
                oVar.s(new b(aVar, aVar2));
                Object v10 = oVar.v();
                if (v10 == C6680b.f()) {
                    h.c(this);
                }
                if (v10 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C4488a aVar3 = (C4488a) this.f53747b;
                C4475a aVar4 = (C4475a) this.f53746a;
                w.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C6514M.f71813a;
        }
    }

    public C4488a(a aVar) {
        C6496s.h(aVar, "currentActivityProvider");
        this.f53743a = new b(aVar);
        C5600w0 unused = C5576k.d(C5585o0.f65402a, (g) null, (M) null, new C0816a(this, (C6658d) null), 3, (Object) null);
    }

    public void a(e eVar) {
        C6496s.h(eVar, "listener");
        this.f53745c.a(eVar);
    }

    public void b(e eVar) {
        C6496s.h(eVar, "listener");
        this.f53745c.b(eVar);
    }

    public final void d(int i10, int i11, Intent intent) {
        this.f53743a.a(i10, i11, intent);
    }

    public final void e(androidx.appcompat.app.d dVar) {
        C6496s.h(dVar, "activity");
        this.f53743a.c(dVar);
    }

    public final void f(androidx.appcompat.app.d dVar) {
        C6496s.h(dVar, "activity");
        this.f53745c.f(dVar);
    }
}
