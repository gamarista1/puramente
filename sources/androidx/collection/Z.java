package androidx.collection;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;
import u.C2664a;

public class Z implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ boolean f12140a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ int[] f12141b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object[] f12142c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ int f12143d;

    public Z() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public void a(int i10, Object obj) {
        int i11 = this.f12143d;
        if (i11 == 0 || i10 > this.f12141b[i11 - 1]) {
            if (this.f12140a && i11 >= this.f12141b.length) {
                a0.d(this);
            }
            int i12 = this.f12143d;
            if (i12 >= this.f12141b.length) {
                int e10 = C2664a.e(i12 + 1);
                int[] copyOf = Arrays.copyOf(this.f12141b, e10);
                C6496s.g(copyOf, "copyOf(this, newSize)");
                this.f12141b = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f12142c, e10);
                C6496s.g(copyOf2, "copyOf(this, newSize)");
                this.f12142c = copyOf2;
            }
            this.f12141b[i12] = i10;
            this.f12142c[i12] = obj;
            this.f12143d = i12 + 1;
            return;
        }
        k(i10, obj);
    }

    public void c() {
        int i10 = this.f12143d;
        Object[] objArr = this.f12142c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f12143d = 0;
        this.f12140a = false;
    }

    /* renamed from: d */
    public Z clone() {
        Object clone = super.clone();
        C6496s.f(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        Z z10 = (Z) clone;
        z10.f12141b = (int[]) this.f12141b.clone();
        z10.f12142c = (Object[]) this.f12142c.clone();
        return z10;
    }

    public boolean e(int i10) {
        if (h(i10) >= 0) {
            return true;
        }
        return false;
    }

    public Object g(int i10) {
        return a0.c(this, i10);
    }

    public int h(int i10) {
        if (this.f12140a) {
            a0.d(this);
        }
        return C2664a.a(this.f12141b, this.f12143d, i10);
    }

    public int i(Object obj) {
        if (this.f12140a) {
            a0.d(this);
        }
        int i10 = this.f12143d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f12142c[i11] == obj) {
                return i11;
            }
        }
        return -1;
    }

    public int j(int i10) {
        if (this.f12140a) {
            a0.d(this);
        }
        return this.f12141b[i10];
    }

    public void k(int i10, Object obj) {
        int a10 = C2664a.a(this.f12141b, this.f12143d, i10);
        if (a10 >= 0) {
            this.f12142c[a10] = obj;
            return;
        }
        int i11 = ~a10;
        if (i11 >= this.f12143d || this.f12142c[i11] != a0.f12156a) {
            if (this.f12140a && this.f12143d >= this.f12141b.length) {
                a0.d(this);
                i11 = ~C2664a.a(this.f12141b, this.f12143d, i10);
            }
            int i12 = this.f12143d;
            if (i12 >= this.f12141b.length) {
                int e10 = C2664a.e(i12 + 1);
                int[] copyOf = Arrays.copyOf(this.f12141b, e10);
                C6496s.g(copyOf, "copyOf(this, newSize)");
                this.f12141b = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.f12142c, e10);
                C6496s.g(copyOf2, "copyOf(this, newSize)");
                this.f12142c = copyOf2;
            }
            int i13 = this.f12143d;
            if (i13 - i11 != 0) {
                int[] iArr = this.f12141b;
                int i14 = i11 + 1;
                C6559l.k(iArr, iArr, i14, i11, i13);
                Object[] objArr = this.f12142c;
                C6559l.m(objArr, objArr, i14, i11, this.f12143d);
            }
            this.f12141b[i11] = i10;
            this.f12142c[i11] = obj;
            this.f12143d++;
            return;
        }
        this.f12141b[i11] = i10;
        this.f12142c[i11] = obj;
    }

    public void l(int i10) {
        if (this.f12142c[i10] != a0.f12156a) {
            this.f12142c[i10] = a0.f12156a;
            this.f12140a = true;
        }
    }

    public Object m(int i10, Object obj) {
        int h10 = h(i10);
        if (h10 < 0) {
            return null;
        }
        Object[] objArr = this.f12142c;
        Object obj2 = objArr[h10];
        objArr[h10] = obj;
        return obj2;
    }

    public int o() {
        if (this.f12140a) {
            a0.d(this);
        }
        return this.f12143d;
    }

    public Object p(int i10) {
        if (this.f12140a) {
            a0.d(this);
        }
        return this.f12142c[i10];
    }

    public String toString() {
        if (o() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f12143d * 28);
        sb2.append('{');
        int i10 = this.f12143d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(j(i11));
            sb2.append('=');
            Object p10 = p(i11);
            if (p10 != this) {
                sb2.append(p10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "buffer.toString()");
        return sb3;
    }

    public Z(int i10) {
        if (i10 == 0) {
            this.f12141b = C2664a.f26373a;
            this.f12142c = C2664a.f26375c;
            return;
        }
        int e10 = C2664a.e(i10);
        this.f12141b = new int[e10];
        this.f12142c = new Object[e10];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
