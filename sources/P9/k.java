package P9;

import P9.g;
import ia.C3612j;
import ia.I;
import ia.m;
import ia.n;
import k9.C3717q0;
import q9.C3970e;

public class k extends a {

    /* renamed from: o  reason: collision with root package name */
    private final int f33639o;

    /* renamed from: p  reason: collision with root package name */
    private final long f33640p;

    /* renamed from: q  reason: collision with root package name */
    private final g f33641q;

    /* renamed from: r  reason: collision with root package name */
    private long f33642r;

    /* renamed from: s  reason: collision with root package name */
    private volatile boolean f33643s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f33644t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(C3612j jVar, n nVar, C3717q0 q0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(jVar, nVar, q0Var, i10, obj, j10, j11, j12, j13, j14);
        this.f33639o = i11;
        this.f33640p = j15;
        this.f33641q = gVar;
    }

    public final void a() {
        C3970e eVar;
        long j10;
        long j11;
        if (this.f33642r == 0) {
            c j12 = j();
            j12.b(this.f33640p);
            g gVar = this.f33641q;
            g.b l10 = l(j12);
            long j13 = this.f33573k;
            if (j13 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j13 - this.f33640p;
            }
            long j14 = this.f33574l;
            if (j14 == -9223372036854775807L) {
                j11 = -9223372036854775807L;
            } else {
                j11 = j14 - this.f33640p;
            }
            gVar.e(l10, j10, j11);
        }
        try {
            n e10 = this.f33601b.e(this.f33642r);
            I i10 = this.f33608i;
            eVar = new C3970e(i10, e10.f44462g, i10.m(e10));
            do {
                if (this.f33643s || !this.f33641q.a(eVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f33641q.a(eVar));
            break;
            this.f33642r = eVar.getPosition() - this.f33601b.f44462g;
            m.a(this.f33608i);
            this.f33644t = !this.f33643s;
        } catch (Throwable th2) {
            m.a(this.f33608i);
            throw th2;
        }
    }

    public final void b() {
        this.f33643s = true;
    }

    public long g() {
        return this.f33651j + ((long) this.f33639o);
    }

    public boolean h() {
        return this.f33644t;
    }

    /* access modifiers changed from: protected */
    public g.b l(c cVar) {
        return cVar;
    }
}
