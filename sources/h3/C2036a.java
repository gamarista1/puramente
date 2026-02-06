package h3;

import com.reactnativecommunity.clipboard.ClipboardModule;
import i2.C2073A;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.L;
import z2.r;

/* renamed from: h3.a  reason: case insensitive filesystem */
public final class C2036a implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f21244a = new C2073A(4);

    /* renamed from: b  reason: collision with root package name */
    private final L f21245b = new L(-1, -1, ClipboardModule.MIMETYPE_WEBP);

    public void a(long j10, long j11) {
        this.f21245b.a(j10, j11);
    }

    public void f(r rVar) {
        this.f21245b.f(rVar);
    }

    public int i(C2973q qVar, I i10) {
        return this.f21245b.i(qVar, i10);
    }

    public boolean j(C2973q qVar) {
        this.f21244a.Q(4);
        qVar.l(this.f21244a.e(), 0, 4);
        if (this.f21244a.J() != 1380533830) {
            return false;
        }
        qVar.h(4);
        this.f21244a.Q(4);
        qVar.l(this.f21244a.e(), 0, 4);
        if (this.f21244a.J() == 1464156752) {
            return true;
        }
        return false;
    }

    public void release() {
    }
}
