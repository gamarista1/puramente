package eg;

import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;

public abstract class p {
    private static final boolean a(r rVar) {
        x xVar;
        c f10;
        C5821B b10 = (C5821B) C6565s.R0(rVar.k());
        C5833j jVar = null;
        if (b10 != null) {
            xVar = b10.getType();
        } else {
            xVar = null;
        }
        if (xVar instanceof C5833j) {
            jVar = (C5833j) xVar;
        }
        if (jVar == null) {
            return false;
        }
        C5832i b11 = jVar.b();
        if (!(b11 instanceof C5830g) || (f10 = ((C5830g) b11).f()) == null || !C6496s.c(f10.b(), "java.lang.Object")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r0.equals("toString") != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean b(eg.r r3) {
        /*
            ng.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L_0x0033
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L_0x0025
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003b
            goto L_0x0044
        L_0x0025:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x0044
        L_0x002e:
            boolean r3 = a(r3)
            goto L_0x0045
        L_0x0033:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
        L_0x003b:
            java.util.List r3 = r3.k()
            boolean r3 = r3.isEmpty()
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.p.b(eg.r):boolean");
    }

    public static final boolean c(q qVar) {
        C6496s.h(qVar, "<this>");
        if (!qVar.Q().L() || !(qVar instanceof r) || !b((r) qVar)) {
            return false;
        }
        return true;
    }
}
