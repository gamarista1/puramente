package Jg;

import sf.C6714a;

public enum s {
    IN("in"),
    OUT("out"),
    INV("");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f63847a;

    static {
        s[] a10;
        f63846f = C6714a.a(a10);
    }

    private s(String str) {
        this.f63847a = str;
    }

    public String toString() {
        return this.f63847a;
    }
}
