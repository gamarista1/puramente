package p0;

import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import a0.C1538b;
import androidx.collection.L;
import androidx.collection.X;
import androidx.compose.ui.focus.FocusTargetNode;
import k0.i;
import kotlin.jvm.internal.C6494p;
import yf.C6787a;
import yf.C6798l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f25100a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f25101b;

    /* renamed from: c  reason: collision with root package name */
    private final L f25102c = X.a();

    /* renamed from: d  reason: collision with root package name */
    private final L f25103d = X.a();

    /* renamed from: e  reason: collision with root package name */
    private final L f25104e = X.a();

    /* renamed from: f  reason: collision with root package name */
    private final L f25105f = X.a();

    /* synthetic */ class a extends C6494p implements C6787a {
        a(Object obj) {
            super(0, obj, d.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        public final void invoke() {
            ((d) this.receiver).c();
        }
    }

    public d(C6798l lVar, C6787a aVar) {
        this.f25100a = lVar;
        this.f25101b = aVar;
    }

    /* access modifiers changed from: private */
    public final void c() {
        int i10;
        Object[] objArr;
        long[] jArr;
        Object[] objArr2;
        long[] jArr2;
        long[] jArr3;
        Object[] objArr3;
        l lVar;
        int i11;
        C1538b bVar;
        int i12;
        int i13;
        Object[] objArr4;
        long[] jArr4;
        boolean z10;
        boolean z11;
        Object[] objArr5;
        int i14;
        C1538b bVar2;
        long[] jArr5;
        int i15;
        long[] jArr6;
        long[] jArr7;
        int i16;
        long[] jArr8;
        long[] jArr9;
        L l10 = this.f25104e;
        Object[] objArr6 = l10.f12131b;
        long[] jArr10 = l10.f12130a;
        int length = jArr10.length - 2;
        char c10 = 7;
        long j10 = -9187201950435737472L;
        int i17 = 8;
        int i18 = 1;
        if (length >= 0) {
            int i19 = 0;
            while (true) {
                long j11 = jArr10[i19];
                if ((((~j11) << c10) & j11 & j10) != j10) {
                    int i20 = 8 - ((~(i19 - length)) >>> 31);
                    int i21 = 0;
                    while (i21 < i20) {
                        if ((j11 & 255) < 128) {
                            h hVar = (h) objArr6[(i19 << 3) + i21];
                            if (hVar.v0().S1()) {
                                int a10 = C1239e0.a(1024);
                                i.c v02 = hVar.v0();
                                C1538b bVar3 = null;
                                while (v02 != null) {
                                    if (v02 instanceof FocusTargetNode) {
                                        this.f25102c.h((FocusTargetNode) v02);
                                    } else if ((v02.N1() & a10) != 0 && (v02 instanceof C1247m)) {
                                        i.c m22 = ((C1247m) v02).m2();
                                        int i22 = 0;
                                        while (m22 != null) {
                                            if ((m22.N1() & a10) != 0) {
                                                i22++;
                                                if (i22 == i15) {
                                                    jArr9 = jArr6;
                                                    v02 = m22;
                                                } else {
                                                    if (bVar3 == null) {
                                                        jArr9 = jArr6;
                                                        bVar3 = new C1538b(new i.c[16], 0);
                                                    } else {
                                                        jArr9 = jArr6;
                                                    }
                                                    if (v02 != null) {
                                                        bVar3.b(v02);
                                                        v02 = null;
                                                    }
                                                    bVar3.b(m22);
                                                }
                                            } else {
                                                jArr9 = jArr6;
                                            }
                                            m22 = m22.J1();
                                            jArr6 = jArr9;
                                            i15 = 1;
                                        }
                                        jArr8 = jArr6;
                                        int i23 = i15;
                                        if (i22 == i23) {
                                            i15 = i23;
                                            jArr6 = jArr8;
                                        }
                                        v02 = C1245k.g(bVar3);
                                        jArr6 = jArr8;
                                        i15 = 1;
                                    }
                                    jArr8 = jArr6;
                                    v02 = C1245k.g(bVar3);
                                    jArr6 = jArr8;
                                    i15 = 1;
                                }
                                jArr7 = jArr6;
                                if (hVar.v0().S1()) {
                                    C1538b bVar4 = new C1538b(new i.c[16], 0);
                                    i.c J12 = hVar.v0().J1();
                                    if (J12 == null) {
                                        C1245k.c(bVar4, hVar.v0());
                                    } else {
                                        bVar4.b(J12);
                                    }
                                    while (bVar4.t()) {
                                        i.c cVar = (i.c) bVar4.y(bVar4.q() - 1);
                                        if ((cVar.I1() & a10) == 0) {
                                            C1245k.c(bVar4, cVar);
                                        } else {
                                            while (true) {
                                                if (cVar == null) {
                                                    break;
                                                } else if ((cVar.N1() & a10) != 0) {
                                                    C1538b bVar5 = null;
                                                    while (cVar != null) {
                                                        if (cVar instanceof FocusTargetNode) {
                                                            this.f25102c.h((FocusTargetNode) cVar);
                                                        } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                                            int i24 = 0;
                                                            for (i.c m23 = ((C1247m) cVar).m2(); m23 != null; m23 = m23.J1()) {
                                                                if ((m23.N1() & a10) != 0) {
                                                                    i24++;
                                                                    if (i24 == 1) {
                                                                        cVar = m23;
                                                                    } else {
                                                                        if (bVar5 == null) {
                                                                            bVar5 = new C1538b(new i.c[16], 0);
                                                                        }
                                                                        if (cVar != null) {
                                                                            bVar5.b(cVar);
                                                                            cVar = null;
                                                                        }
                                                                        bVar5.b(m23);
                                                                    }
                                                                }
                                                            }
                                                            if (i24 == 1) {
                                                            }
                                                        }
                                                        cVar = C1245k.g(bVar5);
                                                    }
                                                } else {
                                                    cVar = cVar.J1();
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            } else {
                                jArr7 = jArr6;
                            }
                            i16 = 8;
                        } else {
                            jArr7 = jArr6;
                            i16 = i17;
                        }
                        j11 >>= i16;
                        i21++;
                        i17 = i16;
                        jArr10 = jArr7;
                        i18 = 1;
                    }
                    jArr5 = jArr6;
                    if (i20 != i17) {
                        break;
                    }
                } else {
                    jArr5 = jArr10;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                jArr10 = jArr5;
                c10 = 7;
                j10 = -9187201950435737472L;
                i18 = 1;
                i17 = 8;
            }
        }
        this.f25104e.m();
        L l11 = this.f25103d;
        Object[] objArr7 = l11.f12131b;
        long[] jArr11 = l11.f12130a;
        int length2 = jArr11.length - 2;
        if (length2 >= 0) {
            int i25 = 0;
            while (true) {
                long j12 = jArr11[i25];
                if ((((~j12) << 7) & j12 & -9187201950435737472L) != -9187201950435737472L) {
                    int i26 = 8 - ((~(i25 - length2)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j12 & 255) < 128) {
                            b bVar6 = (b) objArr2[(i25 << 3) + i27];
                            if (!bVar6.v0().S1()) {
                                bVar6.m0(m.Inactive);
                            } else {
                                int a11 = C1239e0.a(1024);
                                i.c v03 = bVar6.v0();
                                boolean z12 = false;
                                boolean z13 = true;
                                FocusTargetNode focusTargetNode = null;
                                C1538b bVar7 = null;
                                while (v03 != null) {
                                    if (v03 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode2 = (FocusTargetNode) v03;
                                        if (focusTargetNode != null) {
                                            z12 = true;
                                        }
                                        if (this.f25102c.a(focusTargetNode2)) {
                                            this.f25105f.h(focusTargetNode2);
                                            z13 = false;
                                        }
                                        jArr4 = jArr2;
                                        objArr4 = objArr2;
                                        focusTargetNode = focusTargetNode2;
                                        v03 = C1245k.g(bVar7);
                                        jArr2 = jArr4;
                                        objArr2 = objArr4;
                                    } else {
                                        if ((v03.N1() & a11) == 0 || !(v03 instanceof C1247m)) {
                                            jArr4 = jArr2;
                                            objArr4 = objArr2;
                                            z10 = z12;
                                        } else {
                                            i.c m24 = ((C1247m) v03).m2();
                                            jArr4 = jArr2;
                                            int i28 = 0;
                                            while (m24 != null) {
                                                if ((m24.N1() & a11) != 0) {
                                                    i28++;
                                                    objArr5 = objArr2;
                                                    if (i28 == 1) {
                                                        v03 = m24;
                                                    } else {
                                                        if (bVar7 == null) {
                                                            i14 = i28;
                                                            z11 = z12;
                                                            bVar2 = new C1538b(new i.c[16], 0);
                                                        } else {
                                                            i14 = i28;
                                                            z11 = z12;
                                                            bVar2 = bVar7;
                                                        }
                                                        if (v03 != null) {
                                                            bVar2.b(v03);
                                                            v03 = null;
                                                        }
                                                        bVar2.b(m24);
                                                        bVar7 = bVar2;
                                                        i28 = i14;
                                                        m24 = m24.J1();
                                                        objArr2 = objArr5;
                                                        z12 = z11;
                                                    }
                                                } else {
                                                    objArr5 = objArr2;
                                                }
                                                z11 = z12;
                                                m24 = m24.J1();
                                                objArr2 = objArr5;
                                                z12 = z11;
                                            }
                                            objArr4 = objArr2;
                                            z10 = z12;
                                            if (i28 == 1) {
                                                jArr2 = jArr4;
                                                objArr2 = objArr4;
                                                z12 = z10;
                                            }
                                        }
                                        z12 = z10;
                                        v03 = C1245k.g(bVar7);
                                        jArr2 = jArr4;
                                        objArr2 = objArr4;
                                    }
                                }
                                jArr3 = jArr2;
                                objArr3 = objArr2;
                                boolean z14 = z12;
                                if (bVar6.v0().S1()) {
                                    C1538b bVar8 = new C1538b(new i.c[16], 0);
                                    i.c J13 = bVar6.v0().J1();
                                    if (J13 == null) {
                                        C1245k.c(bVar8, bVar6.v0());
                                    } else {
                                        bVar8.b(J13);
                                    }
                                    boolean z15 = z14;
                                    while (bVar8.t()) {
                                        i.c cVar2 = (i.c) bVar8.y(bVar8.q() - 1);
                                        if ((cVar2.I1() & a11) != 0) {
                                            while (true) {
                                                if (cVar2 == null) {
                                                    break;
                                                } else if ((cVar2.N1() & a11) != 0) {
                                                    C1538b bVar9 = null;
                                                    while (cVar2 != null) {
                                                        if (cVar2 instanceof FocusTargetNode) {
                                                            FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar2;
                                                            if (focusTargetNode != null) {
                                                                z15 = true;
                                                            }
                                                            if (this.f25102c.a(focusTargetNode3)) {
                                                                this.f25105f.h(focusTargetNode3);
                                                                z13 = false;
                                                            }
                                                            bVar = bVar8;
                                                            focusTargetNode = focusTargetNode3;
                                                        } else if ((cVar2.N1() & a11) == 0 || !(cVar2 instanceof C1247m)) {
                                                            bVar = bVar8;
                                                        } else {
                                                            i.c m25 = ((C1247m) cVar2).m2();
                                                            bVar = bVar8;
                                                            int i29 = 0;
                                                            while (m25 != null) {
                                                                if ((m25.N1() & a11) != 0) {
                                                                    i29++;
                                                                    i12 = a11;
                                                                    if (i29 == 1) {
                                                                        cVar2 = m25;
                                                                    } else {
                                                                        if (bVar9 == null) {
                                                                            i13 = i29;
                                                                            bVar9 = new C1538b(new i.c[16], 0);
                                                                        } else {
                                                                            i13 = i29;
                                                                        }
                                                                        if (cVar2 != null) {
                                                                            bVar9.b(cVar2);
                                                                            cVar2 = null;
                                                                        }
                                                                        bVar9.b(m25);
                                                                        i29 = i13;
                                                                        m25 = m25.J1();
                                                                        a11 = i12;
                                                                    }
                                                                } else {
                                                                    i12 = a11;
                                                                }
                                                                m25 = m25.J1();
                                                                a11 = i12;
                                                            }
                                                            i11 = a11;
                                                            if (i29 == 1) {
                                                                bVar8 = bVar;
                                                                a11 = i11;
                                                            }
                                                            cVar2 = C1245k.g(bVar9);
                                                            bVar8 = bVar;
                                                            a11 = i11;
                                                        }
                                                        i11 = a11;
                                                        cVar2 = C1245k.g(bVar9);
                                                        bVar8 = bVar;
                                                        a11 = i11;
                                                    }
                                                } else {
                                                    C1538b bVar10 = bVar8;
                                                    cVar2 = cVar2.J1();
                                                    a11 = a11;
                                                }
                                            }
                                        } else {
                                            C1245k.c(bVar8, cVar2);
                                        }
                                        bVar8 = bVar8;
                                        a11 = a11;
                                    }
                                    if (z13) {
                                        if (z15) {
                                            lVar = c.a(bVar6);
                                        } else if (focusTargetNode == null || (lVar = focusTargetNode.s2()) == null) {
                                            lVar = m.Inactive;
                                        }
                                        bVar6.m0(lVar);
                                    }
                                    j12 >>= 8;
                                    i27++;
                                    jArr11 = jArr3;
                                    objArr7 = objArr3;
                                } else {
                                    throw new IllegalStateException("visitChildren called on an unattached node");
                                }
                            }
                        }
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        j12 >>= 8;
                        i27++;
                        jArr11 = jArr3;
                        objArr7 = objArr3;
                    }
                    jArr = jArr2;
                    objArr = objArr2;
                    i10 = 0;
                    if (i26 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr11;
                    objArr = objArr7;
                    i10 = 0;
                }
                if (i25 == length2) {
                    break;
                }
                i25++;
                jArr11 = jArr;
                objArr7 = objArr;
            }
        } else {
            i10 = 0;
        }
        this.f25103d.m();
        L l12 = this.f25102c;
        Object[] objArr8 = l12.f12131b;
        long[] jArr12 = l12.f12130a;
        int length3 = jArr12.length - 2;
        if (length3 >= 0) {
            int i30 = i10;
            while (true) {
                long j13 = jArr12[i30];
                if ((((~j13) << 7) & j13 & -9187201950435737472L) != -9187201950435737472L) {
                    int i31 = 8 - ((~(i30 - length3)) >>> 31);
                    for (int i32 = i10; i32 < i31; i32++) {
                        if ((j13 & 255) < 128) {
                            FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr8[(i30 << 3) + i32];
                            if (focusTargetNode4.S1()) {
                                m s22 = focusTargetNode4.s2();
                                focusTargetNode4.x2();
                                if (s22 != focusTargetNode4.s2() || this.f25105f.a(focusTargetNode4)) {
                                    c.c(focusTargetNode4);
                                }
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i31 != 8) {
                        break;
                    }
                }
                if (i30 == length3) {
                    break;
                }
                i30++;
            }
        }
        this.f25102c.m();
        this.f25105f.m();
        this.f25101b.invoke();
        if (!this.f25104e.d()) {
            G0.a.b("Unprocessed FocusProperties nodes");
        }
        if (!this.f25103d.d()) {
            G0.a.b("Unprocessed FocusEvent nodes");
        }
        if (!this.f25102c.d()) {
            G0.a.b("Unprocessed FocusTarget nodes");
        }
    }

    private final void d(L l10, Object obj) {
        if (l10.h(obj) && this.f25102c.c() + this.f25103d.c() + this.f25104e.c() == 1) {
            this.f25100a.invoke(new a(this));
        }
    }

    public final boolean b() {
        if (this.f25102c.e() || this.f25104e.e() || this.f25103d.e()) {
            return true;
        }
        return false;
    }

    public final void e(FocusTargetNode focusTargetNode) {
        d(this.f25102c, focusTargetNode);
    }

    public final void f(b bVar) {
        d(this.f25103d, bVar);
    }

    public final void g(h hVar) {
        d(this.f25104e, hVar);
    }
}
