package Mf;

import Fg.C5366d0;
import Fg.G0;
import Fg.N0;
import Fg.S;
import Mg.t;
import Of.C5484b;
import Of.C5495m;
import Of.C5501t;
import Of.C5507z;
import Of.E;
import Of.c0;
import Of.h0;
import Of.m0;
import Of.t0;
import Pf.h;
import Rf.C5529s;
import Rf.O;
import Rf.V;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import mf.I;
import ng.f;

public final class e extends O {

    /* renamed from: E  reason: collision with root package name */
    public static final a f64118E = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final t0 b(e eVar, int i10, m0 m0Var) {
            String str;
            String b10 = m0Var.getName().b();
            C6496s.g(b10, "asString(...)");
            if (C6496s.c(b10, "T")) {
                str = "instance";
            } else if (C6496s.c(b10, "E")) {
                str = "receiver";
            } else {
                str = b10.toLowerCase(Locale.ROOT);
                C6496s.g(str, "toLowerCase(...)");
            }
            h b11 = h.f64602L.b();
            f i11 = f.i(str);
            C6496s.g(i11, "identifier(...)");
            C5366d0 p10 = m0Var.p();
            C6496s.g(p10, "getDefaultType(...)");
            h0 h0Var = h0.f64497a;
            C6496s.g(h0Var, "NO_SOURCE");
            return new V(eVar, (t0) null, i10, b11, i11, p10, false, false, false, (S) null, h0Var);
        }

        public final e a(b bVar, boolean z10) {
            C6496s.h(bVar, "functionClass");
            List q10 = bVar.q();
            e eVar = new e(bVar, (e) null, C5484b.a.DECLARATION, z10, (DefaultConstructorMarker) null);
            c0 J02 = bVar.J0();
            List n10 = C6565s.n();
            List n11 = C6565s.n();
            ArrayList arrayList = new ArrayList();
            for (Object next : q10) {
                if (((m0) next).n() != N0.IN_VARIANCE) {
                    break;
                }
                arrayList.add(next);
            }
            Iterable<I> m12 = C6565s.m1(arrayList);
            ArrayList arrayList2 = new ArrayList(C6565s.y(m12, 10));
            for (I i10 : m12) {
                arrayList2.add(e.f64118E.b(eVar, i10.c(), (m0) i10.d()));
            }
            eVar.R0((c0) null, J02, n10, n11, arrayList2, ((m0) C6565s.z0(q10)).p(), E.ABSTRACT, C5501t.f64509e);
            eVar.Z0(true);
            return eVar;
        }

        private a() {
        }
    }

    public /* synthetic */ e(C5495m mVar, e eVar, C5484b.a aVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, eVar, aVar, z10);
    }

    private final C5507z p1(List list) {
        f fVar;
        int size = k().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List k10 = k();
            C6496s.g(k10, "getValueParameters(...)");
            Iterable<Pair> n12 = C6565s.n1(list, k10);
            if (!(n12 instanceof Collection) || !((Collection) n12).isEmpty()) {
                for (Pair pair : n12) {
                    if (!C6496s.c((f) pair.a(), ((t0) pair.b()).getName())) {
                    }
                }
            }
            return this;
        }
        List k11 = k();
        C6496s.g(k11, "getValueParameters(...)");
        Iterable<t0> iterable = k11;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (t0 t0Var : iterable) {
            f name = t0Var.getName();
            C6496s.g(name, "getName(...)");
            int index = t0Var.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (fVar = (f) list.get(i10)) != null) {
                name = fVar;
            }
            arrayList.add(t0Var.T(this, name, index));
        }
        C5529s.c S02 = S0(G0.f62929b);
        Iterable iterable2 = list;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it = iterable2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((f) it.next()) == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            C5529s.c O10 = S02.H(z10).h(arrayList).y(a());
            C6496s.g(O10, "setOriginal(...)");
            C5507z M02 = super.M0(O10);
            C6496s.e(M02);
            return M02;
        }
        z10 = false;
        C5529s.c O102 = S02.H(z10).h(arrayList).y(a());
        C6496s.g(O102, "setOriginal(...)");
        C5507z M022 = super.M0(O102);
        C6496s.e(M022);
        return M022;
    }

    public boolean D() {
        return false;
    }

    /* access modifiers changed from: protected */
    public C5529s L0(C5495m mVar, C5507z zVar, C5484b.a aVar, f fVar, h hVar, h0 h0Var) {
        C6496s.h(mVar, "newOwner");
        C6496s.h(aVar, "kind");
        C6496s.h(hVar, "annotations");
        C6496s.h(h0Var, "source");
        return new e(mVar, (e) zVar, aVar, isSuspend());
    }

    /* access modifiers changed from: protected */
    public C5507z M0(C5529s.c cVar) {
        C6496s.h(cVar, "configuration");
        e eVar = (e) super.M0(cVar);
        if (eVar == null) {
            return null;
        }
        List k10 = eVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        Iterable<t0> iterable = k10;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return eVar;
        }
        for (t0 type : iterable) {
            S type2 = type.getType();
            C6496s.g(type2, "getType(...)");
            if (Lf.h.d(type2) != null) {
                List k11 = eVar.k();
                C6496s.g(k11, "getValueParameters(...)");
                Iterable<t0> iterable2 = k11;
                ArrayList arrayList = new ArrayList(C6565s.y(iterable2, 10));
                for (t0 type3 : iterable2) {
                    S type4 = type3.getType();
                    C6496s.g(type4, "getType(...)");
                    arrayList.add(Lf.h.d(type4));
                }
                return eVar.p1(arrayList);
            }
        }
        return eVar;
    }

    public boolean isExternal() {
        return false;
    }

    public boolean isInline() {
        return false;
    }

    private e(C5495m mVar, e eVar, C5484b.a aVar, boolean z10) {
        super(mVar, eVar, h.f64602L.b(), t.f64217i, aVar, h0.f64497a);
        f1(true);
        h1(z10);
        Y0(false);
    }
}
