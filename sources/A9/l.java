package A9;

import A9.I;
import ja.B;
import java.util.Collections;
import java.util.List;
import k9.C3717q0;
import q9.C3962B;
import q9.m;

public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List f29593a;

    /* renamed from: b  reason: collision with root package name */
    private final C3962B[] f29594b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29595c;

    /* renamed from: d  reason: collision with root package name */
    private int f29596d;

    /* renamed from: e  reason: collision with root package name */
    private int f29597e;

    /* renamed from: f  reason: collision with root package name */
    private long f29598f = -9223372036854775807L;

    public l(List list) {
        this.f29593a = list;
        this.f29594b = new C3962B[list.size()];
    }

    private boolean b(B b10, int i10) {
        if (b10.a() == 0) {
            return false;
        }
        if (b10.D() != i10) {
            this.f29595c = false;
        }
        this.f29596d--;
        return this.f29595c;
    }

    public void a() {
        this.f29595c = false;
        this.f29598f = -9223372036854775807L;
    }

    public void c(B b10) {
        if (!this.f29595c) {
            return;
        }
        if (this.f29596d != 2 || b(b10, 32)) {
            if (this.f29596d != 1 || b(b10, 0)) {
                int e10 = b10.e();
                int a10 = b10.a();
                for (C3962B d10 : this.f29594b) {
                    b10.P(e10);
                    d10.d(b10, a10);
                }
                this.f29597e += a10;
            }
        }
    }

    public void d(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f29595c = true;
            if (j10 != -9223372036854775807L) {
                this.f29598f = j10;
            }
            this.f29597e = 0;
            this.f29596d = 2;
        }
    }

    public void e() {
        if (this.f29595c) {
            if (this.f29598f != -9223372036854775807L) {
                for (C3962B f10 : this.f29594b) {
                    f10.f(this.f29598f, 1, this.f29597e, 0, (C3962B.a) null);
                }
            }
            this.f29595c = false;
        }
    }

    public void f(m mVar, I.d dVar) {
        for (int i10 = 0; i10 < this.f29594b.length; i10++) {
            I.a aVar = (I.a) this.f29593a.get(i10);
            dVar.a();
            C3962B d10 = mVar.d(dVar.c(), 3);
            d10.c(new C3717q0.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f29500c)).V(aVar.f29498a).E());
            this.f29594b[i10] = d10;
        }
    }
}
