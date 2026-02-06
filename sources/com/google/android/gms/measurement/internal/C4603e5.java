package com.google.android.gms.measurement.internal;

import Ea.e;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.e5  reason: case insensitive filesystem */
final class C4603e5 {

    /* renamed from: a  reason: collision with root package name */
    private final e f55058a;

    /* renamed from: b  reason: collision with root package name */
    private long f55059b;

    public C4603e5(e eVar) {
        C4536s.l(eVar);
        this.f55058a = eVar;
    }

    public final void a() {
        this.f55059b = 0;
    }

    public final boolean b(long j10) {
        if (this.f55059b != 0 && this.f55058a.a() - this.f55059b < 3600000) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.f55059b = this.f55058a.a();
    }
}
