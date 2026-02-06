package s9;

import com.google.common.collect.g0;
import ja.B;
import ja.C3645a;
import ja.s;
import ja.w;
import java.util.ArrayList;
import k9.C3717q0;
import k9.L0;
import q9.C3962B;
import q9.i;
import q9.k;
import q9.l;
import q9.m;
import q9.y;
import q9.z;

/* renamed from: s9.b  reason: case insensitive filesystem */
public final class C4000b implements k {

    /* renamed from: a  reason: collision with root package name */
    private final B f48112a = new B(12);

    /* renamed from: b  reason: collision with root package name */
    private final c f48113b = new c();

    /* renamed from: c  reason: collision with root package name */
    private int f48114c;

    /* renamed from: d  reason: collision with root package name */
    private m f48115d = new i();

    /* renamed from: e  reason: collision with root package name */
    private C4001c f48116e;

    /* renamed from: f  reason: collision with root package name */
    private long f48117f = -9223372036854775807L;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public C4003e[] f48118g = new C4003e[0];

    /* renamed from: h  reason: collision with root package name */
    private long f48119h;

    /* renamed from: i  reason: collision with root package name */
    private C4003e f48120i;

    /* renamed from: j  reason: collision with root package name */
    private int f48121j = -1;

    /* renamed from: k  reason: collision with root package name */
    private long f48122k = -1;

    /* renamed from: l  reason: collision with root package name */
    private long f48123l = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f48124m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f48125n;

    /* renamed from: s9.b$b  reason: collision with other inner class name */
    private class C0724b implements z {

        /* renamed from: a  reason: collision with root package name */
        private final long f48126a;

        public C0724b(long j10) {
            this.f48126a = j10;
        }

        public z.a c(long j10) {
            z.a i10 = C4000b.this.f48118g[0].i(j10);
            for (int i11 = 1; i11 < C4000b.this.f48118g.length; i11++) {
                z.a i12 = C4000b.this.f48118g[i11].i(j10);
                if (i12.f47920a.f47790b < i10.f47920a.f47790b) {
                    i10 = i12;
                }
            }
            return i10;
        }

        public boolean e() {
            return true;
        }

        public long g() {
            return this.f48126a;
        }
    }

    /* renamed from: s9.b$c */
    private static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f48128a;

        /* renamed from: b  reason: collision with root package name */
        public int f48129b;

        /* renamed from: c  reason: collision with root package name */
        public int f48130c;

        private c() {
        }

        public void a(B b10) {
            this.f48128a = b10.q();
            this.f48129b = b10.q();
            this.f48130c = 0;
        }

