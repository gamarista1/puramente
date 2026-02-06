package y;

import androidx.compose.ui.window.r;
import c1.n;
import c1.o;
import c1.p;
import c1.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: y.e  reason: case insensitive filesystem */
public final class C2920e implements r {

    /* renamed from: a  reason: collision with root package name */
    private final long f28467a;

    public /* synthetic */ C2920e(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public long a(p pVar, long j10, t tVar, long j11) {
        boolean z10;
        int g10 = pVar.g() + n.j(this.f28467a);
        int g11 = c1.r.g(j11);
        int g12 = c1.r.g(j10);
        if (tVar == t.Ltr) {
            z10 = true;
        } else {
            z10 = false;
        }
        return o.a(C2921f.b(g10, g11, g12, z10), C2921f.c(pVar.i() + n.k(this.f28467a), c1.r.f(j11), c1.r.f(j10), false, 8, (Object) null));
    }

    private C2920e(long j10) {
        this.f28467a = j10;
    }
}
