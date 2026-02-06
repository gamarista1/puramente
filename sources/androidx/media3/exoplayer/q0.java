package androidx.media3.exoplayer;

import androidx.media3.exoplayer.o0;
import f2.H;
import f2.s;
import i2.C2078c;
import m2.y;
import m2.z;
import n2.u1;
import t2.C2615C;
import t2.Z;

public interface q0 extends o0.b {

    public interface a {
        void a();

        void b();
    }

    y A();

    void D(int i10, u1 u1Var, C2078c cVar);

    void G(z zVar, s[] sVarArr, Z z10, long j10, boolean z11, boolean z12, long j11, long j12, C2615C.b bVar);

    long M(long j10, long j11) {
        return 10000;
    }

    void N(H h10);

    void O(s[] sVarArr, Z z10, long j10, long j11, C2615C.b bVar);

    boolean b();

    boolean d();

    void disable();

    int e();

    void g(long j10, long j11);

    String getName();

    int getState();

    boolean h();

    void j() {
    }

    void k();

    void q();

    boolean r();

    void release();

    void reset();

    void start();

    void stop();

    r0 t();

    void v(float f10, float f11) {
    }

    Z x();

    long y();

    void z(long j10);
}
