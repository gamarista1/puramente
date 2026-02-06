package Zg;

import Ug.C;
import Ug.C5567f0;
import Ug.C5582n;
import Ug.C5584o;
import Ug.E;
import Ug.G;
import Ug.O;
import Ug.W0;
import Ug.X;
import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import qf.C6658d;
import qf.g;
import yf.C6798l;

/* renamed from: Zg.k  reason: case insensitive filesystem */
public final class C5722k extends X implements e, C6658d {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66976h = AtomicReferenceFieldUpdater.newUpdater(C5722k.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d  reason: collision with root package name */
    public final G f66977d;

    /* renamed from: e  reason: collision with root package name */
    public final C6658d f66978e;

    /* renamed from: f  reason: collision with root package name */
    public Object f66979f = C5723l.f66981a;

    /* renamed from: g  reason: collision with root package name */
    public final Object f66980g = K.b(getContext());

    public C5722k(G g10, C6658d dVar) {
        super(-1);
        this.f66977d = g10;
        this.f66978e = dVar;
    }

    private final C5584o l() {
        Object obj = f66976h.get(this);
        if (obj instanceof C5584o) {
            return (C5584o) obj;
        }
        return null;
    }

    public void b(Object obj, Throwable th2) {
        if (obj instanceof C) {
            ((C) obj).f65280b.invoke(th2);
        }
    }

    public e getCallerFrame() {
        C6658d dVar = this.f66978e;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f66978e.getContext();
    }

    public Object h() {
        Object obj = this.f66979f;
        this.f66979f = C5723l.f66981a;
        return obj;
    }

    public final void i() {
        do {
        } while (f66976h.get(this) == C5723l.f66982b);
    }

    public final C5584o j() {
        AtomicReferenceFieldUpdater m10 = f66976h;
        while (true) {
            Object obj = m10.get(this);
            if (obj == null) {
                f66976h.set(this, C5723l.f66982b);
                return null;
            } else if (obj instanceof C5584o) {
                if (b.a(f66976h, this, obj, C5723l.f66982b)) {
                    return (C5584o) obj;
                }
            } else if (obj != C5723l.f66982b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void k(g gVar, Object obj) {
        this.f66979f = obj;
        this.f65339c = 1;
        this.f66977d.A1(gVar, this);
    }

    public final boolean n() {
        if (f66976h.get(this) != null) {
            return true;
        }
        return false;
    }

    public final boolean p(Throwable th2) {
        AtomicReferenceFieldUpdater m10 = f66976h;
        while (true) {
            Object obj = m10.get(this);
            G g10 = C5723l.f66982b;
            if (C6496s.c(obj, g10)) {
                if (b.a(f66976h, this, g10, th2)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f66976h, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void q() {
        i();
        C5584o l10 = l();
        if (l10 != null) {
            l10.n();
        }
    }

    public final Throwable r(C5582n nVar) {
        G g10;
        AtomicReferenceFieldUpdater m10 = f66976h;
        do {
            Object obj = m10.get(this);
            g10 = C5723l.f66982b;
            if (obj != g10) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f66976h, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } while (!b.a(f66976h, this, g10, nVar));
        return null;
    }

    public void resumeWith(Object obj) {
        g context;
        Object c10;
        g context2 = this.f66978e.getContext();
        Object d10 = E.d(obj, (C6798l) null, 1, (Object) null);
        if (this.f66977d.B1(context2)) {
            this.f66979f = d10;
            this.f65339c = 0;
            this.f66977d.z1(context2, this);
            return;
        }
        C5567f0 b10 = W0.f65337a.b();
        if (b10.K1()) {
            this.f66979f = d10;
            this.f65339c = 0;
            b10.G1(this);
            return;
        }
        b10.I1(true);
        try {
            context = getContext();
            c10 = K.c(context, this.f66980g);
            this.f66978e.resumeWith(obj);
            C6514M m10 = C6514M.f71813a;
            K.a(context, c10);
            do {
            } while (b10.N1());
        } catch (Throwable th2) {
            b10.D1(true);
            throw th2;
        }
        b10.D1(true);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f66977d + ", " + O.c(this.f66978e) + ']';
    }

    public C6658d d() {
        return this;
    }
}
