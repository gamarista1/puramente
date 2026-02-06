package androidx.compose.ui.platform;

import Q0.C;
import V0.n;
import V0.o;
import V0.p;
import android.os.Parcel;
import android.util.Base64;
import b1.C1869a;
import b1.k;
import c1.v;
import c1.x;
import q0.C2421g;
import r0.C2544x0;
import r0.e2;

/* renamed from: androidx.compose.ui.platform.s0  reason: case insensitive filesystem */
public final class C1662s0 {

    /* renamed from: a  reason: collision with root package name */
    private Parcel f13942a = Parcel.obtain();

    public final void a(byte b10) {
        this.f13942a.writeByte(b10);
    }

    public final void b(float f10) {
        this.f13942a.writeFloat(f10);
    }

    public final void c(int i10) {
        this.f13942a.writeInt(i10);
    }

    public final void d(C c10) {
        long g10 = c10.g();
        C2544x0.a aVar = C2544x0.f25560b;
        if (!C2544x0.q(g10, aVar.h())) {
            a((byte) 1);
            m(c10.g());
        }
        long k10 = c10.k();
        v.a aVar2 = v.f19242b;
        if (!v.e(k10, aVar2.a())) {
            a((byte) 2);
            j(c10.k());
        }
        p n10 = c10.n();
        if (n10 != null) {
            a((byte) 3);
            e(n10);
        }
        n l10 = c10.l();
        if (l10 != null) {
            int i10 = l10.i();
            a((byte) 4);
            o(i10);
        }
        o m10 = c10.m();
        if (m10 != null) {
            int k11 = m10.k();
            a((byte) 5);
            l(k11);
        }
        String j10 = c10.j();
        if (j10 != null) {
            a((byte) 6);
            h(j10);
        }
        if (!v.e(c10.o(), aVar2.a())) {
            a((byte) 7);
            j(c10.o());
        }
        C1869a e10 = c10.e();
        if (e10 != null) {
            float h10 = e10.h();
            a((byte) 8);
            k(h10);
        }
        b1.o u10 = c10.u();
        if (u10 != null) {
            a((byte) 9);
            g(u10);
        }
        if (!C2544x0.q(c10.d(), aVar.h())) {
            a((byte) 10);
            m(c10.d());
        }
        k s10 = c10.s();
        if (s10 != null) {
            a((byte) 11);
            f(s10);
        }
        e2 r10 = c10.r();
        if (r10 != null) {
            a((byte) 12);
            i(r10);
        }
    }

    public final void e(p pVar) {
        c(pVar.m());
    }

    public final void f(k kVar) {
        c(kVar.e());
    }

    public final void g(b1.o oVar) {
        b(oVar.b());
        b(oVar.c());
    }

    public final void h(String str) {
        this.f13942a.writeString(str);
    }

    public final void i(e2 e2Var) {
        m(e2Var.c());
        b(C2421g.m(e2Var.d()));
        b(C2421g.n(e2Var.d()));
        b(e2Var.b());
    }

    public final void j(long j10) {
        long g10 = v.g(j10);
        x.a aVar = x.f19246b;
        byte b10 = 0;
        if (!x.g(g10, aVar.c())) {
            if (x.g(g10, aVar.b())) {
                b10 = 1;
            } else if (x.g(g10, aVar.a())) {
                b10 = 2;
            }
        }
        a(b10);
        if (!x.g(v.g(j10), aVar.c())) {
            b(v.h(j10));
        }
    }

    public final void k(float f10) {
        b(f10);
    }

    public final void l(int i10) {
        o.a aVar = o.f8204b;
        byte b10 = 0;
        if (!o.h(i10, aVar.b())) {
            if (o.h(i10, aVar.a())) {
                b10 = 1;
            } else if (o.h(i10, aVar.d())) {
                b10 = 2;
            } else if (o.h(i10, aVar.c())) {
                b10 = 3;
            }
        }
        a(b10);
    }

    public final void m(long j10) {
        n(j10);
    }

    public final void n(long j10) {
        this.f13942a.writeLong(j10);
    }

    public final void o(int i10) {
        n.a aVar = n.f8200b;
        byte b10 = 0;
        if (!n.f(i10, aVar.b()) && n.f(i10, aVar.a())) {
            b10 = 1;
        }
        a(b10);
    }

    public final String p() {
        return Base64.encodeToString(this.f13942a.marshall(), 0);
    }

    public final void q() {
        this.f13942a.recycle();
        this.f13942a = Parcel.obtain();
    }
}
