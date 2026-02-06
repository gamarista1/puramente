package com.bugsnag.android;

import K4.k;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

class F0 {

    /* renamed from: a  reason: collision with root package name */
    private final A f38480a;

    public F0(A a10) {
        this.f38480a = a10;
    }

    public Map a() {
        return this.f38480a.f38375k.f();
    }

    public C3258n b() {
        return this.f38480a.f38375k.e();
    }

    public Map c() {
        return this.f38480a.f38374j.l();
    }

    public C3244i0 d() {
        return this.f38480a.f38374j.j(new Date().getTime());
    }

    public Collection e(k kVar) {
        return kVar.A();
    }

    public List f(boolean z10) {
        return new G1((Throwable) null, z10, this.f38480a.m()).c();
    }
}
