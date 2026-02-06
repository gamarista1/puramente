package com.amazon.a.b;

import com.amazon.a.a.i.e;
import com.amazon.a.a.i.g;
import com.amazon.a.a.n.c.a;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final com.amazon.a.a.o.c f37589a = new com.amazon.a.a.o.c("LicenseKillTask");
    @com.amazon.a.a.k.a

    /* renamed from: b  reason: collision with root package name */
    private com.amazon.a.a.m.c f37590b;
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    private e f37591c;

    private boolean b() {
        return this.f37590b.b(com.amazon.a.a.m.c.f37297b);
    }

    private com.amazon.a.a.i.c c() {
        com.amazon.a.a.i.c cVar = (com.amazon.a.a.i.c) this.f37590b.a(com.amazon.a.a.m.c.f37298c);
        if (cVar == null) {
            return e.f37597e;
        }
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar2 = f37589a;
            cVar2.a("Fetched failure content from store: " + cVar);
        }
        this.f37590b.c(com.amazon.a.a.m.c.f37298c);
        return cVar;
    }

    public void a() {
        if (com.amazon.a.a.o.c.f37534a) {
            f37589a.a("License Kill Task Executing!!!");
        }
        if (b()) {
            f37589a.c("license verification succeeded");
            return;
        }
        if (com.amazon.a.a.o.c.f37534a) {
            f37589a.a("License Kill Task determined app is not licensed, killing app");
        }
        if (m()) {
            n();
        }
        this.f37591c.a(new g(c()));
    }
}
