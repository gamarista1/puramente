package W0;

import Q0.L;
import kotlin.jvm.internal.C6496s;
import q0.C2423i;
import yf.C6798l;

public final class Z {

    /* renamed from: a  reason: collision with root package name */
    private final T f8543a;

    /* renamed from: b  reason: collision with root package name */
    private final L f8544b;

    public Z(T t10, L l10) {
        this.f8543a = t10;
        this.f8544b = l10;
    }

    public final void a() {
        this.f8543a.g(this);
    }

    public final boolean b() {
        return C6496s.c(this.f8543a.a(), this);
    }

    public final boolean c(C2423i iVar) {
        boolean b10 = b();
        if (b10) {
            this.f8544b.b(iVar);
        }
        return b10;
    }

    public final boolean d(Q q10, Q q11) {
        boolean b10 = b();
        if (b10) {
            this.f8544b.h(q10, q11);
        }
        return b10;
    }

    public final boolean e(Q q10, I i10, L l10, C6798l lVar, C2423i iVar, C2423i iVar2) {
        boolean b10 = b();
        if (b10) {
            this.f8544b.e(q10, i10, l10, lVar, iVar, iVar2);
        }
        return b10;
    }
}
