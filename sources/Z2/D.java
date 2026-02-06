package z2;

import N2.h;
import f2.z;
import i2.C2073A;
import java.io.EOFException;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f29087a = new C2073A(10);

    public z a(C2973q qVar, h.a aVar) {
        z zVar = null;
        int i10 = 0;
        while (true) {
            try {
                qVar.l(this.f29087a.e(), 0, 10);
                this.f29087a.U(0);
                if (this.f29087a.K() != 4801587) {
                    break;
                }
                this.f29087a.V(3);
                int G10 = this.f29087a.G();
                int i11 = G10 + 10;
                if (zVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f29087a.e(), 0, bArr, 0, 10);
                    qVar.l(bArr, 10, G10);
                    zVar = new h(aVar).e(bArr, i11);
                } else {
                    qVar.h(G10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        qVar.e();
        qVar.h(i10);
        return zVar;
    }
}
