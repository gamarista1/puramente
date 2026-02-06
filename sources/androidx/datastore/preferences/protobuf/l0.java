package androidx.datastore.preferences.protobuf;

abstract class l0 {
    l0() {
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Object obj, int i10, int i11);

    /* access modifiers changed from: package-private */
    public abstract void b(Object obj, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, int i10, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, int i10, C1734g gVar);

    /* access modifiers changed from: package-private */
    public abstract void e(Object obj, int i10, long j10);

    /* access modifiers changed from: package-private */
    public abstract Object f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object g(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int h(Object obj);

    /* access modifiers changed from: package-private */
    public abstract int i(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* access modifiers changed from: package-private */
    public abstract Object k(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.Object r3, androidx.datastore.preferences.protobuf.d0 r4) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.E()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l0.l(java.lang.Object, androidx.datastore.preferences.protobuf.d0):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean m(Object obj, d0 d0Var) {
        int m10 = d0Var.m();
        int a10 = r0.a(m10);
        int b10 = r0.b(m10);
        if (b10 == 0) {
            e(obj, a10, d0Var.M());
            return true;
        } else if (b10 == 1) {
            b(obj, a10, d0Var.b());
            return true;
        } else if (b10 == 2) {
            d(obj, a10, d0Var.p());
            return true;
        } else if (b10 == 3) {
            Object n10 = n();
            int c10 = r0.c(a10, 4);
            l(n10, d0Var);
            if (c10 == d0Var.m()) {
                c(obj, a10, r(n10));
                return true;
            }
            throw C1752z.a();
        } else if (b10 == 4) {
            return false;
        } else {
            if (b10 == 5) {
                a(obj, a10, d0Var.x());
                return true;
            }
            throw C1752z.d();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract Object n();

    /* access modifiers changed from: package-private */
    public abstract void o(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract void p(Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public abstract boolean q(d0 d0Var);

    /* access modifiers changed from: package-private */
    public abstract Object r(Object obj);

    /* access modifiers changed from: package-private */
    public abstract void s(Object obj, s0 s0Var);

    /* access modifiers changed from: package-private */
    public abstract void t(Object obj, s0 s0Var);
}
