package F2;

import f2.C1961B;
import i2.C2073A;
import z2.O;

abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected final O f2153a;

    public static final class a extends C1961B {
        public a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected e(O o10) {
        this.f2153a = o10;
    }

    public final boolean a(C2073A a10, long j10) {
        if (!b(a10) || !c(a10, j10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(C2073A a10);

    /* access modifiers changed from: protected */
    public abstract boolean c(C2073A a10, long j10);
}