        public void b(B b10) {
            a(b10);
            if (this.f48128a == 1414744396) {
                this.f48130c = b10.q();
                return;
            }
            throw L0.a("LIST expected, found: " + this.f48128a, (Throwable) null);
        }
    }

    private static void c(l lVar) {
        if ((lVar.getPosition() & 1) == 1) {
            lVar.j(1);
        }
    }

    private C4003e d(int i10) {
        for (C4003e eVar : this.f48118g) {
            if (eVar.j(i10)) {
                return eVar;
            }
        }
        return null;
    }

    private void e(B b10) {
        C4004f c10 = C4004f.c(1819436136, b10);
        if (c10.getType() == 1819436136) {
            C4001c cVar = (C4001c) c10.b(C4001c.class);
            if (cVar != null) {
                this.f48116e = cVar;
                this.f48117f = ((long) cVar.f48133c) * ((long) cVar.f48131a);
                ArrayList arrayList = new ArrayList();
                g0 m10 = c10.f48153a.iterator();
                int i10 = 0;
                while (m10.hasNext()) {
                    C3999a aVar = (C3999a) m10.next();
                    if (aVar.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        C4003e k10 = k((C4004f) aVar, i10);
                        if (k10 != null) {
                            arrayList.add(k10);
                        }
                        i10 = i11;
                    }
                }
                this.f48118g = (C4003e[]) arrayList.toArray(new C4003e[0]);
                this.f48115d.k();
                return;
            }
            throw L0.a("AviHeader not found", (Throwable) null);
        }
        throw L0.a("Unexpected header list type " + c10.getType(), (Throwable) null);
    }

    private void g(B b10) {
        long j10 = j(b10);
        while (b10.a() >= 16) {
            int q10 = b10.q();
            int q11 = b10.q();
            long q12 = ((long) b10.q()) + j10;
            b10.q();
            C4003e d10 = d(q10);
            if (d10 != null) {
                if ((q11 & 16) == 16) {
                    d10.b(q12);
                }
                d10.k();
            }
        }
        for (C4003e c10 : this.f48118g) {
            c10.c();
        }
        this.f48125n = true;
        this.f48115d.q(new C0724b(this.f48117f));
    }

    private long j(B b10) {
        long j10 = 0;
        if (b10.a() < 16) {
            return 0;
        }
        int e10 = b10.e();
        b10.Q(8);
        long j11 = this.f48122k;
        if (((long) b10.q()) <= j11) {
            j10 = j11 + 8;
        }
        b10.P(e10);
        return j10;
    }

    private C4003e k(C4004f fVar, int i10) {
        C4002d dVar = (C4002d) fVar.b(C4002d.class);
        C4005g gVar = (C4005g) fVar.b(C4005g.class);
        if (dVar == null) {
            s.i("AviExtractor", "Missing Stream Header");
            return null;
        } else if (gVar == null) {
            s.i("AviExtractor", "Missing Stream Format");
            return null;
        } else {
            long a10 = dVar.a();
            C3717q0 q0Var = gVar.f48155a;
            C3717q0.b b10 = q0Var.b();
            b10.R(i10);
            int i11 = dVar.f48140f;
            if (i11 != 0) {
                b10.W(i11);
            }
            C4006h hVar = (C4006h) fVar.b(C4006h.class);
            if (hVar != null) {
                b10.U(hVar.f48156a);
            }
            int k10 = w.k(q0Var.f45770l);
            if (k10 != 1 && k10 != 2) {
                return null;
            }
            C3962B d10 = this.f48115d.d(i10, k10);
            d10.c(b10.E());
            C4003e eVar = new C4003e(i10, k10, a10, dVar.f48139e, d10);
            this.f48117f = a10;
            return eVar;
        }
    }

    private int l(l lVar) {
        if (lVar.getPosition() >= this.f48123l) {
            return -1;
        }
        C4003e eVar = this.f48120i;
        if (eVar == null) {
            c(lVar);
            int i10 = 12;
            lVar.l(this.f48112a.d(), 0, 12);
            this.f48112a.P(0);
            int q10 = this.f48112a.q();
            if (q10 == 1414744396) {
                this.f48112a.P(8);
                if (this.f48112a.q() != 1769369453) {
                    i10 = 8;
                }
                lVar.j(i10);
                lVar.e();
                return 0;
            }
            int q11 = this.f48112a.q();
            if (q10 == 1263424842) {
                this.f48119h = lVar.getPosition() + ((long) q11) + 8;
                return 0;
            }
            lVar.j(8);
            lVar.e();
            C4003e d10 = d(q10);
            if (d10 == null) {
                this.f48119h = lVar.getPosition() + ((long) q11);
                return 0;
            }
            d10.n(q11);
            this.f48120i = d10;
        } else if (eVar.m(lVar)) {
            this.f48120i = null;
        }
        return 0;
    }

    private boolean m(l lVar, y yVar) {
        boolean z10;
        if (this.f48119h != -1) {
            long position = lVar.getPosition();
            long j10 = this.f48119h;
            if (j10 < position || j10 > 262144 + position) {
                yVar.f47919a = j10;
                z10 = true;
                this.f48119h = -1;
                return z10;
            }
            lVar.j((int) (j10 - position));
        }
        z10 = false;
        this.f48119h = -1;
        return z10;
    }

    public void a(long j10, long j11) {
        this.f48119h = -1;
        this.f48120i = null;
        for (C4003e o10 : this.f48118g) {
            o10.o(j10);
        }
        if (j10 != 0) {
            this.f48114c = 6;
        } else if (this.f48118g.length == 0) {
            this.f48114c = 0;
        } else {
            this.f48114c = 3;
        }
    }

    public void f(m mVar) {
        this.f48114c = 0;
        this.f48115d = mVar;
        this.f48119h = -1;
    }

    public boolean h(l lVar) {
        lVar.l(this.f48112a.d(), 0, 12);
        this.f48112a.P(0);
        if (this.f48112a.q() != 1179011410) {
            return false;
        }
        this.f48112a.Q(4);
        if (this.f48112a.q() == 541677121) {
            return true;
        }
        return false;
    }

    public int i(l lVar, y yVar) {
        if (m(lVar, yVar)) {
            return 1;
        }
        switch (this.f48114c) {
            case 0:
                if (h(lVar)) {
                    lVar.j(12);
                    this.f48114c = 1;
                    return 0;
                }
                throw L0.a("AVI Header List not found", (Throwable) null);
            case 1:
                lVar.readFully(this.f48112a.d(), 0, 12);
                this.f48112a.P(0);
                this.f48113b.b(this.f48112a);
                c cVar = this.f48113b;
                if (cVar.f48130c == 1819436136) {
                    this.f48121j = cVar.f48129b;
                    this.f48114c = 2;
                    return 0;
                }
                throw L0.a("hdrl expected, found: " + this.f48113b.f48130c, (Throwable) null);
            case 2:
                int i10 = this.f48121j - 4;
                B b10 = new B(i10);
                lVar.readFully(b10.d(), 0, i10);
                e(b10);
                this.f48114c = 3;
                return 0;
            case 3:
                if (this.f48122k != -1) {
                    long position = lVar.getPosition();
                    long j10 = this.f48122k;
                    if (position != j10) {
                        this.f48119h = j10;
                        return 0;
                    }
                }
                lVar.l(this.f48112a.d(), 0, 12);
                lVar.e();
                this.f48112a.P(0);
                this.f48113b.a(this.f48112a);
                int q10 = this.f48112a.q();
                int i11 = this.f48113b.f48128a;
                if (i11 == 1179011410) {
                    lVar.j(12);
                    return 0;
                } else if (i11 == 1414744396 && q10 == 1769369453) {
                    long position2 = lVar.getPosition();
                    this.f48122k = position2;
                    this.f48123l = position2 + ((long) this.f48113b.f48129b) + 8;
                    if (!this.f48125n) {
                        if (((C4001c) C3645a.e(this.f48116e)).a()) {
                            this.f48114c = 4;
                            this.f48119h = this.f48123l;
                            return 0;
                        }
                        this.f48115d.q(new z.b(this.f48117f));
                        this.f48125n = true;
                    }
                    this.f48119h = lVar.getPosition() + 12;
                    this.f48114c = 6;
                    return 0;
                } else {
                    this.f48119h = lVar.getPosition() + ((long) this.f48113b.f48129b) + 8;
                    return 0;
                }
            case 4:
                lVar.readFully(this.f48112a.d(), 0, 8);
                this.f48112a.P(0);
                int q11 = this.f48112a.q();
                int q12 = this.f48112a.q();
                if (q11 == 829973609) {
                    this.f48114c = 5;
                    this.f48124m = q12;
                } else {
                    this.f48119h = lVar.getPosition() + ((long) q12);
                }
                return 0;
            case 5:
                B b11 = new B(this.f48124m);
                lVar.readFully(b11.d(), 0, this.f48124m);
                g(b11);
                this.f48114c = 6;
                this.f48119h = this.f48122k;
                return 0;
            case 6:
                return l(lVar);
            default:
                throw new AssertionError();
        }
    }

    public void release() {
    }
}
