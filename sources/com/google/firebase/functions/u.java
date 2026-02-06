package com.google.firebase.functions;

import com.google.firebase.functions.s;
import fc.c;
import javax.inject.Provider;

public final class u implements s.a {

    /* renamed from: a  reason: collision with root package name */
    private final p f57264a;

    u(p pVar) {
        this.f57264a = pVar;
    }

    public static Provider b(p pVar) {
        return c.a(new u(pVar));
    }

    public n a(String str) {
        return this.f57264a.b(str);
    }
}
