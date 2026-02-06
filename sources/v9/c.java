package v9;

import ja.C3645a;
import q9.l;
import q9.u;

final class c extends u {

    /* renamed from: b  reason: collision with root package name */
    private final long f48983b;

    public c(l lVar, long j10) {
        super(lVar);
        boolean z10;
        if (lVar.getPosition() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.a(z10);
        this.f48983b = j10;
    }

    public long a() {
        return super.a() - this.f48983b;
    }

    public long g() {
        return super.g() - this.f48983b;
    }

    public long getPosition() {
        return super.getPosition() - this.f48983b;
    }
}
