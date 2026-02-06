package Hc;

import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: Hc.a  reason: case insensitive filesystem */
public final class C4298a {

    /* renamed from: a  reason: collision with root package name */
    private final String f50956a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50957b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50958c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50959d;

    /* renamed from: e  reason: collision with root package name */
    private final u f50960e;

    /* renamed from: f  reason: collision with root package name */
    private final List f50961f;

    public C4298a(String str, String str2, String str3, String str4, u uVar, List list) {
        C6496s.h(str, "packageName");
        C6496s.h(str2, "versionName");
        C6496s.h(str3, "appBuildVersion");
        C6496s.h(str4, "deviceManufacturer");
        C6496s.h(uVar, "currentProcessDetails");
        C6496s.h(list, "appProcessDetails");
        this.f50956a = str;
        this.f50957b = str2;
        this.f50958c = str3;
        this.f50959d = str4;
        this.f50960e = uVar;
        this.f50961f = list;
    }

    public final String a() {
        return this.f50958c;
    }

    public final List b() {
        return this.f50961f;
    }

    public final u c() {
        return this.f50960e;
    }

    public final String d() {
        return this.f50959d;
    }

    public final String e() {
        return this.f50956a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4298a)) {
            return false;
        }
        C4298a aVar = (C4298a) obj;
        if (C6496s.c(this.f50956a, aVar.f50956a) && C6496s.c(this.f50957b, aVar.f50957b) && C6496s.c(this.f50958c, aVar.f50958c) && C6496s.c(this.f50959d, aVar.f50959d) && C6496s.c(this.f50960e, aVar.f50960e) && C6496s.c(this.f50961f, aVar.f50961f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f50957b;
    }

    public int hashCode() {
        return (((((((((this.f50956a.hashCode() * 31) + this.f50957b.hashCode()) * 31) + this.f50958c.hashCode()) * 31) + this.f50959d.hashCode()) * 31) + this.f50960e.hashCode()) * 31) + this.f50961f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f50956a + ", versionName=" + this.f50957b + ", appBuildVersion=" + this.f50958c + ", deviceManufacturer=" + this.f50959d + ", currentProcessDetails=" + this.f50960e + ", appProcessDetails=" + this.f50961f + ')';
    }
}
