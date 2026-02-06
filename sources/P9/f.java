package P9;

import N9.C3065n;
import android.net.Uri;
import ia.B;
import ia.C3612j;
import ia.I;
import ia.n;
import ja.C3645a;
import java.util.Map;
import k9.C3717q0;

public abstract class f implements B.e {

    /* renamed from: a  reason: collision with root package name */
    public final long f33600a = C3065n.a();

    /* renamed from: b  reason: collision with root package name */
    public final n f33601b;

    /* renamed from: c  reason: collision with root package name */
    public final int f33602c;

    /* renamed from: d  reason: collision with root package name */
    public final C3717q0 f33603d;

    /* renamed from: e  reason: collision with root package name */
    public final int f33604e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f33605f;

    /* renamed from: g  reason: collision with root package name */
    public final long f33606g;

    /* renamed from: h  reason: collision with root package name */
    public final long f33607h;

    /* renamed from: i  reason: collision with root package name */
    protected final I f33608i;

    public f(C3612j jVar, n nVar, int i10, C3717q0 q0Var, int i11, Object obj, long j10, long j11) {
        this.f33608i = new I(jVar);
        this.f33601b = (n) C3645a.e(nVar);
        this.f33602c = i10;
        this.f33603d = q0Var;
        this.f33604e = i11;
        this.f33605f = obj;
        this.f33606g = j10;
        this.f33607h = j11;
    }

    public final long c() {
        return this.f33608i.o();
    }

    public final long d() {
        return this.f33607h - this.f33606g;
    }

    public final Map e() {
        return this.f33608i.q();
    }

    public final Uri f() {
        return this.f33608i.p();
    }
}
