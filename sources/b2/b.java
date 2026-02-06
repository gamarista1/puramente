package B2;

import W2.s;
import W2.u;
import com.google.common.collect.g0;
import f2.C1960A;
import f2.C1961B;
import f2.s;
import i2.C2073A;
import i2.C2076a;
import i2.p;
import java.util.ArrayList;
import z2.C2972p;
import z2.C2973q;
import z2.G;
import z2.I;
import z2.J;
import z2.O;
import z2.r;

public final class b implements C2972p {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f777a;

    /* renamed from: b  reason: collision with root package name */
    private final c f778b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f779c;

    /* renamed from: d  reason: collision with root package name */
    private final s.a f780d;

    /* renamed from: e  reason: collision with root package name */
    private int f781e;

    /* renamed from: f  reason: collision with root package name */
    private r f782f;

    /* renamed from: g  reason: collision with root package name */
    private c f783g;

    /* renamed from: h  reason: collision with root package name */
    private long f784h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public e[] f785i;

    /* renamed from: j  reason: collision with root package name */
    private long f786j;

    /* renamed from: k  reason: collision with root package name */
    private e f787k;

    /* renamed from: l  reason: collision with root package name */
    private int f788l;

    /* renamed from: m  reason: collision with root package name */
    private long f789m;

    /* renamed from: n  reason: collision with root package name */
    private long f790n;

    /* renamed from: o  reason: collision with root package name */
    private int f791o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f792p;

    /* renamed from: B2.b$b  reason: collision with other inner class name */
    private class C0005b implements J {

        /* renamed from: a  reason: collision with root package name */
        private final long f793a;

        public C0005b(long j10) {
            this.f793a = j10;
        }

