package com.facebook.hermes.intl;

import B7.a;
import M6.b;
import M6.d;
import M6.e;
import com.adjust.sdk.Constants;
import com.facebook.hermes.intl.c;
import com.facebook.hermes.intl.g;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@a
public class NumberFormat {

    /* renamed from: v  reason: collision with root package name */
    private static String[] f39550v = {"acre", "bit", "byte", "celsius", "centimeter", "day", "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* renamed from: a  reason: collision with root package name */
    private c.h f39551a;

    /* renamed from: b  reason: collision with root package name */
    private String f39552b = null;

    /* renamed from: c  reason: collision with root package name */
    private c.C0627c f39553c = c.C0627c.SYMBOL;

    /* renamed from: d  reason: collision with root package name */
    private c.d f39554d = c.d.STANDARD;

    /* renamed from: e  reason: collision with root package name */
    private String f39555e = null;

    /* renamed from: f  reason: collision with root package name */
    private c.i f39556f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f39557g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f39558h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f39559i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f39560j = -1;

    /* renamed from: k  reason: collision with root package name */
    private int f39561k = -1;

    /* renamed from: l  reason: collision with root package name */
    private int f39562l = -1;

    /* renamed from: m  reason: collision with root package name */
    private c.f f39563m;

    /* renamed from: n  reason: collision with root package name */
    private c.g f39564n = c.g.AUTO;

    /* renamed from: o  reason: collision with root package name */
    private c f39565o = new j();

    /* renamed from: p  reason: collision with root package name */
    private boolean f39566p;

    /* renamed from: q  reason: collision with root package name */
    private String f39567q = null;

    /* renamed from: r  reason: collision with root package name */
    private c.e f39568r = null;

    /* renamed from: s  reason: collision with root package name */
    private c.b f39569s;

    /* renamed from: t  reason: collision with root package name */
    private b f39570t = null;

    /* renamed from: u  reason: collision with root package name */
    private b f39571u = null;

    @a
    public NumberFormat(List<String> list, Map<String, Object> map) {
        String str;
        a(list, map);
        c cVar = this.f39565o;
        b bVar = this.f39570t;
        if (this.f39566p) {
            str = "";
        } else {
            str = this.f39567q;
        }
        cVar.d(bVar, str, this.f39551a, this.f39554d, this.f39568r, this.f39569s).e(this.f39552b, this.f39553c).h(this.f39557g).g(this.f39558h).f(this.f39563m, this.f39561k, this.f39562l).i(this.f39563m, this.f39559i, this.f39560j).k(this.f39564n).j(this.f39555e, this.f39556f);
    }

    private void a(List list, Map map) {
        Object obj;
        Object obj2;
        Object q10 = d.q();
        g.a aVar = g.a.STRING;
        d.c(q10, "localeMatcher", g.c(map, "localeMatcher", aVar, M6.a.f32605a, "best fit"));
        Object c10 = g.c(map, "numberingSystem", aVar, d.d(), d.d());
        if (d.n(c10) || b(d.h(c10))) {
            d.c(q10, "nu", c10);
            HashMap a10 = f.a(list, q10, Collections.singletonList("nu"));
            b bVar = (b) d.g(a10).get("locale");
            this.f39570t = bVar;
            this.f39571u = bVar.d();
            Object a11 = d.a(a10, "nu");
            if (!d.j(a11)) {
                this.f39566p = false;
                this.f39567q = d.h(a11);
            } else {
                this.f39566p = true;
                this.f39567q = this.f39565o.c(this.f39570t);
            }
            h(map);
            if (this.f39551a == c.h.CURRENCY) {
                double n10 = (double) j.n(this.f39552b);
                obj = d.p(n10);
                obj2 = d.p(n10);
            } else {
                obj = d.p(0.0d);
                if (this.f39551a == c.h.PERCENT) {
                    obj2 = d.p(0.0d);
                } else {
                    obj2 = d.p(3.0d);
                }
            }
            this.f39568r = (c.e) g.d(c.e.class, d.h(g.c(map, "notation", aVar, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
            g(map, obj, obj2);
            Object c11 = g.c(map, "compactDisplay", aVar, new String[]{"short", Constants.LONG}, "short");
            if (this.f39568r == c.e.COMPACT) {
                this.f39569s = (c.b) g.d(c.b.class, d.h(c11));
            }
            this.f39557g = d.e(g.c(map, "useGrouping", g.a.BOOLEAN, d.d(), d.o(true)));
            this.f39564n = (c.g) g.d(c.g.class, d.h(g.c(map, "signDisplay", aVar, new String[]{"auto", "never", "always", "exceptZero"}, "auto")));
            return;
        }
        throw new e("Invalid numbering system !");
    }

    private boolean b(String str) {
        return M6.c.e(str, 0, str.length() - 1);
    }

    private boolean c(String str) {
        if (Arrays.binarySearch(f39550v, str) >= 0) {
            return true;
        }
        return false;
    }

    private boolean d(String str) {
        return f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    private boolean e(String str) {
        if (c(str)) {
            return true;
        }
        int indexOf = str.indexOf("-per-");
        if (indexOf >= 0 && str.indexOf("-per-", indexOf + 1) < 0 && c(str.substring(0, indexOf)) && c(str.substring(indexOf + 5))) {
            return true;
        }
        return false;
    }

    private String f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 'a' || charAt > 'z') {
                sb2.append(charAt);
            } else {
                sb2.append((char) (charAt - ' '));
            }
        }
        return sb2.toString();
    }

    private void g(Map map, Object obj, Object obj2) {
        Map map2 = map;
        Object b10 = g.b(map2, "minimumIntegerDigits", d.p(1.0d), d.p(21.0d), d.p(1.0d));
        Object a10 = d.a(map2, "minimumFractionDigits");
        Object a11 = d.a(map2, "maximumFractionDigits");
        Object a12 = d.a(map2, "minimumSignificantDigits");
        Object a13 = d.a(map2, "maximumSignificantDigits");
        this.f39558h = (int) Math.floor(d.f(b10));
        if (!d.n(a12) || !d.n(a13)) {
            this.f39563m = c.f.SIGNIFICANT_DIGITS;
            Object a14 = g.a("minimumSignificantDigits", a12, d.p(1.0d), d.p(21.0d), d.p(1.0d));
            Object a15 = g.a("maximumSignificantDigits", a13, a14, d.p(21.0d), d.p(21.0d));
            this.f39561k = (int) Math.floor(d.f(a14));
            this.f39562l = (int) Math.floor(d.f(a15));
        } else if (!d.n(a10) || !d.n(a11)) {
            this.f39563m = c.f.FRACTION_DIGITS;
            Object a16 = g.a("minimumFractionDigits", a10, d.p(0.0d), d.p(20.0d), d.d());
            Object a17 = g.a("maximumFractionDigits", a11, d.p(0.0d), d.p(20.0d), d.d());
            if (d.n(a16)) {
                a16 = d.p(Math.min(d.f(obj), d.f(a17)));
            } else if (d.n(a17)) {
                a17 = d.p(Math.max(d.f(obj2), d.f(a16)));
            } else if (d.f(a16) > d.f(a17)) {
                throw new e("minimumFractionDigits is greater than maximumFractionDigits");
            }
            this.f39559i = (int) Math.floor(d.f(a16));
            this.f39560j = (int) Math.floor(d.f(a17));
        } else {
            c.e eVar = this.f39568r;
            if (eVar == c.e.COMPACT) {
                this.f39563m = c.f.COMPACT_ROUNDING;
            } else if (eVar == c.e.ENGINEERING) {
                this.f39563m = c.f.FRACTION_DIGITS;
                this.f39560j = 5;
            } else {
                this.f39563m = c.f.FRACTION_DIGITS;
                this.f39559i = (int) Math.floor(d.f(obj));
                this.f39560j = (int) Math.floor(d.f(obj2));
            }
        }
    }

    private void h(Map map) {
        g.a aVar = g.a.STRING;
        this.f39551a = (c.h) g.d(c.h.class, d.h(g.c(map, "style", aVar, new String[]{"decimal", "percent", com.amazon.a.a.o.b.f37469a, "unit"}, "decimal")));
        Object c10 = g.c(map, com.amazon.a.a.o.b.f37469a, aVar, d.d(), d.d());
        if (d.n(c10)) {
            if (this.f39551a == c.h.CURRENCY) {
                throw new e("Expected currency style !");
            }
        } else if (!d(d.h(c10))) {
            throw new e("Malformed currency code !");
        }
        Object c11 = g.c(map, "currencyDisplay", aVar, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object c12 = g.c(map, "currencySign", aVar, new String[]{"accounting", "standard"}, "standard");
        Object c13 = g.c(map, "unit", aVar, d.d(), d.d());
        if (d.n(c13)) {
            if (this.f39551a == c.h.UNIT) {
                throw new e("Expected unit !");
            }
        } else if (!e(d.h(c13))) {
            throw new e("Malformed unit identifier !");
        }
        Object c14 = g.c(map, "unitDisplay", aVar, new String[]{Constants.LONG, "short", "narrow"}, "short");
        c.h hVar = this.f39551a;
        if (hVar == c.h.CURRENCY) {
            this.f39552b = f(d.h(c10));
            this.f39553c = (c.C0627c) g.d(c.C0627c.class, d.h(c11));
            this.f39554d = (c.d) g.d(c.d.class, d.h(c12));
        } else if (hVar == c.h.UNIT) {
            this.f39555e = d.h(c13);
            this.f39556f = (c.i) g.d(c.i.class, d.h(c14));
        }
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

    @a
    public String format(double d10) {
        return this.f39565o.b(d10);
    }

    @a
    public List<Map<String, String>> formatToParts(double d10) {
        String str;
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator a10 = this.f39565o.a(d10);
        StringBuilder sb2 = new StringBuilder();
        for (char first = a10.first(); first != 65535; first = a10.next()) {
            sb2.append(first);
            if (a10.getIndex() + 1 == a10.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = a10.getAttributes().keySet().iterator();
                if (it.hasNext()) {
                    str = this.f39565o.l(it.next(), d10);
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
        linkedHashMap.put("locale", this.f39571u.g());
        linkedHashMap.put("numberingSystem", this.f39567q);
        linkedHashMap.put("style", this.f39551a.toString());
        c.h hVar = this.f39551a;
        if (hVar == c.h.CURRENCY) {
            linkedHashMap.put(com.amazon.a.a.o.b.f37469a, this.f39552b);
            linkedHashMap.put("currencyDisplay", this.f39553c.toString());
            linkedHashMap.put("currencySign", this.f39554d.toString());
        } else if (hVar == c.h.UNIT) {
            linkedHashMap.put("unit", this.f39555e);
            linkedHashMap.put("unitDisplay", this.f39556f.toString());
        }
        int i10 = this.f39558h;
        if (i10 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i10));
        }
        c.f fVar = this.f39563m;
        if (fVar == c.f.SIGNIFICANT_DIGITS) {
            int i11 = this.f39562l;
            if (i11 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i11));
            }
            int i12 = this.f39561k;
            if (i12 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i12));
            }
        } else if (fVar == c.f.FRACTION_DIGITS) {
            int i13 = this.f39559i;
            if (i13 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i13));
            }
            int i14 = this.f39560j;
            if (i14 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i14));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f39557g));
        linkedHashMap.put("notation", this.f39568r.toString());
        if (this.f39568r == c.e.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f39569s.toString());
        }
        linkedHashMap.put("signDisplay", this.f39564n.toString());
        return linkedHashMap;
    }
}
