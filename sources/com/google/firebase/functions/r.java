package com.google.firebase.functions;

import com.google.firebase.functions.q;
import fc.b;
import fc.d;
import javax.inject.Provider;
import ub.p;

public final class r implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f57260a;

    public r(Provider provider) {
        this.f57260a = provider;
    }

    public static String a(p pVar) {
        return (String) d.d(q.b.a(pVar));
    }

    public static r b(Provider provider) {
        return new r(provider);
    }

    /* renamed from: c */
    public String get() {
        return a((p) this.f57260a.get());
    }
}
