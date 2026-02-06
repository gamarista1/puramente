package com.google.common.collect;

import com.google.common.collect.C4768t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import nb.o;

/* renamed from: com.google.common.collect.y  reason: case insensitive filesystem */
public abstract class C4773y extends C4768t implements Set {
    private static final long serialVersionUID = 912559;

    /* renamed from: b  reason: collision with root package name */
    private transient C4770v f56783b;

    /* renamed from: com.google.common.collect.y$a */
    public static class a extends C4768t.a {

        /* renamed from: d  reason: collision with root package name */
        Object[] f56784d;

        /* renamed from: e  reason: collision with root package name */
        private int f56785e;

        public a() {
            super(4);
        }

        private void k(Object obj) {
            Objects.requireNonNull(this.f56784d);
            int length = this.f56784d.length - 1;
            int hashCode = obj.hashCode();
            int b10 = C4767s.b(hashCode);
            while (true) {
                int i10 = b10 & length;
                Object[] objArr = this.f56784d;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f56785e += hashCode;
                    super.d(obj);
                    return;
                } else if (!obj2.equals(obj)) {
                    b10 = i10 + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public a a(Object obj) {
            o.j(obj);
            if (this.f56784d == null || C4773y.t(this.f56742b) > this.f56784d.length) {
                this.f56784d = null;
                super.d(obj);
                return this;
            }
            k(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.f56784d != null) {
                for (Object h10 : objArr) {
                    a(h10);
                }
            } else {
                super.e(objArr);
            }
            return this;
        }

        public a j(Iterable iterable) {
            o.j(iterable);
            if (this.f56784d != null) {
                for (Object h10 : iterable) {
                    a(h10);
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.google.common.collect.T} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.common.collect.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.common.collect.T} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.common.collect.T} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.C4773y l() {
            /*
                r8 = this;
                int r0 = r8.f56742b
                if (r0 == 0) goto L_0x005d
                r1 = 1
                if (r0 == r1) goto L_0x0050
                java.lang.Object[] r2 = r8.f56784d
                if (r2 == 0) goto L_0x003c
                int r0 = com.google.common.collect.C4773y.t(r0)
                java.lang.Object[] r2 = r8.f56784d
                int r2 = r2.length
                if (r0 != r2) goto L_0x003c
                int r0 = r8.f56742b
                java.lang.Object[] r2 = r8.f56741a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.C4773y.Q(r0, r2)
                if (r0 == 0) goto L_0x0029
                java.lang.Object[] r0 = r8.f56741a
                int r2 = r8.f56742b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            L_0x0027:
                r3 = r0
                goto L_0x002c
            L_0x0029:
                java.lang.Object[] r0 = r8.f56741a
                goto L_0x0027
            L_0x002c:
                com.google.common.collect.T r0 = new com.google.common.collect.T
                int r4 = r8.f56785e
                java.lang.Object[] r5 = r8.f56784d
                int r2 = r5.length
                int r6 = r2 + -1
                int r7 = r8.f56742b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x004a
            L_0x003c:
                int r0 = r8.f56742b
                java.lang.Object[] r2 = r8.f56741a
                com.google.common.collect.y r0 = com.google.common.collect.C4773y.v(r0, r2)
                int r2 = r0.size()
                r8.f56742b = r2
            L_0x004a:
                r8.f56743c = r1
                r1 = 0
                r8.f56784d = r1
                return r0
            L_0x0050:
                java.lang.Object[] r0 = r8.f56741a
                r1 = 0
                r0 = r0[r1]
                java.util.Objects.requireNonNull(r0)
                com.google.common.collect.y r0 = com.google.common.collect.C4773y.E(r0)
                return r0
            L_0x005d:
                com.google.common.collect.y r0 = com.google.common.collect.C4773y.D()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C4773y.a.l():com.google.common.collect.y");
        }
    }

    /* renamed from: com.google.common.collect.y$b */
    private static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        final Object[] f56786a;

        b(Object[] objArr) {
            this.f56786a = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return C4773y.z(this.f56786a);
        }
    }

    C4773y() {
    }

    public static C4773y D() {
        return T.f56641i;
    }

    public static C4773y E(Object obj) {
        return new b0(obj);
    }

    public static C4773y H(Object obj, Object obj2) {
        return v(2, obj, obj2);
    }

    public static C4773y I(Object obj, Object obj2, Object obj3) {
        return v(3, obj, obj2, obj3);
    }

    public static C4773y N(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return v(5, obj, obj2, obj3, obj4, obj5);
    }

    public static C4773y P(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        boolean z10;
        if (objArr.length <= 2147483641) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.e(z10, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return v(length, objArr2);
    }

    /* access modifiers changed from: private */
    public static boolean Q(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static int t(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        o.e(z10, "collection too large");
        return 1073741824;
    }

    /* access modifiers changed from: private */
    public static C4773y v(int i10, Object... objArr) {
        if (i10 == 0) {
            return D();
        }
        if (i10 != 1) {
            int t10 = t(i10);
            Object[] objArr2 = new Object[t10];
            int i11 = t10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = N.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int b10 = C4767s.b(hashCode);
                while (true) {
                    int i15 = b10 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj.equals(a10)) {
                        break;
                    } else {
                        b10++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new b0(obj2);
            } else if (t(i13) < t10 / 2) {
                return v(i13, objArr);
            } else {
                if (Q(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new T(objArr, i12, objArr2, i11, i13);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return E(obj3);
        }
    }

    public static C4773y x(Collection collection) {
        if ((collection instanceof C4773y) && !(collection instanceof SortedSet)) {
            C4773y yVar = (C4773y) collection;
            if (!yVar.k()) {
                return yVar;
            }
        }
        Object[] array = collection.toArray();
        return v(array.length, array);
    }

    public static C4773y z(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return D();
        }
        if (length != 1) {
            return v(objArr.length, (Object[]) objArr.clone());
        }
        return E(objArr[0]);
    }

    /* access modifiers changed from: package-private */
    public C4770v A() {
        return C4770v.n(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return false;
    }

    public C4770v a() {
        C4770v vVar = this.f56783b;
        if (vVar != null) {
            return vVar;
        }
        C4770v A10 = A();
        this.f56783b = A10;
        return A10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4773y) || !C() || !((C4773y) obj).C() || hashCode() == obj.hashCode()) {
            return a0.a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return a0.d(this);
    }

    public abstract g0 m();

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new b(toArray());
    }
}
