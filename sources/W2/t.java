package W2;

import W2.s;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.r;

public class t implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final C2972p f8668a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f8669b;

    /* renamed from: c  reason: collision with root package name */
    private u f8670c;

    public t(C2972p pVar, s.a aVar) {
        this.f8668a = pVar;
        this.f8669b = aVar;
    }

    public void a(long j10, long j11) {
        u uVar = this.f8670c;
        if (uVar != null) {
            uVar.a();
        }
        this.f8668a.a(j10, j11);
    }

    public void f(r rVar) {
        u uVar = new u(rVar, this.f8669b);
        this.f8670c = uVar;
        this.f8668a.f(uVar);
    }

    public C2972p h() {
        return this.f8668a;
    }

    public int i(C2973q qVar, I i10) {
        return this.f8668a.i(qVar, i10);
    }

    public boolean j(C2973q qVar) {
        return this.f8668a.j(qVar);
    }

    public void release() {
        this.f8668a.release();
    }
}
