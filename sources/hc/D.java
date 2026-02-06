package Hc;

import kotlin.jvm.internal.C6496s;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final String f50930a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50931b;

    /* renamed from: c  reason: collision with root package name */
    private final int f50932c;

    /* renamed from: d  reason: collision with root package name */
    private final long f50933d;

    /* renamed from: e  reason: collision with root package name */
    private final C4302e f50934e;

    /* renamed from: f  reason: collision with root package name */
    private final String f50935f;

    /* renamed from: g  reason: collision with root package name */
    private final String f50936g;

    public D(String str, String str2, int i10, long j10, C4302e eVar, String str3, String str4) {
        C6496s.h(str, "sessionId");
        C6496s.h(str2, "firstSessionId");
        C6496s.h(eVar, "dataCollectionStatus");
        C6496s.h(str3, "firebaseInstallationId");
        C6496s.h(str4, "firebaseAuthenticationToken");
        this.f50930a = str;
        this.f50931b = str2;
        this.f50932c = i10;
        this.f50933d = j10;
        this.f50934e = eVar;
        this.f50935f = str3;
        this.f50936g = str4;
    }

    public final C4302e a() {
        return this.f50934e;
    }

    public final long b() {
        return this.f50933d;
    }

    public final String c() {
        return this.f50936g;
    }

    public final String d() {
        return this.f50935f;
    }

    public final String e() {
        return this.f50931b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (C6496s.c(this.f50930a, d10.f50930a) && C6496s.c(this.f50931b, d10.f50931b) && this.f50932c == d10.f50932c && this.f50933d == d10.f50933d && C6496s.c(this.f50934e, d10.f50934e) && C6496s.c(this.f50935f, d10.f50935f) && C6496s.c(this.f50936g, d10.f50936g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f50930a;
    }

    public final int g() {
        return this.f50932c;
    }

    public int hashCode() {
        return (((((((((((this.f50930a.hashCode() * 31) + this.f50931b.hashCode()) * 31) + Integer.hashCode(this.f50932c)) * 31) + Long.hashCode(this.f50933d)) * 31) + this.f50934e.hashCode()) * 31) + this.f50935f.hashCode()) * 31) + this.f50936g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f50930a + ", firstSessionId=" + this.f50931b + ", sessionIndex=" + this.f50932c + ", eventTimestampUs=" + this.f50933d + ", dataCollectionStatus=" + this.f50934e + ", firebaseInstallationId=" + this.f50935f + ", firebaseAuthenticationToken=" + this.f50936g + ')';
    }
}
