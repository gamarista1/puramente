package Hc;

import kotlin.jvm.internal.C6496s;

/* renamed from: Hc.b  reason: case insensitive filesystem */
public final class C4299b {

    /* renamed from: a  reason: collision with root package name */
    private final String f50962a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50963b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50964c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50965d;

    /* renamed from: e  reason: collision with root package name */
    private final t f50966e;

    /* renamed from: f  reason: collision with root package name */
    private final C4298a f50967f;

    public C4299b(String str, String str2, String str3, String str4, t tVar, C4298a aVar) {
        C6496s.h(str, "appId");
        C6496s.h(str2, "deviceModel");
        C6496s.h(str3, "sessionSdkVersion");
        C6496s.h(str4, "osVersion");
        C6496s.h(tVar, "logEnvironment");
        C6496s.h(aVar, "androidAppInfo");
        this.f50962a = str;
        this.f50963b = str2;
        this.f50964c = str3;
        this.f50965d = str4;
        this.f50966e = tVar;
        this.f50967f = aVar;
    }

    public final C4298a a() {
        return this.f50967f;
    }

    public final String b() {
        return this.f50962a;
    }

    public final String c() {
        return this.f50963b;
    }

    public final t d() {
        return this.f50966e;
    }

    public final String e() {
        return this.f50965d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4299b)) {
            return false;
        }
        C4299b bVar = (C4299b) obj;
        if (C6496s.c(this.f50962a, bVar.f50962a) && C6496s.c(this.f50963b, bVar.f50963b) && C6496s.c(this.f50964c, bVar.f50964c) && C6496s.c(this.f50965d, bVar.f50965d) && this.f50966e == bVar.f50966e && C6496s.c(this.f50967f, bVar.f50967f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f50964c;
    }

    public int hashCode() {
        return (((((((((this.f50962a.hashCode() * 31) + this.f50963b.hashCode()) * 31) + this.f50964c.hashCode()) * 31) + this.f50965d.hashCode()) * 31) + this.f50966e.hashCode()) * 31) + this.f50967f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f50962a + ", deviceModel=" + this.f50963b + ", sessionSdkVersion=" + this.f50964c + ", osVersion=" + this.f50965d + ", logEnvironment=" + this.f50966e + ", androidAppInfo=" + this.f50967f + ')';
    }
}
