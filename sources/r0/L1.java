package r0;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;

public final class L1 extends c2 {

    /* renamed from: e  reason: collision with root package name */
    private final List f25439e;

    /* renamed from: f  reason: collision with root package name */
    private final List f25440f;

    /* renamed from: g  reason: collision with root package name */
    private final long f25441g;

    /* renamed from: h  reason: collision with root package name */
    private final long f25442h;

    /* renamed from: i  reason: collision with root package name */
    private final int f25443i;

    public /* synthetic */ L1(List list, List list2, long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j10, j11, i10);
    }

    public Shader b(long j10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (C2421g.m(this.f25441g) == Float.POSITIVE_INFINITY) {
            f10 = C2427m.k(j10);
        } else {
            f10 = C2421g.m(this.f25441g);
        }
        if (C2421g.n(this.f25441g) == Float.POSITIVE_INFINITY) {
            f11 = C2427m.i(j10);
        } else {
            f11 = C2421g.n(this.f25441g);
        }
        if (C2421g.m(this.f25442h) == Float.POSITIVE_INFINITY) {
            f12 = C2427m.k(j10);
        } else {
            f12 = C2421g.m(this.f25442h);
        }
        if (C2421g.n(this.f25442h) == Float.POSITIVE_INFINITY) {
            f13 = C2427m.i(j10);
        } else {
            f13 = C2421g.n(this.f25442h);
        }
        return d2.a(C2422h.a(f10, f11), C2422h.a(f12, f13), this.f25439e, this.f25440f, this.f25443i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L1)) {
            return false;
        }
        L1 l12 = (L1) obj;
        if (C6496s.c(this.f25439e, l12.f25439e) && C6496s.c(this.f25440f, l12.f25440f) && C2421g.j(this.f25441g, l12.f25441g) && C2421g.j(this.f25442h, l12.f25442h) && k2.f(this.f25443i, l12.f25443i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f25439e.hashCode() * 31;
        List list = this.f25440f;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((hashCode + i10) * 31) + C2421g.o(this.f25441g)) * 31) + C2421g.o(this.f25442h)) * 31) + k2.g(this.f25443i);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (C2422h.b(this.f25441g)) {
            str = "start=" + C2421g.t(this.f25441g) + ", ";
        } else {
            str = str2;
        }
        if (C2422h.b(this.f25442h)) {
            str2 = "end=" + C2421g.t(this.f25442h) + ", ";
        }
        return "LinearGradient(colors=" + this.f25439e + ", stops=" + this.f25440f + ", " + str + str2 + "tileMode=" + k2.h(this.f25443i) + ')';
    }

    private L1(List list, List list2, long j10, long j11, int i10) {
        this.f25439e = list;
        this.f25440f = list2;
        this.f25441g = j10;
        this.f25442h = j11;
        this.f25443i = i10;
    }
}
