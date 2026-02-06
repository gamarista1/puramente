package com.amazon.a.a.n.a;

import com.amazon.a.a.i.e;
import com.amazon.a.a.j.a;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.c;
import com.amazon.a.b.f;
import com.amazon.d.a.j;
import java.util.HashMap;
import java.util.Map;

public abstract class h extends a {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37393b = new c("KiwiCommand");

    /* renamed from: c  reason: collision with root package name */
    private final a f37394c;

    /* renamed from: d  reason: collision with root package name */
    private final String f37395d;

    /* renamed from: e  reason: collision with root package name */
    private final String f37396e;

    /* renamed from: f  reason: collision with root package name */
    private final String f37397f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Object> f37398g;

    /* renamed from: h  reason: collision with root package name */
    private final f f37399h = new f();

    /* renamed from: i  reason: collision with root package name */
    private boolean f37400i;

    /* renamed from: j  reason: collision with root package name */
    private h f37401j;

    /* renamed from: k  reason: collision with root package name */
    private h f37402k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f37403l = false;

    public h(a aVar, String str, String str2, String str3, String str4) {
        this.f37394c = aVar;
        this.f37395d = str3;
        this.f37396e = str;
        this.f37397f = str2;
        HashMap hashMap = new HashMap();
        this.f37398g = hashMap;
        hashMap.put(b.f37444B, str3);
        hashMap.put(b.f37451I, str4);
        this.f37400i = true;
        this.f37401j = null;
        this.f37402k = null;
    }

    public h a(boolean z10) {
        this.f37403l = z10;
        return this;
    }

    /* access modifiers changed from: protected */
    public String a_() {
        return this.f37396e;
    }

    /* access modifiers changed from: protected */
    public void b(com.amazon.d.a.h hVar) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(j jVar);

    /* access modifiers changed from: protected */
    public void c(com.amazon.a.a.d.b bVar) {
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return true;
    }

    public boolean i() {
        return this.f37403l;
    }

    /* access modifiers changed from: protected */
    public a j() {
        return this.f37394c;
    }

    /* access modifiers changed from: protected */
    public String k() {
        return this.f37395d;
    }

    public void l() {
        com.amazon.a.a.a((a) this);
    }

    public void a(h hVar) {
        this.f37401j = hVar;
    }

    public void b(h hVar) {
        this.f37402k = hVar;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return this.f37397f;
    }

    /* access modifiers changed from: protected */
    public void a(String str, Object obj) {
        this.f37398g.put(str, obj);
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> b() {
        return this.f37398g;
    }

    private void a(com.amazon.a.a.i.c cVar) {
        if (cVar != null) {
            com.amazon.a.a.i.a aVar = new com.amazon.a.a.i.a(cVar);
            e a10 = com.amazon.a.a.a();
            if (a10 == null) {
                f37393b.b("Prompt manager is null. Cannot show prompt dropping request");
            } else {
                a10.a(aVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(boolean z10) {
        this.f37400i = z10;
    }

    /* access modifiers changed from: protected */
    public void b(com.amazon.a.a.d.b bVar) {
        h hVar;
        if (!"UNHANDLED_EXCEPTION".equals(bVar.a()) || !b.f37477ah.equals(this.f37397f) || (hVar = this.f37402k) == null) {
            try {
                c(bVar);
            } catch (Exception e10) {
                c cVar = f37393b;
                cVar.a("Error calling onResult: " + e10);
            }
            if (this.f37400i) {
                a(this.f37399h.a(bVar));
            }
            if (!this.f37403l) {
                this.f37394c.c();
                return;
            }
            return;
        }
        hVar.a(this.f37403l);
        this.f37402k.l();
    }

    /* access modifiers changed from: protected */
    public void a(j jVar) {
        boolean z10;
        h hVar;
        String str = (String) jVar.b().get(b.f37483f);
        c cVar = f37393b;
        cVar.a("onSuccess: result = " + jVar + ", errorMessage: " + str);
        if (com.amazon.a.a.o.f.a(str)) {
            try {
                z10 = b(jVar);
            } catch (Exception e10) {
                c cVar2 = f37393b;
                cVar2.a("Error calling onResult: " + e10);
                z10 = false;
            }
            if (z10 && (hVar = this.f37401j) != null) {
                hVar.l();
            } else if (this.f37403l) {
            } else {
                if (z10) {
                    this.f37394c.b();
                } else {
                    this.f37394c.c();
                }
            }
        } else if (!this.f37403l) {
            this.f37394c.c();
        }
    }

    /* access modifiers changed from: protected */
    public void a(com.amazon.d.a.h hVar) {
        String str;
        h hVar2;
        c cVar = f37393b;
        cVar.a("onFailure: result = " + hVar);
        if (hVar == null || (str = (String) hVar.f().get(b.an)) == null || !str.equalsIgnoreCase("1.0") || (hVar2 = this.f37402k) == null) {
            try {
                b(hVar);
            } catch (Exception e10) {
                c cVar2 = f37393b;
                cVar2.a("Error calling onResult: " + e10);
            }
            if (this.f37400i) {
                a(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e()));
            }
            if (!this.f37403l) {
                this.f37394c.c();
                return;
            }
            return;
        }
        hVar2.a(this.f37403l);
        this.f37402k.l();
    }
}
