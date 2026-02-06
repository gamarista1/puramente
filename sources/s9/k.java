package S9;

import D9.a;
import N9.A;
import N9.C3059h;
import N9.N;
import N9.T;
import N9.V;
import N9.r;
import S9.p;
import T9.h;
import T9.l;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.primitives.f;
import com.revenuecat.purchases.common.Constants;
import ia.A;
import ia.C3604b;
import ia.J;
import ja.C3645a;
import ja.M;
import ja.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k9.C3717q0;
import k9.e1;
import l9.s0;
import o9.m;
import o9.u;
import o9.v;

public final class k implements r, p.b, l.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f34034a;

    /* renamed from: b  reason: collision with root package name */
    private final l f34035b;

    /* renamed from: c  reason: collision with root package name */
    private final g f34036c;

    /* renamed from: d  reason: collision with root package name */
    private final J f34037d;

    /* renamed from: e  reason: collision with root package name */
    private final v f34038e;

    /* renamed from: f  reason: collision with root package name */
    private final u.a f34039f;

    /* renamed from: g  reason: collision with root package name */
    private final A f34040g;

    /* renamed from: h  reason: collision with root package name */
    private final A.a f34041h;

    /* renamed from: i  reason: collision with root package name */
    private final C3604b f34042i;

    /* renamed from: j  reason: collision with root package name */
    private final IdentityHashMap f34043j = new IdentityHashMap();

    /* renamed from: k  reason: collision with root package name */
    private final s f34044k = new s();

    /* renamed from: l  reason: collision with root package name */
    private final C3059h f34045l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f34046m;

    /* renamed from: n  reason: collision with root package name */
    private final int f34047n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f34048o;

    /* renamed from: p  reason: collision with root package name */
    private final s0 f34049p;

    /* renamed from: q  reason: collision with root package name */
    private r.a f34050q;

    /* renamed from: r  reason: collision with root package name */
    private int f34051r;

    /* renamed from: s  reason: collision with root package name */
    private V f34052s;

    /* renamed from: t  reason: collision with root package name */
    private p[] f34053t = new p[0];

    /* renamed from: u  reason: collision with root package name */
    private p[] f34054u = new p[0];

    /* renamed from: v  reason: collision with root package name */
    private int[][] f34055v = new int[0][];

    /* renamed from: w  reason: collision with root package name */
    private int f34056w;

    /* renamed from: x  reason: collision with root package name */
    private N f34057x;

    public k(h hVar, l lVar, g gVar, J j10, v vVar, u.a aVar, ia.A a10, A.a aVar2, C3604b bVar, C3059h hVar2, boolean z10, int i10, boolean z11, s0 s0Var) {
        this.f34034a = hVar;
        this.f34035b = lVar;
        this.f34036c = gVar;
        this.f34037d = j10;
        this.f34038e = vVar;
        this.f34039f = aVar;
        this.f34040g = a10;
        this.f34041h = aVar2;
        this.f34042i = bVar;
        this.f34045l = hVar2;
        this.f34046m = z10;
        this.f34047n = i10;
        this.f34048o = z11;
        this.f34049p = s0Var;
        this.f34057x = hVar2.a(new N[0]);
    }

    private void t(long j10, List list, List list2, List list3, Map map) {
        boolean z10;
        List list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = ((h.a) list4.get(i10)).f34324d;
            if (!hashSet.add(str)) {
                List list5 = list2;
                List list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z11 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (M.c(str, ((h.a) list4.get(i11)).f34324d)) {
                        h.a aVar = (h.a) list4.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f34321a);
                        arrayList2.add(aVar.f34322b);
                        if (M.K(aVar.f34322b.f45767i, 1) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 &= z10;
                    }
                }
                String str2 = "audio:" + str;
                p w10 = w(str2, 1, (Uri[]) arrayList.toArray((Uri[]) M.k(new Uri[0])), (C3717q0[]) arrayList2.toArray(new C3717q0[0]), (C3717q0) null, Collections.emptyList(), map, j10);
                list3.add(f.n(arrayList3));
                list2.add(w10);
                if (this.f34046m && z11) {
                    w10.d0(new T[]{new T(str2, (C3717q0[]) arrayList2.toArray(new C3717q0[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void u(h hVar, long j10, List list, List list2, Map map) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        h hVar2 = hVar;
        int size = hVar2.f34312e.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < hVar2.f34312e.size(); i13++) {
            C3717q0 q0Var = ((h.b) hVar2.f34312e.get(i13)).f34326b;
            if (q0Var.f45776r > 0 || M.L(q0Var.f45767i, 2) != null) {
                iArr[i13] = 2;
                i11++;
            } else if (M.L(q0Var.f45767i, 1) != null) {
                iArr[i13] = 1;
                i12++;
            } else {
                iArr[i13] = -1;
            }
        }
        if (i11 > 0) {
            size = i11;
            z11 = true;
            z10 = false;
        } else if (i12 < size) {
            size -= i12;
            z11 = false;
            z10 = true;
        } else {
            z11 = false;
            z10 = false;
        }
        Uri[] uriArr = new Uri[size];
        C3717q0[] q0VarArr = new C3717q0[size];
        int[] iArr2 = new int[size];
        int i14 = 0;
        for (int i15 = 0; i15 < hVar2.f34312e.size(); i15++) {
            if ((!z11 || iArr[i15] == 2) && (!z10 || iArr[i15] != 1)) {
                h.b bVar = (h.b) hVar2.f34312e.get(i15);
                uriArr[i14] = bVar.f34325a;
                q0VarArr[i14] = bVar.f34326b;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = q0VarArr[0].f45767i;
        int K10 = M.K(str, 2);
        int K11 = M.K(str, 1);
        if ((K11 == 1 || (K11 == 0 && hVar2.f34314g.isEmpty())) && K10 <= 1 && K11 + K10 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 || K11 <= 0) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        String str2 = "main";
        p w10 = w("main", i10, uriArr, q0VarArr, hVar2.f34317j, hVar2.f34318k, map, j10);
        list.add(w10);
        list2.add(iArr2);
        if (this.f34046m && z12) {
            ArrayList arrayList = new ArrayList();
            if (K10 > 0) {
                C3717q0[] q0VarArr2 = new C3717q0[size];
                for (int i16 = 0; i16 < size; i16++) {
                    q0VarArr2[i16] = z(q0VarArr[i16]);
                }
                arrayList.add(new T(str2, q0VarArr2));
                if (K11 > 0 && (hVar2.f34317j != null || hVar2.f34314g.isEmpty())) {
                    arrayList.add(new T(str2 + ":audio", x(q0VarArr[0], hVar2.f34317j, false)));
                }
                List list3 = hVar2.f34318k;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new T(str2 + ":cc:" + i17, (C3717q0) list3.get(i17)));
                    }
                }
            } else {
                C3717q0[] q0VarArr3 = new C3717q0[size];
                for (int i18 = 0; i18 < size; i18++) {
                    q0VarArr3[i18] = x(q0VarArr[i18], hVar2.f34317j, true);
                }
                arrayList.add(new T(str2, q0VarArr3));
            }
            T t10 = new T(str2 + ":id3", new C3717q0.b().S("ID3").e0("application/id3").E());
            arrayList.add(t10);
            w10.d0((T[]) arrayList.toArray(new T[0]), 0, arrayList.indexOf(t10));
        }
    }

    private void v(long j10) {
        Map emptyMap;
        h hVar = (h) C3645a.e(this.f34035b.e());
        if (this.f34048o) {
            emptyMap = y(hVar.f34320m);
        } else {
            emptyMap = Collections.emptyMap();
        }
        Map map = emptyMap;
        boolean isEmpty = hVar.f34312e.isEmpty();
        List list = hVar.f34314g;
        List list2 = hVar.f34315h;
        int i10 = 0;
        this.f34051r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!isEmpty) {
            u(hVar, j10, arrayList, arrayList2, map);
        }
        t(j10, list, arrayList, arrayList2, map);
        this.f34056w = arrayList.size();
        int i11 = 0;
        while (i11 < list2.size()) {
            h.a aVar = (h.a) list2.get(i11);
            String str = "subtitle:" + i11 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + aVar.f34324d;
            int i12 = i11;
            p w10 = w(str, 3, new Uri[]{aVar.f34321a}, new C3717q0[]{aVar.f34322b}, (C3717q0) null, Collections.emptyList(), map, j10);
            arrayList2.add(new int[]{i12});
            arrayList.add(w10);
            w10.d0(new T[]{new T(str, aVar.f34322b)}, 0, new int[0]);
            i11 = i12 + 1;
            i10 = 0;
            map = map;
        }
        int i13 = i10;
        this.f34053t = (p[]) arrayList.toArray(new p[i13]);
        this.f34055v = (int[][]) arrayList2.toArray(new int[i13][]);
        this.f34051r = this.f34053t.length;
        for (int i14 = i13; i14 < this.f34056w; i14++) {
            this.f34053t[i14].m0(true);
        }
        p[] pVarArr = this.f34053t;
        int length = pVarArr.length;
        for (int i15 = i13; i15 < length; i15++) {
            pVarArr[i15].B();
        }
        this.f34054u = this.f34053t;
    }

    private p w(String str, int i10, Uri[] uriArr, C3717q0[] q0VarArr, C3717q0 q0Var, List list, Map map, long j10) {
        return new p(str, i10, this, new f(this.f34034a, this.f34035b, uriArr, q0VarArr, this.f34036c, this.f34037d, this.f34044k, list, this.f34049p), map, this.f34042i, j10, q0Var, this.f34038e, this.f34039f, this.f34040g, this.f34041h, this.f34047n);
    }

    private static C3717q0 x(C3717q0 q0Var, C3717q0 q0Var2, boolean z10) {
        String str;
        String str2;
        int i10;
        int i11;
        int i12;
        a aVar;
        String str3;
        int i13;
        int i14 = -1;
        if (q0Var2 != null) {
            str3 = q0Var2.f45767i;
            aVar = q0Var2.f45768j;
            i12 = q0Var2.f45783y;
            i11 = q0Var2.f45762d;
            i10 = q0Var2.f45763e;
            str2 = q0Var2.f45761c;
            str = q0Var2.f45760b;
        } else {
            str3 = M.L(q0Var.f45767i, 1);
            aVar = q0Var.f45768j;
            if (z10) {
                i12 = q0Var.f45783y;
                i11 = q0Var.f45762d;
                i10 = q0Var.f45763e;
                str2 = q0Var.f45761c;
                str = q0Var.f45760b;
            } else {
                i11 = 0;
                str2 = null;
                i12 = -1;
                i10 = 0;
                str = null;
            }
        }
        String g10 = w.g(str3);
        if (z10) {
            i13 = q0Var.f45764f;
        } else {
            i13 = -1;
        }
        if (z10) {
            i14 = q0Var.f45765g;
        }
        return new C3717q0.b().S(q0Var.f45759a).U(str).K(q0Var.f45769k).e0(g10).I(str3).X(aVar).G(i13).Z(i14).H(i12).g0(i11).c0(i10).V(str2).E();
    }

    private static Map y(List list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            m mVar = (m) list.get(i10);
            String str = mVar.f47520c;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                m mVar2 = (m) arrayList.get(i11);
                if (TextUtils.equals(mVar2.f47520c, str)) {
                    mVar = mVar.f(mVar2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, mVar);
        }
        return hashMap;
    }

    private static C3717q0 z(C3717q0 q0Var) {
        String L10 = M.L(q0Var.f45767i, 2);
        return new C3717q0.b().S(q0Var.f45759a).U(q0Var.f45760b).K(q0Var.f45769k).e0(w.g(L10)).I(L10).X(q0Var.f45768j).G(q0Var.f45764f).Z(q0Var.f45765g).j0(q0Var.f45775q).Q(q0Var.f45776r).P(q0Var.f45777s).g0(q0Var.f45762d).c0(q0Var.f45763e).E();
    }

    /* renamed from: A */
    public void p(p pVar) {
        this.f34050q.p(this);
    }

    public void B() {
        this.f34035b.g(this);
        for (p f02 : this.f34053t) {
            f02.f0();
        }
        this.f34050q = null;
    }

    public long a() {
        return this.f34057x.a();
    }

    public boolean b() {
        return this.f34057x.b();
    }

    public long c() {
        return this.f34057x.c();
    }

    public void d() {
        int i10 = this.f34051r - 1;
        this.f34051r = i10;
        if (i10 <= 0) {
            int i11 = 0;
            for (p n10 : this.f34053t) {
                i11 += n10.n().f33196a;
            }
            T[] tArr = new T[i11];
            int i12 = 0;
            for (p pVar : this.f34053t) {
                int i13 = pVar.n().f33196a;
                int i14 = 0;
                while (i14 < i13) {
                    tArr[i12] = pVar.n().b(i14);
                    i14++;
                    i12++;
                }
            }
            this.f34052s = new V(tArr);
            this.f34050q.k(this);
        }
    }

    public boolean e(Uri uri, A.c cVar, boolean z10) {
        boolean z11 = true;
        for (p a02 : this.f34053t) {
            z11 &= a02.a0(uri, cVar, z10);
        }
        this.f34050q.p(this);
        return z11;
    }

    public void f(long j10) {
        this.f34057x.f(j10);
    }

    public long g(long j10) {
        p[] pVarArr = this.f34054u;
        if (pVarArr.length > 0) {
            boolean i02 = pVarArr[0].i0(j10, false);
            int i10 = 1;
            while (true) {
                p[] pVarArr2 = this.f34054u;
                if (i10 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i10].i0(j10, i02);
                i10++;
            }
            if (i02) {
                this.f34044k.b();
            }
        }
        return j10;
    }

    public long h() {
        return -9223372036854775807L;
    }

    public void i() {
        for (p b02 : this.f34053t) {
            b02.b0();
        }
        this.f34050q.p(this);
    }

    public void j() {
        for (p j10 : this.f34053t) {
            j10.j();
        }
    }

    public long l(long j10, e1 e1Var) {
        for (p pVar : this.f34054u) {
            if (pVar.R()) {
                return pVar.l(j10, e1Var);
            }
        }
        return j10;
    }

    public boolean m(long j10) {
        if (this.f34052s != null) {
            return this.f34057x.m(j10);
        }
        for (p B10 : this.f34053t) {
            B10.B();
        }
        return false;
    }

    public V n() {
        return (V) C3645a.e(this.f34052s);
    }

    public void o(long j10, boolean z10) {
        for (p o10 : this.f34054u) {
            o10.o(j10, z10);
        }
    }

    public void q(Uri uri) {
        this.f34035b.f(uri);
    }

    public void r(r.a aVar, long j10) {
        this.f34050q = aVar;
        this.f34035b.c(this);
        v(j10);
    }

    public long s(ga.r[] rVarArr, boolean[] zArr, N9.M[] mArr, boolean[] zArr2, long j10) {
        boolean z10;
        N9.M m10;
        int i10;
        ga.r[] rVarArr2 = rVarArr;
        N9.M[] mArr2 = mArr;
        int[] iArr = new int[rVarArr2.length];
        int[] iArr2 = new int[rVarArr2.length];
        for (int i11 = 0; i11 < rVarArr2.length; i11++) {
            N9.M m11 = mArr2[i11];
            if (m11 == null) {
                i10 = -1;
            } else {
                i10 = ((Integer) this.f34043j.get(m11)).intValue();
            }
            iArr[i11] = i10;
            iArr2[i11] = -1;
            ga.r rVar = rVarArr2[i11];
            if (rVar != null) {
                T g10 = rVar.g();
                int i12 = 0;
                while (true) {
                    p[] pVarArr = this.f34053t;
                    if (i12 >= pVarArr.length) {
                        break;
                    } else if (pVarArr[i12].n().c(g10) != -1) {
                        iArr2[i11] = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        this.f34043j.clear();
        int length = rVarArr2.length;
        N9.M[] mArr3 = new N9.M[length];
        N9.M[] mArr4 = new N9.M[rVarArr2.length];
        ga.r[] rVarArr3 = new ga.r[rVarArr2.length];
        p[] pVarArr2 = new p[this.f34053t.length];
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (i14 < this.f34053t.length) {
            for (int i15 = 0; i15 < rVarArr2.length; i15++) {
                ga.r rVar2 = null;
                if (iArr[i15] == i14) {
                    m10 = mArr2[i15];
                } else {
                    m10 = null;
                }
                mArr4[i15] = m10;
                if (iArr2[i15] == i14) {
                    rVar2 = rVarArr2[i15];
                }
                rVarArr3[i15] = rVar2;
            }
            p pVar = this.f34053t[i14];
            p pVar2 = pVar;
            int i16 = i13;
            int i17 = length;
            int i18 = i14;
            ga.r[] rVarArr4 = rVarArr3;
            p[] pVarArr3 = pVarArr2;
            boolean j02 = pVar.j0(rVarArr3, zArr, mArr4, zArr2, j10, z11);
            int i19 = 0;
            boolean z12 = false;
            while (true) {
                z10 = true;
                if (i19 >= rVarArr2.length) {
                    break;
                }
                N9.M m12 = mArr4[i19];
                if (iArr2[i19] == i18) {
                    C3645a.e(m12);
                    mArr3[i19] = m12;
                    this.f34043j.put(m12, Integer.valueOf(i18));
                    z12 = true;
                } else if (iArr[i19] == i18) {
                    if (m12 != null) {
                        z10 = false;
                    }
                    C3645a.f(z10);
                }
                i19++;
            }
            p[] pVarArr4 = pVarArr3;
            if (z12) {
                pVarArr4[i16] = pVar2;
                i13 = i16 + 1;
                if (i16 == 0) {
                    pVar2.m0(true);
                    if (!j02) {
                        p[] pVarArr5 = this.f34054u;
                        if (pVarArr5.length != 0 && pVar2 == pVarArr5[0]) {
                        }
                    }
                    this.f34044k.b();
                    z11 = true;
                } else {
                    if (i18 >= this.f34056w) {
                        z10 = false;
                    }
                    pVar2.m0(z10);
                }
            } else {
                i13 = i16;
            }
            i14 = i18 + 1;
            mArr2 = mArr;
            pVarArr2 = pVarArr4;
            length = i17;
            rVarArr3 = rVarArr4;
        }
        System.arraycopy(mArr3, 0, mArr2, 0, length);
        p[] pVarArr6 = (p[]) M.H0(pVarArr2, i13);
        this.f34054u = pVarArr6;
        this.f34057x = this.f34045l.a(pVarArr6);
        return j10;
    }
}
