package p7;

import kotlin.jvm.internal.C6496s;

/* renamed from: p7.a  reason: case insensitive filesystem */
public final class C3936a {

    /* renamed from: a  reason: collision with root package name */
    private final String f47577a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f47578b;

    public C3936a(String str, boolean z10) {
        C6496s.h(str, "name");
        this.f47577a = str;
        this.f47578b = z10;
    }

    public final String a() {
        return this.f47577a;
    }

    public final boolean b() {
        return this.f47578b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3936a)) {
            return false;
        }
        C3936a aVar = (C3936a) obj;
        if (C6496s.c(this.f47577a, aVar.f47577a) && this.f47578b == aVar.f47578b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f47577a.hashCode() * 31;
        boolean z10 = this.f47578b;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "GateKeeper(name=" + this.f47577a + ", value=" + this.f47578b + ')';
    }
}
