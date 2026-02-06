package c0;

import Ef.m;
import Y.C0;
import b0.C1867e;
import f0.C1957a;
import f0.d;
import f0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.C6481c;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import mf.C6553f;
import mf.C6559l;
import yf.C6798l;

public final class f extends C6553f implements C1867e.a {

    /* renamed from: a  reason: collision with root package name */
    private C1867e f19183a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f19184b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f19185c;

    /* renamed from: d  reason: collision with root package name */
    private int f19186d;

    /* renamed from: e  reason: collision with root package name */
    private e f19187e = new e();

    /* renamed from: f  reason: collision with root package name */
    private Object[] f19188f = this.f19184b;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f19189g = this.f19185c;

    /* renamed from: h  reason: collision with root package name */
    private int f19190h = this.f19183a.size();

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Collection f19191a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Collection collection) {
            super(1);
            this.f19191a = collection;
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f19191a.contains(obj));
        }
    }

    public f(C1867e eVar, Object[] objArr, Object[] objArr2, int i10) {
        this.f19183a = eVar;
        this.f19184b = objArr;
        this.f19185c = objArr2;
        this.f19186d = i10;
    }

    private final void A(Object[] objArr, int i10, Object obj) {
        int t02 = t0();
        Object[] E10 = E(this.f19189g);
        if (t02 < 32) {
            C6559l.m(this.f19189g, E10, i10 + 1, i10, t02);
            E10[i10] = obj;
            this.f19188f = objArr;
            this.f19189g = E10;
            this.f19190h = size() + 1;
            return;
        }
        Object[] objArr2 = this.f19189g;
        Object obj2 = objArr2[31];
        C6559l.m(objArr2, E10, i10 + 1, i10, 31);
        E10[i10] = obj;
        Z(objArr, E10, N(obj2));
    }

    private final boolean C(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.f19187e) {
            return true;
        }
        return false;
    }

    private final ListIterator D(int i10) {
        Object[] objArr = this.f19188f;
        if (objArr != null) {
            int p02 = p0() >> 5;
            d.b(i10, p02);
            int i11 = this.f19186d;
            if (i11 == 0) {
                return new i(objArr, i10);
            }
            return new k(objArr, i10, p02, i11 / 5);
        }
        throw new IllegalStateException("Invalid root");
    }

    private final Object[] E(Object[] objArr) {
        if (objArr == null) {
            return I();
        }
        if (C(objArr)) {
            return objArr;
        }
        return C6559l.q(objArr, I(), 0, 0, m.h(objArr.length, 32), 6, (Object) null);
    }

    private final Object[] H(Object[] objArr, int i10) {
        if (C(objArr)) {
            return C6559l.m(objArr, objArr, i10, 0, 32 - i10);
        }
        return C6559l.m(objArr, I(), i10, 0, 32 - i10);
    }

    private final Object[] I() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f19187e;
        return objArr;
    }

    private final Object[] N(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f19187e;
        return objArr;
    }

    private final Object[] P(Object[] objArr, int i10, int i11) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int a10 = l.a(i10, i11);
        Object[] objArr2 = objArr[a10];
        C6496s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object P10 = P(objArr2, i10, i11 - 5);
        if (a10 < 31) {
            int i12 = a10 + 1;
            if (objArr[i12] != null) {
                if (C(objArr)) {
                    C6559l.w(objArr, (Object) null, i12, 32);
                }
                objArr = C6559l.m(objArr, I(), 0, 0, i12);
            }
        }
        if (P10 == objArr[a10]) {
            return objArr;
        }
        Object[] E10 = E(objArr);
        E10[a10] = P10;
        return E10;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11, C1890d dVar) {
        Object[] objArr2;
        int a10 = l.a(i11 - 1, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a10];
            C6496s.f(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = Q(objArr3, i10 - 5, i11, dVar);
        }
        if (objArr2 == null && a10 == 0) {
            return null;
        }
        Object[] E10 = E(objArr);
        E10[a10] = objArr2;
        return E10;
    }

    private final void R(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f19188f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f19189g = objArr;
            this.f19190h = i10;
            this.f19186d = i11;
            return;
        }
        C1890d dVar = new C1890d((Object) null);
        C6496s.e(objArr);
        Object[] Q10 = Q(objArr, i11, i10, dVar);
        C6496s.e(Q10);
        Object a10 = dVar.a();
        C6496s.f(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f19189g = (Object[]) a10;
        this.f19190h = i10;
        if (Q10[1] == null) {
            this.f19188f = (Object[]) Q10[0];
            this.f19186d = i11 - 5;
            return;
        }
        this.f19188f = Q10;
        this.f19186d = i11;
    }

    private final Object[] S(Object[] objArr, int i10, int i11, Iterator it) {
        boolean z10;
        if (!it.hasNext()) {
            C0.a("invalid buffersIterator");
        }
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] E10 = E(objArr);
        int a10 = l.a(i10, i11);
        int i12 = i11 - 5;
        E10[a10] = S((Object[]) E10[a10], i10, i12, it);
        while (true) {
            a10++;
            if (a10 >= 32 || !it.hasNext()) {
                return E10;
            }
            E10[a10] = S((Object[]) E10[a10], 0, i12, it);
        }
        return E10;
    }

    private final Object[] W(Object[] objArr, int i10, Object[][] objArr2) {
        Object[] objArr3;
        Iterator a10 = C6481c.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f19186d;
        if (i11 < (1 << i12)) {
            objArr3 = S(objArr, i10, i12, a10);
        } else {
            objArr3 = E(objArr);
        }
        while (a10.hasNext()) {
            this.f19186d += 5;
            objArr3 = N(objArr3);
            int i13 = this.f19186d;
            S(objArr3, 1 << i13, i13, a10);
        }
        return objArr3;
    }

    private final void Z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f19186d;
        if (size > (1 << i10)) {
            this.f19188f = a0(N(objArr), objArr2, this.f19186d + 5);
            this.f19189g = objArr3;
            this.f19186d += 5;
            this.f19190h = size() + 1;
        } else if (objArr == null) {
            this.f19188f = objArr2;
            this.f19189g = objArr3;
            this.f19190h = size() + 1;
        } else {
            this.f19188f = a0(objArr, objArr2, i10);
            this.f19189g = objArr3;
            this.f19190h = size() + 1;
        }
    }

    private final Object[] a0(Object[] objArr, Object[] objArr2, int i10) {
        int a10 = l.a(size() - 1, i10);
        Object[] E10 = E(objArr);
        if (i10 == 5) {
            E10[a10] = objArr2;
        } else {
            E10[a10] = a0((Object[]) E10[a10], objArr2, i10 - 5);
        }
        return E10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int c0(yf.C6798l r7, java.lang.Object[] r8, int r9, int r10, c0.C1890d r11, java.util.List r12, java.util.List r13) {
        /*
            r6 = this;
            boolean r0 = r6.C(r8)
            if (r0 == 0) goto L_0x0009
            r12.add(r8)
        L_0x0009:
            java.lang.Object r0 = r11.a()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            kotlin.jvm.internal.C6496s.f(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            r3 = r0
            r2 = r1
        L_0x0017:
            if (r2 >= r9) goto L_0x0050
            r4 = r8[r2]
            java.lang.Object r5 = r7.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x004d
            r5 = 32
            if (r10 != r5) goto L_0x0048
            r10 = r12
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0042
            int r10 = r12.size()
            int r10 = r10 + -1
            java.lang.Object r10 = r12.remove(r10)
            java.lang.Object[] r10 = (java.lang.Object[]) r10
        L_0x0040:
            r3 = r10
            goto L_0x0047
        L_0x0042:
            java.lang.Object[] r10 = r6.I()
            goto L_0x0040
        L_0x0047:
            r10 = r1
        L_0x0048:
            int r5 = r10 + 1
            r3[r10] = r4
            r10 = r5
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0050:
            r11.b(r3)
            java.lang.Object r7 = r11.a()
            if (r0 == r7) goto L_0x005c
            r13.add(r0)
        L_0x005c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.f.c0(yf.l, java.lang.Object[], int, int, c0.d, java.util.List, java.util.List):int");
    }

    private final int f0(C6798l lVar, Object[] objArr, int i10, C1890d dVar) {
        Object[] objArr2 = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArr2 = E(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArr2[i11] = obj;
                i11++;
            }
        }
        dVar.b(objArr2);
        return i11;
    }

    private final Object[] g(int i10) {
        if (p0() <= i10) {
            return this.f19189g;
        }
        Object[] objArr = this.f19188f;
        C6496s.e(objArr);
        for (int i11 = this.f19186d; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            C6496s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final boolean g0(C6798l lVar) {
        Object[] objArr;
        C6798l lVar2 = lVar;
        int t02 = t0();
        C1890d dVar = new C1890d((Object) null);
        if (this.f19188f != null) {
            ListIterator D10 = D(0);
            int i10 = 32;
            while (i10 == 32 && D10.hasNext()) {
                i10 = f0(lVar2, (Object[]) D10.next(), 32, dVar);
            }
            if (i10 == 32) {
                C1957a.a(!D10.hasNext());
                int h02 = h0(lVar2, t02, dVar);
                if (h02 == 0) {
                    R(this.f19188f, size(), this.f19186d);
                }
                if (h02 != t02) {
                    return true;
                }
                return false;
            }
            int previousIndex = D10.previousIndex() << 5;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int i11 = i10;
            while (D10.hasNext()) {
                i11 = c0(lVar, (Object[]) D10.next(), 32, i11, dVar, arrayList2, arrayList);
                previousIndex = previousIndex;
            }
            int i12 = previousIndex;
            int c02 = c0(lVar, this.f19189g, t02, i11, dVar, arrayList2, arrayList);
            Object a10 = dVar.a();
            C6496s.f(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) a10;
            C6559l.w(objArr2, (Object) null, c02, 32);
            if (arrayList.isEmpty()) {
                objArr = this.f19188f;
                C6496s.e(objArr);
            } else {
                objArr = S(this.f19188f, i12, this.f19186d, arrayList.iterator());
            }
            int size = i12 + (arrayList.size() << 5);
            this.f19188f = o0(objArr, size);
            this.f19189g = objArr2;
            this.f19190h = size + c02;
            return true;
        } else if (h0(lVar2, t02, dVar) != t02) {
            return true;
        } else {
            return false;
        }
    }

    private final int h0(C6798l lVar, int i10, C1890d dVar) {
        boolean z10;
        int f02 = f0(lVar, this.f19189g, i10, dVar);
        if (f02 == i10) {
            if (dVar.a() == this.f19189g) {
                z10 = true;
            } else {
                z10 = false;
            }
            C1957a.a(z10);
            return i10;
        }
        Object a10 = dVar.a();
        C6496s.f(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a10;
        C6559l.w(objArr, (Object) null, f02, i10);
        this.f19189g = objArr;
        this.f19190h = size() - (i10 - f02);
        return f02;
    }

    private final Object[] j0(Object[] objArr, int i10, int i11, C1890d dVar) {
        int a10 = l.a(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            Object obj = objArr[a10];
            Object[] m10 = C6559l.m(objArr, E(objArr), a10, a10 + 1, 32);
            m10[31] = dVar.a();
            dVar.b(obj);
            return m10;
        }
        if (objArr[31] == null) {
            i12 = l.a(p0() - 1, i10);
        }
        Object[] E10 = E(objArr);
        int i13 = i10 - 5;
        int i14 = a10 + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj2 = E10[i12];
                C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                E10[i12] = j0((Object[]) obj2, i13, 0, dVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj3 = E10[a10];
        C6496s.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        E10[a10] = j0((Object[]) obj3, i13, i11, dVar);
        return E10;
    }

    private final Object[] k(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    private final Object l0(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int size = size() - i10;
        if (i12 < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1957a.a(z10);
        if (size == 1) {
            Object obj = this.f19189g[0];
            R(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f19189g;
        Object obj2 = objArr2[i12];
        Object[] m10 = C6559l.m(objArr2, E(objArr2), i12, i12 + 1, size);
        m10[size - 1] = null;
        this.f19188f = objArr;
        this.f19189g = m10;
        this.f19190h = (i10 + size) - 1;
        this.f19186d = i11;
        return obj2;
    }

    private final Object[] o0(Object[] objArr, int i10) {
        boolean z10;
        if ((i10 & 31) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("invalid size");
        }
        if (i10 == 0) {
            this.f19186d = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f19186d;
            if ((i11 >> i12) != 0) {
                return P(objArr, i11, i12);
            }
            this.f19186d = i12 - 5;
            Object[] objArr2 = objArr[0];
            C6496s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int p0() {
        if (size() <= 32) {
            return 0;
        }
        return l.d(size());
    }

    private final Object[] q0(Object[] objArr, int i10, int i11, Object obj, C1890d dVar) {
        int a10 = l.a(i11, i10);
        Object[] E10 = E(objArr);
        if (i10 == 0) {
            if (E10 != objArr) {
                this.modCount++;
            }
            dVar.b(E10[a10]);
            E10[a10] = obj;
            return E10;
        }
        Object obj2 = E10[a10];
        C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        E10[a10] = q0((Object[]) obj2, i10 - 5, i11, obj, dVar);
        return E10;
    }

    private final Object[] r0(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f19188f != null) {
            ListIterator D10 = D(p0() >> 5);
            while (D10.previousIndex() != i10) {
                Object[] objArr3 = (Object[]) D10.previous();
                C6559l.m(objArr3, objArr2, 0, 32 - i11, 32);
                objArr2 = H(objArr3, i11);
                i12--;
                objArr[i12] = objArr2;
            }
            return (Object[]) D10.previous();
        }
        throw new IllegalStateException("root is null");
    }

    private final void s0(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        boolean z10;
        Object[] objArr4;
        if (i12 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("requires at least one nullBuffer");
        }
        Object[] E10 = E(objArr);
        objArr2[0] = E10;
        int i13 = i10 & 31;
        int size = ((i10 + collection.size()) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            C6559l.m(E10, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArr4 = E10;
            } else {
                objArr4 = I();
                i12--;
                objArr2[i12] = objArr4;
            }
            int i16 = i11 - i15;
            C6559l.m(E10, objArr3, 0, i16, i11);
            C6559l.m(E10, objArr4, size + 1, i13, i16);
            objArr3 = objArr4;
        }
        Iterator it = collection.iterator();
        k(E10, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            objArr2[i17] = k(I(), 0, it);
        }
        k(objArr3, 0, it);
    }

    private final int t0() {
        return u0(size());
    }

    private final int u0(int i10) {
        if (i10 <= 32) {
            return i10;
        }
        return i10 - l.d(i10);
    }

    private final void x(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f19188f != null) {
            int i13 = i10 >> 5;
            Object[] r02 = r0(i13, i11, objArr, i12, objArr2);
            int p02 = i12 - (((p0() >> 5) - 1) - i13);
            if (p02 < i12) {
                objArr2 = objArr[p02];
                C6496s.e(objArr2);
            }
            s0(collection, i10, r02, 32, objArr, p02, objArr2);
            return;
        }
        throw new IllegalStateException("root is null");
    }

    private final Object[] z(Object[] objArr, int i10, int i11, Object obj, C1890d dVar) {
        Object obj2;
        int a10 = l.a(i11, i10);
        if (i10 == 0) {
            dVar.b(objArr[31]);
            Object[] m10 = C6559l.m(objArr, E(objArr), a10 + 1, a10, 31);
            m10[a10] = obj;
            return m10;
        }
        Object[] E10 = E(objArr);
        int i12 = i10 - 5;
        Object obj3 = E10[a10];
        C6496s.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        E10[a10] = z((Object[]) obj3, i12, i11, obj, dVar);
        while (true) {
            a10++;
            if (a10 >= 32 || (obj2 = E10[a10]) == null) {
                return E10;
            }
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            E10[a10] = z((Object[]) obj2, i12, 0, dVar.a(), dVar);
        }
        return E10;
    }

    public int a() {
        return this.f19190h;
    }

    public boolean add(Object obj) {
        this.modCount++;
        int t02 = t0();
        if (t02 < 32) {
            Object[] E10 = E(this.f19189g);
            E10[t02] = obj;
            this.f19189g = E10;
            this.f19190h = size() + 1;
        } else {
            Z(this.f19188f, this.f19189g, N(obj));
        }
        return true;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int t02 = t0();
        Iterator it = collection.iterator();
        if (32 - t02 >= collection.size()) {
            this.f19189g = k(E(this.f19189g), t02, it);
            this.f19190h = size() + collection.size();
        } else {
            int size = ((collection.size() + t02) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = k(E(this.f19189g), t02, it);
            for (int i10 = 1; i10 < size; i10++) {
                objArr[i10] = k(I(), 0, it);
            }
            this.f19188f = W(this.f19188f, p0(), objArr);
            this.f19189g = k(I(), 0, it);
            this.f19190h = size() + collection.size();
        }
        return true;
    }

    public Object b(int i10) {
        d.a(i10, size());
        this.modCount++;
        int p02 = p0();
        if (i10 >= p02) {
            return l0(this.f19188f, p02, this.f19186d, i10 - p02);
        }
        C1890d dVar = new C1890d(this.f19189g[0]);
        Object[] objArr = this.f19188f;
        C6496s.e(objArr);
        l0(j0(objArr, this.f19186d, i10, dVar), p02, this.f19186d, 0);
        return dVar.a();
    }

    public C1867e f() {
        C1867e eVar;
        if (this.f19188f == this.f19184b && this.f19189g == this.f19185c) {
            eVar = this.f19183a;
        } else {
            this.f19187e = new e();
            Object[] objArr = this.f19188f;
            this.f19184b = objArr;
            Object[] objArr2 = this.f19189g;
            this.f19185c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f19188f;
                C6496s.e(objArr3);
                eVar = new C1891e(objArr3, this.f19189g, size(), this.f19186d);
            } else if (objArr2.length == 0) {
                eVar = l.b();
            } else {
                Object[] copyOf = Arrays.copyOf(this.f19189g, size());
                C6496s.g(copyOf, "copyOf(this, newSize)");
                eVar = new j(copyOf);
            }
        }
        this.f19183a = eVar;
        return eVar;
    }

    public Object get(int i10) {
        d.a(i10, size());
        return g(i10)[i10 & 31];
    }

    public final boolean i0(C6798l lVar) {
        boolean g02 = g0(lVar);
        if (g02) {
            this.modCount++;
        }
        return g02;
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final int n() {
        return this.modCount;
    }

    public final Object[] r() {
        return this.f19188f;
    }

    public boolean removeAll(Collection collection) {
        return i0(new a(collection));
    }

    public Object set(int i10, Object obj) {
        d.a(i10, size());
        if (p0() <= i10) {
            Object[] E10 = E(this.f19189g);
            if (E10 != this.f19189g) {
                this.modCount++;
            }
            int i11 = i10 & 31;
            Object obj2 = E10[i11];
            E10[i11] = obj;
            this.f19189g = E10;
            return obj2;
        }
        C1890d dVar = new C1890d((Object) null);
        Object[] objArr = this.f19188f;
        C6496s.e(objArr);
        this.f19188f = q0(objArr, this.f19186d, i10, obj, dVar);
        return dVar.a();
    }

    public final int t() {
        return this.f19186d;
    }

    public final Object[] v() {
        return this.f19189g;
    }

    public ListIterator listIterator(int i10) {
        d.b(i10, size());
        return new h(this, i10);
    }

    public void add(int i10, Object obj) {
        d.b(i10, size());
        if (i10 == size()) {
            add(obj);
            return;
        }
        this.modCount++;
        int p02 = p0();
        if (i10 >= p02) {
            A(this.f19188f, i10 - p02, obj);
            return;
        }
        C1890d dVar = new C1890d((Object) null);
        Object[] objArr = this.f19188f;
        C6496s.e(objArr);
        A(z(objArr, this.f19186d, i10, obj, dVar), 0, dVar.a());
    }

    public boolean addAll(int i10, Collection collection) {
        Object[] objArr;
        d.b(i10, size());
        if (i10 == size()) {
            return addAll(collection);
        }
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        this.modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = (((size() - i11) + collection.size()) - 1) / 32;
        if (size == 0) {
            if (i10 >= p0()) {
                z10 = true;
            }
            C1957a.a(z10);
            int i12 = i10 & 31;
            Object[] objArr2 = this.f19189g;
            Object[] m10 = C6559l.m(objArr2, E(objArr2), (((i10 + collection.size()) - 1) & 31) + 1, i12, t0());
            k(m10, i12, collection.iterator());
            this.f19189g = m10;
            this.f19190h = size() + collection.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int t02 = t0();
        int u02 = u0(size() + collection.size());
        if (i10 >= p0()) {
            objArr = I();
            s0(collection, i10, this.f19189g, t02, objArr3, size, objArr);
        } else if (u02 > t02) {
            int i13 = u02 - t02;
            objArr = H(this.f19189g, i13);
            x(collection, i10, i13, objArr3, size, objArr);
        } else {
            int i14 = t02 - u02;
            objArr = C6559l.m(this.f19189g, I(), 0, i14, t02);
            int i15 = 32 - i14;
            Object[] H10 = H(this.f19189g, i15);
            int i16 = size - 1;
            objArr3[i16] = H10;
            x(collection, i10, i15, objArr3, i16, H10);
        }
        this.f19188f = W(this.f19188f, i11, objArr3);
        this.f19189g = objArr;
        this.f19190h = size() + collection.size();
        return true;
    }
}