        public J.a c(long j10) {
            J.a i10 = b.this.f785i[0].i(j10);
            for (int i11 = 1; i11 < b.this.f785i.length; i11++) {
                J.a i12 = b.this.f785i[i11].i(j10);
                if (i12.f29107a.f29113b < i10.f29107a.f29113b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        public boolean e() {
            return true;
        }

        public long g() {
            return this.f793a;
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f795a;

        /* renamed from: b  reason: collision with root package name */
        public int f796b;

        /* renamed from: c  reason: collision with root package name */
        public int f797c;

        private c() {
        }

        public void a(C2073A a10) {
            this.f795a = a10.u();
            this.f796b = a10.u();
            this.f797c = 0;
        }

        public void b(C2073A a10) {
            a(a10);
            if (this.f795a == 1414744396) {
                this.f797c = a10.u();
                return;
            }
            throw C1961B.a("LIST expected, found: " + this.f795a, (Throwable) null);
        }
    }

    public b(int i10, s.a aVar) {
        this.f780d = aVar;
        this.f779c = (i10 & 1) != 0 ? false : true;
        this.f777a = new C2073A(12);
        this.f778b = new c();
        this.f782f = new G();
        this.f785i = new e[0];
        this.f789m = -1;
        this.f790n = -1;
        this.f788l = -1;
        this.f784h = -9223372036854775807L;
    }

    private static void c(C2973q qVar) {
        if ((qVar.getPosition() & 1) == 1) {
            qVar.j(1);
        }
    }

    private e d(int i10) {
        for (e eVar : this.f785i) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void e(C2073A a10) {
        f c10 = f.c(1819436136, a10);
        if (c10.getType() == 1819436136) {
            c cVar = (c) c10.b(c.class);
            if (cVar != null) {
                this.f783g = cVar;
                this.f784h = ((long) cVar.f800c) * ((long) cVar.f798a);
                ArrayList arrayList = new ArrayList();
                g0 m10 = c10.f820a.iterator();
                int i10 = 0;
                while (m10.hasNext()) {
                    a aVar = (a) m10.next();
                    if (aVar.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        e m11 = m((f) aVar, i10);
                        if (m11 != null) {
                            arrayList.add(m11);
                        }
                        i10 = i11;
                    }
                }
                this.f785i = (e[]) arrayList.toArray(new e[0]);
                this.f782f.k();
                return;
            }
            throw C1961B.a("AviHeader not found", (Throwable) null);
        }
        throw C1961B.a("Unexpected header list type " + c10.getType(), (Throwable) null);
    }

    private void g(C2073A a10) {
        long l10 = l(a10);
        while (a10.a() >= 16) {
            int u10 = a10.u();
            int u11 = a10.u();
            long u12 = ((long) a10.u()) + l10;
            a10.u();
            e d10 = d(u10);
            if (d10 != null) {
                if ((u11 & 16) == 16) {
                    d10.b(u12);
                }
                d10.k();
            }
        }
        for (e c10 : this.f785i) {
            c10.c();
        }
        this.f792p = true;
        this.f782f.u(new C0005b(this.f784h));
    }

    private long l(C2073A a10) {
        long j10 = 0;
        if (a10.a() < 16) {
            return 0;
        }
        int f10 = a10.f();
        a10.V(8);
        long j11 = this.f789m;
        if (((long) a10.u()) <= j11) {
            j10 = j11 + 8;
        }
        a10.U(f10);
        return j10;
    }

    private e m(f fVar, int i10) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            p.h("AviExtractor", "Missing Stream Header");
            return null;
        } else if (gVar == null) {
            p.h("AviExtractor", "Missing Stream Format");
            return null;
        } else {
            long a10 = dVar.a();
            f2.s sVar = gVar.f822a;
            s.b a11 = sVar.a();
            a11.Z(i10);
            int i11 = dVar.f807f;
            if (i11 != 0) {
                a11.f0(i11);
            }
            h hVar = (h) fVar.b(h.class);
            if (hVar != null) {
                a11.c0(hVar.f823a);
            }
            int i12 = C1960A.i(sVar.f20083n);
            if (i12 != 1 && i12 != 2) {
                return null;
            }
            O d10 = this.f782f.d(i10, i12);
            d10.c(a11.K());
            e eVar = new e(i10, i12, a10, dVar.f806e, d10);
            this.f784h = a10;
            return eVar;
        }
    }

    private int n(C2973q qVar) {
        if (qVar.getPosition() >= this.f790n) {
            return -1;
        }
        e eVar = this.f787k;
        if (eVar == null) {
            c(qVar);
            int i10 = 12;
            qVar.l(this.f777a.e(), 0, 12);
            this.f777a.U(0);
            int u10 = this.f777a.u();
            if (u10 == 1414744396) {
                this.f777a.U(8);
                if (this.f777a.u() != 1769369453) {
                    i10 = 8;
                }
                qVar.j(i10);
                qVar.e();
                return 0;
            }
            int u11 = this.f777a.u();
            if (u10 == 1263424842) {
                this.f786j = qVar.getPosition() + ((long) u11) + 8;
                return 0;
            }
            qVar.j(8);
            qVar.e();
            e d10 = d(u10);
            if (d10 == null) {
                this.f786j = qVar.getPosition() + ((long) u11);
                return 0;
            }
            d10.n(u11);
            this.f787k = d10;
        } else if (eVar.m(qVar)) {
            this.f787k = null;
        }
        return 0;
    }

    private boolean o(C2973q qVar, I i10) {
        boolean z10;
        if (this.f786j != -1) {
            long position = qVar.getPosition();
            long j10 = this.f786j;
            if (j10 < position || j10 > 262144 + position) {
                i10.f29106a = j10;
                z10 = true;
                this.f786j = -1;
                return z10;
            }
            qVar.j((int) (j10 - position));
        }
        z10 = false;
        this.f786j = -1;
        return z10;
    }

    public void a(long j10, long j11) {
        this.f786j = -1;
        this.f787k = null;
        for (e o10 : this.f785i) {
            o10.o(j10);
        }
        if (j10 != 0) {
            this.f781e = 6;
        } else if (this.f785i.length == 0) {
            this.f781e = 0;
        } else {
            this.f781e = 3;
        }
    }

    public void f(r rVar) {
        this.f781e = 0;
        if (this.f779c) {
            rVar = new u(rVar, this.f780d);
        }
        this.f782f = rVar;
        this.f786j = -1;
    }

    public int i(C2973q qVar, I i10) {
        if (o(qVar, i10)) {
            return 1;
        }
        switch (this.f781e) {
            case 0:
                if (j(qVar)) {
                    qVar.j(12);
                    this.f781e = 1;
                    return 0;
                }
                throw C1961B.a("AVI Header List not found", (Throwable) null);
            case 1:
                qVar.readFully(this.f777a.e(), 0, 12);
                this.f777a.U(0);
                this.f778b.b(this.f777a);
                c cVar = this.f778b;
                if (cVar.f797c == 1819436136) {
                    this.f788l = cVar.f796b;
                    this.f781e = 2;
                    return 0;
                }
                throw C1961B.a("hdrl expected, found: " + this.f778b.f797c, (Throwable) null);
            case 2:
                int i11 = this.f788l - 4;
                C2073A a10 = new C2073A(i11);
                qVar.readFully(a10.e(), 0, i11);
                e(a10);
                this.f781e = 3;
                return 0;
            case 3:
                if (this.f789m != -1) {
                    long position = qVar.getPosition();
                    long j10 = this.f789m;
                    if (position != j10) {
                        this.f786j = j10;
                        return 0;
                    }
                }
                qVar.l(this.f777a.e(), 0, 12);
                qVar.e();
                this.f777a.U(0);
                this.f778b.a(this.f777a);
                int u10 = this.f777a.u();
                int i12 = this.f778b.f795a;
                if (i12 == 1179011410) {
                    qVar.j(12);
                    return 0;
                } else if (i12 == 1414744396 && u10 == 1769369453) {
                    long position2 = qVar.getPosition();
                    this.f789m = position2;
                    this.f790n = position2 + ((long) this.f778b.f796b) + 8;
                    if (!this.f792p) {
                        if (((c) C2076a.e(this.f783g)).a()) {
                            this.f781e = 4;
                            this.f786j = this.f790n;
                            return 0;
                        }
                        this.f782f.u(new J.b(this.f784h));
                        this.f792p = true;
                    }
                    this.f786j = qVar.getPosition() + 12;
                    this.f781e = 6;
                    return 0;
                } else {
                    this.f786j = qVar.getPosition() + ((long) this.f778b.f796b) + 8;
                    return 0;
                }
            case 4:
                qVar.readFully(this.f777a.e(), 0, 8);
                this.f777a.U(0);
                int u11 = this.f777a.u();
                int u12 = this.f777a.u();
                if (u11 == 829973609) {
                    this.f781e = 5;
                    this.f791o = u12;
                } else {
                    this.f786j = qVar.getPosition() + ((long) u12);
                }
                return 0;
            case 5:
                C2073A a11 = new C2073A(this.f791o);
                qVar.readFully(a11.e(), 0, this.f791o);
                g(a11);
                this.f781e = 6;
                this.f786j = this.f789m;
                return 0;
            case 6:
                return n(qVar);
            default:
                throw new AssertionError();
        }
    }

    public boolean j(C2973q qVar) {
        qVar.l(this.f777a.e(), 0, 12);
        this.f777a.U(0);
        if (this.f777a.u() != 1179011410) {
            return false;
        }
        this.f777a.V(4);
        if (this.f777a.u() == 541677121) {
            return true;
        }
        return false;
    }

    public void release() {
    }
}
