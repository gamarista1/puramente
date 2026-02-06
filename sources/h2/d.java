package H2;

import i2.C2076a;
import z2.C2973q;
import z2.z;

final class d extends z {

    /* renamed from: b  reason: collision with root package name */
    private final long f2655b;

    public d(C2973q qVar, long j10) {
        super(qVar);
        boolean z10;
        if (qVar.getPosition() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f2655b = j10;
    }

    public long a() {
        return super.a() - this.f2655b;
    }

    public long g() {
        return super.g() - this.f2655b;
    }

    public long getPosition() {
        return super.getPosition() - this.f2655b;
    }
}
