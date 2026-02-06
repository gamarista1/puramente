package N3;

import M3.b;
import O3.h;
import P3.u;
import Wg.r;
import Xg.C5694f;
import Xg.C5696h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6787a;
import yf.p;

public abstract class c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final h f4437a;

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f4438a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f4439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f4440c;

        /* renamed from: N3.c$a$a  reason: collision with other inner class name */
        static final class C0111a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f4441a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f4442b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0111a(c cVar, b bVar) {
                super(0);
                this.f4441a = cVar;
                this.f4442b = bVar;
            }

            public final void invoke() {
                this.f4441a.f4437a.f(this.f4442b);
            }
        }

        public static final class b implements M3.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f4443a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ r f4444b;

            b(c cVar, r rVar) {
                this.f4443a = cVar;
                this.f4444b = rVar;
            }

            public void a(Object obj) {
                Object obj2;
                if (this.f4443a.e(obj)) {
                    obj2 = new b.C0106b(this.f4443a.b());
                } else {
                    obj2 = b.a.f4313a;
                }
                this.f4444b.t().c(obj2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C6658d dVar) {
            super(2, dVar);
            this.f4440c = cVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f4440c, dVar);
            aVar.f4439b = obj;
            return aVar;
        }

        public final Object invoke(r rVar, C6658d dVar) {
            return ((a) create(rVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f4438a;
            if (i10 == 0) {
                w.b(obj);
                r rVar = (r) this.f4439b;
                b bVar = new b(this.f4440c, rVar);
                this.f4440c.f4437a.c(bVar);
                C0111a aVar = new C0111a(this.f4440c, bVar);
                this.f4438a = 1;
                if (Wg.p.a(rVar, aVar, this) == f10) {
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

    public c(h hVar) {
        C6496s.h(hVar, "tracker");
        this.f4437a = hVar;
    }

    public abstract int b();

    public abstract boolean c(u uVar);

    public final boolean d(u uVar) {
        C6496s.h(uVar, "workSpec");
        if (!c(uVar) || !e(this.f4437a.e())) {
            return false;
        }
        return true;
    }

    public abstract boolean e(Object obj);

    public final C5694f f() {
        return C5696h.e(new a(this, (C6658d) null));
    }
}
