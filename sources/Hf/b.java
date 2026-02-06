package Hf;

import Ff.d;
import Ff.e;
import Ff.p;
import If.Y0;
import kotlin.jvm.internal.C6496s;

public abstract class b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: Ff.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: Ff.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: Of.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: Of.e} */
    /* JADX WARNING: type inference failed for: r3v5, types: [Of.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Ff.d a(Ff.e r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C6496s.h(r5, r0)
            boolean r0 = r5 instanceof Ff.d
            if (r0 == 0) goto L_0x000c
            Ff.d r5 = (Ff.d) r5
            goto L_0x0071
        L_0x000c:
            boolean r0 = r5 instanceof Ff.q
            if (r0 == 0) goto L_0x0072
            Ff.q r5 = (Ff.q) r5
            java.util.List r5 = r5.getUpperBounds()
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001d:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r0.next()
            r3 = r1
            Ff.p r3 = (Ff.p) r3
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl"
            kotlin.jvm.internal.C6496s.f(r3, r4)
            If.U0 r3 = (If.U0) r3
            Fg.S r3 = r3.A()
            Fg.v0 r3 = r3.N0()
            Of.h r3 = r3.o()
            boolean r4 = r3 instanceof Of.C5487e
            if (r4 == 0) goto L_0x0045
            r2 = r3
            Of.e r2 = (Of.C5487e) r2
        L_0x0045:
            if (r2 == 0) goto L_0x001d
            Of.f r3 = r2.h()
            Of.f r4 = Of.C5488f.INTERFACE
            if (r3 == r4) goto L_0x001d
            Of.f r2 = r2.h()
            Of.f r3 = Of.C5488f.ANNOTATION_CLASS
            if (r2 == r3) goto L_0x001d
            r2 = r1
        L_0x0058:
            Ff.p r2 = (Ff.p) r2
            if (r2 != 0) goto L_0x0063
            java.lang.Object r5 = mf.C6565s.q0(r5)
            r2 = r5
            Ff.p r2 = (Ff.p) r2
        L_0x0063:
            if (r2 == 0) goto L_0x006b
            Ff.d r5 = b(r2)
            if (r5 != 0) goto L_0x0071
        L_0x006b:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            Ff.d r5 = kotlin.jvm.internal.O.b(r5)
        L_0x0071:
            return r5
        L_0x0072:
            If.Y0 r0 = new If.Y0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot calculate JVM erasure for type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.b.a(Ff.e):Ff.d");
    }

    public static final d b(p pVar) {
        d a10;
        C6496s.h(pVar, "<this>");
        e b10 = pVar.b();
        if (b10 != null && (a10 = a(b10)) != null) {
            return a10;
        }
        throw new Y0("Cannot calculate JVM erasure for type: " + pVar);
    }
}
