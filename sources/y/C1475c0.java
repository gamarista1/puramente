package Y;

import Ug.C5582n;
import Ug.C5584o;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;

/* renamed from: Y.c0  reason: case insensitive filesystem */
public final class C1475c0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f9952a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List f9953b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List f9954c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f9955d = true;

    /* renamed from: Y.c0$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1475c0 f9956a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5582n f9957b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1475c0 c0Var, C5582n nVar) {
            super(1);
            this.f9956a = c0Var;
            this.f9957b = nVar;
        }

        public final void a(Throwable th2) {
            Object b10 = this.f9956a.f9952a;
            C1475c0 c0Var = this.f9956a;
            C5582n nVar = this.f9957b;
            synchronized (b10) {
                c0Var.f9953b.remove(nVar);
                C6514M m10 = C6514M.f71813a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C6514M.f71813a;
        }
    }

    public final Object c(C6658d dVar) {
        if (e()) {
            return C6514M.f71813a;
        }
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        synchronized (this.f9952a) {
            this.f9953b.add(oVar);
        }
        oVar.s(new a(this, oVar));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    public final void d() {
        synchronized (this.f9952a) {
            this.f9955d = false;
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f9952a) {
            z10 = this.f9955d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f9952a) {
            try {
                if (!e()) {
                    List list = this.f9953b;
                    this.f9953b = this.f9954c;
                    this.f9954c = list;
                    this.f9955d = true;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        v.a aVar = v.f71841b;
                        ((C6658d) list.get(i10)).resumeWith(v.b(C6514M.f71813a));
                    }
                    list.clear();
                    C6514M m10 = C6514M.f71813a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
