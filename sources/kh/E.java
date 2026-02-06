package kh;

import ih.f;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;

public final class E extends C6458j0 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f71592m = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E(String str, D d10) {
        super(str, d10, 1);
        C6496s.h(str, "name");
        C6496s.h(d10, "generatedSerializer");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof E) {
            f fVar = (f) obj;
            if (C6496s.c(i(), fVar.i())) {
                E e10 = (E) obj;
                if (e10.isInline() && Arrays.equals(p(), e10.p()) && d() == fVar.d()) {
                    int d10 = d();
                    int i10 = 0;
                    while (i10 < d10) {
                        if (C6496s.c(g(i10).i(), fVar.g(i10).i()) && C6496s.c(g(i10).h(), fVar.g(i10).h())) {
                            i10++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }

    public boolean isInline() {
        return this.f71592m;
    }
}
