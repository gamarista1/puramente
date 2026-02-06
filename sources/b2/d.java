package B2;

import i2.C2073A;
import i2.L;
import i2.p;

final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f802a;

    /* renamed from: b  reason: collision with root package name */
    public final int f803b;

    /* renamed from: c  reason: collision with root package name */
    public final int f804c;

    /* renamed from: d  reason: collision with root package name */
    public final int f805d;

    /* renamed from: e  reason: collision with root package name */
    public final int f806e;

    /* renamed from: f  reason: collision with root package name */
    public final int f807f;

    private d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f802a = i10;
        this.f803b = i11;
        this.f804c = i12;
        this.f805d = i13;
        this.f806e = i14;
        this.f807f = i15;
    }

    public static d c(C2073A a10) {
        int u10 = a10.u();
        a10.V(12);
        int u11 = a10.u();
        int u12 = a10.u();
        int u13 = a10.u();
        a10.V(4);
        int u14 = a10.u();
        int u15 = a10.u();
        a10.V(8);
        return new d(u10, u11, u12, u13, u14, u15);
    }

    public long a() {
        return L.U0((long) this.f806e, ((long) this.f804c) * 1000000, (long) this.f805d);
    }

    public int b() {
        int i10 = this.f802a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        p.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f802a));
        return -1;
    }

    public int getType() {
        return 1752331379;
    }
}
