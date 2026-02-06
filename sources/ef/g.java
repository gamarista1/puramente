package Ef;

import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.L;
import tf.C6729c;
import zf.C6828a;

public class g implements Iterable, C6828a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f62817d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f62818a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62819b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62820c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a(int i10, int i11, int i12) {
            return new g(i10, i11, i12);
        }

        private a() {
        }
    }

    public g(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i12 != Integer.MIN_VALUE) {
            this.f62818a = i10;
            this.f62819b = C6729c.c(i10, i11, i12);
            this.f62820c = i12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (!(this.f62818a == gVar.f62818a && this.f62819b == gVar.f62819b && this.f62820c == gVar.f62820c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f62818a * 31) + this.f62819b) * 31) + this.f62820c;
    }

    public boolean isEmpty() {
        if (this.f62820c > 0) {
            if (this.f62818a <= this.f62819b) {
                return false;
            }
        } else if (this.f62818a >= this.f62819b) {
            return false;
        }
        return true;
    }

    public final int k() {
        return this.f62818a;
    }

    public final int n() {
        return this.f62819b;
    }

    public final int r() {
        return this.f62820c;
    }

    /* renamed from: t */
    public L iterator() {
        return new h(this.f62818a, this.f62819b, this.f62820c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f62820c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f62818a);
            sb2.append("..");
            sb2.append(this.f62819b);
            sb2.append(" step ");
            i10 = this.f62820c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f62818a);
            sb2.append(" downTo ");
            sb2.append(this.f62819b);
            sb2.append(" step ");
            i10 = -this.f62820c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
