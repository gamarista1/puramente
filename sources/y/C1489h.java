package Y;

import Ug.C5584o;
import Y.C1490h0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: Y.h  reason: case insensitive filesystem */
public final class C1489h implements C1490h0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C6787a f10003a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f10004b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Throwable f10005c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List f10006d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List f10007e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C1486g f10008f = new C1486g(0);

    /* renamed from: Y.h$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C6798l f10009a;

        /* renamed from: b  reason: collision with root package name */
        private final C6658d f10010b;

        public a(C6798l lVar, C6658d dVar) {
            this.f10009a = lVar;
            this.f10010b = dVar;
        }

        public final C6658d a() {
            return this.f10010b;
        }

        public final void b(long j10) {
            Object obj;
            C6658d dVar = this.f10010b;
            try {
                v.a aVar = v.f71841b;
                obj = v.b(this.f10009a.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                v.a aVar2 = v.f71841b;
                obj = v.b(w.a(th2));
            }
            dVar.resumeWith(obj);
        }
    }

    /* renamed from: Y.h$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1489h f10011a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f10012b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1489h hVar, a aVar) {
            super(1);
            this.f10011a = hVar;
            this.f10012b = aVar;
        }

        public final void a(Throwable th2) {
            Object h10 = this.f10011a.f10004b;
            C1489h hVar = this.f10011a;
            a aVar = this.f10012b;
            synchronized (h10) {
                try {
                    hVar.f10006d.remove(aVar);
                    if (hVar.f10006d.isEmpty()) {
                        hVar.f10008f.set(0);
                    }
                    C6514M m10 = C6514M.f71813a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public C1489h(C6787a aVar) {
        this.f10003a = aVar;
    }

    /* access modifiers changed from: private */
    public final void j(Throwable th2) {
        synchronized (this.f10004b) {
            try {
                if (this.f10005c == null) {
                    this.f10005c = th2;
                    List list = this.f10006d;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        C6658d a10 = ((a) list.get(i10)).a();
                        v.a aVar = v.f71841b;
                        a10.resumeWith(v.b(w.a(th2)));
                    }
                    this.f10006d.clear();
                    this.f10008f.set(0);
                    C6514M m10 = C6514M.f71813a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public Object L0(C6798l lVar, C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        a aVar = new a(lVar, oVar);
        synchronized (this.f10004b) {
            Throwable e10 = this.f10005c;
            if (e10 != null) {
                v.a aVar2 = v.f71841b;
                oVar.resumeWith(v.b(w.a(e10)));
            } else {
                boolean isEmpty = this.f10006d.isEmpty();
                this.f10006d.add(aVar);
                if (isEmpty) {
                    this.f10008f.set(1);
                }
                oVar.s(new b(this, aVar));
                if (isEmpty && this.f10003a != null) {
                    try {
                        this.f10003a.invoke();
                    } catch (Throwable th2) {
                        j(th2);
                    }
                }
            }
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

    public Object f0(Object obj, p pVar) {
        return C1490h0.a.a(this, obj, pVar);
    }

    public final boolean k() {
        if (this.f10008f.get() != 0) {
            return true;
        }
        return false;
    }

    public final void l(long j10) {
        synchronized (this.f10004b) {
            try {
                List list = this.f10006d;
                this.f10006d = this.f10007e;
                this.f10007e = list;
                this.f10008f.set(0);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((a) list.get(i10)).b(j10);
                }
                list.clear();
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g n1(g gVar) {
        return C1490h0.a.d(this, gVar);
    }
}
