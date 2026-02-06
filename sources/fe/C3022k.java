package Fe;

import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: Fe.k  reason: case insensitive filesystem */
class C3022k extends JSONObject {

    /* renamed from: a  reason: collision with root package name */
    private Collection f31111a;

    /* renamed from: b  reason: collision with root package name */
    private String f31112b;

    /* renamed from: c  reason: collision with root package name */
    private int f31113c;

    /* renamed from: d  reason: collision with root package name */
    private String f31114d;

    /* renamed from: e  reason: collision with root package name */
    private String f31115e;

    /* renamed from: f  reason: collision with root package name */
    private String f31116f;

    /* renamed from: g  reason: collision with root package name */
    private String f31117g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f31118h;

    /* renamed from: i  reason: collision with root package name */
    private int f31119i;

    public String a() {
        return this.f31112b;
    }

    public String b() {
        return this.f31117g;
    }

    public String c() {
        return this.f31114d;
    }

    public int d() {
        return this.f31119i;
    }

    public String e() {
        return this.f31115e;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3022k kVar = (C3022k) obj;
        String str2 = this.f31112b;
        if (str2 == null) {
            if (kVar.f31112b != null) {
                return false;
            }
        } else if (!str2.equals(kVar.f31112b)) {
            return false;
        }
        String str3 = this.f31114d;
        if (str3 == null) {
            if (kVar.f31114d != null) {
                return false;
            }
        } else if (!str3.equals(kVar.f31114d)) {
            return false;
        }
        String str4 = this.f31115e;
        if (str4 == null) {
            if (kVar.f31115e != null) {
                return false;
            }
        } else if (!str4.equals(kVar.f31115e)) {
            return false;
        }
        String str5 = this.f31116f;
        if (str5 == null) {
            if (kVar.f31116f != null) {
                return false;
            }
        } else if (!str5.equals(kVar.f31116f)) {
            return false;
        }
        String str6 = this.f31117g;
        if (str6 == null) {
            if (kVar.f31117g != null) {
                return false;
            }
        } else if (!str6.equals(kVar.f31117g)) {
            return false;
        }
        if (this.f31113c != kVar.f31113c || this.f31119i != kVar.f31119i) {
            return false;
        }
        Collection collection = this.f31111a;
        String str7 = null;
        if (collection != null) {
            String obj2 = collection.toString();
            Collection collection2 = kVar.f31111a;
            if (collection2 != null) {
                str = collection2.toString();
            } else {
                str = null;
            }
            if (!obj2.equals(str)) {
                return false;
            }
        } else if (kVar.f31111a != null) {
            return false;
        }
        JSONObject jSONObject = this.f31118h;
        if (jSONObject != null) {
            String jSONObject2 = jSONObject.toString();
            JSONObject jSONObject3 = kVar.f31118h;
            if (jSONObject3 != null) {
                str7 = jSONObject3.toString();
            }
            if (!jSONObject2.equals(str7)) {
                return false;
            }
        } else if (kVar.f31118h != null) {
            return false;
        }
        return true;
    }

    public JSONObject f() {
        return this.f31118h;
    }

    public String g() {
        return this.f31116f;
    }

    public Collection h() {
        return this.f31111a;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = (this.f31113c + 19) * 19;
        String str = this.f31112b;
        int i16 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.toLowerCase().hashCode();
        }
        int i17 = (i15 + i10) * 19;
        String str2 = this.f31114d;
        if (str2 == null) {
            i11 = 0;
        } else {
            i11 = str2.toLowerCase().hashCode();
        }
        int i18 = (i17 + i11) * 19;
        String str3 = this.f31115e;
        if (str3 == null) {
            i12 = 0;
        } else {
            i12 = str3.toLowerCase().hashCode();
        }
        int i19 = (i18 + i12) * 19;
        String str4 = this.f31116f;
        if (str4 == null) {
            i13 = 0;
        } else {
            i13 = str4.toLowerCase().hashCode();
        }
        int i20 = (i19 + i13) * 19;
        String str5 = this.f31117g;
        if (str5 == null) {
            i14 = 0;
        } else {
            i14 = str5.toLowerCase().hashCode();
        }
        int i21 = (i20 + i14) * 19;
        JSONObject jSONObject = this.f31118h;
        if (jSONObject != null) {
            i16 = jSONObject.toString().toLowerCase().hashCode();
        }
        int i22 = ((i21 + i16) * 19) + this.f31119i;
        Collection<String> collection = this.f31111a;
        if (collection != null) {
            for (String lowerCase : collection) {
                i22 = (i22 * 19) + lowerCase.toLowerCase().hashCode();
            }
        }
        return i22;
    }

    public int i() {
        return this.f31113c;
    }

    public void j(String str) {
        if (str != null) {
            this.f31112b = str;
            put(z.Alias.b(), str);
        }
    }

    public void k(String str) {
        if (str != null) {
            this.f31117g = str;
            put(z.Campaign.b(), str);
        }
    }

    public void l(String str) {
        if (str != null) {
            this.f31114d = str;
            put(z.Channel.b(), str);
        }
    }

    public void m(int i10) {
        if (i10 > 0) {
            this.f31119i = i10;
            put(z.Duration.b(), i10);
        }
    }

    public void n(String str) {
        if (str != null) {
            this.f31115e = str;
            put(z.Feature.b(), str);
        }
    }

    public void o(JSONObject jSONObject) {
        this.f31118h = jSONObject;
        put(z.Data.b(), jSONObject);
    }

    public void p() {
        put("source", y.URLSource.b());
    }

    public void q(String str) {
        if (str != null) {
            this.f31116f = str;
            put(z.Stage.b(), str);
        }
    }

    public void r(Collection collection) {
        if (collection != null) {
            this.f31111a = collection;
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
            put(z.Tags.b(), jSONArray);
        }
    }

    public void s(int i10) {
        if (i10 != 0) {
            this.f31113c = i10;
            put(z.Type.b(), i10);
        }
    }
}
