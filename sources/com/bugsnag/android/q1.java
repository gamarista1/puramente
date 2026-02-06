package com.bugsnag.android;

import com.bugsnag.android.K0;

final class q1 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f38832a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38833b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38834c;

    /* renamed from: d  reason: collision with root package name */
    private final Severity f38835d;

    /* renamed from: e  reason: collision with root package name */
    private Severity f38836e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38837f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f38838g;

    q1(String str, Severity severity, boolean z10, boolean z11, String str2, String str3) {
        this.f38832a = str;
        this.f38837f = z10;
        this.f38838g = z11;
        this.f38835d = severity;
        this.f38836e = severity;
        this.f38834c = str2;
        this.f38833b = str3;
    }

    static q1 h(String str) {
        return i(str, (Severity) null, (String) null);
    }

    static q1 i(String str, Severity severity, String str2) {
        if (str.equals("strictMode") && J0.a(str2)) {
            throw new IllegalArgumentException("No reason supplied for strictmode");
        } else if (str.equals("strictMode") || str.equals("log") || J0.a(str2)) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1876197364:
                    if (str.equals("strictMode")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1773746641:
                    if (str.equals("userCallbackSetSeverity")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1591166708:
                    if (str.equals("unhandledException")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1107031998:
                    if (str.equals("userSpecifiedSeverity")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -902467928:
                    if (str.equals("signal")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case -845696980:
                    if (str.equals("handledError")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case -573976797:
                    if (str.equals("anrError")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 107332:
                    if (str.equals("log")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 87505361:
                    if (str.equals("unhandledPromiseRejection")) {
                        c10 = 8;
                        break;
                    }
                    break;
                case 561970291:
                    if (str.equals("handledException")) {
                        c10 = 9;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new q1(str, Severity.WARNING, true, true, str2, "violationType");
                case 1:
                case 3:
                    return new q1(str, severity, false, false, (String) null, (String) null);
                case 2:
                case 4:
                case 6:
                case 8:
                    return new q1(str, Severity.ERROR, true, true, (String) null, (String) null);
                case 5:
                case 9:
                    return new q1(str, Severity.WARNING, false, false, (String) null, (String) null);
                case 7:
                    return new q1(str, severity, false, false, str2, "level");
                default:
                    throw new IllegalArgumentException("Invalid argument for severityReason: '" + str + '\'');
            }
        } else {
            throw new IllegalArgumentException("attributeValue should not be supplied");
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        if (this.f38835d == this.f38836e) {
            return this.f38832a;
        }
        return "userCallbackSetSeverity";
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f38833b;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f38834c;
    }

    /* access modifiers changed from: package-private */
    public Severity d() {
        return this.f38836e;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return this.f38832a;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f38837f;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        if (this.f38837f != this.f38838g) {
            return true;
        }
        return false;
    }

    public void toStream(K0 k02) {
        k02.n().y("type").j0(a()).y("unhandledOverridden").o0(g());
        if (!(this.f38833b == null || this.f38834c == null)) {
            k02.y("attributes").n().y(this.f38833b).j0(this.f38834c).t();
        }
        k02.t();
    }
}
