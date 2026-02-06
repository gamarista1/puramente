package com.amazon.a.a.b.b;

import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a extends com.amazon.a.a.n.a.a {

    /* renamed from: b  reason: collision with root package name */
    private static final c f37108b = new c("SubmitCrashReportsTask");
    @com.amazon.a.a.k.a

    /* renamed from: c  reason: collision with root package name */
    private com.amazon.a.a.b.a f37109c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.amazon.a.a.b.c> f37110d;

    /* access modifiers changed from: protected */
    public void a(h hVar) {
    }

    /* access modifiers changed from: protected */
    public String a_() {
        return "submit_crash_reports";
    }

    /* access modifiers changed from: protected */
    public Map<String, Object> b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (com.amazon.a.a.b.c a10 : this.f37110d) {
            arrayList.add(a10.a());
        }
        hashMap.put("reports", arrayList);
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public String c() {
        return "1.0";
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return !this.f37110d.isEmpty();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.f37110d = this.f37109c.a();
        if (c.f37534a) {
            c cVar = f37108b;
            cVar.a("--------------- Crash Reports -------------------");
            cVar.a("Size: " + this.f37110d.size());
            cVar.a("--------------------------------------------------");
        }
    }

    /* access modifiers changed from: protected */
    public void a(j jVar) {
        this.f37109c.a(this.f37110d);
    }
}
