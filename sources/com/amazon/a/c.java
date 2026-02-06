package com.amazon.a;

import com.amazon.a.a.i.e;
import com.amazon.a.a.i.g;
import com.amazon.a.a.n.a.a;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.Map;

public class c extends a {

    /* renamed from: b  reason: collision with root package name */
    private static final com.amazon.a.a.o.c f37623b = new com.amazon.a.a.o.c("CheckIfAppisBlockedTask");
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    private e f37624c;

    /* access modifiers changed from: protected */
    public void a(j jVar) {
        if (jVar.b() != null && jVar.b().containsKey("verbose")) {
            boolean booleanValue = ((Boolean) jVar.b().get("verbose")).booleanValue();
            com.amazon.a.a.o.c.f37535b = booleanValue;
            com.amazon.a.a.o.c.f37534a = booleanValue;
        }
    }

    /* access modifiers changed from: protected */
    public String a_() {
        return "check_blocked_status";
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(h hVar) {
        if (m()) {
            n();
        }
        f37623b.c("app is blocked, killing");
        this.f37624c.a(new g(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e())));
    }
}
