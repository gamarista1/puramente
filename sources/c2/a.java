package C2;

import i2.C2073A;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.L;
import z2.r;

public final class a implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f1141a = new C2073A(4);

    /* renamed from: b  reason: collision with root package name */
    private final L f1142b = new L(-1, -1, "image/avif");

    private boolean b(C2973q qVar, int i10) {
        this.f1141a.Q(4);
        qVar.l(this.f1141a.e(), 0, 4);
        if (this.f1141a.J() == ((long) i10)) {
            return true;
        }
        return false;
    }

    public void a(long j10, long j11) {
        this.f1142b.a(j10, j11);
    }

    public void f(r rVar) {
        this.f1142b.f(rVar);
    }

    public int i(C2973q qVar, I i10) {
        return this.f1142b.i(qVar, i10);
    }

    public boolean j(C2973q qVar) {
        qVar.h(4);
        if (!b(qVar, 1718909296) || !b(qVar, 1635150182)) {
            return false;
        }
        return true;
    }

    public void release() {
    }
}
