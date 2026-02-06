package com.google.android.exoplayer2.source.dash;

import N9.A;
import N9.C3059h;
import N9.C3062k;
import N9.N;
import N9.T;
import N9.V;
import N9.r;
import P9.i;
import R9.c;
import R9.g;
import R9.j;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.amazon.a.a.o.b.f;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.revenuecat.purchases.common.Constants;
import ia.A;
import ia.C;
import ia.C3604b;
import ia.J;
import ja.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.C3717q0;
import k9.e1;
import l9.s0;
import o9.u;
import o9.v;

final class b implements r, N.a, i.b {

    /* renamed from: y  reason: collision with root package name */
    private static final Pattern f42835y = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: z  reason: collision with root package name */
    private static final Pattern f42836z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a  reason: collision with root package name */
    final int f42837a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0659a f42838b;

    /* renamed from: c  reason: collision with root package name */
    private final J f42839c;

    /* renamed from: d  reason: collision with root package name */
    private final v f42840d;

    /* renamed from: e  reason: collision with root package name */
    private final A f42841e;

    /* renamed from: f  reason: collision with root package name */
    private final Q9.b f42842f;

    /* renamed from: g  reason: collision with root package name */
    private final long f42843g;

    /* renamed from: h  reason: collision with root package name */
    private final C f42844h;

    /* renamed from: i  reason: collision with root package name */
    private final C3604b f42845i;

    /* renamed from: j  reason: collision with root package name */
    private final V f42846j;

    /* renamed from: k  reason: collision with root package name */
    private final a[] f42847k;

    /* renamed from: l  reason: collision with root package name */
    private final C3059h f42848l;

    /* renamed from: m  reason: collision with root package name */
    private final e f42849m;

    /* renamed from: n  reason: collision with root package name */
    private final IdentityHashMap f42850n = new IdentityHashMap();

    /* renamed from: o  reason: collision with root package name */
    private final A.a f42851o;

    /* renamed from: p  reason: collision with root package name */
    private final u.a f42852p;

    /* renamed from: q  reason: collision with root package name */
    private final s0 f42853q;

    /* renamed from: r  reason: collision with root package name */
    private r.a f42854r;

    /* renamed from: s  reason: collision with root package name */
    private i[] f42855s = F(0);

    /* renamed from: t  reason: collision with root package name */
    private d[] f42856t = new d[0];

    /* renamed from: u  reason: collision with root package name */
    private N f42857u;

    /* renamed from: v  reason: collision with root package name */
    private c f42858v;

    /* renamed from: w  reason: collision with root package name */
    private int f42859w;

    /* renamed from: x  reason: collision with root package name */
    private List f42860x;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f42861a;

        /* renamed from: b  reason: collision with root package name */
        public final int f42862b;

        /* renamed from: c  reason: collision with root package name */
        public final int f42863c;

        /* renamed from: d  reason: collision with root package name */
        public final int f42864d;

        /* renamed from: e  reason: collision with root package name */
        public final int f42865e;

        /* renamed from: f  reason: collision with root package name */
        public final int f42866f;

        /* renamed from: g  reason: collision with root package name */
        public final int f42867g;

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f42862b = i10;
            this.f42861a = iArr;
            this.f42863c = i11;
            this.f42865e = i12;
            this.f42866f = i13;
            this.f42867g = i14;
            this.f42864d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public b(int i10, c cVar, Q9.b bVar, int i11, a.C0659a aVar, J j10, v vVar, u.a aVar2, ia.A a10, A.a aVar3, long j11, C c10, C3604b bVar2, C3059h hVar, e.b bVar3, s0 s0Var) {
        C3604b bVar4 = bVar2;
        C3059h hVar2 = hVar;
        this.f42837a = i10;
        this.f42858v = cVar;
        this.f42842f = bVar;
        this.f42859w = i11;
        this.f42838b = aVar;
        this.f42839c = j10;
        this.f42840d = vVar;
        this.f42852p = aVar2;
        this.f42841e = a10;
        this.f42851o = aVar3;
        this.f42843g = j11;
        this.f42844h = c10;
        this.f42845i = bVar4;
        this.f42848l = hVar2;
        this.f42853q = s0Var;
        this.f42849m = new e(cVar, bVar3, bVar4);
        this.f42857u = hVar2.a(this.f42855s);
        g d10 = cVar.d(i11);
        List list = d10.f33791d;
        this.f42860x = list;
        Pair v10 = v(vVar, d10.f33790c, list);
        this.f42846j = (V) v10.first;
        this.f42847k = (a[]) v10.second;
    }

