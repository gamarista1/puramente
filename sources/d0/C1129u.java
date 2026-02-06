package D0;

import D0.C1127s;
import J0.A0;
import J0.B0;
import J0.C0;
import J0.C1242h;
import J0.C1243i;
import J0.s0;
import androidx.compose.ui.platform.C1644k0;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.N;
import lf.C6514M;
import yf.C6798l;

/* renamed from: D0.u  reason: case insensitive filesystem */
public final class C1129u extends i.c implements B0, s0, C1242h {

    /* renamed from: n  reason: collision with root package name */
    private final String f1499n = "androidx.compose.ui.input.pointer.PointerHoverIcon";

    /* renamed from: o  reason: collision with root package name */
    private C1130v f1500o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1501p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f1502q;

    /* renamed from: D0.u$a */
    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f1503a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N n10) {
            super(1);
            this.f1503a = n10;
        }

        /* renamed from: a */
        public final Boolean invoke(C1129u uVar) {
            if (this.f1503a.f71759a == null && uVar.f1502q) {
                this.f1503a.f71759a = uVar;
            } else if (this.f1503a.f71759a != null && uVar.t2() && uVar.f1502q) {
                this.f1503a.f71759a = uVar;
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: D0.u$b */
    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ J f1504a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(J j10) {
            super(1);
            this.f1504a = j10;
        }

        /* renamed from: a */
        public final A0 invoke(C1129u uVar) {
            if (!uVar.f1502q) {
                return A0.ContinueTraversal;
            }
            this.f1504a.f71755a = false;
            return A0.CancelTraversal;
        }
    }

    /* renamed from: D0.u$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f1505a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(N n10) {
            super(1);
            this.f1505a = n10;
        }

        /* renamed from: a */
        public final A0 invoke(C1129u uVar) {
            A0 a02 = A0.ContinueTraversal;
            if (!uVar.f1502q) {
                return a02;
            }
            this.f1505a.f71759a = uVar;
            if (uVar.t2()) {
                return A0.SkipSubtreeAndContinueTraversal;
            }
            return a02;
        }
    }

    /* renamed from: D0.u$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f1506a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(N n10) {
            super(1);
            this.f1506a = n10;
        }

        /* renamed from: a */
        public final Boolean invoke(C1129u uVar) {
            if (uVar.t2() && uVar.f1502q) {
                this.f1506a.f71759a = uVar;
            }
            return Boolean.TRUE;
        }
    }

    public C1129u(C1130v vVar, boolean z10) {
        this.f1500o = vVar;
        this.f1501p = z10;
    }

    private final void m2() {
        x u22 = u2();
        if (u22 != null) {
            u22.a((C1130v) null);
        }
    }

    private final void n2() {
        C1130v vVar;
        C1129u s22 = s2();
        if (s22 == null || (vVar = s22.f1500o) == null) {
            vVar = this.f1500o;
        }
        x u22 = u2();
        if (u22 != null) {
            u22.a(vVar);
        }
    }

    private final void o2() {
        C6514M m10;
        N n10 = new N();
        C0.d(this, new a(n10));
        C1129u uVar = (C1129u) n10.f71759a;
        if (uVar != null) {
            uVar.n2();
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            m2();
        }
    }

    private final void p2() {
        C1129u uVar;
        if (this.f1502q) {
            if (this.f1501p || (uVar = r2()) == null) {
                uVar = this;
            }
            uVar.n2();
        }
    }

    private final void q2() {
        J j10 = new J();
        j10.f71755a = true;
        if (!this.f1501p) {
            C0.f(this, new b(j10));
        }
        if (j10.f71755a) {
            n2();
        }
    }

    private final C1129u r2() {
        N n10 = new N();
        C0.f(this, new c(n10));
        return (C1129u) n10.f71759a;
    }

    private final C1129u s2() {
        N n10 = new N();
        C0.d(this, new d(n10));
        return (C1129u) n10.f71759a;
    }

    private final x u2() {
        return (x) C1243i.a(this, C1644k0.l());
    }

    private final void w2() {
        this.f1502q = true;
        q2();
    }

    private final void x2() {
        if (this.f1502q) {
            this.f1502q = false;
            if (S1()) {
                o2();
            }
        }
    }

    public void C0(C1124o oVar, C1126q qVar, long j10) {
        if (qVar == C1126q.Main) {
            int f10 = oVar.f();
            C1127s.a aVar = C1127s.f1491a;
            if (C1127s.i(f10, aVar.a())) {
                w2();
            } else if (C1127s.i(oVar.f(), aVar.b())) {
                x2();
            }
        }
    }

    public void W1() {
        x2();
        super.W1();
    }

    public void i1() {
        x2();
    }

    public final boolean t2() {
        return this.f1501p;
    }

    /* renamed from: v2 */
    public String L() {
        return this.f1499n;
    }

    public final void y2(C1130v vVar) {
        if (!C6496s.c(this.f1500o, vVar)) {
            this.f1500o = vVar;
            if (this.f1502q) {
                q2();
            }
        }
    }

    public final void z2(boolean z10) {
        if (this.f1501p != z10) {
            this.f1501p = z10;
            if (z10) {
                if (this.f1502q) {
                    n2();
                }
            } else if (this.f1502q) {
                p2();
            }
        }
    }
}
