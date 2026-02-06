package d0;

import Ef.g;
import Ef.m;
import Y.C0;
import f0.C1957a;
import f0.C1958b;
import f0.e;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d0.t  reason: case insensitive filesystem */
public final class C1916t {

    /* renamed from: e  reason: collision with root package name */
    public static final a f19425e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f19426f = 8;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C1916t f19427g = new C1916t(0, 0, new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    private int f19428a;

    /* renamed from: b  reason: collision with root package name */
    private int f19429b;

    /* renamed from: c  reason: collision with root package name */
    private final e f19430c;

    /* renamed from: d  reason: collision with root package name */
    private Object[] f19431d;

    /* renamed from: d0.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1916t a() {
            return C1916t.f19427g;
        }

        private a() {
        }
    }

    /* renamed from: d0.t$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C1916t f19432a;

        /* renamed from: b  reason: collision with root package name */
        private final int f19433b;

        public b(C1916t tVar, int i10) {
            this.f19432a = tVar;
            this.f19433b = i10;
        }

        public final C1916t a() {
            return this.f19432a;
        }

        public final int b() {
            return this.f19433b;
        }

        public final void c(C1916t tVar) {
            this.f19432a = tVar;
        }
    }

    public C1916t(int i10, int i11, Object[] objArr, e eVar) {
        this.f19428a = i10;
        this.f19429b = i11;
        this.f19430c = eVar;
        this.f19431d = objArr;
    }

    private final C1916t A(int i10, C1902f fVar) {
        fVar.r(fVar.size() - 1);
        fVar.o(W(i10));
        if (this.f19431d.length == 2) {
            return null;
        }
        if (this.f19430c != fVar.l()) {
            return new C1916t(0, 0, C1920x.h(this.f19431d, i10), fVar.l());
        }
        this.f19431d = C1920x.h(this.f19431d, i10);
        return this;
    }

    private final C1916t B(int i10, Object obj, Object obj2, e eVar) {
        int n10 = n(i10);
        if (this.f19430c == eVar) {
            this.f19431d = C1920x.g(this.f19431d, n10, obj, obj2);
            this.f19428a = i10 | this.f19428a;
            return this;
        }
        return new C1916t(i10 | this.f19428a, this.f19429b, C1920x.g(this.f19431d, n10, obj, obj2), eVar);
    }

    private final C1916t C(int i10, int i11, int i12, Object obj, Object obj2, int i13, e eVar) {
        if (this.f19430c == eVar) {
            this.f19431d = d(i10, i11, i12, obj, obj2, i13, eVar);
            this.f19428a ^= i11;
            this.f19429b |= i11;
            return this;
        }
        return new C1916t(this.f19428a ^ i11, i11 | this.f19429b, d(i10, i11, i12, obj, obj2, i13, eVar), eVar);
    }

    private final C1916t F(C1916t tVar, int i10, int i11, C1958b bVar, C1902f fVar) {
        int i12;
        int i13;
        C1916t tVar2 = tVar;
        int i14 = i10;
        C1958b bVar2 = bVar;
        int i15 = 0;
        if (r(i14)) {
            C1916t N10 = N(O(i14));
            if (tVar.r(i10)) {
                return N10.E(tVar2.N(tVar.O(i10)), i11 + 5, bVar2, fVar);
            }
            C1902f fVar2 = fVar;
            if (!tVar.q(i10)) {
                return N10;
            }
            int n10 = tVar.n(i10);
            Object t10 = tVar2.t(n10);
            Object W10 = tVar2.W(n10);
            int size = fVar.size();
            if (t10 != null) {
                i15 = t10.hashCode();
            }
            C1916t D10 = N10.D(i15, t10, W10, i11 + 5, fVar);
            if (fVar.size() != size) {
                return D10;
            }
            bVar2.c(bVar.a() + 1);
            return D10;
        }
        C1902f fVar3 = fVar;
        if (tVar.r(i10)) {
            C1916t N11 = tVar2.N(tVar.O(i10));
            if (q(i14)) {
                int n11 = n(i14);
                Object t11 = t(n11);
                if (t11 != null) {
                    i13 = t11.hashCode();
                } else {
                    i13 = 0;
                }
                int i16 = i11 + 5;
                if (N11.k(i13, t11, i16)) {
                    bVar2.c(bVar.a() + 1);
                } else {
                    Object W11 = W(n11);
                    if (t11 != null) {
                        i15 = t11.hashCode();
                    }
                    return N11.D(i15, t11, W11, i16, fVar);
                }
            }
            return N11;
        }
        int n12 = n(i14);
        Object t12 = t(n12);
        Object W12 = W(n12);
        int n13 = tVar.n(i10);
        Object t13 = tVar2.t(n13);
        Object W13 = tVar2.W(n13);
        if (t12 != null) {
            i12 = t12.hashCode();
        } else {
            i12 = 0;
        }
        if (t13 != null) {
            i15 = t13.hashCode();
        }
        return u(i12, t12, W12, i15, t13, W13, i11 + 5, fVar.l());
    }

