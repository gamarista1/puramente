package P9;

import P9.g;
import ia.C3612j;
import ia.I;
import ia.n;
import k9.C3717q0;
import q9.C3970e;

public final class m extends f {

    /* renamed from: j  reason: collision with root package name */
    private final g f33647j;

    /* renamed from: k  reason: collision with root package name */
    private g.b f33648k;

    /* renamed from: l  reason: collision with root package name */
    private long f33649l;

    /* renamed from: m  reason: collision with root package name */
    private volatile boolean f33650m;

    public m(C3612j jVar, n nVar, C3717q0 q0Var, int i10, Object obj, g gVar) {
        super(jVar, nVar, 2, q0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f33647j = gVar;
    }

    public void a() {
        C3970e eVar;
        if (this.f33649l == 0) {
            this.f33647j.e(this.f33648k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            n e10 = this.f33601b.e(this.f33649l);
            I i10 = this.f33608i;
            eVar = new C3970e(i10, e10.f44462g, i10.m(e10));
            do {
                if (this.f33650m || !this.f33647j.a(eVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f33647j.a(eVar));
            break;
            this.f33649l = eVar.getPosition() - this.f33601b.f44462g;
            ia.m.a(this.f33608i);
        } catch (Throwable th2) {
            ia.m.a(this.f33608i);
            throw th2;
        }
    }

    public void b() {
        this.f33650m = true;
    }

    public void g(g.b bVar) {
        this.f33648k = bVar;
    }
}
