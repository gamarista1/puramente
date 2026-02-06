package Y;

import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

public abstract class I0 extends C1517v {
    public I0(C6787a aVar) {
        super(aVar, (DefaultConstructorMarker) null);
    }

    private final G1 f(J0 j02) {
        if (j02.i()) {
            C1510r0 f10 = j02.f();
            if (f10 == null) {
                Object g10 = j02.g();
                o1 e10 = j02.e();
                if (e10 == null) {
                    e10 = p1.q();
                }
                f10 = p1.h(g10, e10);
            }
            return new O(f10);
        } else if (j02.c() != null) {
            return new E(j02.c());
        } else {
            if (j02.f() != null) {
                return new O(j02.f());
            }
            return new C1(j02.d());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: Y.E} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: Y.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: Y.C1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: Y.O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: Y.O} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r0 != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r0 == r2) goto L_0x0034;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Y.G1 b(Y.J0 r4, Y.G1 r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof Y.O
            r1 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x0047
            r1 = r5
            Y.O r1 = (Y.O) r1
            Y.r0 r5 = r1.b()
            java.lang.Object r0 = r4.d()
            r5.setValue(r0)
            goto L_0x0047
        L_0x001a:
            boolean r0 = r5 instanceof Y.C1
            if (r0 == 0) goto L_0x0036
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r4.d()
            Y.C1 r5 = (Y.C1) r5
            java.lang.Object r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r2)
            if (r0 == 0) goto L_0x0047
        L_0x0034:
            r1 = r5
            goto L_0x0047
        L_0x0036:
            boolean r0 = r5 instanceof Y.E
            if (r0 == 0) goto L_0x0047
            yf.l r0 = r4.c()
            Y.E r5 = (Y.E) r5
            yf.l r2 = r5.b()
            if (r0 != r2) goto L_0x0047
            goto L_0x0034
        L_0x0047:
            if (r1 != 0) goto L_0x004d
            Y.G1 r1 = r3.f(r4)
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.I0.b(Y.J0, Y.G1):Y.G1");
    }

    public abstract J0 c(Object obj);

    public final J0 d(Object obj) {
        return c(obj);
    }

    public final J0 e(Object obj) {
        return c(obj).h();
    }
}
