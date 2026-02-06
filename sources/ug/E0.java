package Ug;

import Rg.j;
import Ug.C5592s0;
import Ug.C5600w0;
import Zg.q;
import Zg.r;
import Zg.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6523g;
import qf.C6658d;
import qf.g;
import rf.C6680b;
import yf.C6798l;
import yf.p;

public class E0 implements C5600w0, C5597v, N0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65282a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65283b;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a extends C5584o {

        /* renamed from: i  reason: collision with root package name */
        private final E0 f65284i;

        public a(C6658d dVar, E0 e02) {
            super(dVar, 1);
            this.f65284i = e02;
        }

        /* access modifiers changed from: protected */
        public String M() {
            return "AwaitContinuation";
        }

        public Throwable r(C5600w0 w0Var) {
            Throwable f10;
            Object l02 = this.f65284i.l0();
            if ((l02 instanceof c) && (f10 = ((c) l02).f()) != null) {
                return f10;
            }
            if (l02 instanceof B) {
                return ((B) l02).f65278a;
            }
            return w0Var.M();
        }
    }

    private static final class b extends D0 {

        /* renamed from: e  reason: collision with root package name */
        private final E0 f65285e;

        /* renamed from: f  reason: collision with root package name */
        private final c f65286f;

        /* renamed from: g  reason: collision with root package name */
        private final C5595u f65287g;

        /* renamed from: h  reason: collision with root package name */
        private final Object f65288h;

        public b(E0 e02, c cVar, C5595u uVar, Object obj) {
            this.f65285e = e02;
            this.f65286f = cVar;
            this.f65287g = uVar;
            this.f65288h = obj;
        }

        public void b(Throwable th2) {
            this.f65285e.X(this.f65286f, this.f65287g, this.f65288h);
        }
    }

    private static final class c implements C5589q0 {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f65289b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f65290c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f65291d;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a  reason: collision with root package name */
        private final J0 f65292a;

        static {
            Class<c> cls = c.class;
            f65289b = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting$volatile");
            Class<Object> cls2 = Object.class;
            f65290c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause$volatile");
            f65291d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder$volatile");
        }

        public c(J0 j02, boolean z10, Throwable th2) {
            this.f65292a = j02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        private final ArrayList c() {
            return new ArrayList(4);
        }

        private final Object e() {
            return f65291d.get(this);
        }

        private final void o(Object obj) {
            f65291d.set(this, obj);
        }

        public boolean a() {
            if (f() == null) {
                return true;
            }
            return false;
        }

        public final void b(Throwable th2) {
            Throwable f10 = f();
            if (f10 == null) {
                p(th2);
            } else if (th2 != f10) {
                Object e10 = e();
                if (e10 == null) {
                    o(th2);
                } else if (e10 instanceof Throwable) {
                    if (th2 != e10) {
                        ArrayList c10 = c();
                        c10.add(e10);
                        c10.add(th2);
                        o(c10);
                    }
                } else if (e10 instanceof ArrayList) {
                    ((ArrayList) e10).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
            }
        }

        public J0 d() {
            return this.f65292a;
        }

        public final Throwable f() {
            return (Throwable) f65290c.get(this);
        }

        public final boolean j() {
            if (f() != null) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            if (f65289b.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean l() {
            if (e() == F0.f65308e) {
                return true;
            }
            return false;
        }

        public final List m(Throwable th2) {
            ArrayList arrayList;
            Object e10 = e();
            if (e10 == null) {
                arrayList = c();
            } else if (e10 instanceof Throwable) {
                ArrayList c10 = c();
                c10.add(e10);
                arrayList = c10;
            } else if (e10 instanceof ArrayList) {
                arrayList = (ArrayList) e10;
            } else {
                throw new IllegalStateException(("State is " + e10).toString());
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (th2 != null && !C6496s.c(th2, f10)) {
                arrayList.add(th2);
            }
            o(F0.f65308e);
            return arrayList;
        }

        public final void n(boolean z10) {
            f65289b.set(this, z10 ? 1 : 0);
        }

        public final void p(Throwable th2) {
            f65290c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + d() + ']';
        }
    }

    public static final class d extends r.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ E0 f65293d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f65294e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(r rVar, E0 e02, Object obj) {
            super(rVar);
            this.f65293d = e02;
            this.f65294e = obj;
        }

        /* renamed from: g */
        public Object e(r rVar) {
            if (this.f65293d.l0() == this.f65294e) {
                return null;
            }
            return q.a();
        }
    }

    static final class e extends k implements p {

        /* renamed from: b  reason: collision with root package name */
        Object f65295b;

        /* renamed from: c  reason: collision with root package name */
        Object f65296c;

        /* renamed from: d  reason: collision with root package name */
        int f65297d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f65298e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ E0 f65299f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(E0 e02, C6658d dVar) {
            super(2, dVar);
            this.f65299f = e02;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            e eVar = new e(this.f65299f, dVar);
            eVar.f65298e = obj;
            return eVar;
        }

        /* renamed from: i */
        public final Object invoke(j jVar, C6658d dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r6.f65297d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x0026
                if (r1 != r2) goto L_0x001e
                java.lang.Object r1 = r6.f65296c
                Zg.r r1 = (Zg.r) r1
                java.lang.Object r3 = r6.f65295b
                Zg.p r3 = (Zg.C5727p) r3
                java.lang.Object r4 = r6.f65298e
                Rg.j r4 = (Rg.j) r4
                lf.w.b(r7)
                goto L_0x0081
            L_0x001e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0026:
                lf.w.b(r7)
                goto L_0x0086
            L_0x002a:
                lf.w.b(r7)
                java.lang.Object r7 = r6.f65298e
                Rg.j r7 = (Rg.j) r7
                Ug.E0 r1 = r6.f65299f
                java.lang.Object r1 = r1.l0()
                boolean r4 = r1 instanceof Ug.C5595u
                if (r4 == 0) goto L_0x0048
                Ug.u r1 = (Ug.C5595u) r1
                Ug.v r1 = r1.f65412e
                r6.f65297d = r3
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto L_0x0086
                return r0
            L_0x0048:
                boolean r3 = r1 instanceof Ug.C5589q0
                if (r3 == 0) goto L_0x0086
                Ug.q0 r1 = (Ug.C5589q0) r1
                Ug.J0 r1 = r1.d()
                if (r1 == 0) goto L_0x0086
                java.lang.Object r3 = r1.k()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.C6496s.f(r3, r4)
                Zg.r r3 = (Zg.r) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L_0x0063:
                boolean r7 = kotlin.jvm.internal.C6496s.c(r1, r3)
                if (r7 != 0) goto L_0x0086
                boolean r7 = r1 instanceof Ug.C5595u
                if (r7 == 0) goto L_0x0081
                r7 = r1
                Ug.u r7 = (Ug.C5595u) r7
                Ug.v r7 = r7.f65412e
                r6.f65298e = r4
                r6.f65295b = r3
                r6.f65296c = r1
                r6.f65297d = r2
                java.lang.Object r7 = r4.b(r7, r6)
                if (r7 != r0) goto L_0x0081
                return r0
            L_0x0081:
                Zg.r r1 = r1.l()
                goto L_0x0063
            L_0x0086:
                lf.M r7 = lf.C6514M.f71813a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Ug.E0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        Class<E0> cls = E0.class;
        Class<Object> cls2 = Object.class;
        f65282a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        f65283b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public E0(boolean z10) {
        C5565e0 e0Var;
        if (z10) {
            e0Var = F0.f65310g;
        } else {
            e0Var = F0.f65309f;
        }
        this._state$volatile = e0Var;
    }

    private final D0 C0(C5592s0 s0Var, boolean z10) {
        D0 d02 = null;
        if (z10) {
            if (s0Var instanceof C5604y0) {
                d02 = (C5604y0) s0Var;
            }
            if (d02 == null) {
                d02 = new C5596u0(s0Var);
            }
        } else {
            if (s0Var instanceof D0) {
                d02 = (D0) s0Var;
            }
            if (d02 == null) {
                d02 = new C5598v0(s0Var);
            }
        }
        d02.w(this);
        return d02;
    }

    private final C5595u F0(r rVar) {
        while (rVar.q()) {
            rVar = rVar.m();
        }
        while (true) {
            rVar = rVar.l();
            if (!rVar.q()) {
                if (rVar instanceof C5595u) {
                    return (C5595u) rVar;
                }
                if (rVar instanceof J0) {
                    return null;
                }
            }
        }
    }

    private final void G0(J0 j02, Throwable th2) {
        I0(th2);
        Object k10 = j02.k();
        C6496s.f(k10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        D d10 = null;
        for (r rVar = (r) k10; !C6496s.c(rVar, j02); rVar = rVar.l()) {
            if (rVar instanceof C5604y0) {
                D0 d02 = (D0) rVar;
                try {
                    d02.b(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        C6523g.a(d10, th3);
                    } else {
                        d10 = new D("Exception in completion handler " + d02 + " for " + this, th3);
                        C6514M m10 = C6514M.f71813a;
                    }
                }
            }
        }
        if (d10 != null) {
            q0(d10);
        }
        P(th2);
    }

    private final Object H(C6658d dVar) {
        a aVar = new a(C6680b.c(dVar), this);
        aVar.E();
        C5588q.a(aVar, C0.o(this, false, false, new O0(aVar), 3, (Object) null));
        Object v10 = aVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        return v10;
    }

    private final void H0(J0 j02, Throwable th2) {
        Object k10 = j02.k();
        C6496s.f(k10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        D d10 = null;
        for (r rVar = (r) k10; !C6496s.c(rVar, j02); rVar = rVar.l()) {
            if (rVar instanceof D0) {
                D0 d02 = (D0) rVar;
                try {
                    d02.b(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        C6523g.a(d10, th3);
                    } else {
                        d10 = new D("Exception in completion handler " + d02 + " for " + this, th3);
                        C6514M m10 = C6514M.f71813a;
                    }
                }
            }
        }
        if (d10 != null) {
            q0(d10);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [Ug.p0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void M0(Ug.C5565e0 r3) {
        /*
            r2 = this;
            Ug.J0 r0 = new Ug.J0
            r0.<init>()
            boolean r1 = r3.a()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            Ug.p0 r1 = new Ug.p0
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f65282a
            androidx.concurrent.futures.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.E0.M0(Ug.e0):void");
    }

    private final void N0(D0 d02) {
        d02.g(new J0());
        androidx.concurrent.futures.b.a(f65282a, this, d02, d02.l());
    }

    private final Object O(Object obj) {
        Object Z02;
        do {
            Object l02 = l0();
            if (!(l02 instanceof C5589q0) || ((l02 instanceof c) && ((c) l02).k())) {
                return F0.f65304a;
            }
            Z02 = Z0(l02, new B(Y(obj), false, 2, (DefaultConstructorMarker) null));
        } while (Z02 == F0.f65306c);
        return Z02;
    }

    private final boolean P(Throwable th2) {
        if (u0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        C5593t k02 = k0();
        if (k02 == null || k02 == L0.f65320a) {
            return z10;
        }
        if (k02.c(th2) || z10) {
            return true;
        }
        return false;
    }

    private final int S0(Object obj) {
        if (obj instanceof C5565e0) {
            if (((C5565e0) obj).a()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f65282a, this, obj, F0.f65310g)) {
                return -1;
            }
            K0();
            return 1;
        } else if (!(obj instanceof C5587p0)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f65282a, this, obj, ((C5587p0) obj).d())) {
                return -1;
            }
            K0();
            return 1;
        }
    }

    private final String T0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.j()) {
                return "Cancelling";
            }
            if (cVar.k()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C5589q0) {
            if (((C5589q0) obj).a()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof B) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public static /* synthetic */ CancellationException V0(E0 e02, Throwable th2, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return e02.U0(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final void W(C5589q0 q0Var, Object obj) {
        B b10;
        C5593t k02 = k0();
        if (k02 != null) {
            k02.dispose();
            Q0(L0.f65320a);
        }
        Throwable th2 = null;
        if (obj instanceof B) {
            b10 = (B) obj;
        } else {
            b10 = null;
        }
        if (b10 != null) {
            th2 = b10.f65278a;
        }
        if (q0Var instanceof D0) {
            try {
                ((D0) q0Var).b(th2);
            } catch (Throwable th3) {
                q0(new D("Exception in completion handler " + q0Var + " for " + this, th3));
            }
        } else {
            J0 d10 = q0Var.d();
            if (d10 != null) {
                H0(d10, th2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void X(c cVar, C5595u uVar, Object obj) {
        C5595u F02 = F0(uVar);
        if (F02 == null || !b1(cVar, F02, obj)) {
            A(Z(cVar, obj));
        }
    }

    private final boolean X0(C5589q0 q0Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f65282a, this, q0Var, F0.g(obj))) {
            return false;
        }
        I0((Throwable) null);
        J0(obj);
        W(q0Var, obj);
        return true;
    }

    private final Throwable Y(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof Throwable;
        }
        if (z10) {
            Throwable th2 = (Throwable) obj;
            if (th2 == null) {
                return new C5602x0(R(), (Throwable) null, this);
            }
            return th2;
        }
        C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((N0) obj).o0();
    }

    private final boolean Y0(C5589q0 q0Var, Throwable th2) {
        J0 i02 = i0(q0Var);
        if (i02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f65282a, this, q0Var, new c(i02, false, th2))) {
            return false;
        }
        G0(i02, th2);
        return true;
    }

    private final Object Z(c cVar, Object obj) {
        B b10;
        Throwable th2;
        boolean j10;
        Throwable d02;
        if (obj instanceof B) {
            b10 = (B) obj;
        } else {
            b10 = null;
        }
        if (b10 != null) {
            th2 = b10.f65278a;
        } else {
            th2 = null;
        }
        synchronized (cVar) {
            j10 = cVar.j();
            List m10 = cVar.m(th2);
            d02 = d0(cVar, m10);
            if (d02 != null) {
                z(d02, m10);
            }
        }
        if (!(d02 == null || d02 == th2)) {
            obj = new B(d02, false, 2, (DefaultConstructorMarker) null);
        }
        if (d02 != null && (P(d02) || p0(d02))) {
            C6496s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((B) obj).c();
        }
        if (!j10) {
            I0(d02);
        }
        J0(obj);
        androidx.concurrent.futures.b.a(f65282a, this, cVar, F0.g(obj));
        W(cVar, obj);
        return obj;
    }

    private final Object Z0(Object obj, Object obj2) {
        if (!(obj instanceof C5589q0)) {
            return F0.f65304a;
        }
        if ((!(obj instanceof C5565e0) && !(obj instanceof D0)) || (obj instanceof C5595u) || (obj2 instanceof B)) {
            return a1((C5589q0) obj, obj2);
        }
        if (X0((C5589q0) obj, obj2)) {
            return obj2;
        }
        return F0.f65306c;
    }

    private final C5595u a0(C5589q0 q0Var) {
        C5595u uVar;
        if (q0Var instanceof C5595u) {
            uVar = (C5595u) q0Var;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            return uVar;
        }
        J0 d10 = q0Var.d();
        if (d10 != null) {
            return F0(d10);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        if (r2 == null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0069, code lost:
        G0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        r7 = a0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        if (r7 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        if (b1(r1, r7, r8) == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007a, code lost:
        return Ug.F0.f65305b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007f, code lost:
        return Z(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object a1(Ug.C5589q0 r7, java.lang.Object r8) {
        /*
            r6 = this;
            Ug.J0 r0 = r6.i0(r7)
            if (r0 != 0) goto L_0x000b
            Zg.G r7 = Ug.F0.f65306c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof Ug.E0.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            Ug.E0$c r1 = (Ug.E0.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            Ug.E0$c r1 = new Ug.E0$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.N r3 = new kotlin.jvm.internal.N
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.k()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0031
            Zg.G r7 = Ug.F0.f65304a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r7
        L_0x002f:
            r7 = move-exception
            goto L_0x0080
        L_0x0031:
            r4 = 1
            r1.n(r4)     // Catch:{ all -> 0x002f }
            if (r1 == r7) goto L_0x0047
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f65282a     // Catch:{ all -> 0x002f }
            boolean r4 = androidx.concurrent.futures.b.a(r4, r6, r7, r1)     // Catch:{ all -> 0x002f }
            if (r4 != 0) goto L_0x0047
            Zg.G r7 = Ug.F0.f65306c     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r7
        L_0x0047:
            boolean r4 = r1.j()     // Catch:{ all -> 0x002f }
            boolean r5 = r8 instanceof Ug.B     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x0053
            r5 = r8
            Ug.B r5 = (Ug.B) r5     // Catch:{ all -> 0x002f }
            goto L_0x0054
        L_0x0053:
            r5 = r2
        L_0x0054:
            if (r5 == 0) goto L_0x005b
            java.lang.Throwable r5 = r5.f65278a     // Catch:{ all -> 0x002f }
            r1.b(r5)     // Catch:{ all -> 0x002f }
        L_0x005b:
            java.lang.Throwable r5 = r1.f()     // Catch:{ all -> 0x002f }
            if (r4 != 0) goto L_0x0062
            r2 = r5
        L_0x0062:
            r3.f71759a = r2     // Catch:{ all -> 0x002f }
            lf.M r3 = lf.C6514M.f71813a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x006c
            r6.G0(r0, r2)
        L_0x006c:
            Ug.u r7 = r6.a0(r7)
            if (r7 == 0) goto L_0x007b
            boolean r7 = r6.b1(r1, r7, r8)
            if (r7 == 0) goto L_0x007b
            Zg.G r7 = Ug.F0.f65305b
            return r7
        L_0x007b:
            java.lang.Object r7 = r6.Z(r1, r8)
            return r7
        L_0x0080:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.E0.a1(Ug.q0, java.lang.Object):java.lang.Object");
    }

    private final boolean b1(c cVar, C5595u uVar, Object obj) {
        while (C0.o(uVar.f65412e, false, false, new b(this, cVar, uVar, obj), 1, (Object) null) == L0.f65320a) {
            uVar = F0(uVar);
            if (uVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable c0(Object obj) {
        B b10;
        if (obj instanceof B) {
            b10 = (B) obj;
        } else {
            b10 = null;
        }
        if (b10 != null) {
            return b10.f65278a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable d0(Ug.E0.c r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r5 = r5.j()
            if (r5 == 0) goto L_0x0017
            Ug.x0 r5 = new Ug.x0
            java.lang.String r6 = r4.R()
            r5.<init>(r6, r1, r4)
            return r5
        L_0x0017:
            return r1
        L_0x0018:
            r5 = r6
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r0 = r5.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            boolean r3 = r3 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x001f
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0037
            return r2
        L_0x0037:
            r0 = 0
            java.lang.Object r6 = r6.get(r0)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            boolean r0 = r6 instanceof Ug.c1
            if (r0 == 0) goto L_0x005f
            java.util.Iterator r5 = r5.iterator()
        L_0x0046:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r5.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == r6) goto L_0x0046
            boolean r2 = r2 instanceof Ug.c1
            if (r2 == 0) goto L_0x0046
            r1 = r0
        L_0x005a:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x005f
            return r1
        L_0x005f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.E0.d0(Ug.E0$c, java.util.List):java.lang.Throwable");
    }

    private final J0 i0(C5589q0 q0Var) {
        J0 d10 = q0Var.d();
        if (d10 != null) {
            return d10;
        }
        if (q0Var instanceof C5565e0) {
            return new J0();
        }
        if (q0Var instanceof D0) {
            N0((D0) q0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + q0Var).toString());
    }

    private final boolean v0() {
        Object l02;
        do {
            l02 = l0();
            if (!(l02 instanceof C5589q0)) {
                return false;
            }
        } while (S0(l02) < 0);
        return true;
    }

    private final boolean w(Object obj, J0 j02, D0 d02) {
        int u10;
        d dVar = new d(d02, this, obj);
        do {
            u10 = j02.m().u(d02, j02, dVar);
            if (u10 == 1) {
                return true;
            }
        } while (u10 != 2);
        return false;
    }

    private final Object w0(C6658d dVar) {
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        C5588q.a(oVar, C0.o(this, false, false, new P0(oVar), 3, (Object) null));
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        G0(((Ug.E0.c) r2).d(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return Ug.F0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object y0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.l0()
            boolean r3 = r2 instanceof Ug.E0.c
            if (r3 == 0) goto L_0x0050
            monitor-enter(r2)
            r3 = r2
            Ug.E0$c r3 = (Ug.E0.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.l()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x001c
            Zg.G r7 = Ug.F0.f65307d     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r7 = move-exception
            goto L_0x004e
        L_0x001c:
            r3 = r2
            Ug.E0$c r3 = (Ug.E0.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.j()     // Catch:{ all -> 0x001a }
            if (r7 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            if (r1 != 0) goto L_0x002d
            java.lang.Throwable r1 = r6.Y(r7)     // Catch:{ all -> 0x001a }
        L_0x002d:
            r7 = r2
            Ug.E0$c r7 = (Ug.E0.c) r7     // Catch:{ all -> 0x001a }
            r7.b(r1)     // Catch:{ all -> 0x001a }
        L_0x0033:
            r7 = r2
            Ug.E0$c r7 = (Ug.E0.c) r7     // Catch:{ all -> 0x001a }
            java.lang.Throwable r7 = r7.f()     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            Ug.E0$c r2 = (Ug.E0.c) r2
            Ug.J0 r7 = r2.d()
            r6.G0(r7, r0)
        L_0x0049:
            Zg.G r7 = Ug.F0.f65304a
            return r7
        L_0x004e:
            monitor-exit(r2)
            throw r7
        L_0x0050:
            boolean r3 = r2 instanceof Ug.C5589q0
            if (r3 == 0) goto L_0x00a1
            if (r1 != 0) goto L_0x005a
            java.lang.Throwable r1 = r6.Y(r7)
        L_0x005a:
            r3 = r2
            Ug.q0 r3 = (Ug.C5589q0) r3
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x006e
            boolean r2 = r6.Y0(r3, r1)
            if (r2 == 0) goto L_0x0002
            Zg.G r7 = Ug.F0.f65304a
            return r7
        L_0x006e:
            Ug.B r3 = new Ug.B
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.Z0(r2, r3)
            Zg.G r4 = Ug.F0.f65304a
            if (r3 == r4) goto L_0x0086
            Zg.G r2 = Ug.F0.f65306c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0086:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a1:
            Zg.G r7 = Ug.F0.f65307d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.E0.y0(java.lang.Object):java.lang.Object");
    }

    private final void z(Throwable th2, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th3 = (Throwable) it.next();
                if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                    C6523g.a(th2, th3);
                }
            }
        }
    }

    public final Object A0(Object obj) {
        Object Z02;
        do {
            Z02 = Z0(l0(), obj);
            if (Z02 == F0.f65304a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, c0(obj));
            }
        } while (Z02 == F0.f65306c);
        return Z02;
    }

    public final Object B0(C6658d dVar) {
        if (!v0()) {
            A0.m(dVar.getContext());
            return C6514M.f71813a;
        }
        Object w02 = w0(dVar);
        if (w02 == C6680b.f()) {
            return w02;
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: protected */
    public final Object C(C6658d dVar) {
        Object l02;
        do {
            l02 = l0();
            if (!(l02 instanceof C5589q0)) {
                if (!(l02 instanceof B)) {
                    return F0.h(l02);
                }
                throw ((B) l02).f65278a;
            }
        } while (S0(l02) < 0);
        return H(dVar);
    }

    public String D0() {
        return O.a(this);
    }

    public final Rg.h E() {
        return Rg.k.b(new e(this, (C6658d) null));
    }

    public final Throwable F() {
        Object l02 = l0();
        if (!(l02 instanceof C5589q0)) {
            return c0(l02);
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public final boolean J(Throwable th2) {
        return K(th2);
    }

    public final boolean K(Object obj) {
        Object a10 = F0.f65304a;
        if (h0() && (a10 = O(obj)) == F0.f65305b) {
            return true;
        }
        if (a10 == F0.f65304a) {
            a10 = y0(obj);
        }
        if (a10 == F0.f65304a || a10 == F0.f65305b) {
            return true;
        }
        if (a10 == F0.f65307d) {
            return false;
        }
        A(a10);
        return true;
    }

    public final CancellationException M() {
        Object l02 = l0();
        if (l02 instanceof c) {
            Throwable f10 = ((c) l02).f();
            if (f10 != null) {
                CancellationException U02 = U0(f10, O.a(this) + " is cancelling");
                if (U02 != null) {
                    return U02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (l02 instanceof C5589q0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (l02 instanceof B) {
            return V0(this, ((B) l02).f65278a, (String) null, 1, (Object) null);
        } else {
            return new C5602x0(O.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public void N(Throwable th2) {
        K(th2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O0(Ug.D0 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.l0()
            boolean r1 = r0 instanceof Ug.D0
            if (r1 == 0) goto L_0x001a
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f65282a
            Ug.e0 r2 = Ug.F0.f65310g
            boolean r0 = androidx.concurrent.futures.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x001a:
            boolean r1 = r0 instanceof Ug.C5589q0
            if (r1 == 0) goto L_0x0029
            Ug.q0 r0 = (Ug.C5589q0) r0
            Ug.J0 r0 = r0.d()
            if (r0 == 0) goto L_0x0029
            r4.r()
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.E0.O0(Ug.D0):void");
    }

    public final C5559b0 P0(C6798l lVar) {
        return s0(false, true, new C5592s0.a(lVar));
    }

    public final void Q0(C5593t tVar) {
        f65283b.set(this, tVar);
    }

    /* access modifiers changed from: protected */
    public String R() {
        return "Job was cancelled";
    }

    public g R0(g.c cVar) {
        return C5600w0.a.d(this, cVar);
    }

    public boolean S(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        if (!K(th2) || !e0()) {
            return false;
        }
        return true;
    }

    public final void T(N0 n02) {
        K(n02);
    }

    /* access modifiers changed from: protected */
    public final CancellationException U0(Throwable th2, String str) {
        CancellationException cancellationException;
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = R();
            }
            cancellationException = new C5602x0(str, th2, this);
        }
        return cancellationException;
    }

    public final String W0() {
        return D0() + '{' + T0(l0()) + '}';
    }

    public boolean a() {
        Object l02 = l0();
        if (!(l02 instanceof C5589q0) || !((C5589q0) l02).a()) {
            return false;
        }
        return true;
    }

    public g.b b(g.c cVar) {
        return C5600w0.a.c(this, cVar);
    }

    public final Object b0() {
        Object l02 = l0();
        if (l02 instanceof C5589q0) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(l02 instanceof B)) {
            return F0.h(l02);
        } else {
            throw ((B) l02).f65278a;
        }
    }

    public boolean e0() {
        return true;
    }

    public Object f0(Object obj, p pVar) {
        return C5600w0.a.b(this, obj, pVar);
    }

    public final g.c getKey() {
        return C5600w0.f65416O;
    }

    public C5600w0 getParent() {
        C5593t k02 = k0();
        if (k02 != null) {
            return k02.getParent();
        }
        return null;
    }

    public boolean h0() {
        return false;
    }

    public final boolean isCancelled() {
        Object l02 = l0();
        if ((l02 instanceof B) || ((l02 instanceof c) && ((c) l02).j())) {
            return true;
        }
        return false;
    }

    public final C5593t k0() {
        return (C5593t) f65283b.get(this);
    }

    public final Object l0() {
        AtomicReferenceFieldUpdater n02 = f65282a;
        while (true) {
            Object obj = n02.get(this);
            if (!(obj instanceof z)) {
                return obj;
            }
            ((z) obj).a(this);
        }
    }

    public void n(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C5602x0(R(), (Throwable) null, this);
        }
        N(cancellationException);
    }

    public g n1(g gVar) {
        return C5600w0.a.e(this, gVar);
    }

    public final boolean o() {
        return !(l0() instanceof C5589q0);
    }

    public CancellationException o0() {
        Throwable th2;
        Object l02 = l0();
        CancellationException cancellationException = null;
        if (l02 instanceof c) {
            th2 = ((c) l02).f();
        } else if (l02 instanceof B) {
            th2 = ((B) l02).f65278a;
        } else if (!(l02 instanceof C5589q0)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + l02).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C5602x0("Parent job is " + T0(l02), th2, this);
    }

    /* access modifiers changed from: protected */
    public boolean p0(Throwable th2) {
        return false;
    }

    public final C5593t q(C5597v vVar) {
        C5559b0 p10 = C0.o(this, true, false, new C5595u(vVar), 2, (Object) null);
        C6496s.f(p10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C5593t) p10;
    }

    /* access modifiers changed from: protected */
    public final void r0(C5600w0 w0Var) {
        if (w0Var == null) {
            Q0(L0.f65320a);
            return;
        }
        w0Var.start();
        C5593t q10 = w0Var.q(this);
        Q0(q10);
        if (o()) {
            q10.dispose();
            Q0(L0.f65320a);
        }
    }

    public final C5559b0 s0(boolean z10, boolean z11, C5592s0 s0Var) {
        B b10;
        D0 C02 = C0(s0Var, z10);
        while (true) {
            Object l02 = l0();
            if (l02 instanceof C5565e0) {
                C5565e0 e0Var = (C5565e0) l02;
                if (!e0Var.a()) {
                    M0(e0Var);
                } else if (androidx.concurrent.futures.b.a(f65282a, this, l02, C02)) {
                    return C02;
                }
            } else {
                Throwable th2 = null;
                if (l02 instanceof C5589q0) {
                    J0 d10 = ((C5589q0) l02).d();
                    if (d10 == null) {
                        C6496s.f(l02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        N0((D0) l02);
                    } else {
                        C5559b0 b0Var = L0.f65320a;
                        if (z10 && (l02 instanceof c)) {
                            synchronized (l02) {
                                try {
                                    th2 = ((c) l02).f();
                                    if (th2 != null) {
                                        if ((s0Var instanceof C5595u) && !((c) l02).k()) {
                                        }
                                        C6514M m10 = C6514M.f71813a;
                                    }
                                    if (w(l02, d10, C02)) {
                                        if (th2 == null) {
                                            return C02;
                                        }
                                        b0Var = C02;
                                        C6514M m102 = C6514M.f71813a;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        if (th2 != null) {
                            if (z11) {
                                s0Var.b(th2);
                            }
                            return b0Var;
                        } else if (w(l02, d10, C02)) {
                            return C02;
                        }
                    }
                } else {
                    if (z11) {
                        if (l02 instanceof B) {
                            b10 = (B) l02;
                        } else {
                            b10 = null;
                        }
                        if (b10 != null) {
                            th2 = b10.f65278a;
                        }
                        s0Var.b(th2);
                    }
                    return L0.f65320a;
                }
            }
        }
    }

    public final boolean start() {
        int S02;
        do {
            S02 = S0(l0());
            if (S02 == 0) {
                return false;
            }
        } while (S02 != 1);
        return true;
    }

    public String toString() {
        return W0() + '@' + O.b(this);
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return false;
    }

    public final C5559b0 x0(boolean z10, boolean z11, C6798l lVar) {
        return s0(z10, z11, new C5592s0.a(lVar));
    }

    public final boolean z0(Object obj) {
        Object Z02;
        do {
            Z02 = Z0(l0(), obj);
            if (Z02 == F0.f65304a) {
                return false;
            }
            if (Z02 == F0.f65305b) {
                return true;
            }
        } while (Z02 == F0.f65306c);
        A(Z02);
        return true;
    }

    /* access modifiers changed from: protected */
    public void K0() {
    }

    /* access modifiers changed from: protected */
    public void A(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void I0(Throwable th2) {
    }

    /* access modifiers changed from: protected */
    public void J0(Object obj) {
    }

    public void q0(Throwable th2) {
        throw th2;
    }
}
