package q9;

import D9.a;
import I9.h;
import ja.B;
import java.io.EOFException;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final B f47914a = new B(10);

    public a a(l lVar, h.a aVar) {
        a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.l(this.f47914a.d(), 0, 10);
                this.f47914a.P(0);
                if (this.f47914a.G() != 4801587) {
                    break;
                }
                this.f47914a.Q(3);
                int C10 = this.f47914a.C();
                int i11 = C10 + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f47914a.d(), 0, bArr, 0, 10);
                    lVar.l(bArr, 10, C10);
                    aVar2 = new h(aVar).e(bArr, i11);
                } else {
                    lVar.h(C10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.e();
        lVar.h(i10);
        return aVar2;
    }
}
