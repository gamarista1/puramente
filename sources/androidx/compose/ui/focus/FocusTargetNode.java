package androidx.compose.ui.focus;

import H0.C1184e;
import H0.C1185f;
import I0.h;
import J0.C1231a0;
import J0.C1239e0;
import J0.C1242h;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import J0.V;
import J0.h0;
import J0.i0;
import a0.C1538b;
import k0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.C6527k;
import lf.C6535s;
import p0.c;
import p0.m;
import p0.n;
import p0.p;
import p0.q;
import yf.C6787a;

public final class FocusTargetNode extends i.c implements C1242h, n, h0, h {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f13305n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f13306o;

    /* renamed from: p  reason: collision with root package name */
    private m f13307p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f13308q;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "LJ0/V;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "d", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "Llf/M;", "e", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetElement extends V {

        /* renamed from: b  reason: collision with root package name */
        public static final FocusTargetElement f13309b = new FocusTargetElement();

        private FocusTargetElement() {
        }

        /* renamed from: d */
        public FocusTargetNode a() {
            return new FocusTargetNode();
        }

        /* renamed from: e */
        public void b(FocusTargetNode focusTargetNode) {
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        public int hashCode() {
            return 1739042953;
        }
    }

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13310a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                p0.m[] r0 = p0.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.m r1 = p0.m.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                p0.m r1 = p0.m.Captured     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                p0.m r1 = p0.m.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                p0.m r1 = p0.m.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f13310a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ N f13311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f13312b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(N n10, FocusTargetNode focusTargetNode) {
            super(0);
            this.f13311a = n10;
            this.f13312b = focusTargetNode;
        }

