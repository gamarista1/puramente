package com.bugsnag.android;

import com.bugsnag.android.K0;
import java.util.List;
import mf.C6565s;

public final class D1 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private String f38431a;

    /* renamed from: b  reason: collision with root package name */
    private String f38432b;

    /* renamed from: c  reason: collision with root package name */
    private ErrorType f38433c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f38434d;

    /* renamed from: e  reason: collision with root package name */
    private String f38435e;

    /* renamed from: f  reason: collision with root package name */
    private List f38436f;

    public D1(String str, String str2, ErrorType errorType, boolean z10, String str3, u1 u1Var) {
        this.f38431a = str;
        this.f38432b = str2;
        this.f38433c = errorType;
        this.f38434d = z10;
        this.f38435e = str3;
        this.f38436f = C6565s.h1(u1Var.a());
    }

    public final String a() {
        return this.f38431a;
    }

    public final String b() {
        return this.f38432b;
    }

    public final List c() {
        return this.f38436f;
    }

    public final String d() {
        return this.f38435e;
    }

    public final ErrorType e() {
        return this.f38433c;
    }

    public final boolean f() {
        return this.f38434d;
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y("id").j0(this.f38431a);
        k02.y("name").j0(this.f38432b);
        k02.y("type").j0(this.f38433c.getDesc$bugsnag_android_core_release());
        k02.y("state").j0(this.f38435e);
        k02.y("stacktrace");
        k02.f();
        for (s1 E02 : this.f38436f) {
            k02.E0(E02);
        }
        k02.q();
        if (this.f38434d) {
            k02.y("errorReportingThread").o0(true);
        }
        k02.t();
    }
}
