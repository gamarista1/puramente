package m3;

import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    private final List f23861a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f23862b;

    /* renamed from: c  reason: collision with root package name */
    private final C2200E f23863c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23864d;

    public M(List list, Integer num, C2200E e10, int i10) {
        C6496s.h(list, "pages");
        C6496s.h(e10, "config");
        this.f23861a = list;
        this.f23862b = num;
        this.f23863c = e10;
        this.f23864d = i10;
    }

    public final Integer a() {
        return this.f23862b;
    }

    public final List b() {
        return this.f23861a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof M) {
            M m10 = (M) obj;
            if (!C6496s.c(this.f23861a, m10.f23861a) || !C6496s.c(this.f23862b, m10.f23862b) || !C6496s.c(this.f23863c, m10.f23863c) || this.f23864d != m10.f23864d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f23861a.hashCode();
        Integer num = this.f23862b;
        if (num != null) {
            i10 = num.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10 + this.f23863c.hashCode() + Integer.hashCode(this.f23864d);
    }

    public String toString() {
        return "PagingState(pages=" + this.f23861a + ", anchorPosition=" + this.f23862b + ", config=" + this.f23863c + ", leadingPlaceholderCount=" + this.f23864d + ')';
    }
}
