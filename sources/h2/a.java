package H2;

import com.reactnativecommunity.clipboard.ClipboardModule;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.L;
import z2.r;

public final class a implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final C2972p f2638a;

    public a(int i10) {
        if ((i10 & 1) != 0) {
            this.f2638a = new L(65496, 2, ClipboardModule.MIMETYPE_JPEG);
        } else {
            this.f2638a = new b();
        }
    }

    public void a(long j10, long j11) {
        this.f2638a.a(j10, j11);
    }

    public void f(r rVar) {
        this.f2638a.f(rVar);
    }

    public int i(C2973q qVar, I i10) {
        return this.f2638a.i(qVar, i10);
    }

    public boolean j(C2973q qVar) {
        return this.f2638a.j(qVar);
    }

    public void release() {
        this.f2638a.release();
    }
}
