package i1;

import f1.d;
import f1.i;
import i1.C2063e;
import j1.C2121b;
import j1.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: i1.f  reason: case insensitive filesystem */
public class C2064f extends C2072n {

    /* renamed from: W0  reason: collision with root package name */
    C2121b f21968W0 = new C2121b(this);

    /* renamed from: X0  reason: collision with root package name */
    public e f21969X0 = new e(this);

    /* renamed from: Y0  reason: collision with root package name */
    private int f21970Y0;

    /* renamed from: Z0  reason: collision with root package name */
    protected C2121b.C0361b f21971Z0 = null;

    /* renamed from: a1  reason: collision with root package name */
    private boolean f21972a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    protected d f21973b1 = new d();

    /* renamed from: c1  reason: collision with root package name */
    int f21974c1;

    /* renamed from: d1  reason: collision with root package name */
    int f21975d1;

    /* renamed from: e1  reason: collision with root package name */
    int f21976e1;

    /* renamed from: f1  reason: collision with root package name */
    int f21977f1;

    /* renamed from: g1  reason: collision with root package name */
    public int f21978g1 = 0;

    /* renamed from: h1  reason: collision with root package name */
    public int f21979h1 = 0;

    /* renamed from: i1  reason: collision with root package name */
    C2061c[] f21980i1 = new C2061c[4];

    /* renamed from: j1  reason: collision with root package name */
    C2061c[] f21981j1 = new C2061c[4];

    /* renamed from: k1  reason: collision with root package name */
    public boolean f21982k1 = false;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f21983l1 = false;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f21984m1 = false;

    /* renamed from: n1  reason: collision with root package name */
    public int f21985n1 = 0;

    /* renamed from: o1  reason: collision with root package name */
    public int f21986o1 = 0;

    /* renamed from: p1  reason: collision with root package name */
    private int f21987p1 = 257;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f21988q1 = false;

    /* renamed from: r1  reason: collision with root package name */
    private boolean f21989r1 = false;

    /* renamed from: s1  reason: collision with root package name */
    private boolean f21990s1 = false;

    /* renamed from: t1  reason: collision with root package name */
    int f21991t1 = 0;

    /* renamed from: u1  reason: collision with root package name */
    private WeakReference f21992u1 = null;

    /* renamed from: v1  reason: collision with root package name */
    private WeakReference f21993v1 = null;

    /* renamed from: w1  reason: collision with root package name */
    private WeakReference f21994w1 = null;

    /* renamed from: x1  reason: collision with root package name */
    private WeakReference f21995x1 = null;

    /* renamed from: y1  reason: collision with root package name */
    HashSet f21996y1 = new HashSet();

    /* renamed from: z1  reason: collision with root package name */
    public C2121b.a f21997z1 = new C2121b.a();

