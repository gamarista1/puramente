package com.facebook.hermes.intl;

import B7.a;
import M6.b;
import M6.d;
import M6.i;
import com.facebook.hermes.intl.a;
import com.facebook.hermes.intl.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@a
public class Collator {

    /* renamed from: a  reason: collision with root package name */
    private a.d f39519a;

    /* renamed from: b  reason: collision with root package name */
    private a.c f39520b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39521c;

    /* renamed from: d  reason: collision with root package name */
    private String f39522d = "default";

    /* renamed from: e  reason: collision with root package name */
    private boolean f39523e;

    /* renamed from: f  reason: collision with root package name */
    private a.b f39524f;

    /* renamed from: g  reason: collision with root package name */
    private b f39525g;

    /* renamed from: h  reason: collision with root package name */
    private b f39526h;

    /* renamed from: i  reason: collision with root package name */
    private a f39527i = new h();

    @B7.a
    public Collator(List<String> list, Map<String, Object> map) {
        a(list, map);
        this.f39527i.d(this.f39525g).f(this.f39523e).e(this.f39524f).g(this.f39520b).c(this.f39521c);
    }

    private void a(List list, Map map) {
        g.a aVar = g.a.STRING;
        this.f39519a = (a.d) g.d(a.d.class, d.h(g.c(map, "usage", aVar, M6.a.f32609e, "sort")));
        Object q10 = d.q();
        d.c(q10, "localeMatcher", g.c(map, "localeMatcher", aVar, M6.a.f32605a, "best fit"));
        Object c10 = g.c(map, "numeric", g.a.BOOLEAN, d.d(), d.d());
        if (!d.n(c10)) {
            c10 = d.r(String.valueOf(d.e(c10)));
        }
        d.c(q10, "kn", c10);
        d.c(q10, "kf", g.c(map, "caseFirst", aVar, M6.a.f32608d, d.d()));
        HashMap a10 = f.a(list, q10, Arrays.asList(new String[]{"co", "kf", "kn"}));
        b bVar = (b) d.g(a10).get("locale");
        this.f39525g = bVar;
        this.f39526h = bVar.d();
        Object a11 = d.a(a10, "co");
        if (d.j(a11)) {
            a11 = d.r("default");
        }
        this.f39522d = d.h(a11);
        Object a12 = d.a(a10, "kn");
        if (d.j(a12)) {
            this.f39523e = false;
        } else {
            this.f39523e = Boolean.parseBoolean(d.h(a12));
        }
        Object a13 = d.a(a10, "kf");
        if (d.j(a13)) {
            a13 = d.r(com.amazon.a.a.o.b.f37476ag);
        }
        this.f39524f = (a.b) g.d(a.b.class, d.h(a13));
        if (this.f39519a == a.d.SEARCH) {
            ArrayList b10 = this.f39525g.b("collation");
            ArrayList arrayList = new ArrayList();
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                arrayList.add(i.e((String) it.next()));
            }
            arrayList.add(i.e("search"));
            this.f39525g.f("co", arrayList);
        }
        Object c11 = g.c(map, "sensitivity", g.a.STRING, M6.a.f32607c, d.d());
        if (!d.n(c11)) {
            this.f39520b = (a.c) g.d(a.c.class, d.h(c11));
        } else if (this.f39519a == a.d.SORT) {
            this.f39520b = a.c.VARIANT;
        } else {
            this.f39520b = a.c.LOCALE;
        }
        this.f39521c = d.e(g.c(map, "ignorePunctuation", g.a.BOOLEAN, d.d(), Boolean.FALSE));
    }

    @B7.a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        if (d.h(g.c(map, "localeMatcher", g.a.STRING, M6.a.f32605a, "best fit")).equals("best fit")) {
            return Arrays.asList(e.d((String[]) list.toArray(new String[list.size()])));
        }
        return Arrays.asList(e.h((String[]) list.toArray(new String[list.size()])));
    }

    @B7.a
    public double compare(String str, String str2) {
        return (double) this.f39527i.a(str, str2);
    }

    @B7.a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f39526h.g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f39519a.toString());
        a.c cVar = this.f39520b;
        if (cVar == a.c.LOCALE) {
            linkedHashMap.put("sensitivity", this.f39527i.b().toString());
        } else {
            linkedHashMap.put("sensitivity", cVar.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f39521c));
        linkedHashMap.put("collation", this.f39522d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f39523e));
        linkedHashMap.put("caseFirst", this.f39524f.toString());
        return linkedHashMap;
    }
}
