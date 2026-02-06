package Gg;

import Fg.B0;
import Fg.J0;
import Fg.N0;
import Fg.S;
import Fg.v0;
import Fg.w0;
import Lg.c;
import Of.C5495m;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import qg.n;
import sg.C6721e;

public abstract class A {
    private static final S a(S s10) {
        return (S) c.b(s10).d();
    }

    private static final String b(v0 v0Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + v0Var, sb2);
        c("hashCode: " + v0Var.hashCode(), sb2);
        c("javaClass: " + v0Var.getClass().getCanonicalName(), sb2);
        for (C5495m o10 = v0Var.o(); o10 != null; o10 = o10.b()) {
            c("fqName: " + n.f72699h.O(o10), sb2);
            c("javaClass: " + o10.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        C6496s.h(str, "<this>");
        sb2.append(str);
        C6496s.g(sb2, "append(...)");
        sb2.append(10);
        C6496s.g(sb2, "append(...)");
        return sb2;
    }

    public static final S d(S s10, S s11, x xVar) {
        C6496s.h(s10, "subtype");
        C6496s.h(s11, "supertype");
        C6496s.h(xVar, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new u(s10, (u) null));
        v0 N02 = s11.N0();
        while (!arrayDeque.isEmpty()) {
            u uVar = (u) arrayDeque.poll();
            S b10 = uVar.b();
            v0 N03 = b10.N0();
            if (xVar.a(N03, N02)) {
                boolean O02 = b10.O0();
                for (u a10 = uVar.a(); a10 != null; a10 = a10.a()) {
                    S b11 = a10.b();
                    Iterable L02 = b11.L0();
                    if (!(L02 instanceof Collection) || !((Collection) L02).isEmpty()) {
                        Iterator it = L02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            N0 b12 = ((B0) it.next()).b();
                            N0 n02 = N0.INVARIANT;
                            if (b12 != n02) {
                                S n10 = C6721e.h(w0.f63074c.a(b11), false, 1, (Object) null).c().n(b10, n02);
                                C6496s.g(n10, "safeSubstitute(...)");
                                b10 = a(n10);
                                break;
                            }
                        }
                    }
                    b10 = w0.f63074c.a(b11).c().n(b10, N0.INVARIANT);
                    C6496s.e(b10);
                    if (O02 || b11.O0()) {
                        O02 = true;
                    } else {
                        O02 = false;
                    }
                }
                v0 N04 = b10.N0();
                if (xVar.a(N04, N02)) {
                    return J0.p(b10, O02);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(N04) + ", \n\nsupertype: " + b(N02) + " \n" + xVar.a(N04, N02));
            }
            for (S s12 : N03.l()) {
                C6496s.e(s12);
                arrayDeque.add(new u(s12, uVar));
            }
        }
        return null;
    }
}