    private void C1(C2063e eVar) {
        int i10 = this.f21978g1 + 1;
        C2061c[] cVarArr = this.f21981j1;
        if (i10 >= cVarArr.length) {
            this.f21981j1 = (C2061c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f21981j1[this.f21978g1] = new C2061c(eVar, 0, V1());
        this.f21978g1++;
    }

    private void F1(C2062d dVar, i iVar) {
        this.f21973b1.h(iVar, this.f21973b1.q(dVar), 0, 5);
    }

    private void G1(C2062d dVar, i iVar) {
        this.f21973b1.h(this.f21973b1.q(dVar), iVar, 0, 5);
    }

    private void H1(C2063e eVar) {
        int i10 = this.f21979h1 + 1;
        C2061c[] cVarArr = this.f21980i1;
        if (i10 >= cVarArr.length) {
            this.f21980i1 = (C2061c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f21980i1[this.f21979h1] = new C2061c(eVar, 1, V1());
        this.f21979h1++;
    }

    public static boolean Y1(int i10, C2063e eVar, C2121b.C0361b bVar, C2121b.a aVar, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        if (bVar == null) {
            return false;
        }
        if (eVar.X() == 8 || (eVar instanceof C2066h) || (eVar instanceof C2059a)) {
            aVar.f22611e = 0;
            aVar.f22612f = 0;
            return false;
        }
        aVar.f22607a = eVar.C();
        aVar.f22608b = eVar.V();
        aVar.f22609c = eVar.Y();
        aVar.f22610d = eVar.z();
        aVar.f22615i = false;
        aVar.f22616j = i11;
        C2063e.b bVar2 = aVar.f22607a;
        C2063e.b bVar3 = C2063e.b.MATCH_CONSTRAINT;
        if (bVar2 == bVar3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (aVar.f22608b == bVar3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || eVar.f21921f0 <= 0.0f) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z11 || eVar.f21921f0 <= 0.0f) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10 && eVar.c0(0) && eVar.f21954w == 0 && !z12) {
            aVar.f22607a = C2063e.b.WRAP_CONTENT;
            if (z11 && eVar.f21956x == 0) {
                aVar.f22607a = C2063e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.c0(1) && eVar.f21956x == 0 && !z13) {
            aVar.f22608b = C2063e.b.WRAP_CONTENT;
            if (z10 && eVar.f21954w == 0) {
                aVar.f22608b = C2063e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.p0()) {
            aVar.f22607a = C2063e.b.FIXED;
            z10 = false;
        }
        if (eVar.q0()) {
            aVar.f22608b = C2063e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f21958y[0] == 4) {
                aVar.f22607a = C2063e.b.FIXED;
            } else if (!z11) {
                C2063e.b bVar4 = aVar.f22608b;
                C2063e.b bVar5 = C2063e.b.FIXED;
                if (bVar4 == bVar5) {
                    i13 = aVar.f22610d;
                } else {
                    aVar.f22607a = C2063e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i13 = aVar.f22612f;
                }
                aVar.f22607a = bVar5;
                aVar.f22609c = (int) (eVar.x() * ((float) i13));
            }
        }
        if (z13) {
            if (eVar.f21958y[1] == 4) {
                aVar.f22608b = C2063e.b.FIXED;
            } else if (!z10) {
                C2063e.b bVar6 = aVar.f22607a;
                C2063e.b bVar7 = C2063e.b.FIXED;
                if (bVar6 == bVar7) {
                    i12 = aVar.f22609c;
                } else {
                    aVar.f22608b = C2063e.b.WRAP_CONTENT;
                    bVar.b(eVar, aVar);
                    i12 = aVar.f22611e;
                }
                aVar.f22608b = bVar7;
                if (eVar.y() == -1) {
                    aVar.f22610d = (int) (((float) i12) / eVar.x());
                } else {
                    aVar.f22610d = (int) (eVar.x() * ((float) i12));
                }
            }
        }
        bVar.b(eVar, aVar);
        eVar.p1(aVar.f22611e);
        eVar.Q0(aVar.f22612f);
        eVar.P0(aVar.f22614h);
        eVar.F0(aVar.f22613g);
        aVar.f22616j = C2121b.a.f22604k;
        return aVar.f22615i;
    }

    private void a2() {
        this.f21978g1 = 0;
        this.f21979h1 = 0;
    }

    /* access modifiers changed from: package-private */
    public void A1(C2063e eVar, int i10) {
        if (i10 == 0) {
            C1(eVar);
        } else if (i10 == 1) {
            H1(eVar);
        }
    }

    public boolean B1(d dVar) {
        int i10;
        boolean Z12 = Z1(64);
        g(dVar, Z12);
        int size = this.f22048V0.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C2063e eVar = (C2063e) this.f22048V0.get(i11);
            eVar.X0(0, false);
            eVar.X0(1, false);
            if (eVar instanceof C2059a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                C2063e eVar2 = (C2063e) this.f22048V0.get(i12);
                if (eVar2 instanceof C2059a) {
                    ((C2059a) eVar2).D1();
                }
            }
        }
        this.f21996y1.clear();
        for (int i13 = 0; i13 < size; i13++) {
            C2063e eVar3 = (C2063e) this.f22048V0.get(i13);
            if (eVar3.f()) {
                if (eVar3 instanceof C2071m) {
                    this.f21996y1.add(eVar3);
                } else {
                    eVar3.g(dVar, Z12);
                }
            }
        }
        while (this.f21996y1.size() > 0) {
            int size2 = this.f21996y1.size();
            Iterator it = this.f21996y1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2071m mVar = (C2071m) ((C2063e) it.next());
                if (mVar.z1(this.f21996y1)) {
                    mVar.g(dVar, Z12);
                    this.f21996y1.remove(mVar);
                    break;
                }
            }
            if (size2 == this.f21996y1.size()) {
                Iterator it2 = this.f21996y1.iterator();
                while (it2.hasNext()) {
                    ((C2063e) it2.next()).g(dVar, Z12);
                }
                this.f21996y1.clear();
            }
        }
        if (d.f19616s) {
            HashSet hashSet = new HashSet();
            for (int i14 = 0; i14 < size; i14++) {
                C2063e eVar4 = (C2063e) this.f22048V0.get(i14);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            if (C() == C2063e.b.WRAP_CONTENT) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            e(this, dVar, hashSet, i10, false);
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                C2063e eVar5 = (C2063e) it3.next();
                C2069k.a(this, dVar, eVar5);
                eVar5.g(dVar, Z12);
            }
        } else {
            for (int i15 = 0; i15 < size; i15++) {
                C2063e eVar6 = (C2063e) this.f22048V0.get(i15);
                if (eVar6 instanceof C2064f) {
                    C2063e.b[] bVarArr = eVar6.f21913b0;
                    C2063e.b bVar = bVarArr[0];
                    C2063e.b bVar2 = bVarArr[1];
                    C2063e.b bVar3 = C2063e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.U0(C2063e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.l1(C2063e.b.FIXED);
                    }
                    eVar6.g(dVar, Z12);
                    if (bVar == bVar3) {
                        eVar6.U0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.l1(bVar2);
                    }
                } else {
                    C2069k.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, Z12);
                    }
                }
            }
        }
        if (this.f21978g1 > 0) {
            C2060b.b(this, dVar, (ArrayList) null, 0);
        }
        if (this.f21979h1 > 0) {
            C2060b.b(this, dVar, (ArrayList) null, 1);
        }
        return true;
    }

