package com.bugsnag.android;

import K4.k;
import L4.d;

/* renamed from: com.bugsnag.android.n  reason: case insensitive filesystem */
public final class C3258n extends C3234f {

    /* renamed from: j  reason: collision with root package name */
    private Number f38782j;

    /* renamed from: k  reason: collision with root package name */
    private Number f38783k;

    /* renamed from: l  reason: collision with root package name */
    private Boolean f38784l;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f38785m;

    public C3258n(String str, String str2, String str3, String str4, String str5, d dVar, String str6, Number number, Number number2, Number number3, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, dVar, str6, number);
        this.f38782j = number2;
        this.f38783k = number3;
        this.f38784l = bool;
        this.f38785m = bool2;
    }

    public void i(K0 k02) {
        super.i(k02);
        k02.y("duration").h0(this.f38782j);
        k02.y("durationInForeground").h0(this.f38783k);
        k02.y("inForeground").g0(this.f38784l);
        k02.y("isLaunching").g0(this.f38785m);
    }

    public final Number j() {
        return this.f38782j;
    }

    public final Number k() {
        return this.f38783k;
    }

    public final Boolean l() {
        return this.f38784l;
    }

    public final Boolean m() {
        return this.f38785m;
    }

    public C3258n(k kVar, String str, String str2, String str3, String str4, String str5, Number number, Number number2, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, str5, kVar.h(), kVar.c(), kVar.I(), number, number2, bool, bool2);
    }
}
