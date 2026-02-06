package r0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;
import q0.C2428n;

public final class Y1 extends c2 {

    /* renamed from: e  reason: collision with root package name */
    private final List f25482e;

    /* renamed from: f  reason: collision with root package name */
    private final List f25483f;

    /* renamed from: g  reason: collision with root package name */
    private final long f25484g;

    /* renamed from: h  reason: collision with root package name */
    private final float f25485h;

    /* renamed from: i  reason: collision with root package name */
    private final int f25486i;

    public /* synthetic */ Y1(List list, List list2, long j10, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, f10, i10);
    }

    public Shader b(long j10) {
        float f10;
        float f11;
        float f12;
        if (C2422h.d(this.f25484g)) {
            long b10 = C2428n.b(j10);
            f11 = C2421g.m(b10);
            f10 = C2421g.n(b10);
        } else {
            if (C2421g.m(this.f25484g) == Float.POSITIVE_INFINITY) {
                f11 = C2427m.k(j10);
            } else {
                f11 = C2421g.m(this.f25484g);
            }
            if (C2421g.n(this.f25484g) == Float.POSITIVE_INFINITY) {
                f10 = C2427m.i(j10);
            } else {
                f10 = C2421g.n(this.f25484g);
            }
        }
        List list = this.f25482e;
        List list2 = this.f25483f;
        long a10 = C2422h.a(f11, f10);
        float f13 = this.f25485h;
        if (f13 == Float.POSITIVE_INFINITY) {
            f12 = C2427m.j(j10) / ((float) 2);
        } else {
            f12 = f13;
        }
        return d2.b(a10, f12, list, list2, this.f25486i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y1)) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        if (C6496s.c(this.f25482e, y12.f25482e) && C6496s.c(this.f25483f, y12.f25483f) && C2421g.j(this.f25484g, y12.f25484g) && this.f25485h == y12.f25485h && k2.f(this.f25486i, y12.f25486i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f25482e.hashCode() * 31;
        List list = this.f25483f;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((hashCode + i10) * 31) + C2421g.o(this.f25484g)) * 31) + Float.hashCode(this.f25485h)) * 31) + k2.g(this.f25486i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (C2422h.c(this.f25484g)) {
            str = "center=" + C2421g.t(this.f25484g) + ", ";
        } else {
            str = str2;
        }
        float f10 = this.f25485h;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            str2 = "radius=" + this.f25485h + ", ";
        }
        return "RadialGradient(colors=" + this.f25482e + ", stops=" + this.f25483f + ", " + str + str2 + "tileMode=" + k2.h(this.f25486i) + ')';
    }

    private Y1(List list, List list2, long j10, float f10, int i10) {
        this.f25482e = list;
        this.f25483f = list2;
        this.f25484g = j10;
        this.f25485h = f10;
        this.f25486i = i10;
    }
}
