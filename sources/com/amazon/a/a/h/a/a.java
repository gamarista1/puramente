package com.amazon.a.a.h.a;

import com.amazon.a.a.h.b;
import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class a extends com.amazon.a.a.n.a.a {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37182b = new c("SubmitMetricsTask");
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    private com.amazon.a.a.h.c f37183c;

    /* renamed from: d  reason: collision with root package name */
    private b f37184d;

    /* access modifiers changed from: protected */
    public void a(h hVar) {
    }

    /* access modifiers changed from: protected */
    public String a_() {
        return "submit_metrics";
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(this.f37184d.c());
        Iterator<com.amazon.a.a.h.a> it = this.f37184d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        hashMap.put("metrics", arrayList);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return !this.f37184d.a();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f37184d = this.f37183c.a();
        if (c.f37534a) {
            c cVar = f37182b;
            cVar.a("--------------- SUBMIT METRICS -------------------");
            cVar.a("Size: " + this.f37184d.c());
            cVar.a("--------------------------------------------------");
        }
    }

    /* access modifiers changed from: protected */
    public void a(j jVar) {
    }
}
