package A9;

import A9.I;
import ja.B;
import m9.C3845c;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.y;
import q9.z;

/* renamed from: A9.e  reason: case insensitive filesystem */
public final class C2988e implements k {

    /* renamed from: d  reason: collision with root package name */
    public static final p f29528d = new C2987d();

    /* renamed from: a  reason: collision with root package name */
    private final C2989f f29529a = new C2989f();

    /* renamed from: b  reason: collision with root package name */
    private final B f29530b = new B(16384);

    /* renamed from: c  reason: collision with root package name */
    private boolean f29531c;

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] c() {
        return new k[]{new C2988e()};
    }

    public void a(long j10, long j11) {
        this.f29531c = false;
        this.f29529a.a();
    }

    public void f(m mVar) {
        this.f29529a.f(mVar, new I.d(0, 1));
        mVar.k();
        mVar.q(new z.b(-9223372036854775807L));
    }

    public boolean h(l lVar) {
        B b10 = new B(10);
        int i10 = 0;
        while (true) {
            lVar.l(b10.d(), 0, 10);
            b10.P(0);
            if (b10.G() != 4801587) {
                break;
            }
            b10.Q(3);
            int C10 = b10.C();
            i10 += C10 + 10;
            lVar.h(C10);
        }
        lVar.e();
        lVar.h(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            lVar.l(b10.d(), 0, 7);
            b10.P(0);
            int J10 = b10.J();
            if (J10 == 44096 || J10 == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int e10 = C3845c.e(b10.d(), J10);
                if (e10 == -1) {
                    return false;
                }
                lVar.h(e10 - 7);
            } else {
                lVar.e();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                lVar.h(i12);
                i11 = 0;
            }
        }
    }

    public int i(l lVar, y yVar) {
        int read = lVar.read(this.f29530b.d(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f29530b.P(0);
        this.f29530b.O(read);
        if (!this.f29531c) {
            this.f29529a.d(0, 4);
            this.f29531c = true;
        }
        this.f29529a.c(this.f29530b);
        return 0;
    }

    public void release() {
    }
}
