package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import u.C2664a;
import u.C2667d;

public class Y {

    /* renamed from: a  reason: collision with root package name */
    private int[] f12137a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f12138b;

    /* renamed from: c  reason: collision with root package name */
    private int f12139c;

    public Y() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    private final int c(Object obj, int i10) {
        int i11 = this.f12139c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = C2664a.a(this.f12137a, i11, i10);
        if (a10 < 0 || C6496s.c(obj, this.f12138b[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f12137a[i12] == i10) {
            if (C6496s.c(obj, this.f12138b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f12137a[i13] == i10) {
            if (C6496s.c(obj, this.f12138b[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    private final int g() {
        int i10 = this.f12139c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = C2664a.a(this.f12137a, i10, 0);
        if (a10 < 0 || this.f12138b[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f12137a[i11] == 0) {
            if (this.f12138b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f12137a[i12] == 0) {
            if (this.f12138b[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public final int a(Object obj) {
        int i10 = this.f12139c * 2;
        Object[] objArr = this.f12138b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (C6496s.c(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int i10) {
        int i11 = this.f12139c;
        int[] iArr = this.f12137a;
        if (iArr.length < i10) {
            int[] copyOf = Arrays.copyOf(iArr, i10);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f12137a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12138b, i10 * 2);
            C6496s.g(copyOf2, "copyOf(this, newSize)");
            this.f12138b = copyOf2;
        }
        if (this.f12139c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f12139c > 0) {
            this.f12137a = C2664a.f26373a;
            this.f12138b = C2664a.f26375c;
            this.f12139c = 0;
        }
        if (this.f12139c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public int e(Object obj) {
        if (obj == null) {
            return g();
        }
        return c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof Y) {
                if (size() != ((Y) obj).size()) {
                    return false;
                }
                Y y10 = (Y) obj;
                int i10 = this.f12139c;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object i12 = i(i11);
                    Object n10 = n(i11);
                    Object obj2 = y10.get(i12);
                    if (n10 == null) {
                        if (obj2 != null || !y10.containsKey(i12)) {
                            return false;
                        }
                    } else if (!C6496s.c(n10, obj2)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            } else {
                int i13 = this.f12139c;
                for (int i14 = 0; i14 < i13; i14++) {
                    Object i15 = i(i14);
                    Object n11 = n(i14);
                    Object obj3 = ((Map) obj).get(i15);
                    if (n11 == null) {
                        if (obj3 != null || !((Map) obj).containsKey(i15)) {
                            return false;
                        }
                    } else if (!C6496s.c(n11, obj3)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return this.f12138b[(e10 << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return this.f12138b[(e10 << 1) + 1];
        }
        return obj2;
    }

    public int hashCode() {
        int i10;
        int[] iArr = this.f12137a;
        Object[] objArr = this.f12138b;
        int i11 = this.f12139c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            int i15 = iArr[i13];
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i14 += i10 ^ i15;
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public Object i(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12139c) {
            z10 = true;
        }
        if (!z10) {
            C2667d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f12138b[i10 << 1];
    }

    public boolean isEmpty() {
        if (this.f12139c <= 0) {
            return true;
        }
        return false;
    }

    public void j(Y y10) {
        C6496s.h(y10, "map");
        int i10 = y10.f12139c;
        b(this.f12139c + i10);
        if (this.f12139c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(y10.i(i11), y10.n(i11));
            }
        } else if (i10 > 0) {
            C6559l.k(y10.f12137a, this.f12137a, 0, 0, i10);
            C6559l.m(y10.f12138b, this.f12138b, 0, 0, i10 << 1);
            this.f12139c = i10;
        }
    }

    public Object k(int i10) {
        boolean z10;
        if (i10 < 0 || i10 >= this.f12139c) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C2667d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f12138b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f12139c;
        if (i12 <= 1) {
            clear();
        } else {
            int i13 = i12 - 1;
            int[] iArr = this.f12137a;
            int i14 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i13) {
                    int i15 = i10 + 1;
                    C6559l.k(iArr, iArr, i10, i15, i12);
                    Object[] objArr2 = this.f12138b;
                    C6559l.m(objArr2, objArr2, i11, i15 << 1, i12 << 1);
                }
                Object[] objArr3 = this.f12138b;
                int i16 = i13 << 1;
                objArr3[i16] = null;
                objArr3[i16 + 1] = null;
            } else {
                if (i12 > 8) {
                    i14 = i12 + (i12 >> 1);
                }
                int[] copyOf = Arrays.copyOf(iArr, i14);
                C6496s.g(copyOf, "copyOf(this, newSize)");
                this.f12137a = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f12138b, i14 << 1);
                C6496s.g(copyOf2, "copyOf(this, newSize)");
                this.f12138b = copyOf2;
                if (i12 == this.f12139c) {
                    if (i10 > 0) {
                        C6559l.k(iArr, this.f12137a, 0, 0, i10);
                        C6559l.m(objArr, this.f12138b, 0, 0, i11);
                    }
                    if (i10 < i13) {
                        int i17 = i10 + 1;
                        C6559l.k(iArr, this.f12137a, i10, i17, i12);
                        C6559l.m(objArr, this.f12138b, i11, i17 << 1, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            if (i12 == this.f12139c) {
                this.f12139c = i13;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return obj;
    }

    public Object l(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12139c) {
            z10 = true;
        }
        if (!z10) {
            C2667d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f12138b;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    public Object n(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f12139c) {
            z10 = true;
        }
        if (!z10) {
            C2667d.a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f12138b[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12 = this.f12139c;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        if (obj != null) {
            i11 = c(obj, i10);
        } else {
            i11 = g();
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            Object[] objArr = this.f12138b;
            Object obj3 = objArr[i13];
            objArr[i13] = obj2;
            return obj3;
        }
        int i14 = ~i11;
        int[] iArr = this.f12137a;
        if (i12 >= iArr.length) {
            int i15 = 8;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i15 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i15);
            C6496s.g(copyOf, "copyOf(this, newSize)");
            this.f12137a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12138b, i15 << 1);
            C6496s.g(copyOf2, "copyOf(this, newSize)");
            this.f12138b = copyOf2;
            if (i12 != this.f12139c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr2 = this.f12137a;
            int i16 = i14 + 1;
            C6559l.k(iArr2, iArr2, i16, i14, i12);
            Object[] objArr2 = this.f12138b;
            C6559l.m(objArr2, objArr2, i16 << 1, i14 << 1, this.f12139c << 1);
        }
        int i17 = this.f12139c;
        if (i12 == i17) {
            int[] iArr3 = this.f12137a;
            if (i14 < iArr3.length) {
                iArr3[i14] = i10;
                Object[] objArr3 = this.f12138b;
                int i18 = i14 << 1;
                objArr3[i18] = obj;
                objArr3[i18 + 1] = obj2;
                this.f12139c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public Object remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return k(e10);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return l(e10, obj2);
        }
        return null;
    }

    public int size() {
        return this.f12139c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12139c * 28);
        sb2.append('{');
        int i10 = this.f12139c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object i12 = i(i11);
            if (i12 != sb2) {
                sb2.append(i12);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object n10 = n(i11);
            if (n10 != sb2) {
                sb2.append(n10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public Y(int i10) {
        int[] iArr;
        Object[] objArr;
        if (i10 == 0) {
            iArr = C2664a.f26373a;
        } else {
            iArr = new int[i10];
        }
        this.f12137a = iArr;
        if (i10 == 0) {
            objArr = C2664a.f26375c;
        } else {
            objArr = new Object[(i10 << 1)];
        }
        this.f12138b = objArr;
    }

    public boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 < 0 || !C6496s.c(obj2, n(e10))) {
            return false;
        }
        k(e10);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int e10 = e(obj);
        if (e10 < 0 || !C6496s.c(obj2, n(e10))) {
            return false;
        }
        l(e10, obj3);
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public Y(Y y10) {
        this(0, 1, (DefaultConstructorMarker) null);
        if (y10 != null) {
            j(y10);
        }
    }
}
