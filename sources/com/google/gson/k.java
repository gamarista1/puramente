package com.google.gson;

import Pc.A;
import java.util.Set;

public final class k extends h {

    /* renamed from: a  reason: collision with root package name */
    private final A f58351a = new A(false);

    public h A(String str) {
        return (h) this.f58351a.remove(str);
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof k) && ((k) obj).f58351a.equals(this.f58351a))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f58351a.hashCode();
    }

    public void r(String str, h hVar) {
        A a10 = this.f58351a;
        if (hVar == null) {
            hVar = j.f58350a;
        }
        a10.put(str, hVar);
    }

    public Set t() {
        return this.f58351a.entrySet();
    }

    public h v(String str) {
        return (h) this.f58351a.get(str);
    }

    public g x(String str) {
        return (g) this.f58351a.get(str);
    }

    public boolean z(String str) {
        return this.f58351a.containsKey(str);
    }
}
