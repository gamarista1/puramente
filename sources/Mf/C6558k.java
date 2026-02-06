package mf;

import Ef.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: mf.k  reason: case insensitive filesystem */
public final class C6558k extends C6553f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f72075d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f72076e = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f72077a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f72078b;

    /* renamed from: c  reason: collision with root package name */
    private int f72079c;

    /* renamed from: mf.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6558k(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f72076e;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f72078b = objArr;
    }

    private final void A(int i10, int i11) {
        if (i10 < i11) {
            C6559l.w(this.f72078b, (Object) null, i10, i11);
            return;
        }
        Object[] objArr = this.f72078b;
        C6559l.w(objArr, (Object) null, i10, objArr.length);
        C6559l.w(this.f72078b, (Object) null, 0, i11);
    }

    private final int C(int i10) {
        Object[] objArr = this.f72078b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    private final void D() {
        this.modCount++;
    }

    private final void I(int i10, int i11) {
        int C10 = C(this.f72077a + (i10 - 1));
        int C11 = C(this.f72077a + (i11 - 1));
        while (i10 > 0) {
            int i12 = C10 + 1;
            int min = Math.min(i10, Math.min(i12, C11 + 1));
            Object[] objArr = this.f72078b;
            int i13 = C11 - min;
            int i14 = C10 - min;
            C6559l.m(objArr, objArr, i13 + 1, i14 + 1, i12);
            C10 = z(i14);
            C11 = z(i13);
            i10 -= min;
        }
    }

    private final void N(int i10, int i11) {
        int C10 = C(this.f72077a + i11);
        int C11 = C(this.f72077a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size > 0) {
                Object[] objArr = this.f72078b;
                i11 = Math.min(size, Math.min(objArr.length - C10, objArr.length - C11));
                Object[] objArr2 = this.f72078b;
                int i12 = C10 + i11;
                C6559l.m(objArr2, objArr2, C11, C10, i12);
                C10 = C(i12);
                C11 = C(C11 + i11);
            } else {
                return;
            }
        }
    }

    private final void g(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f72078b.length;
        while (i10 < length && it.hasNext()) {
            this.f72078b[i10] = it.next();
            i10++;
        }
        int i11 = this.f72077a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f72078b[i12] = it.next();
        }
        this.f72079c = size() + collection.size();
    }

    private final void k(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f72078b;
        C6559l.m(objArr2, objArr, 0, this.f72077a, objArr2.length);
        Object[] objArr3 = this.f72078b;
        int length = objArr3.length;
        int i11 = this.f72077a;
        C6559l.m(objArr3, objArr, length - i11, 0, i11);
        this.f72077a = 0;
        this.f72078b = objArr;
    }

    private final int n(int i10) {
        if (i10 == 0) {
            return C6559l.j0(this.f72078b);
        }
        return i10 - 1;
    }

    private final void r(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f72078b;
            if (i10 > objArr.length) {
                if (objArr == f72076e) {
                    this.f72078b = new Object[m.d(i10, 10)];
                } else {
                    k(C6550c.f72053a.e(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    private final int v(int i10) {
        if (i10 == C6559l.j0(this.f72078b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int z(int i10) {
        if (i10 < 0) {
            return i10 + this.f72078b.length;
        }
        return i10;
    }

    public final Object E() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object H() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public int a() {
        return this.f72079c;
    }

    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        C6496s.h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        D();
        r(size() + collection.size());
        g(C(this.f72077a + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        D();
        r(size() + 1);
        int n10 = n(this.f72077a);
        this.f72077a = n10;
        this.f72078b[n10] = obj;
        this.f72079c = size() + 1;
    }

    public final void addLast(Object obj) {
        D();
        r(size() + 1);
        this.f72078b[C(this.f72077a + size())] = obj;
        this.f72079c = size() + 1;
    }

    public Object b(int i10) {
        C6550c.f72053a.b(i10, size());
        if (i10 == C6565s.p(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        D();
        int C10 = C(this.f72077a + i10);
        Object obj = this.f72078b[C10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f72077a;
            if (C10 >= i11) {
                Object[] objArr = this.f72078b;
                C6559l.m(objArr, objArr, i11 + 1, i11, C10);
            } else {
                Object[] objArr2 = this.f72078b;
                C6559l.m(objArr2, objArr2, 1, 0, C10);
                Object[] objArr3 = this.f72078b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f72077a;
                C6559l.m(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f72078b;
            int i13 = this.f72077a;
            objArr4[i13] = null;
            this.f72077a = v(i13);
        } else {
            int C11 = C(this.f72077a + C6565s.p(this));
            if (C10 <= C11) {
                Object[] objArr5 = this.f72078b;
                C6559l.m(objArr5, objArr5, C10, C10 + 1, C11 + 1);
            } else {
                Object[] objArr6 = this.f72078b;
                C6559l.m(objArr6, objArr6, C10, C10 + 1, objArr6.length);
                Object[] objArr7 = this.f72078b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C6559l.m(objArr7, objArr7, 0, 1, C11 + 1);
            }
            this.f72078b[C11] = null;
        }
        this.f72079c = size() - 1;
        return obj;
    }

    public void clear() {
        if (!isEmpty()) {
            D();
            A(this.f72077a, C(this.f72077a + size()));
        }
        this.f72077a = 0;
        this.f72079c = 0;
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f72078b[this.f72077a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public Object get(int i10) {
        C6550c.f72053a.b(i10, size());
        return this.f72078b[C(this.f72077a + i10)];
    }

    public int indexOf(Object obj) {
        int i10;
        int C10 = C(this.f72077a + size());
        int i11 = this.f72077a;
        if (i11 < C10) {
            while (i11 < C10) {
                if (C6496s.c(obj, this.f72078b[i11])) {
                    i10 = this.f72077a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < C10) {
            return -1;
        } else {
            int length = this.f72078b.length;
            while (true) {
                if (i11 >= length) {
                    int i12 = 0;
                    while (i12 < C10) {
                        if (C6496s.c(obj, this.f72078b[i12])) {
                            i11 = i12 + this.f72078b.length;
                            i10 = this.f72077a;
                        } else {
                            i12++;
                        }
                    }
                    return -1;
                } else if (C6496s.c(obj, this.f72078b[i11])) {
                    i10 = this.f72077a;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f72078b[C(this.f72077a + C6565s.p(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int i11;
        int C10 = C(this.f72077a + size());
        int i12 = this.f72077a;
        if (i12 < C10) {
            i10 = C10 - 1;
            if (i12 <= i10) {
                while (!C6496s.c(obj, this.f72078b[i10])) {
                    if (i10 != i12) {
                        i10--;
                    }
                }
                i11 = this.f72077a;
            }
            return -1;
        }
        if (i12 > C10) {
            int i13 = C10 - 1;
            while (true) {
                if (-1 >= i13) {
                    int j02 = C6559l.j0(this.f72078b);
                    int i14 = this.f72077a;
                    if (i14 <= j02) {
                        while (!C6496s.c(obj, this.f72078b[i10])) {
                            if (i10 != i14) {
                                j02 = i10 - 1;
                            }
                        }
                        i11 = this.f72077a;
                    }
                } else if (C6496s.c(obj, this.f72078b[i13])) {
                    i10 = i13 + this.f72078b.length;
                    i11 = this.f72077a;
                    break;
                } else {
                    i13--;
                }
            }
        }
        return -1;
        return i10 - i11;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f72078b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f72077a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.C(r0)
            int r2 = r11.f72077a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f72078b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f72078b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f72078b
            mf.C6559l.w(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f72078b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f72078b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f72078b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.C(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f72078b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f72078b
            r2[r5] = r6
            int r5 = r11.v(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.D()
            int r12 = r11.f72077a
            int r5 = r5 - r12
            int r12 = r11.z(r5)
            r11.f72079c = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.C6558k.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            D();
            Object[] objArr = this.f72078b;
            int i10 = this.f72077a;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f72077a = v(i10);
            this.f72079c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            D();
            int C10 = C(this.f72077a + C6565s.p(this));
            Object[] objArr = this.f72078b;
            Object obj = objArr[C10];
            objArr[C10] = null;
            this.f72079c = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        C6550c.f72053a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == size()) {
                clear();
            } else if (i12 == 1) {
                remove(i10);
            } else {
                D();
                if (i10 < size() - i11) {
                    I(i10, i11);
                    int C10 = C(this.f72077a + i12);
                    A(this.f72077a, C10);
                    this.f72077a = C10;
                } else {
                    N(i10, i11);
                    int C11 = C(this.f72077a + size());
                    A(z(C11 - i12), C11);
                }
                this.f72079c = size() - i12;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f72078b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f72077a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.C(r0)
            int r2 = r11.f72077a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f72078b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f72078b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f72078b
            mf.C6559l.w(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f72078b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f72078b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f72078b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.C(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f72078b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f72078b
            r2[r5] = r6
            int r5 = r11.v(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.D()
            int r12 = r11.f72077a
            int r5 = r5 - r12
            int r12 = r11.z(r5)
            r11.f72079c = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mf.C6558k.retainAll(java.util.Collection):boolean");
    }

    public Object set(int i10, Object obj) {
        C6550c.f72053a.b(i10, size());
        int C10 = C(this.f72077a + i10);
        Object[] objArr = this.f72078b;
        Object obj2 = objArr[C10];
        objArr[C10] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return this.f72078b[this.f72077a];
    }

    public Object[] toArray(Object[] objArr) {
        C6496s.h(objArr, "array");
        if (objArr.length < size()) {
            objArr = C6560m.a(objArr, size());
        }
        int C10 = C(this.f72077a + size());
        int i10 = this.f72077a;
        if (i10 < C10) {
            C6559l.q(this.f72078b, objArr, 0, i10, C10, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f72078b;
            C6559l.m(objArr2, objArr, 0, this.f72077a, objArr2.length);
            Object[] objArr3 = this.f72078b;
            C6559l.m(objArr3, objArr, objArr3.length - this.f72077a, 0, C10);
        }
        return C6565s.g(size(), objArr);
    }

    public final Object x() {
        if (isEmpty()) {
            return null;
        }
        return this.f72078b[C(this.f72077a + C6565s.p(this))];
    }

    public void add(int i10, Object obj) {
        C6550c.f72053a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
        } else if (i10 == 0) {
            addFirst(obj);
        } else {
            D();
            r(size() + 1);
            int C10 = C(this.f72077a + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int n10 = n(C10);
                int n11 = n(this.f72077a);
                int i11 = this.f72077a;
                if (n10 >= i11) {
                    Object[] objArr = this.f72078b;
                    objArr[n11] = objArr[i11];
                    C6559l.m(objArr, objArr, i11, i11 + 1, n10 + 1);
                } else {
                    Object[] objArr2 = this.f72078b;
                    C6559l.m(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f72078b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C6559l.m(objArr3, objArr3, 0, 1, n10 + 1);
                }
                this.f72078b[n10] = obj;
                this.f72077a = n11;
            } else {
                int C11 = C(this.f72077a + size());
                if (C10 < C11) {
                    Object[] objArr4 = this.f72078b;
                    C6559l.m(objArr4, objArr4, C10 + 1, C10, C11);
                } else {
                    Object[] objArr5 = this.f72078b;
                    C6559l.m(objArr5, objArr5, 1, 0, C11);
                    Object[] objArr6 = this.f72078b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C6559l.m(objArr6, objArr6, C10 + 1, C10, objArr6.length - 1);
                }
                this.f72078b[C10] = obj;
            }
            this.f72079c = size() + 1;
        }
    }

    public boolean addAll(int i10, Collection collection) {
        C6496s.h(collection, "elements");
        C6550c.f72053a.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        D();
        r(size() + collection.size());
        int C10 = C(this.f72077a + size());
        int C11 = C(this.f72077a + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f72077a;
            int i12 = i11 - size;
            if (C11 < i11) {
                Object[] objArr = this.f72078b;
                C6559l.m(objArr, objArr, i12, i11, objArr.length);
                if (size >= C11) {
                    Object[] objArr2 = this.f72078b;
                    C6559l.m(objArr2, objArr2, objArr2.length - size, 0, C11);
                } else {
                    Object[] objArr3 = this.f72078b;
                    C6559l.m(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f72078b;
                    C6559l.m(objArr4, objArr4, 0, size, C11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f72078b;
                C6559l.m(objArr5, objArr5, i12, i11, C11);
            } else {
                Object[] objArr6 = this.f72078b;
                i12 += objArr6.length;
                int i13 = C11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    C6559l.m(objArr6, objArr6, i12, i11, C11);
                } else {
                    C6559l.m(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f72078b;
                    C6559l.m(objArr7, objArr7, 0, this.f72077a + length, C11);
                }
            }
            this.f72077a = i12;
            g(z(C11 - size), collection);
        } else {
            int i14 = C11 + size;
            if (C11 < C10) {
                int i15 = size + C10;
                Object[] objArr8 = this.f72078b;
                if (i15 <= objArr8.length) {
                    C6559l.m(objArr8, objArr8, i14, C11, C10);
                } else if (i14 >= objArr8.length) {
                    C6559l.m(objArr8, objArr8, i14 - objArr8.length, C11, C10);
                } else {
                    int length2 = C10 - (i15 - objArr8.length);
                    C6559l.m(objArr8, objArr8, 0, length2, C10);
                    Object[] objArr9 = this.f72078b;
                    C6559l.m(objArr9, objArr9, i14, C11, length2);
                }
            } else {
                Object[] objArr10 = this.f72078b;
                C6559l.m(objArr10, objArr10, size, 0, C10);
                Object[] objArr11 = this.f72078b;
                if (i14 >= objArr11.length) {
                    C6559l.m(objArr11, objArr11, i14 - objArr11.length, C11, objArr11.length);
                } else {
                    C6559l.m(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f72078b;
                    C6559l.m(objArr12, objArr12, i14, C11, objArr12.length - size);
                }
            }
            g(C11, collection);
        }
        return true;
    }

    public C6558k() {
        this.f72078b = f72076e;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