    private final C1916t I(int i10, int i11, C1902f fVar) {
        fVar.r(fVar.size() - 1);
        fVar.o(W(i10));
        if (this.f19431d.length == 2) {
            return null;
        }
        if (this.f19430c == fVar.l()) {
            this.f19431d = C1920x.h(this.f19431d, i10);
            this.f19428a ^= i11;
            return this;
        }
        return new C1916t(i11 ^ this.f19428a, this.f19429b, C1920x.h(this.f19431d, i10), fVar.l());
    }

    private final C1916t J(int i10, int i11, e eVar) {
        Object[] objArr = this.f19431d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f19430c == eVar) {
            this.f19431d = C1920x.i(objArr, i10);
            this.f19429b ^= i11;
            return this;
        }
        return new C1916t(this.f19428a, i11 ^ this.f19429b, C1920x.i(objArr, i10), eVar);
    }

    private final C1916t K(C1916t tVar, C1916t tVar2, int i10, int i11, e eVar) {
        if (tVar2 == null) {
            return J(i10, i11, eVar);
        }
        if (this.f19430c == eVar || tVar != tVar2) {
            return L(i10, tVar2, eVar);
        }
        return this;
    }

    private final C1916t L(int i10, C1916t tVar, e eVar) {
        Object[] objArr = this.f19431d;
        if (objArr.length == 1 && tVar.f19431d.length == 2 && tVar.f19429b == 0) {
            tVar.f19428a = this.f19429b;
            return tVar;
        } else if (this.f19430c == eVar) {
            objArr[i10] = tVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C6496s.g(copyOf, "copyOf(this, size)");
            copyOf[i10] = tVar;
            return new C1916t(this.f19428a, this.f19429b, copyOf, eVar);
        }
    }

    private final C1916t M(int i10, Object obj, C1902f fVar) {
        if (this.f19430c == fVar.l()) {
            this.f19431d[i10 + 1] = obj;
            return this;
        }
        fVar.n(fVar.j() + 1);
        Object[] objArr = this.f19431d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C6496s.g(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = obj;
        return new C1916t(this.f19428a, this.f19429b, copyOf, fVar.l());
    }

    private final C1916t R(int i10, int i11) {
        Object[] objArr = this.f19431d;
        if (objArr.length == 2) {
            return null;
        }
        return new C1916t(i11 ^ this.f19428a, this.f19429b, C1920x.h(objArr, i10));
    }

    private final C1916t S(int i10, int i11) {
        Object[] objArr = this.f19431d;
        if (objArr.length == 1) {
            return null;
        }
        return new C1916t(this.f19428a, i11 ^ this.f19429b, C1920x.i(objArr, i10));
    }

    private final C1916t T(C1916t tVar, C1916t tVar2, int i10, int i11) {
        if (tVar2 == null) {
            return S(i10, i11);
        }
        if (tVar != tVar2) {
            return U(i10, i11, tVar2);
        }
        return this;
    }

    private final C1916t U(int i10, int i11, C1916t tVar) {
        Object[] objArr = tVar.f19431d;
        if (objArr.length != 2 || tVar.f19429b != 0) {
            Object[] objArr2 = this.f19431d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            copyOf[i10] = tVar;
            return new C1916t(this.f19428a, this.f19429b, copyOf);
        } else if (this.f19431d.length == 1) {
            tVar.f19428a = this.f19429b;
            return tVar;
        } else {
            return new C1916t(this.f19428a ^ i11, i11 ^ this.f19429b, C1920x.k(this.f19431d, i10, n(i11), objArr[0], objArr[1]));
        }
    }

    private final C1916t V(int i10, Object obj) {
        Object[] objArr = this.f19431d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C6496s.g(copyOf, "copyOf(this, size)");
        copyOf[i10 + 1] = obj;
        return new C1916t(this.f19428a, this.f19429b, copyOf);
    }

    private final Object W(int i10) {
        return this.f19431d[i10 + 1];
    }

    private final b b() {
        return new b(this, 1);
    }

    private final b c() {
        return new b(this, 0);
    }

    private final Object[] d(int i10, int i11, int i12, Object obj, Object obj2, int i13, e eVar) {
        int i14;
        Object t10 = t(i10);
        if (t10 != null) {
            i14 = t10.hashCode();
        } else {
            i14 = 0;
        }
        int i15 = i14;
        C1916t u10 = u(i15, t10, W(i10), i12, obj, obj2, i13 + 5, eVar);
        int i16 = i11;
        int i17 = i10;
        return C1920x.j(this.f19431d, i10, O(i11) + 1, u10);
    }

    private final int e() {
        if (this.f19429b == 0) {
            return this.f19431d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f19428a);
        int length = this.f19431d.length;
        for (int i10 = bitCount * 2; i10 < length; i10++) {
            bitCount += N(i10).e();
        }
        return bitCount;
    }

    private final boolean f(Object obj) {
        g t10 = m.t(m.u(0, this.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
            while (!C6496s.c(obj, this.f19431d[k10])) {
                if (k10 != n10) {
                    k10 += r10;
                }
            }
            return true;
        }
        return false;
    }

    private final Object g(Object obj) {
        g t10 = m.t(m.u(0, this.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 <= 0 || k10 > n10) && (r10 >= 0 || n10 > k10)) {
            return null;
        }
        while (!C6496s.c(obj, t(k10))) {
            if (k10 == n10) {
                return null;
            }
            k10 += r10;
        }
        return W(k10);
    }

    private final b h(Object obj, Object obj2) {
        g t10 = m.t(m.u(0, this.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
            while (!C6496s.c(obj, t(k10))) {
                if (k10 != n10) {
                    k10 += r10;
                }
            }
            if (obj2 == W(k10)) {
                return null;
            }
            Object[] objArr = this.f19431d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C6496s.g(copyOf, "copyOf(this, size)");
            copyOf[k10 + 1] = obj2;
            return new C1916t(0, 0, copyOf).c();
        }
        return new C1916t(0, 0, C1920x.g(this.f19431d, 0, obj, obj2)).b();
    }

    private final C1916t i(Object obj) {
        g t10 = m.t(m.u(0, this.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
            while (!C6496s.c(obj, t(k10))) {
                if (k10 != n10) {
                    k10 += r10;
                }
            }
            return j(k10);
        }
        return this;
    }

    private final C1916t j(int i10) {
        Object[] objArr = this.f19431d;
        if (objArr.length == 2) {
            return null;
        }
        return new C1916t(0, 0, C1920x.h(objArr, i10));
    }

    private final boolean l(C1916t tVar) {
        if (this == tVar) {
            return true;
        }
        if (this.f19429b != tVar.f19429b || this.f19428a != tVar.f19428a) {
            return false;
        }
        int length = this.f19431d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f19431d[i10] != tVar.f19431d[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(int i10) {
        if ((i10 & this.f19429b) != 0) {
            return true;
        }
        return false;
    }

    private final C1916t s(int i10, Object obj, Object obj2) {
        return new C1916t(i10 | this.f19428a, this.f19429b, C1920x.g(this.f19431d, n(i10), obj, obj2));
    }

    private final Object t(int i10) {
        return this.f19431d[i10];
    }

    private final C1916t u(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, e eVar) {
        Object obj5 = obj;
        Object obj6 = obj2;
        Object obj7 = obj3;
        Object obj8 = obj4;
        int i13 = i12;
        e eVar2 = eVar;
        if (i13 > 30) {
            return new C1916t(0, 0, new Object[]{obj, obj6, obj7, obj8}, eVar2);
        }
        int i14 = i10;
        int f10 = C1920x.f(i10, i13);
        int f11 = C1920x.f(i11, i13);
        if (f10 != f11) {
            return new C1916t((1 << f10) | (1 << f11), 0, f10 < f11 ? new Object[]{obj5, obj6, obj7, obj8} : new Object[]{obj7, obj8, obj5, obj6}, eVar2);
        }
        return new C1916t(0, 1 << f10, new Object[]{u(i10, obj, obj2, i11, obj3, obj4, i13 + 5, eVar)}, eVar2);
    }

    private final C1916t v(int i10, int i11, int i12, Object obj, Object obj2, int i13) {
        return new C1916t(this.f19428a ^ i11, i11 | this.f19429b, d(i10, i11, i12, obj, obj2, i13, (e) null));
    }

    private final C1916t w(Object obj, Object obj2, C1902f fVar) {
        g t10 = m.t(m.u(0, this.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
            while (!C6496s.c(obj, t(k10))) {
                if (k10 != n10) {
                    k10 += r10;
                }
            }
            fVar.o(W(k10));
            if (this.f19430c == fVar.l()) {
                this.f19431d[k10 + 1] = obj2;
                return this;
            }
            fVar.n(fVar.j() + 1);
            Object[] objArr = this.f19431d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            C6496s.g(copyOf, "copyOf(this, size)");
            copyOf[k10 + 1] = obj2;
            return new C1916t(0, 0, copyOf, fVar.l());
        }
        fVar.r(fVar.size() + 1);
        return new C1916t(0, 0, C1920x.g(this.f19431d, 0, obj, obj2), fVar.l());
    }

    private final C1916t x(C1916t tVar, C1958b bVar, e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this.f19429b == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1957a.a(z10);
        if (this.f19428a == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C1957a.a(z11);
        if (tVar.f19429b == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        C1957a.a(z12);
        if (tVar.f19428a == 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        C1957a.a(z13);
        Object[] objArr = this.f19431d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + tVar.f19431d.length);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        int length = this.f19431d.length;
        g t10 = m.t(m.u(0, tVar.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
            while (true) {
                if (!f(tVar.f19431d[k10])) {
                    Object[] objArr2 = tVar.f19431d;
                    copyOf[length] = objArr2[k10];
                    copyOf[length + 1] = objArr2[k10 + 1];
                    length += 2;
                } else {
                    bVar.c(bVar.a() + 1);
                }
                if (k10 == n10) {
                    break;
                }
                k10 += r10;
            }
        }
        if (length == this.f19431d.length) {
            return this;
        }
        if (length == tVar.f19431d.length) {
            return tVar;
        }
        if (length == copyOf.length) {
            return new C1916t(0, 0, copyOf, eVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        C6496s.g(copyOf2, "copyOf(this, newSize)");
        return new C1916t(0, 0, copyOf2, eVar);
    }

    private final C1916t y(Object obj, C1902f fVar) {
        g t10 = m.t(m.u(0, this.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
            while (!C6496s.c(obj, t(k10))) {
                if (k10 != n10) {
                    k10 += r10;
                }
            }
            return A(k10, fVar);
        }
        return this;
    }

    private final C1916t z(Object obj, Object obj2, C1902f fVar) {
        g t10 = m.t(m.u(0, this.f19431d.length), 2);
        int k10 = t10.k();
        int n10 = t10.n();
        int r10 = t10.r();
        if ((r10 > 0 && k10 <= n10) || (r10 < 0 && n10 <= k10)) {
            while (true) {
                if (!C6496s.c(obj, t(k10)) || !C6496s.c(obj2, W(k10))) {
                    if (k10 == n10) {
                        break;
                    }
                    k10 += r10;
                } else {
                    return A(k10, fVar);
                }
            }
        }
        return this;
    }

    public final C1916t D(int i10, Object obj, Object obj2, int i11, C1902f fVar) {
        C1916t tVar;
        int f10 = 1 << C1920x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (C6496s.c(obj, t(n10))) {
                fVar.o(W(n10));
                if (W(n10) == obj2) {
                    return this;
                }
                return M(n10, obj2, fVar);
            }
            fVar.r(fVar.size() + 1);
            return C(n10, f10, i10, obj, obj2, i11, fVar.l());
        } else if (r(f10)) {
            int O10 = O(f10);
            C1916t N10 = N(O10);
            if (i11 == 30) {
                tVar = N10.w(obj, obj2, fVar);
            } else {
                tVar = N10.D(i10, obj, obj2, i11 + 5, fVar);
            }
            if (N10 == tVar) {
                return this;
            }
            return L(O10, tVar, fVar.l());
        } else {
            fVar.r(fVar.size() + 1);
            return B(f10, obj, obj2, fVar.l());
        }
    }

    public final C1916t E(C1916t tVar, int i10, C1958b bVar, C1902f fVar) {
        boolean z10;
        C1916t tVar2;
        C1916t tVar3 = tVar;
        C1958b bVar2 = bVar;
        if (this == tVar3) {
            bVar2.b(e());
            return this;
        } else if (i10 > 30) {
            return x(tVar3, bVar2, fVar.l());
        } else {
            int i11 = this.f19429b | tVar3.f19429b;
            int i12 = this.f19428a;
            int i13 = tVar3.f19428a;
            int i14 = i12 & i13;
            int i15 = (i12 ^ i13) & (~i11);
            while (i14 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i14);
                if (C6496s.c(t(n(lowestOneBit)), tVar3.t(tVar3.n(lowestOneBit)))) {
                    i15 |= lowestOneBit;
                } else {
                    i11 |= lowestOneBit;
                }
                i14 ^= lowestOneBit;
            }
            int i16 = 0;
            if ((i11 & i15) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C0.b("Check failed.");
            }
            if (C6496s.c(this.f19430c, fVar.l()) && this.f19428a == i15 && this.f19429b == i11) {
                tVar2 = this;
            } else {
                tVar2 = new C1916t(i15, i11, new Object[((Integer.bitCount(i15) * 2) + Integer.bitCount(i11))]);
            }
            int i17 = i11;
            int i18 = 0;
            while (i17 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i17);
                Object[] objArr = tVar2.f19431d;
                objArr[(objArr.length - 1) - i18] = F(tVar, lowestOneBit2, i10, bVar, fVar);
                i18++;
                i17 ^= lowestOneBit2;
            }
            while (i15 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i15);
                int i19 = i16 * 2;
                if (!tVar3.q(lowestOneBit3)) {
                    int n10 = n(lowestOneBit3);
                    tVar2.f19431d[i19] = t(n10);
                    tVar2.f19431d[i19 + 1] = W(n10);
                } else {
                    int n11 = tVar3.n(lowestOneBit3);
                    tVar2.f19431d[i19] = tVar3.t(n11);
                    tVar2.f19431d[i19 + 1] = tVar3.W(n11);
                    if (q(lowestOneBit3)) {
                        bVar2.c(bVar.a() + 1);
                    }
                }
                i16++;
                i15 ^= lowestOneBit3;
            }
            if (l(tVar2)) {
                return this;
            }
            if (tVar3.l(tVar2)) {
                return tVar3;
            }
            return tVar2;
        }
    }

    public final C1916t G(int i10, Object obj, int i11, C1902f fVar) {
        C1916t G10;
        int f10 = 1 << C1920x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (C6496s.c(obj, t(n10))) {
                return I(n10, f10, fVar);
            }
            return this;
        } else if (!r(f10)) {
            return this;
        } else {
            int O10 = O(f10);
            C1916t N10 = N(O10);
            if (i11 == 30) {
                G10 = N10.y(obj, fVar);
            } else {
                G10 = N10.G(i10, obj, i11 + 5, fVar);
            }
            return K(N10, G10, O10, f10, fVar.l());
        }
    }

    public final C1916t H(int i10, Object obj, Object obj2, int i11, C1902f fVar) {
        C1916t H10;
        Object obj3 = obj;
        Object obj4 = obj2;
        int i12 = i11;
        C1902f fVar2 = fVar;
        int i13 = i10;
        int f10 = 1 << C1920x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (!C6496s.c(obj, t(n10)) || !C6496s.c(obj2, W(n10))) {
                return this;
            }
            return I(n10, f10, fVar2);
        } else if (!r(f10)) {
            return this;
        } else {
            int O10 = O(f10);
            C1916t N10 = N(O10);
            if (i12 == 30) {
                H10 = N10.z(obj, obj2, fVar2);
            } else {
                H10 = N10.H(i10, obj, obj2, i12 + 5, fVar);
            }
            C1916t tVar = H10;
            return K(N10, tVar, O10, f10, fVar.l());
        }
    }

    public final C1916t N(int i10) {
        Object obj = this.f19431d[i10];
        C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C1916t) obj;
    }

    public final int O(int i10) {
        return (this.f19431d.length - 1) - Integer.bitCount((i10 - 1) & this.f19429b);
    }

    public final b P(int i10, Object obj, Object obj2, int i11) {
        b bVar;
        int f10 = 1 << C1920x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (!C6496s.c(obj, t(n10))) {
                return v(n10, f10, i10, obj, obj2, i11).b();
            }
            if (W(n10) == obj2) {
                return null;
            }
            return V(n10, obj2).c();
        } else if (!r(f10)) {
            return s(f10, obj, obj2).b();
        } else {
            int O10 = O(f10);
            C1916t N10 = N(O10);
            if (i11 == 30) {
                bVar = N10.h(obj, obj2);
                if (bVar == null) {
                    return null;
                }
            } else {
                bVar = N10.P(i10, obj, obj2, i11 + 5);
                if (bVar == null) {
                    return null;
                }
            }
            bVar.c(U(O10, f10, bVar.a()));
            return bVar;
        }
    }

    public final C1916t Q(int i10, Object obj, int i11) {
        C1916t tVar;
        int f10 = 1 << C1920x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (C6496s.c(obj, t(n10))) {
                return R(n10, f10);
            }
            return this;
        } else if (!r(f10)) {
            return this;
        } else {
            int O10 = O(f10);
            C1916t N10 = N(O10);
            if (i11 == 30) {
                tVar = N10.i(obj);
            } else {
                tVar = N10.Q(i10, obj, i11 + 5);
            }
            return T(N10, tVar, O10, f10);
        }
    }

    public final boolean k(int i10, Object obj, int i11) {
        int f10 = 1 << C1920x.f(i10, i11);
        if (q(f10)) {
            return C6496s.c(obj, t(n(f10)));
        }
        if (!r(f10)) {
            return false;
        }
        C1916t N10 = N(O(f10));
        if (i11 == 30) {
            return N10.f(obj);
        }
        return N10.k(i10, obj, i11 + 5);
    }

    public final int m() {
        return Integer.bitCount(this.f19428a);
    }

    public final int n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f19428a) * 2;
    }

    public final Object o(int i10, Object obj, int i11) {
        int f10 = 1 << C1920x.f(i10, i11);
        if (q(f10)) {
            int n10 = n(f10);
            if (C6496s.c(obj, t(n10))) {
                return W(n10);
            }
            return null;
        } else if (!r(f10)) {
            return null;
        } else {
            C1916t N10 = N(O(f10));
            if (i11 == 30) {
                return N10.g(obj);
            }
            return N10.o(i10, obj, i11 + 5);
        }
    }

    public final Object[] p() {
        return this.f19431d;
    }

    public final boolean q(int i10) {
        if ((i10 & this.f19428a) != 0) {
            return true;
        }
        return false;
    }

    public C1916t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, (e) null);
    }
}
