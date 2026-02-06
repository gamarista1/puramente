package P9;

import ia.C3612j;
import ja.C3645a;
import k9.C3717q0;

public abstract class n extends f {

    /* renamed from: j  reason: collision with root package name */
    public final long f33651j;

    public n(C3612j jVar, ia.n nVar, C3717q0 q0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(jVar, nVar, 1, q0Var, i10, obj, j10, j11);
        C3645a.e(q0Var);
        this.f33651j = j12;
    }

    public long g() {
        long j10 = this.f33651j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1;
    }

    public abstract boolean h();
}
