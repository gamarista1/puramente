package com.bugsnag.android;

import K4.k;
import L4.d;
import com.bugsnag.android.K0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* renamed from: com.bugsnag.android.f  reason: case insensitive filesystem */
public class C3234f implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private String f38699a;

    /* renamed from: b  reason: collision with root package name */
    private String f38700b;

    /* renamed from: c  reason: collision with root package name */
    private String f38701c;

    /* renamed from: d  reason: collision with root package name */
    private String f38702d;

    /* renamed from: e  reason: collision with root package name */
    private String f38703e;

    /* renamed from: f  reason: collision with root package name */
    private String f38704f;

    /* renamed from: g  reason: collision with root package name */
    private Number f38705g;

    /* renamed from: h  reason: collision with root package name */
    private d f38706h;

    /* renamed from: i  reason: collision with root package name */
    private String f38707i;

    public C3234f(String str, String str2, String str3, String str4, String str5, d dVar, String str6, Number number) {
        this.f38699a = str;
        this.f38700b = str2;
        this.f38701c = str3;
        this.f38702d = str4;
        this.f38703e = str5;
        this.f38704f = str6;
        this.f38705g = number;
        this.f38706h = dVar;
    }

    public final String a() {
        return this.f38699a;
    }

    public final String b() {
        String str = this.f38707i;
        if (str != null) {
            return str;
        }
        d dVar = this.f38706h;
        if (dVar == null) {
            return null;
        }
        return (String) dVar.a();
    }

    public final String c() {
        return this.f38703e;
    }

    public final String d() {
        return this.f38700b;
    }

    public final String e() {
        return this.f38701c;
    }

    public final String f() {
        return this.f38704f;
    }

    public final String g() {
        return this.f38702d;
    }

    public final Number h() {
        return this.f38705g;
    }

    public void i(K0 k02) {
        k02.y("binaryArch").j0(this.f38699a);
        k02.y("buildUUID").j0(b());
        k02.y("codeBundleId").j0(this.f38703e);
        k02.y("id").j0(this.f38700b);
        k02.y("releaseStage").j0(this.f38701c);
        k02.y("type").j0(this.f38704f);
        k02.y(DiagnosticsEntry.VERSION_KEY).j0(this.f38702d);
        k02.y("versionCode").h0(this.f38705g);
    }

    public void toStream(K0 k02) {
        k02.n();
        i(k02);
        k02.t();
    }

    public C3234f(k kVar, String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, kVar.h(), kVar.c(), kVar.I());
    }
}
