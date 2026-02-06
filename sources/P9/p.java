package P9;

import com.google.android.gms.common.api.a;
import ia.C3612j;
import ia.m;
import ia.n;
import k9.C3717q0;
import q9.C3962B;
import q9.C3970e;

public final class p extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f33653o;

    /* renamed from: p  reason: collision with root package name */
    private final C3717q0 f33654p;

    /* renamed from: q  reason: collision with root package name */
    private long f33655q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f33656r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(C3612j jVar, n nVar, C3717q0 q0Var, int i10, Object obj, long j10, long j11, long j12, int i11, C3717q0 q0Var2) {
        super(jVar, nVar, q0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f33653o = i11;
        this.f33654p = q0Var2;
    }

    public void a() {
        c j10 = j();
        j10.b(0);
        C3962B d10 = j10.d(0, this.f33653o);
        d10.c(this.f33654p);
        try {
            long m10 = this.f33608i.m(this.f33601b.e(this.f33655q));
            if (m10 != -1) {
                m10 += this.f33655q;
            }
            C3970e eVar = new C3970e(this.f33608i, this.f33655q, m10);
            for (int i10 = 0; i10 != -1; i10 = d10.a(eVar, a.e.API_PRIORITY_OTHER, true)) {
                this.f33655q += (long) i10;
            }
            d10.f(this.f33606g, 1, (int) this.f33655q, 0, (C3962B.a) null);
            m.a(this.f33608i);
            this.f33656r = true;
        } catch (Throwable th2) {
            m.a(this.f33608i);
            throw th2;
        }
    }

    public boolean h() {
        return this.f33656r;
    }

    public void b() {
    }
}
