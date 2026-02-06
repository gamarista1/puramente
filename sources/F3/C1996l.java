package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import java.util.Collections;
import java.util.List;
import z2.O;
import z2.r;

/* renamed from: f3.l  reason: case insensitive filesystem */
public final class C1996l implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final List f20575a;

    /* renamed from: b  reason: collision with root package name */
    private final O[] f20576b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20577c;

    /* renamed from: d  reason: collision with root package name */
    private int f20578d;

    /* renamed from: e  reason: collision with root package name */
    private int f20579e;

    /* renamed from: f  reason: collision with root package name */
    private long f20580f = -9223372036854775807L;

    public C1996l(List list) {
        this.f20575a = list;
        this.f20576b = new O[list.size()];
    }

    private boolean f(C2073A a10, int i10) {
        if (a10.a() == 0) {
            return false;
        }
        if (a10.H() != i10) {
            this.f20577c = false;
        }
        this.f20578d--;
        return this.f20577c;
    }

    public void a() {
        this.f20577c = false;
        this.f20580f = -9223372036854775807L;
    }

    public void b(C2073A a10) {
        if (!this.f20577c) {
            return;
        }
        if (this.f20578d != 2 || f(a10, 32)) {
            if (this.f20578d != 1 || f(a10, 0)) {
                int f10 = a10.f();
                int a11 = a10.a();
                for (O f11 : this.f20576b) {
                    a10.U(f10);
                    f11.f(a10, a11);
                }
                this.f20579e += a11;
            }
        }
    }

    public void c(boolean z10) {
        boolean z11;
        if (this.f20577c) {
            if (this.f20580f != -9223372036854775807L) {
                z11 = true;
            } else {
                z11 = false;
            }
            C2076a.g(z11);
            for (O d10 : this.f20576b) {
                d10.d(this.f20580f, 1, this.f20579e, 0, (O.a) null);
            }
            this.f20577c = false;
        }
    }

    public void d(long j10, int i10) {
        if ((i10 & 4) != 0) {
            this.f20577c = true;
            this.f20580f = j10;
            this.f20579e = 0;
            this.f20578d = 2;
        }
    }

    public void e(r rVar, K.d dVar) {
        for (int i10 = 0; i10 < this.f20576b.length; i10++) {
            K.a aVar = (K.a) this.f20575a.get(i10);
            dVar.a();
            O d10 = rVar.d(dVar.c(), 3);
            d10.c(new s.b().a0(dVar.b()).o0("application/dvbsubs").b0(Collections.singletonList(aVar.f20473c)).e0(aVar.f20471a).K());
            this.f20576b[i10] = d10;
        }
    }
}
