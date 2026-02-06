package C9;

import ja.C3645a;
import ja.s;
import java.nio.ByteBuffer;
import k9.C3717q0;
import m9.D;
import n9.C3871g;

final class i {

    /* renamed from: a  reason: collision with root package name */
    private long f30148a;

    /* renamed from: b  reason: collision with root package name */
    private long f30149b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30150c;

    i() {
    }

    private long a(long j10) {
        return this.f30148a + Math.max(0, ((this.f30149b - 529) * 1000000) / j10);
    }

    public long b(C3717q0 q0Var) {
        return a((long) q0Var.f45784z);
    }

    public void c() {
        this.f30148a = 0;
        this.f30149b = 0;
        this.f30150c = false;
    }

    public long d(C3717q0 q0Var, C3871g gVar) {
        if (this.f30149b == 0) {
            this.f30148a = gVar.f46952e;
        }
        if (this.f30150c) {
            return gVar.f46952e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C3645a.e(gVar.f46950c);
        byte b10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            b10 = (b10 << 8) | (byteBuffer.get(i10) & 255);
        }
        int m10 = D.m(b10);
        if (m10 == -1) {
            this.f30150c = true;
            this.f30149b = 0;
            this.f30148a = gVar.f46952e;
            s.i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f46952e;
        }
        long a10 = a((long) q0Var.f45784z);
        this.f30149b += (long) m10;
        return a10;
    }
}
