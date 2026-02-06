package Fe;

import Fe.C3016e;
import android.content.Context;
import com.amazon.a.a.o.b.f;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

class J extends I {

    /* renamed from: l  reason: collision with root package name */
    private C3022k f30915l = new C3022k();

    /* renamed from: m  reason: collision with root package name */
    private boolean f30916m;

    /* renamed from: n  reason: collision with root package name */
    private C3016e.d f30917n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f30918o;

    public J(Context context, String str, int i10, int i11, Collection collection, String str2, String str3, String str4, String str5, JSONObject jSONObject, C3016e.d dVar, boolean z10, boolean z11) {
        super(context, B.GetURL);
        this.f30917n = dVar;
        this.f30916m = z10;
        this.f30918o = z11;
        try {
            if (!this.f30898e.J().equals("bnc_no_value")) {
                this.f30915l.put(y.LinkClickID.b(), this.f30898e.J());
            }
            this.f30915l.s(i10);
            this.f30915l.m(i11);
            this.f30915l.r(collection);
            this.f30915l.j(str);
            this.f30915l.l(str2);
            this.f30915l.n(str3);
            this.f30915l.q(str4);
            this.f30915l.k(str5);
            this.f30915l.o(jSONObject);
            this.f30915l.p();
            F(this.f30915l);
            this.f30915l.remove("anon_id");
            this.f30915l.remove("is_hardware_id_real");
            this.f30915l.remove("hardware_id");
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
            this.f30902i = true;
        }
    }

    private String Q(String str) {
        String str2;
        try {
            String str3 = "";
            if (C3016e.X().r0()) {
                if (!str.contains("https://bnc.lt/a/")) {
                    str = str.replace(new URL(str).getQuery(), str3);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (str.contains("?")) {
                str2 = str3;
            } else {
                str2 = "?";
            }
            sb2.append(str2);
            str = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            if (!str.endsWith("?")) {
                str3 = "&";
            }
            sb3.append(str3);
            str = sb3.toString();
            Collection<String> h10 = this.f30915l.h();
            if (h10 != null) {
                for (String str4 : h10) {
                    if (str4 != null && str4.length() > 0) {
                        str = str + z.Tags + f.f37530b + URLEncoder.encode(str4, "UTF8") + "&";
                    }
                }
            }
            String a10 = this.f30915l.a();
            if (a10 != null && a10.length() > 0) {
                str = str + z.Alias + f.f37530b + URLEncoder.encode(a10, "UTF8") + "&";
            }
            String c10 = this.f30915l.c();
            if (c10 != null && c10.length() > 0) {
                str = str + z.Channel + f.f37530b + URLEncoder.encode(c10, "UTF8") + "&";
            }
            String e10 = this.f30915l.e();
            if (e10 != null && e10.length() > 0) {
                str = str + z.Feature + f.f37530b + URLEncoder.encode(e10, "UTF8") + "&";
            }
            String g10 = this.f30915l.g();
            if (g10 != null && g10.length() > 0) {
                str = str + z.Stage + f.f37530b + URLEncoder.encode(g10, "UTF8") + "&";
            }
            String b10 = this.f30915l.b();
            if (b10 != null && b10.length() > 0) {
                str = str + z.Campaign + f.f37530b + URLEncoder.encode(b10, "UTF8") + "&";
            }
            String str5 = ((str + z.Type + f.f37530b + ((long) this.f30915l.i()) + "&") + z.Duration + f.f37530b + ((long) this.f30915l.d())) + "&source=" + y.URLSource.b();
            JSONObject f10 = this.f30915l.f();
            if (f10 == null || f10.length() <= 0) {
                return str5;
            }
            return str5 + "&data=" + URLEncoder.encode(C3015d.e(f10.toString().getBytes(), 2), "UTF8");
        } catch (Exception e11) {
            C3023l.b("Caught Exception ServerRequestCreateUrl generateLongUrlWithParams: " + e11.getMessage() + " stacktrace: " + C3023l.j(e11));
            this.f30917n.a((String) null, new C3020i("Trouble creating a URL.", -116));
            return str;
        }
    }

    public C3022k R() {
        return this.f30915l;
    }

    public String S() {
        if (!this.f30898e.d0().equals("bnc_no_value")) {
            return Q(this.f30898e.d0());
        }
        return Q("https://bnc.lt/a/" + this.f30898e.r());
    }

    public void T() {
        C3016e.d dVar = this.f30917n;
        if (dVar != null) {
            dVar.a((String) null, new C3020i("Trouble creating a URL.", -105));
        }
    }

    public boolean U(Context context) {
        if (super.h(context)) {
            return false;
        }
        C3016e.d dVar = this.f30917n;
        if (dVar == null) {
            return true;
        }
        dVar.a((String) null, new C3020i("Trouble creating a URL.", -102));
        return true;
    }

    public boolean V() {
        return this.f30916m;
    }

    /* access modifiers changed from: package-private */
    public boolean W() {
        return this.f30918o;
    }

    public void X(String str) {
        C3016e.d dVar = this.f30917n;
        if (dVar != null) {
            dVar.a(str, (C3020i) null);
        }
    }

    public void e() {
        this.f30917n = null;
    }

    public void q(int i10, String str) {
        String str2;
        if (this.f30917n != null) {
            if (this.f30918o) {
                str2 = S();
            } else {
                str2 = null;
            }
            C3016e.d dVar = this.f30917n;
            dVar.a(str2, new C3020i("Trouble creating a URL. " + str, i10));
        }
    }

    public boolean s() {
        return false;
    }

    public void x(Q q10, C3016e eVar) {
        try {
            String string = q10.c().getString("url");
            C3016e.d dVar = this.f30917n;
            if (dVar != null) {
                dVar.a(string, (C3020i) null);
            }
        } catch (Exception e10) {
            C3023l.b("Caught Exception ServerRequestCreateUrl onRequestSucceeded: " + e10.getMessage() + " stacktrace: " + C3023l.j(e10));
        }
    }

    /* access modifiers changed from: protected */
    public boolean z() {
        return true;
    }
}
