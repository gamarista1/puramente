package u9;

import ja.B;
import k9.L0;
import q9.C3962B;

abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected final C3962B f48692a;

    public static final class a extends L0 {
        public a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected e(C3962B b10) {
        this.f48692a = b10;
    }

    public final boolean a(B b10, long j10) {
        if (!b(b10) || !c(b10, j10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(B b10);

    /* access modifiers changed from: protected */
    public abstract boolean c(B b10, long j10);
}
