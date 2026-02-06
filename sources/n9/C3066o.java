package N9;

import N9.C3070t;
import N9.r;
import ia.C3604b;
import ja.C3645a;
import ja.M;
import k9.e1;

/* renamed from: N9.o  reason: case insensitive filesystem */
public final class C3066o implements r, r.a {

    /* renamed from: a  reason: collision with root package name */
    public final C3070t.b f33258a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33259b;

    /* renamed from: c  reason: collision with root package name */
    private final C3604b f33260c;

    /* renamed from: d  reason: collision with root package name */
    private C3070t f33261d;

    /* renamed from: e  reason: collision with root package name */
    private r f33262e;

    /* renamed from: f  reason: collision with root package name */
    private r.a f33263f;

    /* renamed from: g  reason: collision with root package name */
    private long f33264g = -9223372036854775807L;

    public C3066o(C3070t.b bVar, C3604b bVar2, long j10) {
        this.f33258a = bVar;
        this.f33260c = bVar2;
        this.f33259b = j10;
    }

    private long u(long j10) {
        long j11 = this.f33264g;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return j10;
    }

    public long a() {
        return ((r) M.j(this.f33262e)).a();
    }

    public boolean b() {
        r rVar = this.f33262e;
        if (rVar == null || !rVar.b()) {
            return false;
        }
        return true;
    }

    public long c() {
        return ((r) M.j(this.f33262e)).c();
    }

    public void e(C3070t.b bVar) {
        long u10 = u(this.f33259b);
        r i10 = ((C3070t) C3645a.e(this.f33261d)).i(bVar, this.f33260c, u10);
        this.f33262e = i10;
        if (this.f33263f != null) {
            i10.r(this, u10);
        }
    }

    public void f(long j10) {
        ((r) M.j(this.f33262e)).f(j10);
    }

    public long g(long j10) {
        return ((r) M.j(this.f33262e)).g(j10);
    }

    public long h() {
        return ((r) M.j(this.f33262e)).h();
    }

    public long i() {
        return this.f33264g;
    }

    public void j() {
        r rVar = this.f33262e;
        if (rVar != null) {
            rVar.j();
            return;
        }
        C3070t tVar = this.f33261d;
        if (tVar != null) {
            tVar.c();
        }
    }

    public void k(r rVar) {
        ((r.a) M.j(this.f33263f)).k(this);
    }

    public long l(long j10, e1 e1Var) {
        return ((r) M.j(this.f33262e)).l(j10, e1Var);
    }

    public boolean m(long j10) {
        r rVar = this.f33262e;
        if (rVar == null || !rVar.m(j10)) {
            return false;
        }
        return true;
    }

    public V n() {
        return ((r) M.j(this.f33262e)).n();
    }

    public void o(long j10, boolean z10) {
        ((r) M.j(this.f33262e)).o(j10, z10);
    }

    public void r(r.a aVar, long j10) {
        this.f33263f = aVar;
        r rVar = this.f33262e;
        if (rVar != null) {
            rVar.r(this, u(this.f33259b));
        }
    }

    public long s(ga.r[] rVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f33264g;
        if (j12 == -9223372036854775807L || j10 != this.f33259b) {
            j11 = j10;
        } else {
            this.f33264g = -9223372036854775807L;
            j11 = j12;
        }
        return ((r) M.j(this.f33262e)).s(rVarArr, zArr, mArr, zArr2, j11);
    }

    public long t() {
        return this.f33259b;
    }

    /* renamed from: v */
    public void p(r rVar) {
        ((r.a) M.j(this.f33263f)).p(this);
    }

    public void w(long j10) {
        this.f33264g = j10;
    }

    public void x() {
        if (this.f33262e != null) {
            ((C3070t) C3645a.e(this.f33261d)).g(this.f33262e);
        }
    }

    public void y(C3070t tVar) {
        boolean z10;
        if (this.f33261d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        this.f33261d = tVar;
    }
}
