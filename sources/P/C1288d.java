package P;

import D0.A;
import D0.C1124o;
import androidx.compose.ui.platform.v1;

/* renamed from: P.d  reason: case insensitive filesystem */
final class C1288d {

    /* renamed from: a  reason: collision with root package name */
    private final v1 f4887a;

    /* renamed from: b  reason: collision with root package name */
    private int f4888b;

    /* renamed from: c  reason: collision with root package name */
    private A f4889c;

    public C1288d(v1 v1Var) {
        this.f4887a = v1Var;
    }

    public final int a() {
        return this.f4888b;
    }

    public final boolean b(A a10, A a11) {
        return t.f(this.f4887a, a10, a11);
    }

    public final boolean c(A a10, A a11) {
        if (a11.o() - a10.o() < this.f4887a.a()) {
            return true;
        }
        return false;
    }

    public final void d(C1124o oVar) {
        A a10 = this.f4889c;
        A a11 = (A) oVar.c().get(0);
        if (a10 == null || !c(a10, a11) || !b(a10, a11)) {
            this.f4888b = 1;
        } else {
            this.f4888b++;
        }
        this.f4889c = a11;
    }
}
