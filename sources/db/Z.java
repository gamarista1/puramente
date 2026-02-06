package Db;

import com.google.android.gms.common.api.internal.C4491c;

final class Z implements C4491c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4252a0 f50485a;

    Z(C4252a0 a0Var) {
        this.f50485a = a0Var;
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f50485a.f50488c = true;
            this.f50485a.b();
            return;
        }
        this.f50485a.f50488c = false;
        if (this.f50485a.f()) {
            this.f50485a.f50487b.c();
        }
    }
}
