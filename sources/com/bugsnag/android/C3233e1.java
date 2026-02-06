package com.bugsnag.android;

import com.bugsnag.android.K0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;

/* renamed from: com.bugsnag.android.e1  reason: case insensitive filesystem */
public final class C3233e1 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private String f38695a;

    /* renamed from: b  reason: collision with root package name */
    private String f38696b;

    /* renamed from: c  reason: collision with root package name */
    private String f38697c;

    /* renamed from: d  reason: collision with root package name */
    private List f38698d;

    public C3233e1(String str, String str2, String str3) {
        this.f38695a = str;
        this.f38696b = str2;
        this.f38697c = str3;
        this.f38698d = C6565s.n();
    }

    public final List a() {
        return this.f38698d;
    }

    public final String b() {
        return this.f38695a;
    }

    public final String c() {
        return this.f38697c;
    }

    public final String d() {
        return this.f38696b;
    }

    public final void e(List list) {
        this.f38698d = list;
    }

    public final void f(String str) {
        this.f38695a = str;
    }

    public final void g(String str) {
        this.f38697c = str;
    }

    public final void h(String str) {
        this.f38696b = str;
    }

    public void toStream(K0 k02) {
        k02.n();
        k02.y("name").j0(this.f38695a);
        k02.y(DiagnosticsEntry.VERSION_KEY).j0(this.f38696b);
        k02.y("url").j0(this.f38697c);
        if (!this.f38698d.isEmpty()) {
            k02.y("dependencies");
            k02.f();
            for (C3233e1 E02 : this.f38698d) {
                k02.E0(E02);
            }
            k02.q();
        }
        k02.t();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3233e1(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "Android Bugsnag Notifier" : str, (i10 & 2) != 0 ? "6.12.1" : str2, (i10 & 4) != 0 ? "https://bugsnag.com" : str3);
    }
}
