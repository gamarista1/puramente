package com.google.firebase.functions;

import com.google.firebase.functions.s;
import fc.b;
import javax.inject.Provider;

public final class t implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f57263a;

    public t(Provider provider) {
        this.f57263a = provider;
    }

    public static t a(Provider provider) {
        return new t(provider);
    }

    public static s c(Object obj) {
        return new s((s.a) obj);
    }

    /* renamed from: b */
    public s get() {
        return c(this.f57263a.get());
    }
}
