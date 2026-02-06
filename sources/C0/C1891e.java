package c0;

import Ef.m;
import Y.C0;
import b0.C1867e;
import f0.C1957a;
import f0.d;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;
import yf.C6798l;

/* renamed from: c0.e  reason: case insensitive filesystem */
public final class C1891e extends C1888b implements C1867e {

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f19179b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f19180c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19181d;

    /* renamed from: e  reason: collision with root package name */
    private final int f19182e;

    public C1891e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        boolean z10;
        this.f19179b = objArr;
        this.f19180c = objArr2;
        this.f19181d = i10;
        this.f19182e = i11;
        boolean z11 = false;
        if (size() > 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("Trie-based persistent vector should have at least 33 elements, got " + size());
        }
        C1957a.a(size() - l.d(size()) <= m.h(objArr2.length, 32) ? true : z11);
    }

    private final C1867e A(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int size = size() - i10;
        if (i12 < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1957a.a(z10);
        if (size == 1) {
            return t(objArr, i10, i11);
        }
        Object[] copyOf = Arrays.copyOf(this.f19180c, 32);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        int i13 = size - 1;
        if (i12 < i13) {
            C6559l.m(this.f19180c, copyOf, i12, i12 + 1, size);
        }
        copyOf[i13] = null;
        return new C1891e(objArr, copyOf, (i10 + size) - 1, i11);
    }

    private final int C() {
        return l.d(size());
    }

    private final Object[] D(Object[] objArr, int i10, int i11, Object obj) {
        int a10 = l.a(i11, i10);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            copyOf[a10] = obj;
        } else {
            Object obj2 = copyOf[a10];
            C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[a10] = D((Object[]) obj2, i10 - 5, i11, obj);
        }
        return copyOf;
    }

    private final Object[] b(int i10) {
        if (C() <= i10) {
            return this.f19180c;
        }
        Object[] objArr = this.f19179b;
        for (int i11 = this.f19182e; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[l.a(i10, i11)];
            C6496s.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] k(Object[] objArr, int i10, int i11, Object obj, C1890d dVar) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        int i12 = i10;
        int a10 = l.a(i11, i12);
        if (i12 == 0) {
            if (a10 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr3, 32);
                C6496s.g(objArr2, "copyOf(this, newSize)");
            }
            C6559l.m(objArr3, objArr2, a10 + 1, a10, 31);
            dVar.b(objArr3[31]);
            objArr2[a10] = obj;
            return objArr2;
        }
        C1890d dVar2 = dVar;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        int i13 = i12 - 5;
        Object obj2 = objArr3[a10];
        String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        C6496s.f(obj2, str);
        copyOf[a10] = k((Object[]) obj2, i13, i11, obj, dVar);
        int i14 = a10 + 1;
        while (i14 < 32 && copyOf[i14] != null) {
            Object obj3 = objArr3[i14];
            C6496s.f(obj3, str);
            Object[] objArr4 = copyOf;
            objArr4[i14] = k((Object[]) obj3, i13, 0, dVar.a(), dVar);
            i14++;
            copyOf = objArr4;
            str = str;
        }
        return copyOf;
    }

    private final C1891e n(Object[] objArr, int i10, Object obj) {
        int size = size() - C();
        Object[] copyOf = Arrays.copyOf(this.f19180c, 32);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            C6559l.m(this.f19180c, copyOf, i10 + 1, i10, size);
            copyOf[i10] = obj;
            return new C1891e(objArr, copyOf, size() + 1, this.f19182e);
        }
        Object[] objArr2 = this.f19180c;
        Object obj2 = objArr2[31];
        C6559l.m(objArr2, copyOf, i10 + 1, i10, size - 1);
        copyOf[i10] = obj;
        return v(objArr, copyOf, l.c(obj2));
    }

    private final Object[] r(Object[] objArr, int i10, int i11, C1890d dVar) {
        Object[] objArr2;
        int a10 = l.a(i11, i10);
        if (i10 == 5) {
            dVar.b(objArr[a10]);
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[a10];
            C6496s.f(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = r(objArr3, i10 - 5, i11, dVar);
        }
        if (objArr2 == null && a10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        copyOf[a10] = objArr2;
        return copyOf;
    }

    private final C1867e t(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C6496s.g(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        C1890d dVar = new C1890d((Object) null);
        Object[] r10 = r(objArr, i11, i10 - 1, dVar);
        C6496s.e(r10);
        Object a10 = dVar.a();
        C6496s.f(a10, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a10;
        if (r10[1] != null) {
            return new C1891e(r10, objArr2, i10, i11);
        }
        Object obj = r10[0];
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new C1891e((Object[]) obj, objArr2, i10, i11 - 5);
    }

    private final C1891e v(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i10 = this.f19182e;
        if (size <= (1 << i10)) {
            return new C1891e(x(objArr, i10, objArr2), objArr3, size() + 1, this.f19182e);
        }
        Object[] c10 = l.c(objArr);
        int i11 = this.f19182e + 5;
        return new C1891e(x(c10, i11, objArr2), objArr3, size() + 1, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r4 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object[] x(java.lang.Object[] r4, int r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.size()
            int r0 = r0 + -1
            int r0 = c0.l.a(r0, r5)
            r1 = 32
            if (r4 == 0) goto L_0x0019
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.C6496s.g(r4, r2)
            if (r4 != 0) goto L_0x001b
        L_0x0019:
            java.lang.Object[] r4 = new java.lang.Object[r1]
        L_0x001b:
            r1 = 5
            if (r5 != r1) goto L_0x0021
            r4[r0] = r6
            goto L_0x002c
        L_0x0021:
            r2 = r4[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r5 = r5 - r1
            java.lang.Object[] r5 = r3.x(r2, r5, r6)
            r4[r0] = r5
        L_0x002c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.C1891e.x(java.lang.Object[], int, java.lang.Object[]):java.lang.Object[]");
    }

    private final Object[] z(Object[] objArr, int i10, int i11, C1890d dVar) {
        Object[] objArr2;
        int a10 = l.a(i11, i10);
        int i12 = 31;
        if (i10 == 0) {
            if (a10 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                C6496s.g(objArr2, "copyOf(this, newSize)");
            }
            C6559l.m(objArr, objArr2, a10, a10 + 1, 32);
            objArr2[31] = dVar.a();
            dVar.b(objArr[a10]);
            return objArr2;
        }
        if (objArr[31] == null) {
            i12 = l.a(C() - 1, i10);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        int i13 = i10 - 5;
        int i14 = a10 + 1;
        if (i14 <= i12) {
            while (true) {
                Object obj = copyOf[i12];
                C6496s.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf[i12] = z((Object[]) obj, i13, 0, dVar);
                if (i12 == i14) {
                    break;
                }
                i12--;
            }
        }
        Object obj2 = copyOf[a10];
        C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[a10] = z((Object[]) obj2, i13, i11, dVar);
        return copyOf;
    }

    public C1867e J(C6798l lVar) {
        f g10 = builder();
        g10.i0(lVar);
        return g10.f();
    }

    public int a() {
        return this.f19181d;
    }

    public C1867e add(Object obj) {
        int size = size() - C();
        if (size < 32) {
            Object[] copyOf = Arrays.copyOf(this.f19180c, 32);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            copyOf[size] = obj;
            return new C1891e(this.f19179b, copyOf, size() + 1, this.f19182e);
        }
        return v(this.f19179b, this.f19180c, l.c(obj));
    }

    /* renamed from: g */
    public f builder() {
        return new f(this, this.f19179b, this.f19180c, this.f19182e);
    }

    public Object get(int i10) {
        d.a(i10, size());
        return b(i10)[i10 & 31];
    }

    public ListIterator listIterator(int i10) {
        d.b(i10, size());
        return new g(this.f19179b, this.f19180c, i10, size(), (this.f19182e / 5) + 1);
    }

    public C1867e set(int i10, Object obj) {
        d.a(i10, size());
        if (C() > i10) {
            return new C1891e(D(this.f19179b, this.f19182e, i10, obj), this.f19180c, size(), this.f19182e);
        }
        Object[] copyOf = Arrays.copyOf(this.f19180c, 32);
        C6496s.g(copyOf, "copyOf(this, newSize)");
        copyOf[i10 & 31] = obj;
        return new C1891e(this.f19179b, copyOf, size(), this.f19182e);
    }

    public C1867e y(int i10) {
        d.a(i10, size());
        int C10 = C();
        if (i10 >= C10) {
            return A(this.f19179b, C10, this.f19182e, i10 - C10);
        }
        return A(z(this.f19179b, this.f19182e, i10, new C1890d(this.f19180c[0])), C10, this.f19182e, 0);
    }

    public C1867e add(int i10, Object obj) {
        d.b(i10, size());
        if (i10 == size()) {
            return add(obj);
        }
        int C10 = C();
        if (i10 >= C10) {
            return n(this.f19179b, i10 - C10, obj);
        }
        C1890d dVar = new C1890d((Object) null);
        return n(k(this.f19179b, this.f19182e, i10, obj, dVar), 0, dVar.a());
    }
}
