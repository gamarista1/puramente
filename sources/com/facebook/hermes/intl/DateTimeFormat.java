package com.facebook.hermes.intl;

import B7.a;
import M6.b;
import M6.c;
import M6.d;
import M6.e;
import com.adjust.sdk.Constants;
import com.facebook.hermes.intl.b;
import com.facebook.hermes.intl.g;
import io.intercom.android.sdk.models.AttributeType;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

@a
public class DateTimeFormat {

    /* renamed from: a  reason: collision with root package name */
    b f39528a = new i();

    /* renamed from: b  reason: collision with root package name */
    private b f39529b = null;

    /* renamed from: c  reason: collision with root package name */
    private b f39530c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f39531d;

    /* renamed from: e  reason: collision with root package name */
    private String f39532e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39533f;

    /* renamed from: g  reason: collision with root package name */
    private String f39534g;

    /* renamed from: h  reason: collision with root package name */
    private Object f39535h;

    /* renamed from: i  reason: collision with root package name */
    private b.g f39536i;

    /* renamed from: j  reason: collision with root package name */
    private b.e f39537j;

    /* renamed from: k  reason: collision with root package name */
    private b.m f39538k;

    /* renamed from: l  reason: collision with root package name */
    private b.d f39539l;

    /* renamed from: m  reason: collision with root package name */
    private b.n f39540m;

    /* renamed from: n  reason: collision with root package name */
    private b.i f39541n;

    /* renamed from: o  reason: collision with root package name */
    private b.c f39542o;

    /* renamed from: p  reason: collision with root package name */
    private b.f f39543p;

    /* renamed from: q  reason: collision with root package name */
    private b.h f39544q;

    /* renamed from: r  reason: collision with root package name */
    private b.j f39545r;

    /* renamed from: s  reason: collision with root package name */
    private b.l f39546s;

    /* renamed from: t  reason: collision with root package name */
    private b.C0626b f39547t;

    /* renamed from: u  reason: collision with root package name */
    private b.k f39548u;

    /* renamed from: v  reason: collision with root package name */
    private Object f39549v = null;

    @a
    public DateTimeFormat(List<String> list, Map<String, Object> map) {
        String str;
        c(list, map);
        b bVar = this.f39528a;
        M6.b bVar2 = this.f39529b;
        String str2 = "";
        if (this.f39531d) {
            str = str2;
        } else {
            str = this.f39532e;
        }
        bVar.h(bVar2, str, !this.f39533f ? this.f39534g : str2, this.f39537j, this.f39538k, this.f39539l, this.f39540m, this.f39541n, this.f39542o, this.f39543p, this.f39544q, this.f39545r, this.f39546s, this.f39536i, this.f39549v, this.f39547t, this.f39548u, this.f39535h);
    }

    private Object a() {
        return this.f39528a.e(this.f39529b);
    }

    private Object b(Object obj, String str, String str2) {
        Object obj2 = obj;
        String str3 = str;
        String str4 = str2;
        if (d.l(obj)) {
            boolean z10 = true;
            if (str3.equals(AttributeType.DATE) || str3.equals("any")) {
                String[] strArr = {"weekday", "year", "month", "day"};
                for (int i10 = 0; i10 < 4; i10++) {
                    if (!d.n(d.a(obj2, strArr[i10]))) {
                        z10 = false;
                    }
                }
            }
            if (str3.equals(com.amazon.a.a.h.a.f37179b) || str3.equals("any")) {
                String[] strArr2 = {"hour", "minute", "second"};
                for (int i11 = 0; i11 < 3; i11++) {
                    if (!d.n(d.a(obj2, strArr2[i11]))) {
                        z10 = false;
                    }
                }
            }
            if (!d.n(d.a(obj2, "dateStyle")) || !d.n(d.a(obj2, "timeStyle"))) {
                z10 = false;
            }
            if (z10 && (str4.equals(AttributeType.DATE) || str4.equals("all"))) {
                String[] strArr3 = {"year", "month", "day"};
                for (int i12 = 0; i12 < 3; i12++) {
                    d.c(obj2, strArr3[i12], "numeric");
                }
            }
            if (z10 && (str4.equals(com.amazon.a.a.h.a.f37179b) || str4.equals("all"))) {
                String[] strArr4 = {"hour", "minute", "second"};
                for (int i13 = 0; i13 < 3; i13++) {
                    d.c(obj2, strArr4[i13], "numeric");
                }
            }
            return obj2;
        }
        throw new e("Invalid options object !");
    }

