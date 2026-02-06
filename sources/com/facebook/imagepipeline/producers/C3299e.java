package com.facebook.imagepipeline.producers;

import T5.h;
import W6.f;
import X6.C3098v;
import i7.C3593b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.producers.e  reason: case insensitive filesystem */
public class C3299e implements e0 {

    /* renamed from: n  reason: collision with root package name */
    public static final Set f39943n = h.a("id", "uri_source");

    /* renamed from: o  reason: collision with root package name */
    public static final Object f39944o = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final C3593b f39945a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39946b;

    /* renamed from: c  reason: collision with root package name */
    private final String f39947c;

    /* renamed from: d  reason: collision with root package name */
    private final g0 f39948d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39949e;

    /* renamed from: f  reason: collision with root package name */
    private final C3593b.c f39950f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f39951g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f39952h;

    /* renamed from: i  reason: collision with root package name */
    private f f39953i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f39954j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f39955k;

    /* renamed from: l  reason: collision with root package name */
    private final List f39956l;

    /* renamed from: m  reason: collision with root package name */
    private final C3098v f39957m;

    public C3299e(C3593b bVar, String str, g0 g0Var, Object obj, C3593b.c cVar, boolean z10, boolean z11, f fVar, C3098v vVar) {
        this(bVar, str, (String) null, (Map) null, g0Var, obj, cVar, z10, z11, fVar, vVar);
    }

    public static void c(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((f0) it.next()).b();
            }
        }
    }

    public static void g(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((f0) it.next()).a();
            }
        }
    }

    public static void h(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((f0) it.next()).d();
            }
        }
    }

    public static void i(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((f0) it.next()).c();
            }
        }
    }

    public synchronized boolean E() {
        return this.f39954j;
    }

    public C3593b F() {
        return this.f39945a;
    }

    public void I(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                t((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public synchronized boolean M() {
        return this.f39952h;
    }

    public Object Q(String str) {
        return this.f39951g.get(str);
    }

    public C3593b.c T() {
        return this.f39950f;
    }

    public Object a() {
        return this.f39949e;
    }

    public void b(f0 f0Var) {
        boolean z10;
        synchronized (this) {
            this.f39956l.add(f0Var);
            z10 = this.f39955k;
        }
        if (z10) {
            f0Var.b();
        }
    }

    public C3098v f() {
        return this.f39957m;
    }

    public Map getExtras() {
        return this.f39951g;
    }

    public String getId() {
        return this.f39946b;
    }

    public void j() {
        c(k());
    }

    public synchronized List k() {
        if (this.f39955k) {
            return null;
        }
        this.f39955k = true;
        return new ArrayList(this.f39956l);
    }

    public synchronized List l(boolean z10) {
        if (z10 == this.f39954j) {
            return null;
        }
        this.f39954j = z10;
        return new ArrayList(this.f39956l);
    }

    public synchronized List m(boolean z10) {
        if (z10 == this.f39952h) {
            return null;
        }
        this.f39952h = z10;
        return new ArrayList(this.f39956l);
    }

    public void n(String str, String str2) {
        this.f39951g.put("origin", str);
        this.f39951g.put("origin_sub", str2);
    }

    public String o() {
        return this.f39947c;
    }

    public synchronized f q() {
        return this.f39953i;
    }

    public synchronized List r(f fVar) {
        if (fVar == this.f39953i) {
            return null;
        }
        this.f39953i = fVar;
        return new ArrayList(this.f39956l);
    }

    public void t(String str, Object obj) {
        if (!f39943n.contains(str)) {
            this.f39951g.put(str, obj);
        }
    }

    public void v(String str) {
        n(str, "default");
    }

    public g0 y() {
        return this.f39948d;
    }

    public C3299e(C3593b bVar, String str, String str2, Map map, g0 g0Var, Object obj, C3593b.c cVar, boolean z10, boolean z11, f fVar, C3098v vVar) {
        this.f39945a = bVar;
        this.f39946b = str;
        HashMap hashMap = new HashMap();
        this.f39951g = hashMap;
        hashMap.put("id", str);
        hashMap.put("uri_source", bVar == null ? "null-request" : bVar.v());
        I(map);
        this.f39947c = str2;
        this.f39948d = g0Var;
        this.f39949e = obj == null ? f39944o : obj;
        this.f39950f = cVar;
        this.f39952h = z10;
        this.f39953i = fVar;
        this.f39954j = z11;
        this.f39955k = false;
        this.f39956l = new ArrayList();
        this.f39957m = vVar;
    }
}
