package com.bugsnag.android;

import com.bugsnag.android.K0;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bugsnag.android.k0  reason: case insensitive filesystem */
public class C3250k0 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private final C3256m0 f38755a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f38756b;

    C3250k0(C3256m0 m0Var, S0 s02) {
        this.f38755a = m0Var;
        this.f38756b = s02;
    }

    static List a(Throwable th2, Collection collection, S0 s02) {
        return C3256m0.f38773e.a(th2, collection, s02);
    }

    private void f(String str) {
        S0 s02 = this.f38756b;
        s02.f("Invalid null value supplied to error." + str + ", ignoring");
    }

    public String b() {
        return this.f38755a.a();
    }

    public String c() {
        return this.f38755a.b();
    }

    public List d() {
        return this.f38755a.c();
    }

    public ErrorType e() {
        return this.f38755a.d();
    }

    public void g(String str) {
        if (str != null) {
            this.f38755a.e(str);
        } else {
            f("errorClass");
        }
    }

    public void h(String str) {
        this.f38755a.f(str);
    }

    public void i(ErrorType errorType) {
        if (errorType != null) {
            this.f38755a.g(errorType);
        } else {
            f("type");
        }
    }

    public void toStream(K0 k02) {
        this.f38755a.toStream(k02);
    }
}
