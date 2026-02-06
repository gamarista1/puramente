package com.bugsnag.android;

import K4.q;
import java.io.File;
import yf.C6787a;

public final class V0 implements C6787a {

    /* renamed from: a  reason: collision with root package name */
    private final File f38613a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38614b;

    /* renamed from: c  reason: collision with root package name */
    private final S0 f38615c;

    /* renamed from: d  reason: collision with root package name */
    private C3262o0 f38616d;

    public V0(File file, String str, S0 s02) {
        this.f38613a = file;
        this.f38614b = str;
        this.f38615c = s02;
    }

    private final C3262o0 e() {
        return new C3262o0(new C3272t(this.f38615c).g(q.f32402a.c(this.f38613a), this.f38614b), this.f38615c);
    }

    public final void a() {
        this.f38616d = null;
    }

    public final C3262o0 b() {
        return this.f38616d;
    }

    /* renamed from: c */
    public C3262o0 invoke() {
        C3262o0 o0Var = this.f38616d;
        if (o0Var != null) {
            return o0Var;
        }
        C3262o0 e10 = e();
        this.f38616d = e10;
        return e10;
    }
}
