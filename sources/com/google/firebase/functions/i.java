package com.google.firebase.functions;

import fc.b;
import ic.C5026a;
import ic.C5027b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f57204a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f57205b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f57206c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f57207d;

    public i(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f57204a = provider;
        this.f57205b = provider2;
        this.f57206c = provider3;
        this.f57207d = provider4;
    }

    public static i a(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new i(provider, provider2, provider3, provider4);
    }

    public static h c(C5027b bVar, C5027b bVar2, C5026a aVar, Executor executor) {
        return new h(bVar, bVar2, aVar, executor);
    }

    /* renamed from: b */
    public h get() {
        return c((C5027b) this.f57204a.get(), (C5027b) this.f57205b.get(), (C5026a) this.f57206c.get(), (Executor) this.f57207d.get());
    }
}
