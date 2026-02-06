package Sg;

import kotlin.jvm.internal.C6496s;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final String f65077a;

    /* renamed from: b  reason: collision with root package name */
    private final Ef.i f65078b;

    public i(String str, Ef.i iVar) {
        C6496s.h(str, "value");
        C6496s.h(iVar, "range");
        this.f65077a = str;
        this.f65078b = iVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (C6496s.c(this.f65077a, iVar.f65077a) && C6496s.c(this.f65078b, iVar.f65078b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f65077a.hashCode() * 31) + this.f65078b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f65077a + ", range=" + this.f65078b + ')';
    }
}
