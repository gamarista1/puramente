package z2;

import f2.C1975j;
import f2.s;
import i2.C2073A;
import java.io.EOFException;
import z2.O;

/* renamed from: z2.m  reason: case insensitive filesystem */
public final class C2969m implements O {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f29256a = new byte[4096];

    public int b(C1975j jVar, int i10, boolean z10, int i11) {
        int read = jVar.read(this.f29256a, 0, Math.min(this.f29256a.length, i10));
        if (read != -1) {
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public void e(C2073A a10, int i10, int i11) {
        a10.V(i10);
    }

    public void c(s sVar) {
    }

    public void d(long j10, int i10, int i11, int i12, O.a aVar) {
    }
}
