package I0;

import J0.C1234c;
import J0.C1239e0;
import J0.C1245k;
import J0.C1247m;
import J0.G;
import J0.m0;
import a0.C1538b;
import java.util.HashSet;
import java.util.Set;
import k0.i;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final m0 f2674a;

    /* renamed from: b  reason: collision with root package name */
    private final C1538b f2675b = new C1538b(new C1234c[16], 0);

    /* renamed from: c  reason: collision with root package name */
    private final C1538b f2676c = new C1538b(new c[16], 0);

    /* renamed from: d  reason: collision with root package name */
    private final C1538b f2677d = new C1538b(new G[16], 0);

    /* renamed from: e  reason: collision with root package name */
    private final C1538b f2678e = new C1538b(new c[16], 0);

    /* renamed from: f  reason: collision with root package name */
    private boolean f2679f;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f2680a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.f2680a = fVar;
        }

        public final void invoke() {
            this.f2680a.e();
        }
    }

    public f(m0 m0Var) {
        this.f2674a = m0Var;
    }

    private final void c(i.c cVar, c cVar2, Set set) {
        int a10 = C1239e0.a(32);
        if (!cVar.v0().S1()) {
            G0.a.b("visitSubtreeIf called on an unattached node");
        }
        C1538b bVar = new C1538b(new i.c[16], 0);
        i.c J12 = cVar.v0().J1();
        if (J12 == null) {
            C1245k.c(bVar, cVar.v0());
        } else {
            bVar.b(J12);
        }
        while (bVar.t()) {
            i.c cVar3 = (i.c) bVar.y(bVar.q() - 1);
            if ((cVar3.I1() & a10) != 0) {
                i.c cVar4 = cVar3;
                while (true) {
                    if (cVar4 == null) {
                        break;
                    }
                    if ((cVar4.N1() & a10) != 0) {
                        i.c cVar5 = cVar4;
                        C1538b bVar2 = null;
                        while (cVar5 != null) {
                            if (cVar5 instanceof h) {
                                h hVar = (h) cVar5;
                                if (hVar instanceof C1234c) {
                                    C1234c cVar6 = (C1234c) hVar;
                                    if ((cVar6.l2() instanceof d) && cVar6.m2().contains(cVar2)) {
                                        set.add(hVar);
                                    }
                                }
                                if (hVar.q0().a(cVar2)) {
                                    break;
                                }
                            } else if ((cVar5.N1() & a10) != 0 && (cVar5 instanceof C1247m)) {
                                int i10 = 0;
                                for (i.c m22 = ((C1247m) cVar5).m2(); m22 != null; m22 = m22.J1()) {
                                    if ((m22.N1() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar5 = m22;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new C1538b(new i.c[16], 0);
                                            }
                                            if (cVar5 != null) {
                                                bVar2.b(cVar5);
                                                cVar5 = null;
                                            }
                                            bVar2.b(m22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar5 = C1245k.g(bVar2);
                        }
                        continue;
                    }
                    cVar4 = cVar4.J1();
                }
            }
            C1245k.c(bVar, cVar3);
        }
    }

    public final void a(C1234c cVar, c cVar2) {
        this.f2675b.b(cVar);
        this.f2676c.b(cVar2);
        b();
    }

    public final void b() {
        if (!this.f2679f) {
            this.f2679f = true;
            this.f2674a.h(new a(this));
        }
    }

    public final void d(C1234c cVar, c cVar2) {
        this.f2677d.b(C1245k.m(cVar));
        this.f2678e.b(cVar2);
        b();
    }

    public final void e() {
        int i10 = 0;
        this.f2679f = false;
        HashSet<C1234c> hashSet = new HashSet<>();
        C1538b bVar = this.f2677d;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i11 = 0;
            do {
                G g10 = (G) p10[i11];
                c cVar = (c) this.f2678e.p()[i11];
                if (g10.j0().k().S1()) {
                    c(g10.j0().k(), cVar, hashSet);
                }
                i11++;
            } while (i11 < q10);
        }
        this.f2677d.i();
        this.f2678e.i();
        C1538b bVar2 = this.f2675b;
        int q11 = bVar2.q();
        if (q11 > 0) {
            Object[] p11 = bVar2.p();
            do {
                C1234c cVar2 = (C1234c) p11[i10];
                c cVar3 = (c) this.f2676c.p()[i10];
                if (cVar2.S1()) {
                    c(cVar2, cVar3, hashSet);
                }
                i10++;
            } while (i10 < q11);
        }
        this.f2675b.i();
        this.f2676c.i();
        for (C1234c r22 : hashSet) {
            r22.r2();
        }
    }

    public final void f(C1234c cVar, c cVar2) {
        this.f2675b.b(cVar);
        this.f2676c.b(cVar2);
        b();
    }
}
