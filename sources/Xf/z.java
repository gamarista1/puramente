package Xf;

import Fg.S;
import Kg.d;
import Lf.i;
import Of.C5483a;
import Of.C5484b;
import Of.C5487e;
import Of.C5507z;
import Of.t0;
import Xf.U;
import Zf.c;
import Zf.e;
import gg.C5943C;
import gg.C5969s;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.f;
import rg.C6692j;

public final class z implements C6692j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66409a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: type inference failed for: r6v6, types: [Of.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean b(Of.C5507z r6) {
            /*
                r5 = this;
                java.util.List r0 = r6.k()
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L_0x000d
                return r1
            L_0x000d:
                Of.m r0 = r6.b()
                boolean r3 = r0 instanceof Of.C5487e
                r4 = 0
                if (r3 == 0) goto L_0x0019
                Of.e r0 = (Of.C5487e) r0
                goto L_0x001a
            L_0x0019:
                r0 = r4
            L_0x001a:
                if (r0 != 0) goto L_0x001d
                return r1
            L_0x001d:
                java.util.List r6 = r6.k()
                java.lang.String r3 = "getValueParameters(...)"
                kotlin.jvm.internal.C6496s.g(r6, r3)
                java.lang.Object r6 = mf.C6565s.P0(r6)
                Of.t0 r6 = (Of.t0) r6
                Fg.S r6 = r6.getType()
                Fg.v0 r6 = r6.N0()
                Of.h r6 = r6.o()
                boolean r3 = r6 instanceof Of.C5487e
                if (r3 == 0) goto L_0x003f
                r4 = r6
                Of.e r4 = (Of.C5487e) r4
            L_0x003f:
                if (r4 != 0) goto L_0x0042
                return r1
            L_0x0042:
                boolean r6 = Lf.i.r0(r0)
                if (r6 == 0) goto L_0x0057
                ng.c r6 = vg.C6755e.o(r0)
                ng.c r0 = vg.C6755e.o(r4)
                boolean r6 = kotlin.jvm.internal.C6496s.c(r6, r0)
                if (r6 == 0) goto L_0x0057
                r1 = r2
            L_0x0057:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Xf.z.a.b(Of.z):boolean");
        }

        private final C5969s c(C5507z zVar, t0 t0Var) {
            if (C5943C.e(zVar) || b(zVar)) {
                S type = t0Var.getType();
                C6496s.g(type, "getType(...)");
                return C5943C.g(d.B(type));
            }
            S type2 = t0Var.getType();
            C6496s.g(type2, "getType(...)");
            return C5943C.g(type2);
        }

        public final boolean a(C5483a aVar, C5483a aVar2) {
            C6496s.h(aVar, "superDescriptor");
            C6496s.h(aVar2, "subDescriptor");
            if ((aVar2 instanceof e) && (aVar instanceof C5507z)) {
                e eVar = (e) aVar2;
                eVar.k().size();
                C5507z zVar = (C5507z) aVar;
                zVar.k().size();
                List k10 = eVar.a().k();
                C6496s.g(k10, "getValueParameters(...)");
                List k11 = zVar.a().k();
                C6496s.g(k11, "getValueParameters(...)");
                for (Pair pair : C6565s.n1(k10, k11)) {
                    t0 t0Var = (t0) pair.a();
                    t0 t0Var2 = (t0) pair.b();
                    C6496s.e(t0Var);
                    boolean z10 = c((C5507z) aVar2, t0Var) instanceof C5969s.d;
                    C6496s.e(t0Var2);
                    if (z10 != (c(zVar, t0Var2) instanceof C5969s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(C5483a aVar, C5483a aVar2, C5487e eVar) {
        C5507z zVar;
        boolean z10;
        if ((aVar instanceof C5484b) && (aVar2 instanceof C5507z) && !i.g0(aVar2)) {
            C5676i iVar = C5676i.f66378o;
            C5507z zVar2 = (C5507z) aVar2;
            f name = zVar2.getName();
            C6496s.g(name, "getName(...)");
            if (!iVar.n(name)) {
                U.a aVar3 = U.f66327a;
                f name2 = zVar2.getName();
                C6496s.g(name2, "getName(...)");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            C5484b j10 = T.j((C5484b) aVar);
            boolean z11 = aVar instanceof C5507z;
            if (z11) {
                zVar = (C5507z) aVar;
            } else {
                zVar = null;
            }
            if (zVar == null || zVar2.D0() != zVar.D0()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && (j10 == null || !zVar2.D0())) {
                return true;
            }
            if ((eVar instanceof c) && zVar2.t0() == null && j10 != null && !T.l(eVar, j10)) {
                if ((j10 instanceof C5507z) && z11 && C5676i.l((C5507z) j10) != null) {
                    String c10 = C5943C.c(zVar2, false, false, 2, (Object) null);
                    C5507z a10 = ((C5507z) aVar).a();
                    C6496s.g(a10, "getOriginal(...)");
                    if (C6496s.c(c10, C5943C.c(a10, false, false, 2, (Object) null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C6692j.b a(C5483a aVar, C5483a aVar2, C5487e eVar) {
        C6496s.h(aVar, "superDescriptor");
        C6496s.h(aVar2, "subDescriptor");
        if (c(aVar, aVar2, eVar)) {
            return C6692j.b.INCOMPATIBLE;
        }
        if (f66409a.a(aVar, aVar2)) {
            return C6692j.b.INCOMPATIBLE;
        }
        return C6692j.b.UNKNOWN;
    }

    public C6692j.a b() {
        return C6692j.a.CONFLICTS_ONLY;
    }
}