    private void c(List list, Map map) {
        Object obj;
        b.g gVar;
        List asList = Arrays.asList(new String[]{"ca", "nu", "hc"});
        Object b10 = b(map, "any", AttributeType.DATE);
        Object q10 = d.q();
        g.a aVar = g.a.STRING;
        d.c(q10, "localeMatcher", g.c(b10, "localeMatcher", aVar, M6.a.f32605a, "best fit"));
        Object c10 = g.c(b10, "calendar", aVar, d.d(), d.d());
        if (d.n(c10) || d(d.h(c10))) {
            d.c(q10, "ca", c10);
            Object c11 = g.c(b10, "numberingSystem", aVar, d.d(), d.d());
            if (d.n(c11) || d(d.h(c11))) {
                d.c(q10, "nu", c11);
                Object c12 = g.c(b10, "hour12", g.a.BOOLEAN, d.d(), d.d());
                Object c13 = g.c(b10, "hourCycle", aVar, new String[]{"h11", "h12", "h23", "h24"}, d.d());
                if (!d.n(c12)) {
                    c13 = d.b();
                }
                d.c(q10, "hc", c13);
                HashMap a10 = f.a(list, q10, asList);
                M6.b bVar = (M6.b) d.g(a10).get("locale");
                this.f39529b = bVar;
                this.f39530c = bVar.d();
                Object a11 = d.a(a10, "ca");
                if (!d.j(a11)) {
                    this.f39531d = false;
                    this.f39532e = d.h(a11);
                } else {
                    this.f39531d = true;
                    this.f39532e = this.f39528a.g(this.f39529b);
                }
                Object a12 = d.a(a10, "nu");
                if (!d.j(a12)) {
                    this.f39533f = false;
                    this.f39534g = d.h(a12);
                } else {
                    this.f39533f = true;
                    this.f39534g = this.f39528a.c(this.f39529b);
                }
                Object a13 = d.a(a10, "hc");
                Object a14 = d.a(b10, "timeZone");
                if (d.n(a14)) {
                    obj = a();
                } else {
                    obj = e(a14.toString());
                }
                this.f39549v = obj;
                this.f39537j = (b.e) g.d(b.e.class, d.h(g.c(b10, "formatMatcher", aVar, new String[]{"basic", "best fit"}, "best fit")));
                this.f39538k = (b.m) g.d(b.m.class, g.c(b10, "weekday", aVar, new String[]{Constants.LONG, "short", "narrow"}, d.d()));
                this.f39539l = (b.d) g.d(b.d.class, g.c(b10, "era", aVar, new String[]{Constants.LONG, "short", "narrow"}, d.d()));
                this.f39540m = (b.n) g.d(b.n.class, g.c(b10, "year", aVar, new String[]{"numeric", "2-digit"}, d.d()));
                this.f39541n = (b.i) g.d(b.i.class, g.c(b10, "month", aVar, new String[]{"numeric", "2-digit", Constants.LONG, "short", "narrow"}, d.d()));
                this.f39542o = (b.c) g.d(b.c.class, g.c(b10, "day", aVar, new String[]{"numeric", "2-digit"}, d.d()));
                Object c14 = g.c(b10, "hour", aVar, new String[]{"numeric", "2-digit"}, d.d());
                this.f39543p = (b.f) g.d(b.f.class, c14);
                this.f39544q = (b.h) g.d(b.h.class, g.c(b10, "minute", aVar, new String[]{"numeric", "2-digit"}, d.d()));
                this.f39545r = (b.j) g.d(b.j.class, g.c(b10, "second", aVar, new String[]{"numeric", "2-digit"}, d.d()));
                this.f39546s = (b.l) g.d(b.l.class, g.c(b10, "timeZoneName", aVar, new String[]{Constants.LONG, "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, d.d()));
                this.f39547t = (b.C0626b) g.d(b.C0626b.class, g.c(b10, "dateStyle", aVar, new String[]{"full", Constants.LONG, Constants.MEDIUM, "short"}, d.d()));
                Object c15 = g.c(b10, "timeStyle", aVar, new String[]{"full", Constants.LONG, Constants.MEDIUM, "short"}, d.d());
                this.f39548u = (b.k) g.d(b.k.class, c15);
                if (!d.n(c14) || !d.n(c15)) {
                    b.g d10 = this.f39528a.d(this.f39529b);
                    if (d.j(a13)) {
                        gVar = d10;
                    } else {
                        gVar = (b.g) g.d(b.g.class, a13);
                    }
                    if (!d.n(c12)) {
                        if (d.e(c12)) {
                            gVar = b.g.H11;
                            if (!(d10 == gVar || d10 == b.g.H23)) {
                                gVar = b.g.H12;
                            }
                        } else {
                            gVar = (d10 == b.g.H11 || d10 == b.g.H23) ? b.g.H23 : b.g.H24;
                        }
                    }
                    this.f39536i = gVar;
                } else {
                    this.f39536i = b.g.UNDEFINED;
                }
                this.f39535h = c12;
                return;
            }
            throw new e("Invalid numbering system !");
        }
        throw new e("Invalid calendar option !");
    }

    private boolean d(String str) {
        return c.e(str, 0, str.length() - 1);
    }

    @a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) {
        String h10 = d.h(g.c(map, "localeMatcher", g.a.STRING, M6.a.f32605a, "best fit"));
        String[] strArr = new String[list.size()];
        if (h10.equals("best fit")) {
            return Arrays.asList(e.d((String[]) list.toArray(strArr)));
        }
        return Arrays.asList(e.h((String[]) list.toArray(strArr)));
    }

    public String e(String str) {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (f(str2).equals(f(str))) {
                return str2;
            }
        }
        throw new e("Invalid timezone name!");
    }

    public String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 'A' || charAt > 'Z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt + ' '));
            }
        }
        return sb2.toString();
    }

    @a
    public String format(double d10) {
        return this.f39528a.b(d10);
    }

    @a
    public List<Map<String, String>> formatToParts(double d10) {
        String str;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a10 = this.f39528a.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a10.first(); first != 65535; first = a10.next()) {
            sb2.append(first);
            if (a10.getIndex() + 1 == a10.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = a10.getAttributes().keySet().iterator();
                if (it.hasNext()) {
                    str = this.f39528a.f(it.next(), sb2.toString());
                } else {
                    str = "literal";
                }
                String sb3 = sb2.toString();
                sb2.setLength(0);
                HashMap hashMap = new HashMap();
                hashMap.put("type", str);
                hashMap.put("value", sb3);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    @a
    public Map<String, Object> resolvedOptions() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f39530c.g());
        linkedHashMap.put("numberingSystem", this.f39534g);
        linkedHashMap.put("calendar", this.f39532e);
        linkedHashMap.put("timeZone", this.f39549v);
        b.g gVar = this.f39536i;
        if (gVar != b.g.UNDEFINED) {
            linkedHashMap.put("hourCycle", gVar.toString());
            b.g gVar2 = this.f39536i;
            if (gVar2 == b.g.H11 || gVar2 == b.g.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        b.m mVar = this.f39538k;
        if (mVar != b.m.UNDEFINED) {
            linkedHashMap.put("weekday", mVar.toString());
        }
        b.d dVar = this.f39539l;
        if (dVar != b.d.UNDEFINED) {
            linkedHashMap.put("era", dVar.toString());
        }
        b.n nVar = this.f39540m;
        if (nVar != b.n.UNDEFINED) {
            linkedHashMap.put("year", nVar.toString());
        }
        b.i iVar = this.f39541n;
        if (iVar != b.i.UNDEFINED) {
            linkedHashMap.put("month", iVar.toString());
        }
        b.c cVar = this.f39542o;
        if (cVar != b.c.UNDEFINED) {
            linkedHashMap.put("day", cVar.toString());
        }
        b.f fVar = this.f39543p;
        if (fVar != b.f.UNDEFINED) {
            linkedHashMap.put("hour", fVar.toString());
        }
        b.h hVar = this.f39544q;
        if (hVar != b.h.UNDEFINED) {
            linkedHashMap.put("minute", hVar.toString());
        }
        b.j jVar = this.f39545r;
        if (jVar != b.j.UNDEFINED) {
            linkedHashMap.put("second", jVar.toString());
        }
        b.l lVar = this.f39546s;
        if (lVar != b.l.UNDEFINED) {
            linkedHashMap.put("timeZoneName", lVar.toString());
        }
        b.C0626b bVar = this.f39547t;
        if (bVar != b.C0626b.UNDEFINED) {
            linkedHashMap.put("dateStyle", bVar.toString());
        }
        b.k kVar = this.f39548u;
        if (kVar != b.k.UNDEFINED) {
            linkedHashMap.put("timeStyle", kVar.toString());
        }
        return linkedHashMap;
    }
}
