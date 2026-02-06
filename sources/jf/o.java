package Jf;

import Fg.C5366d0;
import Fg.F0;
import Fg.J0;
import Fg.S;
import If.Y0;
import If.j1;
import Kg.d;
import Lf.i;
import Of.C5484b;
import Of.C5487e;
import Of.C5490h;
import Of.C5494l;
import Of.C5495m;
import Of.I;
import Of.Z;
import Of.c0;
import Of.t0;
import Of.u0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mg.C6574b;
import ng.b;
import ng.f;
import rg.C6693k;
import vg.C6755e;
import xf.C6781a;
import yf.C6798l;

public abstract class o {
    private static final boolean a(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !C6781a.e(declaringClass).t();
    }

    /* access modifiers changed from: private */
    public static final void g(h hVar, int i10, C5484b bVar, boolean z10) {
        if (j.a(hVar) != i10) {
            throw new Y0("Inconsistent number of parameters in the descriptor and Java reflection object: " + j.a(hVar) + " != " + i10 + "\nCalling: " + bVar + "\nParameter types: " + hVar.a() + ")\nDefault: " + z10);
        }
    }

    public static final Object h(Object obj, C5484b bVar) {
        S l10;
        Class s10;
        Method m10;
        C6496s.h(bVar, "descriptor");
        if (((bVar instanceof Z) && C6693k.e((u0) bVar)) || (l10 = l(bVar)) == null || (s10 = s(l10)) == null || (m10 = m(s10, bVar)) == null) {
            return obj;
        }
        return m10.invoke(obj, (Object[]) null);
    }

