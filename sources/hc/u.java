package Hc;

import kotlin.jvm.internal.C6496s;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final String f51043a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51044b;

    /* renamed from: c  reason: collision with root package name */
    private final int f51045c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f51046d;

    public u(String str, int i10, int i11, boolean z10) {
        C6496s.h(str, "processName");
        this.f51043a = str;
        this.f51044b = i10;
        this.f51045c = i11;
        this.f51046d = z10;
    }

    public final int a() {
        return this.f51045c;
    }

    public final int b() {
        return this.f51044b;
    }

    public final String c() {
        return this.f51043a;
    }

    public final boolean d() {
        return this.f51046d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (C6496s.c(this.f51043a, uVar.f51043a) && this.f51044b == uVar.f51044b && this.f51045c == uVar.f51045c && this.f51046d == uVar.f51046d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f51043a.hashCode() * 31) + Integer.hashCode(this.f51044b)) * 31) + Integer.hashCode(this.f51045c)) * 31;
        boolean z10 = this.f51046d;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f51043a + ", pid=" + this.f51044b + ", importance=" + this.f51045c + ", isDefaultProcess=" + this.f51046d + ')';
    }
}
