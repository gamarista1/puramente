package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4536s;
import java.util.concurrent.Callable;

final class u5 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f55368a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ q5 f55369b;

    u5(q5 q5Var, E5 e52) {
        this.f55368a = e52;
        this.f55369b = q5Var;
    }

    public final /* synthetic */ Object call() {
        if (!this.f55369b.N((String) C4536s.l(this.f55368a.f54557a)).B() || !C4622h3.q(this.f55368a.f54578v).B()) {
            this.f55369b.zzj().F().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        Z1 e10 = this.f55369b.e(this.f55368a);
        if (e10 != null) {
            return e10.m();
        }
        this.f55369b.zzj().G().a("App info was null when attempting to get app instance id");
        return null;
    }
}