    private static int[][] A(List list) {
        int i10;
        R9.e w10;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i11 = 0; i11 < size; i11++) {
            sparseIntArray.put(((R9.a) list.get(i11)).f33743a, i11);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i11));
            arrayList.add(arrayList2);
            sparseArray.put(i11, arrayList2);
        }
        for (int i12 = 0; i12 < size; i12++) {
            R9.a aVar = (R9.a) list.get(i12);
            R9.e y10 = y(aVar.f33747e);
            if (y10 == null) {
                y10 = y(aVar.f33748f);
            }
            if (y10 == null || (i10 = sparseIntArray.get(Integer.parseInt(y10.f33781b), -1)) == -1) {
                i10 = i12;
            }
            if (i10 == i12 && (w10 = w(aVar.f33748f)) != null) {
                for (String parseInt : M.R0(w10.f33781b, f.f37529a)) {
                    int i13 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i13 != -1) {
                        i10 = Math.min(i10, i13);
                    }
                }
            }
            if (i10 != i12) {
                List list2 = (List) sparseArray.get(i12);
                List list3 = (List) sparseArray.get(i10);
                list3.addAll(list2);
                sparseArray.put(i12, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i14 = 0; i14 < size2; i14++) {
            int[] n10 = com.google.common.primitives.f.n((Collection) arrayList.get(i14));
            iArr[i14] = n10;
            Arrays.sort(n10);
        }
        return iArr;
    }

    private int B(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f42847k[i11].f42865e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f42847k[i14].f42863c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] C(ga.r[] rVarArr) {
        int[] iArr = new int[rVarArr.length];
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            ga.r rVar = rVarArr[i10];
            if (rVar != null) {
                iArr[i10] = this.f42846j.c(rVar.g());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean D(List list, int[] iArr) {
        for (int i10 : iArr) {
            List list2 = ((R9.a) list.get(i10)).f33745c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!((j) list2.get(i11)).f33806e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int i10, List list, int[][] iArr, boolean[] zArr, C3717q0[][] q0VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (D(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            C3717q0[] z10 = z(list, iArr[i12]);
            q0VarArr[i12] = z10;
            if (z10.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static i[] F(int i10) {
        return new i[i10];
    }

    private static C3717q0[] H(R9.e eVar, Pattern pattern, C3717q0 q0Var) {
        String str = eVar.f33781b;
        if (str == null) {
            return new C3717q0[]{q0Var};
        }
        String[] R02 = M.R0(str, ";");
        C3717q0[] q0VarArr = new C3717q0[R02.length];
        for (int i10 = 0; i10 < R02.length; i10++) {
            Matcher matcher = pattern.matcher(R02[i10]);
            if (!matcher.matches()) {
                return new C3717q0[]{q0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            C3717q0.b b10 = q0Var.b();
            q0VarArr[i10] = b10.S(q0Var.f45759a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + parseInt).F(parseInt).V(matcher.group(2)).E();
        }
        return q0VarArr;
    }

    private void J(ga.r[] rVarArr, boolean[] zArr, N9.M[] mArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            if (rVarArr[i10] == null || !zArr[i10]) {
                i iVar = mArr[i10];
                if (iVar instanceof i) {
                    iVar.Q(this);
                } else if (iVar instanceof i.a) {
                    ((i.a) iVar).b();
                }
                mArr[i10] = null;
            }
        }
    }

    private void K(ga.r[] rVarArr, N9.M[] mArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            N9.M m10 = mArr[i10];
            if ((m10 instanceof C3062k) || (m10 instanceof i.a)) {
                int B10 = B(i10, iArr);
                if (B10 == -1) {
                    z10 = mArr[i10] instanceof C3062k;
                } else {
                    i.a aVar = mArr[i10];
                    if (!(aVar instanceof i.a) || aVar.f33634a != mArr[B10]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
                if (!z10) {
                    i.a aVar2 = mArr[i10];
                    if (aVar2 instanceof i.a) {
                        aVar2.b();
                    }
                    mArr[i10] = null;
                }
            }
        }
    }

    private void L(ga.r[] rVarArr, N9.M[] mArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            ga.r rVar = rVarArr[i10];
            if (rVar != null) {
                i iVar = mArr[i10];
                if (iVar == null) {
                    zArr[i10] = true;
                    a aVar = this.f42847k[iArr[i10]];
                    int i11 = aVar.f42863c;
                    if (i11 == 0) {
                        mArr[i10] = u(aVar, rVar, j10);
                    } else if (i11 == 2) {
                        mArr[i10] = new d((R9.f) this.f42860x.get(aVar.f42864d), rVar.g().b(0), this.f42858v.f33756d);
                    }
                } else if (iVar instanceof i) {
                    ((a) iVar.E()).a(rVar);
                }
            }
        }
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            if (mArr[i12] == null && rVarArr[i12] != null) {
                a aVar2 = this.f42847k[iArr[i12]];
                if (aVar2.f42863c == 1) {
                    int B10 = B(i12, iArr);
                    if (B10 == -1) {
                        mArr[i12] = new C3062k();
                    } else {
                        mArr[i12] = mArr[B10].T(j10, aVar2.f42862b);
                    }
                }
            }
        }
    }

    private static void i(List list, T[] tArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            R9.f fVar = (R9.f) list.get(i11);
            C3717q0 E10 = new C3717q0.b().S(fVar.a()).e0("application/x-emsg").E();
            tArr[i10] = new T(fVar.a() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + i11, E10);
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int t(v vVar, List list, int[][] iArr, int i10, boolean[] zArr, C3717q0[][] q0VarArr, T[] tArr, a[] aVarArr) {
        String str;
        int i11;
        int i12;
        List list2 = list;
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int[] iArr2 = iArr[i14];
            ArrayList arrayList = new ArrayList();
            for (int i16 : iArr2) {
                arrayList.addAll(((R9.a) list2.get(i16)).f33745c);
            }
            int size = arrayList.size();
            C3717q0[] q0VarArr2 = new C3717q0[size];
            for (int i17 = 0; i17 < size; i17++) {
                C3717q0 q0Var = ((j) arrayList.get(i17)).f33803b;
                v vVar2 = vVar;
                q0VarArr2[i17] = q0Var.c(vVar.d(q0Var));
            }
            v vVar3 = vVar;
            R9.a aVar = (R9.a) list2.get(iArr2[0]);
            int i18 = aVar.f33743a;
            if (i18 != -1) {
                str = Integer.toString(i18);
            } else {
                str = "unset:" + i14;
            }
            int i19 = i15 + 1;
            if (zArr[i14]) {
                i11 = i15 + 2;
            } else {
                i11 = i19;
                i19 = -1;
            }
            if (q0VarArr[i14].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            tArr[i15] = new T(str, q0VarArr2);
            aVarArr[i15] = a.d(aVar.f33744b, iArr2, i15, i19, i11);
            if (i19 != -1) {
                String str2 = str + ":emsg";
                tArr[i19] = new T(str2, new C3717q0.b().S(str2).e0("application/x-emsg").E());
                aVarArr[i19] = a.b(iArr2, i15);
            }
            if (i11 != -1) {
                tArr[i11] = new T(str + ":cc", q0VarArr[i14]);
                aVarArr[i11] = a.a(iArr2, i15);
            }
            i14++;
            i15 = i12;
        }
        return i15;
    }

    private i u(a aVar, ga.r rVar, long j10) {
        boolean z10;
        int i10;
        T t10;
        boolean z11;
        T t11;
        int i11;
        a aVar2 = aVar;
        int i12 = aVar2.f42866f;
        if (i12 != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.c cVar = null;
        if (z10) {
            t10 = this.f42846j.b(i12);
            i10 = 1;
        } else {
            i10 = 0;
            t10 = null;
        }
        int i13 = aVar2.f42867g;
        if (i13 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            t11 = this.f42846j.b(i13);
            i10 += t11.f33189a;
        } else {
            t11 = null;
        }
        C3717q0[] q0VarArr = new C3717q0[i10];
        int[] iArr = new int[i10];
        if (z10) {
            q0VarArr[0] = t10.b(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < t11.f33189a; i14++) {
                C3717q0 b10 = t11.b(i14);
                q0VarArr[i11] = b10;
                iArr[i11] = 3;
                arrayList.add(b10);
                i11++;
            }
        }
        if (this.f42858v.f33756d && z10) {
            cVar = this.f42849m.k();
        }
        e.c cVar2 = cVar;
        e.c cVar3 = cVar2;
        i iVar = new i(aVar2.f42862b, iArr, q0VarArr, this.f42838b.a(this.f42844h, this.f42858v, this.f42842f, this.f42859w, aVar2.f42861a, rVar, aVar2.f42862b, this.f42843g, z10, arrayList, cVar2, this.f42839c, this.f42853q), this, this.f42845i, j10, this.f42840d, this.f42852p, this.f42841e, this.f42851o);
        synchronized (this) {
            this.f42850n.put(iVar, cVar3);
        }
        return iVar;
    }

    private static Pair v(v vVar, List list, List list2) {
        int[][] A10 = A(list);
        int length = A10.length;
        boolean[] zArr = new boolean[length];
        C3717q0[][] q0VarArr = new C3717q0[length][];
        int E10 = E(length, list, A10, zArr, q0VarArr) + length + list2.size();
        T[] tArr = new T[E10];
        a[] aVarArr = new a[E10];
        i(list2, tArr, aVarArr, t(vVar, list, A10, length, zArr, q0VarArr, tArr, aVarArr));
        return Pair.create(new V(tArr), aVarArr);
    }

    private static R9.e w(List list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static R9.e x(List list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            R9.e eVar = (R9.e) list.get(i10);
            if (str.equals(eVar.f33780a)) {
                return eVar;
            }
        }
        return null;
    }

    private static R9.e y(List list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    private static C3717q0[] z(List list, int[] iArr) {
        for (int i10 : iArr) {
            R9.a aVar = (R9.a) list.get(i10);
            List list2 = ((R9.a) list.get(i10)).f33746d;
            int i11 = 0;
            while (i11 < list2.size()) {
                R9.e eVar = (R9.e) list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f33780a)) {
                    return H(eVar, f42835y, new C3717q0.b().e0("application/cea-608").S(aVar.f33743a + ":cea608").E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f33780a)) {
                    return H(eVar, f42836z, new C3717q0.b().e0("application/cea-708").S(aVar.f33743a + ":cea708").E());
                } else {
                    i11++;
                }
            }
        }
        return new C3717q0[0];
    }

    /* renamed from: G */
    public void p(i iVar) {
        this.f42854r.p(this);
    }

    public void I() {
        this.f42849m.o();
        for (i Q10 : this.f42855s) {
            Q10.Q(this);
        }
        this.f42854r = null;
    }

    public void M(c cVar, int i10) {
        this.f42858v = cVar;
        this.f42859w = i10;
        this.f42849m.q(cVar);
        i[] iVarArr = this.f42855s;
        if (iVarArr != null) {
            for (i E10 : iVarArr) {
                ((a) E10.E()).c(cVar, i10);
            }
            this.f42854r.p(this);
        }
        this.f42860x = cVar.d(i10).f33791d;
        for (d dVar : this.f42856t) {
            Iterator it = this.f42860x.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                R9.f fVar = (R9.f) it.next();
                if (fVar.a().equals(dVar.a())) {
                    boolean z10 = true;
                    int e10 = cVar.e() - 1;
                    if (!cVar.f33756d || i10 != e10) {
                        z10 = false;
                    }
                    dVar.c(fVar, z10);
                }
            }
        }
    }

    public long a() {
        return this.f42857u.a();
    }

    public boolean b() {
        return this.f42857u.b();
    }

    public long c() {
        return this.f42857u.c();
    }

    public synchronized void e(i iVar) {
        e.c cVar = (e.c) this.f42850n.remove(iVar);
        if (cVar != null) {
            cVar.n();
        }
    }

    public void f(long j10) {
        this.f42857u.f(j10);
    }

    public long g(long j10) {
        for (i S10 : this.f42855s) {
            S10.S(j10);
        }
        for (d b10 : this.f42856t) {
            b10.b(j10);
        }
        return j10;
    }

    public long h() {
        return -9223372036854775807L;
    }

    public void j() {
        this.f42844h.e();
    }

    public long l(long j10, e1 e1Var) {
        for (i iVar : this.f42855s) {
            if (iVar.f33611a == 2) {
                return iVar.l(j10, e1Var);
            }
        }
        return j10;
    }

    public boolean m(long j10) {
        return this.f42857u.m(j10);
    }

    public V n() {
        return this.f42846j;
    }

    public void o(long j10, boolean z10) {
        for (i o10 : this.f42855s) {
            o10.o(j10, z10);
        }
    }

    public void r(r.a aVar, long j10) {
        this.f42854r = aVar;
        aVar.k(this);
    }

    public long s(ga.r[] rVarArr, boolean[] zArr, N9.M[] mArr, boolean[] zArr2, long j10) {
        int[] C10 = C(rVarArr);
        J(rVarArr, zArr, mArr);
        K(rVarArr, mArr, C10);
        L(rVarArr, mArr, zArr2, j10, C10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (i iVar : mArr) {
            if (iVar instanceof i) {
                arrayList.add(iVar);
            } else if (iVar instanceof d) {
                arrayList2.add((d) iVar);
            }
        }
        i[] F10 = F(arrayList.size());
        this.f42855s = F10;
        arrayList.toArray(F10);
        d[] dVarArr = new d[arrayList2.size()];
        this.f42856t = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f42857u = this.f42848l.a(this.f42855s);
        return j10;
    }
}
