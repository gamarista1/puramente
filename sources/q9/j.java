package q9;

import ia.C3610h;
import ja.B;
import java.io.EOFException;
import k9.C3717q0;
import q9.C3962B;

public final class j implements C3962B {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f47889a = new byte[4096];

    public void b(B b10, int i10, int i11) {
        b10.Q(i10);
    }

    public int e(C3610h hVar, int i10, boolean z10, int i11) {
        int read = hVar.read(this.f47889a, 0, Math.min(this.f47889a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void c(C3717q0 q0Var) {
    }

    public void f(long j10, int i10, int i11, int i12, C3962B.a aVar) {
    }
}
