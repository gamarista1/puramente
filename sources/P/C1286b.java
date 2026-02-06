package P;

import Ef.m;
import J.D;
import J.E;
import Q0.C1321d;
import Q0.L;
import Q0.Q;
import Q0.S;
import W0.I;
import b1.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2422h;
import yf.C6798l;

/* renamed from: P.b  reason: case insensitive filesystem */
public abstract class C1286b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f4878h = new a((DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f4879i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f4880a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4881b;

    /* renamed from: c  reason: collision with root package name */
    private final L f4882c;

    /* renamed from: d  reason: collision with root package name */
    private final I f4883d;

    /* renamed from: e  reason: collision with root package name */
    private final J f4884e;

    /* renamed from: f  reason: collision with root package name */
    private long f4885f;

    /* renamed from: g  reason: collision with root package name */
    private C1321d f4886g;

    /* renamed from: P.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ C1286b(C1321d dVar, long j10, L l10, I i10, J j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j10, l10, i10, j11);
    }

    private final C1286b C() {
        int l10;
        v().b();
        if (w().length() > 0 && (l10 = l()) != -1) {
            T(l10);
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final C1286b E() {
        Integer m10;
        v().b();
        if (w().length() > 0 && (m10 = m()) != null) {
            T(m10.intValue());
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final C1286b F() {
        int q10;
        v().b();
        if (w().length() > 0 && (q10 = q()) != -1) {
            T(q10);
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final C1286b H() {
        Integer t10;
        v().b();
        if (w().length() > 0 && (t10 = t()) != null) {
            T(t10.intValue());
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private final int V() {
        return this.f4883d.b(Q.i(this.f4885f));
    }

    private final int W() {
        return this.f4883d.b(Q.k(this.f4885f));
    }

    private final int X() {
        return this.f4883d.b(Q.l(this.f4885f));
    }

    private final int a(int i10) {
        return m.h(i10, w().length() - 1);
    }

    private final int g(L l10, int i10) {
        return this.f4883d.a(l10.o(l10.q(i10), true));
    }

    static /* synthetic */ int h(C1286b bVar, L l10, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.W();
            }
            return bVar.g(l10, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEndByOffsetForLayout");
    }

    private final int j(L l10, int i10) {
        return this.f4883d.a(l10.u(l10.q(i10)));
    }

    static /* synthetic */ int k(C1286b bVar, L l10, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.X();
            }
            return bVar.j(l10, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineStartByOffsetForLayout");
    }

    private final int n(L l10, int i10) {
        while (i10 < this.f4880a.length()) {
            long C10 = l10.C(a(i10));
            if (Q.i(C10) > i10) {
                return this.f4883d.a(Q.i(C10));
            }
            i10++;
        }
        return this.f4880a.length();
    }

    static /* synthetic */ int o(C1286b bVar, L l10, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.V();
            }
            return bVar.n(l10, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextWordOffsetForLayout");
    }

    private final int r(L l10, int i10) {
        while (i10 > 0) {
            long C10 = l10.C(a(i10));
            if (Q.n(C10) < i10) {
                return this.f4883d.a(Q.n(C10));
            }
            i10--;
        }
        return 0;
    }

    static /* synthetic */ int s(C1286b bVar, L l10, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = bVar.V();
            }
            return bVar.r(l10, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrevWordOffset");
    }

    private final boolean x() {
        i iVar;
        L l10 = this.f4882c;
        if (l10 != null) {
            iVar = l10.y(V());
        } else {
            iVar = null;
        }
        if (iVar != i.Rtl) {
            return true;
        }
        return false;
    }

    private final int y(L l10, int i10) {
        int V10 = V();
        if (this.f4884e.a() == null) {
            this.f4884e.c(Float.valueOf(l10.e(V10).i()));
        }
        int q10 = l10.q(V10) + i10;
        if (q10 < 0) {
            return 0;
        }
        if (q10 >= l10.n()) {
            return w().length();
        }
        float m10 = l10.m(q10) - ((float) 1);
        Float a10 = this.f4884e.a();
        C6496s.e(a10);
        float floatValue = a10.floatValue();
        if ((x() && floatValue >= l10.t(q10)) || (!x() && floatValue <= l10.s(q10))) {
            return l10.o(q10, true);
        }
        return this.f4883d.a(l10.x(C2422h.a(a10.floatValue(), m10)));
    }

    public final C1286b A() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                F();
            } else {
                C();
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b B() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                H();
            } else {
                E();
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b D() {
        v().b();
        if (w().length() > 0) {
            int a10 = D.a(w(), Q.k(this.f4885f));
            if (a10 == Q.k(this.f4885f) && a10 != w().length()) {
                a10 = D.a(w(), a10 + 1);
            }
            T(a10);
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b G() {
        v().b();
        if (w().length() > 0) {
            int b10 = D.b(w(), Q.l(this.f4885f));
            if (b10 == Q.l(this.f4885f) && b10 != 0) {
                b10 = D.b(w(), b10 - 1);
            }
            T(b10);
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b I() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                C();
            } else {
                F();
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b J() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                E();
            } else {
                H();
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b K() {
        v().b();
        if (w().length() > 0) {
            T(w().length());
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b L() {
        v().b();
        if (w().length() > 0) {
            T(0);
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b M() {
        Integer f10;
        v().b();
        if (w().length() > 0 && (f10 = f()) != null) {
            T(f10.intValue());
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b N() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                P();
            } else {
                M();
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b O() {
        v().b();
        if (w().length() > 0) {
            if (x()) {
                M();
            } else {
                P();
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b P() {
        Integer i10;
        v().b();
        if (w().length() > 0 && (i10 = i()) != null) {
            T(i10.intValue());
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b Q() {
        L l10;
        if (w().length() > 0 && (l10 = this.f4882c) != null) {
            T(y(l10, -1));
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b R() {
        v().b();
        if (w().length() > 0) {
            U(0, w().length());
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b S() {
        if (w().length() > 0) {
            this.f4885f = S.b(Q.n(this.f4881b), Q.i(this.f4885f));
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    /* access modifiers changed from: protected */
    public final void T(int i10) {
        U(i10, i10);
    }

    /* access modifiers changed from: protected */
    public final void U(int i10, int i11) {
        this.f4885f = S.b(i10, i11);
    }

    public final C1286b b(C6798l lVar) {
        v().b();
        if (w().length() > 0) {
            if (Q.h(this.f4885f)) {
                C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseLeftOr$lambda$4");
                lVar.invoke(this);
            } else if (x()) {
                T(Q.l(this.f4885f));
            } else {
                T(Q.k(this.f4885f));
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b c(C6798l lVar) {
        v().b();
        if (w().length() > 0) {
            if (Q.h(this.f4885f)) {
                C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection.collapseRightOr$lambda$5");
                lVar.invoke(this);
            } else if (x()) {
                T(Q.k(this.f4885f));
            } else {
                T(Q.l(this.f4885f));
            }
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1286b d() {
        v().b();
        if (w().length() > 0) {
            T(Q.i(this.f4885f));
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public final C1321d e() {
        return this.f4886g;
    }

    public final Integer f() {
        L l10 = this.f4882c;
        if (l10 != null) {
            return Integer.valueOf(h(this, l10, 0, 1, (Object) null));
        }
        return null;
    }

    public final Integer i() {
        L l10 = this.f4882c;
        if (l10 != null) {
            return Integer.valueOf(k(this, l10, 0, 1, (Object) null));
        }
        return null;
    }

    public final int l() {
        return E.a(this.f4886g.j(), Q.i(this.f4885f));
    }

    public final Integer m() {
        L l10 = this.f4882c;
        if (l10 != null) {
            return Integer.valueOf(o(this, l10, 0, 1, (Object) null));
        }
        return null;
    }

    public final I p() {
        return this.f4883d;
    }

    public final int q() {
        return E.b(this.f4886g.j(), Q.i(this.f4885f));
    }

    public final Integer t() {
        L l10 = this.f4882c;
        if (l10 != null) {
            return Integer.valueOf(s(this, l10, 0, 1, (Object) null));
        }
        return null;
    }

    public final long u() {
        return this.f4885f;
    }

    public final J v() {
        return this.f4884e;
    }

    public final String w() {
        return this.f4886g.j();
    }

    public final C1286b z() {
        L l10;
        if (w().length() > 0 && (l10 = this.f4882c) != null) {
            T(y(l10, 1));
        }
        C6496s.f(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    private C1286b(C1321d dVar, long j10, L l10, I i10, J j11) {
        this.f4880a = dVar;
        this.f4881b = j10;
        this.f4882c = l10;
        this.f4883d = i10;
        this.f4884e = j11;
        this.f4885f = j10;
        this.f4886g = dVar;
    }
}
