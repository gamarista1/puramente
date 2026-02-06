package A9;

import A9.I;
import ja.B;
import ja.C3645a;
import ja.s;
import k9.C3717q0;
import q9.C3962B;
import q9.m;

public final class r implements m {

    /* renamed from: a  reason: collision with root package name */
    private final B f29723a = new B(10);

    /* renamed from: b  reason: collision with root package name */
    private C3962B f29724b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29725c;

    /* renamed from: d  reason: collision with root package name */
    private long f29726d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    private int f29727e;

    /* renamed from: f  reason: collision with root package name */
    private int f29728f;

    public void a() {
        this.f29725c = false;
        this.f29726d = -9223372036854775807L;
    }

    public void c(B b10) {
        C3645a.h(this.f29724b);
        if (this.f29725c) {
            int a10 = b10.a();
            int i10 = this.f29728f;
            if (i10 < 10) {
                int min = Math.min(a10, 10 - i10);
                System.arraycopy(b10.d(), b10.e(), this.f29723a.d(), this.f29728f, min);
                if (this.f29728f + min == 10) {
                    this.f29723a.P(0);
                    if (73 == this.f29723a.D() && 68 == this.f29723a.D() && 51 == this.f29723a.D()) {
                        this.f29723a.Q(3);
                        this.f29727e = this.f29723a.C() + 10;
                    } else {
                        s.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f29725c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a10, this.f29727e - this.f29728f);
            this.f29724b.d(b10, min2);
            this.f29728f += min2;
        }
    }

    public void d(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f29725c = true;
            if (j10 != -9223372036854775807L) {
                this.f29726d = j10;
            }
            this.f29727e = 0;
            this.f29728f = 0;
        }
    }

    public void e() {
        int i10;
        C3645a.h(this.f29724b);
        if (this.f29725c && (i10 = this.f29727e) != 0 && this.f29728f == i10) {
            long j10 = this.f29726d;
            if (j10 != -9223372036854775807L) {
                this.f29724b.f(j10, 1, i10, 0, (C3962B.a) null);
            }
            this.f29725c = false;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        C3962B d10 = mVar.d(dVar.c(), 5);
        this.f29724b = d10;
        d10.c(new C3717q0.b().S(dVar.b()).e0("application/id3").E());
    }
}
