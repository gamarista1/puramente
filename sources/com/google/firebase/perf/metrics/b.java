package com.google.firebase.perf.metrics;

import Bc.k;
import Bc.m;
import java.util.Arrays;
import java.util.List;
import yc.C5293a;

class b {

    /* renamed from: a  reason: collision with root package name */
    private final Trace f57721a;

    b(Trace trace) {
        this.f57721a = trace;
    }

    /* access modifiers changed from: package-private */
    public m a() {
        m.b I10 = m.z0().J(this.f57721a.getName()).H(this.f57721a.g().e()).I(this.f57721a.g().d(this.f57721a.e()));
        for (a aVar : this.f57721a.d().values()) {
            I10.F(aVar.getName(), aVar.a());
        }
        List<Trace> h10 = this.f57721a.h();
        if (!h10.isEmpty()) {
            for (Trace bVar : h10) {
                I10.C(new b(bVar).a());
            }
        }
        I10.E(this.f57721a.getAttributes());
        k[] b10 = C5293a.b(this.f57721a.f());
        if (b10 != null) {
            I10.z(Arrays.asList(b10));
        }
        return (m) I10.q();
    }
}
