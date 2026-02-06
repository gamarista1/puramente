package J0;

import G0.a;
import k0.i;
import kotlin.jvm.internal.C6496s;

/* renamed from: J0.m  reason: case insensitive filesystem */
public abstract class C1247m extends i.c {

    /* renamed from: n  reason: collision with root package name */
    private final int f3892n = f0.g(this);

    /* renamed from: o  reason: collision with root package name */
    private i.c f3893o;

    private final void p2(int i10, boolean z10) {
        int i11;
        i.c J12;
        int N12 = N1();
        f2(i10);
        if (N12 != i10) {
            if (C1245k.f(this)) {
                b2(i10);
            }
            if (S1()) {
                i.c v02 = v0();
                i.c cVar = this;
                while (cVar != null) {
                    i10 |= cVar.N1();
                    cVar.f2(i10);
                    if (cVar == v02) {
                        break;
                    }
                    cVar = cVar.P1();
                }
                if (z10 && cVar == v02) {
                    i10 = f0.h(v02);
                    v02.f2(i10);
                }
                if (cVar == null || (J12 = cVar.J1()) == null) {
                    i11 = 0;
                } else {
                    i11 = J12.I1();
                }
                int i12 = i10 | i11;
                while (cVar != null) {
                    i12 |= cVar.N1();
                    cVar.b2(i12);
                    cVar = cVar.P1();
                }
            }
        }
    }

    private final void q2(int i10, i.c cVar) {
        int N12 = N1();
        if ((i10 & C1239e0.a(2)) != 0 && (C1239e0.a(2) & N12) != 0 && !(this instanceof B)) {
            a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar);
        }
    }

    public void T1() {
        super.T1();
        for (i.c m22 = m2(); m22 != null; m22 = m22.J1()) {
            m22.k2(K1());
            if (!m22.S1()) {
                m22.T1();
            }
        }
    }

    public void U1() {
        for (i.c m22 = m2(); m22 != null; m22 = m22.J1()) {
            m22.U1();
        }
        super.U1();
    }

    public void Y1() {
        super.Y1();
        for (i.c m22 = m2(); m22 != null; m22 = m22.J1()) {
            m22.Y1();
        }
    }

    public void Z1() {
        for (i.c m22 = m2(); m22 != null; m22 = m22.J1()) {
            m22.Z1();
        }
        super.Z1();
    }

    public void a2() {
        super.a2();
        for (i.c m22 = m2(); m22 != null; m22 = m22.J1()) {
            m22.a2();
        }
    }

    public void c2(i.c cVar) {
        super.c2(cVar);
        for (i.c m22 = m2(); m22 != null; m22 = m22.J1()) {
            m22.c2(cVar);
        }
    }

    public void k2(C1235c0 c0Var) {
        super.k2(c0Var);
        for (i.c m22 = m2(); m22 != null; m22 = m22.J1()) {
            m22.k2(c0Var);
        }
    }

    /* access modifiers changed from: protected */
    public final C1244j l2(C1244j jVar) {
        i.c cVar;
        i.c v02 = jVar.v0();
        i.c cVar2 = null;
        if (v02 != jVar) {
            if (jVar instanceof i.c) {
                cVar = (i.c) jVar;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar2 = cVar.P1();
            }
            if (v02 == v0() && C6496s.c(cVar2, this)) {
                return jVar;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (v02.S1()) {
            a.b("Cannot delegate to an already attached node");
        }
        v02.c2(v0());
        int N12 = N1();
        int h10 = f0.h(v02);
        v02.f2(h10);
        q2(h10, v02);
        v02.d2(this.f3893o);
        this.f3893o = v02;
        v02.h2(this);
        p2(N1() | h10, false);
        if (S1()) {
            if ((h10 & C1239e0.a(2)) == 0 || (N12 & C1239e0.a(2)) != 0) {
                k2(K1());
            } else {
                C1231a0 j02 = C1245k.m(this).j0();
                v0().k2((C1235c0) null);
                j02.C();
            }
            v02.T1();
            v02.Z1();
            f0.a(v02);
        }
        return jVar;
    }

    public final i.c m2() {
        return this.f3893o;
    }

    public final int n2() {
        return this.f3892n;
    }

    /* access modifiers changed from: protected */
    public final void o2(C1244j jVar) {
        i.c cVar = null;
        for (i.c cVar2 = this.f3893o; cVar2 != null; cVar2 = cVar2.J1()) {
            if (cVar2 == jVar) {
                if (cVar2.S1()) {
                    f0.d(cVar2);
                    cVar2.a2();
                    cVar2.U1();
                }
                cVar2.c2(cVar2);
                cVar2.b2(0);
                if (cVar == null) {
                    this.f3893o = cVar2.J1();
                } else {
                    cVar.d2(cVar2.J1());
                }
                cVar2.d2((i.c) null);
                cVar2.h2((i.c) null);
                int N12 = N1();
                int h10 = f0.h(this);
                p2(h10, true);
                if (S1() && (N12 & C1239e0.a(2)) != 0 && (C1239e0.a(2) & h10) == 0) {
                    C1231a0 j02 = C1245k.m(this).j0();
                    v0().k2((C1235c0) null);
                    j02.C();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + jVar).toString());
    }
}
