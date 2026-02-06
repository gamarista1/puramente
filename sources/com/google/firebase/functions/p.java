package com.google.firebase.functions;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Provider f57255a;

    /* renamed from: b  reason: collision with root package name */
    private final Provider f57256b;

    /* renamed from: c  reason: collision with root package name */
    private final Provider f57257c;

    /* renamed from: d  reason: collision with root package name */
    private final Provider f57258d;

    /* renamed from: e  reason: collision with root package name */
    private final Provider f57259e;

    public p(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f57255a = provider;
        this.f57256b = provider2;
        this.f57257c = provider3;
        this.f57258d = provider4;
        this.f57259e = provider5;
    }

    public static p a(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new p(provider, provider2, provider3, provider4, provider5);
    }

    public static n c(Context context, String str, String str2, Object obj, Executor executor, Executor executor2) {
        return new n(context, str, str2, (a) obj, executor, executor2);
    }

    public n b(String str) {
        return c((Context) this.f57255a.get(), (String) this.f57256b.get(), str, this.f57257c.get(), (Executor) this.f57258d.get(), (Executor) this.f57259e.get());
    }
}
