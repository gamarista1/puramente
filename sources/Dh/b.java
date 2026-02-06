package dh;

import Ug.C5582n;
import Ug.C5584o;
import Ug.C5588q;
import Ug.G;
import Ug.O;
import Ug.i1;
import Zg.D;
import ch.C5811j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.q;

public class b extends e implements C5817a {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67410i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner$volatile");

    /* renamed from: h  reason: collision with root package name */
    private final q f67411h;
    private volatile /* synthetic */ Object owner$volatile;

    private final class a implements C5582n, i1 {

        /* renamed from: a  reason: collision with root package name */
        public final C5584o f67412a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f67413b;

        /* renamed from: dh.b$a$a  reason: collision with other inner class name */
        static final class C0989a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f67415a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f67416b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0989a(b bVar, a aVar) {
                super(1);
                this.f67415a = bVar;
                this.f67416b = aVar;
            }

            public final void a(Throwable th2) {
                this.f67415a.e(this.f67416b.f67413b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* renamed from: dh.b$a$b  reason: collision with other inner class name */
        static final class C0990b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f67417a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f67418b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0990b(b bVar, a aVar) {
                super(1);
                this.f67417a = bVar;
                this.f67418b = aVar;
            }

            public final void a(Throwable th2) {
                b.f67410i.set(this.f67417a, this.f67418b.f67413b);
                this.f67417a.e(this.f67418b.f67413b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        public a(C5584o oVar, Object obj) {
            this.f67412a = oVar;
            this.f67413b = obj;
        }

        public boolean B(Throwable th2) {
            return this.f67412a.B(th2);
        }

        public void L(Object obj) {
            this.f67412a.L(obj);
        }

        public boolean a() {
            return this.f67412a.a();
        }

        /* renamed from: b */
        public void x(C6514M m10, C6798l lVar) {
            b.f67410i.set(b.this, this.f67413b);
            this.f67412a.x(m10, new C0989a(b.this, this));
        }

        public void c(D d10, int i10) {
            this.f67412a.c(d10, i10);
        }

        /* renamed from: d */
        public void G(G g10, C6514M m10) {
            this.f67412a.G(g10, m10);
        }

        /* renamed from: e */
        public Object D(C6514M m10, Object obj, C6798l lVar) {
            Object D10 = this.f67412a.D(m10, obj, new C0990b(b.this, this));
            if (D10 != null) {
                b.f67410i.set(b.this, this.f67413b);
            }
            return D10;
        }

        public g getContext() {
            return this.f67412a.getContext();
        }

        public boolean isCancelled() {
            return this.f67412a.isCancelled();
        }

        public boolean o() {
            return this.f67412a.o();
        }

        public void resumeWith(Object obj) {
            this.f67412a.resumeWith(obj);
        }

        public void s(C6798l lVar) {
            this.f67412a.s(lVar);
        }

        public Object u(Throwable th2) {
            return this.f67412a.u(th2);
        }
    }

    /* renamed from: dh.b$b  reason: collision with other inner class name */
    static final class C0991b extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f67419a;

        /* renamed from: dh.b$b$a */
        static final class a extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f67420a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f67421b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f67420a = bVar;
                this.f67421b = obj;
            }

            public final void a(Throwable th2) {
                this.f67420a.e(this.f67421b);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return C6514M.f71813a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0991b(b bVar) {
            super(3);
            this.f67419a = bVar;
        }

        /* renamed from: a */
        public final C6798l invoke(C5811j jVar, Object obj, Object obj2) {
            return new a(this.f67419a, obj);
        }
    }

    public b(boolean z10) {
        super(1, z10 ? 1 : 0);
        Zg.G g10;
        if (z10) {
            g10 = null;
        } else {
            g10 = c.f67422a;
        }
        this.owner$volatile = g10;
        this.f67411h = new C0991b(this);
    }

    private final int A(Object obj) {
        while (!s()) {
            if (obj == null) {
                return 1;
            }
            int x10 = x(obj);
            if (x10 == 1) {
                return 2;
            }
            if (x10 == 2) {
                return 1;
            }
        }
        f67410i.set(this, obj);
        return 0;
    }

    private final int x(Object obj) {
        while (d()) {
            Object obj2 = f67410i.get(this);
            if (obj2 != c.f67422a) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    static /* synthetic */ Object y(b bVar, Object obj, C6658d dVar) {
        if (bVar.c(obj)) {
            return C6514M.f71813a;
        }
        Object z10 = bVar.z(obj, dVar);
        if (z10 == C6680b.f()) {
            return z10;
        }
        return C6514M.f71813a;
    }

    private final Object z(Object obj, C6658d dVar) {
        C5584o b10 = C5588q.b(C6680b.c(dVar));
        try {
            g(new a(b10, obj));
            Object v10 = b10.v();
            if (v10 == C6680b.f()) {
                h.c(dVar);
            }
            if (v10 == C6680b.f()) {
                return v10;
            }
            return C6514M.f71813a;
        } catch (Throwable th2) {
            b10.O();
            throw th2;
        }
    }

    public Object a(Object obj, C6658d dVar) {
        return y(this, obj, dVar);
    }

    public boolean c(Object obj) {
        int A10 = A(obj);
        if (A10 == 0) {
            return true;
        }
        if (A10 == 1) {
            return false;
        }
        if (A10 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public boolean d() {
        if (m() == 0) {
            return true;
        }
        return false;
    }

    public void e(Object obj) {
        while (d()) {
            Object obj2 = f67410i.get(this);
            if (obj2 != c.f67422a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (androidx.concurrent.futures.b.a(f67410i, this, obj2, c.f67422a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + O.b(this) + "[isLocked=" + d() + ",owner=" + f67410i.get(this) + ']';
    }
}
