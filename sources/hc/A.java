package Hc;

import kotlin.jvm.internal.C6496s;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    private final C4306i f50905a;

    /* renamed from: b  reason: collision with root package name */
    private final D f50906b;

    /* renamed from: c  reason: collision with root package name */
    private final C4299b f50907c;

    public A(C4306i iVar, D d10, C4299b bVar) {
        C6496s.h(iVar, "eventType");
        C6496s.h(d10, "sessionData");
        C6496s.h(bVar, "applicationInfo");
        this.f50905a = iVar;
        this.f50906b = d10;
        this.f50907c = bVar;
    }

    public final C4299b a() {
        return this.f50907c;
    }

    public final C4306i b() {
        return this.f50905a;
    }

    public final D c() {
        return this.f50906b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        if (this.f50905a == a10.f50905a && C6496s.c(this.f50906b, a10.f50906b) && C6496s.c(this.f50907c, a10.f50907c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f50905a.hashCode() * 31) + this.f50906b.hashCode()) * 31) + this.f50907c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f50905a + ", sessionData=" + this.f50906b + ", applicationInfo=" + this.f50907c + ')';
    }
}
