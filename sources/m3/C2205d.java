package m3;

import Ug.C5600w0;
import Wg.u;
import Xg.C5694f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

/* renamed from: m3.d  reason: case insensitive filesystem */
public abstract class C2205d {

    /* renamed from: m3.d$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f23991a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23992b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5600w0 f23993c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f23994d;

        /* renamed from: m3.d$a$a  reason: collision with other inner class name */
        static final class C0397a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ T f23995a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0397a(T t10) {
                super(1);
                this.f23995a = t10;
            }

            public final void a(Throwable th2) {
                u.a.a(this.f23995a, (Throwable) null, 1, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5600w0 w0Var, p pVar, C6658d dVar) {
            super(2, dVar);
            this.f23993c = w0Var;
            this.f23994d = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f23993c, this.f23994d, dVar);
            aVar.f23992b = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(T t10, C6658d dVar) {
            return ((a) create(t10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f23991a;
            if (i10 == 0) {
                w.b(obj);
                T t10 = (T) this.f23992b;
                this.f23993c.P0(new C0397a(t10));
                p pVar = this.f23994d;
                this.f23991a = 1;
                if (pVar.invoke(t10, this) == f10) {
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

    public static final C5694f a(C5600w0 w0Var, p pVar) {
        C6496s.h(w0Var, "controller");
        C6496s.h(pVar, "block");
        return S.a(new a(w0Var, pVar, (C6658d) null));
    }
}
