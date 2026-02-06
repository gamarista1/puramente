package com.google.firebase.storage;

import Kc.i;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f58090a;

    /* renamed from: b  reason: collision with root package name */
    private C4849e f58091b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public o f58092c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f58093d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f58094e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f58095f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f58096g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f58097h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String f58098i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public long f58099j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public String f58100k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public c f58101l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public c f58102m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public c f58103n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public c f58104o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public c f58105p;

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f58108a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f58109b;

        c(Object obj, boolean z10) {
            this.f58108a = z10;
            this.f58109b = obj;
        }

        static c c(Object obj) {
            return new c(obj, false);
        }

        static c d(Object obj) {
            return new c(obj, true);
        }

        /* access modifiers changed from: package-private */
        public Object a() {
            return this.f58109b;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.f58108a;
        }
    }

    public String A() {
        return this.f58094e;
    }

    public String B() {
        return this.f58100k;
    }

    public String C() {
        return this.f58096g;
    }

    public String D() {
        String E10 = E();
        if (TextUtils.isEmpty(E10)) {
            return null;
        }
        int lastIndexOf = E10.lastIndexOf(47);
        if (lastIndexOf != -1) {
            return E10.substring(lastIndexOf + 1);
        }
        return E10;
    }

    public String E() {
        String str = this.f58090a;
        if (str != null) {
            return str;
        }
        return "";
    }

    public long F() {
        return this.f58099j;
    }

    public long G() {
        return i.e(this.f58098i);
    }

    /* access modifiers changed from: package-private */
    public JSONObject q() {
        HashMap hashMap = new HashMap();
        if (this.f58095f.b()) {
            hashMap.put("contentType", w());
        }
        if (this.f58105p.b()) {
            hashMap.put("metadata", new JSONObject((Map) this.f58105p.a()));
        }
        if (this.f58101l.b()) {
            hashMap.put("cacheControl", s());
        }
        if (this.f58102m.b()) {
            hashMap.put("contentDisposition", t());
        }
        if (this.f58103n.b()) {
            hashMap.put("contentEncoding", u());
        }
        if (this.f58104o.b()) {
            hashMap.put("contentLanguage", v());
        }
        return new JSONObject(hashMap);
    }

    public String r() {
        return this.f58093d;
    }

    public String s() {
        return (String) this.f58101l.a();
    }

    public String t() {
        return (String) this.f58102m.a();
    }

    public String u() {
        return (String) this.f58103n.a();
    }

    public String v() {
        return (String) this.f58104o.a();
    }

    public String w() {
        return (String) this.f58095f.a();
    }

    public long x() {
        return i.e(this.f58097h);
    }

    public String y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) ((Map) this.f58105p.a()).get(str);
    }

    public Set z() {
        return ((Map) this.f58105p.a()).keySet();
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        n f58106a;

        /* renamed from: b  reason: collision with root package name */
        boolean f58107b;

        public b() {
            this.f58106a = new n();
        }

        private String b(JSONObject jSONObject, String str) {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        private void c(JSONObject jSONObject) {
            String unused = this.f58106a.f58094e = jSONObject.optString("generation");
            String unused2 = this.f58106a.f58090a = jSONObject.optString("name");
            String unused3 = this.f58106a.f58093d = jSONObject.optString("bucket");
            String unused4 = this.f58106a.f58096g = jSONObject.optString("metageneration");
            String unused5 = this.f58106a.f58097h = jSONObject.optString("timeCreated");
            String unused6 = this.f58106a.f58098i = jSONObject.optString("updated");
            long unused7 = this.f58106a.f58099j = jSONObject.optLong("size");
            String unused8 = this.f58106a.f58100k = jSONObject.optString("md5Hash");
            if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    i(next, jSONObject2.getString(next));
                }
            }
            String b10 = b(jSONObject, "contentType");
            if (b10 != null) {
                h(b10);
            }
            String b11 = b(jSONObject, "cacheControl");
            if (b11 != null) {
                d(b11);
            }
            String b12 = b(jSONObject, "contentDisposition");
            if (b12 != null) {
                e(b12);
            }
            String b13 = b(jSONObject, "contentEncoding");
            if (b13 != null) {
                f(b13);
            }
            String b14 = b(jSONObject, "contentLanguage");
            if (b14 != null) {
                g(b14);
            }
        }

        public n a() {
            return new n(this.f58107b);
        }

        public b d(String str) {
            c unused = this.f58106a.f58101l = c.d(str);
            return this;
        }

        public b e(String str) {
            c unused = this.f58106a.f58102m = c.d(str);
            return this;
        }

        public b f(String str) {
            c unused = this.f58106a.f58103n = c.d(str);
            return this;
        }

        public b g(String str) {
            c unused = this.f58106a.f58104o = c.d(str);
            return this;
        }

        public b h(String str) {
            c unused = this.f58106a.f58095f = c.d(str);
            return this;
        }

        public b i(String str, String str2) {
            if (!this.f58106a.f58105p.b()) {
                c unused = this.f58106a.f58105p = c.d(new HashMap());
            }
            ((Map) this.f58106a.f58105p.a()).put(str, str2);
            return this;
        }

        b(JSONObject jSONObject, o oVar) {
            this(jSONObject);
            o unused = this.f58106a.f58092c = oVar;
        }

        b(JSONObject jSONObject) {
            this.f58106a = new n();
            if (jSONObject != null) {
                c(jSONObject);
                this.f58107b = true;
            }
        }
    }

    public n() {
        this.f58090a = null;
        this.f58091b = null;
        this.f58092c = null;
        this.f58093d = null;
        this.f58094e = null;
        this.f58095f = c.c("");
        this.f58096g = null;
        this.f58097h = null;
        this.f58098i = null;
        this.f58100k = null;
        this.f58101l = c.c("");
        this.f58102m = c.c("");
        this.f58103n = c.c("");
        this.f58104o = c.c("");
        this.f58105p = c.c(Collections.emptyMap());
    }

    private n(n nVar, boolean z10) {
        this.f58090a = null;
        this.f58091b = null;
        this.f58092c = null;
        this.f58093d = null;
        this.f58094e = null;
        this.f58095f = c.c("");
        this.f58096g = null;
        this.f58097h = null;
        this.f58098i = null;
        this.f58100k = null;
        this.f58101l = c.c("");
        this.f58102m = c.c("");
        this.f58103n = c.c("");
        this.f58104o = c.c("");
        this.f58105p = c.c(Collections.emptyMap());
        C4536s.l(nVar);
        this.f58090a = nVar.f58090a;
        this.f58091b = nVar.f58091b;
        this.f58092c = nVar.f58092c;
        this.f58093d = nVar.f58093d;
        this.f58095f = nVar.f58095f;
        this.f58101l = nVar.f58101l;
        this.f58102m = nVar.f58102m;
        this.f58103n = nVar.f58103n;
        this.f58104o = nVar.f58104o;
        this.f58105p = nVar.f58105p;
        if (z10) {
            this.f58100k = nVar.f58100k;
            this.f58099j = nVar.f58099j;
            this.f58098i = nVar.f58098i;
            this.f58097h = nVar.f58097h;
            this.f58096g = nVar.f58096g;
            this.f58094e = nVar.f58094e;
        }
    }
}
