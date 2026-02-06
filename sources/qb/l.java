package Qb;

import Lb.C4368b;
import Lb.H;
import Mb.f;
import Rb.d;
import Tb.g;
import Tb.h;
import Tb.i;
import Tb.j;
import Tb.m;
import Tb.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class l {

    /* renamed from: b  reason: collision with root package name */
    private static d.a f52296b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Rb.d f52297a;

    class a implements d.a {
        a() {
        }

        public n a(Tb.b bVar) {
            return null;
        }

        public m b(h hVar, m mVar, boolean z10) {
            return null;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f52298a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Mb.d$a[] r0 = Mb.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52298a = r0
                Mb.d$a r1 = Mb.d.a.Overwrite     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52298a     // Catch:{ NoSuchFieldError -> 0x001d }
                Mb.d$a r1 = Mb.d.a.Merge     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52298a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Mb.d$a r1 = Mb.d.a.AckUserWrite     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f52298a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Mb.d$a r1 = Mb.d.a.ListenComplete     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qb.l.b.<clinit>():void");
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f52299a;

        /* renamed from: b  reason: collision with root package name */
        public final List f52300b;

        public c(k kVar, List list) {
            this.f52299a = kVar;
            this.f52300b = list;
        }
    }

    private static class d implements d.a {

        /* renamed from: a  reason: collision with root package name */
        private final H f52301a;

        /* renamed from: b  reason: collision with root package name */
        private final k f52302b;

        /* renamed from: c  reason: collision with root package name */
        private final n f52303c;

        public d(H h10, k kVar, n nVar) {
            this.f52301a = h10;
            this.f52302b = kVar;
            this.f52303c = nVar;
        }

        public n a(Tb.b bVar) {
            a aVar;
            a c10 = this.f52302b.c();
            if (c10.c(bVar)) {
                return c10.b().k0(bVar);
            }
            n nVar = this.f52303c;
            if (nVar != null) {
                aVar = new a(i.d(nVar, j.j()), true, false);
            } else {
                aVar = this.f52302b.d();
            }
            return this.f52301a.a(bVar, aVar);
        }

        public m b(h hVar, m mVar, boolean z10) {
            n nVar = this.f52303c;
            if (nVar == null) {
                nVar = this.f52302b.b();
            }
            return this.f52301a.g(nVar, mVar, z10, hVar);
        }
    }

    public l(Rb.d dVar) {
        this.f52297a = dVar;
    }

    private k a(k kVar, Lb.l lVar, Ob.d dVar, H h10, n nVar, Rb.a aVar) {
        if (h10.i(lVar) != null) {
            return kVar;
        }
        boolean e10 = kVar.d().e();
        a d10 = kVar.d();
        if (dVar.getValue() == null) {
            C4368b n10 = C4368b.n();
            Iterator it = dVar.iterator();
            C4368b bVar = n10;
            while (it.hasNext()) {
                Lb.l lVar2 = (Lb.l) ((Map.Entry) it.next()).getKey();
                Lb.l t10 = lVar.t(lVar2);
                if (d10.d(t10)) {
                    bVar = bVar.a(lVar2, d10.b().U(t10));
                }
            }
            return c(kVar, lVar, bVar, h10, nVar, e10, aVar);
        } else if ((lVar.isEmpty() && d10.f()) || d10.d(lVar)) {
            return d(kVar, lVar, d10.b().U(lVar), h10, nVar, e10, aVar);
        } else if (!lVar.isEmpty()) {
            return kVar;
        } else {
            C4368b n11 = C4368b.n();
            C4368b bVar2 = n11;
            for (m mVar : d10.b()) {
                bVar2 = bVar2.b(mVar.c(), mVar.d());
            }
            return c(kVar, lVar, bVar2, h10, nVar, e10, aVar);
        }
    }

    private k c(k kVar, Lb.l lVar, C4368b bVar, H h10, n nVar, boolean z10, Rb.a aVar) {
        boolean z11;
        C4368b bVar2;
        boolean z12;
        if (kVar.d().b().isEmpty() && !kVar.d().f()) {
            return kVar;
        }
        if (bVar.D() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Ob.l.g(z11, "Can't have a merge that is an overwrite");
        if (lVar.isEmpty()) {
            bVar2 = bVar;
        } else {
            bVar2 = C4368b.n().d(lVar, bVar);
        }
        n b10 = kVar.d().b();
        Map m10 = bVar2.m();
        k kVar2 = kVar;
        for (Map.Entry entry : m10.entrySet()) {
            Tb.b bVar3 = (Tb.b) entry.getKey();
            if (b10.w(bVar3)) {
                kVar2 = d(kVar2, new Lb.l(bVar3), ((C4368b) entry.getValue()).g(b10.k0(bVar3)), h10, nVar, z10, aVar);
            }
        }
        k kVar3 = kVar2;
        for (Map.Entry entry2 : m10.entrySet()) {
            Tb.b bVar4 = (Tb.b) entry2.getKey();
            C4368b bVar5 = (C4368b) entry2.getValue();
            if (kVar.d().c(bVar4) || bVar5.D() != null) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!b10.w(bVar4) && !z12) {
                kVar3 = d(kVar3, new Lb.l(bVar4), ((C4368b) entry2.getValue()).g(b10.k0(bVar4)), h10, nVar, z10, aVar);
            }
        }
        return kVar3;
    }

    private k d(k kVar, Lb.l lVar, n nVar, H h10, n nVar2, boolean z10, Rb.a aVar) {
        i iVar;
        k kVar2 = kVar;
        n nVar3 = nVar;
        a d10 = kVar.d();
        Rb.d dVar = this.f52297a;
        if (!z10) {
            dVar = dVar.a();
        }
        boolean z11 = true;
        if (lVar.isEmpty()) {
            iVar = dVar.c(d10.a(), i.d(nVar3, dVar.getIndex()), (Rb.a) null);
        } else if (!dVar.d() || d10.e()) {
            Tb.b E10 = lVar.E();
            if (!d10.d(lVar) && lVar.size() > 1) {
                return kVar2;
            }
            Lb.l N10 = lVar.N();
            n Y10 = d10.b().k0(E10).Y(N10, nVar3);
            if (E10.p()) {
                iVar = dVar.e(d10.a(), Y10);
            } else {
                iVar = dVar.b(d10.a(), E10, Y10, N10, f52296b, (Rb.a) null);
            }
            if (!d10.f() && !lVar.isEmpty()) {
                z11 = false;
            }
            k f10 = kVar2.f(iVar, z11, dVar.d());
            H h11 = h10;
            return h(f10, lVar, h11, new d(h11, f10, nVar2), aVar);
        } else {
            Ob.l.g(!lVar.isEmpty(), "An empty path should have been caught in the other branch");
            Tb.b E11 = lVar.E();
            iVar = dVar.c(d10.a(), d10.a().r(E11, d10.b().k0(E11).Y(lVar.N(), nVar3)), (Rb.a) null);
        }
        Lb.l lVar2 = lVar;
        z11 = false;
        k f102 = kVar2.f(iVar, z11, dVar.d());
        H h112 = h10;
        return h(f102, lVar, h112, new d(h112, f102, nVar2), aVar);
    }

    private k e(k kVar, Lb.l lVar, C4368b bVar, H h10, n nVar, Rb.a aVar) {
        boolean z10;
        k kVar2 = kVar;
        Lb.l lVar2 = lVar;
        if (bVar.D() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Ob.l.g(z10, "Can't have a merge that is an overwrite");
        Iterator it = bVar.iterator();
        k kVar3 = kVar2;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Lb.l t10 = lVar.t((Lb.l) entry.getKey());
            if (g(kVar, t10.E())) {
                kVar3 = f(kVar3, t10, (n) entry.getValue(), h10, nVar, aVar);
            }
        }
        Iterator it2 = bVar.iterator();
        k kVar4 = kVar3;
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Lb.l t11 = lVar.t((Lb.l) entry2.getKey());
            if (!g(kVar, t11.E())) {
                kVar4 = f(kVar4, t11, (n) entry2.getValue(), h10, nVar, aVar);
            }
        }
        return kVar4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Qb.k f(Qb.k r9, Lb.l r10, Tb.n r11, Lb.H r12, Tb.n r13, Rb.a r14) {
        /*
            r8 = this;
            Qb.a r0 = r9.c()
            Qb.l$d r6 = new Qb.l$d
            r6.<init>(r12, r9, r13)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x0034
            Rb.d r10 = r8.f52297a
            Tb.h r10 = r10.getIndex()
            Tb.i r10 = Tb.i.d(r11, r10)
            Rb.d r11 = r8.f52297a
            Qb.a r12 = r9.c()
            Tb.i r12 = r12.a()
            Tb.i r10 = r11.c(r12, r10, r14)
            Rb.d r11 = r8.f52297a
            boolean r11 = r11.d()
            r12 = 1
            Qb.k r9 = r9.e(r10, r12, r11)
            goto L_0x00b6
        L_0x0034:
            Tb.b r3 = r10.E()
            boolean r12 = r3.p()
            if (r12 == 0) goto L_0x0059
            Rb.d r10 = r8.f52297a
            Qb.a r12 = r9.c()
            Tb.i r12 = r12.a()
            Tb.i r10 = r10.e(r12, r11)
            boolean r11 = r0.f()
            boolean r12 = r0.e()
            Qb.k r9 = r9.e(r10, r11, r12)
            goto L_0x00b6
        L_0x0059:
            Lb.l r5 = r10.N()
            Tb.n r10 = r0.b()
            Tb.n r10 = r10.k0(r3)
            boolean r12 = r5.isEmpty()
            if (r12 == 0) goto L_0x006d
        L_0x006b:
            r4 = r11
            goto L_0x0097
        L_0x006d:
            Tb.n r12 = r6.a(r3)
            if (r12 == 0) goto L_0x0092
            Tb.b r13 = r5.C()
            boolean r13 = r13.p()
            if (r13 == 0) goto L_0x008d
            Lb.l r13 = r5.H()
            Tb.n r13 = r12.U(r13)
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x008d
            r4 = r12
            goto L_0x0097
        L_0x008d:
            Tb.n r11 = r12.Y(r5, r11)
            goto L_0x006b
        L_0x0092:
            Tb.g r11 = Tb.g.A()
            goto L_0x006b
        L_0x0097:
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x00b6
            Rb.d r1 = r8.f52297a
            Tb.i r2 = r0.a()
            r7 = r14
            Tb.i r10 = r1.b(r2, r3, r4, r5, r6, r7)
            boolean r11 = r0.f()
            Rb.d r12 = r8.f52297a
            boolean r12 = r12.d()
            Qb.k r9 = r9.e(r10, r11, r12)
        L_0x00b6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Qb.l.f(Qb.k, Lb.l, Tb.n, Lb.H, Tb.n, Rb.a):Qb.k");
    }

    private static boolean g(k kVar, Tb.b bVar) {
        return kVar.c().c(bVar);
    }

    private k h(k kVar, Lb.l lVar, H h10, d.a aVar, Rb.a aVar2) {
        i iVar;
        n a10;
        boolean z10;
        n nVar;
        k kVar2 = kVar;
        Lb.l lVar2 = lVar;
        H h11 = h10;
        a c10 = kVar.c();
        if (h11.i(lVar2) != null) {
            return kVar2;
        }
        boolean z11 = false;
        if (lVar.isEmpty()) {
            Ob.l.g(kVar.d().f(), "If change path is empty, we must have complete server data");
            if (kVar.d().e()) {
                n b10 = kVar.b();
                if (!(b10 instanceof Tb.c)) {
                    b10 = g.A();
                }
                nVar = h11.e(b10);
            } else {
                nVar = h11.b(kVar.b());
            }
            iVar = this.f52297a.c(kVar.c().a(), i.d(nVar, this.f52297a.getIndex()), aVar2);
        } else {
            Rb.a aVar3 = aVar2;
            Tb.b E10 = lVar.E();
            if (E10.p()) {
                if (lVar.size() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Ob.l.g(z10, "Can't have a priority with additional path components");
                n f10 = h11.f(lVar2, c10.b(), kVar.d().b());
                if (f10 != null) {
                    iVar = this.f52297a.e(c10.a(), f10);
                } else {
                    iVar = c10.a();
                }
            } else {
                Lb.l N10 = lVar.N();
                if (c10.c(E10)) {
                    n f11 = h11.f(lVar2, c10.b(), kVar.d().b());
                    if (f11 != null) {
                        a10 = c10.b().k0(E10).Y(N10, f11);
                    } else {
                        a10 = c10.b().k0(E10);
                    }
                } else {
                    a10 = h11.a(E10, kVar.d());
                }
                n nVar2 = a10;
                if (nVar2 != null) {
                    iVar = this.f52297a.b(c10.a(), E10, nVar2, N10, aVar, aVar2);
                } else {
                    iVar = c10.a();
                }
            }
        }
        if (c10.f() || lVar.isEmpty()) {
            z11 = true;
        }
        return kVar2.e(iVar, z11, this.f52297a.d());
    }

    private k i(k kVar, Lb.l lVar, H h10, n nVar, Rb.a aVar) {
        boolean z10;
        a d10 = kVar.d();
        i a10 = d10.a();
        if (d10.f() || lVar.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return h(kVar.f(a10, z10, d10.e()), lVar, h10, f52296b, aVar);
    }

    private void j(k kVar, k kVar2, List list) {
        boolean z10;
        a c10 = kVar2.c();
        if (c10.f()) {
            if (c10.b().e0() || c10.b().isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!list.isEmpty() || !kVar.c().f() || ((z10 && !c10.b().equals(kVar.a())) || !c10.b().q().equals(kVar.a().q()))) {
                list.add(c.n(c10.a()));
            }
        }
    }

    public c b(k kVar, Mb.d dVar, H h10, n nVar) {
        k kVar2;
        boolean z10;
        boolean z11;
        Rb.a aVar = new Rb.a();
        int i10 = b.f52298a[dVar.c().ordinal()];
        if (i10 == 1) {
            f fVar = (f) dVar;
            if (fVar.b().d()) {
                kVar2 = f(kVar, fVar.a(), fVar.e(), h10, nVar, aVar);
            } else {
                Ob.l.f(fVar.b().c());
                if (fVar.b().e() || (kVar.d().e() && !fVar.a().isEmpty())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kVar2 = d(kVar, fVar.a(), fVar.e(), h10, nVar, z10, aVar);
            }
        } else if (i10 == 2) {
            Mb.c cVar = (Mb.c) dVar;
            if (cVar.b().d()) {
                kVar2 = e(kVar, cVar.a(), cVar.e(), h10, nVar, aVar);
            } else {
                Ob.l.f(cVar.b().c());
                if (cVar.b().e() || kVar.d().e()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kVar2 = c(kVar, cVar.a(), cVar.e(), h10, nVar, z11, aVar);
            }
        } else if (i10 == 3) {
            Mb.a aVar2 = (Mb.a) dVar;
            if (!aVar2.f()) {
                kVar2 = a(kVar, aVar2.a(), aVar2.e(), h10, nVar, aVar);
            } else {
                kVar2 = k(kVar, aVar2.a(), h10, nVar, aVar);
            }
        } else if (i10 == 4) {
            kVar2 = i(kVar, dVar.a(), h10, nVar, aVar);
        } else {
            throw new AssertionError("Unknown operation: " + dVar.c());
        }
        ArrayList arrayList = new ArrayList(aVar.a());
        j(kVar, kVar2, arrayList);
        return new c(kVar2, arrayList);
    }

    public k k(k kVar, Lb.l lVar, H h10, n nVar, Rb.a aVar) {
        boolean z10;
        n nVar2;
        if (h10.i(lVar) != null) {
            return kVar;
        }
        d dVar = new d(h10, kVar, nVar);
        i a10 = kVar.c().a();
        if (lVar.isEmpty() || lVar.E().p()) {
            if (kVar.d().f()) {
                nVar2 = h10.b(kVar.b());
            } else {
                nVar2 = h10.e(kVar.d().b());
            }
            a10 = this.f52297a.c(a10, i.d(nVar2, this.f52297a.getIndex()), aVar);
        } else {
            Tb.b E10 = lVar.E();
            n a11 = h10.a(E10, kVar.d());
            if (a11 == null && kVar.d().c(E10)) {
                a11 = a10.k().k0(E10);
            }
            n nVar3 = a11;
            if (nVar3 != null) {
                a10 = this.f52297a.b(a10, E10, nVar3, lVar.N(), dVar, aVar);
            } else if (nVar3 == null && kVar.c().b().w(E10)) {
                a10 = this.f52297a.b(a10, E10, g.A(), lVar.N(), dVar, aVar);
            }
            if (a10.k().isEmpty() && kVar.d().f()) {
                n b10 = h10.b(kVar.b());
                if (b10.e0()) {
                    a10 = this.f52297a.c(a10, i.d(b10, this.f52297a.getIndex()), aVar);
                }
            }
        }
        if (kVar.d().f() || h10.i(Lb.l.D()) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return kVar.e(a10, z10, this.f52297a.d());
    }
}
