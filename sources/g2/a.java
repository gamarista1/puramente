package G2;

import com.reactnativecommunity.clipboard.ClipboardModule;
import i2.C2073A;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.L;
import z2.r;

public final class a implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f2476a = new C2073A(4);

    /* renamed from: b  reason: collision with root package name */
    private final L f2477b = new L(-1, -1, ClipboardModule.MIMETYPE_HEIF);

    private boolean b(C2973q qVar, int i10) {
        this.f2476a.Q(4);
        qVar.l(this.f2476a.e(), 0, 4);
        if (this.f2476a.J() == ((long) i10)) {
            return true;
        }
        return false;
    }

    public void a(long j10, long j11) {
        this.f2477b.a(j10, j11);
    }

    public void f(r rVar) {
        this.f2477b.f(rVar);
    }

    public int i(C2973q qVar, I i10) {
        return this.f2477b.i(qVar, i10);
    }

    public boolean j(C2973q qVar) {
        qVar.h(4);
        if (!b(qVar, 1718909296) || !b(qVar, 1751476579)) {
            return false;
        }
        return true;
    }

    public void release() {
    }
}