        public final void invoke() {
            this.f13311a.f71759a = this.f13312b.q2();
        }
    }

    private final void t2() {
        m mVar;
        if (!w2(this)) {
            q d10 = p.d(this);
            try {
                if (d10.f25116c) {
                    d10.g();
                }
                d10.f();
                if (!v2(this) || !u2(this)) {
                    mVar = m.Inactive;
                } else {
                    mVar = m.ActiveParent;
                }
                y2(mVar);
                C6514M m10 = C6514M.f71813a;
                d10.h();
            } catch (Throwable th2) {
                d10.h();
                throw th2;
            }
        } else {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
    }

    private static final boolean u2(FocusTargetNode focusTargetNode) {
        int a10 = C1239e0.a(1024);
        if (!focusTargetNode.v0().S1()) {
            G0.a.b("visitSubtreeIf called on an unattached node");
        }
        C1538b bVar = new C1538b(new i.c[16], 0);
        i.c J12 = focusTargetNode.v0().J1();
        if (J12 == null) {
            C1245k.c(bVar, focusTargetNode.v0());
        } else {
            bVar.b(J12);
        }
        while (bVar.t()) {
            i.c cVar = (i.c) bVar.y(bVar.q() - 1);
            if ((cVar.I1() & a10) != 0) {
                for (i.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.J1()) {
                    if ((cVar2.N1() & a10) != 0) {
                        i.c cVar3 = cVar2;
                        C1538b bVar2 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar3;
                                if (w2(focusTargetNode2)) {
                                    int i10 = a.f13310a[focusTargetNode2.s2().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 == 4) {
                                        return false;
                                    }
                                    throw new C6535s();
                                }
                            } else if ((cVar3.N1() & a10) != 0 && (cVar3 instanceof C1247m)) {
                                int i11 = 0;
                                for (i.c m22 = ((C1247m) cVar3).m2(); m22 != null; m22 = m22.J1()) {
                                    if ((m22.N1() & a10) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar3 = m22;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new C1538b(new i.c[16], 0);
                                            }
                                            if (cVar3 != null) {
                                                bVar2.b(cVar3);
                                                cVar3 = null;
                                            }
                                            bVar2.b(m22);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVar3 = C1245k.g(bVar2);
                        }
                        continue;
                    }
                }
                continue;
            }
            C1245k.c(bVar, cVar);
        }
        return false;
    }

    private static final boolean v2(FocusTargetNode focusTargetNode) {
        C1231a0 j02;
        int a10 = C1239e0.a(1024);
        if (focusTargetNode.v0().S1()) {
            i.c P12 = focusTargetNode.v0().P1();
            G m10 = C1245k.m(focusTargetNode);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar = P12;
                            C1538b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar;
                                    if (w2(focusTargetNode2)) {
                                        int i10 = a.f13310a[focusTargetNode2.s2().ordinal()];
                                        if (i10 == 1 || i10 == 2) {
                                            return false;
                                        }
                                        if (i10 == 3) {
                                            return true;
                                        }
                                        if (i10 == 4) {
                                            return false;
                                        }
                                        throw new C6535s();
                                    }
                                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i11 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                cVar = m22;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new C1538b(new i.c[16], 0);
                                                }
                                                if (cVar != null) {
                                                    bVar.b(cVar);
                                                    cVar = null;
                                                }
                                                bVar.b(m22);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                cVar = C1245k.g(bVar);
                            }
                            continue;
                        }
                        P12 = P12.P1();
                    }
                }
                m10 = m10.n0();
                if (m10 == null || (j02 = m10.j0()) == null) {
                    P12 = null;
                } else {
                    P12 = j02.o();
                }
            }
            return false;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    private static final boolean w2(FocusTargetNode focusTargetNode) {
        if (focusTargetNode.f13307p != null) {
            return true;
        }
        return false;
    }

    public void A0() {
        m s22 = s2();
        x2();
        if (s22 != s2()) {
            c.c(this);
        }
    }

    public boolean Q1() {
        return this.f13308q;
    }

    public void W1() {
        int i10 = a.f13310a[s2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C1245k.n(this).getFocusOwner().l(true, true, false, d.f13315b.c());
            p.c(this);
        } else if (i10 == 3) {
            q d10 = p.d(this);
            try {
                if (d10.f25116c) {
                    d10.g();
                }
                d10.f();
                y2(m.Inactive);
                C6514M m10 = C6514M.f71813a;
                d10.h();
            } catch (Throwable th2) {
                d10.h();
                throw th2;
            }
        }
        this.f13307p = null;
    }

    public final void p2() {
        m i10 = p.d(this).i(this);
        if (i10 != null) {
            this.f13307p = i10;
        } else {
            G0.a.c("committing a node that was not updated in the current transaction");
            throw new C6527k();
        }
    }

    public final k q2() {
        C1231a0 j02;
        l lVar = new l();
        int a10 = C1239e0.a(2048);
        int a11 = C1239e0.a(1024);
        i.c v02 = v0();
        int i10 = a10 | a11;
        if (v0().S1()) {
            i.c v03 = v0();
            G m10 = C1245k.m(this);
            loop0:
            while (m10 != null) {
                if ((m10.j0().k().I1() & i10) != 0) {
                    while (v03 != null) {
                        if ((v03.N1() & i10) != 0) {
                            if (v03 != v02 && (v03.N1() & a11) != 0) {
                                break loop0;
                            } else if ((v03.N1() & a10) != 0) {
                                i.c cVar = v03;
                                C1538b bVar = null;
                                while (cVar != null) {
                                    if (cVar instanceof p0.h) {
                                        ((p0.h) cVar).b1(lVar);
                                    } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                        int i11 = 0;
                                        for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                            if ((m22.N1() & a10) != 0) {
                                                i11++;
                                                if (i11 == 1) {
                                                    cVar = m22;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new C1538b(new i.c[16], 0);
                                                    }
                                                    if (cVar != null) {
                                                        bVar.b(cVar);
                                                        cVar = null;
                                                    }
                                                    bVar.b(m22);
                                                }
                                            }
                                        }
                                        if (i11 == 1) {
                                        }
                                    }
                                    cVar = C1245k.g(bVar);
                                }
                            }
                        }
                        v03 = v03.P1();
                    }
                }
                m10 = m10.n0();
                if (m10 == null || (j02 = m10.j0()) == null) {
                    v03 = null;
                } else {
                    v03 = j02.o();
                }
            }
            return lVar;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public final C1184e r2() {
        return (C1184e) a(C1185f.a());
    }

    public m s2() {
        m i10;
        q a10 = p.b(this);
        if (a10 != null && (i10 = a10.i(this)) != null) {
            return i10;
        }
        m mVar = this.f13307p;
        if (mVar == null) {
            return m.Inactive;
        }
        return mVar;
    }

    public final void x2() {
        k kVar;
        if (this.f13307p == null) {
            t2();
        }
        int i10 = a.f13310a[s2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            N n10 = new N();
            i0.a(this, new b(n10, this));
            Object obj = n10.f71759a;
            if (obj == null) {
                C6496s.v("focusProperties");
                kVar = null;
            } else {
                kVar = (k) obj;
            }
            if (!kVar.j()) {
                C1245k.n(this).getFocusOwner().r(true);
            }
        }
    }

    public void y2(m mVar) {
        p.d(this).j(this, mVar);
    }
}
