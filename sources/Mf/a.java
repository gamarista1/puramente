package Mf;

import Eg.n;
import Of.H;
import Qf.b;
import Sg.p;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.Y;
import ng.c;
import ng.f;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final n f64096a;

    /* renamed from: b  reason: collision with root package name */
    private final H f64097b;

    public a(n nVar, H h10) {
        C6496s.h(nVar, "storageManager");
        C6496s.h(h10, "module");
        this.f64096a = nVar;
        this.f64097b = h10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r6 = r6.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Of.C5487e a(ng.b r6) {
        /*
            r5 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.C6496s.h(r6, r0)
            boolean r0 = r6.i()
            r1 = 0
            if (r0 != 0) goto L_0x0094
            boolean r0 = r6.j()
            if (r0 == 0) goto L_0x0014
            goto L_0x0094
        L_0x0014:
            ng.c r0 = r6.g()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "asString(...)"
            kotlin.jvm.internal.C6496s.g(r0, r2)
            r2 = 0
            r3 = 2
            java.lang.String r4 = "Function"
            boolean r2 = Sg.p.O(r0, r4, r2, r3, r1)
            if (r2 != 0) goto L_0x002c
            return r1
        L_0x002c:
            ng.c r6 = r6.f()
            Mf.g$a r2 = Mf.g.f64127c
            Mf.g r2 = r2.a()
            Mf.g$b r0 = r2.c(r6, r0)
            if (r0 != 0) goto L_0x003d
            return r1
        L_0x003d:
            Mf.f r1 = r0.a()
            int r0 = r0.b()
            Of.H r2 = r5.f64097b
            Of.V r6 = r2.l0(r6)
            java.util.List r6 = r6.j0()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x005a:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r6.next()
            boolean r4 = r3 instanceof Lf.c
            if (r4 == 0) goto L_0x005a
            r2.add(r3)
            goto L_0x005a
        L_0x006c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x0075:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007f
            r3.next()
            goto L_0x0075
        L_0x007f:
            java.lang.Object r6 = mf.C6565s.q0(r6)
            android.support.v4.media.session.c.a(r6)
            java.lang.Object r6 = mf.C6565s.o0(r2)
            Lf.c r6 = (Lf.c) r6
            Mf.b r2 = new Mf.b
            Eg.n r3 = r5.f64096a
            r2.<init>(r3, r6, r1, r0)
            return r2
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Mf.a.a(ng.b):Of.e");
    }

    public Collection b(c cVar) {
        C6496s.h(cVar, "packageFqName");
        return Y.e();
    }

    public boolean c(c cVar, f fVar) {
        C6496s.h(cVar, "packageFqName");
        C6496s.h(fVar, "name");
        String b10 = fVar.b();
        C6496s.g(b10, "asString(...)");
        if ((p.J(b10, "Function", false, 2, (Object) null) || p.J(b10, "KFunction", false, 2, (Object) null) || p.J(b10, "SuspendFunction", false, 2, (Object) null) || p.J(b10, "KSuspendFunction", false, 2, (Object) null)) && g.f64127c.a().c(cVar, b10) != null) {
            return true;
        }
        return false;
    }
}
