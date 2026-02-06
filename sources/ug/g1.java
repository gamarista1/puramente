package Ug;

import Zg.C;
import Zg.K;
import kotlin.Pair;
import lf.C6502A;
import lf.C6514M;
import qf.C6658d;
import qf.g;

public final class g1 extends C {

    /* renamed from: e  reason: collision with root package name */
    private final ThreadLocal f65385e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g1(qf.g r3, qf.C6658d r4) {
        /*
            r2 = this;
            Ug.h1 r0 = Ug.h1.f65387a
            qf.g$b r1 = r3.b(r0)
            if (r1 != 0) goto L_0x000d
            qf.g r0 = r3.n1(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f65385e = r0
            qf.g r4 = r4.getContext()
            qf.e$b r0 = qf.e.f72642c0
            qf.g$b r4 = r4.b(r0)
            boolean r4 = r4 instanceof Ug.G
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = Zg.K.c(r3, r4)
            Zg.K.a(r3, r4)
            r2.h1(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.g1.<init>(qf.g, qf.d):void");
    }

    /* access modifiers changed from: protected */
    public void c1(Object obj) {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f65385e.get();
            if (pair != null) {
                K.a((g) pair.a(), pair.b());
            }
            this.f65385e.remove();
        }
        Object a10 = E.a(obj, this.f66946d);
        C6658d dVar = this.f66946d;
        g context = dVar.getContext();
        g1 g1Var = null;
        Object c10 = K.c(context, g1Var);
        if (c10 != K.f66954a) {
            g1Var = F.g(dVar, context, c10);
        }
        try {
            this.f66946d.resumeWith(a10);
            C6514M m10 = C6514M.f71813a;
        } finally {
            if (g1Var == null || g1Var.g1()) {
                K.a(context, c10);
            }
        }
    }

    public final boolean g1() {
        boolean z10;
        if (!this.threadLocalIsSet || this.f65385e.get() != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f65385e.remove();
        return !z10;
    }

    public final void h1(g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f65385e.set(C6502A.a(gVar, obj));
    }
}
