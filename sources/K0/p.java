package k0;

import Ug.A0;
import Ug.C5600w0;
import Ug.K;
import Ug.L;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import w.C2780Y;
import yf.C6798l;

public abstract class p {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C5600w0 f23145a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f23146b;

        public a(C5600w0 w0Var, Object obj) {
            this.f23145a = w0Var;
            this.f23146b = obj;
        }

        public final C5600w0 a() {
            return this.f23145a;
        }

        public final Object b() {
            return this.f23146b;
        }
    }

    static final class b extends l implements yf.p {

        /* renamed from: a  reason: collision with root package name */
        int f23147a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f23148b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f23149c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AtomicReference f23150d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ yf.p f23151e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6798l lVar, AtomicReference atomicReference, yf.p pVar, C6658d dVar) {
            super(2, dVar);
            this.f23149c = lVar;
            this.f23150d = atomicReference;
            this.f23151e = pVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            b bVar = new b(this.f23149c, this.f23150d, this.f23151e, dVar);
            bVar.f23148b = obj;
            return bVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            a aVar;
            a aVar2;
            C5600w0 a10;
            Object f10 = C6680b.f();
            int i10 = this.f23147a;
            if (i10 == 0) {
                w.b(obj);
                K k10 = (K) this.f23148b;
                aVar2 = new a(A0.n(k10.getCoroutineContext()), this.f23149c.invoke(k10));
                a aVar3 = (a) this.f23150d.getAndSet(aVar2);
                if (!(aVar3 == null || (a10 = aVar3.a()) == null)) {
                    this.f23148b = aVar2;
                    this.f23147a = 1;
                    if (A0.g(a10, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                aVar2 = (a) this.f23148b;
                w.b(obj);
            } else if (i10 == 2) {
                aVar = (a) this.f23148b;
                try {
                    w.b(obj);
                    C2780Y.a(this.f23150d, aVar, (Object) null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                yf.p pVar = this.f23151e;
                Object b10 = aVar2.b();
                this.f23148b = aVar2;
                this.f23147a = 2;
                obj = pVar.invoke(b10, this);
                if (obj == f10) {
                    return f10;
                }
                aVar = aVar2;
                C2780Y.a(this.f23150d, aVar, (Object) null);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                aVar = aVar2;
                C2780Y.a(this.f23150d, aVar, (Object) null);
                throw th;
            }
        }
    }

    public static AtomicReference a() {
        return b(new AtomicReference((Object) null));
    }

    public static final Object c(AtomicReference atomicReference) {
        a aVar = (a) atomicReference.get();
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public static final Object d(AtomicReference atomicReference, C6798l lVar, yf.p pVar, C6658d dVar) {
        return L.e(new b(lVar, atomicReference, pVar, (C6658d) null), dVar);
    }

    private static AtomicReference b(AtomicReference atomicReference) {
        return atomicReference;
    }
}
