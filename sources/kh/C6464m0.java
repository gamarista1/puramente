package kh;

/* renamed from: kh.m0  reason: case insensitive filesystem */
public abstract class C6464m0 {
    public static /* synthetic */ void c(C6464m0 m0Var, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 1) != 0) {
                i10 = m0Var.d() + 1;
            }
            m0Var.b(i10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
    }

    public abstract Object a();

    public abstract void b(int i10);

    public abstract int d();
}
