package P;

import androidx.compose.ui.window.r;
import c1.n;
import c1.o;
import c1.p;
import c1.t;
import k0.c;
import q0.C2421g;
import q0.C2422h;

/* renamed from: P.g  reason: case insensitive filesystem */
public final class C1291g implements r {

    /* renamed from: a  reason: collision with root package name */
    private final c f4898a;

    /* renamed from: b  reason: collision with root package name */
    private final C1293i f4899b;

    /* renamed from: c  reason: collision with root package name */
    private long f4900c = C2421g.f25320b.c();

    public C1291g(c cVar, C1293i iVar) {
        this.f4898a = cVar;
        this.f4899b = iVar;
    }

    public long a(p pVar, long j10, t tVar, long j11) {
        long a10 = this.f4899b.a();
        if (!C2422h.c(a10)) {
            a10 = this.f4900c;
        }
        this.f4900c = a10;
        return n.n(n.n(pVar.j(), o.d(a10)), this.f4898a.a(j11, c1.r.f19235b.a(), tVar));
    }
}
