package com.google.android.gms.measurement.internal;

import com.revenuecat.purchases.common.Constants;

final class U1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f54871a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f54872b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Object f54873c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f54874d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f54875e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ V1 f54876f;

    U1(V1 v12, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f54871a = i10;
        this.f54872b = str;
        this.f54873c = obj;
        this.f54874d = obj2;
        this.f54875e = obj3;
        this.f54876f = v12;
    }

    public final void run() {
        C4614g2 A10 = this.f54876f.f55074a.A();
        if (!A10.n()) {
            this.f54876f.t(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f54876f.f54890c == 0) {
            if (this.f54876f.a().R()) {
                this.f54876f.f54890c = 'C';
            } else {
                this.f54876f.f54890c = 'c';
            }
        }
        if (this.f54876f.f54891d < 0) {
            this.f54876f.f54891d = 97001;
        }
        String str = "2" + "01VDIWEA?".charAt(this.f54871a) + this.f54876f.f54890c + this.f54876f.f54891d + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + V1.s(true, this.f54872b, this.f54873c, this.f54874d, this.f54875e);
        if (str.length() > 1024) {
            str = this.f54872b.substring(0, 1024);
        }
        C4642k2 k2Var = A10.f55092f;
        if (k2Var != null) {
            k2Var.b(str, 1);
        }
    }
}
