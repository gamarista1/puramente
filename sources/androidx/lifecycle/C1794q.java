package androidx.lifecycle;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Ug.Z;
import androidx.lifecycle.C1790m;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.p;

/* renamed from: androidx.lifecycle.q  reason: case insensitive filesystem */
public final class C1794q extends C1793p implements C1795s {

    /* renamed from: a  reason: collision with root package name */
    private final C1790m f17256a;

    /* renamed from: b  reason: collision with root package name */
    private final g f17257b;

    /* renamed from: androidx.lifecycle.q$a */
    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f17258a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f17259b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C1794q f17260c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1794q qVar, C6658d dVar) {
            super(2, dVar);
            this.f17260c = qVar;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f17260c, dVar);
            aVar.f17259b = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f17258a == 0) {
                w.b(obj);
                K k10 = (K) this.f17259b;
                if (this.f17260c.a().b().compareTo(C1790m.b.INITIALIZED) >= 0) {
                    this.f17260c.a().a(this.f17260c);
                } else {
                    C0.f(k10.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                }
                return C6514M.f71813a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C1794q(C1790m mVar, g gVar) {
        C6496s.h(mVar, "lifecycle");
        C6496s.h(gVar, "coroutineContext");
        this.f17256a = mVar;
        this.f17257b = gVar;
        if (a().b() == C1790m.b.DESTROYED) {
            C0.f(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public C1790m a() {
        return this.f17256a;
    }

    public final void c() {
        C5600w0 unused = C5576k.d(this, Z.c().D1(), (M) null, new a(this, (C6658d) null), 2, (Object) null);
    }

    public void f(C1798v vVar, C1790m.a aVar) {
        C6496s.h(vVar, "source");
        C6496s.h(aVar, "event");
        if (a().b().compareTo(C1790m.b.DESTROYED) <= 0) {
            a().d(this);
            C0.f(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public g getCoroutineContext() {
        return this.f17257b;
    }
}
