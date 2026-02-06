package P3;

import kotlin.jvm.internal.C6496s;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f5072a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5073b;

    public m(String str, int i10) {
        C6496s.h(str, "workSpecId");
        this.f5072a = str;
        this.f5073b = i10;
    }

    public final int a() {
        return this.f5073b;
    }

    public final String b() {
        return this.f5072a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (C6496s.c(this.f5072a, mVar.f5072a) && this.f5073b == mVar.f5073b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f5072a.hashCode() * 31) + Integer.hashCode(this.f5073b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f5072a + ", generation=" + this.f5073b + ')';
    }
}
