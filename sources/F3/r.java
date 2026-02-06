package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.p;
import z2.O;

public final class r implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f20706a = new C2073A(10);

    /* renamed from: b  reason: collision with root package name */
    private O f20707b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20708c;

    /* renamed from: d  reason: collision with root package name */
    private long f20709d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    private int f20710e;

    /* renamed from: f  reason: collision with root package name */
    private int f20711f;

    public void a() {
        this.f20708c = false;
        this.f20709d = -9223372036854775807L;
    }

    public void b(C2073A a10) {
        C2076a.i(this.f20707b);
        if (this.f20708c) {
            int a11 = a10.a();
            int i10 = this.f20711f;
            if (i10 < 10) {
                int min = Math.min(a11, 10 - i10);
                System.arraycopy(a10.e(), a10.f(), this.f20706a.e(), this.f20711f, min);
                if (this.f20711f + min == 10) {
                    this.f20706a.U(0);
                    if (73 == this.f20706a.H() && 68 == this.f20706a.H() && 51 == this.f20706a.H()) {
                        this.f20706a.V(3);
                        this.f20710e = this.f20706a.G() + 10;
                    } else {
                        p.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.f20708c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a11, this.f20710e - this.f20711f);
            this.f20707b.f(a10, min2);
            this.f20711f += min2;
        }
    }

    public void c(boolean z10) {
        int i10;
        boolean z11;
        C2076a.i(this.f20707b);
        if (this.f20708c && (i10 = this.f20710e) != 0 && this.f20711f == i10) {
            if (this.f20709d != -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.g(z11);
            this.f20707b.d(this.f20709d, 1, this.f20710e, 0, (O.a) null);
            this.f20708c = false;
        }
    }

    public void d(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f20708c = true;
            this.f20709d = j10;
            this.f20710e = 0;
            this.f20711f = 0;
        }
    }

    public void e(z2.r rVar, K.d dVar) {
        dVar.a();
        O d10 = rVar.d(dVar.c(), 5);
        this.f20707b = d10;
        d10.c(new s.b().a0(dVar.b()).o0("application/id3").K());
    }
}
