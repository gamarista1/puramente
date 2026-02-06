package s9;

import ja.B;
import ja.M;
import ja.s;

/* renamed from: s9.d  reason: case insensitive filesystem */
final class C4002d implements C3999a {

    /* renamed from: a  reason: collision with root package name */
    public final int f48135a;

    /* renamed from: b  reason: collision with root package name */
    public final int f48136b;

    /* renamed from: c  reason: collision with root package name */
    public final int f48137c;

    /* renamed from: d  reason: collision with root package name */
    public final int f48138d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48139e;

    /* renamed from: f  reason: collision with root package name */
    public final int f48140f;

    private C4002d(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f48135a = i10;
        this.f48136b = i11;
        this.f48137c = i12;
        this.f48138d = i13;
        this.f48139e = i14;
        this.f48140f = i15;
    }

    public static C4002d c(B b10) {
        int q10 = b10.q();
        b10.Q(12);
        int q11 = b10.q();
        int q12 = b10.q();
        int q13 = b10.q();
        b10.Q(4);
        int q14 = b10.q();
        int q15 = b10.q();
        b10.Q(8);
        return new C4002d(q10, q11, q12, q13, q14, q15);
    }

    public long a() {
        return M.O0((long) this.f48139e, ((long) this.f48137c) * 1000000, (long) this.f48138d);
    }

    public int b() {
        int i10 = this.f48135a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        s.i("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f48135a));
        return -1;
    }

    public int getType() {
        return 1752331379;
    }
}
