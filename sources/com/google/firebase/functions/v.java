package com.google.firebase.functions;

import java.util.concurrent.TimeUnit;
import rh.C6703A;

class v {

    /* renamed from: d  reason: collision with root package name */
    private static final TimeUnit f57265d = TimeUnit.SECONDS;

    /* renamed from: a  reason: collision with root package name */
    private long f57266a = 70;

    /* renamed from: b  reason: collision with root package name */
    private TimeUnit f57267b = f57265d;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f57268c = false;

    v() {
    }

    /* access modifiers changed from: package-private */
    public C6703A a(C6703A a10) {
        return a10.B().e(this.f57266a, this.f57267b).S(this.f57266a, this.f57267b).c();
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f57268c;
    }

    /* access modifiers changed from: package-private */
    public void c(long j10, TimeUnit timeUnit) {
        this.f57266a = j10;
        this.f57267b = timeUnit;
    }
}
