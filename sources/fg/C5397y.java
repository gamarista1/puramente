package Fg;

import Gg.i;
import Gg.r;
import Jg.e;
import Of.C5490h;
import Of.m0;
import Rf.U;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Fg.y  reason: case insensitive filesystem */
public final class C5397y extends A implements C5395w, e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f63080d = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final C5366d0 f63081b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63082c;

    /* renamed from: Fg.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(M0 m02) {
            m02.N0();
            if ((m02.N0().o() instanceof m0) || (m02 instanceof i)) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ C5397y c(a aVar, M0 m02, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(m02, z10, z11);
        }

        private final boolean d(M0 m02, boolean z10) {
            U u10;
            if (!a(m02)) {
                return false;
            }
            C5490h o10 = m02.N0().o();
            if (o10 instanceof U) {
                u10 = (U) o10;
            } else {
                u10 = null;
            }
            if (u10 != null && !u10.T0()) {
                return true;
            }
            if (!z10 || !(m02.N0().o() instanceof m0)) {
                return !r.f63204a.a(m02);
            }
            return J0.l(m02);
        }

        public final C5397y b(M0 m02, boolean z10, boolean z11) {
            C6496s.h(m02, "type");
            if (m02 instanceof C5397y) {
                return (C5397y) m02;
            }
            if (!z11 && !d(m02, z10)) {
                return null;
            }
            if (m02 instanceof I) {
                I i10 = (I) m02;
                C6496s.c(i10.V0().N0(), i10.W0().N0());
            }
            return new C5397y(L.c(m02).U0(false), z10, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C5397y(C5366d0 d0Var, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, z10);
    }

    public boolean F0() {
        W0().N0();
        return W0().N0().o() instanceof m0;
    }

    public boolean O0() {
        return false;
    }

    /* renamed from: U0 */
    public C5366d0 R0(boolean z10) {
        if (z10) {
            return W0().U0(z10);
        }
        return this;
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return new C5397y(W0().V0(r0Var), this.f63082c);
    }

    /* access modifiers changed from: protected */
    public C5366d0 W0() {
        return this.f63081b;
    }

    public final C5366d0 Z0() {
        return this.f63081b;
    }

    /* renamed from: a1 */
    public C5397y Y0(C5366d0 d0Var) {
        C6496s.h(d0Var, "delegate");
        return new C5397y(d0Var, this.f63082c);
    }

    public S m0(S s10) {
        C6496s.h(s10, "replacement");
        return C5374h0.e(s10.Q0(), this.f63082c);
    }

    public String toString() {
        return W0() + " & Any";
    }

    private C5397y(C5366d0 d0Var, boolean z10) {
        this.f63081b = d0Var;
        this.f63082c = z10;
    }
}
