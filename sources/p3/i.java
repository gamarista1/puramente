package P3;

import kotlin.jvm.internal.C6496s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f5062a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5063b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5064c;

    public i(String str, int i10, int i11) {
        C6496s.h(str, "workSpecId");
        this.f5062a = str;
        this.f5063b = i10;
        this.f5064c = i11;
    }

    public final int a() {
        return this.f5063b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (C6496s.c(this.f5062a, iVar.f5062a) && this.f5063b == iVar.f5063b && this.f5064c == iVar.f5064c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5062a.hashCode() * 31) + Integer.hashCode(this.f5063b)) * 31) + Integer.hashCode(this.f5064c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f5062a + ", generation=" + this.f5063b + ", systemId=" + this.f5064c + ')';
    }
}
