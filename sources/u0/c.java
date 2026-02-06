package U0;

import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private int[] f6332a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f6333b;

    /* renamed from: c  reason: collision with root package name */
    private int f6334c;

    public c(int i10) {
        if (i10 == 0) {
            this.f6332a = a.f6320a;
            this.f6333b = a.f6321b;
        } else {
            this.f6332a = new int[i10];
            this.f6333b = new Object[(i10 << 1)];
        }
        this.f6334c = 0;
    }

    public final boolean a(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final Object b(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.f6333b[(d10 << 1) + 1];
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final int c(Object obj, int i10) {
        int i11 = this.f6334c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = a.a(this.f6332a, i11, i10);
        if (a10 < 0 || C6496s.c(obj, this.f6333b[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f6332a[i12] == i10) {
            if (C6496s.c(obj, this.f6333b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f6332a[i13] == i10) {
            if (C6496s.c(obj, this.f6333b[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj, obj.hashCode());
    }

    /* access modifiers changed from: protected */
    public final int e() {
        int i10 = this.f6334c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = a.a(this.f6332a, i10, 0);
        if (a10 < 0 || this.f6333b[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f6332a[i11] == 0) {
            if (this.f6333b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f6332a[i12] == 0) {
            if (this.f6333b[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i10 = this.f6334c;
                if (i10 != cVar.f6334c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object g10 = g(i11);
                    Object h10 = h(i11);
                    Object b10 = cVar.b(g10);
                    if (h10 == null) {
                        if (b10 != null || !cVar.a(g10)) {
                            return false;
                        }
                    } else if (!C6496s.c(h10, b10)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f6334c != ((Map) obj).size()) {
                return false;
            } else {
                int i12 = this.f6334c;
                for (int i13 = 0; i13 < i12; i13++) {
                    Object g11 = g(i13);
                    Object h11 = h(i13);
                    Object obj2 = ((Map) obj).get(g11);
                    if (h11 == null) {
                        if (obj2 != null || !((Map) obj).containsKey(g11)) {
                            return false;
                        }
                    } else if (!C6496s.c(h11, obj2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        if (this.f6334c <= 0) {
            return true;
        }
        return false;
    }

    public final Object g(int i10) {
        return this.f6333b[i10 << 1];
    }

    public final Object h(int i10) {
        return this.f6333b[(i10 << 1) + 1];
    }

    public int hashCode() {
        int i10;
        int[] iArr = this.f6332a;
        Object[] objArr = this.f6333b;
        int i11 = this.f6334c;
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

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f6334c * 28);
        sb2.append('{');
        int i10 = this.f6334c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object g10 = g(i11);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object h10 = h(i11);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
