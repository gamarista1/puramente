package Ug;

import Ug.C5580m;
import Zg.C5722k;
import Zg.D;
import Zg.G;
import androidx.concurrent.futures.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6527k;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;

/* renamed from: Ug.o  reason: case insensitive filesystem */
public class C5584o extends X implements C5582n, e, i1 {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f65397f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65398g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65399h;
    private volatile /* synthetic */ int _decisionAndIndex$volatile = 536870911;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile = C5562d.f65355a;

    /* renamed from: d  reason: collision with root package name */
    private final C6658d f65400d;

    /* renamed from: e  reason: collision with root package name */
    private final g f65401e;

    static {
        Class<C5584o> cls = C5584o.class;
        f65397f = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex$volatile");
        Class<Object> cls2 = Object.class;
        f65398g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        f65399h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public C5584o(C6658d dVar, int i10) {
        super(i10);
        this.f65400d = dVar;
        this.f65401e = dVar.getContext();
    }

    private final C5559b0 F() {
        C5600w0 w0Var = (C5600w0) getContext().b(C5600w0.f65416O);
        if (w0Var == null) {
            return null;
        }
        C5559b0 p10 = C0.o(w0Var, true, false, new C5591s(this), 2, (Object) null);
        b.a(f65399h, this, (Object) null, p10);
        return p10;
    }

    private final void H(Object obj) {
        boolean z10;
        Object obj2 = obj;
        AtomicReferenceFieldUpdater C10 = f65398g;
        while (true) {
            Object obj3 = C10.get(this);
            if (!(obj3 instanceof C5562d)) {
                if (obj3 instanceof C5580m) {
                    z10 = true;
                } else {
                    z10 = obj3 instanceof D;
                }
                if (z10) {
                    K(obj2, obj3);
                } else if (obj3 instanceof B) {
                    B b10 = (B) obj3;
                    if (!b10.c()) {
                        K(obj2, obj3);
                    }
                    if (obj3 instanceof r) {
                        Throwable th2 = null;
                        if (!(obj3 instanceof B)) {
                            b10 = null;
                        }
                        if (b10 != null) {
                            th2 = b10.f65278a;
                        }
                        if (obj2 instanceof C5580m) {
                            j((C5580m) obj2, th2);
                            return;
                        }
                        C6496s.f(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        l((D) obj2, th2);
                        return;
                    }
                    return;
                } else if (obj3 instanceof A) {
                    A a10 = (A) obj3;
                    if (a10.f65273b != null) {
                        K(obj2, obj3);
                    }
                    if (!(obj2 instanceof D)) {
                        C6496s.f(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        C5580m mVar = (C5580m) obj2;
                        if (a10.c()) {
                            j(mVar, a10.f65276e);
                            return;
                        }
                        if (b.a(f65398g, this, obj3, A.b(a10, (Object) null, mVar, (C6798l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(obj2 instanceof D)) {
                    C6496s.f(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (b.a(f65398g, this, obj3, new A(obj3, (C5580m) obj2, (C6798l) null, (Object) null, (Throwable) null, 28, (DefaultConstructorMarker) null))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (b.a(f65398g, this, obj3, obj2)) {
                return;
            }
        }
    }

    private final boolean J() {
        if (Y.c(this.f65339c)) {
            C6658d dVar = this.f65400d;
            C6496s.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C5722k) dVar).n()) {
                return true;
            }
        }
        return false;
    }

    private final void K(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void Q(Object obj, int i10, C6798l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater C10 = f65398g;
        do {
            obj2 = C10.get(this);
            if (obj2 instanceof M0) {
            } else {
                if (obj2 instanceof r) {
                    r rVar = (r) obj2;
                    if (rVar.e()) {
                        if (lVar != null) {
                            k(lVar, rVar.f65278a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new C6527k();
            }
        } while (!b.a(f65398g, this, obj2, S((M0) obj2, obj, i10, lVar, (Object) null)));
        p();
        q(i10);
    }

    static /* synthetic */ void R(C5584o oVar, Object obj, int i10, C6798l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            oVar.Q(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object S(M0 m02, Object obj, int i10, C6798l lVar, Object obj2) {
        C5580m mVar;
        if (obj instanceof B) {
            return obj;
        }
        if (!Y.b(i10) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(m02 instanceof C5580m) && obj2 == null) {
            return obj;
        }
        if (m02 instanceof C5580m) {
            mVar = (C5580m) m02;
        } else {
            mVar = null;
        }
        return new A(obj, mVar, lVar, obj2, (Throwable) null, 16, (DefaultConstructorMarker) null);
    }

    private final boolean T() {
        int i10;
        AtomicIntegerFieldUpdater z10 = f65397f;
        do {
            i10 = z10.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f65397f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final G U(Object obj, Object obj2, C6798l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater C10 = f65398g;
        do {
            obj3 = C10.get(this);
            if (obj3 instanceof M0) {
            } else if (!(obj3 instanceof A) || obj2 == null || ((A) obj3).f65275d != obj2) {
                return null;
            } else {
                return C5586p.f65403a;
            }
        } while (!b.a(f65398g, this, obj3, S((M0) obj3, obj, this.f65339c, lVar, obj2)));
        p();
        return C5586p.f65403a;
    }

    private final boolean V() {
        int i10;
        AtomicIntegerFieldUpdater z10 = f65397f;
        do {
            i10 = z10.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f65397f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void l(D d10, Throwable th2) {
        int i10 = f65397f.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                d10.s(i10, th2, getContext());
            } catch (Throwable th3) {
                g context = getContext();
                I.a(context, new D("Exception in invokeOnCancellation handler for " + this, th3));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    private final boolean m(Throwable th2) {
        if (!J()) {
            return false;
        }
        C6658d dVar = this.f65400d;
        C6496s.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C5722k) dVar).p(th2);
    }

    private final void p() {
        if (!J()) {
            n();
        }
    }

    private final void q(int i10) {
        if (!T()) {
            Y.a(this, i10);
        }
    }

    private final C5559b0 t() {
        return (C5559b0) f65399h.get(this);
    }

    private final String y() {
        Object w10 = w();
        if (w10 instanceof M0) {
            return "Active";
        }
        if (w10 instanceof r) {
            return "Cancelled";
        }
        return "Completed";
    }

    public boolean B(Throwable th2) {
        Object obj;
        boolean z10;
        AtomicReferenceFieldUpdater C10 = f65398g;
        do {
            obj = C10.get(this);
            z10 = false;
            if (!(obj instanceof M0)) {
                return false;
            }
            if ((obj instanceof C5580m) || (obj instanceof D)) {
                z10 = true;
            }
        } while (!b.a(f65398g, this, obj, new r(this, th2, z10)));
        M0 m02 = (M0) obj;
        if (m02 instanceof C5580m) {
            j((C5580m) obj, th2);
        } else if (m02 instanceof D) {
            l((D) obj, th2);
        }
        p();
        q(this.f65339c);
        return true;
    }

    public Object D(Object obj, Object obj2, C6798l lVar) {
        return U(obj, obj2, lVar);
    }

    public void E() {
        C5559b0 F10 = F();
        if (F10 != null && o()) {
            F10.dispose();
            f65399h.set(this, L0.f65320a);
        }
    }

    public void G(G g10, Object obj) {
        C5722k kVar;
        int i10;
        C6658d dVar = this.f65400d;
        G g11 = null;
        if (dVar instanceof C5722k) {
            kVar = (C5722k) dVar;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            g11 = kVar.f66977d;
        }
        if (g11 == g10) {
            i10 = 4;
        } else {
            i10 = this.f65339c;
        }
        R(this, obj, i10, (C6798l) null, 4, (Object) null);
    }

    public final void I(C5580m mVar) {
        H(mVar);
    }

    public void L(Object obj) {
        q(this.f65339c);
    }

    /* access modifiers changed from: protected */
    public String M() {
        return "CancellableContinuation";
    }

    public final void N(Throwable th2) {
        if (!m(th2)) {
            B(th2);
            p();
        }
    }

    public final void O() {
        C5722k kVar;
        Throwable r10;
        C6658d dVar = this.f65400d;
        if (dVar instanceof C5722k) {
            kVar = (C5722k) dVar;
        } else {
            kVar = null;
        }
        if (kVar != null && (r10 = kVar.r(this)) != null) {
            n();
            B(r10);
        }
    }

    public final boolean P() {
        Object obj = f65398g.get(this);
        if (!(obj instanceof A) || ((A) obj).f65275d == null) {
            f65397f.set(this, 536870911);
            f65398g.set(this, C5562d.f65355a);
            return true;
        }
        n();
        return false;
    }

    public boolean a() {
        return w() instanceof M0;
    }

    public void b(Object obj, Throwable th2) {
        AtomicReferenceFieldUpdater C10 = f65398g;
        while (true) {
            Object obj2 = C10.get(this);
            if (obj2 instanceof M0) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof B)) {
                if (obj2 instanceof A) {
                    A a10 = (A) obj2;
                    if (!a10.c()) {
                        Throwable th3 = th2;
                        if (b.a(f65398g, this, obj2, A.b(a10, (Object) null, (C5580m) null, (C6798l) null, (Object) null, th2, 15, (Object) null))) {
                            a10.d(this, th3);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once");
                    }
                } else {
                    Throwable th4 = th2;
                    if (b.a(f65398g, this, obj2, new A(obj2, (C5580m) null, (C6798l) null, (Object) null, th2, 14, (DefaultConstructorMarker) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public void c(D d10, int i10) {
        int i11;
        AtomicIntegerFieldUpdater z10 = f65397f;
        do {
            i11 = z10.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!z10.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        H(d10);
    }

    public final C6658d d() {
        return this.f65400d;
    }

    public Throwable e(Object obj) {
        Throwable e10 = super.e(obj);
        if (e10 != null) {
            return e10;
        }
        return null;
    }

    public Object f(Object obj) {
        if (obj instanceof A) {
            return ((A) obj).f65272a;
        }
        return obj;
    }

    public e getCallerFrame() {
        C6658d dVar = this.f65400d;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f65401e;
    }

    public Object h() {
        return w();
    }

    public boolean isCancelled() {
        return w() instanceof r;
    }

    public final void j(C5580m mVar, Throwable th2) {
        try {
            mVar.b(th2);
        } catch (Throwable th3) {
            g context = getContext();
            I.a(context, new D("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    public final void k(C6798l lVar, Throwable th2) {
        try {
            lVar.invoke(th2);
        } catch (Throwable th3) {
            g context = getContext();
            I.a(context, new D("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    public final void n() {
        C5559b0 t10 = t();
        if (t10 != null) {
            t10.dispose();
            f65399h.set(this, L0.f65320a);
        }
    }

    public boolean o() {
        return !(w() instanceof M0);
    }

    public Throwable r(C5600w0 w0Var) {
        return w0Var.M();
    }

    public void resumeWith(Object obj) {
        R(this, E.b(obj, this), this.f65339c, (C6798l) null, 4, (Object) null);
    }

    public void s(C6798l lVar) {
        C5588q.c(this, new C5580m.a(lVar));
    }

    public String toString() {
        return M() + '(' + O.c(this.f65400d) + "){" + y() + "}@" + O.b(this);
    }

    public Object u(Throwable th2) {
        return U(new B(th2, false, 2, (DefaultConstructorMarker) null), (Object) null, (C6798l) null);
    }

    public final Object v() {
        C5600w0 w0Var;
        boolean J10 = J();
        if (V()) {
            if (t() == null) {
                F();
            }
            if (J10) {
                O();
            }
            return C6680b.f();
        }
        if (J10) {
            O();
        }
        Object w10 = w();
        if (w10 instanceof B) {
            throw ((B) w10).f65278a;
        } else if (!Y.b(this.f65339c) || (w0Var = (C5600w0) getContext().b(C5600w0.f65416O)) == null || w0Var.a()) {
            return f(w10);
        } else {
            CancellationException M10 = w0Var.M();
            b(w10, M10);
            throw M10;
        }
    }

    public final Object w() {
        return f65398g.get(this);
    }

    public void x(Object obj, C6798l lVar) {
        Q(obj, this.f65339c, lVar);
    }
}