    public static final h i(h hVar, C5484b bVar, boolean z10) {
        C6496s.h(hVar, "<this>");
        C6496s.h(bVar, "descriptor");
        if (!C6693k.a(bVar)) {
            List x02 = bVar.x0();
            C6496s.g(x02, "getContextReceiverParameters(...)");
            Iterable iterable = x02;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    S type = ((c0) it.next()).getType();
                    C6496s.g(type, "getType(...)");
                    if (C6693k.h(type)) {
                        break;
                    }
                }
            }
            List k10 = bVar.k();
            C6496s.g(k10, "getValueParameters(...)");
            Iterable iterable2 = k10;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it2 = iterable2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    S type2 = ((t0) it2.next()).getType();
                    C6496s.g(type2, "getType(...)");
                    if (C6693k.h(type2)) {
                        break;
                    }
                }
            }
            S returnType = bVar.getReturnType();
            if ((returnType == null || !C6693k.c(returnType)) && !q(bVar)) {
                return hVar;
            }
        }
        return new n(bVar, hVar, z10);
    }

    public static /* synthetic */ h j(h hVar, C5484b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(hVar, bVar, z10);
    }

    /* access modifiers changed from: private */
    public static final Method k(Class cls, C5484b bVar) {
        try {
            return cls.getDeclaredMethod("box-impl", new Class[]{m(cls, bVar).getReturnType()});
        } catch (NoSuchMethodException unused) {
            throw new Y0("No box method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    private static final S l(C5484b bVar) {
        C5487e eVar;
        c0 P10 = bVar.P();
        c0 M10 = bVar.M();
        if (P10 != null) {
            return P10.getType();
        }
        if (M10 != null) {
            if (bVar instanceof C5494l) {
                return M10.getType();
            }
            C5495m b10 = bVar.b();
            if (b10 instanceof C5487e) {
                eVar = (C5487e) b10;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return eVar.p();
            }
        }
        return null;
    }

    public static final Method m(Class cls, C5484b bVar) {
        C6496s.h(cls, "<this>");
        C6496s.h(bVar, "descriptor");
        try {
            return cls.getDeclaredMethod("unbox-impl", (Class[]) null);
        } catch (NoSuchMethodException unused) {
            throw new Y0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    public static final List n(C5366d0 d0Var) {
        C6496s.h(d0Var, "type");
        List o10 = o(F0.a(d0Var));
        if (o10 == null) {
            return null;
        }
        Iterable<String> iterable = o10;
        ArrayList<String> arrayList = new ArrayList<>(C6565s.y(iterable, 10));
        for (String str : iterable) {
            arrayList.add("unbox-impl-" + str);
        }
        C5490h o11 = d0Var.N0().o();
        C6496s.f(o11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class q10 = j1.q((C5487e) o11);
        C6496s.e(q10);
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (String declaredMethod : arrayList) {
            arrayList2.add(q10.getDeclaredMethod(declaredMethod, (Class[]) null));
        }
        return arrayList2;
    }

    private static final List o(C5366d0 d0Var) {
        List list;
        if (!C6693k.i(d0Var)) {
            return null;
        }
        C5490h o10 = d0Var.N0().o();
        C6496s.f(o10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        I t10 = C6755e.t((C5487e) o10);
        C6496s.e(t10);
        ArrayList arrayList = new ArrayList();
        for (Pair pair : t10.c()) {
            f fVar = (f) pair.a();
            Iterable o11 = o((C5366d0) pair.b());
            if (o11 != null) {
                Iterable<String> iterable = o11;
                list = new ArrayList(C6565s.y(iterable, 10));
                for (String str : iterable) {
                    list.add(fVar.e() + '-' + str);
                }
            } else {
                list = C6565s.e(fVar.e());
            }
            C6565s.D(arrayList, list);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List p(C5366d0 d0Var, C5484b bVar) {
        Method m10;
        List n10 = n(d0Var);
        if (n10 != null) {
            return n10;
        }
        Class s10 = s(d0Var);
        if (s10 == null || (m10 = m(s10, bVar)) == null) {
            return null;
        }
        return C6565s.e(m10);
    }

    private static final boolean q(C5484b bVar) {
        S l10 = l(bVar);
        if (l10 == null || !C6693k.h(l10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final List r(C5484b bVar, Member member, C6798l lVar) {
        S s10;
        ArrayList arrayList = new ArrayList();
        c0 P10 = bVar.P();
        if (P10 != null) {
            s10 = P10.getType();
        } else {
            s10 = null;
        }
        if (s10 != null) {
            arrayList.add(s10);
        } else if (bVar instanceof C5494l) {
            C5487e e02 = ((C5494l) bVar).e0();
            C6496s.g(e02, "getConstructedClass(...)");
            if (e02.A()) {
                C5495m b10 = e02.b();
                C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((C5487e) b10).p());
            }
        } else {
            C5495m b11 = bVar.b();
            C6496s.g(b11, "getContainingDeclaration(...)");
            if ((b11 instanceof C5487e) && ((Boolean) lVar.invoke(b11)).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((C5487e) b11).p());
                } else {
                    C5366d0 p10 = ((C5487e) b11).p();
                    C6496s.g(p10, "getDefaultType(...)");
                    arrayList.add(d.B(p10));
                }
            }
        }
        List<t0> k10 = bVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        for (t0 type : k10) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final Class s(S s10) {
        Class t10 = t(s10.N0().o());
        if (t10 == null) {
            return null;
        }
        if (!J0.l(s10)) {
            return t10;
        }
        S k10 = C6693k.k(s10);
        if (k10 != null && !J0.l(k10) && !i.s0(k10)) {
            return t10;
        }
        return null;
    }

    public static final Class t(C5495m mVar) {
        if (!(mVar instanceof C5487e) || !C6693k.b(mVar)) {
            return null;
        }
        C5487e eVar = (C5487e) mVar;
        Class q10 = j1.q(eVar);
        if (q10 != null) {
            return q10;
        }
        throw new Y0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + C6755e.n((C5490h) mVar) + ')');
    }

    public static final String u(C5490h hVar) {
        C6496s.h(hVar, "<this>");
        b n10 = C6755e.n(hVar);
        C6496s.e(n10);
        return C6574b.b(n10.b());
    }
}
