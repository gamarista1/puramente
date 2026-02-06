package com.amazon.a.b;

import android.app.Application;
import com.amazon.a.a.n.b;
import com.amazon.a.a.n.b.d;
import com.amazon.a.a.o.b.f;
import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.security.PublicKey;
import java.util.Date;
import java.util.Map;

public class a extends com.amazon.a.a.n.a.a {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37572b = new c("VerifyApplicationEntitlmentTask");

    /* renamed from: c  reason: collision with root package name */
    private f f37573c = new f();
    @com.amazon.a.a.k.a

    /* renamed from: d  reason: collision with root package name */
    private com.amazon.a.a.h.c f37574d;
    @com.amazon.a.a.k.a

    /* renamed from: e  reason: collision with root package name */
    private Application f37575e;
    @com.amazon.a.a.k.a

    /* renamed from: f  reason: collision with root package name */
    private b f37576f;
    @com.amazon.a.a.k.a

    /* renamed from: g  reason: collision with root package name */
    private com.amazon.a.a.m.c f37577g;
    @com.amazon.a.a.k.a

    /* renamed from: h  reason: collision with root package name */
    private com.amazon.a.a.o.b.b f37578h;

    /* access modifiers changed from: protected */
    public void a(j jVar) {
        g gVar = new g(jVar.b());
        b a10 = a(gVar, this.f37578h.a());
        if (a10 != null) {
            a(gVar, a10);
            a(a10);
            this.f37574d.a(new com.amazon.a.b.b.a());
            this.f37576f.a(d.BACKGROUND, new i());
        }
    }

    /* access modifiers changed from: protected */
    public String a_() {
        return "get_license";
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
        if (this.f37577g.a(com.amazon.a.a.m.c.f37297b) == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b(com.amazon.a.a.d.b bVar) {
        com.amazon.a.a.i.c a10 = this.f37573c.a(bVar);
        if (a10 == null && c.f37535b) {
            c cVar = f37572b;
            cVar.b("No mapping specified for exception: " + bVar, bVar);
        }
        this.f37577g.a(com.amazon.a.a.m.c.f37298c, a10);
        this.f37577g.a(com.amazon.a.a.m.c.f37299d, bVar.getClass().getName());
    }

    private b a(g gVar, PublicKey publicKey) {
        return new b(new f(gVar.c(), publicKey));
    }

    private void a(b bVar) {
        f37572b.a("License Verification succeeded!");
        this.f37577g.a(com.amazon.a.a.m.c.f37297b, (com.amazon.a.a.m.a) new com.amazon.a.a.m.a(bVar, bVar.d()) {
            public void d() {
                this.f37160a.a(d.COMMAND, new a());
            }
        });
    }

    private void a(g gVar, b bVar) {
        com.amazon.a.a.o.d.c cVar = new com.amazon.a.a.o.d.c();
        cVar.a(gVar.a(), bVar.b(), (com.amazon.a.a.o.d.b) h.CUSTOMER_ID);
        cVar.a(gVar.b(), bVar.c(), (com.amazon.a.a.o.d.b) h.DEVICE_ID);
        cVar.a(bVar.e(), this.f37575e.getPackageName(), (com.amazon.a.a.o.d.b) h.PACKAGE_NAME);
        cVar.a(bVar.d(), new Date(), (com.amazon.a.a.o.d.b) h.EXPIRATION);
        if (cVar.a()) {
            throw new com.amazon.a.b.a.a(cVar);
        }
    }

    /* access modifiers changed from: protected */
    public void a(h hVar) {
        com.amazon.a.a.i.c cVar = new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e());
        c cVar2 = f37572b;
        cVar2.a("onFailure: " + cVar);
        this.f37577g.a(com.amazon.a.a.m.c.f37298c, cVar);
    }
}
