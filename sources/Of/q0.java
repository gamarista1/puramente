package Of;

import Fg.S;
import Fg.v0;
import Rg.h;
import Rg.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import vg.C6755e;

public abstract class q0 {
    public static final X d(S s10) {
        C5491i iVar;
        C6496s.h(s10, "<this>");
        C5490h o10 = s10.N0().o();
        if (o10 instanceof C5491i) {
            iVar = (C5491i) o10;
        } else {
            iVar = null;
        }
        return e(s10, iVar, 0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [Of.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final Of.X e(Fg.S r5, Of.C5491i r6, int r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x005a
            boolean r1 = Hg.l.m(r6)
            if (r1 == 0) goto L_0x000a
            goto L_0x005a
        L_0x000a:
            java.util.List r1 = r6.q()
            int r1 = r1.size()
            int r1 = r1 + r7
            boolean r2 = r6.A()
            if (r2 != 0) goto L_0x003d
            java.util.List r2 = r5.L0()
            int r2 = r2.size()
            if (r1 == r2) goto L_0x0027
            boolean r1 = rg.C6691i.E(r6)
        L_0x0027:
            Of.X r1 = new Of.X
            java.util.List r2 = r5.L0()
            java.util.List r5 = r5.L0()
            int r5 = r5.size()
            java.util.List r5 = r2.subList(r7, r5)
            r1.<init>(r6, r5, r0)
            return r1
        L_0x003d:
            java.util.List r2 = r5.L0()
            java.util.List r7 = r2.subList(r7, r1)
            Of.X r2 = new Of.X
            Of.m r3 = r6.b()
            boolean r4 = r3 instanceof Of.C5491i
            if (r4 == 0) goto L_0x0052
            r0 = r3
            Of.i r0 = (Of.C5491i) r0
        L_0x0052:
            Of.X r5 = e(r5, r0, r1)
            r2.<init>(r6, r7, r5)
            return r2
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Of.q0.e(Fg.S, Of.i, int):Of.X");
    }

    private static final C5485c f(m0 m0Var, C5495m mVar, int i10) {
        return new C5485c(m0Var, mVar, i10);
    }

    public static final List g(C5491i iVar) {
        List list;
        Object obj;
        v0 l10;
        C6496s.h(iVar, "<this>");
        List q10 = iVar.q();
        C6496s.g(q10, "getDeclaredTypeParameters(...)");
        if (!iVar.A() && !(iVar.b() instanceof C5483a)) {
            return q10;
        }
        List G10 = k.G(k.s(k.o(k.E(C6755e.u(iVar), n0.f64501a), o0.f64502a), p0.f64503a));
        Iterator it = C6755e.u(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof C5487e) {
                break;
            }
        }
        C5487e eVar = (C5487e) obj;
        if (!(eVar == null || (l10 = eVar.l()) == null)) {
            list = l10.getParameters();
        }
        if (list == null) {
            list = C6565s.n();
        }
        if (!G10.isEmpty() || !list.isEmpty()) {
            Iterable<m0> K02 = C6565s.K0(G10, list);
            ArrayList arrayList = new ArrayList(C6565s.y(K02, 10));
            for (m0 m0Var : K02) {
                C6496s.e(m0Var);
                arrayList.add(f(m0Var, iVar, q10.size()));
            }
            return C6565s.K0(q10, arrayList);
        }
        List q11 = iVar.q();
        C6496s.g(q11, "getDeclaredTypeParameters(...)");
        return q11;
    }

    /* access modifiers changed from: private */
    public static final boolean h(C5495m mVar) {
        C6496s.h(mVar, "it");
        return mVar instanceof C5483a;
    }

    /* access modifiers changed from: private */
    public static final boolean i(C5495m mVar) {
        C6496s.h(mVar, "it");
        return !(mVar instanceof C5494l);
    }

    /* access modifiers changed from: private */
    public static final h j(C5495m mVar) {
        C6496s.h(mVar, "it");
        List typeParameters = ((C5483a) mVar).getTypeParameters();
        C6496s.g(typeParameters, "getTypeParameters(...)");
        return C6565s.b0(typeParameters);
    }
}
