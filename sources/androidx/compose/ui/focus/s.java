package androidx.compose.ui.focus;

import J0.C1231a0;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import J0.i0;
import a0.C1538b;
import androidx.compose.ui.focus.o;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6535s;
import p0.C2384a;
import p0.m;
import p0.p;
import p0.q;
import q0.C2423i;
import yf.C6787a;

public abstract class s {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13352a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f13353b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                p0.a[] r0 = p0.C2384a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                p0.a r2 = p0.C2384a.None     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                p0.a r3 = p0.C2384a.Redirected     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                p0.a r4 = p0.C2384a.Cancelled     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                p0.a r5 = p0.C2384a.RedirectCancelled     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f13352a = r0
                p0.m[] r0 = p0.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p0.m r5 = p0.m.Active     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                p0.m r1 = p0.m.Captured     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                p0.m r1 = p0.m.ActiveParent     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                p0.m r1 = p0.m.Inactive     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f13353b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f13354a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f13354a = focusTargetNode;
        }

        public final void invoke() {
            this.f13354a.q2();
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f13355a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FocusTargetNode focusTargetNode) {
            super(0);
            this.f13355a = focusTargetNode;
        }

        public final void invoke() {
            if (this.f13355a.v0().S1()) {
                p0.c.c(this.f13355a);
            }
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode f10 = t.f(focusTargetNode);
        if (f10 != null) {
            return c(f10, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(focusTargetNode, z10, z11);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int i10 = a.f13353b[focusTargetNode.s2().ordinal()];
        if (i10 == 1) {
            focusTargetNode.y2(m.Inactive);
            if (z11) {
                p0.c.c(focusTargetNode);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new C6535s();
                }
            } else if (!a(focusTargetNode, z10, z11)) {
                return false;
            } else {
                focusTargetNode.y2(m.Inactive);
                if (z11) {
                    p0.c.c(focusTargetNode);
                }
            }
        } else if (!z10) {
            return z10;
        } else {
            focusTargetNode.y2(m.Inactive);
            if (!z11) {
                return z10;
            }
            p0.c.c(focusTargetNode);
            return z10;
        }
        return true;
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        i0.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f13353b[focusTargetNode.s2().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        focusTargetNode.y2(m.Active);
        return true;
    }

    public static final C2384a e(FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.f13353b[focusTargetNode.s2().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return C2384a.Cancelled;
            }
            if (i11 == 3) {
                C2384a e10 = e(n(focusTargetNode), i10);
                if (e10 == C2384a.None) {
                    e10 = null;
                }
                if (e10 == null) {
                    return g(focusTargetNode, i10);
                }
                return e10;
            } else if (i11 != 4) {
                throw new C6535s();
            }
        }
        return C2384a.None;
    }

    private static final C2384a f(FocusTargetNode focusTargetNode, int i10) {
        C2384a aVar;
        if (!focusTargetNode.f13306o) {
            focusTargetNode.f13306o = true;
            try {
                o oVar = (o) focusTargetNode.q2().i().invoke(d.i(i10));
                o.a aVar2 = o.f13345b;
                if (oVar == aVar2.b()) {
                    focusTargetNode.f13306o = false;
                } else if (oVar == aVar2.a()) {
                    return C2384a.Cancelled;
                } else {
                    if (oVar.d()) {
                        aVar = C2384a.Redirected;
                    } else {
                        aVar = C2384a.RedirectCancelled;
                    }
                    focusTargetNode.f13306o = false;
                    return aVar;
                }
            } finally {
                focusTargetNode.f13306o = false;
            }
        }
        return C2384a.None;
    }

    private static final C2384a g(FocusTargetNode focusTargetNode, int i10) {
        C2384a aVar;
        if (!focusTargetNode.f13305n) {
            focusTargetNode.f13305n = true;
            try {
                o oVar = (o) focusTargetNode.q2().d().invoke(d.i(i10));
                o.a aVar2 = o.f13345b;
                if (oVar == aVar2.b()) {
                    focusTargetNode.f13305n = false;
                } else if (oVar == aVar2.a()) {
                    return C2384a.Cancelled;
                } else {
                    if (oVar.d()) {
                        aVar = C2384a.Redirected;
                    } else {
                        aVar = C2384a.RedirectCancelled;
                    }
                    focusTargetNode.f13305n = false;
                    return aVar;
                }
            } finally {
                focusTargetNode.f13305n = false;
            }
        }
        return C2384a.None;
    }

    public static final C2384a h(FocusTargetNode focusTargetNode, int i10) {
        C2384a aVar;
        FocusTargetNode focusTargetNode2;
        C1231a0 j02;
        int i11 = a.f13353b[focusTargetNode.s2().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return C2384a.None;
        }
        if (i11 == 3) {
            return e(n(focusTargetNode), i10);
        }
        if (i11 == 4) {
            int a10 = C1239e0.a(1024);
            if (focusTargetNode.v0().S1()) {
                i.c P12 = focusTargetNode.v0().P1();
                G m10 = C1245k.m(focusTargetNode);
                loop0:
                while (true) {
                    aVar = null;
                    if (m10 == null) {
                        focusTargetNode2 = null;
                        break;
                    }
                    if ((m10.j0().k().I1() & a10) != 0) {
                        while (P12 != null) {
                            if ((P12.N1() & a10) != 0) {
                                focusTargetNode2 = P12;
                                C1538b bVar = null;
                                while (focusTargetNode2 != null) {
                                    if (focusTargetNode2 instanceof FocusTargetNode) {
                                        break loop0;
                                    }
                                    if ((focusTargetNode2.N1() & a10) != 0 && (focusTargetNode2 instanceof C1247m)) {
                                        int i12 = 0;
                                        for (i.c m22 = ((C1247m) focusTargetNode2).m2(); m22 != null; m22 = m22.J1()) {
                                            if ((m22.N1() & a10) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    focusTargetNode2 = m22;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new C1538b(new i.c[16], 0);
                                                    }
                                                    if (focusTargetNode2 != null) {
                                                        bVar.b(focusTargetNode2);
                                                        focusTargetNode2 = null;
                                                    }
                                                    bVar.b(m22);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                        }
                                    }
                                    focusTargetNode2 = C1245k.g(bVar);
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
                FocusTargetNode focusTargetNode3 = focusTargetNode2;
                if (focusTargetNode3 == null) {
                    return C2384a.None;
                }
                int i13 = a.f13353b[focusTargetNode3.s2().ordinal()];
                if (i13 == 1) {
                    return f(focusTargetNode3, i10);
                }
                if (i13 == 2) {
                    return C2384a.Cancelled;
                }
                if (i13 == 3) {
                    return h(focusTargetNode3, i10);
                }
                if (i13 == 4) {
                    C2384a h10 = h(focusTargetNode3, i10);
                    if (h10 != C2384a.None) {
                        aVar = h10;
                    }
                    if (aVar == null) {
                        return f(focusTargetNode3, i10);
                    }
                    return aVar;
                }
                throw new C6535s();
            }
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        throw new C6535s();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d7, code lost:
        if (d(r11) != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f4, code lost:
        if (d(r11) != false) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            p0.m r0 = r11.s2()
            int[] r1 = androidx.compose.ui.focus.s.a.f13353b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x00f6
            r2 = 2
            if (r0 == r2) goto L_0x00f6
            r2 = 3
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L_0x00ea
            r2 = 4
            if (r0 != r2) goto L_0x00e4
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = J0.C1239e0.a(r0)
            k0.i$c r2 = r11.v0()
            boolean r2 = r2.S1()
            if (r2 == 0) goto L_0x00dc
            k0.i$c r2 = r11.v0()
            k0.i$c r2 = r2.P1()
            J0.G r5 = J0.C1245k.m(r11)
        L_0x0036:
            if (r5 == 0) goto L_0x00b5
            J0.a0 r6 = r5.j0()
            k0.i$c r6 = r6.k()
            int r6 = r6.I1()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00a2
        L_0x0047:
            if (r2 == 0) goto L_0x00a2
            int r6 = r2.N1()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x009d
            r6 = r2
            r7 = r3
        L_0x0052:
            if (r6 == 0) goto L_0x009d
            boolean r8 = r6 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r8 == 0) goto L_0x005a
            r3 = r6
            goto L_0x00b5
        L_0x005a:
            int r8 = r6.N1()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0098
            boolean r8 = r6 instanceof J0.C1247m
            if (r8 == 0) goto L_0x0098
            r8 = r6
            J0.m r8 = (J0.C1247m) r8
            k0.i$c r8 = r8.m2()
            r9 = r4
        L_0x006d:
            if (r8 == 0) goto L_0x0095
            int r10 = r8.N1()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0090
            int r9 = r9 + 1
            if (r9 != r1) goto L_0x007c
            r6 = r8
            goto L_0x0090
        L_0x007c:
            if (r7 != 0) goto L_0x0087
            a0.b r7 = new a0.b
            r10 = 16
            k0.i$c[] r10 = new k0.i.c[r10]
            r7.<init>(r10, r4)
        L_0x0087:
            if (r6 == 0) goto L_0x008d
            r7.b(r6)
            r6 = r3
        L_0x008d:
            r7.b(r8)
        L_0x0090:
            k0.i$c r8 = r8.J1()
            goto L_0x006d
        L_0x0095:
            if (r9 != r1) goto L_0x0098
            goto L_0x0052
        L_0x0098:
            k0.i$c r6 = J0.C1245k.g(r7)
            goto L_0x0052
        L_0x009d:
            k0.i$c r2 = r2.P1()
            goto L_0x0047
        L_0x00a2:
            J0.G r5 = r5.n0()
            if (r5 == 0) goto L_0x00b3
            J0.a0 r2 = r5.j0()
            if (r2 == 0) goto L_0x00b3
            k0.i$c r2 = r2.o()
            goto L_0x0036
        L_0x00b3:
            r2 = r3
            goto L_0x0036
        L_0x00b5:
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            if (r3 == 0) goto L_0x00cd
            p0.m r0 = r3.s2()
            boolean r1 = l(r3, r11)
            if (r1 == 0) goto L_0x00f6
            p0.m r2 = r3.s2()
            if (r0 == r2) goto L_0x00f6
            p0.c.c(r3)
            goto L_0x00f6
        L_0x00cd:
            boolean r0 = m(r11)
            if (r0 == 0) goto L_0x00da
            boolean r0 = d(r11)
            if (r0 == 0) goto L_0x00da
            goto L_0x00f6
        L_0x00da:
            r1 = r4
            goto L_0x00f6
        L_0x00dc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r11.<init>(r0)
            throw r11
        L_0x00e4:
            lf.s r11 = new lf.s
            r11.<init>()
            throw r11
        L_0x00ea:
            boolean r0 = b(r11, r4, r4, r2, r3)
            if (r0 == 0) goto L_0x00da
            boolean r0 = d(r11)
            if (r0 == 0) goto L_0x00da
        L_0x00f6:
            if (r1 == 0) goto L_0x00fb
            p0.c.c(r11)
        L_0x00fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.s.i(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        Boolean k10 = k(focusTargetNode, d.f13315b.b());
        if (k10 != null) {
            return k10.booleanValue();
        }
        return false;
    }

    public static final Boolean k(FocusTargetNode focusTargetNode, int i10) {
        Boolean bool;
        q d10 = p.d(focusTargetNode);
        c cVar = new c(focusTargetNode);
        try {
            if (d10.f25116c) {
                d10.g();
            }
            d10.f();
            d10.f25115b.b(cVar);
            int i11 = a.f13352a[h(focusTargetNode, i10).ordinal()];
            if (i11 == 1) {
                bool = Boolean.valueOf(i(focusTargetNode));
            } else if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new C6535s();
                    }
                }
                bool = null;
            } else {
                bool = Boolean.TRUE;
            }
            return bool;
        } finally {
            d10.h();
        }
    }

    private static final boolean l(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        FocusTargetNode focusTargetNode3;
        i.c cVar;
        C1231a0 j02;
        C1231a0 j03;
        int a10 = C1239e0.a(1024);
        if (focusTargetNode2.v0().S1()) {
            i.c P12 = focusTargetNode2.v0().P1();
            G m10 = C1245k.m(focusTargetNode2);
            loop0:
            while (true) {
                focusTargetNode3 = null;
                if (m10 == null) {
                    cVar = null;
                    break;
                }
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            cVar = P12;
                            C1538b bVar = null;
                            while (cVar != null) {
                                if (cVar instanceof FocusTargetNode) {
                                    break loop0;
                                }
                                if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
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
                if (m10 == null || (j03 = m10.j0()) == null) {
                    P12 = null;
                } else {
                    P12 = j03.o();
                }
            }
            if (C6496s.c(cVar, focusTargetNode)) {
                int i11 = a.f13353b[focusTargetNode.s2().ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            n(focusTargetNode);
                            if (b(focusTargetNode, false, false, 3, (Object) null) && d(focusTargetNode2)) {
                                return true;
                            }
                        } else if (i11 == 4) {
                            int a11 = C1239e0.a(1024);
                            if (focusTargetNode.v0().S1()) {
                                i.c P13 = focusTargetNode.v0().P1();
                                G m11 = C1245k.m(focusTargetNode);
                                loop4:
                                while (true) {
                                    if (m11 == null) {
                                        break;
                                    }
                                    if ((m11.j0().k().I1() & a11) != 0) {
                                        while (P13 != null) {
                                            if ((P13.N1() & a11) != 0) {
                                                i.c cVar2 = P13;
                                                C1538b bVar2 = null;
                                                while (cVar2 != null) {
                                                    if (cVar2 instanceof FocusTargetNode) {
                                                        focusTargetNode3 = cVar2;
                                                        break loop4;
                                                    }
                                                    if ((cVar2.N1() & a11) != 0 && (cVar2 instanceof C1247m)) {
                                                        int i12 = 0;
                                                        for (i.c m23 = ((C1247m) cVar2).m2(); m23 != null; m23 = m23.J1()) {
                                                            if ((m23.N1() & a11) != 0) {
                                                                i12++;
                                                                if (i12 == 1) {
                                                                    cVar2 = m23;
                                                                } else {
                                                                    if (bVar2 == null) {
                                                                        bVar2 = new C1538b(new i.c[16], 0);
                                                                    }
                                                                    if (cVar2 != null) {
                                                                        bVar2.b(cVar2);
                                                                        cVar2 = null;
                                                                    }
                                                                    bVar2.b(m23);
                                                                }
                                                            }
                                                        }
                                                        if (i12 == 1) {
                                                        }
                                                    }
                                                    cVar2 = C1245k.g(bVar2);
                                                }
                                                continue;
                                            }
                                            P13 = P13.P1();
                                        }
                                    }
                                    m11 = m11.n0();
                                    if (m11 == null || (j02 = m11.j0()) == null) {
                                        P13 = null;
                                    } else {
                                        P13 = j02.o();
                                    }
                                }
                                FocusTargetNode focusTargetNode4 = focusTargetNode3;
                                if (focusTargetNode4 == null && m(focusTargetNode)) {
                                    boolean d10 = d(focusTargetNode2);
                                    if (!d10) {
                                        return d10;
                                    }
                                    focusTargetNode.y2(m.ActiveParent);
                                    return d10;
                                } else if (focusTargetNode4 != null && l(focusTargetNode4, focusTargetNode)) {
                                    boolean l10 = l(focusTargetNode, focusTargetNode2);
                                    if (focusTargetNode.s2() != m.ActiveParent) {
                                        throw new IllegalStateException("Deactivated node is focused");
                                    } else if (!l10) {
                                        return l10;
                                    } else {
                                        p0.c.c(focusTargetNode4);
                                        return l10;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("visitAncestors called on an unattached node");
                            }
                        } else {
                            throw new C6535s();
                        }
                    }
                    return false;
                }
                boolean d11 = d(focusTargetNode2);
                if (!d11) {
                    return d11;
                }
                focusTargetNode.y2(m.ActiveParent);
                return d11;
            }
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    private static final boolean m(FocusTargetNode focusTargetNode) {
        return C1245k.n(focusTargetNode).getFocusOwner().j((d) null, (C2423i) null);
    }

    private static final FocusTargetNode n(FocusTargetNode focusTargetNode) {
        FocusTargetNode f10 = t.f(focusTargetNode);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
