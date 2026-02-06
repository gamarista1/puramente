package Fg;

import Fg.u0;
import Jg.b;
import Jg.d;
import Jg.e;
import Jg.h;
import Jg.i;
import Jg.j;
import Jg.k;
import Jg.l;
import Jg.m;
import Jg.n;
import Jg.o;
import Jg.s;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import yf.C6798l;

/* renamed from: Fg.g  reason: case insensitive filesystem */
public final class C5371g {

    /* renamed from: a  reason: collision with root package name */
    public static final C5371g f63009a = new C5371g();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f63010b;

    /* renamed from: Fg.g$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63011a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f63012b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
        static {
            /*
                Jg.s[] r0 = Jg.s.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Jg.s r2 = Jg.s.INV     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Jg.s r3 = Jg.s.OUT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                Jg.s r4 = Jg.s.IN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f63011a = r0
                Fg.u0$b[] r0 = Fg.u0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Fg.u0$b r4 = Fg.u0.b.CHECK_ONLY_LOWER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                Fg.u0$b r1 = Fg.u0.b.CHECK_SUBTYPE_AND_LOWER     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                Fg.u0$b r1 = Fg.u0.b.SKIP_LOWER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                f63012b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fg.C5371g.a.<clinit>():void");
        }
    }

    private C5371g() {
    }

    private final List A(u0 u0Var, List list) {
        o j10 = u0Var.j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            k x02 = j10.x0((j) next);
            int N10 = j10.N(x02);
            int i10 = 0;
            while (true) {
                if (i10 < N10) {
                    if (j10.o(j10.E0(j10.y(x02, i10))) != null) {
                        break;
                    }
                    i10++;
                } else {
                    arrayList.add(next);
                    break;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return list;
    }

    private final Boolean c(u0 u0Var, j jVar, j jVar2) {
        o j10 = u0Var.j();
        if (!j10.n(jVar) && !j10.n(jVar2)) {
            return null;
        }
        if (f(j10, jVar) && f(j10, jVar2)) {
            return Boolean.TRUE;
        }
        if (j10.n(jVar)) {
            if (g(j10, u0Var, jVar, jVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (j10.n(jVar2) && (e(j10, jVar) || g(j10, u0Var, jVar2, jVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    private static final boolean d(o oVar, j jVar) {
        if (!(jVar instanceof d)) {
            return false;
        }
        l n02 = oVar.n0(oVar.s((d) jVar));
        if (oVar.j(n02) || !oVar.n(oVar.k(oVar.E0(n02)))) {
            return false;
        }
        return true;
    }

    private static final boolean e(o oVar, j jVar) {
        m b10 = oVar.b(jVar);
        if (b10 instanceof h) {
            Iterable<i> w02 = oVar.w0(b10);
            if (!(w02 instanceof Collection) || !((Collection) w02).isEmpty()) {
                for (i f10 : w02) {
                    j f11 = oVar.f(f10);
                    if (f11 != null && oVar.n(f11)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean f(o oVar, j jVar) {
        if (oVar.n(jVar) || d(oVar, jVar)) {
            return true;
        }
        return false;
    }

    private static final boolean g(o oVar, u0 u0Var, j jVar, j jVar2, boolean z10) {
        Iterable<i> r10 = oVar.r(jVar);
        if ((r10 instanceof Collection) && ((Collection) r10).isEmpty()) {
            return false;
        }
        for (i iVar : r10) {
            if (C6496s.c(oVar.J(iVar), oVar.b(jVar2)) || (z10 && v(f63009a, u0Var, jVar2, iVar, false, 8, (Object) null))) {
                return true;
            }
        }
        return false;
    }

    private final Boolean h(u0 u0Var, j jVar, j jVar2) {
        j jVar3;
        i iVar;
        j jVar4 = jVar;
        j jVar5 = jVar2;
        o j10 = u0Var.j();
        boolean z10 = false;
        if (j10.a0(jVar4) || j10.a0(jVar5)) {
            u0 u0Var2 = u0Var;
            if (u0Var.m()) {
                return Boolean.TRUE;
            }
            if (!j10.i(jVar4) || j10.i(jVar5)) {
                return Boolean.valueOf(C5365d.f62994a.b(j10, j10.d(jVar4, false), j10.d(jVar5, false)));
            }
            return Boolean.FALSE;
        } else if (j10.z(jVar4) && j10.z(jVar5)) {
            if (f63009a.r(j10, jVar4, jVar5) || u0Var.n()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } else if (j10.t(jVar4) || j10.t(jVar5)) {
            u0 u0Var3 = u0Var;
            return Boolean.valueOf(u0Var.n());
        } else {
            e E10 = j10.E(jVar5);
            if (E10 == null || (jVar3 = j10.U(E10)) == null) {
                jVar3 = jVar5;
            }
            d a10 = j10.a(jVar3);
            if (a10 != null) {
                iVar = j10.i0(a10);
            } else {
                iVar = null;
            }
            if (a10 == null || iVar == null) {
                u0 u0Var4 = u0Var;
            } else {
                if (j10.i(jVar5)) {
                    iVar = j10.u(iVar, true);
                } else if (j10.S(jVar5)) {
                    iVar = j10.m(iVar);
                }
                u0 u0Var5 = u0Var;
                i iVar2 = iVar;
                int i10 = a.f63012b[u0Var.g(jVar4, a10).ordinal()];
                if (i10 == 1) {
                    return Boolean.valueOf(v(f63009a, u0Var, jVar, iVar2, false, 8, (Object) null));
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new C6535s();
                    }
                } else if (v(f63009a, u0Var, jVar, iVar2, false, 8, (Object) null)) {
                    return Boolean.TRUE;
                }
            }
            m b10 = j10.b(jVar5);
            if (j10.p0(b10)) {
                j10.i(jVar5);
                Iterable w02 = j10.w0(b10);
                if (!(w02 instanceof Collection) || !((Collection) w02).isEmpty()) {
                    Iterator it = w02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!v(f63009a, u0Var, jVar, (i) it.next(), false, 8, (Object) null)) {
                            break;
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = true;
                return Boolean.valueOf(z10);
            }
            m b11 = j10.b(jVar4);
            if (!(jVar4 instanceof d)) {
                if (j10.p0(b11)) {
                    Iterable w03 = j10.w0(b11);
                    if (!(w03 instanceof Collection) || !((Collection) w03).isEmpty()) {
                        Iterator it2 = w03.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!(((i) it2.next()) instanceof d)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                return null;
            }
            n o10 = f63009a.o(u0Var.j(), jVar5, jVar4);
            if (o10 != null && j10.Y(o10, j10.b(jVar5))) {
                return Boolean.TRUE;
            }
            return null;
        }
    }

    private final List i(u0 u0Var, j jVar, m mVar) {
        u0.c cVar;
        j jVar2 = jVar;
        m mVar2 = mVar;
        o j10 = u0Var.j();
        List X10 = j10.X(jVar2, mVar2);
        if (X10 != null) {
            return X10;
        }
        if (!j10.r0(mVar2) && j10.k0(jVar2)) {
            return C6565s.n();
        }
        if (!j10.o0(mVar2)) {
            Pg.k kVar = new Pg.k();
            u0Var.k();
            ArrayDeque h10 = u0Var.h();
            C6496s.e(h10);
            Set i10 = u0Var.i();
            C6496s.e(i10);
            h10.push(jVar2);
            while (!h10.isEmpty()) {
                if (i10.size() <= 1000) {
                    j jVar3 = (j) h10.pop();
                    C6496s.e(jVar3);
                    if (i10.add(jVar3)) {
                        j s02 = j10.s0(jVar3, b.FOR_SUBTYPING);
                        if (s02 == null) {
                            s02 = jVar3;
                        }
                        if (j10.F(j10.b(s02), mVar2)) {
                            kVar.add(s02);
                            cVar = u0.c.C0933c.f63071a;
                        } else if (j10.t0(s02) == 0) {
                            cVar = u0.c.b.f63070a;
                        } else {
                            cVar = u0Var.j().H(s02);
                        }
                        if (C6496s.c(cVar, u0.c.C0933c.f63071a)) {
                            cVar = null;
                        }
                        if (cVar != null) {
                            o j11 = u0Var.j();
                            for (i a10 : j11.w0(j11.b(jVar3))) {
                                h10.add(cVar.a(u0Var, a10));
                            }
                        }
                    }
                    u0 u0Var2 = u0Var;
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + jVar2 + ". Supertypes = " + C6565s.x0(i10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)).toString());
                }
            }
            u0 u0Var3 = u0Var;
            u0Var.e();
            return kVar;
        } else if (!j10.F(j10.b(jVar2), mVar2)) {
            return C6565s.n();
        } else {
            j s03 = j10.s0(jVar2, b.FOR_SUBTYPING);
            if (s03 != null) {
                jVar2 = s03;
            }
            return C6565s.e(jVar2);
        }
    }

    private final List j(u0 u0Var, j jVar, m mVar) {
        return A(u0Var, i(u0Var, jVar, mVar));
    }

    private final boolean k(u0 u0Var, i iVar, i iVar2, boolean z10) {
        o j10 = u0Var.j();
        i o10 = u0Var.o(u0Var.p(iVar));
        i o11 = u0Var.o(u0Var.p(iVar2));
        C5371g gVar = f63009a;
        Boolean h10 = gVar.h(u0Var, j10.v0(o10), j10.k(o11));
        if (h10 != null) {
            boolean booleanValue = h10.booleanValue();
            u0Var.c(o10, o11, z10);
            return booleanValue;
        }
        Boolean c10 = u0Var.c(o10, o11, z10);
        if (c10 != null) {
            return c10.booleanValue();
        }
        return gVar.w(u0Var, j10.v0(o10), j10.k(o11));
    }

    private final n o(o oVar, i iVar, i iVar2) {
        i E02;
        boolean z10;
        int t02 = oVar.t0(iVar);
        int i10 = 0;
        while (true) {
            l lVar = null;
            if (i10 >= t02) {
                return null;
            }
            l M10 = oVar.M(iVar, i10);
            if (!oVar.j(M10)) {
                lVar = M10;
            }
            if (!(lVar == null || (E02 = oVar.E0(lVar)) == null)) {
                if (!oVar.K(oVar.u0(oVar.v0(E02))) || !oVar.K(oVar.u0(oVar.v0(iVar2)))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!C6496s.c(E02, iVar2) && (!z10 || !C6496s.c(oVar.J(E02), oVar.J(iVar2)))) {
                    n o10 = o(oVar, E02, iVar2);
                    if (o10 != null) {
                        return o10;
                    }
                }
            }
            i10++;
        }
        return oVar.q(oVar.J(iVar), i10);
    }

    private final boolean p(u0 u0Var, j jVar) {
        u0.c cVar;
        o j10 = u0Var.j();
        m b10 = j10.b(jVar);
        if (j10.r0(b10)) {
            return j10.C0(b10);
        }
        if (j10.C0(j10.b(jVar))) {
            return true;
        }
        u0Var.k();
        ArrayDeque h10 = u0Var.h();
        C6496s.e(h10);
        Set i10 = u0Var.i();
        C6496s.e(i10);
        h10.push(jVar);
        while (!h10.isEmpty()) {
            if (i10.size() <= 1000) {
                j jVar2 = (j) h10.pop();
                C6496s.e(jVar2);
                if (i10.add(jVar2)) {
                    if (j10.k0(jVar2)) {
                        cVar = u0.c.C0933c.f63071a;
                    } else {
                        cVar = u0.c.b.f63070a;
                    }
                    if (C6496s.c(cVar, u0.c.C0933c.f63071a)) {
                        cVar = null;
                    }
                    if (cVar == null) {
                        continue;
                    } else {
                        o j11 = u0Var.j();
                        for (i a10 : j11.w0(j11.b(jVar2))) {
                            j a11 = cVar.a(u0Var, a10);
                            if (j10.C0(j10.b(a11))) {
                                u0Var.e();
                                return true;
                            }
                            h10.add(a11);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar + ". Supertypes = " + C6565s.x0(i10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)).toString());
            }
        }
        u0Var.e();
        return false;
    }

    private final boolean q(o oVar, i iVar) {
        if (!oVar.q0(oVar.J(iVar)) || oVar.L(iVar) || oVar.S(iVar) || oVar.z0(iVar) || oVar.e0(iVar)) {
            return false;
        }
        return true;
    }

    private final boolean r(o oVar, j jVar, j jVar2) {
        j jVar3;
        j jVar4;
        e E10 = oVar.E(jVar);
        if (E10 == null || (jVar3 = oVar.U(E10)) == null) {
            jVar3 = jVar;
        }
        e E11 = oVar.E(jVar2);
        if (E11 == null || (jVar4 = oVar.U(E11)) == null) {
            jVar4 = jVar2;
        }
        if (oVar.b(jVar3) != oVar.b(jVar4)) {
            return false;
        }
        if (!oVar.S(jVar) && oVar.S(jVar2)) {
            return false;
        }
        if (!oVar.i(jVar) || oVar.i(jVar2)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean v(C5371g gVar, u0 u0Var, i iVar, i iVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return gVar.u(u0Var, iVar, iVar2, z10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean w(Fg.u0 r18, Jg.j r19, Jg.j r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            Jg.o r3 = r18.j()
            boolean r4 = f63010b
            if (r4 == 0) goto L_0x002c
            boolean r4 = r3.g(r1)
            if (r4 != 0) goto L_0x0022
            Jg.m r4 = r3.b(r1)
            boolean r4 = r3.p0(r4)
            if (r4 != 0) goto L_0x0022
            boolean r4 = r18.l(r19)
        L_0x0022:
            boolean r4 = r3.g(r2)
            if (r4 != 0) goto L_0x002c
            boolean r4 = r0.l(r2)
        L_0x002c:
            Fg.c r4 = Fg.C5363c.f62993a
            boolean r4 = r4.d(r0, r1, r2)
            r5 = 0
            if (r4 != 0) goto L_0x0036
            return r5
        L_0x0036:
            Fg.g r4 = f63009a
            Jg.j r6 = r3.v0(r1)
            Jg.j r7 = r3.k(r2)
            java.lang.Boolean r6 = r4.c(r0, r6, r7)
            if (r6 == 0) goto L_0x0057
            boolean r6 = r6.booleanValue()
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            Fg.u0.d(r0, r1, r2, r3, r4, r5)
            return r6
        L_0x0057:
            Jg.m r6 = r3.b(r2)
            Jg.m r7 = r3.b(r1)
            boolean r7 = r3.F(r7, r6)
            r8 = 1
            if (r7 == 0) goto L_0x006d
            int r7 = r3.A0(r6)
            if (r7 != 0) goto L_0x006d
            return r8
        L_0x006d:
            Jg.m r7 = r3.b(r2)
            boolean r7 = r3.C(r7)
            if (r7 == 0) goto L_0x0078
            return r8
        L_0x0078:
            java.util.List r4 = r4.n(r0, r1, r6)
            int r7 = r4.size()
            r9 = 10
            if (r7 <= r8) goto L_0x00bf
            Jg.o r7 = r18.j()
            boolean r11 = r7 instanceof Jg.q
            if (r11 == 0) goto L_0x008f
            Jg.q r7 = (Jg.q) r7
            goto L_0x0090
        L_0x008f:
            r7 = 0
        L_0x0090:
            if (r7 == 0) goto L_0x00bf
            boolean r7 = r7.I()
            if (r7 != r8) goto L_0x00bf
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x00a3:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00ea
            java.lang.Object r11 = r4.next()
            Jg.j r11 = (Jg.j) r11
            Jg.i r12 = r0.o(r11)
            Jg.j r12 = r3.f(r12)
            if (r12 != 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r11 = r12
        L_0x00bb:
            r7.add(r11)
            goto L_0x00a3
        L_0x00bf:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = mf.C6565s.y(r4, r9)
            r7.<init>(r11)
            java.util.Iterator r4 = r4.iterator()
        L_0x00ce:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00ea
            java.lang.Object r11 = r4.next()
            Jg.j r11 = (Jg.j) r11
            Jg.i r12 = r0.o(r11)
            Jg.j r12 = r3.f(r12)
            if (r12 != 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r11 = r12
        L_0x00e6:
            r7.add(r11)
            goto L_0x00ce
        L_0x00ea:
            int r4 = r7.size()
            if (r4 == 0) goto L_0x01b7
            if (r4 == r8) goto L_0x01a6
            Jg.a r4 = new Jg.a
            int r11 = r3.A0(r6)
            r4.<init>(r11)
            int r11 = r3.A0(r6)
            r12 = r5
            r13 = r12
        L_0x0101:
            if (r12 >= r11) goto L_0x0190
            if (r13 != 0) goto L_0x0114
            Jg.n r13 = r3.q(r6, r12)
            Jg.s r13 = r3.P(r13)
            Jg.s r14 = Jg.s.OUT
            if (r13 == r14) goto L_0x0112
            goto L_0x0114
        L_0x0112:
            r13 = r5
            goto L_0x0115
        L_0x0114:
            r13 = r8
        L_0x0115:
            if (r13 != 0) goto L_0x0188
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = mf.C6565s.y(r7, r9)
            r14.<init>(r15)
            java.util.Iterator r15 = r7.iterator()
        L_0x0124:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x017d
            java.lang.Object r16 = r15.next()
            r5 = r16
            Jg.j r5 = (Jg.j) r5
            Jg.l r9 = r3.V(r5, r12)
            if (r9 == 0) goto L_0x0152
            Jg.s r10 = r3.D0(r9)
            Jg.s r8 = Jg.s.INV
            if (r10 != r8) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r9 = 0
        L_0x0142:
            if (r9 == 0) goto L_0x0152
            Jg.i r8 = r3.E0(r9)
            if (r8 == 0) goto L_0x0152
            r14.add(r8)
            r5 = 0
            r8 = 1
            r9 = 10
            goto L_0x0124
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Incorrect type: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ", subType: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ", superType: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017d:
            Jg.i r5 = r3.D(r14)
            Jg.l r5 = r3.W(r5)
            r4.add(r5)
        L_0x0188:
            int r12 = r12 + 1
            r5 = 0
            r8 = 1
            r9 = 10
            goto L_0x0101
        L_0x0190:
            if (r13 != 0) goto L_0x019c
            Fg.g r1 = f63009a
            boolean r1 = r1.s(r0, r4, r2)
            if (r1 == 0) goto L_0x019c
            r1 = 1
            return r1
        L_0x019c:
            Fg.e r1 = new Fg.e
            r1.<init>(r7, r0, r3, r2)
            boolean r0 = r0.q(r1)
            return r0
        L_0x01a6:
            Fg.g r1 = f63009a
            java.lang.Object r4 = mf.C6565s.n0(r7)
            Jg.j r4 = (Jg.j) r4
            Jg.k r3 = r3.x0(r4)
            boolean r0 = r1.s(r0, r3, r2)
            return r0
        L_0x01b7:
            Fg.g r2 = f63009a
            boolean r0 = r2.p(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fg.C5371g.w(Fg.u0, Jg.j, Jg.j):boolean");
    }

    /* access modifiers changed from: private */
    public static final C6514M x(Collection collection, u0 u0Var, o oVar, j jVar, u0.a aVar) {
        C6496s.h(aVar, "$this$runForkingPoint");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aVar.a(new C5369f(u0Var, oVar, (j) it.next(), jVar));
        }
        return C6514M.f71813a;
    }

    /* access modifiers changed from: private */
    public static final boolean y(u0 u0Var, o oVar, j jVar, j jVar2) {
        return f63009a.s(u0Var, oVar.x0(jVar), jVar2);
    }

    private final boolean z(o oVar, i iVar, i iVar2, m mVar) {
        j f10 = oVar.f(iVar);
        if (f10 instanceof d) {
            d dVar = (d) f10;
            if (oVar.c0(dVar) || !oVar.j(oVar.n0(oVar.s(dVar))) || oVar.h0(dVar) != b.FOR_SUBTYPING) {
                return false;
            }
            oVar.J(iVar2);
        }
        return false;
    }

    public final s l(s sVar, s sVar2) {
        C6496s.h(sVar, "declared");
        C6496s.h(sVar2, "useSite");
        s sVar3 = s.INV;
        if (sVar == sVar3) {
            return sVar2;
        }
        if (sVar2 == sVar3 || sVar == sVar2) {
            return sVar;
        }
        return null;
    }

    public final boolean m(u0 u0Var, i iVar, i iVar2) {
        C6496s.h(u0Var, "state");
        C6496s.h(iVar, "a");
        C6496s.h(iVar2, "b");
        o j10 = u0Var.j();
        if (iVar == iVar2) {
            return true;
        }
        C5371g gVar = f63009a;
        if (gVar.q(j10, iVar) && gVar.q(j10, iVar2)) {
            i o10 = u0Var.o(u0Var.p(iVar));
            i o11 = u0Var.o(u0Var.p(iVar2));
            j v02 = j10.v0(o10);
            if (!j10.F(j10.J(o10), j10.J(o11))) {
                return false;
            }
            if (j10.t0(v02) == 0) {
                if (j10.F0(o10) || j10.F0(o11) || j10.i(v02) == j10.i(j10.v0(o11))) {
                    return true;
                }
                return false;
            }
        }
        if (!v(gVar, u0Var, iVar, iVar2, false, 8, (Object) null) || !v(gVar, u0Var, iVar2, iVar, false, 8, (Object) null)) {
            return false;
        }
        return true;
    }

    public final List n(u0 u0Var, j jVar, m mVar) {
        u0.c cVar;
        u0 u0Var2 = u0Var;
        j jVar2 = jVar;
        m mVar2 = mVar;
        C6496s.h(u0Var2, "state");
        C6496s.h(jVar2, "subType");
        C6496s.h(mVar2, "superConstructor");
        o j10 = u0Var.j();
        if (j10.k0(jVar2)) {
            return f63009a.j(u0Var2, jVar2, mVar2);
        }
        if (!j10.r0(mVar2) && !j10.T(mVar2)) {
            return f63009a.i(u0Var2, jVar2, mVar2);
        }
        Pg.k<j> kVar = new Pg.k();
        u0Var.k();
        ArrayDeque h10 = u0Var.h();
        C6496s.e(h10);
        Set i10 = u0Var.i();
        C6496s.e(i10);
        h10.push(jVar2);
        while (!h10.isEmpty()) {
            if (i10.size() <= 1000) {
                j jVar3 = (j) h10.pop();
                C6496s.e(jVar3);
                if (i10.add(jVar3)) {
                    if (j10.k0(jVar3)) {
                        kVar.add(jVar3);
                        cVar = u0.c.C0933c.f63071a;
                    } else {
                        cVar = u0.c.b.f63070a;
                    }
                    if (C6496s.c(cVar, u0.c.C0933c.f63071a)) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        o j11 = u0Var.j();
                        for (i a10 : j11.w0(j11.b(jVar3))) {
                            h10.add(cVar.a(u0Var2, a10));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + jVar2 + ". Supertypes = " + C6565s.x0(i10, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 63, (Object) null)).toString());
            }
        }
        u0Var.e();
        ArrayList arrayList = new ArrayList();
        for (j jVar4 : kVar) {
            C5371g gVar = f63009a;
            C6496s.e(jVar4);
            C6565s.D(arrayList, gVar.j(u0Var2, jVar4, mVar2));
        }
        return arrayList;
    }

    public final boolean s(u0 u0Var, k kVar, j jVar) {
        boolean z10;
        u0 u0Var2 = u0Var;
        k kVar2 = kVar;
        j jVar2 = jVar;
        C6496s.h(u0Var2, "<this>");
        C6496s.h(kVar2, "capturedSubArguments");
        C6496s.h(jVar2, "superType");
        o j10 = u0Var.j();
        m b10 = j10.b(jVar2);
        int N10 = j10.N(kVar2);
        int A02 = j10.A0(b10);
        if (N10 != A02 || N10 != j10.t0(jVar2)) {
            return false;
        }
        for (int i10 = 0; i10 < A02; i10++) {
            l M10 = j10.M(jVar2, i10);
            if (!j10.j(M10)) {
                i E02 = j10.E0(M10);
                l y10 = j10.y(kVar2, i10);
                j10.D0(y10);
                s sVar = s.INV;
                i E03 = j10.E0(y10);
                C5371g gVar = f63009a;
                s l10 = gVar.l(j10.P(j10.q(b10, i10)), j10.D0(M10));
                if (l10 == null) {
                    return u0Var.m();
                }
                if (l10 != sVar || (!gVar.z(j10, E03, E02, b10) && !gVar.z(j10, E02, E03, b10))) {
                    if (u0Var.f63060g <= 100) {
                        u0Var2.f63060g = u0Var.f63060g + 1;
                        int i11 = a.f63011a[l10.ordinal()];
                        if (i11 == 1) {
                            z10 = gVar.m(u0Var2, E03, E02);
                        } else if (i11 == 2) {
                            z10 = v(gVar, u0Var, E03, E02, false, 8, (Object) null);
                        } else if (i11 == 3) {
                            z10 = v(gVar, u0Var, E02, E03, false, 8, (Object) null);
                        } else {
                            throw new C6535s();
                        }
                        u0Var2.f63060g = u0Var.f63060g - 1;
                        if (!z10) {
                            return false;
                        }
                    } else {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + E03).toString());
                    }
                }
            }
        }
        return true;
    }

    public final boolean t(u0 u0Var, i iVar, i iVar2) {
        C6496s.h(u0Var, "state");
        C6496s.h(iVar, "subType");
        C6496s.h(iVar2, "superType");
        return v(this, u0Var, iVar, iVar2, false, 8, (Object) null);
    }

    public final boolean u(u0 u0Var, i iVar, i iVar2, boolean z10) {
        C6496s.h(u0Var, "state");
        C6496s.h(iVar, "subType");
        C6496s.h(iVar2, "superType");
        if (iVar == iVar2) {
            return true;
        }
        if (!u0Var.f(iVar, iVar2)) {
            return false;
        }
        return k(u0Var, iVar, iVar2, z10);
    }
}