    public void D1(C2062d dVar) {
        WeakReference weakReference = this.f21995x1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((C2062d) this.f21995x1.get()).e()) {
            this.f21995x1 = new WeakReference(dVar);
        }
    }

    public void E1(C2062d dVar) {
        WeakReference weakReference = this.f21993v1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((C2062d) this.f21993v1.get()).e()) {
            this.f21993v1 = new WeakReference(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void I1(C2062d dVar) {
        WeakReference weakReference = this.f21994w1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((C2062d) this.f21994w1.get()).e()) {
            this.f21994w1 = new WeakReference(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void J1(C2062d dVar) {
        WeakReference weakReference = this.f21992u1;
        if (weakReference == null || weakReference.get() == null || dVar.e() > ((C2062d) this.f21992u1.get()).e()) {
            this.f21992u1 = new WeakReference(dVar);
        }
    }

    public boolean K1(boolean z10) {
        return this.f21969X0.f(z10);
    }

    public boolean L1(boolean z10) {
        return this.f21969X0.g(z10);
    }

    public boolean M1(boolean z10, int i10) {
        return this.f21969X0.h(z10, i10);
    }

    public void N1(f1.e eVar) {
        this.f21973b1.v(eVar);
    }

    public C2121b.C0361b O1() {
        return this.f21971Z0;
    }

    public int P1() {
        return this.f21987p1;
    }

    public void Q(StringBuilder sb2) {
        sb2.append(this.f21938o + ":{\n");
        sb2.append("  actualWidth:" + this.f21917d0);
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f21919e0);
        sb2.append("\n");
        Iterator it = w1().iterator();
        while (it.hasNext()) {
            ((C2063e) it.next()).Q(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }

    public d Q1() {
        return this.f21973b1;
    }

    public boolean R1() {
        return false;
    }

    public void S1() {
        this.f21969X0.j();
    }

    public void T1() {
        this.f21969X0.k();
    }

    public boolean U1() {
        return this.f21990s1;
    }

    public boolean V1() {
        return this.f21972a1;
    }

    public boolean W1() {
        return this.f21989r1;
    }

    public long X1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i17;
        this.f21974c1 = i19;
        int i20 = i18;
        this.f21975d1 = i20;
        return this.f21968W0.d(this, i10, i19, i20, i11, i12, i13, i14, i15, i16);
    }

    public boolean Z1(int i10) {
        if ((this.f21987p1 & i10) == i10) {
            return true;
        }
        return false;
    }

    public void b2(C2121b.C0361b bVar) {
        this.f21971Z0 = bVar;
        this.f21969X0.n(bVar);
    }

    public void c2(int i10) {
        this.f21987p1 = i10;
        d.f19616s = Z1(512);
    }

    public void d2(int i10) {
        this.f21970Y0 = i10;
    }

    public void e2(boolean z10) {
        this.f21972a1 = z10;
    }

    public boolean f2(d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean Z12 = Z1(64);
        v1(dVar, Z12);
        int size = this.f22048V0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C2063e eVar = (C2063e) this.f22048V0.get(i10);
            eVar.v1(dVar, Z12);
            if (eVar.e0()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void g2() {
        this.f21968W0.e(this);
    }

    public void u1(boolean z10, boolean z11) {
        super.u1(z10, z11);
        int size = this.f22048V0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C2063e) this.f22048V0.get(i10)).u1(z10, z11);
        }
    }

    public void v0() {
        this.f21973b1.E();
        this.f21974c1 = 0;
        this.f21976e1 = 0;
        this.f21975d1 = 0;
        this.f21977f1 = 0;
        this.f21988q1 = false;
        super.v0();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0310  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x1() {
        /*
            r18 = this;
            r1 = r18
            r2 = 0
            r1.f21925h0 = r2
            r1.f21927i0 = r2
            r1.f21989r1 = r2
            r1.f21990s1 = r2
            java.util.ArrayList r0 = r1.f22048V0
            int r3 = r0.size()
            int r0 = r18.Y()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r18.z()
            int r4 = java.lang.Math.max(r2, r4)
            i1.e$b[] r5 = r1.f21913b0
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f21970Y0
            if (r8 != 0) goto L_0x0084
            int r8 = r1.f21987p1
            boolean r8 = i1.C2069k.b(r8, r6)
            if (r8 == 0) goto L_0x0084
            j1.b$b r8 = r18.O1()
            j1.h.h(r1, r8)
            r8 = r2
        L_0x003c:
            if (r8 >= r3) goto L_0x0084
            java.util.ArrayList r9 = r1.f22048V0
            java.lang.Object r9 = r9.get(r8)
            i1.e r9 = (i1.C2063e) r9
            boolean r10 = r9.o0()
            if (r10 == 0) goto L_0x0081
            boolean r10 = r9 instanceof i1.C2066h
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof i1.C2059a
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9 instanceof i1.C2071m
            if (r10 != 0) goto L_0x0081
            boolean r10 = r9.n0()
            if (r10 != 0) goto L_0x0081
            i1.e$b r10 = r9.w(r2)
            i1.e$b r11 = r9.w(r6)
            i1.e$b r12 = i1.C2063e.b.MATCH_CONSTRAINT
            if (r10 != r12) goto L_0x0075
            int r10 = r9.f21954w
            if (r10 == r6) goto L_0x0075
            if (r11 != r12) goto L_0x0075
            int r10 = r9.f21956x
            if (r10 == r6) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            j1.b$a r10 = new j1.b$a
            r10.<init>()
            j1.b$b r11 = r1.f21971Z0
            int r12 = j1.C2121b.a.f22604k
            Y1(r2, r9, r11, r10, r12)
        L_0x0081:
            int r8 = r8 + 1
            goto L_0x003c
        L_0x0084:
            r8 = 2
            if (r3 <= r8) goto L_0x00cd
            i1.e$b r9 = i1.C2063e.b.WRAP_CONTENT
            if (r5 == r9) goto L_0x008d
            if (r7 != r9) goto L_0x00cd
        L_0x008d:
            int r10 = r1.f21987p1
            r11 = 1024(0x400, float:1.435E-42)
            boolean r10 = i1.C2069k.b(r10, r11)
            if (r10 == 0) goto L_0x00cd
            j1.b$b r10 = r18.O1()
            boolean r10 = j1.i.c(r1, r10)
            if (r10 == 0) goto L_0x00cd
            if (r5 != r9) goto L_0x00b5
            int r10 = r18.Y()
            if (r0 >= r10) goto L_0x00b1
            if (r0 <= 0) goto L_0x00b1
            r1.p1(r0)
            r1.f21989r1 = r6
            goto L_0x00b5
        L_0x00b1:
            int r0 = r18.Y()
        L_0x00b5:
            if (r7 != r9) goto L_0x00c9
            int r9 = r18.z()
            if (r4 >= r9) goto L_0x00c5
            if (r4 <= 0) goto L_0x00c5
            r1.Q0(r4)
            r1.f21990s1 = r6
            goto L_0x00c9
        L_0x00c5:
            int r4 = r18.z()
        L_0x00c9:
            r9 = r4
            r4 = r0
            r0 = r6
            goto L_0x00d0
        L_0x00cd:
            r9 = r4
            r4 = r0
            r0 = r2
        L_0x00d0:
            r10 = 64
            boolean r11 = r1.Z1(r10)
            if (r11 != 0) goto L_0x00e3
            r11 = 128(0x80, float:1.794E-43)
            boolean r11 = r1.Z1(r11)
            if (r11 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = r2
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            f1.d r12 = r1.f21973b1
            r12.f19631i = r2
            r12.f19632j = r2
            int r13 = r1.f21987p1
            if (r13 == 0) goto L_0x00f2
            if (r11 == 0) goto L_0x00f2
            r12.f19632j = r6
        L_0x00f2:
            java.util.ArrayList r11 = r1.f22048V0
            i1.e$b r12 = r18.C()
            i1.e$b r13 = i1.C2063e.b.WRAP_CONTENT
            if (r12 == r13) goto L_0x0105
            i1.e$b r12 = r18.V()
            if (r12 != r13) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r12 = r2
            goto L_0x0106
        L_0x0105:
            r12 = r6
        L_0x0106:
            r18.a2()
            r13 = r2
        L_0x010a:
            if (r13 >= r3) goto L_0x0120
            java.util.ArrayList r14 = r1.f22048V0
            java.lang.Object r14 = r14.get(r13)
            i1.e r14 = (i1.C2063e) r14
            boolean r15 = r14 instanceof i1.C2072n
            if (r15 == 0) goto L_0x011d
            i1.n r14 = (i1.C2072n) r14
            r14.x1()
        L_0x011d:
            int r13 = r13 + 1
            goto L_0x010a
        L_0x0120:
            boolean r10 = r1.Z1(r10)
            r13 = r0
            r0 = r2
            r14 = r6
        L_0x0127:
            if (r14 == 0) goto L_0x0317
            int r15 = r0 + 1
            f1.d r0 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            r0.E()     // Catch:{ Exception -> 0x014d }
            r18.a2()     // Catch:{ Exception -> 0x014d }
            f1.d r0 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            r1.o(r0)     // Catch:{ Exception -> 0x014d }
            r0 = r2
        L_0x0139:
            if (r0 >= r3) goto L_0x0150
            java.util.ArrayList r6 = r1.f22048V0     // Catch:{ Exception -> 0x014d }
            java.lang.Object r6 = r6.get(r0)     // Catch:{ Exception -> 0x014d }
            i1.e r6 = (i1.C2063e) r6     // Catch:{ Exception -> 0x014d }
            f1.d r2 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            r6.o(r2)     // Catch:{ Exception -> 0x014d }
            int r0 = r0 + 1
            r2 = 0
            r6 = 1
            goto L_0x0139
        L_0x014d:
            r0 = move-exception
            goto L_0x01db
        L_0x0150:
            f1.d r0 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            boolean r14 = r1.B1(r0)     // Catch:{ Exception -> 0x014d }
            java.lang.ref.WeakReference r0 = r1.f21992u1     // Catch:{ Exception -> 0x014d }
            r2 = 0
            if (r0 == 0) goto L_0x0176
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0176
            java.lang.ref.WeakReference r0 = r1.f21992u1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            i1.d r0 = (i1.C2062d) r0     // Catch:{ Exception -> 0x014d }
            f1.d r6 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            i1.d r8 = r1.f21898R     // Catch:{ Exception -> 0x014d }
            f1.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.G1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f21992u1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0176:
            java.lang.ref.WeakReference r0 = r1.f21994w1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x0195
            java.lang.ref.WeakReference r0 = r1.f21994w1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            i1.d r0 = (i1.C2062d) r0     // Catch:{ Exception -> 0x014d }
            f1.d r6 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            i1.d r8 = r1.f21902T     // Catch:{ Exception -> 0x014d }
            f1.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.F1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f21994w1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x0195:
            java.lang.ref.WeakReference r0 = r1.f21993v1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference r0 = r1.f21993v1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            i1.d r0 = (i1.C2062d) r0     // Catch:{ Exception -> 0x014d }
            f1.d r6 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            i1.d r8 = r1.f21896Q     // Catch:{ Exception -> 0x014d }
            f1.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.G1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f21993v1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01b4:
            java.lang.ref.WeakReference r0 = r1.f21995x1     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            if (r0 == 0) goto L_0x01d3
            java.lang.ref.WeakReference r0 = r1.f21995x1     // Catch:{ Exception -> 0x014d }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014d }
            i1.d r0 = (i1.C2062d) r0     // Catch:{ Exception -> 0x014d }
            f1.d r6 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            i1.d r8 = r1.f21900S     // Catch:{ Exception -> 0x014d }
            f1.i r6 = r6.q(r8)     // Catch:{ Exception -> 0x014d }
            r1.F1(r0, r6)     // Catch:{ Exception -> 0x014d }
            r1.f21995x1 = r2     // Catch:{ Exception -> 0x014d }
        L_0x01d3:
            if (r14 == 0) goto L_0x01f4
            f1.d r0 = r1.f21973b1     // Catch:{ Exception -> 0x014d }
            r0.A()     // Catch:{ Exception -> 0x014d }
            goto L_0x01f4
        L_0x01db:
            r0.printStackTrace()
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EXCEPTION : "
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r2.println(r0)
        L_0x01f4:
            if (r14 == 0) goto L_0x01ff
            f1.d r0 = r1.f21973b1
            boolean[] r2 = i1.C2069k.f22034a
            boolean r0 = r1.f2(r0, r2)
            goto L_0x0218
        L_0x01ff:
            f1.d r0 = r1.f21973b1
            r1.v1(r0, r10)
            r0 = 0
        L_0x0205:
            if (r0 >= r3) goto L_0x0217
            java.util.ArrayList r2 = r1.f22048V0
            java.lang.Object r2 = r2.get(r0)
            i1.e r2 = (i1.C2063e) r2
            f1.d r6 = r1.f21973b1
            r2.v1(r6, r10)
            int r0 = r0 + 1
            goto L_0x0205
        L_0x0217:
            r0 = 0
        L_0x0218:
            r2 = 8
            if (r12 == 0) goto L_0x0289
            if (r15 >= r2) goto L_0x0289
            boolean[] r6 = i1.C2069k.f22034a
            r8 = 2
            boolean r6 = r6[r8]
            if (r6 == 0) goto L_0x0289
            r6 = 0
            r8 = 0
            r14 = 0
        L_0x0228:
            if (r6 >= r3) goto L_0x0252
            java.util.ArrayList r2 = r1.f22048V0
            java.lang.Object r2 = r2.get(r6)
            i1.e r2 = (i1.C2063e) r2
            r16 = r0
            int r0 = r2.f21925h0
            int r17 = r2.Y()
            int r0 = r0 + r17
            int r14 = java.lang.Math.max(r14, r0)
            int r0 = r2.f21927i0
            int r2 = r2.z()
            int r0 = r0 + r2
            int r8 = java.lang.Math.max(r8, r0)
            int r6 = r6 + 1
            r0 = r16
            r2 = 8
            goto L_0x0228
        L_0x0252:
            r16 = r0
            int r0 = r1.f21939o0
            int r0 = java.lang.Math.max(r0, r14)
            int r2 = r1.f21941p0
            int r2 = java.lang.Math.max(r2, r8)
            i1.e$b r6 = i1.C2063e.b.WRAP_CONTENT
            if (r5 != r6) goto L_0x0275
            int r8 = r18.Y()
            if (r8 >= r0) goto L_0x0275
            r1.p1(r0)
            i1.e$b[] r0 = r1.f21913b0
            r8 = 0
            r0[r8] = r6
            r13 = 1
            r16 = 1
        L_0x0275:
            if (r7 != r6) goto L_0x028b
            int r0 = r18.z()
            if (r0 >= r2) goto L_0x028b
            r1.Q0(r2)
            i1.e$b[] r0 = r1.f21913b0
            r2 = 1
            r0[r2] = r6
            r13 = 1
            r16 = 1
            goto L_0x028b
        L_0x0289:
            r16 = r0
        L_0x028b:
            int r0 = r1.f21939o0
            int r2 = r18.Y()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.Y()
            if (r0 <= r2) goto L_0x02a8
            r1.p1(r0)
            i1.e$b[] r0 = r1.f21913b0
            i1.e$b r2 = i1.C2063e.b.FIXED
            r6 = 0
            r0[r6] = r2
            r13 = 1
            r16 = 1
        L_0x02a8:
            int r0 = r1.f21941p0
            int r2 = r18.z()
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = r18.z()
            if (r0 <= r2) goto L_0x02c6
            r1.Q0(r0)
            i1.e$b[] r0 = r1.f21913b0
            i1.e$b r2 = i1.C2063e.b.FIXED
            r6 = 1
            r0[r6] = r2
            r2 = r6
            r16 = r2
            goto L_0x02c8
        L_0x02c6:
            r6 = 1
            r2 = r13
        L_0x02c8:
            if (r2 != 0) goto L_0x0307
            i1.e$b[] r0 = r1.f21913b0
            r8 = 0
            r0 = r0[r8]
            i1.e$b r13 = i1.C2063e.b.WRAP_CONTENT
            if (r0 != r13) goto L_0x02e9
            if (r4 <= 0) goto L_0x02e9
            int r0 = r18.Y()
            if (r0 <= r4) goto L_0x02e9
            r1.f21989r1 = r6
            i1.e$b[] r0 = r1.f21913b0
            i1.e$b r2 = i1.C2063e.b.FIXED
            r0[r8] = r2
            r1.p1(r4)
            r2 = r6
            r16 = r2
        L_0x02e9:
            i1.e$b[] r0 = r1.f21913b0
            r0 = r0[r6]
            if (r0 != r13) goto L_0x0307
            if (r9 <= 0) goto L_0x0307
            int r0 = r18.z()
            if (r0 <= r9) goto L_0x0307
            r1.f21990s1 = r6
            i1.e$b[] r0 = r1.f21913b0
            i1.e$b r2 = i1.C2063e.b.FIXED
            r0[r6] = r2
            r1.Q0(r9)
            r0 = 8
            r2 = 1
            r13 = 1
            goto L_0x030c
        L_0x0307:
            r13 = r2
            r2 = r16
            r0 = 8
        L_0x030c:
            if (r15 <= r0) goto L_0x0310
            r14 = 0
            goto L_0x0311
        L_0x0310:
            r14 = r2
        L_0x0311:
            r0 = r15
            r2 = 0
            r6 = 1
            r8 = 2
            goto L_0x0127
        L_0x0317:
            r1.f22048V0 = r11
            if (r13 == 0) goto L_0x0323
            i1.e$b[] r0 = r1.f21913b0
            r2 = 0
            r0[r2] = r5
            r2 = 1
            r0[r2] = r7
        L_0x0323:
            f1.d r0 = r1.f21973b1
            f1.c r0 = r0.w()
            r1.z0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C2064f.x1():void");
    }
}
